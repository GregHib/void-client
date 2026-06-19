/* Class114 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class InboundPacketHeader internal constructor(private var anInt1747: Int, var anInt1749: Int) {
    fun method1058(i: Byte): Int {
        if (i <= 108) anInt1747 = 110
        anInt1746++
        return anInt1747
    }

    override fun toString(): String {
        anInt1750++
        throw IllegalStateException()
    }

    companion object {
        @JvmField
        var anInt1746: Int = 0
        @JvmField
        var anInt1750: Int = 0
        var aInboundPacketHeader_2285: InboundPacketHeader? = InboundPacketHeader(77, 4)

        var anInt1748: Int = 0
        fun method1059(i: Byte, i_1_: Int): GrowableStringList {
            anInt1748++
            val growableStringList = GrowableStringList(i_1_, false)
            return growableStringList
        }
    }
}