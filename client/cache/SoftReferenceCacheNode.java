/* SoftReferenceCacheNode - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class348_Sub42_Sub8_Sub1` (JODE-obfuscated).
 * Soft-reference cache entry. extends CacheNode; wraps a SoftReference (softReference) and returns its referent via getValue.
 */

import java.lang.ref.SoftReference;

final class SoftReferenceCacheNode extends CacheNode {
    /** Soft referent for the cached value. */
    private final SoftReference softReference;

    final boolean isSoft(int i) {
        if (i != -4) getValue(-41);
        return true;
    }

    final Object getValue(int i) {
        if (i <= 75) return null;
        return softReference.get();
    }

    SoftReferenceCacheNode(Object object, int i) {
        super(i);
        softReference = new SoftReference(object);
    }
}
