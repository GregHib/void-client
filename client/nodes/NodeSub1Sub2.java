/* NodeSub1Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NodeSub1Sub2
/**
 * RENAMED from `Class348_Sub1_Sub2` (JODE-obfuscated).
 * Evidence: subclass of NodeSub1 (hierarchy)
 */ extends NodeSub1 {
    static NodeList aClass262_8810 = new NodeList();
    static int anInt8811;
    static int anInt8812;
    static int anInt8813;
    static int anInt8814;
    static Component17 aClass308_8815 = new Component17(16);
    static byte[][] aByteArrayArray8816;
    static Component183 aClass114_8817 = new Component183(83, 2);

    final void method2725(int i, byte i_0_, int i_1_, int i_2_) {
        this.anInt6553 = i_1_;
        this.anInt6548 = i_2_;
        anInt8812++;
        if (i_0_ == 70) this.anInt6562 = i;
    }

    static final int method2729(int i, int i_3_) {
        anInt8813++;
        if (i_3_ != 16) return 23;
        return 0xff & i;
    }

    /** 64-byte Whirlpool digest of {@code is[i_4_ .. i_4_+i_5_)}. */
    static final byte[] whirlpoolDigest(int i, int i_4_, byte[] is, int i_5_) {
        if (i != 4567) whirlpoolDigest(-48, 112, null, -45);
        anInt8811++;
        byte[] is_6_;
        if (i_4_ > 0) {
            is_6_ = new byte[i_5_];
            for (int i_7_ = 0; i_5_ > i_7_; i_7_++)
                is_6_[i_7_] = is[i_4_ + i_7_];
        } else is_6_ = is;
        LogicError class85 = new LogicError();
        class85.reset(i + -4682);
        class85.update(i_5_ * 8, is_6_, -69);
        byte[] is_8_ = new byte[64];
        class85.digest(true, 0, is_8_);
        return is_8_;
    }

    NodeSub1Sub2(int i, int i_9_, int i_10_, int i_11_, int i_12_, float f) {
        super(i, i_9_, i_10_, i_11_, i_12_, f);
    }

    public static void method2731(byte i) {
        aByteArrayArray8816 = null;
        if (i != -23) whirlpoolDigest(14, 86, null, -106);
        aClass262_8810 = null;
        aClass308_8815 = null;
        aClass114_8817 = null;
    }

    final void method2716(int i, float f) {
        this.aFloat6550 = f;
        if (i == -1) anInt8814++;
    }
}
