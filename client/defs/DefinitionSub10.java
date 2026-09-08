/* DefinitionSub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DefinitionSub10
/**
 * RENAMED from `Class348_Sub40_Sub10` (JODE-obfuscated).
 * Evidence: subclass of Definition (hierarchy)
 */ extends Definition {
    static int anInt9174;
    private int anInt9175;
    private int anInt9176 = 1024;
    static int anInt9177;
    static int anInt9178;
    static int anInt9179;
    static Component17 aClass308_9180;
    static boolean aBoolean9181 = false;
    private int anInt9182;
    static int[] anIntArray9183;
    static boolean aBoolean9184;

    final void method3049(Buffer class348_sub49, int i, int i_0_) {
        anInt9179++;
        int i_1_ = i;
        while_152_:
        do {
            do {
                if (i_1_ == 0) {
                    anInt9176 = class348_sub49.readUnsignedShort(i_0_ ^ 0x323581df);
                    break while_152_;
                } else if (i_1_ != 1) {
                    if (i_1_ == 2) break;
                    break while_152_;
                }
                anInt9175 = class348_sub49.readUnsignedShort(842397944);
                break while_152_;
            } while (false);
            this.use2dImageCache = class348_sub49.readUnsignedByte(255) == 1;
        } while (false);
        if (i_0_ != 31015) method3049(null, -85, -85);
    }

    final void postDecode(int i) {
        anInt9174++;
        anInt9182 = anInt9175 - anInt9176;
        if (i < 108) getMonochromeOutput(-31, 9);
    }

    final int[] getMonochromeOutput(int i, int i_2_) {
        anInt9177++;
        int[] is = this.imageCache.getPixels(0, i);
        if (this.imageCache.cacheMiss) {
            int[] is_3_ = this.method3048(i, 633706337, 0);
            for (int i_4_ = 0; DefinitionSub6.anInt9139 > i_4_; i_4_++)
                is[i_4_] = anInt9176 - -(anInt9182 * is_3_[i_4_] >> 12);
        }
        if (i_2_ != 255) return null;
        return is;
    }

    final int[][] getColourOutput(int i, int i_5_) {
        anInt9178++;
        int[][] is = this.imageCacheStore.getPixels(-113, i);
        if (i_5_ != -1564599039) method3049(null, -10, -112);
        if (this.imageCacheStore.cacheMiss) {
            int[][] is_6_ = this.method3039((byte) -55, i, 0);
            int[] is_7_ = is_6_[0];
            int[] is_8_ = is_6_[1];
            int[] is_9_ = is_6_[2];
            int[] is_10_ = is[0];
            int[] is_11_ = is[1];
            int[] is_12_ = is[2];
            for (int i_13_ = 0; (DefinitionSub6.anInt9139 > i_13_); i_13_++) {
                is_10_[i_13_] = (anInt9182 * is_7_[i_13_] >> 12) + anInt9176;
                is_11_[i_13_] = (anInt9182 * is_8_[i_13_] >> 12) + anInt9176;
                is_12_[i_13_] = (is_9_[i_13_] * anInt9182 >> 12) + anInt9176;
            }
        }
        return is;
    }

    public static void method3074(int i) {
        anIntArray9183 = null;
        aClass308_9180 = null;
        if (i != 0) anIntArray9183 = null;
    }

    public DefinitionSub10() {
        super(1, false);
        anInt9175 = 3072;
        anInt9182 = 2048;
    }

    static {
        aClass308_9180 = new Component17(64);
        anIntArray9183 = new int[4];
        aBoolean9184 = false;
    }
}
