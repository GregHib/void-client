/* Class259 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class259
{
    private Class45 aClass45_3299;
    static byte[] aByteArray3300 = new byte[2048];
    static Class60 aClass60_3301 = new Class60(30);
    static int anInt3302;
    private Class60 aClass60_3303 = new Class60(64);
    static Class305 aClass305_3304;
    int anInt3305;
    static int anInt3306 = 0;
    
    public static void method1975(byte i) {
	aClass60_3301 = null;
	int i_0_ = -54 / ((i - 77) / 37);
	aClass305_3304 = null;
	aByteArray3300 = null;
    }
    
    final Class160 method1976(int i, int i_1_) {
	anInt3302++;
	Class160 class160;
	synchronized (aClass60_3303) {
	    class160 = (Class160) aClass60_3303.method583((long) i, -51);
	}
	if (class160 != null)
	    return class160;
	int i_2_ = 44 % ((-41 - i_1_) / 33);
	byte[] is;
	synchronized (aClass45_3299) {
	    is = aClass45_3299.method410(-1860, 19, i);
	}
	class160 = new Class160();
	if (is != null)
	    class160.method1255(new Class348_Sub49(is), -1);
	synchronized (aClass60_3303) {
	    aClass60_3303.method582(class160, (long) i, (byte) -120);
	}
	return class160;
    }
    
    Class259(Class230 class230, int i, Class45 class45) {
	try {
	    aClass45_3299 = class45;
	    ((Class259) this).anInt3305 = aClass45_3299.method407(0, 19);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("uea.<init>("
					     + (class230 != null ? "{...}"
						: "null")
					     + ',' + i + ','
					     + (class45 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
}
