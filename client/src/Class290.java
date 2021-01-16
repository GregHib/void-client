/* Class290 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class290
{
    static boolean aBoolean3706;
    static int anInt3707;
    Interface5_Impl1 anInterface5_Impl1_3708;
    boolean aBoolean3709;
    static float aFloat3710;
    Interface5_Impl1 anInterface5_Impl1_3711;
    static int anInt3712;
    static int anInt3713 = 0;
    boolean aBoolean3714;
    static int anInt3715;
    static int anInt3716;
    static int anInt3717 = 1338;
    static int anInt3718;
    
    final void method2195(boolean bool) {
	if (((Class290) this).anInterface5_Impl1_3708 != null)
	    ((Class290) this).anInterface5_Impl1_3708.method21(23315);
	anInt3715++;
	((Class290) this).aBoolean3714 = bool;
    }
    
    static final void method2196(byte i) {
	Class239_Sub19.anInt6043
	    = (int) ((double) Class367_Sub4.anInt7319 * 34.46);
	Class348_Sub33.anInt6964 = 200;
	anInt3716++;
	if (i == -9) {
	    Class239_Sub19.anInt6043 <<= 2;
	    if (Class348_Sub8.aHa6654.method3670())
		Class239_Sub19.anInt6043 += 512;
	    Class226.method1626(1, false);
	}
    }
    
    final boolean method2197(byte i) {
	if (i >= -4)
	    method2195(true);
	anInt3718++;
	if (!((Class290) this).aBoolean3714 || ((Class290) this).aBoolean3709)
	    return false;
	return true;
    }
    
    Class290(boolean bool) {
	((Class290) this).aBoolean3709 = bool;
    }
}
