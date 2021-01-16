/* Class318_Sub1_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.math.BigInteger;

abstract class Class318_Sub1_Sub4 extends Class318_Sub1 {
    static int anInt8757;
    static int anInt8758;
    short aShort8759;
    static int anInt8760;
    static int anInt8761;
    static BigInteger aBigInteger8762 = new BigInteger("10001", 16);
    static int anInt8763;
    static Class279 aClass279_8764;
    static int anInt8765;

    final int method2384(Class348_Sub1[] class348_sub1s, int i) {
        anInt8758++;
        int i_0_ = this.anInt6377 >> Class362.anInt4459;
        int i_1_ = this.anInt6388 >> Class362.anInt4459;
        int i_2_ = -103 / ((i - -14) / 61);
        int i_3_ = 0;
        if (Class239_Sub25.anInt6111 == i_0_)
            i_3_++;
        else if (Class239_Sub25.anInt6111 < i_0_)
            i_3_ += 2;
        if (i_1_ == Class285_Sub2.anInt8502)
            i_3_ += 3;
        else if (i_1_ < Class285_Sub2.anInt8502)
            i_3_ += 6;
        int i_4_ = Class318_Sub9_Sub2.anIntArray8797[i_3_];
        if ((this.aShort8759 & i_4_) != 0)
            return this.method2390(class348_sub1s, i_0_, -2, i_1_);
        if (this.aShort8759 == 1
                && i_0_ > 0)
            return this.method2390(class348_sub1s, -1 + i_0_, -2, i_1_);
        if (this.aShort8759 == 4
                && i_0_ <= Class318_Sub7.anInt6451)
            return this.method2390(class348_sub1s, 1 + i_0_, -2, i_1_);
        if (this.aShort8759 == 8
                && i_1_ > 0)
            return this.method2390(class348_sub1s, i_0_, -2, -1 + i_1_);
        if (this.aShort8759 == 2
                && i_1_ <= Class348_Sub41.anInt7054)
            return this.method2390(class348_sub1s, i_0_, -2, i_1_ + 1);
        if (this.aShort8759 == 16
                && i_0_ > 0 && i_1_ <= Class348_Sub41.anInt7054)
            return this.method2390(class348_sub1s, -1 + i_0_, -2, i_1_ + 1);
        if (this.aShort8759 == 32
                && Class318_Sub7.anInt6451 >= i_0_
                && Class348_Sub41.anInt7054 >= i_1_)
            return this.method2390(class348_sub1s, i_0_ + 1, -2, i_1_ + 1);
        if (this.aShort8759 == 128 && i_0_ > 0
                && i_1_ > 0)
            return this.method2390(class348_sub1s, i_0_ - 1, -2, i_1_ - 1);
        if (this.aShort8759 == 64
                && i_0_ <= Class318_Sub7.anInt6451
                && i_1_ > 0)
            return this.method2390(class348_sub1s, 1 + i_0_, -2, -1 + i_1_);
        throw new RuntimeException("");
    }

    static final int method2478(int i) {
        if (i != 1000)
            return -103;
        anInt8763++;
        boolean bool = false;
        boolean bool_5_ = false;
        boolean bool_6_ = false;
        if (Class348_Sub23_Sub1.aClass297_8992.aBoolean3777
                && !Class348_Sub23_Sub1.aClass297_8992.aBoolean3794) {
            bool = (Class348_Sub40_Sub20.aClass348_Sub4_9264
                    .anInt6609) >= 512
                    || (Class348_Sub40_Sub20.aClass348_Sub4_9264
                    .anInt6609) == 0;
            if (!Class297.aString3803.startsWith("win"))
                bool_5_ = true;
            else {
                bool_6_ = true;
                bool_5_ = true;
            }
        }
        if (Class221.aBoolean2881)
            bool = false;
        if (Class330.aBoolean4117)
            bool_5_ = false;
        if (Class348_Sub1.aBoolean6558)
            bool_6_ = false;
        if (!bool && !bool_5_ && !bool_6_)
            return Class314_Sub1.method2348(-8454);
        int i_7_ = -1;
        int i_8_ = -1;
        int i_9_ = -1;
        if (bool) {
            try {
                i_7_ = Class239_Sub14.method1781(2, -126, 1000);
            } catch (Exception exception) {
                /* empty */
            }
        }
        do {
            if (bool_6_) {
                try {
                    i_9_ = Class239_Sub14.method1781(3, -70, 1000);
                    if (Class316.aClass348_Sub51_3959
                            .aClass239_Sub25_7271.method1829(i + -33350) == 3) {
                        Class365 class365 = Class348_Sub8.aHa6654.c();
                        long l = (0xffffffffffffL
                                & class365.aLong4471);
                        int i_10_ = class365.anInt4476;
                        if (i_10_ != 4318) {
                            if (i_10_ != 4098)
                                break;
                        } else {
                            bool_5_ = bool_5_ & (l >= 64425238954L);
                            break;
                        }
                        bool_5_ = bool_5_ & (l >= 60129613779L);
                    }
                } catch (Exception exception) {
                    /* empty */
                }
            }
        } while (false);
        if (bool_5_) {
            try {
                i_8_ = Class239_Sub14.method1781(1, i ^ ~0x3ab, 1000);
            } catch (Exception exception) {
                /* empty */
            }
        }
        if (i_7_ == -1 && i_8_ == -1 && i_9_ == -1)
            return Class314_Sub1.method2348(i + -9454);
        i_9_ *= 1.1F;
        i_8_ *= 1.1F;
        if (i_7_ > i_9_ && i_8_ < i_7_)
            return Class49.method454(i_7_, (byte) -116);
        if (i_9_ <= i_8_)
            return Class62.method600((byte) -59, 1, i_8_);
        return Class62.method600((byte) -80, 3, i_9_);
    }

    final boolean method2382(byte i) {
        if (i >= -51)
            return false;
        anInt8760++;
        return InputStream_Sub1.method125((this.anInt6388
                        >> Class362.anInt4459),
                (this.anInt6377
                        >> Class362.anInt4459),
                this.aByte6376,
                this, (byte) 120);
    }

    public static void method2479(int i) {
        if (i == 19424) {
            aBigInteger8762 = null;
            aClass279_8764 = null;
        }
    }

    Class318_Sub1_Sub4(int i, int i_11_, int i_12_, int i_13_, int i_14_,
                       int i_15_) {
        this.anInt6377 = i;
        this.anInt6382 = i_11_;
        this.aByte6376 = (byte) i_14_;
        this.anInt6388 = i_12_;
        this.aByte6381 = (byte) i_13_;
        this.aShort8759 = (short) i_15_;
    }

    final boolean method2378(int i) {
        anInt8757++;
        if (i != 0)
            method2378(-104);
        return (Class99.aBooleanArrayArray1572
                [(-Class239_Sub25.anInt6111
                + (this.anInt6377 >> Class362.anInt4459)
                + Class318_Sub1_Sub4_Sub1.anInt10084)]
                [(Class318_Sub1_Sub4_Sub1.anInt10084 + -Class285_Sub2.anInt8502
                + (this.anInt6388
                >> Class362.anInt4459))]);
    }

    static final void method2480(int i) {
        if (i == -1) {
            anInt8761++;
            Class348_Sub35.aClass262_6978 = new Class262();
        }
    }
}
