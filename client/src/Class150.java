/* Class150 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class150 {
    static Class113 aClass113_2047;
    private Index aIndex_2048;
    static int anInt2049;
    private final Class60 aClass60_2050 = new Class60(64);
    static int anInt2051;
    static int anInt2052;
    static int anInt2053;
    Index aIndex_2054;
    static int anInt2055;
    static int anInt2056;
    static int anInt2057 = 0;

    static final void method1202(int i) {
        anInt2052++;
        int[] is = new int[Exception_Sub1.aClass255_112.anInt3271];
        int i_0_ = i;
        for (int i_1_ = 0; Exception_Sub1.aClass255_112.anInt3271 > i_1_; i_1_++) {
            ItemDefinition itemDefinition = Exception_Sub1.aClass255_112.method1940(-104, i_1_);
            if (itemDefinition.anInt2815 >= 0 || itemDefinition.anInt2788 >= 0) is[i_0_++] = i_1_;
        }
        Class25.anIntArray369 = new int[i_0_];
        for (int i_2_ = 0; i_2_ < i_0_; i_2_++)
            Class25.anIntArray369[i_2_] = is[i_2_];
    }

    final Class34 method1203(byte i, int i_3_) {
        anInt2056++;
        if (i != 33) aIndex_2048 = null;
        Class34 class34;
        synchronized (aClass60_2050) {
            class34 = (Class34) aClass60_2050.method583(i_3_, -58);
        }
        if (class34 != null) return class34;
        byte[] is;
        synchronized (aIndex_2048) {
            is = aIndex_2048.method410(i + -1893, 3, i_3_);
        }
        class34 = new Class34();
        class34.aClass150_475 = this;
        if (is != null) class34.method346(~i, new Class348_Sub49(is));
        synchronized (aClass60_2050) {
            aClass60_2050.method582(class34, i_3_, (byte) -109);
        }
        return class34;
    }

    final void method1204(int i) {
        synchronized (aClass60_2050) {
            aClass60_2050.method587(-93);
        }
        anInt2049++;
        if (i != 0) aIndex_2048 = null;
    }

    static final Class348_Sub42_Sub14 method1205(int i, boolean bool, Index index, int i_4_) {
        anInt2053++;
        Class348_Sub49 class348_sub49 = new Class348_Sub49(index.method410(-1860, i_4_, i));
        if (bool != true) method1208(102);
        Class348_Sub42_Sub14 class348_sub42_sub14 = new Class348_Sub42_Sub14(i, class348_sub49.readString((byte) 88), class348_sub49.readString((byte) 120), class348_sub49.readInt((byte) -126), class348_sub49.readInt((byte) -126), class348_sub49.readUnsignedByte(255) == 1, class348_sub49.readUnsignedByte(255), class348_sub49.readUnsignedByte(255));
        int i_5_ = class348_sub49.readUnsignedByte(255);
        for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
            class348_sub42_sub14.aClass262_9629.method1999(new Class348_Sub18(class348_sub49.readUnsignedByte(255), class348_sub49.readUnsignedShort(842397944), class348_sub49.readUnsignedShort(842397944), class348_sub49.readUnsignedShort(842397944), class348_sub49.readUnsignedShort(842397944), class348_sub49.readUnsignedShort(842397944), class348_sub49.readUnsignedShort(842397944), class348_sub49.readUnsignedShort(842397944), class348_sub49.readUnsignedShort(842397944)), -20180);
        class348_sub42_sub14.method3240((byte) 37);
        return class348_sub42_sub14;
    }

    final void method1206(byte i) {
        if (i != -37) aIndex_2048 = null;
        anInt2051++;
        synchronized (aClass60_2050) {
            aClass60_2050.method590(0);
        }
    }

    final void method1207(int i, int i_7_) {
        anInt2055++;
        if (i == -17452) {
            synchronized (aClass60_2050) {
                aClass60_2050.method578(i + 17454, i_7_);
            }
        }
    }

    public static void method1208(int i) {
        aClass113_2047 = null;
        int i_8_ = -65 / ((i - -58) / 57);
    }

    Class150(Class230 class230, int i, Index index, Index index_9_) {
        try {
            this.aIndex_2054 = index_9_;
            aIndex_2048 = index;
            aIndex_2048.method407(0, 3);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("oha.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (index != null ? "{...}" : "null") + ',' + (index_9_ != null ? "{...}" : "null") + ')'));
        }
    }

    static {
        aClass113_2047 = new Class113();
    }
}
