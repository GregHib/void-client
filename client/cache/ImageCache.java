/* ImageCache - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class191` (JODE-obfuscated).
 * Image pixel cache. Holds int[][] RGB pixel buffers (getAllBuffers throws 'Can only retrieve a full image cache'), backed by NodederUtil[] and a NodeList; caches decoded images for reuse.
 */

final class ImageCache {
    static int anInt2556;
    private int usedSlots = 0;
    static int anInt2558;
    private final int capacity;
    static int anInt2560;
    private NodeList lruList;
    private int singleImageId = -1;
    private NodederUtil[] slots;
    private int[][] buffers;
    private int imageCount;
    static int anInt2566;
    static int anInt2567;
    static Component150 aClass227_2568 = new Component150(0);
    static int anInt2569;
    /** True when the last {@link #getPixels} allocated or reused a different slot. */
    boolean cacheMiss;
    static DisplayModeManagerContainer42 aClass304_2571 = new DisplayModeManagerContainer42(2);

    final int[][] getAllBuffers(byte i) {
        anInt2558++;
        if (capacity != imageCount) throw new RuntimeException("Can only retrieve a full image cache");
        for (int i_0_ = 0; capacity > i_0_; i_0_++)
            slots[i_0_] = ShaderSub3.aClass348_Sub6_5206;
        if (i != 16) getAllBuffers((byte) -42);
        return buffers;
    }

    static final void method1428(boolean bool) {
        DisplayModeManagerContainer173.anImage4249 = null;
        anInt2569++;
        StringCache.aFont4329 = null;
        if (bool != true) method1431(-122);
    }

    static final void method1429(String string, int i) {
        ShaderProgramSub2.addChatMessage("", i, (byte) -125, 0, string, "", "");
        anInt2560++;
    }

    static final void method1430(int i, byte i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, DisplayModeManagerContainer58 class318_sub1_sub3_sub3, DisplayModeManagerContainer58 class318_sub1_sub3_sub3_8_) {
        try {
            anInt2567++;
            int i_9_ = class318_sub1_sub3_sub3.method2425(-1);
            if (i_9_ != -1) {
                Object object = null;
                Component24 class105 = ((Component24) NodeSub1Sub1.aClass60_8807.get(i_9_, 118));
                if (class105 == null) {
                    Component170[] class207s = Component170.method1519(Component158.aClass45_322, i_9_, 0);
                    if (class207s == null) return;
                    class105 = NodeSub8.toolkit.method3691(class207s[0], true);
                    NodeSub1Sub1.aClass60_8807.putOne(class105, i_9_, (byte) -115);
                }
                ShaderSub2.method165(class318_sub1_sub3_sub3_8_.plane, i_5_, 0, i_3_ >> 1, class318_sub1_sub3_sub3_8_.x, class318_sub1_sub3_sub3_8_.getSize((byte) 126) * 256, class318_sub1_sub3_sub3_8_.y, (byte) 92, i_6_ >> 1, i_2_);
                int i_10_ = i_7_ + (Component71.anIntArray6062[0] + -18);
                int i_11_ = -54 + (Component71.anIntArray6062[1] + i_4_) - 16;
                i_10_ += i / 4 * 18;
                i_11_ += 18 * (i % 4);
                int i_12_ = -76 / ((i_1_ - 3) / 38);
                class105.drawAt(i_10_, i_11_);
                if (class318_sub1_sub3_sub3 == class318_sub1_sub3_sub3_8_) NodeSub8.toolkit.method3668(18, -1 + i_11_, -256, i_10_ - 1, 18, 57);
                Component103.method2663(-5590, i_10_ + -1, 18 + i_10_, i_11_ + -1, i_11_ - -18);
                RenderableSub6 class318_sub6 = AbstractShader.method3529(32564);
                class318_sub6.anInt6426 = 16 + i_10_;
                class318_sub6.anInt6427 = i_11_;
                class318_sub6.aClass318_Sub1_Sub3_Sub3_6431 = class318_sub1_sub3_sub3;
                class318_sub6.anInt6425 = i_11_ - -16;
                class318_sub6.anInt6429 = i_10_;
                InputStream_Sub2.aClass243_83.method1869(-87, class318_sub6);
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("qk.G(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + (class318_sub1_sub3_sub3 != null ? "{...}" : "null") + ',' + ((class318_sub1_sub3_sub3_8_ != null) ? "{...}" : "null") + ')'));
        }
    }

    public static void method1431(int i) {
        aClass304_2571 = null;
        aClass227_2568 = null;
        if (i != 0) aClass227_2568 = null;
    }

    final void clear(byte i) {
        for (int i_13_ = 0; i_13_ < capacity; i_13_++)
            buffers[i_13_] = null;
        anInt2556++;
        slots = null;
        buffers = null;
        lruList.clear(112);
        if (i != 124) imageCount = -126;
        lruList = null;
    }

    final int[] getPixels(int i, int i_14_) {
        if (i != 0) getAllBuffers((byte) 108);
        anInt2566++;
        if (capacity == imageCount) {
            this.cacheMiss = slots[i_14_] == null;
            slots[i_14_] = ShaderSub3.aClass348_Sub6_5206;
            return buffers[i_14_];
        }
        if (capacity != 1) {
            NodederUtil class348_sub6 = slots[i_14_];
            if (class348_sub6 == null) {
                this.cacheMiss = true;
                if (usedSlots < capacity) {
                    class348_sub6 = new NodederUtil(i_14_, usedSlots);
                    usedSlots++;
                } else {
                    NodederUtil class348_sub6_15_ = (NodederUtil) lruList.last(i + -123);
                    class348_sub6 = new NodederUtil(i_14_, class348_sub6_15_.anInt6636);
                    slots[class348_sub6_15_.anInt6630] = null;
                    class348_sub6_15_.unlink((byte) 80);
                }
                slots[i_14_] = class348_sub6;
            } else this.cacheMiss = false;
            lruList.addHead(class348_sub6, -90);
            return (buffers[class348_sub6.anInt6636]);
        }
        this.cacheMiss = i_14_ != singleImageId;
        singleImageId = i_14_;
        return buffers[0];
    }

    ImageCache(int i, int i_16_, int i_17_) {
        lruList = new NodeList();
        this.cacheMiss = false;
        capacity = i;
        imageCount = i_16_;
        slots = new NodederUtil[imageCount];
        buffers = new int[capacity][i_17_];
    }
}
