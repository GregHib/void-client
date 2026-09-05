/* Component29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component29
/**
 * RENAMED from `Class318_Sub1_Sub3_Sub2` (JODE-obfuscated).
 * Evidence: subclass of Component327 (hierarchy)
 */ extends Component327 implements Interface10 {
    static int anInt10038;
    static int anInt10039;
    static int anInt10040;
    static int anInt10041;
    static int anInt10042;
    static int anInt10043;
    static int anInt10044;
    Component366 aClass235_10045;
    static boolean aBoolean10046 = false;
    static int anInt10047;
    static int anInt10048;
    static int anInt10049;
    static int anInt10050;
    private ComponentDownloader aClass30_10051;
    static int anInt10052;
    static int anInt10053;
    static int anInt10054;
    private boolean aBoolean10055 = false;
    private final boolean aBoolean10056;
    static int anInt10057;
    static int anInt10058;
    static int anInt10059;
    static int anInt10060;
    static int anInt10061;

    final boolean method2376(int i) {
        anInt10041++;
        if (i > -12) return false;
        return false;
    }

    Component29(GraphicsToolkit var_ha, ObjectDefinition class51, int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
        super(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, class51.anInt895 == 1, Component7.method1606(i_9_, -27939, i_8_));
        try {
            this.aClass235_10045 = new Component366(var_ha, class51, i_8_, i_9_, this.plane, i_0_, this, bool, i_10_);
            aBoolean10056 = class51.anInt874 != 0 && !bool;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("fea.<init>(" + (var_ha != null ? "{...}" : "null") + ',' + (class51 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + bool + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
        }
    }

    final int method2379(int i) {
        if (i != -25675) return -125;
        anInt10061++;
        return this.aClass235_10045.method1664(i ^ 0x6462);
    }

    final boolean method2388(int i) {
        anInt10050++;
        if (i > -65) return false;
        return false;
    }

    public final void method40(int i) {
        anInt10048++;
        if (i != -12031) this.aClass235_10045 = null;
    }

    final boolean method2391(GraphicsToolkit var_ha, int i, int i_11_, int i_12_) {
        anInt10040++;
        DisplayModeManagerContainer370 class64 = this.aClass235_10045.method1668(false, false, i_12_ + -127, 131072, var_ha);
        if (class64 == null) return false;
        if (i_12_ != 0) return false;
        DisplayModeManagerContainer204 class101 = var_ha.method3705();
        class101.method894(this.x, this.anInt6382, this.y);
        if (!DisplayModeManagerContainer50.aBoolean3870) return class64.isInFrustumExtended(i_11_, i, class101, false, 0);
        return class64.isInFrustumExt(i_11_, i, class101, false, 0, Component72.anInt1906);
    }

    public final int method41(int i) {
        if (i != -32228) aClass30_10051 = null;
        anInt10044++;
        return (this.aClass235_10045.anInt3052);
    }

    final ComponentDownloader method2381(GraphicsToolkit var_ha, int i) {
        anInt10053++;
        if (i != 7) return null;
        return aClass30_10051;
    }

    final boolean method2377(byte i) {
        anInt10052++;
        if (i != 122) method41(-49);
        return aBoolean10055;
    }

    public final void method43(GraphicsToolkit var_ha, int i) {
        anInt10049++;
        if (i != -14218) aClass30_10051 = null;
        this.aClass235_10045.method1674(-1, var_ha);
    }

    final RenderableSub4 method2386(int i, GraphicsToolkit var_ha) {
        anInt10057++;
        DisplayModeManagerContainer370 class64 = this.aClass235_10045.method1668(false, true, -127, 2048, var_ha);
        if (class64 == null) return null;
        DisplayModeManagerContainer204 class101 = var_ha.method3705();
        class101.method894(this.x, this.anInt6382, this.y);
        RenderableSub4 class318_sub4 = OutputStream_Sub2.method136(i, aBoolean10056, false);
        this.aClass235_10045.method1670(this.aShort8751, class101, this.aShort8747, var_ha, this.aShort8743, class64, true, (byte) -73, this.aShort8750);
        if (!DisplayModeManagerContainer50.aBoolean3870) class64.render(class101, (class318_sub4.aClass318_Sub3Array6414[0]), 0);
        else class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414[0]), Component72.anInt1906, 0);
        if ((this.aClass235_10045.aClass318_Sub10_3081) != null) {
            Component122 class98 = this.aClass235_10045.aClass318_Sub10_3081.method2525();
            if (DisplayModeManagerContainer50.aBoolean3870) var_ha.method3685(class98, Component72.anInt1906);
            else var_ha.method3684(class98);
        }
        aBoolean10055 = class64.F() || (this.aClass235_10045.aClass318_Sub10_3081) != null;
        if (aClass30_10051 != null) ItemDefinitionProvider.method1935(this.y, this.anInt6382, aClass30_10051, class64, false, this.x);
        else aClass30_10051 = (OggUrlStream.method2967(this.x, class64, this.y, this.anInt6382, 2));
        return class318_sub4;
    }

    public final int method39(int i) {
        anInt10058++;
        int i_13_ = -40 / ((i - -91) / 35);
        return (this.aClass235_10045.anInt3079);
    }

    final void method2392(boolean bool) {
        if (bool == true) {
            anInt10060++;
            throw new IllegalStateException();
        }
    }

    public final int method42(int i) {
        anInt10042++;
        if (i >= -62) method2377((byte) 97);
        return (this.aClass235_10045.anInt3063);
    }

    public final void method44(int i, GraphicsToolkit var_ha) {
        if (i != 836) method44(-65, null);
        anInt10059++;
        this.aClass235_10045.method1667((byte) 116, var_ha);
    }

    final void method2380(GraphicsToolkit var_ha, int i, boolean bool, RenderableObject class318_sub1, int i_14_, byte i_15_, int i_16_) {
        try {
            anInt10054++;
            if (i_15_ >= -106) method44(97, null);
            throw new IllegalStateException();
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("fea.N(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (class318_sub1 != null ? "{...}" : "null") + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ')'));
        }
    }

    public final boolean method38(int i) {
        if (i != -18443) return true;
        anInt10043++;
        return this.aClass235_10045.method1665(2);
    }

    final void method2387(GraphicsToolkit var_ha, int i) {
        anInt10039++;
        DisplayModeManagerContainer370 class64 = this.aClass235_10045.method1668(true, true, -127, 262144, var_ha);
        if (class64 != null) {
            DisplayModeManagerContainer204 class101 = var_ha.method3705();
            class101.method894(this.x, this.anInt6382, this.y);
            this.aClass235_10045.method1670(this.aShort8751, class101, this.aShort8747, var_ha, this.aShort8743, class64, false, (byte) -73, this.aShort8750);
        }
        if (i >= -125) method2380(null, -30, false, null, 74, (byte) -52, 38);
    }

    final int method2394(boolean bool) {
        if (bool != true) return 68;
        anInt10038++;
        return this.aClass235_10045.method1663(80);
    }
}
