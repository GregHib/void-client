/* Class244 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class244 implements d
{
    static int anInt4609 = -1;
    static int anInt4610;
    private Class12[] aClass12Array4611;
    static int anInt4612;
    static int anInt4613;
    static int anInt4614;
    static long aLong4615;
    static int anInt4616;
    static int anInt4617;
    static int anInt4618;
    private Class45 aClass45_4619;
    static int anInt4620;
    static int anInt4621;
    private Class308 aClass308_4622 = new Class308(256);
    static int[] anIntArray4623 = new int[8];
    private Class45 aClass45_4624;
    private int anInt4625;
    static float aFloat4626;
    
    public final int[] method6(int i, int i_0_, float f, int i_1_,
			       boolean bool, int i_2_) {
	if (i != -21540)
	    method3(-46, 6);
	anInt4617++;
	return method1881(i_1_, false).method3183(this, i_2_, i_0_,
						  (((Class12)
						    aClass12Array4611[i_1_])
						   .aBoolean207),
						  (double) f, aClass45_4624,
						  (byte) 11);
    }
    
    public static void method1880(int i) {
	if (i >= -103)
	    anInt4610 = -87;
	anIntArray4623 = null;
    }
    
    private final Class348_Sub42_Sub5 method1881(int i, boolean bool) {
	anInt4620++;
	Class348_Sub42 class348_sub42
	    = aClass308_4622.method2302((long) i, (byte) -34);
	if (class348_sub42 != null)
	    return (Class348_Sub42_Sub5) class348_sub42;
	byte[] is = aClass45_4619.method415((byte) 73, i);
	if (is == null)
	    return null;
	if (bool != false)
	    method1(-58, 1.9039171F, false, -106, -22, -18);
	Class348_Sub42_Sub5 class348_sub42_sub5
	    = new Class348_Sub42_Sub5(new Class348_Sub49(is));
	aClass308_4622.method2305((long) i, class348_sub42_sub5, -1);
	return class348_sub42_sub5;
    }
    
    public final Class12 method3(int i, int i_3_) {
	anInt4621++;
	if (i_3_ != -6662)
	    return null;
	return aClass12Array4611[i];
    }
    
    public final int[] method5(boolean bool, int i, float f, int i_4_,
			       int i_5_, int i_6_) {
	int i_7_ = 41 / ((i_6_ - -69) / 48);
	anInt4614++;
	return method1881(i, false).method3185(i_4_, this, 0,
					       ((Class12) (aClass12Array4611
							   [i])).aBoolean207,
					       (double) f, bool, aClass45_4624,
					       i_5_);
    }
    
    public final boolean method4(int i, int i_8_) {
	anInt4616++;
	Class348_Sub42_Sub5 class348_sub42_sub5 = method1881(i_8_, false);
	if (i != -7953)
	    method4(56, -109);
	if (class348_sub42_sub5 == null
	    || !class348_sub42_sub5.method3184(this, aClass45_4624, -85))
	    return false;
	return true;
    }
    
    public final float[] method1(int i, float f, boolean bool, int i_9_,
				 int i_10_, int i_11_) {
	if (i_9_ != -30824)
	    return null;
	anInt4612++;
	return method1881(i_11_, false).method3186(i, this,
						   (((Class12)
						     aClass12Array4611[i_11_])
						    .aBoolean207),
						   i_10_, aClass45_4624, -20);
    }
    
    public final int method2(boolean bool) {
	anInt4618++;
	if (bool != true)
	    aLong4615 = -52L;
	return anInt4625;
    }
    
    Class244(Class45 class45, Class45 class45_12_, Class45 class45_13_) {
	try {
	    aClass45_4619 = class45_12_;
	    aClass45_4624 = class45_13_;
	    Class348_Sub49 class348_sub49
		= new Class348_Sub49(class45.method410(-1860, 0, 0));
	    anInt4625 = class348_sub49.method3330(842397944);
	    aClass12Array4611 = new Class12[anInt4625];
	    for (int i = 0; (i ^ 0xffffffff) > (anInt4625 ^ 0xffffffff); i++) {
		if (class348_sub49.method3387(255) == 1)
		    aClass12Array4611[i] = new Class12();
	    }
	    for (int i = 0; i < anInt4625; i++) {
		if (aClass12Array4611[i] != null)
		    ((Class12) aClass12Array4611[i]).aBoolean209
			= class348_sub49.method3387(255) == 0;
	    }
	    for (int i = 0; (anInt4625 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		if (aClass12Array4611[i] != null)
		    ((Class12) aClass12Array4611[i]).aBoolean199
			= class348_sub49.method3387(255) == 1;
	    }
	    for (int i = 0; anInt4625 > i; i++) {
		if (aClass12Array4611[i] != null)
		    ((Class12) aClass12Array4611[i]).aBoolean204
			= class348_sub49.method3387(255) == 1;
	    }
	    for (int i = 0; i < anInt4625; i++) {
		if (aClass12Array4611[i] != null)
		    ((Class12) aClass12Array4611[i]).aByte216
			= class348_sub49.method3388(-85);
	    }
	    for (int i = 0; (anInt4625 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		if (aClass12Array4611[i] != null)
		    ((Class12) aClass12Array4611[i]).aByte201
			= class348_sub49.method3388(-113);
	    }
	    for (int i = 0; i < anInt4625; i++) {
		if (aClass12Array4611[i] != null)
		    ((Class12) aClass12Array4611[i]).aByte213
			= class348_sub49.method3388(-97);
	    }
	    for (int i = 0; i < anInt4625; i++) {
		if (aClass12Array4611[i] != null)
		    ((Class12) aClass12Array4611[i]).aByte202
			= class348_sub49.method3388(-82);
	    }
	    for (int i = 0; i < anInt4625; i++) {
		if (aClass12Array4611[i] != null)
		    ((Class12) aClass12Array4611[i]).aShort208
			= (short) class348_sub49.method3330(842397944);
	    }
	    for (int i = 0; (i ^ 0xffffffff) > (anInt4625 ^ 0xffffffff); i++) {
		if (aClass12Array4611[i] != null)
		    ((Class12) aClass12Array4611[i]).aByte198
			= class348_sub49.method3388(-86);
	    }
	    for (int i = 0; (i ^ 0xffffffff) > (anInt4625 ^ 0xffffffff); i++) {
		if (aClass12Array4611[i] != null)
		    ((Class12) aClass12Array4611[i]).aByte211
			= class348_sub49.method3388(-104);
	    }
	    for (int i = 0; (i ^ 0xffffffff) > (anInt4625 ^ 0xffffffff); i++) {
		if (aClass12Array4611[i] != null)
		    ((Class12) aClass12Array4611[i]).aBoolean212
			= (class348_sub49.method3387(255) ^ 0xffffffff) == -2;
	    }
	    for (int i = 0; (i ^ 0xffffffff) > (anInt4625 ^ 0xffffffff); i++) {
		if (aClass12Array4611[i] != null)
		    ((Class12) aClass12Array4611[i]).aBoolean207
			= class348_sub49.method3387(255) == 1;
	    }
	    for (int i = 0; i < anInt4625; i++) {
		if (aClass12Array4611[i] != null)
		    ((Class12) aClass12Array4611[i]).aByte205
			= class348_sub49.method3388(-77);
	    }
	    for (int i = 0; i < anInt4625; i++) {
		if (aClass12Array4611[i] != null)
		    ((Class12) aClass12Array4611[i]).aBoolean217
			= (class348_sub49.method3387(255) ^ 0xffffffff) == -2;
	    }
	    for (int i = 0; anInt4625 > i; i++) {
		if (aClass12Array4611[i] != null)
		    ((Class12) aClass12Array4611[i]).aBoolean215
			= (class348_sub49.method3387(255) ^ 0xffffffff) == -2;
	    }
	    for (int i = 0; anInt4625 > i; i++) {
		if (aClass12Array4611[i] != null)
		    ((Class12) aClass12Array4611[i]).aBoolean218
			= class348_sub49.method3387(255) == 1;
	    }
	    for (int i = 0; i < anInt4625; i++) {
		if (aClass12Array4611[i] != null)
		    ((Class12) aClass12Array4611[i]).anInt203
			= class348_sub49.method3387(255);
	    }
	    for (int i = 0; anInt4625 > i; i++) {
		if (aClass12Array4611[i] != null)
		    ((Class12) aClass12Array4611[i]).anInt206
			= class348_sub49.method3385((byte) -126);
	    }
	    for (int i = 0; anInt4625 > i; i++) {
		if (aClass12Array4611[i] != null)
		    ((Class12) aClass12Array4611[i]).anInt200
			= class348_sub49.method3387(255);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("tda.<init>(" + (class45 != null ? "{...}" : "null")
			+ ',' + (class45_12_ != null ? "{...}" : "null") + ','
			+ (class45_13_ != null ? "{...}" : "null") + ')'));
	}
    }
    
    static {
	anInt4610 = 328;
	aLong4615 = 0L;
    }
}
