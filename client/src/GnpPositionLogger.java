/* GnpPositionLogger - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class91` (JODE-obfuscated).
 * GPS position logger. Emits 'gnp1 pos:' / 'gnp2 pos:' / 'gnp3 mis:' trace lines for the client's GPS/position debug stream.
 */

final class GnpPositionLogger {
    static DisplayModeManagerContainer238 aClass74_1519;
    static int anInt1520;
    static int[] anIntArray1521 = {7, 8, 9, 10, 11, 12, 13, 15};
    static int anInt1522;
    static CommandHandler aClass82_1523;

    static final void method855(int i, int i_0_, int i_1_) {
        anInt1520++;
        RSARequest class348_sub42_sub15 = FriendLoginMessage.method2516(i_1_, (byte) 105, i);//6
        class348_sub42_sub15.method3246(i ^ ~0x6397);
        class348_sub42_sub15.anInt9652 = i_0_;
    }

    static final void method856(byte i) {
        Component142.anInt4411 = 0;
        DisplayModeManagerContainer204.anInt1597 = 0;
        anInt1522++;
        OggStreamReader.anInt9041++;
        GpsOverlay.method1165(1);
        BuildInfo.method204(-724138005);
        DisplayModeManagerContainer292.method1318(-65536);
        boolean bool = false;
        for (int i_2_ = 0; i_2_ < Component142.anInt4411; i_2_++) {
            int i_3_ = Component305.anIntArray9932[i_2_];
            NpcNode class348_sub22 = ((NpcNode) Component21.aClass356_3654.get(i_3_, -6008));
            Npc npc = (class348_sub22.npc);
            if (Component364.aBoolean8335 && HashNodeSub1.method3169(i_3_, 0)) ShaderProgramSub2.method2146((byte) 84);
            if (OggStreamReader.anInt9041 != (npc.anInt10306)) {
                if (npc.definition.method793(0)) Component298.method181(true, npc);
                npc.method2448(null, -2);
                class348_sub22.unlink((byte) 52);
                bool = true;
            }
        }
        if (bool) {
            NodeSub32.anInt6930 = Component21.aClass356_3654.size(1);
            Component21.aClass356_3654.method3477(3, DefinitionSub23.aClass348_Sub22Array9319);
        }
        if (DefinitionSub25.anInt9341 != Component80.packetBuffer.offset) throw new RuntimeException("gnp1 pos:" + (Component80.packetBuffer.offset) + " psize:" + DefinitionSub25.anInt9341);
        if (i <= 47) aClass74_1519 = null;
        for (int i_4_ = 0; Component324.anInt2057 > i_4_; i_4_++) {
            if (Component21.aClass356_3654.get(DisplayModeManagerContainer238.anIntArray1233[i_4_], -6008) == null) throw new RuntimeException("gnp2 pos:" + i_4_ + " size:" + Component324.anInt2057);
        }
        if (NodeSub32.anInt6930 - Component324.anInt2057 != 0) throw new RuntimeException("gnp3 mis:" + (NodeSub32.anInt6930 - Component324.anInt2057));
        for (int i_5_ = 0; i_5_ < NodeSub32.anInt6930; i_5_++) {
            if (DefinitionSub23.aClass348_Sub22Array9319[i_5_].npc.anInt10306 != OggStreamReader.anInt9041) {
                throw new RuntimeException("gnp4 uk:" + (DefinitionSub23.aClass348_Sub22Array9319[i_5_].npc.anInt10290));
            }
        }
    }

    public static void method857(int i) {
        anIntArray1521 = null;
        aClass82_1523 = null;
        aClass74_1519 = null;
        if (i < 121) method856((byte) -72);
    }

    static {
        aClass74_1519 = new DisplayModeManagerContainer238(10, 8);
    }
}
