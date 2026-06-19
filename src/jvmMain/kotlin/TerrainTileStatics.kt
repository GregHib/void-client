import java.awt.Canvas

object TerrainTileStatics {
    @JvmField
            var aJs5Archive_4585: Js5Archive? = null
            @JvmField
            var anInt4586: Int = 0
            @JvmField
            var anInt4589: Int = 0
            @JvmField
            var anInt4591: Int = 0
            @JvmField
            var anInt4593: Int = 0
    
            @JvmStatic
            fun method3980(i: Int, canvas: Canvas) {
                if (i > 85) {
                    anInt4586++
                    val dimension = canvas.getSize()
                    WhirlpoolHashStatics.method828(38.toByte(), dimension.height, dimension.width)
                    if (ByteBufferStatics.anInt7207 != 1) CameraRotationStubStatics.aRenderer326!!.method3669(canvas, GrayscaleNoiseTextureStatics.anInt5283, LinkedNodeListIteratorStatics.anInt1651)
                    else CameraRotationStubStatics.aRenderer326!!.method3669(canvas, SynthVoiceGroupStatics.anInt8854, ShadowQualityOptionStateStatics.anInt6008)
                }
            }
    
            @JvmStatic
            fun method3985(i: Int, i_29_: Int): HintArrowOrMessage? {
                anInt4591++
                if (i_29_ < 0 || i_29_ >= 100) return null
                return SceneModelBuilderStatics.aHintArrowOrMessageArray6400s!![i_29_]
            }
    
            @JvmStatic
            fun method3988(i: Int) {
                val i_56_ = 49 / ((15 - i) / 40)
                aJs5Archive_4585 = null
            }
}
