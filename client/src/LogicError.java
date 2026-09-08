/* LogicError - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class85` (JODE-obfuscated).
 * Whirlpool-512 digest engine (misnamed from an internal "LOGIC ERROR" throw).
 * Used for JS5 index / archive signature checks via {@link NodeSub1Sub2#whirlpoolDigest}.
 */

final class LogicError {
    static int anInt1461;
    static int anInt1462;
    private int anInt1463;
    static int anInt1464;
    private final byte[] aByteArray1465 = new byte[32];
    static int anInt1466;
    static int anInt1467;
    private int anInt1468;
    private final long[] aLongArray1469;
    static int anInt1470;
    private final long[] aLongArray1471 = new long[8];
    private final long[] aLongArray1472;
    private final long[] aLongArray1473;
    private final long[] aLongArray1474;
    private final byte[] aByteArray1475;
    static int anInt1476;

    private final void method827(int i) {
        anInt1462++;
        int i_0_ = 0;
        int i_1_ = i;
        for (/**/; i_0_ < 8; i_0_++) {
            aLongArray1473[i_0_] = (SpriteSub2.method993((SpriteSub2.method993((NodeSub8.method2777(255L, aByteArray1475[i_1_ + 6]) << 8), (SpriteSub2.method993(NodeSub8.method2777(((long) (aByteArray1475[i_1_ - -5]) << 16), 255L << 16), (SpriteSub2.method993((SpriteSub2.method993(NodeSub8.method2777(255L << 32, ((long) (aByteArray1475[i_1_ + 3]) << 32)), (SpriteSub2.method993(SpriteSub2.method993((NodeSub8.method2777(255L << 48, ((long) (aByteArray1475[1 + i_1_]) << 48))), ((long) (aByteArray1475[i_1_]) << 56)), NodeSub8.method2777(((long) (aByteArray1475[i_1_ + 2]) << 40), 255L << 40))))), NodeSub8.method2777(aByteArray1475[4 + i_1_], 255L) << 24)))))), NodeSub8.method2777(255L, aByteArray1475[i_1_ - -7])));
            i_1_ += 8;
        }
        for (int i_2_ = 0; i_2_ < 8; i_2_++)
            aLongArray1469[i_2_] = SpriteSub2.method993(aLongArray1473[i_2_], (aLongArray1472[i_2_] = aLongArray1474[i_2_]));
        for (int i_3_ = 1; i_3_ <= 10; i_3_++) {
            for (int i_4_ = 0; i_4_ < 8; i_4_++) {
                aLongArray1471[i_4_] = 0L;
                int i_5_ = 0;
                int i_6_ = 56;
                for (/**/; i_5_ < 8; i_5_++) {
                    aLongArray1471[i_4_] = (SpriteSub2.method993(aLongArray1471[i_4_], (InputStream_Sub1.aLongArrayArray75[i_5_][(GpsOverlay.bitwiseAnd(255, (int) ((aLongArray1472[GpsOverlay.bitwiseAnd(7, i_4_ - i_5_)]) >>> i_6_)))])));
                    i_6_ -= 8;
                }
            }
            for (int i_7_ = 0; i_7_ < 8; i_7_++)
                aLongArray1472[i_7_] = aLongArray1471[i_7_];
            aLongArray1472[0] = SpriteSub2.method993(aLongArray1472[0], InputStream_Sub1.aLongArray76[i_3_]);
            for (int i_8_ = 0; i_8_ < 8; i_8_++) {
                aLongArray1471[i_8_] = aLongArray1472[i_8_];
                int i_9_ = 0;
                int i_10_ = 56;
                for (/**/; i_9_ < 8; i_9_++) {
                    aLongArray1471[i_8_] = (SpriteSub2.method993(aLongArray1471[i_8_], (InputStream_Sub1.aLongArrayArray75[i_9_][(GpsOverlay.bitwiseAnd(255, (int) ((aLongArray1469[GpsOverlay.bitwiseAnd(-i_9_ + i_8_, 7)]) >>> i_10_)))])));
                    i_10_ -= 8;
                }
            }
            for (int i_11_ = 0; i_11_ < 8; i_11_++)
                aLongArray1469[i_11_] = aLongArray1471[i_11_];
        }
        for (int i_12_ = 0; i_12_ < 8; i_12_++)
            aLongArray1474[i_12_] = (SpriteSub2.method993(aLongArray1474[i_12_], SpriteSub2.method993(aLongArray1473[i_12_], aLongArray1469[i_12_])));
    }

