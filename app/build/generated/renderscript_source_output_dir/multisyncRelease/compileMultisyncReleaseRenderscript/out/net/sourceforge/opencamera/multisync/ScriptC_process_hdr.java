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
 * The source Renderscript file: /home/andrei/hdd/tmp/android_3d/OpenCamera-MultiSync/app/src/main/rs/process_hdr.rs
 */

package net.sourceforge.opencamera.multisync;

import android.os.Build;
import android.os.Process;
import java.lang.reflect.Field;
import android.renderscript.*;
import net.sourceforge.opencamera.multisync.process_hdrBitCode;

/**
 * @hide
 */
public class ScriptC_process_hdr extends ScriptC {
    private static final String __rs_resource_name = "process_hdr";
    // Constructor
    public  ScriptC_process_hdr(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              process_hdrBitCode.getBitCode32(),
              process_hdrBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        mExportVar_offset_x0 = 0;
        __I32 = Element.I32(rs);
        mExportVar_offset_y0 = 0;
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
        mExportVar_parameter_A0 = 1.f;
        __F32 = Element.F32(rs);
        mExportVar_parameter_B0 = 0.f;
        mExportVar_parameter_A1 = 1.f;
        mExportVar_parameter_B1 = 0.f;
        mExportVar_parameter_A2 = 1.f;
        mExportVar_parameter_B2 = 0.f;
        mExportVar_parameter_A3 = 1.f;
        mExportVar_parameter_B3 = 0.f;
        mExportVar_parameter_A4 = 1.f;
        mExportVar_parameter_B4 = 0.f;
        mExportVar_parameter_A5 = 1.f;
        mExportVar_parameter_B5 = 0.f;
        mExportVar_parameter_A6 = 1.f;
        mExportVar_parameter_B6 = 0.f;
        mExportVar_weight_scale_c = 0.00778162247f;
        mExportVar_tonemap_algorithm_clamp_c = 0;
        mExportVar_tonemap_algorithm_exponential_c = 1;
        mExportVar_tonemap_algorithm_reinhard_c = 2;
        mExportVar_tonemap_algorithm_filmic_c = 3;
        mExportVar_tonemap_algorithm_aces_c = 4;
        mExportVar_tonemap_algorithm = 2;
        mExportVar_exposure = 1.20000005f;
        mExportVar_tonemap_scale = 1.f;
        mExportVar_filmic_exposure_bias = 0.00784313772f;
        mExportVar_W = 11.1999998f;
        mExportVar_linear_scale = 1.f;
        mExportVar_n_bitmaps_g = 3;
        __U8_4 = Element.U8_4(rs);
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __I32;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_bitmap0 = 0;
    private Allocation mExportVar_bitmap0;
    public synchronized void set_bitmap0(Allocation v) {
        setVar(mExportVarIdx_bitmap0, v);
        mExportVar_bitmap0 = v;
    }

    public Allocation get_bitmap0() {
        return mExportVar_bitmap0;
    }

    public Script.FieldID getFieldID_bitmap0() {
        return createFieldID(mExportVarIdx_bitmap0, null);
    }

    private final static int mExportVarIdx_bitmap1 = 1;
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

    private final static int mExportVarIdx_bitmap2 = 2;
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

    private final static int mExportVarIdx_bitmap3 = 3;
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

    private final static int mExportVarIdx_bitmap4 = 4;
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

    private final static int mExportVarIdx_bitmap5 = 5;
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

    private final static int mExportVarIdx_bitmap6 = 6;
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

    private final static int mExportVarIdx_offset_x0 = 7;
    private int mExportVar_offset_x0;
    public synchronized void set_offset_x0(int v) {
        setVar(mExportVarIdx_offset_x0, v);
        mExportVar_offset_x0 = v;
    }

    public int get_offset_x0() {
        return mExportVar_offset_x0;
    }

    public Script.FieldID getFieldID_offset_x0() {
        return createFieldID(mExportVarIdx_offset_x0, null);
    }

    private final static int mExportVarIdx_offset_y0 = 8;
    private int mExportVar_offset_y0;
    public synchronized void set_offset_y0(int v) {
        setVar(mExportVarIdx_offset_y0, v);
        mExportVar_offset_y0 = v;
    }

    public int get_offset_y0() {
        return mExportVar_offset_y0;
    }

    public Script.FieldID getFieldID_offset_y0() {
        return createFieldID(mExportVarIdx_offset_y0, null);
    }

    private final static int mExportVarIdx_offset_x1 = 9;
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

    private final static int mExportVarIdx_offset_y1 = 10;
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

    private final static int mExportVarIdx_offset_x2 = 11;
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

    private final static int mExportVarIdx_offset_y2 = 12;
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

    private final static int mExportVarIdx_offset_x3 = 13;
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

    private final static int mExportVarIdx_offset_y3 = 14;
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

    private final static int mExportVarIdx_offset_x4 = 15;
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

    private final static int mExportVarIdx_offset_y4 = 16;
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

    private final static int mExportVarIdx_offset_x5 = 17;
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

    private final static int mExportVarIdx_offset_y5 = 18;
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

    private final static int mExportVarIdx_offset_x6 = 19;
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

    private final static int mExportVarIdx_offset_y6 = 20;
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

    private final static int mExportVarIdx_parameter_A0 = 21;
    private float mExportVar_parameter_A0;
    public synchronized void set_parameter_A0(float v) {
        setVar(mExportVarIdx_parameter_A0, v);
        mExportVar_parameter_A0 = v;
    }

    public float get_parameter_A0() {
        return mExportVar_parameter_A0;
    }

    public Script.FieldID getFieldID_parameter_A0() {
        return createFieldID(mExportVarIdx_parameter_A0, null);
    }

    private final static int mExportVarIdx_parameter_B0 = 22;
    private float mExportVar_parameter_B0;
    public synchronized void set_parameter_B0(float v) {
        setVar(mExportVarIdx_parameter_B0, v);
        mExportVar_parameter_B0 = v;
    }

    public float get_parameter_B0() {
        return mExportVar_parameter_B0;
    }

    public Script.FieldID getFieldID_parameter_B0() {
        return createFieldID(mExportVarIdx_parameter_B0, null);
    }

    private final static int mExportVarIdx_parameter_A1 = 23;
    private float mExportVar_parameter_A1;
    public synchronized void set_parameter_A1(float v) {
        setVar(mExportVarIdx_parameter_A1, v);
        mExportVar_parameter_A1 = v;
    }

    public float get_parameter_A1() {
        return mExportVar_parameter_A1;
    }

    public Script.FieldID getFieldID_parameter_A1() {
        return createFieldID(mExportVarIdx_parameter_A1, null);
    }

    private final static int mExportVarIdx_parameter_B1 = 24;
    private float mExportVar_parameter_B1;
    public synchronized void set_parameter_B1(float v) {
        setVar(mExportVarIdx_parameter_B1, v);
        mExportVar_parameter_B1 = v;
    }

    public float get_parameter_B1() {
        return mExportVar_parameter_B1;
    }

    public Script.FieldID getFieldID_parameter_B1() {
        return createFieldID(mExportVarIdx_parameter_B1, null);
    }

    private final static int mExportVarIdx_parameter_A2 = 25;
    private float mExportVar_parameter_A2;
    public synchronized void set_parameter_A2(float v) {
        setVar(mExportVarIdx_parameter_A2, v);
        mExportVar_parameter_A2 = v;
    }

    public float get_parameter_A2() {
        return mExportVar_parameter_A2;
    }

    public Script.FieldID getFieldID_parameter_A2() {
        return createFieldID(mExportVarIdx_parameter_A2, null);
    }

    private final static int mExportVarIdx_parameter_B2 = 26;
    private float mExportVar_parameter_B2;
    public synchronized void set_parameter_B2(float v) {
        setVar(mExportVarIdx_parameter_B2, v);
        mExportVar_parameter_B2 = v;
    }

    public float get_parameter_B2() {
        return mExportVar_parameter_B2;
    }

    public Script.FieldID getFieldID_parameter_B2() {
        return createFieldID(mExportVarIdx_parameter_B2, null);
    }

    private final static int mExportVarIdx_parameter_A3 = 27;
    private float mExportVar_parameter_A3;
    public synchronized void set_parameter_A3(float v) {
        setVar(mExportVarIdx_parameter_A3, v);
        mExportVar_parameter_A3 = v;
    }

    public float get_parameter_A3() {
        return mExportVar_parameter_A3;
    }

    public Script.FieldID getFieldID_parameter_A3() {
        return createFieldID(mExportVarIdx_parameter_A3, null);
    }

    private final static int mExportVarIdx_parameter_B3 = 28;
    private float mExportVar_parameter_B3;
    public synchronized void set_parameter_B3(float v) {
        setVar(mExportVarIdx_parameter_B3, v);
        mExportVar_parameter_B3 = v;
    }

    public float get_parameter_B3() {
        return mExportVar_parameter_B3;
    }

    public Script.FieldID getFieldID_parameter_B3() {
        return createFieldID(mExportVarIdx_parameter_B3, null);
    }

    private final static int mExportVarIdx_parameter_A4 = 29;
    private float mExportVar_parameter_A4;
    public synchronized void set_parameter_A4(float v) {
        setVar(mExportVarIdx_parameter_A4, v);
        mExportVar_parameter_A4 = v;
    }

    public float get_parameter_A4() {
        return mExportVar_parameter_A4;
    }

    public Script.FieldID getFieldID_parameter_A4() {
        return createFieldID(mExportVarIdx_parameter_A4, null);
    }

    private final static int mExportVarIdx_parameter_B4 = 30;
    private float mExportVar_parameter_B4;
    public synchronized void set_parameter_B4(float v) {
        setVar(mExportVarIdx_parameter_B4, v);
        mExportVar_parameter_B4 = v;
    }

    public float get_parameter_B4() {
        return mExportVar_parameter_B4;
    }

    public Script.FieldID getFieldID_parameter_B4() {
        return createFieldID(mExportVarIdx_parameter_B4, null);
    }

    private final static int mExportVarIdx_parameter_A5 = 31;
    private float mExportVar_parameter_A5;
    public synchronized void set_parameter_A5(float v) {
        setVar(mExportVarIdx_parameter_A5, v);
        mExportVar_parameter_A5 = v;
    }

    public float get_parameter_A5() {
        return mExportVar_parameter_A5;
    }

    public Script.FieldID getFieldID_parameter_A5() {
        return createFieldID(mExportVarIdx_parameter_A5, null);
    }

    private final static int mExportVarIdx_parameter_B5 = 32;
    private float mExportVar_parameter_B5;
    public synchronized void set_parameter_B5(float v) {
        setVar(mExportVarIdx_parameter_B5, v);
        mExportVar_parameter_B5 = v;
    }

    public float get_parameter_B5() {
        return mExportVar_parameter_B5;
    }

    public Script.FieldID getFieldID_parameter_B5() {
        return createFieldID(mExportVarIdx_parameter_B5, null);
    }

    private final static int mExportVarIdx_parameter_A6 = 33;
    private float mExportVar_parameter_A6;
    public synchronized void set_parameter_A6(float v) {
        setVar(mExportVarIdx_parameter_A6, v);
        mExportVar_parameter_A6 = v;
    }

    public float get_parameter_A6() {
        return mExportVar_parameter_A6;
    }

    public Script.FieldID getFieldID_parameter_A6() {
        return createFieldID(mExportVarIdx_parameter_A6, null);
    }

    private final static int mExportVarIdx_parameter_B6 = 34;
    private float mExportVar_parameter_B6;
    public synchronized void set_parameter_B6(float v) {
        setVar(mExportVarIdx_parameter_B6, v);
        mExportVar_parameter_B6 = v;
    }

    public float get_parameter_B6() {
        return mExportVar_parameter_B6;
    }

    public Script.FieldID getFieldID_parameter_B6() {
        return createFieldID(mExportVarIdx_parameter_B6, null);
    }

    private final static int mExportVarIdx_weight_scale_c = 35;
    private float mExportVar_weight_scale_c;
    public final static float const_weight_scale_c = 0.00778162247f;
    public float get_weight_scale_c() {
        return mExportVar_weight_scale_c;
    }

    public Script.FieldID getFieldID_weight_scale_c() {
        return createFieldID(mExportVarIdx_weight_scale_c, null);
    }

    private final static int mExportVarIdx_tonemap_algorithm_clamp_c = 36;
    private int mExportVar_tonemap_algorithm_clamp_c;
    public final static int const_tonemap_algorithm_clamp_c = 0;
    public int get_tonemap_algorithm_clamp_c() {
        return mExportVar_tonemap_algorithm_clamp_c;
    }

    public Script.FieldID getFieldID_tonemap_algorithm_clamp_c() {
        return createFieldID(mExportVarIdx_tonemap_algorithm_clamp_c, null);
    }

    private final static int mExportVarIdx_tonemap_algorithm_exponential_c = 37;
    private int mExportVar_tonemap_algorithm_exponential_c;
    public final static int const_tonemap_algorithm_exponential_c = 1;
    public int get_tonemap_algorithm_exponential_c() {
        return mExportVar_tonemap_algorithm_exponential_c;
    }

    public Script.FieldID getFieldID_tonemap_algorithm_exponential_c() {
        return createFieldID(mExportVarIdx_tonemap_algorithm_exponential_c, null);
    }

    private final static int mExportVarIdx_tonemap_algorithm_reinhard_c = 38;
    private int mExportVar_tonemap_algorithm_reinhard_c;
    public final static int const_tonemap_algorithm_reinhard_c = 2;
    public int get_tonemap_algorithm_reinhard_c() {
        return mExportVar_tonemap_algorithm_reinhard_c;
    }

    public Script.FieldID getFieldID_tonemap_algorithm_reinhard_c() {
        return createFieldID(mExportVarIdx_tonemap_algorithm_reinhard_c, null);
    }

    private final static int mExportVarIdx_tonemap_algorithm_filmic_c = 39;
    private int mExportVar_tonemap_algorithm_filmic_c;
    public final static int const_tonemap_algorithm_filmic_c = 3;
    public int get_tonemap_algorithm_filmic_c() {
        return mExportVar_tonemap_algorithm_filmic_c;
    }

    public Script.FieldID getFieldID_tonemap_algorithm_filmic_c() {
        return createFieldID(mExportVarIdx_tonemap_algorithm_filmic_c, null);
    }

    private final static int mExportVarIdx_tonemap_algorithm_aces_c = 40;
    private int mExportVar_tonemap_algorithm_aces_c;
    public final static int const_tonemap_algorithm_aces_c = 4;
    public int get_tonemap_algorithm_aces_c() {
        return mExportVar_tonemap_algorithm_aces_c;
    }

    public Script.FieldID getFieldID_tonemap_algorithm_aces_c() {
        return createFieldID(mExportVarIdx_tonemap_algorithm_aces_c, null);
    }

    private final static int mExportVarIdx_tonemap_algorithm = 41;
    private int mExportVar_tonemap_algorithm;
    public synchronized void set_tonemap_algorithm(int v) {
        setVar(mExportVarIdx_tonemap_algorithm, v);
        mExportVar_tonemap_algorithm = v;
    }

    public int get_tonemap_algorithm() {
        return mExportVar_tonemap_algorithm;
    }

    public Script.FieldID getFieldID_tonemap_algorithm() {
        return createFieldID(mExportVarIdx_tonemap_algorithm, null);
    }

    private final static int mExportVarIdx_exposure = 42;
    private float mExportVar_exposure;
    public final static float const_exposure = 1.20000005f;
    public float get_exposure() {
        return mExportVar_exposure;
    }

    public Script.FieldID getFieldID_exposure() {
        return createFieldID(mExportVarIdx_exposure, null);
    }

    private final static int mExportVarIdx_tonemap_scale = 43;
    private float mExportVar_tonemap_scale;
    public synchronized void set_tonemap_scale(float v) {
        setVar(mExportVarIdx_tonemap_scale, v);
        mExportVar_tonemap_scale = v;
    }

    public float get_tonemap_scale() {
        return mExportVar_tonemap_scale;
    }

    public Script.FieldID getFieldID_tonemap_scale() {
        return createFieldID(mExportVarIdx_tonemap_scale, null);
    }

    private final static int mExportVarIdx_filmic_exposure_bias = 44;
    private float mExportVar_filmic_exposure_bias;
    public final static float const_filmic_exposure_bias = 0.00784313772f;
    public float get_filmic_exposure_bias() {
        return mExportVar_filmic_exposure_bias;
    }

    public Script.FieldID getFieldID_filmic_exposure_bias() {
        return createFieldID(mExportVarIdx_filmic_exposure_bias, null);
    }

    private final static int mExportVarIdx_W = 45;
    private float mExportVar_W;
    public synchronized void set_W(float v) {
        setVar(mExportVarIdx_W, v);
        mExportVar_W = v;
    }

    public float get_W() {
        return mExportVar_W;
    }

    public Script.FieldID getFieldID_W() {
        return createFieldID(mExportVarIdx_W, null);
    }

    private final static int mExportVarIdx_linear_scale = 46;
    private float mExportVar_linear_scale;
    public synchronized void set_linear_scale(float v) {
        setVar(mExportVarIdx_linear_scale, v);
        mExportVar_linear_scale = v;
    }

    public float get_linear_scale() {
        return mExportVar_linear_scale;
    }

    public Script.FieldID getFieldID_linear_scale() {
        return createFieldID(mExportVarIdx_linear_scale, null);
    }

    private final static int mExportVarIdx_n_bitmaps_g = 47;
    private int mExportVar_n_bitmaps_g;
    public synchronized void set_n_bitmaps_g(int v) {
        setVar(mExportVarIdx_n_bitmaps_g, v);
        mExportVar_n_bitmaps_g = v;
    }

    public int get_n_bitmaps_g() {
        return mExportVar_n_bitmaps_g;
    }

    public Script.FieldID getFieldID_n_bitmaps_g() {
        return createFieldID(mExportVarIdx_n_bitmaps_g, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_hdr = 1;
    public Script.KernelID getKernelID_hdr() {
        return createKernelID(mExportForEachIdx_hdr, 59, null, null);
    }

    public void forEach_hdr(Allocation ain, Allocation aout) {
        forEach_hdr(ain, aout, null);
    }

    public void forEach_hdr(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_hdr, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_hdr_n = 2;
    public Script.KernelID getKernelID_hdr_n() {
        return createKernelID(mExportForEachIdx_hdr_n, 59, null, null);
    }

    public void forEach_hdr_n(Allocation ain, Allocation aout) {
        forEach_hdr_n(ain, aout, null);
    }

    public void forEach_hdr_n(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_hdr_n, ain, aout, null, sc);
    }

}

