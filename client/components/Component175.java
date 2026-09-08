/* Component175 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component175
/**
 * RENAMED from `Class239_Sub1` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static int anInt5841;
    static int anInt5842;
    static int anInt5843;
    static int anInt5844;
    static int anInt5845;
    static int anInt5846;
    static short[][] aShortArrayArray5847;
    static int anInt5848;
    static int anInt5849;
    static int anInt5850;

    static final void method1719(boolean bool, String string, String string_0_, int i, int i_1_) {
        try {
            DisplayModeManagerContainer109.method1356(true, string_0_, i_1_, i, bool, string, true);
            anInt5845++;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("aj.G(" + bool + ',' + (string != null ? "{...}" : "null") + ',' + (string_0_ != null ? "{...}" : "null") + ',' + i + ',' + i_1_ + ')'));
        }
    }

    final int method1720(int i) {
        anInt5843++;
        if (i != -32350) getValue(82, -89);
        return this.preferenceValue;
    }

    static final void method1721(String string, byte i) {
        anInt5849++;
        if (r.aBoolean9722 && (0x18 & PauseTimer.anInt500) != 0) {
            int i_2_ = -88 / ((i - -33) / 37);
            boolean bool = false;
            int i_3_ = ShaderCompilerSub1.anInt6513;
            int[] is = ShaderProgramSub7.anIntArray6290;
            for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
                Player player = (InterfaceRenderer.players[is[i_4_]]);
                if (player.username != null && player.username.equalsIgnoreCase(string) && (((player == Component72.localPlayer) && (0x10 & PauseTimer.anInt500) != 0) || (player != null && (PauseTimer.anInt500 & 0x8) != 0))) {
                    NativeLibraryLoader.anInt2975++;
                    ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(RSACipher.aClass351_4907, (DisplayModeManagerContainer64.aClass77_9029), -102);
                    class348_sub47.particleBuffer.writeShortAddLittle(4325, JaclibLoader.anInt169);
                    class348_sub47.particleBuffer.writeShortLittle(is[i_4_], (byte) 3);
                    class348_sub47.particleBuffer.writeShortLittle(Component281.anInt3829, (byte) 3);
                    class348_sub47.particleBuffer.writeIntInverseMiddle(Component90.anInt2046, -4086);
                    class348_sub47.particleBuffer.writeByteInverse((byte) -64, 0);
                    HashNodeSub14.enqueueOutboundPacket(116, class348_sub47);
                    bool = true;
                    Component10.method2252(true, player.anIntArray10320[0], player.anIntArray10317[0], (byte) -99, player.getSize((byte) 54), 0, player.getSize((byte) 91), -2, 0);
                    break;
                }
            }
            if (!bool) DisplayModeManagerContainer213.method544((FriendsIgnoreList.aClass274_3504.getLocalized(ObjectDeserializer.languageId, 544)) + string, false, 4);
            if (r.aBoolean9722) DisplayModeManagerContainer196.method2678(-2049);
        }
    }

    final void validateValue(boolean bool) {
        if (this.preferenceValue != 1 && this.preferenceValue != 0) this.preferenceValue = getDefaultValue(20014);
        if (bool == false) anInt5846++;
    }

    Component175(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    static final boolean method1722(int i, int i_5_, byte i_6_) {
        int i_7_ = 92 % ((i_6_ - 48) / 32);
        anInt5848++;
        return (0x10000 & i) != 0;
    }

    public static void method1723(byte i) {
        aShortArrayArray5847 = null;
        if (i != 119) anInt5850 = -51;
    }

    final int getValue(int i, int i_8_) {
        if (i != 3) anInt5850 = 94;
        anInt5841++;
        return 1;
    }

    final void setValue(int i, int i_9_) {
        int i_10_ = -57 / ((82 - i) / 35);
        anInt5844++;
        this.preferenceValue = i_9_;
    }

    Component175(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final int getDefaultValue(int i) {
        if (i != 20014) anInt5850 = -72;
        anInt5842++;
        return 1;
    }
}
