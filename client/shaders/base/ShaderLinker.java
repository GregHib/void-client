/* ShaderLinker - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class318_Sub1_Sub5_Sub2` (JODE-obfuscated).
 * Shader linker. Links compiled GLSL/ARB shader stages (Component203 subclass implementing Interface10); throws 'aa linking failed:' on link errors.
 */

import jaggl.OpenGL;

final class ShaderLinker extends Component203 implements Interface10 {
    private boolean aBoolean10148 = false;
    static Component183 aClass114_10149 = new Component183(23, 6);
    private ComponentDownloader aClass30_10150;
    static int anInt10151;
    static int anInt10152;
    private boolean aBoolean10153;
    static int anInt10154;
    Component366 aClass235_10155;
    static int anInt10156;
    static int anInt10157;
    static int anInt10158;
    static int anInt10159;
    static int anInt10160;
    static int anInt10161;
    static int anInt10162;
    static int anInt10163;
    static int anInt10164;
    static int anInt10165;
    static int anInt10166;
    static int anInt10167;
    static Component183 aClass114_10168;
    static int anInt10169;
    static int anInt10170;
    static int anInt10171;
    static int[] anIntArray10172 = new int[3];

    public final void method43(GraphicsToolkit var_ha, int i) {
        anInt10151++;
        this.aClass235_10155.method1674(i + 14217, var_ha);
        if (i != -14218) method40(127);
    }

    final int method2394(boolean bool) {
        anInt10157++;
        if (bool != true) aBoolean10153 = false;
        return this.aClass235_10155.method1663(101);
    }

    public final int method41(int i) {
        anInt10170++;
        if (i != -32228) method2387(null, 89);
        return (this.aClass235_10155.anInt3052);
    }

    public final boolean method38(int i) {
        anInt10162++;
        if (i != -18443) aBoolean10148 = false;
        return this.aClass235_10155.method1665(i + 18445);
    }

    public final void method44(int i, GraphicsToolkit var_ha) {
        if (i == 836) {
            this.aClass235_10155.method1667((byte) 116, var_ha);
            anInt10165++;
        }
    }

    public final int method42(int i) {
        anInt10171++;
        if (i > -62) return 40;
        return (this.aClass235_10155.anInt3063);
    }

    final void method2387(GraphicsToolkit var_ha, int i) {
        if (i >= -125) aBoolean10148 = false;
        anInt10154++;
        DisplayModeManagerContainer370 class64 = this.aClass235_10155.method1668(false, true, -127, 262144, var_ha);
        if (class64 != null) {
            int i_0_ = this.x >> 9;
            int i_1_ = this.y >> 9;
            DisplayModeManagerContainer204 class101 = var_ha.method3705();
            class101.method894(this.x, this.anInt6382, this.y);
            this.aClass235_10155.method1670(i_0_, class101, i_1_, var_ha, i_0_, class64, false, (byte) -73, i_1_);
        }
    }

    public final int method39(int i) {
        anInt10161++;
        int i_2_ = -29 % ((-91 - i) / 35);
        return (this.aClass235_10155.anInt3079);
    }

    final boolean method2376(int i) {
        if (i >= -12) return false;
        anInt10166++;
        return false;
    }

