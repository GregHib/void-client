/* Class348_Sub40_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub4 extends Class348_Sub40
{
    static Class262 aClass262_9111 = new Class262();
    static int anInt9112;
    static d aD9113;
    static Class101 aClass101_9114;
    static int anInt9115;
    
    final int[] method3042(int i, int i_0_) {
	anInt9115++;
	if (i_0_ != 255)
	    aClass262_9111 = null;
	int[] is = ((Class348_Sub40) this).aClass191_7032.method1433(0, i);
	if (((Class191) ((Class348_Sub40) this).aClass191_7032).aBoolean2570)
	    Class214.method1579(is, 0, Class348_Sub40_Sub6.anInt9139,
				Class239_Sub18.anIntArray6035[i]);
	return is;
    }
    
    public static void method3057(byte i) {
	if (i > -32)
	    method3058(-76, 25, -12);
	aClass101_9114 = null;
	aClass262_9111 = null;
	aD9113 = null;
    }
    
    public Class348_Sub40_Sub4() {
	super(0, true);
    }
    
    static final void method3058(int i, int i_1_, int i_2_) {
	Class357 class357
	    = Class147.aClass357ArrayArrayArray2029[i][i_1_][i_2_];
	if (class357 != null) {
	    Class183
		.method1376(((Class357) class357).aClass318_Sub1_Sub4_4406);
	    Class183
		.method1376(((Class357) class357).aClass318_Sub1_Sub4_4403);
	    if (((Class357) class357).aClass318_Sub1_Sub4_4406 != null)
		((Class357) class357).aClass318_Sub1_Sub4_4406 = null;
	    if (((Class357) class357).aClass318_Sub1_Sub4_4403 != null)
		((Class357) class357).aClass318_Sub1_Sub4_4403 = null;
	}
    }
}
