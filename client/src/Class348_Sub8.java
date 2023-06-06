/* Class348_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.applet.Applet;

final class Class348_Sub8 extends Class348 {
    static ha aHa6654;
    static int[] anIntArray6655;
    static boolean[][] aBooleanArrayArray6656;
    byte[] aByteArray6657;
    private static short[] aShortArray6658;
    static int anInt6659;
    static Class241 aClass241_6660;
    private static short[] aShortArray6661 = {967, 20428, -21577, 11219, -10290};
    static Applet anApplet6662;
    private static short[] aShortArray6663 = {957, 20418, -21587, 11209, -10300};
    static short[][] aShortArrayArray6664;
    private static short[] aShortArray6665;
    static int[] anIntArray6666;
    static int anInt6667;

    static final int method2774(byte i, Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3) {
        anInt6667++;
        if (i != 108) anApplet6662 = null;
        if (class318_sub1_sub3_sub3.anInt10310 == 0) return 0;
        if (class318_sub1_sub3_sub3.anInt10275 != -1) {
            Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3_0_ = null;
            if (class318_sub1_sub3_sub3.anInt10275 >= 32768) {
                if ((class318_sub1_sub3_sub3.anInt10275) >= 32768) class318_sub1_sub3_sub3_0_ = (Class294.aPlayerArray5058[class318_sub1_sub3_sub3.anInt10275 + -32768]);
            } else {
                Class348_Sub22 class348_sub22 = ((Class348_Sub22) (Class282.aClass356_3654.method3480(class318_sub1_sub3_sub3.anInt10275, -6008)));
                if (class348_sub22 != null) class318_sub1_sub3_sub3_0_ = (class348_sub22.aNpc_6859);
            }
            if (class318_sub1_sub3_sub3_0_ != null) {
                int i_1_ = (class318_sub1_sub3_sub3.x + -(class318_sub1_sub3_sub3_0_.x));
                int i_2_ = (class318_sub1_sub3_sub3.y + -(class318_sub1_sub3_sub3_0_.y));
                if (i_1_ != 0 || i_2_ != 0) class318_sub1_sub3_sub3.method2440((byte) 49, 0x3fff & (int) (Math.atan2(i_1_, i_2_) * 2607.5945876176133));
            }
        }
        if (class318_sub1_sub3_sub3 instanceof Player) {
            Player player = (Player) class318_sub1_sub3_sub3;
            if ((player.anInt10524) != -1 && ((player.anInt10319) == 0 || player.anInt10326 > 0)) {
                player.method2440((byte) 49, player.anInt10524);
                player.anInt10524 = -1;
            }
        } else if (class318_sub1_sub3_sub3 instanceof Npc) {
            Npc npc = (Npc) class318_sub1_sub3_sub3;
            if ((npc.anInt10499) != -1 && ((npc.anInt10319) == 0 || npc.anInt10326 > 0)) {
                int i_3_ = (-((-za_Sub2.regionTileX + npc.anInt10499 - za_Sub2.regionTileX) * 256) + (npc.x));
                int i_4_ = (npc.y - 256 * (npc.anInt10512 + (-Class90.regionTileY + -Class90.regionTileY)));
                if (i_3_ != 0 || i_4_ != 0) npc.method2440((byte) 49, 0x3fff & (int) (Math.atan2(i_3_, i_4_) * 2607.5945876176133));
                npc.anInt10499 = -1;
            }
        }
        return class318_sub1_sub3_sub3.method2428(i + -106);
    }

    public static void method2775(byte i) {
        aShortArray6658 = null;
        aHa6654 = null;
        aShortArray6665 = null;
        anIntArray6666 = null;
        aShortArray6663 = null;
        anIntArray6655 = null;
        if (i > -123) getWhereMode((byte) -65, -91);
        aClass241_6660 = null;
        aBooleanArrayArray6656 = null;
        anApplet6662 = null;
        aShortArrayArray6664 = null;
        aShortArray6661 = null;
    }

    Class348_Sub8(byte[] is) {
        this.aByteArray6657 = is;
    }

    static final WhereMode getWhereMode(byte i, int i_5_) {
        anInt6659++;
        if (i > -35) aBooleanArrayArray6656 = null;
        WhereMode[] whereModes = Class348_Sub40_Sub28.method3122((byte) 91);
        for (int i_6_ = 0; whereModes.length > i_6_; i_6_++) {
            WhereMode whereMode = whereModes[i_6_];
            if (whereMode.anInt4466 == i_5_) return whereMode;
        }
        return null;
    }

    static long method2777(long l, long l_7_) {
        try {
            return l & l_7_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, "gia.C(" + l + ',' + l_7_ + ')');
        }
    }

    static {
        aShortArray6658 = new short[]{952, 20413, -21592, 11204, -10305};
        aShortArray6665 = new short[]{962, 20423, -21582, 11214, -10295};
        aShortArrayArray6664 = new short[][]{aShortArray6661, aShortArray6665, aShortArray6663, aShortArray6658};
        anIntArray6666 = new int[3];
    }
}
