/* Class5_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class5_Sub3 extends Class5 {
    private Class105 aClass105_8366;
    static int anInt8367;
    static int anInt8368;
    static int anInt8369;
    static int anInt8370;
    static int anInt8371;
    static int anInt8372;
    static int anInt8373;
    static int anInt8374;
    static int anInt8375;
    static int anInt8376;
    static int anInt8377;

    final void method178(int i, boolean bool, byte i_0_, int i_1_) {
        if (i_0_ >= -6) method202(-4, null);
        anInt8376++;
        Class348_Sub8.aHa6654.method3628(-2 + i, i_1_, 4 + this.aClass369_4635.anInt4971, this.aClass369_4635.anInt4963 + 2, (((Class369_Sub1) this.aClass369_4635).anInt8580), 0);
        Class348_Sub8.aHa6654.method3628(i + -1, i_1_ + 1, this.aClass369_4635.anInt4971 + 2, this.aClass369_4635.anInt4963, 0, 0);
    }

    static final Class348_Sub21 method199(int i) {
        anInt8369++;
        if (Class75.aClass262_1254 == null || r.aClass312_9716 == null) return null;
        r.aClass312_9716.method2328(Class75.aClass262_1254, 75);
        Class348_Sub21 class348_sub21 = (Class348_Sub21) r.aClass312_9716.method2327((byte) -53);
        if (class348_sub21 == null) return null;
        Class42 class42 = Class75.aClass153_1238.method1225(class348_sub21.anInt6847, (byte) 50);
        if (i != 1) anInt8370 = -75;
        if (class42 != null && class42.aBoolean609 && class42.method373(Class75.anInterface17_1244, 98)) return class348_sub21;
        return Class356.method3479(-1);
    }

    public final boolean method8(byte i) {
        int i_2_ = 2 % ((25 - i) / 52);
        anInt8373++;
        if (!super.method8((byte) 82)) return false;
        return this.aClass45_4632.method421(false, (((Class369_Sub1) this.aClass369_4635).anInt8582));
    }

    static final int method200(int i, int i_3_) {
        if (i >= -75) return -109;
        anInt8377++;
        return i_3_ >>> 8;
    }

    Class5_Sub3(Class45 class45, Class45 class45_4_, Class369_Sub1 class369_sub1) {
        super(class45, class45_4_, class369_sub1);
    }

    static final void method201(int i, int i_5_, String string) {
        do {
            try {
                anInt8372++;
                int i_6_ = Class328_Sub1.anInt6513;
                int[] is = Class286_Sub7.anIntArray6290;
                if (i_5_ == -7257) {
                    boolean bool = false;
                    for (int i_7_ = 0; i_6_ > i_7_; i_7_++) {
                        Player player = (Class294.aPlayerArray5058[is[i_7_]]);
                        if (player != null && (Class132.aPlayer_1907 != player) && (player.username != null) && player.username.equalsIgnoreCase(string)) {
                            bool = true;
                            if (i == 1) {
                                Class127.anInt4657++;
                                Class348_Sub47 class348_sub47 = (Class286_Sub3.method2148(Class239_Sub9.aClass351_5929, Class348_Sub23_Sub2.aClass77_9029, i_5_ + 7158));
                                class348_sub47.aClass348_Sub49_Sub2_7116.writeShortAddLittle(4325, is[i_7_]);
                                class348_sub47.aClass348_Sub49_Sub2_7116.writeByteInverse((byte) -75, 0);
                                Class348_Sub42_Sub14.writePacket(i_5_ ^ 0x1c2a, class348_sub47);
                            } else if (i == 4) {
                                Class318_Sub1_Sub4_Sub1.anInt10073++;
                                Class348_Sub47 class348_sub47 = (Class286_Sub3.method2148(Class52.aClass351_4905, Class348_Sub23_Sub2.aClass77_9029, -88));
                                class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, is[i_7_]);
                                class348_sub47.aClass348_Sub49_Sub2_7116.writeByteAdd((byte) -128, 0);
                                Class348_Sub42_Sub14.writePacket(126, class348_sub47);
                            } else if (i == 5) {
                                Class216.anInt4979++;
                                Class348_Sub47 class348_sub47 = (Class286_Sub3.method2148(Class348_Sub42_Sub18.aClass351_9684, Class348_Sub23_Sub2.aClass77_9029, -83));
                                class348_sub47.aClass348_Sub49_Sub2_7116.writeShortAdd(81, is[i_7_]);
                                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
                                Class348_Sub42_Sub14.writePacket(-112, class348_sub47);
                            } else if (i == 6) {
                                Class296.anInt3768++;
                                Class348_Sub47 class348_sub47 = (Class286_Sub3.method2148(Class251.aClass351_3232, Class348_Sub23_Sub2.aClass77_9029, -83));
                                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
                                class348_sub47.aClass348_Sub49_Sub2_7116.writeShortAdd(-119, is[i_7_]);
                                Class348_Sub42_Sub14.writePacket(i_5_ + 7281, class348_sub47);
                            } else if (i == 7) {
                                Class369_Sub2.anInt8588++;
                                Class348_Sub47 class348_sub47 = (Class286_Sub3.method2148(Class348_Sub42_Sub5.aClass351_9533, Class348_Sub23_Sub2.aClass77_9029, -116));
                                class348_sub47.aClass348_Sub49_Sub2_7116.writeShortAdd(i_5_ ^ 0x1c2c, is[i_7_]);
                                class348_sub47.aClass348_Sub49_Sub2_7116.writeByteAdd((byte) 92, 0);
                                Class348_Sub42_Sub14.writePacket(127, class348_sub47);
                            }
                            break;
                        }
                    }
                    if (bool) break;
                    Class59.method544(((Class274.aClass274_3504.method2063(Class348_Sub33.anInt6967, 544)) + string), false, 4);
                }
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("tq.A(" + i + ',' + i_5_ + ',' + (string != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    public final void method7(int i) {
        anInt8371++;
        if (i == 10286) {
            super.method7(i);
            aClass105_8366 = Class369_Sub3_Sub1.method3577(((Class369_Sub1) this.aClass369_4635).anInt8582, (byte) -96, this.aClass45_4632);
        }
    }

    final void method182(int i, int i_8_, int i_9_, boolean bool) {
        anInt8367++;
        int i_10_ = (this.method183(48) * this.aClass369_4635.anInt4971 / 10000);
        int[] is = new int[4];
        int i_11_ = -50 % ((-20 - i) / 57);
        Class348_Sub8.aHa6654.K(is);
        Class348_Sub8.aHa6654.KA(i_9_, 2 + i_8_, i_9_ - -i_10_, i_8_ - -(this.aClass369_4635.anInt4963));
        aClass105_8366.method972(i_9_, 2 + i_8_, (this.aClass369_4635.anInt4971), (this.aClass369_4635.anInt4963));
        Class348_Sub8.aHa6654.KA(is[0], is[1], is[2], is[3]);
    }

    static final void method202(int i, Class348_Sub42_Sub12 class348_sub42_sub12) {
        do {
            try {
                anInt8375++;
                if (i == 6 && !Class5_Sub1.aBoolean8335) {
                    class348_sub42_sub12.method2715((byte) 111);
                    Class73.anInt4776--;
                    if (class348_sub42_sub12.aBoolean9611) {
                        for (Class348_Sub42_Sub13 class348_sub42_sub13 = ((Class348_Sub42_Sub13) Class233.aClass107_3022.method1011(-99)); class348_sub42_sub13 != null; class348_sub42_sub13 = ((Class348_Sub42_Sub13) Class233.aClass107_3022.method1003((byte) 110))) {
                            if (class348_sub42_sub13.aString9617.equals(class348_sub42_sub12.aString9601)) {
                                boolean bool = false;
                                for (Class348_Sub42_Sub12 class348_sub42_sub12_12_ = ((Class348_Sub42_Sub12) class348_sub42_sub13.aClass107_9621.method1011(-58)); class348_sub42_sub12_12_ != null; class348_sub42_sub12_12_ = ((Class348_Sub42_Sub12) class348_sub42_sub13.aClass107_9621.method1003((byte) 112))) {
                                    if (class348_sub42_sub12 == class348_sub42_sub12_12_) {
                                        if (class348_sub42_sub13.method3234((byte) -123, class348_sub42_sub12)) Class242.method1868((byte) -98, class348_sub42_sub13);
                                        bool = true;
                                        break;
                                    }
                                }
                                if (bool) break;
                            }
                        }
                    } else {
                        long l = (class348_sub42_sub12.aLong9600);
                        Class348_Sub42_Sub13 class348_sub42_sub13;
                        for (class348_sub42_sub13 = ((Class348_Sub42_Sub13) Class348_Sub42_Sub12.aClass356_9603.method3480(l, -6008)); class348_sub42_sub13 != null; class348_sub42_sub13 = ((Class348_Sub42_Sub13) Class348_Sub42_Sub12.aClass356_9603.method3476(true))) {
                            if (class348_sub42_sub13.aString9617.equals(class348_sub42_sub12.aString9601)) break;
                        }
                        if (class348_sub42_sub13 == null || !(class348_sub42_sub13.method3234((byte) 15, class348_sub42_sub12))) break;
                        Class242.method1868((byte) 120, class348_sub42_sub13);
                    }
                }
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("tq.I(" + i + ',' + ((class348_sub42_sub12 != null) ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }
}
