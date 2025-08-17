/* Class239_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub5 extends Class239 {
    static int anInt5884;
    static int anInt5885;
    static int anInt5886;
    static int anInt5887;
    static int anInt5888;
    static int anInt5889;
    static int anInt5890;
    static int anInt5891 = 0;
    static int anInt5892;
    static int anInt5893;

    final int method1710(int i) {
        anInt5892++;
        if (i != 20014) return 98;
        return 1;
    }

    final void method1712(int i, int i_0_) {
        this.anInt3138 = i_0_;
        int i_1_ = 57 / ((i - 82) / 35);
        anInt5887++;
    }

    final int method1739(int i) {
        anInt5889++;
        if (i != -32350) anInt5886 = -17;
        return this.anInt3138;
    }

    Class239_Sub5(Class348_Sub51 class348_sub51) {
        super(class348_sub51);
    }

    static final boolean method1740(int i, int i_2_, boolean bool) {
        if (bool != false) return true;
        anInt5890++;
        return Class239_Sub26.method1833((byte) -128, i_2_, i) || Class348_Sub42_Sub8_Sub2.method3200(i_2_, i, (byte) 96);
    }

    static final void method1741(Class348_Sub49_Sub2 class348_sub49_sub2, byte i) {
        anInt5893++;
        class348_sub49_sub2.startBitAccess(122);
        int i_3_ = Class348_Sub42_Sub11.index;
        Player player = (Class132.aPlayer_1907 = Class294.aPlayerArray5058[i_3_] = new Player());
        player.anInt10290 = i_3_;
        int i_4_ = class348_sub49_sub2.readBits((byte) -24, 30);
        if (i != 118) anInt5886 = 111;
        byte i_5_ = (byte) (i_4_ >> 28);
        int i_6_ = i_4_ >> 14 & 0x3fff;
        player.anIntArray10320[0] = -za_Sub2.regionTileX + i_6_;
        int i_7_ = 0x3fff & i_4_;
        player.x = (((player.anIntArray10320[0]) << 9) + (player.method2436((byte) 91) << 8));
        player.anIntArray10317[0] = i_7_ + -Class90.regionTileY;
        player.y = (((player.anIntArray10317[0]) << 9) - -(player.method2436((byte) 85) << 8));
        Class355.anInt4372 = player.plane = player.aByte6376 = i_5_;
        if (NPCDefinition.method802((player.anIntArray10317[0]), (player.anIntArray10320[0]), true)) player.aByte6376++;
        if (Class154.aClass348_Sub49Array2105[i_3_] != null) player.method2452((byte) 84, (Class154.aClass348_Sub49Array2105[i_3_]));
        Class328_Sub1.anInt6513 = 0;
        Class286_Sub7.anIntArray6290[Class328_Sub1.anInt6513++] = i_3_;
        Class348_Sub5.aByteArray6624[i_3_] = (byte) 0;
        Class348_Sub42_Sub4.anInt9513 = 0;
        for (int i_8_ = 1; i_8_ < 2048; i_8_++) {
            if (i_8_ != i_3_) {
                int i_9_ = class348_sub49_sub2.readBits((byte) -24, 18);
                int i_10_ = i_9_ >> 16;
                int i_11_ = (i_9_ & 0xff78) >> 8;
                int i_12_ = i_9_ & 0xff;
                Class359 class359 = Class348_Sub17.aClass359Array6802[i_8_] = new Class359();
                class359.aBoolean4426 = false;
                class359.anInt4420 = (i_11_ << 14) + ((i_10_ << 28) + i_12_);
                class359.anInt4423 = 0;
                class359.anInt4425 = -1;
                Class135_Sub1.anIntArray4709[Class348_Sub42_Sub4.anInt9513++] = i_8_;
                Class348_Sub5.aByteArray6624[i_8_] = (byte) 0;
            }
        }
        class348_sub49_sub2.stopBitAccess(false);
    }

    Class239_Sub5(int i, Class348_Sub51 class348_sub51) {
        super(i, class348_sub51);
    }

    static final Class110_Sub1 method1742(boolean bool, int i) {
        if (bool != false) method1740(35, -126, false);
        anInt5885++;
        if (!Class195.aBoolean5013 || Class318_Sub1_Sub2.anInt8731 > i || Class239_Sub29.anInt6151 < i) return null;
        return (OutputStream_Sub1.aClass110_Sub1Array97[i + -Class318_Sub1_Sub2.anInt8731]);
    }

    final int method1714(int i, int i_13_) {
        if (i != 3) anInt5891 = -34;
        anInt5884++;
        return 1;
    }

    final void method1716(boolean bool) {
        anInt5888++;
        if (bool != false) method1710(-110);
        if (this.anInt3138 != 1 && this.anInt3138 != 0) this.anInt3138 = method1710(20014);
    }
}
