/* Component14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component14
/**
 * RENAMED from `Class369_Sub2` (JODE-obfuscated).
 * Evidence: subclass of Component27 (hierarchy)
 */ extends Component27 {
    static DisplayModeManagerContainer57[][] aClass46ArrayArray8584;
    int anInt8585;
    static int anInt8586;
    /** Filled count of {@link ArbShaderProgram#consoleLines} (0 = empty console). */
    static int consoleLineCount = 0;
    static int anInt8588;
    static CacheStore aClass45_8589;
    static Component183 aClass114_8590 = new Component183(58, 2);
    int anInt8591;
    static Object anObject8592;
    static int anInt8593;

    public final DisplayModeManagerContainer369 method51(byte i) {
        if (i < 116) method3572(118);
        anInt8586++;
        return Buffer.aClass223_7175;
    }

    static final CacheStore method3571(boolean bool, int i, byte i_0_, int i_1_) {
        anInt8593++;
        if (i_0_ != -23) return null;
        CacheIndexReader class137 = null;
        if (DisplayModeManagerContainer356.aClass78_6328 != null) class137 = new CacheIndexReader(i, DisplayModeManagerContainer356.aClass78_6328, Component265.aClass78Array1579[i], 1000000);
        Component354.aClass314_Sub1Array223[i] = Component143.aClass340_2327.getArchive(class137, i, Component11.aClass137_3568, 255);
        Component354.aClass314_Sub1Array223[i].startVerifyPass(27872);
        return new CacheStore(Component354.aClass314_Sub1Array223[i], bool, i_1_);
    }

    Component14(Component85 class221, DisplayModeManagerContainer196 class341, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
        super(class221, class341, i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_);
        try {
            this.anInt8585 = i_9_;
            this.anInt8591 = i_8_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ou.<init>(" + (class221 != null ? "{...}" : "null") + ',' + (class341 != null ? "{...}" : "null") + ',' + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
        }
    }

    public static void method3572(int i) {
        aClass114_8590 = null;
        aClass45_8589 = null;
        if (i != 1000000) method3571(false, -66, (byte) 13, 13);
        aClass46ArrayArray8584 = null;
        anObject8592 = null;
    }
}
