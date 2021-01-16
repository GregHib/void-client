/* Class178 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class178
{
    static int anInt2336;
    static int anInt2337;
    static Class114 aClass114_2338 = new Class114(92, -1);
    static Class29 aClass29_2339 = new Class29(14, 0);
    static int anInt2340;
    static Class29 aClass29_2341 = new Class29(15, 4);
    static Class29 aClass29_2342 = new Class29(16, -2);
    static Class29 aClass29_2343 = new Class29(17, 0);
    static Class29 aClass29_2344 = new Class29(18, -2);
    static Class29 aClass29_2345 = new Class29(19, -2);
    static Class29 aClass29_2346 = new Class29(20, 6);
    static Class29 aClass29_2347 = new Class29(21, 9);
    static Class29 aClass29_2348 = new Class29(22, -2);
    static Class29 aClass29_2349 = new Class29(23, 4);
    static Class29 aClass29_2350 = new Class29(24, -1);
    static Class29 aClass29_2351 = new Class29(26, 0);
    static Class29 aClass29_2352 = new Class29(27, 0);
    static Class29 aClass29_2353 = new Class29(28, -2);
    private static Class29[] aClass29Array2354 = new Class29[32];
    
    public static void method1355(int i) {
	aClass29_2346 = null;
	aClass29_2349 = null;
	aClass29_2344 = null;
	aClass29_2352 = null;
	aClass114_2338 = null;
	if (i > -74)
	    method1356(true, null, -116, -47, true, null, true);
	aClass29_2350 = null;
	aClass29Array2354 = null;
	aClass29_2353 = null;
	aClass29_2351 = null;
	aClass29_2339 = null;
	aClass29_2343 = null;
	aClass29_2341 = null;
	aClass29_2345 = null;
	aClass29_2342 = null;
	aClass29_2348 = null;
	aClass29_2347 = null;
    }
    
    static final void method1356(boolean bool, String string, int i, int i_0_,
				 boolean bool_1_, String string_2_,
				 boolean bool_3_) {
	try {
	    anInt2337++;
	    ((Class45) Class174.aClass45_2306).anInt634 = 1;
	    string_2_ = string_2_.toLowerCase();
	    short[] is = new short[16];
	    int i_4_ = -1;
	    String string_5_ = null;
	    if (i_0_ != -1) {
		Class254 class254
		    = Class101_Sub3.aClass326_5764.method2600(i_0_, 28364);
		if (class254 == null || bool != class254.method1925(!bool_3_))
		    return;
		if (class254.method1925(!bool_3_))
		    string_5_ = ((Class254) class254).aString3258;
		else
		    i_4_ = ((Class254) class254).anInt3256;
	    }
	    int i_6_ = 0;
	    int i_7_ = 0;
	    if (bool_3_ != true)
		aClass29_2352 = null;
	    for (/**/;
		 i_7_ < ((Class255) Exception_Sub1.aClass255_112).anInt3271;
		 i_7_++) {
		Class213 class213
		    = Exception_Sub1.aClass255_112.method1940(-74, i_7_);
		if ((!bool_1_ || ((Class213) class213).aBoolean2755)
		    && ((Class213) class213).anInt2833 == -1
		    && ((Class213) class213).anInt2812 == -1
		    && ((Class213) class213).anInt2799 == 0
		    && ((Class213) class213).aString2795.toLowerCase()
			   .indexOf(string_2_) != -1) {
		    if (i_0_ != -1) {
			if (bool) {
			    if (!string.equals(class213.method1561
					       (string_5_, i_0_, -1511086397)))
				continue;
			} else if (class213.method1567(i_4_, -116, i_0_) != i)
			    continue;
		    }
		    if ((i_6_ ^ 0xffffffff) <= -251) {
			Class192.aShortArray2579 = null;
			Class76.anInt1285 = -1;
			return;
		    }
		    if (is.length <= i_6_) {
			short[] is_8_ = new short[2 * is.length];
			for (int i_9_ = 0; i_9_ < i_6_; i_9_++)
			    is_8_[i_9_] = is[i_9_];
			is = is_8_;
		    }
		    is[i_6_++] = (short) i_7_;
		}
	    }
	    Class192.aShortArray2579 = is;
	    Class76.anInt1285 = i_6_;
	    Class148.anInt2037 = 0;
	    String[] strings = new String[Class76.anInt1285];
	    for (int i_10_ = 0;
		 (i_10_ ^ 0xffffffff) > (Class76.anInt1285 ^ 0xffffffff);
		 i_10_++)
		strings[i_10_]
		    = ((Class213) Exception_Sub1.aClass255_112
				      .method1940(123, is[i_10_])).aString2795;
	    Class174.method1333(Class192.aShortArray2579, 26073, strings);
	    Class174.aClass45_2306.method412((byte) 116);
	    ((Class45) Class174.aClass45_2306).anInt634 = 2;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("qa.A(" + bool + ','
					     + (string != null ? "{...}"
						: "null")
					     + ',' + i + ',' + i_0_ + ','
					     + bool_1_ + ','
					     + (string_2_ != null ? "{...}"
						: "null")
					     + ',' + bool_3_ + ')'));
	}
    }
    
    static {
	Class29[] class29s = Class5_Sub1.method188((byte) 59);
	for (int i = 0; i < class29s.length; i++)
	    aClass29Array2354[((Class29) class29s[i]).anInt400] = class29s[i];
    }
}
