/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class34 {
    static int anInt462;
    static Class60 aClass60_463 = new Class60(8);
    private final int[] anIntArray464 = {-1, -1, -1, -1, -1};
    private short[] aShortArray465;
    static int anInt466;
    static int anInt467;
    static int anInt468;
    static int anInt469;
    static int anInt470;
    static int anInt471;
    private int[] anIntArray472;
    static int anInt473;
    private short[] aShortArray474;
    Class150 aClass150_475;
    static Frame aFrame476;
    private short[] aShortArray477;
    static int anInt478;
    static int anInt479;
    private short[] aShortArray480;
    static int anInt481;
    static long aLong482 = -1L;

    final Class124 method341(int i) {
        anInt468++;
        if (anIntArray472 == null) return null;
        Class124[] class124s = new Class124[anIntArray472.length];
        synchronized (this.aClass150_475.aClass45_2054) {
            for (int i_0_ = 0; i_0_ < anIntArray472.length; i_0_++)
                class124s[i_0_] = Class300.method2277(0, (this.aClass150_475.aClass45_2054), anIntArray472[i_0_], -1);
        }
        for (int i_1_ = 0; anIntArray472.length > i_1_; i_1_++) {
            if (class124s[i_1_].anInt1830 < 13) class124s[i_1_].method1092(2, 113);
        }
        Class124 class124;
        if (class124s.length != 1) class124 = new Class124(class124s, class124s.length);
        else class124 = class124s[0];
        if (class124 == null) return null;
        if (i < 53) method341(-22);
        if (aShortArray474 != null) {
            for (int i_2_ = 0; i_2_ < aShortArray474.length; i_2_++)
                class124.method1098(aShortArray474[i_2_], (byte) 126, aShortArray480[i_2_]);
        }
        if (aShortArray465 != null) {
            for (int i_3_ = 0; i_3_ < aShortArray465.length; i_3_++)
                class124.method1095(aShortArray465[i_3_], 0, aShortArray477[i_3_]);
        }
        return class124;
    }

    final boolean method342(byte i) {
        anInt470++;
        boolean bool = true;
        synchronized (this.aClass150_475.aClass45_2054) {
            for (int i_4_ = 0; i_4_ < 5; i_4_++) {
                if (anIntArray464[i_4_] != -1 && !this.aClass150_475.aClass45_2054.method420(-10499, anIntArray464[i_4_], 0)) bool = false;
            }
            if (i <= 87) method351(96);
        }
        return bool;
    }

    final Class124 method343(byte i) {
        anInt471++;
        Class124[] class124s = new Class124[5];
        int i_5_ = 0;
        synchronized (this.aClass150_475.aClass45_2054) {
            for (int i_6_ = 0; i_6_ < 5; i_6_++) {
                if (anIntArray464[i_6_] != -1) class124s[i_5_++] = Class300.method2277(0, (this.aClass150_475.aClass45_2054), anIntArray464[i_6_], -1);
            }
        }
        for (int i_7_ = 0; i_7_ < 5; i_7_++) {
            if (class124s[i_7_] != null && class124s[i_7_].anInt1830 < 13) class124s[i_7_].method1092(2, 99);
        }
        if (i > -27) return null;
        Class124 class124 = new Class124(class124s, i_5_);
        if (aShortArray474 != null) {
            for (int i_8_ = 0; aShortArray474.length > i_8_; i_8_++)
                class124.method1098(aShortArray474[i_8_], (byte) 126, aShortArray480[i_8_]);
        }
        if (aShortArray465 != null) {
            for (int i_9_ = 0; aShortArray465.length > i_9_; i_9_++)
                class124.method1095(aShortArray465[i_9_], 0, aShortArray477[i_9_]);
        }
        return class124;
    }

    private final void method344(int i, Class348_Sub49 class348_sub49, byte i_10_) {
        if (i != 1) {
            if (i == 2) {
                int i_11_ = class348_sub49.readUnsignedByte(i_10_ + 320);
                anIntArray472 = new int[i_11_];
                for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
                    anIntArray472[i_12_] = class348_sub49.readUnsignedShort(842397944);
            } else if (i != 3) {
                if (i == 40) {
                    int i_13_ = class348_sub49.readUnsignedByte(i_10_ ^ ~0xbf);
                    aShortArray480 = new short[i_13_];
                    aShortArray474 = new short[i_13_];
                    for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
                        aShortArray474[i_14_] = (short) class348_sub49.readUnsignedShort(842397944);
                        aShortArray480[i_14_] = (short) class348_sub49.readUnsignedShort(842397944);
                    }
                } else if (i == 41) {
                    int i_15_ = class348_sub49.readUnsignedByte(255);
                    aShortArray465 = new short[i_15_];
                    aShortArray477 = new short[i_15_];
                    for (int i_16_ = 0; i_15_ > i_16_; i_16_++) {
                        aShortArray465[i_16_] = (short) class348_sub49.readUnsignedShort(i_10_ + 842398009);
                        aShortArray477[i_16_] = (short) class348_sub49.readUnsignedShort(842397944);
                    }
                } else if (i >= 60 && i < 70) anIntArray464[i + -60] = class348_sub49.readUnsignedShort(842397944);
            }
        } else class348_sub49.readUnsignedByte(i_10_ + 320);
        anInt479++;
        if (i_10_ != -65) aLong482 = -90L;
    }

    static final void method345(int i, byte i_17_) {
        anInt469++;
        if (Class348_Sub43.anInt7068 == 0) Class98.aClass348_Sub16_Sub3_1564.method2861(0, i);
        else Class58.anInt1059 = i;
        if (i_17_ > -26) method349(-111);
    }

    final void method346(int i, Class348_Sub49 class348_sub49) {
        anInt467++;
        for (; ; ) {
            int i_18_ = class348_sub49.readUnsignedByte(255);
            if (i_18_ == 0) break;
            method344(i_18_, class348_sub49, (byte) -65);
        }
        int i_19_ = -5 / ((73 - i) / 49);
    }

    static final void method347(int[] is, int[] is_20_, int i, int i_21_, int i_22_) {
        do {
            try {
                anInt473++;
                if (i_21_ != -22222) aClass60_463 = null;
                if (i >= i_22_) break;
                int i_23_ = (i - -i_22_) / 2;
                int i_24_ = i;
                int i_25_ = is[i_23_];
                is[i_23_] = is[i_22_];
                is[i_22_] = i_25_;
                int i_26_ = is_20_[i_23_];
                is_20_[i_23_] = is_20_[i_22_];
                is_20_[i_22_] = i_26_;
                int i_27_ = i_25_ == 2147483647 ? 0 : 1;
                for (int i_28_ = i; i_28_ < i_22_; i_28_++) {
                    if (is[i_28_] < (i_28_ & i_27_) + i_25_) {
                        int i_29_ = is[i_28_];
                        is[i_28_] = is[i_24_];
                        is[i_24_] = i_29_;
                        int i_30_ = is_20_[i_28_];
                        is_20_[i_28_] = is_20_[i_24_];
                        is_20_[i_24_++] = i_30_;
                    }
                }
                is[i_22_] = is[i_24_];
                is[i_24_] = i_25_;
                is_20_[i_22_] = is_20_[i_24_];
                is_20_[i_24_] = i_26_;
                method347(is, is_20_, i, -22222, -1 + i_24_);
                method347(is, is_20_, i_24_ - -1, i_21_, i_22_);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("ic.K(" + (is != null ? "{...}" : "null") + ',' + (is_20_ != null ? "{...}" : "null") + ',' + i + ',' + i_21_ + ',' + i_22_ + ')'));
            }
            break;
        } while (false);
    }

    final boolean method348(byte i) {
        anInt478++;
        if (i != 34) method348((byte) -15);
        if (anIntArray472 == null) return true;
        boolean bool = true;
        synchronized (this.aClass150_475.aClass45_2054) {
            for (int i_31_ = 0; anIntArray472.length > i_31_; i_31_++) {
                if (!this.aClass150_475.aClass45_2054.method420(-10499, anIntArray472[i_31_], 0)) bool = false;
            }
        }
        return bool;
    }

    static final void method349(int i) {
        anInt462++;
        int i_32_ = Class328_Sub1.anInt6513;
        int[] is = Class286_Sub7.anIntArray6290;
        for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
            Player player = Class294.aPlayerArray5058[is[i_33_]];
            if (player != null) Class322.method2556(false, player.method2436((byte) 60), player);
        }
        if (i != 4740) method347(null, null, 79, -21, 64);
    }

    static final void method350(int i, int i_34_, int i_35_, int i_36_, int i_37_) {
        anInt466++;
        Class348_Sub42_Sub15 class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i_36_, (byte) 105, 10);
        class348_sub42_sub15.method3246(-25490);
        class348_sub42_sub15.anInt9651 = i_34_;
        int i_38_ = 112 % ((i_35_ - 76) / 44);
        class348_sub42_sub15.anInt9650 = i_37_;
        class348_sub42_sub15.anInt9652 = i;
    }

    public Class34() {
        /* empty */
    }

    public static void method351(int i) {
        aClass60_463 = null;
        int i_39_ = 90 / ((i - 19) / 43);
        aFrame476 = null;
    }

    static {
        anInt481 = -1;
    }
}
