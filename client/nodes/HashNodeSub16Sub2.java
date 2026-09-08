/* HashNodeSub16Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class HashNodeSub16Sub2
/**
 * RENAMED from {@code Class348_Sub42_Sub16_Sub2} (JODE-obfuscated).
 * Disk-backed JS5 request node processed by {@link DisplayModeManagerContainer67}.
 * {@link #type}: 1 = sync read result, 2 = write, 3 = async read.
 */ extends HashNodeSub16 {
    /** Job kind (1 sync-read / 2 write / 3 async-read). */
    int type;
    /** Target cache index reader for this job. */
    CacheIndexReader indexReader;
    static int anInt10459;
    static int anInt10460;
    /** Payload bytes (input for writes, output for reads). */
    byte[] data;
    static int anInt10462;
    static int anInt10463 = 0;
    static int anInt10464;
    static LruCache aClass356_10465 = new LruCache(16);

    /** {@code true} when the purple developer console is open ({@link StringCache#devConsoleOpen}). */
    static final boolean isDevConsoleOpen(boolean bool) {
        if (bool != true) return false;
        anInt10459++;
        return StringCache.devConsoleOpen;
    }

    public static void method3264(byte i) {
        aClass356_10465 = null;
        if (i != -24) method3265(-70, null, null);
    }

    final int getProgressPercent(int i) {
        anInt10460++;
        if (i != 16) this.indexReader = null;
        if (this.incomplete) return 0;
        return 100;
    }

    static final void method3265(int i, Node class348, Node class348_0_) {
        try {
            if (class348.previous != null) class348.unlink((byte) 27);
            int i_1_ = -109 % ((6 - i) / 43);
            anInt10462++;
            class348.previous = class348_0_.previous;
            class348.next = class348_0_;
            class348.previous.next = class348;
            class348.next.previous = class348;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("qh.K(" + i + ',' + (class348 != null ? "{...}" : "null") + ',' + (class348_0_ != null ? "{...}" : "null") + ')'));
        }
    }

    final byte[] getData(int i) {
        anInt10464++;
        if (i != 16) getData(8);
        if (this.incomplete) throw new RuntimeException();
        return this.data;
    }

    public HashNodeSub16Sub2() {
        /* empty */
    }
}
