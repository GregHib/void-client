/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class39
{
    static int anInt514;
    static Class74 aClass74_515 = new Class74(7, 7);
    static int anInt516;
    long aLong517;
    static Class45 aClass45_518;
    private Class377 aClass377_519;
    static Class112 aClass112_520;
    static Class323 aClass323_521;
    
    static final void method366(Object[] objects, byte i, int[] is) {
	do {
	    try {
		Class279.method2092(is.length - 1, 0, is, -119, objects);
		anInt514++;
		if (i <= -97)
		    break;
		method367(-67);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("ifa.B("
						 + (objects != null ? "{...}"
						    : "null")
						 + ',' + i + ','
						 + (is != null ? "{...}"
						    : "null")
						 + ')'));
	    }
	    break;
	} while (false);
    }
    
    protected final void finalize() throws Throwable {
	aClass377_519.method3966(((Class39) this).aLong517, 34192);
	anInt516++;
	super.finalize();
    }
    
    public static void method367(int i) {
	aClass45_518 = null;
	aClass74_515 = null;
	aClass323_521 = null;
	if (i == -15833)
	    aClass112_520 = null;
    }
    
    Class39(Class377 class377, long l, int i) {
	try {
	    ((Class39) this).aLong517 = l;
	    aClass377_519 = class377;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ifa.<init>("
					     + (class377 != null ? "{...}"
						: "null")
					     + ',' + l + ',' + i + ')'));
	}
    }
}
