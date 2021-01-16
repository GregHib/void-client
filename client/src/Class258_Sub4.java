/* Class258_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class258_Sub4 extends Class258 {
    static Class373 aClass373_8552;
    static Class138 aClass138_8553;
    static int anInt8554;
    static int anInt8555;
    private final int anInt8556;
    static int[] anIntArray8557 = new int[500];
    static boolean aBoolean8558 = false;
    static int anInt8559;
    static float aFloat8560;

    public final void method37(int i) {
        if (i == -3022)
            anInt8554++;
    }

    Class258_Sub4(ha_Sub2 var_ha_Sub2, int i, int i_0_, byte[] is, int i_1_) {
        super(var_ha_Sub2, 3552, i, i_0_, false);
        try {
            anInt8556 = i_0_;
            this.aHa_Sub2_4851.method3771((byte) -94, this);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glTexImage1Dub(this.anInt4849, 0,
                    this.anInt4858, anInt8556, 0,
                    i_1_, 5121, is, 0);
            OpenGL.glPixelStorei(3317, 4);
            this.method1957(9728, true);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("wha.<init>("
                            + (var_ha_Sub2 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_0_ + ','
                            + (is != null ? "{...}" : "null")
                            + ',' + i_1_ + ')'));
        }
    }

    final void method1972(byte i, boolean bool) {
        this.aHa_Sub2_4851.method3771((byte) -114, this);
        int i_2_ = 59 / ((-49 - i) / 40);
        anInt8555++;
        OpenGL.glTexParameteri(this.anInt4849, 10242,
                !bool ? 33071 : 10497);
    }

    public static void method1973(int i) {
        aClass138_8553 = null;
        aClass373_8552 = null;
        if (i == 24885)
            anIntArray8557 = null;
    }

    static final Class348_Sub13 method1974(byte i, int i_3_, boolean bool) {
        anInt8559++;
        int i_4_ = -43 / ((-65 - i) / 55);
        long l = i_3_ | (bool ? -2147483648 : 0);
        return ((Class348_Sub13)
                Class348_Sub40.aClass356_7041.method3480(l, -6008));
    }

    static {
        aClass138_8553 = new Class138(9, 0, 4, 1);
    }
}
