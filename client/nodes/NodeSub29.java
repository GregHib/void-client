/* NodeSub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NodeSub29
/**
 * RENAMED from `Class348_Sub29` (JODE-obfuscated).
 * Evidence: subclass of Node (hierarchy)
 */ extends Node {
    static CacheStore aClass45_6909;
    static int anInt6910;
    short aShort6911;

    public static void method3003(int i) {
        aClass45_6909 = null;
        if (i != -4587) method3003(-101);
    }

    public NodeSub29() {
        /* empty */
    }

    NodeSub29(short i) {
        this.aShort6911 = i;
    }

    static final void method3004(CacheStore class45, boolean bool, d var_d) {
        do {
            try {
                Component92.aClass45_3309 = class45;
                anInt6910++;
                MatrixSub1.modelProvider = var_d;
                if (bool == false) break;
                method3004(null, false, null);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("oia.B(" + (class45 != null ? "{...}" : "null") + ',' + bool + ',' + (var_d != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }
}
