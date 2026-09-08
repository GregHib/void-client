/* Component127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component127
/**
 * RENAMED from `Class226` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static LruCache aClass356_2959 = new LruCache(512);
    private final NodeCache aClass60_2960 = new NodeCache(64);
    private final CacheStore aClass45_2961;
    static int anInt2962;
    static int anInt2963;
    static int anInt2964 = 64;
    private CacheStore aClass45_2965;

    public static void method1624(int i) {
        aClass356_2959 = null;
        if (i != 28962) aClass356_2959 = null;
    }

    final StringDefinition method1625(int i, int i_0_) {
        anInt2963++;
        StringDefinition class348_sub42_sub11 = (StringDefinition) aClass60_2960.get(i_0_, -51);
        if (class348_sub42_sub11 != null) return class348_sub42_sub11;
        byte[] is;
        if (i_0_ < 32768) is = aClass45_2961.getFile(-1860, 0, i_0_);
        else is = aClass45_2965.getFile(-1860, 0, 0x7fff & i_0_);
        class348_sub42_sub11 = new StringDefinition();
        if (is != null) class348_sub42_sub11.method3221(117, new Buffer(is));
        if (i_0_ >= 32768) class348_sub42_sub11.method3224((byte) 104);
        if (i != 0) aClass45_2965 = null;
        aClass60_2960.putOne(class348_sub42_sub11, i_0_, (byte) -123);
        return class348_sub42_sub11;
    }

    static final void method1626(int i, boolean bool) {
        anInt2962++;
        int i_1_ = Component372.anInt6043;
        int i_2_ = ObjectDeserializer.anInt6964;
        if (i == 1) {
            if (bool && DisplayModeManagerContainer50.aBoolean3870) {
                i_1_ <<= 1;
                i_2_ = -i_1_;
            }
            NodeSub8.toolkit.f(i_2_, i_1_);
        }
    }

    Component127(int i, CacheStore class45, CacheStore class45_3_) {
        do {
            try {
                aClass45_2961 = class45;
                aClass45_2965 = class45_3_;
                if (aClass45_2961 != null) aClass45_2961.getFileCount(0, 0);
                if (aClass45_2965 == null) break;
                aClass45_2965.getFileCount(0, 0);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("sga.<init>(" + i + ',' + (class45 != null ? "{...}" : "null") + ',' + (class45_3_ != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }
}
