/* HashTable - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class107` (JODE-obfuscated).
 * Chaining hashtable of Node entries (node type HashNode). Provides get/put/remove via size/next/add/removeHead/clear. Used by NodeCache and many systems.
 */

final class HashTable {
    static int anInt1642;
    static int anInt1643;
    static int anInt1644;
    static int anInt1645 = -2;
    static int anInt1646;
    HashNode sentinel = new HashNode();
    static int anInt1648;
    static int anInt1649;
    static int[] anIntArray1650 = new int[1000];
    static int anInt1651;
    private HashNode cursor;
    static int anInt1653;
    static int anInt1654;
    static int anInt1655;

    final int size(int i) {
        anInt1643++;
        int i_0_ = i;
        for (HashNode class348_sub42 = (this.sentinel.next); this.sentinel != class348_sub42; class348_sub42 = class348_sub42.next)
            i_0_++;
        return i_0_;
    }

    final HashNode next(byte i) {
        anInt1644++;
        if (i <= 41) return null;
        HashNode class348_sub42 = cursor;
        if (class348_sub42 == this.sentinel) {
            cursor = null;
            return null;
        }
        cursor = class348_sub42.next;
        return class348_sub42;
    }

    public static void method1004(byte i) {
        anIntArray1650 = null;
        if (i != 16) method1006(false, (byte) -62);
    }

    final void add(boolean bool, HashNode class348_sub42) {
        if (class348_sub42.previous != null) class348_sub42.unlink(bool);
        anInt1654++;
        class348_sub42.next = this.sentinel;
        class348_sub42.previous = (this.sentinel.previous);
        if (bool == true) {
            class348_sub42.previous.next = class348_sub42;
            class348_sub42.next.previous = class348_sub42;
        }
    }

    static final void method1006(boolean bool, byte i) {
        anInt1655++;
        if (bool) {
            if (r.anInt9721 != -1) DisplayModeManagerContainer194.method235(r.anInt9721, (byte) -108);
            for (NodeSub41 class348_sub41 = (NodeSub41) Component15.aClass356_4915.first(0); class348_sub41 != null; class348_sub41 = ((NodeSub41) Component15.aClass356_4915.next(0))) {
                if (!class348_sub41.isLinked((byte) 4)) {
                    class348_sub41 = ((NodeSub41) Component15.aClass356_4915.first(0));
                    if (class348_sub41 == null) break;
                }
                Component162.method1118(true, false, class348_sub41, 2533);
            }
            r.anInt9721 = -1;
            Component15.aClass356_4915 = new LruCache(8);
            DisplayModeManagerContainer153.method882((byte) 11);
            r.anInt9721 = Component285.anInt970;
            Component339.method1713(false, 520);
            Component160.method3466(-119);
            ClientScriptExecutor.runInterfaceScripts(r.anInt9721);
        }
        DisplayModeManagerContainer369.aBoolean2895 = true;
        if (i < 49) anInt1651 = 10;
    }

