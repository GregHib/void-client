/* Component10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component10
/**
 * RENAMED from `Class298` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt3808;
    static Component183 aClass114_3809 = new Component183(44, 6);
    static int anInt3810;
    static boolean fpsOverlayEnabled = false;

    static final int method2250(int i, int i_0_, int i_1_, int i_2_) {
        if (i_0_ < 36) fpsOverlayEnabled = true;
        anInt3810++;
        int i_3_ = -i_1_ + 255;
        i_2_ = (~0xff00ff & (i_2_ & 0xff00ff) * i_1_ | 0xff0000 & (0xff00 & i_2_) * i_1_) >>> 8;
        return i_2_ + ((i_3_ * (i & 0xff00ff) & ~0xff00ff | i_3_ * (0xff00 & i) & 0xff0000) >>> 8);
    }

    public static void method2251(int i) {
        if (i != 16711680) aClass114_3809 = null;
        aClass114_3809 = null;
    }

    static final boolean method2252(boolean bool, int i, int i_4_, byte i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
        anInt3808++;
        int i_11_ = (Component72.localPlayer.anIntArray10320[0]);
        int i_12_ = (Component72.localPlayer.anIntArray10317[0]);
        if (i_11_ < 0 || i_11_ >= AbstractShaderSub4.anInt7319 || i_12_ < 0 || ParametricDefinition.anInt9109 <= i_12_) return false;
        if (i < 0 || i >= AbstractShaderSub4.anInt7319 || i_4_ < 0 || ParametricDefinition.anInt9109 <= i_4_) return false;
        int i_13_ = (Component317.method574(i, Component72.localPlayer.getSize((byte) 70), i_6_, DefinitionSub11.anIntArray9185, bool, (byte) 120, i_9_, i_11_, i_12_, HashNodeSub14.anIntArray9626, i_4_, (NodeSub45.aClass361Array7108[Component72.localPlayer.plane]), i_8_, i_7_, i_10_));
        if (i_13_ < 1) return false;
        Component253.anInt3203 = HashNodeSub14.anIntArray9626[-1 + i_13_];
        Component263.anInt1548 = DefinitionSub11.anIntArray9185[-1 + i_13_];
        NodeSub13.aBoolean6759 = false;
        if (i_5_ > -83) fpsOverlayEnabled = true;
        Component264.method2264(false);
        return true;
    }
}
