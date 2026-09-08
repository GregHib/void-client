/* OggStream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class348_Sub23` (JODE-obfuscated).
 * Abstract Ogg audio-stream decoder (extends Node). Declares shutdown(byte) and handlePacket(byte,OggPacket); concrete subclasses decode Ogg packets from various sources.
 */

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

abstract class OggStream extends Node {
    static int anInt6863;
    static int anInt6864;
    static float[] aFloatArray6865 = new float[16384];
    static int anInt6866;
    static float[] aFloatArray6867 = new float[16384];
    int anInt6868;
    OggStreamState anOggStreamState6869;
    static int anInt6870;

    static final int method2960(boolean bool, int i) {
        if (i >= -16) aFloatArray6865 = null;
        anInt6870++;
        int i_0_ = Buffer.anInt7207;
        while_128_:
        do {
            do {
                if (i_0_ == 0) {
                    if (bool) return 0;
                    return DefinitionSub8.anInt9157;
                } else if (i_0_ != 1) {
                    if (i_0_ == 2) break;
                    break while_128_;
                }
                return DefinitionSub8.anInt9157;
            } while (false);
            return 0;
        } while (false);
        return 0;
    }

    abstract void shutdown(byte i);

    public static void method2962(int i) {
        aFloatArray6865 = null;
        aFloatArray6867 = null;
        if (i != -31055) method2966(-119, -98, true);
    }

    final void method2963(OggPacket oggpacket, int i) {
        handlePacket((byte) -120, oggpacket);
        if (i != 16384) aFloatArray6867 = null;
        anInt6863++;
        this.anInt6868++;
    }

    abstract void handlePacket(byte i, OggPacket oggpacket);

    static final void method2965(String string, int i, boolean bool, int i_1_) {
        anInt6866++;
        Component38.method1406(true);
        if (i == 0) {
            NodeSub8.toolkit = Component65.method958(true, 0, DefinitionSub4.modelProvider, Component192.preferences.aClass239_Sub20_7248.method1808(-32350) * 2, DisplayModeManagerContainer50.gameCanvas, Component257.aClass45_4796);
            if (string != null) {
                NodeSub8.toolkit.GA(0);
                Component184 class143 = Component388.method1819(DisplayModeManagerContainer167.p12FullGroupId, 0, -117, Component65.aClass45_1627);
                BitmapFont class324 = (NodeSub8.toolkit.method3686(class143, Component170.method1519(Component158.aClass45_322, DisplayModeManagerContainer167.p12FullGroupId, 0), true));
                Component211.method1170((byte) -89);
                Component149.method3511(true, class324, class143, string, 2, NodeSub8.toolkit);
            }
        } else {
            GraphicsToolkit var_ha = null;
            if (string != null) {
                var_ha = Component65.method958(true, 0, DefinitionSub4.modelProvider, 0, DisplayModeManagerContainer50.gameCanvas, Component257.aClass45_4796);
                var_ha.GA(0);
                Component184 class143 = Component388.method1819(DisplayModeManagerContainer167.p12FullGroupId, 0, -115, Component65.aClass45_1627);
                BitmapFont class324 = var_ha.method3686(class143, Component170.method1519((Component158.aClass45_322), DisplayModeManagerContainer167.p12FullGroupId, 0), true);
                Component211.method1170((byte) -107);
                Component149.method3511(true, class324, class143, string, i_1_ + 2, var_ha);
            }
            try {
                NodeSub8.toolkit = Component65.method958(true, i, DefinitionSub4.modelProvider, 2 * Component192.preferences.aClass239_Sub20_7248.method1808(i_1_ + -32350), DisplayModeManagerContainer50.gameCanvas, Component257.aClass45_4796);
                if (string != null) {
                    var_ha.GA(0);
                    Component184 class143 = Component388.method1819(DisplayModeManagerContainer167.p12FullGroupId, 0, -51, Component65.aClass45_1627);
                    BitmapFont class324 = (var_ha.method3686(class143, Component170.method1519(Component158.aClass45_322, DisplayModeManagerContainer167.p12FullGroupId, 0), true));
                    Component211.method1170((byte) -26);
                    Component149.method3511(true, class324, class143, string, i_1_ + 2, var_ha);
                }
                if (NodeSub8.toolkit.method3693()) {
                    boolean bool_2_ = true;
                    try {
                        bool_2_ = (DefinitionSub20.aClass348_Sub4_9264.anInt6609) > 256;
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                    NodeBase var_za;
                    if (!bool_2_) var_za = NodeSub8.toolkit.method3702(104857600);
                    else var_za = NodeSub8.toolkit.method3702(146800640);
                    NodeSub8.toolkit.method3651(var_za);
                }
            } catch (Throwable throwable) {
                int i_3_ = Component192.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350);
                if (i_3_ == 2) GpsOverlay.aBoolean1952 = true;
                Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub25_7271), 0);
                method2965(string, i_3_, bool, i_1_);
                return;
            } finally {
                if (var_ha != null) {
                    try {
                        var_ha.method3635((byte) -111);
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                }
            }
        }
        Component192.preferences.aClass239_Sub25_7271.method1826(!bool, -142238264);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub25_7271), i);
        Buffer.disposeActiveToolkit(i_1_ + -78);
        NodeSub8.toolkit.method3650(10000);
        NodeSub8.toolkit.X(32);
        Component270.aClass101_2123 = NodeSub8.toolkit.method3654();
        Cp1252Decoder.aClass101_5209 = NodeSub8.toolkit.method3654();
        Component200.method2196((byte) -9);
        NodeSub8.toolkit.method3630(Component192.preferences.aClass239_Sub2_7228.method1726(-32350) == 1);
        if (NodeSub8.toolkit.method3627()) DefinitionSub33.method3137(Component192.preferences.aClass239_Sub12_7243.method1771(-32350) == 1, (byte) -24);
        Component263.method873(AbstractShaderSub4.anInt7319 >> 3, 21719, NodeSub8.toolkit, ParametricDefinition.anInt9109 >> 3);
        DisplayModeManagerContainer154.method773(true);
        r.aBoolean9719 = false;
        NativeLibraryLoader.cachedDisplayModes = null;
        RuntimeException_Sub1.aBoolean4604 = true;
        HashNodeSub3.method3179(i_1_);
    }

    OggStream(OggStreamState oggstreamstate) {
        this.anOggStreamState6869 = oggstreamstate;
    }

    static final void method2966(int i, int i_4_, boolean bool) {
        anInt6864++;
        RSARequest class348_sub42_sub15 = FriendLoginMessage.method2516(i, (byte) 105, 14);
        if (bool != false) aFloatArray6865 = null;
        class348_sub42_sub15.method3246(-25490);
        class348_sub42_sub15.anInt9652 = i_4_;
    }

    static {
        double d = 3.834951969714103E-4;
        for (int i = 0; i < 16384; i++) {
            aFloatArray6865[i] = (float) Math.sin(d * (double) i);
            aFloatArray6867[i] = (float) Math.cos((double) i * d);
        }
    }
}
