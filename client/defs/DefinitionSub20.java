/* DefinitionSub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DefinitionSub20
/**
 * RENAMED from `Class348_Sub40_Sub20` (JODE-obfuscated).
 * Evidence: subclass of Definition (hierarchy)
 */ extends Definition {
    static int anInt9261;
    static int anInt9262;
    /** Release-candidate channel ({@code id}=1). */
    static BuildType RC = new BuildType("RC", 1);
    static HardwareProbe aClass348_Sub4_9264;
    static int anInt9265;

    static final void method3102(int i) {
        if (i != 22385) aClass348_Sub4_9264 = null;
        anInt9265++;
        Component9.aClass60_4139.purgeSoftReferences(-110);
    }

    private final int method3103(int i, int i_0_, int i_1_) {
        anInt9262++;
        if (i_1_ < 14) aClass348_Sub4_9264 = null;
        int i_2_ = i_0_ - -(57 * i);
        i_2_ ^= i_2_ << 1;
        return (-(((789221 + 15731 * (i_2_ * i_2_)) * i_2_ + 1376312589 & 0x7fffffff) / 262144) + 4096);
    }

    public DefinitionSub20() {
        super(0, true);
    }

    public static void method3104(boolean bool) {
        if (bool == false) {
            aClass348_Sub4_9264 = null;
            RC = null;
        }
    }

    final int[] getMonochromeOutput(int i, int i_3_) {
        anInt9261++;
        int[] is = this.imageCache.getPixels(0, i);
        if (this.imageCache.cacheMiss) {
            int i_4_ = Component302.anIntArray6035[i];
            for (int i_5_ = 0; (i_5_ < DefinitionSub6.anInt9139); i_5_++)
                is[i_5_] = method3103(i_4_, RenderableSub6.anIntArray6432[i_5_], 22) % 4096;
        }
        if (i_3_ != 255) getMonochromeOutput(38, -42);
        return is;
    }

    static {
        new Component224("", 73);
    }
}
