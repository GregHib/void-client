/* DefinitionSub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DefinitionSub11
/**
 * RENAMED from `Class348_Sub40_Sub11` (JODE-obfuscated).
 * Evidence: subclass of Definition (hierarchy)
 */ extends Definition {
    static int[] anIntArray9185 = new int[50];
    static int anInt9186;
    private int anInt9187 = 585;
    static int anInt9188;

    public static void method3075(boolean bool) {
        anIntArray9185 = null;
        if (bool != false) anIntArray9185 = null;
    }

    public DefinitionSub11() {
        super(0, true);
    }

    final int[] getMonochromeOutput(int i, int i_0_) {
        anInt9186++;
        int[] is = this.imageCache.getPixels(0, i);
        if (i_0_ != 255) anIntArray9185 = null;
        if (this.imageCache.cacheMiss) {
            int i_1_ = Component302.anIntArray6035[i];
            for (int i_2_ = 0; (i_2_ < DefinitionSub6.anInt9139); i_2_++) {
                int i_3_ = RenderableSub6.anIntArray6432[i_2_];
                if (anInt9187 < i_3_ && 4096 - anInt9187 > i_3_ && i_1_ > 2048 + -anInt9187 && i_1_ < 2048 + anInt9187) {
                    int i_4_ = -i_3_ + 2048;
                    i_4_ = i_4_ < 0 ? -i_4_ : i_4_;
                    i_4_ <<= 12;
                    i_4_ /= 2048 - anInt9187;
                    is[i_2_] = -i_4_ + 4096;
                } else if (2048 - anInt9187 < i_3_ && anInt9187 + 2048 > i_3_) {
                    int i_5_ = i_1_ + -2048;
                    i_5_ = i_5_ < 0 ? -i_5_ : i_5_;
                    i_5_ -= anInt9187;
                    i_5_ <<= 12;
                    is[i_2_] = i_5_ / (2048 + -anInt9187);
                } else if (anInt9187 > i_1_ || i_1_ > 4096 - anInt9187) {
                    int i_6_ = -2048 + i_3_;
                    i_6_ = i_6_ >= 0 ? i_6_ : -i_6_;
                    i_6_ -= anInt9187;
                    i_6_ <<= 12;
                    is[i_2_] = i_6_ / (2048 + -anInt9187);
                } else if (i_3_ < anInt9187 || i_3_ > 4096 + -anInt9187) {
                    int i_7_ = 2048 + -i_1_;
                    i_7_ = i_7_ < 0 ? -i_7_ : i_7_;
                    i_7_ <<= 12;
                    i_7_ /= 2048 + -anInt9187;
                    is[i_2_] = 4096 - i_7_;
                } else is[i_2_] = 0;
            }
        }
        return is;
    }

    final void method3049(Buffer class348_sub49, int i, int i_8_) {
        anInt9188++;
        if (i_8_ == 31015) {
            int i_9_ = i;
            if (i_9_ == 0) anInt9187 = class348_sub49.readUnsignedShort(842397944);
        }
    }
}
