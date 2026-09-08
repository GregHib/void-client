/* Component102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component102
/**
 * RENAMED from `Class292` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ implements Interface7 {
    static int anInt4797 = 0;
    static Component183 aClass114_4798;
    static int anInt4799;
    static int anInt4800;
    static int anInt4801;
    static int anInt4802;
    static int anInt4803 = -1;
    private final CacheStore aClass45_4804;
    static int anInt4805;

    static final int method2201(int i) {
        anInt4805++;
        synchronized (DisplayModeManagerContainer310.aClass60_355) {
            if (i != 2121) method2202(-113);
            return DisplayModeManagerContainer310.aClass60_355.countHard(0);
        }
    }

    public final int method31(int i) {
        anInt4801++;
        int i_0_ = 16 / ((i - -43) / 62);
        if (aClass45_4804.prefetchMandatory(125)) return 100;
        return aClass45_4804.getAverageLoadPercent((byte) -31);
    }

    public static void method2202(int i) {
        aClass114_4798 = null;
        if (i != -17902) anInt4803 = 78;
    }

    public final Component325 method32(int i) {
        if (i != -15004) return null;
        anInt4800++;
        return Component325.aClass69_1195;
    }

    static final boolean method2203(byte i) {
        int i_1_ = 11 % ((12 - i) / 53);
        anInt4802++;
        try {
            return PacketReader.readNextPacket(true);
        } catch (java.io.IOException ioexception) {
            SocketConnector.forceLogout(106);
            return true;
        } catch (Exception exception) {
            String string = ("T2 - " + (NodeSub3.aClass114_6584 != null ? NodeSub3.aClass114_6584.method1058((byte) 119) : -1) + "," + (Component339.aClass114_3145 != null ? Component339.aClass114_3145.method1058((byte) 119) : -1) + "," + (DefinitionSub36.aClass114_9456 == null ? -1 : DefinitionSub36.aClass114_9456.method1058((byte) 113)) + " - " + DefinitionSub25.anInt9341 + "," + ((Component72.localPlayer.anIntArray10320[0]) + NodeBaseSub2.regionTileX) + "," + (Component330.regionTileY - -(Component72.localPlayer.anIntArray10317[0])) + " - ");
            for (int i_2_ = 0; DefinitionSub25.anInt9341 > i_2_ && i_2_ < 50; i_2_++)
                string += (Component80.packetBuffer.payload[i_2_]) + ",";
            ClientErrorReporter.reportError(string, exception, 15004);
            LoggedOutDefinition.disconnectAndReset(false, (byte) 11);
            return true;
        }
    }

    Component102(CacheStore class45) {
        aClass45_4804 = class45;
    }

    static {
        aClass114_4798 = new Component183(29, 7);
    }
}
