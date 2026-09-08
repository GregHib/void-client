/* Component289 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component289
/**
 * RENAMED from `Class318_Sub1_Sub5_Sub1` (JODE-obfuscated).
 * Evidence: subclass of Component203 (hierarchy)
 */ extends Component203 implements Interface10 {
    private final byte aByte10118;
    static int anInt10119;
    static double aDouble10120;
    static int anInt10121;
    static int anInt10122;
    static int anInt10123;
    private DisplayModeManagerContainer370 aClass64_10124;
    static NodeList aClass262_10125 = new NodeList();
    static int anInt10126;
    private ComponentDownloader aClass30_10127;
    private r aR10128;
    private final short aShort10129;
    private boolean aBoolean10130;
    static int anInt10131;
    static int anInt10132;
    static int anInt10133;
    static StringCache aClass351_10134 = new StringCache(62, 3);
    static int anInt10135;
    static int anInt10136;
    private boolean aBoolean10137;
    private boolean aBoolean10138;
    static int anInt10139;
    static int anInt10140;
    static int anInt10141;
    static int anInt10142;
    static int anInt10143;
    static int anInt10144;
    private byte aByte10145;
    static int anInt10146;
    static int anInt10147;

    private final DisplayModeManagerContainer370 method2488(int i, int i_0_, GraphicsToolkit var_ha) {
        if (i_0_ != 0) return null;
        anInt10126++;
        if (aClass64_10124 != null && var_ha.method3667(aClass64_10124.ua(), i) == 0) return aClass64_10124;
        Component245 class2 = method2491((byte) -51, false, i, var_ha);
        if (class2 == null) return null;
        return class2.aClass64_119;
    }

    static final int method2489(byte i) {
        anInt10135++;
        if (Component364.aBoolean8335) return 6;
        if (Component192.menuTip == null) return 0;
        if (i >= -11) return -42;
        int i_1_ = (Component192.menuTip.opcode);
        if (Component66.isInterfaceItemOpcode(80, i_1_)) return 1;
        if (Component3.method1197(-12081, i_1_)) return 2;
        if (Component71.method1813(8806, i_1_)) return 3;
        if (WaterShaderSub8.method3549(i_1_, (byte) 126)) return 4;
        return 5;
    }

    final RenderableSub4 method2386(int i, GraphicsToolkit var_ha) {
        anInt10122++;
        if (aClass64_10124 == null) return null;
        DisplayModeManagerContainer204 class101 = var_ha.method3705();
        class101.method894((this.x - -this.aShort8781), this.anInt6382, (this.y - -this.aShort8769));
        RenderableSub4 class318_sub4 = OutputStream_Sub2.method136(i, aBoolean10130, false);
        if (DisplayModeManagerContainer50.aBoolean3870) aClass64_10124.method608(class101, (class318_sub4.aClass318_Sub3Array6414[0]), Component72.anInt1906, 0);
        else aClass64_10124.render(class101, (class318_sub4.aClass318_Sub3Array6414[0]), 0);
        return class318_sub4;
    }

    public final void method40(int i) {
        if (i != -12031) aByte10145 = (byte) -104;
        anInt10147++;
        if (aClass64_10124 != null) aClass64_10124.prepareFrame();
    }

    final boolean method2377(byte i) {
        if (i != 122) aBoolean10137 = false;
        anInt10131++;
        if (aClass64_10124 != null) return aClass64_10124.F();
        return false;
    }

    public final int method42(int i) {
        anInt10143++;
        if (i >= -62) method39(-120);
        return 0xffff & aShort10129;
    }

    public static void method2490(int i) {
        aClass351_10134 = null;
        if (i != 4) method2490(-26);
        aClass262_10125 = null;
    }

    final int method2379(int i) {
        anInt10123++;
        if (i != -25675) aClass64_10124 = null;
        if (aClass64_10124 != null) return aClass64_10124.ma();
        return 0;
    }

    final boolean method2391(GraphicsToolkit var_ha, int i, int i_2_, int i_3_) {
        anInt10119++;
        DisplayModeManagerContainer370 class64 = method2488(131072, i_3_, var_ha);
        if (class64 != null) {
            DisplayModeManagerContainer204 class101 = var_ha.method3705();
            class101.method894(this.x, this.anInt6382, this.y);
            if (DisplayModeManagerContainer50.aBoolean3870) return class64.isInFrustumExt(i_2_, i, class101, false, 0, Component72.anInt1906);
            return class64.isInFrustumExtended(i_2_, i, class101, false, 0);
        }
        return false;
    }

    final boolean method2376(int i) {
        anInt10136++;
        if (i > -12) return false;
        if (aClass64_10124 != null) {
            return !aClass64_10124.r();
        }
        return true;
    }

    public final int method39(int i) {
        anInt10141++;
        int i_4_ = -57 % ((-91 - i) / 35);
        return aByte10145;
    }

    public final void method43(GraphicsToolkit var_ha, int i) {
        if (i != -14218) aClass30_10127 = null;
        anInt10144++;
        Object object = null;
        r var_r;
        if (aR10128 != null || !aBoolean10137) {
            var_r = aR10128;
            aR10128 = null;
        } else {
            Component245 class2 = method2491((byte) -51, true, 262144, var_ha);
            var_r = class2 == null ? null : class2.aR118;
        }
        if (var_r != null) RequestProcessor.method1301(var_r, this.aByte6376, this.x, this.y, null);
    }

    final void method2387(GraphicsToolkit var_ha, int i) {
        if (i < -125) anInt10133++;
    }

    public final void method44(int i, GraphicsToolkit var_ha) {
        anInt10121++;
        Object object = null;
        r var_r;
        if (aR10128 == null && aBoolean10137) {
            Component245 class2 = method2491((byte) -51, true, 262144, var_ha);
            var_r = class2 == null ? null : class2.aR118;
        } else {
            var_r = aR10128;
            aR10128 = null;
        }
        if (var_r != null) Component387.method1130(var_r, this.aByte6376, this.x, this.y, null);
        if (i != 836) method2391(null, -123, 0, -64);
    }

    final ComponentDownloader method2381(GraphicsToolkit var_ha, int i) {
        if (i != 7) method2381(null, -71);
        if (aClass30_10127 == null) aClass30_10127 = (OggUrlStream.method2967(this.x, method2488(0, 0, var_ha), this.y, this.anInt6382, 2));
        anInt10140++;
        return aClass30_10127;
    }

    private final Component245 method2491(byte i, boolean bool, int i_5_, GraphicsToolkit var_ha) {
        if (i != -51) aClass262_10125 = null;
        anInt10142++;
        ObjectDefinition class51 = GradientPreset.aClass263_9195.getObjectDefinition(0, 0xffff & aShort10129);
        s var_s;
        s var_s_6_;
        if (aBoolean10138) {
            var_s = Component9.aSArray4142[this.aByte6376];
            var_s_6_ = NodeSub1Sub1.aSArray8801[0];
        } else {
            var_s = (NodeSub1Sub1.aSArray8801[this.aByte6376]);
            if (this.aByte6376 < 3) var_s_6_ = (NodeSub1Sub1.aSArray8801[this.aByte6376 - -1]);
            else var_s_6_ = null;
        }
        return class51.buildLocationModel(var_ha, var_s_6_, aByte10145, i_5_, this.x, bool, var_s, this.anInt6382, this.y, aByte10118, 128);
    }

    final int method2394(boolean bool) {
        if (bool != true) aBoolean10138 = false;
        anInt10139++;
        if (aClass64_10124 != null) return aClass64_10124.fa();
        return 0;
    }

    Component289(GraphicsToolkit var_ha, ObjectDefinition class51, int i, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool, int i_11_, int i_12_, int i_13_, int i_14_) {
        super(i_8_, i_9_, i_10_, i, i_7_, i_11_, i_12_);
        do {
            try {
                aBoolean10130 = class51.anInt874 != 0 && !bool;
                aByte10145 = (byte) i_13_;
                aShort10129 = (short) class51.anInt941;
                this.y = i_10_;
                aBoolean10138 = bool;
                this.x = i_8_;
                aByte10118 = (byte) i_14_;
                aBoolean10137 = (var_ha.method3682() && class51.aBoolean894 && !aBoolean10138 && Component192.preferences.aClass239_Sub7_7238.method1748(-32350) != 0);
                Component245 class2 = method2491((byte) -51, aBoolean10137, 2048, var_ha);
                if (class2 == null) break;
                aClass64_10124 = class2.aClass64_119;
                aR10128 = class2.aR118;
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("co.<init>(" + (var_ha != null ? "{...}" : "null") + ',' + (class51 != null ? "{...}" : "null") + ',' + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + bool + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
            }
            break;
        } while (false);
    }

    public final int method41(int i) {
        if (i != -32228) aBoolean10130 = true;
        anInt10146++;
        return aByte10118;
    }

    public final boolean method38(int i) {
        anInt10132++;
        if (i != -18443) aClass30_10127 = null;
        return aBoolean10137;
    }
}
