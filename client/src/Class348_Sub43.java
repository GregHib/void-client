/* Class348_Sub43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub43 extends Class348 {
    static Class348_Sub16_Sub4 aClass348_Sub16_Sub4_7065;
    int anInt7066;
    int anInt7067;
    static int anInt7068;
    int anInt7069;
    int anInt7070;
    int anInt7071;
    int anInt7072;
    static int anInt7073;
    int anInt7074;
    Class23 aClass23_7075;
    int anInt7076;
    Class348_Sub19_Sub1 aClass348_Sub19_Sub1_7077;
    static int anInt7078;
    static int[][][] anIntArrayArrayArray7079 = new int[2][][];
    int anInt7080;
    Class348_Sub16_Sub5 aClass348_Sub16_Sub5_7081;
    int anInt7082;
    int anInt7083;
    int anInt7084;
    Class348_Sub17 aClass348_Sub17_7085;
    int anInt7086;
    int anInt7087;
    int anInt7088;
    int anInt7089;
    int anInt7090;

    static final void method3298(byte i, boolean bool, Player player) {
        anInt7073++;
        if (Class73.anInt4776 < 400) {
            if (Class132.aPlayer_1907 == player) {
                if (r.aBoolean9722 && (Class38.anInt500 & 0x10) != 0) {
                    Class32.anInt450++;
                    Class50_Sub3.method466(false, (Class28.aString5000 + " -> <col=ffffff>" + Class274.aClass274_3520.method2063(Class348_Sub33.anInt6967, 544)), 0, (byte) -109, false, 0, -1, true, 50, player.anInt10290, Class28.aString5001, 0L, Class348_Sub49_Sub1.anInt9747);
                }
            } else {
                String string;
                if (player.anInt10564 == 0) {
                    boolean bool_0_ = true;
                    if ((Class132.aPlayer_1907.anInt10561) != -1 && player.anInt10561 != -1) {
                        int i_1_ = (Math.max(player.anInt10516, (Class132.aPlayer_1907.anInt10516)));
                        int i_2_ = (Math.min((Class132.aPlayer_1907.anInt10561), player.anInt10561));
                        int i_3_ = 5 - (-(10 * i_1_ / 100) + -i_2_);
                        int i_4_ = (-player.anInt10516 + (Class132.aPlayer_1907.anInt10516));
                        if (i_4_ < 0) i_4_ = -i_4_;
                        if (i_3_ < i_4_) bool_0_ = false;
                    }
                    String string_5_ = ((Class14_Sub4.aClass230_8638 == Class348_Sub42_Sub8_Sub2.aClass230_10434) ? Class274.aClass274_3513.method2063(Class348_Sub33.anInt6967, 544) : Class274.aClass274_3511.method2063(Class348_Sub33.anInt6967, 544));
                    if (player.anInt10516 >= player.anInt10557)
                        string = (player.method2456(true, 255) + (!bool_0_ ? "<col=ffffff>" : (Class14_Sub4.method250((Class132.aPlayer_1907.anInt10516), true, (player.anInt10516)))) + " (" + string_5_ + player.anInt10516 + ")");
                    else
                        string = (player.method2456(true, 255) + (bool_0_ ? (Class14_Sub4.method250((Class132.aPlayer_1907.anInt10516), true, (player.anInt10516))) : "<col=ffffff>") + " (" + string_5_ + player.anInt10516 + "+" + (-player.anInt10516 + player.anInt10557) + ")");
                } else if (player.anInt10564 == -1) string = player.method2456(true, 255);
                else string = (player.method2456(true, 255) + " (" + Class274.aClass274_3512.method2063(Class348_Sub33.anInt6967, 544) + player.anInt10564 + ")");
                if (r.aBoolean9722 && !bool && (0x8 & Class38.anInt500) != 0) {
                    Class50_Sub3.method466(false, Class28.aString5000 + " -> <col=ffffff>" + string, 0, (byte) -109, false, 0, -1, true, 51, player.anInt10290, Class28.aString5001, player.anInt10290, Class348_Sub49_Sub1.anInt9747);
                    Class341.anInt4228++;
                }
                if (i <= 89) anInt7068 = -113;
                if (bool) Class50_Sub3.method466(true, "", 0, (byte) -115, false, 0, 0, false, -1, player.anInt10290, "<col=cccccc>" + string, 0L, -1);
                else {
                    for (int i_6_ = 7; i_6_ >= 0; i_6_--) {
                        if (Class318_Sub1_Sub2_Sub1.aStringArray10195[i_6_] != null) {
                            short i_7_ = 0;
                            if ((Class348_Sub42_Sub8_Sub2.aClass230_10434 != Class10.aClass230_186) || !(Class318_Sub1_Sub2_Sub1.aStringArray10195[i_6_].equalsIgnoreCase(Class274.aClass274_3506.method2063(Class348_Sub33.anInt6967, 544)))) {
                                if (Class71.aBooleanArray1214[i_6_]) i_7_ = (short) 2000;
                            } else {
                                if ((Class132.aPlayer_1907.anInt10516) < (player.anInt10516)) i_7_ = (short) 2000;
                                if ((Class132.aPlayer_1907.anInt10542) != 0 && (player.anInt10542) != 0) {
                                    if ((player.anInt10542) != (Class132.aPlayer_1907.anInt10542)) i_7_ = (short) 0;
                                    else i_7_ = (short) 2000;
                                }
                            }
                            System.out.println("Option " + Class318_Sub1_Sub2_Sub1.aStringArray10195[i_6_] + " op:" + Class348_Sub49_Sub2.aShortArray9768[i_6_]);
                            short i_8_ = (short) (i_7_ + (Class348_Sub49_Sub2.aShortArray9768[i_6_]));
                            int i_9_ = (Canvas_Sub1.anIntArray60[i_6_] == -1 ? Class38.anInt506 : Canvas_Sub1.anIntArray60[i_6_]);
                            Class50_Sub3.method466(false, "<col=ffffff>" + string, 0, (byte) -105, false, 0, -1, true, i_8_, player.anInt10290, (Class318_Sub1_Sub2_Sub1.aStringArray10195[i_6_]), player.anInt10290, i_9_);
                            Canvas_Sub1.anInt69++;
                        }
                    }
                }
                if (!bool) {
                    for (Class348_Sub42_Sub12 class348_sub42_sub12 = (Class348_Sub42_Sub12) Class348_Sub40_Sub4.aClass262_9111.method1995(4); class348_sub42_sub12 != null; class348_sub42_sub12 = ((Class348_Sub42_Sub12) Class348_Sub40_Sub4.aClass262_9111.method1990((byte) 105))) {
                        if ((class348_sub42_sub12.anInt9608) == 19) {
                            class348_sub42_sub12.aString9595 = "<col=ffffff>" + string;
                            break;
                        }
                    }
                }
            }
        }
    }

    final void method3299(byte i) {
        anInt7078++;
        this.aClass348_Sub16_Sub5_7081 = null;
        this.aClass348_Sub19_Sub1_7077 = null;
        int i_10_ = 71 / ((i - -26) / 58);
        this.aClass23_7075 = null;
        this.aClass348_Sub17_7085 = null;
    }

    public static void method3300(int i) {
        anIntArrayArrayArray7079 = null;
        aClass348_Sub16_Sub4_7065 = null;
        if (i != 0) method3300(-61);
    }

    static {
        anInt7068 = 0;
    }
}
