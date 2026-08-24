import CollisionMapAccessor.method2064
import kotlin.math.atan2
import kotlin.math.sqrt

object ContactEntryStatics {
    var anInt9594: Int = 0
    var anInt9596: Int = 0
    var anInt9598: Int = 0
    var aHashtable_9603: Hashtable?

    var anInt9604: Int = 0
    var anIntArray9612: IntArray?

    @JvmStatic
    fun method3228(i: Int) {
        anIntArray9612 = null
        val i_0_ = 29 / ((31 - i) / 43)
        aHashtable_9603 = null
    }

    @JvmStatic
    fun method3229(i: Int): Int {
        anInt9596++
        if (SkeletalAnimFrameLoader.aFrame476 != null) return 3
        if (i >= -59) anInt9604 = 79
        if (!MinimapSquareDrawer.aBoolean5219) return 1
        return 2
    }

    fun method3231(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int) {
        if (i_7_ > -123) method3229(14)
        BloomGraphicsOptionState.anInt5973 = i_5_
        MinimapFlagRenderer.anInt1797 = i_4_
        RenderableEntry.anInt4336 = i_3_
        GlGroundShaderPass.anInt7403 = i_6_
        anInt9598++
        ClanChatRequestSender.anInt3647 = i
        if (BloomGraphicsOptionState.anInt5973 >= 100) {
            val i_8_ = RenderableEntry.anInt4336 * 512 - -256
            val i_9_ = ClanChatRequestSender.anInt3647 * 512 - -256
            val i_10_ = (method2064(i_8_, CompiledScriptCache.anInt4372, 11219, i_9_) + -MinimapFlagRenderer.anInt1797)
            val i_11_ = i_8_ - GlslMaterialPass.anInt6246
            val i_12_ = -ParticleSystemRenderer.anInt3855 + i_10_
            val i_13_ = i_9_ - CompositeRgbNoiseTexture.anInt8685
            val i_14_ = sqrt((i_11_ * i_11_ + i_13_ * i_13_).toDouble()).toInt()
            MinimapAreaMarkerNodeStatics.anInt9701 = (atan2(i_12_.toDouble(), i_14_.toDouble()) * 2607.5945876176133).toInt() and 0x3fff
            WorldMapElement.anInt4638 = (-2607.5945876176133 * atan2(i_11_.toDouble(), i_13_.toDouble())).toInt() and 0x3fff
            if (MinimapAreaMarkerNodeStatics.anInt9701 < 1024) MinimapAreaMarkerNodeStatics.anInt9701 = 1024
            MapTileShapeStatics.anInt4186 = 0
            if (MinimapAreaMarkerNodeStatics.anInt9701 > 3072) MinimapAreaMarkerNodeStatics.anInt9701 = 3072
        }
        WeaveTextureNode.anInt9282 = 2
        SequencedWallEntity.anInt10163 = -1
        NativeLibraryState.anInt167 = SequencedWallEntity.anInt10163
    }

    init {
        aHashtable_9603 = Hashtable(16)
        anIntArray9612 = IntArray(8)
    }
}
