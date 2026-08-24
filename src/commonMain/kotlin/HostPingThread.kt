import kotlin.jvm.JvmStatic
import CircleRasterizer.Companion.method2253
import jagex3.jagmisc.jagmisc.ping
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.net.InetAddress

/*
 * Class169
 */
class HostPingThread : Runnable {
    private var aNodeDeque_2258: NodeDeque? = NodeDeque()
    private var job: Job? = GlobalScope.launch(Dispatchers.Default) { run() }
    override fun run() {
        anInt2263++
        while (true) {
            val class348_sub26: NamedIdEntry = runClass348() ?: break
            var i: Int
            try {
                val `is` = InetAddress.getByName(class348_sub26!!.aString6888).getAddress()
                i = ping(`is`[0], `is`[1], `is`[2], `is`[3], 1000L)
            } catch (throwable: Throwable) {
                i = 1000
            }
            class348_sub26!!.anInt6887 = i
        }
    }

    fun runClass348(): NamedIdEntry? {
        var class348_sub26: NamedIdEntry? = null
        withLock(aNodeDeque_2258!!) {
            var linkedListNode: LinkedListNode?
            linkedListNode = aNodeDeque_2258!!.method1997(8)
            while (linkedListNode == null) {
                try {
                    (aNodeDeque_2258 as Object).wait()
                } catch (interruptedexception: InterruptedException) {
                    /* empty */
                }
                linkedListNode = aNodeDeque_2258!!.method1997(8)
            }
            if (linkedListNode !is NamedIdEntry) return null
            class348_sub26 = linkedListNode
        }
        return class348_sub26
    }

    fun method1302(i: Int, string: String): NamedIdEntry {
        anInt2266++
        checkNotNull(job) { "" }
        requireNotNull(string) { "" }
        if (i != -5255) aNodeDeque_2258 = null
        val class348_sub26 = NamedIdEntry(string)
        method1304(1000, class348_sub26)
        return class348_sub26
    }

    fun method1303(i: Byte) {
        anInt2257++
        if (job != null) {
            method1304(1000, LinkedListNode())
            try {
                runBlocking {
                    job!!.join()
                }
            } catch (interruptedexception: InterruptedException) {
                /* empty */
            }
            job = null
            if (i.toInt() != 16) anInt2264 = 87
        }
    }

    private fun method1304(i: Int, linkedListNode: LinkedListNode) {
        if (i != 1000) method1303(95.toByte())
        withLock(aNodeDeque_2258!!) {
            aNodeDeque_2258!!.method1999(linkedListNode, -20180)
            (aNodeDeque_2258 as Object).notify()
        }
        anInt2262++
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
