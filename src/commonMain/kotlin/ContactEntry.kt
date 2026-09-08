import kotlin.jvm.JvmStatic
import CollisionMapAccessor.method2064
import kotlin.math.atan2
import kotlin.math.sqrt

/* Class348_Sub42_Sub12 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ContactEntry internal constructor(string: String?, string_15_: String?, i: Int, i_16_: Int, i_17_: Int, l: Long, i_18_: Int, i_19_: Int, bool: Boolean, bool_20_: Boolean, l_21_: Long, bool_22_: Boolean) : HashLinkedListNode() {
    var aString9593: String? = null

    var aString9595: String? = null
    var aBoolean9597: Boolean = false
    var anInt9599: Int = 0
    var aLong9600: Long = 0
    var aString9601: String? = null
    var anInt9602: Int = 0
    var aLong9605: Long = 0
    var anInt9607: Int = 0

    var anInt9608: Int = 0
    var anInt9609: Int = 0
    var aBoolean9610: Boolean = false
    var aBoolean9611: Boolean = false

    init {
        try {
            this.anInt9607 = i_19_
            this.anInt9608 = i_16_
            this.anInt9599 = i_17_
            this.aLong9605 = l
            this.aBoolean9610 = bool
            this.aBoolean9597 = bool_20_
            this.aString9601 = string_15_
            this.aBoolean9611 = bool_22_
            this.aString9593 = string
            this.anInt9609 = i
            this.aLong9600 = l_21_
            this.anInt9602 = i_18_
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("db.<init>(" + (if (string != null) "{...}" else "null") + ',' + (if (string_15_ != null) "{...}" else "null") + ',' + i + ',' + i_16_ + ',' + i_17_ + ',' + l + ',' + i_18_ + ',' + i_19_ + ',' + bool + ',' + bool_20_ + ',' + l_21_ + ',' + bool_22_ + ')'))
        }
    }

    companion object {
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
                val i_10_ = (method2064(i_8_, QuickChatMenuTypeList.anInt4372, 11219, i_9_) + -MinimapFlagRenderer.anInt1797)
                val i_11_ = i_8_ - GlslMaterialPass.anInt6246
                val i_12_ = -ParticleSystemRenderer.anInt3855 + i_10_
                val i_13_ = i_9_ - CompositeRgbNoiseTexture.anInt8685
                val i_14_ = sqrt((i_11_ * i_11_ + i_13_ * i_13_).toDouble()).toInt()
                MinimapAreaMarkerNode.Companion.anInt9701 = (atan2(i_12_.toDouble(), i_14_.toDouble()) * 2607.5945876176133).toInt() and 0x3fff
                WorldMapElement.anInt4638 = (-2607.5945876176133 * atan2(i_11_.toDouble(), i_13_.toDouble())).toInt() and 0x3fff
                if (MinimapAreaMarkerNode.Companion.anInt9701 < 1024) MinimapAreaMarkerNode.Companion.anInt9701 = 1024
                MapTileShape.anInt4186 = 0
                if (MinimapAreaMarkerNode.Companion.anInt9701 > 3072) MinimapAreaMarkerNode.Companion.anInt9701 = 3072
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
}
