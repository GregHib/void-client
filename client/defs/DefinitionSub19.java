/* DefinitionSub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DefinitionSub19
/**
 * RENAMED from `Class348_Sub40_Sub19` (JODE-obfuscated).
 * Evidence: subclass of Definition (hierarchy)
 */ extends Definition {
    static int anInt9253;
    static Component183 aClass114_9254 = new Component183(73, 3);
    static int anInt9255;
    static int anInt9256;
    static Component183 aClass114_9257;
    static int anInt9258;
    static int[] anIntArray9259 = new int[2];
    /*synthetic*/ static Class aClass9260;

    static final void method3097(DisplayModeManagerContainer57[] class46s, int i, int i_0_) {
        if (i_0_ >= 116) {
            for (int i_1_ = 0; class46s.length > i_1_; i_1_++) {
                DisplayModeManagerContainer57 class46 = class46s[i_1_];
                if (class46 != null) {
                    if (class46.type == 0) {
                        if (class46.children != null) method3097(class46.children, i, 125);
                        NodeSub41 class348_sub41 = ((NodeSub41) (Component15.aClass356_4915.get(class46.packedId, -6008)));
                        if (class348_sub41 != null) Component205.method1775((byte) -8, (class348_sub41.anInt7050), i);
                    }
                    if (i == 0 && class46.anObjectArray840 != null) {
                        NodeSub36 class348_sub36 = new NodeSub36();
                        class348_sub36.aClass46_6989 = class46;
                        class348_sub36.anObjectArray6987 = class46.anObjectArray840;
                        ClientScriptExecutor.runHook(class348_sub36);
                    }
                    if (i == 1 && class46.anObjectArray701 != null) {
                        if (class46.childIndex >= 0) {
                            DisplayModeManagerContainer57 class46_2_ = BitmapFont.getComponent(1512932720, (class46.packedId));
                            if (class46_2_ == null || (class46_2_.children == null) || (class46.childIndex >= (class46_2_.children).length) || class46 != (class46_2_.children[class46.childIndex])) continue;
                        }
                        NodeSub36 class348_sub36 = new NodeSub36();
                        class348_sub36.aClass46_6989 = class46;
                        class348_sub36.anObjectArray6987 = class46.anObjectArray701;
                        ClientScriptExecutor.runHook(class348_sub36);
                    }
                }
            }
            anInt9258++;
        }
    }

    final int[] getMonochromeOutput(int i, int i_3_) {
        if (i_3_ != 255) aClass114_9254 = null;
        anInt9256++;
        return RenderableSub6.anIntArray6432;
    }

    public DefinitionSub19() {
        super(0, true);
    }

    /** Try {@link NodederUtil#loadNativeLibrary} for {@code string} (e.g. {@code jagtheora}). */
    static final boolean tryLoadNativeLibrary(int i, String string) {
        if (i != -30282) return true;
        anInt9255++;
        return NodederUtil.loadNativeLibrary((aClass9260 != null ? aClass9260 : (aClass9260 = Component330.class)), (byte) 20, string);
    }

    public static void method3099(byte i) {
        aClass114_9254 = null;
        aClass114_9257 = null;
        anIntArray9259 = null;
        if (i >= -63) anIntArray9259 = null;
    }

    static final boolean method3100(int i, boolean bool, int i_4_) {
        anInt9253++;
        if (bool != false) anIntArray9259 = null;
        return GameType.method1637(i, 32768, i_4_) | (0x800 & i_4_) != 0 || Component224.method2056(i_4_, 86, i);
    }

    static {
        aClass114_9257 = new Component183(102, 3);
    }
}
