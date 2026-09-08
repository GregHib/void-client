/* Component20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component20
/**
 * RENAMED from `Class239_Sub20` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static int anInt6048 = 0;
    static int anInt6049;
    static int anInt6050;
    static int anInt6051;
    static int anInt6052;
    static int anInt6053;
    static int[][] anIntArrayArray6054 = {{12, 12, 12, 12}, {12, 12, 12, 12}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 1, 1, 7}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 10}, {12, 12, 12, 12}};
    static int anInt6055;
    static Component183 aClass114_6056 = new Component183(26, 11);

    final int getDefaultValue(int i) {
        if (i != 20014) return -9;
        anInt6055++;
        return 0;
    }

    final int getValue(int i, int i_0_) {
        anInt6051++;
        if (!Node.method2714(7351, this.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350))) return 3;
        if (i != 3) method1807((byte) 64);
        return 1;
    }

    Component20(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final boolean method1806(int i) {
        if (i < 85) getValue(-53, -119);
        anInt6049++;
        return Node.method2714(7351, this.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350));
    }

    public static void method1807(byte i) {
        anIntArrayArray6054 = null;
        if (i != -121) anIntArrayArray6054 = null;
        aClass114_6056 = null;
    }

    Component20(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    final int method1808(int i) {
        anInt6053++;
        if (i != -32350) anInt6048 = -97;
        return this.preferenceValue;
    }

    final void setValue(int i, int i_1_) {
        int i_2_ = 38 / ((82 - i) / 35);
        anInt6052++;
        this.preferenceValue = i_1_;
    }

    final void validateValue(boolean bool) {
        anInt6050++;
        if (bool != false) getValue(-51, -128);
        if (this.preferences.aClass239_Sub25_7271.method1830((byte) -123) && !Node.method2714(7351, this.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350))) this.preferenceValue = 0;
        if (this.preferenceValue < 0 || this.preferenceValue > 2) this.preferenceValue = getDefaultValue(20014);
    }
}
