/* Component22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component22
/**
 * RENAMED from `Class113` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static long aLong1739 = 0L;
    static int anInt1740;
    static int anInt1741;
    static int anInt1742;
    static CacheStore aClass45_1743;
    static Component24[] aClass105Array1744;
    static int anInt1745 = 100;

    public Component22() {
        /* empty */
    }

    public final String toString() {
        anInt1741++;
        throw new IllegalStateException();
    }

    static final int method1056(int i, int i_0_, char c) {
        if (i_0_ != 30316) return 27;
        anInt1740++;
        int i_1_ = c << 4;
        if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
            int i_2_ = Character.toLowerCase(c);
            i_1_ = 1 + (i_2_ << 4);
        }
        return i_1_;
    }

    public static void method1057(boolean bool) {
        aClass45_1743 = null;
        aClass105Array1744 = null;
        if (bool != true) method1056(110, -57, '\uffd1');
    }
}
