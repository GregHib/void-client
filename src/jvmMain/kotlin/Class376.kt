import java.io.EOFException
import java.io.IOException
import java.io.InputStream

class Class376(private var anInputStream4548: InputStream, i: Int) : Runnable {
    private var anInt4546: Int
    private val aByteArray4554: ByteArray
    private var anInt4556 = 0
    private val aThread4557: Thread
    private var anInt4558 = 0
    private var anIOException4560: IOException? = null

    fun method3615(i: Int) {
        synchronized(this) {
            if (i != 15984) run()
            if (anIOException4560 == null) anIOException4560 = IOException("")
            (this as Object).notifyAll()
        }
        anInt4552++
        try {
            aThread4557.join()
        } catch (interruptedexception: InterruptedException) {
            /* empty */
        }
    }

    override fun run() {
        anInt4553++
        loop@ while (true) {
            var i: Int
            synchronized(this) {
                while (true) {
                    if (anIOException4560 != null) return
                    if (anInt4556 != 0) {
                        if (anInt4556 < anInt4558) i = -anInt4558 + anInt4546
                        else i = -1 + anInt4556 - anInt4558
                    } else i = -1 + (anInt4546 + -anInt4558)
                    if (i > 0) break
                    try {
                        (this as Object).wait()
                    } catch (interruptedexception: InterruptedException) {
                        /* empty */
                    }
                }
            }
            val i_1_: Int
            try {
                i_1_ = anInputStream4548.read(aByteArray4554, anInt4558, i)
                if (i_1_ == -1) throw EOFException()
            } catch (ioexception: IOException) {
                synchronized(this) {
                    anIOException4560 = ioexception
                }
                break@loop
            }
            synchronized(this) {
                anInt4558 = (i_1_ + anInt4558) % anInt4546
            }
        }
    }

    @Throws(IOException::class)
    fun method3617(i: Int, i_2_: Int, i_3_: Int, `is`: ByteArray): Int {
        var i = i
        anInt4555++
        if (i < 0 || i_2_ < 0 || `is`.size < i_2_ + i) throw IOException()
        synchronized(this) {
            val i_4_: Int
            if (anInt4556 <= anInt4558) i_4_ = anInt4558 + -anInt4556
            else i_4_ = anInt4546 + (-anInt4556 - -anInt4558)
            if (i_4_ < i) i = i_4_
            if (i_3_ == i && anIOException4560 != null) throw IOException(anIOException4560.toString())
            if (anInt4546 < i + anInt4556) {
                val i_5_ = anInt4546 - anInt4556
                Class214.method1577(aByteArray4554, anInt4556, `is`, i_2_, i_5_)
                Class214.method1577(aByteArray4554, 0, `is`, i_2_ - -i_5_, i - i_5_)
            } else Class214.method1577(aByteArray4554, anInt4556, `is`, i_2_, i)
            anInt4556 = (anInt4556 - -i) % anInt4546
            (this as Object).notifyAll()
            return i
        }
    }

    fun method3618(i: Int) {
        anInt4550++
        if (i != 0) anInt4546 = 110
        anInputStream4548 = InputStream_Sub1()
    }

    @Throws(IOException::class)
    fun method3619(i: Int, bool: Boolean): Boolean {
        anInt4551++
        if (i <= 0 || i >= anInt4546) throw IOException()
        synchronized(this) {
            val i_6_: Int
            if (anInt4556 > anInt4558) i_6_ = -anInt4556 + anInt4546 - -anInt4558
            else i_6_ = anInt4558 - anInt4556
            if (i > i_6_) {
                if (anIOException4560 != null) throw IOException(anIOException4560.toString())
                return false
            }
            return bool == false
        }
    }

    init {
        anInt4546 = i - -1
        aByteArray4554 = ByteArray(anInt4546)
        aThread4557 = Thread(this)
        aThread4557.setDaemon(true)
        aThread4557.start()
    }

    companion object {
        @JvmField
        var anInt4547: Int = 0
        @JvmField
        var anInt4549: Int = 0
        @JvmField
        var anInt4550: Int = 0
        @JvmField
        var anInt4551: Int = 0
        @JvmField
        var anInt4552: Int = 0
        @JvmField
        var anInt4553: Int = 0
        @JvmField
        var anInt4555: Int = 0
        @JvmField
        var anInt4559: Int = 0
        @JvmStatic
        fun method3616(i: Int) {
            anInt4549++
            if (Class182.anInterface16Array2447 != null) {
                val interface16s = Class182.anInterface16Array2447!!
                for (i_0_ in interface16s.indices) {
                    val interface16 = interface16s[i_0_]
                    interface16!!.method57(108)
                }
            }
            if (i != 12639) anInt4559 = 72
        }

        @JvmStatic
        fun method3620(class318_sub1_sub3: Class318_Sub1_Sub3?, i: Int): Class148 {
            if (i < 9) anInt4559 = -27
            anInt4547++
            val class148: Class148
            if (Class16.aClass148_231 != null) {
                class148 = Class16.aClass148_231!!
                Class16.aClass148_231 = Class16.aClass148_231!!.aClass148_2038
                class148.aClass148_2038 = null
                ha_Sub2.anInt7722--
            } else class148 = Class148()
            class148.aClass318_Sub1_Sub3_2040 = class318_sub1_sub3
            return class148
        }
    }
}
