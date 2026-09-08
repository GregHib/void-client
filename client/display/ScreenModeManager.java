/* ScreenModeManager - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
/**
 * RENAMED from `Class215` (JODE-obfuscated).
 * Display/screen-mode helper. Creates and manages Frames (DisplayModeManagerContainer104.createFrame) and resolves display modes; the CS2 error 'unable to enter display mode' originates here.
 */

import java.awt.*;

final class ScreenModeManager {
    static int anInt2834 = 0;
    static int anInt2835;
    static float aFloat2836;
    static int anInt2837;
    static int anInt2838;
    static int anInt2839;

    static final void setScreenMode(byte i, boolean bool, int i_0_, int i_1_, int i_2_, int i_3_) {
        if (Component225.aFrame476 != null && (i_2_ != 3 || i_0_ != InputHandler.canvasWidth || i_3_ != DisplayModeManagerContainer295.canvasWidth)) {
            LoadingState.startLoadingTask(Component225.aFrame476, OggUrlStream.aClass297_8992, false);
            Component225.aFrame476 = null;
        }
        anInt2839++;
        int i_4_ = -33 / ((-74 - i) / 51);
        if (i_2_ == 3 && Component225.aFrame476 == null) {
            Component225.aFrame476 = DisplayModeManagerContainer104.createFrame(i_3_, i_0_, (OggUrlStream.aClass297_8992), 0, 14199, 0);
            if (Component225.aFrame476 != null) {
                InputHandler.canvasWidth = i_0_;
                DisplayModeManagerContainer295.canvasWidth = i_3_;
                DisplayModeManagerContainer389.savePreferences(37);
            }
        }
        // Prefer fallback to resizable (2) — not preferred prefs — if exclusive FS
        // fails; preferred may itself be 3 and would recurse forever.
        if (i_2_ == 3 && Component225.aFrame476 == null) setScreenMode((byte) -126, true, -1, i_1_, 2, -1);
        else {
            java.awt.Container container;
            if (Component225.aFrame476 != null) {
                NpcNode.canvasHeight = i_3_;
                SocketConnector.canvasWidth = i_0_;
                container = Component225.aFrame476;
            } else if (RSACipher.aFrame4904 == null) {
                if (ToolkitFactory.anApplet1530 == null) container = DefinitionSub9.anApplet_Sub1_9169;
                else container = ToolkitFactory.anApplet1530;
                SocketConnector.canvasWidth = container.getSize().width;
                NpcNode.canvasHeight = container.getSize().height;
            } else {
                Insets insets = RSACipher.aFrame4904.getInsets();
                SocketConnector.canvasWidth = RSACipher.aFrame4904.getSize().width + (-insets.left + -insets.right);
                NpcNode.canvasHeight = RSACipher.aFrame4904.getSize().height - (insets.top - -insets.bottom);
                container = RSACipher.aFrame4904;
            }
            if (i_2_ == 1) {
                // Fill the container instead of centering a fixed 765x503 canvas.
                DisplayModeManagerContainer23.canvasWidth = SocketConnector.canvasWidth;
                GlToolkitSub2.canvasHeight = NpcNode.canvasHeight;
                Component236.canvasWidth = SocketConnector.canvasWidth;
                PacketReader.canvasHeight = NpcNode.canvasHeight;
                NodeSub48.perFrameReset = 0;
                DisplayModeManagerContainer147.perDrawReset = 0;
            } else SpriteAtlasShader.method2158((byte) 56);
            if (Component326.LIVE != DisplayModeManagerContainer345.aClass364_165) {
                if (Component236.canvasWidth < 1024 && (PacketReader.canvasHeight < 768)) {
                    /* empty */
                }
            }
            if (bool) ParticleSystem.method3327(1406);
            else {
                DisplayModeManagerContainer50.gameCanvas.setSize(Component236.canvasWidth, (PacketReader.canvasHeight));
                if (!Component210.gameCanvasAttached) NodeSub8.toolkit.method3669(DisplayModeManagerContainer50.gameCanvas, Component236.canvasWidth, (PacketReader.canvasHeight));
                else s.method3980(86, DisplayModeManagerContainer50.gameCanvas);
                if (RSACipher.aFrame4904 == container) {
                    Insets insets = RSACipher.aFrame4904.getInsets();
                    DisplayModeManagerContainer50.gameCanvas.setLocation((NodeSub48.perFrameReset + insets.left), (insets.top - -DisplayModeManagerContainer147.perDrawReset));
                } else DisplayModeManagerContainer50.gameCanvas.setLocation(NodeSub48.perFrameReset, DisplayModeManagerContainer147.perDrawReset);
            }
            // Must match getWindowMode (1=fixed, 2=resizable) or CS2 shows "unable to enter display mode".
            Cp1252Decoder.fullscreenAvailable = i_2_ >= 2;
            if (r.anInt9721 != -1) Component339.method1713(true, 520);
            if (DefinitionSub8.aClass238_9165 != null && NativeLibLoader.isPostLoginState(true, Component49.clientState)) ShaderProgramSub2.method2145(-24498);
            for (int i_5_ = 0; i_5_ < 100; i_5_++)
                InflaterDecompressor.aBooleanArray2076[i_5_] = true;
            Component297.aBoolean4726 = true;
        }
    }

