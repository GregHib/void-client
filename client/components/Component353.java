/* Component353 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component353
/**
 * RENAMED from `Class192` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    Interface5_Impl2 anInterface5_Impl2_2572;
    static int anInt2573;
    boolean aBoolean2574;
    static int anInt2575;
    Interface5_Impl2 anInterface5_Impl2_2576;
    boolean aBoolean2577;
    /** Camera focus world Z (lerped toward player/orbit target). */
    static int cameraFocusZ;
    static short[] aShortArray2579;
    static int anInt2580;
    static int anInt2581 = 0;
    static int anInt2582;

    static final void method1434(int i) {
        anInt2573++;
        for (RenderableSub6 class318_sub6 = (RenderableSub6) InputStream_Sub2.aClass243_83.method1875(60); class318_sub6 != null; class318_sub6 = ((RenderableSub6) InputStream_Sub2.aClass243_83.method1875(60)))
            DisplayModeManagerContainer104.clearSub6(class318_sub6, true);
        int i_0_;
        int i_1_;
        if (Component192.preferences.aClass239_Sub27_7261.method1840(-32350) == 1) {
            i_0_ = 0;
            i_1_ = 3;
        } else i_0_ = i_1_ = Component385.anInt2204;
        client.method115();
        for (int i_2_ = i_0_; i_2_ <= i_1_; i_2_++) {
            client.method109();
            client.method117(i_2_);
            client.method104(i_2_);
        }
        client.method106();
        if (i == -14988) client.method112();
    }

    final void method1435(byte i) {
        if (i >= -6) this.aBoolean2577 = true;
        anInt2575++;
        if (this.anInterface5_Impl2_2576 != null) this.anInterface5_Impl2_2576.method21(23315);
        this.aBoolean2577 = false;
    }

    static final boolean method1436(int i, int i_3_) {
        int i_4_ = 22 % ((i - 16) / 35);
        anInt2582++;
        return i_3_ == (i_3_ & -i_3_);
    }

    Component353(boolean bool) {
        this.aBoolean2574 = bool;
    }

    final boolean method1437(byte i) {
        anInt2580++;
        if (i != -100) this.anInterface5_Impl2_2572 = null;
        return this.aBoolean2577 && !this.aBoolean2574;
    }

    public static void method1438(int i) {
        int i_5_ = 85 % ((i - -28) / 60);
        aShortArray2579 = null;
    }
}
