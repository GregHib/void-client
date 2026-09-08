/* DisplayModeManagerContainer271 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer271
/**
 * RENAMED from `Class39` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt514;
    static DisplayModeManagerContainer238 aClass74_515 = new DisplayModeManagerContainer238(7, 7);
    static int anInt516;
    long aLong517;
    static CacheStore aClass45_518;
    private final GlExtensionManager aClass377_519;
    static DisplayModeManagerContainer67 aClass112_520;
        /** World-map Helvetica glyph cache at 14pt. */
    static FontGlyphCache helveticaGlyphs14;

    static final void method366(Object[] objects, byte i, int[] is) {
        do {
            try {
                AudioLine.method2092(is.length - 1, 0, is, -119, objects);
                anInt514++;
                if (i <= -97) break;
                method367(-67);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("ifa.B(" + (objects != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    protected final void finalize() throws Throwable {
        aClass377_519.method3966(this.aLong517, 34192);
        anInt516++;
        super.finalize();
    }

    public static void method367(int i) {
        aClass45_518 = null;
        aClass74_515 = null;
        helveticaGlyphs14 = null;
        if (i == -15833) aClass112_520 = null;
    }

    DisplayModeManagerContainer271(GlExtensionManager class377, long l, int i) {
        try {
            this.aLong517 = l;
            aClass377_519 = class377;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ifa.<init>(" + (class377 != null ? "{...}" : "null") + ',' + l + ',' + i + ')'));
        }
    }
}
