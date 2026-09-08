/* NodeCache - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class60` (JODE-obfuscated).
 * Cache of Node entries. Backed by a hashtable (HashTable history) and an LruCache sub-cache (table). Provides get/put via countHard/clear.
 */

final class NodeCache {
    private final int capacity;
    static int anInt1085;
    private int remaining;
    static int anInt1087;
    static int anInt1088;
    private HashTable history = new HashTable();
    static int anInt1090;
    static int anInt1091;
    static int anInt1092;
    static int anInt1093;
    static int anInt1094;
    static int anInt1095;
    static int anInt1096;
    static int anInt1097;
    static GraphicsToolkit aHa1098;
    static int anInt1099;
    private final LruCache table;
    static int anInt1101;
    static int anInt1102;
    static int anInt1103;

    final int countHard(int i) {
        anInt1101++;
        int i_0_ = i;
        for (CacheNode class348_sub42_sub8 = (CacheNode) history.first(-84); class348_sub42_sub8 != null; class348_sub42_sub8 = ((CacheNode) history.next((byte) 79))) {
            if (!class348_sub42_sub8.isSoft(-4)) i_0_++;
        }
        return i_0_;
    }

    static final boolean method576(int i, int i_1_) {
        if (i_1_ <= 21) method589(null, -21);
        anInt1088++;
        return i == 2 || i == 3;
    }

    final int getCapacity(int i) {
        if (i != -4) getCapacity(19);
        anInt1097++;
        return capacity;
    }

    final void processSoftEntries(int i, int i_2_) {
        if (i == 2) {
            anInt1093++;
            if (MatrixSub1.aClass246_5675 != null) {
                for (CacheNode class348_sub42_sub8 = ((CacheNode) history.first(-59)); class348_sub42_sub8 != null; class348_sub42_sub8 = ((CacheNode) history.next((byte) 97))) {
                    if (!class348_sub42_sub8.isSoft(-4)) {
                        if ((long) i_2_ < ++class348_sub42_sub8.accessAge) {
                            CacheNode class348_sub42_sub8_3_ = MatrixSub1.aClass246_5675.method1888(3, class348_sub42_sub8);
                            table.put((byte) 86, (class348_sub42_sub8.key), class348_sub42_sub8_3_);
                            Component317.method573(class348_sub42_sub8_3_, class348_sub42_sub8, (byte) 63);
                            class348_sub42_sub8.unlink((byte) 116);
                            class348_sub42_sub8.unlink(true);
                        }
                    } else if (class348_sub42_sub8.getValue(100) == null) {
                        class348_sub42_sub8.unlink((byte) 60);
                        class348_sub42_sub8.unlink(true);
                        remaining += (class348_sub42_sub8.weight);
                    }
                }
            }
        }
    }

    NodeCache(int i) {
        this(i, i);
    }

    final Object method579(int i) {
        anInt1094++;
        CacheNode class348_sub42_sub8 = (CacheNode) table.next(0);
        while (class348_sub42_sub8 != null) {
            Object object = class348_sub42_sub8.getValue(114);
            if (object != null) return object;
            CacheNode class348_sub42_sub8_4_ = class348_sub42_sub8;
            class348_sub42_sub8 = (CacheNode) table.next(0);
            class348_sub42_sub8_4_.unlink((byte) 92);
            class348_sub42_sub8_4_.unlink(true);
            remaining += class348_sub42_sub8_4_.weight;
        }
        if (i > -67) aHa1098 = null;
        return null;
    }

