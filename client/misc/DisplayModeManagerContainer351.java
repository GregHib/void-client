/* DisplayModeManagerContainer351 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer351
/**
 * RENAMED from `Class203` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt2672;
    static int anInt2673;
    static volatile boolean aBoolean2674 = false;
    static int anInt2675;

    static final void method1477(int i, int i_0_) {
        anInt2672++;
        RSARequest class348_sub42_sub15 = FriendLoginMessage.method2516(i, (byte) 105, i_0_);//14
        class348_sub42_sub15.method3251(-16058);
    }

    static final ParticleSystem method1478(boolean bool) {
        anInt2673++;
        ParticleSystem class348_sub47 = Component189.obtainParticleSystem((byte) -103);
        if (bool != true) return null;
        class348_sub47.anInt7122 = 0;
        class348_sub47.aClass351_7118 = null;
        class348_sub47.particleBuffer = new DisplayModeManagerContainer207(5000);
        return class348_sub47;
    }

    static final void method1479(int i, byte i_1_, int i_2_, int i_3_) {
        anInt2675++;
        int i_4_ = i_2_ - -NodeBaseSub2.regionTileX;
        int i_5_ = Component330.regionTileY + i;
        if (Component335.aClass357ArrayArrayArray2029 != null && i_2_ >= 0 && i >= 0 && AbstractShaderSub4.anInt7319 > i_2_ && ParametricDefinition.anInt9109 > i && (Component192.preferences.aClass239_Sub27_7261.method1840(-32350) != 0 || i_3_ == (Component72.localPlayer.plane))) {
            long l = i_5_ << 14 | i_3_ << 28 | i_4_;
            NodeSub37 class348_sub37 = ((NodeSub37) Component387.aClass356_1895.get(l, -6008));
            if (class348_sub37 == null) Component21.method2110(i_3_, i_2_, i);
            else {
                NodeSub34 class348_sub34 = (NodeSub34) class348_sub37.aClass262_6998.first(4);
                if (class348_sub34 == null) Component21.method2110(i_3_, i_2_, i);
                else {
                    Component252 class318_sub1_sub2_sub1 = ((Component252) Component21.method2110(i_3_, i_2_, i));
                    if (class318_sub1_sub2_sub1 == null) class318_sub1_sub2_sub1 = (new Component252(i_2_ << 9, ShaderSub1.aSArray5191[i_3_].getHeight((byte) -86, i, i_2_), i << 9, i_3_, i_3_));
                    else class318_sub1_sub2_sub1.anInt10189 = class318_sub1_sub2_sub1.anInt10180 = -1;
                    class318_sub1_sub2_sub1.anInt10181 = class348_sub34.anInt6973;
                    if (i_1_ >= -112) aBoolean2674 = true;
                    class318_sub1_sub2_sub1.anInt10185 = class348_sub34.anInt6971;
                    for (; ; ) {
                        NodeSub34 class348_sub34_6_ = ((NodeSub34) class348_sub37.aClass262_6998.next((byte) 55));
                        if (class348_sub34_6_ == null) break;
                        if (class348_sub34_6_.anInt6973 != class318_sub1_sub2_sub1.anInt10181) {
                            class318_sub1_sub2_sub1.anInt10189 = (class348_sub34_6_.anInt6973);
                            class318_sub1_sub2_sub1.anInt10190 = (class348_sub34_6_.anInt6971);
                            for (; ; ) {
                                NodeSub34 class348_sub34_7_ = ((NodeSub34) class348_sub37.aClass262_6998.next((byte) 55));
                                if (class348_sub34_7_ == null) break;
                                if ((class318_sub1_sub2_sub1.anInt10181 != (class348_sub34_7_.anInt6973)) && ((class318_sub1_sub2_sub1.anInt10189) != (class348_sub34_7_.anInt6973))) {
                                    class318_sub1_sub2_sub1.anInt10180 = (class348_sub34_7_.anInt6973);
                                    class318_sub1_sub2_sub1.anInt10186 = (class348_sub34_7_.anInt6971);
                                }
                            }
                            break;
                        }
                    }
                    int i_8_ = Component300.method2064(256 + (i_2_ << 9), i_3_, 11219, 256 + (i << 9));
                    class318_sub1_sub2_sub1.y = i << 9;
                    class318_sub1_sub2_sub1.plane = (byte) i_3_;
                    class318_sub1_sub2_sub1.anInt10196 = 0;
                    class318_sub1_sub2_sub1.x = i_2_ << 9;
                    class318_sub1_sub2_sub1.anInt6382 = i_8_;
                    class318_sub1_sub2_sub1.aByte6376 = (byte) i_3_;
                    if (NpcComposition.method802(i, i_2_, true)) class318_sub1_sub2_sub1.aByte6376++;
                    AbstractShaderSub2.method3536(i_3_, i_2_, i, i_8_, class318_sub1_sub2_sub1);
                }
            }
        }
    }
}
