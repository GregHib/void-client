/* NativeLibLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from {@code Class334} (JODE-obfuscated).
 * Grab-bag of small helpers that ended up in one deob class: platform native-lib
 * file-name mapping, HSL colour lerp, digit/client-state predicates, plus a
 * 6-int parameter blob (defaults 128) used by sprite/minimap scale paths.
 */

final class NativeLibLoader {
    int anInt4151;
    static int[] anIntArray4152 = {4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
    static int anInt4153;
    int anInt4154;
    static int anInt4155 = -1;
    int anInt4156;
    static int anInt4157;
    int anInt4158;
    static int anInt4159;
    static int anInt4160;
    static int anInt4161;
    /** Default scale component (often width); starts at 128. */
    int anInt4162 = 128;
    static int anInt4163;
    static int anInt4164;
    /** Default scale component (often height); starts at 128. */
    int anInt4165 = 128;

    /** True when {@code c} is an ASCII decimal digit. */
    static final boolean isDigit(boolean bool, char c) {
        anInt4161++;
        if (bool != true) isPostLoginState(true, 83);
        return c >= '0' && c <= '9';
    }

    /** Copies the six int parameters from {@code class334_0_} into this. */
    final void copyFrom(NativeLibLoader class334_0_, byte i) {
        this.anInt4158 = class334_0_.anInt4158;
        this.anInt4151 = class334_0_.anInt4151;
        if (i != 118) isDigit(true, '\uffe5');
        anInt4159++;
        this.anInt4156 = class334_0_.anInt4156;
        this.anInt4165 = class334_0_.anInt4165;
        this.anInt4154 = class334_0_.anInt4154;
        this.anInt4162 = class334_0_.anInt4162;
    }

    /** Returns a new instance with the same six int parameters. */
    final NativeLibLoader copy(int i) {
        if (i != 2) copyFrom(null, (byte) -10);
        anInt4163++;
        return new NativeLibLoader(this.anInt4156, this.anInt4165, this.anInt4162, this.anInt4158, this.anInt4154, this.anInt4151);
    }

    static final void method2650(Component184 class143, int i, Shader var_aa, int i_1_, int i_2_, String string, int i_3_, BitmapFont class324, int i_4_, DisplayModeManagerContainer57 class46, int i_5_, int i_6_) {
        try {
            anInt4153++;
            int i_7_;
            if (DefinitionSub21.cameraMode == 4) i_7_ = (int) Component112.cameraYaw & 0x3fff;
            else i_7_ = 0x3fff & CacheNodeSub2.anInt10483 + (int) Component112.cameraYaw;
            int i_8_ = (Math.max(class46.width / 2, class46.height / 2) + 10);
            int i_9_ = i_5_ * i_5_ - -(i_1_ * i_1_);
            if (i_9_ <= i_8_ * i_8_) {
                int i_10_ = DisplayModeManagerContainer88.anIntArray1207[i_7_];
                int i_11_ = DisplayModeManagerContainer88.anIntArray1204[i_7_];
                if (DefinitionSub21.cameraMode != 4) {
                    i_11_ = 256 * i_11_ / (Component182.anInt9750 + 256);
                    i_10_ = 256 * i_10_ / (256 + Component182.anInt9750);
                }
                int i_12_ = i_10_ * i_1_ + i_5_ * i_11_ >> 14;
                int i_13_ = -(i_5_ * i_10_) + i_11_ * i_1_ >> 14;
                int i_14_ = class143.method1187(string, false, 100, null);
                int i_15_ = class143.method1185(null, 0, 0, i_6_, string);
                i_12_ -= i_14_ / 2;
                if (-class46.width <= i_12_ && class46.width >= i_12_ && (i_13_ >= -class46.height) && class46.height >= i_13_)
                    class324.method2584(null, 0, 0, null, i, 0, 50, var_aa, (-i_4_ + (i_3_ + (class46.height / 2 + (-i_13_ - i_15_)))), i_2_, i_3_, i_14_, (class46.width / 2 + (i_2_ + i_12_)), false, 1, string);
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("dk.H(" + (class143 != null ? "{...}" : "null") + ',' + i + ',' + (var_aa != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ',' + (string != null ? "{...}" : "null") + ',' + i_3_ + ',' + (class324 != null ? "{...}" : "null") + ',' + i_4_ + ',' + (class46 != null ? "{...}" : "null") + ',' + i_5_ + ',' + i_6_ + ')'));
        }
    }

    /**
     * Maps a bare library stem (e.g. {@code jaclib}) to the platform file name:
     * {@code .dll} / {@code lib*.so} / {@code lib*.dylib}. Returns null if OS unknown.
     */
    static final String toNativeLibraryFileName(String string, int i) {
        if (i != 3) method2650(null, -94, null, 2, -110, null, -7, null, -71, null, -47, 104);
        anInt4160++;
        if (!ClientSystemInfo.aString6877.startsWith("win")) {
            if (ClientSystemInfo.aString6877.startsWith("linux")) return "lib" + string + ".so";
            if (ClientSystemInfo.aString6877.startsWith("mac")) return "lib" + string + ".dylib";
        } else return string + ".dll";
        return null;
    }

    /**
     * Linearly blends two packed HSL colours by weight {@code i_18_} in 0..128
     * (channels: 7-bit L, 3-bit S, 6-bit H).
     */
    static final int mixHsl(int i, int i_16_, int i_17_, int i_18_) {
        anInt4157++;
        if (i == i_16_) return i;
        int i_19_ = 128 + -i_18_;
        if (i_17_ != 1) return -53;
        int i_20_ = (0x7f & i_16_) * i_18_ + i_19_ * (i & 0x7f) >> 7;
        int i_21_ = (0x380 & i_16_) * i_18_ + (i & 0x380) * i_19_ >> 7;
        int i_22_ = (0xfc00 & i_16_) * i_18_ + i_19_ * (i & 0xfc00) >> 7;
        return i_22_ & 0xfc00 | 0x380 & i_21_ | i_20_ & 0x7f;
    }

    /** True for client states 10/11/12 (lobby / world / post-login variants). */
    static final boolean isPostLoginState(boolean bool, int i) {
        if (bool != true) anIntArray4152 = null;
        anInt4164++;
        return i == 10 || i == 11 || i == 12;
    }

    public static void method2654(int i) {
        if (i != -6896) anInt4155 = -7;
        anIntArray4152 = null;
    }

    NativeLibLoader(int i) {
        this.anInt4156 = i;
    }

    private NativeLibLoader(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
        this.anInt4156 = i;
        this.anInt4165 = i_23_;
        this.anInt4154 = i_26_;
        this.anInt4158 = i_25_;
        this.anInt4162 = i_24_;
        this.anInt4151 = i_27_;
    }
}
