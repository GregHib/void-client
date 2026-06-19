import HardCacheEntryReferenceStatics.method3200

object ParticleEmitterNodeStatics {
    @JvmField
            var anIntArrayArray174: Array<IntArray?>? = arrayOf<IntArray?>(intArrayOf(0, 2), intArrayOf(0, 2), intArrayOf(0, 0, 2), intArrayOf(2, 0, 0), intArrayOf(0, 2, 0), intArrayOf(0, 0, 2), intArrayOf(0, 5, 1, 4), intArrayOf(0, 4, 4, 4), intArrayOf(4, 4, 4, 0), intArrayOf(6, 6, 6, 2, 2, 2), intArrayOf(2, 2, 2, 6, 6, 6), intArrayOf(0, 11, 6, 6, 6, 4), intArrayOf(0, 2), intArrayOf(0, 4, 4, 4), intArrayOf(0, 4, 4, 4))
            @JvmField
            var anInt175: Int = 0
            @JvmField
            var anIntArray179: IntArray? = null
            @JvmField
            var anInt181: Int = 0
            @JvmField
            var anInt182: Int = 0
            @JvmField
            var aSceneProjector_186: SceneProjector?
            @JvmField
            var anIntArray187: IntArray? = intArrayOf(-1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048)
            @JvmField
            var anInt190: Int = 0
            @JvmField
            var aWidgetCache_191: WidgetCache? = null
            @JvmStatic
            fun method217(i: Byte): String? {
                anInt175++
                if (ScrollbarComponentStatics.aBoolean8335 || IntHashSetStatics.aClass348_Sub42_Sub12_3963 == null) return ""
                if (i < 51) return null
                return (IntHashSetStatics.aClass348_Sub42_Sub12_3963!!.aString9593)
            }
    
            @JvmStatic
            fun method218(i: Byte) {
                if (i < 101) method218((-85).toByte())
                anIntArray187 = null
                anIntArray179 = null
                aSceneProjector_186 = null
                aWidgetCache_191 = null
                anIntArrayArray174 = null
            }
    
            @JvmStatic
            fun method219(i: Int, bool: Boolean, i_0_: Int): Boolean {
                if (bool != false) return false
                anInt190++
                return ((i and 0x800) != 0) or BufferedMessageQueueStatics.method2077(-106, i_0_, i) || method3200(i, i_0_, 88.toByte())
            }
    
            init {
                aSceneProjector_186 = SceneProjector("runescape", 0)
            }
}
