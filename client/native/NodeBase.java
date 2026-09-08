/* NodeBase - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class NodeBase
/**
 * RENAMED from `NodeBase` (JODE-obfuscated).
 * Evidence: abstract; extends Node
 */ extends Node {
    static Component161 aClass138_7274 = new Component161(10, 2, 2, 0);
    static int anInt7275;
    static int anInt7276 = 0;

    static final void method3437(int i, int i_0_) {
        r var_r = null;
        for (int i_1_ = i; i_1_ < i_0_; i_1_++) {
            s var_s = NodeSub1Sub1.aSArray8801[i_1_];
            if (var_s != null) {
                for (int i_2_ = 0; i_2_ < NodeSub41.anInt7054; i_2_++) {
                    for (int i_3_ = 0; i_3_ < StaticElementRenderer.anInt6451; i_3_++) {
                        var_r = var_s.fa(i_3_, i_2_, var_r);
                        if (var_r != null) {
                            int i_4_ = i_3_ << Component149.anInt4459;
                            int i_5_ = i_2_ << Component149.anInt4459;
                            for (int i_6_ = i_1_ - 1; i_6_ >= 0; i_6_--) {
                                s var_s_7_ = NodeSub1Sub1.aSArray8801[i_6_];
                                if (var_s_7_ != null) {
                                    int i_8_ = (var_s.getHeight((byte) -86, i_2_, i_3_) - var_s_7_.getHeight((byte) -86, i_2_, i_3_));
                                    int i_9_ = (var_s.getHeight((byte) -86, i_2_, i_3_ + 1) - var_s_7_.getHeight((byte) -86, i_2_, i_3_ + 1));
                                    int i_10_ = (var_s.getHeight((byte) -86, i_2_ + 1, i_3_ + 1) - var_s_7_.getHeight((byte) -86, i_2_ + 1, i_3_ + 1));
                                    int i_11_ = (var_s.getHeight((byte) -86, i_2_ + 1, i_3_) - var_s_7_.getHeight((byte) -86, i_2_ + 1, i_3_));
                                    var_s_7_.CA(var_r, i_4_, ((i_8_ + i_9_ + i_10_ + i_11_) / 4), i_5_, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void method3438(byte i) {
        if (i > 39) aClass138_7274 = null;
    }

    public NodeBase() {
        /* empty */
    }
}
