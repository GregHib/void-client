/* GraphicsToolkit - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `GraphicsToolkit` (JODE-obfuscated).
 * Abstract rendering toolkit. Base interface for all graphics backends (OpenGL/D3D/software). Declares the abstract draw/rasterize/texture methods implemented by concrete toolkits such as OpenGLToolkit.
 */

import java.awt.*;
import java.util.Random;

abstract class GraphicsToolkit {
    static int anInt4561;
    static int anInt4562;
    static int anInt4563;
    static int anInt4564;
    static int anInt4565;
    static int anInt4566;
    int anInt4567;
    static int anInt4568;
    static int anInt4569;
    static int anInt4570;
    static StringCache aClass351_4571;
    static int anInt4572;
    static int anInt4573;
    static int anInt4574;
    static int anInt4575;
    static int anInt4576;
    static int anInt4577;
    /** Friend world ids (0 = offline). */
    static int[] friendWorldIds = new int[200];
    d modelProvider;
    static int anInt4580;
    static int anInt4581;
    static float aFloat4582;
    static int anInt4583;

    abstract Interface13 method3624(int i, int i_0_);

    abstract void b(int i, int i_1_, int i_2_, int i_3_, double d);

    abstract DisplayModeManagerContainer370 method3625(DisplayModeManagerContainer77 class124, int i, int i_4_, int i_5_, int i_6_);

    abstract void F(int i, int i_7_);

    abstract void swapBuffers(int i, int i_8_) throws Exception_Sub1;

    abstract boolean method3627();

    abstract void fillRect3D(int x, int y, int z, int w, int u, int v);

    abstract Component24 method3629(int i, int i_14_, boolean bool);

    abstract int[] Y();

    abstract void method3630(boolean bool);

    abstract int E();

    abstract int I();

    abstract void setTextureUnitCount(int i);

    abstract void method3632(int[] is);

    abstract void X(int i);

    /**
     * Obfuscated short renamed incorrectly during class rename (was not DualToolkit).
     * OpenGLToolkit implements this as {@code native} — keep name for JNI binding.
     */
    abstract void DualToolkit(float f);

    abstract void finish();

    /**
     * Obfuscated short renamed incorrectly during class rename (was not NativeHandle).
     * OpenGLToolkit implements this as {@code native} — keep name for JNI binding.
     */
    abstract void NativeHandle();

    abstract Interface4 method3634(Interface3 interface3, Interface13 interface13);

    final void method3635(byte i) {
        int i_15_ = -90 % ((i - 8) / 33);
        anInt4573++;
        DefinitionSub26.aBooleanArray9351[this.anInt4567] = false;
        release();
    }

    abstract void drawTexturedRect(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, Shader var_aa, int i_21_, int i_22_);

    abstract Component6 c();//c

    abstract void loadModelviewMatrix(DisplayModeManagerContainer204 class101);

    /**
     * Obfuscated short renamed incorrectly during class rename (was not ShaderImpl).
     * OpenGLToolkit implements this as {@code native} — keep name for JNI binding.
     */
    abstract int[] ShaderImpl(int i, int i_23_, int i_24_, int i_25_);

    abstract int r(int i, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_);

    abstract void DA(int i, int i_32_, int i_33_, int i_34_);

    abstract boolean method3639();

    abstract DisplayModeManagerContainer204 method3640();

    static final void method3641(int i, int i_35_, byte i_36_, int i_37_, int i_38_, int i_39_) {
        anInt4575++;
        if (i_36_ != -75) anInt4581 = 73;
        if (i_35_ == i_38_) Component296.method1116(i, i_37_, i_39_, i_38_, (byte) -99);
        else if (Component27.anInt4960 <= i_39_ + -i_38_ && Component22.anInt1745 >= i_39_ - -i_38_ && -i_35_ + i >= Component72.anInt1910 && PauseTimer.anInt513 >= i + i_35_) JagTheoraDecoder.method515(i_37_, i_39_, i, i_35_, i_38_, -122);
        else Component139.method1839(i_39_, i_35_, i, i_36_ ^ 0x4a, i_37_, i_38_);
    }

    abstract void method3642(int i, NodeSub1[] class348_sub1s);

    abstract void method3643(Canvas canvas, int i, int i_40_);

    abstract boolean method3644();

    final void method3645(int i, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_) {
        anInt4563++;
        drawColoredRect(i_41_, i, i_42_, i_45_, i_44_, 1);
        if (i_43_ != -8003) method3665(75, 67);
    }

    abstract void method3646(int i);

    abstract void method3647(boolean bool);

    abstract s method3648(int i, int i_46_, int[][] is, int[][] is_47_, int i_48_, int i_49_, int i_50_);

    final void method3649(byte i, int i_51_, int i_52_, int i_53_, int i_54_) {
        anInt4569++;
        if (i < -67) U(i_54_, i_52_, i_51_, i_53_, 1);
    }

    abstract void method3650(int i);

