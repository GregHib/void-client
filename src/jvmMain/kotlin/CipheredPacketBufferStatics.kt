import NamedTimedNodeStatics.method2516
import NpcTypeStatics.method797

object CipheredPacketBufferStatics {
    var anInt9752: Int = 0
            var anInt9753: Int = 0
            var anInt9755: Int = 0
            var anIntArray9757: IntArray? = null
            var anInt9758: Int = 0
            @JvmField
            var anInt9759: Int = 0
            var anInt9760: Int = 0
            var anInt9761: Int = 0
            var anInt9762: Int = 0
            var anInt9763: Int = 0
            var anInt9764: Int = 0
            var anInt9765: Int = 0
            var anInt9766: Int = 0
            var anInt9767: Int = 0
            var aShortArray9768: ShortArray? = shortArrayOf(11, 17, 45, 23, 48, 8, 57, 58)
            var anInt9769: Int = 0
    
            fun method3405(i: Int, bool: Boolean): Int {
                anInt9765++
                if (AbstractTileShapeStatics.anIntArray6547 == null) return 0
                if (!bool && LoadingScreenStateStatics.aRenderableEntryArray2636 != null) return AbstractTileShapeStatics.anIntArray6547!!.size * 2
                var i_1_ = 0
                if (i != 2012104999) method3405(118, false)
                var i_2_ = 0
                while (AbstractTileShapeStatics.anIntArray6547!!.size > i_2_) {
                    val i_3_ = AbstractTileShapeStatics.anIntArray6547!![i_2_]
                    if (GlShaderObjectHandleStatics.aJs5Archive_518!!.method421(false, i_3_)) i_1_++
                    if (TerrainTileStatics.aJs5Archive_4585!!.method421(false, i_3_)) i_1_++
                    i_2_++
                }
                return i_1_
            }
    
            fun method3411(i: Int, i_13_: Int, i_14_: Int) {
                anInt9761++
                val class348_sub42_sub15 = method2516(i, 105.toByte(), i_13_) //12
                class348_sub42_sub15.method3246(-25490)
                class348_sub42_sub15.anInt9652 = i_14_
            }
    
            fun method3413(i: Int, i_15_: Int, i_16_: Int, i_17_: Int, i_18_: Int, bool: Boolean, i_19_: Int, f: Float, bool_20_: Boolean): Array<IntArray?> {
                anInt9764++
                val `is` = Array<IntArray?>(i_18_) { IntArray(i_16_) }
                val class348_sub40_sub8 = PerlinNoiseTextureNode()
                class348_sub40_sub8.anInt9149 = (f * 4096.0f).toInt()
                class348_sub40_sub8.anInt9150 = i_15_
                class348_sub40_sub8.anInt9158 = i_17_
                class348_sub40_sub8.anInt9164 = i
                class348_sub40_sub8.aBoolean9160 = bool_20_
                class348_sub40_sub8.method3044(109)
                method797(i_18_, i_16_, 120.toByte())
                if (bool != true) anIntArray9757 = null
                for (i_21_ in 0..<i_18_) class348_sub40_sub8.method3069(i_21_, `is`[i_21_]!!, 99.toByte())
                return `is`
            }
    
            @JvmStatic
            fun method3414(i: Int) {
                aShortArray9768 = null
                if (i == 21515) anIntArray9757 = null
            }
}
