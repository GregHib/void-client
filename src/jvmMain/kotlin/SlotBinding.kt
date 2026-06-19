import SlotBindingStatics.method2026
import SlotBindingStatics.anInt3390
import SlotBindingStatics.anInt3391
import SlotBindingStatics.anInt3397
import SlotBindingStatics.anInt3399
import SlotBindingStatics.anInt3400

/* Class267 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SlotBinding internal constructor(private val aCollisionFlagQuery_3392: CollisionFlagQuery?) {
    private var anInt3394 = 1
    private var anArchiveFileCondition_3398: ArchiveFileCondition? = null
    fun method2024(i: Int): Int {
        if (i != -1) return 41
        anInt3390++
        return anInt3394
    }

    fun method2025(archiveFileCondition: ArchiveFileCondition, bool: Boolean) {
        anInt3399++
        if (bool != false) toString()
        require(archiveFileCondition.method32(-15004) == aCollisionFlagQuery_3392)
        anArchiveFileCondition_3398 = archiveFileCondition
    }

    override fun toString(): String {
        anInt3400++
        throw IllegalStateException()
    }

    fun method2027(i: Int): ArchiveFileCondition? {
        anInt3391++
        if (i <= 68) return null
        return anArchiveFileCondition_3398
    }

    fun method2030(i: Int, i_8_: Int) {
        anInt3394 = i_8_
        anInt3397++
        if (i != 1) method2026(34)
    }
}
