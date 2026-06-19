/* Class141 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class TextureDefinitionLoader internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?, js5Archive_4_: Js5Archive?) {
    private var aLruByteCache_1963 = LruByteCache(64)
    @JvmField
    var aJs5Archive_1965: Js5Archive? = null
    private val aJs5Archive_1971: Js5Archive?
    @JvmField
    var aLruByteCache_1976: LruByteCache = LruByteCache(64)
    fun method1173(i: Byte, i_0_: Int): MapSceneIconDef? {
        anInt1964++
        var mapSceneIconDef: MapSceneIconDef?
        withLock(aLruByteCache_1963) {
            mapSceneIconDef = aLruByteCache_1963.method583(i_0_.toLong(), 118) as MapSceneIconDef?
        }
        if (mapSceneIconDef != null) return mapSceneIconDef
        val `is`: ByteArray?
        withLock(aJs5Archive_1971!!) {
            `is` = aJs5Archive_1971.method410(i + -1891, 34, i_0_)
        }
        mapSceneIconDef = MapSceneIconDef()
        if (i.toInt() != 31) return null
        mapSceneIconDef.aTextureDefinitionLoader_2851 = this
        if (`is` != null) mapSceneIconDef.method1597((-114).toByte(), ByteBuffer(`is`))
        withLock(aLruByteCache_1963) {
            aLruByteCache_1963.method582(mapSceneIconDef, i_0_.toLong(), (-108).toByte())
        }
        return mapSceneIconDef
    }

    fun method1174(i: Byte) {
        withLock(aLruByteCache_1963) {
            aLruByteCache_1963.method587(-87)
        }
        anInt1969++
        withLock(this.aLruByteCache_1976) {
            if (i > -89) {
                /* empty */
            } else this.aLruByteCache_1976.method587(-79)
        }
    }

    fun method1175(i: Byte) {
        withLock(aLruByteCache_1963) {
            aLruByteCache_1963.method590(i + -125)
        }
        anInt1967++
        if (i.toInt() == 125) {
            withLock(this.aLruByteCache_1976) {
                this.aLruByteCache_1976.method590(0)
            }
        }
    }

    fun method1176(i: Int, i_1_: Byte) {
        withLock(aLruByteCache_1963) {
            aLruByteCache_1963.method578(2, i)
        }
        anInt1968++
        withLock(this.aLruByteCache_1976) {
            this.aLruByteCache_1976.method578(2, i)
        }
    }

    fun method1178(i: Int, i_2_: Int, i_3_: Int) {
        anInt1972++
        if (i_2_ != 1) aBoundsConstraintEntry_1966 = null
        aLruByteCache_1963 = LruByteCache(i_3_)
        this.aLruByteCache_1976 = LruByteCache(i)
    }

    init {
        try {
            this.aJs5Archive_1965 = js5Archive_4_
            aJs5Archive_1971 = js5Archive
            aJs5Archive_1971!!.method407(0, 34)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("oda.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_4_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt1964: Int = 0
        @JvmField
        var aBoundsConstraintEntry_1966: BoundsConstraintEntry?
        var anInt1967: Int = 0
        var anInt1968: Int = 0
        var anInt1969: Int = 0
        var anInt1972: Int = 0
        var anIntArray1973: IntArray? = intArrayOf(0, 1, 2, 3, 4, 5, 6, 14)
        var anIntArray1975: IntArray?
        @JvmField
        var aSpriteArchiveLoader_1977: SpriteArchiveLoader? = null


        @JvmStatic
        fun method1179(i: Byte) {
            anIntArray1975 = null
            aSpriteArchiveLoader_1977 = null
            anIntArray1973 = null
            aBoundsConstraintEntry_1966 = null
        }

        init {
            aBoundsConstraintEntry_1966 = BoundsConstraintEntry("", 18)
            anIntArray1975 = IntArray(1)
        }
    }
}
