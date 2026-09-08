/* PlayerState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class348_Sub43` (JODE-obfuscated).
 * Player state node (extends renamed Node). Aggregates player-related sub-objects (NodeSub19Sub1, NodeSub16Sub5, NpcDefinition) plus numerous int state fields and an int[][][] lookup.
 */

final class PlayerState extends Node {
    static NodeSub16Sub4 aClass348_Sub16_Sub4_7065;
    int anInt7066;
    int anInt7067;
    static int anInt7068;
    int anInt7069;
    int anInt7070;
    int anInt7071;
    int anInt7072;
    static int anInt7073;
    int anInt7074;
    Component234 aClass23_7075;
    int anInt7076;
    NodeSub19Sub1 aClass348_Sub19_Sub1_7077;
    static int anInt7078;
    static int[][][] anIntArrayArrayArray7079 = new int[2][][];
    int anInt7080;
    NodeSub16Sub5 aClass348_Sub16_Sub5_7081;
    int anInt7082;
    int anInt7083;
    int anInt7084;
    NpcDefinition aClass348_Sub17_7085;
    int anInt7086;
    int anInt7087;
    int anInt7088;
    int anInt7089;
    int anInt7090;

    static final void method3298(byte i, boolean bool, Player player) {
        anInt7073++;
        if (DisplayModeManagerContainer306.menuEntryCount < 400) {
            if (Component72.localPlayer == player) {
                if (r.aBoolean9722 && (PauseTimer.anInt500 & 0x10) != 0) {
                    Component299.anInt450++;
                    DisplayModeManagerContainer368.addMenuEntry(false, (DisplayModeManagerContainer332.aString5000 + " -> <col=ffffff>" + FriendsIgnoreList.aClass274_3520.getLocalized(ObjectDeserializer.languageId, 544)), 0, (byte) -109, false, 0, -1, true, 50, player.anInt10290, DisplayModeManagerContainer332.aString5001, 0L, Component182.anInt9747);
                }
            } else {
                String string;
                if (player.anInt10564 == 0) {
                    boolean bool_0_ = true;
                    if ((Component72.localPlayer.anInt10561) != -1 && player.anInt10561 != -1) {
                        int i_1_ = (Math.max(player.combatLevel, (Component72.localPlayer.combatLevel)));
                        int i_2_ = (Math.min((Component72.localPlayer.anInt10561), player.anInt10561));
                        int i_3_ = 5 - (-(10 * i_1_ / 100) + -i_2_);
                        int i_4_ = (-player.combatLevel + (Component72.localPlayer.combatLevel));
                        if (i_4_ < 0) i_4_ = -i_4_;
                        if (i_3_ < i_4_) bool_0_ = false;
                    }
                    String string_5_ = ((WorldNameText.STELLARDAWN == PacketReader.currentGameType) ? FriendsIgnoreList.aClass274_3513.getLocalized(ObjectDeserializer.languageId, 544) : FriendsIgnoreList.aClass274_3511.getLocalized(ObjectDeserializer.languageId, 544));
                    if (player.combatLevel >= player.anInt10557)
                        string = (player.method2456(true, 255) + (!bool_0_ ? "<col=ffffff>" : (WorldNameText.method250((Component72.localPlayer.combatLevel), true, (player.combatLevel)))) + " (" + string_5_ + player.combatLevel + ")");
                    else
                        string = (player.method2456(true, 255) + (bool_0_ ? (WorldNameText.method250((Component72.localPlayer.combatLevel), true, (player.combatLevel))) : "<col=ffffff>") + " (" + string_5_ + player.combatLevel + "+" + (-player.combatLevel + player.anInt10557) + ")");
                } else if (player.anInt10564 == -1) string = player.method2456(true, 255);
                else string = (player.method2456(true, 255) + " (" + FriendsIgnoreList.aClass274_3512.getLocalized(ObjectDeserializer.languageId, 544) + player.anInt10564 + ")");
                if (r.aBoolean9722 && !bool && (0x8 & PauseTimer.anInt500) != 0) {
                    DisplayModeManagerContainer368.addMenuEntry(false, DisplayModeManagerContainer332.aString5000 + " -> <col=ffffff>" + string, 0, (byte) -109, false, 0, -1, true, 51, player.anInt10290, DisplayModeManagerContainer332.aString5001, player.anInt10290, Component182.anInt9747);
                    DisplayModeManagerContainer196.anInt4228++;
                }
                if (i <= 89) anInt7068 = -113;
                if (bool) DisplayModeManagerContainer368.addMenuEntry(true, "", 0, (byte) -115, false, 0, 0, false, -1, player.anInt10290, "<col=cccccc>" + string, 0L, -1);
                else {
                    for (int i_6_ = 7; i_6_ >= 0; i_6_--) {
                        if (Component252.aStringArray10195[i_6_] != null) {
                            short i_7_ = 0;
                            if ((PacketReader.currentGameType != RunescapeInfo.RUNESCAPE) || !(Component252.aStringArray10195[i_6_].equalsIgnoreCase(FriendsIgnoreList.aClass274_3506.getLocalized(ObjectDeserializer.languageId, 544)))) {
                                if (DisplayModeManagerContainer5.aBooleanArray1214[i_6_]) i_7_ = (short) 2000;
                            } else {
                                if ((Component72.localPlayer.combatLevel) < (player.combatLevel)) i_7_ = (short) 2000;
                                if ((Component72.localPlayer.anInt10542) != 0 && (player.anInt10542) != 0) {
                                    if ((player.anInt10542) != (Component72.localPlayer.anInt10542)) i_7_ = (short) 0;
                                    else i_7_ = (short) 2000;
                                }
                            }
                            short i_8_ = (short) (i_7_ + (DisplayModeManagerContainer207.aShortArray9768[i_6_]));
                            int i_9_ = (Canvas_Sub1.anIntArray60[i_6_] == -1 ? PauseTimer.anInt506 : Canvas_Sub1.anIntArray60[i_6_]);
                            DisplayModeManagerContainer368.addMenuEntry(false, "<col=ffffff>" + string, 0, (byte) -105, false, 0, -1, true, i_8_, player.anInt10290, (Component252.aStringArray10195[i_6_]), player.anInt10290, i_9_);
                            Canvas_Sub1.anInt69++;
                        }
                    }
                }
                if (!bool) {
                    for (MenuEntry class348_sub42_sub12 = (MenuEntry) DefinitionSub4.menuEntries.first(4); class348_sub42_sub12 != null; class348_sub42_sub12 = ((MenuEntry) DefinitionSub4.menuEntries.next((byte) 105))) {
                        if ((class348_sub42_sub12.opcode) == 19) {
                            class348_sub42_sub12.extraTarget = "<col=ffffff>" + string;
                            break;
                        }
                    }
                }
            }
        }
    }

    final void method3299(byte i) {
        anInt7078++;
        this.aClass348_Sub16_Sub5_7081 = null;
        this.aClass348_Sub19_Sub1_7077 = null;
        int i_10_ = 71 / ((i - -26) / 58);
        this.aClass23_7075 = null;
        this.aClass348_Sub17_7085 = null;
    }

    public static void method3300(int i) {
        anIntArrayArrayArray7079 = null;
        aClass348_Sub16_Sub4_7065 = null;
        if (i != 0) method3300(-61);
    }

    static {
        anInt7068 = 0;
    }
}
