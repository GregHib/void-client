/* Class289 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class289 {
    static int anInt3696;
    static boolean aBoolean3697 = false;
    static int anInt3698;
    static int anInt3699;
    static byte[][][] aByteArrayArrayArray3700;
    static Class46 aClass46_3701 = null;
    static int anInt3702;
    static int anInt3703;
    static int anInt3704;
    static Class262 aClass262_3705;

    public static void method2191(int i) {
        if (i != 0) method2192((byte) -74);
        aClass46_3701 = null;
        aByteArrayArrayArray3700 = null;
        aClass262_3705 = null;
    }

    static final void method2192(byte i) {
        Class250.anInt3227 = 0;
        anInt3702++;
        int i_0_ = (((Class132.aPlayer_1907.x) >> 9) - -za_Sub2.regionTileX);
        int i_1_ = (Class90.regionTileY + (Class132.aPlayer_1907.y >> 9));
        if (i != 80) method2192((byte) -34);
        if (i_0_ >= 3053 && i_0_ <= 3156 && i_1_ >= 3056 && i_1_ <= 3136) Class250.anInt3227 = 1;
        if (i_0_ >= 3072 && i_0_ <= 3118 && i_1_ >= 9492 && i_1_ <= 9535) Class250.anInt3227 = 1;
        if (Class250.anInt3227 == 1 && i_0_ >= 3139 && i_0_ <= 3199 && i_1_ >= 3008 && i_1_ <= 3062) Class250.anInt3227 = 0;
    }

    static final void method2193(boolean bool, byte i) {
        anInt3698++;
        Class369_Sub1.method3570(false);
        if (Class334.method2653(true, Class240.anInt4674)) {
            Class11.anInt193++;
            if (i < -118 && (Class11.anInt193 >= 50 || bool)) {
                Class11.anInt193 = 0;
                if (!Class110.aBoolean1712 && Class348_Sub40_Sub8.aClass238_9165 != null) {
                    IOException_Sub1.anInt88++;
                    Class348_Sub47 class348_sub47 = Class286_Sub3.method2148((Class239_Sub10.aClass351_5938), (Class348_Sub23_Sub2.aClass77_9029), -106);
                    Class348_Sub42_Sub14.method3243(122, class348_sub47);
                    try {
                        Class239_Sub18.method1802(0);
                    } catch (java.io.IOException ioexception) {
                        Class110.aBoolean1712 = true;
                    }
                }
                Class369_Sub1.method3570(false);
            }
        }
    }

    static final int method2194(int i, Class348_Sub42_Sub13 class348_sub42_sub13) {
        anInt3696++;
        if (i != -1) return -42;
        String string = Class348_Sub15.method2812(i + -43, class348_sub42_sub13);
        return Class369.aClass143_4962.method1186(string, Class341.aClass105Array4234, false);
    }

    static {
        anInt3699 = 0;
    }
}