    static final void method828(byte i, int i_13_, int i_14_) {
        if (i != 38) method828((byte) 63, 119, 33);
        anInt1467++;
        if (Component158.aHa326 != null) {
            int i_15_ = Component82.anInt425;
            int i_16_ = AudioMixer.anInt3225;
            DisplayModeManagerContainer295.method1752(-1, i_13_, i_14_);
            if (Buffer.anInt7207 == 0) {
                DisplayModeManagerContainer167.anInterface4_252 = null;
                DisplayModeManagerContainer167.anInterface4_252 = (Component158.aHa326.method3634(Component158.aHa326.method3665((GpiLogger.anInt8854), Component25.anInt6008), Component158.aHa326.method3624((GpiLogger.anInt8854), Component25.anInt6008)));
            } else if (Buffer.anInt7207 == 1 && (DisplayModeManagerContainer23.anInterface4Array1525 == null || i_15_ != Component82.anInt425 || i_16_ != AudioMixer.anInt3225)) {
                DisplayModeManagerContainer23.anInterface4Array1525 = new Interface4[AudioMixer.anInt3225 * Component82.anInt425];
                for (int i_17_ = 0; DisplayModeManagerContainer23.anInterface4Array1525.length > i_17_; i_17_++)
                    DisplayModeManagerContainer23.anInterface4Array1525[i_17_] = (Component158.aHa326.method3634(Component158.aHa326.method3665(Component255.anInt1067, AbstractBuffer.anInt4267), Component158.aHa326.method3624(Component255.anInt1067, AbstractBuffer.anInt4267)));
                Component72.anIntArray1909 = new int[Component82.anInt425 * AudioMixer.anInt3225];
                Component212.anInt9997 = 1;
            }
            NodeSub16Sub2.aBoolean8870 = true;
        }
    }

    /** Reset digest state. */
    final void reset(int i) {
        anInt1466++;
        int i_18_ = -69 % ((i - 33) / 43);
        for (int i_19_ = 0; i_19_ < 32; i_19_++)
            aByteArray1465[i_19_] = (byte) 0;
        aByteArray1475[0] = (byte) 0;
        anInt1463 = anInt1468 = 0;
        for (int i_20_ = 0; i_20_ < 8; i_20_++)
            aLongArray1474[i_20_] = 0L;
    }

    static final void method830(int i, int i_21_, byte i_22_, boolean bool, int i_23_) {
        anInt1461++;
        HashNodeSub3.method3179(0);
        NodeSub16Sub2.aLong8866 = 0L;
        int i_24_ = MenuEntry.getWindowMode(-82);
        if (i_22_ == 102) {
            if (i == 3 || i_24_ == 3) bool = true;
            if (!NodeSub8.toolkit.method3695()) bool = true;
            ScreenModeManager.setScreenMode((byte) -125, bool, i_21_, i_24_, i, i_23_);
        }
    }

    /** Clamp {@code i_25_} to the inclusive {@code [i_26_, i]} range. */
    static final int clamp(int i, int i_25_, int i_26_, int i_27_) {
        anInt1476++;
        int i_28_ = 106 / ((-20 - i_27_) / 48);
        if (i_26_ > i_25_) return i_26_;
        return Math.min(i_25_, i);
    }

