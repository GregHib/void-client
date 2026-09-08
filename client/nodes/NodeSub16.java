/* NodeSub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class NodeSub16
/**
 * RENAMED from `Class348_Sub16` (JODE-obfuscated).
 * Evidence: subclass of Node (hierarchy)
 */ extends Node {
    volatile boolean aBoolean6784 = true;
    NodeSub16 aClass348_Sub16_6785;
    int anInt6786;
    NodeSub19 aClass348_Sub19_6787;

    final void synthesize(int[] is, int i, int i_0_) {
        if (this.aBoolean6784) synthesizeSamples(is, i, i_0_);
        else skip(i_0_);
    }

    abstract NodeSub16 getNextNode();

    abstract void synthesizeSamples(int[] is, int i, int i_1_);

    abstract NodeSub16 getPreviousNode();

    abstract void skip(int i);

    int getVolume() {
        return 255;
    }

    public NodeSub16() {
        /* empty */
    }

    abstract int getDuration();
}
