import kotlin.jvm.JvmStatic
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import io.EOFException
import io.IOException
import io.InputStream

/*
 * Class376
 *
 * P2 (byte-ring-buffer producer/consumer), mirror image of BufferedOutputStreamWorker: here the
 * background run() is the producer (reads from the InputStream, fills the buffer, waits for free
 * space) and the external method3617 caller is the consumer (drains the buffer, frees space).
 * spaceAvailable is a nudge-only signal reused for both "space freed" (P2) and "stop requested"
 * (P3, method3615), matching the original single monitor's dual-purpose notify.
 */
class RingBufferInputStream(private var anInputStream4548: InputStream, i: Int) {
    private var anInt4546: Int
    private val aByteArray4554: ByteArray
    private var anInt4556 = 0
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    private val job: Job
    private var anInt4558 = 0
    private var anIOException4560: IOException? = null
    private val spaceAvailable = Channel<Unit>(Channel.CONFLATED)

    fun method3615(i: Int) {
        // The only caller always passes 15984; the original's `if (i != 15984) run()` branch
        // that re-entered the worker loop synchronously was therefore dead code and is dropped.
        withLock(this) {
            if (anIOException4560 == null) anIOException4560 = IOException("")
        }
        spaceAvailable.trySend(Unit)
        anInt4552++
    }

    private suspend fun run() {
        anInt4553++
        loop@ while (true) {
            var i: Int = 0
            while (true) {
                withLock(this) {
                    if (anIOException4560 != null) return
                    i = if (anInt4556 != 0) {
                        if (anInt4556 < anInt4558) -anInt4558 + anInt4546 else -1 + anInt4556 - anInt4558
                    } else -1 + (anInt4546 + -anInt4558)
                }
                if (i > 0) break
                spaceAvailable.receive()
            }
            val i_1_: Int
            try {
                i_1_ = anInputStream4548.read(aByteArray4554, anInt4558, i)
                if (i_1_ == -1) throw EOFException()
            } catch (ioexception: IOException) {
                withLock(this) {
                    anIOException4560 = ioexception
                }
                break@loop
            }
            withLock(this) {
                anInt4558 = (i_1_ + anInt4558) % anInt4546
            }
        }
    }

    @Throws(IOException::class)
    fun method3617(i: Int, i_2_: Int, i_3_: Int, `is`: ByteArray): Int {
        var i = i
        anInt4555++
        if (i < 0 || i_2_ < 0 || `is`.size < i_2_ + i) throw IOException()
        withLock(this) {
            val i_4_: Int
            if (anInt4556 <= anInt4558) i_4_ = anInt4558 + -anInt4556
            else i_4_ = anInt4546 + (-anInt4556 - -anInt4558)
            if (i_4_ < i) i = i_4_
            if (i_3_ == i && anIOException4560 != null) throw IOException(anIOException4560.toString())
            if (anInt4546 < i + anInt4556) {
                val i_5_ = anInt4546 - anInt4556
                ArrayCopyUtil.method1577(aByteArray4554, anInt4556, `is`, i_2_, i_5_)
                ArrayCopyUtil.method1577(aByteArray4554, 0, `is`, i_2_ - -i_5_, i - i_5_)
            } else ArrayCopyUtil.method1577(aByteArray4554, anInt4556, `is`, i_2_, i)
            anInt4556 = (anInt4556 - -i) % anInt4546
        }
        spaceAvailable.trySend(Unit)
        return i
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
        withLock(this) {
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
        job = scope.launch { run() }
    }

    companion object {

        var anInt4547: Int = 0

        var anInt4549: Int = 0

        var anInt4550: Int = 0

        var anInt4551: Int = 0

        var anInt4552: Int = 0

        var anInt4553: Int = 0

        var anInt4555: Int = 0

        var anInt4559: Int = 0
        @JvmStatic
        fun method3616(i: Int) {
            anInt4549++
            if (LoadProgressCounters.anCursorControllerArray2447 != null) {
                val interface16s = LoadProgressCounters.anCursorControllerArray2447!!
                for (i_0_ in interface16s.indices) {
                    val interface16 = interface16s[i_0_]
                    interface16!!.method57(108)
                }
            }
            if (i != 12639) anInt4559 = 72
        }

        @JvmStatic
        fun method3620(class318_sub1_sub3: GroundDecorEntity?, i: Int): WidgetNodeLink {
            if (i < 9) anInt4559 = -27
            anInt4547++
            val widgetNodeLink: WidgetNodeLink
            if (SceneTilePlaneManager.aWidgetNodeLink_231 != null) {
                widgetNodeLink = SceneTilePlaneManager.aWidgetNodeLink_231!!
                SceneTilePlaneManager.aWidgetNodeLink_231 = SceneTilePlaneManager.aWidgetNodeLink_231!!.aWidgetNodeLink_2038
                widgetNodeLink.aWidgetNodeLink_2038 = null
                OpenGlRenderer.anInt7722--
            } else widgetNodeLink = WidgetNodeLink()
            widgetNodeLink.aClass318_Sub1_Sub3_2040 = class318_sub1_sub3
            return widgetNodeLink
        }
    }
}
