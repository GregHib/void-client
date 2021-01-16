/* n - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class n extends Class324 implements Interface19
{
    long nativeid;
    
    private final native void S(oa var_oa, ya var_ya, byte[][] is, int[] is_0_,
				int[] is_1_, int[] is_2_, int[] is_3_,
				int[] is_4_);
    
    n(oa var_oa, ya var_ya, Class143 class143, Class207[] class207s,
      Class105[] class105s) {
	super(var_oa, class143);
	byte[][] is = new byte[class207s.length][];
	int[] is_5_ = new int[class207s.length];
	int[] is_6_ = new int[class207s.length];
	int[] is_7_ = new int[class207s.length];
	int[] is_8_ = new int[class207s.length];
	for (int i = 0; i < class207s.length; i++) {
	    is[i] = ((Class207) class207s[i]).aByteArray2699;
	    is_5_[i] = ((Class207) class207s[i]).anInt2702;
	    is_6_[i] = ((Class207) class207s[i]).anInt2696;
	    is_7_[i] = ((Class207) class207s[i]).anInt2703;
	    is_8_[i] = ((Class207) class207s[i]).anInt2700;
	}
	S(var_oa, var_ya, is, ((Class207) class207s[0]).anIntArray2697, is_5_,
	  is_6_, is_7_, is_8_);
    }
    
    public final native void w(boolean bool);
    
    protected final void finalize() {
	if (((n) this).nativeid != 0L)
	    Class257.method1947(0, this);
    }
    
    final native void fa(char c, int i, int i_9_, int i_10_, boolean bool);
    
    private final native void PA(char c, int i, int i_11_, int i_12_,
				 boolean bool, aa var_aa, int i_13_,
				 int i_14_);
    
    final void method2578(char c, int i, int i_15_, int i_16_, boolean bool,
			  aa var_aa, int i_17_, int i_18_) {
	PA(c, i, i_15_, i_16_, bool, var_aa, i_17_, i_18_);
    }
}
