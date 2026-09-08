/* Component276 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component276
/**
 * RENAMED from `Class194` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt2591;
    static int anInt2592;
    static int anInt2593;
    private NodeCache aClass60_2594 = new NodeCache(64);
    static int anInt2595;
    static AudioLine aClass279_2596;
    private final CacheStore aClass45_2597;
    static int anInt2598;

    public static void method1441(byte i) {
        aClass279_2596 = null;
        if (i != 18) aClass279_2596 = null;
    }

    final void method1442(int i, byte i_0_) {
        anInt2598++;
        synchronized (aClass60_2594) {
            if (i_0_ != 1) aClass60_2594 = null;
            aClass60_2594.processSoftEntries(2, i);
        }
    }

    final void method1443(int i) {
        anInt2595++;
        int i_1_ = 14 % ((-39 - i) / 51);
        synchronized (aClass60_2594) {
            aClass60_2594.purgeSoftReferences(-80);
        }
    }

    final void method1444(int i, int i_2_) {
        int i_3_ = -6 % ((67 - i_2_) / 47);
        anInt2591++;
        synchronized (aClass60_2594) {
            aClass60_2594.clear(0);
            aClass60_2594 = new NodeCache(i);
        }
    }

    final void method1445(int i) {
        anInt2592++;
        if (i == 64) {
            synchronized (aClass60_2594) {
                aClass60_2594.clear(0);
            }
        }
    }

    final Component334 method1446(int i, int i_4_) {
        anInt2593++;
        Component334 class146;
        synchronized (aClass60_2594) {
            class146 = (Component334) aClass60_2594.get(i, 76);
        }
        if (class146 != null) return class146;
        byte[] is;
        synchronized (aClass45_2597) {
            is = aClass45_2597.getFile(i_4_ ^ 0x743, BrowserDetector.unpackHighBits(true, i), NodeSub14.method2806(false, i));
        }
        class146 = new Component334();
        if (i_4_ != -1) return null;
        if (is != null) class146.method1191(i_4_ ^ ~0x800, new Buffer(is));
        synchronized (aClass60_2594) {
            aClass60_2594.putOne(class146, i, (byte) -105);
        }
        return class146;
    }

    Component276(GameType class230, int i, CacheStore class45) {
        do {
            try {
                aClass45_2597 = class45;
                if (aClass45_2597 == null) break;
                int i_5_ = aClass45_2597.getGroupCapacity(-1) + -1;
                aClass45_2597.getFileCount(0, i_5_);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("qs.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }
}
