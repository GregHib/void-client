/* Class348_Sub40_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub21 extends Class348_Sub40 {
    private int anInt9266 = 0;
    static int anInt9267;
    static int anInt9268;
    private int anInt9269 = 2048;
    static int anInt9270;
    static int anInt9271;
    static int anInt9272;
    static int anInt9273;
    static Class223 aClass223_9274;
    static String[] aStringArray9275 = new String[100];
    private int anInt9276 = 4096;
    private int anInt9277;
    private int anInt9278 = 0;
    private int anInt9279 = 12288;
    static int anInt9280;
    private int anInt9281;
    static int anInt9282;
    static long[] aLongArray9283;

    final int[] method3042(int i, int i_0_) {
        anInt9267++;
        int[] is = this.aClass191_7032.method1433(0, i);
        if (i_0_ != 255) method3108(-114, -119, -89);
        if (this.aClass191_7032.aBoolean2570) {
            int i_1_ = -2048 + Class239_Sub18.anIntArray6035[i];
            for (int i_2_ = 0; (i_2_ < Class348_Sub40_Sub6.anInt9139); i_2_++) {
                int i_3_ = -2048 + Class318_Sub6.anIntArray6432[i_2_];
                int i_4_ = i_3_ - -anInt9269;
                i_4_ = i_4_ < -2048 ? 4096 + i_4_ : i_4_;
                i_4_ = i_4_ <= 2048 ? i_4_ : -4096 + i_4_;
                int i_5_ = anInt9278 + i_1_;
                i_5_ = i_5_ < -2048 ? i_5_ - -4096 : i_5_;
                i_5_ = i_5_ <= 2048 ? i_5_ : i_5_ - 4096;
                int i_6_ = i_3_ - -anInt9266;
                i_6_ = i_6_ < -2048 ? i_6_ + 4096 : i_6_;
                i_6_ = i_6_ > 2048 ? i_6_ - 4096 : i_6_;
                int i_7_ = anInt9281 + i_1_;
                i_7_ = i_7_ < -2048 ? i_7_ - -4096 : i_7_;
                i_7_ = i_7_ > 2048 ? -4096 + i_7_ : i_7_;
                is[i_2_] = (method3108(i_5_, 9619, i_4_) || method3105(i_7_, -7981, i_6_)) ? 4096 : 0;
            }
        }
        return is;
    }

    final void method3044(int i) {
        anInt9272++;
        if (i <= 108) method3042(69, 74);
        Class220.method1605(26188);
    }

    private final boolean method3105(int i, int i_8_, int i_9_) {
        anInt9273++;
        int i_10_ = (i_9_ + i) * anInt9279 >> 706529164;
        int i_11_ = Class127.anIntArray4654[(i_10_ * 255 & 0xfff2f) >> -1918018836];
        if (i_8_ != -7981) anInt9266 = -52;
        i_11_ = (i_11_ << -1990692532) / anInt9279;
        i_11_ = (i_11_ << -200932500) / anInt9277;
        i_11_ = i_11_ * anInt9276 >> 395676524;
        return i_11_ > i + -i_9_ && -i_9_ + i > -i_11_;
    }

    public static void method3106(byte i) {
        aLongArray9283 = null;
        aStringArray9275 = null;
        aClass223_9274 = null;
        int i_12_ = 69 % ((19 - i) / 41);
    }

    final void method3049(Class348_Sub49 class348_sub49, int i, int i_13_) {
        anInt9268++;
        if (i_13_ != 31015) method3042(72, 12);
        int i_14_ = i;
        while_183_:
        do {
            while_182_:
            do {
                while_181_:
                do {
                    while_180_:
                    do {
                        while_179_:
                        do {
                            do {
                                if (i_14_ == 0) {
                                    anInt9269 = class348_sub49.method3330(842397944);
                                    return;
                                } else if (i_14_ != 1) {
                                    if (i_14_ != 2) {
                                        if (i_14_ != 3) {
                                            if (i_14_ != 4) {
                                                if (i_14_ != 5) {
                                                    if (i_14_ == 6) break while_182_;
                                                    break while_183_;
                                                }
                                            } else break while_180_;
                                            break while_181_;
                                        }
                                    } else break;
                                    break while_179_;
                                }
                                anInt9278 = class348_sub49.method3330(842397944);
                                return;
                            } while (false);
                            anInt9266 = class348_sub49.method3330(842397944);
                            return;
                        } while (false);
                        anInt9281 = class348_sub49.method3330(842397944);
                        return;
                    } while (false);
                    anInt9279 = class348_sub49.method3330(842397944);
                    return;
                } while (false);
                anInt9276 = class348_sub49.method3330(842397944);
                return;
            } while (false);
            anInt9277 = class348_sub49.method3330(842397944);
        } while (false);
    }

    static final long method3107(byte i, Interface10 interface10, int i_15_, int i_16_) {
        anInt9270++;
        long l = 4194304L;
        long l_17_ = -9223372036854775808L;
        Class51 class51 = Class348_Sub40_Sub12.aClass263_9195.method2005(0, interface10.method42(-107));
        long l_18_ = interface10.method39(-14) << -810638610 | (i_16_ | i_15_ << 409106119) | interface10.method41(-32228) << -1876485644 | 0x40000000;
        if (class51.anInt874 == 0) l_18_ |= l_17_;
        if (class51.anInt895 == 1) l_18_ |= l;
        int i_19_ = 57 % ((-24 - i) / 57);
        l_18_ |= (long) interface10.method42(-102) << 1771513312;
        return l_18_;
    }

    private final boolean method3108(int i, int i_20_, int i_21_) {
        if (i_20_ != 9619) return true;
        anInt9271++;
        int i_22_ = anInt9279 * (i - i_21_) >> -613325908;
        int i_23_ = Class127.anIntArray4654[(0xff530 & 255 * i_22_) >> -1766956564];
        i_23_ = (i_23_ << 1313955820) / anInt9279;
        i_23_ = (i_23_ << -1206741460) / anInt9277;
        i_23_ = anInt9276 * i_23_ >> -30765876;
        return i_23_ > i_21_ - -i && -i_23_ < i + i_21_;
    }

    public Class348_Sub40_Sub21() {
        super(0, true);
        anInt9277 = 8192;
        anInt9281 = 2048;
    }

    static {
        aClass223_9274 = new Class223(5, 1);
        anInt9280 = 0;
        aLongArray9283 = new long[256];
        for (int i = 0; i < 256; i++) {
            long l = i;
            for (int i_24_ = 0; i_24_ < 8; i_24_++) {
                if ((0x1L & l) == 1L) l = ~0x3693a86a2878f0bdL ^ l >>> 2032730177;
                else l >>>= 1;
            }
            aLongArray9283[i] = l;
        }
    }
}
