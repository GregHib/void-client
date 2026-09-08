/* ItemDefinitionProvider - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ItemDefinitionProvider
/**
 * RENAMED from {@code Class255} / {@code DisplayModeManagerContainer320}.
 * Loads and caches {@link ItemDefinition} from the item JS5 archive.
 * Global instance: {@link Exception_Sub1#itemDefinitions}.
 * Also parks a static sprite-atlas warm-up ({@link #method1933}) used at login.
 */ {
    static Component183 aClass114_3265;
    static int anInt3266;
    private final CacheStore aClass45_3267;
    CacheStore aClass45_3268;
    private boolean aBoolean3269;
    static int anInt3270;
    /** Highest item id + 1 (archive file count). */
    int itemCount;
    static int anInt3272;
    static int[] anIntArray3273 = new int[5];
    static int anInt3274;
    static int anInt3275;
    static int anInt3276;
    static int anInt3277;
    private final NodeCache aClass60_3278 = new NodeCache(64);
    static int anInt3279;
    static int anInt3280;
    static int anInt3281;
    static int anInt3282;
    static int anInt3283;
    static int anInt3284;
    static DisplayModeManagerContainer254 aClass161_3285;
    int anInt3286;
    NodeCache aClass60_3287 = new NodeCache(50);
    Component143 aClass175_3288 = new Component143(250);
    private Component380 aClass126_3289 = new Component380();
    private final String[] aStringArray3290;
    int anInt3291;
    private Component311 aClass326_3292;
    private final String[] aStringArray3293;

    static final DisplayModeManagerContainer238[] method1929(byte i) {
        if (i != -19) method1933(null, null, false);
        anInt3280++;
        return (new DisplayModeManagerContainer238[]{PacketReader.aClass74_10437, Request.aClass74_6891, DisplayModeManagerContainer232.aClass74_4689, DisplayModeManagerContainer152.aClass74_4537, DisplayModeManagerContainer363.aClass74_4098, DisplayModeManagerContainer133.aClass74_2157, DisplayModeManagerContainer34.aClass74_8662, DisplayModeManagerContainer271.aClass74_515, NodeSub35.aClass74_6977, ArbShaderProgram.aClass74_6201, GnpPositionLogger.aClass74_1519, GpiLogger.aClass74_8853, DefinitionSub38.aClass74_9475, DisplayModeManagerContainer51.aClass74_2491});
    }

    final void method1930(int i) {
        synchronized (this.aClass60_3287) {
            this.aClass60_3287.clear(0);
            if (i != -21804) method1930(-35);
        }
        anInt3275++;
    }

    public static void method1931(boolean bool) {
        anIntArray3273 = null;
        if (bool != true) aClass114_3265 = null;
        aClass114_3265 = null;
        aClass161_3285 = null;
    }

    final Component24 method1932(GraphicsToolkit var_ha, int i, int i_0_, BitmapFont class324, Component101 class154, int i_1_, boolean bool, byte i_2_, GraphicsToolkit var_ha_3_, int i_4_, boolean bool_5_, int i_6_) {
        try {
            anInt3266++;
            Component24 class105 = method1941(i_6_, (byte) -74, i_4_, i_0_, i, i_1_, var_ha_3_, class154);
            if (class105 != null) return class105;
            ItemDefinition class213 = getItemDefinition(90, i_4_);
            if (i_0_ > 1 && class213.anIntArray2762 != null) {
                int i_7_ = -1;
                for (int i_8_ = 0; i_8_ < 10; i_8_++) {
                    if ((class213.anIntArray2831[i_8_] <= i_0_) && class213.anIntArray2831[i_8_] != 0) i_7_ = class213.anIntArray2762[i_8_];
                }
                if (i_7_ != -1) class213 = getItemDefinition(127, i_7_);
            }
            if (i_2_ != 83) method1935(-83, -37, null, null, false, -49);
            int[] is = class213.method1562(i_0_, bool_5_, i, var_ha_3_, var_ha, class324, class154, i_1_, (byte) -102, i_6_);
            if (is == null) return null;
            Component24 class105_9_;
            if (bool) class105_9_ = var_ha.method3662(36, is, (byte) 94, 0, 36, 32);
            else class105_9_ = var_ha_3_.method3662(36, is, (byte) 94, 0, 36, 32);
            if (!bool) {
                Component380 class126 = new Component380();
                class126.anInt4982 = i;
                class126.aBoolean4990 = class154 != null;
                class126.anInt4989 = i_0_;
                class126.anInt4992 = i_4_;
                class126.anInt4981 = i_1_;
                class126.anInt4991 = var_ha_3_.anInt4567;
                class126.anInt4993 = i_6_;
                this.aClass175_3288.method1348(70, class105_9_, class126);
            }
            return class105_9_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ub.C(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + (class324 != null ? "{...}" : "null") + ',' + (class154 != null ? "{...}" : "null") + ',' + i_1_ + ',' + bool + ',' + i_2_ + ',' + (var_ha_3_ != null ? "{...}" : "null") + ',' + i_4_ + ',' + bool_5_ + ',' + i_6_ + ')'));
        }
    }

    static final void method1933(CacheStore class45, GraphicsToolkit var_ha, boolean bool) {
        try {
            anInt3279++;
            Component170[] class207s = Component170.method1519(class45, NpcNode.anInt6862, 0);
            RequestProcessor.aClass105Array2260 = new Component24[class207s.length];
            for (int i = 0; class207s.length > i; i++)
                RequestProcessor.aClass105Array2260[i] = var_ha.method3691(class207s[i], true);
            class207s = Component170.method1519(class45, KeyStoreLoader.anInt1639, 0);
            NodeSub45.aClass105Array7107 = new Component24[class207s.length];
            for (int i = 0; class207s.length > i; i++)
                NodeSub45.aClass105Array7107[i] = var_ha.method3691(class207s[i], true);
            class207s = Component170.method1519(class45, BasicMouseHandler.anInt7429, 0);
            DisplayModeManagerContainer199.aClass105Array5857 = new Component24[class207s.length];
            for (int i = 0; class207s.length > i; i++)
                DisplayModeManagerContainer199.aClass105Array5857[i] = var_ha.method3691(class207s[i], true);
            class207s = Component170.method1519(class45, GraphicsToolkit.anInt4562, 0);
            Component141.aClass105Array9959 = new Component24[class207s.length];
            for (int i = 0; class207s.length > i; i++)
                Component141.aClass105Array9959[i] = var_ha.method3691(class207s[i], true);
            class207s = Component170.method1519(class45, CommandHandler.anInt1435, 0);
            Component235.aClass105Array3378 = new Component24[class207s.length];
            for (int i = 0; class207s.length > i; i++)
                Component235.aClass105Array3378[i] = var_ha.method3691(class207s[i], true);
            class207s = Component170.method1519(class45, Component95.anInt1756, 0);
            Component379.aClass105Array5933 = new Component24[class207s.length];
            for (int i = 0; i < class207s.length; i++)
                Component379.aClass105Array5933[i] = var_ha.method3691(class207s[i], true);
            class207s = Component170.method1519(class45, ReferenceTable.anInt3739, 0);
            Component210.aClass105Array5294 = new Component24[class207s.length];
            for (int i = 0; class207s.length > i; i++)
                Component210.aClass105Array5294[i] = var_ha.method3691(class207s[i], true);
            class207s = Component170.method1519(class45, Component328.anInt1481, 0);
            Component361.aClass105Array367 = new Component24[class207s.length];
            for (int i = 0; class207s.length > i; i++)
                Component361.aClass105Array367[i] = var_ha.method3691(class207s[i], true);
            class207s = Component170.method1519(class45, Component98.anInt5948, 0);
            DefinitionSub37.aClass105Array9467 = new Component24[class207s.length];
            for (int i = 0; i < class207s.length; i++)
                DefinitionSub37.aClass105Array9467[i] = var_ha.method3691(class207s[i], true);
            class207s = Component170.method1519(class45, Component22.anInt1742, 0);
            NodeSub12.aClass105Array6742 = new Component24[class207s.length];
            for (int i = 0; class207s.length > i; i++)
                NodeSub12.aClass105Array6742[i] = var_ha.method3691(class207s[i], true);
            class207s = Component170.method1519(class45, NamedInteger.anInt4469, 0);
            Component49.aClass105Array4679 = new Component24[class207s.length];
            for (int i = 0; i < class207s.length; i++)
                Component49.aClass105Array4679[i] = var_ha.method3691(class207s[i], true);
            class207s = Component170.method1519(class45, DefinitionSub38.anInt9473, 0);
            Component22.aClass105Array1744 = new Component24[class207s.length];
            for (int i = 0; class207s.length > i; i++)
                Component22.aClass105Array1744[i] = var_ha.method3691(class207s[i], true);
            NpcComposition.aClass105_1365 = var_ha.method3691(Component170.method1521(class45, RSACipher.anInt4895, 0), bool);
            ColoredText.aClass105_6097 = var_ha.method3691(Component170.method1521(class45, (Component134.anInt5814), 0), true);
            class207s = Component170.method1519(class45, DisplayModeManagerContainer89.anInt8370, 0);
            Component33.aClass105Array2640 = new Component24[class207s.length];
            for (int i = 0; i < class207s.length; i++)
                Component33.aClass105Array2640[i] = var_ha.method3691(class207s[i], true);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ub.N(" + (class45 != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + bool + ')'));
        }
    }

    final void method1934(byte i, boolean bool) {
        if (i != 11) method1935(97, -31, null, null, false, 53);
        anInt3276++;
        if (!aBoolean3269 != !bool) {
            aBoolean3269 = bool;
            method1939(i ^ ~0x14);
        }
    }

    static final void method1935(int i, int i_10_, ComponentDownloader class30, DisplayModeManagerContainer370 class64, boolean bool, int i_11_) {
        try {
            anInt3270++;
            if (class64 != null) {
                if (bool != false) method1929((byte) 106);
                class30.method320(class64.EA(), class64.fa(), (byte) -4, i_11_, class64.ShaderImpl(), i, class64.V(), class64.G(), class64.HA(), i_10_, class64.RA());
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ub.H(" + i + ',' + i_10_ + ',' + (class30 != null ? "{...}" : "null") + ',' + (class64 != null ? "{...}" : "null") + ',' + bool + ',' + i_11_ + ')'));
        }
    }

    final void method1936(int i) {
        anInt3281++;
        synchronized (this.aClass175_3288) {
            this.aClass175_3288.method1345((byte) -126);
            int i_12_ = -63 / ((21 - i) / 50);
        }
    }

    final void method1937(int i, boolean bool) {
        anInt3274++;
        synchronized (aClass60_3278) {
            aClass60_3278.processSoftEntries(2, i);
        }
        synchronized (this.aClass60_3287) {
            if (bool != false) method1939(-11);
            this.aClass60_3287.processSoftEntries(2, i);
        }
        synchronized (this.aClass175_3288) {
            this.aClass175_3288.method1346(-1491, i);
        }
    }

    final void method1938(int i) {
        anInt3272++;
        synchronized (aClass60_3278) {
            aClass60_3278.purgeSoftReferences(-88);
        }
        synchronized (this.aClass60_3287) {
            this.aClass60_3287.purgeSoftReferences(-85);
        }
        synchronized (this.aClass175_3288) {
            this.aClass175_3288.method1344((byte) -124);
        }
        if (i < 105) this.aClass45_3268 = null;
    }

    final void method1939(int i) {
        synchronized (aClass60_3278) {
            if (i > -28) aClass326_3292 = null;
            aClass60_3278.clear(0);
        }
        anInt3277++;
        synchronized (this.aClass60_3287) {
            this.aClass60_3287.clear(0);
        }
        synchronized (this.aClass175_3288) {
            this.aClass175_3288.method1345((byte) 47);
        }
    }

    /**
     * Lookup / decode item def by id (junk first arg — must keep {@code (junk-13)/59 != 0}
     * or the obfuscator divide-by-zero fires).
     */
    final ItemDefinition getItemDefinition(int i, int i_13_) {
        anInt3283++;
        ItemDefinition class213;
        synchronized (aClass60_3278) {
            class213 = (ItemDefinition) aClass60_3278.get(i_13_, 90);
        }
        if (class213 != null) return class213;
        byte[] is;
        synchronized (aClass45_3267) {
            is = aClass45_3267.getFile(-1860, Component285.method500(7, i_13_), Component111.lowByte(-23590, i_13_));
        }
        class213 = new ItemDefinition();
        class213.aClass255_2761 = this;
        class213.itemId = i_13_;
        class213.aStringArray2811 = new String[]{null, null, FriendsIgnoreList.aClass274_3490.getLocalized(this.anInt3286, 544), null, null};
        class213.aStringArray2763 = (new String[]{null, null, null, null, FriendsIgnoreList.aClass274_3491.getLocalized(this.anInt3286, 544)});
        if (is != null) class213.method1569(768, new Buffer(is));
        class213.method1563((byte) 92);
        int i_14_ = 4 / ((i - 13) / 59);
        if (class213.anInt2833 != -1) class213.method1570(1, getItemDefinition(90, class213.anInt2758), getItemDefinition(101, class213.anInt2833));
        if (class213.anInt2812 != -1) class213.method1556(getItemDefinition(-58, class213.anInt2778), (byte) -29, getItemDefinition(-82, class213.anInt2812));
        if (!aBoolean3269 && class213.aBoolean2783) {
            class213.itemName = FriendsIgnoreList.aClass274_3488.getLocalized(this.anInt3286, 544);
            class213.anInt2827 = 0;
            class213.aStringArray2811 = aStringArray3290;
            class213.aStringArray2763 = aStringArray3293;
            class213.aBoolean2755 = false;
            class213.anIntArray2772 = null;
            if (class213.aClass356_2757 != null) {
                boolean bool = false;
                for (Node class348 = class213.aClass356_2757.first(0); class348 != null; class348 = class213.aClass356_2757.next(0)) {
                    Component355 class254 = aClass326_3292.method2600((int) class348.key, 28364);
                    if (class254.aBoolean3261) class348.unlink((byte) 60);
                    else bool = true;
                }
                if (!bool) class213.aClass356_2757 = null;
            }
        }
        synchronized (aClass60_3278) {
            aClass60_3278.putOne(class213, i_13_, (byte) -118);
        }
        return class213;
    }

    final Component24 method1941(int i, byte i_15_, int i_16_, int i_17_, int i_18_, int i_19_, GraphicsToolkit var_ha, Component101 class154) {
        try {
            aClass126_3289.anInt4992 = i_16_;
            aClass126_3289.anInt4989 = i_17_;
            aClass126_3289.anInt4991 = var_ha.anInt4567;
            aClass126_3289.anInt4981 = i_19_;
            if (i_15_ != -74) aClass126_3289 = null;
            aClass126_3289.aBoolean4990 = class154 != null;
            aClass126_3289.anInt4982 = i_18_;
            anInt3282++;
            aClass126_3289.anInt4993 = i;
            return (Component24) this.aClass175_3288.method1340(123, aClass126_3289);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ub.D(" + i + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + (class154 != null ? "{...}" : "null") + ')'));
        }
    }

    final void method1942(int i, byte i_20_) {
        this.anInt3291 = i;
        anInt3284++;
        synchronized (this.aClass60_3287) {
            this.aClass60_3287.clear(0);
            int i_21_ = 89 % ((-65 - i_20_) / 60);
        }
    }

    ItemDefinitionProvider(GameType class230, int i, boolean bool, Component311 class326, CacheStore class45, CacheStore class45_22_) {
        try {
            aBoolean3269 = bool;
            aClass326_3292 = class326;
            this.aClass45_3268 = class45_22_;
            this.anInt3286 = i;
            aClass45_3267 = class45;
            if (aClass45_3267 != null) {
                int i_23_ = -1 + aClass45_3267.getGroupCapacity(-1);
                this.itemCount = aClass45_3267.getFileCount(0, i_23_) + i_23_ * 256;
            } else this.itemCount = 0;
            aStringArray3290 = (new String[]{null, null, FriendsIgnoreList.aClass274_3490.getLocalized(this.anInt3286, 544), null, null});
            aStringArray3293 = (new String[]{null, null, null, null, FriendsIgnoreList.aClass274_3491.getLocalized(this.anInt3286, 544)});
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ub.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (class326 != null ? "{...}" : "null") + ',' + (class45 != null ? "{...}" : "null") + ',' + (class45_22_ != null ? "{...}" : "null") + ')'));
        }
    }

    static {
        aClass114_3265 = new Component183(48, -2);
    }
}
