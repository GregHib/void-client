import Class156.Companion.method1242
import Class286_Sub5.Companion.method2161

/**
 * JS5 content-stream pump. Originally wrapped a raw java.net.Socket with its own
 * InputStream/OutputStream + a writer-thread ring buffer. Now it delegates to a
 * [Class238] connection, which already owns the socket and its reader/writer pumps
 * (Class376 / Class208). This keeps JS5 platform-neutral: any Class238 impl (JVM
 * socket today, WebSocket/native later) drives JS5 unchanged.
 *
 * Behaviour preserved:
 *  - method1470: queue bytes to send (was a local ring + writer thread; now the
 *    connection's own write buffer provides the same async send + overflow backpressure).
 *  - method1467: available-byte count (was InputStream.available()).
 *  - method1473 / method1474: blocking reads (the connection's reader pump fills the
 *    buffer on its own thread; we block by polling read + sleeping, as the old
 *    InputStream.read did against the socket).
 *  - method1476: close.
 */
class Class202 internal constructor(connection: Class238?, i: Int) : Runnable {
    private val aClass238_2668: Class238?
    private var aBoolean2654 = false
    private val anInt2669: Int
    private val aByteArray2672 = ByteArray(1)

    @Throws(IOException::class)
    fun method1467(i: Byte): Int {
        anInt2651++
        if (i.toInt() != 83) aClass114_2665 = null
        if (aBoolean2654) return 0
        return aClass238_2668!!.availableCount()
    }

    fun method1468(i: Int) {
        anInt2667++
        // No-op: closing the connection (method1476) already tears down its streams.
        // The original installed dead InputStream_Sub2/OutputStream_Sub2 sentinels here;
        // the Class238 contract has no exposed streams to swap.
        if (i < 63) {
            /* empty */
        }
    }

    @Throws(IOException::class)
    fun method1470(`is`: ByteArray, i: Int, i_5_: Int, i_6_: Int) {
        anInt2655++
        if (!aBoolean2654) {
            if (i_6_ == -1) {
                // Hand the bytes to the connection's own buffered, async writer.
                // Overflow throws IOException inside the connection, matching the old ring.
                aClass238_2668!!.method1706(i_5_, 0, i, `is`)
            } else {
                /* empty */
            }
        }
    }

    @Throws(IOException::class)
    fun method1472(bool: Boolean) {
        anInt2650++
        if (bool == true && !aBoolean2654) {
            /* error-state check; the connection surfaces IO errors via its read/write calls */
        }
    }

    @Throws(IOException::class)
    fun method1473(i: Int): Int {
        anInt2647++
        if (aBoolean2654) return 0
        if (i != 0) return 38
        // Blocking single-byte read (the JS5 status byte). On the happy path the byte
        // is in the connection's read buffer and this returns its unsigned value, exactly
        // as the old InputStream.read() did. NOTE: on a dropped connection the old code
        // returned -1 here; the Class238 reader pump instead surfaces EOF as an
        // IOException once its buffer is drained. Both outcomes abort the JS5 handshake
        // (Client wraps this in catch(IOException)->method103), so the failure path still
        // aborts+retries; only the internal error code differs.
        while (true) {
            val n = aClass238_2668!!.method1701(1, 0, (-118).toByte(), aByteArray2672)
            if (n == 1) return aByteArray2672[0].toInt() and 0xff
            method2161((-118).toByte(), 1L)
        }
    }

    override fun run() {
        // The writer pump now lives in the Class238 connection (Class208). Nothing to do.
        anInt2664++
    }

    @Throws(IOException::class)
    fun method1474(`is`: ByteArray, i: Int, i_9_: Byte, i_10_: Int) {
        var i = i
        var i_10_ = i_10_
        anInt2666++
        if (!aBoolean2654) {
            while (i_10_ > 0) {
                val i_11_ = aClass238_2668!!.method1701(i_10_, i, (-118).toByte(), `is`)
                if (i_11_ < 0) throw EOFException()
                if (i_11_ == 0) {
                    // No bytes ready yet; the reader pump fills the buffer on its own
                    // thread. Yield briefly and retry, reproducing the old blocking read.
                    method2161((-118).toByte(), 1L)
                } else {
                    i_10_ -= i_11_
                    i += i_11_
                }
            }
            if (i_9_.toInt() != -72) run()
        }
    }

    protected fun finalize() {
        anInt2646++
        method1476((-126).toByte())
    }

    fun method1476(i: Byte) {
        anInt2660++
        if (!aBoolean2654) {
            aBoolean2654 = true
            if (i > -120) method1476((-105).toByte())
            try {
                aClass238_2668!!.method1700(36.toByte())
            } catch (exception: Exception) {
                /* empty */
            }
        }
    }

    init {
        try {
            aClass238_2668 = connection
            anInt2669 = i
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("re.<init>(" + (if (connection != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    companion object {
        var anInt2646: Int = 0
        var anInt2647: Int = 0
        var anInt2650: Int = 0
        var anInt2651: Int = 0
        var anInt2653: Int = 0
        var anInt2655: Int = 0
        var anInt2660: Int = 0
        var aClass351_2661: Class351? = Class351(24, 7)
        var anInt2662: Int = 0
        var anInt2664: Int = 0
        var aClass114_2665: Class114? = Class114(12, 0)
        var anInt2666: Int = 0
        var anInt2667: Int = 0
        var anInt2670: Int = 0
        var aClass60_2671: Class60? = Class60(10)

        fun method1469(i: Int) {
            anInt2662++
            Class286.anInt3682 = 0
            Class239_Sub24.anInt6095 = 0
            val i_0_ = 29 % ((-42 - i) / 63)
            var i_1_ = 0
            while (Class250.anInt3225 > i_1_) {
                val i_2_ = Class31.anInt425 * i_1_
                for (i_3_ in 0..<Class31.anInt425) {
                    val i_4_ = i_2_ - -i_3_
                    Class92.anInterface4Array1525!![i_4_]!!.method15(i_3_ * Class58.anInt1067, i_1_ * Class344.anInt4267, Class58.anInt1067, Class344.anInt4267, 0, 0, true, true)
                }
                i_1_++
            }
        }

        fun method1471(i: Byte) {
            if (i >= 80) {
                aClass60_2671 = null
                aClass114_2665 = null
                aClass351_2661 = null
            }
        }

        fun method1475(i: Byte, i_12_: Int, i_13_: Int): Boolean {
            anInt2653++
            if (i > -95) method1469(-48)
            return (Class286_Sub9.method2174((-115).toByte(), i_13_, i_12_) and Class137.method1163(i_12_, (-72).toByte(), i_13_))
        }
    }
}
