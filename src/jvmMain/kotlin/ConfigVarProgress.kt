import ArrayCopyUtil.method1577
import NoiseTextureGeneratorStatics.method547
import LruByteCacheStatics.method589
import ConfigVarProgressStatics.method2309
import ConfigVarProgressStatics.anInt4809
import ConfigVarProgressStatics.anInt4815
import ConfigVarProgressStatics.aStringArray4818
import ConfigVarProgressStatics.anInt4821

/* Class309 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ConfigVarProgress internal constructor(private val aString4807: String?) : ArchiveFileCondition {
    private var aBoolean4824 = false
    override fun method31(i: Int): Int {
        val i_9_ = 88 % ((-43 - i) / 62)
        anInt4821++
        val i_10_ = method547(aString4807, 7468)
        if (i_10_ >= 0 && i_10_ <= 100) return i_10_
        aBoolean4824 = true
        return 100
    }

    override fun method32(i: Int): CollisionFlagQuery? {
        anInt4809++
        if (i != -15004) aStringArray4818 = null
        return CollisionFlagQueryStatics.aCollisionFlagQuery_1199
    }

    fun method2313(i: Int): Boolean {
        if (i <= 99) method2309(-35, null)
        anInt4815++
        return aBoolean4824
    }
}
