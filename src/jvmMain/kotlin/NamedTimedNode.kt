import CommonClock.method599

/* Class318_Sub9_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class NamedTimedNode internal constructor(@JvmField var aString8783: String?, i: Int) : SceneListNode() {

    var aShort8786: Short

    var anInt8787: Int = (method599(-92) / 1000L).toInt()

    init {
        this.aShort8786 = i.toShort()
    }

    companion object {
        var anInt8782: Int = 0
        var aFloat8784: Float = 0f

        var anIntArray8785: IntArray? = null

        fun method2515(i: Int): Array<MapSceneTile?>? {
            if (i != 1494) method2515(-18)
            anInt8782++
            if (NativeLibraryUnloader.aMapSceneTileArray2974 == null) {
                val mapSceneTiles: Array<MapSceneTile?> = WorldListEntryStatics.method286((-107).toByte(), VorbisOggDecoder.aPrivilegedOperationWorker_8992!!)
                val mapSceneTileS_0_s: Array<MapSceneTile?> = arrayOfNulls<MapSceneTile>(mapSceneTiles.size)
                var i_1_ = 0
                val i_2_ = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub23_7231!!.method1818(-32350)
                var i_3_ = 0
                while_108_@ while (mapSceneTiles.size > i_3_) {
                    val class57 = mapSceneTiles[i_3_]!!
                    if ((class57.anInt1046 <= 0 || class57.anInt1046 >= 24) && class57.anInt1047 >= 800 && class57.anInt1054 >= 600 && (i_2_ != 2 || (class57.anInt1047 <= 800) && class57.anInt1054 <= 600) && (i_2_ != 1 || ((class57.anInt1047 <= 1024) && (class57.anInt1054 <= 768)))) {
                        for (i_4_ in 0..<i_1_) {
                            val class57_5_ = mapSceneTileS_0_s[i_4_]!!
                            if ((class57_5_.anInt1047 == class57.anInt1047) && (class57_5_.anInt1054 == class57.anInt1054)) {
                                if (class57.anInt1046 > class57_5_.anInt1046) mapSceneTileS_0_s[i_4_] = class57
                                i_3_++
                                continue@while_108_
                            }
                        }
                        mapSceneTileS_0_s[i_1_] = class57
                        i_1_++
                    }
                    i_3_++
                }
                NativeLibraryUnloader.aMapSceneTileArray2974 = arrayOfNulls<MapSceneTile>(i_1_)
                ArrayCopyUtil.method1575<MapSceneTile?>(mapSceneTileS_0_s, 0, NativeLibraryUnloader.aMapSceneTileArray2974!!, 0, i_1_)
                val `is` = IntArray(NativeLibraryUnloader.aMapSceneTileArray2974!!.size)
                var i_6_ = 0
                while ((NativeLibraryUnloader.aMapSceneTileArray2974!!.size > i_6_)) {
                    val class57 = NativeLibraryUnloader.aMapSceneTileArray2974!![i_6_]
                    `is`[i_6_] = (class57!!.anInt1047 * class57.anInt1054)
                    i_6_++
                }
                GlShaderObjectHandle.method366(NativeLibraryUnloader.aMapSceneTileArray2974 as Array<Any?>, (-123).toByte(), `is`)
            }
            return NativeLibraryUnloader.aMapSceneTileArray2974
        }

        @JvmStatic
        fun method2517(i: Byte) {
            if (i.toInt() != 4) anIntArray8785 = null
            anIntArray8785 = null
        }
    }
}
