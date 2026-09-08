/* Component72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component72
/**
 * RENAMED from `Class132` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt1905 = 4;
    static int anInt1906;
    /** The local player avatar in the world (null on title / disconnect). */
    static Player localPlayer;
    static int anInt1908;
    static int[] anIntArray1909;
    static int anInt1910 = 0;
    static int anInt1911 = 7000;

    public static void method1137(int i) {
        if (i != 3) method1138(null, true, null, (byte) 70);
        anIntArray1909 = null;
        localPlayer = null;
    }

    static final void method1138(String string, boolean bool, String string_0_, byte i) {
        try {
            anInt1908++;
            DisplayModeManagerContainer282.username = string;
            DisplayModeManagerContainer51.password = string_0_;
            DisplayModeManagerContainer58.aBoolean10238 = bool;
            if (!DisplayModeManagerContainer58.aBoolean10238 && (DisplayModeManagerContainer282.username.equals("") || DisplayModeManagerContainer51.password.equals(""))) WorldNameText.method254(3, (byte) -100);
            else {
                // Persist for next launch / auto-login (desktop + mobile).
                LoginPrefs.remember(DisplayModeManagerContainer282.username, DisplayModeManagerContainer51.password);
                int i_1_ = 34 % ((16 - i) / 55);
                if (Component205.anInt5969 != 1) {
                    Component227.anInt1121 = 0;
                    HashNodeSub7.anInt9541 = -1;
                }
                Component338.aBoolean1712 = false;
                WorldNameText.method254(-3, (byte) -94);
                Component241.anInt2955 = 1;
                Component53.anInt197 = 0;
                Component212.anInt9971 = 0;
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("nr.A(" + (string != null ? "{...}" : "null") + ',' + bool + ',' + (string_0_ != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    static {
        anInt1906 = anInt1911;
    }
}
