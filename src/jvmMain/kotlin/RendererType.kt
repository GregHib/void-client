
/* Class365 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class RendererType internal constructor(i: Int, string: String?, i_0_: Int, string_1_: String?, l: Long) {
    var aString4470: String? = null
    var aLong4471: Long = 0
    var aString4472: String? = null
    var anInt4475: Int = 0
    var anInt4476: Int = 0

    init {
        try {
            this.aLong4471 = l
            this.anInt4475 = i_0_
            this.anInt4476 = i
            this.aString4472 = string_1_
            this.aString4470 = string
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("fia.<init>(" + i + ',' + (if (string != null) "{...}" else "null") + ',' + i_0_ + ',' + (if (string_1_ != null) "{...}" else "null") + ',' + l + ')'))
        }
    }

    companion object {

        var aNodeDeque_4473: NodeDeque?
        var anInt4474: Int = 0
        var aInboundPacketHeader_4477: InboundPacketHeader?

        @JvmStatic
        fun method3518(i: Int) {
            aNodeDeque_4473 = null
            if (i != 88) method3518(-49)
            aInboundPacketHeader_4477 = null
        }

        init {
            aNodeDeque_4473 = NodeDeque()
            aInboundPacketHeader_4477 = InboundPacketHeader(88, 10)
        }
    }
}
