/* Class239_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub15 extends Class239 {
    static int anInt5996;
    static Class114 aClass114_5997 = new Class114(115, 11);
    static int anInt5998;
    static int anInt5999;
    static int anInt6000;
    static int anInt6001;
    static int anInt6002;
    static int anInt6003;
    static int anInt6004;
    static int anInt6005;
    static int anInt6006 = 0;

    static final Class323 method1782(int i, int i_0_) {
        if (i_0_ != 10144) return null;
        anInt6004++;
        if (i == 0) {
            if ((double) Class75.aFloat1247 == 3.0) return Class125.aClass323_4921;
            if ((double) Class75.aFloat1247 == 4.0) return Class14_Sub4.aClass323_8644;
            if ((double) Class75.aFloat1247 == 6.0) return Class39.aClass323_521;
            if ((double) Class75.aFloat1247 >= 8.0) return Class168.aClass323_2252;
        } else if (i == 1) {
            if ((double) Class75.aFloat1247 == 3.0) return Class39.aClass323_521;
            if ((double) Class75.aFloat1247 == 4.0) return Class168.aClass323_2252;
            if ((double) Class75.aFloat1247 == 6.0) return Class176.aClass323_2333;
            if ((double) Class75.aFloat1247 >= 8.0) return Class285.aClass323_4754;
        } else if (i == 2) {
            if ((double) Class75.aFloat1247 == 3.0) return Class176.aClass323_2333;
            if ((double) Class75.aFloat1247 == 4.0) return Class285.aClass323_4754;
            if ((double) Class75.aFloat1247 == 6.0) return Class348_Sub3.aClass323_6581;
            if ((double) Class75.aFloat1247 >= 8.0) return Class240.aClass323_4672;
        }
        return null;
    }

    final void method1716(boolean bool) {
        if (bool != false) method1783(115, -122, -59, 41, -49, 92);
        anInt5999++;
        if (this.aClass348_Sub51_3136.method3428((byte) -84).method1458(-23688) < 96) this.anInt3138 = 0;
        if (this.anInt3138 < 0 || this.anInt3138 > 2) this.anInt3138 = method1710(20014);
    }

    final int method1714(int i, int i_1_) {
        anInt6005++;
        if (i != 3) method1784(99);
        if (this.aClass348_Sub51_3136.method3428((byte) -85).method1458(-23688) < 96) return 3;
        return 1;
    }

    Class239_Sub15(int i, Class348_Sub51 class348_sub51) {
        super(i, class348_sub51);
        Class126.method1114(this.anInt3138, -122);
    }

    static final void method1783(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        anInt5998++;
        int i_7_ = -i_3_ + i_4_;
        int i_8_ = i_5_ + -i;
        if ((~i_8_) == i_2_) {
            if (i_7_ != 0) Class332.method2641(i_4_, i_3_, -117, i, i_6_);
            return;
        } else if (i_7_ == 0) {
            Class12.method223(i_5_, i_6_, i_3_, i, (byte) 47);
            return;
        }
        if (i_7_ < 0) i_7_ = -i_7_;
        if (i_8_ < 0) i_8_ = -i_8_;
        boolean bool = i_8_ < i_7_;
        if (bool) {
            int i_9_ = i;
            int i_10_ = i_5_;
            i = i_3_;
            i_5_ = i_4_;
            i_3_ = i_9_;
            i_4_ = i_10_;
        }
        if (i_5_ < i) {
            int i_11_ = i;
            i = i_5_;
            int i_12_ = i_3_;
            i_5_ = i_11_;
            i_3_ = i_4_;
            i_4_ = i_12_;
        }
        int i_13_ = i_3_;
        int i_14_ = -i + i_5_;
        int i_15_ = -i_3_ + i_4_;
        int i_16_ = -(i_14_ >> 1);
        if (i_15_ < 0) i_15_ = -i_15_;
        int i_17_ = i_4_ <= i_3_ ? -1 : 1;
        if (bool) {
            for (int i_19_ = i; i_5_ >= i_19_; i_19_++) {
                Class17.anIntArrayArray255[i_19_][i_13_] = i_6_;
                i_16_ += i_15_;
                if (i_16_ > 0) {
                    i_13_ += i_17_;
                    i_16_ -= i_14_;
                }
            }
        } else {
            for (int i_18_ = i; i_18_ <= i_5_; i_18_++) {
                i_16_ += i_15_;
                Class17.anIntArrayArray255[i_13_][i_18_] = i_6_;
                if (i_16_ > 0) {
                    i_13_ += i_17_;
                    i_16_ -= i_14_;
                }
            }
        }
    }

    final void method1712(int i, int i_20_) {
        anInt6003++;
        this.anInt3138 = i_20_;
        int i_21_ = 33 % ((i - 82) / 35);
        Class126.method1114(this.anInt3138, -122);
    }

    final int method1710(int i) {
        anInt5996++;
        if (i != 20014) method1782(-76, -103);
        if (this.aClass348_Sub51_3136.method3428((byte) -105).method1458(-23688) < 96) return 0;
        return 2;
    }

    Class239_Sub15(Class348_Sub51 class348_sub51) {
        super(class348_sub51);
        Class126.method1114(this.anInt3138, -120);
    }

    final int method1784(int i) {
        anInt6000++;
        if (i != -32350) return -82;
        return this.anInt3138;
    }

    public static void method1785(int i) {
        aClass114_5997 = null;
        if (i != 8) aClass114_5997 = null;
    }

    final boolean method1786(int i) {
        if (i < 85) method1784(-69);
        anInt6001++;
        return this.aClass348_Sub51_3136.method3428((byte) -104).method1458(-23688) >= 96;
    }

    static final void method1787(int i, int i_22_) {
        anInt6002++;
        Class348_Sub42_Sub15 class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i, (byte) 105, i_22_);//8
        class348_sub42_sub15.method3251(-16058);
    }
}
