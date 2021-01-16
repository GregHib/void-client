/* Class239_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub7 extends Class239
{
    static int anInt5904;
    static int anInt5905;
    static int anInt5906;
    static int anInt5907;
    static int anInt5908;
    static int anInt5909 = -1;
    static int anInt5910;
    
    final int method1714(int i, int i_0_) {
	anInt5905++;
	if (((Class239) this).aClass348_Sub51_3136.method3425(-93))
	    return 3;
	if (((Class348_Sub51) ((Class239) this).aClass348_Sub51_3136)
		.aClass239_Sub24_7235.method1820(i ^ ~0x7e5e)
	    == 0)
	    return 3;
	if (i != 3)
	    anInt5909 = -111;
	return 1;
    }
    
    Class239_Sub7(int i, Class348_Sub51 class348_sub51) {
	super(i, class348_sub51);
    }
    
    Class239_Sub7(Class348_Sub51 class348_sub51) {
	super(class348_sub51);
    }
    
    final void method1716(boolean bool) {
	if (((Class239) this).aClass348_Sub51_3136.method3425(-82))
	    ((Class239) this).anInt3138 = 0;
	anInt5904++;
	if ((((Class348_Sub51) ((Class239) this).aClass348_Sub51_3136)
		 .aClass239_Sub24_7235.method1820(-32350)
	     ^ 0xffffffff)
	    == -1)
	    ((Class239) this).anInt3138 = 0;
	if (bool != false)
	    method1712(-60, 72);
	if ((((Class239) this).anInt3138 ^ 0xffffffff) > -1
	    || ((Class239) this).anInt3138 > 2)
	    ((Class239) this).anInt3138 = method1710(20014);
    }
    
    final void method1712(int i, int i_1_) {
	anInt5906++;
	int i_2_ = -93 % ((82 - i) / 35);
	((Class239) this).anInt3138 = i_1_;
    }
    
    final boolean method1747(int i) {
	anInt5908++;
	if (((Class239) this).aClass348_Sub51_3136.method3425(-127))
	    return false;
	if (((Class348_Sub51) ((Class239) this).aClass348_Sub51_3136)
		.aClass239_Sub24_7235.method1820(-32350)
	    == 0)
	    return false;
	if (i < 85)
	    method1747(105);
	return true;
    }
    
    final int method1748(int i) {
	if (i != -32350)
	    return 111;
	anInt5910++;
	return ((Class239) this).anInt3138;
    }
    
    final int method1710(int i) {
	anInt5907++;
	if (i != 20014)
	    anInt5909 = 100;
	return 2;
    }
}
