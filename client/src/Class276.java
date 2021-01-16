/* Class276 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class276
{
    int[] anIntArray3554;
    int anInt3555;
    int[] anIntArray3556;
    int anInt3557;
    
    Class276() {
	Class348_Sub10.method2789(16);
	((Class276) this).anInt3555 = (Class348_Sub10.method2788() != 0
				       ? Class348_Sub10.method2789(4) + 1 : 1);
	if (Class348_Sub10.method2788() != 0)
	    Class348_Sub10.method2789(8);
	Class348_Sub10.method2789(2);
	if (((Class276) this).anInt3555 > 1)
	    ((Class276) this).anInt3557 = Class348_Sub10.method2789(4);
	((Class276) this).anIntArray3556
	    = new int[((Class276) this).anInt3555];
	((Class276) this).anIntArray3554
	    = new int[((Class276) this).anInt3555];
	for (int i = 0; i < ((Class276) this).anInt3555; i++) {
	    Class348_Sub10.method2789(8);
	    ((Class276) this).anIntArray3556[i] = Class348_Sub10.method2789(8);
	    ((Class276) this).anIntArray3554[i] = Class348_Sub10.method2789(8);
	}
    }
}
