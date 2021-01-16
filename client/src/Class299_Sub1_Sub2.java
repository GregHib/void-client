/* Class299_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class299_Sub1_Sub2 extends Class299_Sub1 {
    static Class348_Sub49 aClass348_Sub49_8698;
    static int anInt8699;
    static int anInt8700;
    private final Class258_Sub2 aClass258_Sub2_8701;
    static int anInt8702;
    static int anInt8703;
    static int anInt8704;
    static int anInt8705;
    static Class351 aClass351_8706 = new Class351(79, 3);
    private ha_Sub2 aHa_Sub2_8707;

    final boolean method2261(Class258_Sub2 class258_sub2, float f, int i,
                             Class258_Sub2 class258_sub2_0_) {
        try {
            anInt8703++;
            boolean bool = true;
            Class206 class206 = aHa_Sub2_8707.aClass206_7778;
            aHa_Sub2_8707.K(Class348_Sub6.anIntArray6635);
            aHa_Sub2_8707.la();
            aHa_Sub2_8707.method3755(-32);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0,
                    aClass258_Sub2_8701.anInt8538,
                    aClass258_Sub2_8701.anInt8538);
            aHa_Sub2_8707.method3807(false, i + -65532);
            aHa_Sub2_8707.method3728(false, i + -65411);
            aHa_Sub2_8707.method3752(114, false);
            aHa_Sub2_8707.method3748(i + -65534, false);
            aHa_Sub2_8707.method3757(-2, -91);
            aHa_Sub2_8707.method3738(-15039, 1);
            aHa_Sub2_8707.method3749(f, 0.0F, 0.0F, (byte) 110, 0.0F);
            aHa_Sub2_8707.method3729(34165, (byte) -115, 34165);
            aHa_Sub2_8707.method3771((byte) -95, class258_sub2_0_);
            aHa_Sub2_8707.method3738(-15039, 0);
            aHa_Sub2_8707.method3761(0, 1);
            aHa_Sub2_8707.method3771((byte) -90, class258_sub2);
            aHa_Sub2_8707.method3773(i ^ ~0xfffe, class206);
            for (int i_1_ = 0; i_1_ < 6; i_1_++) {
                int i_2_ = 34069 + i_1_;
                class206.method1498(0, i + -65591, i_2_, aClass258_Sub2_8701);
                class206.method1503(0, (byte) 3);
                if (class206.method1507(-116)) {
                    OpenGL.glBegin(7);
                    int i_3_ = i_2_;
                    while_101_:
                    do {
                        while_100_:
                        do {
                            while_99_:
                            do {
                                while_98_:
                                do {
                                    do {
                                        if (i_3_ != 34069) {
                                            if (i_3_ != 34070) {
                                                if (i_3_ != 34071) {
                                                    if (i_3_ != 34072) {
                                                        if (i_3_ != 34073) {
                                                            if (i_3_ != 34074)
                                                                break while_101_;
                                                        } else
                                                            break while_99_;
                                                        break while_100_;
                                                    }
                                                } else
                                                    break;
                                                break while_98_;
                                            }
                                        } else {
                                            OpenGL.glTexCoord3i(65535, 65534,
                                                    65534);
                                            OpenGL.glMultiTexCoord3i(33985,
                                                    65535,
                                                    65534,
                                                    65534);
                                            OpenGL.glVertex2f(0.0F, 0.0F);
                                            OpenGL.glTexCoord3i(65535, 65534,
                                                    -65534);
                                            OpenGL.glMultiTexCoord3i(33985,
                                                    65535,
                                                    65534,
                                                    -65534);
                                            OpenGL.glVertex2f(1.0F, 0.0F);
                                            OpenGL.glTexCoord3i(65535, -65534,
                                                    -65534);
                                            OpenGL.glMultiTexCoord3i(33985,
                                                    65535,
                                                    -65534,
                                                    -65534);
                                            OpenGL.glVertex2f(1.0F, 1.0F);
                                            OpenGL.glTexCoord3i(65535, -65534,
                                                    65534);
                                            OpenGL.glMultiTexCoord3i(33985,
                                                    65535,
                                                    -65534,
                                                    65534);
                                            OpenGL.glVertex2f(0.0F, 1.0F);
                                            break while_101_;
                                        }
                                        OpenGL.glTexCoord3i(-65535, 65534,
                                                -65534);
                                        OpenGL.glMultiTexCoord3i(33985, -65535,
                                                65534,
                                                -65534);
                                        OpenGL.glVertex2f(0.0F, 0.0F);
                                        OpenGL.glTexCoord3i(-65535, 65534,
                                                65534);
                                        OpenGL.glMultiTexCoord3i(33985, -65535,
                                                65534, 65534);
                                        OpenGL.glVertex2f(1.0F, 0.0F);
                                        OpenGL.glTexCoord3i(-65535, -65534,
                                                65534);
                                        OpenGL.glMultiTexCoord3i(33985, -65535,
                                                -65534,
                                                65534);
                                        OpenGL.glVertex2f(1.0F, 1.0F);
                                        OpenGL.glTexCoord3i(-65535, -65534,
                                                -65534);
                                        OpenGL.glMultiTexCoord3i(33985, -65535,
                                                -65534,
                                                -65534);
                                        OpenGL.glVertex2f(0.0F, 1.0F);
                                        break while_101_;
                                    } while (false);
                                    OpenGL.glTexCoord3i(-65534, 65535, -65534);
                                    OpenGL.glMultiTexCoord3i(33985, -65534,
                                            65535, -65534);
                                    OpenGL.glVertex2f(0.0F, 0.0F);
                                    OpenGL.glTexCoord3i(65534, 65535, -65534);
                                    OpenGL.glMultiTexCoord3i(33985, 65534,
                                            65535, -65534);
                                    OpenGL.glVertex2f(1.0F, 0.0F);
                                    OpenGL.glTexCoord3i(65534, 65535, 65534);
                                    OpenGL.glMultiTexCoord3i(33985, 65534,
                                            65535, 65534);
                                    OpenGL.glVertex2f(1.0F, 1.0F);
                                    OpenGL.glTexCoord3i(-65534, 65535, 65534);
                                    OpenGL.glMultiTexCoord3i(33985, -65534,
                                            65535, 65534);
                                    OpenGL.glVertex2f(0.0F, 1.0F);
                                    break while_101_;
                                } while (false);
                                OpenGL.glTexCoord3i(-65534, -65535, 65534);
                                OpenGL.glMultiTexCoord3i(33985, -65534, -65535,
                                        65534);
                                OpenGL.glVertex2f(0.0F, 0.0F);
                                OpenGL.glTexCoord3i(65534, -65535, 65534);
                                OpenGL.glMultiTexCoord3i(33985, 65534, -65535,
                                        65534);
                                OpenGL.glVertex2f(1.0F, 0.0F);
                                OpenGL.glTexCoord3i(65534, -65535, -65534);
                                OpenGL.glMultiTexCoord3i(33985, 65534, -65535,
                                        -65534);
                                OpenGL.glVertex2f(1.0F, 1.0F);
                                OpenGL.glTexCoord3i(-65534, -65535, -65534);
                                OpenGL.glMultiTexCoord3i(33985, -65534, -65535,
                                        -65534);
                                OpenGL.glVertex2f(0.0F, 1.0F);
                                break while_101_;
                            } while (false);
                            OpenGL.glTexCoord3i(-65534, 65534, 65535);
                            OpenGL.glMultiTexCoord3i(33985, -65534, 65534,
                                    65535);
                            OpenGL.glVertex2f(0.0F, 0.0F);
                            OpenGL.glTexCoord3i(65534, 65534, 65535);
                            OpenGL.glMultiTexCoord3i(33985, 65534, 65534,
                                    65535);
                            OpenGL.glVertex2f(1.0F, 0.0F);
                            OpenGL.glTexCoord3i(65534, -65534, 65535);
                            OpenGL.glMultiTexCoord3i(33985, 65534, -65534,
                                    65535);
                            OpenGL.glVertex2f(1.0F, 1.0F);
                            OpenGL.glTexCoord3i(-65534, -65534, 65535);
                            OpenGL.glMultiTexCoord3i(33985, -65534, -65534,
                                    65535);
                            OpenGL.glVertex2f(0.0F, 1.0F);
                            break while_101_;
                        } while (false);
                        OpenGL.glTexCoord3i(65534, 65534, -65535);
                        OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                        OpenGL.glVertex2f(0.0F, 0.0F);
                        OpenGL.glTexCoord3i(-65534, 65534, -65535);
                        OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                        OpenGL.glVertex2f(1.0F, 0.0F);
                        OpenGL.glTexCoord3i(-65534, -65534, -65535);
                        OpenGL.glMultiTexCoord3i(33985, -65534, -65534,
                                -65535);
                        OpenGL.glVertex2f(1.0F, 1.0F);
                        OpenGL.glTexCoord3i(65534, -65534, -65535);
                        OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                        OpenGL.glVertex2f(0.0F, 1.0F);
                    } while (false);
                    OpenGL.glEnd();
                } else {
                    bool = false;
                    break;
                }
            }
            class206.method1500(2983, 0);
            aHa_Sub2_8707.method3770(-422613672, class206);
            aHa_Sub2_8707.method3738(i + -80573, 1);
            if (i != 65534)
                return true;
            aHa_Sub2_8707.method3771((byte) -95, null);
            aHa_Sub2_8707.method3729(8448, (byte) 121, 8448);
            aHa_Sub2_8707.method3738(-15039, 0);
            aHa_Sub2_8707.method3771((byte) -88, null);
            OpenGL.glPopAttrib();
            aHa_Sub2_8707.KA(Class348_Sub6.anIntArray6635[0],
                    Class348_Sub6.anIntArray6635[1],
                    Class348_Sub6.anIntArray6635[2],
                    Class348_Sub6.anIntArray6635[3]);
            if (bool && !aHa_Sub2_8707.aBoolean7847)
                aClass258_Sub2_8701.method1950(69);
            return bool;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("qda.L("
                            + (class258_sub2 != null ? "{...}"
                            : "null")
                            + ',' + f + ',' + i + ','
                            + (class258_sub2_0_ != null
                            ? "{...}" : "null")
                            + ')'));
        }
    }

    final Class258_Sub2 method2256(byte i) {
        anInt8700++;
        if (i != -121)
            return null;
        return aClass258_Sub2_8701;
    }

    final int method2262(int i) {
        if (i != 65534)
            aHa_Sub2_8707 = null;
        anInt8699++;
        return aClass258_Sub2_8701.anInt8538;
    }

    static final Class105 method2263(ha var_ha, int i, int i_4_) {
        anInt8705++;
        Class348_Sub15 class348_sub15
                = ((Class348_Sub15)
                Class27.aClass356_389.method3480(i_4_, -6008));
        if (class348_sub15 != null) {
            Class348_Sub23_Sub2 class348_sub23_sub2
                    = class348_sub15.aClass55_Sub1_6768
                    .method506(false);
            class348_sub15.aBoolean6772 = true;
            if (class348_sub23_sub2 != null)
                return class348_sub23_sub2.method2975(var_ha, 0);
        }
        if (i != 0)
            aClass351_8706 = null;
        return null;
    }

    static final void method2264(boolean bool) {
        if (bool != false)
            aClass348_Sub49_8698 = null;
        anInt8704++;
        Class348_Sub42_Sub15 class348_sub42_sub15
                = Class318_Sub9_Sub1.method2516(0, (byte) 105, 15);
        class348_sub42_sub15.method3251(-16058);
    }

    public static void method2265(int i) {
        aClass348_Sub49_8698 = null;
        if (i != -10794)
            aClass351_8706 = null;
        aClass351_8706 = null;
    }

    Class299_Sub1_Sub2(ha_Sub2 var_ha_Sub2, int i) {
        aHa_Sub2_8707 = var_ha_Sub2;
        aClass258_Sub2_8701 = new Class258_Sub2(var_ha_Sub2, 6408, i);
    }
}
