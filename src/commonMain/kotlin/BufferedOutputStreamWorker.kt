import kotlin.jvm.JvmStatic
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import io.IOException
import io.OutputStream

/*
 * Class208
 *
 * P2 (byte-ring-buffer producer/consumer) fused with a P3-style shutdown carried on the same
 * field: anIOException2704 doubles as "stop" and "error to report to the next writer". The
 * ring-buffer indices stay behind the existing withLock (synchronous critical sections only,
 * so no coroutine Mutex needed); dataAvailable is a nudge-only signal (no data flows through
 * it) used both for "new bytes queued" (P2) and "stop requested" (P3), exactly as the original
 * reused one monitor's notify for both purposes.
 */
class BufferedOutputStreamWorker internal constructor(private var anOutputStream2712: OutputStream, i: Int) {
    private var anIOException2704: IOException? = null
    private var anInt2705 = 0
    private val aByteArray2706: ByteArray
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    private val job: Job
    private var anInt2713 = 0
    private val anInt2715: Int
    private val dataAvailable = Channel<Unit>(Channel.CONFLATED)

    private suspend fun run() {
        anInt2710++
        while (true) {
            var i: Int = 0
            while (true) {
                withLock(this) {
                    if (anIOException2704 != null) return
                    i = if (anInt2705 > anInt2713) anInt2715 - anInt2705 + anInt2713 else anInt2713 - anInt2705
                }
                if (i > 0) break
                dataAvailable.receive()
            }
            try {
                if (anInt2715 >= anInt2705 - -i) anOutputStream2712.write(aByteArray2706, anInt2705, i)
                else {
                    val i_0_ = -anInt2705 + anInt2715
                    anOutputStream2712.write(aByteArray2706, anInt2705, i_0_)
                    anOutputStream2712.write(aByteArray2706, 0, -i_0_ + i)
                }
            } catch (ioexception: IOException) {
                withLock(this) { anIOException2704 = ioexception }
                break
            }
            withLock(this) { anInt2705 = (anInt2705 + i) % anInt2715 }
        }
    }

    fun method1526(i: Byte) {
        withLock(this) {
            if (anIOException2704 == null) anIOException2704 = IOException("")
        }
        dataAvailable.trySend(Unit)
        anInt2714++
        if (i.toInt() != -99) anIOException2704 = null
    }

    fun method1527(i: Int) {
        if (i != -21179) method1525(113.toByte())
        anInt2711++
        anOutputStream2712 = FireParticleStream()
    }

    @Throws(IOException::class)
    fun method1528(i: Byte, i_1_: Int, i_2_: Int, `is`: ByteArray) {
        anInt2709++
        if (i_1_ < 0 || i_2_ < 0 || i_1_ + i_2_ > `is`.size) throw IOException()
        withLock(this) {
            if (anIOException2704 != null) throw IOException(anIOException2704.toString())
            val i_3_: Int
            if (anInt2705 <= anInt2713) i_3_ = anInt2705 + anInt2715 - (anInt2713 - -1)
            else i_3_ = -1 + (-anInt2713 + anInt2705)
            if (i_3_ < i_1_) throw IOException("")
            if (i < 4) method1527(65)
            if (i_1_ + anInt2713 > anInt2715) {
                val i_4_ = anInt2715 - anInt2713
                ArrayCopyUtil.method1577(`is`, i_2_, aByteArray2706, anInt2713, i_4_)
                ArrayCopyUtil.method1577(`is`, i_2_ - -i_4_, aByteArray2706, 0, -i_4_ + i_1_)
            } else ArrayCopyUtil.method1577(`is`, i_2_, aByteArray2706, anInt2713, i_1_)
            anInt2713 = (i_1_ + anInt2713) % anInt2715
        }
        dataAvailable.trySend(Unit)
    }

    init {
        anInt2715 = 1 + i
        aByteArray2706 = ByteArray(anInt2715)
        job = scope.launch { run() }
    }

    companion object {

        var aNodeDeque_2707: NodeDeque? = NodeDeque()
        var anInt2709: Int = 0
        var anInt2710: Int = 0
        var anInt2711: Int = 0
        var anInt2714: Int = 0
        @JvmStatic
        fun method1525(i: Byte) {
            if (i.toInt() != 4) aNodeDeque_2707 = null
            aNodeDeque_2707 = null
        }
    }
}
