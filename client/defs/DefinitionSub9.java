/* DefinitionSub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DefinitionSub9
/**
 * RENAMED from `Class348_Sub40_Sub9` (JODE-obfuscated).
 * Evidence: subclass of Definition (hierarchy)
 */ extends Definition {
    static int anInt9166;
    private int anInt9167 = 4096;
    static int anInt9168;
    static Applet_Sub1 anApplet_Sub1_9169 = null;
    static int anInt9170;
    static NodeCache aClass60_9171 = new NodeCache(4);
    static int anInt9172;
    static BitmapFont aClass324_9173;

    public static void method3071(byte i) {
        if (i != 59) anApplet_Sub1_9169 = null;
        aClass60_9171 = null;
        aClass324_9173 = null;
    }

    public DefinitionSub9() {
        super(1, true);
    }

    static final void method3072(byte i) {
        anInt9168++;
        int i_0_ = Component192.preferences.aClass239_Sub14_7264.method1778(-32350);
        int i_1_ = 14 / ((i - -34) / 61);
        if (i_0_ == 0) {
            Component156.aByteArrayArrayArray3700 = null;
            DisplayModeManagerContainer57.method440(0, (byte) -61);
        } else if (i_0_ == 1) {
            Component281.method2280((byte) 0, 28587);
            DisplayModeManagerContainer57.method440(512, (byte) -61);
            if (ObjectDeserializer.aByteArrayArrayArray6962 != null) DisplayModeManagerContainer104.method2468(3613);
        } else {
            Component281.method2280((byte) (-4 + DisplayModeManagerContainer341.anInt6006 & 0xff), 28587);
            DisplayModeManagerContainer57.method440(2, (byte) -61);
        }
        DisplayModeManagerContainer174.anInt10395 = Component117.anInt4372;
    }

    final void method3049(Buffer class348_sub49, int i, int i_2_) {
        if (i_2_ != 31015) getMonochromeOutput(-111, 25);
        anInt9170++;
        if (i == 0) anInt9167 = class348_sub49.readUnsignedShort(842397944);
    }

    static final boolean method3073(int i, int i_3_, byte i_4_) {
        anInt9172++;
        if (i_4_ != 50) return false;
        return (0x34 & i_3_) != 0;
    }

    final int[] getMonochromeOutput(int i, int i_5_) {
        anInt9166++;
        int[] is = this.imageCache.getPixels(0, i);
        if (this.imageCache.cacheMiss) {
            int[] is_6_ = this.method3048(DisplayModeManagerContainer356.anInt6325 & -1 + i, 633706337, 0);
            int[] is_7_ = this.method3048(i, 633706337, 0);
            int[] is_8_ = this.method3048(i - -1 & DisplayModeManagerContainer356.anInt6325, 633706337, 0);
            for (int i_9_ = 0; DefinitionSub6.anInt9139 > i_9_; i_9_++) {
                int i_10_ = anInt9167 * (-is_6_[i_9_] + is_8_[i_9_]);
                int i_11_ = (anInt9167 * (-is_7_[CustomCursorSetting.anInt6076 & -1 + i_9_] + is_7_[CustomCursorSetting.anInt6076 & i_9_ - -1]));
                int i_12_ = i_11_ >> 12;
                int i_13_ = i_10_ >> 12;
                int i_14_ = i_12_ * i_12_ >> 12;
                int i_15_ = i_13_ * i_13_ >> 12;
                int i_16_ = (int) (4096.0 * Math.sqrt((float) (i_15_ + (i_14_ - -4096)) / 4096.0F));
                int i_17_ = i_16_ != 0 ? 16777216 / i_16_ : 0;
                is[i_9_] = 4096 - i_17_;
            }
        }
        return is;
    }
}