    static final void method1007(DisplayModeManagerContainer57 class46, GraphicsToolkit var_ha, int i, int i_1_, int i_2_) {
        try {
            anInt1648++;
            Shader var_aa = class46.method425(var_ha, (byte) 40);
            if (var_aa != null) {
                if (i_2_ != 22960) anIntArray1650 = null;
                var_ha.KA(i, i_1_, i + class46.width, class46.height + i_1_);
                if (Component293.anInt3306 != 2 && Component293.anInt3306 != 5 && Component83.aClass105_1664 != null) {
                    int i_3_;
                    int i_4_;
                    int i_5_;
                    int i_6_;
                    if (DefinitionSub21.cameraMode == 4) {
                        i_3_ = NodeSub7.anInt6652;
                        i_4_ = NodederUtil.anInt6633;
                        i_5_ = 4096;
                        i_6_ = 0x3fff & (int) -Component112.cameraYaw;
                    } else {
                        i_5_ = 4096 - 16 * Component182.anInt9750;
                        i_3_ = (Component72.localPlayer.y);
                        i_6_ = ((int) -Component112.cameraYaw - -CacheNodeSub2.anInt10483 & 0x3fff);
                        i_4_ = (Component72.localPlayer.x);
                    }
                    int i_7_ = 48 - (-(i_4_ / 128) - -(AbstractShaderSub4.anInt7319 * 2)) - -208;
                    int i_8_ = (208 - (ParametricDefinition.anInt9109 * 2 - 48) + 4 * ParametricDefinition.anInt9109 - i_3_ / 128);
                    Component83.aClass105_1664.method967(((float) class46.width / 2.0F + (float) i), ((float) class46.height / 2.0F + (float) i_1_), (float) i_7_, (float) i_8_, i_5_, i_6_ << 2, var_aa, i, i_1_);
                    for (NodeSub35 class348_sub35 = (NodeSub35) Component289.aClass262_10125.first(i_2_ ^ 0x59b4); class348_sub35 != null; class348_sub35 = (NodeSub35) Component289.aClass262_10125.next((byte) 92)) {
                        int i_9_ = class348_sub35.intValue;
                        int i_10_ = (-NodeBaseSub2.regionTileX + ((0xfffe5b0 & (CacheNodeSub2.aClass252_10488.anIntArray3238[i_9_])) >> 14));
                        int i_11_ = (-Component330.regionTileY + (0x3fff & (CacheNodeSub2.aClass252_10488.anIntArray3238[i_9_])));
                        int i_12_ = -(i_4_ / 128) + 2 + 4 * i_10_;
                        int i_13_ = 2 + (4 * i_11_ - i_3_ / 128);
                        RenderableObject.method2385(class46, i_1_, var_aa, (CacheNodeSub2.aClass252_10488.anIntArray3239[i_9_]), i_12_, i, (byte) -94, i_13_, var_ha);
                    }
                    for (int i_14_ = 0; (DefinitionSub38.anInt9479 > i_14_); i_14_++) {
                        int i_15_ = (ColorTagNode.anIntArray6770[i_14_] * 4 - -2 - i_4_ / 128);
                        int i_16_ = (-(i_3_ / 128) + DefinitionSub37.anIntArray9458[i_14_] * 4 - -2);
                        ObjectDefinition class51 = (GradientPreset.aClass263_9195.getObjectDefinition(0, ObjectDefinitionProvider.anIntArray3347[i_14_]));
                        if (class51.anIntArray945 != null) {
                            class51 = class51.getTransformedDefinition((DisplayModeManagerContainer58.aClass170_10209), (byte) 47);
                            if (class51 == null || (class51.anInt921 == -1)) continue;
                        }
                        RenderableObject.method2385(class46, i_1_, var_aa, class51.anInt921, i_15_, i, (byte) -113, i_16_, var_ha);
                    }
                    for (NodeSub37 class348_sub37 = (NodeSub37) Component387.aClass356_1895.first(i_2_ ^ 0x59b0); class348_sub37 != null; class348_sub37 = ((NodeSub37) Component387.aClass356_1895.next(0))) {
                        int i_17_ = (int) (0x3L & (class348_sub37.key) >> 28);
                        if (NativeLibLoader.anInt4155 == i_17_) {
                            int i_18_ = (-NodeBaseSub2.regionTileX + (int) ((class348_sub37.key) & 0x3fffL));
                            int i_19_ = (-Component330.regionTileY + (int) ((class348_sub37.key) >> 14 & 0x3fffL));
                            int i_20_ = -(i_4_ / 128) + (2 + i_18_ * 4);
                            int i_21_ = -(i_3_ / 128) + (2 + i_19_ * 4);
                            DisplayModeManagerContainer346.method1211(i_1_, (NodeSub12.aClass105Array6742[0]), i, class46, var_aa, i_21_, i_2_ ^ 0x59b2, i_20_);
                        }
                    }
                    for (int i_22_ = 0; (i_22_ < Component324.anInt2057); i_22_++) {
                        NpcNode class348_sub22 = ((NpcNode) (Component21.aClass356_3654.get(DisplayModeManagerContainer238.anIntArray1233[i_22_], -6008)));
                        if (class348_sub22 != null) {
                            Npc npc = (class348_sub22.npc);
                            if (npc.method2445((byte) -126) && ((npc.plane) == (Component72.localPlayer.plane))) {
                                NpcComposition class79 = (npc.definition);
                                if (class79 != null && (class79.anIntArray1377 != null)) class79 = (class79.method794((DisplayModeManagerContainer58.aClass170_10209), -1));
                                if (class79 != null && class79.aBoolean1397 && class79.interactive) {
                                    int i_23_ = (-(i_4_ / 128) + (npc.x) / 128);
                                    int i_24_ = ((npc.y) / 128 + -(i_3_ / 128));
                                    if (class79.anInt1383 != -1) RenderableObject.method2385(class46, i_1_, var_aa, class79.anInt1383, i_23_, i, (byte) -73, i_24_, var_ha);
                                    else DisplayModeManagerContainer346.method1211(i_1_, (NodeSub12.aClass105Array6742[1]), i, class46, var_aa, i_24_, 2, i_23_);
                                }
                            }
                        }
                    }
                    int i_25_ = ShaderCompilerSub1.anInt6513;
                    int[] is = ShaderProgramSub7.anIntArray6290;
                    for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
                        Player player = (InterfaceRenderer.players[is[i_26_]]);
                        if (player != null && player.method2457((byte) 37) && !player.aBoolean10551 && (Component72.localPlayer != player) && (player.plane == (Component72.localPlayer.plane))) {
                            int i_27_ = (-(i_4_ / 128) + (player.x) / 128);
                            int i_28_ = (-(i_3_ / 128) + (player.y) / 128);
                            boolean bool = false;
                            for (int i_29_ = 0; (DefinitionSub30.friendCount > i_29_); i_29_++) {
                                if ((player.username.equals(Component178.friendNames[i_29_])) && (GraphicsToolkit.friendWorldIds[i_29_] != 0)) {
                                    bool = true;
                                    break;
                                }
                            }
                            boolean bool_30_ = false;
                            for (int i_31_ = 0; NameFormatter.anInt496 > i_31_; i_31_++) {
                                if (player.username.equals(RequestProcessor.aClass19Array2261[i_31_].aString306)) {
                                    bool_30_ = true;
                                    break;
                                }
                            }
                            boolean bool_32_ = false;
                            if ((Component72.localPlayer.anInt10542) != 0 && (player.anInt10542 != 0) && (player.anInt10542 == (Component72.localPlayer.anInt10542))) bool_32_ = true;
                            if (!player.aBoolean10554) {
                                if (!bool) {
                                    if (bool_30_) DisplayModeManagerContainer346.method1211(i_1_, (NodeSub12.aClass105Array6742[5]), i, class46, var_aa, i_28_, i_2_ + -22958, i_27_);
                                    else if (!bool_32_) DisplayModeManagerContainer346.method1211(i_1_, (NodeSub12.aClass105Array6742[2]), i, class46, var_aa, i_28_, 2, i_27_);
                                    else DisplayModeManagerContainer346.method1211(i_1_, (NodeSub12.aClass105Array6742[4]), i, class46, var_aa, i_28_, 2, i_27_);
                                } else DisplayModeManagerContainer346.method1211(i_1_, (NodeSub12.aClass105Array6742[3]), i, class46, var_aa, i_28_, 2, i_27_);
                            } else DisplayModeManagerContainer346.method1211(i_1_, (NodeSub12.aClass105Array6742[6]), i, class46, var_aa, i_28_, i_2_ + -22958, i_27_);
                        }
                    }
                    Component114[] class302s = NodeSub27.aClass302Array6897;
                    for (int i_33_ = 0; (i_33_ < class302s.length); i_33_++) {
                        Component114 class302 = class302s[i_33_];
                        if (class302 != null && (class302.anInt3840 != 0) && OpenGlShader.clientCycle % 20 < 10) {
                            if (class302.anInt3840 == 1) {
                                NpcNode class348_sub22 = ((NpcNode) (Component21.aClass356_3654.get(class302.anInt3833, -6008)));
                                if (class348_sub22 != null) {
                                    Npc npc = (class348_sub22.npc);
                                    int i_34_ = (-(i_4_ / 128) + (npc.x) / 128);
                                    int i_35_ = (-(i_3_ / 128) + (npc.y) / 128);
                                    DisplayModeManagerContainer260.method2181(360000L, i_1_, -125, i_35_, i, class46, i_34_, (class302.anInt3831), var_aa);
                                }
                            }
                            if (class302.anInt3840 == 2) {
                                int i_36_ = (-(i_4_ / 128) + (class302.anInt3835 / 128));
                                int i_37_ = (-(i_3_ / 128) + (class302.anInt3832 / 128));
                                long l = class302.anInt3837 << 7;
                                l *= l;
                                DisplayModeManagerContainer260.method2181(l, i_1_, -112, i_37_, i, class46, i_36_, (class302.anInt3831), var_aa);
                            }
                            if ((class302.anInt3840 == 10) && class302.anInt3833 >= 0 && (class302.anInt3833 < (InterfaceRenderer.players).length)) {
                                Player player = (InterfaceRenderer.players[class302.anInt3833]);
                                if (player != null) {
                                    int i_38_ = (-(i_4_ / 128) + (player.x) / 128);
                                    int i_39_ = (-(i_3_ / 128) + (player.y) / 128);
                                    DisplayModeManagerContainer260.method2181(360000L, i_1_, -121, i_39_, i, class46, i_38_, (class302.anInt3831), var_aa);
                                }
                            }
                        }
                    }
                    if (DefinitionSub21.cameraMode != 4) {
                        if (Component253.anInt3203 != 0) {
                            int i_40_ = (-(i_4_ / 128) + (Component253.anInt3203 * 4 + 2) - (-(2 * Component72.localPlayer.getSize((byte) 77)) - -2));
                            int i_41_ = (4 * Component263.anInt1548 - (-2 + i_3_ / 128) + (2 * (Component72.localPlayer.getSize((byte) 59) - 1)));
                            DisplayModeManagerContainer346.method1211(i_1_, (Component361.aClass105Array367[(!NodeSub13.aBoolean6759 ? 0 : 1)]), i, class46, var_aa, i_41_, 2, i_40_);
                        }
                        if (!Component72.localPlayer.aBoolean10551) var_ha.method3675(3, (byte) -125, -1 + (i - -((class46.width) / 2)), -1 + ((class46.height) / 2 + i_1_), 3, -1);
                    }
                } else var_ha.A(-16777216, var_aa, i, i_1_);
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("mn.F(" + (class46 != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + i_1_ + ',' + i_2_ + ')'));
        }
    }

