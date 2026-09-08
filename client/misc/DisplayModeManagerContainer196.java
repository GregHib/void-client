/* DisplayModeManagerContainer196 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer196
/**
 * RENAMED from `Class341` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static ClientSystemInfo aClass348_Sub24_4226 = new ClientSystemInfo(0, 0);
    static int anInt4227;
    static int anInt4228;
    static int anInt4229;
    static int anInt4230;
    static int anInt4231;
    static int anInt4232;
    static int[][] anIntArrayArray4233 = new int[6][];
    static Component24[] aClass105Array4234;
    static int anInt4235;
    static DisplayModeManagerContainer77[] aClass124Array4236 = new DisplayModeManagerContainer77[4];
    static int anInt4237;

    static final void method2676(int i, int i_0_, int i_1_, byte i_2_, int i_3_) {
        anInt4231++;
        float f = (float) DisplayModeManagerContainer229.anInt1267 / (float) DisplayModeManagerContainer229.anInt1259;
        int i_4_ = i;
        int i_5_ = i_0_;
        if (f < 1.0F) i_5_ = (int) (f * (float) i);
        else i_4_ = (int) ((float) i_0_ / f);
        i_1_ -= (i + -i_4_) / 2;
        i_3_ -= (i_0_ + -i_5_) / 2;
        Component377.anInt859 = -1;
        DebugOverlay.anInt3170 = -(DisplayModeManagerContainer229.anInt1267 * i_3_ / i_5_) + DisplayModeManagerContainer229.anInt1267;
        NodeSub36.anInt6992 = DisplayModeManagerContainer229.anInt1259 * i_1_ / i_4_;
        ModelStore.anInt4609 = -1;
        int i_6_ = 50 / ((-12 - i_2_) / 40);
        ColorTagNode.method2811(false);
    }

    public final String toString() {
        anInt4227++;
        throw new IllegalStateException();
    }

    public static void method2677(int i) {
        anIntArrayArray4233 = null;
        aClass348_Sub24_4226 = null;
        if (i >= 93) {
            aClass105Array4234 = null;
            aClass124Array4236 = null;
        }
    }

    public DisplayModeManagerContainer196() {
        /* empty */
    }

    static final void method2678(int i) {
        if (i != -2049) anIntArrayArray4233 = null;
        anInt4229++;
        if (r.aBoolean9722) {
            DisplayModeManagerContainer57 class46 = NpcNode.getChildComponent(JaclibLoader.anInt169, (byte) -54, Component90.anInt2046);
            if (class46 != null && class46.anObjectArray680 != null) {
                NodeSub36 class348_sub36 = new NodeSub36();
                class348_sub36.aClass46_6989 = class46;
                class348_sub36.anObjectArray6987 = class46.anObjectArray680;
                ClientScriptExecutor.runHook(class348_sub36);
            }
            Component281.anInt3829 = -1;
            r.aBoolean9722 = false;
            Component149.widgetCursorId = -1;
            if (class46 != null) Component111.markInterfaceDirty(-9343, class46);
        }
    }

    /** Align child of size {@code i_7_} in parent extent {@code i}: start/end/center. */
    final int getAlignedOffset(int i, int i_7_, int i_8_) {
        anInt4232++;
        if (i_8_ != 1595) return 38;
        int i_9_ = (Math.max(PacketReader.canvasHeight, i));
        if (Component134.aClass341_5808 == this) return 0;
        if (this == Component251.aClass341_5821) return i_9_ - i_7_;
        if (DisplayModeManagerContainer91.aClass341_399 == this) return (i_9_ - i_7_) / 2;
        return 0;
    }

    /** Replace all {@code string_10_} in {@code string_11_} with {@code string}. */
    static final String replaceAll(String string, boolean bool, String string_10_, String string_11_) {
        anInt4237++;
        for (int i = string_11_.indexOf(string_10_); i != -1; i = string_11_.indexOf(string_10_, string.length() + i))
            string_11_ = (string_11_.substring(0, i) + string + string_11_.substring(string_10_.length() + i));
        if (bool != true) method2678(45);
        return string_11_;
    }

    static final void method2681(int i) {
        if (i == 9864) {
            anInt4230++;
            if (NodeSub8.toolkit != null) {
                if (Component210.gameCanvasAttached) Component38.method1406(true);
                DisplayModeManagerContainer5.aClass76_1208.method775((byte) 69);
                DisplayModeManagerContainer58.method2433();
                Component308.method464(i + -9865);
                FriendsIgnoreList.clearHudSprites(-127);
                Component126.method3513(-113);
                Component329.method1779((byte) 124);
                if (Component293.aClass305_3304 != null) Component293.aClass305_3304.method2295((byte) 96);
                DisplayModeManagerContainer356.method2269(true);
                NodeSub18.method2938((byte) 127);
                DisplayModeManagerContainer172.method369(-29776);
                Component239.method3616(12639);
                HashNodeSub3.method3177(-78, false);
                for (int i_12_ = 0; i_12_ < 2048; i_12_++) {
                    Player player = (InterfaceRenderer.players[i_12_]);
                    if (player != null) {
                        for (int i_13_ = 0; ((player.aClass64Array10323).length > i_13_); i_13_++)
                            player.aClass64Array10323[i_13_] = null;
                    }
                }
                for (int i_14_ = 0; i_14_ < NodeSub32.anInt6930; i_14_++) {
                    Npc npc = (DefinitionSub23.aClass348_Sub22Array9319[i_14_].npc);
                    if (npc != null) {
                        for (int i_15_ = 0; i_15_ < (npc.aClass64Array10323).length; i_15_++)
                            npc.aClass64Array10323[i_15_] = null;
                    }
                }
                Cp1252Decoder.aClass101_5209 = null;
                Component270.aClass101_2123 = null;
                NodeSub8.toolkit.method3635((byte) 64);
                NodeSub8.toolkit = null;
            }
        }
    }

    static {
        anInt4235 = 0;
    }
}
