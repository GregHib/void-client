/* Class186_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

import jaggl.OpenGL;

final class Class186_Sub1 extends Class186
{
    private int[] anIntArray5804 = new int[512];
    static int anInt5805;
    static int anInt5806;
    static int anInt5807 = 0;
    static Class341 aClass341_5808 = new Class341();
    static int anInt5809;
    static int anInt5810;
    static int anInt5811;
    static int anInt5812 = 100;
    static Class111 aClass111_5813;
    static int anInt5814;
    
    final void method1398(int i, int i_0_, float f, float f_1_, int i_2_,
			  float f_3_, int i_4_, float f_5_, int i_6_, int i_7_,
			  float[] fs) {
	anInt5810++;
	int i_8_ = (int) (-1.0F + f * (float) i_6_);
	i_8_ &= 0xff;
	int i_9_ = (int) (-1.0F + (float) i_0_ * f_5_);
	i_9_ &= 0xff;
	int i_10_ = (int) (-1.0F + (float) i * f_1_);
	i_10_ &= 0xff;
	float f_11_ = (float) i_7_ * f_1_;
	int i_12_ = (int) f_11_;
	int i_13_ = i_12_ + 1;
	float f_14_ = f_11_ - (float) i_12_;
	float f_15_ = (float) i_4_ - f_14_;
	float f_16_ = Class342.method2684(6, f_14_);
	i_13_ &= i_10_;
	i_12_ &= i_10_;
	int i_17_ = anIntArray5804[i_12_];
	int i_18_ = anIntArray5804[i_13_];
	for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff);
	     i_19_++) {
	    float f_20_ = f_5_ * (float) i_19_;
	    int i_21_ = (int) f_20_;
	    int i_22_ = i_21_ + 1;
	    float f_23_ = (float) -i_21_ + f_20_;
	    float f_24_ = -f_23_ + 1.0F;
	    float f_25_ = Class342.method2684(i_4_ ^ 0x7, f_23_);
	    i_21_ &= i_9_;
	    i_22_ &= i_9_;
	    int i_26_ = anIntArray5804[i_17_ + i_21_];
	    int i_27_ = anIntArray5804[i_17_ + i_22_];
	    int i_28_ = anIntArray5804[i_21_ + i_18_];
	    int i_29_ = anIntArray5804[i_22_ - -i_18_];
	    for (int i_30_ = 0; i_30_ < i_6_; i_30_++) {
		float f_31_ = f * (float) i_30_;
		int i_32_ = (int) f_31_;
		int i_33_ = 1 + i_32_;
		float f_34_ = f_31_ - (float) i_32_;
		float f_35_ = 1.0F - f_34_;
		i_32_ &= i_8_;
		i_33_ &= i_8_;
		float f_36_ = Class342.method2684(i_4_ ^ 0x7, f_34_);
		fs[i_2_++]
		    = f_3_ * (Class314.method2337
			      ((Class314.method2337
				((Class314.method2337
				  ((Class285.method2119
				    (f_24_,
				     Class139.method1166((anIntArray5804
							  [i_26_ + i_32_]),
							 7),
				     f_15_, -70, f_35_)),
				   true,
				   (Class285.method2119
				    (f_24_,
				     Class139.method1166(7,
							 (anIntArray5804
							  [i_33_ - -i_26_])),
				     f_15_, -73, f_34_)),
				   f_36_)),
				 true,
				 (Class314.method2337
				  ((Class285.method2119
				    (f_23_,
				     Class139.method1166(7, (anIntArray5804
							     [i_32_ + i_27_])),
				     f_15_, -75, f_35_)),
				   true,
				   (Class285.method2119
				    (f_23_,
				     Class139.method1166((anIntArray5804
							  [i_27_ + i_33_]),
							 7),
				     f_15_, -91, f_34_)),
				   f_36_)),
				 f_25_)),
			       true,
			       (Class314.method2337
				((Class314.method2337
				  ((Class285.method2119
				    (f_24_,
				     Class139.method1166((anIntArray5804
							  [i_28_ + i_32_]),
							 7),
				     f_14_, -72, f_35_)),
				   true,
				   (Class285.method2119
				    (f_24_,
				     Class139.method1166((anIntArray5804
							  [i_28_ + i_33_]),
							 7),
				     f_14_, -75, f_34_)),
				   f_36_)),
				 true,
				 (Class314.method2337
				  ((Class285.method2119
				    (f_23_,
				     Class139.method1166((anIntArray5804
							  [i_29_ + i_32_]),
							 7),
				     f_14_, -100, f_35_)),
				   true,
				   (Class285.method2119
				    (f_23_,
				     Class139.method1166((anIntArray5804
							  [i_29_ + i_33_]),
							 7),
				     f_14_, -72, f_34_)),
				   f_36_)),
				 f_25_)),
			       f_16_));
	    }
	}
    }
    
    static final int method1399(int i, char c) {
	anInt5805++;
	if (i != 7)
	    method1400(-22);
	if ((c ^ 0xffffffff) <= -1
	    && (c ^ 0xffffffff) > (Class239_Sub6.anIntArray5902.length
				   ^ 0xffffffff))
	    return Class239_Sub6.anIntArray5902[c];
	return -1;
    }
    
    public static void method1400(int i) {
	if (i != 1)
	    method1401(null, 48, -14, -102, 78, 29);
	aClass341_5808 = null;
	aClass111_5813 = null;
    }
    
    static final Class258_Sub3_Sub1 method1401(ha_Sub2 var_ha_Sub2, int i,
					       int i_37_, int i_38_, int i_39_,
					       int i_40_) {
	anInt5809++;
	if (i_37_ != 34037)
	    aClass341_5808 = null;
	if (((ha_Sub2) var_ha_Sub2).aBoolean7793
	    || Class192.method1436(-20, i_38_) && Class192.method1436(-119,
								      i_40_))
	    return new Class258_Sub3_Sub1(var_ha_Sub2, 3553, i, i_39_, i_38_,
					  i_40_, true);
	if (!((ha_Sub2) var_ha_Sub2).aBoolean7837)
	    return new Class258_Sub3_Sub1(var_ha_Sub2, i, i_39_, i_38_, i_40_,
					  Class33.method340(i_38_, (byte) 108),
					  Class33.method340(i_40_, (byte) 108),
					  true);
	return new Class258_Sub3_Sub1(var_ha_Sub2, 34037, i, i_39_, i_38_,
				      i_40_, true);
    }
    
    Class186_Sub1(int i) {
	Random random = new Random((long) i);
	for (int i_41_ = 0; (i_41_ ^ 0xffffffff) > -257; i_41_++)
	    anIntArray5804[i_41_] = anIntArray5804[256 + i_41_] = i_41_;
	for (int i_42_ = 0; (i_42_ ^ 0xffffffff) > -257; i_42_++) {
	    int i_43_ = 0xff & random.nextInt();
	    int i_44_ = anIntArray5804[i_43_];
	    anIntArray5804[i_43_] = anIntArray5804[256 + i_43_]
		= anIntArray5804[i_42_];
	    anIntArray5804[i_42_] = anIntArray5804[256 + i_42_] = i_44_;
	}
    }
    
    static final void method1402(int i) {
	if (i == 1) {
	    Class318_Sub1_Sub2.aClass60_8732.method590(0);
	    anInt5811++;
	}
    }
    
    static final void method1403(int i, int i_45_, byte[] is, boolean bool,
				 int i_46_, int i_47_, int i_48_) {
	anInt5806++;
	if (i_45_ > 0 && !Class192.method1436(69, i_45_))
	    throw new IllegalArgumentException("");
	if ((i ^ 0xffffffff) < -1 && !Class192.method1436(100, i))
	    throw new IllegalArgumentException("");
	int i_49_ = Class183.method1382(i_46_, -6409);
	int i_50_ = 0;
	int i_51_ = i_45_ < i ? i_45_ : i;
	if (bool != false)
	    anInt5807 = -127;
	int i_52_ = i_45_ >> -1315657727;
	int i_53_ = i >> 1701348065;
	byte[] is_54_ = is;
	byte[] is_55_ = new byte[i_52_ * (i_53_ * i_49_)];
	for (;;) {
	    OpenGL.glTexImage2Dub(i_47_, i_50_, i_48_, i_45_, i, 0, i_46_,
				  5121, is_54_, 0);
	    if (i_51_ <= 1)
		break;
	    int i_56_ = i_45_ * i_49_;
	    byte[] is_57_ = is_55_;
	    for (int i_58_ = 0; i_49_ > i_58_; i_58_++) {
		int i_59_ = i_58_;
		int i_60_ = i_58_;
		int i_61_ = i_56_ + i_60_;
		for (int i_62_ = 0;
		     (i_53_ ^ 0xffffffff) < (i_62_ ^ 0xffffffff); i_62_++) {
		    for (int i_63_ = 0;
			 (i_52_ ^ 0xffffffff) < (i_63_ ^ 0xffffffff);
			 i_63_++) {
			int i_64_ = is_54_[i_60_];
			i_60_ += i_49_;
			i_64_ += is_54_[i_60_];
			i_64_ += is_54_[i_61_];
			i_60_ += i_49_;
			i_61_ += i_49_;
			i_64_ += is_54_[i_61_];
			is_55_[i_59_] = (byte) (i_64_ >> -175981054);
			i_61_ += i_49_;
			i_59_ += i_49_;
		    }
		    i_61_ += i_56_;
		    i_60_ += i_56_;
		}
	    }
	    is_55_ = is_54_;
	    is_54_ = is_57_;
	    i = i_53_;
	    i_45_ = i_52_;
	    i_53_ >>= 1;
	    i_50_++;
	    i_51_ >>= 1;
	    i_52_ >>= 1;
	}
    }
}
