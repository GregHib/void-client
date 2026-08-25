import kotlin.jvm.JvmStatic
import CircleRasterizer.Companion.method2253
import jagex3.jagmisc.jagmisc.ping
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import net.getByName

/*
 * Class169
 *
 * P2 producer/consumer with a genuine poison-pill-free P3 shutdown: the original enqueued a
 * sentinel node through the same queue to unblock the consumer. A Channel's own close() already
 * lets in-flight queued items drain before iteration ends, so the sentinel is no longer needed.
 * method1303 is reachable from Client.method80's shutdown/error-recovery path (same call chain
 * as ScrollingNoiseTexture.method556), so it does not join the worker - it closes the channel
 * and returns without waiting, matching the ScrollingNoiseTexture decision.
 */
class HostPingThread {
    private val requests = Channel<NamedIdEntry>(Channel.UNLIMITED)
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    private var job: Job? = scope.launch { run() }

    private suspend fun run() {
        anInt2263++
        for (class348_sub26 in requests) {
            var i: Int
            try {
                val `is` = getByName(class348_sub26.aString6888).getAddress()
                i = ping(`is`[0], `is`[1], `is`[2], `is`[3], 1000L)
            } catch (throwable: Throwable) {
                i = 1000
            }
            class348_sub26.anInt6887 = i
        }
    }

    fun method1302(i: Int, string: String): NamedIdEntry {
        anInt2266++
        checkNotNull(job) { "" }
        requireNotNull(string) { "" }
        val class348_sub26 = NamedIdEntry(string)
        requests.trySend(class348_sub26)
        anInt2262++
        return class348_sub26
    }

    fun method1303(i: Byte) {
        anInt2257++
        if (job != null) {
            requests.close()
            job = null
            if (i.toInt() != 16) anInt2264 = 87
        }
    }

    companion object {
        var anInt2257: Int = 0

        var aAbstractModelRendererArray2260: Array<AbstractModelRenderer?>? = null

        var aWorldListEntryArray2261: Array<WorldListEntry?>? = null
        var anInt2262: Int = 0
        var anInt2263: Int = 0

        var anInt2264: Int = 0

        var anInt2265: Int = method2253(1600, 124)
        var anInt2266: Int = 0

        @JvmStatic
        fun method1300(i: Byte) {
            if (i < -127) {
                aAbstractModelRendererArray2260 = null
                aWorldListEntryArray2261 = null
            }
        }

        @JvmStatic
        fun method1301(var_renderNode: RenderNode?, i: Int, i_0_: Int, i_1_: Int, bools: BooleanArray?) {
            if (ActorEntity.aTerrainTileArray5191 != ActorEntity.aTerrainTileArray4142) {
                val i_2_ = TerrainTileShape.aTerrainTileArray8801!![i]!!.method3986(i_0_, i_1_, (-93).toByte())
                for (i_3_ in 0..i) {
                    if (bools == null || bools[i_3_]) {
                        val var_s = TerrainTileShape.aTerrainTileArray8801!![i_3_]
                        if (var_s != null) var_s.wa(var_renderNode, i_0_, i_2_ - var_s.method3986(i_0_, i_1_, (-103).toByte()), i_1_, 0, false)
                    }
                }
            }
        }
    }
}
