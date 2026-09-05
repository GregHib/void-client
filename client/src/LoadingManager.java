/* LoadingManager - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class164` (JODE-obfuscated).
 * Game loading coordinator. Drives LoadingState transitions, creates CacheFileStore, loads cache indexes (13/33/34), and handles RSARequest/OggStream bootstrap during startup.
 */

import jagex3.jagmisc.jagmisc;

final class LoadingManager {
    static int anInt2172;
    static int anInt2173;
    static int anInt2174;
    static int anInt2175;

    static final void clearDefinitionCaches(byte i) {
        anInt2175++;
        StringCache.aClass60_4327.clear(i + -62);
        Component142.aClass60_4417.clear(0);
        ColoredText.aClass60_6096.clear(0);
        if (i != 62) clearDefinitionCaches((byte) 43);
        DefinitionSub9.aClass60_9171.clear(0);
    }

    /**
     * Advance the boot {@link LoadingState} machine and return a 0–100 progress hint for the splash bar.
     * Called each frame from the RSA/login bootstrap path until the title is ready.
     */
    static final int pulseLoading(int i) {
        if (Component192.aClass348_Sub51_3959.aClass239_Sub11_7265.method1768(i + -3690) == 0) {
            for (int i_0_ = 0; (i_0_ < HashNodeSub19.anInt9699); i_0_++) {
                if (DefinitionGroup.anInterface6Array9534[i_0_].getKeyChar((byte) 31) == 115 || DefinitionGroup.anInterface6Array9534[i_0_].getKeyChar((byte) 71) == 83) {
                    Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub11_7265), 1);
                    DisplayModeManagerContainer42.aBoolean3847 = true;
                    break;
                }
            }
        }
        anInt2174++;
        if (RSARequest.currentLoadingState == LoadingState.aClass56_1018) {
            Runtime runtime = Runtime.getRuntime();
            int i_1_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
            long l = Component240.currentTimeMillis(i + 28559);
            if (NpcDefinition.aLong6791 == 0) NpcDefinition.aLong6791 = l;
            if (i_1_ > 16384 && -NpcDefinition.aLong6791 + l < 5000) {
                if (-Component75.aLong2286 + l > 1000L) {
                    BuildInfo.maybeGc();
                    Component75.aLong2286 = l;
                }
                return 0;
            }
        }
        if (LoadingState.aClass56_1023 == RSARequest.currentLoadingState) {
            if (Component143.aClass340_2327 == null) Component143.aClass340_2327 = new CacheFileStore(HardwareProbe.aClass248_6601, DisplayModeManagerContainer271.aClass112_520, RSACipher.rsaPublicExponent, RSARequest.aBigInteger9657);
            if (!Component143.aClass340_2327.isReady(7)) return 0;
            OggStream.method2965(null, 0, true, 0);
            // Prefer Component170 sprites over JPEG Toolkit path (wrong colors on Android).
            ShaderProgramSub7.aBoolean6289 = true;
            ShaderProgramSub7.aClass45_6277 = Component14.method3571(false, (ShaderProgramSub7.aBoolean6289 ? 34 : 32), (byte) -23, 1);
            DefinitionSub17Sub1.aClass45_10426 = Component14.method3571(false, 33, (byte) -23, 1);
            Component65.aClass45_1627 = Component14.method3571(false, 13, (byte) -23, 1);
        }
        if (LoadingState.aClass56_1024 == RSARequest.currentLoadingState) {
            boolean bool = DefinitionSub17Sub1.aClass45_10426.prefetchMandatory(89);
            int i_2_ = Component354.aClass314_Sub1Array223[33].getReferenceTableProgress(1);
            i_2_ = i_2_ + Component354.aClass314_Sub1Array223[!ShaderProgramSub7.aBoolean6289 ? 32 : 34].getReferenceTableProgress(1);
            i_2_ += Component354.aClass314_Sub1Array223[13].getReferenceTableProgress(1);
            i_2_ = i_2_ + (!bool ? DefinitionSub17Sub1.aClass45_10426.getAverageLoadPercent((byte) -31) : 100);
            if (i_2_ != 400) return i_2_ / 4;
            Sprite.anInt6924 = ShaderProgramSub7.aClass45_6277.getCrc(77);
            Component83.anInt1663 = DefinitionSub17Sub1.aClass45_10426.getCrc(i + 28561);
            KeyStoreLoader.resolveFontGroupIds(ShaderProgramSub7.aClass45_6277, 0);
            int i_3_ = Component192.aClass348_Sub51_3959.aClass239_Sub19_7257.method1805(i ^ 0x11ae);
            Component134.aClass111_5813 = new Component331(PacketReader.currentGameType, ObjectDeserializer.languageId, DefinitionSub17Sub1.aClass45_10426);
            int[] is = Component134.aClass111_5813.method1046(i_3_, 0);
            if (is.length == 0) is = Component134.aClass111_5813.method1046(0, 0);
            KeyStoreLoader class106 = new KeyStoreLoader(ShaderProgramSub7.aClass45_6277, Component65.aClass45_1627);
            if (is.length > 0) {
                Component280.anInterface16Array2447 = new Interface16[is.length];
                for (int i_4_ = 0; (Component280.anInterface16Array2447.length > i_4_); i_4_++)
                    Component280.anInterface16Array2447[i_4_] = new Component195(Component134.aClass111_5813.method1043(is[i_4_], (byte) 102), class106);
            }
        }
        if (RSARequest.currentLoadingState == LoadingState.aClass56_1026) HashNodeSub3.method3178(Component65.aClass45_1627, -81, Component364.method184(1084489728), ShaderProgramSub7.aClass45_6277);
        if (LoadingState.aClass56_1027 == RSARequest.currentLoadingState) {
            int i_5_ = NodeSub50.method3420(0);
            int i_6_ = HashNodeSub16.method3256(2);
            if (i_6_ > i_5_) return 100 * i_5_ / i_6_;
        }
        if (RSARequest.currentLoadingState == LoadingState.aClass56_1028) {
            if (Component280.anInterface16Array2447 != null && (Component280.anInterface16Array2447.length > 0)) {
                if (Component280.anInterface16Array2447[0].method60(-19079) < 100) return 0;
                if (Component280.anInterface16Array2447.length > 1 && Component134.aClass111_5813.method1044(86) && (Component280.anInterface16Array2447[1].method60(i + 9581) < 100)) return 0;
            }
            DisplayModeManagerContainer292.method1311(5139, NodeSub8.toolkit);
            Component27.method3568(NodeSub8.toolkit, 4);
            Buffer.setClientState(2, 1);
        }
        if (RSARequest.currentLoadingState == LoadingState.aClass56_1029) {
            for (int i_7_ = 0; i_7_ < 4; i_7_++)
                NodeSub45.aClass361Array7108[i_7_] = SpriteSub1.method988(ParametricDefinition.anInt9109, 1, AbstractShaderSub4.anInt7319);
        }
        if (RSARequest.currentLoadingState == LoadingState.aClass56_1030) {
            Component158.aClass45_322 = Component14.method3571(false, 8, (byte) -23, 1);
            NodeSub29.aClass45_6909 = Component14.method3571(false, 0, (byte) -23, 1);
            DisplayModeManagerContainer51.aClass45_2490 = Component14.method3571(false, 1, (byte) -23, 1);
            Component181.aClass45_1541 = Component14.method3571(false, 2, (byte) -23, 1);
            NodeSub35.aClass45_6980 = Component14.method3571(false, 3, (byte) -23, 1);
            Component30.aClass45_1878 = Component14.method3571(false, 4, (byte) -23, 1);
            SoftwareFallbackShader.aClass45_7382 = Component14.method3571(true, 5, (byte) -23, 1);
            Component54.aClass45_8667 = Component14.method3571(true, 6, (byte) -23, 1);
            ShaderSub3.aClass45_5207 = Component14.method3571(false, 7, (byte) -23, 1);
            Component14.aClass45_8589 = Component14.method3571(false, 9, (byte) -23, 1);
            Component110.aClass45_233 = Component14.method3571(false, 10, (byte) -23, 1);
            DisplayModeManagerContainer64.aClass45_9033 = Component14.method3571(false, 11, (byte) -23, 1);
            Component22.aClass45_1743 = Component14.method3571(false, 12, (byte) -23, 1);
            Component323.aClass45_5878 = Component14.method3571(false, 14, (byte) -23, 1);
            Component132.aClass45_1815 = Component14.method3571(false, 15, (byte) -23, 1);
            Component97.aClass45_1538 = Component14.method3571(false, 16, (byte) -23, 1);
            VideoAdDisplay.aClass45_3183 = Component14.method3571(false, 17, (byte) -23, 1);
            Component43.aClass45_4975 = Component14.method3571(false, 18, (byte) -23, 1);
            RadixParser.aClass45_2306 = Component14.method3571(false, 19, (byte) -23, 1);
            CacheNodeSub2.aClass45_10480 = Component14.method3571(false, 20, (byte) -23, 1);
            SeekableFile.aClass45_1322 = Component14.method3571(false, 21, (byte) -23, 1);
            BrowserUrlOpener.aClass45_8926 = Component14.method3571(false, 22, (byte) -23, 1);
            NodeSub32.aClass45_6950 = Component14.method3571(true, 23, (byte) -23, 1);
            Component387.aClass45_1897 = Component14.method3571(false, 24, (byte) -23, 1);
            CommandHandler.aClass45_1434 = Component14.method3571(false, 25, (byte) -23, 1);
            NodeSub11.aClass45_4770 = Component14.method3571(true, 26, (byte) -23, 1);
            Component339.aClass45_3146 = Component14.method3571(false, 27, (byte) -23, 1);
            WaterShaderSub8.aClass45_7362 = Component14.method3571(true, 28, (byte) -23, 1);
            NodeList.aClass45_3323 = Component14.method3571(false, 29, (byte) -23, 1);
            Component380.aClass45_4984 = Component14.method3571(true, 30, (byte) -23, 1);
            Component257.aClass45_4796 = Component14.method3571(true, 31, (byte) -23, 1);
            Component334.aClass45_2015 = Component14.method3571(true, 36, (byte) -23, 2);
        }
        if (LoadingState.aClass56_1031 == RSARequest.currentLoadingState) {
            int i_8_ = 0;
            for (int i_9_ = 0; i_9_ < 37; i_9_++) {
                if (Component354.aClass314_Sub1Array223[i_9_] != null) i_8_ += (Component354.aClass314_Sub1Array223[i_9_].getReferenceTableProgress(i + 28661) * DisplayModeManagerContainer345.anIntArray164[i_9_] / 100);
            }
            if (i_8_ != 100) {
                if (DisplayModeManagerContainer259.anInt3435 < 0) DisplayModeManagerContainer259.anInt3435 = i_8_;
                return ((i_8_ + -DisplayModeManagerContainer259.anInt3435) * 100 / (-DisplayModeManagerContainer259.anInt3435 + 100));
            }
            SpriteAtlasShader.method2159((byte) -109, Component158.aClass45_322);
            HashNodeSub3.method3178(Component65.aClass45_1627, -124, Component364.method184(i ^ ~0x40a46ff3), Component158.aClass45_322);
        }
        if (LoadingState.aClass56_1032 == RSARequest.currentLoadingState) {
            if (Component35.anInt4270 == -1) Component35.anInt4270 = Component54.aClass45_8667.getGroupId("scape main", 0);
            CacheNodeSub1.method3290(56);
            Buffer.setClientState(2, 2);
        }
        if (LoadingState.aClass56_1033 == RSARequest.currentLoadingState) ComponentDownloader.method323(Component380.aClass45_4984, OggUrlStream.aClass297_8992, (byte) 95);
        if (LoadingState.aClass56_1034 == RSARequest.currentLoadingState) {
            int i_10_ = LibraryCreditsText.method1770((byte) -25);
            if (i_10_ < 100) return i_10_;
            ObjectDefinitionProvider.method2013(WaterShaderSub8.aClass45_7362.getSingletonFile((byte) 73, 1), (byte) 112);
            RuntimeException_Sub1.method4012(WaterShaderSub8.aClass45_7362.getSingletonFile((byte) 73, 3), (byte) -111);
        }
        if (i != -28660) return 2;
        if (RSARequest.currentLoadingState == LoadingState.aClass56_1035) {
            if (Sprite.anInt6923 != -1 && !ShaderSub3.aClass45_5207.isFileReady(-10499, Sprite.anInt6923, 0)) return 99;
            DefinitionSub4.modelProvider = new ModelStore(NodeSub11.aClass45_4770, Component14.aClass45_8589, Component158.aClass45_322);
            MatrixSub3.aClass326_5764 = new Component311(PacketReader.currentGameType, ObjectDeserializer.languageId, Component181.aClass45_1541);
            DisplayModeManagerContainer282.aClass261_5558 = new DisplayModeManagerContainer1(PacketReader.currentGameType, ObjectDeserializer.languageId, Component181.aClass45_1541);
            Component339.cursorDefinitions = new CursorDefinitionCache(PacketReader.currentGameType, ObjectDeserializer.languageId, Component181.aClass45_1541, Component158.aClass45_322);
            NodeSub7.aClass33_6653 = new Component373(PacketReader.currentGameType, ObjectDeserializer.languageId, VideoAdDisplay.aClass45_3183);
            Component267.aClass268_2979 = new DisplayModeManagerContainer259(PacketReader.currentGameType, ObjectDeserializer.languageId, Component181.aClass45_1541);
            Component149.aClass183_4460 = new Component191(PacketReader.currentGameType, ObjectDeserializer.languageId, Component181.aClass45_1541);
            DisplayModeManagerContainer306.aClass219_4782 = new Component386(PacketReader.currentGameType, ObjectDeserializer.languageId, Component181.aClass45_1541, Component158.aClass45_322);
            DefinitionSub25.aClass150_9342 = new Component324(PacketReader.currentGameType, ObjectDeserializer.languageId, Component181.aClass45_1541, ShaderSub3.aClass45_5207);
            Component162.aClass271_8378 = new DisplayModeManagerContainer130(PacketReader.currentGameType, ObjectDeserializer.languageId, Component181.aClass45_1541);
            NodeSub1.aClass185_6559 = new Component316(PacketReader.currentGameType, ObjectDeserializer.languageId, Component181.aClass45_1541);
            GradientPreset.aClass263_9195 = new ObjectDefinitionProvider(PacketReader.currentGameType, ObjectDeserializer.languageId, true, Component97.aClass45_1538, ShaderSub3.aClass45_5207);
            DisplayModeManagerContainer64.aClass153_9031 = new Component62(PacketReader.currentGameType, ObjectDeserializer.languageId, Component181.aClass45_1541, Component158.aClass45_322);
            Component245.aClass141_117 = new Component258(PacketReader.currentGameType, ObjectDeserializer.languageId, Component181.aClass45_1541, Component158.aClass45_322);
            Component291.aClass278_2529 = new DisplayModeManagerContainer347(PacketReader.currentGameType, ObjectDeserializer.languageId, true, Component43.aClass45_4975, ShaderSub3.aClass45_5207);
            Exception_Sub1.itemDefinitions = new ItemDefinitionProvider(PacketReader.currentGameType, ObjectDeserializer.languageId, true, MatrixSub3.aClass326_5764, RadixParser.aClass45_2306, ShaderSub3.aClass45_5207);
            DisplayModeManagerContainer64.aClass187_9036 = new Component38(PacketReader.currentGameType, ObjectDeserializer.languageId, Component181.aClass45_1541);
            RunescapeInfo.aClass87_191 = new Component344(PacketReader.currentGameType, ObjectDeserializer.languageId, CacheNodeSub2.aClass45_10480, NodeSub29.aClass45_6909, DisplayModeManagerContainer51.aClass45_2490);
            ComponentDownloader.aClass84_413 = new DisplayModeManagerContainer26(PacketReader.currentGameType, ObjectDeserializer.languageId, Component181.aClass45_1541);
            Component132.aClass25_1813 = new Component361(PacketReader.currentGameType, ObjectDeserializer.languageId, Component181.aClass45_1541);
            NsnDefinition.aClass319_9245 = new Component144(PacketReader.currentGameType, ObjectDeserializer.languageId, SeekableFile.aClass45_1322, ShaderSub3.aClass45_5207);
            Component257.aClass65_4787 = new Component304(PacketReader.currentGameType, ObjectDeserializer.languageId, Component181.aClass45_1541);
            GnpPositionLogger.aClass82_1523 = new CommandHandler(PacketReader.currentGameType, ObjectDeserializer.languageId, Component181.aClass45_1541);
            Component329.aClass259_5995 = new Component293(PacketReader.currentGameType, ObjectDeserializer.languageId, Component181.aClass45_1541);
            Component267.aClass194_2981 = new Component276(PacketReader.currentGameType, ObjectDeserializer.languageId, BrowserUrlOpener.aClass45_8926);
            Component209.aClass217_3453 = new Component46(PacketReader.currentGameType, ObjectDeserializer.languageId, Component181.aClass45_1541);
            Component304.method699(Component65.aClass45_1627, (byte) -100, NodeSub35.aClass45_6980, Component158.aClass45_322, ShaderSub3.aClass45_5207);
            Applet_Sub1.setJagmiscCacheStore(0, NodeList.aClass45_3323);
            Component33.aClass226_2639 = new Component127(ObjectDeserializer.languageId, Component387.aClass45_1897, CommandHandler.aClass45_1434);
            Component31.aClass355_5900 = new Component117(ObjectDeserializer.languageId, Component387.aClass45_1897, CommandHandler.aClass45_1434, new DisplayModeManagerContainer332());
            Component324.method1202(0);
            GradientPreset.aClass263_9195.method2008(i + 28539, Component192.aClass348_Sub51_3959.aClass239_Sub27_7261.method1840(i + -3690) == 0);
            DisplayModeManagerContainer58.aClass170_10209 = new DisplayModeManagerContainer292();
            Definition.method3038(-1);
            RuntimeException_Sub1.method4011(i + 29684, Component339.aClass45_3146);
            NodeSub29.method3004(ShaderSub3.aClass45_5207, false, DefinitionSub4.modelProvider);
            HuffmanDecoder class296 = new HuffmanDecoder(Component110.aClass45_233.getFile("huffman", "", -29832));
            GlToolkitSub3.method3896(class296, (byte) 13);
            try {
                jagmisc.init();
            } catch (Throwable throwable) {
                /* empty */
            }
            NodeSub8.aClass241_6660 = Component267.method1631(false);
            DefinitionSub20.aClass348_Sub4_9264 = new HardwareProbe(true, OggUrlStream.aClass297_8992);
        }
        if (RSARequest.currentLoadingState == LoadingState.aClass56_1037) {
            int i_11_ = (NpcNode.method2958(22388, Component158.aClass45_322) + DisplayModeManagerContainer207.method3405(2012104999, true));
            int i_12_ = (Component383.method2188(-30477) - -HashNodeSub16.method3256(2));
            if (i_11_ < i_12_) return i_11_ * 100 / i_12_;
        }
        if (LoadingState.aClass56_1038 == RSARequest.currentLoadingState)
            DisplayModeManagerContainer229.initWorld(NodeSub32.aClass45_6950, Component267.aClass268_2979, Component149.aClass183_4460, GradientPreset.aClass263_9195, DisplayModeManagerContainer64.aClass153_9031, Component245.aClass141_117, DisplayModeManagerContainer58.aClass170_10209);
        if (LoadingState.aClass56_1039 == RSARequest.currentLoadingState) {
            // TODO make cache edit to extend these or change id's
            DisplayModeManagerContainer123.anIntArray1303 = (new int[Component329.aClass259_5995.anInt3305 + 1000]);
            WaterShaderProgram.aBooleanArray6270 = (new boolean[Component329.aClass259_5995.anInt3305 + 1000]);
            GlFramebufferTexture.aStringArray8532 = new String[GnpPositionLogger.aClass82_1523.anInt1439];
            for (int i_13_ = 0; Component329.aClass259_5995.anInt3305 + 1000 > i_13_; i_13_++) {
                if (Component329.aClass259_5995.method1976(i_13_, i ^ ~0x6fc0).anInt2135 == 0) {
                    WaterShaderProgram.aBooleanArray6270[i_13_] = true;
                    DisplayModeManagerContainer147.anInt4168++;
                }
                DisplayModeManagerContainer123.anIntArray1303[i_13_] = -1;
            }
            Component262.loadPreferences(1);
            DebugPanic.anInt4737 = NodeSub35.aClass45_6980.getGroupId("loginscreen", i ^ ~0x6ff3);
            Component285.anInt970 = NodeSub35.aClass45_6980.getGroupId("lobbyscreen", 0);
            SoftwareFallbackShader.aClass45_7382.clearNameTables(0, true, false);
            Component54.aClass45_8667.clearNameTables(0, true, true);
            Component158.aClass45_322.clearNameTables(i + 28660, true, true);
            Component65.aClass45_1627.clearNameTables(0, true, true);
            Component110.aClass45_233.clearNameTables(0, true, true);
            NodeSub35.aClass45_6980.clearNameTables(0, true, true);
            Component181.aClass45_1541.discardMode = 2;
            Component144.aBoolean3988 = true;
            VideoAdDisplay.aClass45_3183.discardMode = 2;
            Component97.aClass45_1538.discardMode = 2;
            Component43.aClass45_4975.discardMode = 2;
            RadixParser.aClass45_2306.discardMode = 2;
            CacheNodeSub2.aClass45_10480.discardMode = 2;
            SeekableFile.aClass45_1322.discardMode = 2;
        }
        if (RSARequest.currentLoadingState == LoadingState.aClass56_1040) {
            if (!Component233.method2547(DebugPanic.anInt4737, (byte) 84)) return 0;
            boolean bool = true;
            for (int i_14_ = 0; i_14_ < (DefinitionSub33.openInterfaces[DebugPanic.anInt4737]).length; i_14_++) {
                DisplayModeManagerContainer57 class46 = (DefinitionSub33.openInterfaces[DebugPanic.anInt4737][i_14_]);
                if (class46.type == 5 && class46.spriteId != -1 && !Component158.aClass45_322.isFileReady(-10499, (class46.spriteId), 0)) bool = false;
            }
            if (!bool) return 0;
        }
        if (LoadingState.aClass56_1041 == RSARequest.currentLoadingState) CacheNode.method3198(true, (byte) -45);
        if (RSARequest.currentLoadingState == LoadingState.aClass56_1042) {
            ObjectDefinition.aClass311_897.method2319((byte) -56);
            try {
                NodeSub32.aThread6946.join();
            } catch (InterruptedException interruptedexception) {
                return 0;
            }
            Component134.aClass111_5813 = null;
            DefinitionSub17Sub1.aClass45_10426 = null;
            ObjectDefinition.aClass311_897 = null;
            Component280.anInterface16Array2447 = null;
            NodeSub32.aThread6946 = null;
            ShaderProgramSub7.aClass45_6277 = null;
            GlToolkitSub3.method3886(i + 28556);
            DisplayModeManagerContainer64.aBoolean9038 = Component192.aClass348_Sub51_3959.aClass239_Sub11_7265.method1768(-32350) == 1;
            Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub11_7265), 1);
            if (DisplayModeManagerContainer64.aBoolean9038) Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub25_7251), 0);
            else if (Component192.aClass348_Sub51_3959.aClass239_Sub25_7251.aBoolean6113 && DefinitionSub20.aClass348_Sub4_9264.anInt6609 < 512 && DefinitionSub20.aClass348_Sub4_9264.anInt6609 != 0)
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub25_7251), 0);
            DisplayModeManagerContainer389.method243(i ^ ~0x6fd6);
            if (DisplayModeManagerContainer64.aBoolean9038) SoftwareFallbackShader.method3553(false, (byte) 108, 0);
            else SoftwareFallbackShader.method3553(false, (byte) 102, Component192.aClass348_Sub51_3959.aClass239_Sub25_7251.method1829(-32350));
            // Default to fullscreen 800x600 — scales up cleanly on phone/tablet.
            Component192.aClass348_Sub51_3959.applyPreference((byte) 74, Component192.aClass348_Sub51_3959.aClass239_Sub8_7227, 3);
            if (Component192.aClass348_Sub51_3959.aClass239_Sub8_7254 != null) Component192.aClass348_Sub51_3959.applyPreference((byte) 74, Component192.aClass348_Sub51_3959.aClass239_Sub8_7254, 3);
            LogicError.method830(3, 800, (byte) 102, false, 600);
            DisplayModeManagerContainer292.method1311(5139, NodeSub8.toolkit);
            Component27.method3568(NodeSub8.toolkit, i ^ ~0x6ff7);
            ItemDefinitionProvider.method1933(Component158.aClass45_322, NodeSub8.toolkit, true);
            DisplayModeManagerContainer204.method901(Component22.aClass105Array1744, 515880227);
        }
        return DefinitionSub6.method3063(false);
    }

    /** Concatenate {@code i} strings starting at {@code i_15_} (null → {@code "null"}). CS2 string join. */
    static final String concatStrings(boolean bool, int i, String[] strings, int i_15_) {
        try {
            anInt2172++;
            if (i == 0) return "";
            if (i == 1) {
                String string = strings[i_15_];
                if (string == null) return "null";
                return string;
            }
            int i_16_ = i + i_15_;
            int i_17_ = 0;
            for (int i_18_ = i_15_; i_16_ > i_18_; i_18_++) {
                String string = strings[i_18_];
                if (string == null) i_17_ += 4;
                else i_17_ += string.length();
            }
            StringBuffer stringbuffer = new StringBuffer(i_17_);
            for (int i_19_ = i_15_; i_19_ < i_16_; i_19_++) {
                String string = strings[i_19_];
                if (string == null) stringbuffer.append("null");
                else stringbuffer.append(string);
            }
            if (bool != true) clearDefinitionCaches((byte) -20);
            return stringbuffer.toString();
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("pea.C(" + bool + ',' + i + ',' + (strings != null ? "{...}" : "null") + ',' + i_15_ + ')'));
        }
    }
}
