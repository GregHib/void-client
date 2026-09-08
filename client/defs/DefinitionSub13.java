/* DefinitionSub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DefinitionSub13
/**
 * RENAMED from `Class348_Sub40_Sub13` (JODE-obfuscated).
 * Evidence: subclass of Definition (hierarchy)
 */ extends Definition {
    static NodeList aClass262_9201;
    static int anInt9202;
    static int anInt9203 = -1;
    static float aFloat9204;

    public static void method3080(byte i) {
        aClass262_9201 = null;
        if (i < 39) method3080((byte) 100);
    }

    public DefinitionSub13() {
        super(1, true);
    }

    final int[] getMonochromeOutput(int i, int i_0_) {
        anInt9202++;
        int[] is = this.imageCache.getPixels(i_0_ + -255, i);
        if (i_0_ != 255) getMonochromeOutput(19, -84);
        if (this.imageCache.cacheMiss) {
            int[][] is_1_ = this.method3039((byte) -119, i, 0);
            int[] is_2_ = is_1_[0];
            int[] is_3_ = is_1_[1];
            int[] is_4_ = is_1_[2];
            for (int i_5_ = 0; DefinitionSub6.anInt9139 > i_5_; i_5_++)
                is[i_5_] = (is_2_[i_5_] - (-is_3_[i_5_] - is_4_[i_5_])) / 3;
        }
        return is;
    }

    static {
        aClass262_9201 = new NodeList();
        aFloat9204 = 0.25F;
    }
}
