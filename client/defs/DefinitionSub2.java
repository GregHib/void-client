/* DefinitionSub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DefinitionSub2
/**
 * RENAMED from `Class348_Sub40_Sub2` (JODE-obfuscated).
 * Evidence: subclass of Definition (hierarchy)
 */ extends Definition {
    private int anInt9095 = 1;
    static int[] anIntArray9096 = new int[2];
    static int anInt9097;
    private int anInt9098 = 204;
    private int anInt9099 = 1;
    static int anInt9100;
    static int anInt9101 = -1;

    final void method3049(Buffer class348_sub49, int i, int i_0_) {
        anInt9100++;
        int i_1_ = i;
        while_132_:
        do {
            do {
                if (i_1_ == 0) {
                    anInt9099 = class348_sub49.readUnsignedByte(i_0_ ^ 0x79d8);
                    break while_132_;
                } else if (i_1_ != 1) {
                    if (i_1_ == 2) break;
                    break while_132_;
                }
                anInt9095 = class348_sub49.readUnsignedByte(255);
                break while_132_;
            } while (false);
            anInt9098 = class348_sub49.readUnsignedShort(842397944);
        } while (false);
        if (i_0_ != 31015) getMonochromeOutput(-14, -114);
    }

    public DefinitionSub2() {
        super(0, true);
    }

    public static void method3053(int i) {
        if (i == 4) anIntArray9096 = null;
    }

    final int[] getMonochromeOutput(int i, int i_2_) {
        anInt9097++;
        int[] is = this.imageCache.getPixels(0, i);
        if (this.imageCache.cacheMiss) {
            int i_3_ = 0;
            for (/**/; i_3_ < DefinitionSub6.anInt9139; i_3_++) {
                int i_4_ = RenderableSub6.anIntArray6432[i_3_];
                int i_5_ = Component302.anIntArray6035[i];
                int i_6_ = anInt9099 * i_4_ >> 12;
                int i_7_ = anInt9095 * i_5_ >> 12;
                int i_8_ = i_4_ % (4096 / anInt9099) * anInt9099;
                int i_9_ = i_5_ % (4096 / anInt9095) * anInt9095;
                if (i_9_ < anInt9098) {
                    for (i_6_ -= i_7_; i_6_ < 0; i_6_ += 4) {
                        /* empty */
                    }
                    for (/**/; i_6_ > 3; i_6_ -= 4) {
                        /* empty */
                    }
                    if (i_6_ != 1) {
                        is[i_3_] = 0;
                        continue;
                    }
                    if (anInt9098 > i_8_) {
                        is[i_3_] = 0;
                        continue;
                    }
                }
                if (i_8_ < anInt9098) {
                    for (i_6_ -= i_7_; i_6_ < 0; i_6_ += 4) {
                        /* empty */
                    }
                    for (/**/; i_6_ > 3; i_6_ -= 4) {
                        /* empty */
                    }
                    if (i_6_ > 0) {
                        is[i_3_] = 0;
                        continue;
                    }
                }
                is[i_3_] = 4096;
            }
        }
        if (i_2_ != 255) anIntArray9096 = null;
        return is;
    }
}
