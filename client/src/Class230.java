/* Class230 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class230
{
    static int anInt2982;
    static int anInt2983;
    static int anInt2984;
    String aString2985;
    static int anInt2986 = 0;
    int anInt2987;
    static int anInt2988;
    static int anInt2989;
    
    static final void method1634(int[] is, int i, byte[][][] is_0_, int i_1_,
				 int i_2_, int[] is_3_, int i_4_, int i_5_,
				 boolean bool, int i_6_, int i_7_, int[] is_8_,
				 int[] is_9_, byte i_10_, int[] is_11_,
				 int i_12_, boolean bool_13_, int i_14_) {
	do {
	    try {
		anInt2982++;
		if (Class348_Sub49.anInt7207 != -1) {
		    int[] is_15_ = Class21.aHa326.Y();
		    int i_16_ = is_15_[0];
		    int i_17_ = is_15_[1];
		    int i_18_ = is_15_[2];
		    int i_19_ = is_15_[3];
		    int i_20_ = i_18_;
		    int i_21_ = i_19_;
		    if (Class348_Sub49.anInt7207 == 1) {
			i_20_ = (int) ((double) i_18_
				       * (double) Class107.anInt1651
				       / (double) Class239_Sub16.anInt6008);
			i_21_ = (int) ((double) Class107.anInt1651
				       * (double) i_19_
				       / (double) Class239_Sub16.anInt6008);
		    }
		    if (!Class348_Sub16_Sub2.aBoolean8870) {
			if (Class348_Sub49.anInt7207 == 1)
			    Class43.method383(0);
			int i_22_ = -Class105_Sub1.anInt8422 + i_4_;
			int i_23_ = i_6_ + -Class29.anInt403;
			int i_24_ = -Class348_Sub21.anInt6849 + i_5_;
			int i_25_
			    = (int) ((Class247.aDouble3182 * (double) i_22_
				      + (double) i_23_ * Class319.aDouble3980
				      + (double) i_24_ * Class357.aDouble4404)
				     * (double) i_20_ / (double) i_14_);
			int i_26_
			    = (int) ((((double) i_24_
				       * Class348_Sub42_Sub5.aDouble9531)
				      + (((double) i_22_
					  * Class348_Sub23_Sub2.aDouble9023)
					 + ((double) i_23_
					    * Class295.aDouble3761)))
				     * (double) i_21_ / (double) i_14_);
			double d
			    = ((double) i_24_ * Class348_Sub16_Sub2.aDouble8869
			       + (Class348_Sub15.aDouble6774 * (double) i_23_
				  + (double) i_22_ * Class59.aDouble1083));
			int i_27_
			    = i_25_ + Class211.anInt2747 - Class328.anInt4100;
			int i_28_ = (Class348_Sub42_Sub9_Sub1.anInt10444
				     + i_26_ + -Class348_Sub3.anInt6568);
			int i_29_ = Class59_Sub1.anInt5283 + i_27_;
			int i_30_ = Class107.anInt1651 + i_28_;
			if ((i_27_ < 0 || (i_28_ ^ 0xffffffff) > -1
			     || i_29_ > Class348_Sub16_Sub1.anInt8854
			     || ((Class239_Sub16.anInt6008 ^ 0xffffffff)
				 > (i_30_ ^ 0xffffffff)))
			    && Class348_Sub49.anInt7207 != 2) {
			    if ((i_29_ ^ 0xffffffff) >= -1 || i_30_ <= 0
				|| ((i_27_ ^ 0xffffffff)
				    <= (Class348_Sub16_Sub1.anInt8854
					^ 0xffffffff))
				|| ((Class239_Sub16.anInt6008 ^ 0xffffffff)
				    >= (i_28_ ^ 0xffffffff)))
				Class348_Sub16_Sub2.aBoolean8870 = true;
			    else {
				int i_31_ = i_27_ - Class211.anInt2747;
				int i_32_
				    = (i_28_
				       - Class348_Sub42_Sub9_Sub1.anInt10444);
				int i_33_ = 0;
				int i_34_ = 0;
				int i_35_ = 0;
				int i_36_ = 0;
				double d_37_ = 0.0;
				if ((Class348_Sub49.anInt7207 ^ 0xffffffff)
				    == -1) {
				    d_37_
					= d + Class348_Sub42_Sub4.aDouble9517;
				    i_33_ = i_31_;
				    i_34_ = i_32_;
				} else if ((Class348_Sub49.anInt7207
					    ^ 0xffffffff)
					   == -2) {
				    i_35_ = i_31_ / Class58.anInt1067;
				    i_36_ = i_32_ / Class344.anInt4267;
				    i_33_ = i_35_ * Class58.anInt1067;
				    i_34_ = i_36_ * Class344.anInt4267;
				    d_37_
					= ((d
					    + Class348_Sub42_Sub4.aDouble9517)
					   * (double) (i_32_ * i_34_
						       + i_33_ * i_31_)
					   / (double) (i_32_ * i_32_
						       + i_31_ * i_31_));
				}
				d_37_ = -d_37_;
				int i_38_ = 0;
				int i_39_ = 0;
				int i_40_ = 0;
				int i_41_ = 0;
				int i_42_ = 0;
				int i_43_;
				int i_44_;
				int i_45_;
				int i_46_;
				if ((i_33_ ^ 0xffffffff) <= -1) {
				    i_45_ = 0;
				    i_43_ = (-i_33_
					     + Class348_Sub16_Sub1.anInt8854);
				    if (Class348_Sub49.anInt7207 == 1) {
					i_42_ = i_35_;
					i_40_ = -i_35_ + Class31.anInt425;
				    }
				    i_46_ = i_33_;
				    i_44_ = i_43_;
				} else {
				    i_43_ = (Class348_Sub16_Sub1.anInt8854
					     + i_33_);
				    i_44_ = 0;
				    i_45_ = -i_33_;
				    i_46_ = i_45_;
				    if (Class348_Sub49.anInt7207 == 1) {
					i_42_ = -i_35_;
					i_40_ = 0;
				    }
				}
				int i_47_ = 0;
				int i_48_;
				int i_49_;
				int i_50_;
				int i_51_;
				int i_52_;
				int i_53_;
				if ((i_34_ ^ 0xffffffff) <= -1) {
				    i_50_ = Class239_Sub16.anInt6008 + -i_34_;
				    i_48_ = 0;
				    i_49_ = i_50_;
				    i_51_ = i_34_;
				    i_53_ = 0;
				    if ((Class348_Sub49.anInt7207 ^ 0xffffffff)
					== -2) {
					i_41_ = 0;
					i_39_ = i_36_;
					i_38_ = -i_36_ + Class250.anInt3225;
					i_47_ = i_38_;
				    }
				    i_52_ = i_50_;
				} else {
				    i_48_ = -i_34_;
				    i_49_ = 0;
				    i_50_ = Class239_Sub16.anInt6008 + i_34_;
				    i_51_ = i_48_;
				    i_52_ = i_50_;
				    i_53_ = i_51_;
				    if (Class348_Sub49.anInt7207 == 1) {
					i_39_ = -i_36_;
					i_38_ = 0;
					i_47_ = i_36_ + Class250.anInt3225;
					i_41_ = i_39_;
				    }
				}
				Class243 class243
				    = (((Class76) (Class348_Sub42_Sub8_Sub2
						   .aClass76_10436))
				       .aClass243_1282);
				for (Class318_Sub4 class318_sub4
					 = ((Class318_Sub4)
					    class243.method1872(8));
				     class318_sub4 != null;
				     class318_sub4
					 = ((Class318_Sub4)
					    class243.method1878((byte) 122))) {
				    Class318_Sub3[] class318_sub3s
					= (((Class318_Sub4) class318_sub4)
					   .aClass318_Sub3Array6414);
				    boolean bool_54_ = true;
				    for (int i_55_ = 0;
					 class318_sub3s.length > i_55_;
					 i_55_++) {
					Class318_Sub3 class318_sub3
					    = class318_sub3s[i_55_];
					int i_56_
					    = (((Class318_Sub3) class318_sub3)
					       .anInt6405);
					int i_57_
					    = (((Class318_Sub3) class318_sub3)
					       .anInt6402);
					int i_58_
					    = (((Class318_Sub3) class318_sub3)
					       .anInt6406);
					int i_59_
					    = (((Class318_Sub3) class318_sub3)
					       .anInt6404);
					int i_60_
					    = (((Class318_Sub3) class318_sub3)
					       .anInt6403);
					((Class318_Sub3) class318_sub3)
					    .anInt6404
					    = i_59_ = -i_34_ + i_59_;
					((Class318_Sub3) class318_sub3)
					    .anInt6405
					    = i_56_ = -i_33_ + i_56_;
					((Class318_Sub3) class318_sub3)
					    .anInt6406
					    = i_58_ += -i_33_;
					((Class318_Sub3) class318_sub3)
					    .anInt6402
					    = i_57_ = -i_34_ + i_57_;
					if (bool_54_) {
					    int i_61_
						= -i_60_ + (i_58_ > i_56_
							    ? i_56_ : i_58_);
					    if ((Class348_Sub16_Sub1.anInt8854
						 ^ 0xffffffff)
						<= (i_61_ ^ 0xffffffff)) {
						int i_62_
						    = (-i_60_
						       + (((i_57_ ^ 0xffffffff)
							   > (i_59_
							      ^ 0xffffffff))
							  ? i_57_ : i_59_));
						if (Class239_Sub16.anInt6008
						    >= i_62_) {
						    int i_63_
							= ((((i_56_
							      ^ 0xffffffff)
							     > (i_58_
								^ 0xffffffff))
							    ? i_58_ : i_56_)
							   - -i_60_);
						    if ((i_63_ ^ 0xffffffff)
							<= -1) {
							int i_64_
							    = ((i_59_ > i_57_
								? i_59_
								: i_57_)
							       + i_60_);
							if (i_64_ >= 0)
							    bool_54_ = false;
						    }
						}
					    }
					}
				    }
				    if (bool_54_) {
					class318_sub4.method2373(false);
					Class59_Sub1_Sub1.method560
					    (class318_sub4, i ^ 0x4b);
				    }
				}
				if ((Class348_Sub49.anInt7207 ^ 0xffffffff)
				    == -1)
				    Class21.aHa326
					.method3687(Class17.anInterface4_252);
				Class21.aHa326.F(-i_33_, -i_34_);
				Class21.aHa326.b(i_45_, i_48_, i_43_, i_50_,
						 d_37_);
				r.method3284(true,
					     (Class348_Sub42_Sub4.aDouble9517
					      + d_37_));
				Class14_Sub2.aDouble8621
				    = d_37_ + Class348_Sub42_Sub4.aDouble9517;
				if (Class348_Sub49.anInt7207 == 1) {
				    Class328_Sub1_Sub1.anInt8799
					= (i_17_ + -Class348_Sub3.anInt6568
					   - i_34_);
				    OutputStream_Sub1.anInt95 = i_21_;
				    Class120.anInt4910
					= -Class328.anInt4100 + (i_16_
								 - i_33_);
				    Class286_Sub5.anInt6255 = i_20_;
				    Class21.aHa326.DA(Class120.anInt4910,
						      (Class328_Sub1_Sub1
						       .anInt8799),
						      Class286_Sub5.anInt6255,
						      (OutputStream_Sub1
						       .anInt95));
				} else {
				    Class286_Sub5.anInt6255 = i_20_;
				    Class328_Sub1_Sub1.anInt8799
					= (-Class348_Sub3.anInt6568 + i_17_
					   - (-(Class348_Sub42_Sub9_Sub1
						.anInt10444)
					      - -i_34_));
				    Class120.anInt4910
					= (-Class328.anInt4100 + i_16_
					   + (Class211.anInt2747 + -i_33_));
				    OutputStream_Sub1.anInt95 = i_21_;
				    Class21.aHa326.DA(Class120.anInt4910,
						      (Class328_Sub1_Sub1
						       .anInt8799),
						      Class286_Sub5.anInt6255,
						      (OutputStream_Sub1
						       .anInt95));
				}
				Class163.method1274(Class348_Sub42_Sub8_Sub2
						    .aClass76_10436);
				if ((i_51_ ^ 0xffffffff) < -1) {
				    Class21.aHa326.KA(0, i_49_,
						      (Class348_Sub16_Sub1
						       .anInt8854),
						      i_51_ + i_49_);
				    Class21.aHa326.ya();
				    Class21.aHa326.GA(Class77.anInt1290);
				    Class258_Sub1.method1960(i_12_, i_4_, i_6_,
							     i_5_, is_0_,
							     is_3_, is_8_,
							     is_9_, is_11_, is,
							     i_2_, i_10_, i_7_,
							     i_1_, bool,
							     bool_13_, i_14_,
							     1, false);
				}
				if ((i_46_ ^ 0xffffffff) < -1) {
				    Class21.aHa326.KA(i_44_, i_53_,
						      i_44_ - -i_46_,
						      i_53_ + i_52_);
				    Class21.aHa326.ya();
				    Class21.aHa326.GA(Class77.anInt1290);
				    Class258_Sub1.method1960(i_12_, i_4_, i_6_,
							     i_5_, is_0_,
							     is_3_, is_8_,
							     is_9_, is_11_, is,
							     i_2_, i_10_, i_7_,
							     i_1_, bool,
							     bool_13_, i_14_,
							     1, false);
				}
				Class21.aHa326.la();
				Class271.method2046();
				if ((Class348_Sub49.anInt7207 ^ 0xffffffff)
				    == -1)
				    Class21.aHa326.method3672();
				Class348_Sub3.anInt6568 += i_34_;
				Class328.anInt4100 += i_33_;
				Class348_Sub42_Sub4.aDouble9517 += d_37_;
				Class348_Sub40_Sub8.anInt9157
				    = (-Class348_Sub3.anInt6568 + i_26_
				       + Class348_Sub42_Sub9_Sub1.anInt10444);
				Class339.anInt4211
				    = (-Class328.anInt4100 + Class211.anInt2747
				       + i_25_);
				if (Class348_Sub49.anInt7207 == 1) {
				    Class239_Sub24.anInt6095 += i_35_;
				    Class286.anInt3682 += i_36_;
				    for (int i_65_ = 0;
					 i_65_ < Class250.anInt3225; i_65_++) {
					int i_66_
					    = ((Class350.method3452
						(i_65_ - -Class286.anInt3682,
						 (byte) -15,
						 Class250.anInt3225))
					       * Class31.anInt425);
					for (int i_67_ = 0;
					     ((i_67_ ^ 0xffffffff)
					      > (Class31.anInt425
						 ^ 0xffffffff));
					     i_67_++) {
					    int i_68_
						= ((Class350.method3452
						    (i_67_ + (Class239_Sub24
							      .anInt6095),
						     (byte) -15,
						     Class31.anInt425))
						   + i_66_);
					    boolean bool_69_
						= ((((i_65_ ^ 0xffffffff)
						     <= (i_38_ ^ 0xffffffff))
						    && i_39_ + i_38_ > i_65_)
						   || (i_65_ >= i_41_
						       && ((i_41_ - -i_47_
							    ^ 0xffffffff)
							   < (i_65_
							      ^ 0xffffffff))
						       && i_67_ >= i_40_
						       && ((i_67_ ^ 0xffffffff)
							   > (i_40_ - -i_42_
							      ^ 0xffffffff))));
					    Class92.anInterface4Array1525
						[i_68_].method15
						(Class58.anInt1067 * i_67_,
						 i_65_ * Class344.anInt4267,
						 Class58.anInt1067,
						 Class344.anInt4267, 0, 0,
						 bool_69_, true);
					}
				    }
				}
			    }
			} else {
			    Class339.anInt4211 = i_27_;
			    Class348_Sub40_Sub8.anInt9157 = i_28_;
			    if (Class348_Sub49.anInt7207 == 2)
				Class348_Sub42_Sub4.aDouble9517 = -d;
			}
		    }
		    if (Class348_Sub16_Sub2.aBoolean8870) {
			Class348_Sub21.anInt6849 = i_5_;
			Class29.anInt403 = i_6_;
			Class348_Sub40_Sub8.anInt9157
			    = Class348_Sub42_Sub9_Sub1.anInt10444;
			Class328.anInt4100 = 0;
			Class339.anInt4211 = Class211.anInt2747;
			Class105_Sub1.anInt8422 = i_4_;
			Class348_Sub3.anInt6568 = 0;
			Class348_Sub42_Sub4.aDouble9517 = 0.0;
			if (Class348_Sub49.anInt7207 == 0)
			    Class21.aHa326
				.method3687(Class17.anInterface4_252);
			Class21.aHa326.la();
			Class21.aHa326.ya();
			Class21.aHa326.GA(Class77.anInt1290);
			Class51.aClass101_905.method903
			    (Class105_Sub1.anInt8422, Class29.anInt403,
			     Class348_Sub21.anInt6849, Class369_Sub1.anInt8583,
			     Class295.anInt3760, Class27.anInt396);
			Class21.aHa326.method3638(Class51.aClass101_905);
			if (Class348_Sub49.anInt7207 == 1) {
			    Class328_Sub1_Sub1.anInt8799 = i_17_;
			    Class120.anInt4910 = i_16_;
			    OutputStream_Sub1.anInt95 = i_21_;
			    Class286_Sub5.anInt6255 = i_20_;
			    Class21.aHa326.DA(Class120.anInt4910,
					      Class328_Sub1_Sub1.anInt8799,
					      Class286_Sub5.anInt6255,
					      OutputStream_Sub1.anInt95);
			} else {
			    Class120.anInt4910 = i_16_ - -Class211.anInt2747;
			    Class328_Sub1_Sub1.anInt8799
				= Class348_Sub42_Sub9_Sub1.anInt10444 + i_17_;
			    Class286_Sub5.anInt6255 = i_20_;
			    OutputStream_Sub1.anInt95 = i_21_;
			    Class21.aHa326.DA(Class120.anInt4910,
					      Class328_Sub1_Sub1.anInt8799,
					      Class286_Sub5.anInt6255,
					      OutputStream_Sub1.anInt95);
			}
			Class14_Sub2.aDouble8621 = 0.0;
			Class348_Sub42_Sub8_Sub2.aClass76_10436
			    .method775((byte) 69);
			Class163.method1274(Class348_Sub42_Sub8_Sub2
					    .aClass76_10436);
			Class258_Sub1.method1960(i_12_, i_4_, i_6_, i_5_,
						 is_0_, is_3_, is_8_, is_9_,
						 is_11_, is, i_2_, i_10_, i_7_,
						 i_1_, bool, bool_13_, i_14_,
						 1, false);
			Class271.method2046();
			Class348_Sub16_Sub2.aBoolean8870 = false;
			if ((Class348_Sub49.anInt7207 ^ 0xffffffff) == -1)
			    Class21.aHa326.method3672();
			if (Class348_Sub49.anInt7207 == 1)
			    Class202.method1469(-117);
		    }
		    if (Class348_Sub49.anInt7207 == 0)
			Class17.anInterface4_252.method14
			    (Class339.anInt4211, Class348_Sub40_Sub8.anInt9157,
			     Class59_Sub1.anInt5283, Class107.anInt1651, 0, 0,
			     true, true);
		    Class318_Sub1_Sub1_Sub2.anInt9997++;
		    r.method3284(true, Class348_Sub42_Sub4.aDouble9517);
		    Class318_Sub1_Sub5_Sub1.aDouble10120
			= Class348_Sub42_Sub4.aDouble9517;
		    if (Class348_Sub49.anInt7207 == 0
			|| (Class348_Sub49.anInt7207 ^ 0xffffffff) == -3) {
			if (Class348_Sub49.anInt7207 == 2) {
			    Class21.aHa326.GA(Class77.anInt1290);
			    Class21.aHa326.ya();
			}
			Class193.anInt2590 = i_20_;
			Class129.anInt1879 = i_21_;
			Class94.anInt1537
			    = (-Class339.anInt4211 + -Class328.anInt4100
			       + (i_16_ + Class211.anInt2747));
			Class318_Sub5.anInt6417
			    = (-Class348_Sub40_Sub8.anInt9157
			       + (i_17_ + Class348_Sub42_Sub9_Sub1.anInt10444
				  + -Class348_Sub3.anInt6568));
			Class21.aHa326.DA(Class94.anInt1537,
					  Class318_Sub5.anInt6417,
					  Class193.anInt2590,
					  Class129.anInt1879);
		    } else if (Class348_Sub49.anInt7207 == 1) {
			Class193.anInt2590 = i_20_;
			Class94.anInt1537 = i_16_ + -Class328.anInt4100;
			Class318_Sub5.anInt6417
			    = -Class348_Sub3.anInt6568 + i_17_;
			Class129.anInt1879 = i_21_;
			Class21.aHa326.DA(Class94.anInt1537,
					  Class318_Sub5.anInt6417,
					  Class193.anInt2590,
					  Class129.anInt1879);
			Class21.aHa326.KA(Class339.anInt4211,
					  Class348_Sub40_Sub8.anInt9157,
					  (Class339.anInt4211
					   - -Class59_Sub1.anInt5283),
					  (Class107.anInt1651
					   + Class348_Sub40_Sub8.anInt9157));
		    }
		    Class258_Sub1.method1960(i_12_, i_4_, i_6_, i_5_, is_0_,
					     is_3_, is_8_, is_9_, is_11_, is,
					     i_2_, i_10_, i_7_, i_1_, bool,
					     bool_13_, i_14_,
					     (Class348_Sub49.anInt7207
					      ^ 0xffffffff) != -3 ? 2 : 0,
					     Class348_Sub49.anInt7207 == 1);
		    Class21.aHa326.la();
		    Class21.aHa326.DA(i_16_, i_17_, i_18_, i_19_);
		    if (i == -2)
			break;
		    anInt2986 = -82;
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929
			  (runtimeexception,
			   ("sj.D(" + (is != null ? "{...}" : "null") + ',' + i
			    + ',' + (is_0_ != null ? "{...}" : "null") + ','
			    + i_1_ + ',' + i_2_ + ','
			    + (is_3_ != null ? "{...}" : "null") + ',' + i_4_
			    + ',' + i_5_ + ',' + bool + ',' + i_6_ + ',' + i_7_
			    + ',' + (is_8_ != null ? "{...}" : "null") + ','
			    + (is_9_ != null ? "{...}" : "null") + ',' + i_10_
			    + ',' + (is_11_ != null ? "{...}" : "null") + ','
			    + i_12_ + ',' + bool_13_ + ',' + i_14_ + ')'));
	    }
	    break;
	} while (false);
    }
    
    static final void method1635
	(int i, Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3) {
	try {
	    anInt2983++;
	    do {
		if ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
		     .anInt10268)
		    != -1) {
		    Class17 class17 = (Class10.aClass87_191.method835
				       (((Class318_Sub1_Sub3_Sub3)
					 class318_sub1_sub3_sub3).anInt10268,
					7));
		    if (class17 != null
			&& ((Class17) class17).anIntArray237 != null) {
			((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			    .anInt10203++;
			if ((((Class318_Sub1_Sub3_Sub3)
			      class318_sub1_sub3_sub3).anInt10245
			     < ((Class17) class17).anIntArray237.length)
			    && ((((Class17) class17).anIntArray267
				 [((Class318_Sub1_Sub3_Sub3)
				   class318_sub1_sub3_sub3).anInt10245])
				< ((Class318_Sub1_Sub3_Sub3)
				   class318_sub1_sub3_sub3).anInt10203)) {
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.anInt10312++;
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.anInt10245++;
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.anInt10203
				= 1;
			    if (!((Class318_Sub1_Sub3_Sub3)
				  class318_sub1_sub3_sub3).aBoolean10309)
				Class287.method2178(class318_sub1_sub3_sub3,
						    (((Class318_Sub1_Sub3_Sub3)
						      class318_sub1_sub3_sub3)
						     .anInt10245),
						    class17, -58);
			}
			if (((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3).anInt10245
			    >= ((Class17) class17).anIntArray237.length) {
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.anInt10245
				= 0;
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.anInt10203
				= 0;
			    if (((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3)
				.aBoolean10213) {
				((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3).anInt10268
				    = class318_sub1_sub3_sub3.method2422
					  ((byte) 72).method1621((byte) -16);
				if (((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).anInt10268
				    == -1) {
				    ((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).aBoolean10213
					= false;
				    break;
				}
				class17
				    = (Class10.aClass87_191.method835
				       (((Class318_Sub1_Sub3_Sub3)
					 class318_sub1_sub3_sub3).anInt10268,
					7));
			    }
			    if (!((Class318_Sub1_Sub3_Sub3)
				  class318_sub1_sub3_sub3).aBoolean10309)
				Class287.method2178(class318_sub1_sub3_sub3,
						    (((Class318_Sub1_Sub3_Sub3)
						      class318_sub1_sub3_sub3)
						     .anInt10245),
						    class17, -23);
			}
			((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			    .anInt10312
			    = ((Class318_Sub1_Sub3_Sub3)
			       class318_sub1_sub3_sub3).anInt10245 + 1;
			if (((Class17) class17).anIntArray237 != null) {
			    if (((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3).anInt10312
				>= ((Class17) class17).anIntArray237.length)
				((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3).anInt10312
				    = 0;
			} else {
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.anInt10268
				= -1;
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.aBoolean10213
				= false;
			}
		    } else {
			((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			    .aBoolean10213
			    = false;
			((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			    .anInt10268
			    = -1;
		    }
		}
	    } while (false);
	    do {
		if ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
		     .anInt10269) != -1
		    && (Class367_Sub11.anInt7396
			>= (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			    .anInt10225))) {
		    Class368 class368
			= (Class348_Sub40_Sub18.aClass319_9245.method2543
			   ((byte) 90, ((Class318_Sub1_Sub3_Sub3)
					class318_sub1_sub3_sub3).anInt10269));
		    int i_70_ = ((Class368) class368).anInt4503;
		    if (i_70_ != -1) {
			Class17 class17
			    = Class10.aClass87_191.method835(i_70_, 7);
			if (((Class368) class368).aBoolean4487) {
			    if ((((Class17) class17).anInt262 ^ 0xffffffff)
				== -4) {
				if (((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).anInt10322 > 0
				    && (((Class318_Sub1_Sub3_Sub3)
					 class318_sub1_sub3_sub3).anInt10239
					<= Class367_Sub11.anInt7396)
				    && (Class367_Sub11.anInt7396
					> (((Class318_Sub1_Sub3_Sub3)
					    class318_sub1_sub3_sub3)
					   .anInt10300))) {
				    ((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).anInt10269
					= -1;
				    break;
				}
			    } else if ((((Class17) class17).anInt262
					^ 0xffffffff) == -2
				       && (((Class318_Sub1_Sub3_Sub3)
					    class318_sub1_sub3_sub3).anInt10322
					   ^ 0xffffffff) < -1
				       && (((((Class318_Sub1_Sub3_Sub3)
					      class318_sub1_sub3_sub3)
					     .anInt10239)
					    ^ 0xffffffff)
					   >= (Class367_Sub11.anInt7396
					       ^ 0xffffffff))
				       && (Class367_Sub11.anInt7396
					   > (((Class318_Sub1_Sub3_Sub3)
					       class318_sub1_sub3_sub3)
					      .anInt10300))) {
				((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3).anInt10225
				    = 1 + Class367_Sub11.anInt7396;
				break;
			    }
			}
			if (class17 != null
			    && ((Class17) class17).anIntArray237 != null) {
			    if (((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3).anInt10240
				< 0) {
				((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3).anInt10240
				    = 0;
				if (!((Class318_Sub1_Sub3_Sub3)
				      class318_sub1_sub3_sub3).aBoolean10309)
				    Class287.method2178
					(class318_sub1_sub3_sub3, 0, class17,
					 -89);
			    }
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.anInt10243++;
			    if (((((Class318_Sub1_Sub3_Sub3)
				   class318_sub1_sub3_sub3).anInt10240
				  ^ 0xffffffff)
				 > (((Class17) class17).anIntArray237.length
				    ^ 0xffffffff))
				&& ((((Class17) class17).anIntArray267
				     [((Class318_Sub1_Sub3_Sub3)
				       class318_sub1_sub3_sub3).anInt10240])
				    < ((Class318_Sub1_Sub3_Sub3)
				       class318_sub1_sub3_sub3).anInt10243)) {
				((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3).anInt10240++;
				((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3).anInt10243
				    = 1;
				if (!((Class318_Sub1_Sub3_Sub3)
				      class318_sub1_sub3_sub3).aBoolean10309)
				    Class287.method2178
					(class318_sub1_sub3_sub3,
					 ((Class318_Sub1_Sub3_Sub3)
					  class318_sub1_sub3_sub3).anInt10240,
					 class17, -17);
			    }
			    if ((((Class17) class17).anIntArray237.length
				 ^ 0xffffffff)
				>= (((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).anInt10240
				    ^ 0xffffffff)) {
				if (((Class368) class368).aBoolean4487) {
				    ((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).anInt10305++;
				    ((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).anInt10240
					-= ((Class17) class17).anInt238;
				    if (((Class17) class17).anInt244
					<= (((Class318_Sub1_Sub3_Sub3)
					     class318_sub1_sub3_sub3)
					    .anInt10305))
					((Class318_Sub1_Sub3_Sub3)
					 class318_sub1_sub3_sub3).anInt10269
					    = -1;
				    else if ((((Class318_Sub1_Sub3_Sub3)
					       class318_sub1_sub3_sub3)
					      .anInt10240) >= 0
					     && (((((Class318_Sub1_Sub3_Sub3)
						    class318_sub1_sub3_sub3)
						   .anInt10240)
						  ^ 0xffffffff)
						 > ((((Class17) class17)
						     .anIntArray237).length
						    ^ 0xffffffff))) {
					if (!((Class318_Sub1_Sub3_Sub3)
					      class318_sub1_sub3_sub3)
					     .aBoolean10309)
					    Class287.method2178
						(class318_sub1_sub3_sub3,
						 (((Class318_Sub1_Sub3_Sub3)
						   class318_sub1_sub3_sub3)
						  .anInt10240),
						 class17, -70);
				    } else
					((Class318_Sub1_Sub3_Sub3)
					 class318_sub1_sub3_sub3).anInt10269
					    = -1;
				} else
				    ((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).anInt10269
					= -1;
			    }
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.anInt10283
				= ((Class318_Sub1_Sub3_Sub3)
				   class318_sub1_sub3_sub3).anInt10240 - -1;
			    if ((((Class17) class17).anIntArray237.length
				 ^ 0xffffffff)
				>= (((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).anInt10283
				    ^ 0xffffffff)) {
				if (((Class368) class368).aBoolean4487) {
				    ((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).anInt10283
					-= ((Class17) class17).anInt238;
				    if ((((Class318_Sub1_Sub3_Sub3)
					  class318_sub1_sub3_sub3).anInt10305
					 - -1)
					>= ((Class17) class17).anInt244)
					((Class318_Sub1_Sub3_Sub3)
					 class318_sub1_sub3_sub3).anInt10283
					    = -1;
				    else if ((((Class318_Sub1_Sub3_Sub3)
					       class318_sub1_sub3_sub3)
					      .anInt10283) < 0
					     || ((((Class17) class17)
						  .anIntArray237).length
						 <= (((Class318_Sub1_Sub3_Sub3)
						      class318_sub1_sub3_sub3)
						     .anInt10283)))
					((Class318_Sub1_Sub3_Sub3)
					 class318_sub1_sub3_sub3).anInt10283
					    = -1;
				} else
				    ((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).anInt10283
					= -1;
			    }
			} else
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.anInt10269
				= -1;
		    } else
			((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			    .anInt10269
			    = -1;
		}
	    } while (false);
	    do {
		if (((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
		      .anInt10291)
		     ^ 0xffffffff) != 0
		    && ((Class367_Sub11.anInt7396 ^ 0xffffffff)
			<= (((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3).anInt10211
			    ^ 0xffffffff))) {
		    Class368 class368
			= (Class348_Sub40_Sub18.aClass319_9245.method2543
			   ((byte) 93, ((Class318_Sub1_Sub3_Sub3)
					class318_sub1_sub3_sub3).anInt10291));
		    int i_71_ = ((Class368) class368).anInt4503;
		    if ((i_71_ ^ 0xffffffff) != 0) {
			Class17 class17
			    = Class10.aClass87_191.method835(i_71_, 7);
			if (((Class368) class368).aBoolean4487) {
			    if ((((Class17) class17).anInt262 ^ 0xffffffff)
				!= -4) {
				if (((Class17) class17).anInt262 == 1
				    && (((Class318_Sub1_Sub3_Sub3)
					 class318_sub1_sub3_sub3).anInt10322
					^ 0xffffffff) < -1
				    && (Class367_Sub11.anInt7396
					>= (((Class318_Sub1_Sub3_Sub3)
					     class318_sub1_sub3_sub3)
					    .anInt10239))
				    && (((Class318_Sub1_Sub3_Sub3)
					 class318_sub1_sub3_sub3).anInt10300
					< Class367_Sub11.anInt7396)) {
				    ((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).anInt10211
					= Class367_Sub11.anInt7396 - -1;
				    break;
				}
			    } else if (((Class318_Sub1_Sub3_Sub3)
					class318_sub1_sub3_sub3).anInt10322 > 0
				       && ((Class367_Sub11.anInt7396
					    ^ 0xffffffff)
					   <= ((((Class318_Sub1_Sub3_Sub3)
						 class318_sub1_sub3_sub3)
						.anInt10239)
					       ^ 0xffffffff))
				       && ((Class367_Sub11.anInt7396
					    ^ 0xffffffff)
					   < ((((Class318_Sub1_Sub3_Sub3)
						class318_sub1_sub3_sub3)
					       .anInt10300)
					      ^ 0xffffffff))) {
				((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3).anInt10291
				    = -1;
				break;
			    }
			}
			if (class17 == null
			    || ((Class17) class17).anIntArray237 == null)
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.anInt10291
				= -1;
			else {
			    if (((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3).anInt10224
				< 0) {
				((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3).anInt10224
				    = 0;
				if (!((Class318_Sub1_Sub3_Sub3)
				      class318_sub1_sub3_sub3).aBoolean10309)
				    Class287.method2178
					(class318_sub1_sub3_sub3, 0, class17,
					 -70);
			    }
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.anInt10273++;
			    if ((((Class17) class17).anIntArray237.length
				 > ((Class318_Sub1_Sub3_Sub3)
				    class318_sub1_sub3_sub3).anInt10224)
				&& ((((Class17) class17).anIntArray267
				     [((Class318_Sub1_Sub3_Sub3)
				       class318_sub1_sub3_sub3).anInt10224])
				    < ((Class318_Sub1_Sub3_Sub3)
				       class318_sub1_sub3_sub3).anInt10273)) {
				((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3).anInt10224++;
				((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3).anInt10273
				    = 1;
				if (!((Class318_Sub1_Sub3_Sub3)
				      class318_sub1_sub3_sub3).aBoolean10309)
				    Class287.method2178
					(class318_sub1_sub3_sub3,
					 ((Class318_Sub1_Sub3_Sub3)
					  class318_sub1_sub3_sub3).anInt10224,
					 class17, -114);
			    }
			    if ((((Class318_Sub1_Sub3_Sub3)
				  class318_sub1_sub3_sub3).anInt10224
				 ^ 0xffffffff)
				<= (((Class17) class17).anIntArray237.length
				    ^ 0xffffffff)) {
				if (((Class368) class368).aBoolean4487) {
				    ((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).anInt10265++;
				    ((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).anInt10224
					-= ((Class17) class17).anInt238;
				    if (((Class17) class17).anInt244
					<= (((Class318_Sub1_Sub3_Sub3)
					     class318_sub1_sub3_sub3)
					    .anInt10265))
					((Class318_Sub1_Sub3_Sub3)
					 class318_sub1_sub3_sub3).anInt10291
					    = -1;
				    else if (((((Class318_Sub1_Sub3_Sub3)
						class318_sub1_sub3_sub3)
					       .anInt10224)
					      ^ 0xffffffff) <= -1
					     && ((((Class318_Sub1_Sub3_Sub3)
						   class318_sub1_sub3_sub3)
						  .anInt10224)
						 < (((Class17) class17)
						    .anIntArray237).length)) {
					if (!((Class318_Sub1_Sub3_Sub3)
					      class318_sub1_sub3_sub3)
					     .aBoolean10309)
					    Class287.method2178
						(class318_sub1_sub3_sub3,
						 (((Class318_Sub1_Sub3_Sub3)
						   class318_sub1_sub3_sub3)
						  .anInt10224),
						 class17, -92);
				    } else
					((Class318_Sub1_Sub3_Sub3)
					 class318_sub1_sub3_sub3).anInt10291
					    = -1;
				} else
				    ((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).anInt10291
					= -1;
			    }
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.anInt10276
				= ((Class318_Sub1_Sub3_Sub3)
				   class318_sub1_sub3_sub3).anInt10224 - -1;
			    if ((((Class17) class17).anIntArray237.length
				 ^ 0xffffffff)
				>= (((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).anInt10276
				    ^ 0xffffffff)) {
				if (((Class368) class368).aBoolean4487) {
				    ((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).anInt10276
					-= ((Class17) class17).anInt238;
				    if (1 + (((Class318_Sub1_Sub3_Sub3)
					      class318_sub1_sub3_sub3)
					     .anInt10265)
					< ((Class17) class17).anInt244) {
					if (((((Class318_Sub1_Sub3_Sub3)
					       class318_sub1_sub3_sub3)
					      .anInt10276)
					     ^ 0xffffffff) > -1
					    || (((((Class17) class17)
						  .anIntArray237).length
						 ^ 0xffffffff)
						>= ((((Class318_Sub1_Sub3_Sub3)
						      class318_sub1_sub3_sub3)
						     .anInt10276)
						    ^ 0xffffffff)))
					    ((Class318_Sub1_Sub3_Sub3)
					     class318_sub1_sub3_sub3)
						.anInt10276
						= -1;
				    } else
					((Class318_Sub1_Sub3_Sub3)
					 class318_sub1_sub3_sub3).anInt10276
					    = -1;
				} else
				    ((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).anInt10276
					= -1;
			    }
			}
		    } else
			((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			    .anInt10291
			    = -1;
		}
	    } while (false);
	    if ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3).anInt10286
		 != -1)
		&& ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
		     .anInt10218)
		    ^ 0xffffffff) >= -2) {
		Class17 class17
		    = (Class10.aClass87_191.method835
		       ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			 .anInt10286),
			7));
		if (((Class17) class17).anInt262 != 3) {
		    if ((((Class17) class17).anInt262 ^ 0xffffffff) == -2
			&& (((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3).anInt10322
			    ^ 0xffffffff) < -1
			&& (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			    .anInt10239) <= Class367_Sub11.anInt7396
			&& (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			    .anInt10300) < Class367_Sub11.anInt7396)
			((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			    .anInt10218
			    = 2;
		} else if ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			    .anInt10322) > 0
			   && (((Class318_Sub1_Sub3_Sub3)
				class318_sub1_sub3_sub3).anInt10239
			       <= Class367_Sub11.anInt7396)
			   && (Class367_Sub11.anInt7396
			       > ((Class318_Sub1_Sub3_Sub3)
				  class318_sub1_sub3_sub3).anInt10300)) {
		    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			.anInt10286
			= -1;
		    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			.anIntArray10236
			= null;
		}
	    }
	    if ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3).anInt10286
		 != -1)
		&& (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
		    .anInt10218) == 0) {
		Class17 class17
		    = (Class10.aClass87_191.method835
		       ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			 .anInt10286),
			7));
		if (class17 != null
		    && ((Class17) class17).anIntArray237 != null) {
		    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			.anInt10232++;
		    if ((((Class17) class17).anIntArray237.length
			 > (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			    .anInt10267))
			&& (((Class318_Sub1_Sub3_Sub3)
			     class318_sub1_sub3_sub3).anInt10232
			    > (((Class17) class17).anIntArray267
			       [((Class318_Sub1_Sub3_Sub3)
				 class318_sub1_sub3_sub3).anInt10267]))) {
			((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			    .anInt10267++;
			((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			    .anInt10232
			    = 1;
			if (!((Class318_Sub1_Sub3_Sub3)
			      class318_sub1_sub3_sub3).aBoolean10309)
			    Class287.method2178(class318_sub1_sub3_sub3,
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3)
						 .anInt10267),
						class17, -34);
		    }
		    if (((Class17) class17).anIntArray237.length
			<= (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			    .anInt10267)) {
			((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			    .anInt10267
			    -= ((Class17) class17).anInt238;
			((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			    .anInt10294++;
			if (((Class17) class17).anInt244
			    <= ((Class318_Sub1_Sub3_Sub3)
				class318_sub1_sub3_sub3).anInt10294) {
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.anIntArray10236
				= null;
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.anInt10286
				= -1;
			} else if ((((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).anInt10267
				    ^ 0xffffffff) > -1
				   || (((((Class17) class17)
					 .anIntArray237).length
					^ 0xffffffff)
				       >= (((Class318_Sub1_Sub3_Sub3)
					    class318_sub1_sub3_sub3).anInt10267
					   ^ 0xffffffff))) {
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.anIntArray10236
				= null;
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.anInt10286
				= -1;
			} else if (!((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3).aBoolean10309)
			    Class287.method2178(class318_sub1_sub3_sub3,
						(((Class318_Sub1_Sub3_Sub3)
						  class318_sub1_sub3_sub3)
						 .anInt10267),
						class17, -88);
		    }
		    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			.anInt10244
			= (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			   .anInt10267) + 1;
		    if (((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			  .anInt10244)
			 ^ 0xffffffff)
			<= (((Class17) class17).anIntArray237.length
			    ^ 0xffffffff)) {
			((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			    .anInt10244
			    -= ((Class17) class17).anInt238;
			if (((Class17) class17).anInt244
			    <= 1 + ((Class318_Sub1_Sub3_Sub3)
				    class318_sub1_sub3_sub3).anInt10294)
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.anInt10244
				= -1;
			else if ((((Class318_Sub1_Sub3_Sub3)
				   class318_sub1_sub3_sub3).anInt10244
				  ^ 0xffffffff) > -1
				 || ((((Class17) class17).anIntArray237.length
				      ^ 0xffffffff)
				     >= (((Class318_Sub1_Sub3_Sub3)
					  class318_sub1_sub3_sub3).anInt10244
					 ^ 0xffffffff)))
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.anInt10244
				= -1;
		    }
		} else {
		    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			.anInt10286
			= -1;
		    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			.anIntArray10236
			= null;
		}
	    }
	    int i_72_ = -86 / ((-18 - i) / 51);
	    if (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3).anInt10218
		> 0)
		((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
		    .anInt10218--;
	    for (int i_73_ = 0;
		 ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
		   .aClass182Array10308).length
		  > i_73_);
		 i_73_++) {
		Class182 class182
		    = (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
		       .aClass182Array10308[i_73_]);
		if (class182 != null) {
		    if (((Class182) class182).anInt2448 > 0)
			((Class182) class182).anInt2448--;
		    else {
			Class17 class17
			    = Class10.aClass87_191.method835((((Class182)
							       class182)
							      .anInt2454),
							     7);
			if (class17 == null
			    || ((Class17) class17).anIntArray237 == null)
			    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
				.aClass182Array10308[i_73_]
				= null;
			else {
			    ((Class182) class182).anInt2456++;
			    if (((((Class182) class182).anInt2451 ^ 0xffffffff)
				 > (((Class17) class17).anIntArray237.length
				    ^ 0xffffffff))
				&& (((((Class17) class17).anIntArray267
				      [((Class182) class182).anInt2451])
				     ^ 0xffffffff)
				    > (((Class182) class182).anInt2456
				       ^ 0xffffffff))) {
				((Class182) class182).anInt2451++;
				((Class182) class182).anInt2456 = 1;
				if (!((Class318_Sub1_Sub3_Sub3)
				      class318_sub1_sub3_sub3).aBoolean10309)
				    Class287.method2178
					(class318_sub1_sub3_sub3,
					 ((Class182) class182).anInt2451,
					 class17, -108);
			    }
			    if (((Class182) class182).anInt2451
				>= ((Class17) class17).anIntArray237.length) {
				((Class182) class182).anInt2451
				    -= ((Class17) class17).anInt238;
				((Class182) class182).anInt2445++;
				if ((((Class182) class182).anInt2445
				     ^ 0xffffffff)
				    > (((Class17) class17).anInt244
				       ^ 0xffffffff)) {
				    if (((Class182) class182).anInt2451 < 0
					|| ((((Class17) class17)
					     .anIntArray237).length
					    <= (((Class182) class182)
						.anInt2451)))
					((Class318_Sub1_Sub3_Sub3)
					 class318_sub1_sub3_sub3)
					    .aClass182Array10308[i_73_]
					    = null;
				    else if (!((Class318_Sub1_Sub3_Sub3)
					       class318_sub1_sub3_sub3)
					      .aBoolean10309)
					Class287.method2178
					    (class318_sub1_sub3_sub3,
					     ((Class182) class182).anInt2451,
					     class17, -46);
				} else
				    ((Class318_Sub1_Sub3_Sub3)
				     class318_sub1_sub3_sub3)
					.aClass182Array10308[i_73_]
					= null;
			    }
			    ((Class182) class182).anInt2455
				= 1 + ((Class182) class182).anInt2451;
			    if ((((Class17) class17).anIntArray237.length
				 ^ 0xffffffff)
				>= (((Class182) class182).anInt2455
				    ^ 0xffffffff)) {
				((Class182) class182).anInt2455
				    -= ((Class17) class17).anInt238;
				if (((Class17) class17).anInt244
				    > ((Class182) class182).anInt2445 - -1) {
				    if (((Class182) class182).anInt2455 < 0
					|| ((((Class17) class17)
					     .anIntArray237).length
					    <= (((Class182) class182)
						.anInt2455)))
					((Class182) class182).anInt2455 = -1;
				} else
				    ((Class182) class182).anInt2455 = -1;
			    }
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("sj.A(" + i + ','
					     + (class318_sub1_sub3_sub3 != null
						? "{...}" : "null")
					     + ')'));
	}
    }
    
    static final Class299 method1636(int i, int i_74_, int i_75_, int i_76_,
				     int i_77_, int i_78_, int i_79_) {
	anInt2988++;
	long l = ((long) i_76_ * 76724863L
		  ^ ((long) i * 32147369L
		     ^ ((long) i_74_ * 986053L
			^ ((long) i_75_ * 67481L ^ (long) i_77_ * 97549L
			   ^ (long) i_79_ * 475427L))));
	Class299 class299 = (Class299) Class375.aClass60_4543.method583(l, 90);
	if (class299 != null)
	    return class299;
	class299
	    = Class60.aHa1098.method3697(i_75_, i_77_, i_79_, i_74_, i, i_76_);
	if (i_78_ != -1)
	    method1636(58, 63, -99, -89, -7, 18, 71);
	Class375.aClass60_4543.method582(class299, l, (byte) -106);
	return class299;
    }
    
    public final String toString() {
	anInt2989++;
	throw new IllegalStateException();
    }
    
    Class230(String string, int i) {
	try {
	    ((Class230) this).aString2985 = string;
	    ((Class230) this).anInt2987 = i;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("sj.<init>("
					     + (string != null ? "{...}"
						: "null")
					     + ',' + i + ')'));
	}
    }
    
    static final boolean method1637(int i, int i_80_, int i_81_) {
	anInt2984++;
	if (i_80_ != 32768)
	    return true;
	if ((0x8000 & i_81_ ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
}
