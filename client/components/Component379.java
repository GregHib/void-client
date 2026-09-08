/* Component379 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component379
/**
 * RENAMED from `Class239_Sub9` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static int anInt5925;
    static int anInt5926;
    static int anInt5927;
    static int anInt5928;
    static StringCache aClass351_5929 = new StringCache(25, 3);
    static int anInt5930;
    static int anInt5931;
    /** Alternate product slot game4 ({@code id}=3). */
    static GameType GAME4 = new GameType("game4", 3);
    static Component24[] aClass105Array5933;
    static StringCache aClass351_5934 = new StringCache(78, 16);

    Component379(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final void setValue(int i, int i_0_) {
        anInt5925++;
        int i_1_ = -123 % ((82 - i) / 35);
        this.preferenceValue = i_0_;
    }

    final boolean method1757(int i) {
        anInt5927++;
        if (this.preferences.method3425(-122)) return false;
        if (i < 85) method1759(117);
        return this.preferences.method3422(674) == RunescapeInfo.RUNESCAPE;
    }

    public static void method1758(int i) {
        if (i != -16211) aClass351_5934 = null;
        GAME4 = null;
        aClass351_5929 = null;
        aClass105Array5933 = null;
        aClass351_5934 = null;
    }

    final int getValue(int i, int i_2_) {
        anInt5926++;
        if (this.preferences.method3425(-114)) return 3;
        if (this.preferences.method3422(674) == RunescapeInfo.RUNESCAPE) {
            if (i_2_ == 0) {
                if (this.preferences.aClass239_Sub16_7247.method1789(-32350) == 1) return 2;
                if (this.preferences.aClass239_Sub24_7235.method1820(i + -32353) == 1) return 2;
                if (this.preferences.aClass239_Sub18_7259.method1800(-32350) > 0) return 2;
            }
            return 1;
        }
        if (i != 3) getDefaultValue(57);
        return 3;
    }

    final void validateValue(boolean bool) {
        anInt5931++;
        if (bool != false) aClass351_5929 = null;
        if (this.preferences.method3422(674) != RunescapeInfo.RUNESCAPE) this.preferenceValue = 1;
        else if (this.preferences.method3425(-125)) this.preferenceValue = 0;
        if (this.preferenceValue != 0 && this.preferenceValue != 1) this.preferenceValue = getDefaultValue(20014);
    }

    final int method1759(int i) {
        anInt5930++;
        if (i != -32350) getValue(-83, -18);
        return this.preferenceValue;
    }

    Component379(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    final int getDefaultValue(int i) {
        if (i != 20014) aClass351_5934 = null;
        anInt5928++;
        return 1;
    }
}
