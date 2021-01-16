/* Class348_Sub16_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub16_Sub1 extends Class348_Sub16
{
    static int anInt8845;
    static int anInt8846;
    static int anInt8847;
    Class262 aClass262_8848 = new Class262();
    static int anInt8849;
    static int anInt8850;
    static int anInt8851;
    private Class348_Sub16_Sub3 aClass348_Sub16_Sub3_8852;
    static Class74 aClass74_8853 = new Class74(11, 8);
    static int anInt8854;
    Class348_Sub16_Sub4 aClass348_Sub16_Sub4_8855 = new Class348_Sub16_Sub4();
    static int anInt8856;
    static Class351 aClass351_8857 = new Class351(54, 15);
    static int anInt8858;
    static int anInt8859;
    
    final Class348_Sub16 method2818() {
	anInt8856++;
	Class348_Sub43 class348_sub43;
	do {
	    class348_sub43
		= (Class348_Sub43) ((Class348_Sub16_Sub1) this)
				       .aClass262_8848.method1990((byte) 122);
	    if (class348_sub43 == null)
		return null;
	} while (((Class348_Sub43) class348_sub43).aClass348_Sub16_Sub5_7081
		 == null);
	return ((Class348_Sub43) class348_sub43).aClass348_Sub16_Sub5_7081;
    }
    
    final void method2817(int[] is, int i, int i_0_) {
	anInt8847++;
	((Class348_Sub16_Sub1) this).aClass348_Sub16_Sub4_8855
	    .method2817(is, i, i_0_);
    while_125_:
	for (Class348_Sub43 class348_sub43
		 = ((Class348_Sub43)
		    ((Class348_Sub16_Sub1) this).aClass262_8848.method1995(4));
	     class348_sub43 != null;
	     class348_sub43
		 = (Class348_Sub43) ((Class348_Sub16_Sub1) this)
					.aClass262_8848
					.method1990((byte) 121)) {
	    if (!aClass348_Sub16_Sub3_8852.method2847(-107, class348_sub43)) {
		int i_1_ = i;
		int i_2_ = i_0_;
		while (((Class348_Sub43) class348_sub43).anInt7086 < i_2_) {
		    method2825(i_1_ + i_2_, class348_sub43, i_1_, (byte) -114,
			       ((Class348_Sub43) class348_sub43).anInt7086,
			       is);
		    i_1_ += ((Class348_Sub43) class348_sub43).anInt7086;
		    i_2_ -= ((Class348_Sub43) class348_sub43).anInt7086;
		    if (aClass348_Sub16_Sub3_8852.method2852(is, i_2_,
							     class348_sub43,
							     i_1_, (byte) -4))
			continue while_125_;
		}
		method2825(i_1_ + i_2_, class348_sub43, i_1_, (byte) -114,
			   i_2_, is);
		((Class348_Sub43) class348_sub43).anInt7086 -= i_2_;
	    }
	}
    }
    
    static final void method2822
	(int i, Class348_Sub49_Sub2 class348_sub49_sub2, int i_3_) {
	Class101_Sub3.anInt5768 = 0;
	anInt8846++;
	Class55.aBoolean979 = false;
	if (i < -17) {
	    Class348_Sub40_Sub18.method3094(-21478, class348_sub49_sub2);
	    Class375.method3612(75, class348_sub49_sub2);
	    if (Class55.aBoolean979)
		System.out.println("---endgpp---");
	    if ((i_3_ ^ 0xffffffff)
		!= (((Class348_Sub49) class348_sub49_sub2).anInt7197
		    ^ 0xffffffff))
		throw new RuntimeException("gpi1 pos:"
					   + ((Class348_Sub49)
					      class348_sub49_sub2).anInt7197
					   + " psize:" + i_3_);
	}
    }
    
    public static void method2823(int i) {
	if (i != 0)
	    method2823(33);
	aClass351_8857 = null;
	aClass74_8853 = null;
    }
    
    private final void method2824(int i, byte i_4_,
				  Class348_Sub43 class348_sub43) {
	if (((((Class348_Sub16_Sub3) aClass348_Sub16_Sub3_8852).anIntArray8895
	      [((Class348_Sub43) class348_sub43).anInt7067])
	     & 0x4) != 0
	    && ((((Class348_Sub43) class348_sub43).anInt7087 ^ 0xffffffff)
		> -1)) {
	    int i_5_ = ((((Class348_Sub16_Sub3) aClass348_Sub16_Sub3_8852)
			 .anIntArray8906
			 [((Class348_Sub43) class348_sub43).anInt7067])
			/ Class22.anInt339);
	    int i_6_ = ((-((Class348_Sub43) class348_sub43).anInt7082
			 + (1048575 + i_5_))
			/ i_5_);
	    ((Class348_Sub43) class348_sub43).anInt7082
		= (i_5_ * i + ((Class348_Sub43) class348_sub43).anInt7082
		   & 0xfffff);
	    if ((i ^ 0xffffffff) <= (i_6_ ^ 0xffffffff)) {
		if ((((Class348_Sub16_Sub3) aClass348_Sub16_Sub3_8852)
		     .anIntArray8914
		     [((Class348_Sub43) class348_sub43).anInt7067])
		    != 0) {
		    ((Class348_Sub43) class348_sub43).aClass348_Sub16_Sub5_7081
			= (Class348_Sub16_Sub5.method2911
			   ((((Class348_Sub43) class348_sub43)
			     .aClass348_Sub19_Sub1_7077),
			    ((Class348_Sub43) class348_sub43)
				.aClass348_Sub16_Sub5_7081.method2914(),
			    0,
			    ((Class348_Sub43) class348_sub43)
				.aClass348_Sub16_Sub5_7081.method2892()));
		    aClass348_Sub16_Sub3_8852.method2874
			(95,
			 (((Class348_Sub17) (((Class348_Sub43) class348_sub43)
					     .aClass348_Sub17_7085))
			  .aShortArray6795
			  [((Class348_Sub43) class348_sub43).anInt7071]) < 0,
			 class348_sub43);
		} else
		    ((Class348_Sub43) class348_sub43).aClass348_Sub16_Sub5_7081
			= (Class348_Sub16_Sub5.method2911
			   ((((Class348_Sub43) class348_sub43)
			     .aClass348_Sub19_Sub1_7077),
			    ((Class348_Sub43) class348_sub43)
				.aClass348_Sub16_Sub5_7081.method2914(),
			    ((Class348_Sub43) class348_sub43)
				.aClass348_Sub16_Sub5_7081.method2906(),
			    ((Class348_Sub43) class348_sub43)
				.aClass348_Sub16_Sub5_7081.method2892()));
		if ((((Class348_Sub17)
		      ((Class348_Sub43) class348_sub43).aClass348_Sub17_7085)
		     .aShortArray6795
		     [((Class348_Sub43) class348_sub43).anInt7071])
		    < 0)
		    ((Class348_Sub43) class348_sub43)
			.aClass348_Sub16_Sub5_7081.method2917(-1);
		i = ((Class348_Sub43) class348_sub43).anInt7082 / i_5_;
	    }
	}
	anInt8849++;
	int i_7_ = -70 / ((14 - i_4_) / 61);
	((Class348_Sub43) class348_sub43).aClass348_Sub16_Sub5_7081
	    .method2819(i);
    }
    
    final int method2821() {
	anInt8858++;
	return 0;
    }
    
    final void method2819(int i) {
	((Class348_Sub16_Sub1) this).aClass348_Sub16_Sub4_8855.method2819(i);
	anInt8850++;
    while_127_:
	for (Class348_Sub43 class348_sub43
		 = ((Class348_Sub43)
		    ((Class348_Sub16_Sub1) this).aClass262_8848.method1995(4));
	     class348_sub43 != null;
	     class348_sub43
		 = (Class348_Sub43) ((Class348_Sub16_Sub1) this)
					.aClass262_8848
					.method1990((byte) 38)) {
	    if (!aClass348_Sub16_Sub3_8852.method2847(53, class348_sub43)) {
		int i_8_ = i;
		while (i_8_ > ((Class348_Sub43) class348_sub43).anInt7086) {
		    method2824(((Class348_Sub43) class348_sub43).anInt7086,
			       (byte) 115, class348_sub43);
		    i_8_ -= ((Class348_Sub43) class348_sub43).anInt7086;
		    if (aClass348_Sub16_Sub3_8852.method2852(null, i_8_,
							     class348_sub43, 0,
							     (byte) -4))
			continue while_127_;
		}
		method2824(i_8_, (byte) 84, class348_sub43);
		((Class348_Sub43) class348_sub43).anInt7086 -= i_8_;
	    }
	}
    }
    
    private final void method2825(int i, Class348_Sub43 class348_sub43,
				  int i_9_, byte i_10_, int i_11_, int[] is) {
	try {
	    anInt8859++;
	    if (i_10_ != -114)
		method2821();
	    if ((0x4 & (((Class348_Sub16_Sub3) aClass348_Sub16_Sub3_8852)
			.anIntArray8895
			[((Class348_Sub43) class348_sub43).anInt7067])) != 0
		&& ((((Class348_Sub43) class348_sub43).anInt7087 ^ 0xffffffff)
		    > -1)) {
		int i_12_ = ((((Class348_Sub16_Sub3) aClass348_Sub16_Sub3_8852)
			      .anIntArray8906
			      [((Class348_Sub43) class348_sub43).anInt7067])
			     / Class22.anInt339);
		for (;;) {
		    int i_13_
			= ((i_12_
			    + (1048575
			       + -((Class348_Sub43) class348_sub43).anInt7082))
			   / i_12_);
		    if ((i_11_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff))
			break;
		    ((Class348_Sub43) class348_sub43)
			.aClass348_Sub16_Sub5_7081.method2817(is, i_9_, i_13_);
		    i_9_ += i_13_;
		    ((Class348_Sub43) class348_sub43).anInt7082
			+= -1048576 + i_12_ * i_13_;
		    i_11_ -= i_13_;
		    int i_14_ = Class22.anInt339 / 100;
		    int i_15_ = 262144 / i_12_;
		    if (i_15_ < i_14_)
			i_14_ = i_15_;
		    Class348_Sub16_Sub5 class348_sub16_sub5
			= (((Class348_Sub43) class348_sub43)
			   .aClass348_Sub16_Sub5_7081);
		    if ((((Class348_Sub16_Sub3) aClass348_Sub16_Sub3_8852)
			 .anIntArray8914
			 [((Class348_Sub43) class348_sub43).anInt7067])
			!= 0) {
			((Class348_Sub43) class348_sub43)
			    .aClass348_Sub16_Sub5_7081
			    = (Class348_Sub16_Sub5.method2911
			       ((((Class348_Sub43) class348_sub43)
				 .aClass348_Sub19_Sub1_7077),
				class348_sub16_sub5.method2914(), 0,
				class348_sub16_sub5.method2892()));
			aClass348_Sub16_Sub3_8852.method2874
			    (116,
			     ((((Class348_Sub17)
				(((Class348_Sub43) class348_sub43)
				 .aClass348_Sub17_7085))
			       .aShortArray6795
			       [((Class348_Sub43) class348_sub43).anInt7071])
			      < 0),
			     class348_sub43);
			((Class348_Sub43) class348_sub43)
			    .aClass348_Sub16_Sub5_7081.method2916
			    (i_14_, class348_sub16_sub5.method2906());
		    } else
			((Class348_Sub43) class348_sub43)
			    .aClass348_Sub16_Sub5_7081
			    = (Class348_Sub16_Sub5.method2911
			       ((((Class348_Sub43) class348_sub43)
				 .aClass348_Sub19_Sub1_7077),
				class348_sub16_sub5.method2914(),
				class348_sub16_sub5.method2906(),
				class348_sub16_sub5.method2892()));
		    if (((((Class348_Sub17) (((Class348_Sub43) class348_sub43)
					     .aClass348_Sub17_7085))
			  .aShortArray6795
			  [((Class348_Sub43) class348_sub43).anInt7071])
			 ^ 0xffffffff)
			> -1)
			((Class348_Sub43) class348_sub43)
			    .aClass348_Sub16_Sub5_7081.method2917(-1);
		    class348_sub16_sub5.method2902(i_14_);
		    class348_sub16_sub5.method2817(is, i_9_, -i_9_ + i);
		    if (class348_sub16_sub5.method2895())
			((Class348_Sub16_Sub1) this)
			    .aClass348_Sub16_Sub4_8855
			    .method2883(class348_sub16_sub5);
		}
		((Class348_Sub43) class348_sub43).anInt7082 += i_11_ * i_12_;
	    }
	    ((Class348_Sub43) class348_sub43).aClass348_Sub16_Sub5_7081
		.method2817(is, i_9_, i_11_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("bea.H(" + i + ','
					     + (class348_sub43 != null
						? "{...}" : "null")
					     + ',' + i_9_ + ',' + i_10_ + ','
					     + i_11_ + ','
					     + (is != null ? "{...}" : "null")
					     + ')'));
	}
    }
    
    static final Class47 method2826(int i) {
	anInt8845++;
	try {
	    return (Class47) Class.forName("Class47_Sub2").newInstance();
	} catch (Throwable throwable) {
	    if (i != 15)
		return null;
	    return new Class47_Sub1();
	}
    }
    
    final Class348_Sub16 method2816() {
	anInt8851++;
	Class348_Sub43 class348_sub43
	    = ((Class348_Sub43)
	       ((Class348_Sub16_Sub1) this).aClass262_8848.method1995(4));
	if (class348_sub43 == null)
	    return null;
	if (((Class348_Sub43) class348_sub43).aClass348_Sub16_Sub5_7081
	    != null)
	    return ((Class348_Sub43) class348_sub43).aClass348_Sub16_Sub5_7081;
	return method2818();
    }
    
    Class348_Sub16_Sub1(Class348_Sub16_Sub3 class348_sub16_sub3) {
	aClass348_Sub16_Sub3_8852 = class348_sub16_sub3;
    }
}
