/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class177 implements Interface1
{
    static int anInt4663;
    static int anInt4664;
    static int anInt4665;
    static int anInt4666 = 0;
    static int anInt4667;
    static int anInt4668;
    static int anInt4669;
    static int[] anIntArray4670 = new int[3];
    private Class52 aClass52_4671;
    
    public final void method9(byte i, boolean bool) {
	if (bool)
	    Class348_Sub8.aHa6654.aa(0, 0, Class321.anInt4017,
				     Class348_Sub42_Sub8_Sub2.anInt10432,
				     ((Class52) aClass52_4671).anInt4899, 0);
	anInt4668++;
	if (i != -49)
	    anInt4666 = -20;
    }
    
    static final void method1352(int i, int i_0_, int i_1_, byte i_2_) {
	anInt4664++;
	if (i_2_ != -98)
	    method1354((byte) 69);
	i_0_ = (i_0_ * ((Class348_Sub51) Class316.aClass348_Sub51_3959)
			   .aClass239_Sub26_7260.method1838(-32350)
		>> -2091864696);
	if (i_0_ != 0 && i != -1) {
	    if (!Class74.aBoolean1236 && (Class267.anInt3428 ^ 0xffffffff) != 0
		&& Class167.method1296(true)
		&& !Class327.method2605((byte) -99)) {
		Class209.aClass348_Sub16_Sub3_2718
		    = Class101_Sub3.method943(false);
		Class348_Sub16_Sub3 class348_sub16_sub3
		    = Class172.method1326(Class209.aClass348_Sub16_Sub3_2718,
					  i_2_ ^ ~0x68);
		Class348_Sub42_Sub18.method3273(true, -95,
						class348_sub16_sub3);
	    }
	    Class348_Sub1_Sub3.method2732(0, i, false, 102,
					  Class348_Sub23_Sub2.aClass45_9033,
					  i_0_);
	    Class348_Sub5.method2755(-1, 255, -1);
	    Class74.aBoolean1236 = true;
	}
    }
    
    public final void method7(int i) {
	anInt4667++;
	if (i != 10286)
	    method1354((byte) 42);
    }
    
    public final boolean method8(byte i) {
	anInt4663++;
	int i_3_ = 35 / ((i - 25) / 52);
	return true;
    }
    
    static final Class318_Sub1_Sub3 method1353(int i, int i_4_, int i_5_,
					       Class var_class) {
	Class357 class357
	    = Class147.aClass357ArrayArrayArray2029[i][i_4_][i_5_];
	if (class357 == null)
	    return null;
	for (Class148 class148 = ((Class357) class357).aClass148_4396;
	     class148 != null;
	     class148 = ((Class148) class148).aClass148_2038) {
	    Class318_Sub1_Sub3 class318_sub1_sub3
		= ((Class148) class148).aClass318_Sub1_Sub3_2040;
	    if (var_class.isAssignableFrom(class318_sub1_sub3.getClass())
		&& ((Class318_Sub1_Sub3) class318_sub1_sub3).aShort8743 == i_4_
		&& (((Class318_Sub1_Sub3) class318_sub1_sub3).aShort8750
		    == i_5_))
		return class318_sub1_sub3;
	}
	return null;
    }
    
    public static void method1354(byte i) {
	if (i == -22)
	    anIntArray4670 = null;
    }
    
    Class177(Class52 class52) {
	aClass52_4671 = class52;
    }
}
