/* Component323 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component323
/**
 * RENAMED from `Class239_Sub4` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static int anInt5872;
    static int anInt5873;
    static float[] aFloatArray5874 = new float[16384];
    static int anInt5875;
    static float[] aFloatArray5876 = new float[16384];
    static int anInt5877;
    static CacheStore aClass45_5878;
    static int anInt5879;
    static int anInt5880;
    static Request aClass348_Sub26_5881;
    static String aString5882;
    static Component183 aClass114_5883;

    final void validateValue(boolean bool) {
        if (bool != false) method1736(-57);
        anInt5880++;
        if (this.preferences.method3422(674) != RunescapeInfo.RUNESCAPE) this.preferenceValue = 1;
        else if (this.preferences.method3425(-95)) this.preferenceValue = 0;
        if (this.preferenceValue != 0 && this.preferenceValue != 1) this.preferenceValue = getDefaultValue(20014);
    }

    final void setValue(int i, int i_0_) {
        int i_1_ = 107 / ((i - 82) / 35);
        anInt5879++;
        this.preferenceValue = i_0_;
    }

    final boolean method1736(int i) {
        anInt5873++;
        if (this.preferences.method3425(-80)) return false;
        if (i < 85) validateValue(true);
        return this.preferences.method3422(674) == RunescapeInfo.RUNESCAPE;
    }

    Component323(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    final int getDefaultValue(int i) {
        if (i != 20014) aClass114_5883 = null;
        anInt5877++;
        return 1;
    }

    final int method1737(int i) {
        if (i != -32350) validateValue(true);
        anInt5875++;
        return this.preferenceValue;
    }

    final int getValue(int i, int i_2_) {
        if (i != 3) aString5882 = null;
        anInt5872++;
        if (this.preferences.method3425(-63)) return 3;
        if (this.preferences.method3422(674) == RunescapeInfo.RUNESCAPE) return 1;
        return 3;
    }

    public static void method1738(int i) {
        aClass45_5878 = null;
        aFloatArray5874 = null;
        aString5882 = null;
        if (i != 21921) method1738(11);
        aFloatArray5876 = null;
        aClass348_Sub26_5881 = null;
        aClass114_5883 = null;
    }

    Component323(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    static {
        double d = 3.834951969714103E-4;
        for (int i = 0; i < 16384; i++) {
            aFloatArray5874[i] = (float) Math.sin(d * (double) i);
            aFloatArray5876[i] = (float) Math.cos((double) i * d);
        }
        aClass114_5883 = new Component183(34, 12);
    }
}
