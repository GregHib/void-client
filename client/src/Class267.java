/* Class267 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class267
{
    static int anInt3390;
    static int anInt3391;
    private Class69 aClass69_3392;
    static int anInt3393;
    private int anInt3394 = 1;
    static int anInt3395;
    static Class267 aClass267_3396 = new Class267(Class69.aClass69_1195);
    static int anInt3397;
    private Interface7 anInterface7_3398;
    static int anInt3399;
    static int anInt3400;
    static Class267 aClass267_3401 = new Class267(Class69.aClass69_1199);
    static Class267 aClass267_3402 = new Class267(Class69.aClass69_1199);
    static Class267 aClass267_3403 = new Class267(Class69.aClass69_1199);
    static Class267 aClass267_3404 = new Class267(Class69.aClass69_1199);
    static Class267 aClass267_3405 = new Class267(Class69.aClass69_1199);
    static Class267 aClass267_3406 = new Class267(Class69.aClass69_1199);
    static Class267 aClass267_3407 = new Class267(Class69.aClass69_1199);
    static Class267 aClass267_3408 = new Class267(Class69.aClass69_1195);
    static Class267 aClass267_3409 = new Class267(Class69.aClass69_1195);
    static Class267 aClass267_3410 = new Class267(Class69.aClass69_1195);
    static Class267 aClass267_3411 = new Class267(Class69.aClass69_1195);
    static Class267 aClass267_3412 = new Class267(Class69.aClass69_1195);
    static Class267 aClass267_3413 = new Class267(Class69.aClass69_1195);
    static Class267 aClass267_3414 = new Class267(Class69.aClass69_1195);
    static Class267 aClass267_3415 = new Class267(Class69.aClass69_1195);
    static Class267 aClass267_3416 = new Class267(Class69.aClass69_1195);
    static Class267 aClass267_3417 = new Class267(Class69.aClass69_1195);
    static Class267 aClass267_3418 = new Class267(Class69.aClass69_1195);
    static Class267 aClass267_3419 = new Class267(Class69.aClass69_1195);
    static Class267 aClass267_3420 = new Class267(Class69.aClass69_1195);
    static Class267 aClass267_3421 = new Class267(Class69.aClass69_1195);
    static Class267 aClass267_3422 = new Class267(Class69.aClass69_1197);
    static Class267 aClass267_3423 = new Class267(Class69.aClass69_1195);
    static Class267 aClass267_3424 = new Class267(Class69.aClass69_1195);
    static Class267 aClass267_3425 = new Class267(Class69.aClass69_1195);
    static Class267 aClass267_3426 = new Class267(Class69.aClass69_1198);
    static Class114 aClass114_3427 = new Class114(93, -2);
    static int anInt3428 = -1;
    
    final int method2024(int i) {
	if (i != -1)
	    return 41;
	anInt3390++;
	return anInt3394;
    }
    
    final void method2025(Interface7 interface7, boolean bool) {
	anInt3399++;
	if (bool != false)
	    toString();
	if (interface7.method32(-15004) != aClass69_3392)
	    throw new IllegalArgumentException();
	anInterface7_3398 = interface7;
    }
    
    public static void method2026(int i) {
	aClass267_3421 = null;
	aClass267_3413 = null;
	aClass267_3404 = null;
	aClass267_3405 = null;
	aClass267_3403 = null;
	aClass267_3411 = null;
	if (i == 23377) {
	    aClass267_3410 = null;
	    aClass267_3420 = null;
	    aClass267_3414 = null;
	    aClass267_3409 = null;
	    aClass267_3418 = null;
	    aClass267_3426 = null;
	    aClass267_3412 = null;
	    aClass267_3423 = null;
	    aClass267_3424 = null;
	    aClass267_3408 = null;
	    aClass267_3416 = null;
	    aClass267_3407 = null;
	    aClass267_3406 = null;
	    aClass267_3419 = null;
	    aClass267_3401 = null;
	    aClass267_3425 = null;
	    aClass267_3402 = null;
	    aClass267_3415 = null;
	    aClass267_3396 = null;
	    aClass114_3427 = null;
	    aClass267_3422 = null;
	    aClass267_3417 = null;
	}
    }
    
    public final String toString() {
	anInt3400++;
	throw new IllegalStateException();
    }
    
    final Interface7 method2027(int i) {
	anInt3391++;
	if (i <= 68)
	    return null;
	return anInterface7_3398;
    }
    
    static final void method2028(int i, Class51 class51, int i_0_, ha var_ha,
				 int i_1_, int i_2_) {
	try {
	    anInt3395++;
	    Class218 class218
		= Class2.aClass141_117
		      .method1173((byte) 31, ((Class51) class51).anInt875);
	    if ((((Class218) class218).anInt2853 ^ 0xffffffff) != 0) {
		if (((Class51) class51).aBoolean912) {
		    i_1_ += ((Class51) class51).anInt923;
		    i_1_ &= 0x3;
		} else
		    i_1_ = 0;
		Class105 class105
		    = class218.method1596(i_1_,
					  ((Class51) class51).aBoolean925, 82,
					  var_ha);
		if (class105 != null) {
		    int i_3_ = ((Class51) class51).anInt961;
		    int i_4_ = ((Class51) class51).anInt926;
		    int i_5_ = 60 % ((52 - i_2_) / 56);
		    if ((0x1 & i_1_) == 1) {
			i_3_ = ((Class51) class51).anInt926;
			i_4_ = ((Class51) class51).anInt961;
		    }
		    int i_6_ = class105.method966();
		    int i_7_ = class105.method980();
		    if (((Class218) class218).aBoolean2854) {
			i_7_ = i_4_ * 4;
			i_6_ = i_3_ * 4;
		    }
		    if (((Class218) class218).anInt2856 == 0)
			class105.method973(i, -((i_4_ + -1) * 4) + i_0_, i_6_,
					   i_7_);
		    else
			class105.method970(i, i_0_ - 4 * (-1 + i_4_), i_6_,
					   i_7_, 0,
					   (((Class218) class218).anInt2856
					    | ~0xffffff),
					   1);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("up.C(" + i + ','
					     + (class51 != null ? "{...}"
						: "null")
					     + ',' + i_0_ + ','
					     + (var_ha != null ? "{...}"
						: "null")
					     + ',' + i_1_ + ',' + i_2_ + ')'));
	}
    }
    
    static final Class267[] method2029(int i) {
	if (i <= 99)
	    return null;
	anInt3393++;
	return (new Class267[]
		{ aClass267_3396, aClass267_3401, aClass267_3402,
		  aClass267_3403, aClass267_3404, aClass267_3405,
		  aClass267_3406, aClass267_3407, aClass267_3408,
		  aClass267_3409, aClass267_3410, aClass267_3411,
		  aClass267_3412, aClass267_3413, aClass267_3414,
		  aClass267_3415, aClass267_3416, aClass267_3417,
		  aClass267_3418, aClass267_3419, aClass267_3420,
		  aClass267_3421, aClass267_3422, aClass267_3423,
		  aClass267_3424, aClass267_3425, aClass267_3426 });
    }
    
    final void method2030(int i, int i_8_) {
	anInt3394 = i_8_;
	anInt3397++;
	if (i != 1)
	    method2026(34);
    }
    
    private Class267(Class69 class69) {
	aClass69_3392 = class69;
    }
}
