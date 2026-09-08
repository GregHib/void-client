/* Component98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component98
/**
 * RENAMED from `Class239_Sub10` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static int anInt5935;
    static int anInt5936;
    static int anInt5937;
    static StringCache aClass351_5938 = new StringCache(0, 0);
    static int anInt5939;
    static int anInt5940;
    static int anInt5941;
    static int anInt5942;
    static int anInt5943 = 1337;
    static int anInt5944;
    static float aFloat5945;
    static int anInt5946;
    static int anInt5947;
    static int anInt5948;

    Component98(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    /** Enqueue an area/world ambient sound when the matching SFX preference is enabled. */
    static final void queueAreaSound(int i, int i_0_, boolean bool, int i_1_, byte i_2_, int i_3_, int i_4_, int i_5_) {
        if (i_2_ > -85) getEffectivePlane(-14, 70, 13, -100);
        anInt5940++;
        if ((bool ? Component192.preferences.aClass239_Sub26_7215.method1838(-32350) : Component192.preferences.aClass239_Sub26_7272.method1838(-32350)) != 0 && i_3_ != 0 && Component335.anInt2021 < 50 && i != -1)
            GlFramebufferTexture.aClass10Array8531[Component335.anInt2021++] = new RunescapeInfo(!bool ? (byte) 2 : (byte) 3, i, i_3_, i_5_, i_0_, i_1_, i_4_, null);
    }

    final void validateValue(boolean bool) {
        anInt5941++;
        if (bool != false) setValue(-34, -61);
        if (this.preferenceValue < 0 || this.preferenceValue > 4) this.preferenceValue = getDefaultValue(20014);
    }

    /** Present HUD overlays (no camera tick): particles, root interface, menu tip priority. */
    static final void redrawHud(int i) {
        anInt5935++;
        ParticleSystem.method3324(NodeSub8.toolkit, (byte) 105, OpenGlShader.clientCycle);
        if (i != 85) anInt5943 = -99;
        if (r.anInt9721 != -1) DisplayModeManagerContainer216.method769(r.anInt9721, (byte) 118);
        for (int i_6_ = 0; NodeSub38.anInt7008 > i_6_; i_6_++) {
            if (InflaterDecompressor.aBooleanArray2076[i_6_]) DisplayModeManagerContainer259.aBooleanArray3438[i_6_] = true;
            Component143.aBooleanArray2326[i_6_] = InflaterDecompressor.aBooleanArray2076[i_6_];
            InflaterDecompressor.aBooleanArray2076[i_6_] = false;
        }
        Component255.anInt1064 = OpenGlShader.clientCycle;
        if (r.anInt9721 != -1) {
            NodeSub38.anInt7008 = 0;
            TheoraVideoPlayer.method842(false);
        }
        NodeSub8.toolkit.la();
        HashNodeSub20.method3281((byte) 77, NodeSub8.toolkit);
        int i_7_ = DisplayModeManagerContainer67.getTipCursorId(3112);
        if (i_7_ == -1) i_7_ = Component149.widgetCursorId;
        if (i_7_ == -1) i_7_ = HashNodeSub16Sub1.defaultCursorId;
        Component373.applyCustomCursor(0, i_7_);
        NodeSub51.anInt7267 = 0;
    }

    final void setValue(int i, int i_8_) {
        anInt5939++;
        this.preferenceValue = i_8_;
        int i_9_ = -17 / ((82 - i) / 35);
    }

    /** Effective render plane for tile (x,z), accounting for bridge/underlay flags. */
    static final int getEffectivePlane(int i, int i_10_, int i_11_, int i_12_) {
        int i_13_ = 56 / ((i - 74) / 43);
        anInt5947++;
        if ((0x8 & ObjectDeserializer.aByteArrayArrayArray6962[i_10_][i_12_][i_11_]) != 0) return 0;
        if (i_10_ > 0 && ((0x2 & ObjectDeserializer.aByteArrayArrayArray6962[1][i_12_][i_11_]) != 0)) return i_10_ + -1;
        return i_10_;
    }

    public static void method1763(int i) {
        aClass351_5938 = null;
        if (i != -15596) method1763(-92);
    }

    final int method1764(int i) {
        anInt5942++;
        if (i != -32350) method1763(18);
        return this.preferenceValue;
    }

    final int getValue(int i, int i_14_) {
        anInt5936++;
        if (i != 3) getDefaultValue(-95);
        return 1;
    }

    static final char method1765(char c, int i, int i_15_) {
        anInt5946++;
        if (c >= 192 && c <= 255) {
            if (c >= 192 && c <= 198) return 'A';
            if (c == 199) return 'C';
            if (c >= 200 && c <= 203) return 'E';
            if (c >= 204 && c <= 207) return 'I';
            if (c >= 210 && c <= 214) return 'O';
            if (c >= 217 && c <= 220) return 'U';
            if (c == 221) return 'Y';
            if (c == 223) return 's';
            if (c >= 224 && c <= 230) return 'a';
            if (c == 231) return 'c';
            if (c >= 232 && c <= 235) return 'e';
            if (c >= 236 && c <= 239) return 'i';
            if (c >= 242 && c <= 246) return 'o';
            if (c >= 249 && c <= 252) return 'u';
            if (c == 253 || c == 255) return 'y';
        }
        if (i_15_ != 105) aClass351_5938 = null;
        if (c == 338) return 'O';
        if (c == 339) return 'o';
        if (c == 376) return 'Y';
        return c;
    }

    static final Component184 method1766(byte i, int i_16_, CacheStore class45) {
        anInt5944++;
        if (i >= -24) return null;
        byte[] is = class45.getSingletonFile((byte) 73, i_16_);
        if (is == null) return null;
        return new Component184(is);
    }

    final int getDefaultValue(int i) {
        if (i != 20014) return 118;
        anInt5937++;
        return 3;
    }

    Component98(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }
}
