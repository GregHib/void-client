/* ja - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ja extends Class101 implements Interface19
{
    long nativeid;
    
    private final native void la();
    
    private final native void za(long l, int i);
    
    private final native void AA(long l, boolean bool);
    
    private final native void VA(long l, int i);
    
    private final native void NA(long l, int i);
    
    final void method891(int i, int i_0_, int i_1_) {
	a(((ja) this).nativeid, i, i_0_, i_1_);
    }
    
    private final native void l(long l, long l_2_);
    
    final void method910() {
	u(((ja) this).nativeid);
    }
    
    public final void w(boolean bool) {
	AA(((ja) this).nativeid, bool);
    }
    
    final void method905(int i, int i_3_, int i_4_, int[] is) {
	XA(((ja) this).nativeid, i, i_3_, i_4_, is);
    }
    
    final void method890(int[] is) {
	w(((ja) this).nativeid, is);
    }
    
    private final native void w(long l, int[] is);
    
    final void method908(int i) {
	za(((ja) this).nativeid, i);
    }
    
    private final native void XA(long l, int i, int i_5_, int i_6_, int[] is);
    
    final void method903(int i, int i_7_, int i_8_, int i_9_, int i_10_,
			 int i_11_) {
	P(((ja) this).nativeid, i, i_7_, i_8_, i_9_, i_10_, i_11_);
    }
    
    private final native void t(long l, int i);
    
    final void method900(int i) {
	J(((ja) this).nativeid, i);
    }
    
    private final native void u(long l);
    
    final void method897(int i, int i_12_, int i_13_, int[] is) {
	b(((ja) this).nativeid, i, i_12_, i_13_, is);
    }
    
    private final native void m(long l, int i);
    
    private final native void FA(long l, int i, int i_14_, int i_15_);
    
    final void method902(int i) {
	NA(((ja) this).nativeid, i);
    }
    
    private final native void va(long l, int i, int i_16_, int i_17_,
				 int[] is);
    
    private final native void J(long l, int i);
    
    final void method898(Class101 class101) {
	l(((ja) this).nativeid, ((ja) (ja) class101).nativeid);
    }
    
    private final native void b(long l, int i, int i_18_, int i_19_, int[] is);
    
    final void method892(int i, int i_20_, int i_21_, int[] is) {
	va(((ja) this).nativeid, i, i_20_, i_21_, is);
    }
    
    private final native void P(long l, int i, int i_22_, int i_23_, int i_24_,
				int i_25_, int i_26_);
    
    private final native void a(long l, int i, int i_27_, int i_28_);
    
    protected final void finalize() {
	if (((ja) this).nativeid != 0L)
	    Class257.method1947(0, this);
    }
    
    final void method896(int i) {
	m(((ja) this).nativeid, i);
    }
    
    final Class101 method907() {
	ja var_ja_29_ = new ja();
	var_ja_29_.method898(this);
	return var_ja_29_;
    }
    
    final void method895(int i) {
	t(((ja) this).nativeid, i);
    }
    
    ja() {
	la();
    }
    
    final void method894(int i, int i_30_, int i_31_) {
	FA(((ja) this).nativeid, i, i_30_, i_31_);
    }
    
    final void method899(int i) {
	VA(((ja) this).nativeid, i);
    }
}
