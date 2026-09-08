/* DisplayModeManagerContainer145 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer145
/**
 * RENAMED from `Class122` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static boolean aBoolean1801;
    static int anInt1802;
    static int anInt1803;
    static int anInt1804;
    static int anInt1805;
    /** Whether each friend entry is marked referred. */
    static boolean[] friendReferred = new boolean[200];
    static int anInt1807;
    /** Ignore-list display names. */
    static String[] ignoreDisplayNames;
    static int anInt1809;

    static final void method1085(int i, int i_0_, byte i_1_, int i_2_, int i_3_) {
        anInt1805++;
        RSARequest class348_sub42_sub15 = FriendLoginMessage.method2516(i_3_, (byte) 105, 8);
        class348_sub42_sub15.method3246(-25490);
        class348_sub42_sub15.anInt9652 = i_0_;
        if (i_1_ < -57) {
            class348_sub42_sub15.anInt9650 = i;
            class348_sub42_sub15.anInt9651 = i_2_;
        }
    }

    /** Nulls friend/ignore static arrays at shutdown. */
    public static void clearStatics(boolean bool) {
        if (bool != true) anInt1803 = -25;
        ignoreDisplayNames = null;
        friendReferred = null;
    }

    static final boolean method1087(int i, int i_4_, int i_5_) {
        if (i != 12644) method1085(55, -60, (byte) -29, -35, -112);
        anInt1809++;
        return (0x84080 & i_5_) != 0;
    }

    /**
     * Cosine-weighted mix of {@code i} and {@code i_9_}; {@code i_8_}/{@code i_7_} pick the
     * angle into {@link DisplayModeManagerContainer88#anIntArray1204}.
     */
    static final int mixCosine(int i, byte i_6_, int i_7_, int i_8_, int i_9_) {
        anInt1804++;
        int i_10_ = -DisplayModeManagerContainer88.anIntArray1204[8192 * i_8_ / i_7_] + 65536 >> 1;
        if (i_6_ != 22) return -73;
        return ((i_10_ * i >> 16) + (i_9_ * (65536 + -i_10_) >> 16));
    }

    /** True if {@code c} is representable in the client's CP1252 text encoding. */
    static final boolean isCp1252Char(int i, char c) {
        anInt1807++;
        if (i >= -107) friendReferred = null;
        if (c > 0 && c < 128 || c >= 160 && c <= 255) return true;
        if (c != 0) {
            char[] cs = Component352.cp1252HighChars;
            for (int i_11_ = 0; cs.length > i_11_; i_11_++) {
                int i_12_ = cs[i_11_];
                if (c == i_12_) return true;
            }
        }
        return false;
    }

    static final void method1090(byte[][] is, int i, Component251 class237_sub1) {
        try {
            anInt1802++;
            int i_13_ = DisplayModeManagerContainer322.aByteArrayArray4281.length;
            if (i == 65536) {
                for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
                    byte[] is_15_ = is[i_14_];
                    if (is_15_ != null) {
                        int i_16_ = (64 * (OggStreamReader.anIntArray9042[i_14_] >> 8) + -NodeBaseSub2.regionTileX);
                        int i_17_ = ((OggStreamReader.anIntArray9042[i_14_] & 0xff) * 64 - Component330.regionTileY);
                        Component381.method3570(false);
                        class237_sub1.method1695(is_15_, (NodeSub45.aClass361Array7108), i_17_, NodeSub8.toolkit, i_16_, i ^ 0x1054f);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("nga.C(" + (is != null ? "{...}" : "null") + ',' + i + ',' + (class237_sub1 != null ? "{...}" : "null") + ')'));
        }
    }

    static {
        anInt1803 = 0;
        ignoreDisplayNames = new String[100];
    }
}
