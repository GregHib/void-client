import FileExistsConditionStatics.aFloatArray4772
import FileExistsConditionStatics.anInt4774
import FileExistsConditionStatics.anInt4781

/* Class73 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class FileExistsCondition internal constructor(js5Archive: Js5Archive?, string: String?) : ArchiveFileCondition {
    private val aString4778: String?
    private val aJs5Archive_4785: Js5Archive?
    override fun method31(i: Int): Int {
        val i_1_ = -62 / ((i - -43) / 62)
        anInt4774++
        if (aJs5Archive_4785!!.method416((-74).toByte(), aString4778)) return 100
        return 0
    }

    override fun method32(i: Int): CollisionFlagQuery? {
        anInt4781++
        if (i != -15004) aFloatArray4772 = null
        return CollisionFlagQueryStatics.aCollisionFlagQuery_1197
    }

    init {
        try {
            aJs5Archive_4785 = js5Archive
            aString4778 = string
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("kk.<init>(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ')'))
        }
    }
}
