import CircleRasterizerStatics.method2253
import jagex3.jagmisc.jagmisc.ping
import java.net.InetAddress
import HostPingThreadStatics.anInt2257
import HostPingThreadStatics.anInt2262
import HostPingThreadStatics.anInt2263
import HostPingThreadStatics.anInt2264
import HostPingThreadStatics.anInt2266

/*
 * Class169
 */
class HostPingThread : Runnable {
    private var aNodeDeque_2258: NodeDeque? = NodeDeque()
    private var aThread2259: Thread? = Thread(this)
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
        val class348_sub26: NamedIdEntry?
        synchronized(aNodeDeque_2258!!) {
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

    init {
        aThread2259!!.setDaemon(true)
        aThread2259!!.start()
    }

    fun method1302(i: Int, string: String): NamedIdEntry {
        anInt2266++
        checkNotNull(aThread2259) { "" }
        requireNotNull(string) { "" }
        if (i != -5255) aNodeDeque_2258 = null
        val class348_sub26 = NamedIdEntry(string)
        method1304(1000, class348_sub26)
        return class348_sub26
    }

    fun method1303(i: Byte) {
        anInt2257++
        if (aThread2259 != null) {
            method1304(1000, LinkedListNode())
            try {
                aThread2259!!.join()
            } catch (interruptedexception: InterruptedException) {
                /* empty */
            }
            aThread2259 = null
            if (i.toInt() != 16) anInt2264 = 87
        }
    }

    private fun method1304(i: Int, linkedListNode: LinkedListNode) {
        if (i != 1000) method1303(95.toByte())
        synchronized(aNodeDeque_2258!!) {
            aNodeDeque_2258!!.method1999(linkedListNode, -20180)
            (aNodeDeque_2258 as Object).notify()
        }
        anInt2262++
    }
}
