/* Component114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component114
/**
 * RENAMED from `Class302` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    int anInt3831;
    int anInt3832;
    int anInt3833;
    int anInt3834 = -1;
    int anInt3835;
    static int anInt3836;
    int anInt3837;
    int anInt3838;
    int anInt3839;
    int anInt3840;
    static int anInt3841;

    /** Select/filter a world-list entry and clear the pending world request. */
    static final void selectWorldListEntry(boolean bool, int i, int i_0_, int i_1_, boolean bool_2_) {
        Component99.method950(i_0_, 0, Component304.aClass110_Sub1Array1146.length + -1, bool, (byte) 56, i_1_, bool_2_);
        anInt3836++;
        ScreenModeManager.anInt2834 = i;
        Component218.aClass348_Sub26_2332 = null;
    }

    /** Per-frame: update follow/orbit camera, particles, and HUD dirty flags. */
    static final void pulseCameraAndHud(byte i, long l) {
        try {
            anInt3841++;
            if (Component335.aClass357ArrayArrayArray2029 != null) {
                if (DefinitionSub21.cameraMode != 1 && DefinitionSub21.cameraMode != 5) {
                    if (DefinitionSub21.cameraMode == 4) CommandHandler.updateOrbitCamera((byte) 125, l);
                } else Canvas_Sub1.updateFollowCamera(-1, l);
            }
            ParticleSystem.method3324(NodeSub8.toolkit, (byte) 83, OpenGlShader.clientCycle);
            if (r.anInt9721 != -1) DisplayModeManagerContainer216.method769(r.anInt9721, (byte) 118);
            for (int i_3_ = 0; i_3_ < NodeSub38.anInt7008; i_3_++) {
                if (InflaterDecompressor.aBooleanArray2076[i_3_]) DisplayModeManagerContainer259.aBooleanArray3438[i_3_] = true;
                Component143.aBooleanArray2326[i_3_] = InflaterDecompressor.aBooleanArray2076[i_3_];
                InflaterDecompressor.aBooleanArray2076[i_3_] = false;
            }
            Component255.anInt1064 = OpenGlShader.clientCycle;
            Component2.method198(null, false, -1, -1);
            Component143.method1343(-1, null, 1, -1);
            if (r.anInt9721 != -1) {
                NodeSub38.anInt7008 = 0;
                TheoraVideoPlayer.method842(false);
            }
            NodeSub8.toolkit.la();
            HashNodeSub20.method3281((byte) 46, NodeSub8.toolkit);
            int i_4_ = DisplayModeManagerContainer67.getTipCursorId(3112);
            if (i_4_ == -1) i_4_ = Component149.widgetCursorId;
            if (i_4_ == -1) i_4_ = HashNodeSub16Sub1.defaultCursorId;
            Component373.applyCustomCursor(0, i_4_);
            if (i == -43) {
                int i_5_ = (Component72.localPlayer.getSize((byte) 103) << 8);
                DisplayModeManagerContainer147.method2655(98, Component72.localPlayer.plane, NodeSub51.anInt7267, i_5_ + (Component72.localPlayer.y), (Component72.localPlayer.x - -i_5_));
                NodeSub51.anInt7267 = 0;
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, "wo.B(" + i + ',' + l + ')');
        }
    }

    public Component114() {
        /* empty */
    }
}
