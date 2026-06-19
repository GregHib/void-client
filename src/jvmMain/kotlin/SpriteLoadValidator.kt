import SpriteLoadValidatorStatics.anInt4790
import SpriteLoadValidatorStatics.anInt4794
import SpriteLoadValidatorStatics.method1159

/* Class136 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SpriteLoadValidator internal constructor(js5Archive: Js5Archive?, string: String?) : ArchiveFileCondition {
    private val aString4788: String?
    private val aJs5Archive_4789: Js5Archive?

    init {
        try {
            aString4788 = string
            aJs5Archive_4789 = js5Archive
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("nv.<init>(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ')'))
        }
    }

    override fun method32(i: Int): CollisionFlagQuery? {
        anInt4794++
        if (i != -15004) method1159((-110).toByte())
        return CollisionFlagQueryStatics.aCollisionFlagQuery_1198
    }

    override fun method31(i: Int): Int {
        anInt4790++
        if (aJs5Archive_4789!!.method413(100, aString4788!!)) return 100
        val i_0_ = 31 % ((-43 - i) / 62)
        return aJs5Archive_4789.method397(aString4788, 0)
    }
}
