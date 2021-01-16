/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class49 implements Interface4 {
    float[] aFloatArray4719;
    static float aFloat4720;
    static int anInt4721;
    int anInt4722;
    static int anInt4723;
    private Class216 aClass216_4724;
    int anInt4725;
    static volatile boolean aBoolean4726 = true;
    static int anInt4727;
    static boolean aBoolean4728 = false;
    private final ha_Sub1 aHa_Sub1_4729;
    static Class46 aClass46_4730 = null;
    int[] anIntArray4731;

    public static void method453(int i) {
        if (i == -2001) aClass46_4730 = null;
    }

    static final int method454(int i, byte i_0_) {
        int i_1_ = 20 / ((i_0_ - -4) / 37);
        anInt4727++;
        int i_2_;
        if (i > 12000) {
            Class133.method1140(73);
            i_2_ = 4;
        } else if (i > 5000) {
            Class47.method447((byte) -59);
            i_2_ = 3;
        } else if (i <= 2000) {
            i_2_ = 1;
            Class348_Sub40_Sub12.method3076(0, true);
        } else {
            i_2_ = 2;
            Class161.method1263(true);
        }
        if (Class316.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350) != 2) {
            Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub25_7251), 2);
            Class367_Sub10.method3553(false, (byte) 119, 2);
        }
        Class14_Sub2.method243(37);
        return i_2_;
    }

    public final void method14(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, boolean bool, boolean bool_8_) {
        anInt4723++;
        Class213.method1568((aHa_Sub1_4729.aClass348_Sub31_7469.anIntArray6916), i_3_, i, i_7_, bool_8_ ? aHa_Sub1_4729.aFloatArray7502 : null, bool ? this.anIntArray4731 : null, i_4_, 115, i_5_, (aHa_Sub1_4729.aClass348_Sub31_7469.anInt6917), this.anInt4725, i_6_, !bool_8_ ? null : this.aFloatArray4719);
    }

    public final void method15(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, boolean bool, boolean bool_14_) {
        anInt4721++;
        Class213.method1568(this.anIntArray4731, i_9_, i, i_13_, bool_14_ ? this.aFloatArray4719 : null, !bool ? null : (aHa_Sub1_4729.aClass348_Sub31_7469.anIntArray6916), i_10_, 113, i_11_, this.anInt4725, (aHa_Sub1_4729.aClass348_Sub31_7469.anInt6917), i_12_, bool_14_ ? aHa_Sub1_4729.aFloatArray7502 : null);
    }

    Class49(ha_Sub1 var_ha_Sub1, Class105 class105, Class216 class216) {
        do {
            try {
                aHa_Sub1_4729 = var_ha_Sub1;
                if (class105 instanceof Class105_Sub3_Sub1) {
                    Class105_Sub3_Sub1 class105_sub3_sub1 = (Class105_Sub3_Sub1) class105;
                    this.anIntArray4731 = (class105_sub3_sub1.anIntArray9933);
                    this.anInt4722 = class105_sub3_sub1.anInt8470;
                    this.anInt4725 = class105_sub3_sub1.anInt8471;
                } else {
                    if (!(class105 instanceof Class105_Sub3_Sub3)) throw new RuntimeException();
                    Class105_Sub3_Sub3 class105_sub3_sub3 = (Class105_Sub3_Sub3) class105;
                    this.anInt4725 = class105_sub3_sub3.anInt8471;
                    this.anInt4722 = class105_sub3_sub3.anInt8470;
                    this.anIntArray4731 = (class105_sub3_sub3.anIntArray9936);
                }
                if (class216 == null) break;
                aClass216_4724 = class216;
                if ((aClass216_4724.anInt4974 != this.anInt4725) || (this.anInt4722 != aClass216_4724.anInt4978)) throw new RuntimeException();
                this.aFloatArray4719 = aClass216_4724.aFloatArray4980;
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("it.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + (class105 != null ? "{...}" : "null") + ',' + (class216 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }
}
