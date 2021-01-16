/* Class348_Sub40_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub20 extends Class348_Sub40
{
    static int anInt9261;
    static int anInt9262;
    static Class231 aClass231_9263 = new Class231("RC", 1);
    static Class348_Sub4 aClass348_Sub4_9264;
    static int anInt9265;
    
    static final void method3102(int i) {
	if (i != 22385)
	    aClass348_Sub4_9264 = null;
	anInt9265++;
	Class332.aClass60_4139.method587(-110);
    }
    
    private final int method3103(int i, int i_0_, int i_1_) {
	anInt9262++;
	if (i_1_ < 14)
	    aClass348_Sub4_9264 = null;
	int i_2_ = i_0_ - -(57 * i);
	i_2_ ^= i_2_ << 1180720577;
	return (-(((789221 + 15731 * (i_2_ * i_2_)) * i_2_ + 1376312589
		   & 0x7fffffff)
		  / 262144)
		+ 4096);
    }
    
    public Class348_Sub40_Sub20() {
	super(0, true);
    }
    
    public static void method3104(boolean bool) {
	if (bool == false) {
	    aClass348_Sub4_9264 = null;
	    aClass231_9263 = null;
	}
    }
    
    final int[] method3042(int i, int i_3_) {
	anInt9261++;
	int[] is = ((Class348_Sub40) this).aClass191_7032.method1433(0, i);
	if (((Class191) ((Class348_Sub40) this).aClass191_7032).aBoolean2570) {
	    int i_4_ = Class239_Sub18.anIntArray6035[i];
	    for (int i_5_ = 0; ((Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff)
				< (i_5_ ^ 0xffffffff)); i_5_++)
		is[i_5_] = method3103(i_4_, Class318_Sub6.anIntArray6432[i_5_],
				      22) % 4096;
	}
	if (i_3_ != 255)
	    method3042(38, -42);
	return is;
    }
    
    static {
	new Class273("", 73);
    }
}
