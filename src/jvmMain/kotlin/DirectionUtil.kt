/* Class95 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object DirectionUtil {
    @JvmField
    var anInt1539: Int = 0
    var aIntRange_1540: IntRange? = IntRange(113, 1)
    @JvmField
    var aJs5Archive_1541: Js5Archive? = null
    @JvmField
    var aScreenAnchorAlignment_1542: ScreenAnchorAlignment? = null
    @JvmField
    var aClass348_Sub42_Sub17Array1543: Array<TextureMaterialGroup?>? = arrayOfNulls(14)

    @JvmStatic
    fun method868(i: Int, i_0_: Int, bool: Boolean): Int {
        anInt1539++
        if (bool != false) method868(89, 115, true)
        if (i == 1 || i == 3) return ParameterizedTextStatics.anIntArray9572!![i_0_ and 0x3]
        return SpriteRenderEntryStatics.anIntArray9714!![i_0_ and 0x3]
    }

    @JvmStatic
    fun method869(i: Int) {
        aJs5Archive_1541 = null
        aIntRange_1540 = null
        aClass348_Sub42_Sub17Array1543 = null
        aScreenAnchorAlignment_1542 = null
        if (i != 3) method869(55)
    }
}
