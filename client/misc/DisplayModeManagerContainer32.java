/* DisplayModeManagerContainer32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class DisplayModeManagerContainer32
/**
 * RENAMED from `Class47` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static Component183 aClass114_843;
    static int anInt844;
    static boolean aBoolean845 = false;
    static int anInt846 = 0;

    public DisplayModeManagerContainer32() {
        /* empty */
    }

    public static void method445(int i) {
        if (i == 2) aClass114_843 = null;
    }

    abstract long method446(int i);

    static final void method447(byte i) {
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub27_7255), 1);
        anInt844++;
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub27_7261), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub14_7250), 2);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub14_7264), 2);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub4_7220), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub9_7256), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub13_7236), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub1_7246), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub21_7270), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub24_7235), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub7_7238), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub28_7230), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub18_7259), 0);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub16_7247), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub20_7216), 0);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub20_7248), 0);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub15_7224), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub6_7226), 0);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub12_7243), 0);
        DisplayModeManagerContainer87.method1686(-126);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub23_7231), 1);
        if (i == -59) {
            Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub29_7229), 3);
            Definition.method3038(i ^ 0x3a);
            DisplayModeManagerContainer154.method773(true);
            RuntimeException_Sub1.aBoolean4604 = true;
        }
    }

    static {
        aClass114_843 = new Component183(66, 8);
    }
}
