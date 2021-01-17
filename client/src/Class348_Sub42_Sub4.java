/* Class348_Sub42_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub42_Sub4 extends Class348_Sub42 {
    static int anInt9510;
    static int anInt9511;
    double aDouble9512;
    static int anInt9513 = 0;
    static int anInt9514;
    static int anInt9515;
    static float aFloat9516;
    static double aDouble9517;
    short[][] aShortArrayArray9518;
    static int[] anIntArray9519 = new int[2];

    static final void method3180(int i, Class46[] class46s, int i_0_) {
        if (i_0_ == 24235) {
            for (int i_1_ = 0; i_1_ < class46s.length; i_1_++) {
                Class46 class46 = class46s[i_1_];
                if (class46 != null && i == class46.anInt834 && !client.method111(class46)) {
                    if (class46.anInt774 == 0) {
                        method3180(class46.anInt830, class46s, 24235);
                        if (class46.aClass46Array798 != null) method3180(class46.anInt830, class46.aClass46Array798, i_0_);
                        Class348_Sub41 class348_sub41 = ((Class348_Sub41) (Class125.aClass356_4915.method3480(class46.anInt830, -6008)));
                        if (class348_sub41 != null) Class75_Sub1.method769(class348_sub41.anInt7050, (byte) 116);
                    }
                    if (class46.anInt774 == 6 && class46.anInt699 != -1) {
                        Class17 class17 = Class10.aClass87_191.method835(class46.anInt699, 7);
                        if (class17 != null) {
                            class46.anInt841 += Class348_Sub51.anInt7267;
                            int i_2_ = class46.anInt795;
                            while (class46.anInt841 > (class17.anIntArray267[class46.anInt795])) {
                                class46.anInt841 -= (class17.anIntArray267[class46.anInt795]);
                                class46.anInt795++;
                                if (class46.anInt795 >= (class17.anIntArray237).length) {
                                    class46.anInt795 -= class17.anInt238;
                                    if (class46.anInt795 < 0 || (class46.anInt795 >= (class17.anIntArray237).length)) class46.anInt795 = 0;
                                }
                                class46.anInt730 = 1 + class46.anInt795;
                                if (class46.anInt730 >= class17.anIntArray237.length) {
                                    class46.anInt730 -= class17.anInt238;
                                    if (class46.anInt730 < 0 || ((class17.anIntArray237).length <= class46.anInt730)) class46.anInt730 = -1;
                                }
                                Class251.method1916(-9343, class46);
                            }
                            if (i_2_ != class46.anInt795) Class264.method2017((class46.anInt795), class17, 98);
                        }
                    }
                }
            }
            anInt9514++;
        }
    }

    public static void method3181(byte i) {
        if (i != 2) anInt9511 = 63;
        anIntArray9519 = null;
    }

    final long method3182(int i) {
        if (i < 76) anInt9515 = 111;
        anInt9510++;
        return (this.aShortArrayArray9518).length << 0 | (this.aShortArrayArray9518[0]).length;
    }

    Class348_Sub42_Sub4(short[][] is, double d) {
        this.aDouble9512 = d;
        this.aShortArrayArray9518 = is;
    }
}
