/* Component284 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component284
/**
 * RENAMED from `Class239_Sub29` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static int anInt6144;
    static int anInt6145;
    static int anInt6146;
    static boolean aBoolean6147 = false;
    static int anInt6148;
    static int anInt6149;
    static int anInt6150;
    static int anInt6151;
    static int anInt6152;
    static int anInt6153;

    final int method1848(int i) {
        if (i != -32350) getValue(100, 29);
        anInt6145++;
        return this.preferenceValue;
    }

    Component284(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    final int getDefaultValue(int i) {
        anInt6153++;
        if (i != 20014) validateValue(true);
        return 0;
    }

    Component284(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final void setValue(int i, int i_0_) {
        int i_1_ = -10 / ((i - 82) / 35);
        this.preferenceValue = i_0_;
        anInt6148++;
    }

    static final boolean method1849(char c, int i) {
        anInt6149++;
        if (Character.isISOControl(c)) return false;
        if (Npc.method2446(c, (byte) 105)) return true;
        char[] cs = Component316.aCharArray2488;
        for (int i_2_ = 0; cs.length > i_2_; i_2_++) {
            int i_3_ = cs[i_2_];
            if (c == i_3_) return true;
        }
        int i_4_ = -127 / ((i - 44) / 45);
        char[] cs_5_ = Component286.aCharArray1903;
        for (int i_6_ = 0; cs_5_.length > i_6_; i_6_++) {
            int i_7_ = cs_5_[i_6_];
            if (i_7_ == c) return true;
        }
        return false;
    }

    static final int method1850(int i, int i_8_) {
        anInt6144++;
        int i_9_ = 101 % ((-20 - i_8_) / 37);
        return i >>> 8;
    }

    final int getValue(int i, int i_10_) {
        anInt6146++;
        if (i != 3) aBoolean6147 = false;
        return 1;
    }

    static final void method1851(byte i) {
        anInt6152++;
        for (int i_11_ = 0; i_11_ < 5; i_11_++)
            Component113.aBooleanArray2374[i_11_] = false;
        Component135.anInt4424 = Component317.anInt8685;
        Component69.anInt3662 = HashNodeSub19.anInt9701;
        DisplayModeManagerContainer89.anInt8368 = DisplayModeManagerContainer50.anInt3855;
        Component182.anInt9751 = OpenGlShader.clientCycle;
        JaclibLoader.anInt167 = ShaderLinker.anInt10163 = -1;
        Component29.anInt10047 = WaterSurfaceShader.anInt6246;
        int i_12_ = -99 % ((i - 11) / 56);
        Component205.anInt5973 = 0;
        Component193.anInt3253 = Component298.anInt4638;
        OpenGlShader.anInt7403 = 0;
        DefinitionSub21.cameraMode = 5;
        NodeBaseSub1.anInt9775 = -1;
        Component102.anInt4803 = -1;
    }

    final void validateValue(boolean bool) {
        if (this.preferenceValue < 0 || this.preferenceValue > 4) this.preferenceValue = getDefaultValue(20014);
        anInt6150++;
        if (bool != false) anInt6151 = 62;
    }
}
