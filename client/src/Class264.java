/* Class264 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class264
{
    static int anInt3364;
    private int anInt3365;
    static int anInt3366;
    static int anInt3367;
    static Class114 aClass114_3368 = new Class114(112, 4);
    static int anInt3369;
    int anInt3370;
    static Class114 aClass114_3371 = new Class114(63, 5);
    static int anInt3372;
    static int anInt3373 = 0;
    static int anInt3374;
    static int anInt3375;
    static int anInt3376;
    static int anInt3377;
    static Class105[] aClass105Array3378;
    
    static final boolean method2015(int i, int i_0_, int i_1_) {
	anInt3375++;
	if (i_1_ != 7)
	    return false;
	return ((Class294.method2217(i_0_, i, i_1_ ^ 0x7)
		 | Class348_Sub40_Sub3.method3056(115, i, i_0_)
		 | Class348_Sub40_Sub9.method3073(i_0_, i, (byte) 50))
		& Class161.method1258(i, -9301, i_0_));
    }
    
    final void method2016(int i, int i_2_) {
	if (i != 15615)
	    method2019((byte) 98);
	anInt3365 = 0;
	((Class264) this).anInt3370 = i_2_;
	anInt3377++;
    }
    
    static final void method2017(int i, Class17 class17, int i_3_) {
	anInt3367++;
	if (Class147.anInt2021 < 50
	    && (class17 != null
		&& ((Class17) class17).anIntArrayArray264 != null
		&& ((i ^ 0xffffffff)
		    > (((Class17) class17).anIntArrayArray264.length
		       ^ 0xffffffff))
		&& ((Class17) class17).anIntArrayArray264[i] != null)) {
	    int i_4_ = ((Class17) class17).anIntArrayArray264[i][0];
	    int i_5_ = i_4_ >> 1426050504;
	    if ((((Class17) class17).anIntArrayArray264[i].length ^ 0xffffffff)
		< -2) {
		int i_6_ = (int) (Math.random()
				  * (double) (((Class17) class17)
					      .anIntArrayArray264[i]).length);
		if ((i_6_ ^ 0xffffffff) < -1)
		    i_5_ = ((Class17) class17).anIntArrayArray264[i][i_6_];
	    }
	    int i_7_ = 0x7 & i_4_ >> -139443579;
	    if (i_3_ > 8) {
		int i_8_ = 256;
		if (((Class17) class17).anIntArray236 != null
		    && ((Class17) class17).anIntArray265 != null)
		    i_8_ = Class299_Sub1.method2257((((Class17) class17)
						     .anIntArray265[i]),
						    (((Class17) class17)
						     .anIntArray236[i]),
						    (byte) -125);
		if (((Class17) class17).aBoolean268)
		    Class279.method2090(i_7_, i_8_, false, (byte) -35, 255, 0,
					i_5_);
		else
		    Class348_Sub20.method2947(true, 255, i_5_, i_7_, 0, i_8_);
	    }
	}
    }
    
    public static void method2018(int i) {
	aClass105Array3378 = null;
	aClass114_3371 = null;
	aClass114_3368 = null;
	if (i != 0)
	    method2015(30, 1, -62);
    }
    
    final int method2019(byte i) {
	if (i >= -18)
	    anInt3373 = 32;
	anInt3369++;
	return ((Class264) this).anInt3370 & 0x3fff;
    }
    
    final boolean method2020(int i, int i_9_, int i_10_, byte i_11_) {
	anInt3366++;
	int i_12_ = anInt3365;
	if (((Class264) this).anInt3370 == i_9_ && anInt3365 == 0)
	    return false;
	if (i_11_ > -8)
	    return true;
	boolean bool;
	if ((anInt3365 ^ 0xffffffff) != -1) {
	    if (anInt3365 > 0
		&& (i_9_ ^ 0xffffffff) < (((Class264) this).anInt3370
					  ^ 0xffffffff)) {
		int i_13_ = anInt3365 * anInt3365 / (2 * i_10_);
		int i_14_ = i_13_ + ((Class264) this).anInt3370;
		if ((i_9_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff)
		    && (i_14_ ^ 0xffffffff) <= (((Class264) this).anInt3370
						^ 0xffffffff))
		    bool = true;
		else
		    bool = false;
	    } else if (anInt3365 >= 0 || (((Class264) this).anInt3370
					  ^ 0xffffffff) >= (i_9_ ^ 0xffffffff))
		bool = false;
	    else {
		int i_15_ = anInt3365 * anInt3365 / (2 * i_10_);
		int i_16_ = ((Class264) this).anInt3370 - i_15_;
		if ((i_16_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff)
		    && i_16_ <= ((Class264) this).anInt3370)
		    bool = true;
		else
		    bool = false;
	    }
	} else {
	    if (((((Class264) this).anInt3370 ^ 0xffffffff) > (i_9_
							       ^ 0xffffffff)
		 && i_9_ <= i_10_ + ((Class264) this).anInt3370)
		|| (i_9_ < ((Class264) this).anInt3370
		    && ((i_9_ ^ 0xffffffff)
			<= (((Class264) this).anInt3370 - i_10_
			    ^ 0xffffffff)))) {
		((Class264) this).anInt3370 = i_9_;
		return false;
	    }
	    bool = true;
	}
	if (!bool) {
	    if (anInt3365 <= 0) {
		anInt3365 += i_10_;
		if (anInt3365 > 0)
		    anInt3365 = 0;
	    } else {
		anInt3365 -= i_10_;
		if ((anInt3365 ^ 0xffffffff) > -1)
		    anInt3365 = 0;
	    }
	} else {
	    if ((i_9_ ^ 0xffffffff)
		>= (((Class264) this).anInt3370 ^ 0xffffffff)) {
		anInt3365 -= i_10_;
		if (i != 0 && anInt3365 < -i)
		    anInt3365 = -i;
	    } else {
		anInt3365 += i_10_;
		if ((i ^ 0xffffffff) != -1
		    && (anInt3365 ^ 0xffffffff) < (i ^ 0xffffffff))
		    anInt3365 = i;
	    }
	    if (i_12_ != anInt3365) {
		int i_17_ = anInt3365 * anInt3365 / (2 * i_10_);
		if ((((Class264) this).anInt3370 ^ 0xffffffff)
		    > (i_9_ ^ 0xffffffff)) {
		    if ((((Class264) this).anInt3370 - -i_17_ ^ 0xffffffff)
			< (i_9_ ^ 0xffffffff))
			anInt3365 = i_12_;
		} else if ((i_9_ ^ 0xffffffff) > (((Class264) this).anInt3370
						  ^ 0xffffffff)
			   && i_9_ > ((Class264) this).anInt3370 - i_17_)
		    anInt3365 = i_12_;
	    }
	}
	((Class264) this).anInt3370 += anInt3365 + i_12_ >> -1379632319;
	return bool;
    }
    
    final void method2021(byte i) {
	anInt3364++;
	((Class264) this).anInt3370 &= 0x3fff;
	if (i < 77)
	    method2021((byte) 36);
    }
    
    public Class264() {
	/* empty */
    }
}
