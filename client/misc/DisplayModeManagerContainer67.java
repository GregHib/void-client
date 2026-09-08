/* DisplayModeManagerContainer67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from {@code Class112} (JODE-obfuscated).
 * Background JS5 disk worker ({@link Runnable}): queue of {@link HashNodeSub16Sub2}
 * jobs. Type 2 = write entry, type 3 = async read, type 1 = sync read result.
 * {@link #pendingCount} is checked by archive stores before enqueueing more work
 * (hard cap ~512).
 */
final class DisplayModeManagerContainer67 implements Runnable {
    static int anInt1726;
    static Component170 aClass207_1727;
    static int anInt1728;
    static int anInt1729;
    /** Pending disk jobs waiting for {@link #run}. */
    private final HashTable queue = new HashTable();
    static int anInt1731;
    static int anInt1732;
    private Thread workerThread;
    /** Number of jobs currently in {@link #queue}. */
    int pendingCount;
    static int anInt1735;
    static int anInt1736;
    static int anInt1737;
    /** Set by {@link #shutdown} to stop the worker loop. */
    private boolean stopRequested = false;

    /**
     * Enqueue a write of {@code is} into {@code class137} at group {@code i_0_}
     * (job type 2).
     */
    final HashNodeSub16Sub2 enqueueWrite(byte[] is, CacheIndexReader class137, byte i, int i_0_) {
        try {
            if (i != 10) stopRequested = false;
            anInt1732++;
            HashNodeSub16Sub2 class348_sub42_sub16_sub2 = new HashNodeSub16Sub2();
            class348_sub42_sub16_sub2.data = is;
            class348_sub42_sub16_sub2.priority = false;
            class348_sub42_sub16_sub2.indexReader = class137;
            class348_sub42_sub16_sub2.accessAge = i_0_;
            class348_sub42_sub16_sub2.type = 2;
            enqueue(class348_sub42_sub16_sub2, i + -123);
            return class348_sub42_sub16_sub2;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("aca.G(" + (is != null ? "{...}" : "null") + ',' + (class137 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
        }
    }

    /** Push {@code class348_sub42_sub16_sub2} onto the worker queue and wake the thread. */
    private final void enqueue(HashNodeSub16Sub2 class348_sub42_sub16_sub2, int i) {
        anInt1735++;
        synchronized (queue) {
            queue.add(true, class348_sub42_sub16_sub2);
            this.pendingCount++;
            if (i > -100) aClass207_1727 = null;
            queue.notifyAll();
        }
    }

    /** Request worker stop and join the thread. */
    final void shutdown(boolean bool) {
        stopRequested = bool;
        anInt1731++;
        synchronized (queue) {
            queue.notifyAll();
        }
        try {
            workerThread.join();
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
        workerThread = null;
    }

    public static void clearStatics(byte i) {
        aClass207_1727 = null;
        int i_1_ = 107 % ((i - -20) / 50);
    }

    /**
     * Returns the tip / hovered menu-row cursor sprite id, or -1 if none.
     * (Unrelated to disk IO — parked in this deob class.)
     */
    static final int getTipCursorId(int i) {
        anInt1728++;
        if (i != 3112) clearStatics((byte) 121);
        if (Component156.aClass46_3701 == null) {
            if (!Component364.aBoolean8335 && Component192.menuTip != null) return (Component192.menuTip.cursorId);
            int i_2_ = AbstractGlTextureSub4.mouseHandler.getCursorX(true);
            int i_3_ = AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 81);
            if (PauseHandler.aBoolean9535) {
                if (i_2_ > DisplayModeManagerContainer136.anInt4717 && i_2_ < Component227.anInt1117 + DisplayModeManagerContainer136.anInt4717) {
                    int i_9_ = -1;
                    for (int i_10_ = 0; DisplayModeManagerContainer345.anInt166 > i_10_; i_10_++) {
                        if (DisplayModeManagerContainer5.aBoolean1211) {
                            int i_11_ = (DefinitionGroup.anInt9532 - -33 - -(i_10_ * 16));
                            if (i_3_ > -13 + i_11_ && i_3_ <= i_11_ + 3) i_9_ = i_10_;
                        } else {
                            int i_12_ = (i_10_ * 16 + 31 + DefinitionGroup.anInt9532);
                            if (i_3_ > -13 + i_12_ && i_3_ <= i_12_ + 3) i_9_ = i_10_;
                        }
                    }
                    if (i_9_ != -1) {
                        int i_13_ = 0;
                        ClientErrorReporter class156 = new ClientErrorReporter(Component237.aClass107_3022);
                        for (HashNodeSub13 class348_sub42_sub13 = ((HashNodeSub13) class156.firstHashNode(110)); class348_sub42_sub13 != null; class348_sub42_sub13 = ((HashNodeSub13) class156.nextHashNode((byte) 77))) {
                            if (i_9_ == i_13_++) return ((MenuEntry) class348_sub42_sub13.aClass107_9621.sentinel.next).cursorId;
                        }
                    }
                } else if (Component359.aClass348_Sub42_Sub13_3152 != null && DisplayModeManagerContainer368.anInt5252 < i_2_ && (NodeSub1Sub1.anInt8806 + DisplayModeManagerContainer368.anInt5252) > i_2_) {
                    int i_4_ = -1;
                    for (int i_5_ = 0; ((Component359.aClass348_Sub42_Sub13_3152.anInt9615) > i_5_); i_5_++) {
                        if (DisplayModeManagerContainer5.aBoolean1211) {
                            int i_7_ = MouseHandler.menuOriginY + (33 + 16 * i_5_);
                            if (-13 + i_7_ < i_3_ && 3 + i_7_ >= i_3_) i_4_ = i_5_;
                        } else {
                            int i_6_ = i_5_ * 16 + 31 + MouseHandler.menuOriginY;
                            if (-13 + i_6_ < i_3_ && i_6_ - -3 >= i_3_) i_4_ = i_5_;
                        }
                    }
                    if (i_4_ != -1) {
                        int i_8_ = 0;
                        ClientErrorReporter class156 = new ClientErrorReporter(Component359.aClass348_Sub42_Sub13_3152.aClass107_9621);
                        for (MenuEntry class348_sub42_sub12 = ((MenuEntry) class156.firstHashNode(9)); class348_sub42_sub12 != null; class348_sub42_sub12 = ((MenuEntry) class156.nextHashNode((byte) 90))) {
                            if (i_8_++ == i_4_) return (class348_sub42_sub12.cursorId);
                        }
                    }
                }
            } else if (i_2_ > DisplayModeManagerContainer136.anInt4717 && (i_2_ < DisplayModeManagerContainer136.anInt4717 - -Component227.anInt1117)) {
                int i_14_ = -1;
                for (int i_15_ = 0; DisplayModeManagerContainer306.menuEntryCount > i_15_; i_15_++) {
                    if (DisplayModeManagerContainer5.aBoolean1211) {
                        int i_17_ = ((-i_15_ + (-1 + DisplayModeManagerContainer306.menuEntryCount)) * 16 + DefinitionGroup.anInt9532 + 33);
                        if (i_3_ > i_17_ - 13 && i_17_ + 3 >= i_3_) i_14_ = i_15_;
                    } else {
                        int i_16_ = 31 + (DefinitionGroup.anInt9532 + (-i_15_ + (DisplayModeManagerContainer306.menuEntryCount - 1)) * 16);
                        if (-13 + i_16_ < i_3_ && i_16_ + 3 >= i_3_) i_14_ = i_15_;
                    }
                }
                if (i_14_ != -1) {
                    int i_18_ = 0;
                    Component37 class312 = new Component37(DefinitionSub4.menuEntries);
                    for (MenuEntry class348_sub42_sub12 = ((MenuEntry) class312.method2327((byte) -53)); class348_sub42_sub12 != null; class348_sub42_sub12 = ((MenuEntry) class312.method2329(i + -3102))) {
                        if (i_14_ == i_18_++) return (class348_sub42_sub12.cursorId);
                    }
                }
            }
        }
        return -1;
    }

    /** Enqueue an async disk read of group {@code i} (job type 3). */
    final HashNodeSub16Sub2 enqueueRead(CacheIndexReader class137, int i, byte i_19_) {
        anInt1729++;
        HashNodeSub16Sub2 class348_sub42_sub16_sub2 = new HashNodeSub16Sub2();
        if (i_19_ != -112) return null;
        class348_sub42_sub16_sub2.priority = false;
        class348_sub42_sub16_sub2.type = 3;
        class348_sub42_sub16_sub2.accessAge = i;
        class348_sub42_sub16_sub2.indexReader = class137;
        enqueue(class348_sub42_sub16_sub2, -101);
        return class348_sub42_sub16_sub2;
    }

    public final void run() {
        while (!stopRequested) {
            HashNodeSub16Sub2 class348_sub42_sub16_sub2;
            synchronized (queue) {
                class348_sub42_sub16_sub2 = ((HashNodeSub16Sub2) queue.removeHead(20));
                if (class348_sub42_sub16_sub2 == null) {
                    try {
                        queue.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                    continue;
                } else this.pendingCount--;
            }
            try {
                if ((class348_sub42_sub16_sub2.type) != 2) {
                    if (class348_sub42_sub16_sub2.type == 3) class348_sub42_sub16_sub2.data = (class348_sub42_sub16_sub2.indexReader.readEntry((byte) -4, (int) class348_sub42_sub16_sub2.accessAge));
                } else class348_sub42_sub16_sub2.indexReader.writeEntry(class348_sub42_sub16_sub2.data.length, (int) (class348_sub42_sub16_sub2.accessAge), class348_sub42_sub16_sub2.data, -7305);
            } catch (Exception exception) {
                ClientErrorReporter.reportError(null, exception, 15004);
            }
            class348_sub42_sub16_sub2.incomplete = false;
        }
        anInt1736++;
    }

    /**
     * Synchronous read of group {@code i}, or reuse an in-flight write's buffer.
     * Returns immediately with {@link HashNodeSub16#incomplete} false.
     */
    final HashNodeSub16Sub2 readImmediate(CacheIndexReader class137, int i, byte i_20_) {
        if (i_20_ >= -98) clearStatics((byte) 110);
        anInt1737++;
        HashNodeSub16Sub2 class348_sub42_sub16_sub2 = new HashNodeSub16Sub2();
        class348_sub42_sub16_sub2.type = 1;
        synchronized (queue) {
            for (HashNodeSub16Sub2 class348_sub42_sub16_sub2_21_ = ((HashNodeSub16Sub2) queue.first(-95)); class348_sub42_sub16_sub2_21_ != null; class348_sub42_sub16_sub2_21_ = ((HashNodeSub16Sub2) queue.next((byte) 73))) {
                if ((class348_sub42_sub16_sub2_21_.accessAge == (long) i) && (class348_sub42_sub16_sub2_21_.indexReader == class137) && class348_sub42_sub16_sub2_21_.type == 2) {
                    class348_sub42_sub16_sub2.data = class348_sub42_sub16_sub2_21_.data;
                    class348_sub42_sub16_sub2.incomplete = false;
                    return class348_sub42_sub16_sub2;
                }
            }
        }
        class348_sub42_sub16_sub2.data = class137.readEntry((byte) -4, i);
        class348_sub42_sub16_sub2.priority = true;
        class348_sub42_sub16_sub2.incomplete = false;
        return class348_sub42_sub16_sub2;
    }

    DisplayModeManagerContainer67(ReflectionInvoker class297) {
        this.pendingCount = 0;
        Task class144 = class297.startThread(this, -10240, 5);
        while (class144.status == 0) SpriteAtlasShader.sleep((byte) 43, 10L);
        if (class144.status == 2) throw new RuntimeException();
        workerThread = (Thread) class144.result;
    }
}