    final RenderableSub4 method2386(int i, GraphicsToolkit var_ha) {
        anInt10159++;
        DisplayModeManagerContainer370 class64 = this.aClass235_10155.method1668(false, true, -127, 2048, var_ha);
        if (class64 == null) return null;
        DisplayModeManagerContainer204 class101 = var_ha.method3705();
        class101.method894((this.x + this.aShort8781), this.anInt6382, (this.y + this.aShort8769));
        RenderableSub4 class318_sub4 = OutputStream_Sub2.method136(i, aBoolean10153, false);
        int i_3_ = this.x >> 9;
        int i_4_ = this.y >> 9;
        this.aClass235_10155.method1670(i_3_, class101, i_4_, var_ha, i_3_, class64, true, (byte) -73, i_4_);
        if (!DisplayModeManagerContainer50.aBoolean3870) class64.render(class101, (class318_sub4.aClass318_Sub3Array6414[0]), 0);
        else class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414[0]), Component72.anInt1906, 0);
        if ((this.aClass235_10155.aClass318_Sub10_3081) != null) {
            Component122 class98 = this.aClass235_10155.aClass318_Sub10_3081.method2525();
            if (!DisplayModeManagerContainer50.aBoolean3870) var_ha.method3684(class98);
            else var_ha.method3685(class98, Component72.anInt1906);
        }
        aBoolean10148 = class64.F() || (this.aClass235_10155.aClass318_Sub10_3081) != null;
        if (aClass30_10150 == null) aClass30_10150 = (OggUrlStream.method2967(this.x, class64, this.y, this.anInt6382, 2));
        else ItemDefinitionProvider.method1935(this.y, this.anInt6382, aClass30_10150, class64, false, this.x);
        return class318_sub4;
    }

    final ComponentDownloader method2381(GraphicsToolkit var_ha, int i) {
        anInt10169++;
        if (i != 7) return null;
        return aClass30_10150;
    }

    final boolean method2377(byte i) {
        anInt10158++;
        if (i != 122) return false;
        return aBoolean10148;
    }

    public static void method2492(int i) {
        if (i != 1) anInt10163 = -36;
        aClass114_10149 = null;
        aClass114_10168 = null;
        anIntArray10172 = null;
    }

    ShaderLinker(GraphicsToolkit var_ha, ObjectDefinition class51, int i, int i_5_, int i_6_, int i_7_, int i_8_, boolean bool, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
        super(i_6_, i_7_, i_8_, i, i_5_, i_9_, i_10_);
        try {
            this.aClass235_10155 = new Component366(var_ha, class51, i_11_, i_12_, this.plane, i_5_, this, bool, i_13_);
            aBoolean10153 = class51.anInt874 != 0 && !bool;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("pw.<init>(" + (var_ha != null ? "{...}" : "null") + ',' + (class51 != null ? "{...}" : "null") + ',' + i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + bool + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')'));
        }
    }

    final boolean method2391(GraphicsToolkit var_ha, int i, int i_14_, int i_15_) {
        anInt10152++;
        DisplayModeManagerContainer370 class64 = this.aClass235_10155.method1668(false, false, -128, 131072, var_ha);
        if (class64 == null) return false;
        if (i_15_ != 0) return true;
        DisplayModeManagerContainer204 class101 = var_ha.method3705();
        class101.method894((this.aShort8781 + this.x), this.anInt6382, (this.aShort8769 + this.y));
        if (DisplayModeManagerContainer50.aBoolean3870) return class64.isInFrustumExt(i_14_, i, class101, false, 0, Component72.anInt1906);
        return class64.isInFrustumExtended(i_14_, i, class101, false, 0);
    }

    /** Link ARB program from compiled stages; logs {@code aa linking failed:} on error. */
    static final Component244 linkProgram(GlToolkitSub2 var_ha_Sub2, int i, Component359[] class242s) {
        try {
            anInt10167++;
            for (int i_16_ = 0; i_16_ < class242s.length; i_16_++) {
                if (class242s[i_16_] == null || class242s[i_16_].aLong3156 <= 0L) return null;
            }
            long l = OpenGL.glCreateProgramObjectARB();
            for (int i_17_ = 0; class242s.length > i_17_; i_17_++)
                OpenGL.glAttachObjectARB(l, (class242s[i_17_].aLong3156));
            OpenGL.glLinkProgramARB(l);
            OpenGL.glGetObjectParameterivARB(l, 35714, Component38.anIntArray2509, 0);
            if ((~Component38.anIntArray2509[0]) == i) {
                if (Component38.anIntArray2509[0] == 0) System.out.println("aa linking failed:");
                OpenGL.glGetObjectParameterivARB(l, 35716, Component38.anIntArray2509, 1);
                if (Component38.anIntArray2509[1] > 1) {
                    byte[] is = new byte[Component38.anIntArray2509[1]];
                    OpenGL.glGetInfoLogARB(l, Component38.anIntArray2509[1], Component38.anIntArray2509, 0, is, 0);
                    System.out.println(new String(is));
                }
                if (Component38.anIntArray2509[0] == 0) {
                    for (int i_18_ = 0; class242s.length > i_18_; i_18_++)
                        OpenGL.glDetachObjectARB(l, (class242s[i_18_].aLong3156));
                    OpenGL.glDeleteObjectARB(l);
                    return null;
                }
            }
            return new Component244(var_ha_Sub2, l, class242s);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("pw.D(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + (class242s != null ? "{...}" : "null") + ')'));
        }
    }

    final int method2379(int i) {
        anInt10160++;
        if (i != -25675) aBoolean10153 = false;
        return this.aClass235_10155.method1664(-119);
    }

    public final void method40(int i) {
        if (i == -12031) anInt10156++;
    }

    static {
        aClass114_10168 = new Component183(2, 6);
    }
}
