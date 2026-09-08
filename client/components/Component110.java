/* Component110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component110
/**
 * RENAMED from `Class16` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt230;
    static Component3 aClass148_231;
    static int anInt232;
    static CacheStore aClass45_233;
    static int anInt234;

    static final void method258(int i, int i_0_) {
        Component186 class357 = Component335.aClass357ArrayArrayArray2029[0][i][i_0_];
        for (int i_1_ = 0; i_1_ < 3; i_1_++) {
            Component186 class357_2_ = (Component335.aClass357ArrayArrayArray2029[i_1_][i][i_0_] = Component335.aClass357ArrayArrayArray2029[i_1_ + 1][i][i_0_]);
            if (class357_2_ != null) {
                for (Component3 class148 = class357_2_.aClass148_4396; class148 != null; class148 = class148.aClass148_2038) {
                    Component327 class318_sub1_sub3 = class148.aClass318_Sub1_Sub3_2040;
                    if ((class318_sub1_sub3.aShort8743 == i) && (class318_sub1_sub3.aShort8750) == i_0_) class318_sub1_sub3.plane--;
                }
                if (class357_2_.aClass318_Sub1_Sub1_4402 != null) class357_2_.aClass318_Sub1_Sub1_4402.plane--;
                if (class357_2_.aClass318_Sub1_Sub4_4406 != null) class357_2_.aClass318_Sub1_Sub4_4406.plane--;
                if (class357_2_.aClass318_Sub1_Sub4_4403 != null) class357_2_.aClass318_Sub1_Sub4_4403.plane--;
                if (class357_2_.aClass318_Sub1_Sub5_4395 != null) class357_2_.aClass318_Sub1_Sub5_4395.plane--;
                if (class357_2_.aClass318_Sub1_Sub5_4407 != null) class357_2_.aClass318_Sub1_Sub5_4407.plane--;
            }
        }
        if (Component335.aClass357ArrayArrayArray2029[0][i][i_0_] == null) {
            Component335.aClass357ArrayArrayArray2029[0][i][i_0_] = new Component186(0);
            Component335.aClass357ArrayArrayArray2029[0][i][i_0_].aByte4399 = (byte) 1;
        }
        Component335.aClass357ArrayArrayArray2029[0][i][i_0_].aClass357_4400 = class357;
        Component335.aClass357ArrayArrayArray2029[3][i][i_0_] = null;
    }

    static final void method259(int i, int i_3_, boolean bool, String string, int i_4_) {
        anInt230++;
        DisplayModeManagerContainer109.method1356(false, null, i, i_4_, bool, string, true);
        int i_5_ = -1 / ((i_3_ - -33) / 63);
    }

    static final int method260(boolean bool) {
        if (bool != false) aClass45_233 = null;
        anInt232++;
        if (Buffer.anInt7207 == 1) return DefinitionSub8.anInt9157;
        return 0;
    }

    public static void method261(byte i) {
        aClass45_233 = null;
        aClass148_231 = null;
        if (i != -120) method262(-23);
    }

    static final void method262(int i) {
        anInt234++;
        if (i != 0) aClass148_231 = null;
        if (!Component214.aBoolean2130) {
            Component214.aBoolean2130 = true;
            Component275.cameraYawRate += (-Component275.cameraYawRate + -24.0F) / 2.0F;
            DummyClass.aBoolean10174 = true;
        }
    }
}
