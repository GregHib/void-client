/* Class298 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class298 {
    static int anInt3808;
    static Class114 aClass114_3809 = new Class114(44, 6);
    static int anInt3810;
    static boolean aBoolean3811 = false;

    static final int method2250(int i, int i_0_, int i_1_, int i_2_) {
        if (i_0_ < 36)
            aBoolean3811 = true;
        anInt3810++;
        int i_3_ = -i_1_ + 255;
        i_2_ = (~0xff00ff & (i_2_ & 0xff00ff) * i_1_
                | 0xff0000 & (0xff00 & i_2_) * i_1_) >>> -1350294936;
        return i_2_ + ((i_3_ * (i & 0xff00ff) & ~0xff00ff
                | i_3_ * (0xff00 & i) & 0xff0000)
                >>> 751176872);
    }

    public static void method2251(int i) {
        if (i != 16711680)
            aClass114_3809 = null;
        aClass114_3809 = null;
    }

    static final boolean method2252(boolean bool, int i, int i_4_, byte i_5_,
                                    int i_6_, int i_7_, int i_8_, int i_9_,
                                    int i_10_) {
        anInt3808++;
        int i_11_ = (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907
                .anIntArray10320[0]);
        int i_12_ = (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907
                .anIntArray10317[0]);
        if ((i_11_ ^ 0xffffffff) > -1
                || (Class367_Sub4.anInt7319 ^ 0xffffffff) >= (i_11_ ^ 0xffffffff)
                || (i_12_ ^ 0xffffffff) > -1
                || (i_12_ ^ 0xffffffff) <= (Class348_Sub40_Sub3.anInt9109
                ^ 0xffffffff))
            return false;
        if (i < 0 || i >= Class367_Sub4.anInt7319 || (i_4_ ^ 0xffffffff) > -1
                || (i_4_ ^ 0xffffffff) <= (Class348_Sub40_Sub3.anInt9109
                ^ 0xffffffff))
            return false;
        int i_13_
                = (Class59_Sub2_Sub2.method574
                (i,
                        Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907
                                .method2436((byte) 70),
                        i_6_, Class348_Sub40_Sub11.anIntArray9185, bool, (byte) 120,
                        i_9_, i_11_, i_12_, Class348_Sub42_Sub14.anIntArray9626, i_4_,
                        (Class348_Sub45.aClass361Array7108
                                [Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.aByte6381]),
                        i_8_, i_7_, i_10_));
        if ((i_13_ ^ 0xffffffff) > -2)
            return false;
        Class248.anInt3203 = Class348_Sub42_Sub14.anIntArray9626[-1 + i_13_];
        Class97.anInt1548 = Class348_Sub40_Sub11.anIntArray9185[-1 + i_13_];
        Class348_Sub13.aBoolean6759 = false;
        if (i_5_ > -83)
            aBoolean3811 = true;
        Class299_Sub1_Sub2.method2264(false);
        return true;
    }
}
