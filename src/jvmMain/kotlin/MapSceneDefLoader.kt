/* Class185 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MapSceneDefLoader internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val aLruByteCache_2479 = LruByteCache(64)
    private val aJs5Archive_2480: Js5Archive?
    fun method1390(i: Int) {
        withLock(aLruByteCache_2479) {
            val i_0_ = 25 / ((i - 69) / 33)
            aLruByteCache_2479.method587(-98)
        }
        anInt2486++
    }

    fun method1391(i: Byte, i_1_: Int): CameraConfigDefinition {
        anInt2485++
        var cameraConfigDefinition: CameraConfigDefinition?
        withLock(aLruByteCache_2479) {
            cameraConfigDefinition = aLruByteCache_2479.method583(i_1_.toLong(), 96) as CameraConfigDefinition?
        }
        if (cameraConfigDefinition != null) return cameraConfigDefinition
        val `is`: ByteArray?
        withLock(aJs5Archive_2480!!) {
            `is` = aJs5Archive_2480.method410(-1860, 31, i_1_)
        }
        cameraConfigDefinition = CameraConfigDefinition()
        val i_2_ = 50 / ((i - -63) / 56)
        if (`is` != null) cameraConfigDefinition.method1921((-69).toByte(), ByteBuffer(`is`))
        withLock(aLruByteCache_2479) {
            aLruByteCache_2479.method582(cameraConfigDefinition, i_1_.toLong(), (-108).toByte())
        }
        return cameraConfigDefinition
    }

    fun method1392(i: Int, i_3_: Int) {
        withLock(aLruByteCache_2479) {
            aLruByteCache_2479.method578(2, i_3_)
        }
        if (i >= 12) anInt2484++
    }

    fun method1393(i: Byte) {
        withLock(aLruByteCache_2479) {
            aLruByteCache_2479.method590(0)
            val i_4_ = -89 % ((42 - i) / 50)
        }
        anInt2487++
    }

    init {
        try {
            aJs5Archive_2480 = js5Archive
            aJs5Archive_2480!!.method407(0, 31)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("qf.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt2481: Int = 0

        var anInt2482: Int = 0
        var aInboundPacketHeader_2483: InboundPacketHeader?
        var anInt2484: Int = 0
        var anInt2485: Int = 0
        var anInt2486: Int = 0
        var anInt2487: Int = 0
        var aCharArray2488: CharArray? = charArrayOf(
            ' ',
            '\u00a0',
            '_',
            '-',
            '\u00e0',
            '\u00e1',
            '\u00e2',
            '\u00e4',
            '\u00e3',
            '\u00c0',
            '\u00c1',
            '\u00c2',
            '\u00c4',
            '\u00c3',
            '\u00e8',
            '\u00e9',
            '\u00ea',
            '\u00eb',
            '\u00c8',
            '\u00c9',
            '\u00ca',
            '\u00cb',
            '\u00ed',
            '\u00ee',
            '\u00ef',
            '\u00cd',
            '\u00ce',
            '\u00cf',
            '\u00f2',
            '\u00f3',
            '\u00f4',
            '\u00f6',
            '\u00f5',
            '\u00d2',
            '\u00d3',
            '\u00d4',
            '\u00d6',
            '\u00d5',
            '\u00f9',
            '\u00fa',
            '\u00fb',
            '\u00fc',
            '\u00d9',
            '\u00da',
            '\u00db',
            '\u00dc',
            '\u00e7',
            '\u00c7',
            '\u00ff',
            '\u0178',
            '\u00f1',
            '\u00d1',
            '\u00df'
        )

        var aProjectileFactory_2489: ProjectileFactory?

        @JvmStatic
        fun method1394(i: Int, i_5_: Int, i_6_: Int) {
            val bool = (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![0]!![i_5_]!![i_6_] != null && HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![0]!![i_5_]!![i_6_]!!.aSceneCollisionEntry_4400 != null)
            for (i_7_ in i downTo 0) {
                if (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i_7_]!![i_5_]!![i_6_] == null) {
                    val sceneCollisionEntry = (SceneCollisionEntry(i_7_).also { HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i_7_]!![i_5_]!![i_6_] = it })
                    if (bool) sceneCollisionEntry.aByte4399++
                }
            }
        }

        @JvmStatic
        fun method1395(i: Byte) {
            aInboundPacketHeader_2483 = null
            aCharArray2488 = null
            aProjectileFactory_2489 = null
            if (i.toInt() != 82) method1394(120, -36, -100)
        }

        init {
            aInboundPacketHeader_2483 = InboundPacketHeader(47, 6)
            aProjectileFactory_2489 = ProjectileFactory(3, 2)
        }
    }
}
