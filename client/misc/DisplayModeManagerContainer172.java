/* DisplayModeManagerContainer172 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer172
/**
 * RENAMED from `Class40` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    int anInt522;
    boolean[] aBooleanArray523;
    int anInt524;
    int[] anIntArray525 = new int[6];
    int anInt526;
    byte[] aByteArray527;
    byte[] aByteArray528;
    int[][] anIntArrayArray529;
    int anInt530;
    byte[] aByteArray531 = new byte[18002];
    boolean[] aBooleanArray532;
    int anInt533;
    byte[] aByteArray534;
    int[] anIntArray535;
    int anInt536;
    int anInt537;
    int anInt538;
    byte aByte539;
    int[] anIntArray540;
    int anInt541;
    static int anInt542;
    static int[] anIntArray543;
    byte[] aByteArray544;
    byte[] aByteArray545;
    int anInt546;
    static int anInt547;
    int anInt548;
    byte[][] aByteArrayArray549;
    int anInt550;
    static int anInt551;
    int anInt552;
    int[][] anIntArrayArray553;
    int anInt554;
    int anInt555;
    int[][] anIntArrayArray556;
    int[] anIntArray557;
    static int anInt558 = -1;

    static final void method368(int i, int i_0_, boolean bool, int i_1_, CacheStore class45, int i_2_, int i_3_) {
        if (i_0_ != 18002) anInt558 = 41;
        anInt551++;
        if (i_3_ > 0) {
            InputHandler.aBoolean4275 = bool;
            PlayerState.anInt7068 = 1;
            DisplayModeManagerContainer77.aClass45_1848 = class45;
            Component197.anInt10074 = i_1_;
            DebugPanic.aClass348_Sub16_Sub3_4743 = null;
            Renderable.anInt3971 = i_2_;
            Component255.anInt1059 = i;
            Component329.anInt5994 = (Component122.aClass348_Sub16_Sub3_1564.getActiveVoices((byte) 103) / i_3_);
            if (Component329.anInt5994 < 1) Component329.anInt5994 = 1;
        } else NodeSub1Sub3.method2732(i_2_, i_1_, bool, 123, class45, i);
    }

    static final void method369(int i) {
        NodeSub45.aClass105Array7107 = null;
        DisplayModeManagerContainer199.aClass105Array5857 = null;
        NodeSub12.aClass105Array6742 = null;
        Component49.aClass105Array4679 = null;
        if (i != -29776) method370(true);
        NpcComposition.aClass105_1365 = null;
        Component361.aClass105Array367 = null;
        Component379.aClass105Array5933 = null;
        Component33.aClass105Array2640 = null;
        DefinitionSub37.aClass105Array9467 = null;
        NodeList.aClass324_3326 = null;
        ColoredText.aClass105_6097 = null;
        Applet_Sub1.aClass324_20 = null;
        Component49.aClass324_4684 = null;
        RequestProcessor.aClass105Array2260 = null;
        Component22.aClass105Array1744 = null;
        Component235.aClass105Array3378 = null;
        Component210.aClass105Array5294 = null;
        Component141.aClass105Array9959 = null;
        anInt542++;
    }

    public static void method370(boolean bool) {
        if (bool != true) anIntArray543 = null;
        anIntArray543 = null;
    }

    static final boolean method371(int i, int i_4_, int i_5_) {
        if (i_4_ != 256) return true;
        anInt547++;
        return (i & 0x180) != 0;
    }

    DisplayModeManagerContainer172() {
        this.anInt522 = 0;
        this.anIntArrayArray529 = new int[6][258];
        this.anIntArray535 = new int[256];
        this.aByteArray544 = new byte[18002];
        this.aBooleanArray523 = new boolean[256];
        this.aByteArray528 = new byte[256];
        this.anInt548 = 0;
        this.aByteArrayArray549 = new byte[6][258];
        this.aByteArray545 = new byte[4096];
        this.anIntArray540 = new int[16];
        this.aBooleanArray532 = new boolean[16];
        this.anIntArrayArray553 = new int[6][258];
        this.anIntArrayArray556 = new int[6][258];
        this.anIntArray557 = new int[257];
    }
}
