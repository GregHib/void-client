import WidgetDefinition.Companion.method268

/* Class268 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class LocDefinitionCache internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    var anInt3429: Int = 0
    private val aLruByteCache_3433 = LruByteCache(64)
    private val aJs5Archive_3442: Js5Archive?
    @JvmField
    var anInt3447: Int = 0
    fun method2032(i: Int, i_3_: Int) {
        synchronized(aLruByteCache_3433) {
            aLruByteCache_3433.method578(2, i)
            if (i_3_ > -10) method2035(116, 38)
        }
        anInt3436++
    }

    fun method2033(i: Byte) {
        anInt3434++
        synchronized(aLruByteCache_3433) {
            if (i.toInt() != 46) method2037(-66)
            aLruByteCache_3433.method587(-94)
        }
    }

    fun method2034(i: Int, bool: Boolean): LocTypeConfig {
        if (bool != false) aShortArray3437 = null
        anInt3431++
        var locTypeConfig: LocTypeConfig?
        synchronized(aLruByteCache_3433) {
            locTypeConfig = aLruByteCache_3433.method583(i.toLong(), 64) as LocTypeConfig?
        }
        if (locTypeConfig != null) return locTypeConfig
        val `is`: ByteArray?
        synchronized(aJs5Archive_3442!!) {
            `is` = aJs5Archive_3442.method410(-1860, 4, i)
        }
        locTypeConfig = LocTypeConfig()
        locTypeConfig.anInt3573 = i
        locTypeConfig.aLocDefinitionCache_3562 = this
        if (`is` != null) locTypeConfig.method2070(true, Buffer(`is`))
        locTypeConfig.method2067(-4860)
        synchronized(aLruByteCache_3433) {
            aLruByteCache_3433.method582(locTypeConfig, i.toLong(), (-111).toByte())
        }
        return locTypeConfig
    }

    fun method2037(i: Int) {
        synchronized(aLruByteCache_3433) {
            aLruByteCache_3433.method590(0)
        }
        anInt3440++
    }

    init {
        try {
            aJs5Archive_3442 = js5Archive
            this.anInt3429 = aJs5Archive_3442!!.method407(0, 4)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("cb.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        private var aShortArray3430: ShortArray? = shortArrayOf(-1, -1, -1, -1, -1)
        var anInt3431: Int = 0
        @JvmField
        var anIntArray3432: IntArray? = IntArray(500)
        var anInt3434: Int = 0
        var anInt3435: Int
        var anInt3436: Int = 0
        private var aShortArray3437: ShortArray?
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
            val i_5_ = Class367_Sub11.anInt7396 - FloatBuffer.anInt9751
            if (i_5_ >= 100) {
                WeaveTextureNode.anInt9282 = 1
                SequencedWallEntity.anInt10163 = -1
                Class9.anInt167 = SequencedWallEntity.anInt10163
            } else {
                var i_6_ = Class76.aFloat1287.toInt()
                if (i_6_ < IntKeyNode.anInt6979 shr 8) i_6_ = IntKeyNode.anInt6979 shr 8
                if (SpotAnimDefinition.aBooleanArray2374!![4] && ModelHeaderCache.anIntArray3273!![4] - -128 > i_6_) i_6_ = ModelHeaderCache.anIntArray3273!![4] + 128
                val i_7_ = 0x3fff and ResourceProvider.aFloat3938.toInt() + RenderableGroup.anInt5016
                method268(i_6_, -200 + (CollisionMapAccessor.method2064((LocalPlayerState.aPlayer_1907!!.x), CompiledScriptCache.anInt4372, 11219, (LocalPlayerState.aPlayer_1907!!.y))), i_7_, AsyncTaskHandle.anInt2578, i, -19360, FrameStatsReset.anInt5799, 3 * (i_6_ shr 3) + 600 shl 2)
                val f = (-(((100 + -i_5_) * (100 - i_5_) * (-i_5_ + 100)).toFloat() / 1000000.0f) + 1.0f)
                GlslMaterialPass.anInt6246 = (SequencedGroundDecor.anInt10047.toFloat() + f * (-SequencedGroundDecor.anInt10047 + GlslMaterialPass.anInt6246).toFloat()).toInt()
                ParticleSystemRenderer.anInt3855 = ((-SpriteComponent.anInt8368 + ParticleSystemRenderer.anInt3855).toFloat() * f + SpriteComponent.anInt8368.toFloat()).toInt()
                MinimapAreaMarkerNode.anInt9701 = (DataHolder.anInt3662.toFloat() + (MinimapAreaMarkerNode.anInt9701 - DataHolder.anInt3662).toFloat() * f).toInt()
                CompositeRgbNoiseTexture.anInt8685 = (TextureAtlasState.anInt4424.toFloat() + f * (-TextureAtlasState.anInt4424 + CompositeRgbNoiseTexture.anInt8685).toFloat()).toInt()
                var i_8_ = WorldMapElement.anInt4638 - CameraConfigDefinition.anInt3253
                if (i_8_ <= 8192) {
                    if (i_8_ < -8192) i_8_ += 16384
                } else i_8_ -= 16384
                WorldMapElement.anInt4638 = (i_8_.toFloat() * f + CameraConfigDefinition.anInt3253.toFloat()).toInt()
                WorldMapElement.anInt4638 = WorldMapElement.anInt4638 and 0x3fff
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
                for (i_9_ in 0..<HintArrowOrMessage.anInt2021) {
                    val class10 = GlTextureCubeMap.aParticleEmitterNodeArray8531s!![i_9_]
                    if (class10!!.aByte180.toInt() == 3) {
                        if (class10.aClass348_Sub16_Sub5_176 == null) class10.anInt188 = -2147483648
                        else SpriteDefinition.aClass348_Sub16_Sub4_7065!!.method2880(class10.aClass348_Sub16_Sub5_176!!)
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
}
