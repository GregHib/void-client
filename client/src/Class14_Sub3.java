/* Class14_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

import java.io.IOException;

final class Class14_Sub3 extends Class14 implements Interface18_Impl1 {
    static int anInt8624;
    static int anInt8625;
    private final int anInt8626;
    static int anInt8627;
    static int anInt8628;
    private final int anInt8629;
    static int anInt8630;
    private final int anInt8631;
    static int anInt8632;

    Class14_Sub3(Class377 class377, Class304 class304, int i, int i_0_, int i_1_, byte[] is) {
        super(class377, 32879, class304, Class68.aClass68_1183, i_0_ * (i * i_1_), false);
        try {
            anInt8626 = i_1_;
            anInt8631 = i;
            anInt8629 = i_0_;
            this.aClass377_5082.method3850((byte) 86, this);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glTexImage3Dub(this.anInt5093, 0, this.method228(105), anInt8631, anInt8629, anInt8626, 0, Class348_Sub40_Sub3.method3055(109, this.aClass304_5084), 5121, is, 0);
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qba.<init>(" + (class377 != null ? "{...}" : "null") + ',' + (class304 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    static final Class348_Sub51 method247(int i) {
        anInt8632++;
        Class234 class234 = null;
        Class348_Sub51 class348_sub51 = new Class348_Sub51(Class348_Sub42_Sub8_Sub2.aClass230_10434, 0);
        try {
            Class144 class144 = Class348_Sub23_Sub1.aClass297_8992.method2233((byte) -46, "", true);
            while (class144.anInt1997 == 0) Class286_Sub5.method2161((byte) -85, 1L);
            if (class144.anInt1997 == 1) {
                class234 = (Class234) class144.anObject1998;
                byte[] is = new byte[(int) class234.method1662((byte) -46)];
                int i_2_;
                for (int i_3_ = 0; is.length > i_3_; i_3_ += i_2_) {
                    i_2_ = class234.method1656(is, i_3_, (byte) -49, -i_3_ + is.length);
                    if (i_2_ == -1) throw new IOException("EOF");
                }
                class348_sub51 = new Class348_Sub51(new Class348_Sub49(is), (Class348_Sub42_Sub8_Sub2.aClass230_10434), 0);
            }
        } catch (Exception exception) {
            /* empty */
        }
        if (i != 24916) return null;
        try {
            if (class234 != null) class234.method1657(false);
        } catch (Exception exception) {
            /* empty */
        }
        return class348_sub51;
    }

    static final Class114[] method248(int i) {
        anInt8624++;
        if (i != -11271) method249(39);
        return (new Class114[]{Class166.aClass114_2183, Class295.aClass114_3751, Class318_Sub1_Sub5_Sub2.aClass114_10168, Class356.aClass114_4388, Class17.aClass114_250, Class330.aClass114_4126, Class254.aClass114_3264, Class239.aClass114_3143, Class111.aClass114_1722, Class348_Sub42_Sub3.aClass114_9503, Class127_Sub1.aClass114_8385, Class318_Sub1.aClass114_6383, Class202.aClass114_2665, Class359.aClass114_4421, Class346_Sub1.aClass114_6528, Class19.aClass114_315, Class367_Sub11.aClass114_7398, Class239_Sub14.aClass114_5992, Class127_Sub1.aClass114_8384, Class20.aClass114_318, Class133.aClass114_1917, Class367_Sub3.aClass114_7301, Class361.aClass114_4433, Class318_Sub1_Sub5_Sub2.aClass114_10149, Class110.aClass114_1702, Class168.aClass114_2248, Class239_Sub20.aClass114_6056, Class312.aClass114_3925, Class348_Sub40_Sub16.aClass114_9225, Class292.aClass114_4798, Class5_Sub2.aClass114_8365, Class352.aClass114_4331, Class239_Sub26.aClass114_6121, Class348_Sub38.aClass114_7015, Class239_Sub4.aClass114_5883, Class59.aClass114_1068, Class348_Sub45.aClass114_7106, Class367_Sub9.aClass114_7367, Class131.aClass114_1901, Class135_Sub1.aClass114_4707, Class13.aClass114_220, Class239_Sub24.aClass114_6089, IOException_Sub1.aClass114_90, Class252.aClass114_3240, Class298.aClass114_3809, Class271.aClass114_3467, Class239_Sub21.aClass114_6058, Class185.aClass114_2483, Class255.aClass114_3265, Class228.aClass114_2972, Class116.aClass114_1762, Class15.aClass114_229, Class128.aClass114_1871, Class63.aClass114_1120, Class74.aClass114_1234, Class296.aClass114_3773, Class260.aClass114_3307, Class174.aClass114_2305, Class369_Sub2.aClass114_8590, Class28.aClass114_4998, Class172.aClass114_2279, Class348_Sub40_Sub12.aClass114_9197, Class348_Sub47.aClass114_7124, Class264.aClass114_3371, Class239_Sub11.aClass114_5950, Class22.aClass114_330, Class47.aClass114_843, Class345.aClass114_4272, Class151.aClass114_2068, Class239_Sub11.aClass114_5949, Class19.aClass114_304, InputStream_Sub2.aClass114_82, Class348_Sub42_Sub8.aClass114_9552, Class348_Sub40_Sub19.aClass114_9254, Class314_Sub1.aClass114_6340, InputStream_Sub1.aClass114_79, Class73.aClass114_4779, Class173.aClass114_2285, Class63.aClass114_1123, Class280.aClass114_3641, Class176.aClass114_2335, Class140.aClass114_1959, Class318_Sub6.aClass114_6424, Class348_Sub1_Sub2.aClass114_8817, Class133.aClass114_1914, Class348_Sub40_Sub24.aClass114_9324, Class348_Sub41.aClass114_7052, Class345.aClass114_4269, Class365.aClass114_4477, Class239_Sub22.aClass114_6075, Class322.aClass114_4027, Class348_Sub40_Sub15.aClass114_9216, Class178.aClass114_2338, Class267.aClass114_3427, Class205.aClass114_2693, Class20.aClass114_316, Class367_Sub4.aClass114_7324, Class348_Sub46.aClass114_7113, Class189.aClass114_2527, Class168.aClass114_2255, Class59_Sub2_Sub2.aClass114_8683, Class348_Sub45.aClass114_7105, Class348_Sub40_Sub19.aClass114_9257, Class367_Sub8.aClass114_7363, Class348_Sub40_Sub22.aClass114_9285, Class367_Sub4.aClass114_7323, Class218.aClass114_2860, Class318_Sub1_Sub3.aClass114_8756, Class239.aClass114_3135, Class348_Sub42_Sub8.aClass114_9550, Class3.aClass114_123, Class167.aClass114_2196, Class264.aClass114_3368, Class95.aClass114_1540, Class303.aClass114_3842, Class239_Sub15.aClass114_5997, Class321.aClass114_4015, Class368.aClass114_4500, Class209.aClass114_2717, Class101_Sub2.aClass114_5742, Class176.aClass114_2331});
    }

    static final void method249(int i) {
        anInt8627++;
        Class286_Sub1.aStringArray6200 = new String[500];
        Class348_Sub31_Sub2.anInt9077 = 2 + (Class369.aClass143_4962.anInt1993 + Class369.aClass143_4962.anInt1988);
        Class68.anInt1188 = (Class246.aClass143_3179.anInt1988 - (-Class246.aClass143_3179.anInt1993 - i));
        for (int i_4_ = 0; (i_4_ < Class286_Sub1.aStringArray6200.length); i_4_++)
            Class286_Sub1.aStringArray6200[i_4_] = "";
        Applet_Sub1.method94(Class274.aClass274_3483.method2063(Class348_Sub33.anInt6967, 544), 67);
    }
}
