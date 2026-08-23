package jaclib.memory.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.lwjgl.system.MemoryUtil;

/**
 * Pure-Java replacement for jaclib's native heap (clientlibs.jar).
 *
 * This must be a single always-mapped arena, not per-buffer mallocs: the GL
 * driver reads client-side vertex arrays with generous bounds (and the engine
 * occasionally reads through stale pointers), which the original native heap
 * tolerated because every stray read landed inside its one big region.
 * Exact-size mallocs turn those reads into EXC_BAD_ACCESS (observed inside
 * Apple's gleRunVertexSubmitImmediate). So: one calloc'd region sized by the
 * constructor, first-fit sub-allocation with a coalescing free list, 16-byte
 * alignment and per-block padding.
 *
 * NativeHeapBuffer (still loaded from clientlibs.jar) talks to this class
 * through the same package-private methods the native version exposed,
 * keyed by an int buffer id.
 */
public final class NativeHeap {

    private static final int ALIGN = 16;
    private static final int PAD = 64;

    private boolean a; // alive
    private int b;     // requested capacity
    long peer;

    private long base;
    private int capacity;
    private final TreeMap<Integer, Integer> free = new TreeMap<Integer, Integer>(); // offset -> length
    private final HashMap<Integer, int[]> used = new HashMap<Integer, int[]>();     // id -> {offset, length}
    private int nextId = 1;

    public NativeHeap(int size) {
        this.b = size;
        allocateHeap(size);
        this.a = true;
    }

    private void allocateHeap(int size) {
        int cap = Math.max(size, 1 << 20);
        cap = (cap + 0xfff) & ~0xfff;
        // Trailing PAD keeps driver tail-reads of the last block in-bounds.
        base = MemoryUtil.nmemCalloc(1, (long) cap + PAD);
        if (base == 0L) throw new OutOfMemoryError("native heap: " + cap + " bytes");
        capacity = cap;
        free.put(Integer.valueOf(0), Integer.valueOf(cap));
        jaggl.OpenGL.registerRange(base, (long) cap + PAD);
        if (jaggl.OpenGL.DEBUG) {
            System.err.println("[jaclib] arena " + (cap >> 20) + "MB at 0x" + Long.toHexString(base));
        }
    }

    final synchronized boolean a() {
        return a;
    }

    public final NativeHeapBuffer a(int size, boolean clear) {
        if (!a) throw new IllegalStateException();
        return new NativeHeapBuffer(this, allocateBuffer(size, clear), size);
    }

    final synchronized int allocateBuffer(int size, boolean clear) {
        int need = (size + PAD + ALIGN - 1) & ~(ALIGN - 1);
        int off = -1;
        int blockLen = 0;
        for (Map.Entry<Integer, Integer> e : free.entrySet()) {
            if (e.getValue().intValue() >= need) {
                off = e.getKey().intValue();
                blockLen = e.getValue().intValue();
                break;
            }
        }
        if (off < 0) throw new OutOfMemoryError("native heap arena exhausted: " + size + " of " + capacity);
        free.remove(Integer.valueOf(off));
        if (blockLen > need) free.put(Integer.valueOf(off + need), Integer.valueOf(blockLen - need));
        used.put(Integer.valueOf(nextId), new int[]{off, need});
        if (clear) MemoryUtil.memSet(base + off, 0, size);
        return nextId++;
    }

    final synchronized long getBufferAddress(int id) {
        int[] block = used.get(Integer.valueOf(id));
        if (block == null) throw new IllegalStateException("freed buffer " + id);
        return base + block[0];
    }

    final synchronized void put(int id, byte[] src, int srcOff, int dstOff, int len) {
        if (len > 0) MemoryUtil.memByteBuffer(getBufferAddress(id) + dstOff, len).put(src, srcOff, len);
    }

    final synchronized void get(int id, byte[] dst, int dstOff, int srcOff, int len) {
        if (len > 0) MemoryUtil.memByteBuffer(getBufferAddress(id) + srcOff, len).get(dst, dstOff, len);
    }

    final synchronized void deallocateBuffer(int id) {
        int[] block = used.remove(Integer.valueOf(id));
        if (block == null) return;
        int off = block[0];
        int len = block[1];
        int end = off + len;
        // Coalesce with the following free block.
        Integer nextLen = free.remove(Integer.valueOf(end));
        if (nextLen != null) len += nextLen.intValue();
        // Coalesce with the preceding free block.
        Map.Entry<Integer, Integer> lower = free.floorEntry(Integer.valueOf(off));
        if (lower != null && lower.getKey().intValue() + lower.getValue().intValue() == off) {
            off = lower.getKey().intValue();
            len += lower.getValue().intValue();
            free.remove(lower.getKey());
        }
        free.put(Integer.valueOf(off), Integer.valueOf(len));
    }

    private void deallocateHeap() {
        if (base != 0L) {
            MemoryUtil.nmemFree(base);
            base = 0L;
        }
        free.clear();
        used.clear();
    }

    public final synchronized void b() {
        if (a) deallocateHeap();
        a = false;
    }

    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        b();
    }
}
