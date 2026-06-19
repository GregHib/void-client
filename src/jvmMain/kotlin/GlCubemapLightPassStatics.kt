import kotlin.math.pow
import kotlin.math.sqrt

object GlCubemapLightPassStatics {
    @JvmField
            var anInt7308: Int = 0
            @JvmField
            var anInt7309: Int = 0
            @JvmField
            var anInt7310: Int = 0
            @JvmField
            var anInt7312: Int = 0
            @JvmField
            var anInt7313: Int = 0
            @JvmField
            var anInt7314: Int = 0
            @JvmField
            var anInt7316: Int = 0
            @JvmField
            var aFontMetaRef_7318: FontMetaRef? = FontMetaRef(21, 2)
            @JvmField
            var anInt7319: Int = 104
            var aBoolean7320: Boolean = false
            @JvmField
            var anInt7321: Int = 0
            @JvmField
            var anInt7322: Int = 0
            @JvmField
            var aIntRange_7323: IntRange? = IntRange(105, -2)
            @JvmField
            var aIntRange_7324: IntRange? = IntRange(96, 8)
            @JvmField
            var aLinkedNodeListIterator_7325: LinkedNodeListIterator? = LinkedNodeListIterator()
    
            @JvmStatic
            fun method3541(i: Byte) {
                aIntRange_7323 = null
                aIntRange_7324 = null
                aLinkedNodeListIterator_7325 = null
                if (i.toInt() == 23) aFontMetaRef_7318 = null
            }
    
