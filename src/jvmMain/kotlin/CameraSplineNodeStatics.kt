import kotlin.math.atan2
import kotlin.math.sqrt

object CameraSplineNodeStatics {
    var anInt6849: Int = 0
    var aString6854: String? = null
    var anInt6856: Int = 0

    @JvmStatic
    fun method2954(i: Byte) {
        anInt6856++
        if (NativeShaderProgram.anInt9775 != -1 && MapArchiveSource.anInt4803 != -1) {
            val i_0_ = ((CacheArchiveIndex.anInt1780 * (CalendarUtil.anInt4133 + -RenderableGroup.anInt5019) shr 16) + RenderableGroup.anInt5019)
            CacheArchiveIndex.anInt1780 += i_0_
            if (CacheArchiveIndex.anInt1780 < 65535) {
                DragDropControllerStatics.aBoolean4284 = false
                SpriteStore.aBoolean368 = false
            } else {
                DragDropControllerStatics.aBoolean4284 = !SpriteStore.aBoolean368
                CacheArchiveIndex.anInt1780 = 65535
                SpriteStore.aBoolean368 = true
            }
            val f = CacheArchiveIndex.anInt1780.toFloat() / 65535.0f
            val fs = FloatArray(3)
            val i_1_ = 2 * ItemDefinition.anInt2798
            for (i_2_ in 0..2) {
                val i_3_ = 3 * (SpriteDefinition.anIntArrayArrayArray7079!![NativeShaderProgram.anInt9775]!![i_1_]!![i_2_])
                val i_4_ = ((SpriteDefinition.anIntArrayArrayArray7079!![NativeShaderProgram.anInt9775]!![1 + i_1_]!![i_2_]) * 3)
                val i_5_ = 3 * ((SpriteDefinition.anIntArrayArrayArray7079!![NativeShaderProgram.anInt9775]!![2 + i_1_]!![i_2_]) + ((SpriteDefinition.anIntArrayArrayArray7079!![NativeShaderProgram.anInt9775]!![2 + i_1_]!![i_2_]) + -(SpriteDefinition.anIntArrayArrayArray7079!![NativeShaderProgram.anInt9775]!![i_1_ - -3]!![i_2_])))
                val i_6_ = (SpriteDefinition.anIntArrayArrayArray7079!![NativeShaderProgram.anInt9775]!![i_1_]!![i_2_])
                val i_7_ = i_4_ - i_3_
                val i_8_ = -(2 * i_4_) + i_3_ - -i_5_
                val i_9_ = -i_6_ + ((SpriteDefinition.anIntArrayArrayArray7079!![NativeShaderProgram.anInt9775]!![i_1_ - -2]!![i_2_]) + i_4_) + -i_5_
                fs[i_2_] = i_6_.toFloat() + f * (i_7_.toFloat() + f * (f * i_9_.toFloat() + i_8_.toFloat()))
            }
            GlslMaterialPass.anInt6246 = fs[0].toInt() - 512 * ArbVertexProgram.regionTileX
            ParticleSystemRenderer.anInt3855 = -1 * fs[1].toInt()
            CompositeRgbNoiseTexture.anInt8685 = fs[2].toInt() + -(RegionMapDecoder.regionTileY * 512)
            val fs_10_ = FloatArray(3)
            val i_11_ = 2 * CompassSmoother.anInt3373
            val i_12_ = -88 % ((-64 - i) / 57)
            for (i_13_ in 0..2) {
                val i_14_ = 3 * (SpriteDefinition.anIntArrayArrayArray7079!![MapArchiveSource.anInt4803]!![i_11_]!![i_13_])
                val i_15_ = 3 * (SpriteDefinition.anIntArrayArrayArray7079!![MapArchiveSource.anInt4803]!![i_11_ + 1]!![i_13_])
                val i_16_ = (((SpriteDefinition.anIntArrayArrayArray7079!![MapArchiveSource.anInt4803]!![2 + i_11_]!![i_13_]) + (-(SpriteDefinition.anIntArrayArrayArray7079!![MapArchiveSource.anInt4803]!![3 + i_11_]!![i_13_]) + (SpriteDefinition.anIntArrayArrayArray7079!![MapArchiveSource.anInt4803]!![i_11_ - -2]!![i_13_]))) * 3)
                val i_17_ = (SpriteDefinition.anIntArrayArrayArray7079!![MapArchiveSource.anInt4803]!![i_11_]!![i_13_])
                val i_18_ = -i_14_ + i_15_
                val i_19_ = -(i_15_ * 2) + i_14_ + i_16_
                val i_20_ = (-i_16_ + i_15_ + (-i_17_ + (SpriteDefinition.anIntArrayArrayArray7079!![MapArchiveSource.anInt4803]!![2 + i_11_]!![i_13_])))
                fs_10_[i_13_] = (f * (i_18_.toFloat() + f * (i_20_.toFloat() * f + i_19_.toFloat())) + i_17_.toFloat())
            }
            val f_21_ = -fs[0] + fs_10_[0]
            val f_22_ = -1.0f * (-fs[1] + fs_10_[1])
            val f_23_ = -fs[2] + fs_10_[2]
            val d = sqrt((f_21_ * f_21_ + f_23_ * f_23_).toDouble())
            MinimapAreaMarkerNode.anInt9701 = 0x3fff and (2607.5945876176133 * atan2(f_22_.toDouble(), d)).toInt()
            WorldMapElement.anInt4638 = 0x3fff and (2607.5945876176133 * -atan2(f_21_.toDouble(), f_23_.toDouble())).toInt()
            MapTileShape.anInt4186 = ((SpriteDefinition.anIntArrayArrayArray7079!![NativeShaderProgram.anInt9775]!![i_1_]!![3]) + (((-(SpriteDefinition.anIntArrayArrayArray7079!![NativeShaderProgram.anInt9775]!![i_1_]!![3]) + (SpriteDefinition.anIntArrayArrayArray7079!![NativeShaderProgram.anInt9775]!![2 + i_1_]!![3])) * CacheArchiveIndex.anInt1780) shr 16))
        }
    }

    @JvmStatic
    fun method2956(i: Byte) {
        aString6854 = null
        if (i.toInt() != 53) method2954((-100).toByte())
    }
}