    abstract void method3651(NodeBase var_za);

    abstract void P(int i, int i_55_, int i_56_, int i_57_, int i_58_);

    abstract void release();

    abstract void NodeBase(int i, int i_59_, int i_60_, int i_61_, int i_62_);

    abstract void method3653(Component80 class299);

    abstract DisplayModeManagerContainer204 method3654();

    abstract int JA(int i, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_);

    abstract int i();

    abstract boolean method3655();

    final void method3656(byte i, int i_68_, int i_69_, int i_70_, int i_71_) {
        anInt4580++;
        NodeBase(i_70_, i_71_, i_69_, i_68_, 1);
        if (i >= -97) aFloat4582 = 0.37843478F;
    }

    abstract void L(int i, int i_72_, int i_73_);

    final void method3657(Rectangle[] rectangles, int i, int i_74_) throws Exception_Sub1 {
        method3707(rectangles, i, 0, 0);
        anInt4568++;
        if (i_74_ <= 41) this.anInt4567 = 54;
    }

    abstract void f(int i, int i_75_);

    abstract void la();

    abstract void method3658(int i, int i_76_, int i_77_, int i_78_);

    abstract void resetTextureState(int i);

    final void method3660(int i, int i_79_, int i_80_, int i_81_, boolean bool) {
        if (bool != true) H(-122, 91, -22, null);
        anInt4570++;
        P(i, i_81_, i_80_, i_79_, 1);
    }

    abstract Shader method3661(int i, int i_82_, int[] is, int[] is_83_);

    final Component24 method3662(int i, int[] is, byte i_84_, int i_85_, int i_86_, int i_87_) {
        anInt4565++;
        if (i_84_ != 94) return null;
        return method3711(is, i_85_, i_86_, i, i_87_, true);
    }

    abstract void method3663();

    static final byte[] method3664(int i, int i_88_) {
        anInt4564++;
        if (i_88_ <= 21) anInt4583 = 60;
        HashNodeSub3 class348_sub42_sub3 = ((HashNodeSub3) NodeSub1Sub2.aClass308_8815.method2302(i, (byte) -120));
        if (class348_sub42_sub3 == null) {
            byte[] is = new byte[512];
            Random random = new Random(i);
            for (int i_89_ = 0; i_89_ < 255; i_89_++)
                is[i_89_] = (byte) i_89_;
            for (int i_90_ = 0; i_90_ < 255; i_90_++) {
                int i_91_ = -i_90_ + 255;
                int i_92_ = DisplayModeManagerContainer77.method1097((byte) 95, i_91_, random);
                byte i_93_ = is[i_92_];
                is[i_92_] = is[i_91_];
                is[i_91_] = is[511 + -i_90_] = i_93_;
            }
            class348_sub42_sub3 = new HashNodeSub3(is);
            NodeSub1Sub2.aClass308_8815.method2305(i, class348_sub42_sub3, -1);
        }
        return class348_sub42_sub3.aByteArray9499;
    }

    abstract Interface3 method3665(int i, int i_94_);

    abstract void pa();

    abstract boolean method3666();

    abstract void da(int i, int i_95_, int i_96_, int[] is);

    abstract int method3667(int i, int i_97_);

    abstract void Q(int i, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, byte[] is, int i_103_, int i_104_);

    final void method3668(int i, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_) {
        anInt4574++;
        if (i_109_ >= 21) fillRect3D(i_107_, i_105_, i, i_108_, i_106_, 1);
    }

    abstract void HA(int i, int i_110_, int i_111_, int i_112_, int[] is);

    abstract void method3669(Canvas canvas, int i, int i_113_);

    abstract boolean method3670();

    abstract boolean method3671();

    abstract void method3672();

    abstract void copyScreen();

    abstract void drawColoredQuad(int i, int i_114_, int i_115_, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_);

    abstract void EA(int i, int i_122_, int i_123_, int i_124_);

    final void method3675(int i, byte i_125_, int i_126_, int i_127_, int i_128_, int i_129_) {
        if (i_125_ == -125) {
            fillRect2D(i_126_, i_127_, i, i_128_, i_129_, 1);
            anInt4566++;
        }
    }

    abstract void draw3DTriangle(int i, int i_130_, int i_131_, int i_132_, int i_133_, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_, int i_139_, int i_140_, int i_141_);

    abstract void method3677(Canvas canvas);

    abstract void method3678(int i);

    abstract int bitwiseOr(int i, int i_142_);

    public static void method3680(int i) {
        if (i != -24016) friendWorldIds = null;
        friendWorldIds = null;
        aClass351_4571 = null;
    }

    final void method3681(Component24 class105, int i) {
        method3687(method3634(class105, method3624(class105.method971(), class105.method969())));
        anInt4561++;
        if (i != 0) DA(-75, -67, 18, -116);
    }

    abstract boolean method3682();

    abstract Component24 method3683(int i, int i_143_, int i_144_, int i_145_, boolean bool);

