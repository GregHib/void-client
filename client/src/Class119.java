/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;

class Class119 {
    Buffer aBuffer1792;
    private final ha_Sub2 aHa_Sub2_1793;

    final void method1076(byte[] is, int i) {
        if (this.aBuffer1792 == null || this.aBuffer1792.getSize() < i) this.aBuffer1792 = aHa_Sub2_1793.aNativeHeap7730.a(i, false);
        this.aBuffer1792.a(is, 0, 0, i);
    }

    Class119(ha_Sub2 var_ha_Sub2, byte[] is, int i) {
        aHa_Sub2_1793 = var_ha_Sub2;
        this.aBuffer1792 = aHa_Sub2_1793.aNativeHeap7730.a(i, false);
        if (is != null) this.aBuffer1792.a(is, 0, 0, i);
    }

    Class119(ha_Sub2 var_ha_Sub2, Buffer buffer) {
        aHa_Sub2_1793 = var_ha_Sub2;
        this.aBuffer1792 = buffer;
    }
}
