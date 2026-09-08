/* Component31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component31
/**
 * RENAMED from `Class239_Sub6` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static int[][] anIntArrayArray5894;
    static int anInt5895;
    static int anInt5896;
    static int anInt5897;
    static int anInt5898;
    static int anInt5899;
    static Component117 aClass355_5900;
    static int anInt5901;
    static int[] anIntArray5902 = new int[128];
    static int anInt5903;

    final int getDefaultValue(int i) {
        if (i != 20014) setValue(-15, 91);
        anInt5898++;
        return 0;
    }

    final int method1743(int i) {
        anInt5896++;
        if (i != -32350) return -65;
        return this.preferenceValue;
    }

    final boolean method1744(int i) {
        if (i <= 85) method1743(-113);
        anInt5903++;
        int i_0_ = this.preferences.method3428((byte) -93).method1458(-23688);
        return i_0_ >= 96;
    }

    final void validateValue(boolean bool) {
        anInt5897++;
        int i = this.preferences.method3428((byte) -105).method1458(-23688);
        if (i < 96) this.preferenceValue = 0;
        if (bool != false) aClass355_5900 = null;
        if (this.preferenceValue > 1 && i < 128) this.preferenceValue = 1;
        if (this.preferenceValue > 2 && i < 192) this.preferenceValue = 2;
        if (this.preferenceValue < 0 || this.preferenceValue > 3) this.preferenceValue = getDefaultValue(20014);
    }

    final int getValue(int i, int i_1_) {
        anInt5899++;
        int i_2_ = this.preferences.method3428((byte) -104).method1458(i ^ ~0x5c84);
        if (i_2_ < 96) return 3;
        if (i_1_ > 1 && i_2_ < 128) return 3;
        if (i_1_ > i && i_2_ < 192) return 3;
        return 1;
    }

    final void setValue(int i, int i_3_) {
        int i_4_ = -32 / ((82 - i) / 35);
        anInt5901++;
        this.preferenceValue = i_3_;
    }

    static final int method1745(String string, int i) {
        if (i != -65) method1745(null, 67);
        anInt5895++;
        return string.length() + 1;
    }

    Component31(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    public static void method1746(int i) {
        anIntArray5902 = null;
        if (i != -15628) aClass355_5900 = null;
        aClass355_5900 = null;
        anIntArrayArray5894 = null;
    }

    Component31(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    static {
        for (int i = 0; anIntArray5902.length > i; i++)
            anIntArray5902[i] = -1;
        for (int i = 65; i <= 90; i++)
            anIntArray5902[i] = -65 + i;
        for (int i = 97; i <= 122; i++)
            anIntArray5902[i] = i - 97 + 26;
        for (int i = 48; i <= 57; i++)
            anIntArray5902[i] = i + -48 - -52;
        anIntArray5902[42] = anIntArray5902[43] = 62;
        anIntArray5902[45] = anIntArray5902[47] = 63;
    }
}
