import ServerConnectionInfo.Companion.method1258
import RangeThresholdTextureNode.Companion.method3056
import EdgeDetectTextureNode.Companion.method3073

object CompassSmootherStatics {
    var anInt3367: Int = 0

    var anInt3372: Int = 0

    var anInt3374: Int = 0
    var anInt3375: Int = 0
    var anInt3376: Int = 0
    var aAbstractModelRendererArray3378: Array<AbstractModelRenderer?>? = null

    fun method2015(i: Int, i_0_: Int, i_1_: Int): Boolean {
        anInt3375++
        if (i_1_ != 7) return false
        return ((LoadingBarRenderer.method2217(i_0_, i, i_1_ xor 0x7) or method3056(115, i, i_0_) or method3073(i_0_, i, 50.toByte())) and method1258(i, -9301, i_0_))
    }

    @JvmStatic
    fun method2017(i: Int, widgetDefinition: WidgetDefinition?, i_3_: Int) {
        anInt3367++
        if (HintArrowOrMessage.anInt2021 < 50 && (widgetDefinition != null && widgetDefinition.anIntArrayArray264 != null && (widgetDefinition.anIntArrayArray264!!.size > i) && widgetDefinition.anIntArrayArray264!![i] != null)) {
            val i_4_ = widgetDefinition.anIntArrayArray264!![i]!![0]
            var i_5_ = i_4_ shr 8
            if (widgetDefinition.anIntArrayArray264!![i]!!.size > 1) {
                val i_6_ = (Math.random() * (widgetDefinition.anIntArrayArray264!![i])!!.size.toDouble()).toInt()
                if (i_6_ > 0) i_5_ = widgetDefinition.anIntArrayArray264!![i]!![i_6_]
            }
            val i_7_ = 0x7 and (i_4_ shr 5)
            if (i_3_ > 8) {
                var i_8_ = 256
                if (widgetDefinition.anIntArray236 != null && widgetDefinition.anIntArray265 != null) i_8_ = Texture2DProvider.method2257((widgetDefinition.anIntArray265!![i]), (widgetDefinition.anIntArray236!![i]), (-125).toByte())
                if (widgetDefinition.aBoolean268) SoundChannelMixer.method2090(i_7_, i_8_, false, (-35).toByte(), 255, 0, i_5_)
                else TextureTileRenderer.method2947(true, 255, i_5_, i_7_, 0, i_8_)
            }
        }
    }

    @JvmStatic
    fun method2018(i: Int) {
        aAbstractModelRendererArray3378 = null
        InboundPacketHeader.aInboundPacketHeader_3371 = null
        InboundPacketHeader.aInboundPacketHeader_3368 = null
        if (i != 0) method2015(30, 1, -62)
    }
}
