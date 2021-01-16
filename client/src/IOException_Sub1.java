/* IOException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class IOException_Sub1 extends IOException
{
    static boolean aBoolean86 = false;
    static int anInt87;
    static int anInt88;
    static int anInt89;
    static Class114 aClass114_90 = new Class114(42, -1);
    static int[] anIntArray91 = new int[8];
    
    static final void method129(int i, int i_0_, long[] ls, int i_1_,
				int[] is) {
	do {
	    try {
		anInt89++;
		if ((i ^ 0xffffffff) > (i_1_ ^ 0xffffffff)) {
		    int i_2_ = (i_1_ + i) / 2;
		    int i_3_ = i;
		    long l = ls[i_2_];
		    ls[i_2_] = ls[i_1_];
		    ls[i_1_] = l;
		    int i_4_ = is[i_2_];
		    is[i_2_] = is[i_1_];
		    is[i_1_] = i_4_;
		    int i_5_ = l == 9223372036854775807L ? 0 : 1;
		    for (int i_6_ = i;
			 (i_6_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff); i_6_++) {
			if ((ls[i_6_] ^ 0xffffffffffffffffL)
			    > (l - -(long) (i_5_ & i_6_)
			       ^ 0xffffffffffffffffL)) {
			    long l_7_ = ls[i_6_];
			    ls[i_6_] = ls[i_3_];
			    ls[i_3_] = l_7_;
			    int i_8_ = is[i_6_];
			    is[i_6_] = is[i_3_];
			    is[i_3_++] = i_8_;
			}
		    }
		    ls[i_1_] = ls[i_3_];
		    ls[i_3_] = l;
		    is[i_1_] = is[i_3_];
		    is[i_3_] = i_4_;
		    method129(i, -126, ls, -1 + i_3_, is);
		    method129(1 + i_3_, -81, ls, i_1_, is);
		}
		if (i_0_ < -72)
		    break;
		method130(99);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("gv.A(" + i + ',' + i_0_ + ','
						 + (ls != null ? "{...}"
						    : "null")
						 + ',' + i_1_ + ','
						 + (is != null ? "{...}"
						    : "null")
						 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static void method130(int i) {
	if (i == 8) {
	    anIntArray91 = null;
	    aClass114_90 = null;
	}
    }
    
    static final void method131(boolean bool, int i, boolean bool_9_,
				int i_10_) {
	anInt87++;
	if ((i_10_ ^ 0xffffffff) > -8001 || i_10_ > 48000)
	    throw new IllegalArgumentException();
	Class253.anInt3248 = i;
	Class22.anInt339 = i_10_;
	Class282.aBoolean3652 = bool;
	if (bool_9_ != true)
	    method130(-125);
    }
    
    IOException_Sub1(String string) {
	super(string);
    }
}