            @JvmStatic
            fun method3542(i: Int, sceneCollisionEntries: Array<Array<Array<SceneCollisionEntry?>?>?>?, i_13_: Int, i_14_: Int, i_15_: Int, bool: Boolean): Boolean {
                anInt7310++
                val i_16_ = if (bool) 1.toByte() else (TextureQualityOptionStateStatics.anInt6006 and 0xff).toByte()
                if (i_16_ == RegionSceneLoader.aByteArrayArrayArray3700!![CompiledScriptCacheStatics.anInt4372]!![i_13_]!![i]) return false
                if (((AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![CompiledScriptCacheStatics.anInt4372]!![i_13_]!![i]).toInt() and 0x4) == 0) return false
                var i_17_ = i_14_
                var i_18_ = 0
                PcmStreamBufferStatics.anIntArray8862!![i_17_] = i_13_
                ClientExceptionStatics.anIntArray110!![i_17_++] = i
                RegionSceneLoader.aByteArrayArrayArray3700!![CompiledScriptCacheStatics.anInt4372]!![i_13_]!![i] = i_16_
                while (i_17_ != i_18_) {
                    val i_19_ = 0xffff and PcmStreamBufferStatics.anIntArray8862!![i_18_]
                    val i_20_ = ((PcmStreamBufferStatics.anIntArray8862!![i_18_] and 0xff3677) shr 16)
                    val i_21_ = (0xff and (PcmStreamBufferStatics.anIntArray8862!![i_18_] shr 24))
                    var i_22_ = 0xffff and ClientExceptionStatics.anIntArray110!![i_18_]
                    val i_23_ = ((0xff5347 and ClientExceptionStatics.anIntArray110!![i_18_]) shr 16)
                    i_18_ = i_18_ + 1 and 0xfff
                    var bool_24_ = false
                    if ((0x4 and (AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![CompiledScriptCacheStatics.anInt4372]!![i_19_]!![i_22_]).toInt()) == 0) bool_24_ = true
                    var bool_25_ = false
                    if (sceneCollisionEntries != null) {
                        var i_26_ = CompiledScriptCacheStatics.anInt4372 + 1
                        while_223_@ while ( /**/i_26_ <= 3) {
                            if (sceneCollisionEntries[i_26_] != null && (0x8 and (AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![i_26_]!![i_19_]!![i_22_]).toInt()) == 0) {
                                if (bool_24_ && sceneCollisionEntries[i_26_]!![i_19_]!![i_22_] != null) {
                                    if ((sceneCollisionEntries[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4406) != null) {
                                        val i_27_ = TextureAtlasStateStatics.method3492(i_20_, 226)
                                        if (((sceneCollisionEntries[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4406!!.aShort8759).toInt() == i_27_) || ((sceneCollisionEntries[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4403) != null && (i_27_ == (sceneCollisionEntries[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4403!!.aShort8759).toInt()))) {
                                            i_26_++
                                            continue
                                        }
                                        if (i_21_ != 0) {
                                            val i_28_ = TextureAtlasStateStatics.method3492(i_21_, 226)
                                            if (((sceneCollisionEntries[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4406!!.aShort8759).toInt() == i_28_) || ((sceneCollisionEntries[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4403) != null && ((sceneCollisionEntries[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4403!!.aShort8759).toInt() == i_28_))) {
                                                i_26_++
                                                continue
                                            }
                                        }
                                        if (i_23_ != 0) {
                                            val i_29_ = TextureAtlasStateStatics.method3492(i_23_, 226)
                                            if ((sceneCollisionEntries[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4406!!.aShort8759).toInt() == i_29_ || ((sceneCollisionEntries[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4403) != null && (i_29_ == (sceneCollisionEntries[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4403!!.aShort8759).toInt()))) {
                                                i_26_++
                                                continue
                                            }
                                        }
                                    }
                                    val class357 = sceneCollisionEntries[i_26_]!![i_19_]!![i_22_]!!
                                    if (class357.aWidgetNodeLink_4396 != null) {
                                        var class148 = (class357.aWidgetNodeLink_4396)
                                        while (class148 != null) {
                                            val class318_sub1_sub3 = (class148.aClass318_Sub1_Sub3_2040)
                                            if (class318_sub1_sub3 is RenderTarget) {
                                                val renderTarget = class318_sub1_sub3 as RenderTarget
                                                var i_30_ = renderTarget.method39(59)
                                                val i_31_ = renderTarget.method41(-32228)
                                                if (i_30_ == 21) i_30_ = 19
                                                val i_32_ = i_31_ shl 6 or i_30_
                                                if (i_32_ == i_20_ || i_21_ != 0 && i_21_ == i_32_ || i_23_ != 0 && i_23_ == i_32_) {
                                                    i_26_++
                                                    continue@while_223_
                                                }
                                            }
                                            class148 = (class148.aWidgetNodeLink_2038)
                                        }
                                    }
                                }
                                val sceneCollisionEntry: SceneCollisionEntry? = sceneCollisionEntries[i_26_]!![i_19_]!![i_22_]
                                if (sceneCollisionEntry != null && sceneCollisionEntry.aWidgetNodeLink_4396 != null) {
                                    var class148 = sceneCollisionEntry.aWidgetNodeLink_4396
                                    while (class148 != null) {
                                        val class318_sub1_sub3 = (class148.aClass318_Sub1_Sub3_2040)!!
                                        if (((class318_sub1_sub3.aShort8743) != class318_sub1_sub3.aShort8751) || (class318_sub1_sub3.aShort8750 != class318_sub1_sub3.aShort8747)) {
                                            var i_33_ = (class318_sub1_sub3.aShort8743).toInt()
                                            while ((i_33_ <= class318_sub1_sub3.aShort8751)) {
                                                var i_34_ = (class318_sub1_sub3.aShort8750).toInt()
                                                while ((i_34_ <= class318_sub1_sub3.aShort8747)) {
                                                    RegionSceneLoader.aByteArrayArrayArray3700!![i_26_]!![i_33_]!![i_34_] = i_16_
                                                    i_34_++
                                                }
                                                i_33_++
                                            }
                                        }
                                        class148 = class148.aWidgetNodeLink_2038
                                    }
                                }
                                RegionSceneLoader.aByteArrayArrayArray3700!![i_26_]!![i_19_]!![i_22_] = i_16_
                                bool_25_ = true
                            }
                            i_26_++
                        }
                    }
                    if (bool_25_) {
                        val i_35_ = NativeSpriteStatics.aTerrainTileArray5191!![1 + CompiledScriptCacheStatics.anInt4372]!!.method3982((-86).toByte(), i_22_, i_19_)
                        if (i_35_ > FileIoUtil.anIntArray4097!![i_15_]) FileIoUtil.anIntArray4097!![i_15_] = i_35_
                        val i_36_ = i_19_ shl 9
                        if (i_36_ < LinkedListIteratorStatics.anIntArray2117!![i_15_]) LinkedListIteratorStatics.anIntArray2117!![i_15_] = i_36_
                        else if (i_36_ > BlankTextureNodeStatics.anIntArray9259!![i_15_]) BlankTextureNodeStatics.anIntArray9259!![i_15_] = i_36_
                        val i_37_ = i_22_ shl 9
                        if (i_37_ >= AbstractModelStatics.anIntArray1127!![i_15_]) {
                            if (ConnectionStateTypeStatics.anIntArray1045!![i_15_] < i_37_) ConnectionStateTypeStatics.anIntArray1045!![i_15_] = i_37_
                        } else AbstractModelStatics.anIntArray1127!![i_15_] = i_37_
                    }
                    if (!bool_24_) {
                        if (i_19_ >= 1 && (RegionSceneLoader.aByteArrayArrayArray3700!![CompiledScriptCacheStatics.anInt4372]!![i_19_ - 1]!![i_22_]) != i_16_) {
                            PcmStreamBufferStatics.anIntArray8862!![i_17_] = BoundsConstraintEntryStatics.method2057(BoundsConstraintEntryStatics.method2057(1179648, i_19_ + -1), -754974720)
                            ClientExceptionStatics.anIntArray110!![i_17_] = BoundsConstraintEntryStatics.method2057(i_22_, 1245184)
                            i_17_ = 0xfff and 1 + i_17_
                            RegionSceneLoader.aByteArrayArrayArray3700!![CompiledScriptCacheStatics.anInt4372]!![i_19_ - 1]!![i_22_] = i_16_
                        }
                        if (++i_22_ < RangeThresholdTextureNodeStatics.anInt9109) {
                            if (i_19_ - 1 >= 0 && i_16_ != (RegionSceneLoader.aByteArrayArrayArray3700!![CompiledScriptCacheStatics.anInt4372]!![-1 + i_19_]!![i_22_]) && ((AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![CompiledScriptCacheStatics.anInt4372]!![i_19_]!![i_22_]).toInt() and 0x4) == 0 && (0x4 and (AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![CompiledScriptCacheStatics.anInt4372]!![-1 + i_19_]!![-1 + i_22_]).toInt()) == 0) {
                                PcmStreamBufferStatics.anIntArray8862!![i_17_] = (BoundsConstraintEntryStatics.method2057(1375731712, BoundsConstraintEntryStatics.method2057(i_19_ + -1, 1179648)))
                                ClientExceptionStatics.anIntArray110!![i_17_] = BoundsConstraintEntryStatics.method2057(i_22_, 1245184)
                                RegionSceneLoader.aByteArrayArrayArray3700!![CompiledScriptCacheStatics.anInt4372]!![-1 + i_19_]!![i_22_] = i_16_
                                i_17_ = 0xfff and 1 + i_17_
                            }
                            if ((RegionSceneLoader.aByteArrayArrayArray3700!![CompiledScriptCacheStatics.anInt4372]!![i_19_]!![i_22_]) != i_16_) {
                                PcmStreamBufferStatics.anIntArray8862!![i_17_] = (BoundsConstraintEntryStatics.method2057(318767104, BoundsConstraintEntryStatics.method2057(i_19_, 5373952)))
                                ClientExceptionStatics.anIntArray110!![i_17_] = BoundsConstraintEntryStatics.method2057(i_22_, 5439488)
                                RegionSceneLoader.aByteArrayArrayArray3700!![CompiledScriptCacheStatics.anInt4372]!![i_19_]!![i_22_] = i_16_
                                i_17_ = i_17_ + 1 and 0xfff
                            }
                            if (1 + i_19_ < anInt7319 && ((RegionSceneLoader.aByteArrayArrayArray3700!![CompiledScriptCacheStatics.anInt4372]!![i_19_ + 1]!![i_22_]) != i_16_) && (0x4 and (AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![CompiledScriptCacheStatics.anInt4372]!![i_19_]!![i_22_]).toInt()) == 0 && (0x4 and (AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![CompiledScriptCacheStatics.anInt4372]!![1 + i_19_]!![i_22_ + -1]).toInt()) == 0) {
                                PcmStreamBufferStatics.anIntArray8862!![i_17_] = (BoundsConstraintEntryStatics.method2057(-1845493760, BoundsConstraintEntryStatics.method2057(1 + i_19_, 5373952)))
                                ClientExceptionStatics.anIntArray110!![i_17_] = BoundsConstraintEntryStatics.method2057(5439488, i_22_)
                                i_17_ = 1 + i_17_ and 0xfff
                                RegionSceneLoader.aByteArrayArrayArray3700!![CompiledScriptCacheStatics.anInt4372]!![i_19_ - -1]!![i_22_] = i_16_
                            }
                        }
                        i_22_--
                        if (i_19_ - -1 < anInt7319 && (RegionSceneLoader.aByteArrayArrayArray3700!![CompiledScriptCacheStatics.anInt4372]!![i_19_ - -1]!![i_22_]) != i_16_) {
                            PcmStreamBufferStatics.anIntArray8862!![i_17_] = BoundsConstraintEntryStatics.method2057(1392508928, BoundsConstraintEntryStatics.method2057(9568256, 1 + i_19_))
                            ClientExceptionStatics.anIntArray110!![i_17_] = BoundsConstraintEntryStatics.method2057(i_22_, 9633792)
                            i_17_ = 1 + i_17_ and 0xfff
                            RegionSceneLoader.aByteArrayArrayArray3700!![CompiledScriptCacheStatics.anInt4372]!![i_19_ - -1]!![i_22_] = i_16_
                        }
                        if (--i_22_ >= 0) {
                            if (i_19_ + -1 >= 0 && i_16_ != (RegionSceneLoader.aByteArrayArrayArray3700!![CompiledScriptCacheStatics.anInt4372]!![i_19_ - 1]!![i_22_]) && (0x4 and (AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![CompiledScriptCacheStatics.anInt4372]!![i_19_]!![i_22_]).toInt()) == 0 && (0x4 and (AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![CompiledScriptCacheStatics.anInt4372]!![-1 + i_19_]!![1 + i_22_]).toInt()) == 0) {
                                PcmStreamBufferStatics.anIntArray8862!![i_17_] = (BoundsConstraintEntryStatics.method2057(301989888, BoundsConstraintEntryStatics.method2057(13762560, -1 + i_19_)))
                                ClientExceptionStatics.anIntArray110!![i_17_] = BoundsConstraintEntryStatics.method2057(i_22_, 13828096)
                                RegionSceneLoader.aByteArrayArrayArray3700!![CompiledScriptCacheStatics.anInt4372]!![i_19_ - 1]!![i_22_] = i_16_
                                i_17_ = i_17_ - -1 and 0xfff
                            }
                            if ((RegionSceneLoader.aByteArrayArrayArray3700!![CompiledScriptCacheStatics.anInt4372]!![i_19_]!![i_22_]) != i_16_) {
                                PcmStreamBufferStatics.anIntArray8862!![i_17_] = BoundsConstraintEntryStatics.method2057(BoundsConstraintEntryStatics.method2057(13762560, i_19_), -1828716544)
                                ClientExceptionStatics.anIntArray110!![i_17_] = BoundsConstraintEntryStatics.method2057(13828096, i_22_)
                                RegionSceneLoader.aByteArrayArrayArray3700!![CompiledScriptCacheStatics.anInt4372]!![i_19_]!![i_22_] = i_16_
                                i_17_ = 0xfff and i_17_ - -1
                            }
                            if (anInt7319 > 1 + i_19_ && (RegionSceneLoader.aByteArrayArrayArray3700!![CompiledScriptCacheStatics.anInt4372]!![1 + i_19_]!![i_22_]) != i_16_ && ((AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![CompiledScriptCacheStatics.anInt4372]!![i_19_]!![i_22_]).toInt() and 0x4) == 0 && ((AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![CompiledScriptCacheStatics.anInt4372]!![i_19_ + 1]!![i_22_ + 1]).toInt() and 0x4) == 0) {
                                PcmStreamBufferStatics.anIntArray8862!![i_17_] = (BoundsConstraintEntryStatics.method2057(-771751936, BoundsConstraintEntryStatics.method2057(i_19_ - -1, 9568256)))
                                ClientExceptionStatics.anIntArray110!![i_17_] = BoundsConstraintEntryStatics.method2057(i_22_, 9633792)
                                RegionSceneLoader.aByteArrayArrayArray3700!![CompiledScriptCacheStatics.anInt4372]!![i_19_ - -1]!![i_22_] = i_16_
                                i_17_ = 0xfff and i_17_ - -1
                            }
                        }
                    }
                }
                if (FileIoUtil.anIntArray4097!![i_15_] != -1000000) {
                    FileIoUtil.anIntArray4097!![i_15_] += 40
                    LinkedListIteratorStatics.anIntArray2117!![i_15_] -= 512
                    BlankTextureNodeStatics.anIntArray9259!![i_15_] += 512
                    ConnectionStateTypeStatics.anIntArray1045!![i_15_] += 512
                    AbstractModelStatics.anIntArray1127!![i_15_] -= 512
                }
                return true
            }
    
            @JvmStatic
            fun method3543(i: Byte) {
                anInt7309++
                if (i.toInt() == -89) {
                    FontMetaRefStatics.aBoolean4328 = false
                    TextureCacheStatics.method3466(i + 6)
                }
            }
    
            @JvmStatic
            fun method3544(class348_sub49: ByteBuffer?, i: Int, string: String?): Int {
                try {
                    anInt7321++
                    val i_38_ = class348_sub49!!.anInt7197
                    val `is` = ClientGameLoopNodeStatics.method2992(string, (-20).toByte())
                    val i_39_ = 1 % ((-6 - i) / 63)
                    class348_sub49.method3381(5537, `is`.size)
                    class348_sub49.anInt7197 += (AbstractModelStatics.aHuffmanCodec_1131!!.method2227(`is`.size, 0, class348_sub49.anInt7197, `is`, 103, class348_sub49.aByteArray7154))
                    return class348_sub49.anInt7197 + -i_38_
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("bk.O(" + (if (class348_sub49 != null) "{...}" else "null") + ',' + i + ',' + (if (string != null) "{...}" else "null") + ')'))
                }
            }
}
