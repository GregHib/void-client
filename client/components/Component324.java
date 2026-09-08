/* Component324 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component324
/**
 * RENAMED from `Class150` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static Component22 aClass113_2047;
    private CacheStore aClass45_2048;
    static int anInt2049;
    private final NodeCache aClass60_2050 = new NodeCache(64);
    static int anInt2051;
    static int anInt2052;
    static int anInt2053;
    CacheStore aClass45_2054;
    static int anInt2055;
    static int anInt2056;
    static int anInt2057 = 0;

    static final void method1202(int i) {
        anInt2052++;
        int[] is = new int[Exception_Sub1.itemDefinitions.itemCount];
        int i_0_ = i;
        for (int i_1_ = 0; Exception_Sub1.itemDefinitions.itemCount > i_1_; i_1_++) {
            ItemDefinition class213 = Exception_Sub1.itemDefinitions.getItemDefinition(-104, i_1_);
            if (class213.anInt2815 >= 0 || class213.anInt2788 >= 0) is[i_0_++] = i_1_;
        }
        Component361.anIntArray369 = new int[i_0_];
        for (int i_2_ = 0; i_2_ < i_0_; i_2_++)
            Component361.anIntArray369[i_2_] = is[i_2_];
    }

    final Component225 method1203(byte i, int i_3_) {
        anInt2056++;
        if (i != 33) aClass45_2048 = null;
        Component225 class34;
        synchronized (aClass60_2050) {
            class34 = (Component225) aClass60_2050.get(i_3_, -58);
        }
        if (class34 != null) return class34;
        byte[] is;
        synchronized (aClass45_2048) {
            is = aClass45_2048.getFile(i + -1893, 3, i_3_);
        }
        class34 = new Component225();
        class34.aClass150_475 = this;
        if (is != null) class34.method346(~i, new Buffer(is));
        synchronized (aClass60_2050) {
            aClass60_2050.putOne(class34, i_3_, (byte) -109);
        }
        return class34;
    }

    final void method1204(int i) {
        synchronized (aClass60_2050) {
            aClass60_2050.purgeSoftReferences(-93);
        }
        anInt2049++;
        if (i != 0) aClass45_2048 = null;
    }

    static final HashNodeSub14 method1205(int i, boolean bool, CacheStore class45, int i_4_) {
        anInt2053++;
        Buffer class348_sub49 = new Buffer(class45.getFile(-1860, i_4_, i));
        if (bool != true) method1208(102);
        HashNodeSub14 class348_sub42_sub14 = new HashNodeSub14(i, class348_sub49.readString((byte) 88), class348_sub49.readString((byte) 120), class348_sub49.readInt((byte) -126), class348_sub49.readInt((byte) -126), class348_sub49.readUnsignedByte(255) == 1, class348_sub49.readUnsignedByte(255), class348_sub49.readUnsignedByte(255));
        int i_5_ = class348_sub49.readUnsignedByte(255);
        for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
            class348_sub42_sub14.aClass262_9629.addTail(new NodeSub18(class348_sub49.readUnsignedByte(255), class348_sub49.readUnsignedShort(842397944), class348_sub49.readUnsignedShort(842397944), class348_sub49.readUnsignedShort(842397944), class348_sub49.readUnsignedShort(842397944), class348_sub49.readUnsignedShort(842397944), class348_sub49.readUnsignedShort(842397944), class348_sub49.readUnsignedShort(842397944), class348_sub49.readUnsignedShort(842397944)), -20180);
        class348_sub42_sub14.method3240((byte) 37);
        return class348_sub42_sub14;
    }

    final void method1206(byte i) {
        if (i != -37) aClass45_2048 = null;
        anInt2051++;
        synchronized (aClass60_2050) {
            aClass60_2050.clear(0);
        }
    }

    final void method1207(int i, int i_7_) {
        anInt2055++;
        if (i == -17452) {
            synchronized (aClass60_2050) {
                aClass60_2050.processSoftEntries(i + 17454, i_7_);
            }
        }
    }

    public static void method1208(int i) {
        aClass113_2047 = null;
        int i_8_ = -65 / ((i - -58) / 57);
    }

    Component324(GameType class230, int i, CacheStore class45, CacheStore class45_9_) {
        try {
            this.aClass45_2054 = class45_9_;
            aClass45_2048 = class45;
            aClass45_2048.getFileCount(0, 3);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("oha.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ',' + (class45_9_ != null ? "{...}" : "null") + ')'));
        }
    }

    static {
        aClass113_2047 = new Component22();
    }
}
