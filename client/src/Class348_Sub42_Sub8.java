/* Class348_Sub42_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class348_Sub42_Sub8 extends Class348_Sub42
{
    int anInt9545;
    static int anInt9546;
    static int anInt9547;
    static int anInt9548;
    static int anInt9549;
    static Class114 aClass114_9550 = new Class114(109, 7);
    static int anInt9551;
    static Class114 aClass114_9552 = new Class114(72, 0);
    static Class351 aClass351_9553 = new Class351(36, 7);
    static String aString9554;
    static short aShort9555 = 1;
    
    abstract Object method3193(int i);
    
    static final boolean method3194(int i, int i_0_, byte i_1_) {
	anInt9551++;
	if (i_1_ <= 118)
	    method3196(122, -41);
	return false;
    }
    
    abstract boolean method3195(int i);
    
    static final boolean method3196(int i, int i_2_) {
	if (i_2_ >= -39)
	    return false;
	anInt9546++;
	if ((i ^ 0xffffffff) != -4 && (i ^ 0xffffffff) != -5 && i != 5
	    && i != 6)
	    return false;
	return true;
    }
    
    Class348_Sub42_Sub8(int i) {
	((Class348_Sub42_Sub8) this).anInt9545 = i;
    }
    
    static final boolean method3197(int i, byte i_3_) {
	anInt9549++;
	if (i_3_ != 56)
	    aClass114_9552 = null;
	if ((i ^ 0xffffffff) != -8 && (i ^ 0xffffffff) != -10)
	    return false;
	return true;
    }
    
    static final void method3198(boolean bool, byte i) {
	anInt9547++;
	if (i != -45)
	    aShort9555 = (short) -74;
	if (bool) {
	    if ((r.anInt9721 ^ 0xffffffff) != 0)
		Class14.method235(r.anInt9721, (byte) -113);
	    for (Class348_Sub41 class348_sub41
		     = (Class348_Sub41) Class125.aClass356_4915.method3484(0);
		 class348_sub41 != null;
		 class348_sub41 = ((Class348_Sub41)
				   Class125.aClass356_4915.method3482(0))) {
		if (!class348_sub41.method2712((byte) 4)) {
		    class348_sub41
			= ((Class348_Sub41)
			   Class125.aClass356_4915.method3484(i ^ ~0x2c));
		    if (class348_sub41 == null)
			break;
		}
		Class127_Sub1.method1118(true, false, class348_sub41, 2533);
	    }
	    r.anInt9721 = -1;
	    Class125.aClass356_4915 = new Class356(8);
	    Class99.method882((byte) 11);
	    r.anInt9721 = Class285.anInt4737;
	    Class239.method1713(false, 520);
	    Class354.method3466(100);
	    Class66.method703(r.anInt9721);
	}
	Class223.aBoolean2895 = false;
	Class64_Sub3.aString5600 = Class186.aString2496 = "";
	Class195.method1448(-56);
	Class362.anInt4458 = -1;
	Class33.method338(i + 45, Class348_Sub42_Sub16_Sub1.anInt10447);
	Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907
	    = new Class318_Sub1_Sub3_Sub3_Sub2();
	((Class318_Sub1) Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907).anInt6377
	    = 512 * Class367_Sub4.anInt7319 / 2;
	((Class318_Sub1_Sub3_Sub3) Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907)
	    .anIntArray10320[0]
	    = Class367_Sub4.anInt7319 / 2;
	((Class318_Sub1) Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907).anInt6388
	    = 512 * Class348_Sub40_Sub3.anInt9109 / 2;
	((Class318_Sub1_Sub3_Sub3) Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907)
	    .anIntArray10317[0]
	    = Class348_Sub40_Sub3.anInt9109 / 2;
	Class286_Sub4.anInt6246 = Class59_Sub2_Sub2.anInt8685 = 0;
	if ((Class348_Sub40_Sub21.anInt9282 ^ 0xffffffff) == -3) {
	    Class286_Sub4.anInt6246 = Class348_Sub35.anInt6981 << 813833481;
	    Class59_Sub2_Sub2.anInt8685 = Class275.anInt3550 << 1515187753;
	} else
	    Class348_Sub21.method2954((byte) 62);
	Class76.method773(true);
    }
    
    public static void method3199(int i) {
	aClass114_9550 = null;
	if (i < 17)
	    method3196(60, -85);
	aClass114_9552 = null;
	aClass351_9553 = null;
	aString9554 = null;
    }
}
