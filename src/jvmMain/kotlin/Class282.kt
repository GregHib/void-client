import Class183.Companion.method1376
import Class275.method2064
import Class89.Companion.method850

/* Class282 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class282 {
    var anInt3651: Int = 0
    var aBoolean3652: Boolean = false
    var anInt3653: Int = 0
    @JvmField
    var aClass356_3654: Class356?
    var anInt3655: Int = 0

    fun method2109(i: Int) {
        anInt3653++
        var class348_sub42_sub18 = (Class348_Sub40_Sub17.aClass262_9240!!.method1995(4) as Class348_Sub42_Sub18?)
        if (i != 512) method2110(-125, 79, 70)
        while ( /**/class348_sub42_sub18 != null) {
            val class318_sub1_sub3_sub5 = (class348_sub42_sub18.aClass318_Sub1_Sub3_Sub5_9682)!!
            if (Class367_Sub11.anInt7396 > class318_sub1_sub3_sub5.anInt10392) {
                class348_sub42_sub18.method2715(101.toByte())
                class318_sub1_sub3_sub5.method2472(-2159)
            } else if ((class318_sub1_sub3_sub5.anInt10411) <= Class367_Sub11.anInt7396) {
                class318_sub1_sub3_sub5.method2474(121.toByte())
                if ((class318_sub1_sub3_sub5.anInt10412) > 0) {
                    val class348_sub22 = ((aClass356_3654!!.method3480((-1 + class318_sub1_sub3_sub5.anInt10412).toLong(), -6008)) as Class348_Sub22?)
                    if (class348_sub22 != null) {
                        val npc = (class348_sub22.aNpc_6859)!!
                        if ((npc.x) >= 0 && (Class367_Sub4.anInt7319 * 512 > npc.x) && (npc.y) >= 0 && (512 * Class348_Sub40_Sub3.anInt9109 > npc.y)) class318_sub1_sub3_sub5.method2471((-103).toByte(), ((method2064(npc.x, (class318_sub1_sub3_sub5.plane).toInt(), 11219, npc.y)) + -class318_sub1_sub3_sub5.anInt10366), npc.y, Class367_Sub11.anInt7396, npc.x)
                    }
                }
                if ((class318_sub1_sub3_sub5.anInt10412) < 0) {
                    val i_0_ = -(class318_sub1_sub3_sub5.anInt10412) - 1
                    val player: Player?
                    if (i_0_ == Class348_Sub42_Sub11.anInt9591) player = Class132.aPlayer_1907
                    else player = (Class294.aPlayerArray5058!![i_0_])
                    if (player != null && (player.x) >= 0 && ((player.x) < 512 * Class367_Sub4.anInt7319) && (player.y) >= 0 && (player.y) < 512 * Class348_Sub40_Sub3.anInt9109) class318_sub1_sub3_sub5.method2471((-103).toByte(), ((method2064((player.x), (class318_sub1_sub3_sub5.plane).toInt(), 11219, (player.y))) - class318_sub1_sub3_sub5.anInt10366), (player.y), Class367_Sub11.anInt7396, (player.x))
                }
                class318_sub1_sub3_sub5.method2475(75.toByte(), Class348_Sub51.anInt7267)
                method850(class318_sub1_sub3_sub5, true)
            }
            class348_sub42_sub18 = Class348_Sub40_Sub17.aClass262_9240!!.method1990(56.toByte()) as Class348_Sub42_Sub18?
        }
    }

    fun method2110(i: Int, i_1_: Int, i_2_: Int): Class318_Sub1_Sub2? {
        val class357 = Class147.aClass357ArrayArrayArray2029!![i]!![i_1_]!![i_2_]
        if (class357 == null) return null
        val class318_sub1_sub2 = class357.aClass318_Sub1_Sub2_4408
        class357.aClass318_Sub1_Sub2_4408 = null
        method1376(class318_sub1_sub2)
        return class318_sub1_sub2
    }

    @JvmStatic
    fun method2111(i: Byte) {
        aClass356_3654 = null
        if (i <= 56) Class282.method2111((-49).toByte())
    }

    fun method2112(i: Int, i_3_: Int): Boolean {
        anInt3651++
        if (i <= 121) return false
        return i_3_ == 3 || i_3_ == 4
    }

    init {
        aClass356_3654 = Class356(64)
    }
}
