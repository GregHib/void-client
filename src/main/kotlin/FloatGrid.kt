import SceneTilePlaneManager.method260
import LoadProgressCounters.Companion.method1373

/* Class216 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class FloatGrid internal constructor(var anInt4974: Int, var anInt4978: Int) : Interface13 {
    var aFloatArray4980: FloatArray?

    init {
        this.aFloatArray4980 = FloatArray(anInt4974 * anInt4978)
    }

    companion object {
        @JvmField
        var aClass45_4975: Class45? = null
        var anInt4976: Int = 0
        var anInt4977: Int = 0
        @JvmField
        var anInt4979: Int = 0
        @JvmStatic
        fun method1583(i: Byte) {
            anInt4977++
            if (RenderNode.anInt9721 != -1) {
                var i_0_ = GlTexture1D.aInputTracker_8552!!.method3597(true)
                var i_1_ = GlTexture1D.aInputTracker_8552!!.method3594(72.toByte())
                val class348_sub45 = (GroundDecorEntity.aNodeDeque_8744!!.method1995(4) as TimedRecordAccessor?)
                if (class348_sub45 != null) {
                    i_0_ = class348_sub45.method3308((-128).toByte())
                    i_1_ = class348_sub45.method3311(58)
                }
                var i_2_ = 0
                if (i.toInt() != -73) anInt4976 = 105
                var i_3_ = 0
                if (Class59_Sub1.aBoolean5300) {
                    i_2_ = NativeTerrainTile.method4008((-128).toByte())
                    i_3_ = method260(false)
                }
                method1373(RenderNode.anInt9721, i_2_, i_2_, LocTypeDefinition.anInt4017 + i_2_, i_1_, i_0_, -1391, i_0_ + i_2_, HardCacheEntryReference.anInt10432 + i_3_, i_3_, i_3_ + i_1_, i_3_)
                if (HeapDiagnosticsHolder.aClass46_2249 != null) NativeLibraryUnloader.method1630(0, i_3_ + i_1_, i_2_ + i_0_)
            }
        }

        @JvmStatic
        fun method1584(i: Byte) {
            if (i.toInt() != -64) Companion.method1584((-48).toByte())
            aClass45_4975 = null
        }
    }
}
