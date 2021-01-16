/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class240 implements Interface1
{
    static Class323 aClass323_4672;
    static float aFloat4673;
    static int anInt4674 = 0;
    static int anInt4675;
    static int anInt4676;
    static int anInt4677;
    static int anInt4678;
    static Class105[] aClass105Array4679;
    static int anInt4680;
    static int anInt4681;
    private Class339 aClass339_4682;
    static long aLong4683;
    static Class324 aClass324_4684;
    private Class125 aClass125_4685;
    static int anInt4686;
    
    public final boolean method8(byte i) {
	anInt4678++;
	int i_0_ = -50 / ((25 - i) / 52);
	return aClass339_4682.method2668(-21913);
    }
    
    static final void method1852(int i, int i_1_, int i_2_, int i_3_) {
	Class357 class357
	    = Class147.aClass357ArrayArrayArray2029[i][i_1_][i_2_];
	if (class357 != null) {
	    Class318_Sub1_Sub5 class318_sub1_sub5
		= ((Class357) class357).aClass318_Sub1_Sub5_4395;
	    Class318_Sub1_Sub5 class318_sub1_sub5_4_
		= ((Class357) class357).aClass318_Sub1_Sub5_4407;
	    if (class318_sub1_sub5 != null) {
		((Class318_Sub1_Sub5) class318_sub1_sub5).aShort8781
		    = (short) ((((Class318_Sub1_Sub5) class318_sub1_sub5)
				.aShort8781)
			       * i_3_ / (16 << Class362.anInt4459 - 7));
		((Class318_Sub1_Sub5) class318_sub1_sub5).aShort8769
		    = (short) ((((Class318_Sub1_Sub5) class318_sub1_sub5)
				.aShort8769)
			       * i_3_ / (16 << Class362.anInt4459 - 7));
	    }
	    if (class318_sub1_sub5_4_ != null) {
		((Class318_Sub1_Sub5) class318_sub1_sub5_4_).aShort8781
		    = (short) ((((Class318_Sub1_Sub5) class318_sub1_sub5_4_)
				.aShort8781)
			       * i_3_ / (16 << Class362.anInt4459 - 7));
		((Class318_Sub1_Sub5) class318_sub1_sub5_4_).aShort8769
		    = (short) ((((Class318_Sub1_Sub5) class318_sub1_sub5_4_)
				.aShort8769)
			       * i_3_ / (16 << Class362.anInt4459 - 7));
	    }
	}
    }
    
    public static void method1853(byte i) {
	aClass105Array4679 = null;
	if (i != 48)
	    anInt4674 = -62;
	aClass323_4672 = null;
	aClass324_4684 = null;
    }
    
    static final int method1854(int i, int i_5_, boolean bool, int i_6_) {
	if (i < 45)
	    method1852(83, 33, 101, -55);
	anInt4681++;
	Class348_Sub13 class348_sub13
	    = Class258_Sub4.method1974((byte) 37, i_5_, bool);
	if (class348_sub13 == null)
	    return 0;
	if (i_6_ < 0
	    || i_6_ >= ((Class348_Sub13) class348_sub13).anIntArray6758.length)
	    return 0;
	return ((Class348_Sub13) class348_sub13).anIntArray6758[i_6_];
    }
    
    public final void method7(int i) {
	if (i == 10286)
	    anInt4675++;
    }
    
    public final void method9(byte i, boolean bool) {
	anInt4676++;
	Class295 class295
	    = aClass339_4682.method2667(false,
					((Class125) aClass125_4685).anInt4918);
	if (class295 != null) {
	    int i_7_ = ((((Class125) aClass125_4685).aClass221_4922.method1607
			 (Class92.anInt1524,
			  ((Class125) aClass125_4685).anInt4929, (byte) -118))
			- -((Class125) aClass125_4685).anInt4924);
	    int i_8_ = ((((Class125) aClass125_4685).aClass341_4925.method2679
			 (ha_Sub2.anInt7666,
			  ((Class125) aClass125_4685).anInt4923, i ^ ~0x60b))
			- -((Class125) aClass125_4685).anInt4920);
	    if (((Class125) aClass125_4685).aBoolean4914)
		Class348_Sub8.aHa6654.method3628
		    (i_7_, i_8_, ((Class125) aClass125_4685).anInt4929,
		     ((Class125) aClass125_4685).anInt4923,
		     ((Class125) aClass125_4685).anInt4917, 0);
	    i_8_ += method1855(5, ((Class295) class295).aString3756, true,
			       Class262.aClass324_3326, i_7_, i_8_) * 12;
	    i_8_ += 8;
	    if (((Class125) aClass125_4685).aBoolean4914)
		Class348_Sub8.aHa6654.method3709
		    (i_7_, i_8_,
		     i_7_ + ((Class125) aClass125_4685).anInt4929 + -1, i_8_,
		     ((Class125) aClass125_4685).anInt4917, 0);
	    i_8_ = ++i_8_ + method1855(5, ((Class295) class295).aString3754,
				       true, Class262.aClass324_3326, i_7_,
				       i_8_) * 12;
	    i_8_ += 5;
	    i_8_ += method1855(5, ((Class295) class295).aString3758, true,
			       Class262.aClass324_3326, i_7_, i_8_) * 12;
	}
	if (i != -49)
	    method8((byte) 12);
    }
    
    private final int method1855(int i, String string, boolean bool,
				 Class324 class324, int i_9_, int i_10_) {
	try {
	    if (bool != true)
		return -62;
	    anInt4677++;
	    return (class324.method2584
		    (null, 0, ((Class125) aClass125_4685).anInt4928, null,
		     ((Class125) aClass125_4685).anInt4913, 0,
		     -(i * 2) + ((Class125) aClass125_4685).anInt4923, null,
		     i + i_10_, 0, 0,
		     -(i * 2) + ((Class125) aClass125_4685).anInt4929,
		     i_9_ + i, false, 0, string));
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ta.A(" + i + ','
					     + (string != null ? "{...}"
						: "null")
					     + ',' + bool + ','
					     + (class324 != null ? "{...}"
						: "null")
					     + ',' + i_9_ + ',' + i_10_
					     + ')'));
	}
    }
    
    Class240(Class339 class339, Class125 class125) {
	try {
	    aClass125_4685 = class125;
	    aClass339_4682 = class339;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ta.<init>("
					     + (class339 != null ? "{...}"
						: "null")
					     + ','
					     + (class125 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
}
