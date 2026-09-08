/* FriendLoginMessage - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from {@code Class318_Sub9_Sub1} (JODE-obfuscated).
 * Pending friend login/logout chat tip. {@link #worldId} 0 = logged out; else world.
 * Shown with {@link FriendsIgnoreList} "has logged in/out" strings; expires after ~5s.
 */
final class FriendLoginMessage extends RenderableSub9 {
    static int anInt8782;
    /** Friend display name. */
    String username;
    static float aFloat8784;
    static int[] anIntArray8785;
    /** World id, or 0 if logged out. */
    short worldId;
    /** Creation time in whole seconds (tips drop after ~5s). */
    int timestampSeconds = (int) (Component240.currentTimeMillis(-92) / 1000L);
    static int anInt8788;

    /** Cache usable modes (≥800×600, prefer deep colour); dedupe by resolution. */
    static final DisplayModeInfo[] getFilteredDisplayModes(int i) {
        if (i != 1494) getFilteredDisplayModes(-18);
        anInt8782++;
        if (NativeLibraryLoader.cachedDisplayModes == null) {
            DisplayModeInfo[] class57s = Component248.getDisplayModes((byte) -107, OggUrlStream.aClass297_8992);
            DisplayModeInfo[] class57s_0_ = new DisplayModeInfo[class57s.length];
            int i_1_ = 0;
            int i_2_ = Component192.preferences.aClass239_Sub23_7231.method1818(-32350);
            while_108_:
            for (int i_3_ = 0; class57s.length > i_3_; i_3_++) {
                DisplayModeInfo class57 = class57s[i_3_];
                if ((class57.bitDepth <= 0 || class57.bitDepth >= 24) && class57.width >= 800 && class57.height >= 600 && (i_2_ != 2 || (class57.width <= 800) && class57.height <= 600) && (i_2_ != 1 || ((class57.width <= 1024) && (class57.height <= 768)))) {
                    for (int i_4_ = 0; i_4_ < i_1_; i_4_++) {
                        DisplayModeInfo class57_5_ = class57s_0_[i_4_];
                        if ((class57_5_.width == class57.width) && (class57_5_.height == class57.height)) {
                            if (class57.bitDepth > class57_5_.bitDepth) class57s_0_[i_4_] = class57;
                            continue while_108_;
                        }
                    }
                    class57s_0_[i_1_] = class57;
                    i_1_++;
                }
            }
            NativeLibraryLoader.cachedDisplayModes = new DisplayModeInfo[i_1_];
            Component313.arraycopyObjects(class57s_0_, 0, NativeLibraryLoader.cachedDisplayModes, 0, i_1_);
            int[] is = new int[NativeLibraryLoader.cachedDisplayModes.length];
            for (int i_6_ = 0; (NativeLibraryLoader.cachedDisplayModes.length > i_6_); i_6_++) {
                DisplayModeInfo class57 = NativeLibraryLoader.cachedDisplayModes[i_6_];
                is[i_6_] = (class57.width * class57.height);
            }
            DisplayModeManagerContainer271.method366(NativeLibraryLoader.cachedDisplayModes, (byte) -123, is);
        }
        return NativeLibraryLoader.cachedDisplayModes;
    }

    static final RSARequest method2516(int i, byte i_7_, int i_8_) {
        anInt8788++;
        RSARequest class348_sub42_sub15 = ((RSARequest) Component265.aClass356_1585.get(((long) i_8_ << 32 | (long) i), i_7_ ^ ~0x171e));
        if (i_7_ != 105) aFloat8784 = 0.99212307F;
        if (class348_sub42_sub15 == null) {
            class348_sub42_sub15 = new RSARequest(i_8_, i);
            Component265.aClass356_1585.put((byte) 91, (class348_sub42_sub15.key), class348_sub42_sub15);
        }
        return class348_sub42_sub15;
    }

    public static void method2517(byte i) {
        if (i != 4) anIntArray8785 = null;
        anIntArray8785 = null;
    }

    FriendLoginMessage(String string, int i) {
        this.username = string;
        this.worldId = (short) i;
    }
}
