import kotlin.jvm.JvmStatic
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch

/* Class112 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*
* P2 producer/consumer on aLinkedNodeListIterator_1730's monitor, fused with a P3 shutdown
* (aBoolean1738) that reuses the same wait/notify. The queue's own data structure
* (LinkedNodeListIterator) stays as-is - method1055 needs to scan it non-destructively, which a
 * Channel can't do - only the wait()/notify() is replaced, by a nudge-only signal exactly like
 * BufferedOutputStreamWorker/RingBufferInputStream/SocketStreamWorker.
 *
 * run() previously wasn't launched directly: like SocketStreamWorker, it was handed to
 * PrivilegedOperationWorker.method2236 as a plain Runnable (a JVM-applet-security-manager
 * artifact - cache file I/O needing a "privileged" thread context - with no JS equivalent), with
 * an init-block busy-poll waiting for that dispatch to actually start. run() is now launched
 * directly on this class's own scope, which removes the busy-poll entirely and lets run() be a
 * normal suspend fun.
 */
class ScriptCompilerThread internal constructor(privilegedOperationWorker: PrivilegedOperationWorker) {
    private val aLinkedNodeListIterator_1730 = LinkedNodeListIterator()
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    private var job: Job?
    private val requestAvailable = Channel<Unit>(Channel.CONFLATED)
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
            throw TextureLoadException.method2929(runtimeexception, ("aca.G(" + (if (`is` != null) "{...}" else "null") + ',' + (if (indexedFileCache != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ')'))
        }
    }

    private fun method1050(class348_sub42_sub16_sub2: CompletedResourceRequest, i: Int) {
        anInt1735++
        withLock(aLinkedNodeListIterator_1730) {
            aLinkedNodeListIterator_1730.method1005(true, class348_sub42_sub16_sub2)
            anInt1734++
            if (i > -100) aSpriteImage_1727 = null
        }
        requestAvailable.trySend(Unit)
    }

