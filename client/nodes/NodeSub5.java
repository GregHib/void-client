/* NodeSub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.io.IOException;
import java.net.Socket;

abstract class NodeSub5
/**
 * RENAMED from `Class348_Sub5` (JODE-obfuscated).
 * Evidence: subclass of Node (hierarchy)
 */ extends Node {
    GlToolkitSub2 aHa_Sub2_6618;
    static int anInt6619;
    static int anInt6620;
    boolean aBoolean6621;
    static int anInt6622;
    static int anInt6623;
    static byte[] aByteArray6624 = new byte[2048];
    static int anInt6625;
    static int anInt6626;
    static Component24 aClass105_6627;
    static int anInt6628;
    static int anInt6629;

    abstract void method2750(GlTexture class258_sub3, GlTexture class258_sub3_0_, int i, byte i_1_);

    abstract boolean method2751(boolean bool);

    static final Component161 method2752(int i, int i_2_) {
        anInt6625++;
        Component161[] class138s = NodeSub27.method3002((byte) -97);
        for (int i_3_ = i_2_; class138s.length > i_3_; i_3_++) {
            if (i == class138s[i_3_].anInt1941) return class138s[i_3_];
        }
        return null;
    }

    static final GraphicsToolkit method2753(boolean bool, int i, int i_4_, Canvas canvas, d var_d) {
        try {
            anInt6628++;
            if (bool != true) aByteArray6624 = null;
            return new GlToolkitSub1(canvas, var_d, i_4_, i);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("fba.M(" + bool + ',' + i + ',' + i_4_ + ',' + (canvas != null ? "{...}" : "null") + ',' + (var_d != null ? "{...}" : "null") + ')'));
        }
    }

    abstract void method2754(int i, byte i_5_, int i_6_);

    static final void method2755(int i, int i_7_, int i_8_) {
        anInt6629++;
        if ((~PlayerState.anInt7068) != i) {
            if (i_8_ >= 0) AbstractShaderSub3.anIntArray7299[i_8_] = i_7_;
            else {
                for (int i_9_ = 0; i_9_ < 16; i_9_++)
                    AbstractShaderSub3.anIntArray7299[i_9_] = i_7_;
            }
        }
        Component122.aClass348_Sub16_Sub3_1564.setChannelPitchBendRange(i_7_, i_8_, -7836);
    }

    abstract void method2756(byte i, int i_10_);

    static final void method2757(int i) {
        anInt6620++;
        if (AbstractShaderSub2.anInt7297 != 0) {
            try {
                if (i >= 82) {
                    if (++RequestProcessor.anInt2264 > 2000) {
                        if (DefinitionSub8.aClass238_9165 != null) {
                            DefinitionSub8.aClass238_9165.close((byte) 36);
                            DefinitionSub8.aClass238_9165 = null;
                        }
                        if (SpriteSub1.anInt8398 >= 2) {
                            AbstractShaderSub2.anInt7297 = 0;
                            Component48.anInt4337 = -5;
                            return;
                        }
                        ItemDefinitionProvider.aClass161_3285.method1259(0);
                        AbstractShaderSub2.anInt7297 = 1;
                        RequestProcessor.anInt2264 = 0;
                        SpriteSub1.anInt8398++;
                    }
                    if (AbstractShaderSub2.anInt7297 == 1) {
                        DisplayModeManagerContainer273.aClass144_5800 = (ItemDefinitionProvider.aClass161_3285.method1262(OggUrlStream.aClass297_8992, (byte) 36));
                        AbstractShaderSub2.anInt7297 = 2;
                    }
                    if (AbstractShaderSub2.anInt7297 == 2) {
                        if (DisplayModeManagerContainer273.aClass144_5800.status == 2) throw new IOException();
                        if (DisplayModeManagerContainer273.aClass144_5800.status != 1) return;
                        DefinitionSub8.aClass238_9165 = OggStreamReader.openSocketStream(((Socket) (DisplayModeManagerContainer273.aClass144_5800.result)), (byte) 24, 7500);
                        DisplayModeManagerContainer273.aClass144_5800 = null;
                        Component302.method1802(0);
                        AbstractShaderSub2.anInt7297 = 4;
                    }
                    if (AbstractShaderSub2.anInt7297 == 4) {
                        if (DefinitionSub8.aClass238_9165.availableAtLeast(1, 104)) {
                            DefinitionSub8.aClass238_9165.readBytes(1, 0, (byte) -116, (Component80.packetBuffer.payload));
                            int i_11_ = 0xff & (Component80.packetBuffer.payload[0]);
                            Component48.anInt4337 = i_11_;
                            AbstractShaderSub2.anInt7297 = 0;
                            DefinitionSub8.aClass238_9165.close((byte) 36);
                            DefinitionSub8.aClass238_9165 = null;
                        }
                    }
                }
            } catch (IOException ioexception) {
                if (DefinitionSub8.aClass238_9165 != null) {
                    DefinitionSub8.aClass238_9165.close((byte) 36);
                    DefinitionSub8.aClass238_9165 = null;
                }
                if (SpriteSub1.anInt8398 < 2) {
                    ItemDefinitionProvider.aClass161_3285.method1259(0);
                    RequestProcessor.anInt2264 = 0;
                    SpriteSub1.anInt8398++;
                    AbstractShaderSub2.anInt7297 = 1;
                } else {
                    Component48.anInt4337 = -4;
                    AbstractShaderSub2.anInt7297 = 0;
                }
            }
        }
    }

    abstract boolean method2758(int i);

    final boolean method2759(int i) {
        if (i != 1) return true;
        anInt6626++;
        return false;
    }

    final boolean method2760(byte i) {
        if (i != 1) method2763((byte) 37);
        anInt6619++;
        return this.aBoolean6621;
    }

    int method2761(boolean bool) {
        anInt6622++;
        if (bool != true) method2757(-63);
        return 0;
    }

    public static void method2762(int i) {
        aByteArray6624 = null;
        aClass105_6627 = null;
        int i_12_ = -23 % ((i - -24) / 47);
    }

    abstract void method2763(byte i);

    NodeSub5(GlToolkitSub2 var_ha_Sub2) {
        this.aHa_Sub2_6618 = var_ha_Sub2;
    }

    final int method2764(int i) {
        if (i != 1) aByteArray6624 = null;
        anInt6623++;
        return 1;
    }
}
