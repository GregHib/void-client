/* Class348_Sub19_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub19_Sub1 extends Class348_Sub19
{
    byte[] aByteArray8984;
    int anInt8985;
    int anInt8986;
    boolean aBoolean8987;
    int anInt8988;
    
    final Class348_Sub19_Sub1 method2944(Class163 class163) {
	((Class348_Sub19_Sub1) this).aByteArray8984
	    = class163.method1272(((Class348_Sub19_Sub1) this).aByteArray8984,
				  1);
	((Class348_Sub19_Sub1) this).anInt8988
	    = class163.method1270(((Class348_Sub19_Sub1) this).anInt8988,
				  (byte) -85);
	if (((Class348_Sub19_Sub1) this).anInt8986
	    == ((Class348_Sub19_Sub1) this).anInt8985)
	    ((Class348_Sub19_Sub1) this).anInt8986
		= ((Class348_Sub19_Sub1) this).anInt8985
		= class163.method1275(-114,
				      ((Class348_Sub19_Sub1) this).anInt8986);
	else {
	    ((Class348_Sub19_Sub1) this).anInt8986
		= class163.method1275(-83,
				      ((Class348_Sub19_Sub1) this).anInt8986);
	    ((Class348_Sub19_Sub1) this).anInt8985
		= class163.method1275(-80,
				      ((Class348_Sub19_Sub1) this).anInt8985);
	    if (((Class348_Sub19_Sub1) this).anInt8986
		== ((Class348_Sub19_Sub1) this).anInt8985)
		((Class348_Sub19_Sub1) this).anInt8986--;
	}
	return this;
    }
    
    Class348_Sub19_Sub1(int i, byte[] is, int i_0_, int i_1_) {
	((Class348_Sub19_Sub1) this).anInt8988 = i;
	((Class348_Sub19_Sub1) this).aByteArray8984 = is;
	((Class348_Sub19_Sub1) this).anInt8986 = i_0_;
	((Class348_Sub19_Sub1) this).anInt8985 = i_1_;
    }
    
    Class348_Sub19_Sub1(int i, byte[] is, int i_2_, int i_3_, boolean bool) {
	((Class348_Sub19_Sub1) this).anInt8988 = i;
	((Class348_Sub19_Sub1) this).aByteArray8984 = is;
	((Class348_Sub19_Sub1) this).anInt8986 = i_2_;
	((Class348_Sub19_Sub1) this).anInt8985 = i_3_;
	((Class348_Sub19_Sub1) this).aBoolean8987 = bool;
    }
}
