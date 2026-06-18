/* Class123 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class HoverActionEntry internal constructor(var anInterface2_1811: Interface2?, i: Int, i_0_: Int, i_1_: Int) {
    var aShort1810: Short
    var aByte1812: Byte
    var aByte1814: Byte

    init {
        this.aShort1810 = i.toShort()
        this.aByte1812 = i_1_.toByte()
        this.aByte1814 = i_0_.toByte()
    }

    companion object {
        @JvmField
        var aSpriteStore_1813: SpriteStore? = null
        @JvmField
        var aJs5Archive_1815: Js5Archive? = null

        @JvmStatic
        fun method1091(i: Int) {
            if (i != -9341) method1091(-16)
            aJs5Archive_1815 = null
            aSpriteStore_1813 = null
        }
    }
}
