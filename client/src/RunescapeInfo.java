/* RunescapeInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class10` (JODE-obfuscated).
 * RuneScape game-info holder. References the 'runescape' game identifier and supplies title/world metadata to the client shell.
 */

final class RunescapeInfo {
    RenderableObject aClass318_Sub1_172;
    int anInt173;
    static int[][] anIntArrayArray174 = {{0, 2}, {0, 2}, {0, 0, 2}, {2, 0, 0}, {0, 2, 0}, {0, 0, 2}, {0, 5, 1, 4}, {0, 4, 4, 4}, {4, 4, 4, 0}, {6, 6, 6, 2, 2, 2}, {2, 2, 2, 6, 6, 6}, {0, 11, 6, 6, 6, 4}, {0, 2}, {0, 4, 4, 4}, {0, 4, 4, 4}};
    static int anInt175;
    NodeSub16Sub5 aClass348_Sub16_Sub5_176;
    int anInt177;
    int anInt178;
    static int[] anIntArray179;
    byte aByte180;
    static int anInt181;
    static int anInt182;
    Component277 aClass317_183;
    int anInt184;
    int anInt185;
    /** RuneScape game product ({@code id}=0, domain {@code runescape}). */
    static GameType RUNESCAPE;
    static int[] anIntArray187 = {-1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048};
    int anInt188;
    NodeSub19Sub1 aClass348_Sub19_Sub1_189;
    static int anInt190;
    static Component344 aClass87_191;
    NodeSub10 aClass348_Sub10_192;

    static final String getMenuTipOption(byte i) {
        anInt175++;
        if (Component364.aBoolean8335 || Component192.menuTip == null) return "";
        if (i < 51) return null;
        return (Component192.menuTip.option);
    }

    public static void clearStatics(byte i) {
        if (i < 101) clearStatics((byte) -85);
        anIntArray187 = null;
        anIntArray179 = null;
        RUNESCAPE = null;
        aClass87_191 = null;
        anIntArrayArray174 = null;
    }

    static final boolean hasOverlayFlag(int i, boolean bool, int i_0_) {
        if (bool != false) return false;
        anInt190++;
        return (i & 0x800) != 0 | DisplayModeManagerContainer347.method2077(-106, i_0_, i) || PacketReader.isPacketAllowed(i, i_0_, (byte) 88);
    }

    final boolean isPositionalSound(byte i) {
        anInt181++;
        if (i >= -12) clearStatics((byte) 101);
        return this.aByte180 == 2 || this.aByte180 == 3;
    }

    RunescapeInfo(byte i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, RenderableObject class318_sub1) {
        this.anInt177 = i_2_;
        this.anInt184 = i_4_;
        this.anInt188 = i_3_;
        this.anInt178 = i_5_;
        this.anInt185 = i_1_;
        this.aByte180 = i;
        this.anInt173 = i_6_;
        this.aClass318_Sub1_172 = class318_sub1;
    }

    static {
        RUNESCAPE = new GameType("runescape", 0);
    }
}
