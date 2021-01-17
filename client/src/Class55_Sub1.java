/* Class55_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

final class Class55_Sub1 extends Class55 {
    static boolean aBoolean5265 = false;
    static int anInt5266;
    private final Class45 aClass45_5267;
    static int anInt5268;
    private int[] anIntArray5269;
    private int anInt5270;
    static Class364 aClass364_5271 = new Class364("LIVE", 0);
    private final int anInt5272;
    static int anInt5273;
    private final Class348_Sub49 aClass348_Sub49_5274;
    private byte[][] aByteArrayArray5275 = new byte[10][];
    private final Class348_Sub49 aClass348_Sub49_5276;

    final void method522(byte i) {
        anInt5266++;
        if (anIntArray5269 != null && i < -27) {
            for (int i_0_ = 0; i_0_ < 10 && anIntArray5269.length > anInt5270 + i_0_; i_0_++) {
                if (aByteArrayArray5275[i_0_] == null && aClass45_5267.method420(-10499, (anIntArray5269[i_0_ + anInt5270]), 0)) aByteArrayArray5275[i_0_] = aClass45_5267.method410(-1860, (anIntArray5269[anInt5270 + i_0_]), 0);
            }
        }
    }

    public static void method523(int i) {
        if (i <= 80) method524(-87, true, 104, 0);
        aClass364_5271 = null;
    }

    private Class55_Sub1(int i, Class45 class45, int i_1_) {
        super(i);
        aClass348_Sub49_5274 = new Class348_Sub49(null);
        aClass348_Sub49_5276 = new Class348_Sub49(null);
        aClass45_5267 = class45;
        anInt5272 = i_1_;
    }

    static final void method524(int i, boolean bool, int i_2_, int i_3_) {
        if (i_3_ > -108) aBoolean5265 = false;
        if (Class27.aClass356_389.method3480(i_2_, -6008) == null) {
            if (Class38.aBoolean510) {
                Class348_Sub15 class348_sub15 = new Class348_Sub15(i_2_, new Class55_Sub1(4096, (Class146.aClass45_2015), i_2_), i, bool);
                class348_sub15.aClass55_Sub1_6768.method509(-92, Class59_Sub2.aStringArray5305[Class348_Sub33.anInt6967]);
                Class27.aClass356_389.method3483((byte) 35, i_2_, class348_sub15);
            } else Class303.method2285(bool, (byte) -90, i_2_);
        }
        anInt5268++;
    }

    final int method516(byte i, byte[] is) throws IOException {
        anInt5273++;
        if (anIntArray5269 == null) {
            if (!aClass45_5267.method420(-10499, anInt5272, 0)) return 0;
            byte[] is_4_ = aClass45_5267.method410(-1860, anInt5272, 0);
            if (is_4_ == null) throw new IllegalStateException("");
            aClass348_Sub49_5276.aByteArray7154 = is_4_;
            aClass348_Sub49_5276.anInt7197 = 0;
            int i_5_ = is_4_.length >> 994128513;
            anIntArray5269 = new int[i_5_];
            for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
                anIntArray5269[i_6_] = aClass348_Sub49_5276.readShort(842397944);
        }
        if (anInt5270 >= anIntArray5269.length) return -1;
        method522((byte) -74);
        if (i != 21) aByteArrayArray5275 = null;
        aClass348_Sub49_5276.aByteArray7154 = is;
        aClass348_Sub49_5276.anInt7197 = 0;
        while (aClass348_Sub49_5276.anInt7197 < aClass348_Sub49_5276.aByteArray7154.length) {
            if (aClass348_Sub49_5274.aByteArray7154 == null) {
                if (aByteArrayArray5275[0] == null) {
                    aClass348_Sub49_5276.aByteArray7154 = null;
                    return aClass348_Sub49_5276.anInt7197;
                }
                aClass348_Sub49_5274.aByteArray7154 = aByteArrayArray5275[0];
            }
            int i_7_ = (-aClass348_Sub49_5276.anInt7197 + (aClass348_Sub49_5276.aByteArray7154).length);
            int i_8_ = (-aClass348_Sub49_5274.anInt7197 + (aClass348_Sub49_5274.aByteArray7154).length);
            if (i_8_ <= i_7_) {
                aClass348_Sub49_5276.method3380(i_8_, aClass348_Sub49_5274.anInt7197, aClass348_Sub49_5274.aByteArray7154, -58);
                aClass348_Sub49_5274.anInt7197 = 0;
                aClass348_Sub49_5274.aByteArray7154 = null;
                anInt5270++;
                for (int i_9_ = 0; i_9_ < 9; i_9_++)
                    aByteArrayArray5275[i_9_] = aByteArrayArray5275[i_9_ - -1];
                aByteArrayArray5275[9] = null;
                if (anInt5270 >= anIntArray5269.length) {
                    aClass348_Sub49_5276.aByteArray7154 = null;
                    return aClass348_Sub49_5276.anInt7197;
                }
            } else {
                aClass348_Sub49_5274.method3389(2147483647, aClass348_Sub49_5276.anInt7197, i_7_, aClass348_Sub49_5276.aByteArray7154);
                aClass348_Sub49_5276.aByteArray7154 = null;
                return is.length;
            }
        }
        aClass348_Sub49_5276.aByteArray7154 = null;
        return is.length;
    }
}
