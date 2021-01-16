/* Class353 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class353 {
    static float aFloat4338;
    int anInt4339;
    short aShort4340;
    short aShort4341;
    int anInt4342;
    byte aByte4343;
    int anInt4344;
    static int anInt4345;
    static Class60 aClass60_4346 = new Class60(4);
    int anInt4347;
    short aShort4348;
    int anInt4349;
    boolean aBoolean4350;
    static int anInt4351;

    static final void method3460(int i, int i_0_, int i_1_, int i_2_, int i_3_,
                                 int[] is, int i_4_, int i_5_) {
        anInt4345++;
        if (i_3_ > 0 && !Class192.method1436(-86, i_3_))
            throw new IllegalArgumentException("");
        if (i_1_ > 0 && !Class192.method1436(88, i_1_))
            throw new IllegalArgumentException("");
        if (i_4_ != 32993)
            throw new IllegalArgumentException("");
        int i_6_ = 0;
        int i_7_ = i_1_ > i_3_ ? i_3_ : i_1_;
        if (i_5_ >= -54)
            method3462(106);
        int i_8_ = i_3_ >> 1682010529;
        int i_9_ = i_1_ >> -1442899551;
        int[] is_10_ = is;
        int[] is_11_ = new int[i_9_ * i_8_];
        for (; ; ) {
            OpenGL.glTexImage2Di(i, i_6_, i_0_, i_3_, i_1_, 0, i_4_, i_2_,
                    is_10_, 0);
            if (i_7_ <= 1)
                break;
            int i_12_ = 0;
            int i_13_ = 0;
            int i_14_ = i_3_ + i_13_;
            int[] is_15_ = is_11_;
            for (int i_16_ = 0; i_16_ < i_9_; i_16_++) {
                for (int i_17_ = 0; i_17_ < i_8_; i_17_++) {
                    int i_18_ = is_10_[i_13_++];
                    int i_19_ = is_10_[i_13_++];
                    int i_20_ = is_10_[i_14_++];
                    int i_21_ = i_18_ & 0xff;
                    int i_22_ = (0xff2fb7 & i_18_) >> 932462160;
                    int i_23_ = 0xff & i_18_ >> 850438200;
                    int i_24_ = (i_18_ & 0xff43) >> 1040736488;
                    int i_25_ = is_10_[i_14_++];
                    i_23_ += 0xff & i_19_ >> 1409228888;
                    i_22_ += (i_19_ & 0xff6a76) >> 369372880;
                    i_21_ += 0xff & i_19_;
                    i_24_ += (i_19_ & 0xff5a) >> 2143217640;
                    i_23_ += 0xff & i_20_ >> 2081312280;
                    i_22_ += (i_20_ & 0xff2819) >> -1576671504;
                    i_24_ += (i_20_ & 0xff76) >> 1638033128;
                    i_21_ += i_20_ & 0xff;
                    i_21_ += 0xff & i_25_;
                    i_24_ += i_25_ >> 1838260744 & 0xff;
                    i_23_ += 0xff & i_25_ >> 1921786136;
                    i_22_ += (0xff943a & i_25_) >> -630085136;
                    is_11_[i_12_++]
                            = (Class273.method2057
                            ((Class273.method2057
                                            (Class139.method1166(i_24_ << 1830115238, 65280),
                                                    Class273.method2057((Class139.method1166(1020,
                                                            i_22_)
                                                                    << 2110798030),
                                                            (Class139.method1166(i_23_,
                                                                    1020)
                                                                    << -120087978)))),
                                    Class139.method1166(i_21_, 1020) >> 1691553410));
                }
                i_13_ += i_3_;
                i_14_ += i_3_;
            }
            is_11_ = is_10_;
            i_1_ = i_9_;
            i_3_ = i_8_;
            is_10_ = is_15_;
            i_6_++;
            i_8_ >>= 1;
            i_7_ >>= 1;
            i_9_ >>= 1;
        }
    }

    static final void method3461(int i, Object[] objects, int i_26_, long[] ls,
                                 int i_27_) {
        do {
            try {
                anInt4351++;
                if ((i ^ 0xffffffff) > (i_26_ ^ 0xffffffff)) {
                    int i_28_ = (i + i_26_) / 2;
                    int i_29_ = i;
                    long l = ls[i_28_];
                    ls[i_28_] = ls[i_26_];
                    ls[i_26_] = l;
                    Object object = objects[i_28_];
                    objects[i_28_] = objects[i_26_];
                    objects[i_26_] = object;
                    int i_30_
                            = ((l ^ 0xffffffffffffffffL) != -9223372036854775808L
                            ? 1 : 0);
                    for (int i_31_ = i; i_26_ > i_31_; i_31_++) {
                        if ((long) (i_31_ & i_30_) + l > ls[i_31_]) {
                            long l_32_ = ls[i_31_];
                            ls[i_31_] = ls[i_29_];
                            ls[i_29_] = l_32_;
                            Object object_33_ = objects[i_31_];
                            objects[i_31_] = objects[i_29_];
                            objects[i_29_++] = object_33_;
                        }
                    }
                    ls[i_26_] = ls[i_29_];
                    ls[i_29_] = l;
                    objects[i_26_] = objects[i_29_];
                    objects[i_29_] = object;
                    method3461(i, objects, i_29_ + -1, ls, 9455);
                    method3461(i_29_ + 1, objects, i_26_, ls, 9455);
                }
                if (i_27_ == 9455)
                    break;
                aClass60_4346 = null;
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception,
                        ("en.B(" + i + ','
                                + (objects != null ? "{...}"
                                : "null")
                                + ',' + i_26_ + ','
                                + (ls != null ? "{...}"
                                : "null")
                                + ',' + i_27_ + ')'));
            }
            break;
        } while (false);
    }

    public static void method3462(int i) {
        aClass60_4346 = null;
        if (i != -30094)
            method3461(-108, null, -26, null, 42);
    }

    Class353(int i, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_,
             int i_39_, int i_40_, int i_41_, boolean bool, boolean bool_42_,
             int i_43_) {
        ((Class353) this).anInt4339 = i_36_;
        ((Class353) this).anInt4349 = i_34_;
        ((Class353) this).aShort4340 = (short) i_38_;
        ((Class353) this).anInt4344 = i_35_;
        ((Class353) this).anInt4347 = i_43_;
        ((Class353) this).aByte4343 = (byte) i_41_;
        ((Class353) this).anInt4342 = i;
        ((Class353) this).aShort4341 = (short) i_37_;
        ((Class353) this).aBoolean4350 = bool_42_;
        ((Class353) this).aShort4348 = (short) i_39_;
    }
}