    final void put(int i, Object object, long l, int i_5_) {
        try {
            anInt1092++;
            if (i_5_ > capacity) throw new IllegalStateException("s>cs");
            remove(l, 0);
            remaining -= i_5_;
            while (remaining < 0) {
                CacheNode class348_sub42_sub8 = ((CacheNode) history.removeHead(i ^ 0x7c8a));
                method585(class348_sub42_sub8, i ^ ~0x7cfa);
            }
            PacketReader class348_sub42_sub8_sub2 = new PacketReader(object, i_5_);
            table.put((byte) 54, l, class348_sub42_sub8_sub2);
            if (i != 31902) remaining = -106;
            history.add(true, class348_sub42_sub8_sub2);
            class348_sub42_sub8_sub2.accessAge = 0L;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("jr.E(" + i + ',' + (object != null ? "{...}" : "null") + ',' + l + ',' + i_5_ + ')'));
        }
    }

    final int getRemaining(int i) {
        if (i != -18529) get(-64L, 37);
        anInt1099++;
        return remaining;
    }

    final void putOne(Object object, long l, byte i) {
        try {
            if (i >= -92) method589(null, -7);
            anInt1095++;
            put(31902, object, l, 1);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("jr.B(" + (object != null ? "{...}" : "null") + ',' + l + ',' + i + ')'));
        }
    }

    final Object get(long l, int i) {
        try {
            int i_6_ = -59 % ((i - 2) / 47);
            anInt1085++;
            CacheNode class348_sub42_sub8 = (CacheNode) table.get(l, -6008);
            if (class348_sub42_sub8 == null) return null;
            Object object = class348_sub42_sub8.getValue(86);
            if (object == null) {
                class348_sub42_sub8.unlink((byte) 102);
                class348_sub42_sub8.unlink(true);
                remaining += class348_sub42_sub8.weight;
                return null;
            }
            if (class348_sub42_sub8.isSoft(-4)) {
                PacketReader class348_sub42_sub8_sub2 = new PacketReader(object, (class348_sub42_sub8.weight));
                table.put((byte) 90, (class348_sub42_sub8.key), class348_sub42_sub8_sub2);
                history.add(true, class348_sub42_sub8_sub2);
                class348_sub42_sub8_sub2.accessAge = 0L;
                class348_sub42_sub8.unlink((byte) 112);
                class348_sub42_sub8.unlink(true);
            } else {
                history.add(true, class348_sub42_sub8);
                class348_sub42_sub8.accessAge = 0L;
            }
            return object;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, "jr.K(" + l + ',' + i + ')');
        }
    }

    public static void method584(byte i) {
        aHa1098 = null;
        int i_7_ = -19 % ((i - 59) / 55);
    }

    private final void method585(CacheNode class348_sub42_sub8, int i) {
        int i_8_ = 80 / ((i - 6) / 36);
        anInt1102++;
        if (class348_sub42_sub8 != null) {
            class348_sub42_sub8.unlink((byte) 117);
            class348_sub42_sub8.unlink(true);
            remaining += class348_sub42_sub8.weight;
        }
    }

    private final void remove(long l, int i) {
        try {
            if (i != 0) history = null;
            anInt1090++;
            CacheNode class348_sub42_sub8 = (CacheNode) table.get(l, -6008);
            method585(class348_sub42_sub8, -57);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, "jr.J(" + l + ',' + i + ')');
        }
    }

    /** Remove cleared soft-reference entries from the LRU history. */
    final void purgeSoftReferences(int i) {
        anInt1096++;
        for (CacheNode class348_sub42_sub8 = (CacheNode) history.first(-71); class348_sub42_sub8 != null; class348_sub42_sub8 = ((CacheNode) history.next((byte) 50))) {
            if (class348_sub42_sub8.isSoft(-4)) {
                class348_sub42_sub8.unlink((byte) 118);
                class348_sub42_sub8.unlink(true);
                remaining += class348_sub42_sub8.weight;
            }
        }
        if (i >= -75) purgeSoftReferences(-97);
    }

    final Object method588(int i) {
        anInt1087++;
        CacheNode class348_sub42_sub8 = (CacheNode) table.first(0);
        if (i != -5052) getCapacity(77);
        while (class348_sub42_sub8 != null) {
            Object object = class348_sub42_sub8.getValue(119);
            if (object == null) {
                CacheNode class348_sub42_sub8_9_ = class348_sub42_sub8;
                class348_sub42_sub8 = (CacheNode) table.next(0);
                class348_sub42_sub8_9_.unlink((byte) 41);
                class348_sub42_sub8_9_.unlink(true);
                remaining += (class348_sub42_sub8_9_.weight);
            } else return object;
        }
        return null;
    }

    static final boolean method589(Component274 class42, int i) {
        anInt1103++;
        if (class42 == null) return false;
        if (i != -4) return false;
        if (!class42.aBoolean574) return false;
        if (!class42.method373(DisplayModeManagerContainer229.anInterface17_1244, i ^ ~0x2d)) return false;
        if (HeapDumpHelper.aClass356_4934.get(class42.anInt581, i ^ 0x1774) != null) return false;
        return Component140.aClass356_10442.get(class42.anInt596, i + -6004) == null;
    }

    final void clear(int i) {
        anInt1091++;
        history.clear(i + 2110355138);
        table.clear(i);
        remaining = capacity;
    }

    NodeCache(int i, int i_10_) {
        remaining = i;
        capacity = i;
        int i_11_;
        for (i_11_ = 1; i > i_11_ + i_11_ && i_10_ > i_11_; i_11_ += i_11_) {
            /* empty */
        }
        table = new LruCache(i_11_);
    }
}
