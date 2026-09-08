/* Component317 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component317
/**
 * RENAMED from `Class59_Sub2_Sub2` (JODE-obfuscated).
 * Evidence: subclass of Component185 (hierarchy)
 */ extends Component185 {
    static int anInt8675;
    static int anInt8676;
    static int anInt8677;
    static int anInt8678;
    static LruCache aClass356_8679 = new LruCache(16);
    static int anInt8680;
    private byte[] aByteArray8681;
    static int anInt8682;
    static Component183 aClass114_8683 = new Component183(100, -1);
    static int[] anIntArray8684;
    static int anInt8685;

    static final void method569(byte i, Buffer class348_sub49) {
        anInt8675++;
        int i_0_ = class348_sub49.readSmart(-128);
        BasicMouseHandler.aClass283Array7446 = new Component69[i_0_];
        for (int i_1_ = 0; i_0_ > i_1_; i_1_++) {
            BasicMouseHandler.aClass283Array7446[i_1_] = new Component69();
            BasicMouseHandler.aClass283Array7446[i_1_].anInt3657 = class348_sub49.readSmart(-124);
            BasicMouseHandler.aClass283Array7446[i_1_].aString3663 = class348_sub49.readGjstr2(-13487);
        }
        DisplayModeManagerContainer343.anInt8731 = class348_sub49.readSmart(-127);
        Component284.anInt6151 = class348_sub49.readSmart(-119);
        Component241.anInt2956 = class348_sub49.readSmart(-122);
        OutputStream_Sub1.aClass110_Sub1Array97 = new Component362[1 + (Component284.anInt6151 + -DisplayModeManagerContainer343.anInt8731)];
        for (int i_2_ = 0; Component241.anInt2956 > i_2_; i_2_++) {
            int i_3_ = class348_sub49.readSmart(-126);
            Component362 class110_sub1 = (OutputStream_Sub1.aClass110_Sub1Array97[i_3_] = new Component362());
            class110_sub1.anInt1711 = class348_sub49.readUnsignedByte(255);
            class110_sub1.anInt1708 = class348_sub49.readInt((byte) -126);
            class110_sub1.anInt5786 = DisplayModeManagerContainer343.anInt8731 + i_3_;
            class110_sub1.aString5787 = class348_sub49.readGjstr2(-13487);
            class110_sub1.aString5794 = class348_sub49.readGjstr2(-13487);
        }
        Component364.anInt8349 = class348_sub49.readInt((byte) -126);
        Component195.aBoolean5013 = true;
        if (i > -110) method569((byte) -34, null);
    }

    public static void method570(int i) {
        if (i < 51) method570(-85);
        aClass114_8683 = null;
        anIntArray8684 = null;
        aClass356_8679 = null;
    }

    public Component317() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    final byte[] method571(int i, byte i_4_, int i_5_, int i_6_) {
        aByteArray8681 = new byte[i_5_ * (i_6_ * (i * 2))];
        int i_7_ = -82 % ((i_4_ - 70) / 37);
        anInt8678++;
        this.method542(i, i_6_, 0, i_5_);
        return aByteArray8681;
    }

    final void method563(byte i, int i_8_, byte i_9_) {
        anInt8682++;
        i_9_ = (byte) (127 + ((0xff & i_9_) >> 1));
        int i_10_ = 2 * i_8_;
        aByteArray8681[i_10_++] = i_9_;
        aByteArray8681[i_10_] = i_9_;
        if (i <= 79) method574(-29, -37, 73, null, true, (byte) -64, 2, -112, 50, null, -65, null, -92, 30, -5);
    }

    /** Escape {@code <}/{@code >} as {@code <lt>}/{@code <gt>} for safe display. */
    static final String escapeAngleBrackets(String string, int i) {
        anInt8677++;
        if (i != 23034) aClass356_8679 = null;
        int i_11_ = string.length();
        int i_12_ = 0;
        for (int i_13_ = 0; i_11_ > i_13_; i_13_++) {
            char c = string.charAt(i_13_);
            if (c == '<' || c == '>') i_12_ += 3;
        }
        StringBuffer stringbuffer = new StringBuffer(i_12_ + i_11_);
        for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
            char c = string.charAt(i_14_);
            if (c != 60) {
                if (c != 62) stringbuffer.append(c);
                else stringbuffer.append("<gt>");
            } else stringbuffer.append("<lt>");
        }
        return stringbuffer.toString();
    }

    static final void method573(HashNode class348_sub42, HashNode class348_sub42_15_, byte i) {
        try {
            if (class348_sub42.previous != null) class348_sub42.unlink(true);
            anInt8680++;
            class348_sub42.previous = class348_sub42_15_;
            class348_sub42.next = class348_sub42_15_.next;
            if (i != 63) anInt8685 = 110;
            class348_sub42.previous.next = class348_sub42;
            class348_sub42.next.previous = class348_sub42;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("wd.F(" + (class348_sub42 != null ? "{...}" : "null") + ',' + (class348_sub42_15_ != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    static final int method574(int i, int i_16_, int i_17_, int[] is, boolean bool, byte i_18_, int i_19_, int i_20_, int i_21_, int[] is_22_, int i_23_, CollisionMap class361, int i_24_, int i_25_, int i_26_) {
        try {
            for (int i_27_ = 0; i_27_ < 128; i_27_++) {
                for (int i_28_ = 0; i_28_ < 128; i_28_++) {
                    r.anIntArrayArray9723[i_27_][i_28_] = 0;
                    DisplayModeManagerContainer369.anIntArrayArray2900[i_27_][i_28_] = 99999999;
                }
            }
            anInt8676++;
            boolean bool_29_;
            if (i_16_ != 1) {
                if (i_16_ == 2) bool_29_ = ObjectDefinitionProvider.method2007(i_19_, -125, i_23_, class361, i, i_21_, i_24_, i_17_, i_25_, i_20_, i_26_);
                else bool_29_ = Component291.method1420(i_24_, i_26_, -73, i_21_, i_17_, i, i_20_, i_25_, i_16_, class361, i_19_, i_23_);
            } else bool_29_ = Component364.method187(i, i_23_, i_21_, i_26_, i_25_, i_24_, class361, i_19_, i_17_, i_20_, 1109655552);
            int i_30_ = i_20_ - 64;
            int i_31_ = i_21_ + -64;
            int i_32_ = DefinitionSub30.anInt9388;
            int i_33_ = Component95.anInt1753;
            if (!bool_29_) {
                if (!bool) return -1;
                int i_34_ = 2147483647;
                int i_35_ = 2147483647;
                int i_36_ = 10;
                for (int i_37_ = -i_36_ + i; i - -i_36_ >= i_37_; i_37_++) {
                    for (int i_38_ = i_23_ - i_36_; i_38_ <= i_23_ - -i_36_; i_38_++) {
                        int i_39_ = i_37_ - i_30_;
                        int i_40_ = -i_31_ + i_38_;
                        if (i_39_ >= 0 && i_40_ >= 0 && i_39_ < 128 && i_40_ < 128 && (DisplayModeManagerContainer369.anIntArrayArray2900[i_39_][i_40_] < 100)) {
                            int i_41_ = 0;
                            if (i <= i_37_) {
                                if (-1 + i_24_ + i < i_37_) i_41_ = i_37_ - -1 - (i + i_24_);
                            } else i_41_ = -i_37_ + i;
                            int i_42_ = 0;
                            if (i_38_ >= i_23_) {
                                if (i_17_ + (i_23_ - 1) < i_38_) i_42_ = -i_17_ - i_23_ - (-1 - i_38_);
                            } else i_42_ = -i_38_ + i_23_;
                            int i_43_ = i_41_ * i_41_ + i_42_ * i_42_;
                            if (i_43_ < i_34_ || i_34_ == i_43_ && ((DisplayModeManagerContainer369.anIntArrayArray2900[i_39_][i_40_]) < i_35_)) {
                                i_34_ = i_43_;
                                i_32_ = i_37_;
                                i_35_ = (DisplayModeManagerContainer369.anIntArrayArray2900[i_39_][i_40_]);
                                i_33_ = i_38_;
                            }
                        }
                    }
                }
                if (i_34_ == 2147483647) return -1;
            }
            if (i_20_ == i_32_ && i_33_ == i_21_) return 0;
            int i_44_ = 0;
            if (i_18_ != 120) aClass114_8683 = null;
            OpenGlShader.anIntArray7397[i_44_] = i_32_;
            Component275.anIntArray2694[i_44_++] = i_33_;
            int i_46_;
            int i_45_ = (i_46_ = r.anIntArrayArray9723[i_32_ + -i_30_][-i_31_ + i_33_]);
            while (i_32_ != i_20_ || i_33_ != i_21_) {
                if (i_46_ != i_45_) {
                    OpenGlShader.anIntArray7397[i_44_] = i_32_;
                    i_46_ = i_45_;
                    Component275.anIntArray2694[i_44_++] = i_33_;
                }
                if ((i_45_ & 0x2) == 0) {
                    if ((0x8 & i_45_) != 0) i_32_--;
                } else i_32_++;
                if ((0x1 & i_45_) == 0) {
                    if ((0x4 & i_45_) != 0) i_33_--;
                } else i_33_++;
                i_45_ = r.anIntArrayArray9723[-i_30_ + i_32_][i_33_ + -i_31_];
            }
            int i_47_ = 0;
            while (i_44_-- > 0) {
                is_22_[i_47_] = OpenGlShader.anIntArray7397[i_44_];
                is[i_47_++] = Component275.anIntArray2694[i_44_];
                if (is_22_.length <= i_47_) break;
            }
            return i_47_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("wd.B(" + i + ',' + i_16_ + ',' + i_17_ + ',' + (is != null ? "{...}" : "null") + ',' + bool + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + (is_22_ != null ? "{...}" : "null") + ',' + i_23_ + ',' + (class361 != null ? "{...}" : "null") + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ')'));
        }
    }
}
