/* Buffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class348_Sub49` (JODE-obfuscated).
 * Byte buffer / packet reader-writer. Provides readUnsignedShort, readUnsignedByte, read/write helpers over byte[] payload, plus BigInteger support for RSA. Extends Node.
 */

import java.math.BigInteger;

class Buffer extends Node {
    static int anInt7137;
    static int anInt7138;
    static int anInt7139;
    static int anInt7140;
    static int anInt7141;
    static int anInt7142;
    static int anInt7143;
    static int anInt7144;
    static int anInt7145;
    static int anInt7146;
    static int anInt7147;
    static int anInt7148;
    static int anInt7149;
    static int anInt7150;
    static int anInt7151;
    static int anInt7152;
    static int anInt7153;
    /** Packet byte array being read/written. */
    byte[] payload;
    static int anInt7155;
    static int anInt7156;
    static int anInt7157;
    static int anInt7158;
    static int anInt7159;
    static int anInt7160;
    static int anInt7161;
    static int anInt7162;
    static int anInt7163;
    static int anInt7164;
    static int anInt7165;
    static int anInt7166;
    static int anInt7167;
    static int anInt7168;
    static int anInt7169;
    static int anInt7170;
    static int anInt7171;
    static int anInt7172;
    static int anInt7173;
    static int anInt7174;
    static DisplayModeManagerContainer369 aClass223_7175 = new DisplayModeManagerContainer369(1, 2);
    static int anInt7176;
    static int anInt7177;
    static int anInt7178;
    static int anInt7179;
    static int anInt7180;
    static int anInt7181;
    static int anInt7182;
    static int anInt7183;
    static int anInt7184;
    static int anInt7185;
    static int anInt7186;
    static int anInt7187;
    static int anInt7188;
    static int anInt7189;
    static int anInt7190;
    static int anInt7191;
    static int anInt7192;
    static int anInt7193;
    static int anInt7194;
    static int anInt7195;
    static int anInt7196;
    /** Current read/write index into {@link #payload}. */
    int offset;
    static int anInt7198;
    static int anInt7199;
    static int anInt7200;
    static int anInt7201;
    static int anInt7202;
    static int anInt7203;
    static int anInt7204;
    static int anInt7205;
    static long[] aLongArray7206 = new long[32];
    static int anInt7207;
    static int anInt7208;
    static int anInt7209;

    final int readByteInverse(byte i) {
        anInt7163++;
        if (i != 21) return -10;
        return (-(this.payload[this.offset++]) & 0xff);
    }

    final int readUnsignedShort(int i) {
        if (i != 842397944) return 111;
        this.offset += 2;
        anInt7186++;
        return ((0xff & (this.payload[-1 + this.offset])) + ((this.payload[-2 + this.offset]) << 8 & 0xff00));
    }

    /** Integer power: {@code i_1_ ^ i} via binary exponentiation. */
    static final int pow(int i, byte i_0_, int i_1_) {
        anInt7161++;
        int i_2_ = 1;
        for (/**/; i > 1; i >>= 1) {
            if ((0x1 & i) != 0) i_2_ *= i_1_;
            i_1_ *= i_1_;
        }
        int i_3_ = 3 / ((i_0_ - -24) / 46);
        if (i == 1) return i_2_ * i_1_;
        return i_2_;
    }

    final long readLongLittle(byte i) {
        if (i <= 88) return -9L;
        anInt7179++;
        long l = 0xffffffffL & (long) readIntLittleEndian(-45);
        long l_4_ = 0xffffffffL & (long) readIntLittleEndian(-99);
        return (l_4_ << 32) + l;
    }

    final void writeString(byte i, String string) {
        anInt7172++;
        if (i != -5) this.payload = null;
        int i_5_ = string.indexOf('\0');
        if (i_5_ >= 0) throw new IllegalArgumentException("NUL character at " + i_5_ + " - cannot pjstr");
        this.offset += HashNodeSub16.encodeCp1252Into(0, (this.payload), string.length(), false, string, (this.offset));
        this.payload[this.offset++] = (byte) 0;
    }

