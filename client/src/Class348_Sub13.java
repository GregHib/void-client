/* Class348_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub13 extends Class348 {
    static int anInt6754;
    static int anInt6755;
    static int anInt6756;
    int[] anIntArray6757 = {-1};
    int[] anIntArray6758 = new int[1];
    static boolean aBoolean6759 = true;

    static final void method2801
            (int i, int i_0_, int i_1_, int i_2_, int i_3_,
             Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3, byte i_4_) {
        int i_5_ = 1 / ((i_4_ - 6) / 48);
        anInt6754++;
        aa_Sub2.method165(class318_sub1_sub3_sub3.aByte6381,
                i_2_, i, i_3_,
                class318_sub1_sub3_sub3.anInt6377,
                0,
                class318_sub1_sub3_sub3.anInt6388,
                (byte) 110, i_0_, i_1_);
    }

    private final long method2802(int[] is, int i, boolean bool, int[] is_6_,
                                  byte i_7_) {
        try {
            anInt6755++;
            long[] ls = Class348_Sub40_Sub21.aLongArray9283;
            long l = -1L;
            l = (ls[(int) (0xffL & (l ^ (long) (i >> -134478552)))]
                    ^ l >>> -612505656);
            l = ls[(int) (0xffL & (l ^ (long) i))] ^ l >>> 2087460680;
            for (int i_8_ = 0;
                 is_6_.length > i_8_; i_8_++) {
                l = (ls[(int) (0xffL
                        & (l ^ (long) (is_6_[i_8_] >> 1458625336)))]
                        ^ l >>> -1571777848);
                l = (l >>> 29428872
                        ^ ls[(int) (0xffL
                        & (l ^ (long) (is_6_[i_8_] >> 1682481232)))]);
                l = l >>> 710000776 ^ ls[(int) ((l ^ (long) (is_6_[i_8_]
                        >> 367092488))
                        & 0xffL)];
                l = (ls[(int) (((long) is_6_[i_8_] ^ l) & 0xffL)]
                        ^ l >>> -874221624);
            }
            if (i_7_ != -74)
                this.anIntArray6757 = null;
            if (is != null) {
                for (int i_9_ = 0; i_9_ < 5; i_9_++)
                    l = l >>> 65979848 ^ ls[(int) ((l ^ (long) is[i_9_])
                            & 0xffL)];
            }
            l = (ls[(int) (0xffL & ((long) (!bool ? 0 : 1) ^ l))]
                    ^ l >>> -637577400);
            return l;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("ie.C("
                            + (is != null ? "{...}" : "null")
                            + ',' + i + ',' + bool + ','
                            + (is_6_ != null ? "{...}"
                            : "null")
                            + ',' + i_7_ + ')'));
        }
    }

    final Class64 method2803(Class17 class17, Class154 class154, int i,
                             int i_10_, int i_11_, int i_12_, int i_13_,
                             ha var_ha, boolean bool, int i_14_) {
        try {
            anInt6756++;
            Class64 class64 = null;
            int i_15_ = i_13_;
            Class225 class225 = null;
            if (i != -1)
                class225 = Class64_Sub3.aClass261_5558.method1983(i, 32);
            int[] is = this.anIntArray6757;
            if (class225 != null
                    && class225.anIntArray2906 != null) {
                is = new int[class225.anIntArray2906.length];
                for (int i_16_ = 0;
                     (i_16_ < class225.anIntArray2906.length);
                     i_16_++) {
                    int i_17_ = class225.anIntArray2906[i_16_];
                    if (i_17_ >= 0
                            && i_17_ < this.anIntArray6757.length)
                        is[i_16_]
                                = this.anIntArray6757[i_17_];
                    else
                        is[i_16_] = -1;
                }
            }
            boolean bool_18_ = false;
            boolean bool_19_ = false;
            boolean bool_20_ = false;
            boolean bool_21_ = false;
            int i_22_ = -1;
            int i_23_ = -1;
            int i_24_ = 0;
            Class348_Sub42_Sub17 class348_sub42_sub17 = null;
            Class348_Sub42_Sub17 class348_sub42_sub17_25_ = null;
            if (class17 != null) {
                i_22_ = class17.anIntArray237[i_10_];
                i_15_ |= 0x20;
                int i_26_ = i_22_ >>> -253639728;
                class348_sub42_sub17
                        = Class10.aClass87_191.method839(i_26_, i_14_ + 4);
                i_22_ &= 0xffff;
                if (class348_sub42_sub17 != null) {
                    bool_19_ |= class348_sub42_sub17.method3272(i_22_, 0);
                    bool_18_ |= class348_sub42_sub17.method3271(i_22_, 14);
                    bool_21_
                            |= class348_sub42_sub17.method3267((byte) -112, i_22_);
                    bool_20_ |= class17.aBoolean242;
                }
                if ((class17.aBoolean241 || Class28.aBoolean5002)
                        && i_12_ != -1
                        && class17.anIntArray237.length > i_12_) {
                    i_23_ = class17.anIntArray237[i_12_];
                    i_24_ = class17.anIntArray267[i_10_];
                    int i_27_ = i_23_ >>> -1808250608;
                    i_23_ &= 0xffff;
                    if (i_27_ == i_26_)
                        class348_sub42_sub17_25_ = class348_sub42_sub17;
                    else
                        class348_sub42_sub17_25_
                                = Class10.aClass87_191
                                .method839(i_23_ >>> -35683280, 3);
                    if (class348_sub42_sub17_25_ != null) {
                        bool_19_
                                |= class348_sub42_sub17_25_.method3272(i_23_, 0);
                        bool_18_
                                |= class348_sub42_sub17_25_.method3271(i_23_, 14);
                        bool_21_
                                |= class348_sub42_sub17_25_.method3267((byte) -118,
                                i_23_);
                    }
                }
                if (bool_19_)
                    i_15_ |= 0x80;
                if (bool_18_)
                    i_15_ |= 0x100;
                if (bool_20_)
                    i_15_ |= 0x200;
                if (bool_21_)
                    i_15_ |= 0x400;
            }
            long l
                    = method2802((class154 != null
                            ? class154.anIntArray2095 : null),
                    i, bool, is, (byte) -74);
            if (Class202.aClass60_2671 != null)
                class64
                        = (Class64) Class202.aClass60_2671.method583(l,
                        i_14_ ^ 0x56);
            if (class64 == null
                    || var_ha.method3667(class64.ua(), i_15_) != 0) {
                if (class64 != null)
                    i_15_ = var_ha.method3679(i_15_, class64.ua());
                int i_28_ = i_15_;
                boolean bool_29_ = false;
                for (int i_30_ = 0; is.length > i_30_; i_30_++) {
                    if (is[i_30_] != -1
                            && !Exception_Sub1.aClass255_112.method1940
                            (-91, is[i_30_]).method1565(bool, -1))
                        bool_29_ = true;
                }
                if (bool_29_)
                    return null;
                Class124[] class124s = new Class124[is.length];
                for (int i_31_ = 0;
                     i_31_ < is.length;
                     i_31_++) {
                    if (is[i_31_] != -1)
                        class124s[i_31_]
                                = Exception_Sub1.aClass255_112.method1940
                                (Class348_Sub21.method2955(i_14_, -112),
                                        is[i_31_])
                                .method1558(bool, false);
                }
                if (class225 != null
                        && class225.anIntArrayArray2939 != null) {
                    for (int i_32_ = 0;
                         (class225.anIntArrayArray2939.length > i_32_);
                         i_32_++) {
                        if ((class225.anIntArrayArray2939[i_32_]
                                != null)
                                && class124s[i_32_] != null) {
                            int i_33_ = (class225
                                    .anIntArrayArray2939[i_32_][0]);
                            int i_34_ = (class225
                                    .anIntArrayArray2939[i_32_][1]);
                            int i_35_ = (class225
                                    .anIntArrayArray2939[i_32_][2]);
                            int i_36_ = (class225
                                    .anIntArrayArray2939[i_32_][3]);
                            int i_37_ = (class225
                                    .anIntArrayArray2939[i_32_][4]);
                            int i_38_ = (class225
                                    .anIntArrayArray2939[i_32_][5]);
                            if (i_36_ != 0 || i_37_ != 0
                                    || i_38_ != 0)
                                class124s[i_32_].method1107(6875, i_37_, i_38_,
                                        i_36_);
                            if (i_33_ != 0 || i_34_ != 0 || i_35_ != 0)
                                class124s[i_32_].method1099((byte) -91, i_35_,
                                        i_33_, i_34_);
                        }
                    }
                }
                if (class154 != null)
                    i_28_ |= 0x4000;
                Class124 class124 = new Class124(class124s, class124s.length);
                class64 = var_ha.method3625(class124, i_28_,
                        Class348_Sub42_Sub1.anInt9488, 64,
                        850);
                if (class154 != null) {
                    for (int i_39_ = 0; i_39_ < 5; i_39_++) {
                        for (int i_40_ = 0;
                             i_40_ < (Class367_Sub2
                                     .aShortArrayArrayArray7290).length;
                             i_40_++) {
                            if (class154.anIntArray2095[i_39_] < (Class367_Sub2.aShortArrayArrayArray7290
                                    [i_40_][i_39_]).length)
                                class64.ia((Class136.aShortArrayArray4791
                                                [i_40_][i_39_]),
                                        (Class367_Sub2
                                                .aShortArrayArrayArray7290[i_40_]
                                                [i_39_]
                                                [(class154
                                                .anIntArray2095[i_39_])]));
                        }
                    }
                }
                if (Class202.aClass60_2671 != null) {
                    class64.s(i_15_);
                    Class202.aClass60_2671.method582(class64, l, (byte) -128);
                }
            }
            if (class17 == null || class348_sub42_sub17 == null)
                return class64;
            Class64 class64_41_ = class64.method614((byte) 1, i_15_, true);
            class64_41_.method617(i_22_, i_24_, class348_sub42_sub17_25_, 0,
                    class348_sub42_sub17, false,
                    class17.aBoolean242, i_23_,
                    i_11_ + i_14_);
            return class64_41_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("ie.B(" + (class17 != null ? "{...}" : "null") + ','
                                    + (class154 != null ? "{...}" : "null") + ',' + i + ','
                                    + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ','
                                    + (var_ha != null ? "{...}" : "null") + ',' + bool
                                    + ',' + i_14_ + ')'));
        }
    }

    public Class348_Sub13() {
        /* empty */
    }
}
