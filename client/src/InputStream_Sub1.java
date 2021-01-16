/* InputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.InputStream;

final class InputStream_Sub1 extends InputStream {
    static int anInt71;
    static int anInt72;
    static int anInt73;
    static int anInt74;
    static long[][] aLongArrayArray75;
    static long[] aLongArray76 = new long[11];
    static Class351 aClass351_77;
    static int anInt78;
    static Class114 aClass114_79;

    public static void method124(int i) {
        aLongArrayArray75 = null;
        if (i == 2) {
            aClass351_77 = null;
            aLongArray76 = null;
            aClass114_79 = null;
        }
    }

    static final boolean method125(int i, int i_0_, int i_1_,
                                   Class318_Sub1_Sub4 class318_sub1_sub4,
                                   byte i_2_) {
        anInt72++;
        if (!Class348_Sub40_Sub23.aBoolean9307 || !Class23.aBoolean351)
            return false;
        if ((Class225.anInt2946 ^ 0xffffffff) > -101)
            return false;
        if (!aa_Sub2.method164(i_1_, i_0_, (byte) -97, i))
            return false;
        int i_3_ = i_0_ << Class362.anInt4459;
        int i_4_ = i << Class362.anInt4459;
        if (i_2_ != 120)
            return false;
        int i_5_
                = -1 + aa_Sub1.aSArray5191[i_1_].method3982((byte) -86, i, i_0_);
        int i_6_ = i_5_ + class318_sub1_sub4.method2394(true);
        if (((Class318_Sub1_Sub4) class318_sub1_sub4).aShort8759 == 1) {
            if (!Class286_Sub7.method2169(i_3_, i_3_, i_4_, i_3_,
                    Class270.anInt3465 + i_4_, i_6_,
                    i_6_, i_5_, i_4_, false))
                return false;
            if (!Class286_Sub7.method2169(i_3_, i_3_, i_4_, i_3_,
                    Class270.anInt3465 + i_4_, i_5_,
                    i_6_, i_5_,
                    i_4_ + Class270.anInt3465, false))
                return false;
            Class42.anInt562++;
            return true;
        }
        if (((Class318_Sub1_Sub4) class318_sub1_sub4).aShort8759 == 2) {
            if (!Class286_Sub7.method2169(i_3_, i_3_ - -Class270.anInt3465,
                    i_4_ - -Class270.anInt3465, i_3_,
                    Class270.anInt3465 + i_4_, i_6_,
                    i_6_, i_5_,
                    i_4_ - -Class270.anInt3465, false))
                return false;
            if (!Class286_Sub7.method2169(i_3_, Class270.anInt3465 + i_3_,
                    i_4_ + Class270.anInt3465,
                    Class270.anInt3465 + i_3_,
                    Class270.anInt3465 + i_4_, i_6_,
                    i_5_, i_5_,
                    i_4_ - -Class270.anInt3465, false))
                return false;
            Class42.anInt562++;
            return true;
        }
        if ((((Class318_Sub1_Sub4) class318_sub1_sub4).aShort8759 ^ 0xffffffff)
                == -5) {
            if (!Class286_Sub7.method2169(i_3_ + Class270.anInt3465,
                    Class270.anInt3465 + i_3_, i_4_,
                    Class270.anInt3465 + i_3_,
                    i_4_ - -Class270.anInt3465, i_6_,
                    i_6_, i_5_, i_4_, false))
                return false;
            if (!Class286_Sub7.method2169(i_3_ + Class270.anInt3465,
                    i_3_ - -Class270.anInt3465, i_4_,
                    Class270.anInt3465 + i_3_,
                    i_4_ - -Class270.anInt3465, i_5_,
                    i_6_, i_5_,
                    Class270.anInt3465 + i_4_, false))
                return false;
            Class42.anInt562++;
            return true;
        }
        if ((((Class318_Sub1_Sub4) class318_sub1_sub4).aShort8759 ^ 0xffffffff)
                == -9) {
            if (!Class286_Sub7.method2169(i_3_, Class270.anInt3465 + i_3_,
                    i_4_, i_3_, i_4_, i_6_, i_6_, i_5_,
                    i_4_, false))
                return false;
            if (!Class286_Sub7.method2169(i_3_, i_3_ + Class270.anInt3465,
                    i_4_, Class270.anInt3465 + i_3_,
                    i_4_, i_6_, i_5_, i_5_, i_4_, false))
                return false;
            Class42.anInt562++;
            return true;
        }
        if ((((Class318_Sub1_Sub4) class318_sub1_sub4).aShort8759 ^ 0xffffffff)
                == -17) {
            if (!Class121.method1084(i_6_, Class348_Sub23_Sub2.anInt9037,
                    Class348_Sub23_Sub2.anInt9037 + i_4_,
                    i_3_, i_5_, Class348_Sub23_Sub2.anInt9037,
                    18507))
                return false;
            Class42.anInt562++;
            return true;
        }
        if (((Class318_Sub1_Sub4) class318_sub1_sub4).aShort8759 == 32) {
            if (!Class121.method1084(i_6_, Class348_Sub23_Sub2.anInt9037,
                    Class348_Sub23_Sub2.anInt9037 + i_4_,
                    i_3_ + Class348_Sub23_Sub2.anInt9037,
                    i_5_, Class348_Sub23_Sub2.anInt9037,
                    18507))
                return false;
            Class42.anInt562++;
            return true;
        }
        if (((Class318_Sub1_Sub4) class318_sub1_sub4).aShort8759 == 64) {
            if (!Class121.method1084(i_6_, Class348_Sub23_Sub2.anInt9037, i_4_,
                    Class348_Sub23_Sub2.anInt9037 + i_3_,
                    i_5_, Class348_Sub23_Sub2.anInt9037,
                    18507))
                return false;
            Class42.anInt562++;
            return true;
        }
        if ((((Class318_Sub1_Sub4) class318_sub1_sub4).aShort8759 ^ 0xffffffff)
                == -129) {
            if (!Class121.method1084(i_6_, Class348_Sub23_Sub2.anInt9037, i_4_,
                    i_3_, i_5_, Class348_Sub23_Sub2.anInt9037,
                    18507))
                return false;
            Class42.anInt562++;
            return true;
        }
        return true;
    }

    public final int read() {
        anInt74++;
        Class286_Sub5.method2161((byte) 31, 30000L);
        return -1;
    }

    static final void method126(int i) {
        Class318_Sub1_Sub3_Sub3.method2433();
        anInt73++;
        for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -5; i_7_++)
            Class348_Sub45.aClass361Array7108[i_7_].method3500(700);
        if (i != -16203)
            method125(125, -95, 109, null, (byte) -52);
        Class50_Sub2.method464(-1);
        Class348_Sub18.method2938((byte) 98);
        Class239_Sub12.method1772(28);
        System.gc();
        Class348_Sub8.aHa6654.ya();
    }

    static {
        aLongArrayArray75 = new long[8][256];
        for (int i = 0; i < 256; i++) {
            int i_8_
                    = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886"
                    .charAt(i / 2);
            long l = (long) ((i & 0x1 ^ 0xffffffff) == -1 ? i_8_ >>> 2132006120
                    : 0xff & i_8_);
            long l_9_ = l << 890183233;
            if ((l_9_ ^ 0xffffffffffffffffL) <= -257L)
                l_9_ ^= 0x11dL;
            long l_10_ = l_9_ << -452574655;
            if (l_10_ >= 256L)
                l_10_ ^= 0x11dL;
            long l_11_ = l ^ l_10_;
            long l_12_ = l_10_ << 1539076033;
            if (l_12_ >= 256L)
                l_12_ ^= 0x11dL;
            long l_13_ = l_12_ ^ l;
            aLongArrayArray75[0][i]
                    = (Class277.method2068
                    (l_13_, (Class277.method2068
                            (l_9_ << 807052744,
                                    (Class277.method2068
                                            (l_11_ << 2099756880,
                                                    (Class277.method2068
                                                            (l_12_ << 1422113368,
                                                                    (Class277.method2068
                                                                            (l << 1862868576,
                                                                                    (Class277.method2068
                                                                                            (Class277.method2068(l << 1543848568,
                                                                                                    l << -1922363472),
                                                                                                    l_10_ << -1442666392))))))))))));
            for (int i_14_ = 1; (i_14_ ^ 0xffffffff) > -9; i_14_++)
                aLongArrayArray75[i_14_][i]
                        = Class277.method2068((aLongArrayArray75[i_14_ + -1][i]
                                >>> -2081483448),
                        (aLongArrayArray75[i_14_ - 1][i]
                                << 501233912));
        }
        aLongArray76[0] = 0L;
        for (int i = 1; (i ^ 0xffffffff) >= -11; i++) {
            int i_15_ = -8 + i * 8;
            aLongArray76[i]
                    = (Class105_Sub2.method993
                    ((Class105_Sub2.method993
                                    (Class348_Sub8.method2777(aLongArrayArray75[6][6 + i_15_],
                                            65280L),
                                            (Class105_Sub2.method993
                                                    (Class348_Sub8.method2777((aLongArrayArray75[5]
                                                                    [5 + i_15_]),
                                                            16711680L),
                                                            (Class105_Sub2.method993
                                                                    ((Class105_Sub2.method993
                                                                                    ((Class105_Sub2.method993
                                                                                                    (Class348_Sub8.method2777((aLongArrayArray75[2]
                                                                                                                    [i_15_ + 2]),
                                                                                                            280375465082880L),
                                                                                                            (Class105_Sub2.method993
                                                                                                                    (Class348_Sub8.method2777(71776119061217280L,
                                                                                                                            (aLongArrayArray75[1]
                                                                                                                                    [1 + i_15_])),
                                                                                                                            (Class348_Sub8.method2777
                                                                                                                                    (aLongArrayArray75[0][i_15_],
                                                                                                                                            -72057594037927936L)))))),
                                                                                            Class348_Sub8.method2777(1095216660480L,
                                                                                                    (aLongArrayArray75[3]
                                                                                                            [3 + i_15_])))),
                                                                            Class348_Sub8.method2777((aLongArrayArray75[4]
                                                                                            [i_15_ - -4]),
                                                                                    4278190080L))))))),
                            Class348_Sub8.method2777(aLongArrayArray75[7][7 + i_15_],
                                    255L)));
        }
        aClass351_77 = new Class351(8, 1);
        anInt78 = 0;
        aClass114_79 = new Class114(75, 6);
    }
}
