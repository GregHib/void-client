/* Component342 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component342
/**
 * RENAMED from `Class68` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    int anInt1178;
    static Component342 aClass68_1179 = new Component342(1);
    static int anInt1180;
    static Component342 aClass68_1181 = new Component342(2);
    static Component342 aClass68_1182 = new Component342(4);
    static Component342 aClass68_1183 = new Component342(1);
    static Component342 aClass68_1184 = new Component342(2);
    static Component342 aClass68_1185 = new Component342(4);
    static Component342 aClass68_1186 = new Component342(2);
    static Component342 aClass68_1187 = new Component342(4);
    /** Pixel height of one developer-console history row (ascent+descent+pad). */
    static int consoleLineHeight;
    /** Production build channel ({@code id}=0). */
    static BuildType LIVE;
    static int[][] anIntArrayArray1190 = {{2, 4}, {2, 4}, {5, 2, 4}, {4, 5, 2}, {2, 4, 5}, {5, 2, 4}, {1, 6, 2, 5}, {1, 6, 7, 1}, {6, 7, 1, 1}, {0, 8, 9, 8, 9, 4}, {8, 9, 4, 0, 8, 9}, {2, 10, 0, 10, 11, 11}, {2, 4}, {1, 6, 7, 1}, {1, 6, 7, 1}};

    public static void method719(byte i) {
        aClass68_1183 = null;
        aClass68_1184 = null;
        aClass68_1181 = null;
        if (i == 72) {
            aClass68_1182 = null;
            anIntArrayArray1190 = null;
            aClass68_1187 = null;
            LIVE = null;
            aClass68_1179 = null;
            aClass68_1186 = null;
            aClass68_1185 = null;
        }
    }

    private Component342(int i) {
        this.anInt1178 = i;
    }

    public final String toString() {
        anInt1180++;
        throw new IllegalStateException();
    }

    static {
        LIVE = new BuildType("LIVE", 0);
    }
}
