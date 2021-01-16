/* a - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class a implements Interface19
{
    private i anI5105;
    long nativeid;
    private i anI5106;
    private i anI5107;
    private i anI5108;
    private i anI5109;
    private i anI5110;
    private i anI5111;
    Runnable aRunnable5112;
    private i anI5113;
    private i anI5114;
    private oa anOa5115;
    private i anI5116;
    
    final void method142(s var_s, int i, int i_0_) {
	H(((a) this).nativeid, ((t) (t) var_s).nativeid, i, i_0_);
    }
    
    private final native boolean R(long l, long l_1_, int i, int i_2_,
				   long l_3_, boolean bool);
    
    final boolean method143(Class64 class64, int i, int i_4_,
			    Class101 class101, boolean bool, int i_5_) {
	return n(((a) this).nativeid, ((i) (i) class64).nativeid, i, i_4_,
		 ((ja) (ja) class101).nativeid, bool, i_5_);
    }
    
    final void method144(Class64 class64, Class64 class64_6_, int i, int i_7_,
			 int i_8_, boolean bool) {
	r(((a) this).nativeid, ((i) (i) class64).nativeid,
	  ((i) (i) class64_6_).nativeid, i, i_7_, i_8_, bool);
    }
    
    private final native void E(long l, boolean bool);
    
    private final native void e(long l, long l_9_, int[] is, long l_10_);
    
    private final native void W(long l);
    
    protected final void finalize() {
	if (((a) this).nativeid != 0L)
	    Class257.method1947(0, this);
    }
    
    final void method145(Class64 class64, Class101 class101, int[] is, int i) {
	UA(((a) this).nativeid, ((i) (i) class64).nativeid,
	   ((ja) (ja) class101).nativeid, is, i);
    }
    
    private final native boolean n(long l, long l_11_, int i, int i_12_,
				   long l_13_, boolean bool, int i_14_);
    
    final boolean method146(Class64 class64, int i, int i_15_,
			    Class101 class101, boolean bool) {
	return R(((a) this).nativeid, ((i) (i) class64).nativeid, i, i_15_,
		 ((ja) (ja) class101).nativeid, bool);
    }
    
    final void method147(s var_s, int i, int i_16_, int i_17_) {
	Z(((a) this).nativeid, ((t) (t) var_s).nativeid, i, i_16_, i_17_);
    }
    
    public final void w(boolean bool) {
	E(((a) this).nativeid, bool);
    }
    
    final void method148(s var_s, int i, int i_18_, int i_19_, int i_20_,
			 int i_21_, int i_22_, int i_23_, boolean[][] bools) {
	ta(((a) this).nativeid, ((t) (t) var_s).nativeid, i, i_18_, i_19_,
	   i_20_, i_21_, i_22_, i_23_, bools);
    }
    
    final void method149(Class64 class64, Class101 class101, int[] is, int i,
			 int i_24_) {
	f(((a) this).nativeid, ((i) (i) class64).nativeid,
	  ((ja) (ja) class101).nativeid, is, i, i_24_);
    }
    
    private final native void na(long l, ha var_ha, int i, int i_25_,
				 int i_26_, int i_27_, int i_28_, int i_29_,
				 int i_30_);
    
    private final native void O(long l, ha var_ha, int[] is, int[] is_31_,
				int[] is_32_, short[] is_33_, int i);
    
    final void method150(ha var_ha, int i, int i_34_, int i_35_, int i_36_,
			 int i_37_, int i_38_, int i_39_) {
	na(((a) this).nativeid, var_ha, i, i_34_, i_35_, i_36_, i_37_, i_38_,
	   i_39_);
    }
    
    private final native void f(long l, long l_40_, long l_41_, int[] is,
				int i, int i_42_);
    
    private final native void r(long l, long l_43_, long l_44_, int i,
				int i_45_, int i_46_, boolean bool);
    
    final void method151(Class64 class64, int[] is, Class101 class101) {
	e(((a) this).nativeid, ((i) (i) class64).nativeid, is,
	  ((ja) (ja) class101).nativeid);
    }
    
    final Class64 method152(i var_i, byte i, int i_47_, boolean bool) {
	i var_i_48_;
	i var_i_49_;
	if (i == 1) {
	    var_i_48_ = anI5110;
	    var_i_49_ = anI5106;
	} else if (i == 2) {
	    var_i_48_ = anI5107;
	    var_i_49_ = anI5111;
	} else if (i == 3) {
	    var_i_48_ = anI5109;
	    var_i_49_ = anI5108;
	} else if (i == 4) {
	    var_i_48_ = anI5113;
	    var_i_49_ = anI5116;
	} else if (i == 5) {
	    var_i_48_ = anI5114;
	    var_i_49_ = anI5105;
	} else
	    var_i_49_ = var_i_48_ = new i(anOa5115);
	var_i.ZA(var_i_49_, var_i_48_, i_47_, i != 0, bool);
	((i) var_i_49_).aClass129Array5119 = ((i) var_i).aClass129Array5119;
	((i) var_i_49_).aClass342Array5118 = ((i) var_i).aClass342Array5118;
	return var_i_49_;
    }
    
    private final native void ta(long l, long l_50_, int i, int i_51_,
				 int i_52_, int i_53_, int i_54_, int i_55_,
				 int i_56_, boolean[][] bools);
    
    private final native void Z(long l, long l_57_, int i, int i_58_,
				int i_59_);
    
    private final void method153() {
	W(((a) this).nativeid);
    }
    
    final void method154() {
	((a) this).aRunnable5112 = Thread.currentThread();
	method157();
    }
    
    private final native void M(long l);
    
    private final native void H(long l, long l_60_, int i, int i_61_);
    
    private final native void UA(long l, long l_62_, long l_63_, int[] is,
				 int i);
    
    final void method155(ha var_ha, int[] is, int[] is_64_, int[] is_65_,
			 short[] is_66_, int i) {
	O(((a) this).nativeid, var_ha, is, is_64_, is_65_, is_66_, i);
    }
    
    private final native void HA(long l, ha var_ha, int i, int i_67_);
    
    final void method156() {
	((a) this).aRunnable5112 = null;
	method153();
    }
    
    private final void method157() {
	M(((a) this).nativeid);
    }
    
    a(oa var_oa, int i, int i_68_) {
	anOa5115 = var_oa;
	anI5106 = new i(anOa5115);
	anI5111 = new i(anOa5115);
	anI5108 = new i(anOa5115);
	anI5116 = new i(anOa5115);
	anI5105 = new i(anOa5115);
	anI5110 = new i(anOa5115);
	anI5107 = new i(anOa5115);
	anI5109 = new i(anOa5115);
	anI5113 = new i(anOa5115);
	anI5114 = new i(anOa5115);
	HA(((a) this).nativeid, var_oa, i, i_68_);
    }
}
