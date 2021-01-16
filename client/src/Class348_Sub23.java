/* Class348_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

abstract class Class348_Sub23 extends Class348 {
    static int anInt6863;
    static int anInt6864;
    static float[] aFloatArray6865 = new float[16384];
    static int anInt6866;
    static float[] aFloatArray6867 = new float[16384];
    int anInt6868;
    OggStreamState anOggStreamState6869;
    static int anInt6870;

    static final int method2960(boolean bool, int i) {
        if (i >= -16)
            aFloatArray6865 = null;
        anInt6870++;
        int i_0_ = Class348_Sub49.anInt7207;
        while_128_:
        do {
            do {
                if ((i_0_ ^ 0xffffffff) != -1) {
                    if (i_0_ != 1) {
                        if (i_0_ == 2)
                            break;
                        break while_128_;
                    }
                } else {
                    if (bool)
                        return 0;
                    return Class348_Sub40_Sub8.anInt9157;
                }
                return Class348_Sub40_Sub8.anInt9157;
            } while (false);
            return 0;
        } while (false);
        return 0;
    }

    abstract void method2961(byte i);

    public static void method2962(int i) {
        aFloatArray6865 = null;
        aFloatArray6867 = null;
        if (i != -31055)
            method2966(-119, -98, true);
    }

    final void method2963(OggPacket oggpacket, int i) {
        method2964((byte) -120, oggpacket);
        if (i != 16384)
            aFloatArray6867 = null;
        anInt6863++;
        ((Class348_Sub23) this).anInt6868++;
    }

    abstract void method2964(byte i, OggPacket oggpacket);

    static final void method2965(String string, int i, boolean bool,
                                 int i_1_) {
        anInt6866++;
        Class187.method1406(true);
        if ((i ^ 0xffffffff) == -1) {
            Class348_Sub8.aHa6654
                    = Class104.method958(true, 0, Class348_Sub40_Sub4.aD9113,
                    ((Class348_Sub51)
                            Class316.aClass348_Sub51_3959)
                            .aClass239_Sub20_7248
                            .method1808(-32350) * 2,
                    Class305.aCanvas3869,
                    Class136.aClass45_4796);
            if (string != null) {
                Class348_Sub8.aHa6654.GA(0);
                Class143 class143
                        = Class239_Sub23.method1819(Class17.anInt235, 0, -117,
                        Class104.aClass45_1627);
                Class324 class324 = (Class348_Sub8.aHa6654.method3686
                        (class143,
                                Class207.method1519(Class21.aClass45_322,
                                        Class17.anInt235, 0),
                                true));
                Class140.method1170((byte) -89);
                Class362.method3511(true, class324, class143, string, 2,
                        Class348_Sub8.aHa6654);
            }
        } else {
            ha var_ha = null;
            if (string != null) {
                var_ha
                        = Class104.method958(true, 0, Class348_Sub40_Sub4.aD9113,
                        0, Class305.aCanvas3869,
                        Class136.aClass45_4796);
                var_ha.GA(0);
                Class143 class143
                        = Class239_Sub23.method1819(Class17.anInt235, 0, -115,
                        Class104.aClass45_1627);
                Class324 class324
                        = var_ha.method3686(class143,
                        Class207.method1519((Class21
                                        .aClass45_322),
                                Class17.anInt235,
                                0),
                        true);
                Class140.method1170((byte) -107);
                Class362.method3511(true, class324, class143, string, i_1_ + 2,
                        var_ha);
            }
            try {
                Class348_Sub8.aHa6654
                        = Class104.method958(true, i, Class348_Sub40_Sub4.aD9113,
                        2 * ((Class348_Sub51)
                                Class316.aClass348_Sub51_3959)
                                .aClass239_Sub20_7248
                                .method1808(i_1_ + -32350),
                        Class305.aCanvas3869,
                        Class136.aClass45_4796);
                if (string != null) {
                    var_ha.GA(0);
                    Class143 class143
                            = Class239_Sub23.method1819(Class17.anInt235, 0, -51,
                            Class104.aClass45_1627);
                    Class324 class324
                            = (var_ha.method3686
                            (class143,
                                    Class207.method1519(Class21.aClass45_322,
                                            Class17.anInt235, 0),
                                    true));
                    Class140.method1170((byte) -26);
                    Class362.method3511(true, class324, class143, string,
                            i_1_ + 2, var_ha);
                }
                if (Class348_Sub8.aHa6654.method3693()) {
                    boolean bool_2_ = true;
                    try {
                        bool_2_ = (((Class348_Sub4)
                                Class348_Sub40_Sub20.aClass348_Sub4_9264)
                                .anInt6609) > 256;
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                    za var_za;
                    if (!bool_2_)
                        var_za = Class348_Sub8.aHa6654.method3702(104857600);
                    else
                        var_za = Class348_Sub8.aHa6654.method3702(146800640);
                    Class348_Sub8.aHa6654.method3651(var_za);
                }
            } catch (Throwable throwable) {
                int i_3_ = ((Class348_Sub51) Class316.aClass348_Sub51_3959)
                        .aClass239_Sub25_7271.method1829(-32350);
                if ((i_3_ ^ 0xffffffff) == -3)
                    Class139.aBoolean1952 = true;
                Class316.aClass348_Sub51_3959.method3429
                        ((byte) 74,
                                (((Class348_Sub51) Class316.aClass348_Sub51_3959)
                                        .aClass239_Sub25_7271),
                                0);
                method2965(string, i_3_, bool, i_1_);
                return;
            } finally {
                if (var_ha != null) {
                    try {
                        var_ha.method3635((byte) -111);
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                }
            }
        }
        ((Class348_Sub51) Class316.aClass348_Sub51_3959)
                .aClass239_Sub25_7271.method1826(!bool, -142238264);
        Class316.aClass348_Sub51_3959.method3429((byte) 74,
                (((Class348_Sub51)
                        (Class316
                                .aClass348_Sub51_3959))
                        .aClass239_Sub25_7271),
                i);
        Class348_Sub49.method3354(i_1_ + -78);
        Class348_Sub8.aHa6654.method3650(10000);
        Class348_Sub8.aHa6654.X(32);
        Class157.aClass101_2123 = Class348_Sub8.aHa6654.method3654();
        Class50_Sub1.aClass101_5209 = Class348_Sub8.aHa6654.method3654();
        Class290.method2196((byte) -9);
        Class348_Sub8.aHa6654.method3630(((Class348_Sub51)
                Class316.aClass348_Sub51_3959)
                .aClass239_Sub2_7228
                .method1726(-32350) == 1);
        if (Class348_Sub8.aHa6654.method3627())
            Class348_Sub40_Sub33.method3137(((Class348_Sub51)
                            Class316.aClass348_Sub51_3959)
                            .aClass239_Sub12_7243
                            .method1771(-32350) == 1,
                    (byte) -24);
        Class97.method873(Class367_Sub4.anInt7319 >> 411141731, 21719,
                Class348_Sub8.aHa6654,
                Class348_Sub40_Sub3.anInt9109 >> -900745565);
        Class76.method773(true);
        r.aBoolean9719 = false;
        Class228.aClass57Array2974 = null;
        RuntimeException_Sub1.aBoolean4604 = true;
        Class348_Sub42_Sub3.method3179(i_1_);
    }

    Class348_Sub23(OggStreamState oggstreamstate) {
        ((Class348_Sub23) this).anOggStreamState6869 = oggstreamstate;
    }

    static final void method2966(int i, int i_4_, boolean bool) {
        anInt6864++;
        Class348_Sub42_Sub15 class348_sub42_sub15
                = Class318_Sub9_Sub1.method2516(i, (byte) 105, 14);
        if (bool != false)
            aFloatArray6865 = null;
        class348_sub42_sub15.method3246(-25490);
        ((Class348_Sub42_Sub15) class348_sub42_sub15).anInt9652 = i_4_;
    }

    static {
        double d = 3.834951969714103E-4;
        for (int i = 0; (i ^ 0xffffffff) > -16385; i++) {
            aFloatArray6865[i] = (float) Math.sin(d * (double) i);
            aFloatArray6867[i] = (float) Math.cos((double) i * d);
        }
    }
}
