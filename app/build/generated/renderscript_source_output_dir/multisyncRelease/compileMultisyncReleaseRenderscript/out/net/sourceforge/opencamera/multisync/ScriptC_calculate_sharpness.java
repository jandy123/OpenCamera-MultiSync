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
 * The source Renderscript file: /home/andrei/hdd/tmp/android_3d/OpenCamera-MultiSync/app/src/main/rs/calculate_sharpness.rs
 */

package net.sourceforge.opencamera.multisync;

import android.os.Build;
import android.os.Process;
import java.lang.reflect.Field;
import android.renderscript.*;
import net.sourceforge.opencamera.multisync.calculate_sharpnessBitCode;

/**
 * @hide
 */
public class ScriptC_calculate_sharpness extends ScriptC {
    private static final String __rs_resource_name = "calculate_sharpness";
    // Constructor
    public  ScriptC_calculate_sharpness(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              calculate_sharpnessBitCode.getBitCode32(),
              calculate_sharpnessBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        __I32 = Element.I32(rs);
        __U8_4 = Element.U8_4(rs);
    }

    private Element __ALLOCATION;
    private Element __I32;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_bitmap = 0;
    private Allocation mExportVar_bitmap;
    public synchronized void set_bitmap(Allocation v) {
        setVar(mExportVarIdx_bitmap, v);
        mExportVar_bitmap = v;
    }

    public Allocation get_bitmap() {
        return mExportVar_bitmap;
    }

    public Script.FieldID getFieldID_bitmap() {
        return createFieldID(mExportVarIdx_bitmap, null);
    }

    private final static int mExportVarIdx_sums = 1;
    private Allocation mExportVar_sums;
    public void bind_sums(Allocation v) {
        mExportVar_sums = v;
        if (v == null) bindAllocation(null, mExportVarIdx_sums);
        else bindAllocation(v, mExportVarIdx_sums);
    }

    public Allocation get_sums() {
        return mExportVar_sums;
    }

    private final static int mExportVarIdx_width = 2;
    private int mExportVar_width;
    public synchronized void set_width(int v) {
        setVar(mExportVarIdx_width, v);
        mExportVar_width = v;
    }

    public int get_width() {
        return mExportVar_width;
    }

    public Script.FieldID getFieldID_width() {
        return createFieldID(mExportVarIdx_width, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_calculate_sharpness = 1;
    public Script.KernelID getKernelID_calculate_sharpness() {
        return createKernelID(mExportForEachIdx_calculate_sharpness, 57, null, null);
    }

    public void forEach_calculate_sharpness(Allocation ain) {
        forEach_calculate_sharpness(ain, null);
    }

    public void forEach_calculate_sharpness(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_calculate_sharpness, ain, null, null, sc);
    }

    private final static int mExportFuncIdx_init_sums = 0;
    public void invoke_init_sums() {
        invoke(mExportFuncIdx_init_sums);
    }

}

