/* Component48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component48
/**
 * RENAMED from `Class352` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt4330;
    static Component183 aClass114_4331 = new Component183(31, -1);
    BitmapFont aClass324_4332;
    Component184 aClass143_4333 = null;
    static int anInt4334;
    static int anInt4335;
    static int anInt4336;
    static int anInt4337 = -2;

    public static void method3458(int i) {
        if (i != 2672) method3459(null, -32, 14, -44, 95);
        aClass114_4331 = null;
    }

    static final void method3459(NodeSub34 class348_sub34, int i, int i_0_, int i_1_, int i_2_) {
        anInt4330++;
        long l = i_0_ << 14 | i << 28 | i_1_;
        NodeSub37 class348_sub37 = (NodeSub37) Component387.aClass356_1895.get(l, -6008);
        if (class348_sub37 == null) {
            class348_sub37 = new NodeSub37();
            Component387.aClass356_1895.put((byte) 50, l, class348_sub37);
            class348_sub37.aClass262_6998.addTail(class348_sub34, -20180);
        } else {
            ItemDefinition class213 = Exception_Sub1.itemDefinitions.getItemDefinition(i_2_ ^ ~0x72, (class348_sub34.anInt6973));
            int i_3_ = class213.anInt2819;
            if (i_2_ == (~class213.anInt2820)) i_3_ *= 1 + class348_sub34.anInt6971;
            for (NodeSub34 class348_sub34_4_ = (NodeSub34) class348_sub37.aClass262_6998.first(i_2_ + 6); class348_sub34_4_ != null; class348_sub34_4_ = (NodeSub34) class348_sub37.aClass262_6998.next((byte) 34)) {
                class213 = (Exception_Sub1.itemDefinitions.getItemDefinition(104, class348_sub34_4_.anInt6973));
                int i_5_ = class213.anInt2819;
                if (class213.anInt2820 == 1) i_5_ *= class348_sub34_4_.anInt6971 - -1;
                if (i_3_ > i_5_) {
                    HashNodeSub16Sub2.method3265(i_2_ ^ 0x6c, class348_sub34, class348_sub34_4_);
                    return;
                }
            }
            class348_sub37.aClass262_6998.addTail(class348_sub34, i_2_ ^ 0x4ed2);
        }
    }

    Component48(BitmapFont class324) {
        this.aClass324_4332 = null;
        this.aClass324_4332 = class324;
    }

    Component48(BitmapFont class324, Component184 class143) {
        this.aClass324_4332 = null;
        try {
            this.aClass143_4333 = class143;
            this.aClass324_4332 = class324;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("el.<init>(" + (class324 != null ? "{...}" : "null") + ',' + (class143 != null ? "{...}" : "null") + ')'));
        }
    }
}
