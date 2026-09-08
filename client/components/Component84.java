/* Component84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component84
/**
 * RENAMED from `Class89` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    private final GlExtensionManager aClass377_1506;
    static long aLong1507;
    static int[] anIntArray1508 = new int[256];
    static int anInt1509;
    long aLong1510;
    static int anInt1511;

    static final void method849(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        anInt1511++;
        if (i_4_ <= 80) method851(-7);
        int i_6_ = i_0_ + i;
        int i_7_ = -i + i_3_;
        for (int i_8_ = i_0_; i_8_ < i_6_; i_8_++)
            MenuOpener.fillInts(-27, i_2_, DisplayModeManagerContainer167.anIntArrayArray255[i_8_], i_1_, i_5_);
        int i_9_ = -i + i_2_;
        for (int i_10_ = i_3_; i_10_ > i_7_; i_10_--)
            MenuOpener.fillInts(-27, i_2_, DisplayModeManagerContainer167.anIntArrayArray255[i_10_], i_1_, i_5_);
        int i_11_ = i + i_1_;
        for (int i_12_ = i_6_; i_7_ >= i_12_; i_12_++) {
            int[] is = DisplayModeManagerContainer167.anIntArrayArray255[i_12_];
            MenuOpener.fillInts(-27, i_11_, is, i_1_, i_5_);
            MenuOpener.fillInts(-27, i_2_, is, i_9_, i_5_);
        }
    }

    protected final void finalize() throws Throwable {
        anInt1509++;
        aClass377_1506.method3966(this.aLong1510, 34192);
        super.finalize();
    }

    static final boolean method850(Component327 class318_sub1_sub3, boolean bool) {
        boolean bool_13_ = ShaderSub1.aSArray5191 == Component9.aSArray4142;
        int i = 0;
        short i_14_ = 0;
        byte i_15_ = 0;
        class318_sub1_sub3.method2409((byte) -116);
        if (class318_sub1_sub3.aShort8743 < 0 || class318_sub1_sub3.aShort8750 < 0 || (class318_sub1_sub3.aShort8751 >= StaticElementRenderer.anInt6451) || (class318_sub1_sub3.aShort8747 >= NodeSub41.anInt7054)) return false;
        short i_16_ = 0;
        for (int i_17_ = class318_sub1_sub3.aShort8743; i_17_ <= class318_sub1_sub3.aShort8751; i_17_++) {
            for (int i_18_ = class318_sub1_sub3.aShort8750; i_18_ <= class318_sub1_sub3.aShort8747; i_18_++) {
                Component186 class357 = NodeSub46.method3321(class318_sub1_sub3.plane, i_17_, i_18_);
                if (class357 != null) {
                    Component3 class148 = Component239.method3620(class318_sub1_sub3, 118);
                    Component3 class148_19_ = class357.aClass148_4396;
                    if (class148_19_ == null) class357.aClass148_4396 = class148;
                    else {
                        for (/**/; class148_19_.aClass148_2038 != null; class148_19_ = class148_19_.aClass148_2038) {
                            /* empty */
                        }
                        class148_19_.aClass148_2038 = class148;
                    }
                    if (bool_13_ && (DisplayModeManagerContainer173.anIntArrayArray4253[i_17_][i_18_] & ~0xffffff) != 0) {
                        i = DisplayModeManagerContainer173.anIntArrayArray4253[i_17_][i_18_];
                        i_14_ = Component175.aShortArrayArray5847[i_17_][i_18_];
                        i_15_ = (NodeSub1Sub2.aByteArrayArray8816[i_17_][i_18_]);
                    }
                    if (!bool && (class357.aClass318_Sub1_Sub1_4402 != null) && (class357.aClass318_Sub1_Sub1_4402.aShort8727) > i_16_) i_16_ = (class357.aClass318_Sub1_Sub1_4402.aShort8727);
                }
            }
        }
        if (bool_13_ && (i & ~0xffffff) != 0) {
            for (int i_20_ = class318_sub1_sub3.aShort8743; i_20_ <= class318_sub1_sub3.aShort8751; i_20_++) {
                for (int i_21_ = (class318_sub1_sub3.aShort8750); (i_21_ <= class318_sub1_sub3.aShort8747); i_21_++) {
                    if ((DisplayModeManagerContainer173.anIntArrayArray4253[i_20_][i_21_] & ~0xffffff) == 0) {
                        DisplayModeManagerContainer173.anIntArrayArray4253[i_20_][i_21_] = i;
                        Component175.aShortArrayArray5847[i_20_][i_21_] = i_14_;
                        NodeSub1Sub2.aByteArrayArray8816[i_20_][i_21_] = i_15_;
                    }
                }
            }
        }
        if (bool) DisplayModeManagerContainer310.aClass318_Sub1_Sub3Array357[Component328.dynamicOnscreenCount++] = class318_sub1_sub3;
        else {
            int i_22_ = ShaderSub1.aSArray5191 == Component9.aSArray4142 ? 1 : 0;
            if (class318_sub1_sub3.method2376(-118)) {
                if (class318_sub1_sub3.method2377((byte) 122)) {
                    class318_sub1_sub3.aClass318_Sub1_6379 = AudioMixer.aClass318_Sub1Array3226[i_22_];
                    AudioMixer.aClass318_Sub1Array3226[i_22_] = class318_sub1_sub3;
                } else {
                    class318_sub1_sub3.aClass318_Sub1_6379 = Node.aClass318_Sub1Array4293[i_22_];
                    Node.aClass318_Sub1Array4293[i_22_] = class318_sub1_sub3;
                    NodeSub16Sub2.aBoolean8870 = true;
                }
            } else {
                class318_sub1_sub3.aClass318_Sub1_6379 = Component95.aClass318_Sub1Array1754[i_22_];
                Component95.aClass318_Sub1Array1754[i_22_] = class318_sub1_sub3;
            }
        }
        if (bool) class318_sub1_sub3.anInt6382 -= i_16_;
        return true;
    }

    public static void method851(int i) {
        if (i == 1) anIntArray1508 = null;
    }

    Component84(GlExtensionManager class377, long l, DisplayModeManagerContainer271[] class39s) {
        try {
            this.aLong1510 = l;
            aClass377_1506 = class377;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("lha.<init>(" + (class377 != null ? "{...}" : "null") + ',' + l + ',' + (class39s != null ? "{...}" : "null") + ')'));
        }
    }

    static {
        for (int i = 0; i < 256; i++) {
            int i_23_ = i;
            for (int i_24_ = 0; i_24_ < 8; i_24_++) {
                if ((i_23_ & 0x1) != 1) i_23_ >>>= 1;
                else i_23_ = i_23_ >>> 1 ^ ~0x12477cdf;
            }
            anIntArray1508[i] = i_23_;
        }
    }
}
