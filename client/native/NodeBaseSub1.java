/* NodeBaseSub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.heap.NativeHeap;

final class NodeBaseSub1
/**
 * RENAMED from `NodeBaseSub1` (JODE-obfuscated).
 * Evidence: extends NodeBase (NodeBase)
 */ extends NodeBase {
    NativeHeap aNativeHeap9770;
    static int anInt9771;
    static int anInt9772;
    static Component22 aClass113_9773 = new Component22();
    static int anInt9774;
    static int anInt9775 = -1;
    static int anInt9776 = 0;

    static final int method3439(int i) {
        anInt9771++;
        if (i <= 92) return 99;
        if (Buffer.anInt7207 == 1) return GpiLogger.anInt8854;
        return Component210.anInt5283;
    }

    NodeBaseSub1(int i) {
        this.aNativeHeap9770 = new NativeHeap(i);
    }

    final void method3440(int i) {
        anInt9772++;
        this.aNativeHeap9770.b();
        int i_0_ = -30 / ((i - -26) / 52);
    }

    public static void method3441(int i) {
        aClass113_9773 = null;
        if (i != 1) method3439(-118);
    }
}
