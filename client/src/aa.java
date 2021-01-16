/* aa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class aa {
    static int anInt113;
    static Class144 aClass144_114;
    static int anInt115;

    public static void method158(byte i) {
        aClass144_114 = null;
        int i_0_ = -87 % ((-25 - i) / 41);
    }

    static final void method159(int i) {
        if (Class260.anInt3312 > 0) {
            int i_1_ = 0;
            for (int i_2_ = 0; Class286_Sub1.aStringArray6200.length > i_2_; i_2_++) {
                if (Class286_Sub1.aStringArray6200[i_2_].indexOf("--> ") != -1 && ++i_1_ == Class260.anInt3312) {
                    Class363.aString4461 = (Class286_Sub1.aStringArray6200[i_2_].substring(2 + Class286_Sub1.aStringArray6200[i_2_].indexOf(">")));
                    break;
                }
            }
        } else Class363.aString4461 = "";
        if (i != -615751774) aClass144_114 = null;
        anInt115++;
    }

    public aa() {
        /* empty */
    }

    static final int method160(int i, int i_3_) {
        anInt113++;
        double d = (double) (i_3_ >> -320535056 & 0xff) / 256.0;
        double d_4_ = (double) (0xff & i_3_ >> -196722904) / 256.0;
        double d_5_ = (double) (i_3_ & 0xff) / 256.0;
        double d_6_ = d;
        if (d_4_ < d_6_) d_6_ = d_4_;
        if (d_5_ < d_6_) d_6_ = d_5_;
        double d_7_ = d;
        if (d_4_ > d_7_) d_7_ = d_4_;
        if (d_5_ > d_7_) d_7_ = d_5_;
        double d_8_ = 0.0;
        if (i != 27076) return 85;
        double d_9_ = 0.0;
        double d_10_ = (d_6_ + d_7_) / 2.0;
        if (d_7_ != d_6_) {
            if (d_10_ < 0.5) d_9_ = (-d_6_ + d_7_) / (d_6_ + d_7_);
            if (d_7_ != d) {
                if (d_4_ != d_7_) {
                    if (d_5_ == d_7_) d_8_ = (-d_4_ + d) / (d_7_ - d_6_) + 4.0;
                } else d_8_ = 2.0 + (-d + d_5_) / (d_7_ - d_6_);
            } else d_8_ = (-d_5_ + d_4_) / (-d_6_ + d_7_);
            if (d_10_ >= 0.5) d_9_ = (-d_6_ + d_7_) / (-d_6_ + (-d_7_ + 2.0));
        }
        d_8_ /= 6.0;
        int i_11_ = (int) (256.0 * d_8_);
        int i_12_ = (int) (256.0 * d_9_);
        int i_13_ = (int) (256.0 * d_10_);
        if (i_12_ < 0) i_12_ = 0;
        else if (i_12_ > 255) i_12_ = 255;
        if (i_13_ < 0) i_13_ = 0;
        else if (i_13_ > 255) i_13_ = 255;
        if (i_13_ > 243) i_12_ >>= 4;
        else if (i_13_ > 217) i_12_ >>= 3;
        else if (i_13_ > 192) i_12_ >>= 2;
        else if (i_13_ > 179) i_12_ >>= 1;
        return ((i_13_ >> 2140240129) + ((i_11_ & 0xff) >> -615751774 << 779990378) + (i_12_ >> 1750853765 << 698382727));
    }
}
