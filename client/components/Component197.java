/* Component197 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component197
/**
 * RENAMED from `Class318_Sub1_Sub4_Sub1` (JODE-obfuscated).
 * Evidence: subclass of Component269 (hierarchy)
 */ extends Component269 implements Interface10 {
    private byte aByte10062;
    static int anInt10063;
    private final boolean aBoolean10064;
    static int anInt10065;
    private boolean aBoolean10066;
    static int anInt10067;
    static int anInt10068;
    static int anInt10069;
    static int anInt10070;
    DisplayModeManagerContainer370 aClass64_10071;
    static int anInt10072;
    static int anInt10073;
    static int anInt10074;
    static int anInt10075;
    private final boolean aBoolean10076;
    static int anInt10077;
    static int anInt10078;
    private byte aByte10079;
    static int anInt10080;
    private short aShort10081;
    private ComponentDownloader aClass30_10082;
    static int anInt10083;
    static int anInt10084;
    static int anInt10085;
    static int anInt10086;
    static int anInt10087;
    static int anInt10088;
    static int anInt10089;
    private boolean aBoolean10090;
    static int anInt10091;
    static int anInt10092;
    static int anInt10093;
    private r aR10094;

    Component197(GraphicsToolkit var_ha, ObjectDefinition class51, int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_, int i_5_, boolean bool_6_) {
        super(i_1_, i_2_, i_3_, i, i_0_, ShaderProgramSub9.method2175(i_5_, (byte) -34, i_4_));
        do {
            try {
                aShort10081 = (short) class51.anInt941;
                aBoolean10066 = bool;
                aBoolean10090 = bool_6_;
                this.x = i_1_;
                aBoolean10076 = (class51.anInt874 != 0 && !bool);
                this.y = i_3_;
                aByte10079 = (byte) i_4_;
                aByte10062 = (byte) i_5_;
                aBoolean10064 = (var_ha.method3682() && class51.aBoolean894 && !aBoolean10066 && Component192.preferences.aClass239_Sub7_7238.method1748(-32350) != 0);
                int i_7_ = 2048;
                if (aBoolean10090) i_7_ |= 0x10000;
                Component245 class2 = method2481(aBoolean10064, i_7_, -4, var_ha);
                if (class2 == null) break;
                aR10094 = class2.aR118;
                this.aClass64_10071 = class2.aClass64_119;
                if (!aBoolean10090) break;
                this.aClass64_10071 = this.aClass64_10071.createRenderPass((byte) 0, i_7_, false);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("ge.<init>(" + (var_ha != null ? "{...}" : "null") + ',' + (class51 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + bool + ',' + i_4_ + ',' + i_5_ + ',' + bool_6_ + ')'));
            }
            break;
        } while (false);
    }

    public final int method39(int i) {
        anInt10080++;
        int i_8_ = 69 % ((i - -91) / 35);
        return aByte10079;
    }

    public final void method40(int i) {
        anInt10077++;
        if (this.aClass64_10071 != null) this.aClass64_10071.prepareFrame();
        if (i != -12031) method38(-122);
    }

    final boolean method2391(GraphicsToolkit var_ha, int i, int i_9_, int i_10_) {
        anInt10070++;
        DisplayModeManagerContainer370 class64 = method2482(var_ha, (byte) 126, 131072);
        if (i_10_ != 0) method41(-96);
        if (class64 != null) {
            DisplayModeManagerContainer204 class101 = var_ha.method3705();
            class101.method894(this.x, this.anInt6382, this.y);
            if (DisplayModeManagerContainer50.aBoolean3870) return class64.isInFrustumExt(i_9_, i, class101, false, 0, Component72.anInt1906);
            return class64.isInFrustumExtended(i_9_, i, class101, false, 0);
        }
        return false;
    }

    final void method2387(GraphicsToolkit var_ha, int i) {
        if (i > -125) method42(115);
        anInt10067++;
    }

    public final int method41(int i) {
        anInt10087++;
        if (i != -32228) return 1;
        return aByte10062;
    }

    final void method2392(boolean bool) {
        anInt10091++;
        if (bool != true) method2394(true);
        aBoolean10090 = false;
        if (this.aClass64_10071 != null) this.aClass64_10071.s(this.aClass64_10071.ua() & ~0x10000);
    }

    final ComponentDownloader method2381(GraphicsToolkit var_ha, int i) {
        anInt10075++;
        if (aClass30_10082 == null) aClass30_10082 = (OggUrlStream.method2967(this.x, method2482(var_ha, (byte) 117, 0), this.y, this.anInt6382, i + -5));
        if (i != 7) aBoolean10066 = false;
        return aClass30_10082;
    }

    public final int method42(int i) {
        anInt10088++;
        if (i > -62) return -96;
        return aShort10081 & 0xffff;
    }

    final int method2379(int i) {
        anInt10063++;
        if (i != -25675) aByte10079 = (byte) 53;
        if (this.aClass64_10071 != null) return this.aClass64_10071.ma();
        return 0;
    }

    public final boolean method38(int i) {
        anInt10078++;
        if (i != -18443) aShort10081 = (short) 37;
        return aBoolean10064;
    }

    final void method2380(GraphicsToolkit var_ha, int i, boolean bool, RenderableObject class318_sub1, int i_11_, byte i_12_, int i_13_) {
        try {
            if (i_12_ > -106) method2388(-102);
            if (class318_sub1 instanceof Component197) {
                Component197 class318_sub1_sub4_sub1_14_ = (Component197) class318_sub1;
                if (this.aClass64_10071 != null && (class318_sub1_sub4_sub1_14_.aClass64_10071) != null) this.aClass64_10071.method613(class318_sub1_sub4_sub1_14_.aClass64_10071, i_13_, i, i_11_, bool);
            } else if (class318_sub1 instanceof Component349) {
                Component349 class318_sub1_sub3_sub1 = (Component349) class318_sub1;
                if (this.aClass64_10071 != null && (class318_sub1_sub3_sub1.aClass64_10028) != null) this.aClass64_10071.method613((class318_sub1_sub3_sub1.aClass64_10028), i_13_, i, i_11_, bool);
            }
            anInt10083++;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ge.N(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (class318_sub1 != null ? "{...}" : "null") + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')'));
        }
    }

    public final void method44(int i, GraphicsToolkit var_ha) {
        anInt10092++;
        Object object = null;
        r var_r;
        if (aR10094 == null && aBoolean10064) {
            Component245 class2 = method2481(true, 262144, -4, var_ha);
            var_r = class2 == null ? null : class2.aR118;
        } else {
            var_r = aR10094;
            aR10094 = null;
        }
        if (var_r != null) Component387.method1130(var_r, this.aByte6376, this.x, this.y, null);
        if (i != 836) aR10094 = null;
    }

    private final Component245 method2481(boolean bool, int i, int i_15_, GraphicsToolkit var_ha) {
        if (i_15_ != -4) aClass30_10082 = null;
        anInt10086++;
        ObjectDefinition class51 = GradientPreset.aClass263_9195.getObjectDefinition(0, aShort10081 & 0xffff);
        s var_s;
        s var_s_16_;
        if (aBoolean10066) {
            var_s = NodeSub1Sub1.aSArray8801[0];
            var_s_16_ = Component9.aSArray4142[this.aByte6376];
        } else {
            var_s_16_ = (NodeSub1Sub1.aSArray8801[this.aByte6376]);
            if (this.aByte6376 < 3) var_s = (NodeSub1Sub1.aSArray8801[1 + this.aByte6376]);
            else var_s = null;
        }
        return class51.buildLocationModel(var_ha, var_s, aByte10079, i, this.x, bool, var_s_16_, this.anInt6382, this.y, aByte10062, i_15_ + 132);
    }

    final RenderableSub4 method2386(int i, GraphicsToolkit var_ha) {
        anInt10069++;
        if (this.aClass64_10071 == null) return null;
        DisplayModeManagerContainer204 class101 = var_ha.method3705();
        class101.method894(this.x, this.anInt6382, this.y);
        RenderableSub4 class318_sub4 = OutputStream_Sub2.method136(i, aBoolean10076, false);
        if (!DisplayModeManagerContainer50.aBoolean3870) this.aClass64_10071.render(class101, class318_sub4.aClass318_Sub3Array6414[0], 0);
        else this.aClass64_10071.method608(class101, class318_sub4.aClass318_Sub3Array6414[0], Component72.anInt1906, 0);
        return class318_sub4;
    }

    private final DisplayModeManagerContainer370 method2482(GraphicsToolkit var_ha, byte i, int i_17_) {
        if (i <= 113) method2387(null, -99);
        anInt10072++;
        if (this.aClass64_10071 != null && var_ha.method3667(this.aClass64_10071.ua(), i_17_) == 0) return this.aClass64_10071;
        Component245 class2 = method2481(false, i_17_, -4, var_ha);
        if (class2 != null) return class2.aClass64_119;
        return null;
    }

    final int method2394(boolean bool) {
        anInt10093++;
        if (bool != true) aByte10062 = (byte) -75;
        if (this.aClass64_10071 == null) return 0;
        return this.aClass64_10071.fa();
    }

    final boolean method2388(int i) {
        anInt10089++;
        if (i > -65) return true;
        return aBoolean10090;
    }

    final boolean method2377(byte i) {
        anInt10065++;
        if (i != 122) return true;
        if (this.aClass64_10071 == null) return false;
        return this.aClass64_10071.F();
    }

    final boolean method2376(int i) {
        if (i >= -12) method2388(-68);
        anInt10085++;
        if (this.aClass64_10071 != null) {
            return !this.aClass64_10071.r();
        }
        return true;
    }

    public final void method43(GraphicsToolkit var_ha, int i) {
        if (i != -14218) aClass30_10082 = null;
        anInt10068++;
        Object object = null;
        r var_r;
        if (aR10094 == null && aBoolean10064) {
            Component245 class2 = method2481(true, 262144, -4, var_ha);
            var_r = class2 == null ? null : class2.aR118;
        } else {
            var_r = aR10094;
            aR10094 = null;
        }
        if (var_r != null) RequestProcessor.method1301(var_r, this.aByte6376, this.x, this.y, null);
    }
}
