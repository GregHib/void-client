/* Component296 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Component296
/**
 * RENAMED from `Class127` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ implements Interface1 {
    static int anInt4652;
    static int anInt4653;
    static int[] anIntArray4654;
    Component24 aClass105_4655;
    static int anInt4656 = 0;
    static int anInt4657;
    static int anInt4658;
    Component118 aClass288_4659;
    static int anInt4660;
    private final CacheStore aClass45_4661;
    static int anInt4662;

    public final boolean method8(byte i) {
        int i_0_ = -79 / ((i - 25) / 52);
        anInt4658++;
        return aClass45_4661.isSingletonFileReady(false, (this.aClass288_4659.anInt4958));
    }

    public void method9(byte i, boolean bool) {
        anInt4653++;
        if (bool) {
            int i_1_ = ((this.aClass288_4659.aClass221_4955.method1607(DisplayModeManagerContainer23.canvasWidth, this.aClass105_4655.method966(), (byte) -117)) + this.aClass288_4659.anInt4950);
            int i_2_ = ((this.aClass288_4659.aClass341_4952.getAlignedOffset(GlToolkitSub2.canvasHeight, this.aClass105_4655.method980(), 1595)) - -this.aClass288_4659.anInt4951);
            this.aClass105_4655.drawAt(i_1_, i_2_);
        }
        if (i != -49) anInt4656 = 26;
    }

    static final int method1115(int i, int i_3_, byte i_4_) {
        anInt4652++;
        int i_5_ = i - -(57 * i_3_);
        i_5_ ^= i_5_ << 13;
        int i_6_ = -76 / ((i_4_ - 22) / 60);
        int i_7_ = 1376312589 + i_5_ * (15731 * i_5_ * i_5_ + 789221) & 0x7fffffff;
        return (i_7_ & 0x7fa112f) >> 19;
    }

    static final void method1116(int i, int i_8_, int i_9_, int i_10_, byte i_11_) {
        if (Component27.anInt4960 > i_9_ + -i_10_ || Component22.anInt1745 < i_10_ + i_9_ || Component72.anInt1910 > i - i_10_ || i - -i_10_ > PauseTimer.anInt513) BuildInfo.method203(-107, i_9_, i_8_, i, i_10_);
        else WorldNameText.method253(i, i_9_, -648, i_8_, i_10_);
        anInt4662++;
        int i_12_ = -68 / ((40 - i_11_) / 36);
    }

    public static void method1117(int i) {
        anIntArray4654 = null;
        int i_13_ = -13 / ((i - 57) / 47);
    }

    public final void method7(int i) {
        if (i != 10286) anInt4656 = -123;
        this.aClass105_4655 = DummyClass.method3577((this.aClass288_4659.anInt4958), (byte) -60, aClass45_4661);
        anInt4660++;
    }

    Component296(CacheStore class45, Component118 class288) {
        try {
            aClass45_4661 = class45;
            this.aClass288_4659 = class288;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("nl.<init>(" + (class45 != null ? "{...}" : "null") + ',' + (class288 != null ? "{...}" : "null") + ')'));
        }
    }
}
