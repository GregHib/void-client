/* Class348_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub17 extends Class348 {
    static boolean aBoolean6788 = false;
    static int anInt6789;
    static int anInt6790;
    static long aLong6791 = 0L;
    byte[] aByteArray6792;
    private int[] anIntArray6793;
    static int anInt6794;
    short[] aShortArray6795;
    Class23[] aClass23Array6796;
    int anInt6797;
    byte[] aByteArray6798;
    byte[] aByteArray6799;
    Class348_Sub19_Sub1[] aClass348_Sub19_Sub1Array6800;
    static int anInt6801;
    static Class359[] aClass359Array6802 = new Class359[2048];
    static int anInt6803;

    static final void method2928(boolean bool) {
        if (bool == true) {
            Class258_Sub2.aClass10Array8531 = new Class10[50];
            anInt6790++;
            Class147.anInt2021 = 0;
        }
    }

    static final RuntimeException_Sub1 method2929(Throwable throwable, String string) {
        anInt6789++;
        if (Loader.trace) {
            throwable.printStackTrace();
        }
        RuntimeException_Sub1 runtimeexception_sub1;
        if (throwable instanceof RuntimeException_Sub1) {
            runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
            runtimeexception_sub1.aString4594 += ' ' + string;
        } else runtimeexception_sub1 = new RuntimeException_Sub1(throwable, string);
        return runtimeexception_sub1;
    }

    public static void method2930(byte i) {
        aClass359Array6802 = null;
        int i_0_ = -14 / ((i - 61) / 43);
    }

    static final void method2931(int i, byte i_1_, int[] is, Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1) {
        do {
            try {
                anInt6801++;
                if ((class318_sub1_sub3_sub3_sub1.anIntArray10236) != null) {
                    boolean bool = true;
                    for (int i_2_ = 0; i_2_ < class318_sub1_sub3_sub3_sub1.anIntArray10236.length; i_2_++) {
                        if ((class318_sub1_sub3_sub3_sub1.anIntArray10236[i_2_]) != is[i_2_]) {
                            bool = false;
                            break;
                        }
                    }
                    if (bool && class318_sub1_sub3_sub3_sub1.anInt10286 != -1) {
                        Class17 class17 = (Class10.aClass87_191.method835(class318_sub1_sub3_sub3_sub1.anInt10286, 7));
                        int i_3_ = class17.anInt248;
                        if (i_3_ == 1) {
                            class318_sub1_sub3_sub3_sub1.anInt10232 = 0;
                            class318_sub1_sub3_sub3_sub1.anInt10218 = i;
                            class318_sub1_sub3_sub3_sub1.anInt10294 = 0;
                            class318_sub1_sub3_sub3_sub1.anInt10267 = 0;
                            class318_sub1_sub3_sub3_sub1.anInt10244 = 1;
                            if (!class318_sub1_sub3_sub3_sub1.aBoolean10309) Class287.method2178(class318_sub1_sub3_sub3_sub1, class318_sub1_sub3_sub3_sub1.anInt10267, class17, -72);
                        }
                        if (i_3_ == 2) class318_sub1_sub3_sub3_sub1.anInt10294 = 0;
                    }
                }
                boolean bool = true;
                for (int i_4_ = 0; is.length > i_4_; i_4_++) {
                    if (is[i_4_] != -1) bool = false;
                    if (class318_sub1_sub3_sub3_sub1.anIntArray10236 == null || (class318_sub1_sub3_sub3_sub1.anIntArray10236[i_4_]) == -1 || (Class10.aClass87_191.method835(is[i_4_], 7).anInt239 >= Class10.aClass87_191.method835((class318_sub1_sub3_sub3_sub1.anIntArray10236[i_4_]), 7).anInt239)) {
                        class318_sub1_sub3_sub3_sub1.anInt10218 = i;
                        class318_sub1_sub3_sub3_sub1.anInt10322 = class318_sub1_sub3_sub3_sub1.anInt10319;
                        class318_sub1_sub3_sub3_sub1.anIntArray10236 = is;
                    }
                }
                if (i_1_ <= 31) method2931(-66, (byte) 125, null, null);
                if (!bool) break;
                class318_sub1_sub3_sub3_sub1.anIntArray10236 = is;
                class318_sub1_sub3_sub3_sub1.anInt10218 = i;
                class318_sub1_sub3_sub3_sub1.anInt10322 = (class318_sub1_sub3_sub3_sub1.anInt10319);
            } catch (RuntimeException runtimeexception) {
                throw method2929(runtimeexception, ("jf.E(" + i + ',' + i_1_ + ',' + (is != null ? "{...}" : "null") + ',' + (class318_sub1_sub3_sub3_sub1 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final boolean method2932(Class26 class26, int[] is, byte[] is_5_, int i) {
        try {
            anInt6803++;
            boolean bool = true;
            int i_6_ = 0;
            Class348_Sub19_Sub1 class348_sub19_sub1 = null;
            for (int i_7_ = i; i_7_ < 128; i_7_++) {
                if (is_5_ == null || is_5_[i_7_] != 0) {
                    int i_8_ = anIntArray6793[i_7_];
                    if (i_8_ != 0) {
                        if (i_8_ != i_6_) {
                            i_6_ = i_8_;
                            if ((--i_8_ & 0x1) == 0) class348_sub19_sub1 = class26.method308(i_8_ >> 2, is, -2);
                            else class348_sub19_sub1 = class26.method309(is, i_8_ >> 2, -1);
                            if (class348_sub19_sub1 == null) bool = false;
                        }
                        if (class348_sub19_sub1 != null) {
                            this.aClass348_Sub19_Sub1Array6800[i_7_] = class348_sub19_sub1;
                            anIntArray6793[i_7_] = 0;
                        }
                    }
                }
            }
            return bool;
        } catch (RuntimeException runtimeexception) {
            throw method2929(runtimeexception, ("jf.B(" + (class26 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + (is_5_ != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    final void method2933(byte i) {
        anInt6794++;
        if (i >= -65) this.aClass23Array6796 = null;
        anIntArray6793 = null;
    }

    public Class348_Sub17() {
        /* empty */
    }

    Class348_Sub17(byte[] is) {
        this.aShortArray6795 = new short[128];
        this.aByteArray6792 = new byte[128];
        this.aByteArray6798 = new byte[128];
        this.aByteArray6799 = new byte[128];
        this.aClass348_Sub19_Sub1Array6800 = new Class348_Sub19_Sub1[128];
        this.aClass23Array6796 = new Class23[128];
        anIntArray6793 = new int[128];
        Class348_Sub49 class348_sub49 = new Class348_Sub49(is);
        int i;
        for (i = 0; ((class348_sub49.aByteArray7154[i + class348_sub49.anInt7197]) != 0); i++) {
            /* empty */
        }
        byte[] is_9_ = new byte[i];
        for (int i_10_ = 0; i > i_10_; i_10_++)
            is_9_[i_10_] = class348_sub49.readByte(-128);
        class348_sub49.anInt7197++;
        i++;
        int i_11_ = class348_sub49.anInt7197;
        class348_sub49.anInt7197 += i;
        int i_12_;
        for (i_12_ = 0; ((class348_sub49.aByteArray7154[i_12_ + class348_sub49.anInt7197]) != 0); i_12_++) {
            /* empty */
        }
        byte[] is_13_ = new byte[i_12_];
        for (int i_14_ = 0; i_12_ > i_14_; i_14_++)
            is_13_[i_14_] = class348_sub49.readByte(-81);
        i_12_++;
        class348_sub49.anInt7197++;
        int i_15_ = class348_sub49.anInt7197;
        class348_sub49.anInt7197 += i_12_;
        int i_16_;
        for (i_16_ = 0; ((class348_sub49.aByteArray7154[class348_sub49.anInt7197 + i_16_]) != 0); i_16_++) {
            /* empty */
        }
        byte[] is_17_ = new byte[i_16_];
        for (int i_18_ = 0; i_16_ > i_18_; i_18_++)
            is_17_[i_18_] = class348_sub49.readByte(-82);
        class348_sub49.anInt7197++;
        byte[] is_19_ = new byte[++i_16_];
        int i_20_;
        if (i_16_ > 1) {
            is_19_[1] = (byte) 1;
            i_20_ = 2;
            int i_21_ = 1;
            for (int i_22_ = 2; i_16_ > i_22_; i_22_++) {
                int i_23_ = class348_sub49.readUnsignedByte(255);
                if (i_23_ == 0) i_21_ = i_20_++;
                else {
                    if (i_23_ <= i_21_) i_23_--;
                    i_21_ = i_23_;
                }
                is_19_[i_22_] = (byte) i_21_;
            }
        } else i_20_ = i_16_;
        Class23[] class23s = new Class23[i_20_];
        for (int i_24_ = 0; i_24_ < class23s.length; i_24_++) {
            Class23 class23 = class23s[i_24_] = new Class23();
            int i_25_ = class348_sub49.readUnsignedByte(255);
            if (i_25_ > 0) class23.aByteArray348 = new byte[i_25_ * 2];
            i_25_ = class348_sub49.readUnsignedByte(255);
            if (i_25_ > 0) {
                class23.aByteArray344 = new byte[i_25_ * 2 + 2];
                class23.aByteArray344[1] = (byte) 64;
            }
        }
        int i_26_ = class348_sub49.readUnsignedByte(255);
        byte[] is_27_ = i_26_ > 0 ? new byte[i_26_ * 2] : null;
        i_26_ = class348_sub49.readUnsignedByte(255);
        byte[] is_28_ = i_26_ > 0 ? new byte[2 * i_26_] : null;
        int i_29_;
        for (i_29_ = 0; ((class348_sub49.aByteArray7154[class348_sub49.anInt7197 - -i_29_]) != 0); i_29_++) {
            /* empty */
        }
        byte[] is_30_ = new byte[i_29_];
        for (int i_31_ = 0; i_29_ > i_31_; i_31_++)
            is_30_[i_31_] = class348_sub49.readByte(-108);
        class348_sub49.anInt7197++;
        i_29_++;
        int i_32_ = 0;
        for (int i_33_ = 0; i_33_ < 128; i_33_++) {
            i_32_ += class348_sub49.readUnsignedByte(255);
            this.aShortArray6795[i_33_] = (short) i_32_;
        }
        i_32_ = 0;
        for (int i_34_ = 0; i_34_ < 128; i_34_++) {
            i_32_ += class348_sub49.readUnsignedByte(255);
            this.aShortArray6795[i_34_] += i_32_ << 8;
        }
        int i_35_ = 0;
        int i_36_ = 0;
        int i_37_ = 0;
        for (int i_38_ = 0; i_38_ < 128; i_38_++) {
            if (i_35_ == 0) {
                if (i_36_ < is_30_.length) i_35_ = is_30_[i_36_++];
                else i_35_ = -1;
                i_37_ = class348_sub49.method3366((byte) 124);
            }
            this.aShortArray6795[i_38_] += Class139.method1166(32768, i_37_ + -1 << 14);
            i_35_--;
            anIntArray6793[i_38_] = i_37_;
        }
        i_36_ = 0;
        i_35_ = 0;
        int i_39_ = 0;
        for (int i_40_ = 0; i_40_ < 128; i_40_++) {
            if (anIntArray6793[i_40_] != 0) {
                if (i_35_ == 0) {
                    i_39_ = -1 + (class348_sub49.aByteArray7154[i_11_++]);
                    if (i_36_ < is_9_.length) i_35_ = is_9_[i_36_++];
                    else i_35_ = -1;
                }
                i_35_--;
                this.aByteArray6798[i_40_] = (byte) i_39_;
            }
        }
        i_36_ = 0;
        i_35_ = 0;
        int i_41_ = 0;
        for (int i_42_ = 0; i_42_ < 128; i_42_++) {
            if (anIntArray6793[i_42_] != 0) {
                if (i_35_ == 0) {
                    if (i_36_ >= is_13_.length) i_35_ = -1;
                    else i_35_ = is_13_[i_36_++];
                    i_41_ = 16 + (class348_sub49.aByteArray7154[i_15_++]) << 2;
                }
                i_35_--;
                this.aByteArray6792[i_42_] = (byte) i_41_;
            }
        }
        i_35_ = 0;
        i_36_ = 0;
        Class23 class23 = null;
        for (int i_43_ = 0; i_43_ < 128; i_43_++) {
            if (anIntArray6793[i_43_] != 0) {
                if (i_35_ == 0) {
                    class23 = class23s[is_19_[i_36_]];
                    if (i_36_ < is_17_.length) i_35_ = is_17_[i_36_++];
                    else i_35_ = -1;
                }
                i_35_--;
                this.aClass23Array6796[i_43_] = class23;
            }
        }
        i_35_ = 0;
        i_36_ = 0;
        int i_44_ = 0;
        for (int i_45_ = 0; i_45_ < 128; i_45_++) {
            if (i_35_ == 0) {
                if (is_30_.length > i_36_) i_35_ = is_30_[i_36_++];
                else i_35_ = -1;
                if (anIntArray6793[i_45_] > 0) i_44_ = class348_sub49.readUnsignedByte(255) + 1;
            }
            this.aByteArray6799[i_45_] = (byte) i_44_;
            i_35_--;
        }
        this.anInt6797 = class348_sub49.readUnsignedByte(255) - -1;
        for (int i_46_ = 0; i_20_ > i_46_; i_46_++) {
            Class23 class23_47_ = class23s[i_46_];
            if (class23_47_.aByteArray348 != null) {
                for (int i_48_ = 1; i_48_ < class23_47_.aByteArray348.length; i_48_ += 2)
                    class23_47_.aByteArray348[i_48_] = class348_sub49.readByte(-93);
            }
            if (class23_47_.aByteArray344 != null) {
                for (int i_49_ = 3; -2 + class23_47_.aByteArray344.length > i_49_; i_49_ += 2)
                    class23_47_.aByteArray344[i_49_] = class348_sub49.readByte(-89);
            }
        }
        if (is_27_ != null) {
            for (int i_50_ = 1; i_50_ < is_27_.length; i_50_ += 2)
                is_27_[i_50_] = class348_sub49.readByte(-82);
        }
        if (is_28_ != null) {
            for (int i_51_ = 1; is_28_.length > i_51_; i_51_ += 2)
                is_28_[i_51_] = class348_sub49.readByte(-126);
        }
        for (int i_52_ = 0; i_52_ < i_20_; i_52_++) {
            Class23 class23_53_ = class23s[i_52_];
            if (class23_53_.aByteArray344 != null) {
                i_32_ = 0;
                for (int i_54_ = 2; i_54_ < class23_53_.aByteArray344.length; i_54_ += 2) {
                    i_32_ = 1 + i_32_ - -class348_sub49.readUnsignedByte(255);
                    class23_53_.aByteArray344[i_54_] = (byte) i_32_;
                }
            }
        }
        for (int i_55_ = 0; i_20_ > i_55_; i_55_++) {
            Class23 class23_56_ = class23s[i_55_];
            if (class23_56_.aByteArray348 != null) {
                i_32_ = 0;
                for (int i_57_ = 2; i_57_ < class23_56_.aByteArray348.length; i_57_ += 2) {
                    i_32_ = 1 + (i_32_ - -class348_sub49.readUnsignedByte(255));
                    class23_56_.aByteArray348[i_57_] = (byte) i_32_;
                }
            }
        }
        if (is_27_ != null) {
            i_32_ = class348_sub49.readUnsignedByte(255);
            is_27_[0] = (byte) i_32_;
            for (int i_58_ = 2; i_58_ < is_27_.length; i_58_ += 2) {
                i_32_ = 1 + (i_32_ - -class348_sub49.readUnsignedByte(255));
                is_27_[i_58_] = (byte) i_32_;
            }
            int i_59_ = is_27_[0];
            int i_60_ = is_27_[1];
            for (int i_61_ = 0; i_59_ > i_61_; i_61_++)
                this.aByteArray6799[i_61_] = (byte) (32 + i_60_ * (this.aByteArray6799[i_61_]) >> 6);
            int i_62_ = 2;
            while (is_27_.length > i_62_) {
                int i_63_ = is_27_[i_62_];
                int i_64_ = is_27_[1 + i_62_];
                int i_65_ = (-i_59_ + i_63_) / 2 + (-i_59_ + i_63_) * i_60_;
                for (int i_66_ = i_59_; i_66_ < i_63_; i_66_++) {
                    int i_67_ = Class254.method1928(-i_59_ + i_63_, -110, i_65_);
                    this.aByteArray6799[i_66_] = (byte) (32 + (this.aByteArray6799[i_66_]) * i_67_ >> 6);
                    i_65_ += -i_60_ + i_64_;
                }
                i_59_ = i_63_;
                i_62_ += 2;
                i_60_ = i_64_;
            }
            for (int i_68_ = i_59_; i_68_ < 128; i_68_++)
                this.aByteArray6799[i_68_] = (byte) (32 + i_60_ * (this.aByteArray6799[i_68_]) >> 6);
            Object object = null;
        }
        if (is_28_ != null) {
            i_32_ = class348_sub49.readUnsignedByte(255);
            is_28_[0] = (byte) i_32_;
            for (int i_69_ = 2; i_69_ < is_28_.length; i_69_ += 2) {
                i_32_ = class348_sub49.readUnsignedByte(255) + (1 + i_32_);
                is_28_[i_69_] = (byte) i_32_;
            }
            int i_70_ = is_28_[0];
            int i_71_ = is_28_[1] << 1;
            for (int i_72_ = 0; i_70_ > i_72_; i_72_++) {
                int i_73_ = ((this.aByteArray6792[i_72_] & 0xff) + i_71_);
                if (i_73_ < 0) i_73_ = 0;
                if (i_73_ > 128) i_73_ = 128;
                this.aByteArray6792[i_72_] = (byte) i_73_;
            }
            for (int i_74_ = 2; is_28_.length > i_74_; i_74_ += 2) {
                int i_75_ = is_28_[i_74_];
                int i_76_ = is_28_[i_74_ - -1] << 1;
                int i_77_ = (-i_70_ + i_75_) * i_71_ + (-i_70_ + i_75_) / 2;
                for (int i_78_ = i_70_; i_75_ > i_78_; i_78_++) {
                    int i_79_ = Class254.method1928(-i_70_ + i_75_, -34, i_77_);
                    int i_80_ = ((0xff & this.aByteArray6792[i_78_]) + i_79_);
                    if (i_80_ < 0) i_80_ = 0;
                    if (i_80_ > 128) i_80_ = 128;
                    this.aByteArray6792[i_78_] = (byte) i_80_;
                    i_77_ += -i_71_ + i_76_;
                }
                i_71_ = i_76_;
                i_70_ = i_75_;
            }
            Object object = null;
            for (int i_81_ = i_70_; i_81_ < 128; i_81_++) {
                int i_82_ = i_71_ + (this.aByteArray6792[i_81_] & 0xff);
                if (i_82_ < 0) i_82_ = 0;
                if (i_82_ > 128) i_82_ = 128;
                this.aByteArray6792[i_81_] = (byte) i_82_;
            }
        }
        for (int i_83_ = 0; i_20_ > i_83_; i_83_++)
            class23s[i_83_].anInt347 = class348_sub49.readUnsignedByte(255);
        for (int i_84_ = 0; i_84_ < i_20_; i_84_++) {
            Class23 class23_85_ = class23s[i_84_];
            if (class23_85_.aByteArray348 != null) class23_85_.anInt345 = class348_sub49.readUnsignedByte(255);
            if (class23_85_.aByteArray344 != null) class23_85_.anInt349 = class348_sub49.readUnsignedByte(255);
            if (class23_85_.anInt347 > 0) class23_85_.anInt350 = class348_sub49.readUnsignedByte(255);
        }
        for (int i_86_ = 0; i_20_ > i_86_; i_86_++)
            class23s[i_86_].anInt352 = class348_sub49.readUnsignedByte(255);
        for (int i_87_ = 0; i_87_ < i_20_; i_87_++) {
            Class23 class23_88_ = class23s[i_87_];
            if (class23_88_.anInt352 > 0) class23_88_.anInt353 = class348_sub49.readUnsignedByte(255);
        }
        for (int i_89_ = 0; i_20_ > i_89_; i_89_++) {
            Class23 class23_90_ = class23s[i_89_];
            if (class23_90_.anInt353 > 0) class23_90_.anInt346 = class348_sub49.readUnsignedByte(255);
        }
    }
}
