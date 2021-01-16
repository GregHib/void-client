/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class190 {
    int anInt2535;
    float aFloat2536;
    static int anInt2537;
    int anInt2538;
    static Class351 aClass351_2539 = new Class351(26, 7);
    int anInt2540;
    Class299 aClass299_2541;
    float aFloat2542 = 0.25F;
    static int anInt2543;
    float aFloat2544;
    float aFloat2545 = 1.0F;
    int anInt2546;
    float aFloat2547;
    int anInt2548;
    int anInt2549;
    static int anInt2550;
    float aFloat2551 = 1.0F;
    static int[] anIntArray2552;
    static int anInt2553;
    static Rectangle[] aRectangleArray2554 = new Rectangle[100];
    static float aFloat2555;

    static final boolean method1422(int i, int i_0_, int i_1_, int i_2_) {
        anInt2550++;
        Class348_Sub40_Sub4.aClass101_9114
                .method897(i_1_, i, i_0_, Class318_Sub1_Sub5_Sub2.anIntArray10172);
        int i_3_ = Class318_Sub1_Sub5_Sub2.anIntArray10172[2];
        if ((i_3_ ^ 0xffffffff) > -51)
            return false;
        Class318_Sub1_Sub5_Sub2.anIntArray10172[2] = i_3_;
        Class318_Sub1_Sub5_Sub2.anIntArray10172[0]
                = (Class140.anInt1962 * Class318_Sub1_Sub5_Sub2.anIntArray10172[0]
                / i_3_) + Class69.anInt1202;
        Class318_Sub1_Sub5_Sub2.anIntArray10172[1]
                = (Class348_Sub49_Sub2.anInt9759
                + (Class318_Sub1_Sub5_Sub2.anIntArray10172[1]
                * Class285_Sub2.anInt8498 / i_3_));
        if (i_2_ != -7596)
            aRectangleArray2554 = null;
        return true;
    }

    final void method1423(int i, Class348_Sub49 class348_sub49) {
        anInt2553++;
        ((Class190) this).aFloat2545
                = (float) (class348_sub49.method3387(255) * 8) / 255.0F;
        ((Class190) this).aFloat2542
                = (float) (8 * class348_sub49.method3387(i + 247)) / 255.0F;
        ((Class190) this).aFloat2551
                = (float) (i * class348_sub49.method3387(i + 247)) / 255.0F;
    }

    final boolean method1424(Class190 class190_4_, byte i) {
        anInt2543++;
        if (i != 84)
            return false;
        if (((((Class190) class190_4_).anInt2540 ^ 0xffffffff)
                != (((Class190) this).anInt2540 ^ 0xffffffff))
                || (((Class190) this).aFloat2547
                != ((Class190) class190_4_).aFloat2547)
                || (((Class190) class190_4_).aFloat2544
                != ((Class190) this).aFloat2544)
                || (((Class190) this).aFloat2536
                != ((Class190) class190_4_).aFloat2536)
                || (((Class190) class190_4_).aFloat2542
                != ((Class190) this).aFloat2542)
                || (((Class190) class190_4_).aFloat2545
                != ((Class190) this).aFloat2545)
                || (((Class190) class190_4_).aFloat2551
                != ((Class190) this).aFloat2551)
                || ((((Class190) this).anInt2549 ^ 0xffffffff)
                != (((Class190) class190_4_).anInt2549 ^ 0xffffffff))
                || ((((Class190) this).anInt2546 ^ 0xffffffff)
                != (((Class190) class190_4_).anInt2546 ^ 0xffffffff))
                || (((Class190) class190_4_).aClass299_2541
                != ((Class190) this).aClass299_2541))
            return false;
        return true;
    }

    static final boolean method1425(byte i, Class42 class42,
                                    Class348_Sub21 class348_sub21, int i_5_,
                                    ha var_ha, int i_6_) {
        try {
            anInt2537++;
            int i_7_ = 2147483647;
            int i_8_ = -2147483648;
            int i_9_ = 2147483647;
            int i_10_ = -2147483648;
            if (((Class42) class42).anIntArray591 != null) {
                i_8_ = (Class75.anInt1272
                        + ((-Class75.anInt1274
                        + (((Class348_Sub21) class348_sub21).anInt6852
                        + ((Class42) class42).anInt595))
                        * (Class75.anInt1276 - Class75.anInt1272)
                        / (-Class75.anInt1274 + Class75.anInt1265)));
                i_9_ = (-((-Class75.anInt1262 + Class75.anInt1268)
                        * (((Class42) class42).anInt570
                        + (((Class348_Sub21) class348_sub21).anInt6851
                        - Class75.anInt1257))
                        / (Class75.anInt1277 + -Class75.anInt1257))
                        + Class75.anInt1268);
                i_10_ = (-((-Class75.anInt1262 + Class75.anInt1268)
                        * (((Class348_Sub21) class348_sub21).anInt6851
                        + (((Class42) class42).anInt607
                        + -Class75.anInt1257))
                        / (Class75.anInt1277 - Class75.anInt1257))
                        + Class75.anInt1268);
                i_7_ = (((-Class75.anInt1272 + Class75.anInt1276)
                        * (-Class75.anInt1274
                        + ((Class348_Sub21) class348_sub21).anInt6852
                        + ((Class42) class42).anInt603)
                        / (-Class75.anInt1274 + Class75.anInt1265))
                        + Class75.anInt1272);
            }
            Class105 class105 = null;
            int i_11_ = 0;
            if (i > -29)
                aRectangleArray2554 = null;
            int i_12_ = 0;
            int i_13_ = 0;
            int i_14_ = 0;
            if (((Class42) class42).anInt578 != -1) {
                if (((Class348_Sub21) class348_sub21).aBoolean6848
                        && ((Class42) class42).anInt605 != -1)
                    class105 = class42.method374(true, var_ha, (byte) 127);
                else
                    class105 = class42.method374(false, var_ha, (byte) 127);
                if (class105 != null) {
                    i_11_ = (((Class348_Sub21) class348_sub21).anInt6853
                            + -(class105.method966() - -1 >> 1794552897));
                    i_12_ = (((Class348_Sub21) class348_sub21).anInt6853
                            + (1 + class105.method966() >> 970201217));
                    if (i_11_ < i_7_)
                        i_7_ = i_11_;
                    if (i_12_ > i_8_)
                        i_8_ = i_12_;
                    i_13_ = (((Class348_Sub21) class348_sub21).anInt6855
                            - (class105.method980() - -1 >> 1687097473));
                    if (i_13_ < i_9_)
                        i_9_ = i_13_;
                    i_14_ = (((Class348_Sub21) class348_sub21).anInt6855
                            + (1 + class105.method980() >> 1393541537));
                    if (i_14_ > i_10_)
                        i_10_ = i_14_;
                }
            }
            Class323 class323 = null;
            int i_15_ = 0;
            int i_16_ = 0;
            int i_17_ = 0;
            int i_18_ = 0;
            int i_19_ = 0;
            int i_20_ = 0;
            int i_21_ = 0;
            int i_22_ = 0;
            if (((Class42) class42).aString597 != null) {
                class323
                        = Class239_Sub15.method1782(((Class42) class42).anInt576,
                        10144);
                if (class323 != null) {
                    i_15_ = (Class258_Sub1.aClass143_8527.method1188
                            (((Class42) class42).aString597, null,
                                    ha_Sub3.aStringArray8019, (byte) 87, null));
                    i_17_ = (((Class348_Sub21) class348_sub21).anInt6855
                            - (((Class42) class42).anInt568
                            * (Class75.anInt1268 + -Class75.anInt1262)
                            / (Class75.anInt1277 - Class75.anInt1257)));
                    i_16_ = (((Class348_Sub21) class348_sub21).anInt6853
                            + ((-Class75.anInt1272 + Class75.anInt1276)
                            * ((Class42) class42).anInt566
                            / (Class75.anInt1265 + -Class75.anInt1274)));
                    if (class105 == null)
                        i_17_ -= i_15_ * class323.method2560() / 2;
                    else
                        i_17_ -= ((class105.method980() >> -1393016511)
                                - -(i_15_ * class323.method2565()));
                    for (int i_23_ = 0; i_15_ > i_23_; i_23_++) {
                        String string = ha_Sub3.aStringArray8019[i_23_];
                        if (i_23_ < -1 + i_15_)
                            string = string.substring(0, -4 + string.length());
                        int i_24_ = class323.method2564(string);
                        if (i_18_ < i_24_)
                            i_18_ = i_24_;
                    }
                    i_19_ = i_6_ + i_16_ + -(i_18_ / 2);
                    i_20_ = i_6_ + i_16_ + i_18_ / 2;
                    if ((i_19_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff))
                        i_7_ = i_19_;
                    i_21_ = i_17_ + i_5_;
                    if (i_20_ > i_8_)
                        i_8_ = i_20_;
                    i_22_ = i_5_ + (i_17_ + class323.method2565() * i_15_);
                    if (i_9_ > i_21_)
                        i_9_ = i_21_;
                    if ((i_22_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff))
                        i_10_ = i_22_;
                }
            }
            if (Class75.anInt1272 > i_8_
                    || (Class75.anInt1276 ^ 0xffffffff) > (i_7_ ^ 0xffffffff)
                    || (Class75.anInt1262 ^ 0xffffffff) < (i_10_ ^ 0xffffffff)
                    || i_9_ > Class75.anInt1268)
                return true;
            Class75.method745(var_ha, class348_sub21, class42);
            if (class105 != null) {
                if ((Class367_Sub9.anInt7379 ^ 0xffffffff) < -1
                        && ((Class348_Sub40_Sub30.anInt9399 != -1
                        && (Class348_Sub40_Sub30.anInt9399
                        == ((Class348_Sub21) class348_sub21).anInt6847))
                        || ((Class34.anInt481 ^ 0xffffffff) != 0
                        && (((Class42) class42).anInt596
                        == Class34.anInt481)))) {
                    int i_25_;
                    if (Class164.anInt2173 <= 50)
                        i_25_ = 2 * Class164.anInt2173;
                    else
                        i_25_ = -(Class164.anInt2173 * 2) + 200;
                    int i_26_ = 0xffff00 | i_25_ << 1431786328;
                    var_ha.method3656((byte) -105, i_26_,
                            class105.method971() / 2 - -7,
                            (((Class348_Sub21) class348_sub21)
                                    .anInt6853),
                            (((Class348_Sub21) class348_sub21)
                                    .anInt6855));
                    var_ha.method3656((byte) -120, i_26_,
                            class105.method971() / 2 - -5,
                            (((Class348_Sub21) class348_sub21)
                                    .anInt6853),
                            (((Class348_Sub21) class348_sub21)
                                    .anInt6855));
                    var_ha.method3656((byte) -126, i_26_,
                            3 + class105.method971() / 2,
                            (((Class348_Sub21) class348_sub21)
                                    .anInt6853),
                            (((Class348_Sub21) class348_sub21)
                                    .anInt6855));
                    var_ha.method3656((byte) -112, i_26_,
                            1 + class105.method971() / 2,
                            (((Class348_Sub21) class348_sub21)
                                    .anInt6853),
                            (((Class348_Sub21) class348_sub21)
                                    .anInt6855));
                    var_ha.method3656((byte) -123, i_26_,
                            class105.method971() / 2,
                            (((Class348_Sub21) class348_sub21)
                                    .anInt6853),
                            (((Class348_Sub21) class348_sub21)
                                    .anInt6855));
                }
                class105.method974((((Class348_Sub21) class348_sub21).anInt6853
                                + -(class105.method966() >> -474034719)),
                        (((Class348_Sub21) class348_sub21).anInt6855
                                + -(class105.method980() >> -1411134719)));
            }
            if (((Class42) class42).aString597 != null && class323 != null)
                Class342.method2683(class323, class348_sub21, i_16_, 64, i_15_,
                        var_ha, i_17_, i_18_, class42);
            if (((Class42) class42).anInt578 != -1
                    || ((Class42) class42).aString597 != null) {
                Class348_Sub12 class348_sub12
                        = new Class348_Sub12(class348_sub21);
                ((Class348_Sub12) class348_sub12).anInt6746 = i_13_;
                ((Class348_Sub12) class348_sub12).anInt6753 = i_21_;
                ((Class348_Sub12) class348_sub12).anInt6747 = i_11_;
                ((Class348_Sub12) class348_sub12).anInt6738 = i_22_;
                ((Class348_Sub12) class348_sub12).anInt6745 = i_19_;
                ((Class348_Sub12) class348_sub12).anInt6735 = i_14_;
                ((Class348_Sub12) class348_sub12).anInt6737 = i_20_;
                ((Class348_Sub12) class348_sub12).anInt6750 = i_12_;
                Class289.aClass262_3705.method1999(class348_sub12, -20180);
            }
            return false;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bp.C(" + i + ','
                            + (class42 != null ? "{...}"
                            : "null")
                            + ','
                            + (class348_sub21 != null
                            ? "{...}" : "null")
                            + ',' + i_5_ + ','
                            + (var_ha != null ? "{...}"
                            : "null")
                            + ',' + i_6_ + ')'));
        }
    }

    public static void method1426(int i) {
        aClass351_2539 = null;
        aRectangleArray2554 = null;
        anIntArray2552 = null;
        if (i != 25165)
            aRectangleArray2554 = null;
    }

    public Class190() {
        ((Class190) this).anInt2535 = -50;
        ((Class190) this).aFloat2536 = 1.2F;
        ((Class190) this).aClass299_2541 = Class348_Sub42_Sub10.aClass299_9571;
        ((Class190) this).anInt2546 = 0;
        ((Class190) this).anInt2549 = Class268.anInt3444;
        ((Class190) this).anInt2548 = -60;
        ((Class190) this).anInt2538 = -50;
        ((Class190) this).aFloat2544 = 0.69921875F;
        ((Class190) this).anInt2540 = Class268.anInt3439;
        ((Class190) this).aFloat2547 = 1.1523438F;
    }

    Class190(Class348_Sub49 class348_sub49) {
        int i = class348_sub49.method3387(255);
        if ((((Class348_Sub51) Class316.aClass348_Sub51_3959)
                .aClass239_Sub28_7230.method1845(-32350)
                ^ 0xffffffff) != -2
                || (Class60.aHa1098.method3704() ^ 0xffffffff) >= -1) {
            if ((0x1 & i ^ 0xffffffff) != -1)
                class348_sub49.method3385((byte) -126);
            if ((0x2 & i) != 0)
                class348_sub49.method3330(842397944);
            if ((i & 0x4) != 0)
                class348_sub49.method3330(842397944);
            if ((0x8 & i ^ 0xffffffff) != -1)
                class348_sub49.method3330(842397944);
            ((Class190) this).anInt2540 = Class268.anInt3439;
            ((Class190) this).aFloat2547 = 1.1523438F;
            ((Class190) this).aFloat2544 = 0.69921875F;
            ((Class190) this).aFloat2536 = 1.2F;
        } else {
            if ((i & 0x1 ^ 0xffffffff) != -1)
                ((Class190) this).anInt2540
                        = class348_sub49.method3385((byte) -126);
            else
                ((Class190) this).anInt2540 = Class268.anInt3439;
            if ((0x2 & i ^ 0xffffffff) != -1)
                ((Class190) this).aFloat2547
                        = (float) class348_sub49.method3330(842397944) / 256.0F;
            else
                ((Class190) this).aFloat2547 = 1.1523438F;
            if ((i & 0x4 ^ 0xffffffff) == -1)
                ((Class190) this).aFloat2544 = 0.69921875F;
            else
                ((Class190) this).aFloat2544
                        = (float) class348_sub49.method3330(842397944) / 256.0F;
            if ((0x8 & i ^ 0xffffffff) != -1)
                ((Class190) this).aFloat2536
                        = (float) class348_sub49.method3330(842397944) / 256.0F;
            else
                ((Class190) this).aFloat2536 = 1.2F;
        }
        if ((i & 0x10) == 0) {
            ((Class190) this).anInt2548 = -60;
            ((Class190) this).anInt2535 = -50;
            ((Class190) this).anInt2538 = -50;
        } else {
            ((Class190) this).anInt2538 = class348_sub49.method3372(13638);
            ((Class190) this).anInt2548 = class348_sub49.method3372(13638);
            ((Class190) this).anInt2535 = class348_sub49.method3372(13638);
        }
        if ((0x20 & i ^ 0xffffffff) == -1)
            ((Class190) this).anInt2549 = Class268.anInt3444;
        else
            ((Class190) this).anInt2549
                    = class348_sub49.method3385((byte) -126);
        if ((i & 0x40 ^ 0xffffffff) != -1)
            ((Class190) this).anInt2546 = class348_sub49.method3330(842397944);
        else
            ((Class190) this).anInt2546 = 0;
        if ((0x80 & i) != 0) {
            int i_27_ = class348_sub49.method3330(842397944);
            int i_28_ = class348_sub49.method3330(842397944);
            int i_29_ = class348_sub49.method3330(842397944);
            int i_30_ = class348_sub49.method3330(842397944);
            int i_31_ = class348_sub49.method3330(842397944);
            int i_32_ = class348_sub49.method3330(842397944);
            ((Class190) this).aClass299_2541
                    = Class230.method1636(i_31_, i_30_, i_27_, i_32_, i_28_, -1,
                    i_29_);
        } else
            ((Class190) this).aClass299_2541
                    = Class348_Sub42_Sub10.aClass299_9571;
    }
}
