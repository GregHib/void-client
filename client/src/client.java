/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.lang.reflect.Field;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;

public final class client extends Applet_Sub1 {
    static int anInt5170;
    static int anInt5171 = 0;
    static int anInt5172;
    static int anInt5173;
    static int anInt5174;
    static int anInt5175;
    static int[] anIntArray5176;
    static int anInt5177;
    static int anInt5178;
    static int anInt5179;
    static int anInt5180;
    static int anInt5181;
    static int anInt5182;
    static int anInt5183;
    static int anInt5184;
    static NodeList aClass262_5185 = new NodeList();
    static int anInt5186;
    static int anInt5187;
    static int anInt5188;
    /*synthetic*/ static Class aClass5189;
    public static int anInt5190;

    private final void method101(byte i) {
        anInt5179++;
        if (HardwareProbe.aClass248_6601.errorCount > LibraryCreditsText.anInt5959) {
            Component223.aClass161_125.method1259(0);
            DisplayModeManagerContainer196.anInt4235 = (HardwareProbe.aClass248_6601.errorCount * 50 + -50) * 5;
            if (DisplayModeManagerContainer196.anInt4235 > 3000) DisplayModeManagerContainer196.anInt4235 = 3000;
            if (HardwareProbe.aClass248_6601.errorCount >= 2 && HardwareProbe.aClass248_6601.disconnectCode == 6) {
                this.reportGameError(-80, "js5connect_outofdate");
                Component49.clientState = 14;
                return;
            }
            if (HardwareProbe.aClass248_6601.errorCount >= 4 && HardwareProbe.aClass248_6601.disconnectCode == -1) {
                this.reportGameError(81, "js5crc");
                Component49.clientState = 14;
                return;
            }
            if (HardwareProbe.aClass248_6601.errorCount >= 4 && GpsOverlay.method1167(Component49.clientState, (byte) -81)) {
                if (HardwareProbe.aClass248_6601.disconnectCode != 7 && HardwareProbe.aClass248_6601.disconnectCode != 9) {
                    if (HardwareProbe.aClass248_6601.disconnectCode <= 0) this.reportGameError(72, "js5io");
                    else if (Sprite.aString6926 == null) this.reportGameError(-116, "js5connect");
                    else this.reportGameError(113, ("js5proxy_" + Sprite.aString6926.trim()));
                } else this.reportGameError(-93, "js5connect_full");
                Component49.clientState = 14;
                return;
            }
        }
        LibraryCreditsText.anInt5959 = HardwareProbe.aClass248_6601.errorCount;
        if (DisplayModeManagerContainer196.anInt4235 > 0) DisplayModeManagerContainer196.anInt4235--;
        else {
            try {
                if (DisplayModeManagerContainer32.anInt846 == 0) {
                    Shader.aClass144_114 = Component223.aClass161_125.method1262((OggUrlStream.aClass297_8992), (byte) 36);
                    DisplayModeManagerContainer32.anInt846++;
                }
                if (DisplayModeManagerContainer32.anInt846 == 1) {
                    if (Shader.aClass144_114.status == 2) {
                        if (Shader.aClass144_114.result != null) Sprite.aString6926 = (String) Shader.aClass144_114.result;
                        onJs5Failure(1000, (byte) 100);
                        return;
                    }
                    if (Shader.aClass144_114.status == 1) DisplayModeManagerContainer32.anInt846++;
                }
                if (DisplayModeManagerContainer32.anInt846 == 2) {
                    Component321.aClass202_2589 = new Connection((Socket) Shader.aClass144_114.result, OggUrlStream.aClass297_8992, 25000);
                    Buffer class348_sub49 = new Buffer(5);
                    class348_sub49.writeByte(false, (DisplayModeManagerContainer109.aClass29_2341.anInt400));
                    class348_sub49.writeInt((byte) 103, 634);
                    Component321.aClass202_2589.write((class348_sub49.payload), 5, 0, -1);
                    DisplayModeManagerContainer32.anInt846++;
                    CacheStore.aLong667 = Component240.currentTimeMillis(-70);
                }
                if (DisplayModeManagerContainer32.anInt846 == 3) {
                    if (GpsOverlay.method1167(Component49.clientState, (byte) -100) || Component321.aClass202_2589.available((byte) 83) > 0) {
                        int i_0_ = Component321.aClass202_2589.read(0);
                        if (i_0_ != 0) {
                            onJs5Failure(i_0_, (byte) 111);
                            return;
                        }
                        DisplayModeManagerContainer32.anInt846++;
                    } else if (Component240.currentTimeMillis(-63) - CacheStore.aLong667 > 30000) {
                        onJs5Failure(1001, (byte) 85);
                        return;
                    }
                }
                if (DisplayModeManagerContainer32.anInt846 == 4) {
                    boolean bool = (GpsOverlay.method1167(Component49.clientState, (byte) -100) || CacheNode.method3196(Component49.clientState, -87) || CacheFileStore.isReconnectState(Component49.clientState, -127));
                    Component119[] class267s = Component119.method2029(105);
                    Buffer class348_sub49 = new Buffer(class267s.length * 4);
                    Component321.aClass202_2589.readFully(class348_sub49.payload, 0, (byte) -72, (class348_sub49.payload).length);
                    for (int i_1_ = 0; i_1_ < class267s.length; i_1_++)
                        class267s[i_1_].method2030(1, class348_sub49.readInt((byte) -126));
                    HardwareProbe.aClass248_6601.setConnection(false, !bool, Component321.aClass202_2589);
                    DisplayModeManagerContainer32.anInt846 = 0;
                    Shader.aClass144_114 = null;
                    Component321.aClass202_2589 = null;
                }
                int i_2_ = 127 / ((1 - i) / 60);
            } catch (java.io.IOException ioexception) {
                onJs5Failure(1002, (byte) 127);
            }
        }
    }

    /** Bootstrap hosts, client prefs, colour tables, and cache workers for this game type. */
    final void initializeClient(int i) {
        if (DisplayModeManagerContainer254.aBoolean2151) Component127.anInt2964 = 64;
        anInt5177++;
        Frame frame = new Frame("Jagex");
        frame.pack();
        frame.dispose();
        OpenGlShader.method3556(false);
        DisplayModeManagerContainer271.aClass112_520 = new DisplayModeManagerContainer67(OggUrlStream.aClass297_8992);
        HardwareProbe.aClass248_6601 = new Component253();
        MenuEntry.initArrayPools(new int[]{20, 260}, new int[]{1000, 100}, 0);
        if (DisplayModeManagerContainer345.aClass364_165 != Component326.LIVE) Component17.aByteArrayArray3882 = new byte[50][];
        Component192.aClass348_Sub51_3959 = DisplayModeManagerContainer288.method247(24916);
        if (DisplayModeManagerContainer345.aClass364_165 == Component326.LIVE) MenuOpener.aClass161_4839.aString2147 = this.getCodeBase().getHost();
        else if (Component168.method2354(DisplayModeManagerContainer345.aClass364_165, i ^ ~0x7044)) {
            MenuOpener.aClass161_4839.aString2147 = this.getCodeBase().getHost();
            MenuOpener.aClass161_4839.anInt2148 = 40000 - -MenuOpener.aClass161_4839.anInt2143;
            ItemDefinitionProvider.aClass161_3285.anInt2148 = ItemDefinitionProvider.aClass161_3285.anInt2143 + 40000;
            MenuOpener.aClass161_4839.anInt2138 = 50000 - -MenuOpener.aClass161_4839.anInt2143;
            DefinitionSub35.aClass161_9443.anInt2148 = (DefinitionSub35.aClass161_9443.anInt2143 + 40000);
            ItemDefinitionProvider.aClass161_3285.anInt2138 = 50000 - -ItemDefinitionProvider.aClass161_3285.anInt2143;
            DefinitionSub35.aClass161_9443.anInt2138 = (DefinitionSub35.aClass161_9443.anInt2143 + 50000);
        } else if (DisplayModeManagerContainer154.LOCAL == DisplayModeManagerContainer345.aClass364_165) {
            MenuOpener.aClass161_4839.aString2147 = "127.0.0.1";
            ItemDefinitionProvider.aClass161_3285.aString2147 = "127.0.0.1";
            MenuOpener.aClass161_4839.anInt2148 = (40000 + MenuOpener.aClass161_4839.anInt2143);
            DefinitionSub35.aClass161_9443.aString2147 = "127.0.0.1";
            ItemDefinitionProvider.aClass161_3285.anInt2148 = 40000 - -ItemDefinitionProvider.aClass161_3285.anInt2143;
            DefinitionSub35.aClass161_9443.anInt2148 = 40000 - -DefinitionSub35.aClass161_9443.anInt2143;
            MenuOpener.aClass161_4839.anInt2138 = (MenuOpener.aClass161_4839.anInt2143 + 50000);
            ItemDefinitionProvider.aClass161_3285.anInt2138 = ItemDefinitionProvider.aClass161_3285.anInt2143 + 50000;
            DefinitionSub35.aClass161_9443.anInt2138 = 50000 - -DefinitionSub35.aClass161_9443.anInt2143;
        }
        RenderableSub6.aShortArray6428 = Request.aShortArray6889 = HashNodeSub3.aShortArray9502 = Component226.aShortArray4172 = new short[256];
        if (PacketReader.currentGameType == RunescapeInfo.RUNESCAPE) RuntimeException_Sub1.aBoolean4599 = false;
        if (WorldNameText.STELLARDAWN == PacketReader.currentGameType) {
            Component262.shiftClick = true;
            Component257.aShortArrayArray4791 = NodeSub8.aShortArrayArray6664;
            DisplayModeManagerContainer259.anInt3439 = 16777215;
            AbstractShaderSub2.aShortArrayArrayArray7290 = NodeSub51.aShortArrayArrayArray7262;
            DisplayModeManagerContainer259.anInt3444 = 0;
        } else if (PacketReader.currentGameType == Component379.GAME4) {
            Component257.aShortArrayArray4791 = DisplayModeManagerContainer259.aShortArrayArray3443;
            AbstractShaderSub2.aShortArrayArrayArray7290 = DisplayModeManagerContainer58.aShortArrayArrayArray10253;
        } else {
            Component257.aShortArrayArray4791 = DefinitionSub32.aShortArrayArray9424;
            AbstractShaderSub2.aShortArrayArrayArray7290 = NodeSub12.aShortArrayArrayArray6736;
        }
        Component223.aClass161_125 = MenuOpener.aClass161_4839;
        try {
            DefinitionSub27.aClipboard9357 = NpcComposition.aClient1367.getToolkit().getSystemClipboard();
        } catch (Exception exception) {
            /* empty */
        }
        Component280.aClass346_2449 = NodeSub3.method2743(DisplayModeManagerContainer50.gameCanvas, (byte) -124);
        AbstractGlTextureSub4.mouseHandler = NodeSub18.createMouseHandler(DisplayModeManagerContainer50.gameCanvas, 0, true);
        try {
            if (OggUrlStream.aClass297_8992.cacheDat2 != null) {
                DisplayModeManagerContainer356.aClass78_6328 = new SeekableFile((OggUrlStream.aClass297_8992.cacheDat2), 5200, 0);
                for (int i_3_ = 0; i_3_ < 37; i_3_++)
                    Component265.aClass78Array1579[i_3_] = new SeekableFile((OggUrlStream.aClass297_8992.cacheIndexFiles[i_3_]), 6000, 0);
                Component366.aClass78_3075 = new SeekableFile((OggUrlStream.aClass297_8992.cacheIdx255), 6000, 0);
                Component11.aClass137_3568 = new CacheIndexReader(255, DisplayModeManagerContainer356.aClass78_6328, Component366.aClass78_3075, 500000);
                DisplayModeManagerContainer152.aClass78_4538 = new SeekableFile((OggUrlStream.aClass297_8992.randomDat), 24, 0);
                OggUrlStream.aClass297_8992.cacheIdx255 = null;
                OggUrlStream.aClass297_8992.cacheDat2 = null;
                OggUrlStream.aClass297_8992.cacheIndexFiles = null;
                OggUrlStream.aClass297_8992.randomDat = null;
            }
        } catch (java.io.IOException ioexception) {
            DisplayModeManagerContainer356.aClass78_6328 = null;
            Component366.aClass78_3075 = null;
            DisplayModeManagerContainer152.aClass78_4538 = null;
            Component11.aClass137_3568 = null;
        }
        if (DisplayModeManagerContainer345.aClass364_165 != Component326.LIVE) Component10.fpsOverlayEnabled = true;
        HashNodeSub16.aString9665 = FriendsIgnoreList.aClass274_3495.getLocalized(ObjectDeserializer.languageId, 544);
    }

