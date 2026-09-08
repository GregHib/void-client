/* ByteBufferReader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class344_Sub1` (JODE-obfuscated).
 * Read-only view over a java.nio.ByteBuffer. getBytes/toByteArray read bytes out of the backing ByteBuffer (position + get). Extends AbstractBuffer (AbstractBuffer).
 */

import java.nio.ByteBuffer;

final class ByteBufferReader extends AbstractBuffer {
    private ByteBuffer aByteBuffer6524;

    final byte[] getBytes(int i, int i_0_, int i_1_) {
        byte[] is = new byte[i_0_];
        aByteBuffer6524.position(i_1_);
        aByteBuffer6524.get(is, 0, i_0_);
        if (i != 2) aByteBuffer6524 = null;
        return is;
    }

    final byte[] toByteArray(int i) {
        byte[] is = new byte[aByteBuffer6524.capacity()];
        if (i != -3672) toByteArray(78);
        aByteBuffer6524.position(0);
        aByteBuffer6524.get(is);
        return is;
    }

    final void setBytes(byte i, byte[] is) {
        aByteBuffer6524 = ByteBuffer.allocateDirect(is.length);
        aByteBuffer6524.position(0);
        if (i != 62) toByteArray(73);
        aByteBuffer6524.put(is);
    }
}
