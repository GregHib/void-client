import SphereMapMaterialPassStatics.method2177
import GroundDecorEntityStatics.method2413

object ConstantColourTextureNodeStatics {
    @JvmField
            var aMapElementDefinitionCache_9245: MapElementDefinitionCache? = null
            @JvmField
            var anInt9246: Int = 0
            @JvmField
            var anInt9247: Int = 0
            @JvmField
            var anInt9248: Int = 0
            @JvmField
            var anIntArray9249: IntArray? = intArrayOf(2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0)
            @JvmField
            var anInt9251: Int = 0
            fun method3094(i: Int, class348_sub49_sub2: CipheredPacketBuffer) {
                anInt9247++
                var i_0_ = 0
                class348_sub49_sub2.startBitAccess(-87)
                for (i_1_ in 0..<ShaderStateStatics.anInt6513) {
                    val i_2_ = ScrollTexMaterialPassStatics.anIntArray6290!![i_1_]
                    if ((0x1 and AbstractBloomEffectStatics.aByteArray6624!![i_2_].toInt()) == 0) {
                        if (i_0_ > 0) {
                            AbstractBloomEffectStatics.aByteArray6624!![i_2_] = BoundsConstraintEntryStatics.method2057((AbstractBloomEffectStatics.aByteArray6624!![i_2_]).toInt(), 2).toByte()
                            i_0_--
                        } else {
                            val i_3_ = class348_sub49_sub2.readBits((-24).toByte(), 1)
                            if (i_3_ == 0) {
                                i_0_ = method2413(1, class348_sub49_sub2)
                                AbstractBloomEffectStatics.aByteArray6624!![i_2_] = BoundsConstraintEntryStatics.method2057((AbstractBloomEffectStatics.aByteArray6624!![i_2_]).toInt(), 2).toByte()
                            } else {
                                method2177(1, i_2_, class348_sub49_sub2)
                            }
                        }
                    }
                }
                class348_sub49_sub2.stopBitAccess(false)
                if (i_0_ != 0) throw RuntimeException("nsn0")
                class348_sub49_sub2.startBitAccess(-65)
                for (i_4_ in 0..<ShaderStateStatics.anInt6513) {
                    val i_5_ = ScrollTexMaterialPassStatics.anIntArray6290!![i_4_]
                    if ((0x1 and AbstractBloomEffectStatics.aByteArray6624!![i_5_].toInt()) != 0) {
                        if (i_0_ > 0) {
                            AbstractBloomEffectStatics.aByteArray6624!![i_5_] = BoundsConstraintEntryStatics.method2057((AbstractBloomEffectStatics.aByteArray6624!![i_5_]).toInt(), 2).toByte()
                            i_0_--
                        } else {
                            val i_6_ = class348_sub49_sub2.readBits((-24).toByte(), 1)
                            if (i_6_ == 0) {
                                i_0_ = method2413(1, class348_sub49_sub2)
                                AbstractBloomEffectStatics.aByteArray6624!![i_5_] = BoundsConstraintEntryStatics.method2057((AbstractBloomEffectStatics.aByteArray6624!![i_5_]).toInt(), 2).toByte()
                            } else method2177(i xor 0x53e4.inv(), i_5_, class348_sub49_sub2)
                        }
                    }
                }
                class348_sub49_sub2.stopBitAccess(false)
                if (i_0_ != 0) throw RuntimeException("nsn1")
                class348_sub49_sub2.startBitAccess(i xor 0x5398.inv())
                var i_7_ = 0
                while ((i_7_ < ShortMatrixNodeStatics.anInt9513)) {
                    val i_8_ = GlArrayBufferObjectStatics.anIntArray4709!![i_7_]
                    if ((0x1 and AbstractBloomEffectStatics.aByteArray6624!![i_8_].toInt()) != 0) {
                        if (i_0_ > 0) {
                            AbstractBloomEffectStatics.aByteArray6624!![i_8_] = BoundsConstraintEntryStatics.method2057((AbstractBloomEffectStatics.aByteArray6624!![i_8_]).toInt(), 2).toByte()
                            i_0_--
                        } else {
                            val i_9_ = class348_sub49_sub2.readBits((-24).toByte(), 1)
                            if (i_9_ == 0) {
                                i_0_ = method2413(i + 21479, class348_sub49_sub2)
                                AbstractBloomEffectStatics.aByteArray6624!![i_8_] = BoundsConstraintEntryStatics.method2057((AbstractBloomEffectStatics.aByteArray6624!![i_8_]).toInt(), 2).toByte()
                            } else if (SoundEnvelopeStatics.method1538(i_8_, 105.toByte(), class348_sub49_sub2)) AbstractBloomEffectStatics.aByteArray6624!![i_8_] = BoundsConstraintEntryStatics.method2057((AbstractBloomEffectStatics.aByteArray6624!![i_8_]).toInt(), 2).toByte()
                        }
                    }
                    i_7_++
                }
                class348_sub49_sub2.stopBitAccess(false)
                if (i == -21478) {
                    if (i_0_ != 0) throw RuntimeException("nsn2")
                    class348_sub49_sub2.startBitAccess(36)
                    var i_10_ = 0
                    while ((ShortMatrixNodeStatics.anInt9513 > i_10_)) {
                        val i_11_ = GlArrayBufferObjectStatics.anIntArray4709!![i_10_]
                        if ((AbstractBloomEffectStatics.aByteArray6624!![i_11_].toInt() and 0x1) == 0) {
                            if (i_0_ > 0) {
                                AbstractBloomEffectStatics.aByteArray6624!![i_11_] = BoundsConstraintEntryStatics.method2057((AbstractBloomEffectStatics.aByteArray6624!![i_11_]).toInt(), 2).toByte()
                                i_0_--
                            } else {
                                val i_12_ = class348_sub49_sub2.readBits((-24).toByte(), 1)
                                if (i_12_ == 0) {
                                    i_0_ = method2413(1, class348_sub49_sub2)
                                    AbstractBloomEffectStatics.aByteArray6624!![i_11_] = BoundsConstraintEntryStatics.method2057((AbstractBloomEffectStatics.aByteArray6624!![i_11_]).toInt(), 2).toByte()
                                } else if (SoundEnvelopeStatics.method1538(i_11_, 105.toByte(), class348_sub49_sub2)) AbstractBloomEffectStatics.aByteArray6624!![i_11_] = BoundsConstraintEntryStatics.method2057((AbstractBloomEffectStatics.aByteArray6624!![i_11_]).toInt(), 2).toByte()
                            }
                        }
                        i_10_++
                    }
                    class348_sub49_sub2.stopBitAccess(false)
                    if (i_0_ != 0) throw RuntimeException("nsn3")
                    ShaderStateStatics.anInt6513 = 0
                    ShortMatrixNodeStatics.anInt9513 = 0
                    for (i_13_ in 1..2047) {
                        AbstractBloomEffectStatics.aByteArray6624!![i_13_] = (AbstractBloomEffectStatics.aByteArray6624!![i_13_].toInt() shr 1).toByte()
                        val player = LoadingBarRendererStatics.aPlayerArray5058!![i_13_]
                        if (player == null) GlArrayBufferObjectStatics.anIntArray4709!![ShortMatrixNodeStatics.anInt9513++] = i_13_
                        else ScrollTexMaterialPassStatics.anIntArray6290!![ShaderStateStatics.anInt6513++] = i_13_
                    }
                }
            }
    
            @JvmStatic
            fun method3096(i: Int) {
                anIntArray9249 = null
                aMapElementDefinitionCache_9245 = null
                if (i != 32462) aMapElementDefinitionCache_9245 = null
            }
}
