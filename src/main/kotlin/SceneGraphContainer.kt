/* Class318_Sub10 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SceneGraphContainer private constructor(i: Int, bool: Boolean) : SceneLinkedListNode() {
    var aBoolean6470: Boolean = false
    private var aLong6471: Long = 0
    private var aLong6472: Long = 0
    private var aBoolean6473 = false
    var aClass318_Sub9_Sub2_Sub1Array6475: Array<ProjectileNode?>
    var anInt6476: Int = 0
    private var aDoublyLinkedNodeList_6478: DoublyLinkedNodeList
    var aNodeDeque_6479: NodeDeque
    private var anInt6480: Int
    var aNodeDequeHolder_6481: NodeDequeHolder
    var aBoolean6482: Boolean
    var anInt6483: Int = 0
    private var aBoolean6484: Boolean
    private var anInt6485: Int

    fun method2525(): NodeDequeHolder {
        return this.aNodeDequeHolder_6481
    }

    fun method2528(var_renderer: Renderer?) {
        this.aNodeDequeHolder_6481.aSceneNodeDeque_1569.method845(89.toByte())
        var class318_sub7 = aDoublyLinkedNodeList_6478.method1872(8) as SpotAnimEntity?
        while (class318_sub7 != null) {
            class318_sub7.method2511(true, var_renderer, aLong6471)
            class318_sub7 = aDoublyLinkedNodeList_6478.method1878(126.toByte()) as SpotAnimEntity?
        }
    }

    fun method2529() {
        aBoolean6484 = true
    }

    fun method2530() {
        this.aBoolean6470 = true
        var class348_sub42_sub20 = (this.aNodeDeque_6479.method1995(4) as SpriteRenderEntry?)
        while (class348_sub42_sub20 != null) {
            if (class348_sub42_sub20.aSpotAnimVector_9704!!.anInt2296 == 1) class348_sub42_sub20.method3162(true)
            class348_sub42_sub20 = this.aNodeDeque_6479.method1990(89.toByte()) as SpriteRenderEntry?
        }
        for (i in (this.aClass318_Sub9_Sub2_Sub1Array6475).indices) {
            if (this.aClass318_Sub9_Sub2_Sub1Array6475[i] != null) {
                this.aClass318_Sub9_Sub2_Sub1Array6475[i]!!.method2520()
                this.aClass318_Sub9_Sub2_Sub1Array6475[i] = null
            }
        }
        this.anInt6476 = 0
        aDoublyLinkedNodeList_6478 = DoublyLinkedNodeList()
        anInt6480 = 0
        this.aNodeDeque_6479 = NodeDeque()
        anInt6485 = 0
        this.method2373(false)
        DisplaySettingsConfig.aClass318_Sub10Array7249!![GlTexture2D.anInt8550] = this
        GlTexture2D.anInt8550 = (GlTexture2D.anInt8550 + 1 and KeyedCacheEntryReference.anIntArray9558!![HslColorTableNode.anInt6637])
    }

    private fun method2531(i: Int, bool: Boolean) {
        GzipDecompressor.aDoublyLinkedNodeList_2077!!.method1869(-88, this)
        aLong6472 = i.toLong()
        aLong6471 = i.toLong()
        aBoolean6484 = true
        this.aBoolean6482 = bool
    }

    private fun method2532(var_renderer: Renderer?, modelFacePriorityNodes: Array<ModelFacePriorityNode?>?, bool: Boolean) {
        for (i in 0..31) aBooleanArray6474!![i] = false
        var class318_sub7 = aDoublyLinkedNodeList_6478.method1872(8) as SpotAnimEntity?
        while_110_@ while (class318_sub7 != null) {
            if (modelFacePriorityNodes != null) {
                for (i in modelFacePriorityNodes.indices) {
                    if ((class318_sub7!!.aModelFacePriorityNode_6436 == modelFacePriorityNodes[i]) || (class318_sub7.aModelFacePriorityNode_6436 == modelFacePriorityNodes[i]!!.aModelFacePriorityNode_1888)) {
                        aBooleanArray6474!![i] = true
                        class318_sub7.method2507(true)
                        class318_sub7.aBoolean6446 = false
                        class318_sub7 = aDoublyLinkedNodeList_6478.method1878((-28).toByte()) as? SpotAnimEntity?
                        continue@while_110_
                    }
                }
            }
            if (!bool) {
                if (class318_sub7.anInt6447 == 0) {
                    class318_sub7.method2373(false)
                    anInt6480--
                } else class318_sub7.aBoolean6446 = true
            }
            class318_sub7 = aDoublyLinkedNodeList_6478.method1878((-28).toByte()) as? SpotAnimEntity?
        }
        if (modelFacePriorityNodes != null) {
            for (i in modelFacePriorityNodes.indices) {
                if (i == 32 || anInt6480 == 32) break
                if (!aBooleanArray6474!![i]) {
                    val class318_sub7 = SpotAnimEntity(var_renderer, modelFacePriorityNodes[i], this, aLong6472)
                    aDoublyLinkedNodeList_6478.method1869(-126, class318_sub7)
                    anInt6480++
                    aBooleanArray6474!![i] = true
                }
            }
        }
    }

    fun method2533(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
        this.anInt6483 = i
    }

    fun method2534() {
        aBoolean6473 = true
    }

    fun method2535(var_renderer: Renderer?, l: Long): Boolean {
        if (aLong6472 != aLong6471) method2534()
        else method2537()
        if (l - aLong6472 > 750L) {
            method2530()
            return false
        }
        val i = (l - aLong6471).toInt()
        if (aBoolean6484) {
            var class318_sub7 = aDoublyLinkedNodeList_6478.method1872(8) as? SpotAnimEntity?
            while (class318_sub7 != null) {
                for (i_4_ in 0..<class318_sub7.aSpotAnimDefinition_6441!!.anInt2422) class318_sub7.method2513(var_renderer, 1, l, 3, !aBoolean6473)
                class318_sub7 = aDoublyLinkedNodeList_6478.method1878(122.toByte()) as? SpotAnimEntity?
            }
            aBoolean6484 = false
        }
        var class318_sub7 = aDoublyLinkedNodeList_6478.method1872(8) as? SpotAnimEntity?
        while (class318_sub7 != null) {
            class318_sub7.method2513(var_renderer, i, l, 3, !aBoolean6473)
            class318_sub7 = aDoublyLinkedNodeList_6478.method1878((-72).toByte()) as? SpotAnimEntity?
        }
        aLong6471 = l
        return true
    }

    fun method2536(var_renderer: Renderer?, l: Long, modelFacePriorityNodes: Array<ModelFacePriorityNode?>?, widgetRedrawRegions: Array<WidgetRedrawRegion?>?, bool: Boolean) {
        if (!this.aBoolean6470) {
            method2532(var_renderer, modelFacePriorityNodes, bool)
            method2538(widgetRedrawRegions, bool)
            aLong6472 = l
        }
    }

    private fun method2537() {
        aBoolean6473 = false
    }

    private fun method2538(widgetRedrawRegions: Array<WidgetRedrawRegion?>?, bool: Boolean) {
        for (i in 0..7) aBooleanArray6477!![i] = false
        var class348_sub42_sub20 = (this.aNodeDeque_6479.method1995(4) as SpriteRenderEntry?)
        while_112_@ while (class348_sub42_sub20 != null) {
            if (widgetRedrawRegions != null) {
                for (i in widgetRedrawRegions.indices) {
                    if ((class348_sub42_sub20!!.aWidgetRedrawRegion_9702) == widgetRedrawRegions[i] || ((class348_sub42_sub20.aWidgetRedrawRegion_9702) == widgetRedrawRegions[i]!!.aWidgetRedrawRegion_4248)) {
                        aBooleanArray6477!![i] = true
                        class348_sub42_sub20.method3279(2)
                        class348_sub42_sub20 = this.aNodeDeque_6479.method1990(85.toByte()) as SpriteRenderEntry?
                        continue@while_112_
                    }
                }
            }
            if (!bool) {
                class348_sub42_sub20.method2715(108.toByte())
                anInt6485--
                if (class348_sub42_sub20.method3164(1.toByte())) {
                    class348_sub42_sub20.method3162(true)
                    SpotAnimEntity.Companion.anInt6450--
                }
            }
            class348_sub42_sub20 = this.aNodeDeque_6479.method1990(85.toByte()) as SpriteRenderEntry?
        }
        if (widgetRedrawRegions != null) {
            for (i in widgetRedrawRegions.indices) {
                if (i == 8 || anInt6485 == 8) break
                if (!aBooleanArray6477!![i]) {
                    var class348_sub42_sub20: SpriteRenderEntry? = null
                    if ((widgetRedrawRegions[i]!!.method2685((-13).toByte()).anInt2296) == 1 && SpotAnimEntity.Companion.anInt6450 < 32) {
                        class348_sub42_sub20 = SpriteRenderEntry(widgetRedrawRegions[i], this)
                        Class367_Sub11.aLongHashTable_7415!!.method335(class348_sub42_sub20, -8098, widgetRedrawRegions[i]!!.anInt4245.toLong())
                        SpotAnimEntity.Companion.anInt6450++
                    }
                    if (class348_sub42_sub20 == null) class348_sub42_sub20 = SpriteRenderEntry(widgetRedrawRegions[i], this)
                    this.aNodeDeque_6479.method1999(class348_sub42_sub20, -20180)
                    anInt6485++
                    aBooleanArray6477!![i] = true
                }
            }
        }
    }

    fun method2539(): NodeDequeHolder {
        this.aNodeDequeHolder_6481.aSceneNodeDeque_1569.method845(43.toByte())
        for (i in (this.aClass318_Sub9_Sub2_Sub1Array6475).indices) {
            if ((this.aClass318_Sub9_Sub2_Sub1Array6475[i] != null) && this.aClass318_Sub9_Sub2_Sub1Array6475[i]!!.aClass318_Sub7_10419 != null) this.aNodeDequeHolder_6481.aSceneNodeDeque_1569.method844((this.aClass318_Sub9_Sub2_Sub1Array6475[i]), true)
        }
        return this.aNodeDequeHolder_6481
    }

    fun method2540(l: Long) {
        aLong6472 = l
    }

    init {
        aDoublyLinkedNodeList_6478 = DoublyLinkedNodeList()
        anInt6480 = 0
        this.aNodeDeque_6479 = NodeDeque()
        this.aBoolean6482 = false
        anInt6485 = 0
        aBoolean6484 = false
        this.aNodeDequeHolder_6481 = NodeDequeHolder()
        this.aClass318_Sub9_Sub2_Sub1Array6475 = arrayOfNulls<ProjectileNode>(8192)
        method2531(i, bool)
    }

    companion object {
        private var aBooleanArray6474: BooleanArray? = BooleanArray(32)
        private var aBooleanArray6477: BooleanArray? = BooleanArray(8)
        fun method2526(i: Int, bool: Boolean): SceneGraphContainer {
            if (GlTexture2D.anInt8550 != RingBufferInputStream.anInt4559) {
                val class318_sub10 = DisplaySettingsConfig.aClass318_Sub10Array7249!![RingBufferInputStream.anInt4559]!!
                RingBufferInputStream.anInt4559 = RingBufferInputStream.anInt4559 + 1 and (KeyedCacheEntryReference.anIntArray9558!![HslColorTableNode.anInt6637])
                class318_sub10.method2531(i, bool)
                return class318_sub10
            }
            return SceneGraphContainer(i, bool)
        }

        @JvmStatic
        fun method2527() {
            aBooleanArray6474 = null
            aBooleanArray6477 = null
        }
    }
}
