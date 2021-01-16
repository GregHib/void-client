/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class45 {
    static int anInt626;
    static int anInt627;
    static int anInt628;
    private Class291 aClass291_629 = null;
    static int anInt630;
    static int anInt631;
    static int anInt632;
    static int anInt633;
    int anInt634;
    static int anInt635;
    static int anInt636;
    static int anInt637;
    static int anInt638;
    static int anInt639;
    static int anInt640;
    static int anInt641;
    static int anInt642;
    static Class351 aClass351_643 = new Class351(3, -1);
    static int anInt644;
    static int anInt645;
    static int anInt646;
    static int anInt647;
    static int anInt648;
    static int anInt649;
    static int anInt650;
    static int anInt651;
    static int anInt652;
    static int anInt653;
    static int anInt654;
    private final boolean aBoolean655;
    private Object[] anObjectArray656;
    static int anInt657;
    static int anInt658;
    private Class314 aClass314_659;
    static int anInt660;
    static int anInt661;
    static int anInt662;
    static int anInt663;
    private Object[][] anObjectArrayArray664;
    static int anInt665;
    static int anInt666;
    static long aLong667;
    static int anInt668;
    static int anInt669 = 0;
    static float aFloat670;

    final int method389(int i) {
        int i_0_ = -117 / ((-60 - i) / 33);
        anInt657++;
        if (!method399(false))
            throw new IllegalStateException("");
        return aClass291_629.anInt3719;
    }

    public static void method390(byte i) {
        aClass351_643 = null;
        if (i != 10)
            method390((byte) -3);
    }

    final byte[] method391(String string, String string_1_, int i) {
        try {
            anInt647++;
            if (!method399(false))
                return null;
            string = string.toLowerCase();
            string_1_ = string_1_.toLowerCase();
            int i_2_ = aClass291_629.aClass316_3723
                    .method2365(1, Class281.method2108(string, -29286));
            if (!method392(i_2_, (byte) -40))
                return null;
            if (i != -29832)
                method392(22, (byte) 12);
            int i_3_ = (aClass291_629.aClass316Array3728[i_2_]
                    .method2365
                            (i ^ ~0x7486, Class281.method2108(string_1_, -29286)));
            return method410(-1860, i_2_, i_3_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("in.EA("
                            + (string != null ? "{...}"
                            : "null")
                            + ','
                            + (string_1_ != null ? "{...}"
                            : "null")
                            + ',' + i + ')'));
        }
    }

    private final boolean method392(int i, byte i_4_) {
        anInt646++;
        if (!method399(false))
            return false;
        if ((i ^ 0xffffffff) > -1
                || aClass291_629.anIntArray3724.length <= i
                || ((aClass291_629.anIntArray3724[i] ^ 0xffffffff)
                == -1)) {
            if (Class285.aBoolean4741)
                throw new IllegalArgumentException(Integer.toString(i));
            return false;
        }
        return i_4_ == -40;
    }

    final byte[] method393(int i, int i_5_, int i_6_, int[] is) {
        anInt639++;
        if (i_6_ != 2)
            anInt669 = 51;
        if (!method418(i_5_, i_6_ + -2, i))
            return null;
        if (anObjectArrayArray664[i] == null
                || anObjectArrayArray664[i][i_5_] == null) {
            boolean bool = method394(i_5_, (byte) -78, is, i);
            if (!bool) {
                method406(i, -117);
                bool = method394(i_5_, (byte) -103, is, i);
                if (!bool)
                    return null;
            }
        }
        byte[] is_7_
                = Class50_Sub1.method461(false, anObjectArrayArray664[i][i_5_],
                53146732);
        if ((this.anInt634 ^ 0xffffffff) == -2) {
            anObjectArrayArray664[i][i_5_] = null;
            if ((aClass291_629.anIntArray3724[i] ^ 0xffffffff)
                    == -2)
                anObjectArrayArray664[i] = null;
        } else if (this.anInt634 == 2)
            anObjectArrayArray664[i] = null;
        return is_7_;
    }

    private final boolean method394(int i, byte i_8_, int[] is, int i_9_) {
        anInt628++;
        if (!method392(i_9_, (byte) -40))
            return false;
        if (anObjectArray656[i_9_] == null)
            return false;
        int i_10_ = aClass291_629.anIntArray3725[i_9_];
        int[] is_11_ = aClass291_629.anIntArrayArray3721[i_9_];
        if (anObjectArrayArray664[i_9_] == null)
            anObjectArrayArray664[i_9_]
                    = new Object[aClass291_629.anIntArray3724[i_9_]];
        Object[] objects = anObjectArrayArray664[i_9_];
        boolean bool = true;
        for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff);
             i_12_++) {
            int i_13_;
            if (is_11_ == null)
                i_13_ = i_12_;
            else
                i_13_ = is_11_[i_12_];
            if (objects[i_13_] == null) {
                bool = false;
                break;
            }
        }
        if (bool)
            return true;
        byte[] is_14_;
        if (is == null
                || ((is[0] ^ 0xffffffff) == -1 && (is[1] ^ 0xffffffff) == -1
                && (is[2] ^ 0xffffffff) == -1 && (is[3] ^ 0xffffffff) == -1))
            is_14_ = Class50_Sub1.method461(false, anObjectArray656[i_9_],
                    53146732);
        else {
            is_14_ = Class50_Sub1.method461(true, anObjectArray656[i_9_],
                    53146732);
            Class348_Sub49 class348_sub49 = new Class348_Sub49(is_14_);
            class348_sub49.method3367(607818341, is, 5,
                    (class348_sub49
                            .aByteArray7154).length);
        }
        byte[] is_15_;
        try {
            is_15_ = Class348_Sub41.method3158(is_14_, -120);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("T3 - " + (is != null) + "," + i_9_ + ","
                                    + is_14_.length + ","
                                    + Class59_Sub1.method554(5126, is_14_.length, is_14_)
                                    + ","
                                    + Class59_Sub1.method554(5126, -2 + is_14_.length,
                                    is_14_)
                                    + "," + aClass291_629.anIntArray3729[i_9_]
                                    + "," + aClass291_629.anInt3719));
        }
        if (aBoolean655)
            anObjectArray656[i_9_] = null;
        if (i_8_ >= -17)
            method415((byte) 70, -7);
        if ((i_10_ ^ 0xffffffff) < -2) {
            if (this.anInt634 != 2) {
                int i_16_ = is_15_.length;
                int i_17_ = 0xff & is_15_[--i_16_];
                i_16_ -= 4 * (i_10_ * i_17_);
                Class348_Sub49 class348_sub49 = new Class348_Sub49(is_15_);
                int[] is_18_ = new int[i_10_];
                class348_sub49.anInt7197 = i_16_;
                for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
                    int i_20_ = 0;
                    for (int i_21_ = 0; i_21_ < i_10_; i_21_++) {
                        i_20_ += class348_sub49.method3385((byte) -126);
                        is_18_[i_21_] += i_20_;
                    }
                }
                byte[][] is_22_ = new byte[i_10_][];
                for (int i_23_ = 0;
                     (i_23_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff); i_23_++) {
                    is_22_[i_23_] = new byte[is_18_[i_23_]];
                    is_18_[i_23_] = 0;
                }
                class348_sub49.anInt7197 = i_16_;
                int i_24_ = 0;
                for (int i_25_ = 0;
                     (i_17_ ^ 0xffffffff) < (i_25_ ^ 0xffffffff); i_25_++) {
                    int i_26_ = 0;
                    for (int i_27_ = 0; i_10_ > i_27_; i_27_++) {
                        i_26_ += class348_sub49.method3385((byte) -126);
                        Class214.method1577(is_15_, i_24_, is_22_[i_27_],
                                is_18_[i_27_], i_26_);
                        i_24_ += i_26_;
                        is_18_[i_27_] += i_26_;
                    }
                }
                for (int i_28_ = 0; i_10_ > i_28_; i_28_++) {
                    int i_29_;
                    if (is_11_ == null)
                        i_29_ = i_28_;
                    else
                        i_29_ = is_11_[i_28_];
                    if ((this.anInt634 ^ 0xffffffff) != -1)
                        objects[i_29_] = is_22_[i_28_];
                    else
                        objects[i_29_]
                                = Class179.method1357(is_22_[i_28_], false,
                                (byte) 126);
                }
            } else {
                int i_30_ = is_15_.length;
                int i_31_ = 0xff & is_15_[--i_30_];
                i_30_ -= 4 * (i_31_ * i_10_);
                Class348_Sub49 class348_sub49 = new Class348_Sub49(is_15_);
                int i_32_ = 0;
                int i_33_ = 0;
                class348_sub49.anInt7197 = i_30_;
                for (int i_34_ = 0;
                     (i_31_ ^ 0xffffffff) < (i_34_ ^ 0xffffffff); i_34_++) {
                    int i_35_ = 0;
                    for (int i_36_ = 0; i_36_ < i_10_; i_36_++) {
                        i_35_ += class348_sub49.method3385((byte) -126);
                        int i_37_;
                        if (is_11_ == null)
                            i_37_ = i_36_;
                        else
                            i_37_ = is_11_[i_36_];
                        if ((i_37_ ^ 0xffffffff) == (i ^ 0xffffffff)) {
                            i_33_ = i_37_;
                            i_32_ += i_35_;
                        }
                    }
                }
                if ((i_32_ ^ 0xffffffff) == -1)
                    return true;
                byte[] is_38_ = new byte[i_32_];
                class348_sub49.anInt7197 = i_30_;
                i_32_ = 0;
                int i_39_ = 0;
                for (int i_40_ = 0; i_40_ < i_31_; i_40_++) {
                    int i_41_ = 0;
                    for (int i_42_ = 0; i_42_ < i_10_; i_42_++) {
                        i_41_ += class348_sub49.method3385((byte) -126);
                        int i_43_;
                        if (is_11_ != null)
                            i_43_ = is_11_[i_42_];
                        else
                            i_43_ = i_42_;
                        if (i_43_ == i) {
                            Class214.method1577(is_15_, i_39_, is_38_, i_32_,
                                    i_41_);
                            i_32_ += i_41_;
                        }
                        i_39_ += i_41_;
                    }
                }
                objects[i_33_] = is_38_;
            }
        } else {
            int i_44_;
            if (is_11_ != null)
                i_44_ = is_11_[0];
            else
                i_44_ = 0;
            if ((this.anInt634 ^ 0xffffffff) != -1)
                objects[i_44_] = is_15_;
            else
                objects[i_44_]
                        = Class179.method1357(is_15_, false, (byte) 104);
        }
        return true;
    }

    static final void method395(int i) throws Exception_Sub1 {
        if (Class348_Sub49.anInt7207 == 1)
            Class21.aHa326.method3626(Class339.anInt4211,
                    Class348_Sub40_Sub8.anInt9157);
        else
            Class21.aHa326.method3626(0, 0);
        if (i >= 73)
            anInt642++;
    }

    final int[] method396(int i, int i_45_) {
        anInt640++;
        if (i_45_ != 0)
            method389(-55);
        if (!method392(i, (byte) -40))
            return null;
        int[] is = aClass291_629.anIntArrayArray3721[i];
        if (is == null) {
            is = new int[aClass291_629.anIntArray3725[i]];
            for (int i_46_ = 0; i_46_ < is.length; i_46_++)
                is[i_46_] = i_46_;
        }
        return is;
    }

    final int method397(String string, int i) {
        anInt633++;
        if (!method399(false))
            return 0;
        string = string.toLowerCase();
        if (i != 0)
            aClass314_659 = null;
        int i_47_
                = aClass291_629.aClass316_3723
                .method2365(1, Class281.method2108(string, i ^ ~0x7265));
        return method419(i, i_47_);
    }

    final int method398(byte i) {
        anInt641++;
        if (!method399(false))
            return 0;
        int i_48_ = 0;
        int i_49_ = 0;
        int i_50_ = 0;
        if (i != -31)
            return 50;
        for (/**/; anObjectArray656.length > i_50_; i_50_++) {
            if ((aClass291_629.anIntArray3725[i_50_] ^ 0xffffffff)
                    < -1) {
                i_49_ += method419(0, i_50_);
                i_48_ += 100;
            }
        }
        if ((i_48_ ^ 0xffffffff) == -1)
            return 100;
        int i_51_ = i_49_ * 100 / i_48_;
        return i_51_;
    }

    private final boolean method399(boolean bool) {
        anInt652++;
        if (aClass291_629 == null) {
            aClass291_629 = aClass314_659.method2340((byte) 56);
            if (aClass291_629 == null)
                return false;
            anObjectArray656
                    = new Object[aClass291_629.anInt3734];
            anObjectArrayArray664
                    = new Object[aClass291_629.anInt3734][];
        }
        if (bool != false)
            aClass314_659 = null;
        return true;
    }

    final boolean method400(int i, String string) {
        anInt635++;
        if (!method399(false))
            return false;
        if (i != -18308)
            return false;
        string = string.toLowerCase();
        int i_52_ = aClass291_629.aClass316_3723
                .method2365(1, Class281.method2108(string, -29286));
        return (i_52_ ^ 0xffffffff) <= -1;
    }

    final boolean method401(int i) {
        anInt648++;
        if (!method399(false))
            return false;
        boolean bool = true;
        for (int i_53_ = 0;
             ((aClass291_629.anIntArray3738.length ^ 0xffffffff)
                     < (i_53_ ^ 0xffffffff));
             i_53_++) {
            int i_54_ = aClass291_629.anIntArray3738[i_53_];
            if (anObjectArray656[i_54_] == null) {
                method406(i_54_, -128);
                if (anObjectArray656[i_54_] == null)
                    bool = false;
            }
        }
        if (i < 33)
            method407(100, -92);
        return bool;
    }

    private final void method402(byte i, int i_55_) {
        anInt658++;
        if (i < -70)
            aClass314_659.method2338((byte) -52, i_55_);
    }

    private final boolean method403(String string, int i, String string_56_) {
        try {
            anInt626++;
            if (!method399(false))
                return false;
            string = string.toLowerCase();
            string_56_ = string_56_.toLowerCase();
            int i_57_ = (aClass291_629.aClass316_3723.method2365
                    (i ^ 0x1c1a, Class281.method2108(string, -29286)));
            if (i != 7195)
                method403(null, -20, null);
            if (!method392(i_57_, (byte) -40))
                return false;
            int i_58_
                    = aClass291_629.aClass316Array3728[i_57_]
                    .method2365(1, Class281.method2108(string_56_, -29286));
            return method420(i + -17694, i_57_, i_58_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("in.Q("
                            + (string != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (string_56_ != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    final void method404(int i, boolean bool, boolean bool_59_) {
        anInt644++;
        if (i != 0)
            method391(null, null, -3);
        if (method399(false)) {
            if (bool_59_) {
                aClass291_629.anIntArray3733 = null;
                aClass291_629.aClass316_3723 = null;
            }
            if (bool) {
                aClass291_629.anIntArrayArray3735 = null;
                aClass291_629.aClass316Array3728 = null;
            }
        }
    }

    final void method405(int i) {
        anInt650++;
        if (i != 0)
            method416((byte) -45, null);
        if (anObjectArray656 != null) {
            for (int i_60_ = 0; i_60_ < anObjectArray656.length; i_60_++)
                anObjectArray656[i_60_] = null;
        }
    }

    private final void method406(int i, int i_61_) {
        if (i_61_ > -105)
            anObjectArrayArray664 = null;
        if (!aBoolean655)
            anObjectArray656[i]
                    = Class179.method1357(aClass314_659.method2339(i, (byte) 73),
                    false, (byte) 123);
        else
            anObjectArray656[i] = aClass314_659.method2339(i, (byte) 12);
        anInt665++;
    }

    final int method407(int i, int i_62_) {
        if (i != 0)
            method389(-61);
        anInt645++;
        if (!method392(i_62_, (byte) -40))
            return 0;
        return aClass291_629.anIntArray3724[i_62_];
    }

    final boolean method408(byte i, int i_63_) {
        anInt632++;
        if (!method392(i_63_, (byte) -40))
            return false;
        if (anObjectArray656[i_63_] != null)
            return true;
        method406(i_63_, -124);
        if (anObjectArray656[i_63_] != null)
            return true;
        if (i > -112)
            this.anInt634 = -26;
        return false;
    }

    final void method409(String string, boolean bool) {
        anInt663++;
        if (bool == true && method399(false)) {
            string = string.toLowerCase();
            int i = aClass291_629.aClass316_3723
                    .method2365(1, Class281.method2108(string, -29286));
            method402((byte) -86, i);
        }
    }

    final byte[] method410(int i, int i_64_, int i_65_) {
        if (i != -1860)
            anObjectArrayArray664 = null;
        anInt651++;
        return method393(i_64_, i_65_, i ^ ~0x741, null);
    }

    final void method411(int i, int i_66_) {
        anInt627++;
        if (i_66_ > -9)
            method394(-111, (byte) -98, null, -71);
        if (method392(i, (byte) -40)) {
            if (anObjectArrayArray664 != null)
                anObjectArrayArray664[i] = null;
        }
    }

    final void method412(byte i) {
        if (anObjectArrayArray664 != null) {
            for (int i_67_ = 0; anObjectArrayArray664.length > i_67_; i_67_++)
                anObjectArrayArray664[i_67_] = null;
        }
        int i_68_ = 52 % ((-46 - i) / 62);
        anInt660++;
    }

    final boolean method413(int i, String string) {
        anInt636++;
        if (!method399(false))
            return false;
        string = string.toLowerCase();
        int i_69_
                = aClass291_629.aClass316_3723
                .method2365(i + -99, Class281.method2108(string, -29286));
        if (i != 100)
            aFloat670 = 0.37849286F;
        return method408((byte) -120, i_69_);
    }

    final int method414(int i) {
        anInt637++;
        if (i != -1)
            return 49;
        if (!method399(false))
            return -1;
        return aClass291_629.anIntArray3724.length;
    }

    final byte[] method415(byte i, int i_70_) {
        anInt630++;
        if (!method399(false))
            return null;
        if (aClass291_629.anIntArray3724.length == 1)
            return method410(i ^ ~0x70a, 0, i_70_);
        if (!method392(i_70_, (byte) -40))
            return null;
        if (i != 73)
            anObjectArrayArray664 = null;
        if ((aClass291_629.anIntArray3724[i_70_] ^ 0xffffffff)
                == -2)
            return method410(i ^ ~0x70a, i_70_, 0);
        throw new RuntimeException();
    }

    final boolean method416(byte i, String string) {
        anInt631++;
        int i_71_ = method417("", i + 74);
        if ((i_71_ ^ 0xffffffff) != 0)
            return method403("", 7195, string);
        if (i != -74)
            return false;
        return method403(string, 7195, "");
    }

    final int method417(String string, int i) {
        if (i != 0)
            return 113;
        anInt654++;
        if (!method399(false))
            return -1;
        string = string.toLowerCase();
        int i_72_ = aClass291_629.aClass316_3723
                .method2365(1, Class281.method2108(string, -29286));
        if (!method392(i_72_, (byte) -40))
            return -1;
        return i_72_;
    }

    private final boolean method418(int i, int i_73_, int i_74_) {
        anInt662++;
        if (!method399(false))
            return false;
        if (i_74_ < i_73_ || (i ^ 0xffffffff) > -1
                || ((i_74_ ^ 0xffffffff)
                <= (aClass291_629.anIntArray3724.length
                ^ 0xffffffff))
                || ((i ^ 0xffffffff)
                <= (aClass291_629.anIntArray3724[i_74_]
                ^ 0xffffffff))) {
            if (Class285.aBoolean4741)
                throw new IllegalArgumentException(i_74_ + ","
                        + i);
            return false;
        }
        return true;
    }

    private final int method419(int i, int i_75_) {
        if (i != 0)
            return -117;
        anInt653++;
        if (!method392(i_75_, (byte) -40))
            return 0;
        if (anObjectArray656[i_75_] != null)
            return 100;
        return aClass314_659.method2335(i_75_, i + -22197);
    }

    final boolean method420(int i, int i_76_, int i_77_) {
        anInt638++;
        if (!method418(i_77_, 0, i_76_))
            return false;
        if (anObjectArrayArray664[i_76_] != null
                && anObjectArrayArray664[i_76_][i_77_] != null)
            return true;
        if (i != -10499)
            return true;
        if (anObjectArray656[i_76_] != null)
            return true;
        method406(i_76_, -125);
        return anObjectArray656[i_76_] != null;
    }

    final boolean method421(boolean bool, int i) {
        anInt661++;
        if (!method399(bool))
            return false;
        if (aClass291_629.anIntArray3724.length == 1)
            return method420(-10499, 0, i);
        if (!method392(i, (byte) -40))
            return false;
        if (aClass291_629.anIntArray3724[i] == 1)
            return method420(-10499, i, 0);
        if (bool != false)
            return false;
        throw new RuntimeException();
    }

    final boolean method422(String string, String string_78_, int i) {
        try {
            anInt668++;
            if (!method399(false))
                return false;
            string_78_ = string_78_.toLowerCase();
            if (i > -18)
                anInt669 = 40;
            string = string.toLowerCase();
            int i_79_
                    = aClass291_629.aClass316_3723
                    .method2365(1, Class281.method2108(string_78_, -29286));
            if ((i_79_ ^ 0xffffffff) > -1)
                return false;
            int i_80_
                    = aClass291_629.aClass316Array3728[i_79_]
                    .method2365(1, Class281.method2108(string, -29286));
            return i_80_ >= 0;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("in.M("
                            + (string != null ? "{...}"
                            : "null")
                            + ','
                            + (string_78_ != null ? "{...}"
                            : "null")
                            + ',' + i + ')'));
        }
    }

    final int method423(int i, byte i_81_) {
        anInt649++;
        if (!method399(false))
            return -1;
        int i_82_ = aClass291_629.aClass316_3723.method2365(1, i);
        if (!method392(i_82_, (byte) -40))
            return -1;
        int i_83_ = -60 / ((i_81_ - -4) / 56);
        return i_82_;
    }

    Class45(Class314 class314, boolean bool, int i) {
        if (i < 0 || (i ^ 0xffffffff) < -3)
            throw new IllegalArgumentException
                    ("js5: Invalid value " + i
                            + " supplied for discardunpacked");
        aClass314_659 = class314;
        aBoolean655 = bool;
        this.anInt634 = i;
    }

    static {
        anInt666 = 100;
    }
}
