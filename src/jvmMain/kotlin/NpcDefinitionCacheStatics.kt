import ChatEffectsOptionStateStatics.method1731
import BrightnessOptionStateStatics.method1745
import FixedFunctionMaterialPassStatics.method2146
import WaterMaterialPassStatics.method2148
import WallEntityStatics.method2485
import SpriteBlitter.method881

object NpcDefinitionCacheStatics {
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
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("uga.H(" + (if (string != null) "{...}" else "null") + ',' + i + ',' + c + ',' + (if (string_0_ != null) "{...}" else "null") + ')'))
                }
            }
    
            fun method1982(i: Int, i_8_: Int, string: String) {
                ContactEntryStatics.anInt9594++
                anInt3318++
                val class348_sub47 = method2148(CacheArchiveIndexStatics.aFontMetaRef_1766, TheoraVideoStreamStatics.aIsaacCipher_9029, i + -107)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 1 - -method1745(string, -65))
                if (i == 16) {
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteSubtract((-70).toByte(), i_8_)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                    InterfaceComponentGroupStatics.method3243(117, class348_sub47)
                }
            }
    
            @JvmStatic
            fun method1987(i: Int) {
                val i_12_ = 81 % ((i - -70) / 35)
                anInt3313++
                if (!ScrollbarComponentStatics.aBoolean8335) ChatScriptListNodeStatics.aBoolean9535 = ((SoundCacheState.anInt4143 != -1 && FileExistsConditionStatics.anInt4776 >= SoundCacheState.anInt4143) || (HardCacheEntryReferenceStatics.anInt10432 < 16 * FileExistsConditionStatics.anInt4776 - -(if (!PlayerSequenceSelector.aBoolean1211) 22 else 26)))
                ItemDefinitionLoaderStatics.aNodeDeque_2187!!.method1996(103)
                ClampTextureNodeStatics.aNodeDeque_9478!!.method1996(104)
                var class348_sub42_sub12 = (SourceRowTextureNodeStatics.aNodeDeque_9111!!.method1995(4) as ContactEntry?)
                while (class348_sub42_sub12 != null) {
                    val i_13_ = class348_sub42_sub12.anInt9608
                    if (i_13_ < 1000) {
                        class348_sub42_sub12.method2715(97.toByte())
                        if (i_13_ == 15 || i_13_ == 2 || i_13_ == 30 || i_13_ == 49 || i_13_ == 51 || i_13_ == 50 || i_13_ == 6) ClampTextureNodeStatics.aNodeDeque_9478!!.method1999(class348_sub42_sub12, -20180)
                        else ItemDefinitionLoaderStatics.aNodeDeque_2187!!.method1999(class348_sub42_sub12, -20180)
                    }
                    class348_sub42_sub12 = SourceRowTextureNodeStatics.aNodeDeque_9111!!.method1990(83.toByte()) as ContactEntry?
                }
                ItemDefinitionLoaderStatics.aNodeDeque_2187!!.method1988(SourceRowTextureNodeStatics.aNodeDeque_9111, (-115).toByte())
                ClampTextureNodeStatics.aNodeDeque_9478!!.method1988(SourceRowTextureNodeStatics.aNodeDeque_9111, (-115).toByte())
                if (FileExistsConditionStatics.anInt4776 > 1) {
                    if (!InputSettingsState.shiftClick || !LoadProgressCountersStatics.aKeyboardInputSource_2449!!.method2696(81, -122) || FileExistsConditionStatics.anInt4776 <= 2) IntHashSetStatics.aClass348_Sub42_Sub12_3963 = (SourceRowTextureNodeStatics.aNodeDeque_9111!!.aLinkedListNode_3334.aLinkedListNode_4295 as ContactEntry?)
                    else IntHashSetStatics.aClass348_Sub42_Sub12_3963 = (SourceRowTextureNodeStatics.aNodeDeque_9111!!.aLinkedListNode_3334.aLinkedListNode_4295!!.aLinkedListNode_4295 as ContactEntry?)
                    GlElementArrayBufferStatics.aClass348_Sub42_Sub12_4846 = (SourceRowTextureNodeStatics.aNodeDeque_9111!!.aLinkedListNode_3334.aLinkedListNode_4295 as ContactEntry?)
                } else {
                    IntHashSetStatics.aClass348_Sub42_Sub12_3963 = null
                    GlElementArrayBufferStatics.aClass348_Sub42_Sub12_4846 = null
                }
                var i_14_ = -1
                val class348_sub45 = GroundDecorEntityStatics.aNodeDeque_8744!!.method1995(4) as TimedRecordAccessor?
                if (class348_sub45 != null) i_14_ = class348_sub45.method3310(58)
                if (ScrollbarComponentStatics.aBoolean8335) {
                    if (i_14_ == -1) {
                        val i_15_ = GlTexture1DStatics.aInputTracker_8552!!.method3597(true)
                        val i_16_ = GlTexture1DStatics.aInputTracker_8552!!.method3594(116.toByte())
                        var bool = false
                        if (ManagedGlResourceStatics.aClass348_Sub42_Sub13_3152 != null) {
                            if (MinimapPolygonDrawerStatics.anInt5252 + -10 > i_15_ || ((MinimapPolygonDrawerStatics.anInt5252 - -TerrainTileShapeStatics.anInt8806 + 10) < i_15_) || -10 + InputTrackerStatics.anInt4534 > i_16_ || (ClickFeedbackTaskStatics.anInt4669 + InputTrackerStatics.anInt4534 + 10 < i_16_)) MinimapAreaMarkerNodeStatics.method3277((-48).toByte())
                            else bool = true
                        }
                        if (!bool) {
                            if (GlArrayBufferObjectStatics.anInt4717 - 10 <= i_15_ && i_15_ <= (10 + GlArrayBufferObjectStatics.anInt4717 - -SceneTileBoundsStatics.anInt1117) && i_16_ >= -10 + ProceduralTextureGraphStatics.anInt9532 && i_16_ <= (10 + ProceduralTextureGraphStatics.anInt9532 - -WorldMapSceneSoftwareStatics.anInt5819)) {
                                if (ChatScriptListNodeStatics.aBoolean9535) {
                                    var i_17_ = -1
                                    var i_18_ = -1
                                    for (i_19_ in 0..<NpcAnimationResolverStatics.anInt166) {
                                        if (PlayerSequenceSelector.aBoolean1211) {
                                            val i_21_ = (16 * i_19_ + 33 + ProceduralTextureGraphStatics.anInt9532)
                                            if ((i_16_ > -13 + i_21_) && i_21_ + 4 > i_16_) {
                                                i_18_ = -13 + i_21_
                                                i_17_ = i_19_
                                                break
                                            }
                                        } else {
                                            val i_20_ = (16 * i_19_ + ProceduralTextureGraphStatics.anInt9532 - -31)
                                            if (i_20_ + -13 < i_16_ && (i_20_ + 3 > i_16_)) {
                                                i_18_ = i_20_ + -13
                                                i_17_ = i_19_
                                                break
                                            }
                                        }
                                    }
                                    if (i_17_ != -1) {
                                        var i_22_ = 0
                                        val linkedListIterator = LinkedListIterator(ParticleSortRendererStatics.aLinkedNodeListIterator_3022!!)
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
                        if (ManagedGlResourceStatics.aClass348_Sub42_Sub13_3152 != null && MinimapPolygonDrawerStatics.anInt5252 <= i_23_ && (TerrainTileShapeStatics.anInt8806 + MinimapPolygonDrawerStatics.anInt5252 >= i_23_) && i_24_ >= InputTrackerStatics.anInt4534 && InputTrackerStatics.anInt4534 + ClickFeedbackTaskStatics.anInt4669 >= i_24_) {
                            var i_25_ = -1
                            var i_26_ = 0
                            while ((ManagedGlResourceStatics.aClass348_Sub42_Sub13_3152!!.anInt9615 > i_26_)) {
                                if (PlayerSequenceSelector.aBoolean1211) {
                                    val i_27_ = 33 + (InputTrackerStatics.anInt4534 + i_26_ * 16)
                                    if (i_24_ > -13 + i_27_ && i_24_ < 4 + i_27_) i_25_ = i_26_
                                } else {
                                    val i_28_ = i_26_ * 16 + 31 + InputTrackerStatics.anInt4534
                                    if (i_28_ + -13 < i_24_ && i_24_ < 3 + i_28_) i_25_ = i_26_
                                }
                                i_26_++
                            }
                            if (i_25_ != -1) {
                                var i_29_ = 0
                                val linkedListIterator = LinkedListIterator(ManagedGlResourceStatics.aClass348_Sub42_Sub13_3152!!.aLinkedNodeListIterator_9621)
                                var class348_sub42_sub12 = (linkedListIterator.method1240(98) as ContactEntry?)
                                while (class348_sub42_sub12 != null) {
                                    if (i_29_ == i_25_) {
                                        SpriteMaskShapeStatics.method2599(126.toByte(), class348_sub42_sub12, i_24_, i_23_)
                                        break
                                    }
                                    i_29_++
                                    class348_sub42_sub12 = (linkedListIterator.method1243(122.toByte()) as ContactEntry?)
                                }
                            }
                            method2146(78.toByte())
                        } else if (GlArrayBufferObjectStatics.anInt4717 <= i_23_ && (i_23_ <= GlArrayBufferObjectStatics.anInt4717 - -SceneTileBoundsStatics.anInt1117) && i_24_ >= ProceduralTextureGraphStatics.anInt9532 && ((ProceduralTextureGraphStatics.anInt9532 - -WorldMapSceneSoftwareStatics.anInt5819) >= i_24_)) {
                            if (ChatScriptListNodeStatics.aBoolean9535) {
                                var i_30_ = -1
                                for (i_31_ in 0..<NpcAnimationResolverStatics.anInt166) {
                                    if (PlayerSequenceSelector.aBoolean1211) {
                                        val i_33_ = (ProceduralTextureGraphStatics.anInt9532 + 33 - -(i_31_ * 16))
                                        if (i_24_ > -13 + i_33_ && i_33_ + 4 > i_24_) {
                                            i_30_ = i_31_
                                            break
                                        }
                                    } else {
                                        val i_32_ = (ProceduralTextureGraphStatics.anInt9532 + 31 + i_31_ * 16)
                                        if (i_24_ > i_32_ - 13 && i_32_ + 3 > i_24_) {
                                            i_30_ = i_31_
                                            break
                                        }
                                    }
                                }
                                if (i_30_ != -1) {
                                    var i_34_ = 0
                                    val linkedListIterator = LinkedListIterator(ParticleSortRendererStatics.aLinkedNodeListIterator_3022!!)
                                    var class348_sub42_sub13 = (linkedListIterator.method1240(18) as ContactList?)
                                    while (class348_sub42_sub13 != null) {
                                        if (i_34_ == i_30_) {
                                            SpriteMaskShapeStatics.method2599(122.toByte(), ((class348_sub42_sub13.aLinkedNodeListIterator_9621.aClass348_Sub42_1647.aClass348_Sub42_7063) as ContactEntry?), i_24_, i_23_)
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
                                while ((i_36_ < FileExistsConditionStatics.anInt4776)) {
                                    if (PlayerSequenceSelector.aBoolean1211) {
                                        val i_37_ = (33 + ProceduralTextureGraphStatics.anInt9532 + 16 * (FileExistsConditionStatics.anInt4776 - (1 - -i_36_)))
                                        if (i_37_ - 13 < i_24_ && 4 + i_37_ > i_24_) i_35_ = i_36_
                                    } else {
                                        val i_38_ = (ProceduralTextureGraphStatics.anInt9532 + (31 - -((FileExistsConditionStatics.anInt4776 - 1 - i_36_) * 16)))
                                        if (i_38_ - 13 < i_24_ && (i_24_ < i_38_ - -3)) i_35_ = i_36_
                                    }
                                    i_36_++
                                }
                                if (i_35_ != -1) {
                                    var i_39_ = 0
                                    val widgetRedrawTracker = WidgetRedrawTracker(SourceRowTextureNodeStatics.aNodeDeque_9111!!)
                                    var class348_sub42_sub12 = (widgetRedrawTracker.method2327((-53).toByte()) as ContactEntry?)
                                    while (class348_sub42_sub12 != null) {
                                        if (i_35_ == i_39_) {
                                            SpriteMaskShapeStatics.method2599(107.toByte(), class348_sub42_sub12, i_24_, i_23_)
                                            break
                                        }
                                        i_39_++
                                        class348_sub42_sub12 = (widgetRedrawTracker.method2329(10) as ContactEntry?)
                                    }
                                }
                                FixedFunctionMaterialPassStatics.method2146((-46).toByte())
                            }
                        }
                    }
                } else {
                    if (i_14_ == 0 && ((WallEntityStatics.anInt8770 == 1 && FileExistsConditionStatics.anInt4776 > 2) || method2485(-100))) i_14_ = 2
                    if (i_14_ == 2 && FileExistsConditionStatics.anInt4776 > 0 && class348_sub45 != null) {
                        if (RegionSceneLoader.aWidgetComponent_3701 == null && HashLinkedListNodeStatics.anInt7059 == 0) TextureFormatInfoStatics.method2291((-124).toByte(), class348_sub45.method3308((-127).toByte()), class348_sub45.method3311(-104))
                        else NpcEntityUpdater.anInt3655 = 2
                    }
                    if (i_14_ == 0) {
                        if (IntHashSetStatics.aClass348_Sub42_Sub12_3963 != null) method1731(1)
                        else if (RenderNodeStatics.aBoolean9722) TileRenderStateStatics.method2678(-2049)
                    }
                    if (RegionSceneLoader.aWidgetComponent_3701 == null && HashLinkedListNodeStatics.anInt7059 == 0) {
                        RectangleRegionStatics.aClass348_Sub42_Sub12_1946 = null
                        NpcEntityUpdater.anInt3655 = 0
                    }
                }
            }
}
