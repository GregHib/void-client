/* Class348_Sub23_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

import java.io.IOException;
import java.net.Socket;

final class Class348_Sub23_Sub3 extends Class348_Sub23 {
    static int anInt9040;
    static int anInt9041 = 0;
    static int[] anIntArray9042;
    static String aString9043 = null;
    static short aShort9044 = 256;
    static int anInt9045;
    static int anInt9046;

    final void method2964(byte i, OggPacket oggpacket) {
        if (i >= -91)
            anInt9041 = -51;
        anInt9046++;
    }

    public static void method2981(boolean bool) {
        anIntArray9042 = null;
        if (bool != false)
            anInt9041 = -95;
        aString9043 = null;
    }

    static final Class238 method2982(Socket socket, byte i, int i_0_)
            throws IOException {
        int i_1_ = -41 / ((i - -40) / 42);
        anInt9040++;
        return new Class238_Sub1(socket, i_0_);
    }

    final void method2961(byte i) {
        anInt9045++;
        if (i != 13)
            method2961((byte) -50);
    }

    Class348_Sub23_Sub3(OggStreamState oggstreamstate) {
        super(oggstreamstate);
    }
}
