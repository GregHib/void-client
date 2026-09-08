/* LoggedOutDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class LoggedOutDefinition
/**
 * RENAMED from `Class348_Sub40_Sub34` (JODE-obfuscated).
 * Evidence: distinctive string present; subclass of Definition (hierarchy)
 */ extends Definition {
    static int[] anIntArray9431 = new int[1];
    static Component176[] aClass293Array9432;
    static int anInt9433;
    static int anInt9434;
    static int anInt9435;
    static int[] anIntArray9436 = new int[2];
    static int anInt9437;
    private int anInt9438 = 4096;
    private boolean aBoolean9439 = true;

    static final int method3140(int i, int i_0_) {
        int i_1_ = 40 / ((i - 19) / 63);
        anInt9435++;
        if (i_0_ == 16711935) return -1;
        return Shader.method160(27076, i_0_);
    }

    /**
     * Tear down the game session: close socket, clear entities/scene, stop music.
     * When {@code bool} is true, advances client state to 12 (logged-out).
     */
    static final void disconnectAndReset(boolean bool, byte i) {
        if (DefinitionSub8.aClass238_9165 != null) {
            DefinitionSub8.aClass238_9165.close((byte) 36);
            DefinitionSub8.aClass238_9165 = null;
        }
        anInt9437++;
        Component241.anInt2955 = 0;
        NodeSub18.method2938((byte) 87);
        DisplayModeManagerContainer58.method2433();
        if (i != 11) anIntArray9436 = null;
        for (int i_2_ = 0; i_2_ < 4; i_2_++)
            NodeSub45.aClass361Array7108[i_2_].method3500(700);
        HashNodeSub3.method3177(-50, false);
        BuildInfo.maybeGc();
        Sprite.resetMusic(2, 22684);
        DisplayModeManagerContainer238.aBoolean1236 = false;
        Component119.anInt3428 = -1;
        DefinitionSub17Sub1.method3093(i + 79);
        MatrixSub2.method921((byte) 99, true);
        Component330.regionTileY = 0;
        NodeBaseSub2.regionTileX = 0;
        GraphicsToolkit.anInt4581 = 0;
        DisplayModeManagerContainer363.anInt4095 = 0;
        Component178.anInt1447 = Component37.anInt3931 = 0;
        for (int i_3_ = 0; (i_3_ < NodeSub27.aClass302Array6897.length); i_3_++)
            NodeSub27.aClass302Array6897[i_3_] = null;
        HashNode.method3163((byte) -114);
        for (int i_4_ = 0; i_4_ < 2048; i_4_++)
            InterfaceRenderer.players[i_4_] = null;
        Component324.anInt2057 = 0;
        Component21.aClass356_3654.clear(i ^ 0xb);
        NodeSub32.anInt6930 = 0;
        Component387.aClass356_1895.clear(0);
        Component59.method1122(0);
        DisplayModeManagerContainer136.anInt4718 = 0;
        DisplayModeManagerContainer58.aClass170_10209.method1314((byte) -107);
        Component281.method2282(-12648);
        DisplayModeManagerContainer368.method465(i + -1636518175);
        MatrixSub2.aLong5745 = 0L;
        Component323.aClass348_Sub26_5881 = null;
        if (bool) Buffer.setClientState(2, 12);
        else {
            Buffer.setClientState(i + -9, 3);
            try {
                AppletInvoker.callAppletNoArgs((byte) 125, ToolkitFactory.anApplet1530, "loggedout");
            } catch (Throwable throwable) {
                /* empty */
            }
        }
    }

    final void method3049(Buffer class348_sub49, int i, int i_5_) {
        do {
            try {
                if (i_5_ != 31015) method3140(-77, 55);
                anInt9433++;
                int i_6_ = i;
                if (i_6_ == 0) {
                    anInt9438 = class348_sub49.readUnsignedShort(842397944);
                    break;
                } else if (i_6_ != 1) break;
                aBoolean9439 = class348_sub49.readUnsignedByte(255) == 1;
                break;
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("cfa.F(" + (class348_sub49 != null ? "{...}" : "null") + ',' + i + ',' + i_5_ + ')'));
            }
        } while (false);
    }

    public LoggedOutDefinition() {
        super(1, false);
    }

    public static void method3142(int i) {
        anIntArray9431 = null;
        anIntArray9436 = null;
        if (i != 0) aClass293Array9432 = null;
        aClass293Array9432 = null;
    }

    final int[][] getColourOutput(int i, int i_7_) {
        anInt9434++;
        int[][] is = this.imageCacheStore.getPixels(-111, i);
        if (i_7_ != -1564599039) method3140(72, -13);
        if (this.imageCacheStore.cacheMiss) {
            int[] is_8_ = this.method3048(-1 + i & DisplayModeManagerContainer356.anInt6325, 633706337, 0);
            int[] is_9_ = this.method3048(i, i_7_ + -2096661920, 0);
            int[] is_10_ = this.method3048(DisplayModeManagerContainer356.anInt6325 & 1 + i, 633706337, 0);
            int[] is_11_ = is[0];
            int[] is_12_ = is[1];
            int[] is_13_ = is[2];
            for (int i_14_ = 0; DefinitionSub6.anInt9139 > i_14_; i_14_++) {
                int i_15_ = (-is_8_[i_14_] + is_10_[i_14_]) * anInt9438;
                int i_16_ = (anInt9438 * (is_9_[1 + i_14_ & CustomCursorSetting.anInt6076] - is_9_[CustomCursorSetting.anInt6076 & -1 + i_14_]));
                int i_17_ = i_16_ >> 12;
                int i_18_ = i_15_ >> 12;
                int i_19_ = i_17_ * i_17_ >> 12;
                int i_20_ = i_18_ * i_18_ >> 12;
                int i_21_ = (int) (Math.sqrt((float) (i_19_ - (-i_20_ + -4096)) / 4096.0F) * 4096.0);
                int i_22_;
                int i_23_;
                int i_24_;
                if (i_21_ == 0) {
                    i_22_ = 0;
                    i_23_ = 0;
                    i_24_ = 0;
                } else {
                    i_23_ = i_16_ / i_21_;
                    i_22_ = i_15_ / i_21_;
                    i_24_ = 16777216 / i_21_;
                }
                if (aBoolean9439) {
                    i_24_ = (i_24_ >> 1) + 2048;
                    i_23_ = (i_23_ >> 1) + 2048;
                    i_22_ = (i_22_ >> 1) + 2048;
                }
                is_11_[i_14_] = i_23_;
                is_12_[i_14_] = i_22_;
                is_13_[i_14_] = i_24_;
            }
        }
        return is;
    }
}
