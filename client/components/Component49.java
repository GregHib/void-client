/* Component49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component49
/**
 * RENAMED from `Class240` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ implements Interface1 {
        /** World-map Helvetica glyph cache at 30pt (largest ladder). */
    static FontGlyphCache helveticaGlyphs30;
    static float aFloat4673;
    /**
     * Client FSM state (title / lobby / world / …). Examples used in-tree:
     * 3 title, 5–6 connecting, 7 lobby/chat-ish, 10–11 world, 12–14 logout/error.
     * Prefer {@link Component72#localPlayer}{@code != null} for “in world” checks.
     */
    static int clientState = 0;
    static int anInt4675;
    static int anInt4676;
    static int anInt4677;
    static int anInt4678;
    static Component24[] aClass105Array4679;
    static int anInt4680;
    static int anInt4681;
    private final NewsFetcher aClass339_4682;
    static long aLong4683;
    static BitmapFont aClass324_4684;
    private final Component15 aClass125_4685;
    static int anInt4686;

    public final boolean method8(byte i) {
        anInt4678++;
        int i_0_ = -50 / ((25 - i) / 52);
        return aClass339_4682.method2668(-21913);
    }

    static final void method1852(int i, int i_1_, int i_2_, int i_3_) {
        Component186 class357 = Component335.aClass357ArrayArrayArray2029[i][i_1_][i_2_];
        if (class357 != null) {
            Component203 class318_sub1_sub5 = class357.aClass318_Sub1_Sub5_4395;
            Component203 class318_sub1_sub5_4_ = class357.aClass318_Sub1_Sub5_4407;
            if (class318_sub1_sub5 != null) {
                class318_sub1_sub5.aShort8781 = (short) ((class318_sub1_sub5.aShort8781) * i_3_ / (16 << Component149.anInt4459 - 7));
                class318_sub1_sub5.aShort8769 = (short) ((class318_sub1_sub5.aShort8769) * i_3_ / (16 << Component149.anInt4459 - 7));
            }
            if (class318_sub1_sub5_4_ != null) {
                class318_sub1_sub5_4_.aShort8781 = (short) ((class318_sub1_sub5_4_.aShort8781) * i_3_ / (16 << Component149.anInt4459 - 7));
                class318_sub1_sub5_4_.aShort8769 = (short) ((class318_sub1_sub5_4_.aShort8769) * i_3_ / (16 << Component149.anInt4459 - 7));
            }
        }
    }

    public static void method1853(byte i) {
        aClass105Array4679 = null;
        if (i != 48) clientState = -62;
        helveticaGlyphs30 = null;
        aClass324_4684 = null;
    }

    static final int method1854(int i, int i_5_, boolean bool, int i_6_) {
        if (i < 45) method1852(83, 33, 101, -55);
        anInt4681++;
        NodeSub13 class348_sub13 = AbstractGlTextureSub4.getContainerNode((byte) 37, i_5_, bool);
        if (class348_sub13 == null) return 0;
        if (i_6_ < 0 || i_6_ >= class348_sub13.amounts.length) return 0;
        return class348_sub13.amounts[i_6_];
    }

    public final void method7(int i) {
        if (i == 10286) anInt4675++;
    }

    public final void method9(byte i, boolean bool) {
        anInt4676++;
        DisplayModeManagerContainer61 class295 = aClass339_4682.method2667(false, aClass125_4685.anInt4918);
        if (class295 != null) {
            int i_7_ = ((aClass125_4685.aClass221_4922.method1607(DisplayModeManagerContainer23.canvasWidth, aClass125_4685.anInt4929, (byte) -118)) - -aClass125_4685.anInt4924);
            int i_8_ = ((aClass125_4685.aClass341_4925.getAlignedOffset(GlToolkitSub2.canvasHeight, aClass125_4685.anInt4923, i ^ ~0x60b)) - -aClass125_4685.anInt4920);
            if (aClass125_4685.aBoolean4914) NodeSub8.toolkit.fillRect3D(i_7_, i_8_, aClass125_4685.anInt4929, aClass125_4685.anInt4923, aClass125_4685.anInt4917, 0);
            i_8_ += method1855(5, class295.aString3756, true, NodeList.aClass324_3326, i_7_, i_8_) * 12;
            i_8_ += 8;
            if (aClass125_4685.aBoolean4914) NodeSub8.toolkit.drawColoredRect(i_7_, i_8_, i_7_ + aClass125_4685.anInt4929 + -1, i_8_, aClass125_4685.anInt4917, 0);
            i_8_ = ++i_8_ + method1855(5, class295.aString3754, true, NodeList.aClass324_3326, i_7_, i_8_) * 12;
            i_8_ += 5;
            i_8_ += method1855(5, class295.aString3758, true, NodeList.aClass324_3326, i_7_, i_8_) * 12;
        }
        if (i != -49) method8((byte) 12);
    }

    private final int method1855(int i, String string, boolean bool, BitmapFont class324, int i_9_, int i_10_) {
        try {
            if (bool != true) return -62;
            anInt4677++;
            return (class324.method2584(null, 0, aClass125_4685.anInt4928, null, aClass125_4685.anInt4913, 0, -(i * 2) + aClass125_4685.anInt4923, null, i + i_10_, 0, 0, -(i * 2) + aClass125_4685.anInt4929, i_9_ + i, false, 0, string));
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ta.A(" + i + ',' + (string != null ? "{...}" : "null") + ',' + bool + ',' + (class324 != null ? "{...}" : "null") + ',' + i_9_ + ',' + i_10_ + ')'));
        }
    }

    Component49(NewsFetcher class339, Component15 class125) {
        try {
            aClass125_4685 = class125;
            aClass339_4682 = class339;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ta.<init>(" + (class339 != null ? "{...}" : "null") + ',' + (class125 != null ? "{...}" : "null") + ')'));
        }
    }
}
