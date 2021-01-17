/* Class348_Sub46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub46 extends Class348 {
    static int anInt7109;
    static int anInt7110;
    String aString7111;
    static int anInt7112;
    static Class114 aClass114_7113 = new Class114(97, 0);
    static int anInt7114;
    static int anInt7115 = 1;

    static final void method3317(byte i) {
        if (Class299_Sub1.aFileOutputStream6323 != null) {
            try {
                Class299_Sub1.aFileOutputStream6323.close();
            } catch (java.io.IOException ioexception) {
                /* empty */
            }
        }
        if (i > -33) method3321(-73, 3, 6);
        anInt7110++;
        Class299_Sub1.aFileOutputStream6323 = null;
    }

    public static void method3318(byte i) {
        if (i != -80) method3322(-26, null);
        aClass114_7113 = null;
    }

    static final void method3319(ha var_ha, byte i) {
        if (i > -108) method3321(19, 60, 108);
        anInt7114++;
        if (((Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.aByte6381) != Class334.anInt4155) && Class147.aClass357ArrayArrayArray2029 != null) {
            if (Class348_Sub14.method2808((Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.aByte6381), var_ha, true)) Class334.anInt4155 = Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.aByte6381;
        }
    }

    static final void method3320(Class318_Sub1_Sub3 class318_sub1_sub3, boolean bool) {
        for (int i = class318_sub1_sub3.aShort8743; i <= class318_sub1_sub3.aShort8751; i++) {
            for (int i_0_ = class318_sub1_sub3.aShort8750; i_0_ <= class318_sub1_sub3.aShort8747; i_0_++) {
                Class357 class357 = (Class147.aClass357ArrayArrayArray2029[class318_sub1_sub3.aByte6381][i][i_0_]);
                if (class357 != null) {
                    Class148 class148 = class357.aClass148_4396;
                    Class148 class148_1_ = null;
                    for (/**/; class148 != null; class148 = class148.aClass148_2038) {
                        if (class148.aClass318_Sub1_Sub3_2040 == class318_sub1_sub3) {
                            if (class148_1_ != null) class148_1_.aClass148_2038 = class148.aClass148_2038;
                            else class357.aClass148_4396 = class148.aClass148_2038;
                            class148.method1199((byte) -106);
                            break;
                        }
                        class148_1_ = class148;
                    }
                }
            }
        }
        if (!bool) Class183.method1376(class318_sub1_sub3);
    }

    static final Class357 method3321(int i, int i_2_, int i_3_) {
        if (Class147.aClass357ArrayArrayArray2029[i][i_2_][i_3_] == null) {
            boolean bool = (Class147.aClass357ArrayArrayArray2029[0][i_2_][i_3_] != null && Class147.aClass357ArrayArrayArray2029[0][i_2_][i_3_].aClass357_4400 != null);
            if (bool && i >= Class189.anInt2524 - 1) return null;
            Class185.method1394(i, i_2_, i_3_);
        }
        return Class147.aClass357ArrayArrayArray2029[i][i_2_][i_3_];
    }

    static final Class369_Sub3 method3322(int i, Class348_Sub49 class348_sub49) {
        anInt7109++;
        Class369 class369 = Class348_Sub16_Sub2.method2834((byte) -125, class348_sub49);
        int i_4_ = class348_sub49.readShort(i ^ 0x3235f8f8);
        int i_5_ = class348_sub49.readShort(842397944);
        if (i != 0) aClass114_7113 = null;
        int i_6_ = class348_sub49.readShort(842397944);
        int i_7_ = class348_sub49.readShort(i + 842397944);
        int i_8_ = class348_sub49.readShort(842397944);
        int i_9_ = class348_sub49.readShort(842397944);
        return new Class369_Sub3(class369.aClass221_4968, class369.aClass341_4973, class369.anInt4970, class369.anInt4959, class369.anInt4971, class369.anInt4963, class369.anInt4966, class369.anInt4965, class369.anInt4961, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_);
    }

    public Class348_Sub46() {
        /* empty */
    }

    Class348_Sub46(String string, int i) {
        this.aString7111 = string;
    }
}
