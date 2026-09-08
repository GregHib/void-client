/* DisplayModeManagerContainer259 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer259
/**
 * RENAMED from `Class268` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    int anInt3429;
    private static short[] aShortArray3430 = {-1, -1, -1, -1, -1};
    static int anInt3431;
    static int[] anIntArray3432 = new int[500];
    private final NodeCache aClass60_3433 = new NodeCache(64);
    static int anInt3434;
    static int anInt3435;
    static int anInt3436;
    private static short[] aShortArray3437;
    static boolean[] aBooleanArray3438;
    static int anInt3439 = 16777215;
    static int anInt3440;
    static int anInt3441 = 0;
    private final CacheStore aClass45_3442;
    static short[][] aShortArrayArray3443;
    static int anInt3444;
    static int anInt3445;
    static int anInt3446;
    int anInt3447 = 0;
    static int anInt3448;
    private static short[] aShortArray3449;

    static final long method2031(int i, String string) {
        anInt3448++;
        long l = 0L;
        int i_0_ = string.length();
        for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
            l *= 37L;
            int i_2_ = string.charAt(i_1_);
            if (i_2_ < 65 || i_2_ > 90) {
                if (i_2_ >= 97 && i_2_ <= 122) l += 1 - (-i_2_ + 97);
                else if (i_2_ >= 48 && i_2_ <= 57) l += i_2_ + 27 - 48;
            } else l += 1 + (i_2_ + -65);
            if (l >= 177917621779460413L) break;
        }
        if (i != -1994) aShortArrayArray3443 = null;
        for (/**/; (l % 37L == 0 && l != 0); l /= 37L) {
            /* empty */
        }
        return l;
    }

    final void method2032(int i, int i_3_) {
        synchronized (aClass60_3433) {
            aClass60_3433.processSoftEntries(2, i);
            if (i_3_ > -10) method2035(116, 38);
        }
        anInt3436++;
    }

    final void method2033(byte i) {
        anInt3434++;
        synchronized (aClass60_3433) {
            if (i != 46) method2037(-66);
            aClass60_3433.purgeSoftReferences(-94);
        }
    }

    final Component11 method2034(int i, boolean bool) {
        if (bool != false) aShortArray3437 = null;
        anInt3431++;
        Component11 class277;
        synchronized (aClass60_3433) {
            class277 = (Component11) aClass60_3433.get(i, 64);
        }
        if (class277 != null) return class277;
        byte[] is;
        synchronized (aClass45_3442) {
            is = aClass45_3442.getFile(-1860, 4, i);
        }
        class277 = new Component11();
        class277.anInt3573 = i;
        class277.aClass268_3562 = this;
        if (is != null) class277.method2070(true, new Buffer(is));
        class277.method2067(-4860);
        synchronized (aClass60_3433) {
            aClass60_3433.putOne(class277, i, (byte) -111);
        }
        return class277;
    }

    static final void method2035(int i, int i_4_) {
        anInt3445++;
        int i_5_ = OpenGlShader.clientCycle - Component182.anInt9751;
        if (i_5_ >= 100) {
            DefinitionSub21.cameraMode = 1;
            JaclibLoader.anInt167 = ShaderLinker.anInt10163 = -1;
        } else {
            int i_6_ = (int) DisplayModeManagerContainer154.cameraPitch;
            if (i_6_ < NodeSub35.anInt6979 >> 8) i_6_ = NodeSub35.anInt6979 >> 8;
            if (Component113.aBooleanArray2374[4] && ItemDefinitionProvider.anIntArray3273[4] - -128 > i_6_) i_6_ = ItemDefinitionProvider.anIntArray3273[4] + 128;
            int i_7_ = 0x3fff & (int) Component112.cameraYaw + Component195.anInt5016;
            if (i_4_ != 0) method2031(-117, null);
            DisplayModeManagerContainer167.method268(i_6_, -200 + (Component300.method2064((Component72.localPlayer.x), Component117.anInt4372, 11219, (Component72.localPlayer.y))), i_7_, Component353.cameraFocusZ, i, -19360, DisplayModeManagerContainer273.cameraFocusX, 3 * (i_6_ >> 3) + 600 << 2);
            float f = (-((float) ((100 + -i_5_) * (100 - i_5_) * (-i_5_ + 100)) / 1000000.0F) + 1.0F);
            WaterSurfaceShader.anInt6246 = (int) ((float) Component29.anInt10047 + f * (float) (-Component29.anInt10047 + WaterSurfaceShader.anInt6246));
            DisplayModeManagerContainer50.anInt3855 = (int) ((float) (-DisplayModeManagerContainer89.anInt8368 + DisplayModeManagerContainer50.anInt3855) * f + (float) DisplayModeManagerContainer89.anInt8368);
            HashNodeSub19.anInt9701 = (int) ((float) Component69.anInt3662 + (float) (HashNodeSub19.anInt9701 - Component69.anInt3662) * f);
            Component317.anInt8685 = (int) ((float) Component135.anInt4424 + f * (float) (-Component135.anInt4424 + Component317.anInt8685));
            int i_8_ = Component298.anInt4638 - Component193.anInt3253;
            if (i_8_ <= 8192) {
                if (i_8_ < -8192) i_8_ += 16384;
            } else i_8_ -= 16384;
            Component298.anInt4638 = (int) ((float) i_8_ * f + (float) Component193.anInt3253);
            Component298.anInt4638 &= 0x3fff;
        }
    }

    public static void method2036(byte i) {
        aShortArrayArray3443 = null;
        aShortArray3437 = null;
        if (i != 121) method2035(57, 35);
        aShortArray3449 = null;
        aShortArray3430 = null;
        anIntArray3432 = null;
        aBooleanArray3438 = null;
    }

    final void method2037(int i) {
        synchronized (aClass60_3433) {
            aClass60_3433.clear(0);
        }
        anInt3440++;
    }

    static final void method2038(int i) {
        if (i <= -47) {
            for (int i_9_ = 0; i_9_ < Component335.anInt2021; i_9_++) {
                RunescapeInfo class10 = GlFramebufferTexture.aClass10Array8531[i_9_];
                if (class10.aByte180 == 3) {
                    if (class10.aClass348_Sub16_Sub5_176 == null) class10.anInt188 = -2147483648;
                    else PlayerState.aClass348_Sub16_Sub4_7065.method2880(class10.aClass348_Sub16_Sub5_176);
                }
            }
            anInt3446++;
        }
    }

    DisplayModeManagerContainer259(GameType class230, int i, CacheStore class45) {
        try {
            aClass45_3442 = class45;
            this.anInt3429 = aClass45_3442.getFileCount(0, 4);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("cb.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ')'));
        }
    }

    static {
        aShortArray3437 = new short[]{-1, -1, -1, -1, -1};
        anInt3444 = 13156520;
        anInt3435 = -1;
        aBooleanArray3438 = new boolean[100];
        aShortArray3449 = new short[]{6798, 8741, 25238, 4626, 4550};
        aShortArrayArray3443 = new short[][]{aShortArray3449, aShortArray3437, aShortArray3430};
    }
}
