/* Component219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component219
/**
 * RENAMED from {@code Class314_Sub1} (JODE-obfuscated).
 * Per-index JS5 archive store: loads {@link ReferenceTable}, fetches groups via
 * {@link Component253} and/or local {@link CacheIndexReader}, verifies CRC/Whirlpool,
 * and tracks per-group load status for prefetch/verify passes.
 */ extends Component112 {
    static Component183 aClass114_6340 = new Component183(74, 28);
    static int anInt6341;
    /** Parsed index reference table once ready. */
    private ReferenceTable referenceTable;
    static int anInt6343;
    /** Expected CRC of the reference table (from master index). */
    private final int expectedCrc;
    static int anInt6345;
    /** Expected 64-byte Whirlpool of the reference table. */
    private final byte[] expectedWhirlpool;
    /** JS5 TCP client for network fetches. */
    private final Component253 js5Client;
    static int anInt6348;
    static int anInt6349;
    /** JS5 index id (0..254). */
    private final int indexId;
    /**
     * Per-group status: {@code 0} unset, {@code 1} verified/loaded,
     * {@code -1} failed disk verify (force network).
     */
    private byte[] groupLoadStatus;
    private int expectedRevision;
    static int anInt6353;
    /** Local disk cache helper ({@link DisplayModeManagerContainer67}). */
    private final DisplayModeManagerContainer67 diskCache;
    /** In-flight reference-table request (index 255 child = this index). */
    private HashNodeSub16 referenceTableRequest;
    static int anInt6356;
    static int anInt6357;
    static int anInt6358;
    static int anInt6359;
    /** Active group download nodes keyed by group id. */
    private final LruCache activeRequests;
    /** Count of groups with status 1. */
    private int loadedGroupCount = 0;
    static int anInt6362;
    static int anInt6363;
    /** Disk index for the reference table itself. */
    private final CacheIndexReader metaIndex;
    /** Disk index for group payloads. */
    private final CacheIndexReader dataIndex;
    static int anInt6366;
    static int anInt6367;
    /** True while bulk-prefetching missing groups from disk. */
    private boolean prefetching;
    /** Groups explicitly requested via {@link #requestGroup}. */
    private final NodeList requestedGroups;
    static int anInt6370;
    /** True while bulk-verifying groups over the network. */
    private boolean verifying;
    /** Work list for prefetch/verify sweeps. */
    private NodeList workQueue;
    /** Cursor into {@link ReferenceTable#fileIdCounts} during sweeps. */
    private int workCursor;
    /** Next wall-clock ms to discard stale non-priority requests. */
    private long nextDiscardMillis;
    /** When true, completed non-priority requests are discarded after ~1s. */
    private boolean discardStaleRequests;

    /** Prefetch progress: named group count, or current work-queue head while prefetching. */
    final int getPrefetchProgress(int i) {
        anInt6370++;
        if (referenceTable == null) return 0;
        if (!prefetching) return referenceTable.namedGroupCount;
        if (i != 24940) getGroupCount(-32);
        Node class348 = workQueue.first(i ^ 0x6168);
        if (class348 == null) return 0;
        return (int) class348.key;
    }

    /** Service explicitly requested groups (disk load / network fallback). */
    final void processRequestedGroups(int i) {
        anInt6349++;
        if (i != 0) discardStaleRequests = false;
        if (workQueue != null && getReferenceTable((byte) 56) != null) {
            for (Node class348 = requestedGroups.first(4); class348 != null; class348 = requestedGroups.next((byte) 112)) {
                int i_0_ = (int) class348.key;
                if (i_0_ < 0 || (referenceTable.groupCapacity <= i_0_) || referenceTable.fileIdCounts[i_0_] == 0) class348.unlink((byte) 37);
                else {
                    if (groupLoadStatus[i_0_] == 0) fetchGroup(i_0_, (byte) 65, 1);
                    if (groupLoadStatus[i_0_] == -1) fetchGroup(i_0_, (byte) 65, 2);
                    if (groupLoadStatus[i_0_] == 1) class348.unlink((byte) 29);
                }
            }
        }
    }

    /** Pulse prefetch/verify sweeps and optional stale-request discard. */
    final void pulse(int i) {
        anInt6356++;
        if (workQueue != null) {
            if (getReferenceTable((byte) 56) == null) return;
            if (prefetching) {
                boolean bool = true;
                for (Node class348 = workQueue.first(4); class348 != null; class348 = workQueue.next((byte) 106)) {
                    int i_1_ = (int) class348.key;
                    if (groupLoadStatus[i_1_] == 0) fetchGroup(i_1_, (byte) 65, 1);
                    if (groupLoadStatus[i_1_] != 0) class348.unlink((byte) 22);
                    else bool = false;
                }
                while (referenceTable.fileIdCounts.length > workCursor) {
                    if (referenceTable.fileIdCounts[workCursor] == 0) workCursor++;
                    else {
                        if (diskCache.pendingCount >= 512) {
                            bool = false;
                            break;
                        }
                        if (groupLoadStatus[workCursor] == 0) fetchGroup(workCursor, (byte) 65, 1);
                        if (groupLoadStatus[workCursor] == 0) {
                            Node class348 = new Node();
                            class348.key = workCursor;
                            workQueue.addTail(class348, -20180);
                            bool = false;
                        }
                        workCursor++;
                    }
                }
                if (bool) {
                    workCursor = 0;
                    prefetching = false;
                }
            } else if (verifying) {
                boolean bool = true;
                for (Node class348 = workQueue.first(4); class348 != null; class348 = workQueue.next((byte) 43)) {
                    int i_2_ = (int) class348.key;
                    if (groupLoadStatus[i_2_] != 1) fetchGroup(i_2_, (byte) 65, 2);
                    if (groupLoadStatus[i_2_] != 1) bool = false;
                    else class348.unlink((byte) 60);
                }
                while (referenceTable.fileIdCounts.length > workCursor) {
                    if (referenceTable.fileIdCounts[workCursor] == 0) workCursor++;
                    else {
                        if (js5Client.isNormalQueueFull(-124)) {
                            bool = false;
                            break;
                        }
                        if (groupLoadStatus[workCursor] != 1) fetchGroup(workCursor, (byte) 65, 2);
                        if (groupLoadStatus[workCursor] != 1) {
                            Node class348 = new Node();
                            class348.key = workCursor;
                            bool = false;
                            workQueue.addTail(class348, i + -20179);
                        }
                        workCursor++;
                    }
                }
                if (bool) {
                    workCursor = 0;
                    verifying = false;
                }
            } else workQueue = null;
        }
        if (i == -1) {
            if (discardStaleRequests && Component240.currentTimeMillis(-94) >= nextDiscardMillis) {
                for (HashNodeSub16 class348_sub42_sub16 = (HashNodeSub16) activeRequests.first(0); class348_sub42_sub16 != null; class348_sub42_sub16 = ((HashNodeSub16) activeRequests.next(0))) {
                    if (!class348_sub42_sub16.incomplete) {
                        if (class348_sub42_sub16.markedForDiscard) {
                            if (!class348_sub42_sub16.priority) throw new RuntimeException();
                            class348_sub42_sub16.unlink((byte) 116);
                        } else class348_sub42_sub16.markedForDiscard = true;
                    }
                }
                nextDiscardMillis = Component240.currentTimeMillis(-82) - -1000L;
            }
        }
    }

    public static void clearStatics(int i) {
        if (i == 0) aClass114_6340 = null;
    }

    final int getGroupCount(int i) {
        anInt6357++;
        if (referenceTable == null) return 0;
        if (i != 0) requestGroup((byte) -34, 120);
        return referenceTable.namedGroupCount;
    }

        /** Raw packed bytes for group {@code i}. */
    final byte[] getGroupData(int i, byte i_3_) {
        int i_4_ = -16 / ((i_3_ - -44) / 37);
        anInt6363++;
        HashNodeSub16 class348_sub42_sub16 = fetchGroup(i, (byte) 65, 0);
        if (class348_sub42_sub16 == null) return null;
        byte[] is = class348_sub42_sub16.getData(16);
        class348_sub42_sub16.unlink((byte) 33);
        return is;
    }

    final void startVerifyPass(int i) {
        if (i == 27872) {
            anInt6366++;
            if (dataIndex != null) {
                verifying = true;
                if (workQueue == null) workQueue = new NodeList();
            }
        }
    }

        /** Prefetch packed group {@code i_5_}. */
    final void requestGroup(byte i, int i_5_) {
        anInt6345++;
        if (i != -52) referenceTable = null;
        if (dataIndex != null) {
            for (Node class348 = requestedGroups.first(i ^ ~0x37); class348 != null; class348 = requestedGroups.next((byte) 124)) {
                if ((long) i_5_ == class348.key) return;
            }
            Node class348 = new Node();
            class348.key = i_5_;
            requestedGroups.addTail(class348, -20180);
        }
    }

    static final String getMenuTarget(byte i) {
        if (i != -119) return null;
        anInt6343++;
        if (Component364.aBoolean8335 || Component192.menuTip == null) return "";
        if (((Component192.menuTip.target) == null || Component192.menuTip.target.length() == 0) && (Component192.menuTip.extraTarget) != null && Component192.menuTip.extraTarget.length() > 0)
            return (Component192.menuTip.extraTarget);
        return (Component192.menuTip.target);
    }

    static final int method2348(int i) {
        anInt6353++;
        if (i != -8454) method2352(44, -11, 126);
        int i_6_;
        if (Component127.anInt2964 < 96) {
            GradientPreset.method3076(0, true);
            i_6_ = 1;
        } else {
            int i_7_ = Component94.benchmarkToolkitMs(-26584);
            if (i_7_ > 100) {
                if (i_7_ <= 500) {
                    i_6_ = 3;
                    DisplayModeManagerContainer32.method447((byte) -59);
                } else if (i_7_ <= 1000) {
                    i_6_ = 2;
                    DisplayModeManagerContainer254.method1263(true);
                } else {
                    GradientPreset.method3076(0, true);
                    i_6_ = 1;
                }
            } else {
                i_6_ = 4;
                HeapDumper.resetGraphicsPreferences(58);
            }
        }
        if (Component192.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350) != 0) {
            Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub25_7251), 0);
            SoftwareFallbackShader.method3553(false, (byte) 120, 0);
        }
        DisplayModeManagerContainer389.savePreferences(37);
        return i_6_;
    }

    final int getReferenceTableProgress(int i) {
        if (i != 1) getGroupLoadPercent(11, -116);
        anInt6367++;
        if (getReferenceTable((byte) 56) == null) {
            if (referenceTableRequest == null) return 0;
            return referenceTableRequest.getProgressPercent(16);
        }
        return 100;
    }

    final int getGroupLoadPercent(int i, int i_8_) {
        anInt6341++;
        HashNodeSub16 class348_sub42_sub16 = ((HashNodeSub16) activeRequests.get(i, -6008));
        if (i_8_ != -22197) expectedRevision = 21;
        if (class348_sub42_sub16 != null) return class348_sub42_sub16.getProgressPercent(16);
        return 0;
    }

    /**
     * Fetch group {@code i}: mode 0 = priority load, 1 = disk prefetch, 2 = network verify.
     * Verifies CRC/Whirlpool and updates {@link #groupLoadStatus}.
     */
    private final HashNodeSub16 fetchGroup(int i, byte i_9_, int i_10_) {
        if (i_9_ != 65) groupLoadStatus = null;
        anInt6362++;
        HashNodeSub16 class348_sub42_sub16 = ((HashNodeSub16) activeRequests.get(i, -6008));
        if (class348_sub42_sub16 != null && i_10_ == 0 && !class348_sub42_sub16.priority && class348_sub42_sub16.incomplete) {
            class348_sub42_sub16.unlink((byte) 66);
            class348_sub42_sub16 = null;
        }
        if (class348_sub42_sub16 == null) {
            if (i_10_ == 0) {
                if (dataIndex == null || groupLoadStatus[i] == -1) {
                    if (js5Client.isPriorityQueueFull(-9)) return null;
                    class348_sub42_sub16 = js5Client.queueRequest((byte) -125, (byte) 2, true, i, indexId);
                } else class348_sub42_sub16 = diskCache.readImmediate(dataIndex, i, (byte) -110);
            } else if (i_10_ == 1) {
                if (dataIndex == null) throw new RuntimeException();
                class348_sub42_sub16 = diskCache.enqueueRead(dataIndex, i, (byte) -112);
            } else {
                if (i_10_ != 2) throw new RuntimeException();
                if (dataIndex == null) throw new RuntimeException();
                if (groupLoadStatus[i] != -1) throw new RuntimeException();
                if (js5Client.isNormalQueueFull(-120)) return null;
                class348_sub42_sub16 = js5Client.queueRequest((byte) 97, (byte) 2, false, i, indexId);
            }
            activeRequests.put((byte) 73, i, class348_sub42_sub16);
        }
        if (class348_sub42_sub16.incomplete) return null;
        byte[] is = class348_sub42_sub16.getData(16);
        if (!(class348_sub42_sub16 instanceof HashNodeSub16Sub2)) {
            try {
                if (is == null || is.length <= 2) throw new RuntimeException();
                DisplayModeManagerContainer260.aCRC32_3691.reset();
                DisplayModeManagerContainer260.aCRC32_3691.update(is, 0, -2 + is.length);
                int i_11_ = (int) DisplayModeManagerContainer260.aCRC32_3691.getValue();
                if (referenceTable.groupCrcs[i] != i_11_) throw new RuntimeException();
                if (referenceTable.whirlpools != null && (referenceTable.whirlpools[i] != null)) {
                    byte[] is_12_ = referenceTable.whirlpools[i];
                    byte[] is_13_ = NodeSub1Sub2.whirlpoolDigest(i_9_ ^ 0x1196, 0, is, is.length + -2);
                    for (int i_14_ = 0; i_14_ < 64; i_14_++) {
                        if (is_12_[i_14_] != is_13_[i_14_]) throw new RuntimeException();
                    }
                }
                js5Client.errorCount = 0;
                js5Client.disconnectCode = 0;
            } catch (RuntimeException runtimeexception) {
                js5Client.forceDisconnect(-1);
                class348_sub42_sub16.unlink((byte) 44);
                if (class348_sub42_sub16.priority && !js5Client.isPriorityQueueFull(i_9_ ^ 0x1f)) {
                    HashNodeSub16Sub1 class348_sub42_sub16_sub1 = js5Client.queueRequest((byte) 111, (byte) 2, true, i, indexId);
                    activeRequests.put((byte) 84, i, class348_sub42_sub16_sub1);
                }
                return null;
            }
            is[is.length - 2] = (byte) (referenceTable.groupVersions[i] >>> 8);
            is[is.length - 1] = (byte) referenceTable.groupVersions[i];
            if (dataIndex != null) {
                diskCache.enqueueWrite(is, dataIndex, (byte) 10, i);
                if (groupLoadStatus[i] != 1) {
                    loadedGroupCount++;
                    groupLoadStatus[i] = (byte) 1;
                }
            }
            if (!class348_sub42_sub16.priority) class348_sub42_sub16.unlink((byte) 110);
            return class348_sub42_sub16;
        }
        try {
            if (is == null || is.length <= 2) throw new RuntimeException();
            DisplayModeManagerContainer260.aCRC32_3691.reset();
            DisplayModeManagerContainer260.aCRC32_3691.update(is, 0, is.length + -2);
            int i_15_ = (int) DisplayModeManagerContainer260.aCRC32_3691.getValue();
            if (i_15_ != referenceTable.groupCrcs[i]) throw new RuntimeException();
            if (referenceTable.whirlpools != null && (referenceTable.whirlpools[i] != null)) {
                byte[] is_16_ = referenceTable.whirlpools[i];
                byte[] is_17_ = NodeSub1Sub2.whirlpoolDigest(i_9_ + 4502, 0, is, is.length - 2);
                for (int i_18_ = 0; i_18_ < 64; i_18_++) {
                    if (is_17_[i_18_] != is_16_[i_18_]) throw new RuntimeException();
                }
            }
            int i_19_ = ((0xff00 & is[-2 + is.length] << 8) + (0xff & is[is.length + -1]));
            if ((referenceTable.groupVersions[i] & 0xffff) != i_19_) throw new RuntimeException();
            if (groupLoadStatus[i] != 1) {
                loadedGroupCount++;
                groupLoadStatus[i] = (byte) 1;
            }
            if (!class348_sub42_sub16.priority) class348_sub42_sub16.unlink((byte) 115);
            return class348_sub42_sub16;
        } catch (Exception exception) {
            groupLoadStatus[i] = (byte) -1;
            class348_sub42_sub16.unlink((byte) 121);
            if (class348_sub42_sub16.priority && !js5Client.isPriorityQueueFull(-30)) {
                HashNodeSub16Sub1 class348_sub42_sub16_sub1 = js5Client.queueRequest((byte) 99, (byte) 2, true, i, indexId);
                activeRequests.put((byte) 66, i, class348_sub42_sub16_sub1);
            }
            return null;
        }
    }

    final int getLoadedGroupCount(int i) {
        if (i != 0) return -19;
        anInt6359++;
        return loadedGroupCount;
    }

        /** Load/parse the archive reference table, or null if not ready. */
    final ReferenceTable getReferenceTable(byte i) {
        anInt6348++;
        if (referenceTable != null) return referenceTable;
        if (i != 56) return null;
        if (referenceTableRequest == null) {
            if (js5Client.isPriorityQueueFull(-14)) return null;
            referenceTableRequest = js5Client.queueRequest((byte) -114, (byte) 0, true, indexId, 255);
        }
        if (referenceTableRequest.incomplete) return null;
        byte[] is = referenceTableRequest.getData(16);
        do {
            if (referenceTableRequest instanceof HashNodeSub16Sub2) {
                try {
                    if (is == null) throw new RuntimeException();
                    referenceTable = new ReferenceTable(is, expectedCrc, expectedWhirlpool);
                    if (expectedRevision != referenceTable.revision) throw new RuntimeException();
                    break;
                } catch (RuntimeException runtimeexception) {
                    referenceTable = null;
                    if (js5Client.isPriorityQueueFull(i + 66)) referenceTableRequest = null;
                    else referenceTableRequest = js5Client.queueRequest((byte) -95, (byte) 0, true, indexId, 255);
                    return null;
                }
            }
            try {
                if (is == null) throw new RuntimeException();
                referenceTable = new ReferenceTable(is, expectedCrc, expectedWhirlpool);
            } catch (RuntimeException runtimeexception) {
                js5Client.forceDisconnect(i + -57);
                referenceTable = null;
                if (js5Client.isPriorityQueueFull(i ^ ~0x16)) referenceTableRequest = null;
                else referenceTableRequest = js5Client.queueRequest((byte) 47, (byte) 0, true, indexId, 255);
                return null;
            }
            if (metaIndex != null) diskCache.enqueueWrite(is, metaIndex, (byte) 10, indexId);
        } while (false);
        referenceTableRequest = null;
        if (dataIndex != null) {
            loadedGroupCount = 0;
            groupLoadStatus = new byte[referenceTable.groupCapacity];
        }
        return referenceTable;
    }

    static final boolean method2352(int i, int i_20_, int i_21_) {
        anInt6358++;
        int i_22_ = -38 / ((60 - i) / 40);
        return (0x10 & i_21_) != 0;
    }

    Component219(int i, CacheIndexReader class137, CacheIndexReader class137_23_, Component253 class248, DisplayModeManagerContainer67 class112, int i_24_, byte[] is, int i_25_, boolean bool) {
        activeRequests = new LruCache(16);
        workCursor = 0;
        requestedGroups = new NodeList();
        nextDiscardMillis = 0L;
        do {
            try {
                indexId = i;
                dataIndex = class137;
                if (dataIndex != null) {
                    prefetching = true;
                    workQueue = new NodeList();
                } else prefetching = false;
                expectedCrc = i_24_;
                expectedWhirlpool = is;
                expectedRevision = i_25_;
                metaIndex = class137_23_;
                discardStaleRequests = bool;
                js5Client = class248;
                diskCache = class112;
                if (metaIndex == null) break;
                referenceTableRequest = diskCache.readImmediate(metaIndex, indexId, (byte) -112);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("bja.<init>(" + i + ',' + (class137 != null ? "{...}" : "null") + ',' + (class137_23_ != null ? "{...}" : "null") + ',' + (class248 != null ? "{...}" : "null") + ',' + (class112 != null ? "{...}" : "null") + ',' + i_24_ + ',' + (is != null ? "{...}" : "null") + ',' + i_25_ + ',' + bool + ')'));
            }
            break;
        } while (false);
    }
}
