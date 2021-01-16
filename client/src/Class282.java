/* Class282 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282 {
    static int anInt3651;
    static boolean aBoolean3652;
    static int anInt3653;
    static Class356 aClass356_3654;
    static int anInt3655 = 0;

    static final void method2109(int i) {
        anInt3653++;
        Class348_Sub42_Sub18 class348_sub42_sub18 = ((Class348_Sub42_Sub18) Class348_Sub40_Sub17.aClass262_9240.method1995(4));
        if (i != 512) method2110(-125, 79, 70);
        for (/**/; class348_sub42_sub18 != null; class348_sub42_sub18 = (Class348_Sub42_Sub18) Class348_Sub40_Sub17.aClass262_9240.method1990((byte) 56)) {
            Class318_Sub1_Sub3_Sub5 class318_sub1_sub3_sub5 = (class348_sub42_sub18.aClass318_Sub1_Sub3_Sub5_9682);
            if (Class367_Sub11.anInt7396 > class318_sub1_sub3_sub5.anInt10392) {
                class348_sub42_sub18.method2715((byte) 101);
                class318_sub1_sub3_sub5.method2472(-2159);
            } else if ((class318_sub1_sub3_sub5.anInt10411) <= Class367_Sub11.anInt7396) {
                class318_sub1_sub3_sub5.method2474((byte) 121);
                if ((class318_sub1_sub3_sub5.anInt10412) > 0) {
                    Class348_Sub22 class348_sub22 = ((Class348_Sub22) (aClass356_3654.method3480(-1 + class318_sub1_sub3_sub5.anInt10412, -6008)));
                    if (class348_sub22 != null) {
                        Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1 = (class348_sub22.aClass318_Sub1_Sub3_Sub3_Sub1_6859);
                        if ((class318_sub1_sub3_sub3_sub1.anInt6377) >= 0 && (Class367_Sub4.anInt7319 * 512 > class318_sub1_sub3_sub3_sub1.anInt6377) && (class318_sub1_sub3_sub3_sub1.anInt6388) >= 0 && (512 * Class348_Sub40_Sub3.anInt9109 > class318_sub1_sub3_sub3_sub1.anInt6388))
                            class318_sub1_sub3_sub5.method2471((byte) -103, ((Class275.method2064(class318_sub1_sub3_sub3_sub1.anInt6377, (class318_sub1_sub3_sub5.aByte6381), 11219, class318_sub1_sub3_sub3_sub1.anInt6388)) + -class318_sub1_sub3_sub5.anInt10366), class318_sub1_sub3_sub3_sub1.anInt6388, Class367_Sub11.anInt7396, class318_sub1_sub3_sub3_sub1.anInt6377);
                    }
                }
                if ((class318_sub1_sub3_sub5.anInt10412) < 0) {
                    int i_0_ = -(class318_sub1_sub3_sub5.anInt10412) - 1;
                    Class318_Sub1_Sub3_Sub3_Sub2 class318_sub1_sub3_sub3_sub2;
                    if (i_0_ == Class348_Sub42_Sub11.anInt9591) class318_sub1_sub3_sub3_sub2 = Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907;
                    else class318_sub1_sub3_sub3_sub2 = (Class294.aClass318_Sub1_Sub3_Sub3_Sub2Array5058[i_0_]);
                    if (class318_sub1_sub3_sub3_sub2 != null && (class318_sub1_sub3_sub3_sub2.anInt6377) >= 0 && ((class318_sub1_sub3_sub3_sub2.anInt6377) < 512 * Class367_Sub4.anInt7319) && (class318_sub1_sub3_sub3_sub2.anInt6388) >= 0 && (class318_sub1_sub3_sub3_sub2.anInt6388) < 512 * Class348_Sub40_Sub3.anInt9109)
                        class318_sub1_sub3_sub5.method2471((byte) -103, ((Class275.method2064((class318_sub1_sub3_sub3_sub2.anInt6377), (class318_sub1_sub3_sub5.aByte6381), 11219, (class318_sub1_sub3_sub3_sub2.anInt6388))) - class318_sub1_sub3_sub5.anInt10366), (class318_sub1_sub3_sub3_sub2.anInt6388), Class367_Sub11.anInt7396, (class318_sub1_sub3_sub3_sub2.anInt6377));
                }
                class318_sub1_sub3_sub5.method2475((byte) 75, Class348_Sub51.anInt7267);
                Class89.method850(class318_sub1_sub3_sub5, true);
            }
        }
    }

    static final Class318_Sub1_Sub2 method2110(int i, int i_1_, int i_2_) {
        Class357 class357 = Class147.aClass357ArrayArrayArray2029[i][i_1_][i_2_];
        if (class357 == null) return null;
        Class318_Sub1_Sub2 class318_sub1_sub2 = class357.aClass318_Sub1_Sub2_4408;
        class357.aClass318_Sub1_Sub2_4408 = null;
        Class183.method1376(class318_sub1_sub2);
        return class318_sub1_sub2;
    }

    public static void method2111(byte i) {
        aClass356_3654 = null;
        if (i <= 56) method2111((byte) -49);
    }

    static final boolean method2112(int i, int i_3_) {
        anInt3651++;
        if (i <= 121) return false;
        return i_3_ == 3 || i_3_ == 4;
    }

    static {
        aClass356_3654 = new Class356(64);
    }
}
