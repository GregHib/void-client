/* DisplayModeManagerContainer1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer1
/**
 * RENAMED from `Class261` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt3313;
    static Component22 aClass113_3314 = new Component22();
    static int anInt3315;
    static int anInt3316;
    static int anInt3317;
    static int anInt3318;
    private final CacheStore cacheStore;
    static int anInt3320;
    private final NodeCache cache = new NodeCache(64);
    static int anInt3322;

    public static void clearStatics(int i) {
        if (i > 92) aClass113_3314 = null;
    }

    /**
     * Replace every occurrence of {@code c} in {@code string} with {@code string_0_}.
     */
    static final String replaceChar(String string, byte i, char c, String string_0_) {
        try {
            anInt3322++;
            int i_1_ = string.length();
            int i_2_ = string_0_.length();
            int i_3_ = i_1_;
            int i_4_ = -1 + i_2_;
            if (i_4_ != 0) {
                int i_5_ = 0;
                for (; ; ) {
                    i_5_ = string.indexOf(c, i_5_);
                    if (i_5_ < 0) break;
                    i_5_++;
                    i_3_ += i_4_;
                }
            }
            StringBuffer stringbuffer = new StringBuffer(i_3_);
            int i_6_ = 0;
            if (i > -77) return null;
            for (; ; ) {
                int i_7_ = string.indexOf(c, i_6_);
                if (i_7_ < 0) break;
                stringbuffer.append(string, i_6_, i_7_);
                stringbuffer.append(string_0_);
                i_6_ = i_7_ + 1;
            }
            stringbuffer.append(string.substring(i_6_));
            return stringbuffer.toString();
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("uga.H(" + (string != null ? "{...}" : "null") + ',' + i + ',' + c + ',' + (string_0_ != null ? "{...}" : "null") + ')'));
        }
    }

    /** Send a length-prefixed string packet (script/chat helper). */
    static final void sendStringPacket(int i, int i_8_, String string) {
        MenuEntry.anInt9594++;
        anInt3318++;
        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(Component208.aClass351_1766, DisplayModeManagerContainer64.aClass77_9029, i + -107);
        class348_sub47.particleBuffer.writeByte(false, 1 - -Component31.method1745(string, -65));
        if (i == 16) {
            class348_sub47.particleBuffer.writeByteSubtract((byte) -70, i_8_);
            class348_sub47.particleBuffer.writeString((byte) -5, string);
            HashNodeSub14.enqueueOutboundPacket(117, class348_sub47);
        }
    }

    /** Load {@link Component241} id {@code i} from the cache (cached in {@link #cache}). */
    final Component241 get(int i, int i_9_) {
        anInt3320++;
        Component241 class225;
        synchronized (cache) {
            class225 = (Component241) cache.get(i, 69);
        }
        if (class225 != null) return class225;
        byte[] is;
        synchronized (cacheStore) {
            is = cacheStore.getFile(-1860, i_9_, i);
        }
        class225 = new Component241();
        if (is != null) class225.method1620(new Buffer(is), -108);
        synchronized (cache) {
            cache.putOne(class225, i, (byte) -109);
        }
        return class225;
    }

    final void processSoftEntries(byte i, int i_10_) {
        synchronized (cache) {
            cache.processSoftEntries(2, i_10_);
        }
        anInt3315++;
        if (i < 36) clearStatics(-32);
    }

    final void clearCache(int i) {
        anInt3317++;
        synchronized (cache) {
            cache.clear(i);
        }
    }

    final void removeSoft(byte i) {
        synchronized (cache) {
            cache.purgeSoftReferences(-112);
        }
        int i_11_ = 119 / ((i - 47) / 55);
        anInt3316++;
    }

    /** Rebuild {@link Component192#menuTip} / secondary tip from the current menu list. */
    static final void updateMenuTip(int i) {
        int i_12_ = 81 % ((i - -70) / 35);
        anInt3313++;
        if (!Component364.aBoolean8335) PauseHandler.aBoolean9535 = ((Component9.anInt4143 != -1 && DisplayModeManagerContainer306.menuEntryCount >= Component9.anInt4143) || (PacketReader.canvasHeight < 16 * DisplayModeManagerContainer306.menuEntryCount - -(!DisplayModeManagerContainer5.aBoolean1211 ? 22 : 26)));
        CursorDefinitionCache.aClass262_2187.clear(103);
        DefinitionSub38.aClass262_9478.clear(104);
        for (MenuEntry class348_sub42_sub12 = ((MenuEntry) DefinitionSub4.menuEntries.first(4)); class348_sub42_sub12 != null; class348_sub42_sub12 = (MenuEntry) DefinitionSub4.menuEntries.next((byte) 83)) {
            int i_13_ = class348_sub42_sub12.opcode;
            if (i_13_ < 1000) {
                class348_sub42_sub12.unlink((byte) 97);
                if (i_13_ == 15 || i_13_ == 2 || i_13_ == 30 || i_13_ == 49 || i_13_ == 51 || i_13_ == 50 || i_13_ == 6) DefinitionSub38.aClass262_9478.addTail(class348_sub42_sub12, -20180);
                else CursorDefinitionCache.aClass262_2187.addTail(class348_sub42_sub12, -20180);
            }
        }
        CursorDefinitionCache.aClass262_2187.transferFrom(DefinitionSub4.menuEntries, (byte) -115);
        DefinitionSub38.aClass262_9478.transferFrom(DefinitionSub4.menuEntries, (byte) -115);
        MenuEntry swapped = DefaultClickSwapper.applySwaps();
        // Microbot menu-inject: force tip to targetMenu when a script is clicking.
        MenuEntry microTip = MicrobotMenu.applyTargetMenu();
        if (microTip != null) {
            swapped = microTip;
        }
        if (microTip != null) {
            Component192.menuTip = microTip;
            MenuOpener.menuTipSecondary = microTip;
        } else if (DisplayModeManagerContainer306.menuEntryCount > 1) {
            if (swapped != null) {
                // Force tip — list front alone loses to Attack priority on some NPCs.
                Component192.menuTip = swapped;
                MenuOpener.menuTipSecondary = swapped;
            } else if (!Component262.shiftClick || !Component280.aClass346_2449.isKeyDown(81, -122) || DisplayModeManagerContainer306.menuEntryCount <= 2) {
                Component192.menuTip = ((MenuEntry) DefinitionSub4.menuEntries.sentinel.previous);
                MenuOpener.menuTipSecondary = Component192.menuTip;
            } else {
                Component192.menuTip = ((MenuEntry) DefinitionSub4.menuEntries.sentinel.previous.previous);
                MenuOpener.menuTipSecondary = ((MenuEntry) DefinitionSub4.menuEntries.sentinel.previous);
            }
        } else {
            Component192.menuTip = null;
            MenuOpener.menuTipSecondary = null;
        }
        // Don't open menus / walk through overlays drawn on top of the game.
        // Dev console (purple band) and Microbot HUD — script tip inject still allowed above.
        if (BuildInfo.isMouseOverConsole()
                || (Loader.microbotEnabled && Microbot.targetMenu == null && MicrobotPanel.isMouseOver())
                || SceneEditorUi.isMouseOver()) {
            Component192.menuTip = null;
            MenuOpener.menuTipSecondary = null;
            return;
        }
        int i_14_ = -1;
        NodeSub45 class348_sub45 = (NodeSub45) Component327.aClass262_8744.first(4);
        if (class348_sub45 != null) i_14_ = class348_sub45.getEventType(58);
        if (Component364.aBoolean8335) {
            if (i_14_ == -1) {
                int i_15_ = AbstractGlTextureSub4.mouseHandler.getCursorX(true);
                int i_16_ = AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 116);
                boolean bool = false;
                if (Component359.aClass348_Sub42_Sub13_3152 != null) {
                    if (DisplayModeManagerContainer368.anInt5252 + -10 > i_15_ || ((DisplayModeManagerContainer368.anInt5252 - -NodeSub1Sub1.anInt8806 + 10) < i_15_) || -10 + MouseHandler.menuOriginY > i_16_ || (DisplayModeManagerContainer249.anInt4669 + MouseHandler.menuOriginY + 10 < i_16_)) HashNodeSub19.method3277((byte) -48);
                    else bool = true;
                }
                if (!bool) {
                    if (DisplayModeManagerContainer136.anInt4717 - 10 <= i_15_ && i_15_ <= (10 + DisplayModeManagerContainer136.anInt4717 - -Component227.anInt1117) && i_16_ >= -10 + DefinitionGroup.anInt9532 && i_16_ <= (10 + DefinitionGroup.anInt9532 - -Component251.anInt5819)) {
                        if (PauseHandler.aBoolean9535) {
                            int i_17_ = -1;
                            int i_18_ = -1;
                            for (int i_19_ = 0; i_19_ < DisplayModeManagerContainer345.anInt166; i_19_++) {
                                if (DisplayModeManagerContainer5.aBoolean1211) {
                                    int i_21_ = (16 * i_19_ + 33 + DefinitionGroup.anInt9532);
                                    if ((i_16_ > -13 + i_21_) && i_21_ + 4 > i_16_) {
                                        i_18_ = -13 + i_21_;
                                        i_17_ = i_19_;
                                        break;
                                    }
                                } else {
                                    int i_20_ = (16 * i_19_ + DefinitionGroup.anInt9532 - -31);
                                    if (i_20_ + -13 < i_16_ && (i_20_ + 3 > i_16_)) {
                                        i_18_ = i_20_ + -13;
                                        i_17_ = i_19_;
                                        break;
                                    }
                                }
                            }
                            if (i_17_ != -1) {
                                int i_22_ = 0;
                                ClientErrorReporter class156 = new ClientErrorReporter(Component237.aClass107_3022);
                                for (HashNodeSub13 class348_sub42_sub13 = ((HashNodeSub13) class156.firstHashNode(75)); class348_sub42_sub13 != null; class348_sub42_sub13 = ((HashNodeSub13) class156.nextHashNode((byte) 74))) {
                                    if (i_17_ == i_22_) {
                                        if (class348_sub42_sub13.anInt9615 > 1) DisplayModeManagerContainer153.method881(class348_sub42_sub13, i_16_, true, i_18_);
                                        break;
                                    }
                                    i_22_++;
                                }
                            }
                        }
                    } else ShaderProgramSub2.method2146((byte) 70);
                }
            }
            if (i_14_ == 0) {
                int i_23_ = class348_sub45.getX((byte) -128);
                int i_24_ = class348_sub45.getY(33);
                if (Component359.aClass348_Sub42_Sub13_3152 != null && DisplayModeManagerContainer368.anInt5252 <= i_23_ && (NodeSub1Sub1.anInt8806 + DisplayModeManagerContainer368.anInt5252 >= i_23_) && i_24_ >= MouseHandler.menuOriginY && MouseHandler.menuOriginY + DisplayModeManagerContainer249.anInt4669 >= i_24_) {
                    int i_25_ = -1;
                    for (int i_26_ = 0; (Component359.aClass348_Sub42_Sub13_3152.anInt9615 > i_26_); i_26_++) {
                        if (DisplayModeManagerContainer5.aBoolean1211) {
                            int i_27_ = 33 + (MouseHandler.menuOriginY + i_26_ * 16);
                            if (i_24_ > -13 + i_27_ && i_24_ < 4 + i_27_) i_25_ = i_26_;
                        } else {
                            int i_28_ = i_26_ * 16 + 31 + MouseHandler.menuOriginY;
                            if (i_28_ + -13 < i_24_ && i_24_ < 3 + i_28_) i_25_ = i_26_;
                        }
                    }
                    if (i_25_ != -1) {
                        int i_29_ = 0;
                        ClientErrorReporter class156 = new ClientErrorReporter(Component359.aClass348_Sub42_Sub13_3152.aClass107_9621);
                        for (MenuEntry class348_sub42_sub12 = ((MenuEntry) class156.firstHashNode(98)); class348_sub42_sub12 != null; class348_sub42_sub12 = ((MenuEntry) class156.nextHashNode((byte) 122))) {
                            if (i_29_ == i_25_) {
                                ColoredTextBuilder.processMenuAction((byte) 126, class348_sub42_sub12, i_24_, i_23_);
                                break;
                            }
                            i_29_++;
                        }
                    }
                    ShaderProgramSub2.method2146((byte) 78);
                } else if (DisplayModeManagerContainer136.anInt4717 <= i_23_ && (i_23_ <= DisplayModeManagerContainer136.anInt4717 - -Component227.anInt1117) && i_24_ >= DefinitionGroup.anInt9532 && ((DefinitionGroup.anInt9532 - -Component251.anInt5819) >= i_24_)) {
                    if (PauseHandler.aBoolean9535) {
                        int i_30_ = -1;
                        for (int i_31_ = 0; i_31_ < DisplayModeManagerContainer345.anInt166; i_31_++) {
                            if (DisplayModeManagerContainer5.aBoolean1211) {
                                int i_33_ = (DefinitionGroup.anInt9532 + 33 - -(i_31_ * 16));
                                if (i_24_ > -13 + i_33_ && i_33_ + 4 > i_24_) {
                                    i_30_ = i_31_;
                                    break;
                                }
                            } else {
                                int i_32_ = (DefinitionGroup.anInt9532 + 31 + i_31_ * 16);
                                if (i_24_ > i_32_ - 13 && i_32_ + 3 > i_24_) {
                                    i_30_ = i_31_;
                                    break;
                                }
                            }
                        }
                        if (i_30_ != -1) {
                            int i_34_ = 0;
                            ClientErrorReporter class156 = new ClientErrorReporter(Component237.aClass107_3022);
                            for (HashNodeSub13 class348_sub42_sub13 = ((HashNodeSub13) class156.firstHashNode(18)); class348_sub42_sub13 != null; class348_sub42_sub13 = ((HashNodeSub13) class156.nextHashNode((byte) 55))) {
                                if (i_34_ == i_30_) {
                                    ColoredTextBuilder.processMenuAction((byte) 122, ((MenuEntry) (class348_sub42_sub13.aClass107_9621.sentinel.next)), i_24_, i_23_);
                                    ShaderProgramSub2.method2146((byte) 118);
                                    break;
                                }
                                i_34_++;
                            }
                        }
                    } else {
                        int i_35_ = -1;
                        for (int i_36_ = 0; (i_36_ < DisplayModeManagerContainer306.menuEntryCount); i_36_++) {
                            if (DisplayModeManagerContainer5.aBoolean1211) {
                                int i_37_ = (33 + DefinitionGroup.anInt9532 + 16 * (DisplayModeManagerContainer306.menuEntryCount - (1 - -i_36_)));
                                if (i_37_ - 13 < i_24_ && 4 + i_37_ > i_24_) i_35_ = i_36_;
                            } else {
                                int i_38_ = (DefinitionGroup.anInt9532 + (31 - -((DisplayModeManagerContainer306.menuEntryCount - 1 - i_36_) * 16)));
                                if (i_38_ - 13 < i_24_ && (i_24_ < i_38_ - -3)) i_35_ = i_36_;
                            }
                        }
                        if (i_35_ != -1) {
                            int i_39_ = 0;
                            Component37 class312 = new Component37(DefinitionSub4.menuEntries);
                            for (MenuEntry class348_sub42_sub12 = ((MenuEntry) class312.method2327((byte) -53)); class348_sub42_sub12 != null; class348_sub42_sub12 = ((MenuEntry) class312.method2329(10))) {
                                if (i_35_ == i_39_) {
                                    ColoredTextBuilder.processMenuAction((byte) 107, class348_sub42_sub12, i_24_, i_23_);
                                    break;
                                }
                                i_39_++;
                            }
                        }
                        ShaderProgramSub2.method2146((byte) -46);
                    }
                }
            }
        } else {
            if (i_14_ == 0 && ((Component203.anInt8770 == 1 && DisplayModeManagerContainer306.menuEntryCount > 2) || Component203.method2485(-100))) i_14_ = 2;
            if (i_14_ == 2 && DisplayModeManagerContainer306.menuEntryCount > 0 && class348_sub45 != null) {
                if (Component156.aClass46_3701 == null && HashNode.anInt7059 == 0) DisplayModeManagerContainer42.method2291((byte) -124, class348_sub45.getX((byte) -127), class348_sub45.getY(-104));
                else Component21.anInt3655 = 2;
            }
            if (i_14_ == 0) {
                if (Component192.menuTip != null) Component272.method1731(1);
                else if (r.aBoolean9722) DisplayModeManagerContainer196.method2678(-2049);
            }
            if (Component156.aClass46_3701 == null && HashNode.anInt7059 == 0) {
                Component161.aMenuEntry_1946 = null;
                Component21.anInt3655 = 0;
            }
        }
    }

    DisplayModeManagerContainer1(GameType class230, int i, CacheStore class45) {
        try {
            cacheStore = class45;
            cacheStore.getFileCount(0, 32);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("uga.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ')'));
        }
    }
}
