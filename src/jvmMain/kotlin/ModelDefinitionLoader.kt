/* Class150 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ModelDefinitionLoader internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?, js5Archive_9_: Js5Archive?) {
    private var aJs5Archive_2048: Js5Archive? = null
    private val aLruByteCache_2050 = LruByteCache(64)
    var aJs5Archive_2054: Js5Archive? = null
    fun method1203(i: Byte, i_3_: Int): SkeletalAnimFrameLoader {
        anInt2056++
        if (i.toInt() != 33) aJs5Archive_2048 = null
        var skeletalAnimFrameLoader: SkeletalAnimFrameLoader?
        withLock(aLruByteCache_2050) {
            skeletalAnimFrameLoader = aLruByteCache_2050.method583(i_3_.toLong(), -58) as SkeletalAnimFrameLoader?
        }
        if (skeletalAnimFrameLoader != null) return skeletalAnimFrameLoader
        val `is`: ByteArray?
        withLock(aJs5Archive_2048!!) {
            `is` = aJs5Archive_2048!!.method410(i + -1893, 3, i_3_)
        }
        skeletalAnimFrameLoader = SkeletalAnimFrameLoader()
        skeletalAnimFrameLoader.aModelDefinitionLoader_475 = this
        if (`is` != null) skeletalAnimFrameLoader.method346(i.toInt().inv(), ByteBuffer(`is`))
        withLock(aLruByteCache_2050) {
            aLruByteCache_2050.method582(skeletalAnimFrameLoader, i_3_.toLong(), (-109).toByte())
        }
        return skeletalAnimFrameLoader
    }

    fun method1204(i: Int) {
        withLock(aLruByteCache_2050) {
            aLruByteCache_2050.method587(-93)
        }
        anInt2049++
        if (i != 0) aJs5Archive_2048 = null
    }

    fun method1206(i: Byte) {
        if (i.toInt() != -37) aJs5Archive_2048 = null
        anInt2051++
        withLock(aLruByteCache_2050) {
            aLruByteCache_2050.method590(0)
        }
    }

    fun method1207(i: Int, i_7_: Int) {
        anInt2055++
        if (i == -17452) {
            withLock(aLruByteCache_2050) {
                aLruByteCache_2050.method578(i + 17454, i_7_)
            }
        }
    }

    init {
        try {
            this.aJs5Archive_2054 = js5Archive_9_
            aJs5Archive_2048 = js5Archive
            aJs5Archive_2048!!.method407(0, 3)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("oha.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_9_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var aCameraNodeList_2047: CameraNodeList?
        var anInt2049: Int = 0
        var anInt2051: Int = 0
        var anInt2052: Int = 0
        var anInt2053: Int = 0
        var anInt2055: Int = 0
        var anInt2056: Int = 0
        @JvmField
        var anInt2057: Int = 0

        @JvmStatic
        fun method1202(i: Int) {
            anInt2052++
            val `is` = IntArray(ClientException.aModelHeaderCache_112!!.anInt3271)
            var i_0_ = i
            var i_1_ = 0
            while (ClientException.aModelHeaderCache_112!!.anInt3271 > i_1_) {
                val class213 = ClientException.aModelHeaderCache_112!!.method1940(-104, i_1_)
                if (class213.anInt2815 >= 0 || class213.anInt2788 >= 0) `is`[i_0_++] = i_1_
                i_1_++
            }
            SpriteStore.anIntArray369 = IntArray(i_0_)
            for (i_2_ in 0..<i_0_) SpriteStore.anIntArray369!![i_2_] = `is`[i_2_]
        }

        fun method1205(i: Int, bool: Boolean, js5Archive: Js5Archive, i_4_: Int): InterfaceComponentGroup {
            anInt2053++
            val class348_sub49 = ByteBuffer(js5Archive.method410(-1860, i_4_, i))
            if (bool != true) method1208(102)
            val class348_sub42_sub14 = InterfaceComponentGroup(i, class348_sub49.readString(88.toByte()), class348_sub49.readString(120.toByte()), class348_sub49.readInt((-126).toByte()), class348_sub49.readInt((-126).toByte()), class348_sub49.readUnsignedByte(255) == 1, class348_sub49.readUnsignedByte(255), class348_sub49.readUnsignedByte(255))
            val i_5_ = class348_sub49.readUnsignedByte(255)
            for (i_6_ in 0..<i_5_) class348_sub42_sub14.aNodeDeque_9629!!.method1999(
                InterfaceBounds(
                    class348_sub49.readUnsignedByte(255),
                    class348_sub49.readUnsignedShort(842397944),
                    class348_sub49.readUnsignedShort(842397944),
                    class348_sub49.readUnsignedShort(842397944),
                    class348_sub49.readUnsignedShort(842397944),
                    class348_sub49.readUnsignedShort(842397944),
                    class348_sub49.readUnsignedShort(842397944),
                    class348_sub49.readUnsignedShort(842397944),
                    class348_sub49.readUnsignedShort(842397944)
                ), -20180
            )
            class348_sub42_sub14.method3240(37.toByte())
            return class348_sub42_sub14
        }

        @JvmStatic
        fun method1208(i: Int) {
            aCameraNodeList_2047 = null
            val i_8_ = -65 / ((i - -58) / 57)
        }

        init {
            aCameraNodeList_2047 = CameraNodeList()
        }
    }
}
