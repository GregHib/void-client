/* HashNodeSub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class HashNodeSub1
/**
 * RENAMED from `Class348_Sub42_Sub1` (JODE-obfuscated).
 * Evidence: subclass of HashNode (hierarchy)
 */ extends HashNode {
    static int anInt9488;
    static int anInt9489;
    static int anInt9490;
    static float[] aFloatArray9491;
    static int anInt9492 = 0;
    static int anInt9493;
    private LruCache aClass356_9494;
    static boolean[][] aBooleanArrayArray9495;
    static int anInt9496;
    static int anInt9497;

    public static void method3165(byte i) {
        if (i > 39) {
            aFloatArray9491 = null;
            aBooleanArrayArray9495 = null;
        }
    }

    final int method3166(int i, int i_0_, byte i_1_) {
        anInt9490++;
        if (aClass356_9494 == null) return i_0_;
        NodeSub35 class348_sub35 = (NodeSub35) aClass356_9494.get(i, -6008);
        if (i_1_ < 91) return 72;
        if (class348_sub35 == null) return i_0_;
        return class348_sub35.intValue;
    }

    private final void method3167(int i, Buffer class348_sub49, byte i_2_) {
        if (i_2_ == -86) {
            anInt9489++;
            if (i == 249) {
                int i_3_ = class348_sub49.readUnsignedByte(255);
                if (aClass356_9494 == null) {
                    int i_4_ = Component373.nextPowerOfTwo(i_3_, (byte) 108);
                    aClass356_9494 = new LruCache(i_4_);
                }
                for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
                    boolean bool = class348_sub49.readUnsignedByte(i_2_ + 341) == 1;
                    int i_6_ = class348_sub49.readMedium(-1);
                    Node class348;
                    if (bool) class348 = new NodeSub50(class348_sub49.readString((byte) -39));
                    else class348 = new NodeSub35(class348_sub49.readInt((byte) -126));
                    aClass356_9494.put((byte) 29, i_6_, class348);
                }
            }
        }
    }

    final void method3168(Buffer class348_sub49, byte i) {
        for (; ; ) {
            int i_7_ = class348_sub49.readUnsignedByte(255);
            if (i_7_ == 0) break;
            method3167(i_7_, class348_sub49, (byte) -86);
        }
        anInt9497++;
        if (i >= -59) method3169(-56, -67);
    }

    public HashNodeSub1() {
        /* empty */
    }

    static final boolean method3169(int i, int i_8_) {
        if (i_8_ != 0) return true;
        anInt9496++;
        for (MenuEntry class348_sub42_sub12 = ((MenuEntry) DefinitionSub4.menuEntries.first(4)); class348_sub42_sub12 != null; class348_sub42_sub12 = (MenuEntry) DefinitionSub4.menuEntries.next((byte) 99)) {
            if (WaterShaderSub8.method3549(class348_sub42_sub12.opcode, (byte) -28) && (long) i == (class348_sub42_sub12.identifier)) return true;
        }
        return false;
    }

    final String method3170(int i, String string, int i_9_) {
        anInt9493++;
        if (aClass356_9494 == null) return string;
        if (i != -250) method3165((byte) 0);
        NodeSub50 class348_sub50 = (NodeSub50) aClass356_9494.get(i_9_, -6008);
        if (class348_sub50 == null) return string;
        return class348_sub50.stringValue;
    }

    static {
        aFloatArray9491 = new float[4];
        aBooleanArrayArray9495 = new boolean[][]{new boolean[13], {false, false, true, true, true, true, true, false, false, false, false, false, true}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {false, true, true, true, true, true, false, false, false, false, false, false, true}, {false, true, true, true, true, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, false, true, true, true, true, true, true, false, false, true, true, false}, {true, true, true, true, true, true, true, true, true, true, true, true, true}, new boolean[13], {true, true, true, true, true, true, true, true, true, true, true, true, true}};
    }
}
