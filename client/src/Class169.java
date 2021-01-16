/* Class169 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;

import jagex3.jagmisc.jagmisc;

final class Class169 implements Runnable
{
    static int anInt2257;
    private Class262 aClass262_2258 = new Class262();
    private Thread aThread2259 = new Thread(this);
    static Class105[] aClass105Array2260;
    static Class19[] aClass19Array2261;
    static int anInt2262;
    static int anInt2263;
    static int anInt2264 = 0;
    static int anInt2265 = Class299.method2253(1600, 124);
    static int anInt2266;
    
    public final void run() {
	anInt2263++;
	for (;;) {
	    Class348_Sub26 class348_sub26;
	    synchronized (aClass262_2258) {
		Class348 class348;
		for (class348 = aClass262_2258.method1997(8); class348 == null;
		     class348 = aClass262_2258.method1997(8)) {
		    try {
			aClass262_2258.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		if (!(class348 instanceof Class348_Sub26))
		    break;
		class348_sub26 = (Class348_Sub26) class348;
	    }
	    int i;
	    try {
		byte[] is = InetAddress.getByName
				(((Class348_Sub26) class348_sub26).aString6888)
				.getAddress();
		i = jagmisc.ping(is[0], is[1], is[2], is[3], 1000L);
	    } catch (Throwable throwable) {
		i = 1000;
	    }
	    ((Class348_Sub26) class348_sub26).anInt6887 = i;
	}
    }
    
    public static void method1300(byte i) {
	if (i < -127) {
	    aClass105Array2260 = null;
	    aClass19Array2261 = null;
	}
    }
    
    static final void method1301(r var_r, int i, int i_0_, int i_1_,
				 boolean[] bools) {
	if (aa_Sub1.aSArray5191 != Class332.aSArray4142) {
	    int i_2_
		= Class348_Sub1_Sub1.aSArray8801[i].method3986(i_0_, i_1_,
							       (byte) -93);
	    for (int i_3_ = 0; i_3_ <= i; i_3_++) {
		if (bools == null || bools[i_3_]) {
		    s var_s = Class348_Sub1_Sub1.aSArray8801[i_3_];
		    if (var_s != null)
			var_s.wa(var_r, i_0_,
				 i_2_ - var_s.method3986(i_0_, i_1_,
							 (byte) -103),
				 i_1_, 0, false);
		}
	    }
	}
    }
    
    public Class169() {
	aThread2259.setDaemon(true);
	aThread2259.start();
    }
    
    final Class348_Sub26 method1302(int i, String string) {
	anInt2266++;
	if (aThread2259 == null)
	    throw new IllegalStateException("");
	if (string == null)
	    throw new IllegalArgumentException("");
	if (i != -5255)
	    aClass262_2258 = null;
	Class348_Sub26 class348_sub26 = new Class348_Sub26(string);
	method1304(1000, class348_sub26);
	return class348_sub26;
    }
    
    final void method1303(byte i) {
	anInt2257++;
	if (aThread2259 != null) {
	    method1304(1000, new Class348());
	    try {
		aThread2259.join();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    aThread2259 = null;
	    if (i != 16)
		anInt2264 = 87;
	}
    }
    
    private final void method1304(int i, Class348 class348) {
	if (i != 1000)
	    method1303((byte) 95);
	synchronized (aClass262_2258) {
	    aClass262_2258.method1999(class348, -20180);
	    aClass262_2258.notify();
	}
	anInt2262++;
    }
}
