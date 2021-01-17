/* Class223 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class223 {
    static Class221 aClass221_2893;
    static int anInt2894;
    static boolean aBoolean2895 = false;
    int anInt2896;
    static int anInt2897;
    static int anInt2898;
    static int[] anIntArray2899;
    static int[][] anIntArrayArray2900;

    public static void method1612(byte i) {
        anIntArray2899 = null;
        if (i != -9) method1614(-47, null, -126, -99, 117, null, null, 90);
        anIntArrayArray2900 = null;
        aClass221_2893 = null;
    }

    public final String toString() {
        anInt2894++;
        throw new IllegalStateException();
    }

    static final boolean method1613(boolean bool, int i, int i_0_) {
        if (bool != false) method1612((byte) -104);
        anInt2897++;
        return (i_0_ & 0x22) != 0;
    }

    Class223(int i, int i_1_) {
        this.anInt2896 = i_1_;
    }

    static final void method1614(int i, Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1, int i_2_, int i_3_, int i_4_, Class318_Sub1_Sub3_Sub3_Sub2 class318_sub1_sub3_sub3_sub2, Class51 class51, int i_5_) {
        try {
            anInt2898++;
            if (i != 979190089) aBoolean2895 = false;
            Class348_Sub9 class348_sub9 = new Class348_Sub9();
            class348_sub9.anInt6678 = i_4_ << 9;
            class348_sub9.anInt6693 = i_2_;
            class348_sub9.anInt6689 = i_3_ << 9;
            if (class51 == null) {
                if (class318_sub1_sub3_sub3_sub1 != null) {
                    class348_sub9.aClass318_Sub1_Sub3_Sub3_Sub1_6691 = class318_sub1_sub3_sub3_sub1;
                    Class79 class79 = (class318_sub1_sub3_sub3_sub1.aClass79_10505);
                    if (class79.anIntArray1377 != null) {
                        class348_sub9.aBoolean6684 = true;
                        class79 = class79.method794((Class318_Sub1_Sub3_Sub3.aClass170_10209), i ^ ~0x3a5d4149);
                    }
                    if (class79 != null) {
                        class348_sub9.anInt6698 = (i_4_ + class79.anInt1399 << 9);
                        class348_sub9.anInt6687 = (i_3_ - -class79.anInt1399 << 9);
                        class348_sub9.anInt6685 = Class8.method214(class318_sub1_sub3_sub3_sub1, -1);
                        class348_sub9.anInt6696 = class79.anInt1340;
                        class348_sub9.anInt6694 = class79.anInt1392 << 9;
                        class348_sub9.anInt6677 = class79.anInt1356;
                        class348_sub9.anInt6681 = class79.anInt1363;
                        class348_sub9.aBoolean6674 = class79.aBoolean1370;
                    }
                    client.aClass262_5185.method1999(class348_sub9, i + -979210269);
                } else if (class318_sub1_sub3_sub3_sub2 != null) {
                    class348_sub9.aClass318_Sub1_Sub3_Sub3_Sub2_6679 = class318_sub1_sub3_sub3_sub2;
                    class348_sub9.anInt6698 = (class318_sub1_sub3_sub3_sub2.method2436((byte) 74) + i_4_) << 9;
                    class348_sub9.anInt6687 = (class318_sub1_sub3_sub3_sub2.method2436((byte) 86) + i_3_) << 9;
                    class348_sub9.anInt6685 = Class315.method2357(-1, class318_sub1_sub3_sub3_sub2);
                    class348_sub9.anInt6681 = 256;
                    class348_sub9.anInt6694 = (class318_sub1_sub3_sub3_sub2.anInt10553 << 9);
                    class348_sub9.anInt6677 = class318_sub1_sub3_sub3_sub2.anInt10558;
                    class348_sub9.anInt6696 = 256;
                    class348_sub9.aBoolean6674 = class318_sub1_sub3_sub3_sub2.aBoolean10517;
                    Class348_Sub42_Sub16_Sub2.aClass356_10465.method3483((byte) 65, class318_sub1_sub3_sub3_sub2.anInt10290, class348_sub9);
                }
            } else {
                class348_sub9.aClass51_6695 = class51;
                int i_6_ = class51.anInt961;
                int i_7_ = class51.anInt926;
                if (i_5_ == 1 || i_5_ == 3) {
                    i_6_ = class51.anInt926;
                    i_7_ = class51.anInt961;
                }
                class348_sub9.anInt6687 = i_7_ + i_3_ << 9;
                class348_sub9.anInt6680 = class51.anInt962;
                class348_sub9.anInt6685 = class51.anInt887;
                class348_sub9.anInt6681 = class51.anInt916;
                class348_sub9.anIntArray6697 = class51.anIntArray904;
                class348_sub9.anInt6696 = class51.anInt878;
                class348_sub9.aBoolean6699 = class51.aBoolean903;
                class348_sub9.anInt6694 = class51.anInt889 << 9;
                class348_sub9.anInt6668 = class51.anInt937;
                class348_sub9.anInt6698 = i_6_ + i_4_ << 9;
                class348_sub9.anInt6677 = class51.anInt936;
                class348_sub9.aBoolean6674 = class51.aBoolean888;
                if (class51.anIntArray945 != null) {
                    class348_sub9.aBoolean6684 = true;
                    class348_sub9.method2781((byte) 21);
                }
                if (class348_sub9.anIntArray6697 != null) class348_sub9.anInt6670 = (class348_sub9.anInt6680 - -(int) ((double) (-class348_sub9.anInt6680 + class348_sub9.anInt6668) * Math.random()));
                Class218.aClass262_2859.method1999(class348_sub9, -20180);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("ad.B(" + i + ',' + (class318_sub1_sub3_sub3_sub1 != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + (class318_sub1_sub3_sub3_sub2 != null ? "{...}" : "null") + ',' + (class51 != null ? "{...}" : "null") + ',' + i_5_ + ')'));
        }
    }

    static {
        aClass221_2893 = new Class221();
        anIntArray2899 = new int[13];
        anIntArrayArray2900 = new int[128][128];
    }
}
