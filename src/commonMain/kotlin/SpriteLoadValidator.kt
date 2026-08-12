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
            throw TextureLoadException.method2929(runtimeexception, ("nv.<init>(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ')'))
        }
    }

    override fun method32(i: Int): CollisionFlagQuery? {
        anInt4794++
        return CollisionFlagQuery.aCollisionFlagQuery_1198
    }

    override fun method31(i: Int): Int {
        anInt4790++
        if (aJs5Archive_4789!!.method413(100, aString4788!!)) return 100
        return aJs5Archive_4789.method397(aString4788, 0)
    }

    companion object {
        var anInt4790: Int = 0
        var anInt4794: Int = 0
    }
}