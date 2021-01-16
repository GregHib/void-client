/* Class243 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class243
{
    static int anInt3157;
    static int anInt3158;
    static int anInt3159;
    static int anInt3160;
    static int anInt3161;
    static int anInt3162;
    static int anInt3163;
    static int anInt3164;
    static Class351 aClass351_3165 = new Class351(60, 8);
    private Class318 aClass318_3166 = new Class318();
    private Class318 aClass318_3167;
    static int anInt3168;
    
    final void method1869(int i, Class318 class318) {
	if (((Class318) class318).aClass318_3976 != null)
	    class318.method2373(false);
	anInt3158++;
	((Class318) class318).aClass318_3976
	    = ((Class318) aClass318_3166).aClass318_3976;
	if (i > -81)
	    aClass318_3167 = null;
	((Class318) class318).aClass318_3970 = aClass318_3166;
	((Class318) ((Class318) class318).aClass318_3976).aClass318_3970
	    = class318;
	((Class318) ((Class318) class318).aClass318_3970).aClass318_3976
	    = class318;
    }
    
    final Class318 method1870(int i) {
	if (i > -103)
	    aClass318_3167 = null;
	anInt3162++;
	Class318 class318 = ((Class318) aClass318_3166).aClass318_3976;
	if (aClass318_3166 == class318) {
	    aClass318_3167 = null;
	    return null;
	}
	aClass318_3167 = ((Class318) class318).aClass318_3976;
	return class318;
    }
    
    final boolean method1871(byte i) {
	anInt3157++;
	if (i <= 98)
	    method1879(true);
	if (aClass318_3166 != ((Class318) aClass318_3166).aClass318_3970)
	    return false;
	return true;
    }
    
    final Class318 method1872(int i) {
	anInt3163++;
	Class318 class318 = ((Class318) aClass318_3166).aClass318_3970;
	if (i != 8)
	    method1878((byte) 126);
	if (class318 == aClass318_3166) {
	    aClass318_3167 = null;
	    return null;
	}
	aClass318_3167 = ((Class318) class318).aClass318_3970;
	return class318;
    }
    
    public static void method1873(byte i) {
	if (i > -111)
	    aClass351_3165 = null;
	aClass351_3165 = null;
    }
    
    final int method1874(int i) {
	anInt3161++;
	int i_0_ = i;
	for (Class318 class318 = ((Class318) aClass318_3166).aClass318_3970;
	     aClass318_3166 != class318;
	     class318 = ((Class318) class318).aClass318_3970)
	    i_0_++;
	return i_0_;
    }
    
    final Class318 method1875(int i) {
	anInt3160++;
	Class318 class318 = ((Class318) aClass318_3166).aClass318_3970;
	if (class318 == aClass318_3166)
	    return null;
	class318.method2373(false);
	if (i != 60)
	    method1878((byte) 16);
	return class318;
    }
    
    final void method1876(byte i) {
	if (i == -45) {
	    anInt3168++;
	    for (;;) {
		Class318 class318 = ((Class318) aClass318_3166).aClass318_3970;
		if (class318 == aClass318_3166)
		    break;
		class318.method2373(false);
	    }
	    aClass318_3167 = null;
	}
    }
    
    static final void method1877(ha var_ha, int i) {
	anInt3164++;
	if (i >= -20)
	    method1877(null, -112);
	for (Class318_Sub10 class318_sub10
		 = (Class318_Sub10) Class152.aClass243_2077.method1872(8);
	     class318_sub10 != null;
	     class318_sub10 = (Class318_Sub10) Class152.aClass243_2077
						   .method1878((byte) 124)) {
	    if (((Class318_Sub10) class318_sub10).aBoolean6482)
		class318_sub10.method2528(var_ha);
	}
    }
    
    final Class318 method1878(byte i) {
	anInt3159++;
	Class318 class318 = aClass318_3167;
	int i_1_ = -59 % ((67 - i) / 55);
	if (class318 == aClass318_3166) {
	    aClass318_3167 = null;
	    return null;
	}
	aClass318_3167 = ((Class318) class318).aClass318_3970;
	return class318;
    }
    
    static final void method1879(boolean bool) {
	if (bool) {
	    Class147.aClass357ArrayArrayArray2029
		= Class348_Sub31_Sub2.aClass357ArrayArrayArray9082;
	    aa_Sub1.aSArray5191 = Class332.aSArray4142;
	} else {
	    Class147.aClass357ArrayArrayArray2029
		= Class65.aClass357ArrayArrayArray1148;
	    aa_Sub1.aSArray5191 = Class348_Sub1_Sub1.aSArray8801;
	}
	Class189.anInt2524 = Class147.aClass357ArrayArrayArray2029.length;
    }
    
    public Class243() {
	((Class318) aClass318_3166).aClass318_3976 = aClass318_3166;
	((Class318) aClass318_3166).aClass318_3970 = aClass318_3166;
    }
}
