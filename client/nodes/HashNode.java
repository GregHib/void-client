/* HashNode - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class348_Sub42` (JODE-obfuscated).
 * Node used inside HashTable chains. Chain prev/next ({@link #previous}/{@link #next});
 * {@link #accessAge} is MRU age (NodeCache increments it) — the lookup key is {@link Node#key}.
 */
class HashNode extends Node {
    /** MRU / access counter used by NodeCache eviction; not the hash key. */
    long accessAge;
    static Component245 aClass2_7058;
    static int anInt7059 = 0;
    /** Previous in the HashTable sentinel ring. */
    HashNode previous;
    static int anInt7061;
    static int anInt7062;
    /** Next in the HashTable sentinel ring. */
    HashNode next;
    static int anInt7064;

    public static void method3161(int i) {
        if (i != 0) method3161(-27);
        aClass2_7058 = null;
    }

    final void unlink(boolean bool) {
        anInt7064++;
        if (bool != true) method3163((byte) 50);
        if (this.previous != null) {
            this.previous.next = this.next;
            this.next.previous = this.previous;
            this.previous = null;
            this.next = null;
        }
    }

    static final void method3163(byte i) {
        ShaderCompilerSub1.anInt6513 = 0;
        anInt7062++;
        if (i == -114) {
            for (int i_0_ = 0; i_0_ < 2048; i_0_++) {
                Component101.aClass348_Sub49Array2105[i_0_] = null;
                Component293.aByteArray3300[i_0_] = (byte) 1;
                NpcDefinition.aClass359Array6802[i_0_] = null;
            }
        }
    }

    /** True when linked in the HashTable chain (not Node list). */
    final boolean isChainLinked(byte i) {
        anInt7061++;
        if (this.previous == null) return false;
        if (i != 1) unlink(false);
        return true;
    }

    public HashNode() {
        /* empty */
    }

    static {
        aClass2_7058 = new Component245();
    }
}
