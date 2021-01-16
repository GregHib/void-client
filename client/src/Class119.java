/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

class Class119
{
    Buffer aBuffer1792;
    private ha_Sub2 aHa_Sub2_1793;
    
    final void method1076(byte[] is, int i) {
	if (((Class119) this).aBuffer1792 == null
	    || ((Class119) this).aBuffer1792.getSize() < i)
	    ((Class119) this).aBuffer1792
		= ((ha_Sub2) aHa_Sub2_1793).aNativeHeap7730.a(i, false);
	((Class119) this).aBuffer1792.a(is, 0, 0, i);
    }
    
    Class119(ha_Sub2 var_ha_Sub2, byte[] is, int i) {
	aHa_Sub2_1793 = var_ha_Sub2;
	((Class119) this).aBuffer1792
	    = ((ha_Sub2) aHa_Sub2_1793).aNativeHeap7730.a(i, false);
	if (is != null)
	    ((Class119) this).aBuffer1792.a(is, 0, 0, i);
    }
    
    Class119(ha_Sub2 var_ha_Sub2, Buffer buffer) {
	aHa_Sub2_1793 = var_ha_Sub2;
	((Class119) this).aBuffer1792 = buffer;
    }
}
