import kotlin.jvm.JvmStatic
import SceneTilePlaneManager.method260
import java.io.File

/*
 * Class166
 */
class ItemDefinitionLoader internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?, js5Archive_9_: Js5Archive?) {

    var aJs5Archive_2180: Js5Archive? = null
    private val aLruByteCache_2185 = LruByteCache(64)
    private val aJs5Archive_2188: Js5Archive?

    var aLruByteCache_2190: LruByteCache? = LruByteCache(2)

    fun method1283(i: Int) {
        withLock(aLruByteCache_2185) {
            aLruByteCache_2185.method587(-76)
        }
        anInt2178++
        withLock(this.aLruByteCache_2190!!) {
            this.aLruByteCache_2190!!.method587(-110)
        }
        if (i != 1) method1286(null, -124, null)
    }

    fun method1285(i: Int, i_0_: Int) {
        anInt2189++
        withLock(aLruByteCache_2185) {
            aLruByteCache_2185.method578(2, i)
        }
        withLock(this.aLruByteCache_2190!!) {
            if (i_0_ != 8) this.aJs5Archive_2180 = null
            this.aLruByteCache_2190!!.method578(i_0_ + -6, i)
        }
    }

    fun method1287(i: Byte, i_1_: Int): UnderlayDefinition {
        anInt2182++
        var underlayDefinition: UnderlayDefinition? = withLock(aLruByteCache_2185) {
            aLruByteCache_2185.method583(i_1_.toLong(), i.toInt() xor 0x1d.inv()) as? UnderlayDefinition?
        }
        if (underlayDefinition != null) return underlayDefinition
        if (i.toInt() != -104) this.aLruByteCache_2190 = null
        val `is`: ByteArray? = withLock(aJs5Archive_2188!!) {
            aJs5Archive_2188.method410(-1860, 33, i_1_)
        }
        underlayDefinition = UnderlayDefinition()
        underlayDefinition.aItemDefinitionLoader_2886 = this
        if (`is` != null) underlayDefinition.method1611(ByteBuffer(`is`), false)
        withLock(aLruByteCache_2185) {
            aLruByteCache_2185.method582(underlayDefinition, i_1_.toLong(), (-116).toByte())
        }
        return underlayDefinition
    }

    fun method1290(i: Int) {
        anInt2184++
        withLock(aLruByteCache_2185) {
            aLruByteCache_2185.method590(0)
        }
        withLock(this.aLruByteCache_2190!!) {
            this.aLruByteCache_2190!!.method590(0)
            if (i != -8) InboundPacketHeader.aInboundPacketHeader_2183 = null
        }
    }

    init {
        try {
            aJs5Archive_2188 = js5Archive
            this.aJs5Archive_2180 = js5Archive_9_
            aJs5Archive_2188!!.method407(0, 33)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("pg.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_9_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt2178: Int = 0
        var anInt2179: Int = 0
        var anInt2181: Int = 0
        var anInt2182: Int = 0
        var anInt2184: Int = 0
        var anInt2186: Int = 0

        var aNodeDeque_2187: NodeDeque? = NodeDeque()
        var anInt2189: Int = 0
        @JvmStatic
        fun method1284(i: Int) {
            InboundPacketHeader.aInboundPacketHeader_2183 = null
            if (i == -21165) aNodeDeque_2187 = null
        }

        fun method1286(file: File?, i: Int, string: String?) {
            do {
                try {
                    anInt2181++
                    CollisionMapAccessor.aHashtable3548!!.put(string, file)
                    if (i == 64) break
                    InboundPacketHeader.aInboundPacketHeader_2183 = null
                } catch (runtimeexception: RuntimeException) {
                    throw TextureLoadException.method2929(runtimeexception, ("pg.F(" + (if (file != null) "{...}" else "null") + ',' + i + ',' + (if (string != null) "{...}" else "null") + ')'))
                }
                break
            } while (false)
        }

        fun method1288(i: Int, i_2_: Int) {
            anInt2186++
            var class348 = TextureDefinitionCache.aHashtable_2959!!.method3484(0)
            while (class348 != null) {
                if ((class348.aLong4291 shr 48 and 0xffffL) == i_2_.toLong()) class348.method2715(119.toByte())
                class348 = TextureDefinitionCache.aHashtable_2959!!.method3482(0)
            }
        }

        fun method1289(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
            anInt2179++
            var i_7_ = SpriteArchiveLoader.anInt385
            if (i_5_ != 8) method1284(-59)
            var i_8_ = JagGlToolkitFactory.anInt1534
            if (GrayscaleNoiseTexture.aBoolean5300) {
                i_7_ += NativeTerrainTile.method4008((-126).toByte())
                i_8_ += method260(false)
            }
            if (FogOptionState.anInt6048 == 1) {
                val class105 = (BoxBlurTextureNode.aAbstractModelRendererArray9467!![LinkedListNodeStatics.anInt4292 / 100])
                class105!!.method974(i_7_ - 8, i_8_ + -8)
                MapTileShape.method2663(-5590, -8 + i_7_, -8 + (i_7_ - -class105.method966()), -8 + i_8_, class105.method980() + -8 + i_8_)
            }
            if (FogOptionState.anInt6048 == 2) {
                val class105 = (BoxBlurTextureNode.aAbstractModelRendererArray9467!![LinkedListNodeStatics.anInt4292 / 100 + 4])
                class105!!.method974(i_7_ + -8, -8 + i_8_)
                MapTileShape.method2663(-5590, i_7_ - 8, class105.method966() + i_7_ + -8, -8 + i_8_, class105.method980() + -8 + i_8_)
            }
            RegionSceneLoader.method2192(80.toByte())
        }
    }
}
