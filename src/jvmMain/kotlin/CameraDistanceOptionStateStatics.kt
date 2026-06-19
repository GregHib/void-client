object CameraDistanceOptionStateStatics {
    @JvmField
            var anInt5851: Int = 0
            @JvmField
            var anInt5852: Int = 0
            @JvmField
            var anInt5853: Int = 0
            @JvmField
            var anInt5854: Int = 0
            @JvmField
            var anInt5855: Int = 0
            @JvmField
            var anInt5856: Int = 0
            @JvmField
            var aAbstractModelRendererArray5857: Array<AbstractModelRenderer?>? = null
    
            @JvmStatic
            fun method1724(i: Int) {
                aAbstractModelRendererArray5857 = null
                if (i != -4) aAbstractModelRendererArray5857 = null
            }
    
            @JvmStatic
            fun method1725(i: Int) {
                anInt5855++
                var i_1_ = 1024
                var i_2_ = 3072
                if (ParticleSystemRendererStatics.aBoolean3870) {
                    i_2_ = 4096
                    if (FloatBufferStatics.aBoolean9746) i_1_ = 2048
                }
                if (SceneObjectSpawnerStatics.aFloat1287 < i_1_.toFloat()) SceneObjectSpawnerStatics.aFloat1287 = i_1_.toFloat()
                if (SceneObjectSpawnerStatics.aFloat1287 > i_2_.toFloat()) SceneObjectSpawnerStatics.aFloat1287 = i_2_.toFloat()
                while ( /**/ResourceProviderStatics.aFloat3938 >= 16384.0f) {
                    ResourceProviderStatics.aFloat3938 -= 16384.0f
                }
                while ( /**/ResourceProviderStatics.aFloat3938 < 0.0f) {
                    ResourceProviderStatics.aFloat3938 += 16384.0f
                }
                val i_3_ = FrameStatsResetStatics.anInt5799 shr 9
                val i_4_ = AsyncTaskHandleStatics.anInt2578 shr 9
                val i_5_ = CollisionMapAccessor.method2064(FrameStatsResetStatics.anInt5799, CompiledScriptCacheStatics.anInt4372, 11219, AsyncTaskHandleStatics.anInt2578)
                var i_6_ = 0
                if (i_3_ > 3 && i_4_ > 3 && -4 + GlCubemapLightPassStatics.anInt7319 > i_3_ && RangeThresholdTextureNodeStatics.anInt9109 - 4 > i_4_) {
                    var i_7_ = i_3_ - 4
                    while (i_3_ - -4 >= i_7_) {
                        for (i_8_ in -4 + i_4_..4 + i_4_) {
                            var i_9_ = CompiledScriptCacheStatics.anInt4372
                            if (i_9_ < 3 && NpcTypeStatics.method802(i_8_, i_7_, true)) i_9_++
                            var i_10_ = 0
                            if ((MapTileShapeStatics.aClass237_Sub1_4197!!.aByteArrayArrayArray3104) != null && (MapTileShapeStatics.aClass237_Sub1_4197!!.aByteArrayArrayArray3104!![i_9_]) != null) i_10_ = 8 * ((MapTileShapeStatics.aClass237_Sub1_4197!!.aByteArrayArrayArray3104!![i_9_]!![i_7_]!![i_8_]).toInt() and 0xff) shl 2
                            if (NativeSpriteStatics.aTerrainTileArray5191 != null && NativeSpriteStatics.aTerrainTileArray5191!![i_9_] != null) {
                                val i_11_ = (i_5_ + i_10_ + -NativeSpriteStatics.aTerrainTileArray5191!![i_9_]!!.method3982((-86).toByte(), i_8_, i_7_))
                                if (i_6_ < i_11_) i_6_ = i_11_
                            }
                        }
                        i_7_++
                    }
                }
                var i_12_ = 1536 * (i_6_ shr 2)
                if (i_12_ > 786432) i_12_ = 786432
                if (i_12_ < i) i_12_ = 262144
                if (IntKeyNodeStatics.anInt6979 < i_12_) IntKeyNodeStatics.anInt6979 += (i_12_ - IntKeyNodeStatics.anInt6979) / 24
                else if (IntKeyNodeStatics.anInt6979 > i_12_) IntKeyNodeStatics.anInt6979 += (-IntKeyNodeStatics.anInt6979 + i_12_) / 80
            }
}
