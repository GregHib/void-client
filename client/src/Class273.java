/* Class273 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class273 implements Interface21
{
    static int[] anIntArray5165 = { -1, -1, 1, 1 };
    static int anInt5166;
    int anInt5167;
    static int anInt5168;
    static Class173 aClass173_5169 = new Class173();
    
    public static void method2055(int i) {
	anIntArray5165 = null;
	aClass173_5169 = null;
	if (i != 1)
	    anIntArray5165 = null;
    }
    
    static final boolean method2056(int i, int i_0_, int i_1_) {
	if (i_0_ < 80)
	    method2055(17);
	anInt5168++;
	if (!Class146.method1193(i_1_, i, true))
	    return false;
	if (Class122.method1087(12644, i_1_, i) | (i & 0xb000) != 0
	    | Class278.method2075(i, -128, i_1_))
	    return true;
	return ((Class156.method1241(i_1_, i, -128)
		 | Class239_Sub1.method1722(i, i_1_, (byte) 92))
		& (0x37 & i_1_ ^ 0xffffffff) == -1);
    }
    
    static int method2057(int i, int i_2_) {
	return i | i_2_;
    }
    
    public final String toString() {
	anInt5166++;
	throw new IllegalStateException();
    }
    
    Class273(String string, int i) {
	((Class273) this).anInt5167 = i;
    }
}
