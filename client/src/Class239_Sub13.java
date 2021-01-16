/* Class239_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub13 extends Class239 {
    static int anInt5974;
    static int anInt5975;
    static int anInt5976;
    static int anInt5977;
    static int anInt5978;
    static int anInt5979;
    static int anInt5980 = 0;
    static int anInt5981;

    final int method1776(int i) {
        if (i != -32350) anInt5980 = 42;
        anInt5978++;
        return this.anInt3138;
    }

    final void method1716(boolean bool) {
        if (this.aClass348_Sub51_3136.method3422(674) == Class14_Sub4.aClass230_8638) this.anInt3138 = 2;
        if (bool == false) {
            anInt5974++;
            if (this.anInt3138 < 0 || this.anInt3138 > 2) this.anInt3138 = method1710(20014);
        }
    }

    static final void method1777(int i, Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3) {
        if (i == -3) {
            if (class318_sub1_sub3_sub3 instanceof Class318_Sub1_Sub3_Sub3_Sub1) {
                Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1 = (Class318_Sub1_Sub3_Sub3_Sub1) class318_sub1_sub3_sub3;
                if (class318_sub1_sub3_sub3_sub1.aClass79_10505 != null) Class286_Sub3.method2150(((Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.aByte6381) != (class318_sub1_sub3_sub3_sub1.aByte6381)), false, class318_sub1_sub3_sub3_sub1);
            } else if (class318_sub1_sub3_sub3 instanceof Class318_Sub1_Sub3_Sub3_Sub2) {
                Class318_Sub1_Sub3_Sub3_Sub2 class318_sub1_sub3_sub3_sub2 = ((Class318_Sub1_Sub3_Sub3_Sub2) class318_sub1_sub3_sub3);
                Class348_Sub43.method3298((byte) 105, ((class318_sub1_sub3_sub3_sub2.aByte6381) != (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.aByte6381)), class318_sub1_sub3_sub3_sub2);
            }
            anInt5981++;
        }
    }

    final int method1714(int i, int i_0_) {
        if (i != 3) return 3;
        anInt5979++;
        return 1;
    }

    Class239_Sub13(int i, Class348_Sub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final void method1712(int i, int i_1_) {
        anInt5977++;
        this.anInt3138 = i_1_;
        int i_2_ = -54 / ((82 - i) / 35);
    }

    final int method1710(int i) {
        anInt5975++;
        if (i != 20014) return 70;
        return 1;
    }

    Class239_Sub13(Class348_Sub51 class348_sub51) {
        super(class348_sub51);
    }
}
