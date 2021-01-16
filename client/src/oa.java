/* oa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.lang.reflect.Method;

final class oa extends ha implements Interface19 {
    private ya aYa5121;
    private static final int[] anIntArray5122 = new int[Math.max(Math.max(104, 20), 24573)];
    long nativeid = 0L;
    private final Class262 aClass262_5123;
    private boolean aBoolean5124 = false;
    private Class101 aClass101_5125;
    private final Class356 aClass356_5126;
    private int anInt5127;
    private int anInt5128;
    private static final float[] aFloatArray5129 = new float[20];
    private static final int[] anIntArray5130;
    private Class101 aClass101_5131;
    static int[] anIntArray5132 = new int[6];
    private static final short[] aShortArray5133;
    private static final byte[] aByteArray5134;
    private static final int[] anIntArray5135;
    private static final int[] anIntArray5136;
    private p aP5137;
    private static final float[] aFloatArray5138;
    private static final int[] anIntArray5139;
    static int[] anIntArray5140;
    int anInt5141;
    private boolean aBoolean5142;
    private a[] anAArray5143;

    private final native void MA(d var_d, int i, int i_0_);

    final void method3628(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        U(i, i_1_, i_2_, i_4_, i_5_);
        U(i, i_1_ + i_3_ - 1, i_2_, i_4_, i_5_);
        P(i, i_1_ + 1, i_3_ - 1, i_4_, i_5_);
        P(i + i_2_ - 1, i_1_ + 1, i_3_ - 1, i_4_, i_5_);
    }

    private final native void ma(long l);

    final Class299 method3697(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
        return null;
    }

    final void method3651(za var_za) {
        aYa5121 = (ya) var_za;
        va(var_za);
    }

    public final native void w(boolean bool);

    final native void A(int i, aa var_aa, int i_11_, int i_12_);

    final native void aa(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_);

    final void method3698() {
        /* empty */
    }

    final void method3707(Rectangle[] rectangles, int i, int i_18_, int i_19_) throws Exception_Sub1 {
        if (aP5137 == null) throw new IllegalStateException("off");
        aP5137.method3434(rectangles, i, i_18_, i_19_);
    }

    final boolean method3708() {
        return true;
    }

    final void method3685(Class98 class98, int i) {
        method3975(class98, false);
        method3973().method155(this, anIntArray5136, anIntArray5135, anIntArray5139, aShortArray5133, class98.aClass88_1569.method840(0));
    }

    final void method3676(int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_) {
        /* empty */
    }

    final void method3663() {
        /* empty */
    }

    final Class105 method3691(Class207 class207, boolean bool) {
        j var_j = new j(this, class207.anIntArray2697, class207.aByteArray2699, class207.aByteArray2695, 0, class207.anInt2702, class207.anInt2702, class207.anInt2696);
        var_j.method985(class207.anInt2703, class207.anInt2700, class207.anInt2698, class207.anInt2701);
        return var_j;
    }

    final native void HA(int i, int i_32_, int i_33_, int i_34_, int[] is);

    final void method3710() {
        /* empty */
    }

    private final native void AA(short i, short i_35_, int i_36_, byte i_37_, byte i_38_, int i_39_, boolean bool, byte i_40_, byte i_41_, byte i_42_, byte i_43_, boolean bool_44_, boolean bool_45_, boolean bool_46_, boolean bool_47_, boolean bool_48_, byte i_49_, boolean bool_50_, boolean bool_51_, int i_52_);

    final void method3696(int i) {
        throw new IllegalStateException();
    }

    final native void H(int i, int i_53_, int i_54_, int[] is);

    private final void g() {//
        System.gc();
        System.runFinalization();
        Class257.method1948((byte) -33);
    }

    final native void b(int i, int i_55_, int i_56_, int i_57_, double d);

    final void method3700(float f, float f_58_, float f_59_) {
        /* empty */
    }

    final Class324 method3686(Class143 class143, Class207[] class207s, boolean bool) {
        int[] is = new int[class207s.length];
        int[] is_60_ = new int[class207s.length];
        boolean bool_61_ = false;
        for (int i = 0; i < class207s.length; i++) {
            is[i] = class207s[i].anInt2702;
            is_60_[i] = class207s[i].anInt2696;
            if (class207s[i].aByteArray2695 != null) bool_61_ = true;
        }
        if (bool) {
            if (bool_61_) throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            return new h(this, aYa5121, class143, class207s, null);
        }
        if (bool_61_) throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        return new n(this, aYa5121, class143, class207s, null);
    }

    private final native void wa(int i, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_);

    final boolean method3644() {
        return true;
    }

    final a method3973() {
        for (int i = 0; i < this.anInt5141; i++) {
            if (anAArray5143[i].aRunnable5112 == Thread.currentThread()) return anAArray5143[i];
        }
        return null;
    }

    private final native void t(p var_p);

    final Class101 method3705() {
        return aClass101_5131;
    }

    private final boolean WA(short i) {//
        synchronized (this.aD4579) {
            if (!this.aD4579.method4(-7953, i)) return false;
            Class12 class12 = this.aD4579.method3(i, -6662);
            if (class12 == null) return false;
            int[] is;
            if (class12.anInt200 != 2) is = this.aD4579.method5(true, i, 0.7F, 128, 128, -128);
            else is = this.aD4579.method6(-21540, 128, 0.7F, i, true, 128);
            CA(i, is, class12.aShort208, class12.anInt200, class12.aByte213, class12.aByte202, class12.anInt206, class12.aBoolean199, class12.aByte201, class12.aByte216, class12.aByte198, class12.aByte211, class12.aBoolean209, class12.aBoolean204, class12.aBoolean212, class12.aBoolean217, class12.aBoolean215, class12.aByte205, class12.aBoolean218, class12.aBoolean207, class12.anInt203);
        }
        return true;
    }

    private final void method3975(Class98 class98, boolean bool) {
        int i = 0;
        int i_67_ = 0;
        int i_68_ = 0;
        int i_69_ = 0;
        int i_70_ = 0;
        for (Class318_Sub9_Sub2 class318_sub9_sub2 = ((Class318_Sub9_Sub2) class98.aClass88_1569.method848(8)); class318_sub9_sub2 != null; class318_sub9_sub2 = ((Class318_Sub9_Sub2) class98.aClass88_1569.method846((byte) -79))) {
            anIntArray5136[i++] = class318_sub9_sub2.anInt8791;
            anIntArray5136[i++] = class318_sub9_sub2.anInt8796;
            anIntArray5136[i++] = class318_sub9_sub2.anInt8789;
            anIntArray5135[i_67_++] = class318_sub9_sub2.anInt8790;
            aShortArray5133[i_69_++] = (short) class318_sub9_sub2.anInt8792;
            anIntArray5139[i_68_++] = class318_sub9_sub2.anInt8793;
            if (bool) aByteArray5134[i_70_++] = class318_sub9_sub2.aByte8795;
        }
    }

    final void method3659(int i) {
        anAArray5143[i].method154();
    }

    final void method3632(int[] is) {
        Dimension dimension = aP5137.aCanvas5147.getSize();
        is[0] = dimension.width;
        is[1] = dimension.height;
    }

    private final native void CA(short i, int[] is, short i_71_, int i_72_, byte i_73_, byte i_74_, int i_75_, boolean bool, byte i_76_, byte i_77_, byte i_78_, byte i_79_, boolean bool_80_, boolean bool_81_, boolean bool_82_, boolean bool_83_, boolean bool_84_, byte i_85_, boolean bool_86_, boolean bool_87_, int i_88_);

    final native void DA(int i, int i_89_, int i_90_, int i_91_);

    final za method3702(int i) {
        ya var_ya = new ya(this, i);
        aClass262_5123.method1999(var_ya, -20180);
        return var_ya;
    }

    final void method3650(int i) {
        anInt5128 = anInt5127 = i;
        if (this.anInt5141 > 1) throw new IllegalStateException("No MT");
        method3631(this.anInt5141);
        method3659(0);
    }

    final int method3667(int i, int i_92_) {
        int i_93_ = i & 0xfffff;
        int i_94_ = i_92_ & 0xfffff;
        return i_93_ & i_94_ ^ i_94_;
    }

    final native void xa(float f);

    final void method3701(Canvas canvas) {
        if (aP5137.aCanvas5147 == canvas) method3677(null);
        p var_p = (p) aClass356_5126.method3480(canvas.hashCode(), -6008);
        if (var_p != null) {
            var_p.method2715((byte) 110);
            var_p.method3436();
        }
    }

    final void method3636(int i, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, aa var_aa, int i_100_, int i_101_) {
        Z(i, i_95_, i_96_, i_97_, i_98_, i_99_, var_aa, i_100_, i_101_);
    }

    protected final synchronized void finalize() {
        this.method3635((byte) -45);
        if (this.nativeid != 0L) Class257.method1947(0, this);
    }

    private final native void d(int i);

    final native int i();

    private final native void n(long l, long l_102_);

    final void method3684(Class98 class98) {
        if (class98.aClass88_1569.method840(0) != 0) {
            method3975(class98, false);
            method3973().method155(this, anIntArray5136, anIntArray5135, anIntArray5139, aShortArray5133, class98.aClass88_1569.method840(0));
        }
    }

    final int method3704() {
        return 4;
    }

    final native int JA(int i, int i_103_, int i_104_, int i_105_, int i_106_, int i_107_);

    final void method3652() {
        if (!aBoolean5124) {
            anAArray5143 = null;
            aP5137 = null;
            aYa5121 = null;
            aClass101_5131 = null;
            aClass356_5126.method3481(0);
            for (ya var_ya = (ya) aClass262_5123.method1995(4); var_ya != null; var_ya = (ya) aClass262_5123.method1990((byte) 36))
                var_ya.ga();
            aClass262_5123.method1996(117);
            FA();
            if (aBoolean5142) {
                Class286_Sub8.method2173(true, -110, false);
                aBoolean5142 = false;
            }
            g();
            Class257.method1946(-108);
            aBoolean5124 = true;
        }
    }

    final void method3669(Canvas canvas, int i, int i_108_) {
        p var_p = (p) aClass356_5126.method3480(canvas.hashCode(), -6008);
        var_p.method3435(canvas, i, i_108_);
        if (canvas != null && canvas == aP5137.aCanvas5147) method3677(canvas);
    }

    private final boolean c(short i) {//
        synchronized (this) {
            Class12 class12 = this.aD4579.method3(i, -6662);
            if (class12 == null) return false;
            AA(i, class12.aShort208, class12.anInt200, class12.aByte213, class12.aByte202, class12.anInt206, class12.aBoolean199, class12.aByte201, class12.aByte216, class12.aByte198, class12.aByte211, class12.aBoolean209, class12.aBoolean204, class12.aBoolean212, class12.aBoolean217, class12.aBoolean215, class12.aByte205, class12.aBoolean218, class12.aBoolean207, class12.anInt203);
        }
        return true;
    }

    final boolean method3666() {
        return false;
    }

    final native void Q(int i, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_, byte[] is, int i_114_, int i_115_);

    final Class105 method3629(int i, int i_116_, boolean bool) {
        return new j(this, i, i_116_);
    }

    final native void ya();

    final native int I();

    final native void f(int i, int i_117_);

    final native void KA(int i, int i_118_, int i_119_, int i_120_);

    final void method3646(int i) {
        Class257.method1948((byte) -71);
        d(i);
        for (ya var_ya = (ya) aClass262_5123.method1995(4); var_ya != null; var_ya = (ya) aClass262_5123.method1990((byte) 40))
            var_ya.r();
    }

    final int method3679(int i, int i_121_) {
        return i | i_121_;
    }

    final native void ra(int i, int i_122_, int i_123_, int i_124_);

    final native int E();

    final native void pa();

    final void method3688(int i, int i_125_, int i_126_, int i_127_, int i_128_, int i_129_, int i_130_) {
        method3973().method150(this, i, i_125_, i_126_, i_127_, i_128_, i_129_, i_130_);
    }

    final native void GA(int i);

    final boolean method3670() {
        return true;
    }

    final native void X(int i);

    final Class64 method3625(Class124 class124, int i, int i_131_, int i_132_, int i_133_) {
        return new i(this, aYa5121, class124, i, i_131_, i_132_, i_133_);
    }

    final Class365 c() {//
        return new Class365(0, "SSE", 1, "CPU", 0L);
    }

    final void method3674(int i, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_, int i_139_, int i_140_, int i_141_) {
        /* empty */
    }

    final native void F(int i, int i_142_);

    final Class105 method3683(int i, int i_143_, int i_144_, int i_145_, boolean bool) {
        return new j(this, i, i_143_, i_144_, i_145_, !bool);
    }

    final void method3631(int i) {
        this.anInt5141 = i;
        anAArray5143 = new a[this.anInt5141];
        for (int i_146_ = 0; i_146_ < this.anInt5141; i_146_++)
            anAArray5143[i_146_] = new a(this, anInt5128, anInt5127);
    }

    final native int r(int i, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_);

    private final native void va(za var_za);

    final void method3643(Canvas canvas, int i, int i_153_) {
        p var_p = (p) aClass356_5126.method3480(canvas.hashCode(), -6008);
        if (var_p == null) {
            try {
                Class var_class = Class.forName("java.awt.Canvas");
                Method method = var_class.getMethod("setIgnoreRepaint", Boolean.TYPE);
                method.invoke(canvas, Boolean.TRUE);
            } catch (Exception exception) {
                /* empty */
            }
            var_p = new p(this, canvas, i, i_153_);
            aClass356_5126.method3483((byte) 36, canvas.hashCode(), var_p);
        } else if (var_p.anInt5145 != i || var_p.anInt5148 != i_153_) var_p.method3435(canvas, i, i_153_);
    }

    final Class299 method3706(Class299 class299, Class299 class299_154_, float f, Class299 class299_155_) {
        return null;
    }

    final native void K(int[] is);

    final boolean method3694() {
        return true;
    }

    final void method3626(int i, int i_156_) throws Exception_Sub1 {
        if (aP5137 == null) throw new IllegalStateException("off");
        aP5137.method3433(i, i_156_);
    }

    final Interface3 method3665(int i, int i_157_) {
        return method3629(i, i_157_, false);
    }

    final void method3642(int i, Class348_Sub1[] class348_sub1s) {
        int i_158_ = 0;
        for (int i_159_ = 0; i_159_ < i; i_159_++) {
            anIntArray5130[i_158_++] = class348_sub1s[i_159_].method2724(-1);
            anIntArray5130[i_158_++] = class348_sub1s[i_159_].method2722(123);
            anIntArray5130[i_158_++] = class348_sub1s[i_159_].method2717((byte) 103);
            anIntArray5130[i_158_++] = class348_sub1s[i_159_].method2723(-1);
            aFloatArray5138[i_159_] = class348_sub1s[i_159_].method2721(-65);
            anIntArray5130[i_158_++] = class348_sub1s[i_159_].method2720(-1);
        }
        N(i, anIntArray5130, aFloatArray5138);
    }

    final native void za(int i, int i_160_, int i_161_, int i_162_, int i_163_);

    final native int[] na(int i, int i_164_, int i_165_, int i_166_);

    final void method3647(boolean bool) {
        /* empty */
    }

    final Class348_Sub1 method3690(int i, int i_167_, int i_168_, int i_169_, int i_170_, float f) {
        return new Class348_Sub1_Sub2(i, i_167_, i_168_, i_169_, i_170_, f);
    }

    final void method3677(Canvas canvas) {
        if (canvas == null) {
            aP5137 = null;
            t(null);
        } else {
            p var_p = (p) aClass356_5126.method3480(canvas.hashCode(), -6008);
            aP5137 = var_p;
            t(var_p);
        }
    }

    final boolean method3682() {
        return true;
    }

    final void method3653(Class299 class299) {
        /* empty */
    }

    final Class101 method3654() {
        return new ja();
    }

    final void method3678(int i) {
        anAArray5143[i].method156();
    }

    final native void EA(int i, int i_171_, int i_172_, int i_173_);

    final void method3633() {
        /* empty */
    }

    final void method3658(int i, int i_174_, int i_175_, int i_176_) {
        /* empty */
    }

    public oa(Canvas canvas, d var_d, int i, int i_177_) {
        super(var_d);
        aClass262_5123 = new Class262();
        anInt5127 = 4096;
        anInt5128 = 4096;
        aClass356_5126 = new Class356(4);
        aBoolean5142 = false;
        do {
            try {

                if (!Class348_Sub40_Sub19.method3098(-30282, "sw3d")) throw new RuntimeException("");
                Class257.method1949((byte) -128);
                MA(aD4579, 0, 0); // error method
                Class59_Sub2_Sub1.method566(false, true, (byte) 23);
                aBoolean5142 = true;
                aClass101_5131 = new ja();
                method3638(new ja());
                method3631(1);
                method3659(0);
                if (canvas == null) break;
                method3643(canvas, i, i_177_);
                method3677(canvas);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                this.method3635((byte) 124);
                throw new RuntimeException();
            }
            break;
        } while (false);
    }

    private final native void FA();

    final native void P(int i, int i_178_, int i_179_, int i_180_, int i_181_);

    final boolean method3695() {
        return true;
    }

    final native void U(int i, int i_182_, int i_183_, int i_184_, int i_185_);

    final native int[] Y();

    final native void ZA(int i, float f, float f_186_, float f_187_, float f_188_, float f_189_);

    final Interface4 method3634(Interface3 interface3, Interface13 interface13) {
        return new wa(this, (j) interface3, (xa) interface13);
    }

    final void method3687(Interface4 interface4) {
        wa var_wa = (wa) interface4;
        n(var_wa.aJ4732.nativeid, var_wa.aXa4733.nativeid);
    }

    final native void da(int i, int i_190_, int i_191_, int[] is);

    final aa method3661(int i, int i_192_, int[] is, int[] is_193_) {
        return new na(this, aYa5121, i, i_192_, is, is_193_);
    }

    final Class101 method3640() {
        return aClass101_5125;
    }

    final void method3709(int i, int i_194_, int i_195_, int i_196_, int i_197_, int i_198_) {
        wa(i, i_194_, i_195_, i_196_, i_197_, i_198_);
    }

    private final native void Z(int i, int i_199_, int i_200_, int i_201_, int i_202_, int i_203_, aa var_aa, int i_204_, int i_205_);

    final native void C(boolean bool);

    final Interface13 method3624(int i, int i_206_) {
        return new xa(i, i_206_);
    }

    final boolean method3639() {
        return true;
    }

    final native void L(int i, int i_207_, int i_208_);

    final Class105 method3711(int[] is, int i, int i_209_, int i_210_, int i_211_, boolean bool) {
        return new j(this, is, i, i_209_, i_210_, i_211_, false);
    }

    final native void la();

    final void method3630(boolean bool) {
        /* empty */
    }

    final native int M();

    final boolean method3627() {
        return false;
    }

    private final Object OA() {//
        return new ba(this);
    }

    final boolean method3655() {
        return true;
    }

    final void method3703(int i, int i_212_, int i_213_, int i_214_, int i_215_, int i_216_, aa var_aa, int i_217_, int i_218_, int i_219_, int i_220_, int i_221_) {
        /* empty */
    }

    final void method3638(Class101 class101) {
        aClass101_5125 = class101;
        ma(((ja) class101).nativeid);
    }

    final void method3672() {
        method3677(aP5137.aCanvas5147);
    }

    final s method3648(int i, int i_222_, int[][] is, int[][] is_223_, int i_224_, int i_225_, int i_226_) {
        return new t(this, aYa5121, i, i_222_, is, is_223_, i_224_, i_225_, i_226_);
    }

    final native int XA();

    private final native void N(int i, int[] is, float[] fs);

    final native void T(int i, int i_227_, int i_228_, int i_229_);

    final boolean method3693() {
        return true;
    }

    final void method3673() {
        /* empty */
    }

    final boolean method3671() {
        return false;
    }

    final boolean method3699() {
        return false;
    }

    static {
        anIntArray5130 = anIntArray5122;
        aByteArray5134 = new byte[8191];
        anIntArray5135 = new int[8191];
        aFloatArray5138 = aFloatArray5129;
        anIntArray5139 = new int[8191];
        anIntArray5136 = anIntArray5122;
        anIntArray5140 = anIntArray5122;
        aShortArray5133 = new short[8191];
    }
}
