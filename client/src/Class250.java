/* Class250 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class250 implements Runnable {
    volatile Class279[] aClass279Array3218 = new Class279[2];
    static int anInt3219;
    static int[] anIntArray3220;
    volatile boolean aBoolean3221 = false;
    static int anInt3222;
    volatile boolean aBoolean3223 = false;
    static int anInt3224;
    static int anInt3225;
    static Class318_Sub1[] aClass318_Sub1Array3226;
    static int anInt3227 = 0;
    Class297 aClass297_3228;

    static final String method1909(byte i, String string) {
        if (i != 31)
            method1911((byte) 87);
        anInt3222++;
        String string_0_ = null;
        int i_1_ = string.indexOf("--> ");
        if ((i_1_ ^ 0xffffffff) <= -1) {
            string_0_ = string.substring(0, 4 + i_1_);
            string = string.substring(i_1_ + 4);
        }
        if (string.startsWith("directlogin ")) {
            int i_2_ = string.indexOf(" ", "directlogin ".length());
            if (i_2_ >= 0) {
                int i_3_ = string.length();
                string = string.substring(0, i_2_) + " ";
                for (int i_4_ = 1 + i_2_;
                     (i_3_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++)
                    string += "*";
            }
        }
        if (string_0_ == null)
            return string;
        return string_0_ + string;
    }

    public final void run() {
        ((Class250) this).aBoolean3223 = true;
        anInt3224++;
        try {
            while (!((Class250) this).aBoolean3221) {
                for (int i = 0; i < 2; i++) {
                    Class279 class279
                            = ((Class250) this).aClass279Array3218[i];
                    if (class279 != null)
                        class279.method2084(-6858);
                }
                Class286_Sub5.method2161((byte) -107, 10L);
                Class369_Sub3_Sub1.method3578((byte) -42, null,
                        (((Class250) this)
                                .aClass297_3228));
            }
        } catch (Exception exception) {
            Class156.method1242(null, exception, 15004);
        } finally {
            ((Class250) this).aBoolean3223 = false;
        }
    }

    public static void method1910(int i) {
        anIntArray3220 = null;
        if (i != 0)
            method1910(-18);
        aClass318_Sub1Array3226 = null;
    }

    static final void method1911(byte i) {
        if (i != 99)
            anIntArray3220 = null;
        Class367_Sub11.aClass32_7415 = new Class32(8);
        anInt3219++;
        Class318_Sub7.anInt6450 = 0;
        for (Class318_Sub10 class318_sub10
             = (Class318_Sub10) Class152.aClass243_2077.method1872(8);
             class318_sub10 != null;
             class318_sub10 = (Class318_Sub10) Class152.aClass243_2077
                     .method1878((byte) -115))
            class318_sub10.method2530();
    }
}