    /** Null static caches during shutdown. */
    final void cleanup(byte i) {
        int i_4_ = anInt5190;
        anInt5181++;
        method110(31);
        Component275.method1497(16384);
        Component92.method1979((byte) 125);
        RSARequest.method3247(-74);
        FriendsIgnoreList.clearStatics(i ^ ~0x1f);
        JaclibLoader.clearStatics(false);
        Component119.method2026(23377);
        Component82.method328(i ^ 0x6c);
        Component386.method1604(11868);
        Component270.method1246(-83);
        HashNode.method3161(0);
        Node.method2713(0);
        HashTable.method1004((byte) 16);
        LruCache.method3478(false);
        Applet_Sub1.clearStatics(i + 32609);
        Component41.method1860((byte) -89);
        BuildType.method1641((byte) 85);
        DisplayModeManagerContainer204.method906(-31777);
        GraphicsToolkit.method3680(-24016);
        NodeSub51.method3430(false);
        HardwareProbe.method2748(-86);
        DisplayModeManagerContainer292.method1310(true);
        NodeList.method1994(-13722);
        Connection.method1471((byte) 124);
        Component253.clearStatics((byte) 119);
        DisplayModeManagerContainer67.clearStatics((byte) -124);
        CacheFileStore.clearStatics(0);
        Component219.clearStatics(i + -108);
        CacheStore.clearStatics((byte) 10);
        SeekableFile.method786((byte) 0);
        NodeCache.method584((byte) 116);
        DisplayModeManagerContainer1.clearStatics(i ^ 0xe);
        CursorDefinitionCache.method1284(-21165);
        DisplayModeManagerContainer259.method2036((byte) 121);
        Component191.method1378(14);
        Component324.method1208(55);
        DisplayModeManagerContainer130.method2045((byte) 62);
        Component316.method1395((byte) 82);
        ObjectDefinitionProvider.method2011((byte) -71);
        Component258.method1179((byte) -124);
        ItemDefinitionProvider.method1931(true);
        Component38.method1407((byte) 124);
        DisplayModeManagerContainer26.method825(i + -204);
        Component361.method305((byte) 79);
        Component144.method2545(true);
        Component304.method698(i + -106);
        CommandHandler.clearStatics((byte) -123);
        Component293.method1975((byte) -15);
        Component276.method1441((byte) 18);
        Component46.method1585(-1);
        Component127.method1624(28962);
        Component117.method3473(12949);
        SocketStream.method1704((byte) -95);
        DisplayModeManagerContainer123.method782(1);
        DisplayModeManagerContainer207.method3414(21515);
        RequestProcessor.method1300((byte) -128);
        Request.method2998((byte) -35);
        CollisionMap.method3508(2);
        Component251.method1698(1);
        HashNodeSub14.method3237((byte) 42);
        Component278.method1917(40960);
        DisplayModeManagerContainer50.method2294(126);
        Component315.method1873((byte) -120);
        DisplayModeManagerContainer57.method442((byte) -84);
        DisplayModeInfo.method530(14);
        Player.method2458(true);
        Component150.method1627((byte) 116);
        Component248.method284((byte) 51);
        Component285.method501(1);
        Buffer.clearStatics(i ^ ~0x6d);
        ParticleSystem.method3323(-44);
        DisplayModeManagerContainer58.clearStatic2(-123);
        Component186.method3487(-65);
        DisplayModeManagerContainer238.method744((byte) 115);
        NodeSub27.method3001(0);
        NodeSub34.method3026(true);
        NodeSub41.method3155(i + -113);
        CacheNode.method3199(i ^ 0x70);
        Component97.method866(-14603);
        ToolkitFactory.clearStatics(-76);
        Renderable.method2374((byte) -125);
        Component268.method810(true);
        Component240.method597((byte) -122);
        DisplayModeManagerContainer145.clearStatics(true);
        Component354.method225((byte) 57);
        Component362.method1040(i + 404);
        Component10.method2251(16711680);
        DisplayModeManagerContainer254.method1261((byte) 108);
        Component314.method2299((byte) -128);
        RuntimeException_Sub1.clearStatics(-3);
        DisplayModeManagerContainer153.method883((byte) 66);
        HashNodeSub16Sub2.method3264((byte) -24);
        Component16.method1325(-128);
        Component101.method1235((byte) 7);
        HashNodeSub17.method3269(true);
        DisplayModeManagerContainer167.method265(false);
        Component280.method1375(5616);
        DisplayModeManagerContainer370.method609((byte) -52);
        Component129.method355(i + 4189);
        DisplayModeManagerContainer56.method1426(25165);
        Component80.method2254(i ^ ~0x39bf);
        Component121.method3613(64);
        ObjectDefinition.method486(-123);
        DisplayModeManagerContainer77.method1096(i ^ 0x11);
        Component245.method171((byte) 72);
        s.method3988(i + -182);
        NpcComposition.method804(-3752);
        ItemDefinition.method1564(104);
        BitmapFont.method2572((byte) 23);
        RandomAccessFileReader.clearStatics((byte) -71);
        HelveticaFont.method1461((byte) 112);
        Component20.method1807((byte) -121);
        Component205.method1773((byte) 120);
        Component98.method1763(-15596);
        Component31.method1746(-15628);
        Component175.method1723((byte) 119);
        Component379.method1758(-16211);
        Component323.method1738(i + 21813);
        DisplayModeManagerContainer341.method1785(i ^ 0x64);
        Component329.method1780(i + -48);
        Component71.method1814((byte) -70);
        DisplayModeManagerContainer199.method1724(-4);
        ColoredText.method1822((byte) 110);
        Component256.method1832(1);
        Component139.method1841(16878);
        Component302.method1799(124);
        DisplayModeManagerContainer295.method1755(i + -107);
        CustomCursorSetting.method1816(1);
        Component66.method1794(63);
        LibraryCreditsText.method1769(100);
        RadixText.method1835(i + -28702);
        Component339.method1715(103);
        Component330.method852(6);
        Component6.method3518(i ^ 0x34);
        Exception_Sub1.method140((byte) -126);
        Shader.method158((byte) -67);
        NodeBase.method3438((byte) 59);
        Component184.method1180((byte) -76);
        Component122.method879(96);
        NodeSub1.method2719(11339);
        Component327.method2412(true);
        RenderableObject.method2389(1);
        BrowserUrlOpener.method2871(-65);
        ImageTagText.method1276(i + -199);
        RunescapeInfo.clearStatics((byte) 119);
        ClientScriptExecutor.shutdown();
        StringCache.clearStatics(true);
        Component224.method2055(1);
        Component179.method2990((byte) 125);
        Component326.method523(119);
        DisplayModeManagerContainer64.method2974(1);
        OggUrlStream.method2968((byte) -116);
        NodeSub16Sub2.method2830(i ^ 0x6c);
        Component126.method3516(124);
        Component279.method255(6725);
        Component120.clearStatics(51);
        LoadingState.getProgress(85);
        Component226.method2657((byte) 124);
        Component110.method261((byte) -120);
        ModelStore.method1880(i + -221);
        HuffmanDecoder.clearStatics(i + -76);
        Component286.method1136((byte) -98);
        KeyStoreLoader.clearStatics(21745);
        DisplayModeManagerContainer332.method318(122);
        Component331.method1047(1);
        Component214.method1254((byte) 62);
        DisplayModeManagerContainer229.clearWorld();
        ResourceLoader.method2317((byte) 79);
        Component281.method2281(1);
        Component211.method1169(false);
        Component218.clearStatics(1);
        AssetCacheLoader.method306(true);
        AudioMixer.method1910(0);
        Component221.method1081((byte) 121);
        Component72.method1137(3);
        DisplayModeManagerContainer196.method2677(i ^ 0x33);
        Component90.method1200(false);
        Component166.method1366((byte) -43);
        DisplayModeManagerContainer154.method772((byte) -113);
        ComponentDownloader.method322(1);
        Component235.method2018(0);
        RenderableSub10.method2527();
        Component241.method1619((byte) 108);
        DisplayModeManagerContainer91.method316((byte) -94);
        ReferenceTable.clearStatics((byte) 63);
        InflaterDecompressor.clearStatics((byte) -97);
        DisplayModeManagerContainer165.method2286(114);
        Component79.method2645(i + -16777324);
        Component37.method2331(true);
        NodeSub21.method2956((byte) 53);
        FontGlyphCache.clearCharsetMap();
        Component325.method722(13569);
        Component357.method1386(true);
        CookieBuilder.clearStatics(0);
        NodeSub36.method3029(126);
        HashNodeSub19.method3278(1);
        Component39.method1298(-1);
        HashNodeSub16.method3252(353);
        DisplayModeManagerContainer32.method445(i ^ 0x6e);
        DisplayModeManagerContainer159.method1543(-4524);
        DisplayModeManagerContainer28.method2395((byte) 50);
        DisplayModeManagerContainer343.method2406(i ^ ~0x12);
        Component269.method2479(i + 19316);
        Component203.method2484(0);
        Component3.method1198(1010);
        r.method3285(88);
        DisplayModeManagerContainer109.method1355(-108);
        DisplayModeManagerContainer365.method731();
        Component30.method1126(32);
        DisplayModeManagerContainer173.method2682(i ^ 0x29);
        DisplayModeManagerContainer133.method1267((byte) 85);
        ObjectDeserializer.clearStatics(-100);
        Component376.method177();
        CursorDefinition.clearStatics((byte) -121);
        Component143.method1349((byte) -121);
        Component63.method3560(-13);
        Component262.clearStatics((byte) 35);
        Component83.method1013((byte) 114);
        NodeSub10.method2785();
        Component135.method3491(1);
        NodeSub14.method2805((byte) 113);
        Component11.method2071(-128);
        Component231.method293((byte) -83);
        Component225.method351(80);
        Component334.method1194(10);
        SceneManager.method1594(-1966608624);
        Component355.method1926(-127);
        Component236.method2549((byte) -85);
        HashNodeSub1.method3165((byte) 44);
        Component113.method1369((byte) 2);
        RadixParser.method1334((byte) -110);
        Component95.method1061(16711680);
        Component17.method2306((byte) -90);
        Component99.method948(false);
        Component337.method2107((byte) 77);
        Component21.method2111((byte) 68);
        Component335.method1195((byte) 127);
        GnpPositionLogger.method857(126);
        Component156.method2191(0);
        Component177.method1236((byte) -110);
        Component33.method1463((byte) 25);
        RenderableSub6.clearStatics((byte) -46);
        DisplayModeManagerContainer104.method2469(true);
        Component9.method2640(true);
        Component181.method869(3);
        DisplayModeManagerContainer363.method2604((byte) -102);
        HashNodeSub10.method3217((byte) 61);
        Component161.method1164((byte) -52);
        Component252.method2407(false);
        Component366.method1673(i ^ ~0x75);
        ShaderLinker.method2492(1);
        Component141.clearStatic4((byte) -83);
        VideoAdDisplay.method1889(255);
        KeyFocusHandler.clearStatics(i + 14537);
        BasicMouseHandler.clearStatics((byte) 48);
        DisplayModeManagerContainer369.method1612((byte) -9);
        DisplayModeManagerContainer260.method2180((byte) -72);
        Component195.method1447(i ^ 0x20);
        RSACipher.method492(i + -216);
        Component76.method3574(i ^ 0x4c47);
        Component15.method1109((byte) -22);
        Component383.method2190(true);
        Component14.method3572(1000000);
        Component118.method2185(2);
        HeapDumpHelper.method1249(true);
        NewsFetcher.method2664(i ^ 0x6f);
        DefinitionGroup.method3187((byte) -52);
        Component208.clearStatics(-3);
        Component291.method1421((byte) -85);
        StringDefinition.method3220((byte) 102);
        if (i != 108) anInt5171 = -60;
        OggStream.method2962(-31055);
        Component52.method1944(1);
        Component103.method2662(4);
        Canvas_Sub1.clearStatics(false);
        Component352.method387(67);
        SocketConnector.clearStatics(1);
        IOException_Sub1.clearStatics(i + -100);
        Component374.method2637(i + -108);
        Component55.method2333(false);
        DisplayModeManagerContainer310.method296((byte) -99);
        Component223.method176(-1);
        Component192.clearStatics(true);
        AbstractBuffer.clearStatics(-124);
        Component187.method1551();
        DisplayModeManagerContainer172.method370(true);
        PacketReader.softDisconnect((byte) 79);
        Component163.method1886(4908);
        ReferenceHolder.clearStatics(-112);
        DefinitionSub8.method3068(i + 13607);
        Component212.clearStatic3((byte) 3);
        Component349.clearStatic(61);
        DisplayModeManagerContainer23.method860((byte) 44);
        Component289.method2490(4);
        NodeSub18.method2936((byte) -25);
        NodeSub35.method3028(-11677);
        NodeSub50.method3418(114);
        Component338.method1030(-24);
        Component69.method2113((byte) 74);
        PlayerState.method3300(0);
        Component198.method1493();
        GpiLogger.method2823(i + -108);
        NpcDefinition.method2930((byte) -87);
        Component202.method808();
        Component116.method1536();
        NodeSub8.method2775((byte) -127);
        AudioLineSub2.clearNativeAudio();
        DebugOverlay.clear(25365);
        OggStreamReader.method2981(false);
        HeapDumper.clearStatics(2767);
        Definition.method3040(true);
        DisplayModeManagerContainer74.method2310((byte) 69);
        Component102.method2202(-17902);
        DisplayModeManagerContainer306.method741((byte) -128);
        Component257.method1159((byte) 112);
        DisplayModeManagerContainer249.method1354((byte) -22);
        Component49.method1853((byte) 48);
        Component296.method1117(105);
        Component162.method1120(1);
        Component2.method193(i + -78);
        Component298.method180(-19960);
        Component27.method3567(i ^ ~0x24);
        Component364.method189((byte) 121);
        VideoAdPlayer.method716(1);
        DisplayModeManagerContainer232.method2023((byte) -78);
        Component305.method190((byte) 32);
        DisplayModeManagerContainer61.method2223(i ^ 0x5);
        DisplayModeManagerContainer5.method728(true);
        Component68.method2621();
        InterfaceRenderer.method2214(0);
        Component59.method1123(-1);
        DisplayModeManagerContainer152.method3611(true);
        HashNodeSub20.method3280(-109);
        RenderableSub9Sub2.method2518(137);
        StaticElementRenderer.method2508(i ^ 0x7f93);
        ClientErrorReporter.clearStatics(30114);
        RenderableSub2.method2495((byte) 113);
        Component300.method2065(31913);
        DisplayModeManagerContainer213.method548(10);
        ImageCacheStore.method2555((byte) 28);
        ImageCache.method1431(0);
        Component140.method3207((byte) -120);
        Component35.method2693(3);
        DefinitionSub15.method3085(0);
        DefinitionSub17.method3091(true);
        NodeSub46.method3318((byte) -80);
        Sprite.method3010(-1316);
        Component297.method453(-2001);
        MatrixSub1.method911(0);
        Component385.method1293(1);
        GlToolkitSub2.method3736((byte) 100);
        Component160.method3468(-1401);
        Component265.method886(16);
        DisplayModeManagerContainer220.method277((byte) 115);
        GlWaterShader.method2765(2048);
        Component237.method1653(i + 1489574628);
        MatrixSub3.method938(47);
        ReliefShader.method1411(true);
        DisplayModeManagerContainer105.method1499(i + -235);
        Component40.method2258((byte) -122);
        DisplayModeManagerContainer282.clearStatic(i + -14);
        Component132.method1091(-9341);
        Component182.method3403(84);
        GlFramebufferTexture.method1962(-1);
        GlToolkitSub3.method3870(113);
        ColoredTextBuilder.method2597(-27327);
        Component342.method719((byte) 72);
        Component209.method2042((byte) -67);
        MatrixSub2.method925(i + -6105);
        Component111.clearStatics(8549);
        Component267.method1632(-11);
        DisplayModeManagerContainer356.method2268(-24054);
        Component75.method1329(4);
        Component333.method2104(88);
        Component387.method1127(5125);
        DisplayModeManagerContainer190.clearString(126);
        DisplayModeManagerContainer88.method725(16384);
        Component22.method1057(true);
        Component158.method288((byte) 119);
        GlExtensionManager.method3968(15);
        Component13.method3450();
        NsnDefinition.method3096(i ^ 0x7ea2);
        DefinitionSub19.method3099((byte) -121);
        DefinitionSub4.method3057((byte) -54);
        DefinitionSub22.method3110(-1633784916);
        DefinitionSub37.method3148(true);
        DefinitionSub38.method3149(104);
        ToolbarRefreshDefinition.method3087(false);
        ImageDefinition.method3066(-1);
        GradientPreset.method3077((byte) -98);
        DefinitionSub26.method3118((byte) 127);
        DefinitionSub36.method3145(0);
        DefinitionSub20.method3104(false);
        DefinitionSub11.method3075(false);
        DefinitionSub5.method3059(-120);
        DefinitionSub2.method3053(4);
        DefinitionSub17Sub1.method3092(-1);
        DefinitionSub6.method3062(true);
        DefinitionSub27.method3121((byte) 104);
        DefinitionSub32.method3133((byte) -109);
        DefinitionSub33.method3138((byte) -115);
        DefinitionSub13.method3080((byte) 111);
        PrimitiveTypeDefinition.method3050(true);
        DefinitionSub24.method3115(-114);
        DefinitionSub23.method3114((byte) -123);
        DefinitionSub39.method3152(255);
        DefinitionSub10.method3074(i ^ 0x6c);
        DefinitionSub25.method3117(109);
        DefinitionSub35.method3144((byte) 119);
        LoggedOutDefinition.method3142(0);
        DefinitionSub9.method3071((byte) 59);
        DefinitionSub21.method3106((byte) 97);
        DefinitionSub28.method3123(i + -108);
        NodeSub25.method2996();
        Component43.method1584((byte) -64);
        ShaderSub3.method167(19612);
        BuildInfo.method208((byte) 0);
        ImageProducerSprite.method3016(65280);
        NodeSub1Sub2.method2731((byte) -23);
        Component53.method221(0);
        Component228.method1645(121);
        Component65.method953((byte) 9);
        BufferCacheSub2.method4000(i ^ 0x216c);
        Component244.method2658(true);
        AbstractGlTextureSub1.method1959(-112);
        NodeSub5.method2762(108);
        ShaderProgram.method2135(0);
        Component178.method815(false);
        ArbShaderProgram.method2142((byte) -126);
        Component151.method1075((byte) 17);
        Component377.method448((byte) -16);
        CacheNodeSub2.method3295(i + -109);
        NodeBaseSub1.method3441(1);
        ShaderSub1.method161(114);
        NodeSub20.method2950(71);
        Component382.method1322((byte) -28);
        NodeSub1Sub1.method2728((byte) 9);
        Component264.method2265(-10794);
        MenuOpener.method1155((byte) -125);
        Component137.method1149(99);
        DisplayModeManagerContainer136.method1154((byte) 11);
        ParticleShader.method2151(-86);
        ShaderProgramSub7.method2166(i ^ 0x18ac);
        AbstractGlTextureSub4.method1973(24885);
        SpriteAtlasShader.method2160(0);
        ShaderProgramSub2.method2147(i ^ ~0x6c);
        CookieManager.method2171(i + -108);
        WaterShaderProgram.method2164(true);
        WaterSurfaceShader.method2156(77);
        Component359.method1866(0);
        NativeLibraryLoader.clearStatics((byte) 54);
        Component246.method1529(true);
        NodeBaseSub2.method3444(i + -198);
        Component45.method3462(-30094);
        NativeLibLoader.method2654(-6896);
        CacheNodeSub1.method3288((byte) 74);
        Component149.method3512(4);
        Component134.method1400(i + -107);
        ShaderSub2.method162((byte) -112);
        BufferCacheSub3.method4006(-43);
        NodeSub3.method2738((byte) 82);
        Component301.method2631(127);
        Component201.method2272(88);
        AbstractShaderSub3.method3539((byte) -32);
        AbstractShaderSub4.method3541((byte) 23);
        WaterShaderSub8.method3550((byte) -122);
        SoftwareFallbackShader.method3554(i + -107);
        Component210.method553(0);
        Component185.method564((byte) -54);
        DisplayModeManagerContainer51.method1396(25);
        Component217.method1907((byte) 49);
        Component19.method242(true);
        DisplayModeManagerContainer194.method237(false);
        WorldNameText.method251((byte) 2);
        OpenGlShader.method3557(true);
        Component321.method1440(-127);
        AbstractShaderSub2.clearStatics(i ^ 0x864c);
        WaterShader.method3552(i ^ 0x3b);
        Component84.method851(i + -107);
        DebugPanic.method2124(0);
        DebugPanicSub2.method2132(-125);
        DisplayModeManagerContainer273.method1133(96);
        ShaderCompilerSub1.method2610(true);
        ShaderCompilerSub1Sub1.method2611(-123);
        ShaderCompilerSub3.method2617((byte) 93);
        ShaderCompilerSub2Sub1.method2614(i ^ 0x4d);
        ShaderCompilerSub2.method2613(-1);
        NodeSub29.method3003(-4587);
        NodeSub32.method3020((byte) -64);
        NodeSub38.method3035(1);
        DisplayModeManagerContainer271.method367(-15833);
        FriendLoginMessage.method2517((byte) 4);
        HashNodeSub18.method3274(true);
        PauseHandler.clearStatics(false);
        NodeSub45.method3314(5);
        ColorTagNode.method2810((byte) 79);
        Component48.method3458(i + 2564);
        InputStream_Sub2.method127((byte) 118);
        OutputStream_Sub2.method139(88);
        Component380.method1112(1);
        Component142.method3488(64);
        HashNodeSub4.method3181((byte) 2);
        NodeSub7.method2773(0);
        NodeSub12.method2798(122);
        MenuEntry.clearStatics(75);
        NodeSub11.method2796((byte) 104);
        Component222.method1525((byte) 4);
        OutputStream_Sub1.method133((byte) -41);
        InputStream_Sub1.method124(i ^ 0x6e);
        Component94.method2117(0);
        ClientSystemInfo.method2993((byte) 50);
        NodederUtil.method2768(3);
        HashNodeSub3.method3176(true);
        DisplayModeManagerContainer322.method2707(false);
        DisplayModeManagerContainer345.method213((byte) -106);
        Component148.method2043(true);
        Component317.method570(105);
        Component353.method1438(-120);
        Component227.method601((byte) -85);
        DisplayModeManagerContainer346.method1209(i + -51);
        Component47.method458(-14487);
        Component230.method471(i ^ ~0x751c);
        DisplayModeManagerContainer368.method469((byte) -62);
        Cp1252Decoder.method460(i ^ 0x6e);
        DisplayModeManagerContainer34.method561(120);
        Component54.method568(true);
        if (Applet_Sub1.aBoolean41) anInt5190 = ++i_4_;
    }

