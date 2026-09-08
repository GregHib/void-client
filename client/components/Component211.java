/* Component211 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Component211
/**
 * RENAMED from `Class140` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt1956;
    static int anInt1957;
    static int anInt1958;
    static Component183 aClass114_1959 = new Component183(81, 6);
    static int anInt1960;
    static StringCache aClass351_1961 = new StringCache(77, -1);
    static int anInt1962;

    static final void method1168(int i, int i_0_, Rectangle[] rectangles) throws Exception_Sub1 {
        anInt1957++;
        if (Buffer.anInt7207 != 1) Component158.aHa326.method3707(rectangles, i, 0, 0);
        else Component158.aHa326.method3707(rectangles, i, NewsFetcher.anInt4211, DefinitionSub8.anInt9157);
        if (i_0_ != 0) aClass351_1961 = null;
    }

    public static void method1169(boolean bool) {
        aClass351_1961 = null;
        aClass114_1959 = null;
        if (bool != false) aClass351_1961 = null;
    }

    static final void method1170(byte i) {
        anInt1956++;
        if (Component225.aFrame476 == null) {
            int i_1_ = NodeSub48.perFrameReset;
            int i_2_ = DisplayModeManagerContainer147.perDrawReset;
            if (i > -25) method1172((byte) -22, -1);
            int i_3_ = -i_1_ + -Component236.canvasWidth + SocketConnector.canvasWidth;
            int i_4_ = -i_2_ + (NpcNode.canvasHeight + -PacketReader.canvasHeight);
            do {
                if (i_1_ > 0 || i_3_ > 0 || i_2_ > 0 || i_4_ > 0) {
                    try {
                        java.awt.Container container;
                        if (RSACipher.aFrame4904 == null) {
                            if (ToolkitFactory.anApplet1530 == null) container = DefinitionSub9.anApplet_Sub1_9169;
                            else container = ToolkitFactory.anApplet1530;
                        } else container = RSACipher.aFrame4904;
                        int i_5_ = 0;
                        int i_6_ = 0;
                        if (container == RSACipher.aFrame4904) {
                            Insets insets = RSACipher.aFrame4904.getInsets();
                            i_5_ = insets.left;
                            i_6_ = insets.top;
                        }
                        Graphics graphics = container.getGraphics();
                        graphics.setColor(Color.black);
                        if (i_1_ > 0) graphics.fillRect(i_5_, i_6_, i_1_, NpcNode.canvasHeight);
                        if (i_2_ > 0) graphics.fillRect(i_5_, i_6_, SocketConnector.canvasWidth, i_2_);
                        if (i_3_ > 0) graphics.fillRect((-i_3_ + SocketConnector.canvasWidth + i_5_), i_6_, i_3_, NpcNode.canvasHeight);
                        if (i_4_ <= 0) break;
                        graphics.fillRect(i_5_, NpcNode.canvasHeight + (i_6_ - i_4_), SocketConnector.canvasWidth, i_4_);
                    } catch (Exception exception) {
                        break;
                    }
                    break;
                }
            } while (false);
        }
    }

    static final String method1171(int i, int i_7_, boolean bool) {
        if (i_7_ < 43) return null;
        anInt1958++;
        if (!bool || i < 0) return Integer.toString(i);
        return WaterShader.method3551(8320, 10, i, bool);
    }

    static final boolean method1172(byte i, int i_8_) {
        anInt1960++;
        int i_9_ = 35 / ((-45 - i) / 38);
        return (i_8_ >= 0 && i_8_ <= 3) || i_8_ == 9;
    }
}
