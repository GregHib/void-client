import LinkedListIteratorStatics.method1242
import SocketFactoryStatics.method2049
import NormalMapTextureNodeStatics.method3141
import HardCacheEntryReferenceStatics.method3201
import java.io.IOException
import MapArchiveSourceStatics.anInt4800
import MapArchiveSourceStatics.anInt4801

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
        return CollisionFlagQueryStatics.aCollisionFlagQuery_1195
    }
}
