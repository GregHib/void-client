/* Component311 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component311
/**
 * RENAMED from `Class326` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt4083;
    static int anInt4084;
    private final CacheStore aClass45_4085;
    static int anInt4086 = 0;
    private NodeCache aClass60_4087 = new NodeCache(64);
    static int anInt4088;
    static int anInt4089;

    final Component355 method2600(int i, int i_0_) {
        anInt4084++;
        Component355 class254;
        synchronized (aClass60_4087) {
            class254 = (Component355) aClass60_4087.get(i, -67);
        }
        if (class254 != null) return class254;
        if (i_0_ != 28364) anInt4086 = 117;
        byte[] is;
        synchronized (aClass45_4085) {
            is = aClass45_4085.getFile(-1860, 11, i);
        }
        class254 = new Component355();
        if (is != null) class254.method1924(new Buffer(is), (byte) -127);
        synchronized (aClass60_4087) {
            aClass60_4087.putOne(class254, i, (byte) -114);
        }
        return class254;
    }

    final void method2601(byte i) {
        synchronized (aClass60_4087) {
            aClass60_4087.clear(0);
            int i_1_ = -46 / ((i - 3) / 47);
        }
        anInt4088++;
    }

    final void method2602(int i) {
        anInt4089++;
        synchronized (aClass60_4087) {
            aClass60_4087.purgeSoftReferences(-91);
            if (i != 0) aClass60_4087 = null;
        }
    }

    final void method2603(int i, int i_2_) {
        synchronized (aClass60_4087) {
            if (i_2_ != 11) return;
            aClass60_4087.processSoftEntries(2, i);
        }
        anInt4083++;
    }

    Component311(GameType class230, int i, CacheStore class45) {
        do {
            try {
                aClass45_4085 = class45;
                if (aClass45_4085 == null) break;
                aClass45_4085.getFileCount(0, 11);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("dc.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }
}
