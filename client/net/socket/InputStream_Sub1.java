/* InputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.InputStream;

final class InputStream_Sub1 extends InputStream {
    static int anInt71;
    static int anInt72;
    static int anInt73;
    static int anInt74;
    static long[][] aLongArrayArray75;
    static long[] aLongArray76 = new long[11];
    static StringCache aClass351_77;
    static int anInt78;
    static Component183 aClass114_79;

    public static void method124(int i) {
        aLongArrayArray75 = null;
        if (i == 2) {
            aClass351_77 = null;
            aLongArray76 = null;
            aClass114_79 = null;
        }
    }

    static final boolean method125(int i, int i_0_, int i_1_, Component269 class318_sub1_sub4, byte i_2_) {
        anInt72++;
        if (!DefinitionSub23.aBoolean9307 || !Component234.aBoolean351) return false;
        if (Component241.occludedPixelCount < 100) return false;
        if (!ShaderSub2.method164(i_1_, i_0_, (byte) -97, i)) return false;
        int i_3_ = i_0_ << Component149.anInt4459;
        int i_4_ = i << Component149.anInt4459;
        if (i_2_ != 120) return false;
        int i_5_ = -1 + ShaderSub1.aSArray5191[i_1_].getHeight((byte) -86, i, i_0_);
        int i_6_ = i_5_ + class318_sub1_sub4.method2394(true);
        if (class318_sub1_sub4.aShort8759 == 1) {
            if (!ShaderProgramSub7.method2169(i_3_, i_3_, i_4_, i_3_, Component148.anInt3465 + i_4_, i_6_, i_6_, i_5_, i_4_, false)) return false;
            if (!ShaderProgramSub7.method2169(i_3_, i_3_, i_4_, i_3_, Component148.anInt3465 + i_4_, i_5_, i_6_, i_5_, i_4_ + Component148.anInt3465, false)) return false;
            Component274.occludedWallCount++;
            return true;
        }
        if (class318_sub1_sub4.aShort8759 == 2) {
            if (!ShaderProgramSub7.method2169(i_3_, i_3_ - -Component148.anInt3465, i_4_ - -Component148.anInt3465, i_3_, Component148.anInt3465 + i_4_, i_6_, i_6_, i_5_, i_4_ - -Component148.anInt3465, false)) return false;
            if (!ShaderProgramSub7.method2169(i_3_, Component148.anInt3465 + i_3_, i_4_ + Component148.anInt3465, Component148.anInt3465 + i_3_, Component148.anInt3465 + i_4_, i_6_, i_5_, i_5_, i_4_ - -Component148.anInt3465, false)) return false;
            Component274.occludedWallCount++;
            return true;
        }
        if (class318_sub1_sub4.aShort8759 == 4) {
            if (!ShaderProgramSub7.method2169(i_3_ + Component148.anInt3465, Component148.anInt3465 + i_3_, i_4_, Component148.anInt3465 + i_3_, i_4_ - -Component148.anInt3465, i_6_, i_6_, i_5_, i_4_, false)) return false;
            if (!ShaderProgramSub7.method2169(i_3_ + Component148.anInt3465, i_3_ - -Component148.anInt3465, i_4_, Component148.anInt3465 + i_3_, i_4_ - -Component148.anInt3465, i_5_, i_6_, i_5_, Component148.anInt3465 + i_4_, false)) return false;
            Component274.occludedWallCount++;
            return true;
        }
        if (class318_sub1_sub4.aShort8759 == 8) {
            if (!ShaderProgramSub7.method2169(i_3_, Component148.anInt3465 + i_3_, i_4_, i_3_, i_4_, i_6_, i_6_, i_5_, i_4_, false)) return false;
            if (!ShaderProgramSub7.method2169(i_3_, i_3_ + Component148.anInt3465, i_4_, Component148.anInt3465 + i_3_, i_4_, i_6_, i_5_, i_5_, i_4_, false)) return false;
            Component274.occludedWallCount++;
            return true;
        }
        if (class318_sub1_sub4.aShort8759 == 16) {
            if (!Component221.method1084(i_6_, DisplayModeManagerContainer64.anInt9037, DisplayModeManagerContainer64.anInt9037 + i_4_, i_3_, i_5_, DisplayModeManagerContainer64.anInt9037, 18507)) return false;
            Component274.occludedWallCount++;
            return true;
        }
        if (class318_sub1_sub4.aShort8759 == 32) {
            if (!Component221.method1084(i_6_, DisplayModeManagerContainer64.anInt9037, DisplayModeManagerContainer64.anInt9037 + i_4_, i_3_ + DisplayModeManagerContainer64.anInt9037, i_5_, DisplayModeManagerContainer64.anInt9037, 18507)) return false;
            Component274.occludedWallCount++;
            return true;
        }
        if (class318_sub1_sub4.aShort8759 == 64) {
            if (!Component221.method1084(i_6_, DisplayModeManagerContainer64.anInt9037, i_4_, DisplayModeManagerContainer64.anInt9037 + i_3_, i_5_, DisplayModeManagerContainer64.anInt9037, 18507)) return false;
            Component274.occludedWallCount++;
            return true;
        }
        if (class318_sub1_sub4.aShort8759 == 128) {
            if (!Component221.method1084(i_6_, DisplayModeManagerContainer64.anInt9037, i_4_, i_3_, i_5_, DisplayModeManagerContainer64.anInt9037, 18507)) return false;
            Component274.occludedWallCount++;
            return true;
        }
        return true;
    }

    public final int read() {
        anInt74++;
        SpriteAtlasShader.sleep((byte) 31, 30000L);
        return -1;
    }

    static final void method126(int i) {
        DisplayModeManagerContainer58.method2433();
        anInt73++;
        for (int i_7_ = 0; i_7_ < 4; i_7_++)
            NodeSub45.aClass361Array7108[i_7_].method3500(700);
        if (i != -16203) method125(125, -95, 109, null, (byte) -52);
        Component308.method464(-1);
        NodeSub18.method2938((byte) 98);
        Component205.method1772(28);
        System.gc();
        NodeSub8.toolkit.NativeHandle();
    }

    static {
        aLongArrayArray75 = new long[8][256];
        for (int i = 0; i < 256; i++) {
            int i_8_ = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886".charAt(i / 2);
            long l = (i & 0x1) == 0 ? i_8_ >>> 8 : 0xff & i_8_;
            long l_9_ = l << 1;
            if (l_9_ >= 256) l_9_ ^= 0x11dL;
            long l_10_ = l_9_ << 1;
            if (l_10_ >= 256L) l_10_ ^= 0x11dL;
            long l_11_ = l ^ l_10_;
            long l_12_ = l_10_ << 1;
            if (l_12_ >= 256L) l_12_ ^= 0x11dL;
            long l_13_ = l_12_ ^ l;
            aLongArrayArray75[0][i] = (Component11.method2068(l_13_, (Component11.method2068(l_9_ << 8, (Component11.method2068(l_11_ << 16, (Component11.method2068(l_12_ << 24, (Component11.method2068(l << 32, (Component11.method2068(Component11.method2068(l << 56, l << 48), l_10_ << 40))))))))))));
            for (int i_14_ = 1; i_14_ < 8; i_14_++)
                aLongArrayArray75[i_14_][i] = Component11.method2068((aLongArrayArray75[i_14_ + -1][i] >>> 8), (aLongArrayArray75[i_14_ - 1][i] << 56));
        }
        aLongArray76[0] = 0L;
        for (int i = 1; i <= 10; i++) {
            int i_15_ = -8 + i * 8;
            aLongArray76[i] = (SpriteSub2.method993((SpriteSub2.method993(NodeSub8.method2777(aLongArrayArray75[6][6 + i_15_], 65280L), (SpriteSub2.method993(NodeSub8.method2777((aLongArrayArray75[5][5 + i_15_]), 16711680L), (SpriteSub2.method993((SpriteSub2.method993((SpriteSub2.method993(NodeSub8.method2777((aLongArrayArray75[2][i_15_ + 2]), 280375465082880L), (SpriteSub2.method993(NodeSub8.method2777(71776119061217280L, (aLongArrayArray75[1][1 + i_15_])), (NodeSub8.method2777(aLongArrayArray75[0][i_15_], -72057594037927936L)))))), NodeSub8.method2777(1095216660480L, (aLongArrayArray75[3][3 + i_15_])))), NodeSub8.method2777((aLongArrayArray75[4][i_15_ - -4]), 4278190080L))))))), NodeSub8.method2777(aLongArrayArray75[7][7 + i_15_], 255L)));
        }
        aClass351_77 = new StringCache(8, 1);
        anInt78 = 0;
        aClass114_79 = new Component183(75, 6);
    }
}
