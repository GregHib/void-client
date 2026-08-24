import kotlin.jvm.JvmStatic
/* Class8 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class NpcAnimationResolver {

    var anInt159: Int = 0

    var anInt160: Int = 0

    var anInt161: Int = 0

    var anInt162: Int = 0

    companion object {

        var anInt163: Int = 0

        var anIntArray164: IntArray? = intArrayOf(4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1)

        var aNamedIdRecord_165: NamedIdRecord? = null

        var anInt166: Int = 0

        @JvmStatic
        fun method213(i: Byte) {
            anIntArray164 = null
            aNamedIdRecord_165 = null
        }

        @JvmStatic
        fun method214(npc: Npc, i: Int): Int {
            anInt163++
            var class79 = (npc.aNpcType_10505)
            if (class79!!.anIntArray1377 != null) {
                class79 = class79.method794(ProjectedGroundDecor.aVarpStore_10209!!, i)
                if (class79 == null) return -1
            }
            var i_0_ = class79.anInt1364
            if (i != -1) return 14
            val class225 = npc.method2422(72.toByte())
            if ((npc.anInt10268) != -1 && !(npc.aBoolean10213)) {
                if ((npc.anInt10268) != class225.anInt2919 && (class225.anInt2920 != npc.anInt10268) && (class225.anInt2949 != npc.anInt10268) && (class225.anInt2914 != (npc.anInt10268))) {
                    if ((class225.anInt2940 == npc.anInt10268) || (class225.anInt2924 == npc.anInt10268) || (npc.anInt10268 == class225.anInt2947) || (npc.anInt10268 == class225.anInt2958)) i_0_ = class79.anInt1395
                } else i_0_ = class79.anInt1327
            } else i_0_ = class79.anInt1343
            return i_0_
        }
    }
}
