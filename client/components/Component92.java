/* Component92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component92
/**
 * RENAMED from `Class260` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static Component183 aClass114_3307 = new Component183(56, 2);
    static int anInt3308;
    static CacheStore aClass45_3309;
    /** Camera shake offset on world Z/Y (±55); applied when following the local player. */
    static int cameraShakeZ;
    static int[] anIntArray3311;
    /** How many {@code -->} history steps above the newest line (console up/down recall). */
    static int consoleHistoryDepth = 0;

    static final boolean method1977(byte i, int i_0_) {
        if (i != -79) return false;
        anInt3308++;
        return i_0_ == 3 || i_0_ == 7 || i_0_ == 10;
    }

    static final void method1978() {
        for (int i = 0; i < LoggedOutDefinition.aClass293Array9432.length; i++)
            LoggedOutDefinition.aClass293Array9432[i].method2205();
        LoggedOutDefinition.aClass293Array9432 = null;
    }

    public static void method1979(byte i) {
        aClass45_3309 = null;
        anIntArray3311 = null;
        if (i < 105) method1978();
        aClass114_3307 = null;
    }

    static {
        cameraShakeZ = 0;
        anIntArray3311 = new int[1];
    }
}
