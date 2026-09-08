/* Component239 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Async ring-buffer reader over an {@link InputStream} (daemon thread).
 * Used by {@link TcpSocketStream} for non-blocking socket reads.
 */
final class Component239 implements Runnable {
    private int capacity;
    static int anInt4547;
    private InputStream inputStream;
    static int anInt4549;
    static int anInt4550;
    static int anInt4551;
    static int anInt4552;
    static int anInt4553;
    private final byte[] buffer;
    static int anInt4555;
    private int readPos = 0;
    private final Thread thread;
    private int writePos = 0;
    static int anInt4559 = 0;
    private IOException exception;

    final void closeAndJoin(int i) {
        synchronized (this) {
            if (i != 15984) run();
            if (exception == null) exception = new IOException("");
            this.notifyAll();
        }
        anInt4552++;
        try {
            thread.join();
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
    }

    static final void method3616(int i) {
        anInt4549++;
        if (Component280.anInterface16Array2447 != null) {
            Interface16[] interface16s = Component280.anInterface16Array2447;
            for (int i_0_ = 0; i_0_ < interface16s.length; i_0_++) {
                Interface16 interface16 = interface16s[i_0_];
                interface16.method57(108);
            }
        }
        if (i != 12639) anInt4559 = 72;
    }

    public final void run() {
        anInt4553++;
        for (; ; ) {
            int i;
            synchronized (this) {
                for (; ; ) {
                    if (exception != null) return;
                    if (readPos != 0) {
                        if (readPos < writePos) i = -writePos + capacity;
                        else i = -1 + readPos - writePos;
                    } else i = -1 + (capacity + -writePos);
                    if (i > 0) break;
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
            int i_1_;
            try {
                i_1_ = inputStream.read(buffer, writePos, i);
                if (i_1_ == -1) throw new EOFException();
            } catch (IOException ioexception) {
                synchronized (this) {
                    exception = ioexception;
                    break;
                }
            }
            synchronized (this) {
                writePos = (i_1_ + writePos) % capacity;
            }
        }
    }

    final int method3617(int i, int i_2_, int i_3_, byte[] is) throws IOException {
        anInt4555++;
        if (i < 0 || i_2_ < 0 || is.length < i_2_ + i) throw new IOException();
        synchronized (this) {
            int i_4_;
            if (readPos <= writePos) i_4_ = writePos + -readPos;
            else i_4_ = capacity + (-readPos - -writePos);
            if (i_4_ < i) i = i_4_;
            if (i_3_ == i && exception != null) throw new IOException(exception.toString());
            if (capacity < i + readPos) {
                int i_5_ = capacity - readPos;
                Component313.arraycopy(buffer, readPos, is, i_2_, i_5_);
                Component313.arraycopy(buffer, 0, is, i_2_ - -i_5_, i - i_5_);
            } else Component313.arraycopy(buffer, readPos, is, i_2_, i);
            readPos = (readPos - -i) % capacity;
            this.notifyAll();
            return i;
        }
    }

    final void detachInput(int i) {
        anInt4550++;
        if (i != 0) capacity = 110;
        inputStream = new InputStream_Sub1();
    }

    final boolean hasBytes(int i, boolean bool) throws IOException {
        anInt4551++;
        if (i <= 0 || i >= capacity) throw new IOException();
        synchronized (this) {
            int i_6_;
            if (readPos > writePos) i_6_ = -readPos + capacity - -writePos;
            else i_6_ = writePos - readPos;
            if (i > i_6_) {
                if (exception != null) throw new IOException(exception.toString());
                return false;
            }
            return bool == false;
        }
    }

    Component239(InputStream inputstream, int i) {
        capacity = i - -1;
        inputStream = inputstream;
        buffer = new byte[capacity];
        thread = new Thread(this);
        thread.setDaemon(true);
        thread.start();
    }

    static final Component3 method3620(Component327 class318_sub1_sub3, int i) {
        if (i < 9) anInt4559 = -27;
        anInt4547++;
        Component3 class148;
        if (Component110.aClass148_231 != null) {
            class148 = Component110.aClass148_231;
            Component110.aClass148_231 = Component110.aClass148_231.aClass148_2038;
            class148.aClass148_2038 = null;
            GlToolkitSub2.anInt7722--;
        } else class148 = new Component3();
        class148.aClass318_Sub1_Sub3_2040 = class318_sub1_sub3;
        return class148;
    }
}
