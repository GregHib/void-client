/* Class362 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class362
{
    static Class324 aClass324_4456;
    static int anInt4457;
    static int anInt4458 = -1;
    static int anInt4459;
    static Class183 aClass183_4460;
    
    static final void method3511(boolean bool, Class324 class324,
				 Class143 class143, String string, int i,
				 ha var_ha) {
	try {
	    if (i != 2)
		aClass324_4456 = null;
	    anInt4457++;
	    boolean bool_0_
		= !Class295.aBoolean3763 || Class359.method3490(true);
	    if (bool_0_) {
		if (Class295.aBoolean3763 && bool_0_) {
		    class143 = Class281.aClass143_3649;
		    class324 = var_ha.method3686(class143,
						 (Class5_Sub1_Sub1
						  .aClass207Array9929),
						 true);
		    int i_1_ = class143.method1187(string, false, 250, null);
		    int i_2_
			= class143.method1185(null, i ^ 0x2,
					      ((Class143) class143).anInt1992,
					      250, string);
		    int i_3_
			= ((Class207) Class348_Sub7.aClass207_6643).anInt2702;
		    int i_4_ = i_3_ + 4;
		    i_2_ += 2 * i_4_;
		    i_1_ += 2 * i_4_;
		    if ((Class269.anInt3451 ^ 0xffffffff)
			< (i_2_ ^ 0xffffffff))
			i_2_ = Class269.anInt3451;
		    if (i_1_ < Class289.anInt3704)
			i_1_ = Class289.anInt3704;
		    int i_5_
			= (Class95.aClass221_1542.method1607(Class92.anInt1524,
							     i_1_, (byte) -107)
			   - -Class290.anInt3712);
		    int i_6_ = (Class239_Sub27.aClass341_6128
				    .method2679(ha_Sub2.anInt7666, i_2_, 1595)
				+ Class239_Sub3.anInt5871);
		    if (Class59_Sub1.aBoolean5300) {
			i_5_ += s_Sub3.method4008((byte) -124);
			i_6_ += Class16.method260(false);
		    }
		    var_ha.method3691(Class112.aClass207_1727, false).method965
			((((Class207) Class348_Sub40_Sub1.aClass207_9090)
			  .anInt2702) + i_5_,
			 (((Class207) Class348_Sub40_Sub1.aClass207_9090)
			  .anInt2696) + i_6_,
			 -(2 * (((Class207) Class348_Sub40_Sub1.aClass207_9090)
				.anInt2702)) + i_1_,
			 -((((Class207) Class348_Sub40_Sub1.aClass207_9090)
			    .anInt2696)
			   * 2) + i_2_,
			 1, 0, 0);
		    var_ha.method3691
			(Class348_Sub40_Sub1.aClass207_9090, true)
			.method974(i_5_, i_6_);
		    Class348_Sub40_Sub1.aClass207_9090.method1518();
		    var_ha.method3691
			(Class348_Sub40_Sub1.aClass207_9090, true)
			.method974(i_5_ + i_1_ - i_3_, i_6_);
		    Class348_Sub40_Sub1.aClass207_9090.method1514();
		    var_ha.method3691
			(Class348_Sub40_Sub1.aClass207_9090, true).method974
			(i_5_ - -i_1_ + -i_3_, -i_3_ + (i_6_ - -i_2_));
		    Class348_Sub40_Sub1.aClass207_9090.method1518();
		    var_ha.method3691
			(Class348_Sub40_Sub1.aClass207_9090, true)
			.method974(i_5_, -i_3_ + i_6_ - -i_2_);
		    Class348_Sub40_Sub1.aClass207_9090.method1514();
		    var_ha.method3691(Class348_Sub7.aClass207_6643, true)
			.method972
			(i_5_,
			 (((Class207) Class348_Sub40_Sub1.aClass207_9090)
			  .anInt2696) + i_6_,
			 i_3_,
			 -(2 * (((Class207) Class348_Sub40_Sub1.aClass207_9090)
				.anInt2696)) + i_2_);
		    Class348_Sub7.aClass207_6643.method1520();
		    var_ha.method3691(Class348_Sub7.aClass207_6643, true)
			.method972
			((((Class207) Class348_Sub40_Sub1.aClass207_9090)
			  .anInt2702) + i_5_,
			 i_6_,
			 -((((Class207) Class348_Sub40_Sub1.aClass207_9090)
			    .anInt2702)
			   * 2) + i_1_,
			 i_3_);
		    Class348_Sub7.aClass207_6643.method1520();
		    var_ha.method3691(Class348_Sub7.aClass207_6643, true)
			.method972
			(i_5_ - -i_1_ + -i_3_,
			 (((Class207) Class348_Sub40_Sub1.aClass207_9090)
			  .anInt2696) + i_6_,
			 i_3_,
			 -(2 * (((Class207) Class348_Sub40_Sub1.aClass207_9090)
				.anInt2696)) + i_2_);
		    Class348_Sub7.aClass207_6643.method1520();
		    var_ha.method3691(Class348_Sub7.aClass207_6643, true)
			.method972
			((((Class207) Class348_Sub40_Sub1.aClass207_9090)
			  .anInt2702) + i_5_,
			 -i_3_ + i_6_ - -i_2_,
			 -(2 * (((Class207) Class348_Sub40_Sub1.aClass207_9090)
				.anInt2702)) + i_1_,
			 i_3_);
		    Class348_Sub7.aClass207_6643.method1520();
		    class324.method2584(null, 0, -1, null,
					~0xffffff | Class86.anInt1479, 1,
					i_2_ + -(i_4_ * 2), null, i_6_ + i_4_,
					0, 0, -(2 * i_4_) + i_1_, i_5_ + i_4_,
					false, 1, string);
		    Class13.method226(i_5_, i_1_, i_6_, i ^ 0x2, i_2_);
		} else {
		    int i_7_ = class143.method1187(string, false, 250, null);
		    int i_8_ = class143.method1190(null, 1, string, 250) * 13;
		    int i_9_ = 4;
		    int i_10_ = 6 - -i_9_;
		    int i_11_ = i_9_ + 6;
		    var_ha.aa(i_10_ + -i_9_, i_11_ + -i_9_, i_9_ + i_7_ + i_9_,
			      i_8_ + (i_9_ - -i_9_), -16777216, 0);
		    var_ha.method3628(i_10_ - i_9_, -i_9_ + i_11_,
				      i_9_ + (i_7_ + i_9_), i_9_ + i_9_ + i_8_,
				      -1, 0);
		    class324.method2584(null, 0, -1, null, -1, 1, i_8_, null,
					i_11_, 0, 0, i_7_, i_10_, false, 1,
					string);
		    Class13.method226(i_10_ - i_9_, i_9_ + i_7_ - -i_9_,
				      i_11_ + -i_9_, i + -2,
				      i_9_ + i_8_ - -i_9_);
		}
		if (bool) {
		    try {
			if (!Class59_Sub1.aBoolean5300)
			    var_ha.method3689((byte) 118);
			else
			    Class45.method395(i + 79);
		    } catch (Exception_Sub1 exception_sub1) {
			/* empty */
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("fg.A(" + bool + ','
			+ (class324 != null ? "{...}" : "null") + ','
			+ (class143 != null ? "{...}" : "null") + ','
			+ (string != null ? "{...}" : "null") + ',' + i + ','
			+ (var_ha != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static void method3512(int i) {
	aClass183_4460 = null;
	if (i != 4)
	    anInt4458 = 96;
	aClass324_4456 = null;
    }
}