    final int readLargeSmart(int i) {
        anInt7208++;
        int i_6_ = 0;
        int i_7_;
        for (i_7_ = readSmart(-124); i_7_ == 32767; i_7_ = readSmart(-127))
            i_6_ += 32767;
        int i_8_ = 112 % (i / 49);
        i_6_ += i_7_;
        return i_6_;
    }

    final void writeShortAdd(int i, int i_9_) {
        anInt7156++;
        this.payload[this.offset++] = (byte) (i_9_ >> 8);
        int i_10_ = -35 % ((-17 - i) / 48);
        this.payload[this.offset++] = (byte) (128 + i_9_);
    }

    final void writeIntMiddle(int i, byte i_11_) {
        anInt7162++;
        this.payload[this.offset++] = (byte) (i >> 8);
        this.payload[this.offset++] = (byte) i;
        this.payload[this.offset++] = (byte) (i >> 24);
        this.payload[this.offset++] = (byte) (i >> 16);
        if (i_11_ != 44) anInt7207 = 1;
    }

    final void writeShort(byte i, int i_12_) {
        anInt7145++;
        if (i != 107) disposeActiveToolkit(20);
        this.payload[this.offset++] = (byte) (i_12_ >> 8);
        this.payload[this.offset++] = (byte) i_12_;
    }

    final void writeLengthInt(int i, int i_13_) {
        this.payload[-4 + this.offset - i_13_] = (byte) (i_13_ >> 24);
        anInt7200++;
        this.payload[this.offset - i_13_ - 3] = (byte) (i_13_ >> 16);
        this.payload[this.offset - (i_13_ - -2)] = (byte) (i_13_ >> 8);
        this.payload[i + (this.offset + -i_13_)] = (byte) i_13_;
    }

    final void writeLengthByte(int i, int i_14_) {
        if (i > 91) {
            this.payload[this.offset - i_14_ + -1] = (byte) i_14_;
            anInt7185++;
        }
    }

    final void writeMedium(int i, int i_15_) {
        this.payload[this.offset++] = (byte) (i_15_ >> 16);
        anInt7148++;
        this.payload[this.offset++] = (byte) (i_15_ >> 8);
        if (i == -9912) this.payload[this.offset++] = (byte) i_15_;
    }

    /** Read {@code payload[offset++] - 128}. */
    final byte readByte128(int i) {
        if (i != -8679) aClass223_7175 = null;
        anInt7195++;
        return (byte) (-128 + (this.payload[this.offset++]));
    }

    final int readUnsignedByteSubtract(byte i) {
        anInt7174++;
        int i_16_ = 27 / ((-33 - i) / 51);
        return (-(this.payload[this.offset++]) + 128 & 0xff);
    }

    final int readIntMiddleEndian(byte i) {
        this.offset += 4;
        anInt7184++;
        if (i != 82) readSmart(-12);
        return ((0xff0000 & (this.payload[this.offset - 1]) << 16) + (((this.payload[this.offset - 2]) << 24 & ~0xffffff) + ((0xff & (this.payload[this.offset + -4])) << 8) + (0xff & (this.payload[this.offset - 3]))));
    }

    final int writeCrc(int i, boolean bool) {
        anInt7165++;
        if (bool != false) this.payload = null;
        int i_17_ = Component382.computeCrc32(this.offset, true, this.payload, i);
        writeInt((byte) 93, i_17_);
        return i_17_;
    }

    final byte readByteSubtract(int i) {
        if (i != -27697) anInt7207 = -57;
        anInt7138++;
        return (byte) (-(this.payload[this.offset++]) + 128);
    }

    final int readIntInverseMiddle(int i) {
        this.offset += 4;
        anInt7194++;
        if (i != 255) return 93;
        return (((0xff & (this.payload[-1 + this.offset])) << 8) + (((this.payload[-3 + this.offset]) & 0xff) << 24) - (-((0xff & (this.payload[this.offset - 4])) << 16) + -(0xff & (this.payload[this.offset - 2]))));
    }

    final void readBytesReverse(byte[] is, int i, int i_18_, byte i_19_) {
        anInt7183++;
        for (int i_20_ = -1 + i_18_ + i; i_20_ >= i; i_20_--)
            is[i_20_] = (this.payload[this.offset++]);
        int i_21_ = -53 / ((i_19_ - -72) / 47);
    }

