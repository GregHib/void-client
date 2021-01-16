/* Class111 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

final class Class111 {
    private int anInt1715;
    static int anInt1716;
    static int anInt1717;
    private Class45 aClass45_1718;
    static int anInt1719;
    static int anInt1720 = -1;
    static int anInt1721;
    static Class114 aClass114_1722 = new Class114(8, -2);
    static int anInt1723;
    private int[][] anIntArrayArray1724;
    private boolean[] aBooleanArray1725;

    final Class287 method1043(int i, byte i_0_) {
        anInt1721++;
        byte[] is = aClass45_1718.method410(-1860, 1, i);
        if (i_0_ < 12)
            return null;
        Class287 class287 = new Class287();
        class287.method2183(new Class348_Sub49(is), 21890);
        return class287;
    }

    final boolean method1044(int i) {
        if (i < 15)
            anIntArrayArray1724 = null;
        anInt1717++;
        if ((anInt1715 ^ 0xffffffff) == 0)
            return false;
        return true;
    }

    static final int method1045(int i, int i_1_, int i_2_, int i_3_, int i_4_,
                                int i_5_, byte i_6_) {
        i_5_ &= 0x3;
        anInt1716++;
        if ((i_2_ & 0x1 ^ 0xffffffff) == -2) {
            int i_7_ = i_3_;
            i_3_ = i_1_;
            i_1_ = i_7_;
        }
        if (i_5_ == 0)
            return i_4_;
        if (i_6_ != 16)
            return -78;
        if (i_5_ == 1)
            return 7 + -i - i_3_ - -1;
        if ((i_5_ ^ 0xffffffff) == -3)
            return -i_4_ + 7 - -1 - i_1_;
        return i;
    }

    final int[] method1046(int i, int i_8_) {
        anInt1719++;
        if (i < 0
                || (i ^ 0xffffffff) <= (anIntArrayArray1724.length ^ 0xffffffff)) {
            if (anInt1715 == -1)
                return new int[0];
            return new int[]{anInt1715};
        }
        if (!aBooleanArray1725[i]
                || (anIntArrayArray1724[i].length ^ 0xffffffff) >= -2)
            return anIntArrayArray1724[i];
        int i_9_ = i_8_ == (anInt1715 ^ 0xffffffff) ? 0 : 1;
        Random random = new Random();
        int[] is = new int[anIntArrayArray1724[i].length];
        Class214.method1578(anIntArrayArray1724[i], 0, is, 0, is.length);
        for (int i_10_ = i_9_; is.length > i_10_; i_10_++) {
            int i_11_ = i_9_ + Class124.method1097((byte) 80, is.length - i_9_,
                    random);
            int i_12_ = is[i_10_];
            is[i_10_] = is[i_11_];
            is[i_11_] = i_12_;
        }
        return is;
    }

    public static void method1047(int i) {
        if (i != 1)
            anInt1720 = 93;
        aClass114_1722 = null;
    }

    static final void method1048(Class46 class46, int i) {
        anInt1723++;
        int i_13_ = 113 % ((-25 - i) / 59);
        Class46 class46_14_ = Class237.method1687(class46, 3);
        int i_15_;
        int i_16_;
        if (class46_14_ != null) {
            i_15_ = ((Class46) class46_14_).anInt789;
            i_16_ = ((Class46) class46_14_).anInt709;
        } else {
            i_15_ = Class348_Sub42_Sub8_Sub2.anInt10432;
            i_16_ = Class321.anInt4017;
        }
        Class239_Sub28.method1843(i_16_, -326, class46, false, i_15_);
        Class14_Sub1.method239((byte) -114, i_16_, i_15_, class46);
    }

    Class111(Class230 class230, int i, Class45 class45) {
        try {
            aClass45_1718 = class45;
            aClass45_1718.method407(0, 1);
            Class348_Sub49 class348_sub49
                    = new Class348_Sub49(aClass45_1718.method410(-1860, 0, 0));
            int i_17_ = class348_sub49.method3387(255);
            if ((i_17_ ^ 0xffffffff) < -4) {
                anIntArrayArray1724 = new int[0][];
                aBooleanArray1725 = new boolean[0];
                anInt1715 = -1;
            } else {
                int i_18_ = class348_sub49.method3387(255);
                Class223[] class223s = Class19.method285(-122);
                boolean bool = true;
                if ((i_18_ ^ 0xffffffff) == (class223s.length ^ 0xffffffff)) {
                    for (int i_19_ = 0;
                         ((i_19_ ^ 0xffffffff)
                                 > (class223s.length ^ 0xffffffff));
                         i_19_++) {
                        int i_20_ = class348_sub49.method3387(255);
                        if (i_20_ != ((Class223) class223s[i_19_]).anInt2896) {
                            bool = false;
                            break;
                        }
                    }
                } else
                    bool = false;
                if (!bool) {
                    aBooleanArray1725 = new boolean[0];
                    anIntArrayArray1724 = new int[0][];
                    anInt1715 = -1;
                } else {
                    int i_21_ = class348_sub49.method3387(255);
                    int i_22_ = class348_sub49.method3387(255);
                    if (i_17_ > 2)
                        anInt1715 = class348_sub49.method3372(13638);
                    else
                        anInt1715 = -1;
                    anIntArrayArray1724 = new int[i_22_ - -1][];
                    aBooleanArray1725 = new boolean[i_22_ + 1];
                    for (int i_23_ = 0; i_21_ > i_23_; i_23_++) {
                        int i_24_ = class348_sub49.method3387(255);
                        aBooleanArray1725[i_24_]
                                = class348_sub49.method3387(255) == 1;
                        int i_25_ = class348_sub49.method3330(842397944);
                        if ((anInt1715 ^ 0xffffffff) == 0) {
                            anIntArrayArray1724[i_24_] = new int[i_25_];
                            for (int i_26_ = 0;
                                 (i_26_ ^ 0xffffffff) > (i_25_ ^ 0xffffffff);
                                 i_26_++)
                                anIntArrayArray1724[i_24_][i_26_]
                                        = class348_sub49.method3330(842397944);
                        } else {
                            anIntArrayArray1724[i_24_] = new int[1 + i_25_];
                            anIntArrayArray1724[i_24_][0] = anInt1715;
                            for (int i_27_ = 0;
                                 (i_27_ ^ 0xffffffff) > (i_25_ ^ 0xffffffff);
                                 i_27_++)
                                anIntArrayArray1724[i_24_][1 + i_27_]
                                        = class348_sub49.method3330(842397944);
                        }
                    }
                    for (int i_28_ = 0; i_22_ + 1 > i_28_; i_28_++) {
                        if (anIntArrayArray1724[i_28_] == null) {
                            if (anInt1715 != -1)
                                anIntArrayArray1724[i_28_]
                                        = new int[]{anInt1715};
                            else
                                anIntArrayArray1724[i_28_] = new int[0];
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("mt.<init>("
                            + (class230 != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (class45 != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }
}
