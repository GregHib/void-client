/* OggStreamReader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class348_Sub23_Sub3` (JODE-obfuscated).
 * Ogg stream read over a network Socket (extends OggStream). openSocketStream(Socket,byte,int) opens the stream; handlePacket consumes OggPacket.
 */

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

import java.io.IOException;
import java.net.Socket;

final class OggStreamReader extends OggStream {
    static int anInt9040;
    static int anInt9041 = 0;
    static int[] anIntArray9042;
    static String aString9043 = null;
    static short aShort9044 = 256;
    static int anInt9045;
    static int anInt9046;

    final void handlePacket(byte i, OggPacket oggpacket) {
        if (i >= -91) anInt9041 = -51;
        anInt9046++;
    }

    public static void method2981(boolean bool) {
        anIntArray9042 = null;
        if (bool != false) anInt9041 = -95;
        aString9043 = null;
    }

    static final SocketStream openSocketStream(Socket socket, byte i, int i_0_) throws IOException {
        int i_1_ = -41 / ((i - -40) / 42);
        anInt9040++;
        return new TcpSocketStream(socket, i_0_);
    }

    final void shutdown(byte i) {
        anInt9045++;
        if (i != 13) shutdown((byte) -50);
    }

    OggStreamReader(OggStreamState oggstreamstate) {
        super(oggstreamstate);
    }
}
