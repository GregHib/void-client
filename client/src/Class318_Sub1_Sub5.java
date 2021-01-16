/* Class318_Sub1_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class318_Sub1_Sub5 extends Class318_Sub1 {
    static Class144 aClass144_8766;
    static int anInt8767;
    static int anInt8768;
    short aShort8769;
    static int anInt8770 = 0;
    static int anInt8771;
    static int anInt8772;
    static boolean aBoolean8773 = false;
    static int anInt8774;
    static int anInt8775 = 2;
    static int anInt8776;
    static int anInt8777;
    static int anInt8778;
    static int anInt8779;
    static int anInt8780 = 0;
    short aShort8781;

    static final int method2483(int i, int i_0_) {
        if (Class239_Sub1.aShortArrayArray5847 != null)
            return Class239_Sub1.aShortArrayArray5847[i][i_0_] & 0xffff;
        return 0;
    }

    final boolean method2378(int i) {
        if (i != 0)
            method2378(29);
        anInt8767++;
        return (Class99.aBooleanArrayArray1572
                [(-Class239_Sub25.anInt6111
                + ((((Class318_Sub1) this).anInt6377 >> Class362.anInt4459)
                - -Class318_Sub1_Sub4_Sub1.anInt10084))]
                [(Class318_Sub1_Sub4_Sub1.anInt10084
                + (-Class285_Sub2.anInt8502
                + (((Class318_Sub1) this).anInt6388
                >> Class362.anInt4459)))]);
    }

    public static void method2484(int i) {
        if (i != 0)
            method2487(-24);
        aClass144_8766 = null;
    }

    static final boolean method2485(int i) {
        anInt8776++;
        if (Class135_Sub2.aClass348_Sub42_Sub12_4846 == null)
            return false;
        if (((((Class348_Sub42_Sub12) Class135_Sub2.aClass348_Sub42_Sub12_4846)
                .anInt9608)
                ^ 0xffffffff)
                <= -2001)
            ((Class348_Sub42_Sub12) Class135_Sub2.aClass348_Sub42_Sub12_4846)
                    .anInt9608
                    -= 2000;
        int i_1_ = -53 % ((-41 - i) / 54);
        if ((((Class348_Sub42_Sub12) Class135_Sub2.aClass348_Sub42_Sub12_4846)
                .anInt9608)
                == 1011)
            return true;
        return false;
    }

    final boolean method2382(byte i) {
        anInt8774++;
        if (i >= -51)
            method2486(-102, 81, -103, -31, -95, -90);
        return Class125.method1110((((Class318_Sub1) this).anInt6388
                        >> Class362.anInt4459),
                this.method2394(true),
                ((Class318_Sub1) this).aByte6376,
                (byte) -79,
                (((Class318_Sub1) this).anInt6377
                        >> Class362.anInt4459));
    }

    final void method2380(ha var_ha, int i, boolean bool,
                          Class318_Sub1 class318_sub1, int i_2_, byte i_3_,
                          int i_4_) {
        try {
            anInt8768++;
            if (i_3_ >= -106)
                method2384(null, 52);
            throw new IllegalStateException();
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("un.N("
                            + (var_ha != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + bool + ','
                            + (class318_sub1 != null ? "{...}"
                            : "null")
                            + ',' + i_2_ + ',' + i_3_ + ','
                            + i_4_ + ')'));
        }
    }

    final boolean method2388(int i) {
        if (i >= -65)
            return false;
        anInt8772++;
        return false;
    }

    final void method2392(boolean bool) {
        if (bool == true) {
            anInt8779++;
            throw new IllegalStateException();
        }
    }

    static final void method2486(int i, int i_5_, int i_6_, int i_7_, int i_8_,
                                 int i_9_) {
        if (i_8_ >= Class369.anInt4960
                && (Class113.anInt1745 ^ 0xffffffff) <= (i_5_ ^ 0xffffffff)
                && (i_9_ ^ 0xffffffff) <= (Class132.anInt1910 ^ 0xffffffff)
                && Class38.anInt513 >= i_7_)
            Class125.method1111(i_7_, i, i_5_, i_8_, i_9_, i_6_);
        else
            Class239_Sub16.method1792(i_9_, i_8_, i_7_, i_5_, (byte) -114,
                    i_6_);
        if (i != 0)
            anInt8780 = 42;
        anInt8777++;
    }

    final int method2384(Class348_Sub1[] class348_sub1s, int i) {
        anInt8771++;
        int i_10_ = 122 % ((-14 - i) / 61);
        return this.method2390(class348_sub1s,
                (((Class318_Sub1) this).anInt6377
                        >> Class362.anInt4459),
                -2,
                (((Class318_Sub1) this).anInt6388
                        >> Class362.anInt4459));
    }

    Class318_Sub1_Sub5(int i, int i_11_, int i_12_, int i_13_, int i_14_,
                       int i_15_, int i_16_) {
        ((Class318_Sub1_Sub5) this).aShort8769 = (short) i_16_;
        ((Class318_Sub1) this).aByte6376 = (byte) i_14_;
        ((Class318_Sub1) this).anInt6382 = i_11_;
        ((Class318_Sub1) this).anInt6377 = i;
        ((Class318_Sub1_Sub5) this).aShort8781 = (short) i_15_;
        ((Class318_Sub1) this).anInt6388 = i_12_;
        ((Class318_Sub1) this).aByte6381 = (byte) i_13_;
    }

    static final Class110_Sub1 method2487(int i) {
        anInt8778++;
        Class348_Sub36.anInt6985 = 0;
        if (i >= -91)
            anInt8775 = -63;
        return Class2.method170(true);
    }
}
