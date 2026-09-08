/* Component60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component60
/**
 * RENAMED from `Class239_Sub7` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static int anInt5904;
    static int anInt5905;
    static int anInt5906;
    static int anInt5907;
    static int anInt5908;
    static int anInt5909 = -1;
    static int anInt5910;

    final int getValue(int i, int i_0_) {
        anInt5905++;
        if (this.preferences.method3425(-93)) return 3;
        if (this.preferences.aClass239_Sub24_7235.method1820(i ^ ~0x7e5e) == 0) return 3;
        if (i != 3) anInt5909 = -111;
        return 1;
    }

    Component60(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    Component60(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    final void validateValue(boolean bool) {
        if (this.preferences.method3425(-82)) this.preferenceValue = 0;
        anInt5904++;
        if (this.preferences.aClass239_Sub24_7235.method1820(-32350) == 0) this.preferenceValue = 0;
        if (bool != false) setValue(-60, 72);
        if (this.preferenceValue < 0 || this.preferenceValue > 2) this.preferenceValue = getDefaultValue(20014);
    }

    final void setValue(int i, int i_1_) {
        anInt5906++;
        int i_2_ = -93 % ((82 - i) / 35);
        this.preferenceValue = i_1_;
    }

    final boolean method1747(int i) {
        anInt5908++;
        if (this.preferences.method3425(-127)) return false;
        if (this.preferences.aClass239_Sub24_7235.method1820(-32350) == 0) return false;
        if (i < 85) method1747(105);
        return true;
    }

    final int method1748(int i) {
        if (i != -32350) return 111;
        anInt5910++;
        return this.preferenceValue;
    }

    final int getDefaultValue(int i) {
        anInt5907++;
        if (i != 20014) anInt5909 = 100;
        return 2;
    }
}
