/* SocketStream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class238` (JODE-obfuscated).
 * Abstract byte-I/O connection stream ({@link #readBytes}/{@link #writeBytes}).
 * {@link #shutdownStreams} detaches buffers; {@link #method1703} builds an
 * {@link RSARequest} during handshake. Parent of {@link TcpSocketStream}.
 */

import java.io.IOException;

abstract class SocketStream {
    static int anInt3132;
    static Component183 aClass114_3133;

    abstract void close(byte i);

    abstract int readBytes(int i, int i_0_, byte i_1_, byte[] is) throws IOException;

    /** Detach real I/O (replace with dummy streams). */
    abstract void shutdownStreams(int i);

    static final void method1703(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
        anInt3132++;
        RSARequest class348_sub42_sub15 = FriendLoginMessage.method2516(i_2_, (byte) 105, i_4_);//4
        class348_sub42_sub15.method3246(-25490);
        class348_sub42_sub15.anInt9651 = i_3_;
        class348_sub42_sub15.anInt9652 = i;
        class348_sub42_sub15.anInt9650 = i_5_;
    }

    public static void method1704(byte i) {
        if (i >= -90) aClass114_3133 = null;
        aClass114_3133 = null;
    }

    public SocketStream() {
        /* empty */
    }

    abstract boolean availableAtLeast(int i, int i_6_) throws IOException;

    abstract void writeBytes(int i, int i_7_, int i_8_, byte[] is) throws IOException;
}
