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
 * The source Renderscript file: /home/andrei/hdd/tmp/android_3d/OpenCamera-MultiSync/app/src/main/rs/pyramid_blending.rs
 */

package net.sourceforge.opencamera.multisync;

import android.os.Build;
import android.os.Process;
import java.lang.reflect.Field;
import android.renderscript.*;
import net.sourceforge.opencamera.multisync.pyramid_blendingBitCode;

/**
 * @hide
 */
public class ScriptC_pyramid_blending extends ScriptC {
    private static final String __rs_resource_name = "pyramid_blending";
    // Constructor
    public  ScriptC_pyramid_blending(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              pyramid_blendingBitCode.getBitCode32(),
              pyramid_blendingBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        mExportVar_g0 = 0.0500000007f;
        __F32 = Element.F32(rs);
        mExportVar_g1 = 0.25f;
        mExportVar_g2 = 0.400000006f;
        __U8_4 = Element.U8_4(rs);
        __F32_3 = Element.F32_3(rs);
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __F32_3;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
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

    private final static int mExportVarIdx_g0 = 1;
    private float mExportVar_g0;
    public final static float const_g0 = 0.0500000007f;
    public float get_g0() {
        return mExportVar_g0;
    }

    public Script.FieldID getFieldID_g0() {
        return createFieldID(mExportVarIdx_g0, null);
    }

    private final static int mExportVarIdx_g1 = 2;
    private float mExportVar_g1;
    public final static float const_g1 = 0.25f;
    public float get_g1() {
        return mExportVar_g1;
    }

    public Script.FieldID getFieldID_g1() {
        return createFieldID(mExportVarIdx_g1, null);
    }

    private final static int mExportVarIdx_g2 = 3;
    private float mExportVar_g2;
    public final static float const_g2 = 0.400000006f;
    public float get_g2() {
        return mExportVar_g2;
    }

    public Script.FieldID getFieldID_g2() {
        return createFieldID(mExportVarIdx_g2, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_reduce = 1;
    public Script.KernelID getKernelID_reduce() {
        return createKernelID(mExportForEachIdx_reduce, 59, null, null);
    }

    public void forEach_reduce(Allocation ain, Allocation aout) {
        forEach_reduce(ain, aout, null);
    }

    public void forEach_reduce(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_reduce, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_expand = 2;
    public Script.KernelID getKernelID_expand() {
        return createKernelID(mExportForEachIdx_expand, 59, null, null);
    }

    public void forEach_expand(Allocation ain, Allocation aout) {
        forEach_expand(ain, aout, null);
    }

    public void forEach_expand(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_expand, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_blur = 3;
    public Script.KernelID getKernelID_blur() {
        return createKernelID(mExportForEachIdx_blur, 59, null, null);
    }

    public void forEach_blur(Allocation ain, Allocation aout) {
        forEach_blur(ain, aout, null);
    }

    public void forEach_blur(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_blur, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_blur1dX = 4;
    public Script.KernelID getKernelID_blur1dX() {
        return createKernelID(mExportForEachIdx_blur1dX, 59, null, null);
    }

    public void forEach_blur1dX(Allocation ain, Allocation aout) {
        forEach_blur1dX(ain, aout, null);
    }

    public void forEach_blur1dX(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_blur1dX, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_blur1dY = 5;
    public Script.KernelID getKernelID_blur1dY() {
        return createKernelID(mExportForEachIdx_blur1dY, 59, null, null);
    }

    public void forEach_blur1dY(Allocation ain, Allocation aout) {
        forEach_blur1dY(ain, aout, null);
    }

    public void forEach_blur1dY(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_blur1dY, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_subtract = 6;
    public Script.KernelID getKernelID_subtract() {
        return createKernelID(mExportForEachIdx_subtract, 59, null, null);
    }

    public void forEach_subtract(Allocation ain, Allocation aout) {
        forEach_subtract(ain, aout, null);
    }

    public void forEach_subtract(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_subtract, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_add = 7;
    public Script.KernelID getKernelID_add() {
        return createKernelID(mExportForEachIdx_add, 59, null, null);
    }

    public void forEach_add(Allocation ain, Allocation aout) {
        forEach_add(ain, aout, null);
    }

    public void forEach_add(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_add, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_merge = 8;
    public Script.KernelID getKernelID_merge() {
        return createKernelID(mExportForEachIdx_merge, 59, null, null);
    }

    public void forEach_merge(Allocation ain, Allocation aout) {
        forEach_merge(ain, aout, null);
    }

    public void forEach_merge(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_merge, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_merge_f = 9;
    public Script.KernelID getKernelID_merge_f() {
        return createKernelID(mExportForEachIdx_merge_f, 59, null, null);
    }

    public void forEach_merge_f(Allocation ain, Allocation aout) {
        forEach_merge_f(ain, aout, null);
    }

    public void forEach_merge_f(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_merge_f, ain, aout, null, sc);
    }

    private final static int mExportFuncIdx_setBlendWidth = 0;
    public void invoke_setBlendWidth(int blend_width, int full_width) {
        FieldPacker setBlendWidth_fp = new FieldPacker(8);
        setBlendWidth_fp.addI32(blend_width);
        setBlendWidth_fp.addI32(full_width);
        invoke(mExportFuncIdx_setBlendWidth, setBlendWidth_fp);
    }

}

