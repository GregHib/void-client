/* Class320 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class320
{
    static short aShort3992 = 320;
    static int anInt3993;
    static float aFloat3994;
    
    static final boolean method2547(int i, byte i_0_) {
	anInt3993++;
	if (Class163.aBooleanArray2162[i])
	    return true;
	if (!Class229.aClass45_2978.method408((byte) -124, i))
	    return false;
	int i_1_ = Class229.aClass45_2978.method407(0, i);
	if (i_1_ == 0) {
	    Class163.aBooleanArray2162[i] = true;
	    return true;
	}
	if (Class348_Sub40_Sub33.aClass46ArrayArray9427[i] == null)
	    Class348_Sub40_Sub33.aClass46ArrayArray9427[i] = new Class46[i_1_];
	for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff); i_2_++) {
	    if (Class348_Sub40_Sub33.aClass46ArrayArray9427[i][i_2_] == null) {
		byte[] is
		    = Class229.aClass45_2978.method410(i_0_ ^ ~0x717, i, i_2_);
		if (is != null) {
		    Class46 class46
			= (Class348_Sub40_Sub33.aClass46ArrayArray9427[i][i_2_]
			   = new Class46());
		    ((Class46) class46).anInt830 = i_2_ + (i << 1180385680);
		    if ((is[0] ^ 0xffffffff) != 0)
			throw new IllegalStateException("if1");
		    class46.method433(new Class348_Sub49(is), true);
		}
	    }
	}
	if (i_0_ != 84)
	    aFloat3994 = -0.8522395F;
	Class163.aBooleanArray2162[i] = true;
	return true;
    }
}
