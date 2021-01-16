/* Class258_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class258_Sub2 extends Class258 {
    static long[] aLongArray8530;
    static Class10[] aClass10Array8531 = new Class10[50];
    static String[] aStringArray8532;
    static int anInt8533;
    static int anInt8534;
    private int anInt8535 = -1;
    private int anInt8536 = -1;
    static int anInt8537;
    int anInt8538;

    final void method1961(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        anInt8533++;
        OpenGL.glFramebufferTexture2DEXT(i, i_1_, i_0_,
                this.anInt4859, i_2_);
        if (i_3_ != -1)
            aStringArray8532 = null;
        anInt8536 = i;
        anInt8535 = i_1_;
    }

    Class258_Sub2(ha_Sub2 var_ha_Sub2, int i, int i_4_) {
        super(var_ha_Sub2, 34067, i, i_4_ * (i_4_ * 6), false);
        this.anInt8538 = i_4_;
        this.aHa_Sub2_4851.method3771((byte) -81, this);
        for (int i_5_ = 0; i_5_ < 6; i_5_++)
            OpenGL.glTexImage2Dub(i_5_ + 34069, 0, this.anInt4858,
                    i_4_, i_4_, 0,
                    Class348_Sub9.method2779(true,
                            (this
                                    .anInt4858)),
                    5121, null, 0);
        this.method1957(9728, true);
    }

    public final void method37(int i) {
        OpenGL.glFramebufferTexture2DEXT(anInt8536, anInt8535, 3553, 0, 0);
        anInt8534++;
        anInt8535 = -1;
        if (i != -3022)
            anInt8537 = 60;
        anInt8536 = -1;
    }

    Class258_Sub2(ha_Sub2 var_ha_Sub2, int i, int i_6_, boolean bool,
                  byte[][] is, int i_7_) {
        super(var_ha_Sub2, 34067, i, i_6_ * (i_6_ * 6), bool);
        try {
            this.anInt8538 = i_6_;
            this.aHa_Sub2_4851.method3771((byte) -127, this);
            for (int i_8_ = 0; i_8_ < 6; i_8_++)
                OpenGL.glTexImage2Dub(i_8_ + 34069, 0,
                        this.anInt4858, i_6_, i_6_,
                        0, i_7_, 5121, is[i_8_], 0);
            this.method1957(9728, true);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("q.<init>("
                            + (var_ha_Sub2 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_6_ + ','
                            + bool + ','
                            + (is != null ? "{...}" : "null")
                            + ',' + i_7_ + ')'));
        }
    }

    Class258_Sub2(ha_Sub2 var_ha_Sub2, int i, int i_9_, boolean bool,
                  int[][] is) {
        super(var_ha_Sub2, 34067, i, 6 * i_9_ * i_9_, bool);
        try {
            this.anInt8538 = i_9_;
            this.aHa_Sub2_4851.method3771((byte) -77, this);
            if (bool) {
                for (int i_10_ = 0; i_10_ < 6; i_10_++)
                    Class353.method3460(i_10_ + 34069,
                            this.anInt4858, i_9_,
                            this
                                    .aHa_Sub2_4851.anInt7812,
                            i_9_, is[i_10_], 32993, -83);
            } else {
                for (int i_11_ = 0; i_11_ < 6; i_11_++)
                    OpenGL.glTexImage2Di(i_11_ + 34069, 0,
                            this.anInt4858, i_9_,
                            i_9_, 0, 32993,
                            (this.aHa_Sub2_4851
                                    .anInt7812),
                            is[i_11_], 0);
            }
            this.method1957(9728, true);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("q.<init>("
                            + (var_ha_Sub2 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_9_ + ','
                            + bool + ','
                            + (is != null ? "{...}" : "null")
                            + ')'));
        }
    }

    public static void method1962(int i) {
        aStringArray8532 = null;
        aLongArray8530 = null;
        aClass10Array8531 = null;
        if (i != -1)
            aStringArray8532 = null;
    }
}
