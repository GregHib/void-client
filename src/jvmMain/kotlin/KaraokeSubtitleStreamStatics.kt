import ParticleDetailOptionStateStatics.method1793
import WaterMaterialPassStatics.method2152
import jagtheora.ogg.OggPacket
import jagtheora.ogg.OggStreamState

object KaraokeSubtitleStreamStatics {
    @JvmField
            var anInt9047: Int = 0
            @JvmField
            var anInt9049: Int = 0
            @JvmField
            var anIntArray9050: IntArray? = IntArray(14)
            @JvmField
            var anInt9052: Int = 0
            @JvmField
            var anInt9053: Int = 0
            @JvmField
            var anInt9056: Int = 0
            @JvmField
            var anInt9059: Int = 0
            @JvmField
            var anInt9060: Int = 0
            @JvmField
            var anInt9061: Int = 0
            @JvmField
            var anInt9063: Int = 0
    
            @JvmStatic
            fun method2985(i: Int, i_0_: Int, i_1_: Int): Boolean {
                if (i != -31735) method2990((-62).toByte())
                anInt9059++
                return (0x100 and i_1_) != 0
            }
    
            @JvmStatic
            fun method2987(i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int) {
                anInt9047++
                if (i_7_ == 8 || i_7_ == 16) {
                    var i_11_ = 0
                    while ((PackedFlagsAccessorStatics.anInt7101 > i_11_)) {
                        val class338 = LoadingBarRendererStatics.aMapTileShapeArray5060!![i_11_]!!
                        if ((class338.aByte4192.toInt() == i_7_ && i_10_ == class338.aShort4185.toInt() && i_8_ == class338.aShort4193.toInt()) || ((class338.aShort4182.toInt() == i_10_) && (class338.aShort4193.toInt() == i_8_))) {
                            if (i_11_ != PackedFlagsAccessorStatics.anInt7101) ArrayCopyUtil.method1575(LoadingBarRendererStatics.aMapTileShapeArray5060!!, 1 + i_11_, LoadingBarRendererStatics.aMapTileShapeArray5060!!, i_11_, (LoadingBarRendererStatics.aMapTileShapeArray5060!!.size + -i_11_ - 1))
                            PackedFlagsAccessorStatics.anInt7101--
                            return
                        }
                        i_11_++
                    }
                } else {
                    val class357 = HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_10_]!![i_8_]
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
                LruByteCacheStatics.aRenderer1098!!.xa((IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub10_7232!!.method1764(-32350).toFloat() * 0.1f + 0.7f) * KeyboardLayoutConfigStatics.aFloat2137)
                anInt9049++
                LruByteCacheStatics.aRenderer1098!!.ZA(NativeIndexBufferStatics.anInt4703, TextureMetadataProviderStatics.aFloat4626, CollisionMapStatics.aFloat4455, (CameraRotationStubStatics.anInt325 shl 2).toFloat(), (ModelGroundDecorStatics.anInt10023 shl 2).toFloat(), (SingletonMarkerStatics.anInt2601 shl 2).toFloat())
                LruByteCacheStatics.aRenderer1098!!.method3653(HeapInfoRecordStatics.aCircleRasterizer_4938)
                if (bool != true) anIntArray9050 = null
            }
    
            @JvmStatic
            fun method2990(i: Byte) {
                anIntArray9050 = null
                if (i <= 101) anIntArray9050 = null
            }
}
