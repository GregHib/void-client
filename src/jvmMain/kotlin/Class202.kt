import Class156.Companion.method1242
import Class286_Sub5.Companion.method2161
import java.io.EOFException
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.net.Socket

class Class202 internal constructor(socket: Socket?, class297: Class297?, i: Int) : Runnable {
    private var anInt2648 = 0
    private val aClass297_2649: Class297?
    private var anInputStream2652: InputStream? = null
    private var aBoolean2654 = false
    private var anInt2656 = 0
    private var anOutputStream2657: OutputStream? = null
    private var aClass144_2658: Class144? = null
    private var aBoolean2659 = false
    private var aByteArray2663: ByteArray? = null
    private val aSocket2668: Socket?
    private val anInt2669: Int

    @Throws(IOException::class)
    fun method1467(i: Byte): Int {
        anInt2651++
        if (i.toInt() != 83) aClass114_2665 = null
        if (aBoolean2654) return 0
        return anInputStream2652!!.available()
    }

    fun method1468(i: Int) {
        anInt2667++
        if (!aBoolean2654) {
            if (i < 63) anOutputStream2657 = null
            anInputStream2652 = InputStream_Sub2()
            anOutputStream2657 = OutputStream_Sub2()
        }
    }

    @Throws(IOException::class)
    fun method1470(`is`: ByteArray, i: Int, i_5_: Int, i_6_: Int) {
        anInt2655++
        if (!aBoolean2654) {
            if (aBoolean2659) {
                aBoolean2659 = false
                throw IOException()
            }
            if (aByteArray2663 == null) aByteArray2663 = ByteArray(anInt2669)
            synchronized(this) {
                if (i_6_ == -1) {
                    for (i_7_ in 0..<i) {
                        aByteArray2663!![anInt2648] = `is`[i_7_ + i_5_]
                        anInt2648 = (anInt2648 - -1) % anInt2669
                        if (anInt2648 == (anInt2656 - (-anInt2669 - -100)) % anInt2669) throw IOException()
                    }
                    if (aClass144_2658 == null) aClass144_2658 = aClass297_2649!!.method2236(this, -10240, 3)
                    (this as Object).notifyAll()
                } else {
                    /* empty */
                }
            }
        }
    }

    @Throws(IOException::class)
    fun method1472(bool: Boolean) {
        anInt2650++
        if (bool == true && !aBoolean2654) {
            if (aBoolean2659) {
                aBoolean2659 = false
                throw IOException()
            }
        }
    }

    @Throws(IOException::class)
    fun method1473(i: Int): Int {
        anInt2647++
        if (aBoolean2654) return 0
        if (i != 0) return 38
        return anInputStream2652!!.read()
    }
    
    override fun run() {
        try {
            while (true) {
                val i: Int
                val i_8_: Int
                if (anInt2648 == anInt2656 && aBoolean2654) {
                    break
                }
                synchronized(this) {
                    if (anInt2648 == anInt2656) {
//                        if (aBoolean2654) break
                        try {
                            (this as Object).wait()
                        } catch (interruptedexception: InterruptedException) {
                            /* empty */
                        }
                    }
                    i = anInt2656
                    if (anInt2656 > anInt2648) i_8_ = anInt2669 - anInt2656
                    else i_8_ = -anInt2656 + anInt2648
                }
                if (i_8_ > 0) {
                    try {
                        anOutputStream2657!!.write(aByteArray2663, i, i_8_)
                    } catch (ioexception: IOException) {
                        aBoolean2659 = true
                    }
                    anInt2656 = (i_8_ + anInt2656) % anInt2669
                    try {
                        if (anInt2648 == anInt2656) anOutputStream2657!!.flush()
                    } catch (ioexception: IOException) {
                        aBoolean2659 = true
                    }
                }
            }
            try {
                if (anInputStream2652 != null) anInputStream2652!!.close()
                if (anOutputStream2657 != null) anOutputStream2657!!.close()
                if (aSocket2668 != null) aSocket2668.close()
            } catch (ioexception: IOException) {
                /* empty */
            }
            aByteArray2663 = null
        } catch (exception: Exception) {
            method1242(null, exception, 15004)
        }
        anInt2664++
    }

    @Throws(IOException::class)
    fun method1474(`is`: ByteArray, i: Int, i_9_: Byte, i_10_: Int) {
        var i = i
        var i_10_ = i_10_
        anInt2666++
        if (!aBoolean2654) {
            while (i_10_ > 0) {
                val i_11_ = anInputStream2652!!.read(`is`, i, i_10_)
                if (i_11_ <= 0) throw EOFException()
                i_10_ -= i_11_
                i += i_11_
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
            synchronized(this) {
                aBoolean2654 = true
                if (i > -120) method1476((-105).toByte())
                (this as Object).notifyAll()
            }
            if (aClass144_2658 != null) {
                while (aClass144_2658!!.anInt1997 == 0) method2161(105.toByte(), 1L)
                if (aClass144_2658!!.anInt1997 == 1) {
                    try {
                        (aClass144_2658!!.anObject1998 as Thread).join()
                    } catch (interruptedexception: InterruptedException) {
                        /* empty */
                    }
                }
            }
            aClass144_2658 = null
        }
    }

    init {
        try {
            aSocket2668 = socket
            aClass297_2649 = class297
            aSocket2668!!.setSoTimeout(30000)
            aSocket2668.setTcpNoDelay(true)
            anInputStream2652 = aSocket2668.getInputStream()
            anOutputStream2657 = aSocket2668.getOutputStream()
            anInt2669 = i
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("re.<init>(" + (if (socket != null) "{...}" else "null") + ',' + (if (class297 != null) "{...}" else "null") + ',' + i + ')'))
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
        @JvmField
        var aClass351_2661: Class351? = Class351(24, 7)
        var anInt2662: Int = 0
        var anInt2664: Int = 0
        var aClass114_2665: Class114? = Class114(12, 0)
        var anInt2666: Int = 0
        var anInt2667: Int = 0
        @JvmField
        var anInt2670: Int = 0
        @JvmField
        var aClass60_2671: Class60? = Class60(10)

        @JvmStatic
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

        @JvmStatic
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
