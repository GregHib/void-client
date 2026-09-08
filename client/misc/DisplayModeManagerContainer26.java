/* DisplayModeManagerContainer26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer26
/**
 * RENAMED from `Class84` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    private final NodeCache aClass60_1449 = new NodeCache(16);
    static int[] anIntArray1450 = {1, 2, 4, 8};
    static int anInt1451;
    static int anInt1452;
    static int anInt1453;
    static int anInt1454;
    static int anInt1455;
    static int anInt1456;
    static int anInt1457;
    static int anInt1458;
    static int anInt1459;
    private final CacheStore aClass45_1460;

    final void method816(boolean bool) {
        anInt1455++;
        synchronized (aClass60_1449) {
            if (bool != false) method819((byte) 107, 46);
            aClass60_1449.purgeSoftReferences(-119);
        }
    }

    static final DisplayModeManagerContainer58 method817(int i, int i_0_, int i_1_, int i_2_) {
        anInt1456++;
        Component186 class357 = Component335.aClass357ArrayArrayArray2029[i_1_][i_0_][i_2_];
        if (class357 == null) return null;
        if (i != 252) return null;
        DisplayModeManagerContainer58 class318_sub1_sub3_sub3 = null;
        int i_3_ = -1;
        for (Component3 class148 = class357.aClass148_4396; class148 != null; class148 = class148.aClass148_2038) {
            Component327 class318_sub1_sub3 = class148.aClass318_Sub1_Sub3_2040;
            if (class318_sub1_sub3 instanceof DisplayModeManagerContainer58) {
                DisplayModeManagerContainer58 class318_sub1_sub3_sub3_4_ = (DisplayModeManagerContainer58) class318_sub1_sub3;
                int i_5_ = 252 + (-1 + class318_sub1_sub3_sub3_4_.getSize((byte) 88)) * 256;
                int i_6_ = (-i_5_ + (class318_sub1_sub3_sub3_4_.x) >> 9);
                int i_7_ = (-i_5_ + (class318_sub1_sub3_sub3_4_.y) >> 9);
                int i_8_ = i_5_ + (class318_sub1_sub3_sub3_4_.x) >> 9;
                int i_9_ = ((class318_sub1_sub3_sub3_4_.y + i_5_) >> 9);
                if (i_0_ >= i_6_ && i_7_ <= i_2_ && i_0_ <= i_8_ && i_2_ <= i_9_) {
                    int i_10_ = (1 + i_9_ - i_2_) * (-i_0_ + (1 + i_8_));
                    if (i_3_ < i_10_) {
                        i_3_ = i_10_;
                        class318_sub1_sub3_sub3 = class318_sub1_sub3_sub3_4_;
                    }
                }
            }
        }
        return class318_sub1_sub3_sub3;
    }

    static final int method818(int i, int i_11_, int i_12_) {
        anInt1451++;
        int i_13_ = i_11_;
        while (i > 0) {
            i_13_ = i_12_ & 0x1 | i_13_ << 1;
            i--;
            i_12_ >>>= 1;
        }
        return i_13_;
    }

    final void method819(byte i, int i_14_) {
        synchronized (aClass60_1449) {
            aClass60_1449.processSoftEntries(2, i_14_);
            if (i <= 8) method826(91, -94, 117, 24, 39, -100, null);
        }
        anInt1457++;
    }

    private final Component189 method820(int i, int i_15_) {
        anInt1458++;
        Component189 class300;
        synchronized (aClass60_1449) {
            class300 = (Component189) aClass60_1449.get(i, 116);
        }
        if (class300 != null) return class300;
        byte[] is;
        synchronized (aClass45_1460) {
            is = aClass45_1460.getFile(-1860, i_15_, i);
        }
        class300 = new Component189();
        if (is != null) class300.decode(new Buffer(is), (byte) -123);
        synchronized (aClass60_1449) {
            aClass60_1449.putOne(class300, i, (byte) -106);
        }
        return class300;
    }

    static final void method821(int i) {
        Component9.aClass60_4139.clear(0);
        int i_16_ = -67 / ((i - 39) / 33);
        anInt1459++;
    }

    final void method822(byte i) {
        synchronized (aClass60_1449) {
            aClass60_1449.clear(0);
        }
        if (i >= -13) method825(14);
        anInt1452++;
    }

    final DisplayModeManagerContainer50 method823(int i, int i_17_, int i_18_, int i_19_, Component361 class25, int i_20_) {
        anInt1453++;
        DisplayModeManagerContainer365[] class72s = null;
        Component189 class300 = method820(i_20_, 29);
        if (i_19_ > -36) return null;
        if (class300.values != null) {
            class72s = new DisplayModeManagerContainer365[class300.values.length];
            for (int i_21_ = 0; class72s.length > i_21_; i_21_++) {
                PauseTimer class38 = class25.method301((class300.values[i_21_]), 29);
                class72s[i_21_] = new DisplayModeManagerContainer365(class38.anInt498, class38.anInt504, class38.anInt499, class38.anInt502, class38.anInt508, class38.anInt501, class38.anInt503, class38.aBoolean507);
            }
        }
        return new DisplayModeManagerContainer50(class300.defaultValue, class72s, class300.paddingOpcode, i_18_, i, i_17_);
    }

    static final void method824(int i) {
        Canvas_Sub1.anInt67 = i;
        for (int i_22_ = 0; i_22_ < StaticElementRenderer.anInt6451; i_22_++) {
            for (int i_23_ = 0; i_23_ < NodeSub41.anInt7054; i_23_++) {
                if (Component335.aClass357ArrayArrayArray2029[i][i_22_][i_23_] == null) Component335.aClass357ArrayArrayArray2029[i][i_22_][i_23_] = new Component186(i);
            }
        }
    }

    public static void method825(int i) {
        anIntArray1450 = null;
        if (i > -73) anIntArray1450 = null;
    }

    static final void method826(int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, GraphicsToolkit var_ha) {
        if ((RadixParser.aClass105_2309 == null || RSARequest.aClass105_9658 == null || RSARequest.aClass105_9659 == null) && Component158.aClass45_322.isSingletonFileReady(false, DisplayModeManagerContainer58.anInt10257) && Component158.aClass45_322.isSingletonFileReady(false, Component55.anInt3937) && Component158.aClass45_322.isSingletonFileReady(false, NpcComposition.anInt1387)) {
            Component170 class207 = Component170.method1521(Component158.aClass45_322, Component55.anInt3937, 0);
            RSARequest.aClass105_9658 = var_ha.method3691(class207, true);
            class207.method1518();
            DisplayModeManagerContainer74.aClass105_4808 = var_ha.method3691(class207, true);
            RadixParser.aClass105_2309 = (var_ha.method3691(Component170.method1521(Component158.aClass45_322, DisplayModeManagerContainer58.anInt10257, 0), true));
            Component170 class207_29_ = Component170.method1521(Component158.aClass45_322, NpcComposition.anInt1387, 0);
            RSARequest.aClass105_9659 = var_ha.method3691(class207_29_, true);
            class207_29_.method1518();
            Component338.aClass105_1706 = var_ha.method3691(class207_29_, true);
        }
        anInt1454++;
        if (RadixParser.aClass105_2309 != null && RSARequest.aClass105_9658 != null && RSARequest.aClass105_9659 != null) {
            int i_30_ = (-(RSARequest.aClass105_9659.method971() * 2) + i_25_) / RadixParser.aClass105_2309.method971();
            for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
                RadixParser.aClass105_2309.drawAt(i_24_ + (RSARequest.aClass105_9659.method971() - -(i_31_ * RadixParser.aClass105_2309.method971())), -RadixParser.aClass105_2309.method969() + (i_28_ + i_26_));
            int i_32_ = ((i_26_ - (i + RSARequest.aClass105_9659.method969())) / RSARequest.aClass105_9658.method969());
            for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
                RSARequest.aClass105_9658.drawAt(i_24_, (RSARequest.aClass105_9658.method969() * i_33_ + (i_28_ + i)));
                DisplayModeManagerContainer74.aClass105_4808.drawAt(-DisplayModeManagerContainer74.aClass105_4808.method971() + i_25_ + i_24_, (RSARequest.aClass105_9658.method969() * i_33_ + i + i_28_));
            }
            RSARequest.aClass105_9659.drawAt(i_24_, (-RSARequest.aClass105_9659.method969() + i_28_ + i_26_));
            Component338.aClass105_1706.drawAt(i_24_ + (i_25_ + -RSARequest.aClass105_9659.method971()), i_28_ - (-i_26_ + RSARequest.aClass105_9659.method969()));
        }
        int i_34_ = -24 % ((i_27_ - 85) / 35);
    }

    DisplayModeManagerContainer26(GameType class230, int i, CacheStore class45) {
        try {
            aClass45_1460 = class45;
            aClass45_1460.getFileCount(0, 29);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("lca.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ')'));
        }
    }
}
