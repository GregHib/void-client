/* Component191 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component191
/**
 * RENAMED from `Class183` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt2457;
    private final NodeCache aClass60_2458 = new NodeCache(128);
    static int anInt2459;
    static int anInt2460;
    private final CacheStore aClass45_2461;
    static AudioMixer aClass250_2462;
    static int anInt2463;
    static int anInt2464;
    static int anInt2465;
    static int[] anIntArray2466 = new int[14];
    static int anInt2467;

    static final void method1376(RenderableObject class318_sub1) {
        if (class318_sub1 != null) {
            for (int i = 0; i < 2; i++) {
                RenderableObject class318_sub1_0_ = null;
                for (RenderableObject class318_sub1_1_ = Node.aClass318_Sub1Array4293[i]; class318_sub1_1_ != null; class318_sub1_1_ = (class318_sub1_1_.aClass318_Sub1_6379)) {
                    if (class318_sub1_1_ == class318_sub1) {
                        if (class318_sub1_0_ != null) class318_sub1_0_.aClass318_Sub1_6379 = (class318_sub1_1_.aClass318_Sub1_6379);
                        else Node.aClass318_Sub1Array4293[i] = (class318_sub1_1_.aClass318_Sub1_6379);
                        NodeSub16Sub2.aBoolean8870 = true;
                        return;
                    }
                    class318_sub1_0_ = class318_sub1_1_;
                }
                class318_sub1_0_ = null;
                for (RenderableObject class318_sub1_2_ = AudioMixer.aClass318_Sub1Array3226[i]; class318_sub1_2_ != null; class318_sub1_2_ = (class318_sub1_2_.aClass318_Sub1_6379)) {
                    if (class318_sub1_2_ == class318_sub1) {
                        if (class318_sub1_0_ != null) class318_sub1_0_.aClass318_Sub1_6379 = (class318_sub1_2_.aClass318_Sub1_6379);
                        else AudioMixer.aClass318_Sub1Array3226[i] = (class318_sub1_2_.aClass318_Sub1_6379);
                        NodeSub16Sub2.aBoolean8870 = true;
                        return;
                    }
                    class318_sub1_0_ = class318_sub1_2_;
                }
                class318_sub1_0_ = null;
                for (RenderableObject class318_sub1_3_ = Component95.aClass318_Sub1Array1754[i]; class318_sub1_3_ != null; class318_sub1_3_ = (class318_sub1_3_.aClass318_Sub1_6379)) {
                    if (class318_sub1_3_ == class318_sub1) {
                        if (class318_sub1_0_ != null) class318_sub1_0_.aClass318_Sub1_6379 = (class318_sub1_3_.aClass318_Sub1_6379);
                        else Component95.aClass318_Sub1Array1754[i] = (class318_sub1_3_.aClass318_Sub1_6379);
                        NodeSub16Sub2.aBoolean8870 = true;
                        return;
                    }
                    class318_sub1_0_ = class318_sub1_3_;
                }
            }
        }
    }

    final void method1377(int i) {
        anInt2457++;
        if (i != 2) method1376(null);
        synchronized (aClass60_2458) {
            aClass60_2458.purgeSoftReferences(-125);
        }
    }

    public static void method1378(int i) {
        aClass250_2462 = null;
        anIntArray2466 = null;
        if (i != 14) method1382(99, -102);
    }

    static final boolean method1379(int i, int i_4_, int i_5_) {
        anInt2459++;
        if (i != 4) return true;
        return (CacheNode.method3194(i_5_, i_4_, (byte) 126) & RadixText.method1837(i_4_, 46, i_5_));
    }

    final Component231 method1380(boolean bool, int i) {
        anInt2460++;
        if (bool != true) return null;
        Component231 class22;
        synchronized (aClass60_2458) {
            class22 = (Component231) aClass60_2458.get(i, 77);
        }
        if (class22 != null) return class22;
        byte[] is;
        synchronized (aClass45_2461) {
            is = aClass45_2461.getFile(-1860, 1, i);
        }
        class22 = new Component231();
        if (is != null) class22.method290(new Buffer(is), -1);
        synchronized (aClass60_2458) {
            aClass60_2458.putOne(class22, i, (byte) -124);
        }
        return class22;
    }

    final void method1381(boolean bool) {
        synchronized (aClass60_2458) {
            if (bool != true) method1382(-96, 76);
            aClass60_2458.clear(0);
        }
        anInt2465++;
    }

    static final int method1382(int i, int i_6_) {
        anInt2463++;
        if (i != 6406) {
            if (i != 6409) {
                if (i == 32841) return 1;
                if (i != 6410) {
                    if (i == 6407) return 3;
                    if (i == 6408) return 4;
                } else return 2;
            } else return 1;
        } else return 1;
        if (i_6_ != -6409) anIntArray2466 = null;
        throw new IllegalArgumentException("");
    }

    final void method1383(int i, int i_7_) {
        anInt2467++;
        synchronized (aClass60_2458) {
            aClass60_2458.processSoftEntries(2, i_7_);
        }
        if (i != 32841) anInt2464 = 86;
    }

    Component191(GameType class230, int i, CacheStore class45) {
        try {
            aClass45_2461 = class45;
            aClass45_2461.getFileCount(0, 1);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("qe.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ')'));
        }
    }
}
