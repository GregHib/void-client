/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class43 {
    static Class45 aClass45_611;
    static int anInt612;
    static int anInt613;
    Class348_Sub42_Sub10 aClass348_Sub42_Sub10_614;
    int anInt615;
    static int anInt616;
    int[] anIntArray617;
    static Class351 aClass351_618 = new Class351(5, 3);
    static int[] anIntArray619 = {0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4};
    static int anInt620;

    public static void method380(int i) {
        aClass351_618 = null;
        anIntArray619 = null;
        if (i == 0) aClass45_611 = null;
    }

    static final Class179 method381(byte i) {
        anInt616++;
        if (i != 68) method381((byte) -42);
        return Class114.method1059((byte) 95, 1);
    }

    static final void method382(String string, boolean bool) {
        anInt613++;
        Class239_Sub12.aString5966 = string;
        if (bool != true) method381((byte) -48);
        if (Class93.anApplet1530 != null) {
            try {
                String string_0_ = Class93.anApplet1530.getParameter("cookieprefix");
                String string_1_ = Class93.anApplet1530.getParameter("cookiehost");
                String string_2_ = (string_0_ + "settings=" + string + "; version=1; path=/; domain=" + string_1_);
                if (string.length() == 0) string_2_ += "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                else string_2_ += ("; Expires=" + (Class348_Sub42_Sub16_Sub1.method3261(Class62.method599(-53) + 94608000000L, 63)) + "; Max-Age=" + 94608000L);
                Class224.method1615(Class93.anApplet1530, -15092, "document.cookie=\"" + string_2_ + "\"");
            } catch (Throwable throwable) {
                /* empty */
            }
        }
    }

    static final void method383(int i) {
        for (int i_3_ = i; Class250.anInt3225 > i_3_; i_3_++) {
            int i_4_ = (Class350.method3452(Class286.anInt3682 + i_3_, (byte) -15, Class250.anInt3225) * Class31.anInt425);
            for (int i_5_ = 0; Class31.anInt425 > i_5_; i_5_++) {
                int i_6_ = (Class350.method3452(i_5_ - -Class239_Sub24.anInt6095, (byte) -15, Class31.anInt425) + i_4_);
                if (Class132.anIntArray1909[i_6_] == Class318_Sub1_Sub1_Sub2.anInt9997) Class92.anInterface4Array1525[i_6_].method14(0, 0, Class58.anInt1067, Class344.anInt4267, i_5_ * Class58.anInt1067, Class344.anInt4267 * i_3_, true, true);
            }
        }
        anInt612++;
    }

    public Class43() {
        /* empty */
    }
}
