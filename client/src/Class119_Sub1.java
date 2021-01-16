/* Class119_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;

final class Class119_Sub1 extends Class119 implements Interface2 {
    private int anInt4697;
    static int anInt4698;
    static int anInt4699;
    static int anInt4700;
    static int anInt4701;
    static byte aByte4702;
    static int anInt4703;
    static int anInt4704;
    static int anInt4705;

    Class119_Sub1(ha_Sub2 var_ha_Sub2, int i, byte[] is, int i_0_) {
        super(var_ha_Sub2, is, i_0_);
        try {
            anInt4697 = i;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("cw.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + i_0_ + ')'));
        }
    }

    Class119_Sub1(ha_Sub2 var_ha_Sub2, int i, Buffer buffer) {
        super(var_ha_Sub2, buffer);
        try {
            anInt4697 = i;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("cw.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + (buffer != null ? "{...}" : "null") + ')'));
        }
    }

    public final long method12(byte i) {
        if (i != 42) method1077(null, (byte) -124);
        anInt4704++;
        return this.aBuffer1792.getAddress();
    }

    static final void method1077(ha var_ha, byte i) {
        anInt4700++;
        if ((Class73.anInt4776 >= 2 || r.aBoolean9722) && Class289.aClass46_3701 == null) {
            if (i >= -71) method1077(null, (byte) -41);
            String string;
            if (r.aBoolean9722 && Class73.anInt4776 < 2) string = (Class28.aString5001 + Class274.aClass274_3515.method2063(Class348_Sub33.anInt6967, 544) + Class28.aString5000 + " ->");
            else if (!Class116.aBoolean1759 || !Class182.aClass346_2449.method2696(81, -121) || Class73.anInt4776 <= 2) {
                Class348_Sub42_Sub12 class348_sub42_sub12 = Class316.aClass348_Sub42_Sub12_3963;
                if (class348_sub42_sub12 == null) return;
                string = Class316.method2367((byte) -52, class348_sub42_sub12);
                int[] is = null;
                if (!Class148.method1197(-12081, class348_sub42_sub12.anInt9608)) {
                    if (class348_sub42_sub12.anInt9599 != -1) is = Exception_Sub1.aClass255_112.method1940(98, (class348_sub42_sub12.anInt9599)).anIntArray2772;
                    else if (Class367_Sub8.method3549((class348_sub42_sub12.anInt9608), (byte) 107)) {
                        Class348_Sub22 class348_sub22 = ((Class348_Sub22) (Class282.aClass356_3654.method3480((int) class348_sub42_sub12.aLong9605, -6008)));
                        if (class348_sub22 != null) {
                            Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1 = (class348_sub22.aClass318_Sub1_Sub3_Sub3_Sub1_6859);
                            Class79 class79 = (class318_sub1_sub3_sub3_sub1.aClass79_10505);
                            if (class79.anIntArray1377 != null) class79 = (class79.method794((Class318_Sub1_Sub3_Sub3.aClass170_10209), -1));
                            if (class79 != null) is = class79.anIntArray1342;
                        }
                    } else if (Class239_Sub21.method1813(8806, (class348_sub42_sub12.anInt9608))) {
                        Object object = null;
                        Class51 class51;
                        if ((class348_sub42_sub12.anInt9608) != 1001) class51 = (Class348_Sub40_Sub12.aClass263_9195.method2005(0, (int) ((class348_sub42_sub12.aLong9605) >>> -773937632 & 0x7fffffffL)));
                        else class51 = (Class348_Sub40_Sub12.aClass263_9195.method2005(0, (int) (class348_sub42_sub12.aLong9605)));
                        if (class51.anIntArray945 != null) class51 = class51.method480((Class318_Sub1_Sub3_Sub3.aClass170_10209), (byte) 47);
                        if (class51 != null) is = class51.anIntArray917;
                    }
                } else is = (Exception_Sub1.aClass255_112.method1940(-73, (int) (class348_sub42_sub12.aLong9605)).anIntArray2772);
                if (is != null) string += Class163.method1273(is, true);
            } else string = Class316.method2367((byte) 125, Class316.aClass348_Sub42_Sub12_3963);
            if (Class73.anInt4776 > 2) string += ("<col=ffffff> / " + (Class73.anInt4776 - 2) + Class274.aClass274_3508.method2063(Class348_Sub33.anInt6967, 544));
            if (Class348_Sub36.aClass46_6990 != null) {
                Class324 class324 = Class348_Sub36.aClass46_6990.method426(var_ha, (byte) 68);
                if (class324 == null) class324 = Class262.aClass324_3326;
                class324.method2585(Class175.anIntArray2330, Class348_Sub36.aClass46_6990.anInt709, Class341.aClass105Array4234, Class348_Sub36.aClass46_6990.anInt700, Class348_Sub36.aClass46_6990.anInt749, Class348_Sub36.aClass46_6990.anInt789, Class348_Sub36.aClass46_6990.anInt809, OutputStream_Sub1.aRandom93, Class348_Sub36.aClass46_6990.anInt762, Class32.anInt451, Class356.anInt4383, -33, Class332.anInt4141, string, Class195.anIntArray5007);
                Class13.method226(Class195.anIntArray5007[0], Class195.anIntArray5007[2], Class195.anIntArray5007[1], 0, Class195.anIntArray5007[3]);
            } else if (Class21.aClass46_323 != null && (Class348_Sub42_Sub8_Sub2.aClass230_10434 == Class10.aClass230_186)) {
                int i_1_ = (Class262.aClass324_3326.method2571(-1, Class356.anInt4383, Class175.anIntArray2330, string, 16777215, 0, Class341.aClass105Array4234, 16 + Class238_Sub1.anInt5832, 4 + Class120.anInt4911, OutputStream_Sub1.aRandom93));
                Class13.method226(Class120.anInt4911 - -4, (Class369.aClass143_4962.method1183(true, string) + i_1_), Class238_Sub1.anInt5832, 0, 16);
            }
        }
    }

    public final int method13(byte i) {
        anInt4699++;
        if (i != -97) return -87;
        return anInt4697;
    }

    public final void method11(int i, int i_2_, byte[] is, int i_3_) {
        anInt4705++;
        this.method1076(is, i_2_);
        anInt4697 = i;
        if (i_3_ != -9894) method10(false);
    }

    public final int method10(boolean bool) {
        anInt4701++;
        if (bool != true) method11(126, 120, null, -73);
        return 0;
    }
}
