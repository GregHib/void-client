/* HashNodeSub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class HashNodeSub17
/**
 * RENAMED from `Class348_Sub42_Sub17` (JODE-obfuscated).
 * Evidence: subclass of HashNode (hierarchy)
 */ extends HashNode {
    private final int anInt9669;
    static int anInt9670;
    private byte[][] aByteArrayArray9671;
    static HashNodeSub17[] aClass348_Sub42_Sub17Array9672 = new HashNodeSub17[14];
    Component376[] aClass4Array9673;
    static int anInt9674;
    static int anInt9675;
    static int anInt9676;
    static int anInt9677;
    static int[][] anIntArrayArray9678;
    static StringCache aClass351_9679 = new StringCache(27, 7);
    static int anInt9680;

    static final int method3266(GraphicsToolkit var_ha, int i, Component11 class277) {
        try {
            anInt9674++;
            if (class277.anInt3569 == -1) {
                if (class277.anInt3575 != -1) {
                    Model class12 = var_ha.modelProvider.getModel(class277.anInt3575, -6662);
                    if (!class12.aBoolean209) return class12.aShort208;
                }
            } else return class277.anInt3569;
            if (i <= 123) return -68;
            return class277.anInt3563;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("gw.F(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + (class277 != null ? "{...}" : "null") + ')'));
        }
    }

    final boolean method3267(byte i, int i_0_) {
        anInt9676++;
        if (i >= -91) return false;
        return (this.aClass4Array9673[i_0_].aBoolean129);
    }

    final boolean method3268(int i) {
        anInt9675++;
        if (this.aClass4Array9673 != null) return true;
        if (aByteArrayArray9671 == null) {
            synchronized (Component161.aClass45_1940) {
                if (!Component161.aClass45_1940.isGroupReady((byte) -116, anInt9669)) return false;
                int[] is = Component161.aClass45_1940.getFileIds(anInt9669, 0);
                aByteArrayArray9671 = new byte[is.length][];
                for (int i_1_ = 0; i_1_ < is.length; i_1_++)
                    aByteArrayArray9671[i_1_] = Component161.aClass45_1940.getFile(-1860, anInt9669, is[i_1_]);
            }
        }
        boolean bool = true;
        for (int i_2_ = 0; i_2_ < aByteArrayArray9671.length; i_2_++) {
            byte[] is = aByteArrayArray9671[i_2_];
            Buffer class348_sub49 = new Buffer(is);
            class348_sub49.offset = 1;
            int i_3_ = class348_sub49.readUnsignedShort(842397944);
            synchronized (MenuOpener.aClass45_4843) {
                bool &= MenuOpener.aClass45_4843.isSingletonFileReady(false, i_3_);
            }
        }
        if (!bool) return false;
        NodeList class262 = new NodeList();
        int[] is;
        synchronized (Component161.aClass45_1940) {
            int i_4_ = Component161.aClass45_1940.getFileCount(0, anInt9669);
            this.aClass4Array9673 = new Component376[i_4_];
            is = Component161.aClass45_1940.getFileIds(anInt9669, 0);
            if (i > -115) method3266(null, 123, null);
        }
        for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
            byte[] is_6_ = aByteArrayArray9671[i_5_];
            Buffer class348_sub49 = new Buffer(is_6_);
            class348_sub49.offset = 1;
            int i_7_ = class348_sub49.readUnsignedShort(842397944);//
            ObjectDeserializer class348_sub33 = null;
            for (ObjectDeserializer class348_sub33_8_ = (ObjectDeserializer) class262.first(4); class348_sub33_8_ != null; class348_sub33_8_ = (ObjectDeserializer) class262.next((byte) 78)) {
                if (class348_sub33_8_.anInt6958 == i_7_) {
                    class348_sub33 = class348_sub33_8_;
                    break;
                }
            }
            if (class348_sub33 == null) {
                synchronized (MenuOpener.aClass45_4843) {
                    class348_sub33 = new ObjectDeserializer(i_7_, MenuOpener.aClass45_4843.getSingletonFile((byte) 73, i_7_));
                }
                class262.addTail(class348_sub33, -20180);
            }
            this.aClass4Array9673[is[i_5_]] = new Component376(is_6_, class348_sub33);
        }
        aByteArrayArray9671 = null;
        return true;
    }

    public static void method3269(boolean bool) {
        aClass348_Sub42_Sub17Array9672 = null;
        aClass351_9679 = null;
        anIntArrayArray9678 = null;
        if (bool != true) method3270((byte) -116);
    }

    static final void method3270(byte i) {
        if (i <= 106) method3266(null, -91, null);
        for (MenuEntry class348_sub42_sub12 = ((MenuEntry) DefinitionSub4.menuEntries.first(4)); class348_sub42_sub12 != null; class348_sub42_sub12 = (MenuEntry) DefinitionSub4.menuEntries.next((byte) 115)) {
            if (Component66.isInterfaceItemOpcode(69, class348_sub42_sub12.opcode)) DisplayModeManagerContainer89.method202(6, class348_sub42_sub12);
        }
        anInt9680++;
    }

    HashNodeSub17(int i) {
        anInt9669 = i;
    }

    final boolean method3271(int i, int i_9_) {
        anInt9670++;
        if (i_9_ != 14) method3269(false);
        return (this.aClass4Array9673[i].aBoolean139);
    }

    final boolean method3272(int i, int i_10_) {
        anInt9677++;
        if (i_10_ != 0) return true;
        return (this.aClass4Array9673[i].aBoolean131);
    }
}
