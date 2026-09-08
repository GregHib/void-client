/* Component125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;

class Component125
/**
 * RENAMED from `Class119` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    Buffer aBuffer1792;
    private final GlToolkitSub2 aHa_Sub2_1793;

    final void method1076(byte[] is, int i) {
        if (this.aBuffer1792 == null || this.aBuffer1792.getSize() < i) this.aBuffer1792 = aHa_Sub2_1793.aNativeHeap7730.a(i, false);
        this.aBuffer1792.a(is, 0, 0, i);
    }

    Component125(GlToolkitSub2 var_ha_Sub2, byte[] is, int i) {
        aHa_Sub2_1793 = var_ha_Sub2;
        this.aBuffer1792 = aHa_Sub2_1793.aNativeHeap7730.a(i, false);
        if (is != null) this.aBuffer1792.a(is, 0, 0, i);
    }

    Component125(GlToolkitSub2 var_ha_Sub2, Buffer buffer) {
        aHa_Sub2_1793 = var_ha_Sub2;
        this.aBuffer1792 = buffer;
    }
}
