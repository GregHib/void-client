/* Component243 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component243
/**
 * RENAMED from `Class35` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt483;
    static int anInt484;
    static int anInt485;

    static final void method352(int i) {
        anInt483++;
        DisplayModeManagerContainer133.method1265(i + 15);
        IOException_Sub1.configureAudio(Component192.preferences.aClass239_Sub5_7240.method1739(-32350) == 1, 2, true, 22050);
        Definition.aClass279_7042 = Component321.method1439(22050, OggUrlStream.aClass297_8992, DisplayModeManagerContainer50.gameCanvas, 0, 7);
        HashNodeSub18.method3273(true, i + -82, Component16.method1326(null, 9));
        Component276.aClass279_2596 = Component321.method1439(2048, OggUrlStream.aClass297_8992, DisplayModeManagerContainer50.gameCanvas, i, 7);
        Component276.aClass279_2596.method2088(false, PlayerState.aClass348_Sub16_Sub4_7065);
    }

    static final int method353(int i, int i_0_, int i_1_) {
        anInt485++;
        if (i_1_ == -2) return 12345678;
        if (i_0_ > -25) return 58;
        if (i_1_ == -1) {
            if (i >= 2) {
                if (i > 126) i = 126;
            } else i = 2;
            return i;
        }
        i = (0x7f & i_1_) * i >> 7;
        if (i < 2) i = 2;
        else if (i > 126) i = 126;
        return i + (0xff80 & i_1_);
    }
}
