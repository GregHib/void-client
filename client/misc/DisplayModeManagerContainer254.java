/* DisplayModeManagerContainer254 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer254
/**
 * RENAMED from `Class161` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    int anInt2138;
    private boolean aBoolean2139 = false;
    static int anInt2140;
    static int anInt2141;
    static int anInt2142;
    int anInt2143;
    static int anInt2144;
    static int[] anIntArray2145 = new int[25];
    private boolean aBoolean2146 = true;
    String aString2147;
    int anInt2148;
    static int anInt2149;
    static int anInt2150;
    static boolean aBoolean2151 = false;

    static final boolean method1258(int i, int i_0_, int i_1_) {
        if (i_0_ != -9301) method1263(true);
        anInt2150++;
        return (0x800 & i) != 0;
    }

    final void method1259(int i) {
        if (i != 0) method1258(39, 119, 4);
        anInt2149++;
        if (!aBoolean2146) {
            aBoolean2139 = true;
            aBoolean2146 = true;
        } else if (!aBoolean2139) aBoolean2146 = false;
        else aBoolean2139 = false;
    }

    static final void method1260(boolean bool, int i, DisplayModeManagerContainer56 class190) {
        if (DefinitionSub10.aBoolean9181) {
            DefinitionSub10.aBoolean9181 = false;
            i = 0;
        }
        anInt2140++;
        if (Component329.aClass190_5990 == null || !Component329.aClass190_5990.method1424(class190, (byte) 84)) {
            Component329.aClass190_5990 = class190;
            ObjectDeserializer.aLong6963 = Component240.currentTimeMillis(-78);
            DisplayModeManagerContainer105.anInt4889 = SpriteAtlasShader.anInt6248 = i;
            if (DisplayModeManagerContainer105.anInt4889 == 0) DefinitionSub32.method3134(-1);
            else {
                DisplayModeManagerContainer28.aFloat8725 = Component214.aFloat2137;
                Canvas_Sub1.anInt70 = Component38.anInt2500;
                ColoredText.aClass299_6098 = HeapDumpHelper.aClass299_4938;
                DisplayModeManagerContainer370.aFloat1136 = ModelStore.aFloat4626;
                DebugOverlay.aFloat3172 = Component209.aFloat3462;
                CacheStore.aFloat670 = NodeSub3.aFloat6586;
                AbstractGlTextureSub4.aFloat8560 = Component98.aFloat5945;
                Component163.aFloat3177 = CollisionMap.aFloat4455;
                Component327.anInt8739 = DisplayModeManagerContainer96.anInt4703;
                Component372.anInt6042 = Component129.anInt486;
            }
        }
        if (bool != false) aBoolean2151 = true;
    }

    public static void method1261(byte i) {
        if (i > 46) anIntArray2145 = null;
    }

    final Task method1262(ReflectionInvoker class297, byte i) {
        if (i != 36) method1258(-105, -70, -80);
        anInt2144++;
        return class297.openSocket(aBoolean2139, (aBoolean2146 ? this.anInt2138 : this.anInt2148), this.aString2147, i ^ 0x6e65);
    }

    static final void method1263(boolean bool) {
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub27_7255), 1);
        anInt2142++;
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub27_7261), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub14_7250), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub14_7264), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub4_7220), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub9_7256), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub13_7236), 0);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub1_7246), 0);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub21_7270), 0);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub7_7238), 0);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub24_7235), 0);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub28_7230), 0);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub18_7259), 0);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub16_7247), 0);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub20_7216), 0);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub20_7248), 0);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub15_7224), 0);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub6_7226), 0);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub12_7243), 0);
        DisplayModeManagerContainer87.method1686(55);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub23_7231), 2);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub29_7229), 2);
        Definition.method3038(-1);
        DisplayModeManagerContainer154.method773(bool);
        RuntimeException_Sub1.aBoolean4604 = true;
    }

    final boolean method1264(byte i, DisplayModeManagerContainer254 class161_2_) {
        if (i <= 69) return false;
        anInt2141++;
        if (class161_2_ != null) {
            return (this.anInt2143 == class161_2_.anInt2143) && this.aString2147.equals(class161_2_.aString2147);
        }
        return false;
    }

    public DisplayModeManagerContainer254() {
        this.anInt2138 = Loader.port;
        this.anInt2148 = 43594;
    }
}
