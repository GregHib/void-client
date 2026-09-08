/* DefinitionSub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DefinitionSub39
/**
 * RENAMED from `Class348_Sub40_Sub39` (JODE-obfuscated).
 * Evidence: subclass of Definition (hierarchy)
 */ extends Definition {
    private Component47[] aClass50Array9481;
    static int anInt9482;
    static int anInt9483;
    static int anInt9484;
    static DisplayModeManagerContainer88 aClass70_9485 = new DisplayModeManagerContainer88();
    static int anInt9486;
    static int anInt9487;

    private final void method3151(int[][] is, byte i) {
        anInt9487++;
        if (i != -27) method3152(86);
        int i_0_ = DefinitionSub6.anInt9139;
        int i_1_ = ShaderProgramSub2.anInt6212;
        Model.method224((byte) -40, is);
        NodeSub27.method3000(CustomCursorSetting.anInt6076, 0, DisplayModeManagerContainer356.anInt6325, 0, i ^ 0x28);
        if (aClass50Array9481 != null) {
            for (int i_2_ = 0; aClass50Array9481.length > i_2_; i_2_++) {
                Component47 class50 = aClass50Array9481[i_2_];
                int i_3_ = class50.anInt864;
                int i_4_ = class50.anInt865;
                if (i_3_ < 0) {
                    if (i_4_ >= 0) class50.method457(i_1_, i_0_, -43);
                } else if (i_4_ < 0) class50.method456(i ^ ~0x6a, i_0_, i_1_);
                else class50.method455(i_0_, i_1_, -124);
            }
        }
    }

    public static void method3152(int i) {
        aClass70_9485 = null;
        if (i != 255) method3152(-42);
    }

    final int[] getMonochromeOutput(int i, int i_5_) {
        anInt9486++;
        int[] is = this.imageCache.getPixels(i_5_ + -255, i);
        if (this.imageCache.cacheMiss) method3151(this.imageCache.getAllBuffers((byte) 16), (byte) -27);
        if (i_5_ != 255) method3049(null, 66, -50);
        return is;
    }

    static final void method3153(int i) {
        anInt9482++;
        for (HashNodeSub13 class348_sub42_sub13 = ((HashNodeSub13) Component237.aClass107_3022.first(-49)); class348_sub42_sub13 != null; class348_sub42_sub13 = ((HashNodeSub13) Component237.aClass107_3022.next((byte) 51))) {
            if (class348_sub42_sub13.anInt9615 > 1) {
                class348_sub42_sub13.anInt9615 = 0;
                Component293.aClass60_3301.putOne(class348_sub42_sub13, ((MenuEntry) class348_sub42_sub13.aClass107_9621.sentinel.next).groupKey, (byte) -108);
                class348_sub42_sub13.aClass107_9621.clear(i ^ 0x7dc976c2);
            }
        }
        DisplayModeManagerContainer345.anInt166 = 0;
        DisplayModeManagerContainer306.menuEntryCount = i;
        DefinitionSub4.menuEntries.clear(125);
        MenuEntry.aClass356_9603.clear(0);
        Component237.aClass107_3022.clear(2110355138);
        Component364.aBoolean8335 = false;
    }

    final void method3049(Buffer class348_sub49, int i, int i_6_) {
        if (i_6_ != 31015) aClass70_9485 = null;
        if (i == 0) {
            aClass50Array9481 = new Component47[class348_sub49.readUnsignedByte(255)];
            while_216_:
            for (int i_7_ = 0; aClass50Array9481.length > i_7_; i_7_++) {
                int i_8_ = class348_sub49.readUnsignedByte(255);
                int i_9_ = i_8_;
                while_214_:
                do {
                    do {
                        if (i_9_ == 0) {
                            aClass50Array9481[i_7_] = Component280.method1374(107, class348_sub49);
                            continue while_216_;
                        } else if (i_9_ != 1) {
                            if (i_9_ != 2) {
                                if (i_9_ != 3) continue while_216_;
                            } else break;
                            break while_214_;
                        }
                        aClass50Array9481[i_7_] = (OggUrlStream.method2970(NodeSub21.bitwiseXor(i_6_, 31013), class348_sub49));
                        continue while_216_;
                    } while (false);
                    aClass50Array9481[i_7_] = (Definition.method3036(class348_sub49, NodeSub21.bitwiseXor(i_6_, -31102)));
                    continue while_216_;
                } while (false);
                aClass50Array9481[i_7_] = DisplayModeManagerContainer232.method2022(class348_sub49, 0);
            }
        } else if (i == 1) this.use2dImageCache = class348_sub49.readUnsignedByte(255) == 1;
        anInt9484++;
    }

    final int[][] getColourOutput(int i, int i_10_) {
        anInt9483++;
        int[][] is = this.imageCacheStore.getPixels(i_10_ + 1564598923, i);
        if (i_10_ != -1564599039) aClass70_9485 = null;
        if (this.imageCacheStore.cacheMiss) {
            int i_11_ = DefinitionSub6.anInt9139;
            int i_12_ = ShaderProgramSub2.anInt6212;
            int[][] is_13_ = new int[i_12_][i_11_];
            int[][][] is_14_ = this.imageCacheStore.getAllBuffers(0);
            method3151(is_13_, (byte) -27);
            for (int i_15_ = 0; ShaderProgramSub2.anInt6212 > i_15_; i_15_++) {
                int[] is_16_ = is_13_[i_15_];
                int[][] is_17_ = is_14_[i_15_];
                int[] is_18_ = is_17_[0];
                int[] is_19_ = is_17_[1];
                int[] is_20_ = is_17_[2];
                for (int i_21_ = 0; i_21_ < DefinitionSub6.anInt9139; i_21_++) {
                    int i_22_ = is_16_[i_21_];
                    is_20_[i_21_] = GpsOverlay.bitwiseAnd(i_22_, 255) << 4;
                    is_19_[i_21_] = GpsOverlay.bitwiseAnd(i_22_ >> 4, 4080);
                    is_18_[i_21_] = GpsOverlay.bitwiseAnd(4080, i_22_ >> 12);
                }
            }
        }
        return is;
    }

    public DefinitionSub39() {
        super(0, true);
    }
}
