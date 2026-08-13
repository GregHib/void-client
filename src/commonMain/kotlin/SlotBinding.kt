/* Class267 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SlotBinding private constructor(private val aCollisionFlagQuery_3392: CollisionFlagQuery?) {
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
    }

    companion object {
        var anInt3390: Int = 0
        var anInt3391: Int = 0
        var anInt3397: Int = 0
        var anInt3399: Int = 0
        var anInt3400: Int = 0
        var aSlotBinding_3396: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1195)
        var aSlotBinding_3401: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1199)
        var aSlotBinding_3402: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1199)
        var aSlotBinding_3403: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1199)
        var aSlotBinding_3404: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1199)
        var aSlotBinding_3405: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1199)
        var aSlotBinding_3406: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1199)
        var aSlotBinding_3407: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1199)
        var aSlotBinding_3408: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1195)
        var aSlotBinding_3409: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1195)
        var aSlotBinding_3410: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1195)
        var aSlotBinding_3411: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1195)
        var aSlotBinding_3412: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1195)
        var aSlotBinding_3413: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1195)
        var aSlotBinding_3414: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1195)
        var aSlotBinding_3415: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1195)
        var aSlotBinding_3416: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1195)
        var aSlotBinding_3417: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1195)
        var aSlotBinding_3418: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1195)
        var aSlotBinding_3419: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1195)
        var aSlotBinding_3420: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1195)
        var aSlotBinding_3421: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1195)
        var aSlotBinding_3422: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1197)
        var aSlotBinding_3423: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1195)
        var aSlotBinding_3424: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1195)
        var aSlotBinding_3425: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1195)
        var aSlotBinding_3426: SlotBinding? = SlotBinding(CollisionFlagQuery.aCollisionFlagQuery_1198)
    }
}