    static final boolean method1581(int i, char c) {
        anInt2838++;
        if (i >= -18) return false;
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }

    static final void method1582(int i) {
        anInt2837++;
        if (i == 7851) {
            do {
                try {
                    if (PlayerState.anInt7068 == 1) {
                        int i_6_ = Component122.aClass348_Sub16_Sub3_1564.getActiveVoices((byte) 123);
                        if (i_6_ > 0 && Component122.aClass348_Sub16_Sub3_1564.isOutputReady(124)) {
                            i_6_ -= Component329.anInt5994;
                            if (i_6_ < 0) i_6_ = 0;
                            Component122.aClass348_Sub16_Sub3_1564.setSampleRate(0, i_6_);
                            break;
                        }
                        Component122.aClass348_Sub16_Sub3_1564.method2877(-128);
                        Component122.aClass348_Sub16_Sub3_1564.clearDefinitions(i ^ 0x1eaf);
                        Component258.aClass26_1977 = null;
                        if (DisplayModeManagerContainer77.aClass45_1848 != null) PlayerState.anInt7068 = 2;
                        else PlayerState.anInt7068 = 0;
                        ShaderProgram.aClass348_Sub2_3683 = null;
                    }
                    if (PlayerState.anInt7068 != 3) break;
                    int i_7_ = Component122.aClass348_Sub16_Sub3_1564.getActiveVoices((byte) -87);
                    if (i_7_ < Component255.anInt1059 && Component122.aClass348_Sub16_Sub3_1564.isOutputReady(95)) {
                        i_7_ += DefinitionSub35.anInt9444;
                        if (Component255.anInt1059 < i_7_) i_7_ = Component255.anInt1059;
                        Component122.aClass348_Sub16_Sub3_1564.setSampleRate(i ^ 0x1eab, i_7_);
                    } else {
                        DefinitionSub35.anInt9444 = 0;
                        PlayerState.anInt7068 = 0;
                    }
                } catch (Exception exception) {
                    exception.printStackTrace();
                    Component122.aClass348_Sub16_Sub3_1564.method2877(-128);
                    DisplayModeManagerContainer77.aClass45_1848 = null;
                    ShaderProgram.aClass348_Sub2_3683 = null;
                    DebugPanic.aClass348_Sub16_Sub3_4743 = null;
                    Component258.aClass26_1977 = null;
                    PlayerState.anInt7068 = 0;
                    break;
                }
                break;
            } while (false);
        }
    }
}
