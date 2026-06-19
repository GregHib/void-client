import StreamingResourceRequest.Companion.method3262
import kotlin.concurrent.Volatile

/* Class168 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object HeapDiagnosticsHolder {
    var aInboundPacketHeader_2248: InboundPacketHeader?

    var aWidgetComponent_2249: WidgetComponent? = null

    var aShort2250: Short = 205
    var anInt2251: Int = 0

    var aSystemFontGlyphs_2252: SystemFontGlyphs? = null
    var anInt2253: Int = 0

    var anInt2254: Int = 0
    var aInboundPacketHeader_2255: InboundPacketHeader?

    @Volatile
    var anObject2256: Any?

    @JvmStatic
    fun method1298(i: Int) {
        if (i != -1) aWidgetComponent_2249 = null
        anObject2256 = null
        aInboundPacketHeader_2255 = null
        aWidgetComponent_2249 = null
        aInboundPacketHeader_2248 = null
        aSystemFontGlyphs_2252 = null
    }

    fun method1299(i: Int, i_0_: Int, i_1_: Int): Boolean {
        anInt2253++
        if (i != 393216) anInt2251 = -106
        return method3262(i_0_, i_1_, 102) or ((i_0_ and 0x60000) != 0) || CharacterRenderState.method2783(i_1_, (-99).toByte(), i_0_)
    }

    init {
        aInboundPacketHeader_2248 = InboundPacketHeader(25, 6)
        aInboundPacketHeader_2255 = InboundPacketHeader(99, -1)
        anObject2256 = null
    }
}
