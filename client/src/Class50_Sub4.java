/* Class50_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class50_Sub4 extends Class50 {
    private final int anInt5255;
    static int anInt5256;
    static int anInt5257;
    private final int anInt5258;
    private final int anInt5259;
    static int anInt5260;
    static int anInt5261;
    static Class47 aClass47_5262;
    static int anInt5263;
    private int anInt5264;

    final void method455(int i, int i_0_, int i_1_) {
        anInt5256++;
        if (i_1_ >= -98)
            method472(-91, null);
    }

    final void method457(int i, int i_2_, int i_3_) {
        anInt5261++;
        int i_4_ = i_2_ * anInt5255 >> -1124871060;
        if (i_3_ >= -29)
            anInt5264 = 119;
        int i_5_ = i_2_ * anInt5264 >> -152215924;
        int i_6_ = anInt5259 * i >> 748459148;
        int i_7_ = anInt5258 * i >> 1457878060;
        Class339.method2665(i_4_, (byte) 118, this.anInt865, i_6_,
                i_7_, i_5_);
    }

    public static void method471(int i) {
        if (i == -30065)
            aClass47_5262 = null;
    }

    final void method456(int i, int i_8_, int i_9_) {
        if (i < 87)
            anInt5264 = 33;
        anInt5260++;
    }

    Class50_Sub4(int i, int i_10_, int i_11_, int i_12_, int i_13_,
                 int i_14_) {
        super(-1, i_13_, i_14_);
        anInt5258 = i_12_;
        anInt5264 = i_11_;
        anInt5255 = i;
        anInt5259 = i_10_;
    }

    static final Class158 method472(int i, Class348_Sub49 class348_sub49) {
        anInt5263++;
        String string = class348_sub49.method3377((byte) 90);
        Class221 class221
                = Class158.method1248(127)[class348_sub49.method3387(i ^ ~0x6c6e)];
        if (i != -27794)
            return null;
        Class341 class341
                = Class62.method596(i + 47794)[class348_sub49.method3387(255)];
        int i_15_ = class348_sub49.method3372(13638);
        int i_16_ = class348_sub49.method3372(13638);
        int i_17_ = class348_sub49.method3387(255);
        int i_18_ = class348_sub49.method3387(255);
        int i_19_ = class348_sub49.method3387(255);
        int i_20_ = class348_sub49.method3330(i ^ ~0x32359469);
        int i_21_ = class348_sub49.method3330(842397944);
        int i_22_ = class348_sub49.method3385((byte) -126);
        int i_23_ = class348_sub49.method3385((byte) -126);
        int i_24_ = class348_sub49.method3385((byte) -126);
        return new Class158(string, class221, class341, i_15_, i_16_, i_17_,
                i_18_, i_19_, i_20_, i_21_, i_22_, i_23_, i_24_);
    }

    static final int method473(byte i, int i_25_, Class110_Sub1 class110_sub1,
                               int i_26_, boolean bool, boolean bool_27_,
                               Class110_Sub1 class110_sub1_28_) {
        try {
            anInt5257++;
            int i_29_
                    = Class239_Sub8.method1749(class110_sub1_28_, class110_sub1,
                    bool, i_25_, (byte) -30);
            if (i_29_ != 0) {
                if (!bool)
                    return i_29_;
                return -i_29_;
            }
            if (i_26_ == -1)
                return 0;
            if (i >= -42)
                return -65;
            int i_30_
                    = Class239_Sub8.method1749(class110_sub1_28_, class110_sub1,
                    bool_27_, i_26_, (byte) -30);
            if (bool_27_)
                return -i_30_;
            return i_30_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("o.B(" + i + ',' + i_25_ + ','
                            + (class110_sub1 != null ? "{...}"
                            : "null")
                            + ',' + i_26_ + ',' + bool + ','
                            + bool_27_ + ','
                            + (class110_sub1_28_ != null
                            ? "{...}" : "null")
                            + ')'));
        }
    }
}
