/* Class286_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class286_Sub1 extends Class286 {
    private boolean aBoolean6183 = false;
    static int anInt6184;
    static int anInt6185;
    static int anInt6186;
    private Class171 aClass171_6187;
    private Class171 aClass171_6188;
    static int[] anIntArray6189 = new int[1];
    static int anInt6190;
    static int anInt6191;
    static int anInt6192;
    private boolean aBoolean6193;
    private Class258_Sub3 aClass258_Sub3_6194;
    static int anInt6195;
    private Class171 aClass171_6196;
    private boolean aBoolean6197;
    private boolean aBoolean6198;
    private Class171 aClass171_6199;
    static String[] aStringArray6200;
    static Class74 aClass74_6201 = new Class74(9, 19);
    static int anInt6202;

    final void method2141(boolean bool) {
        if (bool == false) {
            anInt6192++;
            Class101_Sub3 class101_sub3
                    = (((ha_Sub2) ((Class286) this).aHa_Sub2_3684)
                    .aClass101_Sub3_7766);
            if (!aBoolean6197)
                OpenGL.glBindProgramARB
                        (34336,
                                ((((ha_Sub2) ((Class286) this).aHa_Sub2_3684).anInt7788
                                        == 2147483647)
                                        ? ((Class171) aClass171_6188).anInt2270
                                        : ((Class171) aClass171_6199).anInt2270));
            else
                OpenGL.glBindProgramARB
                        (34336,
                                ((((ha_Sub2) ((Class286) this).aHa_Sub2_3684).anInt7788
                                        ^ 0xffffffff) != -2147483648
                                        ? ((Class171) aClass171_6187).anInt2270
                                        : ((Class171) aClass171_6196).anInt2270));
            class101_sub3.method937(true, 0.0F, 0.0F, -1.0F,
                    (float) (((ha_Sub2)
                            ((Class286) this).aHa_Sub2_3684)
                            .anInt7788),
                    Class92.aFloatArray1528);
            OpenGL.glProgramLocalParameter4fARB(34336, 1,
                    Class92.aFloatArray1528[0],
                    Class92.aFloatArray1528[1],
                    Class92.aFloatArray1528[2],
                    Class92.aFloatArray1528[3]);
            OpenGL.glEnable(34336);
            aBoolean6193 = true;
            method2143(34336);
        }
    }

    final void method2139(boolean bool, byte i) {
        int i_0_ = -82 / ((i - -60) / 38);
        anInt6190++;
    }

    public static void method2142(byte i) {
        aStringArray6200 = null;
        int i_1_ = 19 % ((i - -67) / 59);
        aClass74_6201 = null;
        anIntArray6189 = null;
    }

    final boolean method2137(int i) {
        anInt6202++;
        if (i >= -5)
            return false;
        return aBoolean6198;
    }

    final void method2134(boolean bool, boolean bool_2_) {
        aBoolean6197 = bool;
        anInt6191++;
        ((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
        ((Class286) this).aHa_Sub2_3684.method3771((byte) -97,
                aClass258_Sub3_6194);
        ((Class286) this).aHa_Sub2_3684.method3729(34165, (byte) 101, 7681);
        ((Class286) this).aHa_Sub2_3684.method3762(34166, 768, (byte) -87, 0);
        ((Class286) this).aHa_Sub2_3684.method3762(5890, 770, (byte) -87, 2);
        ((Class286) this).aHa_Sub2_3684.method3775(bool_2_, 0, 770, 34168);
        ((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
        method2141(false);
    }

    final void method2143(int i) {
        if (i == 34336) {
            if (aBoolean6193) {
                int i_3_ = ((Class286) this).aHa_Sub2_3684.XA();
                int i_4_ = ((Class286) this).aHa_Sub2_3684.i();
                float f = (float) i_3_ - 0.125F * (float) (-i_4_ + i_3_);
                float f_5_ = (float) i_3_ - 0.25F * (float) (i_3_ - i_4_);
                OpenGL.glProgramLocalParameter4fARB
                        (34336, 0, f_5_, f,
                                1.0F / (float) ((ha_Sub2) (((Class286) this)
                                        .aHa_Sub2_3684)).anInt7848,
                                (float) (((ha_Sub2) ((Class286) this).aHa_Sub2_3684)
                                        .anInt7809) / 255.0F);
                ((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
                ((Class286) this).aHa_Sub2_3684.method3808
                        (((ha_Sub2) ((Class286) this).aHa_Sub2_3684).anInt7806,
                                122);
                ((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
            }
            anInt6184++;
        }
    }

    Class286_Sub1(ha_Sub2 var_ha_Sub2) {
        super(var_ha_Sub2);
        if (((ha_Sub2) ((Class286) this).aHa_Sub2_3684).aBoolean7841) {
            aClass171_6188
                    = (Class50.method459
                    (34336, ((Class286) this).aHa_Sub2_3684,
                            "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n",
                            false));
            aClass171_6196
                    = (Class50.method459
                    (34336, ((Class286) this).aHa_Sub2_3684,
                            "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n",
                            false));
            aClass171_6199
                    = (Class50.method459
                    (34336, ((Class286) this).aHa_Sub2_3684,
                            "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n",
                            false));
            aClass171_6187
                    = (Class50.method459
                    (34336, ((Class286) this).aHa_Sub2_3684,
                            "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n",
                            false));
            if (!(aClass171_6187 != null
                    & (aClass171_6188 != null & aClass171_6196 != null
                    & aClass171_6199 != null)))
                aBoolean6198 = false;
            else {
                aClass258_Sub3_6194
                        = new Class258_Sub3(var_ha_Sub2, 3553, 6406, 2, 1, false,
                        new byte[]{0, -1}, 6406, false);
                aClass258_Sub3_6194.method1965(false, false, 10243);
                aBoolean6198 = true;
            }
        } else
            aBoolean6198 = false;
    }

    final void method2133(int i) {
        if (i > -75)
            method2141(true);
        anInt6186++;
        if (aBoolean6193) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            aBoolean6193 = false;
        }
        ((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
        ((Class286) this).aHa_Sub2_3684.method3771((byte) -97, null);
        ((Class286) this).aHa_Sub2_3684.method3729(8448, (byte) -61, 8448);
        ((Class286) this).aHa_Sub2_3684.method3762(5890, 768, (byte) -87, 0);
        ((Class286) this).aHa_Sub2_3684.method3762(34166, 770, (byte) -87, 2);
        ((Class286) this).aHa_Sub2_3684.method3775(false, 0, 770, 5890);
        ((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
        if (aBoolean6183) {
            ((Class286) this).aHa_Sub2_3684.method3762(5890, 768, (byte) -87,
                    0);
            ((Class286) this).aHa_Sub2_3684.method3775(false, 0, 770, 5890);
            aBoolean6183 = false;
        }
    }

    final void method2136(int i, int i_6_, byte i_7_) {
        anInt6195++;
        if (i_7_ > -42)
            method2139(true, (byte) -81);
    }

    final void method2140(Class258 class258, byte i, int i_8_) {
        if (class258 == null) {
            if (!aBoolean6183) {
                ((Class286) this).aHa_Sub2_3684.method3771
                        ((byte) -114, (((ha_Sub2) ((Class286) this).aHa_Sub2_3684)
                                .aClass258_Sub3_7827));
                ((Class286) this).aHa_Sub2_3684.method3761(0, 1);
                ((Class286) this).aHa_Sub2_3684.method3762(34168, 768,
                        (byte) -87, 0);
                ((Class286) this).aHa_Sub2_3684.method3775(false, 0, 770,
                        34168);
                aBoolean6183 = true;
            }
        } else {
            if (aBoolean6183) {
                ((Class286) this).aHa_Sub2_3684.method3762(5890, 768,
                        (byte) -87, 0);
                ((Class286) this).aHa_Sub2_3684.method3775(false, 0, 770,
                        5890);
                aBoolean6183 = false;
            }
            ((Class286) this).aHa_Sub2_3684.method3771((byte) -105, class258);
            ((Class286) this).aHa_Sub2_3684.method3761(0, i_8_);
        }
        if (i < -89)
            anInt6185++;
    }
}
