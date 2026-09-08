/* DisplayModeManagerContainer306 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer306
/**
 * RENAMED from `Class73` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ implements Interface7 {
    static float[] aFloatArray4772;
    static int anInt4773;
    static int anInt4774;
    static int anInt4775;
    /** Number of {@link MenuEntry} rows currently in {@link DefinitionSub4#menuEntries}. */
    static int menuEntryCount;
    static int anInt4777;
    private final String aString4778;
    static Component183 aClass114_4779;
    static int[] anIntArray4780;
    static int anInt4781;
    static Component386 aClass219_4782;
    static long aLong4783 = 20000000L;
    static int anInt4784;
    private final CacheStore aClass45_4785;
    static int anInt4786;

    public static void method741(byte i) {
        aFloatArray4772 = null;
        anIntArray4780 = null;
        if (i != -128) method743(113, -98);
        aClass114_4779 = null;
        aClass219_4782 = null;
    }

    static final Component291 method742(int i, int i_0_) {
        anInt4777++;
        Component291 class189 = (Component291) Component46.aClass60_2844.get(i_0_, -104);
        if (class189 != null) return class189;
        byte[] is = Component76.aClass45_8601.getFile(-1860, 0, i_0_);
        if (i != 104) method741((byte) 98);
        class189 = new Component291();
        if (is != null) class189.method1419(i_0_, new Buffer(is), (byte) 64);
        Component46.aClass60_2844.putOne(class189, i_0_, (byte) -114);
        return class189;
    }

    public final int method31(int i) {
        int i_1_ = -62 / ((i - -43) / 62);
        anInt4774++;
        if (aClass45_4785.contains((byte) -74, aString4778)) return 100;
        return 0;
    }

    static final void method743(int i, int i_2_) {
        anInt4775++;
        RSARequest class348_sub42_sub15 = FriendLoginMessage.method2516(i_2_, (byte) 105, i);//9
        class348_sub42_sub15.method3251(i ^ ~0x3eb0);
    }

    public final Component325 method32(int i) {
        anInt4781++;
        if (i != -15004) aFloatArray4772 = null;
        return Component325.aClass69_1197;
    }

    DisplayModeManagerContainer306(CacheStore class45, String string) {
        try {
            aClass45_4785 = class45;
            aString4778 = string;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("kk.<init>(" + (class45 != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ')'));
        }
    }

    static {
        menuEntryCount = 0;
        aFloatArray4772 = new float[16];
        anIntArray4780 = new int[]{104, 120, 136, 168};
        aClass114_4779 = new Component183(76, 6);
    }
}
