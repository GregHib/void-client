/* Component222 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.io.OutputStream;

/**
 * Async ring-buffer writer over an {@link OutputStream} (daemon thread).
 * Used by {@link TcpSocketStream} for non-blocking socket writes.
 */
final class Component222 implements Runnable {
    private IOException exception;
    private int readPos = 0;
    private final byte[] buffer;
    static NodeList aClass262_2707 = new NodeList();
    private final Thread thread;
    static int anInt2709;
    static int anInt2710;
    static int anInt2711;
    private OutputStream outputStream;
    private int writePos = 0;
    static int anInt2714;
    private final int capacity;

    public static void method1525(byte i) {
        if (i != 4) aClass262_2707 = null;
        aClass262_2707 = null;
    }

    public final void run() {
        anInt2710++;
        for (; ; ) {
            int i;
            synchronized (this) {
                for (; ; ) {
                    if (exception != null) return;
                    if (readPos > writePos) i = -readPos + capacity - -writePos;
                    else i = writePos - readPos;
                    if (i > 0) break;
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
            try {
                if (capacity >= readPos - -i) outputStream.write(buffer, readPos, i);
                else {
                    int i_0_ = -readPos + capacity;
                    outputStream.write(buffer, readPos, i_0_);
                    outputStream.write(buffer, 0, -i_0_ + i);
                }
            } catch (IOException ioexception) {
                synchronized (this) {
                    exception = ioexception;
                    break;
                }
            }
            synchronized (this) {
                readPos = (readPos + i) % capacity;
            }
        }
    }

    final void closeAndJoin(byte i) {
        synchronized (this) {
            if (exception == null) exception = new IOException("");
            this.notifyAll();
        }
        anInt2714++;
        if (i != -99) exception = null;
        try {
            thread.join();
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
    }

    final void detachOutput(int i) {
        if (i != -21179) method1525((byte) 113);
        anInt2711++;
        outputStream = new OutputStream_Sub1();
    }

    final void queueWrite(byte i, int i_1_, int i_2_, byte[] is) throws IOException {
        anInt2709++;
        if (i_1_ < 0 || i_2_ < 0 || i_1_ + i_2_ > is.length) throw new IOException();
        synchronized (this) {
            if (exception != null) throw new IOException(exception.toString());
            int i_3_;
            if (readPos <= writePos) i_3_ = readPos + capacity - (writePos - -1);
            else i_3_ = -1 + (-writePos + readPos);
            if (i_3_ < i_1_) throw new IOException("");
            if (i < 4) detachOutput(65);
            if (i_1_ + writePos > capacity) {
                int i_4_ = capacity - writePos;
                Component313.arraycopy(is, i_2_, buffer, writePos, i_4_);
                Component313.arraycopy(is, i_2_ - -i_4_, buffer, 0, -i_4_ + i_1_);
            } else Component313.arraycopy(is, i_2_, buffer, writePos, i_1_);
            writePos = (i_1_ + writePos) % capacity;
            this.notifyAll();
        }
    }

    Component222(OutputStream outputstream, int i) {
        outputStream = outputstream;
        capacity = 1 + i;
        buffer = new byte[capacity];
        thread = new Thread(this);
        thread.setDaemon(true);
        thread.start();
    }
}
