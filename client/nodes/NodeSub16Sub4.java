/* NodeSub16Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NodeSub16Sub4
/**
 * RENAMED from `Class348_Sub16_Sub4` (JODE-obfuscated).
 * Evidence: subclass of NodeSub16 (hierarchy)
 */ extends NodeSub16 {
    private final NodeList aClass262_8965 = new NodeList();
    private final NodeList aClass262_8966 = new NodeList();
    private int anInt8967 = -1;
    private int anInt8968 = 0;

    final synchronized void method2880(NodeSub16 class348_sub16) {
        class348_sub16.unlink((byte) 94);
    }

    final synchronized void skip(int i) {
        do {
            if (anInt8967 < 0) {
                method2884(i);
                break;
            }
            if (anInt8968 + i < anInt8967) {
                anInt8968 += i;
                method2884(i);
                break;
            }
            int i_0_ = anInt8967 - anInt8968;
            method2884(i_0_);
            i -= i_0_;
            anInt8968 += i_0_;
            method2885();
            NodeSub30 class348_sub30 = (NodeSub30) aClass262_8966.first(4);
            synchronized (class348_sub30) {
                int i_1_ = class348_sub30.method3005(this);
                if (i_1_ < 0) {
                    class348_sub30.anInt6912 = 0;
                    method2882(class348_sub30);
                } else {
                    class348_sub30.anInt6912 = i_1_;
                    method2881(class348_sub30.next, class348_sub30);
                }
            }
        } while (i != 0);
    }

    final NodeSub16 getNextNode() {
        return (NodeSub16) aClass262_8965.first(4);
    }

    private final void method2881(Node class348, NodeSub30 class348_sub30) {
        for (/**/; (class348 != aClass262_8966.sentinel && (((NodeSub30) class348).anInt6912 <= class348_sub30.anInt6912)); class348 = class348.next) {
            /* empty */
        }
        HashNodeSub16Sub2.method3265(-106, class348_sub30, class348);
        anInt8967 = ((NodeSub30) aClass262_8966.sentinel.next).anInt6912;
    }

    private final void method2882(NodeSub30 class348_sub30) {
        class348_sub30.unlink((byte) 105);
        class348_sub30.method3006();
        Node class348 = (aClass262_8966.sentinel.next);
        if (class348 == aClass262_8966.sentinel) anInt8967 = -1;
        else anInt8967 = ((NodeSub30) class348).anInt6912;
    }

    final synchronized void method2883(NodeSub16 class348_sub16) {
        aClass262_8965.addHead(class348_sub16, -109);
    }

    private final void method2884(int i) {
        for (NodeSub16 class348_sub16 = (NodeSub16) aClass262_8965.first(4); class348_sub16 != null; class348_sub16 = (NodeSub16) aClass262_8965.next((byte) 104))
            class348_sub16.skip(i);
    }

    private final void method2885() {
        if (anInt8968 > 0) {
            for (NodeSub30 class348_sub30 = (NodeSub30) aClass262_8966.first(4); class348_sub30 != null; class348_sub30 = (NodeSub30) aClass262_8966.next((byte) 115))
                class348_sub30.anInt6912 -= anInt8968;
            anInt8967 -= anInt8968;
            anInt8968 = 0;
        }
    }

    private final void method2886(int[] is, int i, int i_2_) {
        for (NodeSub16 class348_sub16 = (NodeSub16) aClass262_8965.first(4); class348_sub16 != null; class348_sub16 = (NodeSub16) aClass262_8965.next((byte) 41))
            class348_sub16.synthesize(is, i, i_2_);
    }

    final synchronized int method2887() {
        return aClass262_8965.size(0);
    }

    final NodeSub16 getPreviousNode() {
        return (NodeSub16) aClass262_8965.next((byte) 95);
    }

    final int getDuration() {
        return 0;
    }

    final synchronized void synthesizeSamples(int[] is, int i, int i_3_) {
        do {
            if (anInt8967 < 0) {
                method2886(is, i, i_3_);
                break;
            }
            if (anInt8968 + i_3_ < anInt8967) {
                anInt8968 += i_3_;
                method2886(is, i, i_3_);
                break;
            }
            int i_4_ = anInt8967 - anInt8968;
            method2886(is, i, i_4_);
            i += i_4_;
            i_3_ -= i_4_;
            anInt8968 += i_4_;
            method2885();
            NodeSub30 class348_sub30 = (NodeSub30) aClass262_8966.first(4);
            synchronized (class348_sub30) {
                int i_5_ = class348_sub30.method3005(this);
                if (i_5_ < 0) {
                    class348_sub30.anInt6912 = 0;
                    method2882(class348_sub30);
                } else {
                    class348_sub30.anInt6912 = i_5_;
                    method2881(class348_sub30.next, class348_sub30);
                }
            }
        } while (i_3_ != 0);
    }

    public NodeSub16Sub4() {
        /* empty */
    }
}
