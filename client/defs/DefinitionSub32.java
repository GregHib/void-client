/* DefinitionSub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DefinitionSub32
/**
 * RENAMED from `Class348_Sub40_Sub32` (JODE-obfuscated).
 * Evidence: subclass of Definition (hierarchy)
 */ extends Definition {
    static int anInt9414;
    static Component224 aClass273_9415 = new Component224("", 12);
    static int anInt9416;
    static int anInt9417;
    static int anInt9418;
    static int anInt9419;
    static int anInt9420;
    private static short[] aShortArray9421 = {-10304, 9104, 25485, 4620, 4540};
    private static short[] aShortArray9422 = {-1, -1, -1, -1, -1};
    private static short[] aShortArray9423 = {6798, 8741, 25238, 4626, 4550};
    static short[][] aShortArrayArray9424 = {aShortArray9423, aShortArray9421, aShortArray9422};

    static final GlRectangleTexture method3132(int[] is, int i, int i_0_, int i_1_, int i_2_, GlToolkitSub2 var_ha_Sub2, boolean bool, byte i_3_) {
        try {
            if (i_3_ != 12) method3134(9);
            anInt9418++;
            if (!var_ha_Sub2.aBoolean7793 && (!Component353.method1436(-74, i_2_) || !Component353.method1436(127, i_1_))) {
                if (!var_ha_Sub2.aBoolean7837) return (new GlRectangleTexture(var_ha_Sub2, i_2_, i_1_, Component373.nextPowerOfTwo(i_2_, (byte) 108), Component373.nextPowerOfTwo(i_1_, (byte) 108), is));
                return new GlRectangleTexture(var_ha_Sub2, 34037, i_2_, i_1_, bool, is, i_0_, i);
            }
            return new GlRectangleTexture(var_ha_Sub2, 3553, i_2_, i_1_, bool, is, i_0_, i);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("wi.C(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + bool + ',' + i_3_ + ')'));
        }
    }

    public static void method3133(byte i) {
        aClass273_9415 = null;
        if (i != -109) aClass273_9415 = null;
        aShortArray9423 = null;
        aShortArray9421 = null;
        aShortArrayArray9424 = null;
        aShortArray9422 = null;
    }

    static final void method3134(int i) {
        anInt9419++;
        if ((~SpriteAtlasShader.anInt6248) <= i) {
            long l = Component240.currentTimeMillis(i ^ 0x3c);
            SpriteAtlasShader.anInt6248 -= -ObjectDeserializer.aLong6963 + l;
            if (SpriteAtlasShader.anInt6248 > 0) {
                int i_4_ = ((SpriteAtlasShader.anInt6248 << 8) / DisplayModeManagerContainer105.anInt4889);
                int i_5_ = -i_4_ + 255;
                float f = (float) i_4_ / 255.0F;
                float f_6_ = 1.0F - f;
                DisplayModeManagerContainer96.anInt4703 = (((i_5_ * ((Component329.aClass190_5990.anInt2540) & 0xff00ff) + (Component327.anInt8739 & 0xff00ff) * i_4_) & ~0xff00ff) - -(0xff0000 & (i_4_ * (0xff00 & Component327.anInt8739) + (0xff00 & (Component329.aClass190_5990.anInt2540)) * i_5_))) >>> 8;
                Component98.aFloat5945 = (AbstractGlTextureSub4.aFloat8560 + f_6_ * ((Component329.aClass190_5990.aFloat2551) - AbstractGlTextureSub4.aFloat8560));
                NodeSub3.aFloat6586 = (Component329.aClass190_5990.aFloat2545 - CacheStore.aFloat670) * f_6_ + CacheStore.aFloat670;
                Component129.anInt486 = (i_4_ * Component372.anInt6042 + (Component329.aClass190_5990.anInt2546 * i_5_)) >> 8;
                Component214.aFloat2137 = (DisplayModeManagerContainer28.aFloat8725 + (-DisplayModeManagerContainer28.aFloat8725 + (Component329.aClass190_5990.aFloat2547)) * f_6_);
                ModelStore.aFloat4626 = (DisplayModeManagerContainer370.aFloat1136 + f_6_ * ((Component329.aClass190_5990.aFloat2544) - DisplayModeManagerContainer370.aFloat1136));
                Component38.anInt2500 = (((i_4_ * (0xff00 & Canvas_Sub1.anInt70) + (0xff00 & (Component329.aClass190_5990.anInt2549)) * i_5_) & 0xff0000) + (~0xff00ff & (i_4_ * (0xff00ff & Canvas_Sub1.anInt70) - -(i_5_ * (0xff00ff & (Component329.aClass190_5990.anInt2549)))))) >>> 8;
                CollisionMap.aFloat4455 = (Component163.aFloat3177 + f_6_ * (-Component163.aFloat3177 + (Component329.aClass190_5990.aFloat2536)));
                Component209.aFloat3462 = (DebugOverlay.aFloat3172 + (Component329.aClass190_5990.aFloat2542 - DebugOverlay.aFloat3172) * f_6_);
                if (ColoredText.aClass299_6098 != (Component329.aClass190_5990.aClass299_2541)) HeapDumpHelper.aClass299_4938 = (NodeCache.aHa1098.method3706(ColoredText.aClass299_6098, (Component329.aClass190_5990.aClass299_2541), f_6_, HeapDumpHelper.aClass299_4938));
            } else {
                HeapDumpHelper.aClass299_4938 = (Component329.aClass190_5990.aClass299_2541);
                ModelStore.aFloat4626 = Component329.aClass190_5990.aFloat2544;
                NodeSub3.aFloat6586 = Component329.aClass190_5990.aFloat2545;
                Component98.aFloat5945 = Component329.aClass190_5990.aFloat2551;
                Component129.anInt486 = Component329.aClass190_5990.anInt2546;
                Component209.aFloat3462 = Component329.aClass190_5990.aFloat2542;
                CollisionMap.aFloat4455 = Component329.aClass190_5990.aFloat2536;
                SpriteAtlasShader.anInt6248 = -1;
                Component38.anInt2500 = Component329.aClass190_5990.anInt2549;
                DisplayModeManagerContainer96.anInt4703 = Component329.aClass190_5990.anInt2540;
                Component214.aFloat2137 = Component329.aClass190_5990.aFloat2547;
            }
            ObjectDeserializer.aLong6963 = l;
        }
    }

    static final Component203 method3135(int i, int i_7_, int i_8_) {
        Component186 class357 = Component335.aClass357ArrayArrayArray2029[i][i_7_][i_8_];
        if (class357 == null) return null;
        return class357.aClass318_Sub1_Sub5_4395;
    }

    final int[][] getColourOutput(int i, int i_9_) {
        if (i_9_ != -1564599039) method3133((byte) 4);
        anInt9417++;
        int[][] is = this.imageCacheStore.getPixels(-78, i);
        if (this.imageCacheStore.cacheMiss) {
            int[][] is_10_ = this.method3039((byte) -104, i, 0);
            int[] is_11_ = is_10_[0];
            int[] is_12_ = is_10_[1];
            int[] is_13_ = is_10_[2];
            int[] is_14_ = is[0];
            int[] is_15_ = is[1];
            int[] is_16_ = is[2];
            for (int i_17_ = 0; DefinitionSub6.anInt9139 > i_17_; i_17_++) {
                is_14_[i_17_] = -is_11_[i_17_] + 4096;
                is_15_[i_17_] = 4096 + -is_12_[i_17_];
                is_16_[i_17_] = -is_13_[i_17_] + 4096;
            }
        }
        return is;
    }

    public DefinitionSub32() {
        super(1, false);
    }

    final int[] getMonochromeOutput(int i, int i_18_) {
        anInt9420++;
        int[] is = this.imageCache.getPixels(0, i);
        if (i_18_ != 255) getColourOutput(-113, -46);
        if (this.imageCache.cacheMiss) {
            int[] is_19_ = this.method3048(i, 633706337, 0);
            for (int i_20_ = 0; (i_20_ < DefinitionSub6.anInt9139); i_20_++)
                is[i_20_] = 4096 + -is_19_[i_20_];
        }
        return is;
    }

    final void method3049(Buffer class348_sub49, int i, int i_21_) {
        anInt9414++;
        if (i_21_ != 31015) aClass273_9415 = null;
        if (i == 0) this.use2dImageCache = class348_sub49.readUnsignedByte(255) == 1;
    }

    static final String method3136(byte i, Buffer class348_sub49) {
        anInt9416++;
        if (i != 64) aShortArray9423 = null;
        return BasicMouseHandler.readJagStringLimited(32767, class348_sub49, -77);
    }
}
