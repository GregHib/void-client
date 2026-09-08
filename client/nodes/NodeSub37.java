/* NodeSub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NodeSub37
/**
 * RENAMED from `Class348_Sub37` (JODE-obfuscated).
 * Evidence: subclass of Node (hierarchy)
 */ extends Node {
    static int anInt6996;
    static boolean aBoolean6997 = false;
    NodeList aClass262_6998 = new NodeList();
    static int anInt6999;

    static final void method3030(int i, GlToolkitSub2 var_ha_Sub2) {
        anInt6999++;
        if (Component244.anObject4177 == null) {
            DisplayModeManagerContainer34 class59_sub1_sub2 = new DisplayModeManagerContainer34();
            byte[] is = class59_sub1_sub2.method562(128, 128, (byte) 121, 16);
            Component244.anObject4177 = BrowserDetector.wrapSoft(is, false, (byte) 81);
        }
        if (Component144.anObject3985 == null) {
            Component54 class59_sub2_sub1 = new Component54();
            byte[] is = class59_sub2_sub1.method567(128, (byte) 111, 16, 128);
            Component144.anObject3985 = BrowserDetector.wrapSoft(is, false, (byte) 103);
        }
        if (i != 8) method3031(-39, null);
        ReliefShader class188 = var_ha_Sub2.aClass188_7736;
        if (class188.method1414(35632) && Component14.anObject8592 == null) {
            byte[] is = Component2.method194(128, -1922, 8, 0.6F, 128, 4.0F, 4.0F, 0.5F, 16.0F, new Component134(419684), 16);
            Component14.anObject8592 = BrowserDetector.wrapSoft(is, false, (byte) 78);
        }
    }

    static final Definition method3031(int i, Buffer class348_sub49) {
        anInt6996++;
        class348_sub49.readUnsignedByte(255);
        int i_0_ = class348_sub49.readUnsignedByte(255);
        Definition class348_sub40 = Component350.method557(i_0_, (byte) -84);
        class348_sub40.anInt7036 = class348_sub49.readUnsignedByte(255);
        int i_1_ = class348_sub49.readUnsignedByte(255);
        if (i < 123) return null;
        for (int i_2_ = 0; i_1_ > i_2_; i_2_++) {
            int i_3_ = class348_sub49.readUnsignedByte(255);
            class348_sub40.method3049(class348_sub49, i_3_, 31015);
        }
        class348_sub40.postDecode(120);
        return class348_sub40;
    }

    public NodeSub37() {
        /* empty */
    }
}
