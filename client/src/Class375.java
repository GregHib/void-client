/* Class375 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class375 {
    static int anInt4539;
    static boolean aBoolean4540 = false;
    static int anInt4541;
    static boolean aBoolean4542 = false;
    static Class60 aClass60_4543 = new Class60(8);
    static int anInt4544 = -1;
    static int anInt4545 = -1;

    static final void method3612(int i, Class348_Sub49_Sub2 class348_sub49_sub2) {
        if (i < 59) method3614(-51, 64, -115, null, -96);
        for (int i_0_ = 0; i_0_ < Class101_Sub3.anInt5768; i_0_++) {
            int i_1_ = Class18.anIntArray279[i_0_];
            Player player = Class294.aPlayerArray5058[i_1_];
            int i_2_ = class348_sub49_sub2.readUnsignedByte(255);
            if ((i_2_ & 0x40) != 0) i_2_ += class348_sub49_sub2.readUnsignedByte(255) << 8;
            if ((i_2_ & 0x4000) != 0) i_2_ += class348_sub49_sub2.readUnsignedByte(255) << 16;
            Class133.method1141(class348_sub49_sub2, i_1_, i_2_, 123, player);
        }
        anInt4541++;
    }

    public static void method3613(int i) {
        if (i != 64) method3612(-7, null);
        aClass60_4543 = null;
    }

    static final void method3614(int i, int i_3_, int i_4_, Class348_Sub47 class348_sub47, int i_5_) {
        anInt4539++;
        if (i_5_ != -19692) method3613(10);
        class348_sub47.aClass348_Sub49_Sub2_7116.writeInt((byte) 124, i);
        class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, i_4_);
        class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, i_3_);
    }
}
