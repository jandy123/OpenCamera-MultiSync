/**
 * Modifications copyright (C) 2021 Mobile Robotics Lab. at Skoltech.
 */

package com.googleresearch.capturesync.softwaresync.phasealign;

import android.content.Context;
import android.os.Build;

//import androidx.annotation.RequiresApi;

import net.sourceforge.opencamera.multisync.R;
import net.sourceforge.opencamera.multisync.ToastBoxer;
import net.sourceforge.opencamera.multisync.Preview.Preview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PeriodCalculator {
    private final Context mContext;
    private final Preview mPreview;

    private volatile boolean mShouldRegister;
    private ArrayList<Long> mRegisteredTimestamps = new ArrayList<>();

    private final long CALC_DURATION_MS = 10000L;

    public PeriodCalculator(Context context, Preview preview) {
        mContext = context;
        mPreview = preview;
    }

    /**
     * Calculates frames period for this device using timestamps received from
     * {@link #onFrameTimestamp} during the waiting time.
     * <p>
     * Blocking call, sleeps for
     * {@link com.googleresearch.capturesync.softwaresync.SyncConstants#CALC_DURATION_MS CALC_DURATION_MS}.
     *
     * @return the calculated period, 0 in case of error.
     * @throws InterruptedException if interrupted while sleeping.
     */
    public long getPeriodNs() throws InterruptedException {
        //LUK:
        mPreview.showToast("Calculating frames period for " + (CALC_DURATION_MS * 1e-3) + " seconds", false);
        // Start recording timestamps
        mRegisteredTimestamps = new ArrayList<>();
        mShouldRegister = true;
        Thread.sleep(CALC_DURATION_MS);
        // Stop recording timestamps and calculate period
        mShouldRegister = false;
        return calcPeriodNsClusters(getDiff(mRegisteredTimestamps));
    }

    private List<Long> getDiff(ArrayList<Long> list) {
        // TODO: check if filtering remains necessary after phase alignment gets fixed.
        List<Long> result = StreamUtils.zip(list.stream(), list.stream().skip(1),
                (Long x, Long y) -> y - x).filter(it -> it != 0L).collect(Collectors.toList());
        return result;
    }

    private long calcPeriodNsClusters(List<Long> numArray) {
        long initEstimate = Collections.min(numArray);
        long nClust = Math.round(1.0 * Collections.max(numArray) / initEstimate);
        double weightedSum = 0L;
        for (int i = 0; i < nClust; i++) {
            int finalI = i;
            ArrayList<Long> clust = (ArrayList<Long>) numArray.stream().filter(
                    x -> (x > (finalI + 0.5) * initEstimate) && (x < (finalI + 1.5) * initEstimate)
            ).collect(Collectors.toList());
            if (clust.size() > 0) {
                weightedSum += 1.0 * median(clust) / (i + 1) * clust.size();
            }
        }
        final long period = Math.round(weightedSum / numArray.size());
        mPreview.showToast("Period: " + period, false);
        return period;
    }

    private long calcPeriodNsMedian(ArrayList<Long> numArray) {
        return median(numArray);
    }

    private long median(ArrayList<Long> numArray) {
        numArray.sort(Comparator.naturalOrder());
        double median;
        if (numArray.size() % 2 == 0)
            median = ((double) numArray.get(numArray.size() / 2)
                    + (double) numArray.get(numArray.size() / 2 - 1)) / 2;
        else
            median = (double) numArray.get(numArray.size() / 2);
        return (long) median;
    }

    public void onFrameTimestamp(long timestampNs) {
        // Register timestamp
        if (mShouldRegister) {
            mRegisteredTimestamps.add(timestampNs);
        }
    }
}
