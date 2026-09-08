/* Component38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component38
/**
 * RENAMED from `Class187` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    private CacheStore aClass45_2498;
    static int anInt2499;
    static int anInt2500;
    private NodeCache aClass60_2501 = new NodeCache(64);
    static int anInt2502;
    static int anInt2503;
    static int anInt2504;
    static int anInt2505;
    static int anInt2506;
    static DisplayModeManagerContainer369 aClass223_2507 = new DisplayModeManagerContainer369(9, 2);
    static int anInt2508;
    static int[] anIntArray2509 = new int[2];
    static int anInt2510;

    final void method1404(byte i) {
        synchronized (aClass60_2501) {
            aClass60_2501.clear(0);
            if (i >= -20) method1407((byte) -33);
        }
        anInt2508++;
    }

    static final void method1405(int i, boolean bool, boolean bool_0_) {
        anInt2506++;
        NodeSub13 class348_sub13 = AbstractGlTextureSub4.getContainerNode((byte) 42, i, bool);
        if (class348_sub13 != null && bool_0_ == true) {
            for (int i_1_ = 0; (class348_sub13.itemIds.length > i_1_); i_1_++) {
                class348_sub13.itemIds[i_1_] = -1;
                class348_sub13.amounts[i_1_] = 0;
            }
        }
    }

    static final void method1406(boolean bool) {
        if (bool == true) {
            Component223.method175((byte) -6);
            anInt2505++;
            Component210.gameCanvasAttached = false;
        }
    }

    public static void method1407(byte i) {
        int i_2_ = 92 / ((-3 - i) / 60);
        anIntArray2509 = null;
        aClass223_2507 = null;
    }

    final Component236 method1408(int i, int i_3_) {
        anInt2504++;
        Component236 class321;
        synchronized (aClass60_2501) {
            class321 = (Component236) aClass60_2501.get(i_3_, 76);
        }
        if (class321 != null) return class321;
        byte[] is;
        synchronized (aClass45_2498) {
            is = aClass45_2498.getFile(-1860, 35, i_3_);
        }
        class321 = new Component236();
        if (is != null) class321.method2551(-125, new Buffer(is));
        if (i != -12637) aClass60_2501 = null;
        class321.method2548((byte) 127);
        synchronized (aClass60_2501) {
            aClass60_2501.putOne(class321, i_3_, (byte) -99);
        }
        return class321;
    }

    final void method1409(int i, int i_4_) {
        synchronized (aClass60_2501) {
            if (i_4_ != -20721) aClass45_2498 = null;
            aClass60_2501.processSoftEntries(i_4_ + 20723, i);
        }
        anInt2503++;
    }

    final void method1410(int i) {
        synchronized (aClass60_2501) {
            if (i != -27995) method1409(-42, 23);
            aClass60_2501.purgeSoftReferences(-85);
        }
        anInt2502++;
    }

    Component38(GameType class230, int i, CacheStore class45) {
        do {
            try {
                aClass45_2498 = class45;
                if (aClass45_2498 == null) break;
                aClass45_2498.getFileCount(0, 35);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("qga.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }
}
