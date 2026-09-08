/* DisplayModeManagerContainer89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer89
/**
 * RENAMED from `Class5_Sub3` (JODE-obfuscated).
 * Evidence: subclass of Component298 (hierarchy)
 */ extends Component298 {
    private Component24 aClass105_8366;
    static int anInt8367;
    static int anInt8368;
    static int anInt8369;
    static int anInt8370;
    static int anInt8371;
    static int anInt8372;
    static int anInt8373;
    static int anInt8374;
    static int anInt8375;
    static int anInt8376;
    static int anInt8377;

    final void method178(int i, boolean bool, byte i_0_, int i_1_) {
        if (i_0_ >= -6) method202(-4, null);
        anInt8376++;
        NodeSub8.toolkit.fillRect3D(-2 + i, i_1_, 4 + this.aClass369_4635.anInt4971, this.aClass369_4635.anInt4963 + 2, (((Component381) this.aClass369_4635).anInt8580), 0);
        NodeSub8.toolkit.fillRect3D(i + -1, i_1_ + 1, this.aClass369_4635.anInt4971 + 2, this.aClass369_4635.anInt4963, 0, 0);
    }

    static final NodeSub21 method199(int i) {
        anInt8369++;
        if (DisplayModeManagerContainer229.aClass262_1254 == null || r.aClass312_9716 == null) return null;
        r.aClass312_9716.method2328(DisplayModeManagerContainer229.aClass262_1254, 75);
        NodeSub21 class348_sub21 = (NodeSub21) r.aClass312_9716.method2327((byte) -53);
        if (class348_sub21 == null) return null;
        Component274 class42 = DisplayModeManagerContainer229.aClass153_1238.method1225(class348_sub21.anInt6847, (byte) 50);
        if (i != 1) anInt8370 = -75;
        if (class42 != null && class42.aBoolean609 && class42.method373(DisplayModeManagerContainer229.anInterface17_1244, 98)) return class348_sub21;
        return LruCache.method3479(-1);
    }

    public final boolean method8(byte i) {
        int i_2_ = 2 % ((25 - i) / 52);
        anInt8373++;
        if (!super.method8((byte) 82)) return false;
        return this.aClass45_4632.isSingletonFileReady(false, (((Component381) this.aClass369_4635).anInt8582));
    }

    static final int method200(int i, int i_3_) {
        if (i >= -75) return -109;
        anInt8377++;
        return i_3_ >>> 8;
    }

    DisplayModeManagerContainer89(CacheStore class45, CacheStore class45_4_, Component381 class369_sub1) {
        super(class45, class45_4_, class369_sub1);
    }

    static final void method201(int i, int i_5_, String string) {
        do {
            try {
                anInt8372++;
                int i_6_ = ShaderCompilerSub1.anInt6513;
                int[] is = ShaderProgramSub7.anIntArray6290;
                if (i_5_ == -7257) {
                    boolean bool = false;
                    for (int i_7_ = 0; i_6_ > i_7_; i_7_++) {
                        Player player = (InterfaceRenderer.players[is[i_7_]]);
                        if (player != null && (Component72.localPlayer != player) && (player.username != null) && player.username.equalsIgnoreCase(string)) {
                            bool = true;
                            if (i == 1) {
                                Component296.anInt4657++;
                                ParticleSystem class348_sub47 = (ParticleShader.createOutboundPacket(Component379.aClass351_5929, DisplayModeManagerContainer64.aClass77_9029, i_5_ + 7158));
                                class348_sub47.particleBuffer.writeShortAddLittle(4325, is[i_7_]);
                                class348_sub47.particleBuffer.writeByteInverse((byte) -75, 0);
                                HashNodeSub14.enqueueOutboundPacket(i_5_ ^ 0x1c2a, class348_sub47);
                            } else if (i == 4) {
                                Component197.anInt10073++;
                                ParticleSystem class348_sub47 = (ParticleShader.createOutboundPacket(RSACipher.aClass351_4905, DisplayModeManagerContainer64.aClass77_9029, -88));
                                class348_sub47.particleBuffer.writeShort((byte) 107, is[i_7_]);
                                class348_sub47.particleBuffer.writeByteAdd((byte) -128, 0);
                                HashNodeSub14.enqueueOutboundPacket(126, class348_sub47);
                            } else if (i == 5) {
                                Component43.anInt4979++;
                                ParticleSystem class348_sub47 = (ParticleShader.createOutboundPacket(HashNodeSub18.aClass351_9684, DisplayModeManagerContainer64.aClass77_9029, -83));
                                class348_sub47.particleBuffer.writeShortAdd(81, is[i_7_]);
                                class348_sub47.particleBuffer.writeByte(false, 0);
                                HashNodeSub14.enqueueOutboundPacket(-112, class348_sub47);
                            } else if (i == 6) {
                                HuffmanDecoder.anInt3768++;
                                ParticleSystem class348_sub47 = (ParticleShader.createOutboundPacket(Component111.aClass351_3232, DisplayModeManagerContainer64.aClass77_9029, -83));
                                class348_sub47.particleBuffer.writeByte(false, 0);
                                class348_sub47.particleBuffer.writeShortAdd(-119, is[i_7_]);
                                HashNodeSub14.enqueueOutboundPacket(i_5_ + 7281, class348_sub47);
                            } else if (i == 7) {
                                Component14.anInt8588++;
                                ParticleSystem class348_sub47 = (ParticleShader.createOutboundPacket(DefinitionGroup.aClass351_9533, DisplayModeManagerContainer64.aClass77_9029, -116));
                                class348_sub47.particleBuffer.writeShortAdd(i_5_ ^ 0x1c2c, is[i_7_]);
                                class348_sub47.particleBuffer.writeByteAdd((byte) 92, 0);
                                HashNodeSub14.enqueueOutboundPacket(127, class348_sub47);
                            }
                            break;
                        }
                    }
                    if (bool) break;
                    DisplayModeManagerContainer213.method544(((FriendsIgnoreList.aClass274_3504.getLocalized(ObjectDeserializer.languageId, 544)) + string), false, 4);
                }
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("tq.A(" + i + ',' + i_5_ + ',' + (string != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    public final void method7(int i) {
        anInt8371++;
        if (i == 10286) {
            super.method7(i);
            aClass105_8366 = DummyClass.method3577(((Component381) this.aClass369_4635).anInt8582, (byte) -96, this.aClass45_4632);
        }
    }

    final void method182(int i, int i_8_, int i_9_, boolean bool) {
        anInt8367++;
        int i_10_ = (this.method183(48) * this.aClass369_4635.anInt4971 / 10000);
        int[] is = new int[4];
        int i_11_ = -50 % ((-20 - i) / 57);
        NodeSub8.toolkit.K(is);
        NodeSub8.toolkit.KA(i_9_, 2 + i_8_, i_9_ - -i_10_, i_8_ - -(this.aClass369_4635.anInt4963));
        aClass105_8366.method972(i_9_, 2 + i_8_, (this.aClass369_4635.anInt4971), (this.aClass369_4635.anInt4963));
        NodeSub8.toolkit.KA(is[0], is[1], is[2], is[3]);
    }

    static final void method202(int i, MenuEntry class348_sub42_sub12) {
        do {
            try {
                anInt8375++;
                if (i == 6 && !Component364.aBoolean8335) {
                    class348_sub42_sub12.unlink((byte) 111);
                    DisplayModeManagerContainer306.menuEntryCount--;
                    if (class348_sub42_sub12.aBoolean9611) {
                        for (HashNodeSub13 class348_sub42_sub13 = ((HashNodeSub13) Component237.aClass107_3022.first(-99)); class348_sub42_sub13 != null; class348_sub42_sub13 = ((HashNodeSub13) Component237.aClass107_3022.next((byte) 110))) {
                            if (class348_sub42_sub13.aString9617.equals(class348_sub42_sub12.target)) {
                                boolean bool = false;
                                for (MenuEntry class348_sub42_sub12_12_ = ((MenuEntry) class348_sub42_sub13.aClass107_9621.first(-58)); class348_sub42_sub12_12_ != null; class348_sub42_sub12_12_ = ((MenuEntry) class348_sub42_sub13.aClass107_9621.next((byte) 112))) {
                                    if (class348_sub42_sub12 == class348_sub42_sub12_12_) {
                                        if (class348_sub42_sub13.method3234((byte) -123, class348_sub42_sub12)) Component359.method1868((byte) -98, class348_sub42_sub13);
                                        bool = true;
                                        break;
                                    }
                                }
                                if (bool) break;
                            }
                        }
                    } else {
                        long l = (class348_sub42_sub12.groupKey);
                        HashNodeSub13 class348_sub42_sub13;
                        for (class348_sub42_sub13 = ((HashNodeSub13) MenuEntry.aClass356_9603.get(l, -6008)); class348_sub42_sub13 != null; class348_sub42_sub13 = ((HashNodeSub13) MenuEntry.aClass356_9603.continueGet(true))) {
                            if (class348_sub42_sub13.aString9617.equals(class348_sub42_sub12.target)) break;
                        }
                        if (class348_sub42_sub13 == null || !(class348_sub42_sub13.method3234((byte) 15, class348_sub42_sub12))) break;
                        Component359.method1868((byte) 120, class348_sub42_sub13);
                    }
                }
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("tq.I(" + i + ',' + ((class348_sub42_sub12 != null) ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }
}