    final HashNode removeHead(int i) {
        if (i != 20) cursor = null;
        anInt1653++;
        HashNode class348_sub42 = (this.sentinel.next);
        if (class348_sub42 == this.sentinel) return null;
        class348_sub42.unlink(true);
        return class348_sub42;
    }

    final void clear(int i) {
        anInt1646++;
        if (i == 2110355138) {
            for (; ; ) {
                HashNode class348_sub42 = (this.sentinel.next);
                if (this.sentinel == class348_sub42) break;
                class348_sub42.unlink(true);
            }
            cursor = null;
        }
    }

    static final void method1010(boolean bool, boolean bool_42_) {
        r.aClass101_9720.method898(Component158.aHa326.method3640());
        anInt1642++;
        int[] is = Component158.aHa326.Y();
        DisplayModeManagerContainer288.anInt8630 = is[2];
        Component253.anInt3202 = is[0];
        DisplayModeManagerContainer91.anInt394 = is[3];
        DisplayModeManagerContainer348.anInt5886 = is[1];
        if (bool_42_) {
            Component158.aHa326.DA(Component97.anInt1537, RenderableSub5.anInt6417, Component321.anInt2590, Component30.anInt1879);
            r.method3284(true, Component289.aDouble10120);
        } else {
            Component158.aHa326.DA(Component247.anInt4910, ShaderCompilerSub1Sub1.anInt8799, SpriteAtlasShader.anInt6255, OutputStream_Sub1.anInt95);
            r.method3284(true, DisplayModeManagerContainer389.aDouble8621);
        }
        if (bool != false) method1010(true, true);
    }

    final HashNode first(int i) {
        if (i > -23) method1006(false, (byte) -34);
        anInt1649++;
        HashNode class348_sub42 = (this.sentinel.next);
        if (class348_sub42 == this.sentinel) {
            cursor = null;
            return null;
        }
        cursor = class348_sub42.next;
        return class348_sub42;
    }

    public HashTable() {
        this.sentinel.previous = this.sentinel;
        this.sentinel.next = this.sentinel;
    }
}
