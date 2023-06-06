/* Class14_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class14_Sub2 extends Class14 implements Interface18_Impl2 {
    static int anInt8619;
    static int anInt8620;
    static double aDouble8621;
    static int anInt8622;
    /*synthetic*/ static Class aClass8623;

    Class14_Sub2(Class377 class377, int i, boolean bool, int[][] is) {
        super(class377, 34067, Class108.aClass304_1662, Class68.aClass68_1183, 6 * (i * i), bool);
        try {
            this.aClass377_5082.method3850((byte) -109, this);
            if (bool) {
                for (int i_1_ = 0; i_1_ < 6; i_1_++)
                    this.method233(i, i, is[i_1_], i_1_ + 34069, 255);
            } else {
                for (int i_0_ = 0; i_0_ < 6; i_0_++)
                    OpenGL.glTexImage2Di(34069 + i_0_, 0, this.method228(121), i, i, 0, Class348_Sub40_Sub3.method3055(110, this.aClass304_5084), (this.aClass377_5082.anInt9918), is[i_0_], 0);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("le.<init>(" + (class377 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method243(int i) {
        anInt8620++;
        Class234 class234 = null;
        try {
            Class144 class144 = Class348_Sub23_Sub1.aClass297_8992.method2233((byte) -46, "", true);
            while (class144.anInt1997 == 0) Class286_Sub5.method2161((byte) -122, 1L);
            if (class144.anInt1997 == 1) {
                class234 = (Class234) class144.socket;
                Class348_Sub49 class348_sub49 = Class316.aClass348_Sub51_3959.method3427(24);
                class234.method1658((byte) 114, 0, (class348_sub49.anInt7197), (class348_sub49.aByteArray7154));
            }
        } catch (Exception exception) {
            /* empty */
        }
        do {
            try {
                if (i != 37) aDouble8621 = -0.46512114956219314;
                if (class234 == null) break;
                class234.method1657(false);
            } catch (Exception exception) {
                break;
            }
            break;
        } while (false);
    }

    static final int method244(int i) {
        anInt8622++;
        if ((double) Class75.aFloat1249 == 3.0) return 37;
        if (i != 37) return 11;
        if ((double) Class75.aFloat1249 == 4.0) return 50;
        if ((double) Class75.aFloat1249 == 6.0) return 75;
        if ((double) Class75.aFloat1249 == 8.0) return 100;
        return 200;
    }

    static final boolean method245(int i, int i_2_, int i_3_, byte i_4_) {
        if (i_4_ < 38) return false;
        anInt8619++;
        Interface10 interface10 = (Interface10) r_Sub2.method3297(i, i_2_, i_3_);
        boolean bool = true;
        if (interface10 != null) bool &= Class55.method520(interface10, -1);
        interface10 = ((Interface10) Class177.method1353(i, i_2_, i_3_, (aClass8623 != null ? aClass8623 : (aClass8623 = Interface10.class))));
        if (interface10 != null) bool &= Class55.method520(interface10, -1);
        interface10 = (Interface10) Class348_Sub16_Sub3.method2878(i, i_2_, i_3_);
        if (interface10 != null) bool &= Class55.method520(interface10, -1);
        return bool;
    }
}
