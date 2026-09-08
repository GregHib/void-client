/* Component275 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component275
/**
 * RENAMED from `Class205` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt2685;
    static StringCache aClass351_2686;
    /** Per-frame yaw delta applied in follow/orbit camera ticks. */
    static float cameraYawRate = 0.0F;
    static int anInt2688;
    static int anInt2689;
    static int anInt2690;
    static StringCache aClass351_2691;
    static ComponentSettings defaultSettings;
    static Component183 aClass114_2693;
    static int[] anIntArray2694;

    static final void method1496(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        Component208.ensureIntArrayCapacity((byte) 118, i_2_);
        anInt2685++;
        int i_6_ = 0;
        int i_7_ = -i_4_ + i_2_;
        if (i_7_ < 0) i_7_ = 0;
        int i_8_ = i_2_;
        int i_9_ = -i_2_;
        int i_10_ = i_7_;
        int i_11_ = -i_7_;
        int i_12_ = -1;
        if (i_0_ >= Component72.anInt1910 && i_0_ <= PauseTimer.anInt513) {
            int[] is = DisplayModeManagerContainer167.anIntArrayArray255[i_0_];
            int i_13_ = LogicError.clamp(Component22.anInt1745, -i_2_ + i_5_, Component27.anInt4960, -104);
            int i_14_ = LogicError.clamp(Component22.anInt1745, i_5_ - -i_2_, Component27.anInt4960, i_3_ + -94);
            int i_15_ = LogicError.clamp(Component22.anInt1745, i_5_ - i_7_, Component27.anInt4960, -82);
            int i_16_ = LogicError.clamp(Component22.anInt1745, i_5_ - -i_7_, Component27.anInt4960, -96);
            MenuOpener.fillInts(-27, i_15_, is, i_13_, i);
            MenuOpener.fillInts(-27, i_16_, is, i_15_, i_1_);
            MenuOpener.fillInts(-27, i_14_, is, i_16_, i);
        }
        int i_17_ = -1;
        while (i_6_ < i_8_) {
            i_12_ += 2;
            i_17_ += 2;
            i_11_ += i_17_;
            i_9_ += i_12_;
            if (i_11_ >= 0 && i_10_ >= 1) {
                i_10_--;
                DisplayModeManagerContainer207.anIntArray9757[i_10_] = i_6_;
                i_11_ -= i_10_ << 1;
            }
            i_6_++;
            if (i_9_ >= 0) {
                i_8_--;
                i_9_ -= i_8_ << 1;
                int i_18_ = i_0_ - i_8_;
                int i_19_ = i_0_ + i_8_;
                if (Component72.anInt1910 <= i_19_ && PauseTimer.anInt513 >= i_18_) {
                    if (i_8_ >= i_7_) {
                        int i_20_ = LogicError.clamp(Component22.anInt1745, i_6_ + i_5_, Component27.anInt4960, i_3_ ^ 0x36);
                        int i_21_ = LogicError.clamp(Component22.anInt1745, i_5_ - i_6_, Component27.anInt4960, 112);
                        if (i_19_ <= PauseTimer.anInt513) MenuOpener.fillInts(-27, i_20_, (DisplayModeManagerContainer167.anIntArrayArray255[i_19_]), i_21_, i);
                        if (Component72.anInt1910 <= i_18_) MenuOpener.fillInts(-27, i_20_, (DisplayModeManagerContainer167.anIntArrayArray255[i_18_]), i_21_, i);
                    } else {
                        int i_22_ = DisplayModeManagerContainer207.anIntArray9757[i_8_];
                        int i_23_ = LogicError.clamp(Component22.anInt1745, i_6_ + i_5_, Component27.anInt4960, -123);
                        int i_24_ = LogicError.clamp(Component22.anInt1745, -i_6_ + i_5_, Component27.anInt4960, 110);
                        int i_25_ = LogicError.clamp(Component22.anInt1745, i_22_ + i_5_, Component27.anInt4960, 85);
                        int i_26_ = LogicError.clamp(Component22.anInt1745, i_5_ - i_22_, Component27.anInt4960, 84);
                        if (PauseTimer.anInt513 >= i_19_) {
                            int[] is = DisplayModeManagerContainer167.anIntArrayArray255[i_19_];
                            MenuOpener.fillInts(-27, i_26_, is, i_24_, i);
                            MenuOpener.fillInts(-27, i_25_, is, i_26_, i_1_);
                            MenuOpener.fillInts(-27, i_23_, is, i_25_, i);
                        }
                        if (Component72.anInt1910 <= i_18_) {
                            int[] is = DisplayModeManagerContainer167.anIntArrayArray255[i_18_];
                            MenuOpener.fillInts(-27, i_26_, is, i_24_, i);
                            MenuOpener.fillInts(-27, i_25_, is, i_26_, i_1_);
                            MenuOpener.fillInts(-27, i_23_, is, i_25_, i);
                        }
                    }
                }
            }
            int i_27_ = -i_6_ + i_0_;
            int i_28_ = i_0_ + i_6_;
            if (Component72.anInt1910 <= i_28_ && i_27_ <= PauseTimer.anInt513) {
                int i_29_ = i_8_ + i_5_;
                int i_30_ = i_5_ + -i_8_;
                if (Component27.anInt4960 <= i_29_ && i_30_ <= Component22.anInt1745) {
                    i_29_ = LogicError.clamp(Component22.anInt1745, i_29_, Component27.anInt4960, 102);
                    i_30_ = LogicError.clamp(Component22.anInt1745, i_30_, Component27.anInt4960, -100);
                    if (i_6_ >= i_7_) {
                        if (PauseTimer.anInt513 >= i_28_) MenuOpener.fillInts(-27, i_29_, (DisplayModeManagerContainer167.anIntArrayArray255[i_28_]), i_30_, i);
                        if (i_27_ >= Component72.anInt1910) MenuOpener.fillInts(-27, i_29_, (DisplayModeManagerContainer167.anIntArrayArray255[i_27_]), i_30_, i);
                    } else {
                        int i_31_ = (i_6_ > i_10_ ? DisplayModeManagerContainer207.anIntArray9757[i_6_] : i_10_);
                        int i_32_ = LogicError.clamp(Component22.anInt1745, i_31_ + i_5_, Component27.anInt4960, 71);
                        int i_33_ = LogicError.clamp(Component22.anInt1745, -i_31_ + i_5_, Component27.anInt4960, 65);
                        if (i_28_ <= PauseTimer.anInt513) {
                            int[] is = DisplayModeManagerContainer167.anIntArrayArray255[i_28_];
                            MenuOpener.fillInts(-27, i_33_, is, i_30_, i);
                            MenuOpener.fillInts(-27, i_32_, is, i_33_, i_1_);
                            MenuOpener.fillInts(-27, i_29_, is, i_32_, i);
                        }
                        if (Component72.anInt1910 <= i_27_) {
                            int[] is = DisplayModeManagerContainer167.anIntArrayArray255[i_27_];
                            MenuOpener.fillInts(i_3_ + -29, i_33_, is, i_30_, i);
                            MenuOpener.fillInts(-27, i_32_, is, i_33_, i_1_);
                            MenuOpener.fillInts(-27, i_29_, is, i_32_, i);
                        }
                    }
                }
            }
        }
        if (i_3_ != 2) method1497(79);
    }

    public static void method1497(int i) {
        anIntArray2694 = null;
        defaultSettings = null;
        aClass351_2691 = null;
        aClass114_2693 = null;
        if (i != 16384) method1496(-23, 118, -17, -52, 33, 108, 2);
        aClass351_2686 = null;
    }

    static {
        aClass351_2686 = new StringCache(41, -1);
        aClass351_2691 = new StringCache(46, 2);
        defaultSettings = new ComponentSettings(0, -1);
        anIntArray2694 = new int[4096];
        aClass114_2693 = new Component183(94, -1);
    }
}
