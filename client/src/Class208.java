/* Class208 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.io.OutputStream;

final class Class208 implements Runnable {
    private IOException anIOException2704;
    private int anInt2705 = 0;
    private final byte[] aByteArray2706;
    static Class262 aClass262_2707 = new Class262();
    private final Thread aThread2708;
    static int anInt2709;
    static int anInt2710;
    static int anInt2711;
    private OutputStream anOutputStream2712;
    private int anInt2713 = 0;
    static int anInt2714;
    private final int anInt2715;

    public static void method1525(byte i) {
        if (i != 4)
            aClass262_2707 = null;
        aClass262_2707 = null;
    }

    public final void run() {
        anInt2710++;
        for (; ; ) {
            int i;
            synchronized (this) {
                for (; ; ) {
                    if (anIOException2704 != null)
                        return;
                    if (anInt2705 > anInt2713)
                        i = -anInt2705 + anInt2715 - -anInt2713;
                    else
                        i = anInt2713 - anInt2705;
                    if (i > 0)
                        break;
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
            try {
                if (anInt2715 >= anInt2705 - -i)
                    anOutputStream2712.write(aByteArray2706, anInt2705, i);
                else {
                    int i_0_ = -anInt2705 + anInt2715;
                    anOutputStream2712.write(aByteArray2706, anInt2705, i_0_);
                    anOutputStream2712.write(aByteArray2706, 0, -i_0_ + i);
                }
            } catch (IOException ioexception) {
                synchronized (this) {
                    anIOException2704 = ioexception;
                    break;
                }
            }
            synchronized (this) {
                anInt2705 = (anInt2705 + i) % anInt2715;
            }
        }
    }

    final void method1526(byte i) {
        synchronized (this) {
            if (anIOException2704 == null)
                anIOException2704 = new IOException("");
            this.notifyAll();
        }
        anInt2714++;
        if (i != -99)
            anIOException2704 = null;
        try {
            aThread2708.join();
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
    }

    final void method1527(int i) {
        if (i != -21179)
            method1525((byte) 113);
        anInt2711++;
        anOutputStream2712 = new OutputStream_Sub1();
    }

    final void method1528(byte i, int i_1_, int i_2_, byte[] is)
            throws IOException {
        anInt2709++;
        if (i_1_ < 0 || i_2_ < 0
                || i_1_ + i_2_ > is.length)
            throw new IOException();
        synchronized (this) {
            if (anIOException2704 != null)
                throw new IOException(anIOException2704.toString());
            int i_3_;
            if (anInt2705 <= anInt2713)
                i_3_ = anInt2705 + anInt2715 - (anInt2713 - -1);
            else
                i_3_ = -1 + (-anInt2713 + anInt2705);
            if (i_3_ < i_1_)
                throw new IOException("");
            if (i < 4)
                method1527(65);
            if (i_1_ + anInt2713 > anInt2715) {
                int i_4_ = anInt2715 - anInt2713;
                Class214.method1577(is, i_2_, aByteArray2706, anInt2713, i_4_);
                Class214.method1577(is, i_2_ - -i_4_, aByteArray2706, 0,
                        -i_4_ + i_1_);
            } else
                Class214.method1577(is, i_2_, aByteArray2706, anInt2713, i_1_);
            anInt2713 = (i_1_ + anInt2713) % anInt2715;
            this.notifyAll();
        }
    }

    Class208(OutputStream outputstream, int i) {
        anOutputStream2712 = outputstream;
        anInt2715 = 1 + i;
        aByteArray2706 = new byte[anInt2715];
        aThread2708 = new Thread(this);
        aThread2708.setDaemon(true);
        aThread2708.start();
    }
}
