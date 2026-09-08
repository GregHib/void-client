/* ImageCacheStore - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
/**
 * RENAMED from `Class322` (JODE-obfuscated).
 * Full image cache store. Holds int[][][] RGB pixel buffers; getAllBuffers throws 'Can only retrieve a full image cache' if the cache is not fully populated.
 */

final class ImageCacheStore {
    static int anInt4018;
    static int anInt4019;
    private final int capacity;
    private NodeList lruList;
    private int singleImageId;
    static int anInt4023;
    private final int imageCount;
    private int usedSlots = 0;
    static int anInt4026;
    static Component183 aClass114_4027;
    static int anInt4028;
    private int[][][] buffers;
    static int anInt4030;
    static int[] anIntArray4031;
    static int anInt4032 = -1;
    private ClientSystemInfo[] slots;
    static int anInt4034;
    /** True when the last {@link #getPixels} allocated or reused a different slot. */
    boolean cacheMiss;
    static Component17 aClass308_4036;

    static final int method2552(boolean bool, int i, int i_0_, int i_1_) {
        if (i_1_ != -24667) method2554((byte) 95);
        anInt4023++;
        NodeSub13 class348_sub13 = AbstractGlTextureSub4.getContainerNode((byte) 4, i, bool);
        if (class348_sub13 == null) return -1;
        if (i_0_ < 0 || i_0_ >= class348_sub13.itemIds.length) return -1;
        return class348_sub13.itemIds[i_0_];
    }

    final int[][][] getAllBuffers(int i) {
        anInt4018++;
        if (imageCount != capacity) throw new RuntimeException("Can only retrieve a full image cache");
        for (int i_2_ = i; i_2_ < capacity; i_2_++)
            slots[i_2_] = DisplayModeManagerContainer196.aClass348_Sub24_4226;
        return buffers;
    }

    static final void method2554(byte i) {
        if (i != -45) anInt4032 = 61;
        anInt4030++;
        if (Component37.anInt3931 == 1 || Component37.anInt3931 == 3 || (Component37.anInt3931 != Component178.anInt1447 && (Component37.anInt3931 == 0 || Component178.anInt1447 == 0))) {
            NodeSub32.anInt6930 = 0;
            Component324.anInt2057 = 0;
            Component21.aClass356_3654.clear(0);
        }
        Component178.anInt1447 = Component37.anInt3931;
    }

    public static void method2555(byte i) {
        if (i != 28) method2554((byte) 21);
        anIntArray4031 = null;
        aClass114_4027 = null;
        aClass308_4036 = null;
    }

