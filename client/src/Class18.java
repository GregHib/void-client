/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class18 {
    static int anInt270;
    static int anInt271;
    static int anInt272;
    static int anInt273;
    static int anInt274;
    private int anInt275 = 1;
    private int anInt276 = 0;
    static int anInt277;
    static int anInt278;
    static int[] anIntArray279 = new int[2048];
    static int anInt280;
    private Class206 aClass206_281;
    static int anInt282;
    static int anInt283;
    private Class206 aClass206_284;
    private Class206 aClass206_285;
    private int anInt286;
    private int anInt287 = 0;
    static int anInt288;
    private boolean aBoolean289;
    private final ha_Sub2 aHa_Sub2_290;
    static int anInt291;
    private final Class262 aClass262_292;
    private boolean aBoolean293;
    private boolean aBoolean294;
    private Class258_Sub3[] aClass258_Sub3Array295;
    private Class348_Sub42_Sub2 aClass348_Sub42_Sub2_296;
    private boolean aBoolean297;
    private Class348_Sub42_Sub2 aClass348_Sub42_Sub2_298;
    private boolean aBoolean299;
    private Class258_Sub3 aClass258_Sub3_300;
    private int anInt301;
    private int anInt302;
    private boolean aBoolean303;

    static final void method271(int i, Class46 class46, byte i_0_, int i_1_) {
        anInt278++;
        aa var_aa = class46.method425(Class348_Sub8.aHa6654, (byte) 19);
        if (var_aa != null) {
            Class348_Sub8.aHa6654.KA(i_1_, i, class46.anInt709 + i_1_, i - -class46.anInt789);
            if (Class259.anInt3306 >= 3) Class348_Sub8.aHa6654.A(-16777216, var_aa, i_1_, i);
            else Class79.aClass105_1365.method976(((float) class46.anInt709 / 2.0F + (float) i_1_), (float) i + (float) class46.anInt789 / 2.0F, 4096, (0x3fff & (int) -Class314.aFloat3938) << -1614383390, var_aa, i_1_, i);
            if (i_0_ != -98) method271(88, null, (byte) 15, 71);
        }
    }

    final void method272(int i) {
        anInt277++;
        if (aBoolean289) {
            if (aClass206_285 != null) {
                aHa_Sub2_290.method3764(-17083, aClass206_285);
                int i_2_ = 16384;
                aHa_Sub2_290.method3751(aClass206_281, -115);
                aClass206_285.method1505(0, 0);
                aClass206_281.method1503(0, (byte) 3);
                if (aBoolean303) i_2_ |= 0x100;
                OpenGL.glBlitFramebufferEXT(0, 0, anInt286, anInt275, 0, 0, anInt286, anInt275, i_2_, 9728);
                aHa_Sub2_290.method3805(8387, aClass206_285);
                aHa_Sub2_290.method3782(aClass206_281, 327685);
            }
            aHa_Sub2_290.method3792(92);
            aHa_Sub2_290.method3753(0, 1);
            aHa_Sub2_290.method3761(0, 1);
            int i_3_ = 19 % ((i - 12) / 49);
            aHa_Sub2_290.la();
            int i_4_ = 0;
            int i_5_ = 1;
            Class348_Sub5 class348_sub5;
            for (Class348_Sub5 class348_sub5_6_ = (Class348_Sub5) aClass262_292.method1995(4); class348_sub5_6_ != null; class348_sub5_6_ = class348_sub5) {
                class348_sub5 = (Class348_Sub5) aClass262_292.method1990((byte) 113);
                int i_7_ = class348_sub5_6_.method2764(1);
                for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
                    class348_sub5_6_.method2750(aClass258_Sub3_300, aClass258_Sub3Array295[i_4_], i_8_, (byte) 103);
                    if (class348_sub5 == null && i_8_ == i_7_ - 1) {
                        aHa_Sub2_290.method3770(-422613672, aClass206_281);
                        aHa_Sub2_290.method3790(103, 0, 0);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, (float) anInt275);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                        OpenGL.glVertex2i(anInt287, anInt276);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                        OpenGL.glVertex2i(anInt287, anInt276 - -anInt275);
                        OpenGL.glTexCoord2f((float) anInt286, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                        OpenGL.glVertex2i(anInt287 - -anInt286, anInt276 + anInt275);
                        OpenGL.glTexCoord2f((float) anInt286, (float) anInt275);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                        OpenGL.glVertex2i(anInt286 + anInt287, anInt276);
                        OpenGL.glEnd();
                    } else {
                        aClass206_281.method1503(i_5_, (byte) 3);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, (float) anInt275);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                        OpenGL.glVertex2i(0, 0);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                        OpenGL.glVertex2i(0, anInt275);
                        OpenGL.glTexCoord2f((float) anInt286, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                        OpenGL.glVertex2i(anInt286, anInt275);
                        OpenGL.glTexCoord2f((float) anInt286, (float) anInt275);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                        OpenGL.glVertex2i(anInt286, 0);
                        OpenGL.glEnd();
                    }
                    class348_sub5_6_.method2756((byte) -80, i_8_);
                    i_4_ = i_4_ + 1 & 0x1;
                    i_5_ = i_5_ - -1 & 0x1;
                }
            }
            aBoolean289 = false;
        }
    }

    static final void method273(Class46 class46, int i) {
        anInt288++;
        if (class46.anInt774 == 5 && class46.anInt812 != -1) Class318_Sub1.method2383(Class348_Sub8.aHa6654, -2, class46);
        if (i != -2835) method273(null, 44);
    }

    final boolean method274(Class348_Sub5 class348_sub5, boolean bool) {
        anInt273++;
        if (aClass206_284 != null) {
            if (class348_sub5.method2751(bool) || class348_sub5.method2758(85)) {
                aClass262_292.method1999(class348_sub5, -20180);
                method281((byte) -94);
                if (method276(false)) {
                    if (anInt286 != -1 && anInt275 != -1) class348_sub5.method2754(anInt275, (byte) 55, anInt286);
                    class348_sub5.aBoolean6621 = true;
                    return true;
                }
            }
            method278(class348_sub5, true);
        }
        if (bool != true) return false;
        return false;
    }

    final boolean method275(int i, int i_9_, int i_10_, int i_11_, int i_12_) {
        if (i_12_ != -1) return true;
        anInt272++;
        if (aClass206_284 == null || aClass262_292.method2002((byte) 18)) return false;
        if (anInt286 != i || i_10_ != anInt275) {
            anInt286 = i;
            anInt275 = i_10_;
            for (Class348 class348 = aClass262_292.method1995(i_12_ ^ ~0x4); aClass262_292.aClass348_3334 != class348; class348 = class348.aClass348_4294)
                ((Class348_Sub5) class348).method2754(anInt275, (byte) 41, anInt286);
            aBoolean297 = true;
            aBoolean293 = true;
            aBoolean294 = true;
        }
        if (method276(false)) {
            aBoolean289 = true;
            anInt276 = i_11_;
            anInt287 = i_9_;
            aHa_Sub2_290.method3773(i_12_, aClass206_284);
            aClass206_284.method1503(0, (byte) 3);
            aHa_Sub2_290.method3790(98, (-aHa_Sub2_290.anInt7641 + (anInt275 - -anInt276)), -anInt287);
            return true;
        }
        return false;
    }

    private final boolean method276(boolean bool) {
        if (aBoolean293) {
            if (aClass348_Sub42_Sub2_298 != null) {
                aClass348_Sub42_Sub2_298.method3172(4);
                aClass348_Sub42_Sub2_298 = null;
            }
            if (aClass258_Sub3_300 != null) {
                aClass258_Sub3_300.method1952(-19948);
                aClass258_Sub3_300 = null;
            }
            if (aClass206_285 != null) aClass348_Sub42_Sub2_298 = new Class348_Sub42_Sub2(aHa_Sub2_290, 6402, anInt286, anInt275, (aHa_Sub2_290.anInt7713));
            if (aBoolean303) aClass258_Sub3_300 = new Class258_Sub3(aHa_Sub2_290, 34037, 6402, anInt286, anInt275);
            else if (aClass348_Sub42_Sub2_298 == null) aClass348_Sub42_Sub2_298 = new Class348_Sub42_Sub2(aHa_Sub2_290, 6402, anInt286, anInt275);
            aBoolean293 = false;
            aBoolean294 = true;
            aBoolean299 = true;
        }
        anInt271++;
        if (aBoolean297) {
            if (aClass348_Sub42_Sub2_296 != null) {
                aClass348_Sub42_Sub2_296.method3172(4);
                aClass348_Sub42_Sub2_296 = null;
            }
            if (aClass258_Sub3Array295[0] != null) {
                aClass258_Sub3Array295[0].method1952(-19948);
                aClass258_Sub3Array295[0] = null;
            }
            if (aClass258_Sub3Array295[1] != null) {
                aClass258_Sub3Array295[1].method1952(-19948);
                aClass258_Sub3Array295[1] = null;
            }
            if (aClass206_285 != null) aClass348_Sub42_Sub2_296 = new Class348_Sub42_Sub2(aHa_Sub2_290, anInt301, anInt286, anInt275, (aHa_Sub2_290.anInt7713));
            aClass258_Sub3Array295[0] = new Class258_Sub3(aHa_Sub2_290, 34037, anInt301, anInt286, anInt275);
            aClass258_Sub3Array295[1] = anInt302 > 1 ? new Class258_Sub3(aHa_Sub2_290, 34037, anInt301, anInt286, anInt275) : null;
            aBoolean294 = true;
            aBoolean299 = true;
            aBoolean297 = false;
        }
        if (bool != false) anInt282 = -21;
        if (aBoolean294) {
            if (aClass206_285 == null) {
                aHa_Sub2_290.method3773(-1, aClass206_281);
                aClass206_281.method1500(2983, 0);
                aClass206_281.method1500(2983, 1);
                aClass206_281.method1500(2983, 8);
                aClass206_281.method1509(aClass258_Sub3Array295[0], 0, 0);
                if (anInt302 > 1) aClass206_281.method1509(aClass258_Sub3Array295[1], 0, 1);
                if (aBoolean303) aClass206_281.method1509(aClass258_Sub3_300, 0, 8);
                else aClass206_281.method1508(8, aClass348_Sub42_Sub2_298, 114);
                aHa_Sub2_290.method3770(-422613672, aClass206_281);
            } else {
                aHa_Sub2_290.method3773(-1, aClass206_281);
                aClass206_281.method1500(2983, 0);
                aClass206_281.method1500(2983, 1);
                aClass206_281.method1500(2983, 8);
                aClass206_281.method1509(aClass258_Sub3Array295[0], 0, 0);
                if (anInt302 > 1) aClass206_281.method1509(aClass258_Sub3Array295[1], 0, 1);
                if (aBoolean303) aClass206_281.method1509(aClass258_Sub3_300, 0, 8);
                aHa_Sub2_290.method3770(-422613672, aClass206_281);
                aHa_Sub2_290.method3773(-1, aClass206_285);
                aClass206_285.method1500(2983, 0);
                aClass206_285.method1500(2983, 8);
                aClass206_285.method1508(0, aClass348_Sub42_Sub2_296, -100);
                aClass206_285.method1508(8, aClass348_Sub42_Sub2_298, -47);
                aHa_Sub2_290.method3770(-422613672, aClass206_285);
            }
            aBoolean294 = false;
            aBoolean299 = true;
        }
        if (aBoolean299) {
            aHa_Sub2_290.method3773(-1, aClass206_284);
            aBoolean299 = !aClass206_284.method1507(118);
            aHa_Sub2_290.method3770(-422613672, aClass206_284);
        }
        return !aBoolean299;
    }

    public static void method277(byte i) {
        if (i >= 77) anIntArray279 = null;
    }

    final void method278(Class348_Sub5 class348_sub5, boolean bool) {
        anInt280++;
        if (bool == true) {
            class348_sub5.aBoolean6621 = false;
            class348_sub5.method2763((byte) -126);
            class348_sub5.method2715((byte) 103);
            method281((byte) -80);
        }
    }

    final void method279(byte i) {
        int i_13_ = 84 % ((-63 - i) / 56);
        aClass348_Sub42_Sub2_296 = null;
        anInt291++;
        aClass206_284 = aClass206_285 = aClass206_281 = null;
        aClass258_Sub3_300 = null;
        aClass348_Sub42_Sub2_298 = null;
        aClass258_Sub3Array295 = null;
        if (!aClass262_292.method2002((byte) 18)) {
            for (Class348 class348 = aClass262_292.method1995(4); aClass262_292.aClass348_3334 != class348; class348 = class348.aClass348_4294)
                ((Class348_Sub5) class348).method2763((byte) -124);
        }
        anInt286 = anInt275 = 1;
    }

    final boolean method280(int i) {
        anInt270++;
        if (i != 1) anInt286 = -99;
        return aClass206_284 != null;
    }

    private final void method281(byte i) {
        anInt283++;
        boolean bool = false;
        int i_14_ = 0;
        int i_15_ = 0;
        Class348_Sub5 class348_sub5 = (Class348_Sub5) aClass262_292.method1995(4);
        int i_16_ = 50 / ((-34 - i) / 45);
        for (/**/; class348_sub5 != null; class348_sub5 = (Class348_Sub5) aClass262_292.method1990((byte) 67)) {
            int i_17_ = class348_sub5.method2761(true);
            i_15_ += class348_sub5.method2764(1);
            if (i_14_ < i_17_) i_14_ = i_17_;
            bool |= class348_sub5.method2759(1);
        }
        int i_18_;
        if (i_14_ != 2) {
            if (i_14_ == 1) i_18_ = 34842;
            else i_18_ = 6408;
        } else i_18_ = 34836;
        if (anInt301 != i_18_) {
            aBoolean297 = true;
            anInt301 = i_18_;
        }
        int i_19_ = Math.min(anInt302, 2);
        int i_20_ = Math.min(i_15_, 2);
        anInt302 = i_15_;
        if (!bool == aBoolean303) {
            aBoolean303 = bool;
            aBoolean293 = true;
        }
        if (i_20_ != i_19_) aBoolean294 = aBoolean297 = true;
    }

    static final void method282(int i, ha var_ha, int i_21_, byte i_22_, int i_23_, int i_24_, int i_25_, int i_26_) {
        anInt274++;
        Class21.aHa326 = var_ha;
        Class51.aClass101_905 = Class21.aHa326.method3654();
        Class44.aClass101_624 = Class21.aHa326.method3654();
        r.aClass101_9720 = Class21.aHa326.method3654();
        Class73.anInt4784 = i_26_;
        Class239_Sub24.anInt6095 = 0;
        if (i_22_ <= 64) anIntArray279 = null;
        Class344.anInt4267 = i_23_;
        Class286.anInt3682 = 0;
        Class58.anInt1067 = i_24_;
        Class17.anInterface4_252 = null;
        Class348_Sub49.anInt7207 = 1;
        Class239_Sub12.anInt5965 = i;
        Class85.method828((byte) 38, i_25_, i_21_);
    }

    Class18(ha_Sub2 var_ha_Sub2) {
        anInt286 = 1;
        aClass262_292 = new Class262();
        aBoolean293 = true;
        aClass258_Sub3Array295 = new Class258_Sub3[2];
        aBoolean297 = true;
        aBoolean294 = true;
        aBoolean299 = true;
        anInt302 = 0;
        anInt301 = -1;
        aBoolean303 = false;
        aHa_Sub2_290 = var_ha_Sub2;
        if (aHa_Sub2_290.aBoolean7820 && aHa_Sub2_290.aBoolean7837) {
            aClass206_284 = aClass206_281 = new Class206(aHa_Sub2_290);
            if (aHa_Sub2_290.anInt7713 > 1 && aHa_Sub2_290.aBoolean7815 && aHa_Sub2_290.aBoolean7807) aClass206_284 = aClass206_285 = new Class206(aHa_Sub2_290);
        }
    }
}
