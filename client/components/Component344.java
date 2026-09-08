/* Component344 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * Sequence / animation definition cache (RENAMED from `Class87`).
 * Loads {@link DisplayModeManagerContainer167} from JS5 via {@link #getSequence};
 * soft caches live in {@code aClass60_1487} (defs) and {@code aClass60_1491}
 * (derived {@link HashNodeSub17} entries).
 */
final class Component344 {
    static int anInt1483;
    static int anInt1484;
    static int anInt1485;
    static int anInt1486;
    private NodeCache aClass60_1487 = new NodeCache(64);
    private final CacheStore aClass45_1488;
    static int anInt1489;
    static int anInt1490;
    private NodeCache aClass60_1491 = new NodeCache(100);

    final void method834(byte i) {
        synchronized (aClass60_1487) {
            aClass60_1487.clear(0);
            if (i >= -43) method838(-67);
        }
        anInt1490++;
        synchronized (aClass60_1491) {
            aClass60_1491.clear(0);
        }
    }

    /**
     * Returns cached sequence def {@code i}, loading + decoding from
     * {@link #aClass45_1488} on miss. Opaque {@code i_0_} must be {@code 7}.
     */
    final DisplayModeManagerContainer167 getSequence(int i, int i_0_) {
        anInt1483++;
        DisplayModeManagerContainer167 class17;
        synchronized (aClass60_1487) {
            class17 = (DisplayModeManagerContainer167) aClass60_1487.get(i, i_0_ + -68);
        }
        if (i_0_ != 7) aClass60_1491 = null;
        if (class17 != null) return class17;
        byte[] is;
        synchronized (aClass45_1488) {
            is = aClass45_1488.getFile(-1860, Component279.method256(i, (byte) 125), RSACipher.method494(i_0_ ^ 0x55, i));
        }
        class17 = new DisplayModeManagerContainer167();
        class17.anInt269 = i;
        class17.aClass87_251 = this;
        if (is != null) class17.method267(new Buffer(is), false);
        class17.method270((byte) 124);
        synchronized (aClass60_1487) {
            aClass60_1487.putOne(class17, i, (byte) -126);
        }
        return class17;
    }

    final void method836(int i, int i_1_) {
        anInt1485++;
        synchronized (aClass60_1487) {
            aClass60_1487.processSoftEntries(2, i);
        }
        synchronized (aClass60_1491) {
            aClass60_1491.processSoftEntries(2, i);
        }
        int i_2_ = -75 % ((i_1_ - 26) / 35);
    }

    static final int method837(int i, boolean bool, int i_3_, int i_4_) {
        i_4_ &= 0x3;
        anInt1486++;
        if (i_4_ == 0) return i_3_;
        if (bool != true) return -75;
        if (i_4_ == 1) return 7 - i;
        if (i_4_ == 2) return 7 - i_3_;
        return i;
    }

    final void method838(int i) {
        synchronized (aClass60_1487) {
            aClass60_1487.purgeSoftReferences(-121);
        }
        if (i != 7) method838(-111);
        anInt1489++;
        synchronized (aClass60_1491) {
            aClass60_1491.purgeSoftReferences(-127);
        }
    }

    final HashNodeSub17 method839(int i, int i_5_) {
        anInt1484++;
        HashNodeSub17 class348_sub42_sub17;
        synchronized (aClass60_1491) {
            if (i_5_ != 3) aClass60_1487 = null;
            class348_sub42_sub17 = (HashNodeSub17) aClass60_1491.get(i, -60);
            if (class348_sub42_sub17 == null) {
                class348_sub42_sub17 = new HashNodeSub17(i);
                aClass60_1491.putOne(class348_sub42_sub17, i, (byte) -127);
            }
            if (!class348_sub42_sub17.method3268(-122)) return null;
        }
        return class348_sub42_sub17;
    }

    Component344(GameType class230, int i, CacheStore class45, CacheStore class45_6_, CacheStore class45_7_) {
        try {
            aClass45_1488 = class45;
            if (aClass45_1488 != null) {
                int i_8_ = aClass45_1488.getGroupCapacity(-1) + -1;
                aClass45_1488.getFileCount(0, i_8_);
            }
            Component339.method1711(7, class45_6_, 2, class45_7_);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("lfa.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ',' + (class45_6_ != null ? "{...}" : "null") + ',' + (class45_7_ != null ? "{...}" : "null") + ')'));
        }
    }
}
