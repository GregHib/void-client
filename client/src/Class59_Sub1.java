/* Class59_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

class Class59_Sub1 extends Class59 {
    static int anInt5277;
    private final int anInt5278;
    private final int anInt5279;
    private int anInt5280;
    static int anInt5281;
    static int anInt5282;
    static int anInt5283;
    static int anInt5284;
    private int anInt5285;
    static int anInt5286;
    private int anInt5287;
    static Class351 aClass351_5288 = new Class351(7, 6);
    private int anInt5289;
    private int anInt5290;
    static int anInt5291;
    static int anInt5292;
    static int anInt5293;
    static Class105[] aClass105Array5294;
    static int anInt5295;
    private byte[] aByteArray5296;
    static Class297 aClass297_5297;
    private final int anInt5298;
    static float aFloat5299;
    static boolean aBoolean5300 = false;

    void method550(int i, byte i_0_, byte i_1_) {
        if (i_1_ != 14) method555(true, -38);
        anInt5281++;
        aByteArray5296[i] = i_0_;
    }

    final void method543(boolean bool) {
        anInt5287 = 0;
        if (bool != true) method555(false, -53);
        anInt5290 = 0;
        anInt5291++;
    }

    static final void method551(int i, int i_2_, int i_3_, float[] fs, int i_4_, int i_5_, int i_6_) {
        anInt5277++;
        if (i_4_ < i && !Class192.method1436(i_4_ + -23, i)) throw new IllegalArgumentException("");
        if (i_5_ > 0 && !Class192.method1436(56, i_5_)) throw new IllegalArgumentException("");
        int i_7_ = Class183.method1382(i_2_, -6409);
        int i_8_ = 0;
        int i_9_ = Math.min(i_5_, i);
        int i_10_ = i >> 1;
        int i_11_ = i_5_ >> 1;
        float[] fs_12_ = fs;
        float[] fs_13_ = new float[i_7_ * i_10_ * i_11_];
        for (; ; ) {
            OpenGL.glTexImage2Df(i_3_, i_8_, i_6_, i, i_5_, 0, i_2_, 5126, fs_12_, 0);
            if (i_9_ <= 1) break;
            int i_14_ = i * i_7_;
            float[] fs_15_ = fs_13_;
            for (int i_16_ = 0; i_16_ < i_7_; i_16_++) {
                int i_17_ = i_16_;
                int i_18_ = i_16_;
                int i_19_ = i_14_ + i_18_;
                for (int i_20_ = 0; i_11_ > i_20_; i_20_++) {
                    for (int i_21_ = 0; i_10_ > i_21_; i_21_++) {
                        float f = fs_12_[i_18_];
                        i_18_ += i_7_;
                        f += fs_12_[i_18_];
                        i_18_ += i_7_;
                        f += fs_12_[i_19_];
                        i_19_ += i_7_;
                        f += fs_12_[i_19_];
                        i_19_ += i_7_;
                        fs_13_[i_17_] = f * 0.25F;
                        i_17_ += i_7_;
                    }
                    i_18_ += i_14_;
                    i_19_ += i_14_;
                }
            }
            fs_13_ = fs_12_;
            fs_12_ = fs_15_;
            i = i_10_;
            i_5_ = i_11_;
            i_8_++;
            i_9_ >>= 1;
            i_10_ >>= 1;
            i_11_ >>= 1;
        }
    }

    Class59_Sub1(int i, int i_22_, int i_23_, int i_24_, int i_25_, float f, float f_26_, float f_27_) {
        super(i, i_22_, i_23_, i_24_, i_25_);
        anInt5298 = (int) (4096.0F * f_27_);
        anInt5278 = (int) (f_26_ * 4096.0F);
        anInt5285 = anInt5279 = (int) (Math.pow(0.5, -f) * 4096.0);
    }

    static final boolean method552(int i, int i_28_, byte i_29_, int i_30_, int i_31_, int i_32_, byte[] is) {
        anInt5282++;
        int i_33_ = i_31_ % i_30_;
        int i_34_ = 39 / ((31 - i_29_) / 63);
        int i_35_;
        if (i_33_ != 0) i_35_ = i_30_ - i_33_;
        else i_35_ = 0;
        int i_36_ = -((i_28_ - -i_30_ + -1) / i_30_);
        int i_37_ = -((i_30_ + i_31_ - 1) / i_30_);
        for (int i_38_ = i_36_; i_38_ < 0; i_38_++) {
            for (int i_39_ = i_37_; i_39_ < 0; i_39_++) {
                if (is[i_32_] == 0) return true;
                i_32_ += i_30_;
            }
            i_32_ -= i_35_;
            if (is[i_32_ + -1] == 0) return true;
            i_32_ += i;
        }
        return false;
    }

    final void method546(int i, int i_40_, int i_41_) {
        if (i_41_ == -2) {
            if (i_40_ == 0) {
                anInt5280 = -(i >= 0 ? i : -i) + anInt5278;
                anInt5289 = 4096;
                anInt5280 = anInt5280 * anInt5280 >> 12;
                anInt5290 = anInt5280;
            } else {
                anInt5289 = anInt5280 * anInt5298 >> 12;
                if (anInt5289 < 0) anInt5289 = 0;
                else if (anInt5289 > 4096) anInt5289 = 4096;
                anInt5280 = anInt5278 + -(i < 0 ? -i : i);
                anInt5280 = anInt5280 * anInt5280 >> 12;
                anInt5280 = anInt5289 * anInt5280 >> 12;
                anInt5290 += anInt5280 * anInt5285 >> 12;
                anInt5285 = anInt5285 * anInt5279 >> 12;
            }
            anInt5292++;
        }
    }

    public static void method553(int i) {
        aClass105Array5294 = null;
        aClass351_5288 = null;
        if (i != 0) aClass297_5297 = null;
        aClass297_5297 = null;
    }

    static final int method554(int i, int i_42_, byte[] is) {
        if (i != 5126) method553(52);
        anInt5284++;
        return Class171.method1319(i_42_, true, is, 0);
    }

    static final void method555(boolean bool, int i) {
        anInt5286++;
        if (i != Class363.aString4461.length()) {
            Applet_Sub1.method94("--> " + Class363.aString4461, 110);
            Class82.method812(Class363.aString4461, false, bool, (byte) -79);
            Class348_Sub38.anInt7006 = 0;
            Class363.aString4461 = "";
            Class260.anInt3312 = 0;
        }
    }

    final void method541(int i) {
        anInt5285 = anInt5279;
        anInt5290 >>= 4;
        anInt5295++;
        if (anInt5290 >= 0) {
            if (anInt5290 > 255) anInt5290 = 255;
        } else anInt5290 = 0;
        if (i != -1538606516) anInt5289 = 17;
        method550(anInt5287++, (byte) anInt5290, (byte) 14);
        anInt5290 = 0;
    }
}
