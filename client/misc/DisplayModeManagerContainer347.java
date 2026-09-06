/* DisplayModeManagerContainer347 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer347
/**
 * RENAMED from `Class278` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    CacheStore aClass45_3576;
    private NodeCache aClass60_3577 = new NodeCache(64);
    GameType aClass230_3578;
    static int anInt3579;
    static int anInt3580;
    static int anInt3581;
    static int anInt3582;
    boolean aBoolean3583;
    static int anInt3584;
    private final CacheStore aClass45_3585;
    static int anInt3586;
    static int anInt3587;
    static int anInt3588;
    static int anInt3589;
    NodeCache aClass60_3590 = new NodeCache(50);
    static int anInt3591;
    NodeCache aClass60_3592 = new NodeCache(5);
    int anInt3593;

    final void method2072(byte i, boolean bool) {
        if (i >= 22) {
            anInt3580++;
            if (this.aBoolean3583 != bool) {
                this.aBoolean3583 = bool;
                method2078(-6080);
            }
        }
    }

    final void method2073(int i, int i_0_) {
        this.anInt3593 = i_0_;
        anInt3591++;
        synchronized (this.aClass60_3590) {
            this.aClass60_3590.clear(0);
        }
        synchronized (this.aClass60_3592) {
            this.aClass60_3592.clear(0);
        }
        if (i != -25032) method2079(-66, 101);
    }

    final void method2074(int i) {
        synchronized (this.aClass60_3590) {
            this.aClass60_3590.clear(0);
        }
        if (i < -94) {
            anInt3582++;
            synchronized (this.aClass60_3592) {
                this.aClass60_3592.clear(0);
            }
        }
    }

    static final boolean method2075(int i, int i_1_, int i_2_) {
        anInt3584++;
        if (i_1_ > -125) anInt3581 = -110;
        return (i & 0x100100) != 0;
    }

    final void method2076(int i, boolean bool) {
        anInt3589++;
        synchronized (aClass60_3577) {
            aClass60_3577.processSoftEntries(2, i);
        }
        synchronized (this.aClass60_3590) {
            this.aClass60_3590.processSoftEntries(2, i);
        }
        if (bool != true) method2072((byte) 120, true);
        synchronized (this.aClass60_3592) {
            this.aClass60_3592.processSoftEntries(2, i);
        }
    }

    static final boolean method2077(int i, int i_3_, int i_4_) {
        int i_5_ = -75 % ((-43 - i) / 40);
        anInt3588++;
        return (i_4_ & 0x8000) != 0;
    }

    final void method2078(int i) {
        anInt3579++;
        synchronized (aClass60_3577) {
            if (i != -6080) this.aClass60_3590 = null;
            aClass60_3577.clear(i + 6080);
        }
        synchronized (this.aClass60_3590) {
            this.aClass60_3590.clear(i + 6080);
        }
        synchronized (this.aClass60_3592) {
            this.aClass60_3592.clear(0);
        }
    }

    final NpcComposition method2079(int i, int i_6_) {
        anInt3586++;
        NpcComposition class79;
        synchronized (aClass60_3577) {
            class79 = (NpcComposition) aClass60_3577.get(i, -104);
        }
        if (class79 != null) return class79;
        byte[] is;
        synchronized (aClass45_3585) {
            is = aClass45_3585.getFile(i_6_ + -1859, Component95.method1060(i, (byte) 69), Component193.method1920(127, i));
        }
        class79 = new NpcComposition();
        class79.id = i;
        class79.aClass278_1348 = this;
        if (is != null) class79.method798(111, new Buffer(is));
        class79.method799(-117);
        synchronized (aClass60_3577) {
            aClass60_3577.putOne(class79, i, (byte) -102);
            if (i_6_ != -1) aClass60_3577 = null;
        }
        return class79;
    }

    /** Number of NPC archive groups available to editor catalogs. */
    final int definitionGroupCount() {
        return aClass45_3585 == null ? 0 : aClass45_3585.getGroupCapacity(-1);
    }

    /** Number of NPC definitions in one archive group. */
    final int definitionFileCount(int group) {
        return aClass45_3585 == null ? 0 : aClass45_3585.getFileCount(0, group);
    }

    final void method2080(int i) {
        anInt3587++;
        synchronized (aClass60_3577) {
            aClass60_3577.method587(-118);
        }
        synchronized (this.aClass60_3590) {
            this.aClass60_3590.method587(-100);
        }
        synchronized (this.aClass60_3592) {
            this.aClass60_3592.method587(-107);
        }
        if (i <= 122) method2075(-125, -46, 9);
    }

    DisplayModeManagerContainer347(GameType class230, int i, boolean bool, CacheStore class45, CacheStore class45_7_) {
        do {
            try {
                this.aBoolean3583 = bool;
                aClass45_3585 = class45;
                this.aClass45_3576 = class45_7_;
                this.aClass230_3578 = class230;
                if (aClass45_3585 == null) break;
                int i_8_ = aClass45_3585.getGroupCapacity(-1) + -1;
                aClass45_3585.getFileCount(0, i_8_);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("vda.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (class45 != null ? "{...}" : "null") + ',' + (class45_7_ != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }
}
