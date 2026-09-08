/* DefinitionSub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

final class DefinitionSub28
/**
 * RENAMED from `Class348_Sub40_Sub28` (JODE-obfuscated).
 * Evidence: subclass of Definition (hierarchy)
 */ extends Definition {
    static int anInt9361;
    private int anInt9362;
    static int anInt9363;
    private int anInt9364 = 4096;
    static CacheStore aClass45_9365;
    static int anInt9366;
    private int anInt9367;
    private int anInt9368 = 16;
    private int anInt9369 = 0;
    static int anInt9370;

    final void postDecode(int i) {
        anInt9363++;
        Component7.method1605(26188);
        if (i < 108) method3122((byte) -111);
    }

    static final NamedInteger[] method3122(byte i) {
        if (i < 86) aClass45_9365 = null;
        anInt9361++;
        return (new NamedInteger[]{Component326.LIVE, WaterShaderSub8.WTRC, AssetCacheLoader.WTQA, Component83.WTWIP, DisplayModeManagerContainer154.LOCAL, DisplayModeManagerContainer173.WTI});
    }

    public static void method3123(int i) {
        aClass45_9365 = null;
        if (i != 0) method3122((byte) -98);
    }

    final void method3049(Buffer class348_sub49, int i, int i_0_) {
        anInt9370++;
        if (i_0_ != 31015) anInt9364 = -29;
        int i_1_ = i;
        while_204_:
        do {
            while_203_:
            do {
                while_202_:
                do {
                    do {
                        if (i_1_ == 0) {
                            anInt9367 = class348_sub49.readUnsignedByte(255);
                            return;
                        } else if (i_1_ != 1) {
                            if (i_1_ != 2) {
                                if (i_1_ != 3) {
                                    if (i_1_ == 4) break while_203_;
                                    break while_204_;
                                }
                            } else break;
                            break while_202_;
                        }
                        anInt9362 = class348_sub49.readUnsignedShort(842397944);
                        return;
                    } while (false);
                    anInt9368 = class348_sub49.readUnsignedByte(255);
                    return;
                } while (false);
                anInt9369 = class348_sub49.readUnsignedShort(842397944);
                return;
            } while (false);
            anInt9364 = class348_sub49.readUnsignedShort(842397944);
        } while (false);
    }

    final int[] getMonochromeOutput(int i, int i_2_) {
        anInt9366++;
        if (i_2_ != 255) postDecode(-48);
        int[] is = this.imageCache.getPixels(0, i);
        if (this.imageCache.cacheMiss) {
            int i_3_ = anInt9364 >> 1;
            int[][] is_4_ = this.imageCache.getAllBuffers((byte) 16);
            Random random = new Random(anInt9367);
            for (int i_5_ = 0; anInt9362 > i_5_; i_5_++) {
                int i_6_ = (anInt9364 > 0 ? anInt9369 + DisplayModeManagerContainer77.method1097((byte) 92, anInt9364, random) + -i_3_ : anInt9369);
                i_6_ = i_6_ >> 4 & 0xff;
                int i_7_ = DisplayModeManagerContainer77.method1097((byte) 81, DefinitionSub6.anInt9139, random);
                int i_8_ = DisplayModeManagerContainer77.method1097((byte) 123, ShaderProgramSub2.anInt6212, random);
                int i_9_ = i_7_ - -(anInt9368 * Component296.anIntArray4654[i_6_] >> 12);
                int i_10_ = ((Component366.anIntArray3068[i_6_] * anInt9368 >> 12) + i_8_);
                int i_11_ = -i_8_ + i_10_;
                int i_12_ = -i_7_ + i_9_;
                if (i_12_ != 0 || i_11_ != 0) {
                    if (i_11_ < 0) i_11_ = -i_11_;
                    if (i_12_ < 0) i_12_ = -i_12_;
                    boolean bool = i_12_ < i_11_;
                    if (bool) {
                        int i_13_ = i_7_;
                        int i_14_ = i_9_;
                        i_7_ = i_8_;
                        i_8_ = i_13_;
                        i_9_ = i_10_;
                        i_10_ = i_14_;
                    }
                    if (i_9_ < i_7_) {
                        int i_15_ = i_7_;
                        i_7_ = i_9_;
                        int i_16_ = i_8_;
                        i_9_ = i_15_;
                        i_8_ = i_10_;
                        i_10_ = i_16_;
                    }
                    int i_17_ = i_8_;
                    int i_18_ = -i_7_ + i_9_;
                    int i_19_ = -i_8_ + i_10_;
                    int i_20_ = -i_18_ / 2;
                    int i_21_ = 2048 / i_18_;
                    int i_22_ = 1024 - (DisplayModeManagerContainer77.method1097((byte) 90, 4096, random) >> 2);
                    if (i_19_ < 0) i_19_ = -i_19_;
                    int i_23_ = i_10_ <= i_8_ ? -1 : 1;
                    for (int i_24_ = i_7_; i_24_ < i_9_; i_24_++) {
                        int i_25_ = (i_24_ - i_7_) * i_21_ + (i_22_ + 1024);
                        int i_26_ = CustomCursorSetting.anInt6076 & i_24_;
                        int i_27_ = i_17_ & DisplayModeManagerContainer356.anInt6325;
                        if (bool) is_4_[i_27_][i_26_] = i_25_;
                        else is_4_[i_26_][i_27_] = i_25_;
                        i_20_ += i_19_;
                        if (i_20_ > 0) {
                            i_17_ -= -i_23_;
                            i_20_ = -i_18_ + i_20_;
                        }
                    }
                }
            }
        }
        return is;
    }

    public DefinitionSub28() {
        super(0, true);
        anInt9362 = 2000;
        anInt9367 = 0;
    }
}