    final void writeIntLittle(int i, int i_22_) {
        this.payload[this.offset++] = (byte) i_22_;
        anInt7164++;
        this.payload[this.offset++] = (byte) (i_22_ >> 8);
        this.payload[this.offset++] = (byte) (i_22_ >> 16);
        this.payload[this.offset++] = (byte) (i_22_ >> 24);
        int i_23_ = -32 / ((-74 - i) / 44);
    }

    final void writeShortAddLittle(int i, int i_24_) {
        if (i == 4325) {
            anInt7198++;
            this.payload[this.offset++] = (byte) (i_24_ - -128);
            this.payload[this.offset++] = (byte) (i_24_ >> 8);
        }
    }

    final void xteaEncrypt(int i, boolean bool, int[] is, int i_25_) {
        anInt7137++;
        int i_26_ = this.offset;
        this.offset = i;
        int i_27_ = (-i + i_25_) / 8;
        for (int i_28_ = 0; i_27_ > i_28_; i_28_++) {
            int i_29_ = readInt((byte) -126);
            int i_30_ = readInt((byte) -126);
            int i_31_ = 0;
            int i_32_ = -1640531527;
            int i_33_ = 32;
            while (i_33_-- > 0) {
                i_29_ += (i_31_ - -is[i_31_ & 0x3] ^ (i_30_ >>> 5 ^ i_30_ << 4) - -i_30_);
                i_31_ += i_32_;
                i_30_ += (i_31_ - -is[(0x1a0b & i_31_) >>> 11] ^ i_29_ + (i_29_ >>> 5 ^ i_29_ << 4));
            }
            this.offset -= 8;
            writeInt((byte) 91, i_29_);
            writeInt((byte) 98, i_30_);
        }
        if (bool != true) writeIntLittleEndian(88, 83);
        this.offset = i_26_;
    }

    final int readMedium(int i) {
        this.offset += 3;
        anInt7203++;
        if (i != -1) return -52;
        return ((0xff00 & (this.payload[-2 + this.offset]) << 8) + ((((this.payload[-3 + this.offset]) & 0xff) << 16) - -((this.payload[-1 + this.offset]) & 0xff)));
    }

    final boolean checkCrc(int i) {
        anInt7168++;
        this.offset -= 4;
        if (i != -25541) readSignedMedium((byte) 56);
        int i_34_ = Component382.computeCrc32(this.offset, true, this.payload, 0);
        int i_35_ = readInt((byte) -126);
        return i_35_ == i_34_;
    }

    final void writeShortLittle(int i, byte i_36_) {
        this.payload[this.offset++] = (byte) i;
        if (i_36_ != 3) this.payload = null;
        anInt7151++;
        this.payload[this.offset++] = (byte) (i >> 8);
    }

    /** Dispose the active graphics toolkit and clear its display-mode peer. */
    static final void disposeActiveToolkit(int i) {
        if (NodeSub34.aHa6968 != null) {
            NodeSub34.aHa6968.method3635((byte) -44);
            DefinitionSub9.aClass324_9173 = null;
            NodeSub34.aHa6968 = null;
        }
        int i_37_ = -97 % ((i - -14) / 37);
        anInt7173++;
    }

    final int readShortAdd(int i) {
        anInt7158++;
        int i_38_ = -108 / ((i - 73) / 50);
        this.offset += 2;
        return (((this.payload[-2 + this.offset]) << 8 & 0xff00) - -(0xff & -128 + (this.payload[this.offset + -1])));
    }

    final void writeIntInverseMiddle(int i, int i_39_) {
        anInt7190++;
        this.payload[this.offset++] = (byte) (i >> 16);
        this.payload[this.offset++] = (byte) (i >> 24);
        this.payload[this.offset++] = (byte) i;
        if (i_39_ != -4086) readShort(24);
        this.payload[this.offset++] = (byte) (i >> 8);
    }

