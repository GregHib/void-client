package jaclib.memory;

/**
 * Pure-Java replacement for jaclib.memory.Stream (clientlibs.jar): a small
 * byte serializer that batches writes into a byte[] and flushes them into a
 * {@link Buffer}. Method names and byte orders replicate the original
 * (recovered from bytecode):
 *   a(int)        -> 16-bit little-endian
 *   b(int)        -> 32-bit little-endian
 *   c(int)        -> colour: bytes [v>>16, v>>8, v, v>>24] (RGBA from ARGB int)
 *   d(int)        -> 16-bit big-endian
 *   f(int)        -> single byte
 *   a(float)      -> float bits big-endian
 *   b(float)      -> float bits little-endian
 *   a(i,i,i,i)    -> 4 raw bytes in order
 *   b(i,i,i,i)    -> bytes [3rd, 2nd, 1st, 4th]
 *   a()           -> flush, b() -> position, e(int) -> seek
 * The original's floatToRawIntBits/getLSB natives are plain Java here; the
 * platform is little-endian on every target we run on, and c() reports that.
 */
public final class Stream {

    private int a;      // flush window end (offset+length in target buffer)
    private Buffer b;   // target buffer
    private int c;      // pending byte count in e
    private int d;      // current write offset in target buffer
    private byte[] e;   // pending bytes

    public Stream() {
        this(4096);
    }

    private Stream(int size) {
        e = new byte[size];
    }

    public Stream(Buffer buffer) {
        this(4096);
        a(buffer, 0, buffer.getSize());
    }

    public Stream(Buffer buffer, int off, int len) {
        this(4096);
        a(buffer, off, len);
    }

    private void a(Buffer buffer, int off, int len) {
        a();
        this.a = off + len;
        this.d = off;
        this.b = buffer;
        if (this.a > buffer.getSize()) throw new RuntimeException();
    }

    /** Retarget the stream at the start of the given buffer. */
    public void a(Buffer buffer) {
        a(buffer, 0, buffer.getSize());
    }

    /** Flush pending bytes into the target buffer. */
    public void a() {
        if (c > 0) {
            if (d + c > a) throw new RuntimeException();
            b.a(e, 0, d, c);
            d += c;
            c = 0;
        }
    }

    /** Current absolute position in the target buffer. */
    public int b() {
        return d + c;
    }

    /** Seek: flush, then continue writing at the given offset. */
    public void e(int off) {
        a();
        this.d = off;
    }

    private void ensure(int n) {
        if (c + n > e.length) a();
    }

    /** Write 16-bit little-endian. */
    public void a(int v) {
        ensure(2);
        e[c++] = (byte) v;
        e[c++] = (byte) (v >> 8);
    }

    /** Write 32-bit little-endian. */
    public void b(int v) {
        ensure(4);
        e[c++] = (byte) v;
        e[c++] = (byte) (v >> 8);
        e[c++] = (byte) (v >> 16);
        e[c++] = (byte) (v >> 24);
    }

    /** Write ARGB colour int as RGBA bytes. */
    public void c(int v) {
        ensure(4);
        e[c++] = (byte) (v >> 16);
        e[c++] = (byte) (v >> 8);
        e[c++] = (byte) v;
        e[c++] = (byte) (v >> 24);
    }

    /** Write 16-bit big-endian. */
    public void d(int v) {
        ensure(2);
        e[c++] = (byte) (v >> 8);
        e[c++] = (byte) v;
    }

    /** Write a single byte. */
    public void f(int v) {
        ensure(1);
        e[c++] = (byte) v;
    }

    /** Write float bits big-endian. */
    public void a(float v) {
        ensure(4);
        int bits = floatToRawIntBits(v);
        e[c++] = (byte) (bits >> 24);
        e[c++] = (byte) (bits >> 16);
        e[c++] = (byte) (bits >> 8);
        e[c++] = (byte) bits;
    }

    /** Write float bits little-endian. */
    public void b(float v) {
        ensure(4);
        int bits = floatToRawIntBits(v);
        e[c++] = (byte) bits;
        e[c++] = (byte) (bits >> 8);
        e[c++] = (byte) (bits >> 16);
        e[c++] = (byte) (bits >> 24);
    }

    /** Write 4 raw bytes in argument order. */
    public void a(int b1, int b2, int b3, int b4) {
        ensure(4);
        e[c++] = (byte) b1;
        e[c++] = (byte) b2;
        e[c++] = (byte) b3;
        e[c++] = (byte) b4;
    }

    /** Write 4 raw bytes reordered [3rd, 2nd, 1st, 4th]. */
    public void b(int b1, int b2, int b3, int b4) {
        ensure(4);
        e[c++] = (byte) b3;
        e[c++] = (byte) b2;
        e[c++] = (byte) b1;
        e[c++] = (byte) b4;
    }

    public static int floatToRawIntBits(float f) {
        return Float.floatToRawIntBits(f);
    }

    private static byte getLSB(int v) {
        return (byte) v; // little-endian answer on all supported platforms
    }

    /**
     * True when the platform is BIG-endian (the original native read the
     * first memory byte of 0xFFFF0000: 0xFF on big-endian machines). The
     * engine branches "if (c()) write big-endian" - so this must be false
     * on every platform we run on.
     */
    public static boolean c() {
        return getLSB(-65536) == -1;
    }
}
