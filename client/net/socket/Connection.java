/* Connection - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class202` (JODE-obfuscated).
 * Async socket writer ({@link Runnable}) plus blocking {@link #read}/{@link #readFully}/{@link #write}.
 * {@link #detachStreams} swaps real streams for dummies; {@link #close} joins the writer thread.
 */

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

final class Connection implements Runnable {
    static int anInt2646;
    static int anInt2647;
    private int writePos = 0;
    private final ReflectionInvoker invoker;
    static int anInt2650;
    static int anInt2651;
    private InputStream inputStream;
    static int anInt2653;
    private boolean closed = false;
    static int anInt2655;
    private int readPos = 0;
    private OutputStream outputStream;
    private Task writeTask;
    private boolean writeFailed = false;
    static int anInt2660;
    static StringCache aClass351_2661 = new StringCache(24, 7);
    static int anInt2662;
    private byte[] writeBuffer;
    static int anInt2664;
    static Component183 aClass114_2665 = new Component183(12, 0);
    static int anInt2666;
    static int anInt2667;
    private final Socket socket;
    private final int capacity;
    /** Affiliate id from applet {@code affid} (URL {@code /a=}). */
    static int affiliateId = 0;
    static NodeCache aClass60_2671 = new NodeCache(10);

    final int available(byte i) throws IOException {
        anInt2651++;
        if (i != 83) aClass114_2665 = null;
        if (closed) return 0;
        return inputStream.available();
    }

    /** Replace real streams with discard stubs (keep socket open). */
    final void detachStreams(int i) {
        anInt2667++;
        if (!closed) {
            if (i < 63) outputStream = null;
            inputStream = new InputStream_Sub2();
            outputStream = new OutputStream_Sub2();
        }
    }

    static final void method1469(int i) {
        anInt2662++;
        ShaderProgram.anInt3682 = 0;
        ColoredText.anInt6095 = 0;
        int i_0_ = 29 % ((-42 - i) / 63);
        for (int i_1_ = 0; AudioMixer.anInt3225 > i_1_; i_1_++) {
            int i_2_ = Component82.anInt425 * i_1_;
            for (int i_3_ = 0; i_3_ < Component82.anInt425; i_3_++) {
                int i_4_ = i_2_ - -i_3_;
                DisplayModeManagerContainer23.anInterface4Array1525[i_4_].method15(i_3_ * Component255.anInt1067, i_1_ * AbstractBuffer.anInt4267, Component255.anInt1067, AbstractBuffer.anInt4267, 0, 0, true, true);
            }
        }
    }

    final void write(byte[] is, int i, int i_5_, int i_6_) throws IOException {
        anInt2655++;
        if (!closed) {
            if (writeFailed) {
                writeFailed = false;
                throw new IOException();
            }
            if (writeBuffer == null) writeBuffer = new byte[capacity];
            synchronized (this) {
                if (i_6_ == -1) {
                    for (int i_7_ = 0; i_7_ < i; i_7_++) {
                        writeBuffer[writePos] = is[i_7_ + i_5_];
                        writePos = (writePos - -1) % capacity;
                        if (writePos == (readPos - (-capacity - -100)) % capacity) throw new IOException();
                    }
                    if (writeTask == null) writeTask = invoker.startThread(this, -10240, 3);
                    this.notifyAll();
                } else {
                    /* empty */
                }
            }
        }
    }

    public static void method1471(byte i) {
        if (i >= 80) {
            aClass60_2671 = null;
            aClass114_2665 = null;
            aClass351_2661 = null;
        }
    }

    final void checkError(boolean bool) throws IOException {
        anInt2650++;
        if (bool == true && !closed) {
            if (writeFailed) {
                writeFailed = false;
                throw new IOException();
            }
        }
    }

    final int read(int i) throws IOException {
        anInt2647++;
        if (closed) return 0;
        if (i != 0) return 38;
        return inputStream.read();
    }

    public final void run() {
        try {
            for (; ; ) {
                int i;
                int i_8_;
                synchronized (this) {
                    if (writePos == readPos) {
                        if (closed) break;
                        try {
                            this.wait();
                        } catch (InterruptedException interruptedexception) {
                            /* empty */
                        }
                    }
                    i = readPos;
                    if (readPos > writePos) i_8_ = capacity - readPos;
                    else i_8_ = -readPos + writePos;
                }
                if (i_8_ > 0) {
                    try {
                        outputStream.write(writeBuffer, i, i_8_);
                    } catch (IOException ioexception) {
                        writeFailed = true;
                    }
                    readPos = (i_8_ + readPos) % capacity;
                    try {
                        if (writePos == readPos) outputStream.flush();
                    } catch (IOException ioexception) {
                        writeFailed = true;
                    }
                }
            }
            try {
                if (inputStream != null) inputStream.close();
                if (outputStream != null) outputStream.close();
                if (socket != null) socket.close();
            } catch (IOException ioexception) {
                /* empty */
            }
            writeBuffer = null;
        } catch (Exception exception) {
            ClientErrorReporter.reportError(null, exception, 15004);
        }
        anInt2664++;
    }

    /** Read exactly {@code i_10_} bytes into {@code is} at {@code i}. */
    final void readFully(byte[] is, int i, byte i_9_, int i_10_) throws IOException {
        anInt2666++;
        if (!closed) {
            while (i_10_ > 0) {
                int i_11_ = inputStream.read(is, i, i_10_);
                if (i_11_ <= 0) throw new EOFException();
                i_10_ -= i_11_;
                i += i_11_;
            }
            if (i_9_ != -72) run();
        }
    }

    static final boolean method1475(byte i, int i_12_, int i_13_) {
        anInt2653++;
        if (i > -95) method1469(-48);
        return (ShaderProgramSub9.method2174((byte) -115, i_13_, i_12_) & CacheIndexReader.hasFlag0x800(i_12_, (byte) -72, i_13_));
    }

    protected final void finalize() {
        anInt2646++;
        close((byte) -126);
    }

    /** Signal writer thread to exit and join it. */
    final void close(byte i) {
        anInt2660++;
        if (!closed) {
            synchronized (this) {
                closed = true;
                if (i > -120) close((byte) -105);
                this.notifyAll();
            }
            if (writeTask != null) {
                while (writeTask.status == 0) SpriteAtlasShader.sleep((byte) 105, 1L);
                if (writeTask.status == 1) {
                    try {
                        ((Thread) writeTask.result).join();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
            writeTask = null;
        }
    }

    Connection(Socket socket, ReflectionInvoker class297, int i) throws IOException {
        try {
            this.socket = socket;
            invoker = class297;
            socket.setSoTimeout(30000);
            socket.setTcpNoDelay(true);
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
            capacity = i;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("re.<init>(" + (socket != null ? "{...}" : "null") + ',' + (class297 != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }
}