    abstract void renderModel(Component122 class98);

    abstract void renderModelEx(Component122 class98, int i);

    abstract void K(int[] is);

    abstract BitmapFont method3686(Component184 class143, Component170[] class207s, boolean bool);

    abstract void H(int i, int i_146_, int i_147_, int[] is);

    abstract void T(int i, int i_148_, int i_149_, int i_150_);

    abstract void ZA(int i, float f, float f_151_, float f_152_, float f_153_, float f_154_);

    abstract void ra(int i, int i_155_, int i_156_, int i_157_);

    abstract int M();

    abstract void C(boolean bool);

    abstract void method3687(Interface4 interface4);

    abstract void setLineWidth(int i, int i_158_, int i_159_, int i_160_, int i_161_, int i_162_, int i_163_);

    final void method3689(byte i) throws Exception_Sub1 {
        swapBuffers(0, 0);
        if (i >= 53) anInt4572++;
    }

    abstract NodeSub1 method3690(int i, int i_164_, int i_165_, int i_166_, int i_167_, float f);

    abstract Component24 method3691(Component170 class207, boolean bool);

    static final synchronized GraphicsToolkit method3692(int i, int i_168_, int i_169_, CacheStore class45, int i_170_, d var_d, Canvas canvas, int i_171_) {
        try {
            anInt4576++;
            if (i_170_ == i_171_) return NodeSub5.method2753(true, i_168_, i_169_, canvas, var_d);
            if (i_171_ == 2) return Component314.createOpenGLToolkit(-6, i_168_, var_d, canvas, i_169_);
            if (i_171_ == 1) return NodeList.method2000(3, i, canvas, var_d);
            if (i_171_ == 5) return ToolkitFactory.createOpenGlToolkit(canvas, var_d, class45, 25542, i);
            if (i_171_ == 3) return ToolkitLoader.createD3DToolkit(i, i_170_ ^ 0x4a31, var_d, class45, canvas);
            throw new IllegalArgumentException("UM");
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ha.TJ(" + i + ',' + i_168_ + ',' + i_169_ + ',' + (class45 != null ? "{...}" : "null") + ',' + i_170_ + ',' + (var_d != null ? "{...}" : "null") + ',' + (canvas != null ? "{...}" : "null") + ',' + i_171_ + ')'));
        }
    }

    abstract boolean method3693();

    abstract boolean method3694();

    abstract boolean method3695();

    abstract void method3696(int i);

    abstract Component80 method3697(int i, int i_172_, int i_173_, int i_174_, int i_175_, int i_176_);

    protected void finalize() {
        method3635((byte) 46);
        anInt4577++;
    }

    abstract void KA(int i, int i_177_, int i_178_, int i_179_);

    abstract void method3698();

    abstract boolean method3699();

    abstract void method3700(float f, float f_180_, float f_181_);

    abstract void A(int i, Shader var_aa, int i_182_, int i_183_);

    abstract void method3701(Canvas canvas);

    abstract NodeBase method3702(int i);

    abstract void drawTexturedQuad(int i, int i_184_, int i_185_, int i_186_, int i_187_, int i_188_, Shader var_aa, int i_189_, int i_190_, int i_191_, int i_192_, int i_193_);

    abstract int method3704();

    abstract DisplayModeManagerContainer204 method3705();

    abstract int XA();

    abstract void U(int i, int i_194_, int i_195_, int i_196_, int i_197_);

    /**
     * Fill a rectangle on the current draw target.
     *
     * @param x      left
     * @param y      top
     * @param width  width in pixels
     * @param height height in pixels
     * @param colour packed ARGB (alpha in high byte; console uses {@code 0x332277 | alpha<<24})
     * @param mode   blend mode (1 = normal translucent fill used by console / Microbot panel)
     */
    abstract void fillRect2D(int x, int y, int width, int height, int colour, int mode);

    abstract void GA(int i);

    abstract Component80 method3706(Component80 class299, Component80 class299_203_, float f, Component80 class299_204_);

    abstract void method3707(Rectangle[] rectangles, int i, int i_205_, int i_206_) throws Exception_Sub1;

    abstract boolean method3708();

    abstract void drawColoredRect(int i, int i_207_, int i_208_, int i_209_, int i_210_, int i_211_);

    abstract void method3710();

    abstract Component24 method3711(int[] is, int i, int i_212_, int i_213_, int i_214_, boolean bool);

    GraphicsToolkit(d var_d) {
        this.modelProvider = var_d;
        int i = -1;
        for (int i_215_ = 0; i_215_ < 8; i_215_++) {
            if (!DefinitionSub26.aBooleanArray9351[i_215_]) {
                DefinitionSub26.aBooleanArray9351[i_215_] = true;
                i = i_215_;
                break;
            }
        }
        if (i == -1) throw new IllegalStateException("NFTI");
        this.anInt4567 = i;
    }

    static {
        aClass351_4571 = new StringCache(73, -1);
    }
}
