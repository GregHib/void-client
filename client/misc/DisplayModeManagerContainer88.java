/* DisplayModeManagerContainer88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer88
/**
 * RENAMED from `Class70` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt1203;
    static int[] anIntArray1204;
    static int anInt1205;
    static int anInt1206;
    static int[] anIntArray1207 = new int[16384];

    public static void method725(int i) {
        anIntArray1207 = null;
        anIntArray1204 = null;
        if (i != 16384) anIntArray1207 = null;
    }

    static final void method726(int i) {
        if (i <= 88) anIntArray1204 = null;
        anInt1206++;
        if (RSARequest.currentLoadingState != null) {
            ObjectDefinition.aClass311_897 = new ResourceLoader();
            ObjectDefinition.aClass311_897.method2316(RSARequest.currentLoadingState, RSARequest.currentLoadingState.aClass274_1012.getLocalized(ObjectDeserializer.languageId, 544), RSARequest.currentLoadingState.maxProgress, Component69.aLong3660, false);
            NodeSub32.aThread6946 = new Thread(ObjectDefinition.aClass311_897, "");
            NodeSub32.aThread6946.start();
        }
    }

    static final void method727(byte i, int i_0_, int i_1_, int i_2_) {
        anInt1205++;
        RSARequest class348_sub42_sub15 = FriendLoginMessage.method2516(i_2_, (byte) 105, 9);
        class348_sub42_sub15.method3246(i + -25427);
        class348_sub42_sub15.anInt9652 = i_1_;
        class348_sub42_sub15.anInt9651 = i_0_;
        if (i != -63) anIntArray1207 = null;
    }

    public final String toString() {
        anInt1203++;
        throw new IllegalStateException();
    }

    public DisplayModeManagerContainer88() {
        /* empty */
    }

    static {
        anIntArray1204 = new int[16384];
        double d = 3.834951969714103E-4;
        for (int i = 0; i < 16384; i++) {
            anIntArray1207[i] = (int) (16384.0 * Math.sin(d * (double) i));
            anIntArray1204[i] = (int) (Math.cos(d * (double) i) * 16384.0);
        }
    }
}
