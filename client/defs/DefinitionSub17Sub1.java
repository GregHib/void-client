/* DefinitionSub17Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DefinitionSub17Sub1
/**
 * RENAMED from `Class348_Sub40_Sub17_Sub1` (JODE-obfuscated).
 * Evidence: subclass of DefinitionSub17 (hierarchy)
 */ extends DefinitionSub17 {
    static int anInt10425;
    static CacheStore aClass45_10426;
    static int anInt10427;

    public DefinitionSub17Sub1() {
        /* empty */
    }

    final int[][] getColourOutput(int i, int i_0_) {
        if (i_0_ != -1564599039) method3093(54);
        anInt10425++;
        int[][] is = this.imageCacheStore.getPixels(-93, i);
        if (this.imageCacheStore.cacheMiss && this.method3090(true)) {
            int[] is_1_ = is[0];
            int[] is_2_ = is[1];
            int[] is_3_ = is[2];
            int i_4_ = (this.anInt9241 * (i % this.anInt9241));
            for (int i_5_ = 0; i_5_ < DefinitionSub6.anInt9139; i_5_++) {
                int i_6_ = (this.anIntArray9232[(i_5_ % this.anInt9237 + i_4_)]);
                is_3_[i_5_] = GpsOverlay.bitwiseAnd(4080, i_6_ << 4);
                is_2_[i_5_] = GpsOverlay.bitwiseAnd(65280, i_6_) >> 4;
                is_1_[i_5_] = GpsOverlay.bitwiseAnd(4080, i_6_ >> 12);
            }
        }
        return is;
    }

    public static void method3092(int i) {
        if (i != -1) aClass45_10426 = null;
        aClass45_10426 = null;
    }

    static final void method3093(int i) {
        if (i > 85) {
            anInt10427++;
            NodeSub5.method2755(-1, 255, -1);
        }
    }
}
