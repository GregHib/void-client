/* ReferenceHolder - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class348_Sub42_Sub9` (JODE-obfuscated).
 * Abstract reference holder. extends HashNode; declares abstract getReferent(int) (get referent) and isSoftRef(byte) (is alive). Parent of SoftReferenceHolder.
 */

abstract class ReferenceHolder extends HashNode {
    int anInt9556;
    static int anInt9557;
    static int[] anIntArray9558 = {3, 7, 15};
    Interface14 anInterface14_9559;

    /** True if flag word {@code i_1_} has bit 0x10000 set. */
    static final boolean hasBit16(int i, byte i_0_, int i_1_) {
        anInt9557++;
        if (i_0_ < 109) return false;
        return (i_1_ & 0x10000) != 0;
    }

    public static void clearStatics(int i) {
        if (i > -64) hasBit16(-45, (byte) 72, -104);
        anIntArray9558 = null;
    }

    abstract Object getReferent(int i);

    ReferenceHolder(Interface14 interface14, int i) {
        this.anInterface14_9559 = interface14;
        this.anInt9556 = i;
    }

    abstract boolean isSoftRef(byte i);
}
