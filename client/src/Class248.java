/* Class248 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

final class Class248 {
    static int anInt3185;
    static int anInt3186;
    static int anInt3187;
    static int anInt3188;
    static int anInt3189;
    static int anInt3190;
    static int anInt3191;
    static int anInt3192;
    static int anInt3193;
    static int anInt3194;
    static int anInt3195;
    static Class229 aClass229_3196 = new Class229();
    private final Class107 aClass107_3197 = new Class107();
    static int anInt3198;
    static int anInt3199;
    static int anInt3200;
    static int anInt3201;
    static int anInt3202;
    static int anInt3203 = -1;
    private final Class107 aClass107_3204 = new Class107();
    private final Class107 aClass107_3205 = new Class107();
    private final Class107 aClass107_3206 = new Class107();
    private long aLong3207;
    private final Class348_Sub49 aClass348_Sub49_3208 = new Class348_Sub49(4);
    private Class202 aClass202_3209;
    private int anInt3210;
    private final Class348_Sub49 aClass348_Sub49_3211;
    private byte aByte3212 = 0;
    volatile int anInt3213 = 0;
    volatile int anInt3214 = 0;
    private Class348_Sub42_Sub16_Sub1 aClass348_Sub42_Sub16_Sub1_3215;

    final void method1892(int i, boolean bool) {
        anInt3194++;
        if (aClass202_3209 != null) {
            try {
                aClass348_Sub49_3208.anInt7197 = 0;
                aClass348_Sub49_3208.writeByte(false, bool ? 2 : 3);
                aClass348_Sub49_3208.method3340(-9912, 0);
                if (i < -66) aClass202_3209.method1470((aClass348_Sub49_3208.aByteArray7154), 4, 0, -1);
            } catch (IOException ioexception) {
                try {
                    aClass202_3209.method1476((byte) -121);
                } catch (Exception exception) {
                    /* empty */
                }
                this.anInt3213++;
                aClass202_3209 = null;
                this.anInt3214 = -2;
            }
        }
    }

    final boolean method1893(byte i) {
        if (aClass202_3209 != null) {
            long l = Class62.method599(-106);
            int i_0_ = (int) (-aLong3207 + l);
            if (i_0_ > 200) i_0_ = 200;
            aLong3207 = l;
            anInt3210 += i_0_;
            if (anInt3210 > 30000) {
                try {
                    aClass202_3209.method1476((byte) -121);
                } catch (Exception exception) {
                    /* empty */
                }
                aClass202_3209 = null;
            }
        }
        anInt3190++;
        if (aClass202_3209 == null) {
            return method1902(4) == 0 && method1894(4350) == 0;
        }
        try {
            aClass202_3209.method1472(true);
            for (Class348_Sub42_Sub16_Sub1 class348_sub42_sub16_sub1 = ((Class348_Sub42_Sub16_Sub1) aClass107_3197.method1011(-30)); class348_sub42_sub16_sub1 != null; class348_sub42_sub16_sub1 = ((Class348_Sub42_Sub16_Sub1) aClass107_3197.method1003((byte) 65))) {
                aClass348_Sub49_3208.anInt7197 = 0;
                aClass348_Sub49_3208.writeByte(false, 1);
                aClass348_Sub49_3208.method3340(-9912, (int) (class348_sub42_sub16_sub1.aLong7057));
                aClass202_3209.method1470((aClass348_Sub49_3208.aByteArray7154), 4, 0, -1);
                aClass107_3204.method1005(true, class348_sub42_sub16_sub1);
            }
            Class348_Sub42_Sub16_Sub1 class348_sub42_sub16_sub1 = (Class348_Sub42_Sub16_Sub1) aClass107_3205.method1011(-75);
            if (i <= 72) return false;
            for (/**/; class348_sub42_sub16_sub1 != null; class348_sub42_sub16_sub1 = ((Class348_Sub42_Sub16_Sub1) aClass107_3205.method1003((byte) 102))) {
                aClass348_Sub49_3208.anInt7197 = 0;
                aClass348_Sub49_3208.writeByte(false, 0);
                aClass348_Sub49_3208.method3340(-9912, (int) (class348_sub42_sub16_sub1.aLong7057));
                aClass202_3209.method1470((aClass348_Sub49_3208.aByteArray7154), 4, 0, -1);
                aClass107_3206.method1005(true, class348_sub42_sub16_sub1);
            }
            for (int i_1_ = 0; i_1_ < 100; i_1_++) {
                int i_2_ = aClass202_3209.method1467((byte) 83);
                if (i_2_ < 0) throw new IOException();
                if (i_2_ == 0) break;
                anInt3210 = 0;
                int i_3_ = 0;
                if (aClass348_Sub42_Sub16_Sub1_3215 == null) i_3_ = 8;
                else if (aClass348_Sub42_Sub16_Sub1_3215.anInt10456 == 0) i_3_ = 1;
                if (i_3_ <= 0) {
                    int i_4_ = (aClass348_Sub42_Sub16_Sub1_3215.aClass348_Sub49_10453.aByteArray7154.length + -aClass348_Sub42_Sub16_Sub1_3215.aByte10449);
                    int i_5_ = (-aClass348_Sub42_Sub16_Sub1_3215.anInt10456 + 512);
                    if (i_5_ > -(aClass348_Sub42_Sub16_Sub1_3215.aClass348_Sub49_10453.anInt7197) + i_4_) i_5_ = i_4_ - aClass348_Sub42_Sub16_Sub1_3215.aClass348_Sub49_10453.anInt7197;
                    if (i_2_ < i_5_) i_5_ = i_2_;
                    aClass202_3209.method1474((aClass348_Sub42_Sub16_Sub1_3215.aClass348_Sub49_10453.aByteArray7154), aClass348_Sub42_Sub16_Sub1_3215.aClass348_Sub49_10453.anInt7197, (byte) -72, i_5_);
                    if (aByte3212 != 0) {
                        for (int i_6_ = 0; i_5_ > i_6_; i_6_++)
                            aClass348_Sub42_Sub16_Sub1_3215.aClass348_Sub49_10453.aByteArray7154[i_6_ + aClass348_Sub42_Sub16_Sub1_3215.aClass348_Sub49_10453.anInt7197] = (byte) (Class348_Sub21.method2955((aClass348_Sub42_Sub16_Sub1_3215.aClass348_Sub49_10453.aByteArray7154[(i_6_ + (aClass348_Sub42_Sub16_Sub1_3215.aClass348_Sub49_10453.anInt7197))]), aByte3212));
                    }
                    aClass348_Sub42_Sub16_Sub1_3215.anInt10456 += i_5_;
                    aClass348_Sub42_Sub16_Sub1_3215.aClass348_Sub49_10453.anInt7197 += i_5_;
                    if (i_4_ == aClass348_Sub42_Sub16_Sub1_3215.aClass348_Sub49_10453.anInt7197) {
                        aClass348_Sub42_Sub16_Sub1_3215.method3162(true);
                        aClass348_Sub42_Sub16_Sub1_3215.aBoolean9664 = false;
                        aClass348_Sub42_Sub16_Sub1_3215 = null;
                    } else if (aClass348_Sub42_Sub16_Sub1_3215.anInt10456 == 512) aClass348_Sub42_Sub16_Sub1_3215.anInt10456 = 0;
                } else {
                    int i_7_ = i_3_ + -(aClass348_Sub49_3211.anInt7197);
                    if (i_2_ < i_7_) i_7_ = i_2_;
                    aClass202_3209.method1474((aClass348_Sub49_3211.aByteArray7154), aClass348_Sub49_3211.anInt7197, (byte) -72, i_7_);
                    if (aByte3212 != 0) {
                        for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
                            aClass348_Sub49_3211.aByteArray7154[i_8_ + aClass348_Sub49_3211.anInt7197] = (byte) (Class348_Sub21.method2955((aClass348_Sub49_3211.aByteArray7154[i_8_ + (aClass348_Sub49_3211.anInt7197)]), aByte3212));
                    }
                    aClass348_Sub49_3211.anInt7197 += i_7_;
                    if (aClass348_Sub49_3211.anInt7197 >= i_3_) {
                        if (aClass348_Sub42_Sub16_Sub1_3215 == null) {
                            aClass348_Sub49_3211.anInt7197 = 0;
                            int index = aClass348_Sub49_3211.readUnsignedByte(255);
                            int archive = aClass348_Sub49_3211.readUnsignedShort(842397944);
                            int mask = aClass348_Sub49_3211.readUnsignedByte(255);
                            int size = aClass348_Sub49_3211.readInt((byte) -126);
                            int compression = 0x7f & mask;
                            boolean prefetch = (0x80 & mask) != 0;
                            long l = (index << 16) + archive;
                            Object object = null;
                            Class348_Sub42_Sub16_Sub1 class348_sub42_sub16_sub1_14_;
                            if (prefetch) {
                                for (class348_sub42_sub16_sub1_14_ = ((Class348_Sub42_Sub16_Sub1) aClass107_3206.method1011(-89)); class348_sub42_sub16_sub1_14_ != null; class348_sub42_sub16_sub1_14_ = ((Class348_Sub42_Sub16_Sub1) aClass107_3206.method1003((byte) 98))) {
                                    if (l == (class348_sub42_sub16_sub1_14_.aLong7057)) break;
                                }
                            } else {
                                for (class348_sub42_sub16_sub1_14_ = ((Class348_Sub42_Sub16_Sub1) aClass107_3204.method1011(-108)); class348_sub42_sub16_sub1_14_ != null; class348_sub42_sub16_sub1_14_ = ((Class348_Sub42_Sub16_Sub1) aClass107_3204.method1003((byte) 90))) {
                                    if (l == (class348_sub42_sub16_sub1_14_.aLong7057)) break;
                                }
                            }
                            if (class348_sub42_sub16_sub1_14_ == null) throw new IOException();
                            int i_15_ = compression == 0 ? 5 : 9;
                            aClass348_Sub42_Sub16_Sub1_3215 = class348_sub42_sub16_sub1_14_;
                            aClass348_Sub42_Sub16_Sub1_3215.aClass348_Sub49_10453 = (new Class348_Sub49((aClass348_Sub42_Sub16_Sub1_3215.aByte10449) + i_15_ + size));
                            aClass348_Sub42_Sub16_Sub1_3215.aClass348_Sub49_10453.writeByte(false, compression);
                            aClass348_Sub42_Sub16_Sub1_3215.aClass348_Sub49_10453.writeInt((byte) 97, size);
                            aClass348_Sub49_3211.anInt7197 = 0;
                            aClass348_Sub42_Sub16_Sub1_3215.anInt10456 = 8;
                        } else if ((aClass348_Sub42_Sub16_Sub1_3215.anInt10456) == 0) {
                            if ((aClass348_Sub49_3211.aByteArray7154[0]) == -1) {
                                aClass348_Sub42_Sub16_Sub1_3215.anInt10456 = 1;
                                aClass348_Sub49_3211.anInt7197 = 0;
                            } else aClass348_Sub42_Sub16_Sub1_3215 = null;
                        } else throw new IOException();
                    }
                }
            }
            return true;
        } catch (IOException ioexception) {
            try {
                aClass202_3209.method1476((byte) -122);
            } catch (Exception exception) {
                /* empty */
            }
            this.anInt3214 = -2;
            this.anInt3213++;
            aClass202_3209 = null;
            return method1902(4) == 0 && method1894(4350) == 0;
        }
    }

    private final int method1894(int i) {
        anInt3199++;
        if (i != 4350) return 29;
        return aClass107_3205.method1002(0) - -aClass107_3206.method1002(0);
    }

    static final void method1895(int i, byte[] is, int i_16_, int i_17_, int i_18_, int i_19_, byte[] is_20_, int i_21_, byte i_22_) {
        try {
            anInt3198++;
            int i_23_ = -(i_21_ >> 2);
            i_21_ = -(0x3 & i_21_);
            if (i_22_ != 121) aClass229_3196 = null;
            for (int i_24_ = -i_16_; i_24_ < 0; i_24_++) {
                for (int i_25_ = i_23_; i_25_ < 0; i_25_++) {
                    is[i_17_++] += -is_20_[i++];
                    is[i_17_++] += -is_20_[i++];
                    is[i_17_++] += -is_20_[i++];
                    is[i_17_++] += -is_20_[i++];
                }
                for (int i_26_ = i_21_; i_26_ < 0; i_26_++)
                    is[i_17_++] += -is_20_[i++];
                i_17_ += i_18_;
                i += i_19_;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("tha.M(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + (is_20_ != null ? "{...}" : "null") + ',' + i_21_ + ',' + i_22_ + ')'));
        }
    }

    private final void method1896(int i) {
        if (i <= -58) {
            anInt3191++;
            if (aClass202_3209 != null) {
                try {
                    aClass348_Sub49_3208.anInt7197 = 0;
                    aClass348_Sub49_3208.writeByte(false, 6);
                    aClass348_Sub49_3208.method3340(-9912, 3);
                    aClass202_3209.method1470((aClass348_Sub49_3208.aByteArray7154), 4, 0, -1);
                } catch (IOException ioexception) {
                    try {
                        aClass202_3209.method1476((byte) -123);
                    } catch (Exception exception) {
                        /* empty */
                    }
                    this.anInt3214 = -2;
                    aClass202_3209 = null;
                    this.anInt3213++;
                }
            }
        }
    }

    public static void method1897(byte i) {
        if (i == 119) aClass229_3196 = null;
    }

    final void method1898(boolean bool) {
        if (aClass202_3209 != null) aClass202_3209.method1468(72);
        if (bool != true) method1904(99);
        anInt3185++;
    }

    final boolean method1899(int i) {
        if (i > -91) this.anInt3214 = -39;
        anInt3186++;
        return method1894(4350) >= 20;
    }

    final boolean method1900(int i) {
        int i_27_ = -51 % ((41 - i) / 47);
        anInt3195++;
        return method1902(4) >= 20;
    }

    final void method1901(int i) {
        if (i > -27) method1901(21);
        if (aClass202_3209 != null) aClass202_3209.method1476((byte) -122);
        anInt3200++;
    }

    final int method1902(int i) {
        anInt3192++;
        if (i != 4) this.anInt3213 = 18;
        return aClass107_3197.method1002(0) + aClass107_3204.method1002(0);
    }

    final void method1903(boolean bool, boolean bool_28_, Class202 class202) {
        if (aClass202_3209 != null) {
            try {
                aClass202_3209.method1476((byte) -124);
            } catch (Exception exception) {
                /* empty */
            }
            aClass202_3209 = null;
        }
        anInt3193++;
        aClass202_3209 = class202;
        method1896(-92);
        method1892(-92, bool_28_);
        aClass348_Sub49_3211.anInt7197 = 0;
        aClass348_Sub42_Sub16_Sub1_3215 = null;
        if (bool != false) aLong3207 = -35L;
        for (; ; ) {
            Class348_Sub42_Sub16_Sub1 class348_sub42_sub16_sub1 = (Class348_Sub42_Sub16_Sub1) aClass107_3204.method1008(20);
            if (class348_sub42_sub16_sub1 == null) break;
            aClass107_3197.method1005(true, class348_sub42_sub16_sub1);
        }
        for (; ; ) {
            Class348_Sub42_Sub16_Sub1 class348_sub42_sub16_sub1 = (Class348_Sub42_Sub16_Sub1) aClass107_3206.method1008(20);
            if (class348_sub42_sub16_sub1 == null) break;
            aClass107_3205.method1005(!bool, class348_sub42_sub16_sub1);
        }
        if (aByte3212 != 0) {
            try {
                aClass348_Sub49_3208.anInt7197 = 0;
                aClass348_Sub49_3208.writeByte(bool, 4);
                aClass348_Sub49_3208.writeByte(bool, aByte3212);
                aClass348_Sub49_3208.writeShort((byte) 107, 0);
                aClass202_3209.method1470((aClass348_Sub49_3208.aByteArray7154), 4, 0, -1);
            } catch (IOException ioexception) {
                try {
                    aClass202_3209.method1476((byte) -126);
                } catch (Exception exception) {
                    /* empty */
                }
                this.anInt3214 = -2;
                this.anInt3213++;
                aClass202_3209 = null;
            }
        }
        anInt3210 = 0;
        aLong3207 = Class62.method599(-105);
    }

    final void method1904(int i) {
        try {
            aClass202_3209.method1476((byte) -123);
        } catch (Exception exception) {
            /* empty */
        }
        anInt3189++;
        aClass202_3209 = null;
        this.anInt3213++;
        aByte3212 = (byte) (int) (Math.random() * 255.0 + 1.0);
        this.anInt3214 = i;
    }

    final void method1905(int i) {
        anInt3188++;
        if (aClass202_3209 != null) {
            try {
                aClass348_Sub49_3208.anInt7197 = i;
                aClass348_Sub49_3208.writeByte(false, 7);
                aClass348_Sub49_3208.method3340(-9912, 0);
                aClass202_3209.method1470((aClass348_Sub49_3208.aByteArray7154), 4, 0, ~i);
            } catch (IOException ioexception) {
                try {
                    aClass202_3209.method1476((byte) -125);
                } catch (Exception exception) {
                    /* empty */
                }
                this.anInt3214 = -2;
                this.anInt3213++;
                aClass202_3209 = null;
            }
        }
    }

    final Class348_Sub42_Sub16_Sub1 method1906(byte i, byte i_29_, boolean bool, int i_30_, int i_31_) {
        anInt3187++;
        int i_32_ = -118 % ((i - -15) / 61);
        long l = (i_31_ << 16) - -i_30_;
        Class348_Sub42_Sub16_Sub1 class348_sub42_sub16_sub1 = new Class348_Sub42_Sub16_Sub1();
        class348_sub42_sub16_sub1.aBoolean9663 = bool;
        class348_sub42_sub16_sub1.aLong7057 = l;
        class348_sub42_sub16_sub1.aByte10449 = i_29_;
        if (bool) {
            if (method1902(4) >= 20) throw new RuntimeException();
            aClass107_3197.method1005(true, class348_sub42_sub16_sub1);
        } else {
            if (method1894(4350) >= 20) throw new RuntimeException();
            aClass107_3205.method1005(true, class348_sub42_sub16_sub1);
        }
        return class348_sub42_sub16_sub1;
    }

    public Class248() {
        aClass348_Sub49_3211 = new Class348_Sub49(8);
    }
}
