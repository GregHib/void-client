import WorldMapAreaLabelStatics.method3570

object ProjectionCameraTransformStatics {
    @JvmField
            var anInt5746: Int = 0
            @JvmField
            var anInt5748: Int = 0
            @JvmField
            var anInt5749: Int = 0
            @JvmField
            var anInt5752: Int = 0
            @JvmField
            var anInt5753: Int = 0
            @JvmField
            var anInt5755: Int = 0
            @JvmField
            var anInt5757: Int = 0
            @JvmField
            var anInt5758: Int = 0
            @JvmField
            var anInt5759: Int = 0
            @JvmField
            var anInt5760: Int = 0
            @JvmField
            var anInt5763: Int = 0
            @JvmField
            var aEmoteDefCache_5764: EmoteDefCache? = null
            @JvmField
            var anInt5765: Int = 0
            @JvmField
            var anInt5766: Int = 0
            @JvmField
            var anInt5767: Int = 0
            @JvmField
            var anInt5768: Int = 0
            @JvmField
            var anInt5771: Int = 0
            @JvmField
            var anInt5773: Int = 0
            @JvmField
            var anInt5774: Int = 0
            @JvmField
            var anInt5775: Int = 0
            @JvmField
            var anInt5776: Int = 0
            @JvmField
            var anInt5777: Int = 0
            @JvmField
            var anInt5778: Int = 0
            @JvmField
            var anInt5779: Int = 0
            @JvmField
            var anInt5780: Int = 0
            @JvmField
            var anInt5782: Int = 0
            @JvmField
            var anInt5783: Int = 0
            @JvmField
            var anInt5785: Int = 0
    
            @JvmStatic
            fun method938(i: Int) {
                aEmoteDefCache_5764 = null
                if (i <= 8) aEmoteDefCache_5764 = null
            }
    
            fun method941(i: Int, i_48_: Int) {
                IsaacCipherStatics.anInt1290 = i_48_
                anInt5755++
                if (i <= 113) aEmoteDefCache_5764 = null
            }
    
            @JvmStatic
            fun method943(bool: Boolean): MidiSequencePlayer? {
                anInt5776++
                if (bool != false) method943(true)
                return NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564
            }
    
            fun method944(i: Int, `is`: Array<ByteArray?>?, class237_sub1: WorldMapSceneSoftware?) {
                try {
                    if (i != -8212) method944(65, null, null)
                    anInt5752++
                    for (i_52_ in 0..<class237_sub1!!.anInt3130) {
                        method3570(false)
                        var i_53_ = 0
                        while ((i_53_ < GlCubemapLightPassStatics.anInt7319 shr 3)) {
                            var i_54_ = 0
                            while ((RangeThresholdTextureNodeStatics.anInt9109 shr 3 > i_54_)) {
                                val i_55_ = (GameClock.anIntArrayArrayArray1116!![i_52_]!![i_53_]!![i_54_])
                                if (i_55_ != -1) {
                                    val i_56_ = 0x3 and (i_55_ shr 24)
                                    if (!class237_sub1.aBoolean3109 || i_56_ == 0) {
                                        val i_57_ = (0x6 and i_55_) shr 1
                                        val i_58_ = i_55_ shr 14 and 0x3ff
                                        val i_59_ = (0x3ff9 and i_55_) shr 3
                                        val i_60_ = i_59_ / 8 + (i_58_ / 8 shl 8)
                                        for (i_61_ in NullOggStreamStatics.anIntArray9042!!.indices) {
                                            if (i_60_ == (NullOggStreamStatics.anIntArray9042!![i_61_]) && `is`!![i_61_] != null) {
                                                class237_sub1.method1692((i_58_ and 0x7) * 8, i_57_, `is`[i_61_], i_56_, (i_59_ and 0x7) * 8, FacingDirectionNodeStatics.aRenderer6654, 8 * i_54_, 8 * i_53_, i + 8219, TimedRecordAccessorStatics.aCollisionMapArray7108s, i_52_)
                                                break
                                            }
                                        }
                                    }
                                }
                                i_54_++
                            }
                            i_53_++
                        }
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("iaa.W(" + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (class237_sub1 != null) "{...}" else "null") + ')'))
                }
            }
    
            fun method947(i: Byte) {
                anInt5783++
                if (i.toInt() != 41) anInt5768 = 38
                run {
                    var class348_sub9 = MapSceneIconDefStatics.aNodeDeque_2859!!.method1995(4) as? CharacterRenderState
                    while (class348_sub9 != null) {
                        if (class348_sub9!!.aBoolean6684) class348_sub9!!.method2781(21.toByte())
                        class348_sub9 = MapSceneIconDefStatics.aNodeDeque_2859!!.method1990(117.toByte()) as? CharacterRenderState
                    }
                }
                var class348_sub9 = ClientStatics.aNodeDeque_5185!!.method1995(4) as? CharacterRenderState
                while (class348_sub9 != null) {
                    if (class348_sub9!!.aBoolean6684) class348_sub9!!.method2781(21.toByte())
                    class348_sub9 = (ClientStatics.aNodeDeque_5185!!.method1990(39.toByte()) as? CharacterRenderState)
                }
            }
}
