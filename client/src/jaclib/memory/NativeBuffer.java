package jaclib.memory;

import org.lwjgl.system.MemoryUtil;

/**
 * Pure-Java replacement for the jaclib native memory buffer (clientlibs.jar).
 * Field/method shape mirrors the original exactly so subclasses compiled
 * against the original (jaggl.MapBuffer) keep linking.
 */
public class NativeBuffer implements Buffer, Source {

    private long a;      // native address
    private int b = -1;  // size in bytes

    public final long getAddress() {
        return a;
    }

    public final int getSize() {
        return b;
    }

    /** Rebind this buffer to a raw (address, size) window. */
    protected final void a(long address, int size) {
        this.b = size;
        this.a = address;
    }

    /** Copy src[srcOff .. srcOff+len) into native memory at address+dstOff. */
    public void a(byte[] src, int srcOff, int dstOff, int len) {
        if (src == null || srcOff < 0 || dstOff < 0
            || dstOff + len > this.b || srcOff + len > src.length || this.a == 0L) {
            throw new RuntimeException();
        }
        if (len > 0) MemoryUtil.memByteBuffer(this.a + dstOff, len).put(src, srcOff, len);
    }

    public NativeBuffer() {
    }
}
