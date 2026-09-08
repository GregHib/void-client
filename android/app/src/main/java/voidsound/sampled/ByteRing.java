package voidsound.sampled;

/**
 * Thread-safe PCM ring between the game mixer thread and the platform pump.
 * <p>
 * JavaSound {@code SourceDataLine.available()} returns <b>free</b> bytes — not
 * used bytes. {@link #free()} is what {@link PcmSourceDataLine#available()}
 * exposes so {@code SourceAudioLine.method2081} can compute how full the buffer is.
 * {@link #write} blocks when full (mixer paces itself); {@link #read} never blocks.
 */
final class ByteRing {
    private final byte[] buf;
    private int head;
    private int size;

    ByteRing(int capacity) {
        buf = new byte[Math.max(2048, capacity)];
    }

    synchronized int capacity() {
        return buf.length;
    }

    /** Bytes that can still be written without blocking. */
    synchronized int free() {
        return buf.length - size;
    }

    /** Bytes waiting to be played. */
    synchronized int used() {
        return size;
    }

    synchronized void clear() {
        head = 0;
        size = 0;
        notifyAll();
    }

    /** Blocks until all {@code len} bytes are queued (or interrupted). */
    synchronized int write(byte[] src, int off, int len) {
        int done = 0;
        while (done < len) {
            while (size == buf.length) {
                try {
                    wait(5L);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return done;
                }
            }
            int space = buf.length - size;
            int chunk = Math.min(len - done, space);
            int tail = (head + size) % buf.length;
            int first = Math.min(chunk, buf.length - tail);
            System.arraycopy(src, off + done, buf, tail, first);
            if (chunk > first) {
                System.arraycopy(src, off + done + first, buf, 0, chunk - first);
            }
            size += chunk;
            done += chunk;
            notifyAll();
        }
        return done;
    }

    /** Non-blocking; returns 0 if empty. */
    synchronized int read(byte[] dst, int off, int len) {
        if (size == 0 || len <= 0) {
            return 0;
        }
        int chunk = Math.min(len, size);
        int first = Math.min(chunk, buf.length - head);
        System.arraycopy(buf, head, dst, off, first);
        if (chunk > first) {
            System.arraycopy(buf, 0, dst, off + first, chunk - first);
        }
        head = (head + chunk) % buf.length;
        size -= chunk;
        notifyAll();
        return chunk;
    }
}
