/* ColoredText - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
/**
 * RENAMED from `Class239_Sub24` (JODE-obfuscated).
 * Colored text component. Extends Component339; renders <col=00ffff>/<col=ff9040> color-tagged strings as styled text.
 */

import java.io.File;

final class ColoredText extends Component339 {
    static int anInt6084;
    static int anInt6085;
    static int anInt6086;
    static int anInt6087;
    static int anInt6088;
    static Component183 aClass114_6089 = new Component183(41, 3);
    static int anInt6090;
    static int anInt6091;
    static int anInt6092;
    static String[][] aStringArrayArray6093 = {{"M1", "M2", "S1", "F"}, {"M1", "M2", "M3", "S1", "S2", "F"}, {"M1", "M2", "M3", "M4", "S1", "S2", "S3", "F"}};
    static int anInt6094;
    static int anInt6095;
    static NodeCache aClass60_6096 = new NodeCache(8);
    static Component24 aClass105_6097;
    static Component80 aClass299_6098;

    final void method1712(int i, int i_0_) {
        int i_1_ = -73 % ((i - 82) / 35);
        this.preferenceValue = i_0_;
        anInt6085++;
    }

    ColoredText(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    final int method1820(int i) {
        if (i != -32350) return -43;
        anInt6091++;
        return this.preferenceValue;
    }

    static final byte[] method1821(int i, File file) {
        anInt6086++;
        int i_2_ = 34 % ((i - 31) / 39);
        return DisplayModeManagerContainer363.method2607((int) file.length(), file, 121);
    }

    public static void method1822(byte i) {
        aClass114_6089 = null;
        aClass60_6096 = null;
        aClass105_6097 = null;
        aStringArrayArray6093 = null;
        aClass299_6098 = null;
        if (i != 110) aClass299_6098 = null;
    }

    final int method1710(int i) {
        if (i != 20014) return -20;
        anInt6084++;
        return 1;
    }

    final int method1714(int i, int i_3_) {
        anInt6092++;
        if (this.preferences.method3422(674) == RunescapeInfo.RUNESCAPE) {
            if (this.preferences.method3425(i + -70)) return 3;
            if (i_3_ == 0 || this.preferences.aClass239_Sub9_7256.method1759(-32350) == 1) return 1;
            return 2;
        }
        if (i != 3) method1716(true);
        return 3;
    }

    static final void method1823(GraphicsToolkit var_ha, int i, int i_4_, byte i_5_) {
        anInt6088++;
        int i_6_ = 56 % ((68 - i_5_) / 58);
        if (i >= 0 && i_4_ >= 0 && DisplayModeManagerContainer220.anInt282 != 0 && DisplayModeManagerContainer50.anInt3861 != 0) {
            DisplayModeManagerContainer204 class101;
            int i_7_;
            int i_8_;
            int i_9_;
            int i_10_;
            int i_11_;
            int i_12_;
            if (Component210.gameCanvasAttached) {
                HashTable.method1010(false, false);
                class101 = var_ha.method3640();
                int[] is = var_ha.Y();
                i_7_ = is[0];
                i_8_ = is[1];
                i_9_ = is[3];
                i_10_ = is[2];
                i_11_ = i + Component221.method1082(-81, false);
                i_12_ = OggStream.method2960(false, -52) + i_4_;
            } else {
                var_ha.DA(Component226.anInt4171, Component275.anInt2688, DisplayModeManagerContainer220.anInt282, DisplayModeManagerContainer50.anInt3861);
                i_8_ = Component275.anInt2688;
                i_9_ = DisplayModeManagerContainer50.anInt3861;
                i_7_ = Component226.anInt4171;
                i_10_ = DisplayModeManagerContainer220.anInt282;
                var_ha.KA(Component247.anInt4911, TcpSocketStream.anInt5832, DisplayModeManagerContainer220.anInt282, DisplayModeManagerContainer50.anInt3861);
                class101 = var_ha.method3654();
                class101.method903(WorldNameText.anInt8633, Component54.anInt8668, CookieBuilder.anInt620, ComponentSettings.anInt7092, Component337.anInt3650, NodeSub51.anInt7244);
                var_ha.method3638(class101);
                i_12_ = i_4_;
                i_11_ = i;
            }
            Component127.method1626(1, true);
            if (i_10_ == 0) i_10_ = 1;
            if (i_9_ == 0) i_9_ = 1;
            if (NodeSub1Sub1.aSArray8801 != null && (!r.aBoolean9722 || (0x40 & PauseTimer.anInt500) != 0)) {
                int i_13_ = -1;
                int i_14_ = -1;
                int i_15_ = var_ha.i();
                int i_16_ = var_ha.XA();
                int i_17_;
                int i_18_;
                int i_19_;
                int i_20_;
                if (DisplayModeManagerContainer50.aBoolean3870) {
                    i_17_ = i_18_ = Component72.anInt1906 * (-i_7_ + i_11_) / i_10_;
                    i_19_ = i_20_ = Component72.anInt1906 * (-i_8_ + i_12_) / i_9_;
                } else {
                    i_17_ = i_15_ * (-i_7_ + i_11_) / i_10_;
                    i_19_ = i_15_ * (i_12_ + -i_8_) / i_9_;
                    i_20_ = i_16_ * (-i_8_ + i_12_) / i_9_;
                    i_18_ = (i_11_ - i_7_) * i_16_ / i_10_;
                }
                int[] is = {i_17_, i_19_, i_15_};
                int[] is_21_ = {i_18_, i_20_, i_16_};
                class101.method890(is);
                class101.method890(is_21_);
                float f = Component83.method1012((float) is[1], (float) is_21_[0], (float) is[2], (float) is_21_[2], 4, (float) is[0], (byte) 123, (float) is_21_[1]);
                if (f > 0.0F) {
                    int i_22_ = is_21_[0] + -is[0];
                    int i_23_ = -is[2] + is_21_[2];
                    int i_24_ = (int) ((float) is[0] + (float) i_22_ * f);
                    int i_25_ = (int) ((float) is[2] + (float) i_23_ * f);
                    i_13_ = (Component72.localPlayer.getSize((byte) 71) + -1 << 8) + i_24_ >> 9;
                    i_14_ = i_25_ - -(Component72.localPlayer.getSize((byte) 73) + -1 << 8) >> 9;
                    int i_26_ = (Component72.localPlayer.plane);
                    if (i_26_ < 3 && ((0x2 & (ObjectDeserializer.aByteArrayArrayArray6962[1][i_24_ >> 9][i_25_ >> 9])) != 0)) i_26_++;
                }
                if (i_13_ != -1 && i_14_ != -1) {
                    if (!r.aBoolean9722 || (0x40 & PauseTimer.anInt500) == 0) {
                        if (DisplayModeManagerContainer145.aBoolean1801) DisplayModeManagerContainer368.addMenuEntry(false, "", i_14_, (byte) -109, true, i_13_, -1, true, 12, i_14_ | i_13_ << 0, (FriendsIgnoreList.aClass274_3510.getLocalized(ObjectDeserializer.languageId, 544)), 0L, -1);
                        Component48.anInt4334++;
                        DisplayModeManagerContainer368.addMenuEntry(false, "", i_14_, (byte) -82, true, i_13_, -1, true, 19, i_14_ | i_13_ << 0, Component323.aString5882, 0L, Component79.anInt4144);
                    } else {
                        DisplayModeManagerContainer57 class46 = NpcNode.getChildComponent(JaclibLoader.anInt169, (byte) -54, Component90.anInt2046);
                        if (class46 == null) DisplayModeManagerContainer196.method2678(-2049);
                        else DisplayModeManagerContainer368.addMenuEntry(false, " ->", i_14_, (byte) -101, true, i_13_, -1, true, 15, i_13_ << 0 | i_14_, DisplayModeManagerContainer332.aString5001, 0L, (Component182.anInt9747));
                    }
                }
            }
            if (Component210.gameCanvasAttached) DebugPanicSub1.method2129((byte) 86);
            for (int i_27_ = 0; (i_27_ < (!Component210.gameCanvasAttached ? 1 : 2)); i_27_++) {
                boolean bool = i_27_ == 0;
                DisplayModeManagerContainer154 class76 = (bool ? DisplayModeManagerContainer5.aClass76_1208 : PacketReader.aClass76_10436);
                int i_28_ = i;
                int i_29_ = i_4_;
                if (Component210.gameCanvasAttached) {
                    HashTable.method1010(false, bool);
                    i_28_ += Component221.method1082(-92, bool);
                    i_29_ += OggStream.method2960(bool, -48);
                }
                Component315 class243 = class76.aClass243_1282;
                for (RenderableSub4 class318_sub4 = (RenderableSub4) class243.method1872(8); class318_sub4 != null; class318_sub4 = (RenderableSub4) class243.method1878((byte) -123)) {
                    if ((RuntimeException_Sub1.aBoolean4599 || ((Component72.localPlayer.plane) == class318_sub4.aClass318_Sub1_6410.plane)) && class318_sub4.method2504(i_29_, i_28_, var_ha, -115)) {
                        boolean bool_30_ = false;
                        boolean bool_31_ = false;
                        int i_32_;
                        int i_33_;
                        if (class318_sub4.aClass318_Sub1_6410 instanceof Component327) {
                            i_32_ = ((Component327) class318_sub4.aClass318_Sub1_6410).aShort8750;
                            i_33_ = ((Component327) class318_sub4.aClass318_Sub1_6410).aShort8743;
                        } else {
                            i_32_ = (class318_sub4.aClass318_Sub1_6410.y >> 9);
                            i_33_ = (class318_sub4.aClass318_Sub1_6410.x >> 9);
                        }
                        if (class318_sub4.aClass318_Sub1_6410 instanceof Player) {
                            Player player = ((Player) (class318_sub4.aClass318_Sub1_6410));
                            int i_34_ = player.getSize((byte) 78);
                            if (((0x1 & i_34_) == 0 && (0x1ff & (player.x)) == 0 && (0x1ff & (player.y)) == 0) || ((i_34_ & 0x1) == 1 && ((player.x) & 0x1ff) == 256 && ((player.y) & 0x1ff) == 256)) {
                                int i_35_ = (player.x - (-1 + player.getSize((byte) 82) << 8));
                                int i_36_ = (player.y + -(-1 + player.getSize((byte) 105) << 8));
                                for (int i_37_ = 0; (Component324.anInt2057 > i_37_); i_37_++) {
                                    NpcNode class348_sub22 = ((NpcNode) (Component21.aClass356_3654.get(DisplayModeManagerContainer238.anIntArray1233[i_37_], -6008)));
                                    if (class348_sub22 != null) {
                                        Npc npc = (class348_sub22.npc);
                                        if ((OpenGlShader.clientCycle != (npc.anInt10215)) && (npc.aBoolean10309)) {
                                            int i_38_ = ((npc.x) - ((npc.definition.anInt1399) + -1 << 8));
                                            int i_39_ = (-((-1 + (npc.definition.anInt1399)) << 8) + (npc.y));
                                            if (i_35_ <= i_38_ && ((-(i_38_ + -i_35_ >> 9) + (player.getSize((byte) 68))) >= (npc.definition.anInt1399)) && i_36_ <= i_39_ && ((-(-i_36_ + i_39_ >> 9) + (player.getSize((byte) 97))) >= (npc.definition.anInt1399))) {
                                                ParticleShader.addNpcMenuOptions(((class318_sub4.aClass318_Sub1_6410.plane) != (Component72.localPlayer.plane)), false, npc);
                                                npc.anInt10215 = OpenGlShader.clientCycle;
                                            }
                                        }
                                    }
                                }
                                int i_40_ = ShaderCompilerSub1.anInt6513;
                                int[] is = ShaderProgramSub7.anIntArray6290;
                                for (int i_41_ = 0; (i_40_ > i_41_); i_41_++) {
                                    Player player_42_ = (InterfaceRenderer.players[is[i_41_]]);
                                    if ((player_42_ != null) && (OpenGlShader.clientCycle != (player_42_.anInt10215)) && (player != player_42_) && (player_42_.aBoolean10309)) {
                                        int i_43_ = ((player_42_.x) + -((player_42_.getSize((byte) 94) - 1) << 8));
                                        int i_44_ = ((player_42_.y) + -((-1 + (player_42_.getSize((byte) 82))) << 8));
                                        if ((i_43_ >= i_35_) && ((player.getSize((byte) 70) - (-i_35_ + i_43_ >> 9)) >= player_42_.getSize((byte) 89)) && (i_44_ >= i_36_) && ((player.getSize((byte) 42) - (i_44_ - i_36_ >> 9)) >= player_42_.getSize((byte) 127))) {
                                            PlayerState.method3298((byte) 114, ((class318_sub4.aClass318_Sub1_6410.plane) != (Component72.localPlayer.plane)), player_42_);
                                            player_42_.anInt10215 = OpenGlShader.clientCycle;
                                        }
                                    }
                                }
                            }
                            if (OpenGlShader.clientCycle == player.anInt10215) continue;
                            PlayerState.method3298((byte) 96, ((Component72.localPlayer.plane) != class318_sub4.aClass318_Sub1_6410.plane), player);
                            player.anInt10215 = OpenGlShader.clientCycle;
                        }
                        if (class318_sub4.aClass318_Sub1_6410 instanceof Npc) {
                            Npc npc = ((Npc) (class318_sub4.aClass318_Sub1_6410));
                            if (npc.definition != null) {
                                if (((npc.definition.anInt1399 & 0x1) == 0 && (0x1ff & (npc.x)) == 0 && (0x1ff & (npc.y)) == 0) || ((0x1 & npc.definition.anInt1399) == 1 && (0x1ff & (npc.x)) == 256 && ((npc.y) & 0x1ff) == 256)) {
                                    int i_45_ = ((npc.x) - ((-1 + npc.definition.anInt1399) << 8));
                                    int i_46_ = ((npc.y) - (npc.definition.anInt1399 - 1 << 8));
                                    for (int i_47_ = 0; i_47_ < Component324.anInt2057; i_47_++) {
                                        NpcNode class348_sub22 = ((NpcNode) (Component21.aClass356_3654.get(DisplayModeManagerContainer238.anIntArray1233[i_47_], -6008)));
                                        if (class348_sub22 != null) {
                                            Npc npc_48_ = (class348_sub22.npc);
                                            if (((npc_48_.anInt10215) != OpenGlShader.clientCycle) && (npc != npc_48_) && (npc_48_.aBoolean10309)) {
                                                int i_49_ = (-((npc_48_.definition.anInt1399) - 1 << 8) + (npc_48_.x));
                                                int i_50_ = ((npc_48_.y) + -((npc_48_.definition.anInt1399) - 1 << 8));
                                                if (i_49_ >= i_45_ && ((npc_48_.definition.anInt1399) <= ((npc.definition.anInt1399) - (-i_45_ + i_49_ >> 9))) && (i_46_ <= i_50_) && ((npc_48_.definition.anInt1399) <= ((npc.definition.anInt1399) + -(i_50_ + -i_46_ >> 9)))) {
                                                    ParticleShader.addNpcMenuOptions(((class318_sub4.aClass318_Sub1_6410.plane) != (Component72.localPlayer.plane)), false, npc_48_);
                                                    npc_48_.anInt10215 = (OpenGlShader.clientCycle);
                                                }
                                            }
                                        }
                                    }
                                    int i_51_ = ShaderCompilerSub1.anInt6513;
                                    int[] is = ShaderProgramSub7.anIntArray6290;
                                    for (int i_52_ = 0; (i_51_ > i_52_); i_52_++) {
                                        Player player = (InterfaceRenderer.players[is[i_52_]]);
                                        if ((player != null) && (OpenGlShader.clientCycle != (player.anInt10215)) && (player.aBoolean10309)) {
                                            int i_53_ = ((player.x) - ((-1 + (player.getSize((byte) 116))) << 8));
                                            int i_54_ = ((player.y) + -((player.getSize((byte) 121)) + -1 << 8));
                                            if ((i_53_ >= i_45_) && ((-(-i_45_ + i_53_ >> 9) + (npc.definition.anInt1399)) >= player.getSize((byte) 114)) && (i_54_ >= i_46_) && (player.getSize((byte) 58) <= ((npc.definition.anInt1399) - (i_54_ + -i_46_ >> 9)))) {
                                                PlayerState.method3298((byte) 125, ((class318_sub4.aClass318_Sub1_6410.plane) != (Component72.localPlayer.plane)), player);
                                                player.anInt10215 = OpenGlShader.clientCycle;
                                            }
                                        }
                                    }
                                }
                                if (OpenGlShader.clientCycle == npc.anInt10215) continue;
                                ParticleShader.addNpcMenuOptions((class318_sub4.aClass318_Sub1_6410.plane != (Component72.localPlayer.plane)), false, npc);
                                npc.anInt10215 = OpenGlShader.clientCycle;
                            }
                        }
                        if (class318_sub4.aClass318_Sub1_6410 instanceof Component252) {
                            int i_55_ = NodeBaseSub2.regionTileX + i_33_;
                            int i_56_ = i_32_ - -Component330.regionTileY;
                            NodeSub37 class348_sub37 = ((NodeSub37) (Component387.aClass356_1895.get((class318_sub4.aClass318_Sub1_6410.plane) << 28 | i_56_ << 14 | i_55_, -6008)));
                            if (class348_sub37 != null) {
                                int i_57_ = 0;
                                NodeSub34 class348_sub34 = ((NodeSub34) class348_sub37.aClass262_6998.last(-92));
                                while (class348_sub34 != null) {
                                    ItemDefinition class213 = (Exception_Sub1.itemDefinitions.getItemDefinition(79, (class348_sub34.anInt6973)));
                                    if (r.aBoolean9722 && ((Component72.localPlayer.plane) == class318_sub4.aClass318_Sub1_6410.plane)) {
                                        Component355 class254 = (Component163.anInt3176 != -1 ? (MatrixSub3.aClass326_5764.method2600(Component163.anInt3176, 28364)) : null);
                                        if ((PauseTimer.anInt500 & 0x1) != 0 && (class254 == null || ((class254.anInt3256) != (class213.method1567((class254.anInt3256), 29, Component163.anInt3176))))) {
                                            Component263.anInt1555++;
                                            DisplayModeManagerContainer368.addMenuEntry(false, (DisplayModeManagerContainer332.aString5000 + " -> <col=ff9040>" + (class213.itemName)), i_32_, (byte) -76, false, i_33_, -1, true, 49, i_57_, DisplayModeManagerContainer332.aString5001, class348_sub34.anInt6973, (Component182.anInt9747));
                                        }
                                    }
                                    if (class318_sub4.aClass318_Sub1_6410.plane == (Component72.localPlayer.plane)) {
                                        String[] strings = (class213.aStringArray2811);
                                        for (int i_58_ = 4; i_58_ >= 0; i_58_--) {
                                            if (strings != null && strings[i_58_] != null) {
                                                int i_59_ = 0;
                                                if (i_58_ == 0) i_59_ = 21;
                                                int i_60_ = PauseTimer.anInt506;
                                                if (i_58_ == 1) i_59_ = 10;
                                                if (i_58_ == 2) i_59_ = 47;
                                                if (i_58_ == 3) i_59_ = 22;
                                                if (i_58_ == (class213.anInt2752)) i_60_ = class213.anInt2759;
                                                if (i_58_ == 4) i_59_ = 5;
                                                if ((class213.anInt2764) == i_58_) i_60_ = class213.anInt2830;
                                                DisplayModeManagerContainer368.addMenuEntry(false, ("<col=ff9040>" + (class213.itemName)), i_32_, (byte) -119, false, i_33_, -1, true, i_59_, i_57_, strings[i_58_], class348_sub34.anInt6973, i_60_);
                                                CacheNode.anInt9548++;
                                            }
                                        }
                                    }
                                    ObjectDeserializer.anInt6956++;
                                    DisplayModeManagerContainer368.addMenuEntry(((Component72.localPlayer.plane) != class318_sub4.aClass318_Sub1_6410.plane), ("<col=ff9040>" + class213.itemName) + Loader.getDebug(class213.itemId), i_32_, (byte) -122, false, i_33_, -1, true, 1010, i_57_, (FriendsIgnoreList.aClass274_3505.getLocalized(ObjectDeserializer.languageId, 544)), class348_sub34.anInt6973, CookieManager.anInt6299);
                                    class348_sub34 = ((NodeSub34) class348_sub37.aClass262_6998.previous(-127));
                                    i_57_++;
                                }
                            }
                        }
                        if (class318_sub4.aClass318_Sub1_6410 instanceof Interface10) {
                            Interface10 interface10 = ((Interface10) (class318_sub4.aClass318_Sub1_6410));
                            ObjectDefinition class51 = (GradientPreset.aClass263_9195.getObjectDefinition(0, interface10.method42(-100)));
                            if (class51.anIntArray945 != null) class51 = (class51.getTransformedDefinition((DisplayModeManagerContainer58.aClass170_10209), (byte) 47));
                            if (class51 != null) {
                                if (r.aBoolean9722 && ((Component72.localPlayer.plane) == (class318_sub4.aClass318_Sub1_6410.plane))) {
                                    Component355 class254 = (Component163.anInt3176 != -1 ? (MatrixSub3.aClass326_5764.method2600(Component163.anInt3176, 28364)) : null);
                                    if (((0x4 & PauseTimer.anInt500) != 0) && (class254 == null || ((class254.anInt3256) != (class51.method487(Component163.anInt3176, (class254.anInt3256), 54))))) {
                                        Component7.anInt2877++;
                                        DisplayModeManagerContainer368.addMenuEntry(false, (DisplayModeManagerContainer332.aString5000 + " -> <col=00ffff>" + (class51.aString884)), i_32_, (byte) -94, false, i_33_, -1, true, 2, interface10.hashCode(), DisplayModeManagerContainer332.aString5001, (DefinitionSub21.method3107((byte) 95, interface10, i_32_, i_33_)), Component182.anInt9747);
                                    }
                                }
                                if (class318_sub4.aClass318_Sub1_6410.plane == (Component72.localPlayer.plane)) {
                                    String[] strings = class51.aStringArray913;
                                    if (strings != null) {
                                        for (int i_61_ = 4; i_61_ >= 0; i_61_--) {
                                            if (strings[i_61_] != null) {
                                                int i_62_ = 0;
                                                if (i_61_ == 0) i_62_ = 3;
                                                int i_63_ = PauseTimer.anInt506;
                                                if (i_61_ == 1) i_62_ = 4;
                                                if (i_61_ == 2) i_62_ = 9;
                                                if (i_61_ == 3) i_62_ = 59;
                                                if (i_61_ == 4) i_62_ = 1007;
                                                if ((class51.anInt950) == i_61_) i_63_ = (class51.anInt869);
                                                if (i_61_ == (class51.anInt951)) i_63_ = (class51.anInt877);
                                                DisplayModeManagerContainer368.addMenuEntry(false, ("<col=00ffff>" + (class51.aString884)), i_32_, (byte) -100, false, i_33_, -1, true, i_62_, interface10.hashCode(), strings[i_61_], (DefinitionSub21.method3107((byte) -116, interface10, i_32_, i_33_)), i_63_);
                                                Component178.anInt1445++;
                                            }
                                        }
                                    }
                                    int x = i_33_ + NodeBaseSub2.regionTileX;
                                    int y = i_32_ + Component330.regionTileY;
                                    DisplayModeManagerContainer368.addMenuEntry(((Component72.localPlayer.plane) != class318_sub4.aClass318_Sub1_6410.plane), ("<col=00ffff>" + class51.aString884 + Loader.getDebug(class51.anInt941, x, y, class318_sub4.aClass318_Sub1_6410.plane)), i_32_, (byte) -120, false, i_33_, -1, true, 1001, interface10.hashCode(), (FriendsIgnoreList.aClass274_3505.getLocalized(ObjectDeserializer.languageId, 544)), class51.anInt941, CookieManager.anInt6299);
                                    anInt6094++;
                                    DefaultClickSwapper.injectObjectMenu(class51);
                                    // Scene editor: Move / Remove / Rotate on ground scenery.
                                    SceneEditorMenu.inject(class51, i_33_, i_32_,
                                            class318_sub4.aClass318_Sub1_6410.plane,
                                            DefinitionSub21.method3107((byte) -116, interface10, i_32_, i_33_));
                                }
                            }
                        }
                    }
                }
                if (Component210.gameCanvasAttached) DebugPanicSub1.method2129((byte) 86);
            }
            Component127.method1626(1, false);
        }
    }

    final void method1716(boolean bool) {
        if (this.preferences.method3422(674) != RunescapeInfo.RUNESCAPE) this.preferenceValue = 1;
        else if (this.preferences.method3425(-95)) this.preferenceValue = 0;
        anInt6090++;
        if (this.preferenceValue != 0 && this.preferenceValue != 1) this.preferenceValue = method1710(20014);
        if (bool != false) aClass60_6096 = null;
    }

    final boolean method1824(int i) {
        anInt6087++;
        if (i < 85) method1823(null, 104, -95, (byte) 26);
        if (this.preferences.method3422(674) == RunescapeInfo.RUNESCAPE) {
            return !this.preferences.method3425(-96);
        }
        return false;
    }

    ColoredText(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }
}