    static final void method2556(boolean bool, int i, DisplayModeManagerContainer58 class318_sub1_sub3_sub3) {
        anInt4028++;
        int i_3_ = -1;
        int i_4_ = 0;
        if (OpenGlShader.clientCycle < class318_sub1_sub3_sub3.anInt10239) RadixText.method1834(class318_sub1_sub3_sub3, (byte) -16);
        else if (OpenGlShader.clientCycle <= (class318_sub1_sub3_sub3.anInt10300)) Component362.method1041(-1, class318_sub1_sub3_sub3);
        else {
            Component386.method1600(false, 0, class318_sub1_sub3_sub3);
            i_3_ = Component366.anInt3062;
            i_4_ = Component162.anInt8387;
        }
        if (bool != false) aClass114_4027 = null;
        if ((class318_sub1_sub3_sub3.x < 512) || class318_sub1_sub3_sub3.y < 512 || (-512 + AbstractShaderSub4.anInt7319 * 512 <= class318_sub1_sub3_sub3.x) || (-512 + ParametricDefinition.anInt9109 * 512 <= class318_sub1_sub3_sub3.y)) {
            class318_sub1_sub3_sub3.anInt10291 = -1;
            class318_sub1_sub3_sub3.anInt10300 = 0;
            i_4_ = 0;
            i_3_ = -1;
            class318_sub1_sub3_sub3.anIntArray10236 = null;
            class318_sub1_sub3_sub3.anInt10269 = -1;
            class318_sub1_sub3_sub3.anInt10286 = -1;
            class318_sub1_sub3_sub3.anInt10239 = 0;
            class318_sub1_sub3_sub3.x = (512 * (class318_sub1_sub3_sub3.anIntArray10320[0]) + 256 * class318_sub1_sub3_sub3.getSize((byte) 120));
            class318_sub1_sub3_sub3.y = (512 * (class318_sub1_sub3_sub3.anIntArray10317[0]) + class318_sub1_sub3_sub3.getSize((byte) 88) * 256);
            class318_sub1_sub3_sub3.resetCombat(70);
        }
        if ((Component72.localPlayer == class318_sub1_sub3_sub3) && (class318_sub1_sub3_sub3.x < 6144 || class318_sub1_sub3_sub3.y < 6144 || (class318_sub1_sub3_sub3.x >= 512 * (AbstractShaderSub4.anInt7319 + -12)) || (512 * (ParametricDefinition.anInt9109 - 12) <= class318_sub1_sub3_sub3.y))) {
            class318_sub1_sub3_sub3.anInt10291 = -1;
            i_3_ = -1;
            class318_sub1_sub3_sub3.anInt10300 = 0;
            class318_sub1_sub3_sub3.anInt10269 = -1;
            class318_sub1_sub3_sub3.anInt10239 = 0;
            i_4_ = 0;
            class318_sub1_sub3_sub3.anIntArray10236 = null;
            class318_sub1_sub3_sub3.anInt10286 = -1;
            class318_sub1_sub3_sub3.x = (512 * (class318_sub1_sub3_sub3.anIntArray10320[0]) + 256 * class318_sub1_sub3_sub3.getSize((byte) 115));
            class318_sub1_sub3_sub3.y = (512 * (class318_sub1_sub3_sub3.anIntArray10317[0]) + 256 * class318_sub1_sub3_sub3.getSize((byte) 115));
            class318_sub1_sub3_sub3.resetCombat(54);
        }
        int i_5_ = NodeSub8.method2774((byte) 108, class318_sub1_sub3_sub3);
        NodeBaseSub2.method3443(true, class318_sub1_sub3_sub3);
        DisplayModeManagerContainer5.method729(i_3_, i_5_, (byte) 67, class318_sub1_sub3_sub3, i_4_);
        Component140.method3208(class318_sub1_sub3_sub3, i_3_, -98);
        GameType.method1635(-69, class318_sub1_sub3_sub3);
    }

    final int[][] getPixels(int i, int i_6_) {
        anInt4034++;
        if (i >= -75) method2554((byte) -61);
        if (capacity != imageCount) {
            if (capacity == 1) {
                this.cacheMiss = i_6_ != singleImageId;
                singleImageId = i_6_;
                return buffers[0];
            }
            ClientSystemInfo class348_sub24 = slots[i_6_];
            if (class348_sub24 == null) {
                this.cacheMiss = true;
                if (capacity <= usedSlots) {
                    ClientSystemInfo class348_sub24_7_ = (ClientSystemInfo) lruList.last(-126);
                    class348_sub24 = new ClientSystemInfo(i_6_, class348_sub24_7_.anInt6875);
                    slots[class348_sub24_7_.anInt6872] = null;
                    class348_sub24_7_.unlink((byte) 56);
                } else {
                    class348_sub24 = new ClientSystemInfo(i_6_, usedSlots);
                    usedSlots++;
                }
                slots[i_6_] = class348_sub24;
            } else this.cacheMiss = false;
            lruList.addHead(class348_sub24, -110);
            return (buffers[class348_sub24.anInt6875]);
        }
        this.cacheMiss = slots[i_6_] == null;
        slots[i_6_] = DisplayModeManagerContainer196.aClass348_Sub24_4226;
        return buffers[i_6_];
    }

    final void clear(int i) {
        anInt4019++;
        if (i != 6144) buffers = null;
        for (int i_8_ = 0; capacity > i_8_; i_8_++) {
            buffers[i_8_][0] = null;
            buffers[i_8_][1] = null;
            buffers[i_8_][2] = null;
            buffers[i_8_] = null;
        }
        slots = null;
        buffers = null;
        lruList.clear(99);
        lruList = null;
    }

    ImageCacheStore(int i, int i_9_, int i_10_) {
        singleImageId = -1;
        lruList = new NodeList();
        this.cacheMiss = false;
        capacity = i;
        imageCount = i_9_;
        slots = new ClientSystemInfo[imageCount];
        buffers = new int[capacity][3][i_10_];
    }

    static {
        aClass114_4027 = new Component183(90, 10);
        aClass308_4036 = new Component17(128);
    }
}
