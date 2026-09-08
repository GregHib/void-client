/* LruCache - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class356` (JODE-obfuscated).
 * LRU cache of Node entries keyed by long. Bucket array {@link #buckets} (length {@link #capacity});
 * {@link #lookupCursor} / {@link #iteratorCursor} / {@link #iteratorIndex} for get/iteration walks.
 */

final class LruCache {
    Node[] buckets;
    static int anInt4375;
    static int anInt4376;
    int capacity;
    static int anInt4378;
    static int anInt4379;
    static int anInt4380;
    static int anInt4381;
    static int anInt4382;
    public static int anInt4383;
    static int anInt4384;
    private long aLong4385;
    static int anInt4386;
    static int anInt4387;
    static Component183 aClass114_4388 = new Component183(3, 3);
    /** Cursor for {@link #get} / {@link #continueGet} bucket walks. */
    private Node lookupCursor;
    /** Cursor for {@link #first} / {@link #next} iteration. */
    private Node iteratorCursor;
    /** Bucket index for iterator ({@link #first}/{@link #next}). */
    private int iteratorIndex = 0;

    final int size(int i) {
        if (i != 1) method3479(20);
        anInt4387++;
        int i_0_ = 0;
        for (int i_1_ = 0; this.capacity > i_1_; i_1_++) {
            Node class348 = this.buckets[i_1_];
            for (Node class348_2_ = class348.next; class348 != class348_2_; class348_2_ = class348_2_.next)
                i_0_++;
        }
        return i_0_;
    }

    final int getCapacity(boolean bool) {
        anInt4376++;
        if (bool != true) method3478(false);
        return this.capacity;
    }

    final Node continueGet(boolean bool) {
        anInt4384++;
        if (lookupCursor == null) return null;
        Node class348 = (this.buckets[(int) ((long) (this.capacity - 1) & aLong4385)]);
        if (bool != true) method3479(4);
        for (/**/; lookupCursor != class348; lookupCursor = lookupCursor.next) {
            if (lookupCursor.key == aLong4385) {
                Node class348_3_ = lookupCursor;
                lookupCursor = lookupCursor.next;
                return class348_3_;
            }
        }
        lookupCursor = null;
        return null;
    }

    final int method3477(int i, Node[] class348s) {
        if (i != 3) anInt4383 = -76;
        anInt4380++;
        int i_4_ = 0;
        for (int i_5_ = 0; this.capacity > i_5_; i_5_++) {
            Node class348 = this.buckets[i_5_];
            for (Node class348_6_ = class348.next; class348 != class348_6_; class348_6_ = class348_6_.next)
                class348s[i_4_++] = class348_6_;
        }
        return i_4_;
    }

    public static void method3478(boolean bool) {
        aClass114_4388 = null;
        if (bool != false) anInt4383 = 67;
    }

    static final NodeSub21 method3479(int i) {
        anInt4378++;
        if (i != -1) anInt4383 = 43;
        if (DisplayModeManagerContainer229.aClass262_1254 == null || r.aClass312_9716 == null) return null;
        for (NodeSub21 class348_sub21 = (NodeSub21) r.aClass312_9716.method2329(10); class348_sub21 != null; class348_sub21 = (NodeSub21) r.aClass312_9716.method2329(i ^ ~0xa)) {
            Component274 class42 = DisplayModeManagerContainer229.aClass153_1238.method1225(class348_sub21.anInt6847, (byte) 92);
            if (class42 != null && class42.aBoolean609 && class42.method373(DisplayModeManagerContainer229.anInterface17_1244, 127)) return class348_sub21;
        }
        return null;
    }

    final Node get(long l, int i) {
        try {
            aLong4385 = l;
            anInt4379++;
            Node class348 = (this.buckets[(int) (l & (long) (this.capacity + -1))]);
            if (i != -6008) first(80);
            for (lookupCursor = class348.next; lookupCursor != class348; lookupCursor = lookupCursor.next) {
                if (l == lookupCursor.key) {
                    Node class348_7_ = lookupCursor;
                    lookupCursor = lookupCursor.next;
                    return class348_7_;
                }
            }
            lookupCursor = null;
            return null;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, "eq.C(" + l + ',' + i + ')');
        }
    }

    final void clear(int i) {
        anInt4375++;
        for (int i_8_ = i; this.capacity > i_8_; i_8_++) {
            Node class348 = this.buckets[i_8_];
            for (; ; ) {
                Node class348_9_ = class348.next;
                if (class348_9_ == class348) break;
                class348_9_.unlink((byte) 54);
            }
        }
        lookupCursor = null;
        iteratorCursor = null;
    }

    final Node next(int i) {
        anInt4381++;
        if (iteratorIndex > i && (iteratorCursor != this.buckets[-1 + iteratorIndex])) {
            Node class348 = iteratorCursor;
            iteratorCursor = class348.next;
            return class348;
        }
        while (this.capacity > iteratorIndex) {
            Node class348 = (this.buckets[iteratorIndex++].next);
            if (this.buckets[-1 + iteratorIndex] != class348) {
                iteratorCursor = class348.next;
                return class348;
            }
        }
        return null;
    }

    final void put(byte i, long l, Node class348) {
        try {
            anInt4382++;
            if (i < 18) clear(71);
            if (class348.previous != null) class348.unlink((byte) 57);
            Node class348_10_ = (this.buckets[(int) (l & (long) (-1 + this.capacity))]);
            class348.next = class348_10_;
            class348.previous = class348_10_.previous;
            class348.previous.next = class348;
            class348.next.previous = class348;
            class348.key = l;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("eq.K(" + i + ',' + l + ',' + (class348 != null ? "{...}" : "null") + ')'));
        }
    }

    final Node first(int i) {
        iteratorIndex = i;
        anInt4386++;
        return next(0);
    }

    LruCache(int i) {
        this.capacity = i;
        this.buckets = new Node[i];
        for (int i_11_ = 0; i > i_11_; i_11_++) {
            Node class348 = this.buckets[i_11_] = new Node();
            class348.next = class348;
            class348.previous = class348;
        }
    }
}
