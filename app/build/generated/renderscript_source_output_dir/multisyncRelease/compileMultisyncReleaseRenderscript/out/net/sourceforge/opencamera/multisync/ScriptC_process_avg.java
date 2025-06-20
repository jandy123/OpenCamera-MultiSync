/*
 * Copyright (C) 2011-2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This file is auto-generated. DO NOT MODIFY!
 * The source Renderscript file: /home/andrei/hdd/tmp/android_3d/OpenCamera-MultiSync/app/src/main/rs/process_avg.rs
 */

package net.sourceforge.opencamera.multisync;

import android.os.Build;
import android.os.Process;
import java.lang.reflect.Field;
import android.renderscript.*;
import net.sourceforge.opencamera.multisync.process_avgBitCode;

/**
 * @hide
 */
public class ScriptC_process_avg extends ScriptC {
    private static final String __rs_resource_name = "process_avg";
    // Constructor
    public  ScriptC_process_avg(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              process_avgBitCode.getBitCode32(),
              process_avgBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        mExportVar_offset_x_new = 0;
        __I32 = Element.I32(rs);
        mExportVar_offset_y_new = 0;
        mExportVar_scale_align_size = 1;
        mExportVar_avg_factor = 1.f;
        __F32 = Element.F32(rs);
        mExportVar_wiener_C = 1024.f;
        mExportVar_wiener_C_cutoff = 1024.f;
        mExportVar_offset_x1 = 0;
        mExportVar_offset_y1 = 0;
        mExportVar_offset_x2 = 0;
        mExportVar_offset_y2 = 0;
        mExportVar_offset_x3 = 0;
        mExportVar_offset_y3 = 0;
        mExportVar_offset_x4 = 0;
        mExportVar_offset_y4 = 0;
        mExportVar_offset_x5 = 0;
        mExportVar_offset_y5 = 0;
        mExportVar_offset_x6 = 0;
        mExportVar_offset_y6 = 0;
        mExportVar_offset_x7 = 0;
        mExportVar_offset_y7 = 0;
        __U8_4 = Element.U8_4(rs);
        __F32_3 = Element.F32_3(rs);
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __F32_3;
    private Element __I32;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_bitmap_new = 0;
    private Allocation mExportVar_bitmap_new;
    public synchronized void set_bitmap_new(Allocation v) {
        setVar(mExportVarIdx_bitmap_new, v);
        mExportVar_bitmap_new = v;
    }

    public Allocation get_bitmap_new() {
        return mExportVar_bitmap_new;
    }

    public Script.FieldID getFieldID_bitmap_new() {
        return createFieldID(mExportVarIdx_bitmap_new, null);
    }

    private final static int mExportVarIdx_bitmap_align_new = 1;
    private Allocation mExportVar_bitmap_align_new;
    public synchronized void set_bitmap_align_new(Allocation v) {
        setVar(mExportVarIdx_bitmap_align_new, v);
        mExportVar_bitmap_align_new = v;
    }

    public Allocation get_bitmap_align_new() {
        return mExportVar_bitmap_align_new;
    }

    public Script.FieldID getFieldID_bitmap_align_new() {
        return createFieldID(mExportVarIdx_bitmap_align_new, null);
    }

    private final static int mExportVarIdx_offset_x_new = 2;
    private int mExportVar_offset_x_new;
    public synchronized void set_offset_x_new(int v) {
        setVar(mExportVarIdx_offset_x_new, v);
        mExportVar_offset_x_new = v;
    }

    public int get_offset_x_new() {
        return mExportVar_offset_x_new;
    }

    public Script.FieldID getFieldID_offset_x_new() {
        return createFieldID(mExportVarIdx_offset_x_new, null);
    }

    private final static int mExportVarIdx_offset_y_new = 3;
    private int mExportVar_offset_y_new;
    public synchronized void set_offset_y_new(int v) {
        setVar(mExportVarIdx_offset_y_new, v);
        mExportVar_offset_y_new = v;
    }

    public int get_offset_y_new() {
        return mExportVar_offset_y_new;
    }

    public Script.FieldID getFieldID_offset_y_new() {
        return createFieldID(mExportVarIdx_offset_y_new, null);
    }

    private final static int mExportVarIdx_scale_align_size = 4;
    private int mExportVar_scale_align_size;
    public synchronized void set_scale_align_size(int v) {
        setVar(mExportVarIdx_scale_align_size, v);
        mExportVar_scale_align_size = v;
    }

    public int get_scale_align_size() {
        return mExportVar_scale_align_size;
    }

    public Script.FieldID getFieldID_scale_align_size() {
        return createFieldID(mExportVarIdx_scale_align_size, null);
    }

    private final static int mExportVarIdx_avg_factor = 5;
    private float mExportVar_avg_factor;
    public synchronized void set_avg_factor(float v) {
        setVar(mExportVarIdx_avg_factor, v);
        mExportVar_avg_factor = v;
    }

    public float get_avg_factor() {
        return mExportVar_avg_factor;
    }

    public Script.FieldID getFieldID_avg_factor() {
        return createFieldID(mExportVarIdx_avg_factor, null);
    }

    private final static int mExportVarIdx_wiener_C = 6;
    private float mExportVar_wiener_C;
    public synchronized void set_wiener_C(float v) {
        setVar(mExportVarIdx_wiener_C, v);
        mExportVar_wiener_C = v;
    }

    public float get_wiener_C() {
        return mExportVar_wiener_C;
    }

    public Script.FieldID getFieldID_wiener_C() {
        return createFieldID(mExportVarIdx_wiener_C, null);
    }

    private final static int mExportVarIdx_wiener_C_cutoff = 7;
    private float mExportVar_wiener_C_cutoff;
    public synchronized void set_wiener_C_cutoff(float v) {
        setVar(mExportVarIdx_wiener_C_cutoff, v);
        mExportVar_wiener_C_cutoff = v;
    }

    public float get_wiener_C_cutoff() {
        return mExportVar_wiener_C_cutoff;
    }

    public Script.FieldID getFieldID_wiener_C_cutoff() {
        return createFieldID(mExportVarIdx_wiener_C_cutoff, null);
    }

    private final static int mExportVarIdx_bitmap1 = 8;
    private Allocation mExportVar_bitmap1;
    public synchronized void set_bitmap1(Allocation v) {
        setVar(mExportVarIdx_bitmap1, v);
        mExportVar_bitmap1 = v;
    }

    public Allocation get_bitmap1() {
        return mExportVar_bitmap1;
    }

    public Script.FieldID getFieldID_bitmap1() {
        return createFieldID(mExportVarIdx_bitmap1, null);
    }

    private final static int mExportVarIdx_bitmap2 = 9;
    private Allocation mExportVar_bitmap2;
    public synchronized void set_bitmap2(Allocation v) {
        setVar(mExportVarIdx_bitmap2, v);
        mExportVar_bitmap2 = v;
    }

    public Allocation get_bitmap2() {
        return mExportVar_bitmap2;
    }

    public Script.FieldID getFieldID_bitmap2() {
        return createFieldID(mExportVarIdx_bitmap2, null);
    }

    private final static int mExportVarIdx_bitmap3 = 10;
    private Allocation mExportVar_bitmap3;
    public synchronized void set_bitmap3(Allocation v) {
        setVar(mExportVarIdx_bitmap3, v);
        mExportVar_bitmap3 = v;
    }

    public Allocation get_bitmap3() {
        return mExportVar_bitmap3;
    }

    public Script.FieldID getFieldID_bitmap3() {
        return createFieldID(mExportVarIdx_bitmap3, null);
    }

    private final static int mExportVarIdx_bitmap4 = 11;
    private Allocation mExportVar_bitmap4;
    public synchronized void set_bitmap4(Allocation v) {
        setVar(mExportVarIdx_bitmap4, v);
        mExportVar_bitmap4 = v;
    }

    public Allocation get_bitmap4() {
        return mExportVar_bitmap4;
    }

    public Script.FieldID getFieldID_bitmap4() {
        return createFieldID(mExportVarIdx_bitmap4, null);
    }

    private final static int mExportVarIdx_bitmap5 = 12;
    private Allocation mExportVar_bitmap5;
    public synchronized void set_bitmap5(Allocation v) {
        setVar(mExportVarIdx_bitmap5, v);
        mExportVar_bitmap5 = v;
    }

    public Allocation get_bitmap5() {
        return mExportVar_bitmap5;
    }

    public Script.FieldID getFieldID_bitmap5() {
        return createFieldID(mExportVarIdx_bitmap5, null);
    }

    private final static int mExportVarIdx_bitmap6 = 13;
    private Allocation mExportVar_bitmap6;
    public synchronized void set_bitmap6(Allocation v) {
        setVar(mExportVarIdx_bitmap6, v);
        mExportVar_bitmap6 = v;
    }

    public Allocation get_bitmap6() {
        return mExportVar_bitmap6;
    }

    public Script.FieldID getFieldID_bitmap6() {
        return createFieldID(mExportVarIdx_bitmap6, null);
    }

    private final static int mExportVarIdx_bitmap7 = 14;
    private Allocation mExportVar_bitmap7;
    public synchronized void set_bitmap7(Allocation v) {
        setVar(mExportVarIdx_bitmap7, v);
        mExportVar_bitmap7 = v;
    }

    public Allocation get_bitmap7() {
        return mExportVar_bitmap7;
    }

    public Script.FieldID getFieldID_bitmap7() {
        return createFieldID(mExportVarIdx_bitmap7, null);
    }

    private final static int mExportVarIdx_offset_x1 = 15;
    private int mExportVar_offset_x1;
    public synchronized void set_offset_x1(int v) {
        setVar(mExportVarIdx_offset_x1, v);
        mExportVar_offset_x1 = v;
    }

    public int get_offset_x1() {
        return mExportVar_offset_x1;
    }

    public Script.FieldID getFieldID_offset_x1() {
        return createFieldID(mExportVarIdx_offset_x1, null);
    }

    private final static int mExportVarIdx_offset_y1 = 16;
    private int mExportVar_offset_y1;
    public synchronized void set_offset_y1(int v) {
        setVar(mExportVarIdx_offset_y1, v);
        mExportVar_offset_y1 = v;
    }

    public int get_offset_y1() {
        return mExportVar_offset_y1;
    }

    public Script.FieldID getFieldID_offset_y1() {
        return createFieldID(mExportVarIdx_offset_y1, null);
    }

    private final static int mExportVarIdx_offset_x2 = 17;
    private int mExportVar_offset_x2;
    public synchronized void set_offset_x2(int v) {
        setVar(mExportVarIdx_offset_x2, v);
        mExportVar_offset_x2 = v;
    }

    public int get_offset_x2() {
        return mExportVar_offset_x2;
    }

    public Script.FieldID getFieldID_offset_x2() {
        return createFieldID(mExportVarIdx_offset_x2, null);
    }

    private final static int mExportVarIdx_offset_y2 = 18;
    private int mExportVar_offset_y2;
    public synchronized void set_offset_y2(int v) {
        setVar(mExportVarIdx_offset_y2, v);
        mExportVar_offset_y2 = v;
    }

    public int get_offset_y2() {
        return mExportVar_offset_y2;
    }

    public Script.FieldID getFieldID_offset_y2() {
        return createFieldID(mExportVarIdx_offset_y2, null);
    }

    private final static int mExportVarIdx_offset_x3 = 19;
    private int mExportVar_offset_x3;
    public synchronized void set_offset_x3(int v) {
        setVar(mExportVarIdx_offset_x3, v);
        mExportVar_offset_x3 = v;
    }

    public int get_offset_x3() {
        return mExportVar_offset_x3;
    }

    public Script.FieldID getFieldID_offset_x3() {
        return createFieldID(mExportVarIdx_offset_x3, null);
    }

    private final static int mExportVarIdx_offset_y3 = 20;
    private int mExportVar_offset_y3;
    public synchronized void set_offset_y3(int v) {
        setVar(mExportVarIdx_offset_y3, v);
        mExportVar_offset_y3 = v;
    }

    public int get_offset_y3() {
        return mExportVar_offset_y3;
    }

    public Script.FieldID getFieldID_offset_y3() {
        return createFieldID(mExportVarIdx_offset_y3, null);
    }

    private final static int mExportVarIdx_offset_x4 = 21;
    private int mExportVar_offset_x4;
    public synchronized void set_offset_x4(int v) {
        setVar(mExportVarIdx_offset_x4, v);
        mExportVar_offset_x4 = v;
    }

    public int get_offset_x4() {
        return mExportVar_offset_x4;
    }

    public Script.FieldID getFieldID_offset_x4() {
        return createFieldID(mExportVarIdx_offset_x4, null);
    }

    private final static int mExportVarIdx_offset_y4 = 22;
    private int mExportVar_offset_y4;
    public synchronized void set_offset_y4(int v) {
        setVar(mExportVarIdx_offset_y4, v);
        mExportVar_offset_y4 = v;
    }

    public int get_offset_y4() {
        return mExportVar_offset_y4;
    }

    public Script.FieldID getFieldID_offset_y4() {
        return createFieldID(mExportVarIdx_offset_y4, null);
    }

    private final static int mExportVarIdx_offset_x5 = 23;
    private int mExportVar_offset_x5;
    public synchronized void set_offset_x5(int v) {
        setVar(mExportVarIdx_offset_x5, v);
        mExportVar_offset_x5 = v;
    }

    public int get_offset_x5() {
        return mExportVar_offset_x5;
    }

    public Script.FieldID getFieldID_offset_x5() {
        return createFieldID(mExportVarIdx_offset_x5, null);
    }

    private final static int mExportVarIdx_offset_y5 = 24;
    private int mExportVar_offset_y5;
    public synchronized void set_offset_y5(int v) {
        setVar(mExportVarIdx_offset_y5, v);
        mExportVar_offset_y5 = v;
    }

    public int get_offset_y5() {
        return mExportVar_offset_y5;
    }

    public Script.FieldID getFieldID_offset_y5() {
        return createFieldID(mExportVarIdx_offset_y5, null);
    }

    private final static int mExportVarIdx_offset_x6 = 25;
    private int mExportVar_offset_x6;
    public synchronized void set_offset_x6(int v) {
        setVar(mExportVarIdx_offset_x6, v);
        mExportVar_offset_x6 = v;
    }

    public int get_offset_x6() {
        return mExportVar_offset_x6;
    }

    public Script.FieldID getFieldID_offset_x6() {
        return createFieldID(mExportVarIdx_offset_x6, null);
    }

    private final static int mExportVarIdx_offset_y6 = 26;
    private int mExportVar_offset_y6;
    public synchronized void set_offset_y6(int v) {
        setVar(mExportVarIdx_offset_y6, v);
        mExportVar_offset_y6 = v;
    }

    public int get_offset_y6() {
        return mExportVar_offset_y6;
    }

    public Script.FieldID getFieldID_offset_y6() {
        return createFieldID(mExportVarIdx_offset_y6, null);
    }

    private final static int mExportVarIdx_offset_x7 = 27;
    private int mExportVar_offset_x7;
    public synchronized void set_offset_x7(int v) {
        setVar(mExportVarIdx_offset_x7, v);
        mExportVar_offset_x7 = v;
    }

    public int get_offset_x7() {
        return mExportVar_offset_x7;
    }

    public Script.FieldID getFieldID_offset_x7() {
        return createFieldID(mExportVarIdx_offset_x7, null);
    }

    private final static int mExportVarIdx_offset_y7 = 28;
    private int mExportVar_offset_y7;
    public synchronized void set_offset_y7(int v) {
        setVar(mExportVarIdx_offset_y7, v);
        mExportVar_offset_y7 = v;
    }

    public int get_offset_y7() {
        return mExportVar_offset_y7;
    }

    public Script.FieldID getFieldID_offset_y7() {
        return createFieldID(mExportVarIdx_offset_y7, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_compute_diff = 1;
    public Script.KernelID getKernelID_compute_diff() {
        return createKernelID(mExportForEachIdx_compute_diff, 59, null, null);
    }

    public void forEach_compute_diff(Allocation ain, Allocation aout) {
        forEach_compute_diff(ain, aout, null);
    }

    public void forEach_compute_diff(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_compute_diff, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_avg_f = 2;
    public Script.KernelID getKernelID_avg_f() {
        return createKernelID(mExportForEachIdx_avg_f, 59, null, null);
    }

    public void forEach_avg_f(Allocation ain, Allocation aout) {
        forEach_avg_f(ain, aout, null);
    }

    public void forEach_avg_f(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F32_3)) {
            throw new RSRuntimeException("Type mismatch with F32_3!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F32_3)) {
            throw new RSRuntimeException("Type mismatch with F32_3!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_avg_f, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_avg = 3;
    public Script.KernelID getKernelID_avg() {
        return createKernelID(mExportForEachIdx_avg, 59, null, null);
    }

    public void forEach_avg(Allocation ain, Allocation aout) {
        forEach_avg(ain, aout, null);
    }

    public void forEach_avg(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F32_3)) {
            throw new RSRuntimeException("Type mismatch with F32_3!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_avg, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_avg_multi = 4;
    public Script.KernelID getKernelID_avg_multi() {
        return createKernelID(mExportForEachIdx_avg_multi, 59, null, null);
    }

    public void forEach_avg_multi(Allocation ain, Allocation aout) {
        forEach_avg_multi(ain, aout, null);
    }

    public void forEach_avg_multi(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_avg_multi, ain, aout, null, sc);
    }

}

