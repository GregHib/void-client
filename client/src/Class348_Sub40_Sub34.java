/* Class348_Sub40_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub34 extends Class348_Sub40
{
    static int[] anIntArray9431 = new int[1];
    static Class293[] aClass293Array9432;
    static int anInt9433;
    static int anInt9434;
    static int anInt9435;
    static int[] anIntArray9436 = new int[2];
    static int anInt9437;
    private int anInt9438 = 4096;
    private boolean aBoolean9439 = true;
    
    static final int method3140(int i, int i_0_) {
	int i_1_ = 40 / ((i - 19) / 63);
	anInt9435++;
	if ((i_0_ ^ 0xffffffff) == -16711936)
	    return -1;
	return aa.method160(27076, i_0_);
    }
    
    static final void method3141(boolean bool, byte i) {
	if (Class348_Sub40_Sub8.aClass238_9165 != null) {
	    Class348_Sub40_Sub8.aClass238_9165.method1700((byte) 36);
	    Class348_Sub40_Sub8.aClass238_9165 = null;
	}
	anInt9437++;
	Class225.anInt2955 = 0;
	Class348_Sub18.method2938((byte) 87);
	Class318_Sub1_Sub3_Sub3.method2433();
	if (i != 11)
	    anIntArray9436 = null;
	for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -5; i_2_++)
	    Class348_Sub45.aClass361Array7108[i_2_].method3500(700);
	Class348_Sub42_Sub3.method3177(-50, false);
	System.gc();
	Class348_Sub31.method3007(2, 22684);
	Class74.aBoolean1236 = false;
	Class267.anInt3428 = -1;
	Class348_Sub40_Sub17_Sub1.method3093(i + 79);
	Class101_Sub2.method921((byte) 99, true);
	Class90.anInt1517 = 0;
	za_Sub2.anInt9780 = 0;
	ha.anInt4581 = 0;
	Class327.anInt4095 = 0;
	Class83.anInt1447 = Class312.anInt3931 = 0;
	for (int i_3_ = 0;
	     ((Class348_Sub27.aClass302Array6897.length ^ 0xffffffff)
	      < (i_3_ ^ 0xffffffff));
	     i_3_++)
	    Class348_Sub27.aClass302Array6897[i_3_] = null;
	Class348_Sub42.method3163((byte) -114);
	for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -2049; i_4_++)
	    Class294.aClass318_Sub1_Sub3_Sub3_Sub2Array5058[i_4_] = null;
	Class150.anInt2057 = 0;
	Class282.aClass356_3654.method3481(i ^ 0xb);
	Class348_Sub32.anInt6930 = 0;
	Class130.aClass356_1895.method3481(0);
	Class128.method1122(0);
	Class135_Sub1.anInt4718 = 0;
	Class318_Sub1_Sub3_Sub3.aClass170_10209.method1314((byte) -107);
	Class301.method2282(-12648);
	Class50_Sub3.method465(i + -1636518175);
	Class101_Sub2.aLong5745 = 0L;
	Class239_Sub4.aClass348_Sub26_5881 = null;
	if (bool)
	    Class348_Sub49.method3379(2, 12);
	else {
	    Class348_Sub49.method3379(i + -9, 3);
	    try {
		Class224.method1617((byte) 125, Class93.anApplet1530,
				    "loggedout");
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
    }
    
    final void method3049(Class348_Sub49 class348_sub49, int i, int i_5_) {
	do {
	    try {
		if (i_5_ != 31015)
		    method3140(-77, 55);
		anInt9433++;
		int i_6_ = i;
		if (i_6_ != 0) {
		    if ((i_6_ ^ 0xffffffff) != -2)
			break;
		} else {
		    anInt9438 = class348_sub49.method3330(842397944);
		    break;
		}
		aBoolean9439 = class348_sub49.method3387(255) == 1;
		break;
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("cfa.F("
						 + (class348_sub49 != null
						    ? "{...}" : "null")
						 + ',' + i + ',' + i_5_
						 + ')'));
	    }
	} while (false);
    }
    
    public Class348_Sub40_Sub34() {
	super(1, false);
    }
    
    public static void method3142(int i) {
	anIntArray9431 = null;
	anIntArray9436 = null;
	if (i != 0)
	    aClass293Array9432 = null;
	aClass293Array9432 = null;
    }
    
    final int[][] method3047(int i, int i_7_) {
	anInt9434++;
	int[][] is
	    = ((Class348_Sub40) this).aClass322_7033.method2557(-111, i);
	if (i_7_ != -1564599039)
	    method3140(72, -13);
	if (((Class322) ((Class348_Sub40) this).aClass322_7033).aBoolean4035) {
	    int[] is_8_ = this.method3048(-1 + i & Class299_Sub2.anInt6325,
					  633706337, 0);
	    int[] is_9_ = this.method3048(i, i_7_ + -2096661920, 0);
	    int[] is_10_ = this.method3048(Class299_Sub2.anInt6325 & 1 + i,
					   633706337, 0);
	    int[] is_11_ = is[0];
	    int[] is_12_ = is[1];
	    int[] is_13_ = is[2];
	    for (int i_14_ = 0; Class348_Sub40_Sub6.anInt9139 > i_14_;
		 i_14_++) {
		int i_15_ = (-is_8_[i_14_] + is_10_[i_14_]) * anInt9438;
		int i_16_
		    = (anInt9438
		       * (is_9_[1 + i_14_ & Class239_Sub22.anInt6076]
			  - is_9_[Class239_Sub22.anInt6076 & -1 + i_14_]));
		int i_17_ = i_16_ >> 1526543052;
		int i_18_ = i_15_ >> 959848748;
		int i_19_ = i_17_ * i_17_ >> 1701487660;
		int i_20_ = i_18_ * i_18_ >> 2009858988;
		int i_21_
		    = (int) (Math.sqrt((double) ((float) (i_19_
							  - (-i_20_ + -4096))
						 / 4096.0F))
			     * 4096.0);
		int i_22_;
		int i_23_;
		int i_24_;
		if (i_21_ != 0) {
		    i_23_ = i_16_ / i_21_;
		    i_22_ = i_15_ / i_21_;
		    i_24_ = 16777216 / i_21_;
		} else {
		    i_22_ = 0;
		    i_23_ = 0;
		    i_24_ = 0;
		}
		if (aBoolean9439) {
		    i_24_ = (i_24_ >> -683797247) + 2048;
		    i_23_ = (i_23_ >> 421152289) + 2048;
		    i_22_ = (i_22_ >> 201682433) + 2048;
		}
		is_11_[i_14_] = i_23_;
		is_12_[i_14_] = i_22_;
		is_13_[i_14_] = i_24_;
	    }
	}
	return is;
    }
}
