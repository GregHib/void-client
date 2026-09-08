/* s - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

/**
 * Scene floor / heightmap plane (JODE single-letter name {@code s} — do not
 * regex-rename; collisions with locals and string literals).
 * <p>
 * Tile grid is {@link #tileWidth}×{@link #tileLength}. World units per tile =
 * {@link #tileSize} ({@code 1 <<} {@link #tileSizeBits}, usually 512 / 9).
 * {@link #heights}[x][z] stores raw height; {@link #getInterpolatedHeight}
 * bilinear-samples between four corners for sub-tile world coords.
 */
abstract class s {
    /** Raw height samples per tile corner; indexed [tileX][tileZ]. */
    int[][] heights;
    static CacheStore aClass45_4585;
    static int anInt4586;
    /** Tile count along X. */
    int tileWidth;
    /** {@code log2(tileSize)} — shift world→tile and for fixed-point lerp. */
    int tileSizeBits;
    static int anInt4589;
    /** Tile count along Z. */
    int tileLength;
    static int anInt4591;
    /** World units per tile ({@code 1 << tileSizeBits}). */
    int tileSize;
    static int anInt4593;

    abstract void method3978(int i, int i_0_, int[] is, int[] is_1_, int[] is_2_, int[] is_3_, int[] is_4_, int[] is_5_, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, int i_11_, int i_12_, int i_13_, boolean bool);

    abstract void method3979(int i, int i_14_);

    static final void method3980(int i, Canvas canvas) {
        if (i > 85) {
            anInt4586++;
            Dimension dimension = canvas.getSize();
            LogicError.method828((byte) 38, dimension.height, dimension.width);
            if (Buffer.anInt7207 != 1) Component158.aHa326.method3669(canvas, Component210.anInt5283, HashTable.anInt1651);
            else Component158.aHa326.method3669(canvas, GpiLogger.anInt8854, Component25.anInt6008);
        }
    }

    abstract void Interface4Impl(r var_r, int i, int i_15_, int i_16_, int i_17_, boolean bool);

    abstract void ka(int i, int i_18_, int i_19_);

    abstract void method3981(NodeSub1 class348_sub1, int[] is);

    /** Returns the raw height sample at tile ({@code i_21_},{@code i_20_}). */
    final int getHeight(byte i, int i_20_, int i_21_) {
        anInt4593++;
        if (i != -86) this.tileLength = -59;
        return this.heights[i_21_][i_20_];
    }

    abstract void method3983(int i, int i_22_, int i_23_, boolean[][] bools, boolean bool, int i_24_);

    abstract void method3984(int i, int i_25_, int i_26_, boolean[][] bools, boolean bool, int i_27_, int i_28_);

    static final Component335 method3985(int i, int i_29_) {
        anInt4591++;
        if (i != -101) method3980(-117, null);
        if (i_29_ < 0 || i_29_ >= 100) return null;
        return RenderableSub2.aClass147Array6400[i_29_];
    }

    /**
     * Bilinear height at world ({@code i},{@code i_30_}): shift by
     * {@link #tileSizeBits}, mask with {@link #tileSize}-1, lerp four corners.
     */
    final int getInterpolatedHeight(int i, int i_30_, byte i_31_) {
        anInt4589++;
        int i_32_ = i >> this.tileSizeBits;
        int i_33_ = i_30_ >> this.tileSizeBits;
        if (i_32_ < 0 || i_33_ < 0 || i_32_ > -1 + this.tileWidth || i_33_ > this.tileLength - 1) return 0;
        int i_34_ = -78 % ((i_31_ - -53) / 36);
        int i_35_ = i & this.tileSize + -1;
        int i_36_ = i_30_ & this.tileSize - 1;
        int i_37_ = ((((-i_35_ + this.tileSize) * this.heights[i_32_][i_33_]) - -(this.heights[i_32_ - -1][i_33_] * i_35_)) >> this.tileSizeBits);
        int i_38_ = ((i_35_ * this.heights[1 + i_32_][1 + i_33_] + ((this.tileSize - i_35_) * this.heights[i_32_][i_33_ + 1])) >> this.tileSizeBits);
        return (i_36_ * i_38_ + (this.tileSize + -i_36_) * i_37_ >> this.tileSizeBits);
    }

    abstract void method3987(int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, boolean[][] bools);

    abstract void U(int i, int i_45_, int[] is, int[] is_46_, int[] is_47_, int[] is_48_, int[] is_49_, int[] is_50_, int[] is_51_, int[] is_52_, int i_53_, int i_54_, int i_55_, boolean bool);

    public static void method3988(int i) {
        int i_56_ = 49 / ((15 - i) / 40);
        aClass45_4585 = null;
    }

    abstract void CA(r var_r, int i, int i_57_, int i_58_, int i_59_, boolean bool);

    s(int i, int i_60_, int i_61_, int[][] is) {
        this.tileWidth = i;
        this.tileLength = i_60_;
        int i_62_ = 0;
        for (/**/; i_61_ > 1; i_61_ >>= 1)
            i_62_++;
        this.tileSize = 1 << i_62_;
        this.heights = is;
        this.tileSizeBits = i_62_;
    }

    abstract boolean method3989(r var_r, int i, int i_63_, int i_64_, int i_65_, boolean bool);

    abstract void YA();

    abstract r fa(int i, int i_66_, r var_r);
}
