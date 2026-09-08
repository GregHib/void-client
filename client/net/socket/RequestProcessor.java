/* RequestProcessor - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class169` (JODE-obfuscated).
 * Runnable that processes a NodeList queue of Request nodes (Request). enqueue enqueues a string request; the run loop (processQueue) wakes and dispatches them.
 */

import jagex3.jagmisc.jagmisc;

import java.net.InetAddress;

final class RequestProcessor implements Runnable {
    static int anInt2257;
    private NodeList aClass262_2258 = new NodeList();
    private Thread aThread2259 = new Thread(this);
    static Component24[] aClass105Array2260;
    static Component248[] aClass19Array2261;
    static int anInt2262;
    static int anInt2263;
    static int anInt2264 = 0;
    static int anInt2265 = Component80.method2253(1600, 124);
    static int anInt2266;

    public final void run() {
        anInt2263++;
        for (; ; ) {
            Request class348_sub26;
            synchronized (aClass262_2258) {
                Node class348;
                for (class348 = aClass262_2258.peekFirst(8); class348 == null; class348 = aClass262_2258.peekFirst(8)) {
                    try {
                        aClass262_2258.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
                if (!(class348 instanceof Request)) break;
                class348_sub26 = (Request) class348;
            }
            int i;
            try {
                byte[] is = InetAddress.getByName(class348_sub26.aString6888).getAddress();
                i = jagmisc.ping(is[0], is[1], is[2], is[3], 1000L);
            } catch (Throwable throwable) {
                i = 1000;
            }
            class348_sub26.anInt6887 = i;
        }
    }

    public static void method1300(byte i) {
        if (i < -127) {
            aClass105Array2260 = null;
            aClass19Array2261 = null;
        }
    }

    static final void method1301(r var_r, int i, int i_0_, int i_1_, boolean[] bools) {
        if (ShaderSub1.aSArray5191 != Component9.aSArray4142) {
            int i_2_ = NodeSub1Sub1.aSArray8801[i].getInterpolatedHeight(i_0_, i_1_, (byte) -93);
            for (int i_3_ = 0; i_3_ <= i; i_3_++) {
                if (bools == null || bools[i_3_]) {
                    s var_s = NodeSub1Sub1.aSArray8801[i_3_];
                    if (var_s != null) var_s.Interface4Impl(var_r, i_0_, i_2_ - var_s.getInterpolatedHeight(i_0_, i_1_, (byte) -103), i_1_, 0, false);
                }
            }
        }
    }

    public RequestProcessor() {
        aThread2259.setDaemon(true);
        aThread2259.start();
    }

    final Request enqueue(int i, String string) {
        anInt2266++;
        if (aThread2259 == null) throw new IllegalStateException("");
        if (string == null) throw new IllegalArgumentException("");
        if (i != -5255) aClass262_2258 = null;
        Request class348_sub26 = new Request(string);
        processQueue(1000, class348_sub26);
        return class348_sub26;
    }

    final void method1303(byte i) {
        anInt2257++;
        if (aThread2259 != null) {
            processQueue(1000, new Node());
            try {
                aThread2259.join();
            } catch (InterruptedException interruptedexception) {
                /* empty */
            }
            aThread2259 = null;
            if (i != 16) anInt2264 = 87;
        }
    }

    private final void processQueue(int i, Node class348) {
        if (i != 1000) method1303((byte) 95);
        synchronized (aClass262_2258) {
            aClass262_2258.addTail(class348, -20180);
            aClass262_2258.notify();
        }
        anInt2262++;
    }
}
