import WidgetDefinitionStatics.method268

object LocDefinitionCacheStatics {
    private var aShortArray3430: ShortArray? = shortArrayOf(-1, -1, -1, -1, -1)
    var anInt3431: Int = 0

    @JvmField
    var anIntArray3432: IntArray? = IntArray(500)
    var anInt3434: Int = 0
    var anInt3435: Int
    var anInt3436: Int = 0
    var aShortArray3437: ShortArray?

    @JvmField
    var aBooleanArray3438: BooleanArray?

    @JvmField
    var anInt3439: Int = 16777215
    var anInt3440: Int = 0

    @JvmField
    var anInt3441: Int = 0

    @JvmField
    var aShortArrayArray3443: Array<ShortArray?>?

    @JvmField
    var anInt3444: Int
    var anInt3445: Int = 0
    var anInt3446: Int = 0
    var anInt3448: Int = 0
    private var aShortArray3449: ShortArray?

    fun method2031(i: Int, string: String): Long {
        anInt3448++
        var l = 0L
        val i_0_ = string.length
        for (i_1_ in 0..<i_0_) {
            l *= 37L
            val i_2_ = string.get(i_1_).code
            if (i_2_ < 65 || i_2_ > 90) {
                if (i_2_ >= 97 && i_2_ <= 122) l += (1 - (-i_2_ + 97)).toLong()
                else if (i_2_ >= 48 && i_2_ <= 57) l += (i_2_ + 27 - 48).toLong()
            } else l += (1 + (i_2_ + -65)).toLong()
            if (l >= 177917621779460413L) break
        }
        if (i != -1994) aShortArrayArray3443 = null
        while ( /**/(l % 37L == 0L && l != 0L)) {
            l /= 37L
        }
        return l
    }

    fun method2035(i: Int, i_4_: Int) {
        anInt3445++
        val i_5_ = GlGroundShaderPassStatics.anInt7396 - FloatBufferStatics.anInt9751
        if (i_5_ >= 100) {
            WeaveTextureNodeStatics.anInt9282 = 1
            SequencedWallEntityStatics.anInt10163 = -1
            NativeLibraryState.anInt167 = SequencedWallEntityStatics.anInt10163
        } else {
            var i_6_ = SceneObjectSpawnerStatics.aFloat1287.toInt()
            if (i_6_ < IntKeyNodeStatics.anInt6979 shr 8) i_6_ = IntKeyNodeStatics.anInt6979 shr 8
            if (SpotAnimDefinitionStatics.aBooleanArray2374!![4] && ModelHeaderCacheStatics.anIntArray3273!![4] - -128 > i_6_) i_6_ = ModelHeaderCacheStatics.anIntArray3273!![4] + 128
            val i_7_ = 0x3fff and ResourceProviderStatics.aFloat3938.toInt() + RenderableGroupStatics.anInt5016
            method268(i_6_, -200 + (CollisionMapAccessor.method2064((LocalPlayerState.aPlayer_1907!!.x), CompiledScriptCacheStatics.anInt4372, 11219, (LocalPlayerState.aPlayer_1907!!.y))), i_7_, AsyncTaskHandleStatics.anInt2578, i, -19360, FrameStatsResetStatics.anInt5799, 3 * (i_6_ shr 3) + 600 shl 2)
            val f = (-(((100 + -i_5_) * (100 - i_5_) * (-i_5_ + 100)).toFloat() / 1000000.0f) + 1.0f)
            GlslMaterialPassStatics.anInt6246 = (SequencedGroundDecorStatics.anInt10047.toFloat() + f * (-SequencedGroundDecorStatics.anInt10047 + GlslMaterialPassStatics.anInt6246).toFloat()).toInt()
            ParticleSystemRendererStatics.anInt3855 = ((-SpriteComponentStatics.anInt8368 + ParticleSystemRendererStatics.anInt3855).toFloat() * f + SpriteComponentStatics.anInt8368.toFloat()).toInt()
            MinimapAreaMarkerNodeStatics.anInt9701 = (DataHolderStatics.anInt3662.toFloat() + (MinimapAreaMarkerNodeStatics.anInt9701 - DataHolderStatics.anInt3662).toFloat() * f).toInt()
            CompositeRgbNoiseTextureStatics.anInt8685 = (TextureAtlasStateStatics.anInt4424.toFloat() + f * (-TextureAtlasStateStatics.anInt4424 + CompositeRgbNoiseTextureStatics.anInt8685).toFloat()).toInt()
            var i_8_ = WorldMapElementStatics.anInt4638 - CameraConfigDefinitionStatics.anInt3253
            if (i_8_ <= 8192) {
                if (i_8_ < -8192) i_8_ += 16384
            } else i_8_ -= 16384
            WorldMapElementStatics.anInt4638 = (i_8_.toFloat() * f + CameraConfigDefinitionStatics.anInt3253.toFloat()).toInt()
            WorldMapElementStatics.anInt4638 = WorldMapElementStatics.anInt4638 and 0x3fff
        }
    }

    @JvmStatic
    fun method2036(i: Byte) {
        aShortArrayArray3443 = null
        aShortArray3437 = null
        if (i.toInt() != 121) method2035(57, 35)
        aShortArray3449 = null
        aShortArray3430 = null
        anIntArray3432 = null
        aBooleanArray3438 = null
    }

    fun method2038(i: Int) {
        if (i <= -47) {
            for (i_9_ in 0..<HintArrowOrMessageStatics.anInt2021) {
                val class10 = GlTextureCubeMapStatics.aParticleEmitterNodeArray8531s!![i_9_]
                if (class10!!.aByte180.toInt() == 3) {
                    if (class10.aClass348_Sub16_Sub5_176 == null) class10.anInt188 = -2147483648
                    else SpriteDefinitionStatics.aClass348_Sub16_Sub4_7065!!.method2880(class10.aClass348_Sub16_Sub5_176!!)
                }
            }
            anInt3446++
        }
    }

    init {
        aShortArray3437 = shortArrayOf(-1, -1, -1, -1, -1)
        anInt3444 = 13156520
        anInt3435 = -1
        aBooleanArray3438 = BooleanArray(100)
        aShortArray3449 = shortArrayOf(6798, 8741, 25238, 4626, 4550)
        aShortArrayArray3443 = arrayOf<ShortArray?>(aShortArray3449, aShortArray3437, aShortArray3430)
    }
}
