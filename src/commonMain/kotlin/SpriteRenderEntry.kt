import ProjectileDefinition.method2288
import VorbisOggDecoder.Companion.method2972

/* Class348_Sub42_Sub20 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SpriteRenderEntry internal constructor(widgetRedrawRegion: WidgetRedrawRegion?, class318_sub10: SceneGraphContainer?) : HashLinkedListNode() {
    var aWidgetRedrawRegion_9702: WidgetRedrawRegion? = null
    var aSpotAnimVector_9704: SpotAnimVector? = null
    var anInt9705: Int = 0
    var anInt9706: Int = 0
    var anInt9707: Int = 0
    var anInt9710: Int = 0
    var anInt9712: Int = 0
    fun method3279(i: Int) {
        this.anInt9706 = (this.aWidgetRedrawRegion_9702!!.anInt4239)
        anInt9708++
        this.anInt9710 = (this.aWidgetRedrawRegion_9702!!.anInt4240)
        this.anInt9712 = (this.aWidgetRedrawRegion_9702!!.anInt4238)
        if ((this.aWidgetRedrawRegion_9702!!.aAbstractCameraTransform_4252) != null) this.aWidgetRedrawRegion_9702!!.aAbstractCameraTransform_4252!!.method905((this.aSpotAnimVector_9704!!.anInt2291), (this.aSpotAnimVector_9704!!.anInt2290), (this.aSpotAnimVector_9704!!.anInt2294), FacingDirectionNode.anIntArray6666!!)
        this.anInt9705 = FacingDirectionNode.anIntArray6666!![0]
        this.anInt9707 = FacingDirectionNode.anIntArray6666!![i]
    }

    init {
        try {
            this.aWidgetRedrawRegion_9702 = widgetRedrawRegion
            this.aSpotAnimVector_9704 = this.aWidgetRedrawRegion_9702!!.method2685((-13).toByte())
            method3279(2)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("jo.<init>(" + (if (widgetRedrawRegion != null) "{...}" else "null") + ',' + (if (class318_sub10 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt9703: Int = 0
        var anInt9708: Int = 0
        var anInt9709: Int = 0

        var aNodeDeque_9711: NodeDeque? = NodeDeque()
        var anInt9713: Int = 0
        var anIntArray9714: IntArray? = intArrayOf(1, 2, 4, 8)
        var anInt9715: Int = 0

        @JvmStatic
        fun method3280(i: Int) {
            aNodeDeque_9711 = null
            anIntArray9714 = null
            val i_0_ = 112 / ((i - 16) / 57)
        }

        fun method3281(i: Byte, var_renderer: Renderer) {
            if (ScrollbarComponent.aBoolean8335) method2288(false, var_renderer)
            else NativeIndexBuffer.method1077(var_renderer, (-123).toByte())
            anInt9709++
            if (i < 29) method3280(81)
        }

        fun method3282(i: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
            DisplaySettingsConfig.anInt7244 = i_6_
            GlRectangleTexture.anInt8633 = i_5_
            CachedRgbNoiseTexture.anInt8668 = i_2_
            PackedFlagsAccessor.anInt7092 = i
            ClanChatRequestSender.anInt3650 = i_4_
            MinimapTileEntry.anInt620 = i_1_
            anInt9703++
        }

        fun method3283(i: Int) {
            if (VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aBoolean3777 && (IndexedSprite.aServerConnectionInfo_5199!!.anInt2143 != -1)) method2972((IndexedSprite.aServerConnectionInfo_5199!!.aString2147), (IndexedSprite.aServerConnectionInfo_5199!!.anInt2143), -54)
            anInt9713++
            val i_7_ = 9 / ((i - 60) / 50)
        }
        var anInt4383: Int = 0
    }
}
