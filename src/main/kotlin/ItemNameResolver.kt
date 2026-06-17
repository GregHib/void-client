/* Class28 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ItemNameResolver : Interface15 {
    override fun method54(i: Int, l: Long, rectangleRegion: RectangleRegion?, `is`: IntArray?): String? {
        try {
            anInt4996++
            if (RandomAccessFileOnDisk.aRectangleRegion_3044 == rectangleRegion) {
                val class117 = Class348_Sub7.aClass33_6653!!.method337(true, `is`!![0])
                return class117.method1074(l.toInt(), 91)
            }
            if (Class299_Sub1.aRectangleRegion_6321 == rectangleRegion || ShaderProgram.aRectangleRegion_7274 == rectangleRegion) {
                val class213 = Exception_Sub1.aModelHeaderCache_112!!.method1940(i + -99, l.toInt())
                return class213.aString2795
            }
            if (i != 1) method54(85, -41L, null, null)
            if (rectangleRegion == Class348_Sub42_Sub5.aRectangleRegion_9530 || rectangleRegion == Class348_Sub49_Sub1.aRectangleRegion_9748 || Class71.aRectangleRegion_1213 == rectangleRegion) return Class348_Sub7.aClass33_6653!!.method337(true, `is`!![0]).method1074(l.toInt(), i xor 0x48)
            return null
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("hu.A(" + i + ',' + l + ',' + (if (rectangleRegion != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt4996: Int = 0
        @JvmField
        var aProjectileFactory_4997: ProjectileFactory? = ProjectileFactory(6, 1)
        var aIntRange_4998: IntRange?
        @JvmField
        var anInt4999: Int = 0
        @JvmField
        var aString5000: String? = null
        @JvmField
        var aString5001: String? = null
        @JvmField
        var aBoolean5002: Boolean = false

        @JvmStatic
        fun method318(i: Int) {
            aString5001 = null
            aString5000 = null
            val i_0_ = 74 / ((i - 58) / 49)
            aProjectileFactory_4997 = null
            aIntRange_4998 = null
        }

        init {
            aIntRange_4998 = IntRange(59, 3)
        }
    }
}
