/* Component37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component37
/**
 * RENAMED from `Class312` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    private Node aClass348_3922;
    private NodeList aClass262_3923;
    static int anInt3924;
    static Component183 aClass114_3925;
    static int anInt3926;
    static int anInt3927;
    static int anInt3928;
    static int anInt3929;
    static int anInt3930 = 2;
    static int anInt3931;
    static int anInt3932;

    final Node method2327(byte i) {
        anInt3929++;
        Node class348 = (aClass262_3923.sentinel.next);
        if (i != -53) method2329(-21);
        if (aClass262_3923.sentinel == class348) {
            aClass348_3922 = null;
            return null;
        }
        aClass348_3922 = class348.next;
        return class348;
    }

    final void method2328(NodeList class262, int i) {
        anInt3927++;
        if (i <= 73) method2327((byte) -67);
        aClass262_3923 = class262;
    }

    final Node method2329(int i) {
        anInt3928++;
        if (i != 10) method2330((byte) -25);
        Node class348 = aClass348_3922;
        if (aClass262_3923.sentinel == class348) {
            aClass348_3922 = null;
            return null;
        }
        aClass348_3922 = class348.next;
        return class348;
    }

    static final void method2330(byte i) {
        NodeSub3.method2739(0);
        anInt3924++;
        if (i == 86) {
            DefinitionSub25.anInt9341 = 0;
            DefinitionSub36.aClass114_9456 = null;
            Component80.packetBuffer.offset = 0;
            SocketStream.aClass114_3133 = null;
            Component339.aClass114_3145 = null;
            NodeSub50.anInt7213 = 0;
            NodeSub3.aClass114_6584 = null;
            Component156.anInt3699 = 0;
            DefinitionSub39.method3153(0);
            DefinitionSub37.method3147((byte) 27);
            for (int i_0_ = 0; i_0_ < 2048; i_0_++)
                InterfaceRenderer.players[i_0_] = null;
            Component72.localPlayer = null;
            for (int i_1_ = 0; NodeSub32.anInt6930 > i_1_; i_1_++) {
                Npc npc = (DefinitionSub23.aClass348_Sub22Array9319[i_1_].npc);
                if (npc != null) npc.anInt10275 = -1;
            }
            Component126.method3515(i + 36);
            JaclibLoader.anInt167 = ShaderLinker.anInt10163 = -1;
            DefinitionSub21.cameraMode = 1;
            Buffer.setClientState(2, 10);
            for (int i_2_ = 0; i_2_ < 100; i_2_++)
                InflaterDecompressor.aBooleanArray2076[i_2_] = true;
            ShaderProgramSub2.method2145(-24498);
            Component323.aClass348_Sub26_5881 = null;
            MatrixSub2.aLong5745 = 0L;
        }
    }

    public static void method2331(boolean bool) {
        aClass114_3925 = null;
        if (bool != true) anInt3930 = -53;
    }

    static final boolean method2332(int i, byte i_3_, int i_4_) {
        if (i_3_ <= 120) anInt3930 = 6;
        anInt3926++;
        return (0x20 & i_4_) != 0;
    }

    public Component37() {
        /* empty */
    }

    Component37(NodeList class262) {
        aClass262_3923 = class262;
    }

    static {
        aClass114_3925 = new Component183(27, 3);
        anInt3931 = 0;
        anInt3932 = 1403;
    }
}
