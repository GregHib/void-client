/* Component62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component62
/**
 * RENAMED from `Class153` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt2079;
    static int anInt2080;
    static int anInt2081;
    static int anInt2082;
    private NodeCache aClass60_2083 = new NodeCache(128);
    private final CacheStore aClass45_2084;
    static int anInt2085;
    static int anInt2086;
    CacheStore aClass45_2087;
    static int anInt2088;
    NodeCache aClass60_2089 = new NodeCache(64);

    final void method1219(int i) {
        anInt2080++;
        synchronized (aClass60_2083) {
            aClass60_2083.clear(0);
        }
        synchronized (this.aClass60_2089) {
            if (i != 7851) {
                /* empty */
            } else this.aClass60_2089.clear(i + -7851);
        }
    }

    final void method1220(byte i, int i_0_, int i_1_) {
        anInt2081++;
        aClass60_2083 = new NodeCache(i_1_);
        this.aClass60_2089 = new NodeCache(i_0_);
        int i_2_ = 11 / ((i - -46) / 43);
    }

    static final boolean method1221(int i, int i_3_, int i_4_) {
        if (i != -3157) return false;
        anInt2088++;
        return Component40.method2259(0, i_4_, i_3_) | (i_3_ & 0x70000) != 0 || Component118.method2187(i_3_, -79, i_4_);
    }

    final void method1222(boolean bool) {
        if (bool != true) method1222(false);
        synchronized (aClass60_2083) {
            aClass60_2083.purgeSoftReferences(-99);
        }
        anInt2082++;
        synchronized (this.aClass60_2089) {
            this.aClass60_2089.purgeSoftReferences(-78);
        }
    }

    static final HashNodeSub19 method1223(int i, int i_5_, int i_6_, Component224 class273) {
        anInt2086++;
        int i_7_ = class273.id | i << 10;
        HashNodeSub19 class348_sub42_sub19 = ((HashNodeSub19) ImageCacheStore.aClass308_4036.method2302((long) i_7_ << 16, (byte) -91));
        if (class348_sub42_sub19 != null) return class348_sub42_sub19;
        byte[] is = (Component22.aClass45_1743.getSingletonFile((byte) 73, Component22.aClass45_1743.getGroupIdByHash(i_7_, (byte) -90)));
        if (is != null) {
            if (is.length <= 1) return null;
            try {
                class348_sub42_sub19 = RenderableSub4.method2502(is, -85);
            } catch (Exception exception) {
                throw new RuntimeException(exception.getMessage() + " S: " + i_7_);
            }
            class348_sub42_sub19.aClass273_9691 = class273;
            ImageCacheStore.aClass308_4036.method2305((long) i_7_ << 16, class348_sub42_sub19, -1);
            return class348_sub42_sub19;
        }
        i_7_ = class273.id | 65536 + i_5_ << 10;
        class348_sub42_sub19 = ((HashNodeSub19) ImageCacheStore.aClass308_4036.method2302((long) i_7_ << 16, (byte) -31));
        if (class348_sub42_sub19 != null) return class348_sub42_sub19;
        is = (Component22.aClass45_1743.getSingletonFile((byte) 73, Component22.aClass45_1743.getGroupIdByHash(i_7_, (byte) -107)));
        if (is != null) {
            if (is.length <= 1) return null;
            try {
                class348_sub42_sub19 = RenderableSub4.method2502(is, -101);
            } catch (Exception exception) {
                throw new RuntimeException(exception.getMessage() + " S: " + i_7_);
            }
            class348_sub42_sub19.aClass273_9691 = class273;
            ImageCacheStore.aClass308_4036.method2305((long) i_7_ << 16, class348_sub42_sub19, -1);
            return class348_sub42_sub19;
        }
        i_7_ = class273.id | 0x3fffc00;
        class348_sub42_sub19 = ((HashNodeSub19) ImageCacheStore.aClass308_4036.method2302((long) i_7_ << 16, (byte) -107));
        if (class348_sub42_sub19 != null) return class348_sub42_sub19;
        is = (Component22.aClass45_1743.getSingletonFile((byte) 73, Component22.aClass45_1743.getGroupIdByHash(i_7_, (byte) 104)));
        if (is != null) {
            if (is.length <= 1) return null;
            try {
                class348_sub42_sub19 = RenderableSub4.method2502(is, -110);
            } catch (Exception exception) {
                throw new RuntimeException(exception.getMessage() + " S: " + i_7_);
            }
            class348_sub42_sub19.aClass273_9691 = class273;
            ImageCacheStore.aClass308_4036.method2305((long) i_7_ << 16, class348_sub42_sub19, -1);
            return class348_sub42_sub19;
        }
        if (i_6_ != 96837648) return null;
        return null;
    }

    final void method1224(int i, byte i_8_) {
        synchronized (aClass60_2083) {
            if (i_8_ > -95) method1225(-75, (byte) -61);
            aClass60_2083.processSoftEntries(2, i);
        }
        anInt2079++;
        synchronized (this.aClass60_2089) {
            this.aClass60_2089.processSoftEntries(2, i);
        }
    }

    final Component274 method1225(int i, byte i_9_) {
        anInt2085++;
        Component274 class42;
        synchronized (aClass60_2083) {
            class42 = (Component274) aClass60_2083.get(i, 91);
        }
        if (class42 != null) return class42;
        if (i_9_ < 36) return null;
        byte[] is;
        synchronized (aClass45_2084) {
            is = aClass45_2084.getFile(-1860, 36, i);
        }
        class42 = new Component274();
        class42.aClass153_593 = this;
        class42.anInt581 = i;
        if (is != null) class42.method379(new Buffer(is), 109);
        class42.method372(-25359);
        synchronized (aClass60_2083) {
            aClass60_2083.putOne(class42, i, (byte) -106);
        }
        return class42;
    }

    Component62(GameType class230, int i, CacheStore class45, CacheStore class45_10_) {
        try {
            aClass45_2084 = class45;
            this.aClass45_2087 = class45_10_;
            aClass45_2084.getFileCount(0, 36);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("on.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ',' + (class45_10_ != null ? "{...}" : "null") + ')'));
        }
    }
}
