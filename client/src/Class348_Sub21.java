/* Class348_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub21 extends Class348
{
    int anInt6847;
    boolean aBoolean6848 = false;
    static int anInt6849;
    int anInt6850;
    int anInt6851;
    int anInt6852;
    int anInt6853;
    static String aString6854 = null;
    int anInt6855;
    static int anInt6856;
    
    static final void method2954(byte i) {
	anInt6856++;
	if (za_Sub1.anInt9775 != -1 && Class292.anInt4803 != -1) {
	    int i_0_ = ((Class117.anInt1780 * (Class331.anInt4133
					       + -Class195.anInt5019)
			 >> 1817537424)
			+ Class195.anInt5019);
	    Class117.anInt1780 += i_0_;
	    if ((Class117.anInt1780 ^ 0xffffffff) > -65536) {
		Class347.aBoolean4284 = false;
		Class25.aBoolean368 = false;
	    } else {
		if (!Class25.aBoolean368)
		    Class347.aBoolean4284 = true;
		else
		    Class347.aBoolean4284 = false;
		Class117.anInt1780 = 65535;
		Class25.aBoolean368 = true;
	    }
	    float f = (float) Class117.anInt1780 / 65535.0F;
	    float[] fs = new float[3];
	    int i_1_ = 2 * Class213.anInt2798;
	    for (int i_2_ = 0; i_2_ < 3; i_2_++) {
		int i_3_ = 3 * (Class348_Sub43.anIntArrayArrayArray7079
				[za_Sub1.anInt9775][i_1_][i_2_]);
		int i_4_ = ((Class348_Sub43.anIntArrayArrayArray7079
			     [za_Sub1.anInt9775][1 + i_1_][i_2_])
			    * 3);
		int i_5_ = 3 * ((Class348_Sub43.anIntArrayArrayArray7079
				 [za_Sub1.anInt9775][2 + i_1_][i_2_])
				+ ((Class348_Sub43.anIntArrayArrayArray7079
				    [za_Sub1.anInt9775][2 + i_1_][i_2_])
				   + -(Class348_Sub43.anIntArrayArrayArray7079
				       [za_Sub1.anInt9775][i_1_ - -3][i_2_])));
		int i_6_ = (Class348_Sub43.anIntArrayArrayArray7079
			    [za_Sub1.anInt9775][i_1_][i_2_]);
		int i_7_ = i_4_ - i_3_;
		int i_8_ = -(2 * i_4_) + i_3_ - -i_5_;
		int i_9_ = -i_6_ + ((Class348_Sub43.anIntArrayArrayArray7079
				     [za_Sub1.anInt9775][i_1_ - -2][i_2_])
				    + i_4_) + -i_5_;
		fs[i_2_]
		    = (float) i_6_ + f * ((float) i_7_ + f * (f * (float) i_9_
							      + (float) i_8_));
	    }
	    Class286_Sub4.anInt6246 = (int) fs[0] - 512 * za_Sub2.anInt9780;
	    Class305.anInt3855 = -1 * (int) fs[1];
	    Class59_Sub2_Sub2.anInt8685
		= (int) fs[2] + -(Class90.anInt1517 * 512);
	    float[] fs_10_ = new float[3];
	    int i_11_ = 2 * Class264.anInt3373;
	    int i_12_ = -88 % ((-64 - i) / 57);
	    for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -4; i_13_++) {
		int i_14_ = 3 * (Class348_Sub43.anIntArrayArrayArray7079
				 [Class292.anInt4803][i_11_][i_13_]);
		int i_15_ = 3 * (Class348_Sub43.anIntArrayArrayArray7079
				 [Class292.anInt4803][i_11_ + 1][i_13_]);
		int i_16_ = (((Class348_Sub43.anIntArrayArrayArray7079
			       [Class292.anInt4803][2 + i_11_][i_13_])
			      + (-(Class348_Sub43.anIntArrayArrayArray7079
				   [Class292.anInt4803][3 + i_11_][i_13_])
				 + (Class348_Sub43.anIntArrayArrayArray7079
				    [Class292.anInt4803][i_11_ - -2][i_13_])))
			     * 3);
		int i_17_ = (Class348_Sub43.anIntArrayArrayArray7079
			     [Class292.anInt4803][i_11_][i_13_]);
		int i_18_ = -i_14_ + i_15_;
		int i_19_ = -(i_15_ * 2) + i_14_ + i_16_;
		int i_20_
		    = (-i_16_ + i_15_
		       + (-i_17_ + (Class348_Sub43.anIntArrayArrayArray7079
				    [Class292.anInt4803][2 + i_11_][i_13_])));
		fs_10_[i_13_] = (f * ((float) i_18_ + f * ((float) i_20_ * f
							   + (float) i_19_))
				 + (float) i_17_);
	    }
	    float f_21_ = -fs[0] + fs_10_[0];
	    float f_22_ = -1.0F * (-fs[1] + fs_10_[1]);
	    float f_23_ = -fs[2] + fs_10_[2];
	    double d = Math.sqrt((double) (f_21_ * f_21_ + f_23_ * f_23_));
	    Class348_Sub42_Sub19.anInt9701
		= 0x3fff & (int) (2607.5945876176133
				  * Math.atan2((double) f_22_, d));
	    Class5.anInt4638 = 0x3fff & (int) (2607.5945876176133
					       * -Math.atan2((double) f_21_,
							     (double) f_23_));
	    Class338.anInt4186
		= ((Class348_Sub43.anIntArrayArrayArray7079[za_Sub1.anInt9775]
		    [i_1_][3])
		   + (((-(Class348_Sub43.anIntArrayArrayArray7079
			  [za_Sub1.anInt9775][i_1_][3])
			+ (Class348_Sub43.anIntArrayArrayArray7079
			   [za_Sub1.anInt9775][2 + i_1_][3]))
		       * Class117.anInt1780)
		      >> -1809261616));
	}
    }
    
    static int method2955(int i, int i_24_) {
	return i ^ i_24_;
    }
    
    public static void method2956(byte i) {
	aString6854 = null;
	if (i != 53)
	    method2954((byte) -100);
    }
    
    Class348_Sub21(int i) {
	((Class348_Sub21) this).anInt6847 = -1;
	((Class348_Sub21) this).anInt6847 = i;
    }
}