    private final void method102(byte i) {
        if (i != 61) method106();
        anInt5184++;
        boolean bool = HardwareProbe.aClass248_6601.process((byte) 99);
        if (!bool) method101((byte) -112);
    }

    /** Handle JS5 connection failure ({@code js5 fail code=}{@code i}). */
    private final void onJs5Failure(int i, byte i_5_) {
        anInt5182++;
        HardwareProbe.aClass248_6601.errorCount++;
        Shader.aClass144_114 = null;
        HardwareProbe.aClass248_6601.disconnectCode = i;
        if (Loader.debug) {
            System.out.println("js5 fail code=" + i
                    + " attempts=" + HardwareProbe.aClass248_6601.errorCount
                    + " handshake=" + DisplayModeManagerContainer32.anInt846);
        }
        if (i_5_ > 74) {
            DisplayModeManagerContainer32.anInt846 = 0;
            Component321.aClass202_2589 = null;
        }
    }

    /** Close toolkit, sockets, and cache files. */
    final void closeResources(int i) {
        if (Component357.aBoolean2469) DisplayModeManagerContainer343.saveClientPreferences(i + -110);
        anInt5170++;
        Component350.method556(false);
        if (NodeSub8.toolkit != null) NodeSub8.toolkit.method3635((byte) 89);
        if (Component225.aFrame476 != null) {
            LoadingState.startLoadingTask(Component225.aFrame476, OggUrlStream.aClass297_8992, false);
            Component225.aFrame476 = null;
        }
        if (DefinitionSub8.aClass238_9165 != null) {
            DefinitionSub8.aClass238_9165.close((byte) 36);
            DefinitionSub8.aClass238_9165 = null;
        }
        DisplayModeManagerContainer133.method1265(16);
        HardwareProbe.aClass248_6601.closeConnection(i ^ ~0x44);
        DisplayModeManagerContainer271.aClass112_520.shutdown(true);
        if (DisplayModeManagerContainer154.aClass169_1286 != null) {
            DisplayModeManagerContainer154.aClass169_1286.method1303((byte) 16);
            DisplayModeManagerContainer154.aClass169_1286 = null;
        }
        try {
            DisplayModeManagerContainer356.aClass78_6328.close((byte) -62);
            for (int i_6_ = i; i_6_ < 37; i_6_++)
                Component265.aClass78Array1579[i_6_].close((byte) 118);
            Component366.aClass78_3075.close((byte) -84);
            DisplayModeManagerContainer152.aClass78_4538.close((byte) 80);
            NodeSub46.closeConsoleLogStream((byte) -53);
        } catch (Exception exception) {
            /* empty */
        }
    }

