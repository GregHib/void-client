/* Component21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component21
/**
 * RENAMED from `Class282` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt3651;
    /** True for stereo PCM (2 channels). */
    static boolean stereo;
    static int anInt3653;
    static LruCache aClass356_3654;
    static int anInt3655 = 0;

    static final void method2109(int i) {
        anInt3653++;
        HashNodeSub18 class348_sub42_sub18 = ((HashNodeSub18) DefinitionSub17.aClass262_9240.first(4));
        if (i != 512) method2110(-125, 79, 70);
        for (/**/; class348_sub42_sub18 != null; class348_sub42_sub18 = (HashNodeSub18) DefinitionSub17.aClass262_9240.next((byte) 56)) {
            DisplayModeManagerContainer174 class318_sub1_sub3_sub5 = (class348_sub42_sub18.aClass318_Sub1_Sub3_Sub5_9682);
            if (OpenGlShader.clientCycle > class318_sub1_sub3_sub5.anInt10392) {
                class348_sub42_sub18.unlink((byte) 101);
                class318_sub1_sub3_sub5.method2472(-2159);
            } else if ((class318_sub1_sub3_sub5.anInt10411) <= OpenGlShader.clientCycle) {
                class318_sub1_sub3_sub5.method2474((byte) 121);
                if ((class318_sub1_sub3_sub5.anInt10412) > 0) {
                    NpcNode class348_sub22 = ((NpcNode) (aClass356_3654.get(-1 + class318_sub1_sub3_sub5.anInt10412, -6008)));
                    if (class348_sub22 != null) {
                        Npc npc = (class348_sub22.npc);
                        if ((npc.x) >= 0 && (AbstractShaderSub4.anInt7319 * 512 > npc.x) && (npc.y) >= 0 && (512 * ParametricDefinition.anInt9109 > npc.y))
                            class318_sub1_sub3_sub5.method2471((byte) -103, ((Component300.method2064(npc.x, (class318_sub1_sub3_sub5.plane), 11219, npc.y)) + -class318_sub1_sub3_sub5.anInt10366), npc.y, OpenGlShader.clientCycle, npc.x);
                    }
                }
                if ((class318_sub1_sub3_sub5.anInt10412) < 0) {
                    int i_0_ = -(class318_sub1_sub3_sub5.anInt10412) - 1;
                    Player player;
                    if (i_0_ == StringDefinition.anInt9591) player = Component72.localPlayer;
                    else player = (InterfaceRenderer.players[i_0_]);
                    if (player != null && (player.x) >= 0 && ((player.x) < 512 * AbstractShaderSub4.anInt7319) && (player.y) >= 0 && (player.y) < 512 * ParametricDefinition.anInt9109)
                        class318_sub1_sub3_sub5.method2471((byte) -103, ((Component300.method2064((player.x), (class318_sub1_sub3_sub5.plane), 11219, (player.y))) - class318_sub1_sub3_sub5.anInt10366), (player.y), OpenGlShader.clientCycle, (player.x));
                }
                class318_sub1_sub3_sub5.method2475((byte) 75, NodeSub51.anInt7267);
                Component84.method850(class318_sub1_sub3_sub5, true);
            }
        }
    }

    static final DisplayModeManagerContainer343 method2110(int i, int i_1_, int i_2_) {
        Component186 class357 = Component335.aClass357ArrayArrayArray2029[i][i_1_][i_2_];
        if (class357 == null) return null;
        DisplayModeManagerContainer343 class318_sub1_sub2 = class357.aClass318_Sub1_Sub2_4408;
        class357.aClass318_Sub1_Sub2_4408 = null;
        Component191.method1376(class318_sub1_sub2);
        return class318_sub1_sub2;
    }

    public static void method2111(byte i) {
        aClass356_3654 = null;
        if (i <= 56) method2111((byte) -49);
    }

    static final boolean method2112(int i, int i_3_) {
        anInt3651++;
        if (i <= 121) return false;
        return i_3_ == 3 || i_3_ == 4;
    }

    static {
        aClass356_3654 = new LruCache(64);
    }
}
