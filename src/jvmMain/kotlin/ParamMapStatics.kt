import CacheArchiveIndexLoaderStatics.method340

object ParamMapStatics {
    var anInt9488: Int = 0
            var anInt9489: Int = 0
            var anInt9490: Int = 0
            var aFloatArray9491: FloatArray?
            var anInt9492: Int = 0
            var anInt9493: Int = 0
            var aBooleanArrayArray9495: Array<BooleanArray?>?
            var anInt9496: Int = 0
            var anInt9497: Int = 0
    
            @JvmStatic
            fun method3165(i: Byte) {
                if (i > 39) {
                    aFloatArray9491 = null
                    aBooleanArrayArray9495 = null
                }
            }
    
            fun method3169(i: Int, i_8_: Int): Boolean {
                if (i_8_ != 0) return true
                anInt9496++
                var class348_sub42_sub12 = (SourceRowTextureNodeStatics.aNodeDeque_9111!!.method1995(4) as ContactEntry?)
                while (class348_sub42_sub12 != null) {
                    if (FixedFunctionWaterPassStatics.method3549(class348_sub42_sub12.anInt9608, (-28).toByte()) && i.toLong() == (class348_sub42_sub12.aLong9605)) return true
                    class348_sub42_sub12 = SourceRowTextureNodeStatics.aNodeDeque_9111!!.method1990(99.toByte()) as ContactEntry?
                }
                return false
            }
    
            init {
                aFloatArray9491 = FloatArray(4)
                aBooleanArrayArray9495 = arrayOf<BooleanArray?>(
                    BooleanArray(13),
                    booleanArrayOf(false, false, true, true, true, true, true, false, false, false, false, false, true),
                    booleanArrayOf(true, true, true, true, true, true, false, false, false, false, false, false, false),
                    booleanArrayOf(true, true, true, false, false, true, true, true, false, false, false, false, false),
                    booleanArrayOf(true, false, false, false, false, true, true, true, false, false, false, false, false),
                    booleanArrayOf(false, false, true, true, true, true, false, false, false, false, false, false, false),
                    booleanArrayOf(false, true, true, true, true, true, false, false, false, false, false, false, true),
                    booleanArrayOf(false, true, true, true, true, true, true, true, false, false, false, false, true),
                    booleanArrayOf(true, true, false, false, false, false, false, true, false, false, false, false, false),
                    booleanArrayOf(true, true, true, true, true, false, false, false, true, true, false, false, false),
                    booleanArrayOf(true, false, false, false, true, true, true, true, true, true, false, false, false),
                    booleanArrayOf(true, false, true, true, true, true, true, true, false, false, true, true, false),
                    booleanArrayOf(true, true, true, true, true, true, true, true, true, true, true, true, true),
                    BooleanArray(13),
                    booleanArrayOf(true, true, true, true, true, true, true, true, true, true, true, true, true)
                )
            }
}
