/* Component36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component36
/**
 * RENAMED from `Class257` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    private static boolean aBoolean3296 = false;
    private static final NodeList aClass262_3297;
    private static int anInt3298 = 0;

    static final synchronized void method1945(byte i, boolean bool) {
        if (i < -120) aBoolean3296 = bool;
    }

    static final synchronized void method1946(int i) {
        anInt3298--;
        if (i >= -83) method1947(-1, null);
        if (anInt3298 == 0) method1948((byte) -109);
    }

    static final synchronized void method1947(int i, Interface19 interface19) {
        if (!aBoolean3296) {
            if (i >= anInt3298) interface19.w(false);
            else {
                NodeSub28 class348_sub28 = new NodeSub28();
                class348_sub28.anInterface19_6908 = interface19;
                aClass262_3297.addTail(class348_sub28, -20180);
            }
        }
    }

    static final synchronized void method1948(byte i) {
        for (; ; ) {
            NodeSub28 class348_sub28 = (NodeSub28) aClass262_3297.peekFirst(8);
            if (class348_sub28 == null) break;
            class348_sub28.anInterface19_6908.w(true);
            class348_sub28.unlink((byte) 69);
        }
        if (i > -22) aBoolean3296 = false;
    }

    static final synchronized void method1949(byte i) {
        anInt3298++;
        int i_0_ = -68 % ((i - -79) / 45);
    }

    static {
        aClass262_3297 = new NodeList();
    }
}
