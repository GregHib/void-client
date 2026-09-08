/* Request - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class348_Sub26` (JODE-obfuscated).
 * Queued request node (extends Node). Wraps a String command (enqueue builds one from a String) and is enqueued into a NodeList processed by RequestProcessor.
 */

final class Request extends Node {
    static HashNodeSub14 aClass348_Sub42_Sub14_6885;
    static int anInt6886;
    volatile int anInt6887 = -1;
    volatile String aString6888;
    static short[] aShortArray6889;
    static int[] anIntArray6890 = new int[32];
    static DisplayModeManagerContainer238 aClass74_6891;

    public static void method2998(byte i) {
        anIntArray6890 = null;
        aClass348_Sub42_Sub14_6885 = null;
        aClass74_6891 = null;
        aShortArray6889 = null;
        if (i != -35) method2999((byte) -26, -20);
    }

    static final void method2999(byte i, int i_0_) {
        anInt6886++;
        RSARequest class348_sub42_sub15 = FriendLoginMessage.method2516(i_0_, (byte) 105, 7);
        if (i < 42) method2999((byte) 62, -64);
        class348_sub42_sub15.method3251(-16058);
    }

    Request(String string) {
        this.aString6888 = string;
    }

    static {
        aShortArray6889 = new short[256];
        aClass74_6891 = new DisplayModeManagerContainer238(1, 4);
    }
}
