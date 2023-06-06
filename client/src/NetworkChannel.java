/* Class238 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

abstract class NetworkChannel {
    static int anInt3132;
    static Class114 aClass114_3133;

    abstract void method1700(byte i);

    abstract int read(int i, int i_0_, byte i_1_, byte[] is) throws IOException;

    abstract void method1702(int i);

    static final void method1703(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
        anInt3132++;
        Class348_Sub42_Sub15 class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i_2_, (byte) 105, i_4_);//4
        class348_sub42_sub15.method3246(-25490);
        class348_sub42_sub15.anInt9651 = i_3_;
        class348_sub42_sub15.anInt9652 = i;
        class348_sub42_sub15.anInt9650 = i_5_;
    }

    public static void method1704(byte i) {
        if (i >= -90) aClass114_3133 = null;
        aClass114_3133 = null;
    }

    public NetworkChannel() {
        /* empty */
    }

    abstract boolean available(int i, int i_6_) throws IOException;

    abstract void method1706(int i, int i_7_, int i_8_, byte[] is) throws IOException;
}
