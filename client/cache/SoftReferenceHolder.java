/* SoftReferenceHolder - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class348_Sub42_Sub9_Sub2` (JODE-obfuscated).
 * Concrete soft-reference holder. extends ReferenceHolder; stores a SoftReference (softReference) and returns it via getReferent.
 */

import java.lang.ref.SoftReference;

final class SoftReferenceHolder extends ReferenceHolder {
    private SoftReference softReference;

    final Object getReferent(int i) {
        if (i != 65536) softReference = null;
        return softReference.get();
    }

    final boolean isSoftRef(byte i) {
        int i_0_ = -88 % ((-63 - i) / 61);
        return true;
    }

    SoftReferenceHolder(Interface14 interface14, Object object, int i) {
        super(interface14, i);
        softReference = new SoftReference(object);
    }
}
