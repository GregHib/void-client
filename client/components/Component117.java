/* Component117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component117
/**
 * RENAMED from `Class355` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    private final NodeCache aClass60_4362;
    static int anInt4363;
    int anInt4364;
    int anInt4365 = 0;
    static Object anObject4366;
    static long aLong4367 = -1L;
    private CacheStore aClass45_4368;
    private final CacheStore aClass45_4369;
    static int anInt4370;
    static int anInt4371;
    static int anInt4372;
    private Interface15 anInterface15_4373;

    static final void method3470(int i) {
        if (i == 1) {
            anInt4371++;
            if (!Cp1252Decoder.aBoolean5224) {
                Cp1252Decoder.aBoolean5224 = true;
                DummyClass.aBoolean10174 = true;
                NodeSub27.cameraPitchRate += (-12.0F - NodeSub27.cameraPitchRate) / 2.0F;
            }
        }
    }

    final HashNodeSub10 method3471(int i, byte i_0_) {
        anInt4363++;
        HashNodeSub10 class348_sub42_sub10 = (HashNodeSub10) aClass60_4362.get(i, 70);
        if (class348_sub42_sub10 != null) return class348_sub42_sub10;
        byte[] is;
        if (i >= 32768) is = aClass45_4369.getFile(-1860, 1, 0x7fff & i);
        else is = aClass45_4368.getFile(-1860, 1, i);
        class348_sub42_sub10 = new HashNodeSub10();
        class348_sub42_sub10.aClass355_9567 = this;
        if (is != null) class348_sub42_sub10.method3218(new Buffer(is), 0);
        if (i_0_ >= -86) method3473(-12);
        if (i >= 32768) class348_sub42_sub10.method3209(false);
        aClass60_4362.putOne(class348_sub42_sub10, i, (byte) -125);
        return class348_sub42_sub10;
    }

    final String method3472(long l, int[] is, int i, Component161 class138) {
        try {
            if (i != -1) aClass45_4368 = null;
            anInt4370++;
            if (anInterface15_4373 != null) {
                String string = anInterface15_4373.method54(1, l, class138, is);
                if (string != null) return string;
            }
            return Long.toString(l);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("aha.D(" + l + ',' + (is != null ? "{...}" : "null") + ',' + i + ',' + (class138 != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method3473(int i) {
        if (i != 12949) anInt4372 = -30;
        anObject4366 = null;
    }

    Component117(int i, CacheStore class45, CacheStore class45_1_, Interface15 interface15) {
        this.anInt4364 = 0;
        aClass60_4362 = new NodeCache(64);
        anInterface15_4373 = null;
        do {
            try {
                anInterface15_4373 = interface15;
                aClass45_4368 = class45;
                aClass45_4369 = class45_1_;
                if (aClass45_4368 != null) this.anInt4365 = aClass45_4368.getFileCount(0, 1);
                if (aClass45_4369 == null) break;
                this.anInt4364 = aClass45_4369.getFileCount(0, 1);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("aha.<init>(" + i + ',' + (class45 != null ? "{...}" : "null") + ',' + (class45_1_ != null ? "{...}" : "null") + ',' + (interface15 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }
}