    /** Absorb {@code l} bits from {@code is}. */
    final void update(long l, byte[] is, int i) {
        try {
            anInt1464++;
            int i_29_ = 0;
            int i_30_ = 8 - ((int) l & 0x7) & 0x7;
            int i_31_ = anInt1463 & 0x7;
            long l_32_ = l;
            int i_33_ = 31;
            int i_34_ = 0;
            for (/**/; i_33_ >= 0; i_33_--) {
                i_34_ += (0xff & aByteArray1465[i_33_]) - -(0xff & (int) l_32_);
                aByteArray1465[i_33_] = (byte) i_34_;
                l_32_ >>>= 8;
                i_34_ >>>= 8;
            }
            int i_35_ = 6 % ((i - 64) / 52);
            while (l > 8L) {
                int i_36_ = (is[i_29_] << i_30_ & 0xff | (0xff & is[1 + i_29_]) >>> 8 + -i_30_);
                if (i_36_ < 0 || i_36_ >= 256) throw new RuntimeException("LOGIC ERROR");
                aByteArray1475[anInt1468] = (byte) Component224.bitwiseOr(aByteArray1475[anInt1468], i_36_ >>> i_31_);
                anInt1468++;
                anInt1463 += 8 - i_31_;
                if (anInt1463 == 512) {
                    method827(0);
                    anInt1463 = anInt1468 = 0;
                }
                aByteArray1475[anInt1468] = (byte) GpsOverlay.bitwiseAnd(i_36_ << -i_31_ + 8, 255);
                i_29_++;
                l -= 8L;
                anInt1463 += i_31_;
            }
            int i_37_;
            if (l > 0L) {
                i_37_ = 0xff & is[i_29_] << i_30_;
                aByteArray1475[anInt1468] = (byte) Component224.bitwiseOr(aByteArray1475[anInt1468], i_37_ >>> i_31_);
            } else i_37_ = 0;
            if (l + (long) i_31_ >= 8) {
                anInt1463 += 8 - i_31_;
                l -= -i_31_ + 8;
                anInt1468++;
                if (anInt1463 == 512) {
                    method827(0);
                    anInt1463 = anInt1468 = 0;
                }
                aByteArray1475[anInt1468] = (byte) GpsOverlay.bitwiseAnd(i_37_ << 8 + -i_31_, 255);
                anInt1463 += (int) l;
            } else anInt1463 += l;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("lda.B(" + l + ',' + (is != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    /** Finalize into 64-byte {@code is}. */
    final void digest(boolean bool, int i, byte[] is) {
        anInt1470++;
        aByteArray1475[anInt1468] = (byte) Component224.bitwiseOr(aByteArray1475[anInt1468], 128 >>> GpsOverlay.bitwiseAnd(anInt1463, 7));
        anInt1468++;
        if (anInt1468 > 32) {
            while (anInt1468 < 64) aByteArray1475[anInt1468++] = (byte) 0;
            method827(0);
            anInt1468 = 0;
        }
        while (anInt1468 < 32) aByteArray1475[anInt1468++] = (byte) 0;
        Component313.arraycopy(aByteArray1465, 0, aByteArray1475, 32, 32);
        method827(0);
        int i_38_ = 0;
        if (bool != true) method830(-1, -123, (byte) 39, false, 61);
        int i_39_ = i;
        while (i_38_ < 8) {
            long l = aLongArray1474[i_38_];
            is[i_39_] = (byte) (int) (l >>> 56);
            is[i_39_ + 1] = (byte) (int) (l >>> 48);
            is[2 + i_39_] = (byte) (int) (l >>> 40);
            is[i_39_ - -3] = (byte) (int) (l >>> 32);
            is[i_39_ + 4] = (byte) (int) (l >>> 24);
            is[i_39_ + 5] = (byte) (int) (l >>> 16);
            is[6 + i_39_] = (byte) (int) (l >>> 8);
            is[i_39_ + 7] = (byte) (int) l;
            i_38_++;
            i_39_ += 8;
        }
    }

    public LogicError() {
        anInt1468 = 0;
        anInt1463 = 0;
        aLongArray1472 = new long[8];
        aLongArray1473 = new long[8];
        aByteArray1475 = new byte[64];
        aLongArray1469 = new long[8];
        aLongArray1474 = new long[8];
    }
}
