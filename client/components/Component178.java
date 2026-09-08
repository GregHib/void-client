/* Component178 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component178
/**
 * RENAMED from `Class83` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    AbstractGlTextureSub1 aClass258_Sub1_1440;
    /** Friend list display names (parallel arrays, length {@link DefinitionSub30#friendCount}). */
    static String[] friendNames = new String[200];
    boolean aBoolean1442;
    AbstractGlTextureSub1 aClass258_Sub1_1443 = null;
    GlTexture[] aClass258_Sub3Array1444 = null;
    static int anInt1445;
    AbstractGlTextureSub1 aClass258_Sub1_1446 = null;
    static int anInt1447 = 0;
    GlTexture[] aClass258_Sub3Array1448;

    public static void method815(boolean bool) {
        if (bool != false) method815(true);
        friendNames = null;
    }

    Component178(GlToolkitSub2 var_ha_Sub2) {
        this.aClass258_Sub1_1440 = null;
        this.aClass258_Sub3Array1448 = null;
        this.aBoolean1442 = var_ha_Sub2.aBoolean7831;
        NodeSub37.method3030(8, var_ha_Sub2);
        if (this.aBoolean1442) {
            byte[] is = Cp1252Decoder.unwrapBytes(false, Component244.anObject4177, 53146732);
            this.aClass258_Sub1_1440 = new AbstractGlTextureSub1(var_ha_Sub2, 6410, 128, 128, 16, is, 6410);
            is = Cp1252Decoder.unwrapBytes(false, Component144.anObject3985, 53146732);
            this.aClass258_Sub1_1446 = new AbstractGlTextureSub1(var_ha_Sub2, 6410, 128, 128, 16, is, 6410);
            ReliefShader class188 = var_ha_Sub2.aClass188_7736;
            if (class188.method1414(35632)) {
                is = Cp1252Decoder.unwrapBytes(false, Component14.anObject8592, 53146732);
                this.aClass258_Sub1_1443 = new AbstractGlTextureSub1(var_ha_Sub2, 6408, 128, 128, 16);
                AbstractGlTextureSub1 class258_sub1 = new AbstractGlTextureSub1(var_ha_Sub2, 6409, 128, 128, 16, is, 6409);
                if (!class188.method1413(this.aClass258_Sub1_1443, class258_sub1, -114, 2.0F)) {
                    this.aClass258_Sub1_1443.method1952(-19948);
                    this.aClass258_Sub1_1443 = null;
                } else this.aClass258_Sub1_1443.method1950(-82);
                class258_sub1.method1952(-19948);
            }
        } else {
            this.aClass258_Sub3Array1444 = new GlTexture[16];
            for (int i = 0; i < 16; i++) {
                byte[] is = Component75.method1331((byte) 97, Component244.anObject4177, 2 * (128 * i) * 128, 32768);
                this.aClass258_Sub3Array1444[i] = new GlTexture(var_ha_Sub2, 3553, 6410, 128, 128, true, is, 6410, false);
            }
            this.aClass258_Sub3Array1448 = new GlTexture[16];
            for (int i = 0; i < 16; i++) {
                byte[] is = Component75.method1331((byte) 110, Component144.anObject3985, 2 * i * 16384, 32768);
                this.aClass258_Sub3Array1448[i] = new GlTexture(var_ha_Sub2, 3553, 6410, 128, 128, true, is, 6410, false);
            }
        }
    }
}
