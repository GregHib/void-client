/* Component205 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component205
/**
 * RENAMED from `Class239_Sub12` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static int anInt5960;
    static int anInt5961;
    static int anInt5962;
    static int anInt5963;
    static CacheStore aClass45_5964;
    static int anInt5965;
    /** Last settings cookie payload ({@link CookieBuilder#setSettingsCookie}). */
    static String settingsCookie = null;
    static int anInt5967;
    static int anInt5968;
    static int anInt5969;
    static int anInt5970;
    static long aLong5971;
    static int anInt5972;
    static int anInt5973;

    final int getValue(int i, int i_0_) {
        anInt5972++;
        if (i != 3) return 121;
        if (!Node.method2714(7351, this.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350))) return 3;
        return 1;
    }

    final int method1771(int i) {
        anInt5960++;
        if (i != -32350) getValue(80, -99);
        return this.preferenceValue;
    }

    final void setValue(int i, int i_1_) {
        int i_2_ = -19 % ((82 - i) / 35);
        this.preferenceValue = i_1_;
        anInt5963++;
    }

    static final void method1772(int i) {
        anInt5968++;
        ColorTagNode class348_sub15 = (ColorTagNode) DisplayModeManagerContainer91.aClass356_389.first(0);
        if (i <= 4) settingsCookie = null;
        for (/**/; class348_sub15 != null; class348_sub15 = (ColorTagNode) DisplayModeManagerContainer91.aClass356_389.next(0))
            DisplayModeManagerContainer282.getColorTag((byte) 108, (class348_sub15.anInt6773));
    }

    public static void method1773(byte i) {
        int i_3_ = -86 / ((i - 13) / 45);
        settingsCookie = null;
        aClass45_5964 = null;
    }

    Component205(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    final void validateValue(boolean bool) {
        if (bool != false) validateValue(false);
        anInt5962++;
        if (this.preferences.aClass239_Sub25_7271.method1830((byte) -119) && !Node.method2714(7351, this.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350))) this.preferenceValue = 0;
        if (this.preferenceValue < 0 || this.preferenceValue > 1) this.preferenceValue = getDefaultValue(20014);
    }

    Component205(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final boolean method1774(int i) {
        if (i < 85) method1773((byte) 116);
        anInt5961++;
        return Node.method2714(7351, this.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350));
    }

    final int getDefaultValue(int i) {
        anInt5970++;
        if (i != 20014) anInt5965 = -58;
        return 0;
    }

    static final void method1775(byte i, int i_4_, int i_5_) {
        anInt5967++;
        if (i == -8 && Component233.method2547(i_4_, (byte) 84)) DefinitionSub19.method3097((DefinitionSub33.openInterfaces[i_4_]), i_5_, 119);
    }
}
