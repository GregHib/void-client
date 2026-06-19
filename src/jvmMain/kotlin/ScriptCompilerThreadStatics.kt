import TexGenMaterialPassStatics.method2161

object ScriptCompilerThreadStatics {
    @JvmField
            var anInt1726: Int = 0
            @JvmField
            var aSpriteImage_1727: SpriteImage? = null
            @JvmField
            var anInt1728: Int = 0
            @JvmField
            var anInt1729: Int = 0
            @JvmField
            var anInt1731: Int = 0
            @JvmField
            var anInt1732: Int = 0
            @JvmField
            var anInt1735: Int = 0
            @JvmField
            var anInt1736: Int = 0
            @JvmField
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
                    if (!ScrollbarComponentStatics.aBoolean8335 && IntHashSetStatics.aClass348_Sub42_Sub12_3963 != null) return (IntHashSetStatics.aClass348_Sub42_Sub12_3963!!.anInt9609)
                    val i_2_ = GlTexture1DStatics.aInputTracker_8552!!.method3597(true)
                    val i_3_ = GlTexture1DStatics.aInputTracker_8552!!.method3594(81.toByte())
                    if (ChatScriptListNodeStatics.aBoolean9535) {
                        if (i_2_ > GlArrayBufferObjectStatics.anInt4717 && i_2_ < SceneTileBoundsStatics.anInt1117 + GlArrayBufferObjectStatics.anInt4717) {
                            var i_9_ = -1
                            var i_10_ = 0
                            while (NpcAnimationResolverStatics.anInt166 > i_10_) {
                                if (PlayerSequenceSelector.aBoolean1211) {
                                    val i_11_ = (ProceduralTextureGraphStatics.anInt9532 - -33 - -(i_10_ * 16))
                                    if (i_3_ > -13 + i_11_ && i_3_ <= i_11_ + 3) i_9_ = i_10_
                                } else {
                                    val i_12_ = (i_10_ * 16 + 31 + ProceduralTextureGraphStatics.anInt9532)
                                    if (i_3_ > -13 + i_12_ && i_3_ <= i_12_ + 3) i_9_ = i_10_
                                }
                                i_10_++
                            }
                            if (i_9_ != -1) {
                                var i_13_ = 0
                                val linkedListIterator = LinkedListIterator(ParticleSortRendererStatics.aLinkedNodeListIterator_3022!!)
                                var class348_sub42_sub13 = (linkedListIterator.method1240(110) as? ContactList)
                                while (class348_sub42_sub13 != null) {
                                    if (i_9_ == i_13_++) return (class348_sub42_sub13.aLinkedNodeListIterator_9621.aClass348_Sub42_1647.aClass348_Sub42_7063 as ContactEntry).anInt9609
                                    class348_sub42_sub13 = (linkedListIterator.method1243(77.toByte()) as? ContactList)
                                }
                            }
                        } else if (ManagedGlResourceStatics.aClass348_Sub42_Sub13_3152 != null && MinimapPolygonDrawerStatics.anInt5252 < i_2_ && (TerrainTileShapeStatics.anInt8806 + MinimapPolygonDrawerStatics.anInt5252) > i_2_) {
                            var i_4_ = -1
                            var i_5_ = 0
                            while (((ManagedGlResourceStatics.aClass348_Sub42_Sub13_3152!!.anInt9615) > i_5_)) {
                                if (PlayerSequenceSelector.aBoolean1211) {
                                    val i_7_ = InputTrackerStatics.anInt4534 + (33 + 16 * i_5_)
                                    if (-13 + i_7_ < i_3_ && 3 + i_7_ >= i_3_) i_4_ = i_5_
                                } else {
                                    val i_6_ = i_5_ * 16 + 31 + InputTrackerStatics.anInt4534
                                    if (-13 + i_6_ < i_3_ && i_6_ - -3 >= i_3_) i_4_ = i_5_
                                }
                                i_5_++
                            }
                            if (i_4_ != -1) {
                                var i_8_ = 0
                                val linkedListIterator = LinkedListIterator(ManagedGlResourceStatics.aClass348_Sub42_Sub13_3152!!.aLinkedNodeListIterator_9621)
                                var class348_sub42_sub12 = (linkedListIterator.method1240(9) as? ContactEntry)
                                while (class348_sub42_sub12 != null) {
                                    if (i_8_++ == i_4_) return (class348_sub42_sub12.anInt9609)
                                    class348_sub42_sub12 = (linkedListIterator.method1243(90.toByte()) as? ContactEntry)
                                }
                            }
                        }
                    } else if (i_2_ > GlArrayBufferObjectStatics.anInt4717 && (i_2_ < GlArrayBufferObjectStatics.anInt4717 - -SceneTileBoundsStatics.anInt1117)) {
                        var i_14_ = -1
                        var i_15_ = 0
                        while (FileExistsConditionStatics.anInt4776 > i_15_) {
                            if (PlayerSequenceSelector.aBoolean1211) {
                                val i_17_ = ((-i_15_ + (-1 + FileExistsConditionStatics.anInt4776)) * 16 + ProceduralTextureGraphStatics.anInt9532 + 33)
                                if (i_3_ > i_17_ - 13 && i_17_ + 3 >= i_3_) i_14_ = i_15_
                            } else {
                                val i_16_ = 31 + (ProceduralTextureGraphStatics.anInt9532 + (-i_15_ + (FileExistsConditionStatics.anInt4776 - 1)) * 16)
                                if (-13 + i_16_ < i_3_ && i_16_ + 3 >= i_3_) i_14_ = i_15_
                            }
                            i_15_++
                        }
                        if (i_14_ != -1) {
                            var i_18_ = 0
                            val widgetRedrawTracker = WidgetRedrawTracker(SourceRowTextureNodeStatics.aNodeDeque_9111!!)
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
