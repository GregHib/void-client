/* Class202 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

final class Class202 implements Runnable {
    static int anInt2646;
    static int anInt2647;
    private int anInt2648 = 0;
    private final Class297 aClass297_2649;
    static int anInt2650;
    static int anInt2651;
    private InputStream anInputStream2652;
    static int anInt2653;
    private boolean aBoolean2654 = false;
    static int anInt2655;
    private int anInt2656 = 0;
    private OutputStream anOutputStream2657;
    private Class144 aClass144_2658;
    private boolean aBoolean2659 = false;
    static int anInt2660;
    static Class351 aClass351_2661 = new Class351(24, 7);
    static int anInt2662;
    private byte[] aByteArray2663;
    static int anInt2664;
    static Class114 aClass114_2665 = new Class114(12, 0);
    static int anInt2666;
    static int anInt2667;
    private final Socket aSocket2668;
    private final int anInt2669;
    static int anInt2670 = 0;
    static Class60 aClass60_2671 = new Class60(10);

    final int method1467(byte i) throws IOException {
        anInt2651++;
        if (i != 83)
            aClass114_2665 = null;
        if (aBoolean2654)
            return 0;
        return anInputStream2652.available();
    }

    final void method1468(int i) {
        anInt2667++;
        if (!aBoolean2654) {
            if (i < 63)
                anOutputStream2657 = null;
            anInputStream2652 = new InputStream_Sub2();
            anOutputStream2657 = new OutputStream_Sub2();
        }
    }

    static final void method1469(int i) {
        anInt2662++;
        Class286.anInt3682 = 0;
        Class239_Sub24.anInt6095 = 0;
        int i_0_ = 29 % ((-42 - i) / 63);
        for (int i_1_ = 0;
             Class250.anInt3225 > i_1_; i_1_++) {
            int i_2_ = Class31.anInt425 * i_1_;
            for (int i_3_ = 0; i_3_ < Class31.anInt425; i_3_++) {
                int i_4_ = i_2_ - -i_3_;
                Class92.anInterface4Array1525[i_4_].method15
                        (i_3_ * Class58.anInt1067, i_1_ * Class344.anInt4267,
                                Class58.anInt1067, Class344.anInt4267, 0, 0, true, true);
            }
        }
    }

    final void method1470(byte[] is, int i, int i_5_, int i_6_)
            throws IOException {
        anInt2655++;
        if (!aBoolean2654) {
            if (aBoolean2659) {
                aBoolean2659 = false;
                throw new IOException();
            }
            if (aByteArray2663 == null)
                aByteArray2663 = new byte[anInt2669];
            synchronized (this) {
                if (i_6_ != -1) {
                    /* empty */
                } else {
                    for (int i_7_ = 0; i_7_ < i;
                         i_7_++) {
                        aByteArray2663[anInt2648] = is[i_7_ + i_5_];
                        anInt2648 = (anInt2648 - -1) % anInt2669;
                        if (anInt2648 == (anInt2656 - (-anInt2669 - -100)) % anInt2669)
                            throw new IOException();
                    }
                    if (aClass144_2658 == null)
                        aClass144_2658
                                = aClass297_2649.method2236(this, -10240, 3);
                    this.notifyAll();
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

    final void method1472(boolean bool) throws IOException {
        anInt2650++;
        if (bool == true && !aBoolean2654) {
            if (aBoolean2659) {
                aBoolean2659 = false;
                throw new IOException();
            }
        }
    }

    final int method1473(int i) throws IOException {
        anInt2647++;
        if (aBoolean2654)
            return 0;
        if (i != 0)
            return 38;
        return anInputStream2652.read();
    }

    public final void run() {
        try {
            for (; ; ) {
                int i;
                int i_8_;
                synchronized (this) {
                    if (anInt2648 == anInt2656) {
                        if (aBoolean2654)
                            break;
                        try {
                            this.wait();
                        } catch (InterruptedException interruptedexception) {
                            /* empty */
                        }
                    }
                    i = anInt2656;
                    if (anInt2656 > anInt2648)
                        i_8_ = anInt2669 - anInt2656;
                    else
                        i_8_ = -anInt2656 + anInt2648;
                }
                if (i_8_ > 0) {
                    try {
                        anOutputStream2657.write(aByteArray2663, i, i_8_);
                    } catch (IOException ioexception) {
                        aBoolean2659 = true;
                    }
                    anInt2656 = (i_8_ + anInt2656) % anInt2669;
                    try {
                        if (anInt2648 == anInt2656)
                            anOutputStream2657.flush();
                    } catch (IOException ioexception) {
                        aBoolean2659 = true;
                    }
                }
            }
            try {
                if (anInputStream2652 != null)
                    anInputStream2652.close();
                if (anOutputStream2657 != null)
                    anOutputStream2657.close();
                if (aSocket2668 != null)
                    aSocket2668.close();
            } catch (IOException ioexception) {
                /* empty */
            }
            aByteArray2663 = null;
        } catch (Exception exception) {
            Class156.method1242(null, exception, 15004);
        }
        anInt2664++;
    }

    final void method1474(byte[] is, int i, byte i_9_, int i_10_)
            throws IOException {
        anInt2666++;
        if (!aBoolean2654) {
            while (i_10_ > 0) {
                int i_11_ = anInputStream2652.read(is, i, i_10_);
                if (i_11_ <= 0)
                    throw new EOFException();
                i_10_ -= i_11_;
                i += i_11_;
            }
            if (i_9_ != -72)
                run();
        }
    }

    static final boolean method1475(byte i, int i_12_, int i_13_) {
        anInt2653++;
        if (i > -95)
            method1469(-48);
        return (Class286_Sub9.method2174((byte) -115, i_13_, i_12_)
                & Class137.method1163(i_12_, (byte) -72, i_13_));
    }

    protected final void finalize() {
        anInt2646++;
        method1476((byte) -126);
    }

    final void method1476(byte i) {
        anInt2660++;
        if (!aBoolean2654) {
            synchronized (this) {
                aBoolean2654 = true;
                if (i > -120)
                    method1476((byte) -105);
                this.notifyAll();
            }
            if (aClass144_2658 != null) {
                while (aClass144_2658.anInt1997 == 0)
                    Class286_Sub5.method2161((byte) 105, 1L);
                if (aClass144_2658.anInt1997 == 1) {
                    try {
                        ((Thread) aClass144_2658.anObject1998).join();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
            aClass144_2658 = null;
        }
    }

    Class202(Socket socket, Class297 class297, int i) throws IOException {
        try {
            aSocket2668 = socket;
            aClass297_2649 = class297;
            aSocket2668.setSoTimeout(30000);
            aSocket2668.setTcpNoDelay(true);
            anInputStream2652 = aSocket2668.getInputStream();
            anOutputStream2657 = aSocket2668.getOutputStream();
            anInt2669 = i;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("re.<init>("
                            + (socket != null ? "{...}"
                            : "null")
                            + ','
                            + (class297 != null ? "{...}"
                            : "null")
                            + ',' + i + ')'));
        }
    }
}
