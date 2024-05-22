/* Class348_Sub42_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub42_Sub12 extends Class348_Sub42 {
    String aString9593;
    static int anInt9594;
    String aString9595;
    static int anInt9596;
    boolean aBoolean9597;
    static int anInt9598;
    int anInt9599;
    long aLong9600;
    String aString9601;
    int anInt9602;
    static Class356 aClass356_9603;
    static int anInt9604 = 0;
    long aLong9605;
    static int anInt9606;
    int anInt9607;
    int anInt9608;
    int anInt9609;
    boolean aBoolean9610;
    boolean aBoolean9611;
    static int[] anIntArray9612;

    public static void method3228(int i) {
        anIntArray9612 = null;
        int i_0_ = 29 / ((31 - i) / 43);
        aClass356_9603 = null;
    }

    static final int method3229(int i) {
        anInt9596++;
        if (Class34.aFrame476 != null) return 3;
        if (i >= -59) anInt9604 = 79;
        if (!Class50_Sub1.aBoolean5219) return 1;
        return 2;
    }

    static final void method3230(int[] is, int[] is_1_, int i) {
        try {
            anInt9606++;
            if (is == null || is_1_ == null) {
                Class348_Sub40_Sub6.aByteArrayArrayArray9134 = null;
                Class190.anIntArray2552 = null;
                Class59_Sub2_Sub2.anIntArray8684 = null;
            } else {
                Class59_Sub2_Sub2.anIntArray8684 = is;
                Class190.anIntArray2552 = new int[is.length];
                Class348_Sub40_Sub6.aByteArrayArrayArray9134 = new byte[is.length][][];
                for (int i_2_ = i; i_2_ < Class59_Sub2_Sub2.anIntArray8684.length; i_2_++)
                    Class348_Sub40_Sub6.aByteArrayArrayArray9134[i_2_] = new byte[is_1_[i_2_]][];
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("db.D(" + (is != null ? "{...}" : "null") + ',' + (is_1_ != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    static final void method3231(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
        if (i_7_ > -123) method3229(14);
        Class239_Sub12.anInt5973 = i_5_;
        Class121.anInt1797 = i_4_;
        Class352.anInt4336 = i_3_;
        Class367_Sub11.anInt7403 = i_6_;
        anInt9598++;
        Class281.anInt3647 = i;
        if (Class239_Sub12.anInt5973 >= 100) {
            int i_8_ = Class352.anInt4336 * 512 - -256;
            int i_9_ = Class281.anInt3647 * 512 - -256;
            int i_10_ = (Class275.method2064(i_8_, Class355.anInt4372, 11219, i_9_) + -Class121.anInt1797);
            int i_11_ = i_8_ - Class286_Sub4.anInt6246;
            int i_12_ = -Class305.anInt3855 + i_10_;
            int i_13_ = i_9_ - Class59_Sub2_Sub2.anInt8685;
            int i_14_ = (int) Math.sqrt(i_11_ * i_11_ + i_13_ * i_13_);
            ClientScript.anInt9701 = (int) (Math.atan2(i_12_, i_14_) * 2607.5945876176133) & 0x3fff;
            Class5.anInt4638 = (int) (-2607.5945876176133 * Math.atan2(i_11_, i_13_)) & 0x3fff;
            if (ClientScript.anInt9701 < 1024) ClientScript.anInt9701 = 1024;
            Class338.anInt4186 = 0;
            if (ClientScript.anInt9701 > 3072) ClientScript.anInt9701 = 3072;
        }
        Class348_Sub40_Sub21.anInt9282 = 2;
        Class9.anInt167 = Class318_Sub1_Sub5_Sub2.anInt10163 = -1;
    }

    Class348_Sub42_Sub12(String string, String string_15_, int i, int i_16_, int i_17_, long l, int i_18_, int i_19_, boolean bool, boolean bool_20_, long l_21_, boolean bool_22_) {
        try {
            this.anInt9607 = i_19_;
            this.anInt9608 = i_16_;
            this.anInt9599 = i_17_;
            this.aLong9605 = l;
            this.aBoolean9610 = bool;
            this.aBoolean9597 = bool_20_;
            this.aString9601 = string_15_;
            this.aBoolean9611 = bool_22_;
            this.aString9593 = string;
            this.anInt9609 = i;
            this.aLong9600 = l_21_;
            this.anInt9602 = i_18_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("db.<init>(" + (string != null ? "{...}" : "null") + ',' + (string_15_ != null ? "{...}" : "null") + ',' + i + ',' + i_16_ + ',' + i_17_ + ',' + l + ',' + i_18_ + ',' + i_19_ + ',' + bool + ',' + bool_20_ + ',' + l_21_ + ',' + bool_22_ + ')'));
        }
    }

    static {
        aClass356_9603 = new Class356(16);
        anIntArray9612 = new int[8];
    }
}
