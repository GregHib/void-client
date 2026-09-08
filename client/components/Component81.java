/* Component81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component81
/**
 * RENAMED from `Class276` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    int[] anIntArray3554;
    int anInt3555;
    int[] anIntArray3556;
    int anInt3557;

    Component81() {
        NodeSub10.readBits(16);
        this.anInt3555 = (NodeSub10.method2788() != 0 ? NodeSub10.readBits(4) + 1 : 1);
        if (NodeSub10.method2788() != 0) NodeSub10.readBits(8);
        NodeSub10.readBits(2);
        if (this.anInt3555 > 1) this.anInt3557 = NodeSub10.readBits(4);
        this.anIntArray3556 = new int[this.anInt3555];
        this.anIntArray3554 = new int[this.anInt3555];
        for (int i = 0; i < this.anInt3555; i++) {
            NodeSub10.readBits(8);
            this.anIntArray3556[i] = NodeSub10.readBits(8);
            this.anIntArray3554[i] = NodeSub10.readBits(8);
        }
    }
}
