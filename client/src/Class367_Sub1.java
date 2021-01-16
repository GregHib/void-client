/* Class367_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class367_Sub1 extends Class367
{
    static int anInt7277;
    static int anInt7278;
    static int anInt7279;
    static int anInt7280;
    static int anInt7281;
    static int anInt7282;
    static int anInt7283;
    static int anInt7284;
    static int anInt7285;
    
    static final int[] method3533(byte i, int i_0_, int i_1_, int i_2_,
				  float f, int i_3_, boolean bool, int i_4_) {
	anInt7281++;
	int[] is = new int[i_0_];
	Class348_Sub40_Sub8 class348_sub40_sub8 = new Class348_Sub40_Sub8();
	((Class348_Sub40_Sub8) class348_sub40_sub8).anInt9149
	    = (int) (f * 4096.0F);
	((Class348_Sub40_Sub8) class348_sub40_sub8).anInt9164 = i_4_;
	((Class348_Sub40_Sub8) class348_sub40_sub8).anInt9150 = i_1_;
	((Class348_Sub40_Sub8) class348_sub40_sub8).aBoolean9160 = bool;
	((Class348_Sub40_Sub8) class348_sub40_sub8).anInt9158 = i_2_;
	((Class348_Sub40_Sub8) class348_sub40_sub8).anInt9156 = i_3_;
	class348_sub40_sub8.method3044(110);
	Class79.method797(1, i_0_, (byte) 115);
	class348_sub40_sub8.method3069(0, is, (byte) 115);
	if (i < 89)
	    method3535(72, -40);
	return is;
    }
    
    final void method3520(byte i) {
	anInt7278++;
	if (i == 87) {
	    /* empty */
	}
    }
    
    static final void method3534(boolean bool, int i, int i_5_,
				 boolean bool_6_, int i_7_,
				 Class46[] class46s) {
	anInt7279++;
	if (bool == false) {
	    for (int i_8_ = 0;
		 (class46s.length ^ 0xffffffff) < (i_8_ ^ 0xffffffff);
		 i_8_++) {
		Class46 class46 = class46s[i_8_];
		if (class46 != null && i == ((Class46) class46).anInt834) {
		    Class239_Sub28.method1843(i_5_, -326, class46, bool_6_,
					      i_7_);
		    Class14_Sub1.method239((byte) 115, i_5_, i_7_, class46);
		    if ((((Class46) class46).anInt747 ^ 0xffffffff)
			< ((-((Class46) class46).anInt709
			    + ((Class46) class46).anInt698)
			   ^ 0xffffffff))
			((Class46) class46).anInt747
			    = (((Class46) class46).anInt698
			       - ((Class46) class46).anInt709);
		    if (((Class46) class46).anInt747 < 0)
			((Class46) class46).anInt747 = 0;
		    if ((((Class46) class46).anInt755 ^ 0xffffffff)
			< ((((Class46) class46).anInt791
			    - ((Class46) class46).anInt789)
			   ^ 0xffffffff))
			((Class46) class46).anInt755
			    = (((Class46) class46).anInt791
			       - ((Class46) class46).anInt789);
		    if (((Class46) class46).anInt755 < 0)
			((Class46) class46).anInt755 = 0;
		    if ((((Class46) class46).anInt774 ^ 0xffffffff) == -1)
			Class251.method1913(bool_6_, -116, class46);
		}
	    }
	}
    }
    
    final void method3526(int i, int i_9_, int i_10_) {
	anInt7284++;
	if (i != 10756)
	    method3525(-42, false);
    }
    
    static final void method3535(int i, int i_11_) {
	Class171.anInt2275 = i;
	anInt7282++;
	Class15.aClass60_225.method590(i_11_);
    }
    
    final void method3525(int i, boolean bool) {
	anInt7285++;
	if (i == 15192) {
	    /* empty */
	}
    }
    
    final void method3527(int i, Interface18 interface18, int i_12_) {
	((Class367) this).aHa_Sub3_4479.method3850((byte) 81, interface18);
	anInt7280++;
	((Class367) this).aHa_Sub3_4479.method3923(true, i);
	if (i_12_ == -16776) {
	    /* empty */
	}
    }
    
    final boolean method3530(int i) {
	anInt7283++;
	if (i >= -57)
	    method3530(-90);
	return false;
    }
    
    final void method3521(boolean bool, byte i) {
	anInt7277++;
	if (i != -103)
	    method3527(-12, null, 67);
    }
    
    Class367_Sub1(ha_Sub3 var_ha_Sub3) {
	super(var_ha_Sub3);
    }
}
