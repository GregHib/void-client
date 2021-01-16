/* Class299 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class299
{
    static int anInt3812;
    static Class348_Sub49_Sub2 aClass348_Sub49_Sub2_3813
	= new Class348_Sub49_Sub2(7500);
    static int anInt3814;
    
    static final int method2253(int i, int i_0_) {
	anInt3814++;
	int i_1_ = -124 % ((i_0_ - 55) / 63);
	int i_2_ = 0;
	if (i < 0 || i >= 65536) {
	    i_2_ += 16;
	    i >>>= 16;
	}
	if ((i ^ 0xffffffff) <= -257) {
	    i >>>= 8;
	    i_2_ += 8;
	}
	if (i >= 16) {
	    i_2_ += 4;
	    i >>>= 4;
	}
	if ((i ^ 0xffffffff) <= -5) {
	    i_2_ += 2;
	    i >>>= 2;
	}
	if (i >= 1) {
	    i >>>= 1;
	    i_2_++;
	}
	return i_2_ - -i;
    }
    
    public Class299() {
	/* empty */
    }
    
    public static void method2254(int i) {
	aClass348_Sub49_Sub2_3813 = null;
	if (i != -14804)
	    aClass348_Sub49_Sub2_3813 = null;
    }
    
    static final void method2255(int i, int i_3_, byte i_4_, int i_5_,
				 int i_6_, int i_7_, int i_8_) {
	Class117.method1070((byte) 117, i);
	anInt3812++;
	if (i_4_ >= -65)
	    method2255(-118, -20, (byte) -121, 100, -62, 77, -119);
	int i_9_ = 0;
	int i_10_ = -i_5_ + i;
	if ((i_10_ ^ 0xffffffff) > -1)
	    i_10_ = 0;
	int i_11_ = i;
	int i_12_ = -i;
	int i_13_ = i_10_;
	int i_14_ = -i_10_;
	int i_15_ = -1;
	int i_16_ = -1;
	int[] is = Class17.anIntArrayArray255[i_6_];
	int i_17_ = i_3_ + -i_10_;
	int i_18_ = i_10_ + i_3_;
	Class135_Sub2.method1156(-27, i_17_, is, -i + i_3_, i_8_);
	Class135_Sub2.method1156(-27, i_18_, is, i_17_, i_7_);
	Class135_Sub2.method1156(-27, i + i_3_, is, i_18_, i_8_);
	while (i_11_ > i_9_) {
	    i_16_ += 2;
	    i_15_ += 2;
	    i_14_ += i_16_;
	    i_12_ += i_15_;
	    if (i_14_ >= 0 && (i_13_ ^ 0xffffffff) <= -2) {
		Class348_Sub49_Sub2.anIntArray9757[i_13_] = i_9_;
		i_13_--;
		i_14_ -= i_13_ << -840432831;
	    }
	    i_9_++;
	    if (i_12_ >= 0) {
		i_11_--;
		i_12_ -= i_11_ << -2028572287;
		if (i_10_ <= i_11_) {
		    int[] is_19_ = Class17.anIntArrayArray255[i_11_ + i_6_];
		    int[] is_20_ = Class17.anIntArrayArray255[i_6_ + -i_11_];
		    int i_21_ = i_3_ - -i_9_;
		    int i_22_ = -i_9_ + i_3_;
		    Class135_Sub2.method1156(-27, i_21_, is_19_, i_22_, i_8_);
		    Class135_Sub2.method1156(-27, i_21_, is_20_, i_22_, i_8_);
		} else {
		    int[] is_23_ = Class17.anIntArrayArray255[i_6_ - -i_11_];
		    int[] is_24_ = Class17.anIntArrayArray255[-i_11_ + i_6_];
		    int i_25_ = Class348_Sub49_Sub2.anIntArray9757[i_11_];
		    int i_26_ = i_9_ + i_3_;
		    int i_27_ = i_3_ - i_9_;
		    int i_28_ = i_3_ - -i_25_;
		    int i_29_ = -i_25_ + i_3_;
		    Class135_Sub2.method1156(-27, i_29_, is_23_, i_27_, i_8_);
		    Class135_Sub2.method1156(-27, i_28_, is_23_, i_29_, i_7_);
		    Class135_Sub2.method1156(-27, i_26_, is_23_, i_28_, i_8_);
		    Class135_Sub2.method1156(-27, i_29_, is_24_, i_27_, i_8_);
		    Class135_Sub2.method1156(-27, i_28_, is_24_, i_29_, i_7_);
		    Class135_Sub2.method1156(-27, i_26_, is_24_, i_28_, i_8_);
		}
	    }
	    int[] is_30_ = Class17.anIntArrayArray255[i_6_ + i_9_];
	    int[] is_31_ = Class17.anIntArrayArray255[-i_9_ + i_6_];
	    int i_32_ = i_3_ - -i_11_;
	    int i_33_ = i_3_ - i_11_;
	    if (i_10_ > i_9_) {
		int i_34_
		    = ((i_13_ ^ 0xffffffff) <= (i_9_ ^ 0xffffffff) ? i_13_
		       : Class348_Sub49_Sub2.anIntArray9757[i_9_]);
		int i_35_ = i_34_ + i_3_;
		int i_36_ = i_3_ + -i_34_;
		Class135_Sub2.method1156(-27, i_36_, is_30_, i_33_, i_8_);
		Class135_Sub2.method1156(-27, i_35_, is_30_, i_36_, i_7_);
		Class135_Sub2.method1156(-27, i_32_, is_30_, i_35_, i_8_);
		Class135_Sub2.method1156(-27, i_36_, is_31_, i_33_, i_8_);
		Class135_Sub2.method1156(-27, i_35_, is_31_, i_36_, i_7_);
		Class135_Sub2.method1156(-27, i_32_, is_31_, i_35_, i_8_);
	    } else {
		Class135_Sub2.method1156(-27, i_32_, is_30_, i_33_, i_8_);
		Class135_Sub2.method1156(-27, i_32_, is_31_, i_33_, i_8_);
	    }
	}
    }
}
