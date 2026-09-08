/* Component329 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Component329
/**
 * RENAMED from `Class239_Sub14` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static int anInt5982;
    static int anInt5983;
    static int anInt5984;
    static int anInt5985;
    static int anInt5986;
    static int anInt5987;
    static int anInt5988;
    static Component111 aClass251_5989 = new Component111();
    static DisplayModeManagerContainer56 aClass190_5990;
    static int[][] anIntArrayArray5991 = new int[6][];
    static Component183 aClass114_5992 = new Component183(17, 4);
    static DisplayModeManagerContainer159[] aClass211Array5993;
    static int anInt5994;
    static Component293 aClass259_5995;

    final int method1778(int i) {
        if (i != -32350) aClass190_5990 = null;
        anInt5984++;
        return this.preferenceValue;
    }

    final void validateValue(boolean bool) {
        if (this.preferences.aClass239_Sub3_7222.method1735(bool) && this.preferenceValue == 2) this.preferenceValue = 1;
        anInt5988++;
        if (this.preferenceValue < 0 || this.preferenceValue > 2) this.preferenceValue = getDefaultValue(20014);
    }

    Component329(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    Component329(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    static final void method1779(byte i) {
        anInt5985++;
        NamedInteger.clearCaches(73);
        NodeList.aClass190ArrayArray3335 = null;
        NodeCache.aHa1098 = null;
        if (i <= 89) anInt5994 = -75;
        ColoredText.aClass299_6098 = null;
        HeapDumpHelper.aClass299_4938 = null;
        HashNodeSub10.aClass299_9571 = null;
    }

    public static void method1780(int i) {
        aClass114_5992 = null;
        int i_0_ = 108 % ((-24 - i) / 54);
        aClass251_5989 = null;
        anIntArrayArray5991 = null;
        aClass259_5995 = null;
        aClass211Array5993 = null;
        aClass190_5990 = null;
    }

    static final int method1781(int i, int i_1_, int i_2_) {
        anInt5983++;
        if (Sprite.anInt6923 == -1) return 1;
        if (i != Component192.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350)) {
            GlRectangleTexture.method1971(-2, FriendsIgnoreList.aClass274_3496.getLocalized(ObjectDeserializer.languageId, 544), true, i);
            if (i != Component192.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350)) return -1;
        }
        try {
            Dimension dimension = DisplayModeManagerContainer50.gameCanvas.getSize();
            Component149.method3511(true, Applet_Sub1.aClass324_20, Component163.aClass143_3179, FriendsIgnoreList.aClass274_3496.getLocalized(ObjectDeserializer.languageId, 544), 2, NodeSub8.toolkit);
            DisplayModeManagerContainer77 class124 = Component189.loadFromCache(0, ShaderSub3.aClass45_5207, Sprite.anInt6923, -1);
            long l = Component240.currentTimeMillis(-88);
            NodeSub8.toolkit.la();
            Component270.aClass101_2123.method894(0, DisplayModeManagerContainer64.anInt9037, 0);
            NodeSub8.toolkit.loadModelviewMatrix(Component270.aClass101_2123);
            NodeSub8.toolkit.DA(dimension.width / 2, dimension.height / 2, 512, 512);
            NodeSub8.toolkit.DualToolkit(1.0F);
            if (i_1_ >= -66) aClass190_5990 = null;
            NodeSub8.toolkit.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            DisplayModeManagerContainer370 class64 = NodeSub8.toolkit.method3625(class124, 2048, 64, 64, 768);
            int i_3_ = 0;
            while_80_:
            for (int i_4_ = 0; i_4_ < 500; i_4_++) {
                NodeSub8.toolkit.GA(0);
                NodeSub8.toolkit.NativeHandle();
                for (int i_5_ = 15; i_5_ >= 0; i_5_--) {
                    for (int i_6_ = 0; i_6_ <= i_5_; i_6_++) {
                        Cp1252Decoder.aClass101_5209.method894((int) ((-((float) i_5_ / 2.0F) + (float) i_6_) * (float) Component148.anInt3465), 0, (i_5_ + 1) * Component148.anInt3465);
                        i_3_++;
                        class64.render(Cp1252Decoder.aClass101_5209, null, 0);
                        if (Component240.currentTimeMillis(-105) + -l >= (long) i_2_) break while_80_;
                    }
                }
            }
            NodeSub8.toolkit.finish();
            long l_7_ = (long) (1000 * i_3_) / (Component240.currentTimeMillis(-86) + -l);
            NodeSub8.toolkit.GA(0);
            NodeSub8.toolkit.NativeHandle();
            return (int) l_7_;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return -1;
        }
    }

    final void setValue(int i, int i_8_) {
        this.preferenceValue = i_8_;
        anInt5987++;
        int i_9_ = -73 / ((82 - i) / 35);
    }

    final int getDefaultValue(int i) {
        anInt5982++;
        if (i != 20014) aClass211Array5993 = null;
        return 2;
    }

    final int getValue(int i, int i_10_) {
        if (i != 3) return 23;
        anInt5986++;
        return 1;
    }
}
