/* ShaderSub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ShaderSub2
/**
 * RENAMED from `ShaderSub2` (JODE-obfuscated).
 * Evidence: extends Shader (Shader)
 */ extends Shader {
    static int anInt5194;
    static int anInt5195;
    Interface18_Impl3 anInterface18_Impl3_5196;
    /** Ignore-list last display names (update lookup key). */
    static String[] ignoreLastDisplayNames = new String[100];
    static int anInt5198;
    static DisplayModeManagerContainer254 aClass161_5199;

    public static void method162(byte i) {
        ignoreLastDisplayNames = null;
        if (i >= -67) aClass161_5199 = null;
        aClass161_5199 = null;
    }

    static final int method163(int i) {
        anInt5198++;
        if (i != 512) method165(122, 62, -125, 72, -74, 116, 43, (byte) 104, 62, -115);
        return ObjectDefinition.aClass311_897.getPulseCount((byte) -98);
    }

    static final boolean method164(int i, int i_0_, byte i_1_, int i_2_) {
        anInt5195++;
        if (!DefinitionSub23.aBoolean9307 || !Component234.aBoolean351) return false;
        if (Component241.occludedPixelCount < 100) return false;
        int i_3_ = Component160.anIntArrayArrayArray4356[i][i_0_][i_2_];
        if (i_3_ == -RandomAccessFileReader.anInt3049) return false;
        if (RandomAccessFileReader.anInt3049 == i_3_) return true;
        if (Component9.aSArray4142 == ShaderSub1.aSArray5191) return false;
        int i_4_ = i_0_ << Component149.anInt4459;
        int i_5_ = i_2_ << Component149.anInt4459;
        if (i_1_ != -97) method163(-4);
        if ((ShaderProgramSub7.method2169(i_4_ - -1, i_4_ - (-Component148.anInt3465 - -1), 1 + i_5_, 1 + i_4_, -1 + (i_5_ - -Component148.anInt3465), ShaderSub1.aSArray5191[i].getHeight((byte) -86, 1 + i_2_, i_0_), ShaderSub1.aSArray5191[i].getHeight((byte) -86, 1 + i_2_, 1 + i_0_), ShaderSub1.aSArray5191[i].getHeight((byte) -86, i_2_, i_0_), -1 + Component148.anInt3465 + i_5_, false)) && (ShaderProgramSub7.method2169(1 + i_4_, Component148.anInt3465 + (i_4_ + -1), i_5_ + 1, Component148.anInt3465 + (i_4_ - 1), i_5_ + Component148.anInt3465 - 1, ShaderSub1.aSArray5191[i].getHeight((byte) -86, i_2_ - -1, 1 + i_0_), ShaderSub1.aSArray5191[i].getHeight((byte) -86, i_2_, i_0_ + 1), ShaderSub1.aSArray5191[i].getHeight((byte) -86, i_2_, i_0_), 1 + i_5_, false))) {
            DisplayModeManagerContainer64.occludedGroundCount++;
            Component160.anIntArrayArrayArray4356[i][i_0_][i_2_] = RandomAccessFileReader.anInt3049;
            return true;
        }
        Component160.anIntArrayArrayArray4356[i][i_0_][i_2_] = -RandomAccessFileReader.anInt3049;
        return false;
    }

    static final void method165(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, byte i_12_, int i_13_, int i_14_) {
        anInt5194++;
        if (i_9_ < 512 || i_11_ < 512 || (-2 + AbstractShaderSub4.anInt7319) * 512 < i_9_ || (-2 + ParametricDefinition.anInt9109) * 512 < i_11_) Component71.anIntArray6062[0] = Component71.anIntArray6062[1] = -1;
        else if (i_12_ >= 22) {
            int i_15_ = Component300.method2064(i_9_, i, 11219, i_11_) - i_7_;
            if (Component210.gameCanvasAttached) HashTable.method1010(false, true);
            else {
                Component270.aClass101_2123.method891(i_10_, 0, 0);
                NodeSub8.toolkit.method3638(Component270.aClass101_2123);
            }
            if (!DisplayModeManagerContainer50.aBoolean3870) NodeSub8.toolkit.da(i_9_, i_15_, i_11_, Component71.anIntArray6062);
            else NodeSub8.toolkit.HA(i_9_, i_15_, i_11_, Component72.anInt1906, Component71.anIntArray6062);
            if (Component210.gameCanvasAttached) DebugPanicSub1.method2129((byte) 60);
            else {
                Component270.aClass101_2123.method891(-i_10_, 0, 0);
                NodeSub8.toolkit.method3638(Component270.aClass101_2123);
            }
        }
    }

    ShaderSub2(GlToolkitSub3 var_ha_Sub3, int i, int i_16_, byte[] is) {
        try {
            this.anInterface18_Impl3_5196 = var_ha_Sub3.method3944(is, i, DefinitionSub38.aClass304_9471, 2, false, i_16_);
            this.anInterface18_Impl3_5196.method66(false, false, 25688);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("lp.<init>(" + (var_ha_Sub3 != null ? "{...}" : "null") + ',' + i + ',' + i_16_ + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    ShaderSub2(GlToolkitSub3 var_ha_Sub3, int i, int i_17_, int[] is) {
        try {
            this.anInterface18_Impl3_5196 = var_ha_Sub3.method3839(i_17_, i, -15137, false, is);
            this.anInterface18_Impl3_5196.method66(false, false, 25688);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("lp.<init>(" + (var_ha_Sub3 != null ? "{...}" : "null") + ',' + i + ',' + i_17_ + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }
}
