/* Class239_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
class CameraDistanceOptionState : GraphicsOptionState {
    override fun method1714(i: Int, i_0_: Int): Int {
        anInt5851++
        if (i != 3) return -26
        return 3
    }

    override fun method1716(bool: Boolean) {
        anInt5854++
        this.anInt3138 = method1710(20014)
        if (bool != false) aAbstractModelRendererArray5857 = null
    }

    override fun method1710(i: Int): Int {
        if (i != 20014) method1716(true)
        anInt5853++
        if (!this.aClass348_Sub51_3136.method3425(-76)) return 0
        return 1
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    override fun method1712(i: Int, i_13_: Int) {
        val i_14_ = 87 / ((82 - i) / 35)
        this.anInt3138 = i_13_
        anInt5852++
    }

    fun method1726(i: Int): Int {
        anInt5856++
        if (i != -32350) aAbstractModelRendererArray5857 = null
        return this.anInt3138
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    companion object {

        var anInt5851: Int = 0

        var anInt5852: Int = 0

        var anInt5853: Int = 0

        var anInt5854: Int = 0

        var anInt5855: Int = 0

        var anInt5856: Int = 0

        var aAbstractModelRendererArray5857: Array<AbstractModelRenderer?>? = null

        @JvmStatic
        fun method1724(i: Int) {
            aAbstractModelRendererArray5857 = null
            if (i != -4) aAbstractModelRendererArray5857 = null
        }

        var aFloat3938: Float = 0.0f

        var anInt6979: Int = 0
        @JvmStatic
        fun method1725(i: Int) {
            anInt5855++
            var i_1_ = 1024
            var i_2_ = 3072
            if (ParticleSystemRenderer.aBoolean3870) {
                i_2_ = 4096
                if (FloatBuffer.aBoolean9746) i_1_ = 2048
            }
            if (SceneObjectSpawner.aFloat1287 < i_1_.toFloat()) SceneObjectSpawner.aFloat1287 = i_1_.toFloat()
            if (SceneObjectSpawner.aFloat1287 > i_2_.toFloat()) SceneObjectSpawner.aFloat1287 = i_2_.toFloat()
            while ( /**/aFloat3938 >= 16384.0f) {
                aFloat3938 -= 16384.0f
            }
            while ( /**/aFloat3938 < 0.0f) {
                aFloat3938 += 16384.0f
            }
            val i_3_ = FrameStatsReset.anInt5799 shr 9
            val i_4_ = AsyncTaskHandle.anInt2578 shr 9
            val i_5_ = CollisionMapAccessor.method2064(FrameStatsReset.anInt5799, CompiledScriptCache.anInt4372, 11219, AsyncTaskHandle.anInt2578)
            var i_6_ = 0
            if (i_3_ > 3 && i_4_ > 3 && -4 + GlCubemapLightPass.anInt7319 > i_3_ && RangeThresholdTextureNode.anInt9109 - 4 > i_4_) {
                var i_7_ = i_3_ - 4
                while (i_3_ - -4 >= i_7_) {
                    for (i_8_ in -4 + i_4_..4 + i_4_) {
                        var i_9_ = CompiledScriptCache.anInt4372
                        if (i_9_ < 3 && NpcType.method802(i_8_, i_7_, true)) i_9_++
                        var i_10_ = 0
                        if ((MapTileShapeStatics.aClass237_Sub1_4197!!.aByteArrayArrayArray3104) != null && (MapTileShapeStatics.aClass237_Sub1_4197!!.aByteArrayArrayArray3104!![i_9_]) != null) i_10_ = 8 * ((MapTileShapeStatics.aClass237_Sub1_4197!!.aByteArrayArrayArray3104!![i_9_]!![i_7_]!![i_8_]).toInt() and 0xff) shl 2
                        if (ActorEntity.aTerrainTileArray5191 != null && ActorEntity.aTerrainTileArray5191!![i_9_] != null) {
                            val i_11_ = (i_5_ + i_10_ + -ActorEntity.aTerrainTileArray5191!![i_9_]!!.method3982((-86).toByte(), i_8_, i_7_))
                            if (i_6_ < i_11_) i_6_ = i_11_
                        }
                    }
                    i_7_++
                }
            }
            var i_12_ = 1536 * (i_6_ shr 2)
            if (i_12_ > 786432) i_12_ = 786432
            if (i_12_ < i) i_12_ = 262144
            if (anInt6979 < i_12_) anInt6979 += (i_12_ - anInt6979) / 24
            else if (anInt6979 > i_12_) anInt6979 += (-anInt6979 + i_12_) / 80
        }
    }
}
