import kotlin.jvm.JvmStatic
import ChatEffectsOptionState.Companion.method1731
import BrightnessOptionState.Companion.method1745
import FixedFunctionMaterialPass.Companion.method2146
import WaterMaterialPass.Companion.method2148
import WallEntity.Companion.method2485
import SpriteBlitter.method881
import lang.StringBuffer

/* Class261 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class NpcDefinitionCache internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val aJs5Archive_3319: Js5Archive?
    private val aLruByteCache_3321 = LruByteCache(64)
    fun method1983(i: Int, i_9_: Int): NpcDefinition {
        anInt3320++
        var npcDefinition: NpcDefinition? = withLock(aLruByteCache_3321) {
            aLruByteCache_3321.method583(i.toLong(), 69) as NpcDefinition?
        }
        if (npcDefinition != null) return npcDefinition
        val `is`: ByteArray? = withLock(aJs5Archive_3319!!) {
            aJs5Archive_3319.method410(-1860, i_9_, i)
        }
        npcDefinition = NpcDefinition()
        if (`is` != null) npcDefinition.method1620(ByteBuffer(`is`), -108)
        withLock(aLruByteCache_3321) {
            aLruByteCache_3321.method582(npcDefinition, i.toLong(), (-109).toByte())
        }
        return npcDefinition
    }

    fun method1984(i: Byte, i_10_: Int) {
        withLock(aLruByteCache_3321) {
            aLruByteCache_3321.method578(2, i_10_)
        }
        anInt3315++
        if (i < 36) method1980(-32)
    }

    fun method1985(i: Int) {
        anInt3317++
        withLock(aLruByteCache_3321) {
            aLruByteCache_3321.method590(i)
        }
    }

    fun method1986(i: Byte) {
        withLock(aLruByteCache_3321) {
            aLruByteCache_3321.method587(-112)
        }
        val i_11_ = 119 / ((i - 47) / 55)
        anInt3316++
    }

    init {
        try {
            aJs5Archive_3319 = js5Archive
            aJs5Archive_3319!!.method407(0, 32)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("uga.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt3313: Int = 0
        var aCameraNodeList_3314: CameraNodeList? = CameraNodeList()
        var anInt3315: Int = 0
        var anInt3316: Int = 0
        var anInt3317: Int = 0
        var anInt3318: Int = 0
        var anInt3320: Int = 0
        var anInt3322: Int = 0

        @JvmStatic
        fun method1980(i: Int) {
            if (i > 92) aCameraNodeList_3314 = null
        }

        fun method1981(string: String?, i: Byte, c: Char, string_0_: String?): String? {
            try {
                anInt3322++
                val i_1_ = string!!.length
                val i_2_ = string_0_!!.length
                var i_3_ = i_1_
                val i_4_ = -1 + i_2_
                if (i_4_ != 0) {
                    var i_5_ = 0
                    while (true) {
                        i_5_ = string.indexOf(c, i_5_)
                        if (i_5_ < 0) break
                        i_5_++
                        i_3_ += i_4_
                    }
                }
                val stringbuffer = StringBuffer(i_3_)
                var i_6_ = 0
                if (i > -77) return null
                while (true) {
                    val i_7_ = string.indexOf(c, i_6_)
                    if (i_7_ < 0) break
                    stringbuffer.append(string, i_6_, i_7_)
                    stringbuffer.append(string_0_)
                    i_6_ = i_7_ + 1
                }
                stringbuffer.append(string.substring(i_6_))
                return stringbuffer.toString()
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("uga.H(" + (if (string != null) "{...}" else "null") + ',' + i + ',' + c + ',' + (if (string_0_ != null) "{...}" else "null") + ')'))
            }
        }

        fun method1982(i: Int, i_8_: Int, string: String) {
            ContactEntry.anInt9594++
            anInt3318++
            val class348_sub47 = method2148(CacheArchiveIndex.aFontMetaRef_1766, TheoraVideoStream.aIsaacCipher_9029, i + -107)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 1 - -method1745(string, -65))
            if (i == 16) {
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteSubtract((-70).toByte(), i_8_)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                InterfaceComponentGroup.method3243(117, class348_sub47)
            }
        }

        var aNodeDeque_9478: NodeDeque? = NodeDeque()
        @JvmStatic
        fun method1987(i: Int) {
            val i_12_ = 81 % ((i - -70) / 35)
            anInt3313++
            if (!ScrollbarComponent.aBoolean8335) ChatScriptListNode.aBoolean9535 = ((SoundCacheState.anInt4143 != -1 && FileExistsCondition.anInt4776 >= SoundCacheState.anInt4143) || (GameDisplayManager.anInt10432 < 16 * FileExistsCondition.anInt4776 - -(if (!PlayerSequenceSelector.aBoolean1211) 22 else 26)))
            ItemDefinitionLoader.aNodeDeque_2187!!.method1996(103)
            aNodeDeque_9478!!.method1996(104)
            var class348_sub42_sub12 = (SourceRowTextureNode.aNodeDeque_9111!!.method1995(4) as ContactEntry?)
            while (class348_sub42_sub12 != null) {
                val i_13_ = class348_sub42_sub12.anInt9608
                if (i_13_ < 1000) {
                    class348_sub42_sub12.method2715(97.toByte())
                    if (i_13_ == 15 || i_13_ == 2 || i_13_ == 30 || i_13_ == 49 || i_13_ == 51 || i_13_ == 50 || i_13_ == 6) aNodeDeque_9478!!.method1999(class348_sub42_sub12, -20180)
                    else ItemDefinitionLoader.aNodeDeque_2187!!.method1999(class348_sub42_sub12, -20180)
                }
                class348_sub42_sub12 = SourceRowTextureNode.aNodeDeque_9111!!.method1990(83.toByte()) as ContactEntry?
            }
            ItemDefinitionLoader.aNodeDeque_2187!!.method1988(SourceRowTextureNode.aNodeDeque_9111, (-115).toByte())
            aNodeDeque_9478!!.method1988(SourceRowTextureNode.aNodeDeque_9111, (-115).toByte())
            if (FileExistsCondition.anInt4776 > 1) {
                if (!InputSettingsState.shiftClick || !LoadProgressCounters.aKeyboardInputSource_2449!!.method2696(81, -122) || FileExistsCondition.anInt4776 <= 2) IntHashSetStatics.aClass348_Sub42_Sub12_3963 = (SourceRowTextureNode.aNodeDeque_9111!!.aLinkedListNode_3334.aLinkedListNode_4295 as ContactEntry?)
                else IntHashSetStatics.aClass348_Sub42_Sub12_3963 = (SourceRowTextureNode.aNodeDeque_9111!!.aLinkedListNode_3334.aLinkedListNode_4295!!.aLinkedListNode_4295 as ContactEntry?)
                GlElementArrayBuffer.aClass348_Sub42_Sub12_4846 = (SourceRowTextureNode.aNodeDeque_9111!!.aLinkedListNode_3334.aLinkedListNode_4295 as ContactEntry?)
            } else {
                IntHashSetStatics.aClass348_Sub42_Sub12_3963 = null
                GlElementArrayBuffer.aClass348_Sub42_Sub12_4846 = null
            }
            var i_14_ = -1
            val class348_sub45 = GroundDecorEntity.aNodeDeque_8744!!.method1995(4) as TimedRecordAccessor?
            if (class348_sub45 != null) i_14_ = class348_sub45.method3310(58)
            if (ScrollbarComponent.aBoolean8335) {
                if (i_14_ == -1) {
                    val i_15_ = GlTexture1D.aInputTracker_8552!!.method3597(true)
                    val i_16_ = GlTexture1D.aInputTracker_8552!!.method3594(116.toByte())
                    var bool = false
                    if (ManagedGlResource.aClass348_Sub42_Sub13_3152 != null) {
                        if (MinimapPolygonDrawer.anInt5252 + -10 > i_15_ || ((MinimapPolygonDrawer.anInt5252 - -TerrainTileShape.anInt8806 + 10) < i_15_) || -10 + InputTracker.anInt4534 > i_16_ || (ClickFeedbackTask.anInt4669 + InputTracker.anInt4534 + 10 < i_16_)) MinimapAreaMarkerNode.method3277((-48).toByte())
                        else bool = true
                    }
                    if (!bool) {
                        if (GlArrayBufferObject.anInt4717 - 10 <= i_15_ && i_15_ <= (10 + GlArrayBufferObject.anInt4717 - -SceneTileBounds.anInt1117) && i_16_ >= -10 + ProceduralTextureGraph.anInt9532 && i_16_ <= (10 + ProceduralTextureGraph.anInt9532 - -WorldMapSceneSoftware.anInt5819)) {
                            if (ChatScriptListNode.aBoolean9535) {
                                var i_17_ = -1
                                var i_18_ = -1
                                for (i_19_ in 0..<NpcAnimationResolver.anInt166) {
                                    if (PlayerSequenceSelector.aBoolean1211) {
                                        val i_21_ = (16 * i_19_ + 33 + ProceduralTextureGraph.anInt9532)
                                        if ((i_16_ > -13 + i_21_) && i_21_ + 4 > i_16_) {
                                            i_18_ = -13 + i_21_
                                            i_17_ = i_19_
                                            break
                                        }
                                    } else {
                                        val i_20_ = (16 * i_19_ + ProceduralTextureGraph.anInt9532 - -31)
                                        if (i_20_ + -13 < i_16_ && (i_20_ + 3 > i_16_)) {
                                            i_18_ = i_20_ + -13
                                            i_17_ = i_19_
                                            break
                                        }
                                    }
                                }
                                if (i_17_ != -1) {
                                    var i_22_ = 0
                                    val linkedListIterator = LinkedListIterator(ParticleSortRenderer.aLinkedNodeListIterator_3022!!)
                                    var class348_sub42_sub13 = (linkedListIterator.method1240(75) as ContactList?)
                                    while (class348_sub42_sub13 != null) {
                                        if (i_17_ == i_22_) {
                                            if (class348_sub42_sub13.anInt9615 > 1) method881(class348_sub42_sub13, i_16_, true, i_18_)
                                            break
                                        }
                                        i_22_++
                                        class348_sub42_sub13 = (linkedListIterator.method1243(74.toByte()) as ContactList?)
                                    }
                                }
                            }
                        } else method2146(70.toByte())
                    }
                }
                if (i_14_ == 0) {
                    val i_23_ = class348_sub45!!.method3308((-128).toByte())
                    val i_24_ = class348_sub45.method3311(33)
                    if (ManagedGlResource.aClass348_Sub42_Sub13_3152 != null && MinimapPolygonDrawer.anInt5252 <= i_23_ && (TerrainTileShape.anInt8806 + MinimapPolygonDrawer.anInt5252 >= i_23_) && i_24_ >= InputTracker.anInt4534 && InputTracker.anInt4534 + ClickFeedbackTask.anInt4669 >= i_24_) {
                        var i_25_ = -1
                        var i_26_ = 0
                        while ((ManagedGlResource.aClass348_Sub42_Sub13_3152!!.anInt9615 > i_26_)) {
                            if (PlayerSequenceSelector.aBoolean1211) {
                                val i_27_ = 33 + (InputTracker.anInt4534 + i_26_ * 16)
                                if (i_24_ > -13 + i_27_ && i_24_ < 4 + i_27_) i_25_ = i_26_
                            } else {
                                val i_28_ = i_26_ * 16 + 31 + InputTracker.anInt4534
                                if (i_28_ + -13 < i_24_ && i_24_ < 3 + i_28_) i_25_ = i_26_
                            }
                            i_26_++
                        }
                        if (i_25_ != -1) {
                            var i_29_ = 0
                            val linkedListIterator = LinkedListIterator(ManagedGlResource.aClass348_Sub42_Sub13_3152!!.aLinkedNodeListIterator_9621)
                            var class348_sub42_sub12 = (linkedListIterator.method1240(98) as ContactEntry?)
                            while (class348_sub42_sub12 != null) {
                                if (i_29_ == i_25_) {
                                    SpriteMaskShape.method2599(126.toByte(), class348_sub42_sub12, i_24_, i_23_)
                                    break
                                }
                                i_29_++
                                class348_sub42_sub12 = (linkedListIterator.method1243(122.toByte()) as ContactEntry?)
                            }
                        }
                        method2146(78.toByte())
                    } else if (GlArrayBufferObject.anInt4717 <= i_23_ && (i_23_ <= GlArrayBufferObject.anInt4717 - -SceneTileBounds.anInt1117) && i_24_ >= ProceduralTextureGraph.anInt9532 && ((ProceduralTextureGraph.anInt9532 - -WorldMapSceneSoftware.anInt5819) >= i_24_)) {
                        if (ChatScriptListNode.aBoolean9535) {
                            var i_30_ = -1
                            for (i_31_ in 0..<NpcAnimationResolver.anInt166) {
                                if (PlayerSequenceSelector.aBoolean1211) {
                                    val i_33_ = (ProceduralTextureGraph.anInt9532 + 33 - -(i_31_ * 16))
                                    if (i_24_ > -13 + i_33_ && i_33_ + 4 > i_24_) {
                                        i_30_ = i_31_
                                        break
                                    }
                                } else {
                                    val i_32_ = (ProceduralTextureGraph.anInt9532 + 31 + i_31_ * 16)
                                    if (i_24_ > i_32_ - 13 && i_32_ + 3 > i_24_) {
                                        i_30_ = i_31_
                                        break
                                    }
                                }
                            }
                            if (i_30_ != -1) {
                                var i_34_ = 0
                                val linkedListIterator = LinkedListIterator(ParticleSortRenderer.aLinkedNodeListIterator_3022!!)
                                var class348_sub42_sub13 = (linkedListIterator.method1240(18) as ContactList?)
                                while (class348_sub42_sub13 != null) {
                                    if (i_34_ == i_30_) {
                                        SpriteMaskShape.method2599(122.toByte(), ((class348_sub42_sub13.aLinkedNodeListIterator_9621.aClass348_Sub42_1647.aClass348_Sub42_7063) as ContactEntry?), i_24_, i_23_)
                                        method2146(118.toByte())
                                        break
                                    }
                                    i_34_++
                                    class348_sub42_sub13 = (linkedListIterator.method1243(55.toByte()) as ContactList?)
                                }
                            }
                        } else {
                            var i_35_ = -1
                            var i_36_ = 0
                            while ((i_36_ < FileExistsCondition.anInt4776)) {
                                if (PlayerSequenceSelector.aBoolean1211) {
                                    val i_37_ = (33 + ProceduralTextureGraph.anInt9532 + 16 * (FileExistsCondition.anInt4776 - (1 - -i_36_)))
                                    if (i_37_ - 13 < i_24_ && 4 + i_37_ > i_24_) i_35_ = i_36_
                                } else {
                                    val i_38_ = (ProceduralTextureGraph.anInt9532 + (31 - -((FileExistsCondition.anInt4776 - 1 - i_36_) * 16)))
                                    if (i_38_ - 13 < i_24_ && (i_24_ < i_38_ - -3)) i_35_ = i_36_
                                }
                                i_36_++
                            }
                            if (i_35_ != -1) {
                                var i_39_ = 0
                                val widgetRedrawTracker = WidgetRedrawTracker(SourceRowTextureNode.aNodeDeque_9111!!)
                                var class348_sub42_sub12 = (widgetRedrawTracker.method2327((-53).toByte()) as ContactEntry?)
                                while (class348_sub42_sub12 != null) {
                                    if (i_35_ == i_39_) {
                                        SpriteMaskShape.method2599(107.toByte(), class348_sub42_sub12, i_24_, i_23_)
                                        break
                                    }
                                    i_39_++
                                    class348_sub42_sub12 = (widgetRedrawTracker.method2329(10) as ContactEntry?)
                                }
                            }
                            FixedFunctionMaterialPass.method2146((-46).toByte())
                        }
                    }
                }
            } else {
                if (i_14_ == 0 && ((WallEntity.anInt8770 == 1 && FileExistsCondition.anInt4776 > 2) || method2485(-100))) i_14_ = 2
                if (i_14_ == 2 && FileExistsCondition.anInt4776 > 0 && class348_sub45 != null) {
                    if (RegionSceneLoader.aWidgetComponent_3701 == null && HashLinkedListNodeStatics.anInt7059 == 0) SolidFillComponent.method2291((-124).toByte(), class348_sub45.method3308((-127).toByte()), class348_sub45.method3311(-104))
                    else NpcEntityUpdater.anInt3655 = 2
                }
                if (i_14_ == 0) {
                    if (IntHashSetStatics.aClass348_Sub42_Sub12_3963 != null) method1731(1)
                    else if (RenderNodeStatics.aBoolean9722) TileRenderState.method2678(-2049)
                }
                if (RegionSceneLoader.aWidgetComponent_3701 == null && HashLinkedListNodeStatics.anInt7059 == 0) {
                    SolidFillComponent.aClass348_Sub42_Sub12_1946 = null
                    NpcEntityUpdater.anInt3655 = 0
                }
            }
        }
    }
}
