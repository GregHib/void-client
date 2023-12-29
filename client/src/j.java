/* j - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class j extends Sprite implements Interface19 {
    long nativeid;

    private final native void R(long l, boolean bool);

    private final native void P(long l, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_);

    final void method964(int i, int i_6_, int i_7_, int i_8_, int i_9_) {
        W(this.nativeid, i, i_6_, i_7_, i_8_, i_9_);
    }

    private final native void RA(long l, int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_);

    private final native void UA(long l, float f, float f_17_, float f_18_, float f_19_, float f_20_, float f_21_, int i, long l_22_, int i_23_, int i_24_);

    private final native int wa(long l);

    private final native int M(long l);

    final void method963(int i, int i_25_, aa var_aa, int i_26_, int i_27_) {
        V(this.nativeid, i, i_25_, ((na) var_aa).nativeid, i_26_, i_27_);
    }

    final void method984(int[] is) {
        CA(this.nativeid, is);
    }

    public final void w(boolean bool) {
        R(this.nativeid, bool);
    }

    final int method980() {
        return JA(this.nativeid);
    }

    private final native void EA(oa var_oa, int i, int i_28_);

    final void method985(int i, int i_29_, int i_30_, int i_31_) {
        A(this.nativeid, i, i_29_, i_30_, i_31_);
    }

    private final native void ma(oa var_oa, int[] is, byte[] is_32_, byte[] is_33_, int i, int i_34_, int i_35_, int i_36_);

    final void method968(int i, int i_37_, int i_38_) {
        N(this.nativeid, i, i_37_, i_38_);
    }

    final void method983(float f, float f_39_, float f_40_, float f_41_, float f_42_, float f_43_, int i, aa var_aa, int i_44_, int i_45_) {
        UA(this.nativeid, f, f_39_, f_40_, f_41_, f_42_, f_43_, i, ((na) var_aa).nativeid, i_44_, i_45_);
    }

    final int method969() {
        return I(this.nativeid);
    }

    private final native void CA(long l, int[] is);

    private final native void W(long l, int i, int i_46_, int i_47_, int i_48_, int i_49_);

    final void method982(int i, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_) {
        RA(this.nativeid, i, i_50_, i_51_, i_52_, i_53_, i_54_, i_55_, i_56_);
    }

    final int method971() {
        return M(this.nativeid);
    }

    j(oa var_oa, int i, int i_57_) {
        EA(var_oa, i, i_57_);
    }

    private final native void b(long l, float f, float f_58_, float f_59_, float f_60_, float f_61_, float f_62_, int i, int i_63_, int i_64_, int i_65_);

    j(oa var_oa, int[] is, int i, int i_66_, int i_67_, int i_68_, boolean bool) {
        ua(var_oa, is, i, i_66_, i_67_, i_68_, bool);
    }

    private final native void A(long l, int i, int i_69_, int i_70_, int i_71_);

    private final native void V(long l, int i, int i_72_, long l_73_, int i_74_, int i_75_);

    j(oa var_oa, int[] is, byte[] is_76_, byte[] is_77_, int i, int i_78_, int i_79_, int i_80_) {
        ma(var_oa, is, is_76_, is_77_, i, i_78_, i_79_, i_80_);
    }

    private final native void N(long l, int i, int i_81_, int i_82_);

    private final native void YA(long l, int i, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_);

    j(oa var_oa, int i, int i_88_, int i_89_, int i_90_, boolean bool) {
        h(var_oa, i, i_88_, i_89_, i_90_, bool);
    }

    private final native int I(long l);

    protected final void finalize() {
        if (this.nativeid != 0L) Class257.method1947(0, this);
    }

    private final native void ua(oa var_oa, int[] is, int i, int i_91_, int i_92_, int i_93_, boolean bool);

    final void method979(int i, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_) {
        YA(this.nativeid, i, i_94_, i_95_, i_96_, i_97_, i_98_);
    }

    private final native void h(oa var_oa, int i, int i_99_, int i_100_, int i_101_, boolean bool);

    final void method965(int i, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_, int i_107_) {
        P(this.nativeid, i, i_102_, i_103_, i_104_, i_105_, i_106_, i_107_);
    }

    final int scaleWidth() {
        return wa(this.nativeid);
    }

    final void method962(float f, float f_108_, float f_109_, float f_110_, float f_111_, float f_112_, int i, int i_113_, int i_114_, int i_115_) {
        b(this.nativeid, f, f_108_, f_109_, f_110_, f_111_, f_112_, i, i_113_, i_114_, i_115_);
    }

    private final native int JA(long l);
}
