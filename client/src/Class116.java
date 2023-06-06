/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

final class Class116 {
    static int anInt1758;
    static boolean shiftClick = true;
    static int anInt1760;
    static String aString1761;
    static Class114 aClass114_1762;

    public static void method1062(byte i) {
        if (i == 35) {
            aClass114_1762 = null;
            aString1761 = null;
        }
    }

    static final void method1063(int i) {
        if (i != 1) aString1761 = null;
        anInt1760++;
        Class234 class234 = null;
        try {
            Class144 class144 = Class348_Sub23_Sub1.aClass297_8992.method2233((byte) -46, "2", true);
            while (class144.anInt1997 == 0) Class286_Sub5.method2161((byte) 63, 1L);
            if (class144.anInt1997 == 1) {
                class234 = (Class234) class144.socket;
                byte[] is = new byte[(int) class234.method1662((byte) -46)];
                int i_0_;
                for (int i_1_ = 0; is.length > i_1_; i_1_ += i_0_) {
                    i_0_ = class234.method1656(is, i_1_, (byte) -12, is.length + -i_1_);
                    if (i_0_ == -1) throw new IOException("EOF");
                }
                Class348_Sub31.method3014(new Class348_Sub49(is), (byte) -40);
            }
        } catch (Exception exception) {
            /* empty */
        }
        do {
            try {
                if (class234 == null) break;
                class234.method1657(false);
            } catch (Exception exception) {
                break;
            }
            break;
        } while (false);
    }

    static {
        anInt1758 = 0;
        aClass114_1762 = new Class114(50, -1);
    }
}
