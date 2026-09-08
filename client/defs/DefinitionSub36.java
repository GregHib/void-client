/* DefinitionSub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DefinitionSub36
/**
 * RENAMED from `Class348_Sub40_Sub36` (JODE-obfuscated).
 * Evidence: subclass of Definition (hierarchy)
 */ extends Definition {
    static int anInt9450;
    private int anInt9451 = 0;
    static int anInt9452;
    private int anInt9453 = 1;
    static int anInt9454;
    private int anInt9455 = 0;
    static Component183 aClass114_9456;

    public DefinitionSub36() {
        super(0, true);
    }

    final void method3049(Buffer class348_sub49, int i, int i_0_) {
        anInt9450++;
        if (i_0_ != 31015) anInt9451 = -15;
        int i_1_ = i;
        while_211_:
        do {
            do {
                if (i_1_ == 0) {
                    anInt9451 = class348_sub49.readUnsignedByte(255);
                    return;
                } else if (i_1_ != 1) {
                    if (i_1_ == 3) break;
                    break while_211_;
                }
                anInt9455 = class348_sub49.readUnsignedByte(255);
                return;
            } while (false);
            anInt9453 = class348_sub49.readUnsignedByte(255);
        } while (false);
    }

    final void postDecode(int i) {
        Component7.method1605(26188);
        if (i <= 108) method3145(-17);
        anInt9452++;
    }

    public static void method3145(int i) {
        if (i != 0) aClass114_9456 = null;
        aClass114_9456 = null;
    }

    final int[] getMonochromeOutput(int i, int i_2_) {
        anInt9454++;
        int[] is = this.imageCache.getPixels(0, i);
        if (i_2_ != 255) anInt9451 = -74;
        if (this.imageCache.cacheMiss) {
            int i_3_ = Component302.anIntArray6035[i];
            int i_4_ = -2048 + i_3_ >> 1;
            for (int i_5_ = 0; (i_5_ < DefinitionSub6.anInt9139); i_5_++) {
                int i_6_ = RenderableSub6.anIntArray6432[i_5_];
                int i_7_ = -2048 + i_6_ >> 1;
                int i_8_;
                if (anInt9451 == 0) i_8_ = anInt9453 * (-i_3_ + i_6_);
                else {
                    int i_9_ = i_7_ * i_7_ + i_4_ * i_4_ >> 12;
                    i_8_ = (int) (4096.0 * Math.sqrt((float) i_9_ / 4096.0F));
                    i_8_ = (int) (3.141592653589793 * (double) (anInt9453 * i_8_));
                }
                i_8_ -= ~0xfff & i_8_;
                if (anInt9455 != 0) {
                    if (anInt9455 == 2) {
                        i_8_ -= 2048;
                        if (i_8_ < 0) i_8_ = -i_8_;
                        i_8_ = 2048 - i_8_ << 1;
                    }
                } else i_8_ = 4096 + (Component366.anIntArray3068[i_8_ >> 4 & 0xff]) >> 1;
                is[i_5_] = i_8_;
            }
        }
        return is;
    }
}
