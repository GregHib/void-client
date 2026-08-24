import TexGenMaterialPass.Companion.method2161
import kotlinx.coroutines.Job
import kotlinx.coroutines.runBlocking

/* Class112 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ScriptCompilerThread internal constructor(privilegedOperationWorker: PrivilegedOperationWorker) : Runnable {
    private val aLinkedNodeListIterator_1730 = LinkedNodeListIterator()
    private var job: Job?
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
            (aLinkedNodeListIterator_1730 as Object).notifyAll()
        }
    }

    fun method1051(bool: Boolean) {
        aBoolean1738 = bool
        anInt1731++
        withLock(aLinkedNodeListIterator_1730) {
            (aLinkedNodeListIterator_1730 as Object).notifyAll()
        }
        try {
            runBlocking {
                job!!.join()
            }
        } catch (interruptedexception: InterruptedException) {
            /* empty */
        }
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

    fun runClass348() : CompletedResourceRequest? {
        var class348_sub42_sub16_sub2: CompletedResourceRequest? = null
        withLock(aLinkedNodeListIterator_1730) {
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
        val class144 = privilegedOperationWorker.method2236(this, -10240, 5)
        while (class144.anInt1997 == 0) method2161(43.toByte(), 10L)
        if (class144.anInt1997 == 2) throw RuntimeException()
        job = class144.anObject1998 as Job
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
