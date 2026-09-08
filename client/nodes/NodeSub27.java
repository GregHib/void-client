/* NodeSub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NodeSub27
/**
 * RENAMED from `Class348_Sub27` (JODE-obfuscated).
 * Evidence: subclass of Node (hierarchy)
 */ extends Node {
    int anInt6892;
    int anInt6893 = -1;
    int anInt6894 = 0;
    int anInt6895;
    int anInt6896;
    static Component114[] aClass302Array6897 = new Component114[8];
    /** Per-frame pitch delta applied in follow/orbit camera ticks. */
    static float cameraPitchRate = 0.0F;
    int anInt6899;
    int anInt6900;
    static int anInt6901;
    int anInt6902;
    int anInt6903;
    int anInt6904;
    int anInt6905;
    static int anInt6906;
    int anInt6907;

    static final void method3000(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        Component27.anInt4960 = i_2_;
        int i_4_ = -89 / ((i_3_ - 78) / 44);
        PauseTimer.anInt513 = i_1_;
        Component22.anInt1745 = i;
        Component72.anInt1910 = i_0_;
        anInt6906++;
    }

    public static void method3001(int i) {
        aClass302Array6897 = null;
        if (i != 0) aClass302Array6897 = null;
    }

    static final Component161[] method3002(byte i) {
        if (i != -97) aClass302Array6897 = null;
        anInt6901++;
        return (new Component161[]{RandomAccessFileReader.aClass138_3044, Component40.aClass138_6321, BitmapFont.aClass138_4062, CursorDefinition.aClass138_2885, DefinitionGroup.aClass138_9530, Component182.aClass138_9748, ColoredTextBuilder.aClass138_4082, AbstractGlTextureSub4.aClass138_8553, NodeBase.aClass138_7274, DisplayModeManagerContainer5.aClass138_1213, RSACipher.aClass138_4901, Component252.aClass138_10194, NodeBaseSub2.aClass138_9781, GlExtensionManager.aClass138_9860});
    }

    public NodeSub27() {
        /* empty */
    }
}
