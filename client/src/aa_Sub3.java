/* aa_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

final class aa_Sub3 extends aa
{
    static Class351 aClass351_5200 = new Class351(13, 2);
    int[] anIntArray5201;
    int[] anIntArray5202;
    static int anInt5203;
    static Class351 aClass351_5204 = new Class351(15, 8);
    static int anInt5205;
    static Class348_Sub6 aClass348_Sub6_5206 = new Class348_Sub6(0, 0);
    static Class45 aClass45_5207;
    /*synthetic*/ static Class aClass5208;
    
    static final boolean method166(byte i, int i_0_, int i_1_) {
	if (i < 5)
	    method166((byte) -119, -93, 73);
	anInt5203++;
	if ((i_1_ & 0x800) == 0 || (i_0_ & 0x37) == 0)
	    return false;
	return true;
    }
    
    public static void method167(int i) {
	if (i != 19612)
	    method167(-70);
	aClass351_5200 = null;
	aClass351_5204 = null;
	aClass348_Sub6_5206 = null;
	aClass45_5207 = null;
    }
    
    static final void method168(byte i) {
	do {
	    if (!((Class297) Class348_Sub23_Sub1.aClass297_8992)
		 .aBoolean3794) {
		try {
		    Method method
			= (aClass5208 != null ? aClass5208
			   : (aClass5208 = method169("java.lang.Runtime")))
			      .getMethod("maxMemory", new Class[0]);
		    if (method != null) {
			try {
			    Runtime runtime = Runtime.getRuntime();
			    Long var_long
				= (Long) method.invoke(runtime, null);
			    Class226.anInt2964
				= 1 + (int) (var_long.longValue() / 1048576L);
			} catch (Throwable throwable) {
			    /* empty */
			}
		    }
		    break;
		} catch (Exception exception) {
		    break;
		}
	    }
	    Class226.anInt2964 = 96;
	} while (false);
	int i_2_ = 15 % (i / 51);
	anInt5205++;
    }
    
    aa_Sub3(int i, int i_3_, int[] is, int[] is_4_) {
	try {
	    ((aa_Sub3) this).anIntArray5201 = is;
	    ((aa_Sub3) this).anIntArray5202 = is_4_;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("nba.<init>(" + i + ',' + i_3_
					     + ','
					     + (is != null ? "{...}" : "null")
					     + ','
					     + (is_4_ != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    /*synthetic*/ static Class method169(String string) {
	try {
	    return Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
