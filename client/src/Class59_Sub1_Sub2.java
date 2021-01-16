/* Class59_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class59_Sub1_Sub2 extends Class59_Sub1
{
    static int anInt8659;
    private byte[] aByteArray8660;
    static int anInt8661;
    static Class74 aClass74_8662 = new Class74(6, 5);
    static int[] anIntArray8663 = new int[120];
    static Class273 aClass273_8664;
    static int anInt8665;
    static int[] anIntArray8666;
    
    public Class59_Sub1_Sub2() {
	super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
    
    public static void method561(int i) {
	aClass74_8662 = null;
	if (i != 120)
	    method561(-85);
	anIntArray8666 = null;
	anIntArray8663 = null;
	aClass273_8664 = null;
    }
    
    final void method550(int i, byte i_0_, byte i_1_) {
	anInt8659++;
	int i_2_ = i * 2;
	int i_3_ = i_0_ & 0xff;
	aByteArray8660[i_2_++] = (byte) (i_3_ * 3 >> -479460411);
	if (i_1_ == 14)
	    aByteArray8660[i_2_] = (byte) (i_3_ * 3 >> 1998283269);
    }
    
    final byte[] method562(int i, int i_4_, byte i_5_, int i_6_) {
	aByteArray8660 = new byte[2 * i_6_ * (i_4_ * i)];
	if (i_5_ <= 85)
	    aClass273_8664 = null;
	anInt8661++;
	this.method542(i_4_, i, 0, i_6_);
	return aByteArray8660;
    }
    
    static {
	int i = 0;
	for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -121; i_7_++) {
	    int i_8_ = i_7_ - -1;
	    int i_9_ = (int) (300.0 * Math.pow(2.0, (double) i_8_ / 7.0)
			      + (double) i_8_);
	    i += i_9_;
	    anIntArray8663[i_7_] = i / 4;
	}
	aClass273_8664 = new Class273("", 17);
    }
}
