import SphereMapMaterialPass.Companion.method2177
import GroundDecorEntity.Companion.method2413

/* Class348_Sub40_Sub18 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ConstantColourTextureNode private constructor(i: Int) : AbstractProceduralTextureNode(0, false) {
    private var anInt9244 = 0
    private var anInt9250 = 0
    private var anInt9252 = 0

    init {
        method3095(-104, i)
    }

    override fun method3047(i: Int, i_14_: Int): Array<IntArray?>? {
        anInt9246++
        val `is` = this.aImageFrameCache_7033!!.method2557(i_14_ xor 0x5d41e2b0, i)!!
        if (this.aImageFrameCache_7033!!.aBoolean4035) {
            val is_15_ = `is`[0]!!
            val is_16_ = `is`[1]!!
            val is_17_ = `is`[2]!!
            for (i_18_ in 0..<DisplaceTextureNode.Companion.anInt9139) {
                is_15_[i_18_] = anInt9244
                is_16_[i_18_] = anInt9252
                is_17_[i_18_] = anInt9250
            }
        }
        if (i_14_ != -1564599039) method3095(102, 6)
        return `is`
    }

    private fun method3095(i: Int, i_19_: Int) {
        anInt9244 = 0xff0 and (i_19_ shr 12)
        anInt9252 = i_19_ shr 4 and 0xff0
        anInt9248++
        anInt9250 = (i_19_ and 0xff) shl 4
        if (i >= -54) anInt9250 = -42
    }

    override fun method3049(class348_sub49: ByteBuffer, i: Int, i_20_: Int) {
        val i_21_ = i
        if (i_21_ == 0) method3095(-124, class348_sub49.readMedium(-1))
        anInt9251++
        if (i_20_ != 31015) anInt9250 = 105
    }

    constructor() : this(0)

    companion object {
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
            for (i_1_ in 0..<ShaderState.anInt6513) {
                val i_2_ = ScrollTexMaterialPass.anIntArray6290!![i_1_]
                if ((0x1 and AbstractBloomEffect.aByteArray6624!![i_2_].toInt()) == 0) {
                    if (i_0_ > 0) {
                        AbstractBloomEffect.aByteArray6624!![i_2_] = BoundsConstraintEntry.method2057((AbstractBloomEffect.aByteArray6624!![i_2_]).toInt(), 2).toByte()
                        i_0_--
                    } else {
                        val i_3_ = class348_sub49_sub2.readBits((-24).toByte(), 1)
                        if (i_3_ == 0) {
                            i_0_ = method2413(1, class348_sub49_sub2)
                            AbstractBloomEffect.aByteArray6624!![i_2_] = BoundsConstraintEntry.method2057((AbstractBloomEffect.aByteArray6624!![i_2_]).toInt(), 2).toByte()
                        } else {
                            method2177(1, i_2_, class348_sub49_sub2)
                        }
                    }
                }
            }
            class348_sub49_sub2.stopBitAccess(false)
            if (i_0_ != 0) throw RuntimeException("nsn0")
            class348_sub49_sub2.startBitAccess(-65)
            for (i_4_ in 0..<ShaderState.anInt6513) {
                val i_5_ = ScrollTexMaterialPass.anIntArray6290!![i_4_]
                if ((0x1 and AbstractBloomEffect.aByteArray6624!![i_5_].toInt()) != 0) {
                    if (i_0_ > 0) {
                        AbstractBloomEffect.aByteArray6624!![i_5_] = BoundsConstraintEntry.method2057((AbstractBloomEffect.aByteArray6624!![i_5_]).toInt(), 2).toByte()
                        i_0_--
                    } else {
                        val i_6_ = class348_sub49_sub2.readBits((-24).toByte(), 1)
                        if (i_6_ == 0) {
                            i_0_ = method2413(1, class348_sub49_sub2)
                            AbstractBloomEffect.aByteArray6624!![i_5_] = BoundsConstraintEntry.method2057((AbstractBloomEffect.aByteArray6624!![i_5_]).toInt(), 2).toByte()
                        } else method2177(i xor 0x53e4.inv(), i_5_, class348_sub49_sub2)
                    }
                }
            }
            class348_sub49_sub2.stopBitAccess(false)
            if (i_0_ != 0) throw RuntimeException("nsn1")
            class348_sub49_sub2.startBitAccess(i xor 0x5398.inv())
            var i_7_ = 0
            while ((i_7_ < ShortMatrixNode.anInt9513)) {
                val i_8_ = GlArrayBufferObject.anIntArray4709!![i_7_]
                if ((0x1 and AbstractBloomEffect.aByteArray6624!![i_8_].toInt()) != 0) {
                    if (i_0_ > 0) {
                        AbstractBloomEffect.aByteArray6624!![i_8_] = BoundsConstraintEntry.method2057((AbstractBloomEffect.aByteArray6624!![i_8_]).toInt(), 2).toByte()
                        i_0_--
                    } else {
                        val i_9_ = class348_sub49_sub2.readBits((-24).toByte(), 1)
                        if (i_9_ == 0) {
                            i_0_ = method2413(i + 21479, class348_sub49_sub2)
                            AbstractBloomEffect.aByteArray6624!![i_8_] = BoundsConstraintEntry.method2057((AbstractBloomEffect.aByteArray6624!![i_8_]).toInt(), 2).toByte()
                        } else if (SoundEnvelope.method1538(i_8_, 105.toByte(), class348_sub49_sub2)) AbstractBloomEffect.aByteArray6624!![i_8_] = BoundsConstraintEntry.method2057((AbstractBloomEffect.aByteArray6624!![i_8_]).toInt(), 2).toByte()
                    }
                }
                i_7_++
            }
            class348_sub49_sub2.stopBitAccess(false)
            if (i == -21478) {
                if (i_0_ != 0) throw RuntimeException("nsn2")
                class348_sub49_sub2.startBitAccess(36)
                var i_10_ = 0
                while ((ShortMatrixNode.anInt9513 > i_10_)) {
                    val i_11_ = GlArrayBufferObject.anIntArray4709!![i_10_]
                    if ((AbstractBloomEffect.aByteArray6624!![i_11_].toInt() and 0x1) == 0) {
                        if (i_0_ > 0) {
                            AbstractBloomEffect.aByteArray6624!![i_11_] = BoundsConstraintEntry.method2057((AbstractBloomEffect.aByteArray6624!![i_11_]).toInt(), 2).toByte()
                            i_0_--
                        } else {
                            val i_12_ = class348_sub49_sub2.readBits((-24).toByte(), 1)
                            if (i_12_ == 0) {
                                i_0_ = method2413(1, class348_sub49_sub2)
                                AbstractBloomEffect.aByteArray6624!![i_11_] = BoundsConstraintEntry.method2057((AbstractBloomEffect.aByteArray6624!![i_11_]).toInt(), 2).toByte()
                            } else if (SoundEnvelope.method1538(i_11_, 105.toByte(), class348_sub49_sub2)) AbstractBloomEffect.aByteArray6624!![i_11_] = BoundsConstraintEntry.method2057((AbstractBloomEffect.aByteArray6624!![i_11_]).toInt(), 2).toByte()
                        }
                    }
                    i_10_++
                }
                class348_sub49_sub2.stopBitAccess(false)
                if (i_0_ != 0) throw RuntimeException("nsn3")
                ShaderState.anInt6513 = 0
                ShortMatrixNode.anInt9513 = 0
                for (i_13_ in 1..2047) {
                    AbstractBloomEffect.aByteArray6624!![i_13_] = (AbstractBloomEffect.aByteArray6624!![i_13_].toInt() shr 1).toByte()
                    val player = LoadingBarRenderer.aPlayerArray5058!![i_13_]
                    if (player == null) GlArrayBufferObject.anIntArray4709!![ShortMatrixNode.anInt9513++] = i_13_
                    else ScrollTexMaterialPass.anIntArray6290!![ShaderState.anInt6513++] = i_13_
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
}
