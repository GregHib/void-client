/* ShaderProgramSub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class ShaderProgramSub7
/**
 * RENAMED from `Class286_Sub7` (JODE-obfuscated).
 * Evidence: subclass of ShaderProgram (hierarchy)
 */ extends ShaderProgram {
    static CacheStore aClass45_6277;
    private final Component178 aClass83_6278;
    static int anInt6279;
    static int anInt6280;
    static int anInt6281;
    static int anInt6282;
    static int anInt6283;
    private Component128 aClass61_6284;
    private AbstractGlTextureSub4 aClass258_Sub4_6285;
    static int anInt6286;
    static int anInt6287;
    static int anInt6288;
    static boolean aBoolean6289;
    static int[] anIntArray6290 = new int[2048];
    static int anInt6291;

    static final void method2165(boolean bool, String string) {
        anInt6287++;
        if (string != null) {
            if (string.startsWith("*")) string = string.substring(1);
            String string_0_ = DebugPanicSub1.method2127(2, string);
            if (string_0_ != null) {
                for (int i = 0; (DefinitionSub30.friendCount > i); i++) {
                    String string_1_ = Component178.friendNames[i];
                    if (string_1_.startsWith("*")) string_1_ = string_1_.substring(1);
                    string_1_ = DebugPanicSub1.method2127(2, string_1_);
                    if (string_1_ != null && string_1_.equals(string_0_)) {
                        DefinitionSub30.friendCount--;
                        for (int i_2_ = i; i_2_ < DefinitionSub30.friendCount; i_2_++) {
                            Component178.friendNames[i_2_] = Component178.friendNames[i_2_ - -1];
                            ShaderProgramSub2.friendFormerNames[i_2_] = ShaderProgramSub2.friendFormerNames[1 + i_2_];
                            GraphicsToolkit.friendWorldIds[i_2_] = GraphicsToolkit.friendWorldIds[i_2_ - -1];
                            DebugPanic.friendWorldNames[i_2_] = DebugPanic.friendWorldNames[1 + i_2_];
                            Component16.friendRanks[i_2_] = Component16.friendRanks[i_2_ - -1];
                            DisplayModeManagerContainer145.friendReferred[i_2_] = DisplayModeManagerContainer145.friendReferred[1 + i_2_];
                        }
                        Component380.anInt4985 = ResourceLoader.anInt3918;
                        HashNodeSub7.anInt9540++;
                        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(Component186.aClass351_4394, (DisplayModeManagerContainer64.aClass77_9029), -99);
                        class348_sub47.particleBuffer.writeByte(false, Component31.method1745(string, -65));
                        class348_sub47.particleBuffer.writeString((byte) -5, string);
                        HashNodeSub14.enqueueOutboundPacket(117, class348_sub47);
                        break;
                    }
                }
                if (bool != true) aBoolean6289 = true;
            }
        }
    }

    final void method2136(int i, int i_3_, byte i_4_) {
        if (i_4_ >= -42) aClass258_Sub4_6285 = null;
        if ((0x1 & i) == 1) {
            if (aClass83_6278.aBoolean1442) {
                this.aHa_Sub2_3684.bindTexture((byte) -83, aClass83_6278.aClass258_Sub1_1440);
                Component214.aFloatArray2131[2] = 0.0F;
                Component214.aFloatArray2131[3] = (float) ((this.aHa_Sub2_3684.anInt7735) % 4000) / 4000.0F;
                Component214.aFloatArray2131[0] = 0.0F;
                Component214.aFloatArray2131[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, Component214.aFloatArray2131, 0);
            } else {
                int i_5_ = (16 * (this.aHa_Sub2_3684.anInt7735 % 4000) / 4000);
                this.aHa_Sub2_3684.bindTexture((byte) -95, aClass83_6278.aClass258_Sub3Array1444[i_5_]);
            }
        } else if (aClass83_6278.aBoolean1442) {
            this.aHa_Sub2_3684.bindTexture((byte) -126, (aClass83_6278.aClass258_Sub1_1440));
            Component214.aFloatArray2131[0] = 0.0F;
            Component214.aFloatArray2131[2] = 0.0F;
            Component214.aFloatArray2131[1] = 0.0F;
            Component214.aFloatArray2131[3] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, Component214.aFloatArray2131, 0);
        } else this.aHa_Sub2_3684.bindTexture((byte) -110, aClass83_6278.aClass258_Sub3Array1444[0]);
        anInt6291++;
    }

    final void method2134(boolean bool, boolean bool_6_) {
        if (this.aHa_Sub2_3684.anInt7782 > 0) {
            float f = -0.5F / (float) (this.aHa_Sub2_3684.anInt7782);
            this.aHa_Sub2_3684.glActiveTexture(-15039, 1);
            Component214.aFloatArray2131[3] = 0.25F + (this.aHa_Sub2_3684.aFloat7792) * f;
            Component214.aFloatArray2131[0] = 0.0F;
            Component214.aFloatArray2131[2] = f;
            Component214.aFloatArray2131[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, Component214.aFloatArray2131, 0);
            OpenGL.glPopMatrix();
            this.aHa_Sub2_3684.method3744((float) this.aHa_Sub2_3684.anInt7782, 770, 0.5F);
            this.aHa_Sub2_3684.bindTexture((byte) -99, aClass258_Sub4_6285);
            this.aHa_Sub2_3684.glActiveTexture(-15039, 0);
        }
        anInt6286++;
        aClass61_6284.callDisplayList('\0', 28666);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        if (bool_6_ == false) {
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        }
    }

    public static void method2166(int i) {
        if (i == 6336) {
            aClass45_6277 = null;
            anIntArray6290 = null;
        }
    }

    private final void method2167(int i) {
        aClass61_6284 = new Component128(this.aHa_Sub2_3684, 2);
        anInt6283++;
        aClass61_6284.beginDisplayList((byte) 109, 0);
        this.aHa_Sub2_3684.glActiveTexture(i + 6366, 1);
        this.aHa_Sub2_3684.glTexEnvi(7681, (byte) 98, 260);
        this.aHa_Sub2_3684.glTexEnvCombine(34168, 768, (byte) -87, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        this.aHa_Sub2_3684.glActiveTexture(-15039, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (aClass83_6278.aBoolean1442) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        aClass61_6284.endDisplayList(-1);
        aClass61_6284.beginDisplayList((byte) 117, 1);
        this.aHa_Sub2_3684.glActiveTexture(-15039, 1);
        if (i != -21405) method2137(-18);
        this.aHa_Sub2_3684.glTexEnvi(8448, (byte) -115, 8448);
        this.aHa_Sub2_3684.glTexEnvCombine(5890, 768, (byte) -87, 0);
        OpenGL.glDisable(3168);
        this.aHa_Sub2_3684.glActiveTexture(-15039, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (aClass83_6278.aBoolean1442) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        aClass61_6284.endDisplayList(i + 21404);
    }

    ShaderProgramSub7(GlToolkitSub2 var_ha_Sub2, Component178 class83) {
        super(var_ha_Sub2);
        try {
            aClass83_6278 = class83;
            method2167(-21405);
            aClass258_Sub4_6285 = new AbstractGlTextureSub4(this.aHa_Sub2_3684, 6406, 2, new byte[]{0, -1}, 6406);
            aClass258_Sub4_6285.method1972((byte) -91, false);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("tn.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + (class83 != null ? "{...}" : "null") + ')'));
        }
    }

    final boolean method2137(int i) {
        anInt6288++;
        if (i > -5) return true;
        return true;
    }

    static final void method2168(int i, int i_7_, int i_8_) {
        Component186 class357 = Component335.aClass357ArrayArrayArray2029[i][i_7_][i_8_];
        if (class357 != null) {
            Component191.method1376(class357.aClass318_Sub1_Sub5_4395);
            Component191.method1376(class357.aClass318_Sub1_Sub5_4407);
            if (class357.aClass318_Sub1_Sub5_4395 != null) class357.aClass318_Sub1_Sub5_4395 = null;
            if (class357.aClass318_Sub1_Sub5_4407 != null) class357.aClass318_Sub1_Sub5_4407 = null;
        }
    }

    final void method2133(int i) {
        aClass61_6284.callDisplayList('\001', 28666);
        anInt6282++;
        if (this.aHa_Sub2_3684.anInt7782 > 0) {
            this.aHa_Sub2_3684.glActiveTexture(-15039, 1);
            this.aHa_Sub2_3684.bindTexture((byte) -115, null);
            this.aHa_Sub2_3684.method3744(0.0F, 770, 1.0F);
            this.aHa_Sub2_3684.glActiveTexture(-15039, 0);
        }
        if (i > -75) aClass258_Sub4_6285 = null;
        this.aHa_Sub2_3684.glTexEnvi(8448, (byte) 102, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    final void method2140(AbstractGlTexture class258, byte i, int i_9_) {
        if (i < -89) anInt6280++;
    }

    static final boolean method2169(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, boolean bool) {
        anInt6281++;
        if (!DisplayModeManagerContainer56.method1422(i_16_, i_11_, i, -7596)) return false;
        i_16_ = ShaderLinker.anIntArray10172[1];
        i = ShaderLinker.anIntArray10172[0];
        i_11_ = ShaderLinker.anIntArray10172[2];
        if (!DisplayModeManagerContainer56.method1422(i_15_, i_17_, i_10_, -7596)) return false;
        i_10_ = ShaderLinker.anIntArray10172[0];
        i_17_ = ShaderLinker.anIntArray10172[2];
        i_15_ = ShaderLinker.anIntArray10172[1];
        if (!DisplayModeManagerContainer56.method1422(i_14_, i_13_, i_12_, -7596)) return false;
        i_13_ = ShaderLinker.anIntArray10172[2];
        if (bool != false) return false;
        i_14_ = ShaderLinker.anIntArray10172[1];
        i_12_ = ShaderLinker.anIntArray10172[0];
        return DefinitionSub29.method3125(i_12_, i_16_, i_10_, i_13_, i_17_, (byte) -76, i_15_, i_11_, i, i_14_);
    }

    final void method2139(boolean bool, byte i) {
        this.aHa_Sub2_3684.glTexEnvi(260, (byte) -94, 8448);
        anInt6279++;
        int i_18_ = 107 % ((-60 - i) / 38);
    }
}
