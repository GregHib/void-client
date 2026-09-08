/* Component142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component142
/**
 * RENAMED from `Class358` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt4411 = 0;
    float[][] aFloatArrayArray4412;
    static int anInt4413;
    int[] anIntArray4414;
    int[] anIntArray4415;
    int[] anIntArray4416;
    static NodeCache aClass60_4417 = new NodeCache(50);
    static StringCache aClass351_4418 = new StringCache(33, 8);

    public static void method3488(int i) {
        if (i < 25) method3489(30);
        aClass351_4418 = null;
        aClass60_4417 = null;
    }

    static final void method3489(int i) {
        NodeCache.aHa1098.DualToolkit(((float) Component192.preferences.aClass239_Sub10_7232.method1764(-32350) * 0.1F + 0.7F) * 1.1523438F);
        anInt4413++;
        NodeCache.aHa1098.ZA(DisplayModeManagerContainer259.anInt3439, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        NodeCache.aHa1098.L(DisplayModeManagerContainer259.anInt3444, -1, 0);
        int i_0_ = -35 / ((45 - i) / 44);
        NodeCache.aHa1098.method3653(HashNodeSub10.aClass299_9571);
    }

    Component142(int[] is, int[] is_1_, int[] is_2_, float[][] fs) {
        try {
            this.anIntArray4414 = is_2_;
            this.aFloatArrayArray4412 = fs;
            this.anIntArray4415 = is_1_;
            this.anIntArray4416 = is;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ew.<init>(" + (is != null ? "{...}" : "null") + ',' + (is_1_ != null ? "{...}" : "null") + ',' + (is_2_ != null ? "{...}" : "null") + ',' + (fs != null ? "{...}" : "null") + ')'));
        }
    }
}
