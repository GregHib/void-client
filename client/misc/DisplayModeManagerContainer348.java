/* DisplayModeManagerContainer348 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer348
/**
 * RENAMED from `Class239_Sub5` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static int anInt5884;
    static int anInt5885;
    static int anInt5886;
    static int anInt5887;
    static int anInt5888;
    static int anInt5889;
    static int anInt5890;
    static int fps = 0;
    static int anInt5892;
    static int anInt5893;

    final int getDefaultValue(int i) {
        anInt5892++;
        if (i != 20014) return 98;
        return 1;
    }

    final void setValue(int i, int i_0_) {
        this.preferenceValue = i_0_;
        int i_1_ = 57 / ((i - 82) / 35);
        anInt5887++;
    }

    final int method1739(int i) {
        anInt5889++;
        if (i != -32350) anInt5886 = -17;
        return this.preferenceValue;
    }

    DisplayModeManagerContainer348(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    static final boolean method1740(int i, int i_2_, boolean bool) {
        if (bool != false) return true;
        anInt5890++;
        return RadixText.method1833((byte) -128, i_2_, i) || PacketReader.isPacketAllowed(i_2_, i, (byte) 96);
    }

    static final void method1741(DisplayModeManagerContainer207 class348_sub49_sub2, byte i) {
        anInt5893++;
        class348_sub49_sub2.startBitAccess(122);
        int i_3_ = StringDefinition.anInt9591;
        Player player = (Component72.localPlayer = InterfaceRenderer.players[i_3_] = new Player());
        player.anInt10290 = i_3_;
        int i_4_ = class348_sub49_sub2.readBits((byte) -24, 30);
        if (i != 118) anInt5886 = 111;
        byte i_5_ = (byte) (i_4_ >> 28);
        int i_6_ = i_4_ >> 14 & 0x3fff;
        player.anIntArray10320[0] = -NodeBaseSub2.regionTileX + i_6_;
        int i_7_ = 0x3fff & i_4_;
        player.x = (((player.anIntArray10320[0]) << 9) + (player.getSize((byte) 91) << 8));
        player.anIntArray10317[0] = i_7_ + -Component330.regionTileY;
        player.y = (((player.anIntArray10317[0]) << 9) - -(player.getSize((byte) 85) << 8));
        Component117.anInt4372 = player.plane = player.aByte6376 = i_5_;
        if (NpcComposition.method802((player.anIntArray10317[0]), (player.anIntArray10320[0]), true)) player.aByte6376++;
        if (Component101.aClass348_Sub49Array2105[i_3_] != null) player.readUpdateMask((byte) 84, (Component101.aClass348_Sub49Array2105[i_3_]));
        ShaderCompilerSub1.anInt6513 = 0;
        ShaderProgramSub7.anIntArray6290[ShaderCompilerSub1.anInt6513++] = i_3_;
        NodeSub5.aByteArray6624[i_3_] = (byte) 0;
        HashNodeSub4.anInt9513 = 0;
        for (int i_8_ = 1; i_8_ < 2048; i_8_++) {
            if (i_8_ != i_3_) {
                int i_9_ = class348_sub49_sub2.readBits((byte) -24, 18);
                int i_10_ = i_9_ >> 16;
                int i_11_ = (i_9_ & 0xff78) >> 8;
                int i_12_ = i_9_ & 0xff;
                Component135 class359 = NpcDefinition.aClass359Array6802[i_8_] = new Component135();
                class359.aBoolean4426 = false;
                class359.anInt4420 = (i_11_ << 14) + ((i_10_ << 28) + i_12_);
                class359.anInt4423 = 0;
                class359.anInt4425 = -1;
                DisplayModeManagerContainer136.anIntArray4709[HashNodeSub4.anInt9513++] = i_8_;
                NodeSub5.aByteArray6624[i_8_] = (byte) 0;
            }
        }
        class348_sub49_sub2.stopBitAccess(false);
    }

    DisplayModeManagerContainer348(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    static final Component362 method1742(boolean bool, int i) {
        if (bool != false) method1740(35, -126, false);
        anInt5885++;
        if (!Component195.aBoolean5013 || DisplayModeManagerContainer343.anInt8731 > i || Component284.anInt6151 < i) return null;
        return (OutputStream_Sub1.aClass110_Sub1Array97[i + -DisplayModeManagerContainer343.anInt8731]);
    }

    final int getValue(int i, int i_13_) {
        if (i != 3) fps = -34;
        anInt5884++;
        return 1;
    }

    final void validateValue(boolean bool) {
        anInt5888++;
        if (bool != false) getDefaultValue(-110);
        if (this.preferenceValue != 1 && this.preferenceValue != 0) this.preferenceValue = getDefaultValue(20014);
    }
}
