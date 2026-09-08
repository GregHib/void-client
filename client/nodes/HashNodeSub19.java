/* HashNodeSub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class HashNodeSub19
/**
 * RENAMED from `Class348_Sub42_Sub19` (JODE-obfuscated).
 * Evidence: subclass of HashNode (hierarchy)
 */ extends HashNode {
    static StringCache aClass351_9687 = new StringCache(14, -1);
    int anInt9688;
    int anInt9689;
    String aString9690;
    Component224 aClass273_9691;
    String[] aStringArray9692;
    LruCache[] aClass356Array9693;
    int[] anIntArray9694;
    int anInt9695;
    int[] anIntArray9696;
    int anInt9697;
    static int anInt9698;
    static int anInt9699 = 0;
    static Component103[] aClass338Array9700;
    static int anInt9701;

    static final void method3276(DisplayModeManagerContainer159 class211) {
        if (Component374.anInt4135 < 65535) {
            NodeSub1 class348_sub1 = class211.aClass348_Sub1_2745;
            Component329.aClass211Array5993[Component374.anInt4135] = class211;
            r.aBooleanArray9718[Component374.anInt4135] = false;
            Component374.anInt4135++;
            int i = class211.anInt2731;
            if (class211.aBoolean2749) i = 0;
            int i_0_ = class211.anInt2731;
            if (class211.aBoolean2737) i_0_ = Component291.anInt2524 - 1;
            for (int i_1_ = i; i_1_ <= i_0_; i_1_++) {
                int i_2_ = 0;
                int i_3_ = ((class348_sub1.method2717((byte) 89) - class348_sub1.method2723(-1) + DisplayModeManagerContainer64.anInt9037) >> Component149.anInt4459);
                if (i_3_ < 0) {
                    i_2_ -= i_3_;
                    i_3_ = 0;
                }
                int i_4_ = ((class348_sub1.method2717((byte) 122) + class348_sub1.method2723(-1) - DisplayModeManagerContainer64.anInt9037) >> Component149.anInt4459);
                if (i_4_ >= NodeSub41.anInt7054) i_4_ = NodeSub41.anInt7054 - 1;
                for (int i_5_ = i_3_; i_5_ <= i_4_; i_5_++) {
                    int i_6_ = class211.aShortArray2742[i_2_++];
                    int i_7_ = (((class348_sub1.method2724(-1) - class348_sub1.method2723(-1) + DisplayModeManagerContainer64.anInt9037) >> Component149.anInt4459) + (i_6_ >>> 8));
                    int i_8_ = i_7_ + (i_6_ & 0xff) - 1;
                    if (i_7_ < 0) i_7_ = 0;
                    if (i_8_ >= StaticElementRenderer.anInt6451) i_8_ = StaticElementRenderer.anInt6451 - 1;
                    for (int i_9_ = i_7_; i_9_ <= i_8_; i_9_++) {
                        long l = (PacketReader.aLongArrayArrayArray10431[i_1_][i_9_][i_5_]);
                        if ((l & 0xffffL) == 0L) PacketReader.aLongArrayArrayArray10431[i_1_][i_9_][i_5_] = l | (long) Component374.anInt4135;
                        else if ((l & 0xffff0000L) == 0L) PacketReader.aLongArrayArrayArray10431[i_1_][i_9_][i_5_] = l | (long) Component374.anInt4135 << 16;
                        else if ((l & 0xffff00000000L) == 0L) PacketReader.aLongArrayArrayArray10431[i_1_][i_9_][i_5_] = l | (long) Component374.anInt4135 << 32;
                        else if ((l & ~0xffffffffffffL) == 0L) PacketReader.aLongArrayArrayArray10431[i_1_][i_9_][i_5_] = l | (long) Component374.anInt4135 << 48;
                    }
                }
            }
        }
    }

    static final void method3277(byte i) {
        anInt9698++;
        if (i != -48) method3276(null);
        if (Component359.aClass348_Sub42_Sub13_3152 != null) {
            Component359.aClass348_Sub42_Sub13_3152 = null;
            Component354.method226(DisplayModeManagerContainer368.anInt5252, NodeSub1Sub1.anInt8806, MouseHandler.menuOriginY, 0, DisplayModeManagerContainer249.anInt4669);
        }
    }

    public static void method3278(int i) {
        aClass351_9687 = null;
        if (i != 1) anInt9699 = -66;
        aClass338Array9700 = null;
    }

    public HashNodeSub19() {
        /* empty */
    }
}
