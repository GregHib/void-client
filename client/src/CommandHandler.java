/* CommandHandler - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class82` (JODE-obfuscated).
 * Console command handler. handleCommand(String,...) prints/parses commands such as "cls - Clear console" and "commands"; dispatches to Applet_Sub1.
 */

import jagex3.jagmisc.jagmisc;

import java.io.File;
import java.io.FileOutputStream;

final class CommandHandler {
    static CacheStore aClass45_1434;
    static int anInt1435;
    private final CacheStore aClass45_1436;
    static int anInt1437;
    static int anInt1438;
    int anInt1439;

    /** Null shared statics for GC / shutdown. */
    public static void clearStatics(byte i) {
        if (i > -109) anInt1435 = 69;
        aClass45_1434 = null;
    }

    static final void handleCommand(String string, boolean bool, boolean bool_0_, byte i) {
            try {
                if (i != -79) updateOrbitCamera((byte) -79, 126L);
                anInt1437++;
                try {
                    if (Component49.clientState != 10 && (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help"))) {
                        Applet_Sub1.printConsole("commands - This command", i ^ 0x1);
                        Applet_Sub1.printConsole("cls - Clear console", -54);
                        Applet_Sub1.printConsole("displayfps - Toggle FPS and other information", -89);
                        Applet_Sub1.printConsole("renderer - Print graphics renderer information", 122);
                        Applet_Sub1.printConsole("heap - Print java memory information", -88);
                        Applet_Sub1.printConsole("ed / spawn - Local scene editor (device-only)", 80);
                        return;
                    }
                    if (string.equalsIgnoreCase("cls")) {
                        Component94.consoleScroll = 0;
                        Component14.consoleLineCount = 0;
                        return;
                    }
                    // Local scene editor — available without staff gate (device-local only).
                    if (string.equalsIgnoreCase("ed") || string.equalsIgnoreCase("editor")) {
                        SceneEditorHost.printHelp();
                        Applet_Sub1.printConsole(SceneEditorHost.command("status"), 80);
                        return;
                    }
                    if (string.length() > 3 && (string.regionMatches(true, 0, "ed ", 0, 3)
                            || string.regionMatches(true, 0, "editor ", 0, 7))) {
                        String payload = string.regionMatches(true, 0, "editor ", 0, 7)
                                ? string.substring(7).trim()
                                : string.substring(3).trim();
                        try {
                            Applet_Sub1.printConsole(SceneEditorHost.command(payload), 80);
                        } catch (Throwable t) {
                            Applet_Sub1.printConsole("ed: " + t.getMessage(), -80);
                        }
                        return;
                    }
                    if (string.regionMatches(true, 0, "spawn ", 0, 6)) {
                        try {
                            Applet_Sub1.printConsole(SceneEditorHost.command(string.trim()), 80);
                        } catch (Throwable t) {
                            Applet_Sub1.printConsole("spawn: " + t.getMessage(), -80);
                        }
                        return;
                    }
                    if (string.equalsIgnoreCase("displayfps")) {
                        Component10.fpsOverlayEnabled = !Component10.fpsOverlayEnabled;
                        if (Component10.fpsOverlayEnabled) Applet_Sub1.printConsole("FPS on", 83);
                        else {
                            Applet_Sub1.printConsole("FPS off", -69);
                            return;
                        }
                        return;
                    }
                    if (string.equals("renderer")) {
                        Component6 class365 = NodeSub8.toolkit.c();
                        Applet_Sub1.printConsole("Vendor: " + class365.anInt4476, 89);
                        Applet_Sub1.printConsole("Name: " + (class365.aString4470), 71);
                        Applet_Sub1.printConsole(("Version: " + (class365.anInt4475)), -110);
                        Applet_Sub1.printConsole(("Device: " + (class365.aString4472)), i + 146);
                        Applet_Sub1.printConsole(("Driver Version: " + (class365.aLong4471)), i + -32);
                        return;
                    }
                    if (string.equals("heap")) {
                        Applet_Sub1.printConsole(("Heap: " + Component127.anInt2964 + "MB"), 69);
                        return;
                    }
                } catch (Exception exception) {
                    Applet_Sub1.printConsole((FriendsIgnoreList.aClass274_3485.getLocalized(ObjectDeserializer.languageId, 544)), -99);
                    return;
                }
                if (DisplayModeManagerContainer345.aClass364_165 != Component326.LIVE || Component353.anInt2581 >= 2) {
                    if (string.equalsIgnoreCase("errortest")) throw new RuntimeException();
                    if (string.equals("nativememerror")) throw new OutOfMemoryError("native(MPR");
                    try {
                        if (string.equalsIgnoreCase("printfps")) {
                            Applet_Sub1.printConsole(("FPS: " + DisplayModeManagerContainer348.fps), -58);
                            return;
                        }
                        if (string.equalsIgnoreCase("occlude")) {
                            DefinitionSub23.aBoolean9307 = !DefinitionSub23.aBoolean9307;
                            if (DefinitionSub23.aBoolean9307) {
                                Applet_Sub1.printConsole("Occlsion now on!", -102);
                                return;
                            } else Applet_Sub1.printConsole("Occlsion now off!", -106);
                            return;
                        }
                        if (string.equalsIgnoreCase("fpson")) {
                            Component10.fpsOverlayEnabled = true;
                            Applet_Sub1.printConsole("fps debug enabled", -115);
                            return;
                        }
                        if (string.equalsIgnoreCase("fpsoff")) {
                            Component10.fpsOverlayEnabled = false;
                            Applet_Sub1.printConsole("fps debug disabled", 125);
                            return;
                        }
                        if (string.equals("systemmem")) {
                            try {
                                Applet_Sub1.printConsole(("System memory: " + (jagmisc.getAvailablePhysicalMemory() / 1048576L) + "/" + DefinitionSub20.aClass348_Sub4_9264.anInt6609 + "Mb"), i + 26);
                            } catch (Throwable throwable) {
                                /* empty */
                            }
                            return;
                        }
                        if (string.equalsIgnoreCase("cleartext")) {
                            Component241.aClass243_2957.method1876((byte) -45);
                            Applet_Sub1.printConsole("Text coords cleared", i + 21);
                            return;
                        }
                        if (string.equalsIgnoreCase("gc")) {
                            DisplayModeManagerContainer57.method427(i + 180);
                            for (int i_1_ = 0; i_1_ < 10; i_1_++)
                                System.gc();
                            Runtime runtime = Runtime.getRuntime();
                            int i_2_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
                            Applet_Sub1.printConsole("mem=" + i_2_ + "k", 110);
                            return;
                        }
                        if (string.equalsIgnoreCase("compact")) {
                            DisplayModeManagerContainer57.method427(-41);
                            for (int i_3_ = 0; i_3_ < 10; i_3_++)
                                System.gc();
                            Runtime runtime = Runtime.getRuntime();
                            int i_4_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
                            Applet_Sub1.printConsole(("Memory before cleanup=" + i_4_ + "k"), 115);
                            Component201.method2271(31268);
                            DisplayModeManagerContainer57.method427(96);
                            for (int i_5_ = 0; i_5_ < 10; i_5_++)
                                System.gc();
                            i_4_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
                            Applet_Sub1.printConsole(("Memory after cleanup=" + i_4_ + "k"), -110);
                            return;
                        }
                        if (string.equalsIgnoreCase("unloadnatives")) {
                            Applet_Sub1.printConsole((NativeLibraryLoader.unloadNativeLibraries(true) ? "Libraries unloaded" : "Library unloading failed!"), 63);
                            return;
                        }
                        if (string.equalsIgnoreCase("clientdrop")) {
                            Applet_Sub1.printConsole("Dropped client connection", -119);
                            if (Component49.clientState == 10) SocketConnector.forceLogout(105);
                            else {
                                if (Component49.clientState == 11) Component338.aBoolean1712 = true;
                                return;
                            }
                            return;
                        }
                        if (string.equalsIgnoreCase("rotateconnectmethods")) {
                            Component223.aClass161_125.method1259(0);
                            Applet_Sub1.printConsole("Rotated connection methods", i ^ ~0x13);
                            return;
                        }
                        if (string.equalsIgnoreCase("clientjs5drop")) {
                            HardwareProbe.aClass248_6601.closeConnection(-83);
                            Applet_Sub1.printConsole("Dropped client js5 net queue", -116);
                            return;
                        }
                        if (string.equalsIgnoreCase("serverjs5drop")) {
                            HardwareProbe.aClass248_6601.writeClose(0);
                            Applet_Sub1.printConsole("Dropped server js5 net queue", -100);
                            return;
                        }
                        if (string.equalsIgnoreCase("breakcon")) {
                            OggUrlStream.aClass297_8992.blockConnections(-95);
                            DefinitionSub8.aClass238_9165.shutdownStreams(i + 123);
                            HardwareProbe.aClass248_6601.detachStreams(true);
                            Applet_Sub1.printConsole("Breaking new connections for 5 seconds", i + -4);
                            return;
                        }
                        if (string.equalsIgnoreCase("rebuild")) {
                            NodeSub20.method2953((byte) -117);
                            Component308.method464(-1);
                            Applet_Sub1.printConsole("Rebuilding map", -113);
                            return;
                        }
                        if (string.equalsIgnoreCase("rebuildprofile")) {
                            Component330.aLong1516 = Component240.currentTimeMillis(-75);
                            AbstractGlTextureSub4.aBoolean8558 = true;
                            NodeSub20.method2953((byte) -114);
                            Component308.method464(-1);
                            Applet_Sub1.printConsole("Rebuilding map (with profiling)", -117);
                            return;
                        }
                        if (string.equalsIgnoreCase("wm1")) {
                            LogicError.method830(1, -1, (byte) 102, false, -1);
                            if (MenuEntry.getWindowMode(-61) == 1) {
                                Applet_Sub1.printConsole("wm1 succeeded", -65);
                                return;
                            } else Applet_Sub1.printConsole("wm1 failed", i ^ ~0x17);
                            return;
                        }
                        if (string.equalsIgnoreCase("wm2")) {
                            LogicError.method830(2, -1, (byte) 102, false, -1);
                            if (MenuEntry.getWindowMode(-119) == 2) Applet_Sub1.printConsole("wm2 succeeded", -109);
                            else {
                                Applet_Sub1.printConsole("wm2 failed", i + 154);
                                return;
                            }
                            return;
                        }
                        if (string.equalsIgnoreCase("wm3")) {
                            LogicError.method830(3, 1024, (byte) 102, false, 768);
                            if (MenuEntry.getWindowMode(i ^ 0x3d) == 3) Applet_Sub1.printConsole("wm3 succeeded", 111);
                            else {
                                Applet_Sub1.printConsole("wm3 failed", 83);
                                return;
                            }
                            return;
                        }
                        if (string.equalsIgnoreCase("tk0")) {
                            SoftwareFallbackShader.method3553(false, (byte) 104, 0);
                            if (Component192.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350) == 0) {
                                Applet_Sub1.printConsole("Entered tk0", 101);
                                Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub25_7251), 0);
                                DisplayModeManagerContainer389.savePreferences(37);
                                r.aBoolean9719 = false;
                                return;
                            } else Applet_Sub1.printConsole("Failed to enter tk0", 69);
                            return;
                        }
                        if (string.equalsIgnoreCase("tk1")) {
                            SoftwareFallbackShader.method3553(false, (byte) 109, 1);
                            if (Component192.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350) == 1) {
                                Applet_Sub1.printConsole("Entered tk1", -65);
                                Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub25_7251), 1);
                                DisplayModeManagerContainer389.savePreferences(i ^ ~0x6b);
                                r.aBoolean9719 = false;
                                return;
                            } else Applet_Sub1.printConsole("Failed to enter tk1", -56);
                            return;
                        }
                        if (string.equalsIgnoreCase("tk2")) {
                            SoftwareFallbackShader.method3553(false, (byte) 115, 2);
                            if (Component192.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350) == 2) {
                                Applet_Sub1.printConsole("Entered tk2", i + 151);
                                Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub25_7251), 2);
                                DisplayModeManagerContainer389.savePreferences(37);
                                r.aBoolean9719 = false;
                            } else {
                                Applet_Sub1.printConsole("Failed to enter tk2", i ^ 0x22);
                                return;
                            }
                            return;
                        }
                        if (string.equalsIgnoreCase("tk3")) {
                            SoftwareFallbackShader.method3553(false, (byte) 107, 3);
                            if (Component192.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350) == 3) {
                                Applet_Sub1.printConsole("Entered tk3", 78);
                                Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub25_7251), 3);
                                DisplayModeManagerContainer389.savePreferences(37);
                                r.aBoolean9719 = false;
                                return;
                            } else Applet_Sub1.printConsole("Failed to enter tk3", 54);
                            return;
                        }
                        if (string.equalsIgnoreCase("tk5")) {
                            SoftwareFallbackShader.method3553(false, (byte) 113, 5);
                            if (Component192.preferences.aClass239_Sub25_7271.getPreferenceValue(i ^ 0x7e13) == 5) {
                                Applet_Sub1.printConsole("Entered tk5", -108);
                                Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub25_7251), 5);
                                DisplayModeManagerContainer389.savePreferences(37);
                                r.aBoolean9719 = false;
                            } else {
                                Applet_Sub1.printConsole("Failed to enter tk5", 63);
                                return;
                            }
                            return;
                        }
                        if (string.startsWith("setba")) {
                            if (string.length() < 6) Applet_Sub1.printConsole("Invalid buildarea value", i + -36);
                            else {
                                int i_6_ = (NodeSub41.parseInt(true, string.substring(6)));
                                if (i_6_ < 0 || (Node.method2710(-126, Component127.anInt2964) < i_6_)) Applet_Sub1.printConsole("Invalid buildarea value", 53);
                                else {
                                    Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub6_7226), i_6_);
                                    DisplayModeManagerContainer389.savePreferences(37);
                                    r.aBoolean9719 = false;
                                    Applet_Sub1.printConsole(("maxbuildarea=" + Component192.preferences.aClass239_Sub6_7226.method1743(-32350)), 98);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (string.startsWith("rect_debug")) {
                            if (string.length() < 10) Applet_Sub1.printConsole("Invalid rect_debug value", -94);
                            else {
                                GlToolkitSub3.anInt8045 = NodeSub41.parseInt(true, string.substring(10).trim());
                                Applet_Sub1.printConsole(("rect_debug=" + GlToolkitSub3.anInt8045), -124);
                                return;
                            }
                            return;
                        }
                        if (string.equalsIgnoreCase("qa_op_test")) {
                            DisplayModeManagerContainer356.aBoolean6327 = true;
                            Applet_Sub1.printConsole(("qa_op_test=" + (DisplayModeManagerContainer356.aBoolean6327)), -114);
                            return;
                        }
                        if (string.equalsIgnoreCase("clipcomponents")) {
                            Component29.aBoolean10046 = !Component29.aBoolean10046;
                            Applet_Sub1.printConsole(("clipcomponents=" + (Component29.aBoolean10046)), 88);
                            return;
                        }
                        if (string.startsWith("bloom")) {
                            boolean bool_7_ = NodeSub8.toolkit.method3666();
                            if (DefinitionSub33.method3137(!bool_7_, (byte) -24)) {
                                if (bool_7_) {
                                    Applet_Sub1.printConsole("Bloom disabled", i + -49);
                                    return;
                                } else Applet_Sub1.printConsole("Bloom enabled", 71);
                                return;
                            } else Applet_Sub1.printConsole("Failed to enable bloom", 52);
                            return;
                        }
                        if (string.equalsIgnoreCase("tween")) {
                            if (DisplayModeManagerContainer332.aBoolean5002) {
                                DisplayModeManagerContainer332.aBoolean5002 = false;
                                Applet_Sub1.printConsole("Forced tweening disabled.", i ^ ~0x71);
                                return;
                            } else {
                                DisplayModeManagerContainer332.aBoolean5002 = true;
                                Applet_Sub1.printConsole("Forced tweening ENABLED!", -89);
                            }
                            return;
                        }
                        if (string.equalsIgnoreCase("shiftclick")) {
                            if (Component262.shiftClick) {
                                Applet_Sub1.printConsole("Shift-click disabled.", i ^ ~0x24);
                                Component262.shiftClick = false;
                            } else {
                                Applet_Sub1.printConsole("Shift-click ENABLED!", 106);
                                Component262.shiftClick = true;
                                return;
                            }
                            return;
                        }
                        if (string.equalsIgnoreCase("getcgcoord")) {
                            Applet_Sub1.printConsole(("x:" + ((Component72.localPlayer.x) >> 9) + " z:" + ((Component72.localPlayer.y) >> 9)), -117);
                            return;
                        }
                        if (string.equalsIgnoreCase("getheight")) {
                            Applet_Sub1.printConsole(("Height: " + (ShaderSub1.aSArray5191[(Component72.localPlayer.plane)].getHeight((byte) -86, (Component72.localPlayer.y) >> 9, (Component72.localPlayer.x) >> 9))), i ^ 0x1);
                            return;
                        }
                        if (string.equalsIgnoreCase("resetminimap")) {
                            Component158.aClass45_322.clearPacked(i ^ ~0x4e);
                            Component158.aClass45_322.clearUnpacked((byte) 127);
                            Component245.aClass141_117.method1175((byte) 125);
                            DisplayModeManagerContainer64.aClass153_9031.method1219(7851);
                            Component308.method464(-1);
                            Applet_Sub1.printConsole("Minimap reset", 70);
                            return;
                        }
                        if (string.startsWith("mc")) {
                            if (NodeSub8.toolkit.method3708()) {
                                int i_8_ = Integer.parseInt(string.substring(3));
                                if (i_8_ >= 1) {
                                    if (i_8_ > 4) i_8_ = 4;
                                } else i_8_ = 1;
                                Component25.anInt6012 = i_8_;
                                NodeSub20.method2953((byte) -128);
                                Applet_Sub1.printConsole(("Render cores now: " + (Component25.anInt6012)), -77);
                            } else {
                                Applet_Sub1.printConsole("Current toolkit doesn't support multiple cores", i + 138);
                                return;
                            }
                            return;
                        }
                        if (string.startsWith("cachespace")) {
                            Applet_Sub1.printConsole(("I(s): " + StringCache.aClass60_4327.getRemaining(-18529) + "/" + StringCache.aClass60_4327.getCapacity(-4)), -101);
                            Applet_Sub1.printConsole(("I(m): " + Component142.aClass60_4417.getRemaining(-18529) + "/" + Component142.aClass60_4417.getCapacity(i ^ 0x4d)), 127);
                            Applet_Sub1.printConsole(("O(s): " + Exception_Sub1.itemDefinitions.aClass175_3288.method1350((byte) 126) + "/" + Exception_Sub1.itemDefinitions.aClass175_3288.method1339(100)), i + 203);
                            return;
                        }
                        if (string.equalsIgnoreCase("getcamerapos")) {
                            Applet_Sub1.printConsole(("Pos: " + (Component72.localPlayer.plane) + "," + (((WaterSurfaceShader.anInt6246 >> 9) - -NodeBaseSub2.regionTileX) >> 6) + "," + ((Component317.anInt8685 >> 9) + Component330.regionTileY >> 6) + "," + (((WaterSurfaceShader.anInt6246 >> 9) - -NodeBaseSub2.regionTileX) & 0x3f) + "," + ((Component317.anInt8685 >> 9) - -Component330.regionTileY & 0x3f) + " Height: " + ((Component300.method2064(WaterSurfaceShader.anInt6246, (Component72.localPlayer.plane), 11219, Component317.anInt8685)) - DisplayModeManagerContainer50.anInt3855)), 126);
                            Applet_Sub1.printConsole(("Look: " + (Component72.localPlayer.plane) + "," + (Component48.anInt4336 - -NodeBaseSub2.regionTileX >> 6) + "," + (Component330.regionTileY + Component337.anInt3647 >> 6) + "," + (0x3f & Component48.anInt4336 - -NodeBaseSub2.regionTileX) + "," + (0x3f & Component337.anInt3647 - -Component330.regionTileY) + " Height: " + ((Component300.method2064(Component48.anInt4336, (Component72.localPlayer.plane), 11219, Component337.anInt3647)) - Component221.anInt1797)), -90);
                            return;
                        }
                        if (string.equals("renderprofile") || string.equals("rp")) {
                            ReliefShader.aBoolean2514 = !ReliefShader.aBoolean2514;
                            NodeSub8.toolkit.method3647(ReliefShader.aBoolean2514);
                            Component362.method1042((byte) 23);
                            Applet_Sub1.printConsole(("showprofiling=" + ReliefShader.aBoolean2514), 106);
                            return;
                        }
                        if (string.startsWith("performancetest")) {
                            int i_9_ = -1;
                            int i_10_ = 1000;
                            if (string.length() > 15) {
                                String[] strings = DefinitionSub23.splitByChar(' ', true, string);
                                try {
                                    if (strings.length > 1) i_10_ = Integer.parseInt(strings[1]);
                                } catch (Throwable throwable) {
                                    /* empty */
                                }
                                try {
                                    if (strings.length > 2) i_9_ = Integer.parseInt(strings[2]);
                                } catch (Throwable throwable) {
                                    /* empty */
                                }
                            }
                            if (i_9_ == -1) {
                                Applet_Sub1.printConsole(("Java toolkit: " + Component329.method1781(0, -85, i_10_)), i + -32);
                                Applet_Sub1.printConsole(("SSE toolkit:  " + Component329.method1781(2, -73, i_10_)), 60);
                                Applet_Sub1.printConsole(("D3D toolkit:  " + Component329.method1781(3, i + -24, i_10_)), i ^ ~0x11);
                                Applet_Sub1.printConsole(("GL toolkit:   " + Component329.method1781(1, -84, i_10_)), -121);
                                Applet_Sub1.printConsole(("GLX toolkit:  " + Component329.method1781(5, -77, i_10_)), -101);
                                return;
                            } else Applet_Sub1.printConsole(("Performance: " + Component329.method1781(i_9_, -69, i_10_)), -84);
                            return;
                        }
                        if (string.equals("nonpcs")) {
                            BasicMouseHandler.aBoolean7444 = !BasicMouseHandler.aBoolean7444;
                            Applet_Sub1.printConsole("nonpcs=" + (BasicMouseHandler.aBoolean7444), -120);
                            return;
                        }
                        if (string.equals("autoworld")) {
                            HashNodeSub20.method3283(127);
                            Applet_Sub1.printConsole("auto world selected", -59);
                            return;
                        }
                        if (string.startsWith("switchworld")) {
                            int i_11_ = Integer.parseInt(string.substring(12));
                            OggUrlStream.method2972((DisplayModeManagerContainer348.method1742(false, i_11_).aString5794), i_11_, -93);
                            Applet_Sub1.printConsole("switched", 70);
                            return;
                        }
                        if (string.equals("getworld")) {
                            Applet_Sub1.printConsole(("w: " + (Component223.aClass161_125.anInt2143)), -120);
                            return;
                        }
                        if (string.startsWith("pc")) {
                            ParticleSystem class348_sub47 = (ParticleShader.createOutboundPacket(DefinitionSub22.aClass351_9304, DisplayModeManagerContainer64.aClass77_9029, -97));
                            class348_sub47.particleBuffer.writeByte(false, 0);
                            int i_12_ = (class348_sub47.particleBuffer.offset);
                            int i_13_ = string.indexOf(" ", 4);
                            class348_sub47.particleBuffer.writeString((byte) -5, string.substring(3, i_13_));
                            AbstractShaderSub4.writeHuffmanString((class348_sub47.particleBuffer), i + -12, string.substring(i_13_));
                            class348_sub47.particleBuffer.writeLengthByte(114, (class348_sub47.particleBuffer.offset + -i_12_));
                            HashNodeSub14.enqueueOutboundPacket(i ^ ~0x49, class348_sub47);
                            return;
                        }
                        if (string.equals("savevarcs")) {
                            DisplayModeManagerContainer343.saveClientPreferences(119);
                            Applet_Sub1.printConsole("perm varcs saved", -103);
                            return;
                        }
                        if (string.equals("scramblevarcs")) {
                            for (int i_14_ = 0; (i_14_ < DisplayModeManagerContainer123.anIntArray1303.length); i_14_++) {
                                if (WaterShaderProgram.aBooleanArray6270[i_14_]) {
                                    DisplayModeManagerContainer123.anIntArray1303[i_14_] = (int) (Math.random() * 99999.0);
                                    if (Math.random() > 0.5) DisplayModeManagerContainer123.anIntArray1303[i_14_] *= -1;
                                }
                            }
                            DisplayModeManagerContainer343.saveClientPreferences(-61);
                            Applet_Sub1.printConsole("perm varcs scrambled", -74);
                            return;
                        }
                        if (string.equals("showcolmap")) {
                            Component121.aBoolean4542 = true;
                            Component308.method464(-1);
                            Applet_Sub1.printConsole("colmap is shown", 53);
                            return;
                        }
                        if (string.equals("hidecolmap")) {
                            Component121.aBoolean4542 = false;
                            Component308.method464(i ^ 0x4e);
                            Applet_Sub1.printConsole("colmap is hidden", 61);
                            return;
                        }
                        if (string.equals("resetcache")) {
                            NodeSub18.method2938((byte) 122);
                            Applet_Sub1.printConsole("Caches reset", -113);
                            return;
                        }
                        if (string.equals("profilecpu")) {
                            Applet_Sub1.printConsole((Component94.benchmarkToolkitMs(-26584) + "ms"), 87);
                            return;
                        }
                        if (string.startsWith("getclientvarpbit")) {
                            int i_15_ = Integer.parseInt(string.substring(17));
                            Applet_Sub1.printConsole("varpbit=" + DisplayModeManagerContainer58.aClass170_10209.method62(i_15_, i ^ 0xffb1), i + 198);
                            return;
                        }
                        if (string.startsWith("getclientvarp")) {
                            int i_16_ = Integer.parseInt(string.substring(14));
                            Applet_Sub1.printConsole("varp=" + DisplayModeManagerContainer58.aClass170_10209.method61(i_16_, (byte) -16), -68);
                            return;
                        }
                        if (string.startsWith("directlogin")) {
                            String[] strings = (DefinitionSub23.splitByChar(' ', true, string.substring(12)));
                            if (strings.length >= 2) {
                                int i_17_ = (strings.length > 2 ? Integer.parseInt(strings[2]) : 0);
                                Component193.method1922(strings[1], i_17_, strings[0], true);
                                return;
                            }
                        }
                        if (string.startsWith("csprofileclear")) {
                            ClientScriptExecutor.onReset();
                            return;
                        }
                        if (string.startsWith("csprofileoutputc")) {
                            ClientScriptExecutor.onAfterReset(100, false);
                            return;
                        }
                        if (string.startsWith("csprofileoutputt")) {
                            ClientScriptExecutor.onAfterReset(10, true);
                            return;
                        }
                        if (string.startsWith("texsize")) {
                            int i_18_ = Integer.parseInt(string.substring(8));
                            NodeSub8.toolkit.method3696(i_18_);
                            return;
                        }
                        if (string.equals("soundstreamcount")) {
                            Applet_Sub1.printConsole(("Active streams: " + PlayerState.aClass348_Sub16_Sub4_7065.method2887()), 84);
                            return;
                        }
                        if (string.equals("autosetup")) {
                            Component269.method2478(1000);
                            Applet_Sub1.printConsole(("Complete. Toolkit now: " + Component192.preferences.aClass239_Sub25_7271.getPreferenceValue(i + -32271)), -97);
                            return;
                        }
                        if (string.equals("errormessage")) {
                            Applet_Sub1.printConsole(NpcComposition.aClient1367.method81((byte) 102), 102);
                            return;
                        }
                        if (string.equals("heapdump")) {
                            if (!ReflectionInvoker.aString3803.startsWith("win")) HeapDumpHelper.dumpHeapToFile(new File("/tmp/heap.dump"), false, false);
                            else HeapDumpHelper.dumpHeapToFile(new File("C:\\Temp\\heap.dump"), false, false);
                            Applet_Sub1.printConsole("Done", 74);
                            return;
                        }
                        if (string.equals("os")) {
                            Applet_Sub1.printConsole("Name: " + ReflectionInvoker.aString3803, 59);
                            Applet_Sub1.printConsole(("Arch: " + ReflectionInvoker.osArch), i ^ ~0x1);
                            Applet_Sub1.printConsole("Ver: " + ReflectionInvoker.osVersion, 79);
                            return;
                        }
                        if (string.startsWith("w2debug")) {
                            int i_19_ = Integer.parseInt(string.substring(8, 9));
                            Component171.anInt10096 = i_19_;
                            NodeSub20.method2953((byte) -103);
                            Applet_Sub1.printConsole("Toggled!", -99);
                            return;
                        }
                        if (string.startsWith("ortho ")) {
                            int i_20_ = string.indexOf(' ');
                            if (i_20_ < 0) Applet_Sub1.printConsole("Syntax: ortho <n>", 66);
                            else {
                                int i_21_ = (NodeSub41.parseInt(true, string.substring(1 + i_20_)));
                                Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub3_7222), i_21_);
                                DisplayModeManagerContainer389.savePreferences(37);
                                r.aBoolean9719 = false;
                                HashNodeSub3.method3179(i + 79);
                                if (Component192.preferences.aClass239_Sub3_7222.method1727(-32350) == i_21_) {
                                    Applet_Sub1.printConsole("Successfully changed ortho mode", -82);
                                    return;
                                } else Applet_Sub1.printConsole("Failed to change ortho mode", -112);
                                return;
                            }
                            return;
                        }
                        if (string.startsWith("orthozoom ")) {
                            if (Component192.preferences.aClass239_Sub3_7222.method1727(i + -32271) == 0) Applet_Sub1.printConsole("enable ortho mode first (use 'ortho <n>')", i + 182);
                            else {
                                int i_22_ = (NodeSub41.parseInt(true, string.substring(string.indexOf(' ') - -1)));
                                Component72.anInt1911 = i_22_;
                                Applet_Sub1.printConsole(("orthozoom=" + Component72.anInt1911), 68);
                                return;
                            }
                            return;
                        }
                        if (string.startsWith("orthotilesize ")) {
                            int i_23_ = (NodeSub41.parseInt(true, string.substring(1 + string.indexOf(' '))));
                            Component134.anInt5812 = CacheStore.anInt666 = i_23_;
                            Applet_Sub1.printConsole("ortho tile size=" + i_23_, -70);
                            HashNodeSub3.method3179(0);
                            return;
                        }
                        if (string.equals("orthocamlock")) {
                            Component182.aBoolean9746 = !Component182.aBoolean9746;
                            Applet_Sub1.printConsole(("ortho camera lock is " + (!(Component182.aBoolean9746) ? "off" : "on")), -92);
                            return;
                        }
                        if (string.startsWith("setoutput ")) {
                            File file = new File(string.substring(10));
                            if (file.exists()) {
                                file = new File(string.substring(10) + "." + Component240.currentTimeMillis(-76) + ".log");
                                if (file.exists()) {
                                    Applet_Sub1.printConsole("file already exists!", 80);
                                    return;
                                }
                            }
                            if (Component40.consoleLogStream != null) {
                                Component40.consoleLogStream.close();
                                Component40.consoleLogStream = null;
                            }
                            try {
                                Component40.consoleLogStream = new FileOutputStream(file);
                            } catch (java.io.FileNotFoundException filenotfoundexception) {
                                Applet_Sub1.printConsole(("Could not create " + file.getName()), 81);
                            } catch (SecurityException securityexception) {
                                Applet_Sub1.printConsole(("Cannot write to " + file.getName()), i ^ ~0x22);
                            }
                            return;
                        }
                        if (string.equals("closeoutput")) {
                            if (Component40.consoleLogStream != null) Component40.consoleLogStream.close();
                            Component40.consoleLogStream = null;
                            return;
                        }
                        if (string.startsWith("runscript ")) {
                            File file = new File(string.substring(10));
                            if (!file.exists()) {
                                Applet_Sub1.printConsole("No such file", 120);
                                return;
                            }
                            byte[] is = ColoredText.method1821(i ^ 0x41, file);
                            if (is == null) {
                                Applet_Sub1.printConsole("Failed to read file", 119);
                                return;
                            }
                            String[] strings = (DefinitionSub23.splitByChar('\n', true, (DisplayModeManagerContainer1.replaceChar(Component66.method1795(is, true), (byte) -89, '\r', ""))));
                            PauseHandler.runConsoleCommands(0, strings);
                        }
                        if (string.startsWith("zoom ")) {
                            short i_24_ = (short) (NodeSub41.parseInt(true, string.substring(5)));
                            if (i_24_ > 0) Component233.aShort3992 = i_24_;
                            return;
                        }
                        if (string.startsWith("fps ") && (DisplayModeManagerContainer345.aClass364_165 != Component326.LIVE)) {
                            DisplayModeManagerContainer61.method2222((NodeSub41.parseInt(true, string.substring(4))), (byte) -124);
                            return;
                        }
                    } catch (Exception exception) {
                        Applet_Sub1.printConsole(FriendsIgnoreList.aClass274_3485.getLocalized(ObjectDeserializer.languageId, 544), -92);
                        return;
                    }
                }
                if (Component49.clientState == 10) {
                    Component102.anInt4799++;
                    ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((MatrixSub2.aClass351_5699), (DisplayModeManagerContainer64.aClass77_9029), i ^ 0x24);
                    class348_sub47.particleBuffer.writeByte(false, string.length() + 3);
                    class348_sub47.particleBuffer.writeByte(false, bool ? 1 : 0);
                    class348_sub47.particleBuffer.writeByte(false, bool_0_ ? 1 : 0);
                    class348_sub47.particleBuffer.writeString((byte) -5, string);
                    HashNodeSub14.enqueueOutboundPacket(120, class348_sub47);
                }
                if (Component49.clientState == 10) {
                    return;
                }
                Applet_Sub1.printConsole(FriendsIgnoreList.aClass274_3486.getLocalized(ObjectDeserializer.languageId, 544) + string, 57);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("lba.B(" + (string != null ? "{...}" : "null") + ',' + bool + ',' + bool_0_ + ',' + i + ')'));
            }
    }

    /** Floor decoration ({@code aClass318_Sub1_Sub4_4403}) on tile (level,x,z), or null. */
    static final Component269 getFloorDecoration(int i, int i_25_, int i_26_) {
        Component186 class357 = Component335.aClass357ArrayArrayArray2029[i][i_25_][i_26_];
        if (class357 == null) return null;
        return class357.aClass318_Sub1_Sub4_4403;
    }

    /**
     * Orbit/free camera tick: lerp focus toward orbit target and apply yaw/pitch rates.
     * Used when {@link DefinitionSub21#cameraMode} == 4.
     */
    static final void updateOrbitCamera(byte i, long l) {
        try {
            anInt1438++;
            int i_27_ = NodederUtil.anInt6633;
            if (i > 106) {
                if (DisplayModeManagerContainer273.cameraFocusX != i_27_) {
                    int i_28_ = i_27_ - DisplayModeManagerContainer273.cameraFocusX;
                    int i_29_ = (int) ((long) i_28_ * l / 320L);
                    if (i_28_ <= 0) {
                        if (i_29_ != 0) {
                            if (i_29_ < i_28_) i_29_ = i_28_;
                        } else i_29_ = -1;
                    } else if (i_29_ == 0) i_29_ = 1;
                    else if (i_28_ < i_29_) i_29_ = i_28_;
                    DisplayModeManagerContainer273.cameraFocusX += i_29_;
                }
                int i_30_ = NodeSub7.anInt6652;
                DisplayModeManagerContainer154.cameraPitch += NodeSub27.cameraPitchRate * (float) l / 40.0F * 8.0F;
                Component112.cameraYaw += Component275.cameraYawRate * (float) l / 40.0F * 8.0F;
                if (Component353.cameraFocusZ != i_30_) {
                    int i_31_ = -Component353.cameraFocusZ + i_30_;
                    int i_32_ = (int) (l * (long) i_31_ / 320L);
                    if (i_31_ <= 0) {
                        if (i_32_ == 0) i_32_ = -1;
                        else if (i_32_ < i_31_) i_32_ = i_31_;
                    } else if (i_32_ != 0) {
                        if (i_31_ < i_32_) i_32_ = i_31_;
                    } else i_32_ = 1;
                    Component353.cameraFocusZ += i_32_;
                }
                DisplayModeManagerContainer199.clampCameraAngles(262144);
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, "lba.A(" + i + ',' + l + ')');
        }
    }

    CommandHandler(GameType class230, int i, CacheStore class45) {
        new NodeCache(64);
        try {
            aClass45_1436 = class45;
            this.anInt1439 = aClass45_1436.getFileCount(0, 15);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("lba.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ')'));
        }
    }
}
