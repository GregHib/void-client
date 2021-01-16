/* Class348_Sub40_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub16 extends Class348_Sub40 {
    static int anInt9222;
    static int anInt9223;
    static int anInt9224;
    static Class114 aClass114_9225;
    private int anInt9226 = 6;
    static int anInt9227;
    static int anInt9228;
    static volatile boolean aBoolean9229 = true;
    static int[] anIntArray9230 = {0, -1, 0, 1};
    static int anInt9231;

    final void method3049(Class348_Sub49 class348_sub49, int i, int i_0_) {
        if (i_0_ != 31015)
            anInt9226 = -83;
        int i_1_ = i;
        do {
            if (i_1_ != 0) {
                if (i_1_ != 1)
                    break;
            } else {
                anInt9226 = class348_sub49.method3387(255);
                break;
            }
            ((Class348_Sub40) this).aBoolean7045
                    = (class348_sub49.method3387(255) ^ 0xffffffff) == -2;
        } while (false);
        anInt9227++;
    }

    final int[][] method3047(int i, int i_2_) {
        if (i_2_ != -1564599039)
            method3089(-88);
        anInt9223++;
        int[][] is = ((Class348_Sub40) this).aClass322_7033
                .method2557(i_2_ ^ 0x5d41e2a7, i);
        while_168_:
        do {
            if (((Class322) ((Class348_Sub40) this).aClass322_7033)
                    .aBoolean4035) {
                int[][] is_3_ = this.method3039((byte) -51, i, 0);
                int[][] is_4_ = this.method3039((byte) -66, i, 1);
                int[] is_5_ = is[0];
                int[] is_6_ = is[1];
                int[] is_7_ = is[2];
                int[] is_8_ = is_3_[0];
                int[] is_9_ = is_3_[1];
                int[] is_10_ = is_3_[2];
                int[] is_11_ = is_4_[0];
                int[] is_12_ = is_4_[1];
                int[] is_13_ = is_4_[2];
                int i_14_ = anInt9226;
                while_167_:
                do {
                    while_166_:
                    do {
                        while_165_:
                        do {
                            while_164_:
                            do {
                                while_163_:
                                do {
                                    while_162_:
                                    do {
                                        while_161_:
                                        do {
                                            while_160_:
                                            do {
                                                while_159_:
                                                do {
                                                    do {
                                                        if (i_14_ != 1) {
                                                            if ((i_14_
                                                                    ^ 0xffffffff)
                                                                    != -3) {
                                                                if ((i_14_
                                                                        ^ 0xffffffff)
                                                                        != -4) {
                                                                    if ((i_14_
                                                                            ^ 0xffffffff)
                                                                            != -5) {
                                                                        if (i_14_
                                                                                != 5) {
                                                                            if (i_14_ != 6) {
                                                                                if (i_14_ != 7) {
                                                                                    if (i_14_ != 8) {
                                                                                        if (i_14_ != 9) {
                                                                                            if (i_14_ != 10) {
                                                                                                if ((i_14_ ^ 0xffffffff) != -12) {
                                                                                                    if ((i_14_ ^ 0xffffffff) != -13)
                                                                                                        break while_168_;
                                                                                                } else
                                                                                                    break while_166_;
                                                                                                break while_167_;
                                                                                            }
                                                                                        } else
                                                                                            break while_164_;
                                                                                        break while_165_;
                                                                                    }
                                                                                } else
                                                                                    break while_162_;
                                                                                break while_163_;
                                                                            }
                                                                        } else
                                                                            break while_160_;
                                                                        break while_161_;
                                                                    }
                                                                } else
                                                                    break;
                                                                break while_159_;
                                                            }
                                                        } else {
                                                            for (i_14_ = 0;
                                                                 ((i_14_
                                                                         ^ 0xffffffff)
                                                                         > ((Class348_Sub40_Sub6
                                                                         .anInt9139)
                                                                         ^ 0xffffffff));
                                                                 i_14_++) {
                                                                is_5_[i_14_]
                                                                        = ((is_11_
                                                                        [i_14_])
                                                                        + (is_8_
                                                                        [i_14_]));
                                                                is_6_[i_14_]
                                                                        = ((is_9_
                                                                        [i_14_])
                                                                        + (is_12_
                                                                        [i_14_]));
                                                                is_7_[i_14_]
                                                                        = ((is_10_
                                                                        [i_14_])
                                                                        + (is_13_
                                                                        [i_14_]));
                                                            }
                                                            break while_168_;
                                                        }
                                                        for (i_14_ = 0;
                                                             ((i_14_
                                                                     ^ 0xffffffff)
                                                                     > ((Class348_Sub40_Sub6
                                                                     .anInt9139)
                                                                     ^ 0xffffffff));
                                                             i_14_++) {
                                                            is_5_[i_14_]
                                                                    = (is_8_[i_14_]
                                                                    - (is_11_
                                                                    [i_14_]));
                                                            is_6_[i_14_]
                                                                    = (is_9_[i_14_]
                                                                    + -(is_12_
                                                                    [i_14_]));
                                                            is_7_[i_14_]
                                                                    = (-(is_13_
                                                                    [i_14_])
                                                                    + (is_10_
                                                                    [i_14_]));
                                                        }
                                                        break while_168_;
                                                    } while (false);
                                                    for (i_14_ = 0;
                                                         (i_14_
                                                                 < (Class348_Sub40_Sub6
                                                                 .anInt9139));
                                                         i_14_++) {
                                                        is_5_[i_14_]
                                                                = ((is_11_[i_14_]
                                                                * is_8_[i_14_])
                                                                >> 1160349676);
                                                        is_6_[i_14_]
                                                                = ((is_12_[i_14_]
                                                                * is_9_[i_14_])
                                                                >> -1801876756);
                                                        is_7_[i_14_]
                                                                = ((is_10_[i_14_]
                                                                * (is_13_
                                                                [i_14_]))
                                                                >> 1740144556);
                                                    }
                                                    break while_168_;
                                                } while (false);
                                                for (i_14_ = 0;
                                                     (i_14_
                                                             < (Class348_Sub40_Sub6
                                                             .anInt9139));
                                                     i_14_++) {
                                                    int i_15_ = is_11_[i_14_];
                                                    int i_16_ = is_13_[i_14_];
                                                    int i_17_ = is_12_[i_14_];
                                                    is_5_[i_14_]
                                                            = ((i_15_
                                                            ^ 0xffffffff) != -1
                                                            ? ((is_8_[i_14_]
                                                            << -1739348)
                                                            / i_15_)
                                                            : 4096);
                                                    is_6_[i_14_]
                                                            = (i_17_ == 0 ? 4096
                                                            : ((is_9_[i_14_]
                                                            << -897296884)
                                                            / i_17_));
                                                    is_7_[i_14_]
                                                            = (i_16_ == 0 ? 4096
                                                            : ((is_10_[i_14_]
                                                            << -349390100)
                                                            / i_16_));
                                                }
                                                break while_168_;
                                            } while (false);
                                            for (i_14_ = 0;
                                                 (((Class348_Sub40_Sub6
                                                         .anInt9139)
                                                         ^ 0xffffffff)
                                                         < (i_14_ ^ 0xffffffff));
                                                 i_14_++) {
                                                is_5_[i_14_]
                                                        = (4096
                                                        + -(((-is_11_[i_14_]
                                                        + 4096)
                                                        * (4096
                                                        - is_8_[i_14_]))
                                                        >> -817956052));
                                                is_6_[i_14_]
                                                        = (4096
                                                        + -(((4096
                                                        + -is_12_[i_14_])
                                                        * (4096
                                                        - is_9_[i_14_]))
                                                        >> -896762484));
                                                is_7_[i_14_]
                                                        = (4096
                                                        - (((-is_13_[i_14_]
                                                        + 4096)
                                                        * (4096
                                                        - is_10_[i_14_]))
                                                        >> 250373644));
                                            }
                                            break while_168_;
                                        } while (false);
                                        for (i_14_ = 0;
                                             (Class348_Sub40_Sub6.anInt9139
                                                     > i_14_);
                                             i_14_++) {
                                            int i_18_ = is_11_[i_14_];
                                            int i_19_ = is_13_[i_14_];
                                            int i_20_ = is_12_[i_14_];
                                            is_5_[i_14_]
                                                    = (((i_18_ ^ 0xffffffff)
                                                    <= -2049)
                                                    ? -(((4096 - is_8_[i_14_])
                                                    * (-i_18_ + 4096))
                                                    >> 584860011) + 4096
                                                    : (is_8_[i_14_] * i_18_
                                                    >> 1136299595));
                                            is_6_[i_14_]
                                                    = (i_20_ >= 2048
                                                    ? -(((-i_20_ + 4096)
                                                    * (4096
                                                    - is_9_[i_14_]))
                                                    >> 1616611947) + 4096
                                                    : (i_20_ * is_9_[i_14_]
                                                    >> 1261661579));
                                            is_7_[i_14_]
                                                    = (i_19_ < 2048
                                                    ? (i_19_ * is_10_[i_14_]
                                                    >> 62304971)
                                                    : -(((-is_10_[i_14_] + 4096)
                                                    * (-i_19_ + 4096))
                                                    >> -580516597) + 4096);
                                        }
                                        break while_168_;
                                    } while (false);
                                    for (i_14_ = 0;
                                         Class348_Sub40_Sub6.anInt9139 > i_14_;
                                         i_14_++) {
                                        int i_21_ = is_10_[i_14_];
                                        int i_22_ = is_9_[i_14_];
                                        int i_23_ = is_8_[i_14_];
                                        is_5_[i_14_]
                                                = ((i_23_ ^ 0xffffffff) == -4097
                                                ? 4096
                                                : ((is_11_[i_14_] << 793720908)
                                                / (-i_23_ + 4096)));
                                        is_6_[i_14_]
                                                = ((i_22_ ^ 0xffffffff) != -4097
                                                ? ((is_12_[i_14_] << 1322569740)
                                                / (-i_22_ + 4096))
                                                : 4096);
                                        is_7_[i_14_]
                                                = ((i_21_ ^ 0xffffffff) == -4097
                                                ? 4096
                                                : ((is_13_[i_14_] << -491071796)
                                                / (4096 - i_21_)));
                                    }
                                    break while_168_;
                                } while (false);
                                for (i_14_ = 0;
                                     ((i_14_ ^ 0xffffffff)
                                             > (Class348_Sub40_Sub6.anInt9139
                                             ^ 0xffffffff));
                                     i_14_++) {
                                    int i_24_ = is_9_[i_14_];
                                    int i_25_ = is_8_[i_14_];
                                    int i_26_ = is_10_[i_14_];
                                    is_5_[i_14_]
                                            = ((i_25_ ^ 0xffffffff) == -1 ? 0
                                            : -((-is_11_[i_14_] + 4096
                                            << -2081436308)
                                            / i_25_) + 4096);
                                    is_6_[i_14_]
                                            = i_24_ != 0 ? -((4096 + -is_12_[i_14_]
                                            << -188922932)
                                            / i_24_) + 4096 : 0;
                                    is_7_[i_14_]
                                            = ((i_26_ ^ 0xffffffff) == -1 ? 0
                                            : -((-is_13_[i_14_] + 4096
                                            << 533328524)
                                            / i_26_) + 4096);
                                }
                                break while_168_;
                            } while (false);
                            for (i_14_ = 0;
                                 i_14_ < Class348_Sub40_Sub6.anInt9139;
                                 i_14_++) {
                                int i_27_ = is_9_[i_14_];
                                int i_28_ = is_12_[i_14_];
                                int i_29_ = is_13_[i_14_];
                                int i_30_ = is_11_[i_14_];
                                int i_31_ = is_10_[i_14_];
                                int i_32_ = is_8_[i_14_];
                                is_5_[i_14_]
                                        = ((i_32_ ^ 0xffffffff) > (i_30_
                                        ^ 0xffffffff)
                                        ? i_32_ : i_30_);
                                is_6_[i_14_]
                                        = ((i_27_ ^ 0xffffffff) > (i_28_
                                        ^ 0xffffffff)
                                        ? i_27_ : i_28_);
                                is_7_[i_14_] = i_29_ > i_31_ ? i_31_ : i_29_;
                            }
                            break while_168_;
                        } while (false);
                        for (i_14_ = 0;
                             ((i_14_ ^ 0xffffffff)
                                     > (Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff));
                             i_14_++) {
                            int i_33_ = is_9_[i_14_];
                            int i_34_ = is_10_[i_14_];
                            int i_35_ = is_12_[i_14_];
                            int i_36_ = is_11_[i_14_];
                            int i_37_ = is_13_[i_14_];
                            int i_38_ = is_8_[i_14_];
                            is_5_[i_14_] = i_36_ < i_38_ ? i_38_ : i_36_;
                            is_6_[i_14_]
                                    = ((i_35_ ^ 0xffffffff) <= (i_33_ ^ 0xffffffff)
                                    ? i_35_ : i_33_);
                            is_7_[i_14_]
                                    = ((i_34_ ^ 0xffffffff) >= (i_37_ ^ 0xffffffff)
                                    ? i_37_ : i_34_);
                        }
                        break while_168_;
                    } while (false);
                    for (i_14_ = 0; Class348_Sub40_Sub6.anInt9139 > i_14_;
                         i_14_++) {
                        int i_39_ = is_13_[i_14_];
                        int i_40_ = is_9_[i_14_];
                        int i_41_ = is_10_[i_14_];
                        int i_42_ = is_11_[i_14_];
                        int i_43_ = is_8_[i_14_];
                        int i_44_ = is_12_[i_14_];
                        is_5_[i_14_]
                                = ((i_42_ ^ 0xffffffff) > (i_43_ ^ 0xffffffff)
                                ? -i_42_ + i_43_ : i_42_ - i_43_);
                        is_6_[i_14_]
                                = ((i_40_ ^ 0xffffffff) >= (i_44_ ^ 0xffffffff)
                                ? i_44_ + -i_40_ : -i_44_ + i_40_);
                        is_7_[i_14_]
                                = i_41_ <= i_39_ ? i_39_ - i_41_ : -i_39_ + i_41_;
                    }
                    break while_168_;
                } while (false);
                for (i_14_ = 0;
                     ((i_14_ ^ 0xffffffff)
                             > (Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff));
                     i_14_++) {
                    int i_45_ = is_8_[i_14_];
                    int i_46_ = is_10_[i_14_];
                    int i_47_ = is_13_[i_14_];
                    int i_48_ = is_11_[i_14_];
                    int i_49_ = is_9_[i_14_];
                    int i_50_ = is_12_[i_14_];
                    is_5_[i_14_]
                            = -(i_45_ * i_48_ >> -243207381) + (i_48_ + i_45_);
                    is_6_[i_14_]
                            = -(i_49_ * i_50_ >> 1689874027) + (i_49_ + i_50_);
                    is_7_[i_14_]
                            = i_47_ + i_46_ - (i_46_ * i_47_ >> 1428550955);
                }
            }
        } while (false);
        return is;
    }

    public static void method3087(boolean bool) {
        anIntArray9230 = null;
        aClass114_9225 = null;
        if (bool != false)
            method3089(-42);
    }

    public Class348_Sub40_Sub16() {
        super(2, false);
    }

    final int[] method3042(int i, int i_51_) {
        if (i_51_ != 255)
            method3047(50, -18);
        anInt9224++;
        int[] is = ((Class348_Sub40) this).aClass191_7032.method1433(0, i);
        while_178_:
        do {
            if (((Class191) ((Class348_Sub40) this).aClass191_7032)
                    .aBoolean2570) {
                int[] is_52_ = this.method3048(i, 633706337, 0);
                int[] is_53_ = this.method3048(i, 633706337, 1);
                int i_54_ = anInt9226;
                while_177_:
                do {
                    while_176_:
                    do {
                        while_175_:
                        do {
                            while_174_:
                            do {
                                while_173_:
                                do {
                                    while_172_:
                                    do {
                                        while_171_:
                                        do {
                                            while_170_:
                                            do {
                                                while_169_:
                                                do {
                                                    do {
                                                        if (i_54_ != 1) {
                                                            if ((i_54_
                                                                    ^ 0xffffffff)
                                                                    != -3) {
                                                                if (i_54_
                                                                        != 3) {
                                                                    if ((i_54_
                                                                            ^ 0xffffffff)
                                                                            != -5) {
                                                                        if ((i_54_
                                                                                ^ 0xffffffff)
                                                                                != -6) {
                                                                            if ((i_54_ ^ 0xffffffff) != -7) {
                                                                                if (i_54_ != 7) {
                                                                                    if ((i_54_ ^ 0xffffffff) != -9) {
                                                                                        if (i_54_ != 9) {
                                                                                            if (i_54_ != 10) {
                                                                                                if ((i_54_ ^ 0xffffffff) != -12) {
                                                                                                    if (i_54_ != 12)
                                                                                                        break while_178_;
                                                                                                } else
                                                                                                    break while_176_;
                                                                                                break while_177_;
                                                                                            }
                                                                                        } else
                                                                                            break while_174_;
                                                                                        break while_175_;
                                                                                    }
                                                                                } else
                                                                                    break while_172_;
                                                                                break while_173_;
                                                                            }
                                                                        } else
                                                                            break while_170_;
                                                                        break while_171_;
                                                                    }
                                                                } else
                                                                    break;
                                                                break while_169_;
                                                            }
                                                        } else {
                                                            for (i_54_ = 0;
                                                                 ((i_54_
                                                                         ^ 0xffffffff)
                                                                         > ((Class348_Sub40_Sub6
                                                                         .anInt9139)
                                                                         ^ 0xffffffff));
                                                                 i_54_++)
                                                                is[i_54_]
                                                                        = ((is_52_
                                                                        [i_54_])
                                                                        + (is_53_
                                                                        [i_54_]));
                                                            break while_178_;
                                                        }
                                                        for (i_54_ = 0;
                                                             ((i_54_
                                                                     ^ 0xffffffff)
                                                                     > ((Class348_Sub40_Sub6
                                                                     .anInt9139)
                                                                     ^ 0xffffffff));
                                                             i_54_++)
                                                            is[i_54_]
                                                                    = ((is_52_
                                                                    [i_54_])
                                                                    + -(is_53_
                                                                    [i_54_]));
                                                        break while_178_;
                                                    } while (false);
                                                    for (i_54_ = 0;
                                                         ((i_54_ ^ 0xffffffff)
                                                                 > ((Class348_Sub40_Sub6
                                                                 .anInt9139)
                                                                 ^ 0xffffffff));
                                                         i_54_++)
                                                        is[i_54_]
                                                                = ((is_53_[i_54_]
                                                                * (is_52_
                                                                [i_54_]))
                                                                >> 1120836364);
                                                    break while_178_;
                                                } while (false);
                                                for (i_54_ = 0;
                                                     ((i_54_ ^ 0xffffffff)
                                                             > ((Class348_Sub40_Sub6
                                                             .anInt9139)
                                                             ^ 0xffffffff));
                                                     i_54_++) {
                                                    int i_55_ = is_53_[i_54_];
                                                    is[i_54_]
                                                            = ((i_55_
                                                            ^ 0xffffffff) != -1
                                                            ? ((is_52_[i_54_]
                                                            << -1026493268)
                                                            / i_55_)
                                                            : 4096);
                                                }
                                                break while_178_;
                                            } while (false);
                                            for (i_54_ = 0;
                                                 (Class348_Sub40_Sub6.anInt9139
                                                         > i_54_);
                                                 i_54_++)
                                                is[i_54_]
                                                        = -(((4096 - is_52_[i_54_])
                                                        * (4096
                                                        - is_53_[i_54_]))
                                                        >> -1689830068) + 4096;
                                            break while_178_;
                                        } while (false);
                                        for (i_54_ = 0;
                                             (i_54_
                                                     < Class348_Sub40_Sub6.anInt9139);
                                             i_54_++) {
                                            int i_56_ = is_53_[i_54_];
                                            is[i_54_]
                                                    = (i_56_ >= 2048
                                                    ? (4096
                                                    + -(((-i_56_ + 4096)
                                                    * (4096
                                                    - is_52_[i_54_]))
                                                    >> 200853131))
                                                    : (i_56_ * is_52_[i_54_]
                                                    >> -231262293));
                                        }
                                        break while_178_;
                                    } while (false);
                                    for (i_54_ = 0;
                                         i_54_ < Class348_Sub40_Sub6.anInt9139;
                                         i_54_++) {
                                        int i_57_ = is_52_[i_54_];
                                        is[i_54_]
                                                = ((i_57_ ^ 0xffffffff) != -4097
                                                ? ((is_53_[i_54_]
                                                << -1569874612)
                                                / (-i_57_ + 4096))
                                                : 4096);
                                    }
                                    break while_178_;
                                } while (false);
                                for (i_54_ = 0;
                                     i_54_ < Class348_Sub40_Sub6.anInt9139;
                                     i_54_++) {
                                    int i_58_ = is_52_[i_54_];
                                    is[i_54_] = (i_58_ == 0 ? 0
                                            : -((4096 - is_53_[i_54_]
                                            << 2042088204)
                                            / i_58_) + 4096);
                                }
                                break while_178_;
                            } while (false);
                            for (i_54_ = 0;
                                 i_54_ < Class348_Sub40_Sub6.anInt9139;
                                 i_54_++) {
                                int i_59_ = is_53_[i_54_];
                                int i_60_ = is_52_[i_54_];
                                is[i_54_]
                                        = ((i_60_ ^ 0xffffffff) > (i_59_
                                        ^ 0xffffffff)
                                        ? i_60_ : i_59_);
                            }
                            break while_178_;
                        } while (false);
                        for (i_54_ = 0; Class348_Sub40_Sub6.anInt9139 > i_54_;
                             i_54_++) {
                            int i_61_ = is_53_[i_54_];
                            int i_62_ = is_52_[i_54_];
                            is[i_54_] = i_62_ > i_61_ ? i_62_ : i_61_;
                        }
                        break while_178_;
                    } while (false);
                    for (i_54_ = 0; i_54_ < Class348_Sub40_Sub6.anInt9139;
                         i_54_++) {
                        int i_63_ = is_53_[i_54_];
                        int i_64_ = is_52_[i_54_];
                        is[i_54_]
                                = ((i_64_ ^ 0xffffffff) >= (i_63_ ^ 0xffffffff)
                                ? i_63_ + -i_64_ : i_64_ - i_63_);
                    }
                    break while_178_;
                } while (false);
                for (i_54_ = 0; Class348_Sub40_Sub6.anInt9139 > i_54_;
                     i_54_++) {
                    int i_65_ = is_53_[i_54_];
                    int i_66_ = is_52_[i_54_];
                    is[i_54_]
                            = i_66_ - -i_65_ - (i_66_ * i_65_ >> -1838192565);
                }
            }
        } while (false);
        return is;
    }

    static final void method3088(int i) {
        anInt9228++;
        if (Class76.aClass364_1279 != Class8.aClass364_165 && i == 9) {
            try {
                Class224.method1617((byte) 125, Class79.aClient1367,
                        "tbrefresh");
            } catch (Throwable throwable) {
                /* empty */
            }
        }
    }

    static final void method3089(int i) {
        Class248.anInt3203 = -1;
        Class97.anInt1548 = -1;
        Class334.anInt4155 = -1;
        anInt9222++;
        Class259.anInt3306 = 0;
        int i_67_ = -95 % ((i - -46) / 52);
    }

    static {
        aClass114_9225 = new Class114(28, -2);
    }
}
