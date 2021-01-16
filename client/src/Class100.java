/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class100
{
    static int anInt1577;
    private int anInt1578;
    static Class78[] aClass78Array1579 = new Class78[37];
    static int anInt1580;
    private ha_Sub2 aHa_Sub2_1581;
    private Class83 aClass83_1582;
    static int[] anIntArray1583 = new int[14];
    private int anInt1584 = 0;
    static Class356 aClass356_1585 = new Class356(16);
    Class286_Sub1 aClass286_Sub1_1586;
    static int anInt1587;
    private Class286[] aClass286Array1588;
    static int anInt1589;
    static int anInt1590;
    static Class227 aClass227_1591 = new Class227(1);
    private int anInt1592;
    
    final void method884(int i, boolean bool, int i_0_, int i_1_, byte i_2_,
			 boolean bool_3_) {
	anInt1587++;
	bool_3_ &= aHa_Sub2_1581.method3639();
	if (!bool_3_ && ((i_0_ ^ 0xffffffff) == -5 || (i_0_ ^ 0xffffffff) == -9
			 || (i_0_ ^ 0xffffffff) == -10)) {
	    if (i_0_ == 4)
		i_1_ = i;
	    i_0_ = 2;
	}
	if ((i_0_ ^ 0xffffffff) != -1 && bool)
	    i_0_ |= ~0x7fffffff;
	if ((i_0_ ^ 0xffffffff) != (anInt1578 ^ 0xffffffff)) {
	    if ((anInt1578 ^ 0xffffffff) != -1)
		aClass286Array1588[0x7fffffff & anInt1578].method2133(-93);
	    if (i_0_ != 0) {
		aClass286Array1588[i_0_ & 0x7fffffff].method2134(bool, false);
		aClass286Array1588[0x7fffffff & i_0_].method2139(bool,
								 (byte) -115);
		aClass286Array1588[i_0_ & 0x7fffffff].method2136(i, i_1_,
								 (byte) -106);
	    }
	    anInt1578 = i_0_;
	    anInt1584 = i_1_;
	    anInt1592 = i;
	} else if (anInt1578 != 0) {
	    aClass286Array1588[0x7fffffff & anInt1578].method2139(bool,
								  (byte) -101);
	    if ((anInt1592 ^ 0xffffffff) != (i ^ 0xffffffff)
		|| anInt1584 != i_1_) {
		aClass286Array1588[0x7fffffff & anInt1578]
		    .method2136(i, i_1_, (byte) -98);
		anInt1592 = i;
		anInt1584 = i_1_;
	    }
	}
	if (i_2_ <= 9)
	    aClass83_1582 = null;
    }
    
    final boolean method885(int i, byte i_4_, Class258 class258) {
	anInt1590++;
	if (anInt1578 == 0)
	    return false;
	if (i_4_ != -124)
	    method889((byte) 99, 7);
	aClass286Array1588[0x7fffffff & anInt1578].method2140(class258,
							      (byte) -98, i);
	return true;
    }
    
    public static void method886(int i) {
	aClass356_1585 = null;
	aClass78Array1579 = null;
	if (i != 16)
	    aClass78Array1579 = null;
	anIntArray1583 = null;
	aClass227_1591 = null;
    }
    
    static final void method887(Class46 class46, int i, int i_5_, int i_6_) {
	if (i_6_ == 2147483647) {
	    anInt1589++;
	    if (Class289.aClass46_3701 == null && !Class5_Sub1.aBoolean8335
		&& (class46 != null
		    && (Exception_Sub1.method141(class46, (byte) -79)
			!= null))) {
		Class289.aClass46_3701 = class46;
		Class331.aClass46_4130
		    = Exception_Sub1.method141(class46, (byte) -117);
		Class318_Sub1.anInt6392 = 0;
		Class219.anInt2872 = i_5_;
		Class318_Sub4.anInt6411 = i;
		Class300.aBoolean3819 = false;
	    }
	}
    }
    
    static final int method888(byte i, int i_7_, Class46 class46) {
	anInt1580++;
	if (i != 57)
	    method886(7);
	if (!client.method105(class46).method3301(i_7_, false)
	    && ((Class46) class46).anObjectArray741 == null)
	    return -1;
	if (((Class46) class46).anIntArray706 != null
	    && i_7_ < ((Class46) class46).anIntArray706.length)
	    return ((Class46) class46).anIntArray706[i_7_];
	return -1;
    }
    
    final boolean method889(byte i, int i_8_) {
	if (i >= -45)
	    method885(7, (byte) -70, null);
	anInt1577++;
	return aClass286Array1588[i_8_].method2137(-112);
    }
    
    Class100(ha_Sub2 var_ha_Sub2) {
	anInt1578 = 0;
	anInt1592 = 0;
	aHa_Sub2_1581 = var_ha_Sub2;
	aClass83_1582 = new Class83(var_ha_Sub2);
	aClass286Array1588 = new Class286[10];
	aClass286Array1588[1] = new Class286_Sub9(var_ha_Sub2);
	aClass286Array1588[2] = new Class286_Sub3(var_ha_Sub2, aClass83_1582);
	aClass286Array1588[4] = new Class286_Sub7(var_ha_Sub2, aClass83_1582);
	aClass286Array1588[5] = new Class286_Sub5(var_ha_Sub2, aClass83_1582);
	aClass286Array1588[6] = new Class286_Sub2(var_ha_Sub2);
	aClass286Array1588[7] = new Class286_Sub8(var_ha_Sub2);
	aClass286Array1588[3] = ((Class100) this).aClass286_Sub1_1586
	    = new Class286_Sub1(var_ha_Sub2);
	aClass286Array1588[8] = new Class286_Sub6(var_ha_Sub2, aClass83_1582);
	aClass286Array1588[9] = new Class286_Sub4(var_ha_Sub2, aClass83_1582);
	if (!aClass286Array1588[8].method2137(-33))
	    aClass286Array1588[8] = aClass286Array1588[4];
	if (!aClass286Array1588[9].method2137(-82))
	    aClass286Array1588[9] = aClass286Array1588[8];
    }
}
