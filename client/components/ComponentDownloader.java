/* ComponentDownloader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class30` (JODE-obfuscated).
 * Native component downloader. Fetches per-platform native libraries from paths like 'universal/', 'windows/', 'msjava/'.
 */

final class ComponentDownloader {
    private int anInt404;
    private int anInt405;
    private int anInt406;
    static int[] anIntArray407 = new int[1];
    private int anInt408;
    private int anInt409;
    static int anInt410;
    static int anInt411;
    private int anInt412;
    static DisplayModeManagerContainer26 aClass84_413;
    static int anInt414;
    static int anInt415;
    private int anInt416;
    private int anInt417;
    private int anInt418;
    private int anInt419;

    static final void method319(int i, int i_0_, byte i_1_, int i_2_, int i_3_) {
        if (i_1_ != -18) method322(73);
        anInt414++;
        Component226.anInt4171 = i_2_;
        DisplayModeManagerContainer50.anInt3861 = i_0_;
        DisplayModeManagerContainer220.anInt282 = i;
        Component275.anInt2688 = i_3_;
    }

    final void method320(int i, int i_4_, byte i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
        anInt415++;
        anInt409 = i_6_;
        anInt417 = i_12_;
        anInt405 = i_7_ * i_7_;
        anInt408 = i_8_;
        anInt404 = i_10_ + anInt408;
        anInt412 = anInt408 + i_11_;
        anInt419 = anInt409 + i_13_;
        anInt418 = i_9_ + anInt409;
        anInt416 = i_4_ + anInt417;
        anInt406 = anInt417 - -i;
        if (i_5_ != -4) aClass84_413 = null;
    }

    final boolean method321(int i, int i_14_, int i_15_, int i_16_) {
        anInt411++;
        if (anInt418 > i_16_ || i_16_ > anInt419) return false;
        if (anInt416 > i_15_ || i_15_ > anInt406) return false;
        if (i_14_ < anInt412 || anInt404 < i_14_) return false;
        if (i != -14735) method323(null, null, (byte) 29);
        int i_17_ = -anInt409 + i_16_;
        int i_18_ = i_14_ + -anInt408;
        return anInt405 > i_17_ * i_17_ + i_18_ * i_18_;
    }

    public static void method322(int i) {
        anIntArray407 = null;
        aClass84_413 = null;
        if (i != 1) method322(-112);
    }

    static final void method323(CacheStore class45, ReflectionInvoker class297, byte i) {
        try {
            NodeSub41.aString7048 = "";
            Component210.aClass297_5297 = class297;
            anInt410++;
            Component385.aClass45_2208 = class45;
            if (!ClientSystemInfo.aString6877.startsWith("win")) {
                if (!ClientSystemInfo.aString6877.startsWith("linux")) {
                    if (ClientSystemInfo.aString6877.startsWith("mac")) NodeSub41.aString7048 += "macos/";
                } else NodeSub41.aString7048 += "linux/";
            } else NodeSub41.aString7048 += "windows/";
            if (i != 95) anIntArray407 = null;
            if (!Component210.aClass297_5297.useDirectDraw) {
                if (!ClientSystemInfo.aString6876.startsWith("amd64") && !ClientSystemInfo.aString6876.startsWith("x86_64")) {
                    if (!ClientSystemInfo.aString6876.startsWith("i386") && !ClientSystemInfo.aString6876.startsWith("i486") && !ClientSystemInfo.aString6876.startsWith("i586") && !ClientSystemInfo.aString6876.startsWith("x86")) {
                        if (!ClientSystemInfo.aString6876.startsWith("ppc")) NodeSub41.aString7048 += "universal/";
                        else NodeSub41.aString7048 += "ppc/";
                    } else NodeSub41.aString7048 += "x86/";
                } else NodeSub41.aString7048 += "x86_64/";
            } else NodeSub41.aString7048 += "msjava/";
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("hw.A(" + (class45 != null ? "{...}" : "null") + ',' + (class297 != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    ComponentDownloader(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
        anInt408 = i_20_;
        anInt417 = i_19_;
        anInt405 = i_21_ * i_21_;
        anInt409 = i;
        anInt412 = anInt408 + i_26_;
        anInt406 = i_25_ + anInt417;
        anInt416 = i_24_ + anInt417;
        anInt404 = i_27_ + anInt408;
        anInt419 = i_23_ + anInt409;
        anInt418 = anInt409 - -i_22_;
    }
}
