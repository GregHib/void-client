/* Class348_Sub40_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub35 extends Class348_Sub40
{
    static int anInt9440;
    static int anInt9441;
    static int anInt9442;
    static Class161 aClass161_9443;
    static int anInt9444;
    private int anInt9445 = 3216;
    static int anInt9446;
    private int anInt9447 = 3216;
    private int anInt9448 = 4096;
    private int[] anIntArray9449 = new int[3];
    
    private final void method3143(int i) {
	anInt9440++;
	if (i >= -118)
	    method3143(-88);
	double d = Math.cos((double) ((float) anInt9445 / 4096.0F));
	anIntArray9449[0]
	    = (int) (d * Math.sin((double) ((float) anInt9447 / 4096.0F))
		     * 4096.0);
	anIntArray9449[1]
	    = (int) (d * Math.cos((double) ((float) anInt9447 / 4096.0F))
		     * 4096.0);
	anIntArray9449[2]
	    = (int) (Math.sin((double) ((float) anInt9445 / 4096.0F))
		     * 4096.0);
	int i_0_ = anIntArray9449[0] * anIntArray9449[0] >> 1021098412;
	int i_1_ = anIntArray9449[1] * anIntArray9449[1] >> -915615988;
	int i_2_ = anIntArray9449[2] * anIntArray9449[2] >> 832978412;
	int i_3_ = (int) (4096.0 * Math.sqrt((double) (i_1_ + i_0_ + i_2_
						       >> 1001438988)));
	if (i_3_ != 0) {
	    anIntArray9449[1] = (anIntArray9449[1] << -1724646484) / i_3_;
	    anIntArray9449[0] = (anIntArray9449[0] << -10046932) / i_3_;
	    anIntArray9449[2] = (anIntArray9449[2] << 1095687020) / i_3_;
	}
    }
    
    final int[] method3042(int i, int i_4_) {
	anInt9446++;
	int[] is = ((Class348_Sub40) this).aClass191_7032.method1433(0, i);
	if (((Class191) ((Class348_Sub40) this).aClass191_7032).aBoolean2570) {
	    int i_5_ = Class248.anInt3201 * anInt9448 >> -856871732;
	    int[] is_6_ = this.method3048(Class299_Sub2.anInt6325 & -1 + i,
					  633706337, 0);
	    int[] is_7_ = this.method3048(i, 633706337, 0);
	    int[] is_8_ = this.method3048(Class299_Sub2.anInt6325 & i - -1,
					  i_4_ + 633706082, 0);
	    for (int i_9_ = 0; Class348_Sub40_Sub6.anInt9139 > i_9_; i_9_++) {
		int i_10_ = i_5_ * (is_8_[i_9_] - is_6_[i_9_]) >> 2050156428;
		int i_11_
		    = (i_5_ * (-is_7_[Class239_Sub22.anInt6076 & i_9_ - -1]
			       + is_7_[-1 + i_9_ & Class239_Sub22.anInt6076])
		       >> 1636786828);
		int i_12_ = i_11_ >> -1826425116;
		int i_13_ = i_10_ >> -386914108;
		if ((i_12_ ^ 0xffffffff) > -1)
		    i_12_ = -i_12_;
		if (i_13_ < 0)
		    i_13_ = -i_13_;
		if ((i_12_ ^ 0xffffffff) < -256)
		    i_12_ = 255;
		if ((i_13_ ^ 0xffffffff) < -256)
		    i_13_ = 255;
		int i_14_ = (Class46.aByteArray821[i_12_ + (i_13_ * (1 + i_13_)
							    >> 1034972801)]
			     & 0xff);
		int i_15_ = i_14_ * 4096 >> -1063977592;
		int i_16_ = i_14_ * i_11_ >> 1640011496;
		int i_17_ = i_10_ * i_14_ >> -659063864;
		i_17_ = i_17_ * anIntArray9449[1] >> 314547756;
		i_16_ = i_16_ * anIntArray9449[0] >> 1343921932;
		i_15_ = anIntArray9449[2] * i_15_ >> -3377012;
		is[i_9_] = i_15_ + i_16_ - -i_17_;
	    }
	}
	if (i_4_ != 255)
	    return null;
	return is;
    }
    
    public static void method3144(byte i) {
	aClass161_9443 = null;
	if (i < 34)
	    method3144((byte) 127);
    }
    
    final void method3044(int i) {
	if (i <= 108)
	    method3143(38);
	anInt9441++;
	method3143(-119);
    }
    
    final void method3049(Class348_Sub49 class348_sub49, int i, int i_18_) {
	int i_19_ = i;
    while_210_:
	do {
	    do {
		if ((i_19_ ^ 0xffffffff) != -1) {
		    if (i_19_ != 1) {
			if ((i_19_ ^ 0xffffffff) == -3)
			    break;
			break while_210_;
		    }
		} else {
		    anInt9448 = class348_sub49.method3330(i_18_ ^ 0x323581df);
		    break while_210_;
		}
		anInt9447 = class348_sub49.method3330(842397944);
		break while_210_;
	    } while (false);
	    anInt9445 = class348_sub49.method3330(842397944);
	} while (false);
	anInt9442++;
	if (i_18_ != 31015)
	    aClass161_9443 = null;
    }
    
    public Class348_Sub40_Sub35() {
	super(1, true);
    }
}