    fun method1051(bool: Boolean) {
        aBoolean1738 = bool
        anInt1731++
        requestAvailable.trySend(Unit)
        // Reachable (rarely) from the per-frame tick via Client.method80, the same call-chain
        // family as ScrollingNoiseTexture.method556 / HostPingThread.method1303 /
        // PrivilegedOperationWorker.method2234, so this does not join(): aBoolean1738 plus the
        // nudge above are enough for run() to stop on its own: job.cancel() is a safety net in
        // case run() is mid-task rather than parked in requestAvailable.receive().
        job?.cancel()
        job = null
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

    private suspend fun runClass348(): CompletedResourceRequest? {
        withLock(aLinkedNodeListIterator_1730) {
            val class348_sub42_sub16_sub2 = aLinkedNodeListIterator_1730.method1008(20) as? CompletedResourceRequest?
            if (class348_sub42_sub16_sub2 != null) {
                anInt1734--
                return class348_sub42_sub16_sub2
            }
        }
        requestAvailable.receive()
        return null
    }

    private suspend fun run() {
        while (!aBoolean1738) {
            val class348_sub42_sub16_sub2 = runClass348() ?: continue
            try {
                if ((class348_sub42_sub16_sub2!!.anInt10457) != 2) {
                    if (class348_sub42_sub16_sub2.anInt10457 == 3) class348_sub42_sub16_sub2.aByteArray10461 = (class348_sub42_sub16_sub2.aIndexedFileCache_10458!!.method1161(((-4).toByte()).toByte(), class348_sub42_sub16_sub2.aLong7057.toInt()))
                } else class348_sub42_sub16_sub2.aIndexedFileCache_10458!!.method1160(class348_sub42_sub16_sub2.aByteArray10461!!.size, (class348_sub42_sub16_sub2.aLong7057).toInt(), class348_sub42_sub16_sub2.aByteArray10461, -7305)
            } catch (exception: Exception) {
                LinkedListIterator.method1242(null, exception, 15004)
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
        withLock(aLinkedNodeListIterator_1730) {
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
        job = scope.launch { run() }
    }

    companion object {

        var anInt1726: Int = 0

        var aSpriteImage_1727: SpriteImage? = null

        var anInt1728: Int = 0

        var anInt1729: Int = 0

        var anInt1731: Int = 0

        var anInt1732: Int = 0

        var anInt1735: Int = 0

        var anInt1736: Int = 0

        var anInt1737: Int = 0
        @JvmStatic
        fun method1052(i: Byte) {
            aSpriteImage_1727 = null
            val i_1_ = 107 % ((i - -20) / 50)
        }

        @JvmStatic
        fun method1053(i: Int): Int {
            anInt1728++
            if (i != 3112) method1052(121.toByte())
            if (RegionSceneLoader.aWidgetComponent_3701 == null) {
                if (!ScrollbarComponent.aBoolean8335 && IntHashSetStatics.aClass348_Sub42_Sub12_3963 != null) return (IntHashSetStatics.aClass348_Sub42_Sub12_3963!!.anInt9609)
                val i_2_ = GlTexture1D.aInputTracker_8552!!.method3597(true)
                val i_3_ = GlTexture1D.aInputTracker_8552!!.method3594(81.toByte())
                if (ChatScriptListNode.aBoolean9535) {
                    if (i_2_ > GlArrayBufferObject.anInt4717 && i_2_ < SceneTileBounds.anInt1117 + GlArrayBufferObject.anInt4717) {
                        var i_9_ = -1
                        var i_10_ = 0
                        while (NpcAnimationResolver.anInt166 > i_10_) {
                            if (PlayerSequenceSelector.aBoolean1211) {
                                val i_11_ = (ProceduralTextureGraph.anInt9532 - -33 - -(i_10_ * 16))
                                if (i_3_ > -13 + i_11_ && i_3_ <= i_11_ + 3) i_9_ = i_10_
                            } else {
                                val i_12_ = (i_10_ * 16 + 31 + ProceduralTextureGraph.anInt9532)
                                if (i_3_ > -13 + i_12_ && i_3_ <= i_12_ + 3) i_9_ = i_10_
                            }
                            i_10_++
                        }
                        if (i_9_ != -1) {
                            var i_13_ = 0
                            val linkedListIterator = LinkedListIterator(ParticleSortRenderer.aLinkedNodeListIterator_3022!!)
                            var class348_sub42_sub13 = (linkedListIterator.method1240(110) as? ContactList)
                            while (class348_sub42_sub13 != null) {
                                if (i_9_ == i_13_++) return (class348_sub42_sub13.aLinkedNodeListIterator_9621.aClass348_Sub42_1647.aClass348_Sub42_7063 as ContactEntry).anInt9609
                                class348_sub42_sub13 = (linkedListIterator.method1243(77.toByte()) as? ContactList)
                            }
                        }
                    } else if (ManagedGlResource.aClass348_Sub42_Sub13_3152 != null && MinimapPolygonDrawer.anInt5252 < i_2_ && (TerrainTileShape.anInt8806 + MinimapPolygonDrawer.anInt5252) > i_2_) {
                        var i_4_ = -1
                        var i_5_ = 0
                        while (((ManagedGlResource.aClass348_Sub42_Sub13_3152!!.anInt9615) > i_5_)) {
                            if (PlayerSequenceSelector.aBoolean1211) {
                                val i_7_ = InputTracker.anInt4534 + (33 + 16 * i_5_)
                                if (-13 + i_7_ < i_3_ && 3 + i_7_ >= i_3_) i_4_ = i_5_
                            } else {
                                val i_6_ = i_5_ * 16 + 31 + InputTracker.anInt4534
                                if (-13 + i_6_ < i_3_ && i_6_ - -3 >= i_3_) i_4_ = i_5_
                            }
                            i_5_++
                        }
                        if (i_4_ != -1) {
                            var i_8_ = 0
                            val linkedListIterator = LinkedListIterator(ManagedGlResource.aClass348_Sub42_Sub13_3152!!.aLinkedNodeListIterator_9621)
                            var class348_sub42_sub12 = (linkedListIterator.method1240(9) as? ContactEntry)
                            while (class348_sub42_sub12 != null) {
                                if (i_8_++ == i_4_) return (class348_sub42_sub12.anInt9609)
                                class348_sub42_sub12 = (linkedListIterator.method1243(90.toByte()) as? ContactEntry)
                            }
                        }
                    }
                } else if (i_2_ > GlArrayBufferObject.anInt4717 && (i_2_ < GlArrayBufferObject.anInt4717 - -SceneTileBounds.anInt1117)) {
                    var i_14_ = -1
                    var i_15_ = 0
                    while (FileExistsCondition.anInt4776 > i_15_) {
                        if (PlayerSequenceSelector.aBoolean1211) {
                            val i_17_ = ((-i_15_ + (-1 + FileExistsCondition.anInt4776)) * 16 + ProceduralTextureGraph.anInt9532 + 33)
                            if (i_3_ > i_17_ - 13 && i_17_ + 3 >= i_3_) i_14_ = i_15_
                        } else {
                            val i_16_ = 31 + (ProceduralTextureGraph.anInt9532 + (-i_15_ + (FileExistsCondition.anInt4776 - 1)) * 16)
                            if (-13 + i_16_ < i_3_ && i_16_ + 3 >= i_3_) i_14_ = i_15_
                        }
                        i_15_++
                    }
                    if (i_14_ != -1) {
                        var i_18_ = 0
                        val widgetRedrawTracker = WidgetRedrawTracker(SourceRowTextureNode.aNodeDeque_9111!!)
                        var class348_sub42_sub12 = (widgetRedrawTracker.method2327(((-53).toByte()).toByte()) as? ContactEntry)
                        while (class348_sub42_sub12 != null) {
                            if (i_14_ == i_18_++) return (class348_sub42_sub12.anInt9609)
                            class348_sub42_sub12 = (widgetRedrawTracker.method2329(i + -3102) as? ContactEntry)
                        }
                    }
                }
            }
            return -1
        }
    }
}
