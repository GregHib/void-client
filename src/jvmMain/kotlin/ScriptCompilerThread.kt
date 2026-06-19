import TexGenMaterialPassStatics.method2161
import ScriptCompilerThreadStatics.method1052
import ScriptCompilerThreadStatics.aSpriteImage_1727
import ScriptCompilerThreadStatics.anInt1729
import ScriptCompilerThreadStatics.anInt1731
import ScriptCompilerThreadStatics.anInt1732
import ScriptCompilerThreadStatics.anInt1735
import ScriptCompilerThreadStatics.anInt1736
import ScriptCompilerThreadStatics.anInt1737

/* Class112 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ScriptCompilerThread internal constructor(privilegedOperationWorker: PrivilegedOperationWorker) : Runnable {
    private val aLinkedNodeListIterator_1730 = LinkedNodeListIterator()
    private var aThread1733: Thread?
    var anInt1734: Int = 0
    private var aBoolean1738 = false

    fun method1049(`is`: ByteArray?, indexedFileCache: IndexedFileCache?, i: Byte, i_0_: Int): CompletedResourceRequest {
        try {
            if (i.toInt() != 10) aBoolean1738 = false
            anInt1732++
            val class348_sub42_sub16_sub2 = CompletedResourceRequest()
            class348_sub42_sub16_sub2.aByteArray10461 = `is`
            class348_sub42_sub16_sub2.aBoolean9663 = false
            class348_sub42_sub16_sub2.aIndexedFileCache_10458 = indexedFileCache
            class348_sub42_sub16_sub2.aLong7057 = i_0_.toLong()
            class348_sub42_sub16_sub2.anInt10457 = 2
            method1050(class348_sub42_sub16_sub2, i + -123)
            return class348_sub42_sub16_sub2
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("aca.G(" + (if (`is` != null) "{...}" else "null") + ',' + (if (indexedFileCache != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ')'))
        }
    }

    private fun method1050(class348_sub42_sub16_sub2: CompletedResourceRequest, i: Int) {
        anInt1735++
        synchronized(aLinkedNodeListIterator_1730) {
            aLinkedNodeListIterator_1730.method1005(true, class348_sub42_sub16_sub2)
            anInt1734++
            if (i > -100) aSpriteImage_1727 = null
            (aLinkedNodeListIterator_1730 as Object).notifyAll()
        }
    }

    fun method1051(bool: Boolean) {
        aBoolean1738 = bool
        anInt1731++
        synchronized(aLinkedNodeListIterator_1730) {
            (aLinkedNodeListIterator_1730 as Object).notifyAll()
        }
        try {
            aThread1733!!.join()
        } catch (interruptedexception: InterruptedException) {
            /* empty */
        }
        aThread1733 = null
    }

    fun method1054(indexedFileCache: IndexedFileCache?, i: Int, i_19_: Byte): CompletedResourceRequest? {
        anInt1729++
        val class348_sub42_sub16_sub2 = CompletedResourceRequest()
        if (i_19_.toInt() != -112) return null
        class348_sub42_sub16_sub2.aBoolean9663 = false
        class348_sub42_sub16_sub2.anInt10457 = 3
        class348_sub42_sub16_sub2.aLong7057 = i.toLong()
        class348_sub42_sub16_sub2.aIndexedFileCache_10458 = indexedFileCache
        method1050(class348_sub42_sub16_sub2, -101)
        return class348_sub42_sub16_sub2
    }

    fun runClass348() : CompletedResourceRequest? {
        val class348_sub42_sub16_sub2: CompletedResourceRequest?
        synchronized(aLinkedNodeListIterator_1730) {
            class348_sub42_sub16_sub2 = (aLinkedNodeListIterator_1730.method1008(20) as? CompletedResourceRequest?)
            if (class348_sub42_sub16_sub2 == null) {
                try {
                    (aLinkedNodeListIterator_1730 as Object).wait()
                } catch (interruptedexception: InterruptedException) {
                    /* empty */
                }
                return null
            } else anInt1734--
        }
        return class348_sub42_sub16_sub2
    }

    override fun run() {
        while (!aBoolean1738) {
            val class348_sub42_sub16_sub2 = runClass348() ?: continue
            try {
                if ((class348_sub42_sub16_sub2!!.anInt10457) != 2) {
                    if (class348_sub42_sub16_sub2.anInt10457 == 3) class348_sub42_sub16_sub2.aByteArray10461 = (class348_sub42_sub16_sub2.aIndexedFileCache_10458!!.method1161(((-4).toByte()).toByte(), class348_sub42_sub16_sub2.aLong7057.toInt()))
                } else class348_sub42_sub16_sub2.aIndexedFileCache_10458!!.method1160(class348_sub42_sub16_sub2.aByteArray10461!!.size, (class348_sub42_sub16_sub2.aLong7057).toInt(), class348_sub42_sub16_sub2.aByteArray10461, -7305)
            } catch (exception: Exception) {
                LinkedListIteratorStatics.method1242(null, exception, 15004)
            }
            class348_sub42_sub16_sub2!!.aBoolean9664 = false
        }
        anInt1736++
    }

    fun method1055(indexedFileCache: IndexedFileCache, i: Int, i_20_: Byte): CompletedResourceRequest {
        if (i_20_ >= -98) method1052(110.toByte())
        anInt1737++
        val class348_sub42_sub16_sub2 = CompletedResourceRequest()
        class348_sub42_sub16_sub2.anInt10457 = 1
        synchronized(aLinkedNodeListIterator_1730) {
            var class348_sub42_sub16_sub2_21_ = (aLinkedNodeListIterator_1730.method1011(-95) as CompletedResourceRequest?)
            while (class348_sub42_sub16_sub2_21_ != null) {
                if ((class348_sub42_sub16_sub2_21_.aLong7057 == i.toLong()) && (class348_sub42_sub16_sub2_21_.aIndexedFileCache_10458 == indexedFileCache) && class348_sub42_sub16_sub2_21_.anInt10457 == 2) {
                    class348_sub42_sub16_sub2.aByteArray10461 = class348_sub42_sub16_sub2_21_.aByteArray10461
                    class348_sub42_sub16_sub2.aBoolean9664 = false
                    return class348_sub42_sub16_sub2
                }
                class348_sub42_sub16_sub2_21_ = (aLinkedNodeListIterator_1730.method1003(73.toByte()) as CompletedResourceRequest?)
            }
        }
        class348_sub42_sub16_sub2.aByteArray10461 = indexedFileCache.method1161(((-4).toByte()).toByte(), i)
        class348_sub42_sub16_sub2.aBoolean9663 = true
        class348_sub42_sub16_sub2.aBoolean9664 = false
        return class348_sub42_sub16_sub2
    }

    init {
        val class144 = privilegedOperationWorker.method2236(this, -10240, 5)
        while (class144.anInt1997 == 0) method2161(43.toByte(), 10L)
        if (class144.anInt1997 == 2) throw RuntimeException()
        aThread1733 = class144.anObject1998 as Thread
    }
}
