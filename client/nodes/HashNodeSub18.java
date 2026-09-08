/* HashNodeSub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class HashNodeSub18
/**
 * RENAMED from `Class348_Sub42_Sub18` (JODE-obfuscated).
 * Evidence: subclass of HashNode (hierarchy)
 */ extends HashNode {
    static int anInt9681;
    DisplayModeManagerContainer174 aClass318_Sub1_Sub3_Sub5_9682;
    static int anInt9683;
    static StringCache aClass351_9684 = new StringCache(81, 3);
    static Component111 aClass251_9685 = new Component111();
    static int anInt9686;

    static final void method3273(boolean bool, int i, BrowserUrlOpener class348_sub16_sub3) {
        if (i > -55) method3275(117, -54, 56);
        Definition.aClass279_7042.method2088(false, class348_sub16_sub3);
        anInt9681++;
        if (bool) StaticElementRenderer.method2510(Component30.aClass45_1878, class348_sub16_sub3, Component323.aClass45_5878, false, Definition.aClass279_7042, Component132.aClass45_1815);
    }

    public static void method3274(boolean bool) {
        if (bool != true) method3273(true, -84, null);
        aClass351_9684 = null;
        aClass251_9685 = null;
    }

    HashNodeSub18(DisplayModeManagerContainer174 class318_sub1_sub3_sub5) {
        this.aClass318_Sub1_Sub3_Sub5_9682 = class318_sub1_sub3_sub5;
    }

    static final void method3275(int i, int i_0_, int i_1_) {
        anInt9683++;
        if (i != 1) aClass351_9684 = null;
        if (PacketReader.currentGameType != WorldNameText.STELLARDAWN) {
            if (!Component10.method2252(false, i_1_, i_0_, (byte) -108, 1, 0, 1, -3, 0)) Component10.method2252(false, i_1_, i_0_, (byte) -99, 1, 0, 1, -2, 0);
        } else if (!Component10.method2252(false, i_1_, i_0_, (byte) -128, 1, 0, 1, -2, 0)) Component10.method2252(false, i_1_, i_0_, (byte) -115, 1, 0, 1, -3, 0);
    }
}
