import ParticleDetailOptionState.Companion.method1793
import WaterMaterialPass.Companion.method2152
import jagtheora.ogg.OggPacket
import jagtheora.ogg.OggStreamState

class KaraokeSubtitleStream internal constructor(oggstreamstate: OggStreamState) : OggBitstreamDecoder(oggstreamstate) {
    private var aFloat9048 = 0f
    private var aString9051: String? = null
    private var anInt9054 = 0
    private var anInt9055 = 0
    private var aString9057: String? = null
    private var aString9058: String? = null
    private var aFloat9062 = 0f
    override fun method2961(i: Byte) {
        anInt9056++
        if (i.toInt() != 13) aString9058 = null
    }

    fun method2983(i: Byte): Float {
        if (i <= 61) return -0.49539495f
        anInt9052++
        return aFloat9062
    }

    fun method2984(i: Byte): Float {
        anInt9060++
        if (i.toInt() != 97) aFloat9048 = -0.6790166f
        return aFloat9048
    }

    override fun method2964(i: Byte, oggpacket: OggPacket) {
        anInt9063++
        if (this.anInt6868 <= 0 || "SUB" == aString9057) {
            val class348_sub49 = ByteBuffer(oggpacket.data)
            val i_2_ = class348_sub49.readUnsignedByte(255)
            if (this.anInt6868 <= 8) {
                check((i_2_ or 0x80) != 0)
                if (this.anInt6868 == 0) {
                    class348_sub49.anInt7197 += 23
                    anInt9055 = class348_sub49.method3359(-89)
                    anInt9054 = class348_sub49.method3359(-41)
                    check(!(anInt9055 == 0 || anInt9054 == 0))
                    val class348_sub49_3_ = ByteBuffer(16)
                    class348_sub49.method3389(2147483647, 0, 16, (class348_sub49_3_.aByteArray7154!!))
                    aString9051 = class348_sub49_3_.readString((-91).toByte())
                    class348_sub49_3_.anInt7197 = 0
                    class348_sub49.method3389(2147483647, 0, 16, (class348_sub49_3_.aByteArray7154!!))
                    aString9057 = class348_sub49_3_.readString((-40).toByte())
                }
            } else {
                if (i_2_ == 0) {
                    val l = class348_sub49.method3332(109.toByte())
                    val l_4_ = class348_sub49.method3332(90.toByte())
                    val l_5_ = class348_sub49.method3332(122.toByte())
                    check(!(l < 0 || l_4_ < 0 || l_5_ < 0 || l_5_ > l))
                    aFloat9062 = (anInt9054.toLong() * l).toFloat() / anInt9055.toFloat()
                    aFloat9048 = (((l - -l_4_) * anInt9054.toLong()).toFloat() / anInt9055.toFloat())
                    val i_6_ = class348_sub49.method3359(-93)
                    check(!(i_6_ < 0 || i_6_ > (-class348_sub49.anInt7197 + (class348_sub49.aByteArray7154)!!.size)))
                    aString9058 = (method1793(class348_sub49.aByteArray7154!!, class348_sub49.anInt7197, -123, i_6_))
                }
                if ((i_2_ or 0x80) != 0) return
            }
            if (i >= -91) anInt9055 = 88
        }
    }

    fun method2986(i: Int): String? {
        anInt9053++
        if (i < 26) method2986(-122)
        return aString9051
    }

    fun method2989(i: Int): String? {
        val i_12_ = 4 / ((i - -63) / 50)
        anInt9061++
        return aString9058
    }

    companion object {

        var anInt9047: Int = 0

        var anInt9049: Int = 0

        var anIntArray9050: IntArray? = IntArray(14)

        var anInt9052: Int = 0

        var anInt9053: Int = 0

        var anInt9056: Int = 0

        var anInt9059: Int = 0

        var anInt9060: Int = 0

        var anInt9061: Int = 0

        var anInt9063: Int = 0

        @JvmStatic
        fun method2985(i: Int, i_0_: Int, i_1_: Int): Boolean {
            if (i != -31735) Companion.method2990((-62).toByte())
            anInt9059++
            return (0x100 and i_1_) != 0
        }

        @JvmStatic
        fun method2987(i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int) {
            anInt9047++
            if (i_7_ == 8 || i_7_ == 16) {
                var i_11_ = 0
                while ((PackedFlagsAccessor.anInt7101 > i_11_)) {
                    val class338 = LoadingBarRenderer.aMapTileShapeArray5060!![i_11_]!!
                    if ((class338.aByte4192.toInt() == i_7_ && i_10_ == class338.aShort4185.toInt() && i_8_ == class338.aShort4193.toInt()) || ((class338.aShort4182.toInt() == i_10_) && (class338.aShort4193.toInt() == i_8_))) {
                        if (i_11_ != PackedFlagsAccessor.anInt7101) ArrayCopyUtil.method1575(LoadingBarRenderer.aMapTileShapeArray5060!!, 1 + i_11_, LoadingBarRenderer.aMapTileShapeArray5060!!, i_11_, (LoadingBarRenderer.aMapTileShapeArray5060!!.size + -i_11_ - 1))
                        PackedFlagsAccessor.anInt7101--
                        return
                    }
                    i_11_++
                }
            } else {
                val class357 = HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_10_]!![i_8_]
                if (class357 != null) {
                    if (i_7_ != 1) {
                        if (i_7_ == 2) class357.aShort4398 = 0.toShort()
                    } else class357.aShort4409 = 0.toShort()
                }
                method2152(false)
            }
            if (i_9_ != -3951) anIntArray9050 = null
        }

        @JvmStatic
        fun method2988(bool: Boolean) {
            TerrainChunkBuilder.aRenderer1098!!.xa((IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub10_7232!!.method1764(-32350).toFloat() * 0.1f + 0.7f) * KeyboardLayoutConfig.aFloat2137)
            anInt9049++
            TerrainChunkBuilder.aRenderer1098!!.ZA(NativeIndexBuffer.anInt4703, TextureMetadataProvider.aFloat4626, CollisionMap.aFloat4455, (CameraRotationStubStatics.anInt325 shl 2).toFloat(), (ModelGroundDecor.anInt10023 shl 2).toFloat(), (GroundItemRenderState.anInt2601 shl 2).toFloat())
            TerrainChunkBuilder.aRenderer1098!!.method3653(HeapInfoRecord.aCircleRasterizer_4938)
            if (bool != true) anIntArray9050 = null
        }

        @JvmStatic
        fun method2990(i: Byte) {
            anIntArray9050 = null
            if (i <= 101) anIntArray9050 = null
        }
    }
}