    static final void method104(int i) {
        int i_7_ = ShaderCompilerSub1.anInt6513;
        int[] is = ShaderProgramSub7.anIntArray6290;
        int i_8_ = BasicMouseHandler.aBoolean7444 ? i_7_ : i_7_ + Component324.anInt2057;
        for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
            DisplayModeManagerContainer58 class318_sub1_sub3_sub3;
            if (i_9_ < i_7_) class318_sub1_sub3_sub3 = (InterfaceRenderer.players[is[i_9_]]);
            else class318_sub1_sub3_sub3 = (((NpcNode) Component21.aClass356_3654.get(DisplayModeManagerContainer238.anIntArray1233[i_9_ - i_7_], -6008)).npc);
            if (class318_sub1_sub3_sub3.plane == i) {
                class318_sub1_sub3_sub3.anInt10261 = 0;
                if ((class318_sub1_sub3_sub3.anInt10285) < 0) class318_sub1_sub3_sub3.aBoolean10309 = false;
                else {
                    int i_10_ = class318_sub1_sub3_sub3.getSize((byte) 71);
                    if ((i_10_ & 0x1) == 0) {
                        if (((class318_sub1_sub3_sub3.x) & 0x1ff) != 0 || ((class318_sub1_sub3_sub3.y) & 0x1ff) != 0) {
                            class318_sub1_sub3_sub3.aBoolean10309 = false;
                            continue;
                        }
                    } else if (((class318_sub1_sub3_sub3.x) & 0x1ff) != 256 || ((class318_sub1_sub3_sub3.y) & 0x1ff) != 256) {
                        class318_sub1_sub3_sub3.aBoolean10309 = false;
                        continue;
                    }
                    if (i_10_ == 1) {
                        int i_11_ = ((class318_sub1_sub3_sub3.x) >> 9);
                        int i_12_ = ((class318_sub1_sub3_sub3.y) >> 9);
                        if (class318_sub1_sub3_sub3.anInt10285 != (HashNodeSub17.anIntArrayArray9678[i_11_][i_12_])) {
                            class318_sub1_sub3_sub3.aBoolean10309 = true;
                            continue;
                        }
                        if (DisplayModeManagerContainer295.anIntArrayArray5921[i_11_][i_12_] > 1) {
                            DisplayModeManagerContainer295.anIntArrayArray5921[i_11_][i_12_]--;
                            class318_sub1_sub3_sub3.aBoolean10309 = true;
                            continue;
                        }
                    } else {
                        int i_13_ = (i_10_ - 1) * 256 + 252;
                        int i_14_ = ((class318_sub1_sub3_sub3.x) - i_13_ >> 9);
                        int i_15_ = ((class318_sub1_sub3_sub3.y) - i_13_ >> 9);
                        int i_16_ = ((class318_sub1_sub3_sub3.x) + i_13_ >> 9);
                        int i_17_ = ((class318_sub1_sub3_sub3.y) + i_13_ >> 9);
                        if (!Component99.method949(i_15_, i_16_, (class318_sub1_sub3_sub3.anInt10285), (byte) 124, i_14_, i_17_)) {
                            for (int i_18_ = i_14_; i_18_ <= i_16_; i_18_++) {
                                for (int i_19_ = i_15_; i_19_ <= i_17_; i_19_++) {
                                    if (class318_sub1_sub3_sub3.anInt10285 == (HashNodeSub17.anIntArrayArray9678[i_18_][i_19_])) DisplayModeManagerContainer295.anIntArrayArray5921[i_18_][i_19_]--;
                                }
                            }
                            class318_sub1_sub3_sub3.aBoolean10309 = true;
                            continue;
                        }
                    }
                    class318_sub1_sub3_sub3.aBoolean10309 = false;
                    class318_sub1_sub3_sub3.anInt6382 = Component300.method2064((class318_sub1_sub3_sub3.x), (class318_sub1_sub3_sub3.plane), 11219, (class318_sub1_sub3_sub3.y));
                    Component84.method850(class318_sub1_sub3_sub3, true);
                }
            }
        }
    }

    /**
     * Settings / click-mask for {@code class46}: IF-packet override keyed by
     * {@code (packedId << 32) | childIndex}, else {@link DisplayModeManagerContainer57#settings}.
     */
    static final ComponentSettings getComponentSettings(DisplayModeManagerContainer57 class46) {
        ComponentSettings class348_sub44 = (ComponentSettings) (Component127.aClass356_2959.get((((long) class46.packedId << 32) + (long) class46.childIndex), -6008));
        if (class348_sub44 != null) return class348_sub44;
        return class46.settings;
    }

    static final void method106() {
        CacheStore.anInt669 = 0;
        for (int i = 0; i < Component324.anInt2057; i++) {
            Npc npc = (((NpcNode) Component21.aClass356_3654.get(DisplayModeManagerContainer238.anIntArray1233[i], -6008)).npc);
            if ((npc.aBoolean10309) && npc.method2425(-1) != -1) {
                int i_20_ = ((npc.getSize((byte) 119) - 1) * 256 + 252);
                int i_21_ = (npc.x - i_20_) >> 9;
                int i_22_ = (npc.y - i_20_) >> 9;
                DisplayModeManagerContainer58 class318_sub1_sub3_sub3 = DisplayModeManagerContainer26.method817(252, i_21_, (npc.plane), i_22_);
                if (class318_sub1_sub3_sub3 != null) {
                    int i_23_ = (class318_sub1_sub3_sub3.anInt10290);
                    if (class318_sub1_sub3_sub3 instanceof Npc) i_23_ += 2048;
                    if ((class318_sub1_sub3_sub3.anInt10261) == 0 && class318_sub1_sub3_sub3.method2425(-1) != -1) {
                        AbstractGlTextureSub4.anIntArray8557[CacheStore.anInt669] = i_23_;
                        DisplayModeManagerContainer259.anIntArray3432[CacheStore.anInt669] = i_23_;
                        CacheStore.anInt669++;
                        class318_sub1_sub3_sub3.anInt10261++;
                    }
                    AbstractGlTextureSub4.anIntArray8557[CacheStore.anInt669] = i_23_;
                    DisplayModeManagerContainer259.anIntArray3432[CacheStore.anInt669] = npc.anInt10290 + 2048;
                    CacheStore.anInt669++;
                    class318_sub1_sub3_sub3.anInt10261++;
                }
            }
        }
        Component225.method347(DisplayModeManagerContainer259.anIntArray3432, AbstractGlTextureSub4.anIntArray8557, 0, -22222, CacheStore.anInt669 - 1);
    }

    public static final void main(String[] strings) {
        try {
            try {
                if (strings.length != 6) JagTheoraDecoder.method518("Argument count", (byte) 44);
                MenuOpener.aClass161_4839 = new DisplayModeManagerContainer254();
                MenuOpener.aClass161_4839.anInt2143 = Integer.parseInt(strings[0]);
                ItemDefinitionProvider.aClass161_3285 = new DisplayModeManagerContainer254();
                ItemDefinitionProvider.aClass161_3285.anInt2143 = Integer.parseInt(strings[1]);
                DefinitionSub35.aClass161_9443 = new DisplayModeManagerContainer254();
                DefinitionSub35.aClass161_9443.anInt2143 = Integer.parseInt(strings[2]);
                DisplayModeManagerContainer345.aClass364_165 = DisplayModeManagerContainer154.LOCAL;
                if (strings[3].equals("live")) Component53.currentBuildType = Component342.LIVE;
                else if (!strings[3].equals("rc")) {
                    if (strings[3].equals("wip")) Component53.currentBuildType = Component118.WIP;
                    else JagTheoraDecoder.method518("modewhat", (byte) 41);
                } else Component53.currentBuildType = DefinitionSub20.RC;
                ObjectDeserializer.languageId = DisplayModeManagerContainer91.languageIdFromName((byte) 103, strings[4]);
                if (ObjectDeserializer.languageId == -1) {
                    if (!strings[4].equals("english")) {
                        if (strings[4].equals("german")) ObjectDeserializer.languageId = 1;
                        else JagTheoraDecoder.method518("language", (byte) -128);
                    } else ObjectDeserializer.languageId = 0;
                }
                NodeSub37.aBoolean6997 = false;
                Component156.aBoolean3697 = false;
                if (!strings[5].equals("game0")) {
                    if (!strings[5].equals("game1")) {
                        if (!strings[5].equals("game2")) {
                            if (!strings[5].equals("game3")) JagTheoraDecoder.method518("game", (byte) -124);
                            else PacketReader.currentGameType = Component379.GAME4;
                        } else PacketReader.currentGameType = WaterShaderProgram.GAME3;
                    } else PacketReader.currentGameType = WorldNameText.STELLARDAWN;
                } else PacketReader.currentGameType = RunescapeInfo.RUNESCAPE;
                DisplayModeManagerContainer254.aBoolean2151 = false;
                Component205.settingsCookie = "";
                ModelStore.aLong4615 = 0L;
                OggStreamReader.aString9043 = null;
                Connection.affiliateId = 0;
                DisplayModeManagerContainer105.aBoolean4888 = Component177.aBoolean2110 = true;
                Component121.aBoolean4540 = false;
                Component111.anInt3234 = 0;
                CursorDefinition.anInt2884 = (PacketReader.currentGameType.id);
                GraphicsToolkit.anInt4583 = 0;
                Component19.aString8605 = null;
                client var_client = new client();
                NpcComposition.aClient1367 = var_client;
                var_client.startFromFrame(Component53.currentBuildType.getId(0) + 32, 1024, false, 634, 37, (PacketReader.currentGameType.domain), 23499, 768);
                RSACipher.aFrame4904.setLocation(40, 40);
            } catch (Exception exception) {
                ClientErrorReporter.reportError(null, exception, 15004);
            }
            anInt5178++;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, "client.main(" + (strings != null ? "{...}" : "null") + ')');
        }
    }

    /** Logic tick: call {@code processGameTick}, optionally catching toolkit-safe-mode failures. */
    final void pulseGame(byte i) {
        if (i != 93) anIntArray5176 = null;
        anInt5183++;
        if (Component192.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350) == 2) {
            try {
                processGameTick(i ^ 0x66);
            } catch (Throwable throwable) {
                ClientErrorReporter.reportError((throwable.getMessage() + " (Recovered) " + method81((byte) 115)), throwable, 15004);
                GpsOverlay.aBoolean1952 = true;
                SoftwareFallbackShader.method3553(false, (byte) 102, 0);
            }
        } else processGameTick(123);
        DialogueTts.pulse();
    }

    public final void init() {
        anInt5180++;
        if (this.validateHost(48)) {
            MenuOpener.aClass161_4839 = new DisplayModeManagerContainer254();
            MenuOpener.aClass161_4839.anInt2143 = Integer.parseInt(this.getParameter("worldid"));
            ItemDefinitionProvider.aClass161_3285 = new DisplayModeManagerContainer254();
            ItemDefinitionProvider.aClass161_3285.anInt2143 = Integer.parseInt(this.getParameter("lobbyid"));
            ItemDefinitionProvider.aClass161_3285.aString2147 = this.getParameter("lobbyaddress");
            DefinitionSub35.aClass161_9443 = new DisplayModeManagerContainer254();
            DefinitionSub35.aClass161_9443.anInt2143 = Integer.parseInt(this.getParameter("demoid"));
            DefinitionSub35.aClass161_9443.aString2147 = this.getParameter("demoaddress");
            DisplayModeManagerContainer345.aClass364_165 = (NodeSub8.method2776((byte) -93, Integer.parseInt(this.getParameter("modewhere"))));
            if (DisplayModeManagerContainer154.LOCAL == DisplayModeManagerContainer345.aClass364_165) {
                DisplayModeManagerContainer345.aClass364_165 = Component83.WTWIP;
            }
            else if (!Component168.method2354(DisplayModeManagerContainer345.aClass364_165, -1) && Component326.LIVE != DisplayModeManagerContainer345.aClass364_165) {
                DisplayModeManagerContainer345.aClass364_165 = Component326.LIVE;
            }
            Component53.currentBuildType = (DisplayModeManagerContainer87.getById(-121, Integer.parseInt(this.getParameter("modewhat"))));
            if (Component53.currentBuildType != Component118.WIP && Component53.currentBuildType != DefinitionSub20.RC && Component342.LIVE != Component53.currentBuildType) Component53.currentBuildType = Component342.LIVE;
            try {
                ObjectDeserializer.languageId = Integer.parseInt(this.getParameter("lang"));
            } catch (Exception exception) {
                ObjectDeserializer.languageId = 0;
            }
            String string = this.getParameter("objecttag");
            NodeSub37.aBoolean6997 = string != null && string.equals("1");
            String string_24_ = this.getParameter("js");
            Component156.aBoolean3697 = string_24_ != null && string_24_.equals("1");
            String string_25_ = this.getParameter("advert");
            Component203.aBoolean8773 = string_25_ != null && string_25_.equals("1");
            String string_26_ = this.getParameter("game");
            if (string_26_ != null) {
                if (string_26_.equals("0")) PacketReader.currentGameType = RunescapeInfo.RUNESCAPE;
                else if (string_26_.equals("1")) PacketReader.currentGameType = WorldNameText.STELLARDAWN;
                else if (!string_26_.equals("2")) {
                    if (string_26_.equals("3")) PacketReader.currentGameType = Component379.GAME4;
                } else PacketReader.currentGameType = WaterShaderProgram.GAME3;
            }
            try {
                Connection.affiliateId = Integer.parseInt(this.getParameter("affid"));
            } catch (Exception exception) {
                Connection.affiliateId = 0;
            }
            Component262.quitUrl = this.getParameter("quiturl");
            Component205.settingsCookie = this.getParameter("settings");
            if (Component205.settingsCookie == null) Component205.settingsCookie = "";
            Component301.aBoolean4127 = "1".equals(this.getParameter("under"));
            String string_27_ = this.getParameter("country");
            if (string_27_ != null) {
                try {
                    GraphicsToolkit.anInt4583 = Integer.parseInt(string_27_);
                } catch (Exception exception) {
                    GraphicsToolkit.anInt4583 = 0;
                }
            }
            CursorDefinition.anInt2884 = Integer.parseInt(this.getParameter("colourid"));
            if (CursorDefinition.anInt2884 < 0 || Component137.aColorArray1928.length <= CursorDefinition.anInt2884) CursorDefinition.anInt2884 = 0;
            if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) DisplayModeManagerContainer105.aBoolean4888 = Component177.aBoolean2110 = true;
            String string_28_ = this.getParameter("frombilling");
            if (string_28_ != null && string_28_.equals("true")) Component121.aBoolean4540 = true;
            OggStreamReader.aString9043 = this.getParameter("sskey");
            if (OggStreamReader.aString9043 != null && OggStreamReader.aString9043.length() < 2) OggStreamReader.aString9043 = null;
            String string_29_ = this.getParameter("force64mb");
            if (string_29_ != null && string_29_.equals("true")) DisplayModeManagerContainer254.aBoolean2151 = true;
            String string_30_ = this.getParameter("worldflags");
            if (string_30_ != null) {
                try {
                    Component111.anInt3234 = Integer.parseInt(string_30_);
                } catch (Exception exception) {
                    /* empty */
                }
            }
            String string_31_ = this.getParameter("userFlow");
            if (string_31_ != null) {
                try {
                    ModelStore.aLong4615 = Long.parseLong(string_31_);
                } catch (NumberFormatException numberformatexception) {
                    /* empty */
                }
            }
            Component19.aString8605 = this.getParameter("additionalInfo");
            if (Component19.aString8605 != null && Component19.aString8605.length() > 50) Component19.aString8605 = null;
            if (RunescapeInfo.RUNESCAPE == PacketReader.currentGameType) {
                GlToolkitSub2.canvasHeight = 503;
                DisplayModeManagerContainer23.canvasWidth = 765;
            } else if (PacketReader.currentGameType == WorldNameText.STELLARDAWN) {
                DisplayModeManagerContainer23.canvasWidth = 640;
                GlToolkitSub2.canvasHeight = 480;
            }
            NpcComposition.aClient1367 = this;
            this.startFromApplet(DisplayModeManagerContainer23.canvasWidth, 634, GlToolkitSub2.canvasHeight, Component53.currentBuildType.getId(0) + 32, 37, PacketReader.currentGameType.domain, 50);
        }
    }

    static final void method107(DisplayModeManagerContainer57[] class46s, int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_) {
        for (int i_42_ = 0; i_42_ < class46s.length; i_42_++) {
            DisplayModeManagerContainer57 class46 = class46s[i_42_];
            if (class46 != null && class46.parentId == i) {
                int i_43_ = class46.absoluteX + i_36_;
                int i_44_ = class46.absoluteY + i_37_;
                int rawY = i_44_;
                i_44_ -= MobileKeyboard.liftPx(class46, i_43_, i_44_);
                i_44_ -= MobileKeyboard.loginHitShift(class46);
                int i_45_;
                int i_46_;
                int i_47_;
                int i_48_;
                if (class46.type == 2) {
                    i_45_ = i_32_;
                    i_46_ = i_33_;
                    i_47_ = i_34_;
                    i_48_ = i_35_;
                } else {
                    int i_49_ = i_43_ + class46.width;
                    int i_50_ = i_44_ + class46.height;
                    if (class46.type == 9) {
                        i_49_++;
                        i_50_++;
                    }
                    i_45_ = Math.max(i_43_, i_32_);
                    i_46_ = Math.max(i_44_, i_33_);
                    i_47_ = Math.min(i_49_, i_34_);
                    i_48_ = Math.min(i_50_, i_35_);
                }
                if (class46.type != 0 && !class46.aBoolean682 && getComponentSettings(class46).optionFlags == 0 && class46 != Component374.aClass46_4130 && class46.contentType != Component200.anInt3717 && (class46.contentType != ParticleSystem.anInt7125)) {
                    if (i_45_ < i_47_ && i_46_ < i_48_) DisplayModeManagerContainer220.method273(class46, -2835);
                } else if (!method111(class46)) {
                    int i_51_ = 0;
                    int i_52_ = 0;
                    if (Component210.gameCanvasAttached) {
                        i_51_ = BufferCacheSub3.method4008((byte) -128);
                        i_52_ = Component110.method260(false);
                    }
                    if (class46 == Component156.aClass46_3701 && Exception_Sub1.method141(Component156.aClass46_3701, (byte) 125) != null) {
                        Cp1252Decoder.aBoolean5221 = true;
                        GlToolkitSub3.anInt8001 = i_43_;
                        DefinitionSub13.anInt9203 = i_44_;
                    }
                    if (class46.aBoolean676 || i_45_ < i_47_ && i_46_ < i_48_) {
                        if (class46.aBoolean776 && i_40_ >= i_45_ && i_41_ >= i_46_ && i_40_ < i_47_ && i_41_ < i_48_) {
                            for (NodeSub36 class348_sub36 = (NodeSub36) NodeSub1Sub2.aClass262_8810.first(4); class348_sub36 != null; class348_sub36 = ((NodeSub36) NodeSub1Sub2.aClass262_8810.next((byte) 71))) {
                                if (class348_sub36.aBoolean6993) {
                                    class348_sub36.unlink((byte) 65);
                                    class348_sub36.aClass46_6989.aBoolean737 = false;
                                }
                            }
                            if (RenderableObject.anInt6392 == 0) {
                                Component156.aClass46_3701 = null;
                                Component374.aClass46_4130 = null;
                            }
                            HashNode.anInt7059 = 0;
                            Component163.aBoolean3174 = false;
                            DisplayModeManagerContainer87.aBoolean3103 = false;
                            if (!Component364.aBoolean8335) DisplayModeManagerContainer190.resetNodeStates((byte) 111);
                        }
                        boolean bool;
                        bool = (AbstractGlTextureSub4.mouseHandler.getCursorX(true) + i_51_) >= i_45_ && AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 89) + i_52_ >= i_46_ && (AbstractGlTextureSub4.mouseHandler.getCursorX(true) + i_51_) < i_47_ && AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 74) + i_52_ < i_48_;
                        if (!r.aBoolean9722 && bool) {
                            if (class46.anInt719 >= 0) Component149.widgetCursorId = class46.anInt719;
                            else if (class46.aBoolean776) Component149.widgetCursorId = -1;
                        }
                        if (class46.aBoolean737 && (i == 48889856 || i == 35913731)) {
                            Component233.overGameScreen = true;
                        }
                        if (!Component364.aBoolean8335 && i_40_ >= i_45_ && i_41_ >= i_46_ && i_40_ < i_47_ && i_41_ < i_48_) Component66.buildComponentMenu(i_41_ - i_44_, i_40_ - i_43_, class46, (byte) -95);
                        boolean bool_53_ = false;
                        if (AbstractGlTextureSub4.mouseHandler.isLeftButtonDown(-91) && bool) bool_53_ = true;
                        boolean bool_54_ = false;
                        NodeSub45 class348_sub45 = ((NodeSub45) Component327.aClass262_8744.first(4));
                        if (class348_sub45 != null && class348_sub45.getEventType(109) == 0 && (class348_sub45.getX((byte) -128) + i_51_ >= i_45_) && class348_sub45.getY(33) + i_52_ >= i_46_ && (class348_sub45.getX((byte) -127) + i_51_ < i_47_) && class348_sub45.getY(8) + i_52_ < i_48_)
                            bool_54_ = true;
                        if (class46.aByteArray746 != null && !HashNodeSub16Sub2.isDevConsoleOpen(true)) {
                            for (int i_55_ = 0; (i_55_ < class46.aByteArray746.length); i_55_++) {
                                if (!Component280.aClass346_2449.isKeyDown(class46.aByteArray746[i_55_], -122)) {
                                    if (class46.anIntArray801 != null) class46.anIntArray801[i_55_] = 0;
                                } else if ((class46.anIntArray801 == null) || (OpenGlShader.clientCycle >= (class46.anIntArray801[i_55_]))) {
                                    byte i_56_ = (class46.aByteArray832[i_55_]);
                                    if (i_56_ == 0 || (((i_56_ & 0x8) == 0 || (!Component280.aClass346_2449.isKeyDown(86, -124) && !Component280.aClass346_2449.isKeyDown(82, -123) && !(Component280.aClass346_2449.isKeyDown(81, -122)))) && ((i_56_ & 0x2) == 0 || Component280.aClass346_2449.isKeyDown(86, -127)) && ((i_56_ & 0x1) == 0 || Component280.aClass346_2449.isKeyDown(82, -124)) && ((i_56_ & 0x4) == 0 || (Component280.aClass346_2449.isKeyDown(81, -126))))) {
                                        if (i_55_ < 10) SceneNode.method2780(-1, "", (byte) 122, i_55_ + 1, class46.packedId);
                                        else if (i_55_ == 10) {
                                            DisplayModeManagerContainer196.method2678(-2049);
                                            ComponentSettings class348_sub44 = getComponentSettings(class46);
                                            NewsFetcher.method2666(class348_sub44.anInt7093, class348_sub44.getClickMask(110), class46, (byte) 21);
                                            DisplayModeManagerContainer332.aString5001 = DisplayModeManagerContainer295.getUseOption(0, class46);
                                            if (DisplayModeManagerContainer332.aString5001 == null) DisplayModeManagerContainer332.aString5001 = "Null";
                                            DisplayModeManagerContainer332.aString5000 = ((class46.text) + "<col=ffffff>");
                                        }
                                        int i_57_ = (class46.anIntArray707[i_55_]);
                                        if (class46.anIntArray801 == null) class46.anIntArray801 = (new int
                                                [(class46.aByteArray746).length]);
                                        if (i_57_ != 0) class46.anIntArray801[i_55_] = (OpenGlShader.clientCycle + i_57_);
                                        else class46.anIntArray801[i_55_] = 2147483647;
                                    }
                                }
                            }
                        }
                        if (bool_54_) Component265.method887(class46, (i_51_ + class348_sub45.getX((byte) -127) - i_43_), (i_52_ + class348_sub45.getY(-114) - i_44_), 2147483647);
                        if (Component156.aClass46_3701 != null && Component156.aClass46_3701 != class46 && bool && getComponentSettings(class46).hasHoverHighlight(17356)) DisplayModeManagerContainer104.aClass46_10336 = class46;
                        if (class46 == Component374.aClass46_4130) {
                            Component162.aBoolean8386 = true;
                            DefinitionSub37.anInt9461 = i_43_;
                            DisplayModeManagerContainer172.anInt558 = i_44_;
                        }
                        if (class46.aBoolean682 || class46.contentType != 0) {
                            if (bool && Component122.mouseWheelDelta != 0 && (class46.anObjectArray803 != null)) {
                                NodeSub36 class348_sub36 = new NodeSub36();
                                class348_sub36.aBoolean6993 = true;
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anInt6995 = Component122.mouseWheelDelta;
                                class348_sub36.anObjectArray6987 = class46.anObjectArray803;
                                NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                                Component233.overGameScreen = false;
                            }
                            if (Component156.aClass46_3701 != null || Component364.aBoolean8335 || ((class46.contentType != NodeSub45.anInt7102) && HashNode.anInt7059 > 0)) {
                                bool_54_ = false;
                                bool_53_ = false;
                                bool = false;
                            }
                            if (class46.contentType != 0) {
                                if ((class46.contentType == Component98.anInt5943) || (class46.contentType == Component37.anInt3932)) {
                                    NodeSub1.aClass46_6561 = class46;
                                    if (Component293.aClass305_3304 != null) Component293.aClass305_3304.method2292(123, NodeSub8.toolkit, class46.height);
                                    if (class46.contentType == Component98.anInt5943) {
                                        if (!Component364.aBoolean8335 && i_40_ >= i_45_ && i_41_ >= i_46_ && i_40_ < i_47_ && i_41_ < i_48_) {
                                            ColoredText.method1823(NodeSub8.toolkit, i_38_, i_39_, (byte) -50);
                                            for (RenderableSub6 class318_sub6 = ((RenderableSub6) InputStream_Sub2.aClass243_83.method1872(8)); class318_sub6 != null; class318_sub6 = ((RenderableSub6) (InputStream_Sub2.aClass243_83.method1878((byte) -67)))) {
                                                if (i_40_ >= (class318_sub6.anInt6429) && (i_40_ < (class318_sub6.anInt6426)) && (i_41_ >= (class318_sub6.anInt6427)) && (i_41_ < (class318_sub6.anInt6425))) {
                                                    DisplayModeManagerContainer190.resetNodeStates((byte) 107);
                                                    Component266.method1777(-3, (class318_sub6.aClass318_Sub1_Sub3_Sub3_6431));
                                                }
                                            }
                                        }
                                        continue;
                                    }
                                }
                                if (class46.contentType == Component200.anInt3717) {
                                    if (class46.method425((NodeSub8.toolkit), (byte) 3) != null && (Component293.anInt3306 == 0 || Component293.anInt3306 == 3) && !Component364.aBoolean8335 && i_40_ >= i_45_ && i_41_ >= i_46_ && i_40_ < i_47_ && i_41_ < i_48_) {
                                        int i_58_ = i_40_ - i_43_;
                                        int i_59_ = i_41_ - i_44_;
                                        int i_60_ = (class46.anIntArray677[i_59_]);
                                        if (i_58_ >= i_60_ && (i_58_ <= i_60_ + (class46.anIntArray772[i_59_]))) {
                                            i_58_ -= (class46.width) / 2;
                                            i_59_ -= (class46.height) / 2;
                                            int i_61_;
                                            if (DefinitionSub21.cameraMode == 4) i_61_ = ((int) (Component112.cameraYaw) & 0x3fff);
                                            else i_61_ = (((int) (Component112.cameraYaw) + CacheNodeSub2.anInt10483) & 0x3fff);
                                            int i_62_ = (DisplayModeManagerContainer88.anIntArray1207[i_61_]);
                                            int i_63_ = (DisplayModeManagerContainer88.anIntArray1204[i_61_]);
                                            if (DefinitionSub21.cameraMode != 4) {
                                                i_62_ = (i_62_ * ((Component182.anInt9750) + 256)) >> 8;
                                                i_63_ = (i_63_ * ((Component182.anInt9750) + 256)) >> 8;
                                            }
                                            int i_64_ = ((i_59_ * i_62_ + i_58_ * i_63_) >> 14);
                                            int i_65_ = ((i_59_ * i_63_ - i_58_ * i_62_) >> 14);
                                            int i_66_;
                                            int i_67_;
                                            if (DefinitionSub21.cameraMode == 4) {
                                                i_66_ = (NodederUtil.anInt6633 >> 9) + (i_64_ >> 2);
                                                i_67_ = (NodeSub7.anInt6652 >> 9) - (i_65_ >> 2);
                                            } else {
                                                int i_68_ = ((Component72.localPlayer.getSize((byte) 51)) - 1) * 256;
                                                i_66_ = ((Component72.localPlayer.x) - i_68_ >> 9) + (i_64_ >> 2);
                                                i_67_ = ((Component72.localPlayer.y) - i_68_ >> 9) - (i_65_ >> 2);
                                            }
                                            if (r.aBoolean9722 && ((PauseTimer.anInt500 & 0x40) != 0)) {
                                                DisplayModeManagerContainer57 class46_69_ = (NpcNode.getChildComponent(JaclibLoader.anInt169, (byte) -54, Component90.anInt2046));
                                                if (class46_69_ != null) DisplayModeManagerContainer368.addMenuEntry(false, " ->", i_67_, (byte) -109, true, i_66_, (class46.itemId), true, 15, ((class46.childIndex) << 0) | (class46.packedId), DisplayModeManagerContainer332.aString5001, 1L, (Component182.anInt9747));
                                                else DisplayModeManagerContainer196.method2678(-2049);
                                            } else {
                                                if ((PacketReader.currentGameType) == (WorldNameText.STELLARDAWN)) DisplayModeManagerContainer368.addMenuEntry(false, "", i_67_, (byte) -116, true, i_66_, -1, true, 12, 0L, (FriendsIgnoreList.aClass274_3510.getLocalized((ObjectDeserializer.languageId), 544)), 1L, -1);
                                                DisplayModeManagerContainer368.addMenuEntry(false, "", i_67_, (byte) -93, true, i_66_, -1, true, 19, 0L, Component323.aString5882, 1L, Component79.anInt4144);
                                            }
                                        }
                                    }
                                    continue;
                                }
                                if (class46.contentType == NodeSub45.anInt7102) {
                                    Component39.aClass46_2249 = class46;
                                    if (bool) {
                                        Component163.aBoolean3174 = true;
                                        // Admin: right-click anywhere on the map → Teleport to here.
                                        WorldMapTeleport.injectAtSurface(
                                                i_51_ + AbstractGlTextureSub4.mouseHandler.getCursorX(true) - i_43_,
                                                i_52_ + AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 72) - i_44_,
                                                class46.width, class46.height);
                                    }
                                    if (bool_54_) {
                                        int i_70_ = (int) ((double) (i_51_ + (class348_sub45.getX((byte) -127)) - i_43_ - ((class46.width) / 2)) * 2.0 / (double) (DisplayModeManagerContainer229.aFloat1247));
                                        int i_71_ = (int) -((double) (i_52_ + (class348_sub45.getY(-111)) - i_44_ - ((class46.height) / 2)) * 2.0 / (double) (DisplayModeManagerContainer229.aFloat1247));
                                        int i_72_ = (NodeSub36.anInt6992 + i_70_ + DisplayModeManagerContainer229.anInt1266);
                                        int i_73_ = (DebugOverlay.anInt3170 + i_71_ + DisplayModeManagerContainer229.anInt1263);
                                        HashNodeSub14 class348_sub42_sub14 = ImageTagText.method1269(-17096);
                                        if (class348_sub42_sub14 != null) {
                                            int[] is = new int[3];
                                            class348_sub42_sub14.method3239(true, i_73_, i_72_, is);
                                            if (is != null) {
                                                if (Component280.aClass346_2449.isKeyDown(82, -128) && (Component353.anInt2581 > 0)) {
                                                    CollisionMap.method3502(is[2], 2, is[0], is[1]);
                                                    continue;
                                                }
                                                DisplayModeManagerContainer87.aBoolean3103 = true;
                                                DefinitionSub26.anInt9349 = is[0];
                                                InputStream_Sub2.anInt85 = is[1];
                                                NpcComposition.anInt1404 = is[2];
                                            }
                                            HashNode.anInt7059 = 1;
                                            NpcDefinition.aBoolean6788 = false;
                                            RenderableSub4.anInt6411 = AbstractGlTextureSub4.mouseHandler.getCursorX(true);
                                            Component386.anInt2872 = AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 72);
                                        }
                                    } else if (bool_53_ && (HashNode.anInt7059 > 0)) {
                                        if (HashNode.anInt7059 == 1 && ((RenderableSub4.anInt6411 != AbstractGlTextureSub4.mouseHandler.getCursorX(true)) || (Component386.anInt2872 != (AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 117))))) {
                                            Component191.anInt2464 = NodeSub36.anInt6992;
                                            BufferCacheSub2.anInt8237 = DebugOverlay.anInt3170;
                                            HashNode.anInt7059 = 2;
                                        }
                                        if (HashNode.anInt7059 == 2) {
                                            NpcDefinition.aBoolean6788 = true;
                                            DisplayModeManagerContainer282.clearPosition((byte) -59, (Component191.anInt2464 + (int) ((double) ((RenderableSub4.anInt6411) - (AbstractGlTextureSub4.mouseHandler.getCursorX(true))) * 2.0 / (double) (DisplayModeManagerContainer229.aFloat1249))));
                                            CookieManager.method2170((BufferCacheSub2.anInt8237 - (int) ((double) ((Component386.anInt2872) - (AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 83))) * 2.0 / (double) (DisplayModeManagerContainer229.aFloat1249))), (byte) 3);
                                        }
                                    } else {
                                        if (HashNode.anInt7059 > 0 && !NpcDefinition.aBoolean6788) {
                                            if (((Component203.anInt8770 == 1) || Component203.method2485(-124)) && DisplayModeManagerContainer306.menuEntryCount > 2) Component2.method191(true, RenderableSub4.anInt6411, Component386.anInt2872);
                                            else if (MatrixSub1.method913((byte) 117)) Component2.method191(true, RenderableSub4.anInt6411, Component386.anInt2872);
                                        }
                                        HashNode.anInt7059 = 0;
                                    }
                                    continue;
                                }
                                if (class46.contentType == SceneManager.anInt2861) {
                                    if (bool_53_) DisplayModeManagerContainer196.method2676(class46.width, class46.height, (i_51_ + AbstractGlTextureSub4.mouseHandler.getCursorX(true) - i_43_), (byte) 58, (i_52_ + AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 111) - i_44_));
                                    continue;
                                }
                                if (class46.contentType == ParticleSystem.anInt7125) {
                                    Component143.method1343(i_44_, class46, 1, i_43_);
                                    continue;
                                }
                            }
                            if (!class46.aBoolean793 && bool_54_) {
                                class46.aBoolean793 = true;
                                MobileKeyboard.onInterfacePress(class46, i_43_, rawY);
                                if (class46.anObjectArray763 != null) {
                                    NodeSub36 class348_sub36 = new NodeSub36();
                                    class348_sub36.aBoolean6993 = true;
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anInt6984 = (i_51_ + class348_sub45.getX((byte) -128) - i_43_);
                                    class348_sub36.anInt6995 = (i_52_ + class348_sub45.getY(-123) - i_44_);
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray763;
                                    NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                                }
                            }
                            if (class46.aBoolean793 && bool_53_ && (class46.anObjectArray785 != null)) {
                                NodeSub36 class348_sub36 = new NodeSub36();
                                class348_sub36.aBoolean6993 = true;
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anInt6984 = i_51_ + AbstractGlTextureSub4.mouseHandler.getCursorX(true) - i_43_;
                                class348_sub36.anInt6995 = (i_52_ + AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 98) - i_44_);
                                class348_sub36.anObjectArray6987 = class46.anObjectArray785;
                                NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                            }
                            if (class46.aBoolean793 && !bool_53_) {
                                class46.aBoolean793 = false;
                                if (class46.anObjectArray742 != null) {
                                    NodeSub36 class348_sub36 = new NodeSub36();
                                    class348_sub36.aBoolean6993 = true;
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anInt6984 = (i_51_ + AbstractGlTextureSub4.mouseHandler.getCursorX(true) - i_43_);
                                    class348_sub36.anInt6995 = (i_52_ + AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 75) - i_44_);
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray742;
                                    Component6.aClass262_4473.addTail(class348_sub36, -20180);
                                }
                            }
                            if (bool_53_ && (class46.anObjectArray805 != null)) {
                                NodeSub36 class348_sub36 = new NodeSub36();
                                class348_sub36.aBoolean6993 = true;
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anInt6984 = i_51_ + AbstractGlTextureSub4.mouseHandler.getCursorX(true) - i_43_;
                                class348_sub36.anInt6995 = (i_52_ + AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 80) - i_44_);
                                class348_sub36.anObjectArray6987 = class46.anObjectArray805;
                                NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                            }
                            if (!class46.aBoolean737 && bool) {
                                class46.aBoolean737 = true;
                                if (class46.anObjectArray811 != null) {
                                    NodeSub36 class348_sub36 = new NodeSub36();
                                    class348_sub36.aBoolean6993 = true;
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anInt6984 = (i_51_ + AbstractGlTextureSub4.mouseHandler.getCursorX(true) - i_43_);
                                    class348_sub36.anInt6995 = (i_52_ + AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 112) - i_44_);
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray811;
                                    NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                                }
                            }
                            if (class46.aBoolean737 && bool && (class46.anObjectArray839 != null)) {
                                NodeSub36 class348_sub36 = new NodeSub36();
                                class348_sub36.aBoolean6993 = true;
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anInt6984 = i_51_ + AbstractGlTextureSub4.mouseHandler.getCursorX(true) - i_43_;
                                class348_sub36.anInt6995 = (i_52_ + AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 95) - i_44_);
                                class348_sub36.anObjectArray6987 = class46.anObjectArray839;
                                NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                            }
                            if (class46.aBoolean737 && !bool) {
                                class46.aBoolean737 = false;
                                if (class46.anObjectArray683 != null) {
                                    NodeSub36 class348_sub36 = new NodeSub36();
                                    class348_sub36.aBoolean6993 = true;
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anInt6984 = (i_51_ + AbstractGlTextureSub4.mouseHandler.getCursorX(true) - i_43_);
                                    class348_sub36.anInt6995 = (i_52_ + AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 90) - i_44_);
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray683;
                                    Component6.aClass262_4473.addTail(class348_sub36, -20180);
                                }
                            }
                            if (class46.anObjectArray764 != null) {
                                NodeSub36 class348_sub36 = new NodeSub36();
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anObjectArray6987 = class46.anObjectArray764;
                                Component222.aClass262_2707.addTail(class348_sub36, -20180);
                            }
                            if (class46.anObjectArray685 != null && (Component364.anInt8352 > class46.anInt738)) {
                                if (class46.anIntArray818 == null || (Component364.anInt8352 - class46.anInt738) > 32) {
                                    NodeSub36 class348_sub36 = new NodeSub36();
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray685;
                                    NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                                } else {
                                    while_224_:
                                    for (int i_74_ = class46.anInt738; i_74_ < Component364.anInt8352; i_74_++) {
                                        int i_75_ = (Request.anIntArray6890[i_74_ & 0x1f]);
                                        for (int i_76_ = 0; i_76_ < (class46.anIntArray818).length; i_76_++) {
                                            if ((class46.anIntArray818[i_76_]) == i_75_) {
                                                NodeSub36 class348_sub36 = new NodeSub36();
                                                class348_sub36.aClass46_6989 = class46;
                                                class348_sub36.anObjectArray6987 = (class46.anObjectArray685);
                                                NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                                                break while_224_;
                                            }
                                        }
                                    }
                                }
                                class46.anInt738 = Component364.anInt8352;
                            }
                            if (class46.anObjectArray708 != null && (DefinitionSub30.anInt9385 > class46.anInt814)) {
                                if (class46.anIntArray831 == null || (DefinitionSub30.anInt9385 - class46.anInt814) > 32) {
                                    NodeSub36 class348_sub36 = new NodeSub36();
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray708;
                                    NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                                } else {
                                    while_225_:
                                    for (int i_77_ = class46.anInt814; (i_77_ < DefinitionSub30.anInt9385); i_77_++) {
                                        int i_78_ = (Component71.anIntArray6061[i_77_ & 0x1f]);
                                        for (int i_79_ = 0; i_79_ < (class46.anIntArray831).length; i_79_++) {
                                            if ((class46.anIntArray831[i_79_]) == i_78_) {
                                                NodeSub36 class348_sub36 = new NodeSub36();
                                                class348_sub36.aClass46_6989 = class46;
                                                class348_sub36.anObjectArray6987 = (class46.anObjectArray708);
                                                NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                                                break while_225_;
                                            }
                                        }
                                    }
                                }
                                class46.anInt814 = DefinitionSub30.anInt9385;
                            }
                            if (class46.anObjectArray777 != null && (DisplayModeManagerContainer260.anInt3695 > class46.anInt725)) {
                                if (class46.anIntArray686 == null || (DisplayModeManagerContainer260.anInt3695 - class46.anInt725) > 32) {
                                    NodeSub36 class348_sub36 = new NodeSub36();
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray777;
                                    NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                                } else {
                                    while_226_:
                                    for (int i_80_ = class46.anInt725; i_80_ < DisplayModeManagerContainer260.anInt3695; i_80_++) {
                                        int i_81_ = (DisplayModeManagerContainer363.anIntArray4096[i_80_ & 0x1f]);
                                        for (int i_82_ = 0; i_82_ < (class46.anIntArray686).length; i_82_++) {
                                            if ((class46.anIntArray686[i_82_]) == i_81_) {
                                                NodeSub36 class348_sub36 = new NodeSub36();
                                                class348_sub36.aClass46_6989 = class46;
                                                class348_sub36.anObjectArray6987 = (class46.anObjectArray777);
                                                NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                                                break while_226_;
                                            }
                                        }
                                    }
                                }
                                class46.anInt725 = DisplayModeManagerContainer260.anInt3695;
                            }
                            if (class46.anObjectArray751 != null && (KeyStoreLoader.anInt1631 > class46.anInt723)) {
                                if (class46.anIntArray771 == null || (KeyStoreLoader.anInt1631 - class46.anInt723) > 32) {
                                    NodeSub36 class348_sub36 = new NodeSub36();
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray751;
                                    NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                                } else {
                                    while_227_:
                                    for (int i_83_ = class46.anInt723; i_83_ < KeyStoreLoader.anInt1631; i_83_++) {
                                        int i_84_ = (HelveticaFont.anIntArray2633[i_83_ & 0x1f]);
                                        for (int i_85_ = 0; i_85_ < (class46.anIntArray771).length; i_85_++) {
                                            if ((class46.anIntArray771[i_85_]) == i_84_) {
                                                NodeSub36 class348_sub36 = new NodeSub36();
                                                class348_sub36.aClass46_6989 = class46;
                                                class348_sub36.anObjectArray6987 = (class46.anObjectArray751);
                                                NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                                                break while_227_;
                                            }
                                        }
                                    }
                                }
                                class46.anInt723 = KeyStoreLoader.anInt1631;
                            }
                            if (class46.anObjectArray671 != null && (Component311.anInt4086 > class46.anInt715)) {
                                if (class46.anIntArray731 == null || (Component311.anInt4086 - class46.anInt715) > 32) {
                                    NodeSub36 class348_sub36 = new NodeSub36();
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray671;
                                    NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                                } else {
                                    while_228_:
                                    for (int i_86_ = class46.anInt715; i_86_ < Component311.anInt4086; i_86_++) {
                                        int i_87_ = (HelveticaFont.anIntArray2632[i_86_ & 0x1f]);
                                        for (int i_88_ = 0; i_88_ < (class46.anIntArray731).length; i_88_++) {
                                            if ((class46.anIntArray731[i_88_]) == i_87_) {
                                                NodeSub36 class348_sub36 = new NodeSub36();
                                                class348_sub36.aClass46_6989 = class46;
                                                class348_sub36.anObjectArray6987 = (class46.anObjectArray671);
                                                NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                                                break while_228_;
                                            }
                                        }
                                    }
                                }
                                class46.anInt715 = Component311.anInt4086;
                            }
                            if ((HashNodeSub3.anInt9501 > class46.anInt726) && (class46.anObjectArray820 != null)) {
                                NodeSub36 class348_sub36 = new NodeSub36();
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anObjectArray6987 = class46.anObjectArray820;
                                NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                            }
                            if ((Component380.anInt4985 > class46.anInt726) && (class46.anObjectArray734 != null)) {
                                NodeSub36 class348_sub36 = new NodeSub36();
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anObjectArray6987 = class46.anObjectArray734;
                                NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                            }
                            if ((GameType.anInt2986 > class46.anInt726) && (class46.anObjectArray761 != null)) {
                                NodeSub36 class348_sub36 = new NodeSub36();
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anObjectArray6987 = class46.anObjectArray761;
                                NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                            }
                            if ((Component291.anInt2523 > class46.anInt726) && (class46.anObjectArray807 != null)) {
                                NodeSub36 class348_sub36 = new NodeSub36();
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anObjectArray6987 = class46.anObjectArray807;
                                NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                            }
                            if ((DefinitionSub23.anInt9313 > class46.anInt726) && (class46.anObjectArray836 != null)) {
                                NodeSub36 class348_sub36 = new NodeSub36();
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anObjectArray6987 = class46.anObjectArray836;
                                NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                            }
                            class46.anInt726 = ResourceLoader.anInt3918;
                            if (class46.anObjectArray822 != null) {
                                for (int i_89_ = 0; i_89_ < HashNodeSub19.anInt9699; i_89_++) {
                                    NodeSub36 class348_sub36 = new NodeSub36();
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anInt6991 = DefinitionGroup.anInterface6Array9534[i_89_].getKeyCode(false);
                                    class348_sub36.anInt6982 = DefinitionGroup.anInterface6Array9534[i_89_].getKeyChar((byte) 39);
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray822;
                                    NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                                }
                            }
                            if (DisplayModeManagerContainer322.aBoolean4284 && (class46.anObjectArray687 != null)) {
                                NodeSub36 class348_sub36 = new NodeSub36();
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anObjectArray6987 = class46.anObjectArray687;
                                NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                            }
                        }
                        if (class46.type == 5 && class46.anInt705 != -1) class46.method444(false, Component132.aClass25_1813, ComponentDownloader.aClass84_413).method2292(84, NodeSub8.toolkit, class46.height);
                        DisplayModeManagerContainer220.method273(class46, -2835);
                        if (class46.type == 0) {
                            method107(class46s, class46.packedId, i_45_, i_46_, i_47_, i_48_, i_43_ - class46.scrollX, i_44_ - class46.scrollY, i_38_, i_39_, i_40_, i_41_);
                            if (class46.children != null) method107(class46.children, class46.packedId, i_45_, i_46_, i_47_, i_48_, i_43_ - class46.scrollX, i_44_ - class46.scrollY, i_38_, i_39_, i_40_, i_41_);
                            NodeSub41 class348_sub41 = ((NodeSub41) (Component15.aClass356_4915.get(class46.packedId, -6008)));
                            if (class348_sub41 != null) {
                                if ((PacketReader.currentGameType == RunescapeInfo.RUNESCAPE) && (class348_sub41.anInt7053) == 0 && !Component364.aBoolean8335 && bool && !DisplayModeManagerContainer356.aBoolean6327) DisplayModeManagerContainer190.resetNodeStates((byte) 105);
                                Component280.method1373(class348_sub41.anInt7050, i_43_, i_45_, i_47_, i_39_, i_38_, -1391, i_40_, i_48_, i_44_, i_41_, i_46_);
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Walk {@link ComponentSettings#getParentDepth} parent hops (via
     * {@link DisplayModeManagerContainer57#parentId}). Null if the chain breaks.
     */
    static final DisplayModeManagerContainer57 getAncestorComponent(DisplayModeManagerContainer57 class46) {
        int i = getComponentSettings(class46).getParentDepth((byte) 125);
        if (i == 0) return null;
        for (int i_90_ = 0; i_90_ < i; i_90_++) {
            class46 = BitmapFont.getComponent(1512932720, class46.parentId);
            if (class46 == null) return null;
        }
        return class46;
    }

    static final void method109() {
        for (int i = 0; i < AbstractShaderSub4.anInt7319; i++) {
            int[] is = HashNodeSub17.anIntArrayArray9678[i];
            for (int i_91_ = 0; i_91_ < ParametricDefinition.anInt9109; i_91_++)
                is[i_91_] = 0;
        }
    }

    public static void method110(int i) {
        aClass262_5185 = null;
        if (i == 31) anIntArray5176 = null;
    }

    static final boolean method111(DisplayModeManagerContainer57 class46) {
        if (DisplayModeManagerContainer356.aBoolean6327) {
            if (getComponentSettings(class46).optionFlags != 0) return false;
            if (class46.type == 0) return false;
        }
        return class46.hidden;
    }

    /** Draw tick: call the present path ({@code method116}), optionally with safe-mode recovery. */
    final void pulseDrawFrame(int i) {
        if (i != -11018) closeResources(9);
        anInt5186++;
        if (Component192.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350) == 2) {
            try {
                method116(true);
            } catch (Throwable throwable) {
                ClientErrorReporter.reportError((throwable.getMessage() + " (Recovered) " + method81((byte) 52)), throwable, 15004);
                GpsOverlay.aBoolean1952 = true;
                SoftwareFallbackShader.method3553(false, (byte) 123, 0);
            }
        } else method116(true);
    }

    static final void method112() {
        int i = ShaderCompilerSub1.anInt6513;
        int[] is = ShaderProgramSub7.anIntArray6290;
        int i_92_ = BasicMouseHandler.aBoolean7444 ? i : i + Component324.anInt2057;
        for (int i_93_ = 0; i_93_ < i_92_; i_93_++) {
            DisplayModeManagerContainer58 class318_sub1_sub3_sub3;
            if (i_93_ < i) class318_sub1_sub3_sub3 = (InterfaceRenderer.players[is[i_93_]]);
            else class318_sub1_sub3_sub3 = (((NpcNode) Component21.aClass356_3654.get(DisplayModeManagerContainer238.anIntArray1233[i_93_ - i], -6008)).npc);
            if (class318_sub1_sub3_sub3.anInt10285 >= 0) {
                int i_94_ = class318_sub1_sub3_sub3.getSize((byte) 74);
                if ((i_94_ & 0x1) == 0) {
                    if ((class318_sub1_sub3_sub3.x & 0x1ff) == 0 && (class318_sub1_sub3_sub3.y & 0x1ff) == 0) continue;
                } else if ((class318_sub1_sub3_sub3.x & 0x1ff) == 256 && ((class318_sub1_sub3_sub3.y) & 0x1ff) == 256) continue;
                class318_sub1_sub3_sub3.anInt6382 = (Component300.method2064(class318_sub1_sub3_sub3.x, class318_sub1_sub3_sub3.plane, 11219, class318_sub1_sub3_sub3.y));
                Component84.method850(class318_sub1_sub3_sub3, true);
            }
        }
    }

    private final void method113(byte i) {
        if (Component49.clientState == 7 && Component241.anInt2955 == 0) {
            if (Component156.anInt3699 > 1) {
                DefinitionSub23.anInt9313 = ResourceLoader.anInt3918;
                Component156.anInt3699--;
            }
            if (!Component364.aBoolean8335) DisplayModeManagerContainer190.resetNodeStates((byte) 111);
            for (int i_95_ = 0; i_95_ < 100; i_95_++) {
                if (!Component102.method2203((byte) -85)) break;
            }
        }
        anInt5174++;
        NodeSub51.anInt7267++;
        Component2.method198(null, false, -1, -1);
        Component143.method1343(-1, null, 1, -1);
        Component43.method1583((byte) -73);
        ResourceLoader.anInt3918++;
        for (int i_96_ = 0; NodeSub32.anInt6930 > i_96_; i_96_++) {
            Npc npc = (DefinitionSub23.aClass348_Sub22Array9319[i_96_].npc);
            if (npc != null) {
                byte i_97_ = (npc.definition.aByte1325);
                if ((i_97_ & 0x1) != 0) {
                    int i_98_ = npc.getSize((byte) 117);
                    if ((0x2 & i_97_) != 0 && npc.anInt10319 == 0 && Math.random() * 1000.0 < 10.0) {
                        int i_99_ = (int) Math.round(-5.0 + 10.0 * Math.random());
                        int i_100_ = (int) Math.round(10.0 * Math.random() - 5.0);
                        if (i_99_ != 0 || i_100_ != 0) {
                            int i_101_ = ((npc.anIntArray10320[0]) - -i_99_);
                            if (i_101_ < 0) i_101_ = 0;
                            else if (i_101_ > AbstractShaderSub4.anInt7319 + -i_98_ + -1) i_101_ = -1 + (-i_98_ + AbstractShaderSub4.anInt7319);
                            int i_102_ = i_100_ + (npc.anIntArray10317[0]);
                            if (i_102_ < 0) i_102_ = 0;
                            else if ((-i_98_ + ParametricDefinition.anInt9109 - 1) < i_102_) i_102_ = (-i_98_ + ParametricDefinition.anInt9109 - 1);
                            int i_103_ = (Component317.method574(i_101_, i_98_, i_98_, DefinitionSub11.anIntArray9185, true, (byte) 120, -1, (npc.anIntArray10320[0]), (npc.anIntArray10317[0]), HashNodeSub14.anIntArray9626, i_102_, (NodeSub45.aClass361Array7108[(npc.plane)]), i_98_, 0, 0));
                            if (i_103_ > 0) {
                                if (i_103_ > 9) i_103_ = 9;
                                for (int i_104_ = 0; i_103_ > i_104_; i_104_++) {
                                    npc.anIntArray10320[i_104_] = (HashNodeSub14.anIntArray9626[-1 + (-i_104_ + i_103_)]);
                                    npc.anIntArray10317[i_104_] = (DefinitionSub11.anIntArray9185[-1 + (-i_104_ + i_103_)]);
                                    npc.aByteArray10321[i_104_] = (byte) 1;
                                }
                                npc.anInt10319 = i_103_;
                            }
                        }
                    }
                    Component386.method1600(true, 0, npc);
                    int i_105_ = (NodeSub8.method2774((byte) 108, npc));
                    NodeBaseSub2.method3443(true, npc);
                    DisplayModeManagerContainer5.method729(Component366.anInt3062, i_105_, (byte) 122, npc, Component162.anInt8387);
                    Component140.method3208(npc, Component366.anInt3062, -84);
                    GameType.method1635(-106, npc);
                }
            }
        }
        if (Component241.anInt2955 == 0 && AbstractShaderSub2.anInt7297 == 0) {
            if (DefinitionSub21.cameraMode == 2) Component19.method241((byte) 127);
            else NodeSub21.method2954((byte) -127);
            if (WaterSurfaceShader.anInt6246 >> 9 < 14 || (WaterSurfaceShader.anInt6246 >> 9 >= -14 + AbstractShaderSub4.anInt7319) || (Component317.anInt8685 >> 9 < 14) || (ParametricDefinition.anInt9109 + -14 <= Component317.anInt8685 >> 9))
                DisplayModeManagerContainer204.method893((byte) -49);
        }
        if (i != 112) anInt5171 = 22;
        for (; ; ) {
            NodeSub36 class348_sub36 = (NodeSub36) Component222.aClass262_2707.peekFirst(8);
            if (class348_sub36 == null) break;
            DisplayModeManagerContainer57 class46 = class348_sub36.aClass46_6989;
            if (class46.childIndex >= 0) {
                DisplayModeManagerContainer57 class46_106_ = BitmapFont.getComponent(i ^ 0x5a2d8500, class46.parentId);
                if (class46_106_ == null || class46_106_.children == null || (class46_106_.children.length <= class46.childIndex) || class46 != (class46_106_.children[class46.childIndex])) continue;
            }
            ClientScriptExecutor.runHook(class348_sub36);
        }
        for (; ; ) {
            NodeSub36 class348_sub36 = ((NodeSub36) Component6.aClass262_4473.peekFirst(i + -104));
            if (class348_sub36 == null) break;
            DisplayModeManagerContainer57 class46 = class348_sub36.aClass46_6989;
            if (class46.childIndex >= 0) {
                DisplayModeManagerContainer57 class46_107_ = BitmapFont.getComponent(1512932720, class46.parentId);
                if (class46_107_ == null || class46_107_.children == null || (class46_107_.children.length <= class46.childIndex) || class46 != (class46_107_.children[class46.childIndex])) continue;
            }
            ClientScriptExecutor.runHook(class348_sub36);
        }
        for (; ; ) {
            NodeSub36 class348_sub36 = ((NodeSub36) NodeSub1Sub2.aClass262_8810.peekFirst(i ^ 0x78));
            if (class348_sub36 == null) break;
            DisplayModeManagerContainer57 class46 = class348_sub36.aClass46_6989;
            if (class46.childIndex >= 0) {
                DisplayModeManagerContainer57 class46_108_ = BitmapFont.getComponent(1512932720, class46.parentId);
                if (class46_108_ == null || class46_108_.children == null || (class46_108_.children.length <= class46.childIndex) || class46 != (class46_108_.children[class46.childIndex])) continue;
            }
            ClientScriptExecutor.runHook(class348_sub36);
        }
        if (Component156.aClass46_3701 != null) DisplayModeManagerContainer322.method2708(-30206);
        if (OpenGlShader.clientCycle % 1500 == 0) ToolbarRefreshDefinition.method3088(9);
        if (Component49.clientState == 7 && Component241.anInt2955 == 0) DisplayModeManagerContainer1.updateMenuTip(-124);
        DisplayModeManagerContainer204.method909(3553);
        if (Component357.aBoolean2469 && (Component225.aLong482 < Component240.currentTimeMillis(-107) + -60000L)) DisplayModeManagerContainer343.saveClientPreferences(41);
        for (FriendLoginMessage class318_sub9_sub1 = ((FriendLoginMessage) HashNodeSub14.friendLoginMessages.method1872(8)); class318_sub9_sub1 != null; class318_sub9_sub1 = (FriendLoginMessage) HashNodeSub14.friendLoginMessages.method1878((byte) -43)) {
            if ((long) class318_sub9_sub1.timestampSeconds < -5L + Component240.currentTimeMillis(-80) / 1000L) {
                if (class318_sub9_sub1.worldId > 0) ShaderProgramSub2.addChatMessage("", 5, (byte) -91, 0, (class318_sub9_sub1.username + FriendsIgnoreList.aClass274_3502.getLocalized(ObjectDeserializer.languageId, 544)), "", "");
                if (class318_sub9_sub1.worldId == 0) ShaderProgramSub2.addChatMessage("", 5, (byte) -105, 0, (class318_sub9_sub1.username + FriendsIgnoreList.aClass274_3503.getLocalized((ObjectDeserializer.languageId), i ^ 0x250)), "", "");
                class318_sub9_sub1.unlink(false);
            }
        }
        do {
            if (Component49.clientState == 7 && Component241.anInt2955 == 0) {
                if (DefinitionSub8.aClass238_9165 == null) LoggedOutDefinition.disconnectAndReset(false, (byte) 11);
                else {
                    Component53.anInt193++;
                    if (Component53.anInt193 > 50) {
                        IOException_Sub1.anInt88++;
                        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((Component98.aClass351_5938), (DisplayModeManagerContainer64.aClass77_9029), -104);
                        HashNodeSub14.enqueueOutboundPacket(-49, class348_sub47);
                    }
                    try {
                        Component302.method1802(0);
                    } catch (java.io.IOException ioexception) {
                        LoggedOutDefinition.disconnectAndReset(false, (byte) 11);
                        break;
                    }
                    break;
                }
                break;
            }
        } while (false);
    }

    private final void processGameTick(int i) {
        anInt5188++;
        if (Component49.clientState != 14) {
            OpenGlShader.clientCycle++;
            if (OpenGlShader.clientCycle % 1000 == 1) {
                GregorianCalendar gregoriancalendar = new GregorianCalendar();
                LruCache.anInt4383 = (gregoriancalendar.get(11) * 600 + gregoriancalendar.get(12) * 10 + gregoriancalendar.get(13) / 6);
                OutputStream_Sub1.aRandom93.setSeed(LruCache.anInt4383);
            }
            if (OpenGlShader.clientCycle % 50 == 0) {
                NodeSub48.anInt7134 = Component268.anInt1433;
                Component268.anInt1433 = 0;
                Component235.anInt3372 = Component354.anInt221;
                Component354.anInt221 = 0;
            }
            method102((byte) 61);
            if (Component143.aClass340_2327 != null) Component143.aClass340_2327.reload(0);
            HuffmanDecoder.method2228(0);
            HashNodeSub16Sub1.method3260(66);
            Component280.aClass346_2449.sync(67);
            AbstractGlTextureSub4.mouseHandler.syncEvents(0);
            if (NodeSub8.toolkit != null) NodeSub8.toolkit.method3646((int) Component240.currentTimeMillis(-74));
            DisplayModeManagerContainer292.method1315(93);
            Component193.anInt3246 = 0;
            HashNodeSub19.anInt9699 = 0;
            for (Interface6 interface6 = Component280.aClass346_2449.popKeyEvent(0); interface6 != null; interface6 = Component280.aClass346_2449.popKeyEvent(0)) {
                int i_109_ = interface6.getEventType(26276);
                if (i_109_ == 2 || i_109_ == 3) {
                    int i_110_ = interface6.getKeyChar((byte) 96);
                    if (!Component300.method2066((byte) 116) || (i_110_ != 96 && i_110_ != 167 && i_110_ != 178)) {
                        if (HashNodeSub19.anInt9699 < 128) {
                            DefinitionGroup.anInterface6Array9534[HashNodeSub19.anInt9699] = interface6;
                            HashNodeSub19.anInt9699++;
                        }
                    } else if (!HashNodeSub16Sub2.isDevConsoleOpen(true)) Component192.openDevConsole(-84);
                    else AbstractShaderSub4.closeDevConsole((byte) -89);
                } else if (i_109_ == 0 && Component193.anInt3246 < 75) {
                    Component17.anInterface6Array3884[Component193.anInt3246] = interface6;
                    Component193.anInt3246++;
                }
            }
            Component122.mouseWheelDelta = 0;
            Component233.scrollWheelDiff = 0;
            for (NodeSub45 class348_sub45 = AbstractGlTextureSub4.mouseHandler.popEvent(0); class348_sub45 != null; class348_sub45 = AbstractGlTextureSub4.mouseHandler.popEvent(0)) {
                int i_111_ = class348_sub45.getEventType(86);
                if (i_111_ != -1) {
                    if (i_111_ != 6) {
                        if (Component307.method3584(i_111_, 1)) {
                            Component327.aClass262_8744.addTail(class348_sub45, -20180);
                            if (Component327.aClass262_8744.size(0) > 10) Component327.aClass262_8744.peekFirst(8);
                        }
                    } else {
                        // Event type 6 = mouse wheel; notches feed UI scroll + console + plane.
                        int notches = class348_sub45.getClickCount(0);
                        Component233.scrollWheelDiff = notches;
                        Component122.mouseWheelDelta += notches;
                    }
                } else CacheNodeSub1.aClass262_10479.addTail(class348_sub45, -20180);
            }
            // Consume overlay clicks before menu/walk/iface handlers see them.
            if (Loader.microbotEnabled) MicrobotPanel.pollInput();
            SceneEditorUi.pollInput();
            SceneEditorHost.tick();
            // Purple console band: eat presses so they don't click-through to the game.
            BuildInfo.pollConsoleInput();
            if (HashNodeSub16Sub2.isDevConsoleOpen(true)) PauseTimer.processDevConsoleInput(125);
            if (GpsOverlay.method1167(Component49.clientState, (byte) -51)) {
                RSACipher.method493(true);
                Component97.method867(true);
            } else if (Component212.isValidType(Component49.clientState, (byte) -120)) Canvas_Sub1.loadAndBuildScene(0);
            if (i < 32) aClass262_5185 = null;
            if (CacheNode.method3196(Component49.clientState, -74) && !Component212.isValidType(Component49.clientState, (byte) -55)) {
                method113((byte) 112);
                NodeSub5.method2757(110);
                TheoraVideoPlayer.method843((byte) 102);
            } else if (!CacheFileStore.isReconnectState(Component49.clientState, -123) || Component212.isValidType(Component49.clientState, (byte) -115)) {
                if (Component49.clientState == 12) TheoraVideoPlayer.method843((byte) 113);
                else if (NativeLibLoader.isPostLoginState(true, Component49.clientState) && !Component212.isValidType(Component49.clientState, (byte) -86)) ClientSystemInfo.method2991(11432);
                else if (Component49.clientState == 13) {
                    TheoraVideoPlayer.method843((byte) -75);
                    if (NodederUtil.anInt6634 != -3 && NodederUtil.anInt6634 != 2 && NodederUtil.anInt6634 != 15) LoggedOutDefinition.disconnectAndReset(false, (byte) 11);
                }
            } else {
                method113((byte) 112);
                TheoraVideoPlayer.method843((byte) 67);
            }
            Component231.method294(NodeSub8.toolkit, 0);
            Component327.aClass262_8744.peekFirst(8);
            // Microbot: refresh caches + pending menu inject (after input drain / menu tip).
            MicrobotRuntime.tick();
            // Joystick aliases: drain pad-queued fires on the client thread (CS2-safe).
            JoystickAlias.clientTick();
        }
    }

    static final void method115() {
        int i = ShaderCompilerSub1.anInt6513;
        int[] is = ShaderProgramSub7.anIntArray6290;
        int i_112_ = Component192.aClass348_Sub51_3959.aClass239_Sub13_7236.method1776(-32350);
        boolean bool = i_112_ == 1 && i > 200 || i_112_ == 0 && i > 50;
        for (int i_113_ = 0; i_113_ < i; i_113_++) {
            Player player = InterfaceRenderer.players[is[i_113_]];
            if (!player.method2457((byte) -90)) player.anInt10285 = -1;
            else if (player.aBoolean10551) player.anInt10285 = -1;
            else {
                player.method2409((byte) -126);
                if ((player.aShort8743) < 0 || (player.aShort8750) < 0 || (player.aShort8751) >= AbstractShaderSub4.anInt7319 || (player.aShort8747) >= ParametricDefinition.anInt9109)
                    player.anInt10285 = -1;
                else {
                    player.aBoolean10521 = (player.aBoolean10213 && bool);
                    if (player == Component72.localPlayer) player.anInt10285 = 2147483647;
                    else {
                        int i_114_ = 0;
                        if (!player.aBoolean10309) i_114_++;
                        if (player.anInt10223 > OpenGlShader.clientCycle) i_114_ += 2;
                        i_114_ += 5 - player.getSize((byte) 101) << 2;
                        if (player.aBoolean10554) i_114_ += 512;
                        else {
                            if (NameFormatter.anInt495 == 0) i_114_ += 32;
                            else i_114_ += 128;
                            i_114_ += 256;
                        }
                        player.anInt10285 = i_114_ + 1;
                    }
                }
            }
        }
        for (int i_115_ = 0; i_115_ < Component324.anInt2057; i_115_++) {
            NpcNode npcNode = (NpcNode) Component21.aClass356_3654.get(DisplayModeManagerContainer238.anIntArray1233[i_115_], -6008);
            if (npcNode == null || npcNode.npc == null) {
                for (int i_117_ = i_115_ + 1; i_117_ < Component324.anInt2057; i_117_++) {
                    DisplayModeManagerContainer238.anIntArray1233[i_117_ - 1] = DisplayModeManagerContainer238.anIntArray1233[i_117_];
                }
                Component324.anInt2057--;
                i_115_--;
                continue;
            }
            Npc npc = npcNode.npc;
            if (!npc.method2445((byte) -4) || !(npc.definition.method796(DisplayModeManagerContainer58.aClass170_10209, 18627))) npc.anInt10285 = -1;
            else {
                npc.method2409((byte) -118);
                if ((npc.aShort8743) < 0 || (npc.aShort8750) < 0 || (npc.aShort8751) >= AbstractShaderSub4.anInt7319 || (npc.aShort8747) >= ParametricDefinition.anInt9109)
                    npc.anInt10285 = -1;
                else {
                    int i_116_ = 0;
                    if (!npc.aBoolean10309) i_116_++;
                    if (npc.anInt10223 > OpenGlShader.clientCycle) i_116_ += 2;
                    i_116_ += 5 - npc.getSize((byte) 82) << 2;
                    if (NameFormatter.anInt495 == 0) {
                        if (npc.definition.aBoolean1362) i_116_ += 64;
                        else i_116_ += 128;
                    } else if (NameFormatter.anInt495 == 1) {
                        if (npc.definition.aBoolean1362) i_116_ += 32;
                        else i_116_ += 64;
                    }
                    if (npc.definition.aBoolean1345) i_116_ += 1024;
                    else if (!npc.definition.aBoolean1381) i_116_ += 256;
                    npc.anInt10285 = i_116_ + 1;
                }
            }
        }
        for (int i_117_ = 0; i_117_ < NodeSub27.aClass302Array6897.length; i_117_++) {
            Component114 class302 = NodeSub27.aClass302Array6897[i_117_];
            if (class302 != null) {
                if (class302.anInt3840 == 1) {
                    NpcNode class348_sub22 = ((NpcNode) (Component21.aClass356_3654.get(class302.anInt3833, -6008)));
                    if (class348_sub22 != null) {
                        Npc npc = (class348_sub22.npc);
                        if (npc.anInt10285 >= 0) npc.anInt10285 += 2048;
                    }
                } else if (class302.anInt3840 == 10) {
                    Player player = (InterfaceRenderer.players[class302.anInt3833]);
                    if (player != null && (player != Component72.localPlayer) && player.anInt10285 >= 0) player.anInt10285 += 2048;
                }
            }
        }
    }

    /** Prefer stealing Loader's canvas via reflection; otherwise recreate via {@link Applet_Sub1#recreateGameCanvas}. */
    final synchronized void recreateGameCanvas(byte i) {
        if (i > -11) aClass262_5185 = null;
        anInt5173++;
        if (ToolkitFactory.anApplet1530 != null && DisplayModeManagerContainer50.gameCanvas == null && !OggUrlStream.aClass297_8992.useDirectDraw) {
            try {
                Class var_class = ToolkitFactory.anApplet1530.getClass();
                Field field = var_class.getDeclaredField("canvas");
                DisplayModeManagerContainer50.gameCanvas = (Canvas) field.get(ToolkitFactory.anApplet1530);
                field.set(ToolkitFactory.anApplet1530, null);
                if (DisplayModeManagerContainer50.gameCanvas != null) return;
            } catch (Exception exception) {
                if (Loader.trace) {
                    exception.printStackTrace();
                }
            }
        }
        super.recreateGameCanvas((byte) -28);
    }

    private final void method116(boolean bool) {
        anInt5172++;
        if (Component49.clientState != 14) {
            long l = (Component41.method1857((byte) -45) / 1000000L + -HashNodeSub2.aLong8573);
            HashNodeSub2.aLong8573 = Component41.method1857((byte) -45) / 1000000L;
            boolean bool_118_ = WaterShaderProgram.method2163(!bool);
            if (bool_118_ && DisplayModeManagerContainer238.aBoolean1236 && Definition.aClass279_7042 != null) Definition.aClass279_7042.method2087(-115);
            if (Component92.method1977((byte) -79, Component49.clientState)) {
                if ((NodeSub16Sub2.aLong8866 != 0) && Component240.currentTimeMillis(-98) > NodeSub16Sub2.aLong8866) LogicError.method830(MenuEntry.getWindowMode(-128), Component236.anInt4005, (byte) 102, false, DefinitionSub25.anInt9335);
                else if (!NodeSub8.toolkit.method3655() && DisplayModeManagerContainer351.aBoolean2674) ParticleSystem.method3327(1406);
            }
            if (Component225.aFrame476 == null) {
                java.awt.Container container;
                if (RSACipher.aFrame4904 == null) {
                    if (ToolkitFactory.anApplet1530 == null) container = DefinitionSub9.anApplet_Sub1_9169;
                    else container = ToolkitFactory.anApplet1530;
                } else container = RSACipher.aFrame4904;
                int i = container.getSize().width;
                int i_119_ = container.getSize().height;
                if (container == RSACipher.aFrame4904) {
                    Insets insets = RSACipher.aFrame4904.getInsets();
                    i -= insets.left + insets.right;
                    i_119_ -= insets.top - -insets.bottom;
                }
                if (i != SocketConnector.canvasWidth || i_119_ != NpcNode.canvasHeight || RuntimeException_Sub1.aBoolean4604) {
                    if (NodeSub8.toolkit == null || NodeSub8.toolkit.method3695()) OpenGlShader.method3556(false);
                    else {
                        NpcNode.canvasHeight = i_119_;
                        SocketConnector.canvasWidth = i;
                    }
                    NodeSub16Sub2.aLong8866 = Component240.currentTimeMillis(-66) - -500L;
                    RuntimeException_Sub1.aBoolean4604 = false;
                }
            }
            if (Component225.aFrame476 != null && !Component143.aBoolean2329 && Component92.method1977((byte) -79, Component49.clientState)) LogicError.method830(Component192.aClass348_Sub51_3959.aClass239_Sub8_7227.method1751(-32350), -1, (byte) 102, false, -1);
            boolean bool_120_ = false;
            if (Component297.aBoolean4726) {
                bool_120_ = true;
                Component297.aBoolean4726 = false;
            }
            if (bool_120_) Component211.method1170((byte) -116);
            if ((NodeSub8.toolkit != null && NodeSub8.toolkit.method3655()) || MenuEntry.getWindowMode(-91) != 1) Component160.method3466(-77);
            if (GpsOverlay.method1167(Component49.clientState, (byte) -113)) DisplayModeManagerContainer292.method1309(bool_120_, 117);
            else if (!Component69.method2114(Component49.clientState, bool)) {
                if (!CacheNode.method3197(Component49.clientState, (byte) 56)) {
                    if (Component212.isValidType(Component49.clientState, (byte) -78)) {
                        if (Component129.anInt489 == 1) {
                            if (DisplayModeManagerContainer259.anInt3441 > NodeSub46.anInt7115) NodeSub46.anInt7115 = DisplayModeManagerContainer259.anInt3441;
                            int i = ((-DisplayModeManagerContainer259.anInt3441 + NodeSub46.anInt7115) * 50 / NodeSub46.anInt7115);
                            Component149.method3511(true, Applet_Sub1.aClass324_20, Component163.aClass143_3179, (FriendsIgnoreList.aClass274_3495.getLocalized(ObjectDeserializer.languageId, 544)) + "<br>(" + i + "%)", 2, NodeSub8.toolkit);
                        } else if (Component129.anInt489 == 2) {
                            if (Component82.anInt443 < Component101.anInt2101) Component82.anInt443 = Component101.anInt2101;
                            int i = (((Component82.anInt443 - Component101.anInt2101) * 50 / Component82.anInt443) + 50);
                            Component149.method3511(true, Applet_Sub1.aClass324_20, Component163.aClass143_3179, (FriendsIgnoreList.aClass274_3495.getLocalized(ObjectDeserializer.languageId, 544)) + "<br>(" + i + "%)", 2, NodeSub8.toolkit);
                        } else Component149.method3511(true, Applet_Sub1.aClass324_20, Component163.aClass143_3179, (FriendsIgnoreList.aClass274_3495.getLocalized(ObjectDeserializer.languageId, 544)), 2, NodeSub8.toolkit);
                    } else if (Component49.clientState != 10) {
                        if (Component49.clientState == 13)
                            Component149.method3511(false, Applet_Sub1.aClass324_20, Component163.aClass143_3179, ((FriendsIgnoreList.aClass274_3497.getLocalized(ObjectDeserializer.languageId, 544)) + "<br>" + (FriendsIgnoreList.aClass274_3498.getLocalized(ObjectDeserializer.languageId, 544))), 2, NodeSub8.toolkit);
                    } else Component114.pulseCameraAndHud((byte) -43, l);
                } else Component98.redrawHud(85);
                // States 3/5/6 below: while logging in, show "Please wait..." instead of
                // the idle title UI (otherwise auto-login looks frozen for several seconds).
            } else if (Component241.anInt2955 != 0 || Component49.clientState == 5 || Component49.clientState == 6) {
                Component149.method3511(true, Applet_Sub1.aClass324_20, Component163.aClass143_3179, (FriendsIgnoreList.aClass274_3514.getLocalized(ObjectDeserializer.languageId, 544)), 2, NodeSub8.toolkit);
            } else Component98.redrawHud(85);
            if (GlToolkitSub3.anInt8045 == 3) {
                for (int i = 0; NodeSub38.anInt7008 > i; i++) {
                    Rectangle rectangle = Component166.aRectangleArray2371[i];
                    if (Component143.aBooleanArray2326[i]) NodeSub8.toolkit.method3668(rectangle.width, rectangle.y, -65281, rectangle.x, rectangle.height, 46);
                    else if (!DisplayModeManagerContainer259.aBooleanArray3438[i]) NodeSub8.toolkit.method3668(rectangle.width, rectangle.y, -16711936, rectangle.x, rectangle.height, 66);
                    else NodeSub8.toolkit.method3668(rectangle.width, rectangle.y, -65536, rectangle.x, rectangle.height, 40);
                }
            }
            if (HashNodeSub16Sub2.isDevConsoleOpen(bool)) BuildInfo.drawDevConsole(NodeSub8.toolkit, (byte) 124);
            // Microbot HUD — after console so it stays on top of game, under console if open.
            if (Loader.microbotEnabled) MicrobotPanel.draw(NodeSub8.toolkit);
            SceneEditorUi.draw(NodeSub8.toolkit);
            if (OggUrlStream.aClass297_8992.useDirectDraw && Component92.method1977((byte) -79, Component49.clientState) && GlToolkitSub3.anInt8045 == 0 && MenuEntry.getWindowMode(-85) == 1 && !bool_120_) {
                int i = 0;
                for (int i_121_ = 0; (NodeSub38.anInt7008 > i_121_); i_121_++) {
                    if (DisplayModeManagerContainer259.aBooleanArray3438[i_121_]) {
                        DisplayModeManagerContainer259.aBooleanArray3438[i_121_] = false;
                        DisplayModeManagerContainer56.aRectangleArray2554[i++] = Component166.aRectangleArray2371[i_121_];
                    }
                }
                try {
                    if (!Component210.gameCanvasAttached) NodeSub8.toolkit.method3657(DisplayModeManagerContainer56.aRectangleArray2554, i, 66);
                    else Component211.method1168(i, 0, DisplayModeManagerContainer56.aRectangleArray2554);
                } catch (Exception_Sub1 exception_sub1) {
                    /* empty */
                }
            } else if (!GpsOverlay.method1167(Component49.clientState, (byte) -59)) {
                for (int i = 0; NodeSub38.anInt7008 > i; i++)
                    DisplayModeManagerContainer259.aBooleanArray3438[i] = false;
                try {
                    if (Component210.gameCanvasAttached) CacheStore.method395(107);
                    else NodeSub8.toolkit.method3689((byte) 104);
                } catch (Exception_Sub1 exception_sub1) {
                    ClientErrorReporter.reportError((exception_sub1.getMessage() + " (Recovered) " + method81((byte) 79)), exception_sub1, 15004);
                    SoftwareFallbackShader.method3553(false, (byte) 113, 0);
                }
            }
            Component240.method598(9013);
            int i = Component192.aClass348_Sub51_3959.aClass239_Sub17_7263.method1798(-32350);
            if (i == 0) SpriteAtlasShader.sleep((byte) -127, 15L);
            else if (i != 1) {
                if (i != 2) {
                    if (i == 3) SpriteAtlasShader.sleep((byte) -102, 2L);
                } else SpriteAtlasShader.sleep((byte) -97, 5L);
            } else SpriteAtlasShader.sleep((byte) -104, 10L);
            if (Component144.aBoolean3988) ReliefShader.method1416(5);
            if (Component192.aClass348_Sub51_3959.aClass239_Sub11_7265.method1768(-32350) == 1 && Component49.clientState == 3 && r.anInt9721 != -1) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub11_7265), 0);
                DisplayModeManagerContainer389.method243(37);
            }
        }
    }

    static final void method117(int i) {
        int i_122_ = ShaderCompilerSub1.anInt6513;
        int[] is = ShaderProgramSub7.anIntArray6290;
        for (int i_123_ = 0; i_123_ < i_122_ + Component324.anInt2057; i_123_++) {
            DisplayModeManagerContainer58 class318_sub1_sub3_sub3;
            if (i_123_ < i_122_) class318_sub1_sub3_sub3 = (InterfaceRenderer.players[is[i_123_]]);
            else class318_sub1_sub3_sub3 = ((NpcNode) Component21.aClass356_3654.get(DisplayModeManagerContainer238.anIntArray1233[i_123_ - i_122_], -6008)).npc;
            if (class318_sub1_sub3_sub3.plane == i && (class318_sub1_sub3_sub3.anInt10285) >= 0) {
                int i_124_ = class318_sub1_sub3_sub3.getSize((byte) 114);
                if ((i_124_ & 0x1) == 0) {
                    if ((class318_sub1_sub3_sub3.x & 0x1ff) != 0 || (class318_sub1_sub3_sub3.y & 0x1ff) != 0) continue;
                } else if ((class318_sub1_sub3_sub3.x & 0x1ff) != 256 || ((class318_sub1_sub3_sub3.y) & 0x1ff) != 256) continue;
                if (i_124_ == 1) {
                    int i_125_ = (class318_sub1_sub3_sub3.x >> 9);
                    int i_126_ = (class318_sub1_sub3_sub3.y >> 9);
                    if ((class318_sub1_sub3_sub3.anInt10285) > (HashNodeSub17.anIntArrayArray9678[i_125_][i_126_])) {
                        HashNodeSub17.anIntArrayArray9678[i_125_][i_126_] = class318_sub1_sub3_sub3.anInt10285;
                        DisplayModeManagerContainer295.anIntArrayArray5921[i_125_][i_126_] = 1;
                    } else if (class318_sub1_sub3_sub3.anInt10285 == (HashNodeSub17.anIntArrayArray9678[i_125_][i_126_])) DisplayModeManagerContainer295.anIntArrayArray5921[i_125_][i_126_]++;
                } else {
                    int i_127_ = (i_124_ - 1) * 256 + 60;
                    int i_128_ = ((class318_sub1_sub3_sub3.x - i_127_) >> 9);
                    int i_129_ = ((class318_sub1_sub3_sub3.y - i_127_) >> 9);
                    int i_130_ = ((class318_sub1_sub3_sub3.x + i_127_) >> 9);
                    int i_131_ = ((class318_sub1_sub3_sub3.y + i_127_) >> 9);
                    for (int i_132_ = i_128_; i_132_ <= i_130_; i_132_++) {
                        for (int i_133_ = i_129_; i_133_ <= i_131_; i_133_++) {
                            if (class318_sub1_sub3_sub3.anInt10285 > (HashNodeSub17.anIntArrayArray9678[i_132_][i_133_])) {
                                HashNodeSub17.anIntArrayArray9678[i_132_][i_133_] = class318_sub1_sub3_sub3.anInt10285;
                                DisplayModeManagerContainer295.anIntArrayArray5921[i_132_][i_133_] = 1;
                            } else if (class318_sub1_sub3_sub3.anInt10285 == (HashNodeSub17.anIntArrayArray9678[i_132_][i_133_])) DisplayModeManagerContainer295.anIntArrayArray5921[i_132_][i_133_]++;
                        }
                    }
                }
            }
        }
    }

    final String method81(byte i) {
        anInt5175++;
        String string = null;
        try {
            string = ("[1)" + NodeBaseSub2.regionTileX + "," + Component330.regionTileY + "," + AbstractShaderSub4.anInt7319 + "," + ParametricDefinition.anInt9109 + "|");
            if (i < 40) aClass262_5185 = null;
            if (Component72.localPlayer != null)
                string += ("2)" + Component117.anInt4372 + "," + (NodeBaseSub2.regionTileX + (Component72.localPlayer.anIntArray10320[0])) + "," + (Component330.regionTileY + (Component72.localPlayer.anIntArray10317[0])) + "|");
            string += ("3)" + Component192.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350) + "|4)" + Component192.aClass348_Sub51_3959.aClass239_Sub20_7216.method1808(-32350) + "|5)" + MenuEntry.getWindowMode(-65) + "|6)" + Component236.canvasWidth + "," + PacketReader.canvasHeight + "|");
            string += "7)" + Component192.aClass348_Sub51_3959.aClass239_Sub28_7230.method1845(-32350) + "|";
            string += "8)" + Component192.aClass348_Sub51_3959.aClass239_Sub7_7238.method1748(-32350) + "|";
            string += "9)" + Component192.aClass348_Sub51_3959.aClass239_Sub18_7259.method1800(-32350) + "|";
            string += "10)" + Component192.aClass348_Sub51_3959.aClass239_Sub24_7235.method1820(-32350) + "|";
            string += "11)" + Component192.aClass348_Sub51_3959.aClass239_Sub12_7243.method1771(-32350) + "|";
            string += "12)" + Component192.aClass348_Sub51_3959.aClass239_Sub27_7261.method1840(-32350) + "|";
            string += "13)" + Component127.anInt2964 + "|";
            string += "14)" + Component49.clientState;
            if (DefinitionSub20.aClass348_Sub4_9264 != null) string += "|15)" + (DefinitionSub20.aClass348_Sub4_9264.anInt6609);
            try {
                if (Component192.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350) == 2) {
                    Field field = ClassLoader.class.getDeclaredField("nativeLibraries");
                    field.setAccessible(true);
                    Vector vector = ((Vector) field.get((aClass5189 != null ? aClass5189 : (aClass5189 = client.class)).getClassLoader()));
                    for (int i_135_ = 0; i_135_ < vector.size(); i_135_++) {
                        try {
                            Object object = vector.elementAt(i_135_);
                            Field field_136_ = object.getClass().getDeclaredField("name");
                            field_136_.setAccessible(true);
                            try {
                                String string_137_ = (String) field_136_.get(object);

                                if (string_137_ != null && string_137_.indexOf("sw3d.dll") != -1) {
                                    Field field_138_ = object.getClass().getDeclaredField("handle");


                                    field_138_.setAccessible(true);
                                    string += ("|16)" + (Long.toHexString(field_138_.getLong(object))));
                                    field_138_.setAccessible(false);
                                }
                            } catch (Throwable throwable) {
                                if (Loader.trace) {
                                    throwable.printStackTrace();
                                }
                                /* empty */
                            }
                            field_136_.setAccessible(false);
                        } catch (Throwable throwable) {
                            if (Loader.trace) {
                                throwable.printStackTrace();
                            }
                            /* empty */
                        }
                    }
                }
            } catch (Throwable throwable) {
                if (Loader.trace) {
                    throwable.printStackTrace();
                }
                /* empty */
            }
            string += "]";
        } catch (Throwable throwable) {
            if (Loader.trace) {
                throwable.printStackTrace();
            }
            /* empty */
        }
        return string;
    }

}
