/* Component201 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component201
/**
 * RENAMED from `Class299_Sub2_Sub1` (JODE-obfuscated).
 * Evidence: subclass of DisplayModeManagerContainer356 (hierarchy)
 */ extends DisplayModeManagerContainer356 {
    private final int anInt8708;
    static int anInt8709;
    static int anInt8710;
    private final int anInt8711;
    static int[] anIntArray8712;
    static double aDouble8713 = -1.0;
    private final int anInt8714;
    private final int anInt8715;
    private final int anInt8716;
    private final int anInt8717;
    private final GlToolkitSub3 aHa_Sub3_8718;
    private Interface18_Impl2 anInterface18_Impl2_8719;
    static int anInt8720;

    final Interface18_Impl2 method2266(boolean bool) {
        if (bool != true) return null;
        anInt8720++;
        if (anInterface18_Impl2_8719 == null) {
            Component148.anIntArray3464[3] = anInt8711;
            Component148.anIntArray3464[1] = anInt8717;
            Component148.anIntArray3464[4] = anInt8708;
            d var_d = aHa_Sub3_8718.modelProvider;
            Component148.anIntArray3464[5] = anInt8714;
            Component148.anIntArray3464[2] = anInt8715;
            Component148.anIntArray3464[0] = anInt8716;
            boolean bool_0_ = false;
            int i = 0;
            for (int i_1_ = 0; i_1_ < 6; i_1_++) {
                if (!var_d.isModelLoaded(-7953, Component148.anIntArray3464[i_1_])) return null;
                Model class12 = var_d.getModel(Component148.anIntArray3464[i_1_], -6662);
                int i_2_ = class12.aBoolean199 ? 64 : 128;
                if (i < i_2_) i = i_2_;
                if (class12.aByte205 > 0) bool_0_ = true;
            }
            for (int i_3_ = 0; i_3_ < 6; i_3_++)
                Component329.anIntArrayArray5991[i_3_] = var_d.getTriangles(false, Component148.anIntArray3464[i_3_], 1.0F, i, i, 81);
            anInterface18_Impl2_8719 = aHa_Sub3_8718.hint(Component329.anIntArrayArray5991, bool_0_, 61, i);
        }
        return anInterface18_Impl2_8719;
    }

    static final void method2270(int i, int i_4_, GraphicsToolkit var_ha, String string, boolean bool, int i_5_, int i_6_, int i_7_) {
        try {
            if (OutputStream_Sub2.aClass105_106 == null || Component221.aClass105_1800 == null) {
                if (Component158.aClass45_322.isSingletonFileReady(false, BuildType.anInt2996) && Component158.aClass45_322.isSingletonFileReady(false, ToolbarRefreshDefinition.anInt9231)) {
                    OutputStream_Sub2.aClass105_106 = (var_ha.method3691(Component170.method1521(Component158.aClass45_322, BuildType.anInt2996, 0), true));
                    Component170 class207 = Component170.method1521(Component158.aClass45_322, ToolbarRefreshDefinition.anInt9231, 0);
                    Component221.aClass105_1800 = var_ha.method3691(class207, true);
                    class207.method1518();
                    NodeSub5.aClass105_6627 = var_ha.method3691(class207, true);
                } else var_ha.fillRect2D(i_4_, i_5_, i, i_7_, (255 + -ObjectDefinition.anInt948 << 24 | Component235.anInt3376), 1);
            }
            anInt8709++;
            if (OutputStream_Sub2.aClass105_106 != null && Component221.aClass105_1800 != null) {
                int i_8_ = ((i - 2 * Component221.aClass105_1800.method971()) / OutputStream_Sub2.aClass105_106.method971());
                for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
                    OutputStream_Sub2.aClass105_106.drawAt((Component221.aClass105_1800.method971() + i_4_ + (OutputStream_Sub2.aClass105_106.method971() * i_9_)), i_5_);
                Component221.aClass105_1800.drawAt(i_4_, i_5_);
                NodeSub5.aClass105_6627.drawAt((-NodeSub5.aClass105_6627.method971() + i_4_ - -i), i_5_);
            }
            if (bool == false) {
                NodeList.aClass324_3326.drawText(string, (StringDefinition.anInt9586) | ~0xffffff, 14 + i_5_, 3 + i_4_, -1, -127);
                var_ha.fillRect2D(i_4_, i_7_ + i_5_, i, i_6_ + -i_7_, (Component235.anInt3376 | 255 + -ObjectDefinition.anInt948 << 24), 1);
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("kv.G(" + i + ',' + i_4_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ',' + bool + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ')'));
        }
    }

    static final void method2271(int i) {
        anInt8710++;
        if (!Component326.aBoolean5265) {
            InflaterDecompressor.disposeSceneEntities(0, Component304.aClass357ArrayArrayArray1148);
            if (ImageProducerSprite.aClass357ArrayArrayArray9082 != null) InflaterDecompressor.disposeSceneEntities(0, (ImageProducerSprite.aClass357ArrayArrayArray9082));
            Component326.aBoolean5265 = true;
        }
    }

    public static void method2272(int i) {
        if (i < 85) method2271(-124);
        anIntArray8712 = null;
    }

    Component201(GlToolkitSub3 var_ha_Sub3, int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
        anInt8715 = i_11_;
        anInt8708 = i_13_;
        anInt8716 = i;
        anInt8711 = i_12_;
        anInt8717 = i_10_;
        anInt8714 = i_14_;
        aHa_Sub3_8718 = var_ha_Sub3;
    }
}
