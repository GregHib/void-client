/* Component158 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component158
/**
 * RENAMED from `Class21` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt321;
    static CacheStore aClass45_322;
    static DisplayModeManagerContainer57 aClass46_323 = null;
    static int anInt324;
    static int anInt325 = -50;
    static GraphicsToolkit aHa326;
    static int anInt327;

    public final String toString() {
        anInt327++;
        throw new IllegalStateException();
    }

    public static void method288(byte i) {
        aClass45_322 = null;
        if (i > 93) {
            aHa326 = null;
            aClass46_323 = null;
        }
    }

    static final void method289(int i, int i_0_, int i_1_, int i_2_) {
        anInt324++;
        if (Component381.anInt8583 != i_2_ || DisplayModeManagerContainer61.anInt3760 != i_0_ || i_1_ != DisplayModeManagerContainer91.anInt396) {
            Component381.anInt8583 = i_2_;
            NodeSub16Sub2.aBoolean8870 = true;
            DisplayModeManagerContainer91.anInt396 = i_1_;
            DisplayModeManagerContainer61.anInt3760 = i_0_;
            double d = -((double) (i_2_ * 2) * 3.141592653589793) / 16384.0;
            double d_3_ = -(3.141592653589793 * (double) (2 * i_0_)) / 16384.0;
            double d_4_ = Math.cos(d_3_);
            double d_5_ = Math.sin(d_3_);
            double d_6_ = Math.cos(d);
            double d_7_ = Math.sin(d);
            VideoAdDisplay.aDouble3182 = d_4_;
            ColorTagNode.aDouble6774 = d_7_;
            DisplayModeManagerContainer61.aDouble3761 = d_6_;
            NodeSub16Sub2.aDouble8869 = d_4_ * d_6_;
            if (i != -15902) method288((byte) -120);
            DefinitionGroup.aDouble9531 = d_7_ * -d_4_;
            Component186.aDouble4404 = d_5_;
            Component144.aDouble3980 = 0.0;
            DisplayModeManagerContainer213.aDouble1083 = d_6_ * -d_5_;
            DisplayModeManagerContainer64.aDouble9023 = d_5_ * d_7_;
        }
    }

    public Component158() {
        /* empty */
    }
}
