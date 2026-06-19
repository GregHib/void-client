import java.io.IOException
import java.net.Socket
import kotlin.math.atan2
import SocketGameConnectionStatics.anInt5828
import SocketGameConnectionStatics.anInt5831
import SocketGameConnectionStatics.anInt5833
import SocketGameConnectionStatics.anInt5835
import SocketGameConnectionStatics.anInt5838
import SocketGameConnectionStatics.anInt5839

class SocketGameConnection internal constructor(private val aSocket5836: Socket, i: Int) : AbstractGameSocket() {
    private var aRingBufferInputStream_5834: RingBufferInputStream?
    private val aBufferedOutputStreamWorker_5837: BufferedOutputStreamWorker

    @Throws(IOException::class)
    override fun method1706(i: Int, i_0_: Int, i_1_: Int, `is`: ByteArray) {
        anInt5833++
        aBufferedOutputStreamWorker_5837.method1528(5.toByte(), i_1_, i, `is`)
    }

    override fun method1702(i: Int) {
        anInt5828++
        aRingBufferInputStream_5834!!.method3618(0)
        val i_2_ = 29 / ((-25 - i) / 38)
        aBufferedOutputStreamWorker_5837.method1527(-21179)
    }

    override fun method1700(i: Byte) {
        anInt5839++
        try {
            aSocket5836.close()
        } catch (ioexception: IOException) {
            /* empty */
        }
        aRingBufferInputStream_5834!!.method3615(15984)
        if (i.toInt() == 36) aBufferedOutputStreamWorker_5837.method1526((-99).toByte())
    }

    @Throws(IOException::class)
    override fun method1701(i: Int, i_19_: Int, i_20_: Byte, `is`: ByteArray): Int {
        val i_21_ = 84 / ((-56 - i_20_) / 47)
        anInt5831++
        return aRingBufferInputStream_5834!!.method3617(i, i_19_, 0, `is`)
    }

    @Throws(IOException::class)
    override fun method1705(i: Int, i_22_: Int): Boolean {
        if (i_22_ <= 91) aRingBufferInputStream_5834 = null
        anInt5838++
        return aRingBufferInputStream_5834!!.method3619(i, false)
    }

    init {
        aSocket5836.setSoTimeout(30000)
        aSocket5836.setTcpNoDelay(true)
        aRingBufferInputStream_5834 = RingBufferInputStream(aSocket5836.getInputStream(), i)
        aBufferedOutputStreamWorker_5837 = BufferedOutputStreamWorker(aSocket5836.getOutputStream(), i)
    }

    protected fun finalize() {
        anInt5835++
        method1700(36.toByte())
    }
}
