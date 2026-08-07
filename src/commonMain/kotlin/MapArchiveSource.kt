/* Class292 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MapArchiveSource internal constructor(private val aJs5Archive_4804: Js5Archive) : ArchiveFileCondition {
    override fun method31(i: Int): Int {
        anInt4801++
        val i_0_ = 16 / ((i - -43) / 62)
        if (aJs5Archive_4804.method401(125)) return 100
        return aJs5Archive_4804.method398((-31).toByte())
    }

    override fun method32(i: Int): CollisionFlagQuery? {
        if (i != -15004) return null
        anInt4800++
        return CollisionFlagQuery.aCollisionFlagQuery_1195
    }

    companion object {
        var anInt4801: Int = 0
        var anInt4800: Int = 0
    }
}