    final void writeLongVar(int i, long l, byte i_40_) {
        try {
            anInt7193++;
            if (--i < 0 || i > 7) throw new IllegalArgumentException();
            int i_41_ = 101 % ((-11 - i_40_) / 49);
            for (int i_42_ = 8 * i; i_42_ >= 0; i_42_ -= 8)
                this.payload[this.offset++] = (byte) (int) (l >> i_42_);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("cea.JB(" + i + ',' + l + ',' + i_40_ + ')'));
        }
    }

    final int readShortAddLittle(int i) {
        anInt7181++;
        if (i > -105) this.payload = null;
        this.offset += 2;
        return (((this.payload[this.offset + -2]) - 128 & 0xff) + ((this.payload[-1 + this.offset]) << 8 & 0xff00));
    }

    final int readIntLittleEndian(int i) {
        if (i > -17) aLongArray7206 = null;
        anInt7188++;
        this.offset += 4;
        return (((this.payload[-3 + this.offset]) << 8 & 0xff00) + ((this.payload[this.offset - 1]) << 24 & ~0xffffff) + (((0xff & (this.payload[this.offset + -2])) << 16) + ((this.payload[-4 + this.offset]) & 0xff)));
    }

    final void release(byte i) {
        if (this.payload != null) NameFormatter.releaseByteArray(0, this.payload);
        anInt7177++;
        this.payload = null;
        if (i != -69) writeCrc(-115, true);
    }

    final byte readByteInverse(int i) {
        anInt7150++;
        if (i != -622951480) aClass223_7175 = null;
        return (byte) -(this.payload[this.offset++]);
    }

    final int readSmartSigned(byte i) {
        anInt7155++;
        int i_43_ = ((this.payload[this.offset]) & 0xff);
        if (i != 77) readByte(-48);
        if (i_43_ < 128) return -64 + readUnsignedByte(255);
        return readUnsignedShort(i ^ 0x3235f8b5) - 49152;
    }

    final int readMediumLittle(int i) {
        this.offset += 3;
        anInt7144++;
        if (i != -13309) setClientState(94, 83);
        return (((this.payload[this.offset - 3]) & 0xff) + (((this.payload[-2 + this.offset]) << 8 & 0xff00) + ((this.payload[-1 + this.offset]) << 16 & 0xff0000)));
    }

    final int readIntLittle(byte i) {
        if (i > -117) this.offset = 61;
        this.offset += 4;
        anInt7167++;
        return ((0xff & (this.payload[this.offset - 4])) + (((0xff & (this.payload[-3 + this.offset])) << 8) + (~0xffffff & ((this.payload[this.offset - 1]) << 24)) + (((this.payload[this.offset - 2]) & 0xff) << 16)));
    }

    final long readLong(int i) {
        anInt7149++;
        if (i != -456577760) return 14L;
        long l = 0xffffffffL & (long) readInt((byte) -126);
        long l_44_ = (long) readInt((byte) -126) & 0xffffffffL;
        return l_44_ + (l << 32);
    }

    final int readVarInt(byte i) {
        anInt7170++;
        int i_45_ = (this.payload[this.offset++]);
        int i_46_ = 0;
        if (i < 23) return -99;
        for (/**/; i_45_ < 0; i_45_ = (this.payload[this.offset++]))
            i_46_ = (0x7f & i_45_ | i_46_) << 7;
        return i_46_ | i_45_;
    }

    final void xteaDecrypt(int i, int[] is, int i_47_, int i_48_) {
        anInt7178++;
        int i_49_ = this.offset;
        this.offset = i_47_;
        int i_50_ = (i_48_ + -i_47_) / 8;
        for (int i_51_ = 0; i_50_ > i_51_; i_51_++) {
            int i_52_ = readInt((byte) -126);
            int i_53_ = readInt((byte) -126);
            int i_54_ = -957401312;
            int i_55_ = -1640531527;
            int i_56_ = 32;
            while (i_56_-- > 0) {
                i_53_ -= ((i_52_ << 4 ^ i_52_ >>> 5) + i_52_ ^ i_54_ - -is[0x4d000003 & i_54_ >>> 11]);
                i_54_ -= i_55_;
                i_52_ -= (i_54_ - -is[i_54_ & 0x3] ^ (i_53_ << 4 ^ i_53_ >>> 5) - -i_53_);
            }
            this.offset -= 8;
            writeInt((byte) 113, i_52_);
            writeInt((byte) 126, i_53_);
        }
        if (i == 607818341) this.offset = i_49_;
    }

    final long readLongVar(int i, int i_57_) {
        i--;
        anInt7191++;
        if (i < 0 || i > 7) throw new IllegalArgumentException();
        if (i_57_ != 3060) return 99L;
        int i_58_ = 8 * i;
        long l = 0L;
        for (/**/; i_58_ >= 0; i_58_ -= 8)
            l |= ((long) (this.payload[this.offset++]) & 0xffL) << i_58_;
        return l;
    }

    final int readSignedMedium(byte i) {
        if (i != 125) return 100;
        anInt7139++;
        this.offset += 3;
        int i_59_ = (((this.payload[this.offset - 1]) & 0xff) + ((0xff0000 & ((this.payload[this.offset + -3]) << 16)) + ((0xff & (this.payload[this.offset + -2])) << 8)));
        if (i_59_ > 8388607) i_59_ -= 16777216;
        return i_59_;
    }

    final void writeByteSubtract(byte i, int i_60_) {
        int i_61_ = -4 % ((-35 - i) / 33);
        anInt7142++;
        this.payload[this.offset++] = (byte) (-i_60_ + 128);
    }

    final String readGjstr2(int i) {
        anInt7152++;
        byte i_62_ = (this.payload[this.offset++]);
        if (i_62_ != 0) throw new IllegalStateException("Bad version number in gjstr2");
        int i_63_ = this.offset;
        while ((this.payload[this.offset++]) != 0) {
            /* empty */
        }
        int i_64_ = this.offset - (i_63_ + 1);
        if (i != -13487) writeInt((byte) 10, -125);
        if (i_64_ == 0) return "";
        return WaterShaderSub8.decodeCp1252(this.payload, 0, i_64_, i_63_);
    }

    final int readShort(int i) {
        anInt7204++;
        if (i != 13638) xteaEncrypt(-23, true, null, -10);
        this.offset += 2;
        int i_65_ = (((this.payload[this.offset - 1]) & 0xff) + (((this.payload[-2 + this.offset]) & 0xff) << 8));
        if (i_65_ > 32767) i_65_ -= 65536;
        return i_65_;
    }

    final int readShortLittle(boolean bool) {
        if (bool != false) return 113;
        anInt7171++;
        this.offset += 2;
        return ((0xff00 & (this.payload[this.offset - 1]) << 8) + ((this.payload[-2 + this.offset]) & 0xff));
    }

    final void writeByteInverse(byte i, int i_66_) {
        this.payload[this.offset++] = (byte) -i_66_;
        if (i >= -27) this.payload = null;
        anInt7140++;
    }

    /** Read signed short: high byte + (low-128), with 16-bit sign extend. */
    final int readShort128(byte i) {
        anInt7187++;
        this.offset += 2;
        int i_67_ = ((0xff & -128 + (this.payload[this.offset - 1])) + (((this.payload[-2 + this.offset]) & 0xff) << 8));
        if (i != 84) return 85;
        if (i_67_ > 32767) i_67_ -= 65536;
        return i_67_;
    }

    /** Null shared statics for GC / shutdown. */
    public static void clearStatics(int i) {
        aLongArray7206 = null;
        aClass223_7175 = null;
        if (i != -2) clearStatics(-87);
    }

    final String readString(byte i) {
        anInt7166++;
        int i_68_ = -81 / ((i - 30) / 52);
        int i_69_ = this.offset;
        while ((this.payload[this.offset++]) != 0) {
            /* empty */
        }
        int i_70_ = -1 + this.offset - i_69_;
        if (i_70_ == 0) return "";
        return WaterShaderSub8.decodeCp1252(this.payload, 0, i_70_, i_69_);
    }

    final void writeByte(boolean bool, int i) {
        anInt7160++;
        this.payload[this.offset++] = (byte) i;
        if (bool != false) this.offset = -121;
    }

    static final void setClientState(int i, int i_71_) {
        anInt7201++;
        if (i_71_ != Component49.clientState) {
            if (i_71_ == 13) {
                if (OggStreamReader.aString9043 != null) MenuOpener.method1157(RuntimeException_Sub1.anInt4596, (byte) -81);
                else Component193.method1922(DisplayModeManagerContainer51.password, RuntimeException_Sub1.anInt4596, DisplayModeManagerContainer282.username, true);
            }
            if (i_71_ != 13 && ItemDefinition.aClass238_2773 != null) {
                ItemDefinition.aClass238_2773.close((byte) 36);
                ItemDefinition.aClass238_2773 = null;
            }
            if (i_71_ == 3) CacheNode.method3198((DebugPanic.anInt4737 != r.anInt9721), (byte) -45);
            if (i_71_ == 7) HashTable.method1006((r.anInt9721 != Component285.anInt970), (byte) 102);
            if (i_71_ == 5) {
                if (OggStreamReader.aString9043 == null) DisplayModeManagerContainer346.method1213(DisplayModeManagerContainer282.username, DisplayModeManagerContainer51.password, -124);
                else Component280.method1372(-1);
            } else if (i_71_ != 6) {
                if (i_71_ == 9) {
                    if (OggStreamReader.aString9043 != null) MenuOpener.method1157((RuntimeException_Sub1.anInt4596), (byte) -120);
                    else Component193.method1922(DisplayModeManagerContainer51.password, RuntimeException_Sub1.anInt4596, DisplayModeManagerContainer282.username, true);
                } else if (i_71_ == 12) {
                    if (OggStreamReader.aString9043 == null) DisplayModeManagerContainer346.method1213(DisplayModeManagerContainer282.username, DisplayModeManagerContainer51.password, -98);
                    else Component280.method1372(-1);
                }
            } else if (OggStreamReader.aString9043 == null) Component193.method1922(DisplayModeManagerContainer51.password, RuntimeException_Sub1.anInt4596, DisplayModeManagerContainer282.username, true);
            else MenuOpener.method1157(RuntimeException_Sub1.anInt4596, (byte) -99);
            if (Component212.isValidType(Component49.clientState, (byte) -78)) {
                Component181.aClass45_1541.discardMode = 2;
                VideoAdDisplay.aClass45_3183.discardMode = 2;
                Component97.aClass45_1538.discardMode = 2;
                Component43.aClass45_4975.discardMode = 2;
                RadixParser.aClass45_2306.discardMode = 2;
                CacheNodeSub2.aClass45_10480.discardMode = 2;
                SeekableFile.aClass45_1322.discardMode = 2;
            }
            if (Component212.isValidType(i_71_, (byte) -119)) {
                Component82.anInt443 = 1;
                Component129.anInt489 = 0;
                NodeSub46.anInt7115 = 1;
                Component101.anInt2101 = 0;
                DisplayModeManagerContainer259.anInt3441 = 0;
                HashNodeSub3.method3177(-111, true);
                Component181.aClass45_1541.discardMode = 1;
                VideoAdDisplay.aClass45_3183.discardMode = 1;
                Component97.aClass45_1538.discardMode = 1;
                Component43.aClass45_4975.discardMode = 1;
                RadixParser.aClass45_2306.discardMode = 1;
                CacheNodeSub2.aClass45_10480.discardMode = 1;
                SeekableFile.aClass45_1322.discardMode = 1;
            }
            if (i_71_ == 11 || i_71_ == 3) ToolbarRefreshDefinition.method3088(9);
            boolean bool = (i == i_71_ || CacheNode.method3196(i_71_, i ^ ~0x58) || CacheFileStore.isReconnectState(i_71_, -100));
            boolean bool_72_ = (Component49.clientState == 2 || CacheNode.method3196(Component49.clientState, -110) || CacheFileStore.isReconnectState(Component49.clientState, -128));
            if (bool != bool_72_) {
                if (bool) {
                    Component119.anInt3428 = Component35.anInt4270;
                    if (Component192.preferences.aClass239_Sub26_7245.method1838(-32350) != 0) {
                        Component168.method2355(Component192.preferences.aClass239_Sub26_7245.method1838(-32350), (byte) 50, false, Component54.aClass45_8667, Component35.anInt4270, 0, 2);
                        DefinitionSub17Sub1.method3093(i ^ 0x66);
                    } else Sprite.resetMusic(2, 22684);
                    HardwareProbe.aClass248_6601.writeLoginState(-117, false);
                } else {
                    Sprite.resetMusic(2, 22684);
                    HardwareProbe.aClass248_6601.writeLoginState(i ^ ~0x4b, true);
                }
            }
            if (Component212.isValidType(i_71_, (byte) -64) || i_71_ == 13) NodeSub8.toolkit.copyScreen();
            Component49.clientState = i_71_;
            // After state settles: restore/auto-login on title (once per session).
            if (i_71_ == 3) {
                LoginPrefs.onLoginScreen();
            } else if (i_71_ == 10) {
                LoginPrefs.onWorldEntered();
            }
        }
    }

    final void writeBytes(int i, int i_73_, byte[] is, int i_74_) {
        for (int i_75_ = i_73_; i_73_ + i > i_75_; i_75_++)
            this.payload[this.offset++] = is[i_75_];
        int i_76_ = -41 % ((8 - i_74_) / 52);
        anInt7199++;
    }

    final void writeSmart(int i, int i_77_) {
        anInt7180++;
        if (i_77_ >= 0 && i_77_ < 128) writeByte(false, i_77_);
        else if (i_77_ >= 0 && i_77_ < 32768) writeShort((byte) 107, i_77_ + 32768);
        else if (i == 5537) throw new IllegalArgumentException();
    }

    final int readSmart(int i) {
        if (i > -116) return -4;
        anInt7176++;
        int i_78_ = 0xff & (this.payload[this.offset]);
        if (i_78_ < 128) return readUnsignedByte(255);
        return readUnsignedShort(842397944) + -32768;
    }

    final void writeLengthShort(int i, int i_79_) {
        anInt7157++;
        this.payload[-2 + -i_79_ + this.offset] = (byte) (i_79_ >> 8);
        if (i != 1809639944) xteaEncrypt(93, true, null, -39);
        this.payload[this.offset - i_79_ + -1] = (byte) i_79_;
    }

    final String readStringOrNull(int i) {
        anInt7205++;
        if (i <= 105) aLongArray7206 = null;
        if ((this.payload[this.offset]) == 0) {
            this.offset++;
            return null;
        }
        return readString((byte) 92);
    }

    final int readInt(byte i) {
        anInt7196++;
        this.offset += 4;
        if (i != -126) readLongVar(-61, -64);
        return ((0xff & (this.payload[this.offset - 1])) + ((((this.payload[-4 + this.offset]) & 0xff) << 24) + (0xff0000 & ((this.payload[-3 + this.offset]) << 16))) - -(((this.payload[-2 + this.offset]) & 0xff) << 8));
    }

    final void writeGjstr2(String string, int i) {
        anInt7182++;
        int i_80_ = -21 % ((42 - i) / 52);
        int i_81_ = string.indexOf('\0');
        if (i_81_ >= 0) throw new IllegalArgumentException("NUL character at " + i_81_ + " - cannot pjstr2");
        this.payload[this.offset++] = (byte) 0;
        this.offset += HashNodeSub16.encodeCp1252Into(0, (this.payload), string.length(), false, string, (this.offset));
        this.payload[this.offset++] = (byte) 0;
    }

    final int readUnsignedByte(int i) {
        if (i != 255) writeBytes(-101, 111, null, 33);
        anInt7153++;
        return ((this.payload[this.offset++]) & 0xff);
    }

    final byte readByte(int i) {
        if (i >= -75) writeByteAdd((byte) -18, -24);
        anInt7143++;
        return (this.payload[this.offset++]);
    }

    final void readBytes(int i, int i_82_, int i_83_, byte[] is) {
        anInt7159++;
        for (int i_84_ = i_82_; i_83_ + i_82_ > i_84_; i_84_++)
            is[i_84_] = (this.payload[this.offset++]);
        if (i != 2147483647) anInt7207 = -47;
    }

    final void applyRsa(BigInteger biginteger, byte i, BigInteger biginteger_85_) {
        try {
            anInt7147++;
            int i_86_ = this.offset;
            this.offset = 0;
            byte[] is = new byte[i_86_];
            readBytes(2147483647, 0, i_86_, is);
            if (i >= -33) disposeActiveToolkit(-73);
            BigInteger biginteger_87_ = new BigInteger(is);
            BigInteger biginteger_88_ = biginteger_87_.modPow(biginteger_85_, biginteger);
            byte[] is_89_ = biginteger_88_.toByteArray();
            this.offset = 0;
            writeShort((byte) 107, is_89_.length);
            writeBytes(is_89_.length, 0, is_89_, 85);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("cea.SA(" + (biginteger != null ? "{...}" : "null") + ',' + i + ',' + (biginteger_85_ != null ? "{...}" : "null") + ')'));
        }
    }

    final void writeInt(byte i, int i_90_) {
        this.payload[this.offset++] = (byte) (i_90_ >> 24);
        if (i < 84) writeByteAdd((byte) -122, -112);
        anInt7202++;
        this.payload[this.offset++] = (byte) (i_90_ >> 16);
        this.payload[this.offset++] = (byte) (i_90_ >> 8);
        this.payload[this.offset++] = (byte) i_90_;
    }

    final void writeLong(long l, byte i) {
        try {
            int i_91_ = -16 % ((i - -5) / 52);
            this.payload[this.offset++] = (byte) (int) (l >> 56);
            anInt7209++;
            this.payload[this.offset++] = (byte) (int) (l >> 48);
            this.payload[this.offset++] = (byte) (int) (l >> 40);
            this.payload[this.offset++] = (byte) (int) (l >> 32);
            this.payload[this.offset++] = (byte) (int) (l >> 24);
            this.payload[this.offset++] = (byte) (int) (l >> 16);
            this.payload[this.offset++] = (byte) (int) (l >> 8);
            this.payload[this.offset++] = (byte) (int) l;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, "cea.BB(" + l + ',' + i + ')');
        }
    }

    final int readByteAdd(byte i) {
        anInt7169++;
        int i_92_ = 18 / ((-28 - i) / 40);
        return ((this.payload[this.offset++]) - 128 & 0xff);
    }

    Buffer(int i) {
        this.offset = 0;
        this.payload = NameFormatter.allocateByteArray(i, -1);
    }

    /**
     * Writes little-endian int {@code i_93_}. First two bytes always; high two only when
     * {@code i == -23892} (all live call sites pass that sentinel).
     */
    final void writeIntLittleEndian(int i, int i_93_) {
        this.payload[this.offset++] = (byte) i_93_;
        anInt7141++;
        this.payload[this.offset++] = (byte) (i_93_ >> 8);
        if (i == -23892) {
            this.payload[this.offset++] = (byte) (i_93_ >> 16);
            this.payload[this.offset++] = (byte) (i_93_ >> 24);
        }
    }

    final void writeByteAdd(byte i, int i_94_) {
        anInt7192++;
        this.payload[this.offset++] = (byte) (i_94_ + 128);
        int i_95_ = -21 % ((-8 - i) / 57);
    }

    final void writeVarInt(int i, int i_96_) {
        if (i_96_ > -5) aClass223_7175 = null;
        anInt7146++;
        if ((i & ~0x7f) != 0) {
            if ((i & ~0x3fff) != 0) {
                if ((~0x1fffff & i) != 0) {
                    if ((i & ~0xfffffff) != 0) writeByte(false, 0x80 | i >>> 28);
                    writeByte(false, 0x80 | i >>> 21);
                }
                writeByte(false, (0x2000f4 | i) >>> 14);
            }
            writeByte(false, 0x80 | i >>> 7);
        }
        writeByte(false, i & 0x7f);
    }

    /** Write 16-bit little-endian. */
    final void writeShortLE(int i, int i_97_) {
        anInt7189++;
        this.payload[this.offset++] = (byte) i_97_;
        this.payload[this.offset++] = (byte) (i_97_ >> 8);
        if (i < 22) readUnsignedByte(6);
    }

    Buffer(byte[] is) {
        this.payload = is;
        this.offset = 0;
    }
}
