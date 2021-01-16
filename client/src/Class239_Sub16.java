/* Class239_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub16 extends Class239 {
    static int anInt6007;
    static int anInt6008;
    static int anInt6009;
    static int anInt6010;
    static int anInt6011;
    static int anInt6012 = 1;
    static int anInt6013;
    static int anInt6014;
    static int anInt6015;
    static int anInt6016;
    static int anInt6017;

    static final String method1788(byte i, long l) {
        try {
            anInt6016++;
            if (l <= 0L || l >= 6582952005840035281L)
                return null;
            if (l % 37L == 0L)
                return null;
            int i_0_ = 0;
            long l_1_ = l;
            int i_2_ = -20 % ((i - -6) / 62);
            for (/**/; l_1_ != 0L; l_1_ /= 37L)
                i_0_++;
            StringBuffer stringbuffer = new StringBuffer(i_0_);
            while (l != 0) {
                long l_3_ = l;
                l /= 37L;
                char c = Class48.aCharArray852[(int) (l_3_ + -(37L * l))];
                if (c == 95) {
                    int i_4_ = stringbuffer.length() + -1;
                    stringbuffer.setCharAt
                            (i_4_,
                                    Character.toUpperCase(stringbuffer.charAt(i_4_)));
                    c = '\u00a0';
                }
                stringbuffer.append(c);
            }
            stringbuffer.reverse();
            stringbuffer
                    .setCharAt(0, Character.toUpperCase(stringbuffer.charAt(0)));
            return stringbuffer.toString();
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    "sba.F(" + i + ',' + l + ')');
        }
    }

    final int method1714(int i, int i_5_) {
        if (i != 3)
            anInt6012 = -22;
        anInt6014++;
        if (i_5_ == 0
                || this.aClass348_Sub51_3136
                .aClass239_Sub9_7256.method1759(i ^ ~0x7e5e) == 1)
            return 1;
        return 2;
    }

    final void method1716(boolean bool) {
        if (bool != false)
            anInt6012 = 46;
        if (this.anInt3138 != 0
                && this.aClass348_Sub51_3136
                .aClass239_Sub9_7256.method1759(-32350) != 1)
            this.anInt3138 = 0;
        anInt6007++;
        if (this.anInt3138 < 0
                || this.anInt3138 > 1)
            this.anInt3138 = method1710(20014);
    }

    final int method1789(int i) {
        if (i != -32350)
            anInt6008 = 32;
        anInt6017++;
        return this.anInt3138;
    }

    Class239_Sub16(Class348_Sub51 class348_sub51) {
        super(class348_sub51);
    }

    final void method1712(int i, int i_6_) {
        anInt6011++;
        int i_7_ = -19 / ((i - 82) / 35);
        this.anInt3138 = i_6_;
    }

    final boolean method1790(int i) {
        if (i < 85)
            anInt6012 = -109;
        anInt6015++;
        return true;
    }

    Class239_Sub16(int i, Class348_Sub51 class348_sub51) {
        super(i, class348_sub51);
    }

    static final void method1791
            (int i, int[] is, int i_8_,
             Class318_Sub1_Sub3_Sub3_Sub2 class318_sub1_sub3_sub3_sub2) {
        do {
            try {
                anInt6009++;
                if ((class318_sub1_sub3_sub3_sub2
                        .anIntArray10236)
                        != null) {
                    boolean bool = true;
                    for (int i_9_ = 0;
                         (class318_sub1_sub3_sub3_sub2.anIntArray10236.length
                                 > i_9_);
                         i_9_++) {
                        if ((class318_sub1_sub3_sub3_sub2
                                .anIntArray10236[i_9_]) != is[i_9_]) {
                            bool = false;
                            break;
                        }
                    }
                    if (bool && class318_sub1_sub3_sub3_sub2.anInt10286 != -1) {
                        Class17 class17
                                = (Class10.aClass87_191.method835
                                (class318_sub1_sub3_sub3_sub2.anInt10286,
                                        7));
                        int i_10_ = class17.anInt248;
                        if (i_10_ == 1) {
                            class318_sub1_sub3_sub3_sub2.anInt10232
                                    = 0;
                            class318_sub1_sub3_sub3_sub2.anInt10267
                                    = 0;
                            class318_sub1_sub3_sub3_sub2.anInt10294
                                    = 0;
                            class318_sub1_sub3_sub3_sub2.anInt10218
                                    = i_8_;
                            class318_sub1_sub3_sub3_sub2.anInt10244
                                    = 1;
                            if (!class318_sub1_sub3_sub3_sub2.aBoolean10309)
                                Class287.method2178
                                        (class318_sub1_sub3_sub3_sub2,
                                                class318_sub1_sub3_sub3_sub2.anInt10267,
                                                class17, i ^ ~0x5df4);
                        }
                        if (i_10_ == 2)
                            class318_sub1_sub3_sub3_sub2.anInt10294
                                    = 0;
                    }
                }
                boolean bool = true;
                if (i != 23946)
                    method1791(126, null, -73, null);
                for (int i_11_ = 0;
                     is.length > i_11_;
                     i_11_++) {
                    if (is[i_11_] != -1)
                        bool = false;
                    if (class318_sub1_sub3_sub3_sub2.anIntArray10236 == null
                            || (class318_sub1_sub3_sub3_sub2
                            .anIntArray10236[i_11_]) == -1
                            || (Class10.aClass87_191.method835
                            ((class318_sub1_sub3_sub3_sub2
                                            .anIntArray10236[i_11_]),
                                    7).anInt239 <= (Class10.aClass87_191
                            .method835(is[i_11_], i ^ 0x5d8d)
                            .anInt239))) {
                        class318_sub1_sub3_sub3_sub2.anInt10218
                                = i_8_;
                        class318_sub1_sub3_sub3_sub2.anIntArray10236
                                = is;
                        break;
                    }
                }
                if (!bool)
                    break;
                class318_sub1_sub3_sub3_sub2
                        .anIntArray10236
                        = is;
                class318_sub1_sub3_sub3_sub2
                        .anInt10218
                        = i_8_;
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929
                        (runtimeexception,
                                ("sba.E(" + i + ','
                                        + (is != null ? "{...}" : "null") + ',' + i_8_
                                        + ','
                                        + (class318_sub1_sub3_sub3_sub2 != null ? "{...}"
                                        : "null")
                                        + ')'));
            }
            break;
        } while (false);
    }

    final int method1710(int i) {
        if (i != 20014)
            method1789(40);
        anInt6010++;
        return 1;
    }

    static final void method1792(int i, int i_12_, int i_13_, int i_14_,
                                 byte i_15_, int i_16_) {
        anInt6013++;
        int i_17_
                = Class85.method831(Class38.anInt513, i, Class132.anInt1910, -90);
        int i_18_ = Class85.method831(Class38.anInt513, i_13_,
                Class132.anInt1910, -94);
        int i_19_ = Class85.method831(Class113.anInt1745, i_12_,
                Class369.anInt4960, 77);
        int i_20_ = Class85.method831(Class113.anInt1745, i_14_,
                Class369.anInt4960, 59);
        int i_21_ = -27 / ((i_15_ - -6) / 55);
        for (int i_22_ = i_17_; i_22_ <= i_18_; i_22_++)
            Class135_Sub2.method1156(-27, i_20_,
                    Class17.anIntArrayArray255[i_22_], i_19_,
                    i_16_);
    }
}
