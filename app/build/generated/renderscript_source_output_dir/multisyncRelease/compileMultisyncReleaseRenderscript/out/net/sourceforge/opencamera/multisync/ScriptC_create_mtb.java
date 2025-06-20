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
 * The source Renderscript file: /home/andrei/hdd/tmp/android_3d/OpenCamera-MultiSync/app/src/main/rs/create_mtb.rs
 */

package net.sourceforge.opencamera.multisync;

import android.os.Build;
import android.os.Process;
import java.lang.reflect.Field;
import android.renderscript.*;
import net.sourceforge.opencamera.multisync.create_mtbBitCode;

/**
 * @hide
 */
public class ScriptC_create_mtb extends ScriptC {
    private static final String __rs_resource_name = "create_mtb";
    // Constructor
    public  ScriptC_create_mtb(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              create_mtbBitCode.getBitCode32(),
              create_mtbBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        mExportVar_median_value = 0;
        __I32 = Element.I32(rs);
        mExportVar_start_x = 0;
        mExportVar_start_y = 0;
        __U8_4 = Element.U8_4(rs);
        __F32_3 = Element.F32_3(rs);
    }

    private Element __ALLOCATION;
    private Element __F32_3;
    private Element __I32;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_out_bitmap = 0;
    private Allocation mExportVar_out_bitmap;
    public synchronized void set_out_bitmap(Allocation v) {
        setVar(mExportVarIdx_out_bitmap, v);
        mExportVar_out_bitmap = v;
    }

    public Allocation get_out_bitmap() {
        return mExportVar_out_bitmap;
    }

    public Script.FieldID getFieldID_out_bitmap() {
        return createFieldID(mExportVarIdx_out_bitmap, null);
    }

    private final static int mExportVarIdx_median_value = 1;
    private int mExportVar_median_value;
    public synchronized void set_median_value(int v) {
        setVar(mExportVarIdx_median_value, v);
        mExportVar_median_value = v;
    }

    public int get_median_value() {
        return mExportVar_median_value;
    }

    public Script.FieldID getFieldID_median_value() {
        return createFieldID(mExportVarIdx_median_value, null);
    }

    private final static int mExportVarIdx_start_x = 2;
    private int mExportVar_start_x;
    public synchronized void set_start_x(int v) {
        setVar(mExportVarIdx_start_x, v);
        mExportVar_start_x = v;
    }

    public int get_start_x() {
        return mExportVar_start_x;
    }

    public Script.FieldID getFieldID_start_x() {
        return createFieldID(mExportVarIdx_start_x, null);
    }

    private final static int mExportVarIdx_start_y = 3;
    private int mExportVar_start_y;
    public synchronized void set_start_y(int v) {
        setVar(mExportVarIdx_start_y, v);
        mExportVar_start_y = v;
    }

    public int get_start_y() {
        return mExportVar_start_y;
    }

    public Script.FieldID getFieldID_start_y() {
        return createFieldID(mExportVarIdx_start_y, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_create_mtb = 1;
    public Script.KernelID getKernelID_create_mtb() {
        return createKernelID(mExportForEachIdx_create_mtb, 57, null, null);
    }

    public void forEach_create_mtb(Allocation ain) {
        forEach_create_mtb(ain, null);
    }

    public void forEach_create_mtb(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_create_mtb, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_create_greyscale = 2;
    public Script.KernelID getKernelID_create_greyscale() {
        return createKernelID(mExportForEachIdx_create_greyscale, 57, null, null);
    }

    public void forEach_create_greyscale(Allocation ain) {
        forEach_create_greyscale(ain, null);
    }

    public void forEach_create_greyscale(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_create_greyscale, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_create_greyscale_f = 3;
    public Script.KernelID getKernelID_create_greyscale_f() {
        return createKernelID(mExportForEachIdx_create_greyscale_f, 57, null, null);
    }

    public void forEach_create_greyscale_f(Allocation ain) {
        forEach_create_greyscale_f(ain, null);
    }

    public void forEach_create_greyscale_f(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F32_3)) {
            throw new RSRuntimeException("Type mismatch with F32_3!");
        }
        forEach(mExportForEachIdx_create_greyscale_f, ain, null, null, sc);
    }

}

