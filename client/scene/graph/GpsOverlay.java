/* GpsOverlay - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class139` (JODE-obfuscated).
 * GPS overlay. Renders the 'gnpov1' GPS overlay layer on the world map.
 */

final class GpsOverlay {
    byte[] aByteArray1948;
    static int anInt1949 = 0;
    static int anInt1950;
    short[] aShortArray1951;
    static boolean aBoolean1952 = false;
    short[] aShortArray1953;
    short[] aShortArray1954;
    static int anInt1955;

    static final void method1165(int i) {
        Component80.packetBuffer.startBitAccess(i ^ ~0x79);
        anInt1950++;
        int i_0_ = Component80.packetBuffer.readBits((byte) -24, 8);
        if (i == 1) {
            if (i_0_ < Component324.anInt2057) {
                for (int i_1_ = i_0_; Component324.anInt2057 > i_1_; i_1_++)
                    Component305.anIntArray9932[Component142.anInt4411++] = DisplayModeManagerContainer238.anIntArray1233[i_1_];
            }
            if (i_0_ > Component324.anInt2057) throw new RuntimeException("gnpov1");
            Component324.anInt2057 = 0;
            for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
                int i_3_ = DisplayModeManagerContainer238.anIntArray1233[i_2_];
                Npc npc = (((NpcNode) Component21.aClass356_3654.get(i_3_, -6008)).npc);
                int i_4_ = Component80.packetBuffer.readBits((byte) -24, 1);
                if (i_4_ == 0) {
                    DisplayModeManagerContainer238.anIntArray1233[Component324.anInt2057++] = i_3_;
                    npc.anInt10306 = OggStreamReader.anInt9041;
                } else {
                    int i_5_ = Component80.packetBuffer.readBits((byte) -24, 2);
                    if (i_5_ == 0) {
                        DisplayModeManagerContainer238.anIntArray1233[Component324.anInt2057++] = i_3_;
                        npc.anInt10306 = OggStreamReader.anInt9041;
                        Component354.anIntArray224[DisplayModeManagerContainer204.anInt1597++] = i_3_;
                    } else if (i_5_ == 1) {
                        DisplayModeManagerContainer238.anIntArray1233[Component324.anInt2057++] = i_3_;
                        npc.anInt10306 = OggStreamReader.anInt9041;
                        int i_6_ = Component80.packetBuffer.readBits((byte) -24, 3);
                        npc.method2443(i_6_, 1, -10);
                        int i_7_ = Component80.packetBuffer.readBits((byte) -24, 1);
                        if (i_7_ == 1) Component354.anIntArray224[DisplayModeManagerContainer204.anInt1597++] = i_3_;
                    } else if (i_5_ == 2) {
                        DisplayModeManagerContainer238.anIntArray1233[Component324.anInt2057++] = i_3_;
                        npc.anInt10306 = OggStreamReader.anInt9041;
                        if (Component80.packetBuffer.readBits((byte) -24, 1) == 1) {
                            int i_9_ = Component80.packetBuffer.readBits((byte) -24, 3);
                            npc.method2443(i_9_, 2, -10);
                            int i_10_ = Component80.packetBuffer.readBits((byte) -24, 3);
                            npc.method2443(i_10_, 2, -10);
                        } else {
                            int i_8_ = Component80.packetBuffer.readBits((byte) -24, 3);
                            npc.method2443(i_8_, 0, i + -11);
                        }
                        int i_11_ = Component80.packetBuffer.readBits((byte) -24, 1);
                        if (i_11_ == 1) Component354.anIntArray224[DisplayModeManagerContainer204.anInt1597++] = i_3_;
                    } else if (i_5_ == 3) Component305.anIntArray9932[Component142.anInt4411++] = i_3_;
                }
            }
        }
    }

    /** {@code i & i_12_}. */
    static int bitwiseAnd(int i, int i_12_) {
        return i & i_12_;
    }

    static final boolean method1167(int i, byte i_13_) {
        anInt1955++;
        if (i_13_ >= -45) anInt1949 = 88;
        return i == 0 || i == 1 || i == 2;
    }
}
