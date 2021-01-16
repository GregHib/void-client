/* Class348_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class348_Sub22 extends Class348 {
    static int anInt6857;
    static int anInt6858;
    Class318_Sub1_Sub3_Sub3_Sub1 aClass318_Sub1_Sub3_Sub3_Sub1_6859;
    static int anInt6860;
    static int anInt6861;
    static int anInt6862;

    static final Class46 method2957(int i, byte i_0_, int i_1_) {
        anInt6858++;
        Class46 class46 = Class324.method2570(i_0_ + 1512932774, i_1_);
        if (i_0_ != -54)
            method2958(-23, null);
        if ((i ^ 0xffffffff) == 0)
            return class46;
        if (class46 == null || ((Class46) class46).aClass46Array798 == null
                || ((((Class46) class46).aClass46Array798.length ^ 0xffffffff)
                >= (i ^ 0xffffffff)))
            return null;
        return ((Class46) class46).aClass46Array798[i];
    }

    static final int method2958(int i, Class45 class45) {
        anInt6861++;
        int i_2_ = 0;
        if (class45.method421(false, anInt6862))
            i_2_++;
        if (class45.method421(false, Class106.anInt1639))
            i_2_++;
        if (class45.method421(false, Class373_Sub2.anInt7429))
            i_2_++;
        if (class45.method421(false, ha.anInt4562))
            i_2_++;
        if (class45.method421(false, Class82.anInt1435))
            i_2_++;
        if (class45.method421(false, Class115.anInt1756))
            i_2_++;
        if (class45.method421(false, Class291.anInt3739))
            i_2_++;
        if (class45.method421(false, Class86.anInt1481))
            i_2_++;
        if (class45.method421(false, Class239_Sub10.anInt5948))
            i_2_++;
        if (class45.method421(false, Class113.anInt1742))
            i_2_++;
        if (class45.method421(false, Class364.anInt4469))
            i_2_++;
        if (i != 22388)
            return 8;
        if (class45.method421(false, Class348_Sub40_Sub38.anInt9473))
            i_2_++;
        if (class45.method421(false, Class187.anInt2510))
            i_2_++;
        if (class45.method421(false, Class52.anInt4895))
            i_2_++;
        if (class45.method421(false, Class186_Sub1.anInt5814))
            i_2_++;
        if (class45.method421(false, Class5_Sub3.anInt8370))
            i_2_++;
        return i_2_;
    }

    static final void method2959(int i) {
        Class182.aClass346_2449.method2698(14174);
        anInt6860++;
        Class258_Sub4.aClass373_8552.method3592(0);
        Class79.aClient1367.method87((byte) -49);
        Class305.aCanvas3869.setBackground(Color.black);
        Class337.anInt4179 = i;
        Class182.aClass346_2449
                = Class348_Sub3.method2743(Class305.aCanvas3869, (byte) 84);
        Class258_Sub4.aClass373_8552
                = Class348_Sub18.method2941(Class305.aCanvas3869, 0, true);
    }

    Class348_Sub22(Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1) {
        ((Class348_Sub22) this).aClass318_Sub1_Sub3_Sub3_Sub1_6859
                = class318_sub1_sub3_sub3_sub1;
    }
}
