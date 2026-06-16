import Class8.Companion.method214

/**
 * JVM-only statics split out of [Class223].
 *
 * Holds the members that couple to JVM-only types: the [Class221] handle
 * ([aClass221_2893]) and [method1614], which reads [Npc]/[Player]/[Class51]
 * entity state and dispatches through [Client]/[Class218]. The neutral
 * pathfinding state ([Class223.anIntArray2899], [Class223.anIntArrayArray2900],
 * counters) lives on the commonMain [Class223] companion. Kept in jvmMain so
 * Class223 itself (a return type threaded through Interface12) can be common.
 */
object Class223Statics {
    var aClass221_2893: Class221? = Class221()

    fun method1612(i: Byte) {
        Class223.anIntArray2899 = null
        if (i.toInt() != -9) method1614(-47, null, -126, -99, 117, null, null, 90)
        Class223.anIntArrayArray2900 = null
        aClass221_2893 = null
    }

    fun method1613(bool: Boolean, i: Int, i_0_: Int): Boolean {
        if (bool != false) method1612((-104).toByte())
        Class223.anInt2897++
        return (i_0_ and 0x22) != 0
    }

    fun method1614(i: Int, npc: Npc?, i_2_: Int, i_3_: Int, i_4_: Int, player: Player?, class51: Class51?, i_5_: Int) {
        try {
            Class223.anInt2898++
            if (i != 979190089) Class223.aBoolean2895 = false
            val class348_sub9 = Class348_Sub9()
            class348_sub9.anInt6678 = i_4_ shl 9
            class348_sub9.anInt6693 = i_2_
            class348_sub9.anInt6689 = i_3_ shl 9
            if (class51 == null) {
                if (npc != null) {
                    class348_sub9.aNpc_6691 = npc
                    var class79 = (npc.aClass79_10505)
                    if (class79!!.anIntArray1377 != null) {
                        class348_sub9.aBoolean6684 = true
                        class79 = class79.method794((Class318_Sub1_Sub3_Sub3.aClass170_10209!!), i xor 0x3a5d4149.inv())
                    }
                    if (class79 != null) {
                        class348_sub9.anInt6698 = (i_4_ + class79.anInt1399 shl 9)
                        class348_sub9.anInt6687 = (i_3_ - -class79.anInt1399 shl 9)
                        class348_sub9.anInt6685 = method214(npc, -1)
                        class348_sub9.anInt6696 = class79.anInt1340
                        class348_sub9.anInt6694 = class79.anInt1392 shl 9
                        class348_sub9.anInt6677 = class79.anInt1356
                        class348_sub9.anInt6681 = class79.anInt1363
                        class348_sub9.aBoolean6674 = class79.aBoolean1370
                    }
                    Client.aClass262_5185!!.method1999(class348_sub9, i + -979210269)
                } else if (player != null) {
                    class348_sub9.aPlayer_6679 = player
                    class348_sub9.anInt6698 = (player.method2436(74.toByte()) + i_4_) shl 9
                    class348_sub9.anInt6687 = (player.method2436(86.toByte()) + i_3_) shl 9
                    class348_sub9.anInt6685 = Class315.method2357(-1, player)
                    class348_sub9.anInt6681 = 256
                    class348_sub9.anInt6694 = (player.anInt10553 shl 9)
                    class348_sub9.anInt6677 = player.anInt10558
                    class348_sub9.anInt6696 = 256
                    class348_sub9.aBoolean6674 = player.aBoolean10517
                    Class348_Sub42_Sub16_Sub2.aClass356_10465!!.method3483(65.toByte(), player.anInt10290.toLong(), class348_sub9)
                }
            } else {
                class348_sub9.aClass51_6695 = class51
                var i_6_ = class51.anInt961
                var i_7_ = class51.anInt926
                if (i_5_ == 1 || i_5_ == 3) {
                    i_6_ = class51.anInt926
                    i_7_ = class51.anInt961
                }
                class348_sub9.anInt6687 = i_7_ + i_3_ shl 9
                class348_sub9.anInt6680 = class51.anInt962
                class348_sub9.anInt6685 = class51.anInt887
                class348_sub9.anInt6681 = class51.anInt916
                class348_sub9.anIntArray6697 = class51.anIntArray904
                class348_sub9.anInt6696 = class51.anInt878
                class348_sub9.aBoolean6699 = class51.aBoolean903
                class348_sub9.anInt6694 = class51.anInt889 shl 9
                class348_sub9.anInt6668 = class51.anInt937
                class348_sub9.anInt6698 = i_6_ + i_4_ shl 9
                class348_sub9.anInt6677 = class51.anInt936
                class348_sub9.aBoolean6674 = class51.aBoolean888
                if (class51.anIntArray945 != null) {
                    class348_sub9.aBoolean6684 = true
                    class348_sub9.method2781(21.toByte())
                }
                if (class348_sub9.anIntArray6697 != null) class348_sub9.anInt6670 = (class348_sub9.anInt6680 - -((-class348_sub9.anInt6680 + class348_sub9.anInt6668).toDouble() * Math.random()).toInt())
                Class218.aClass262_2859!!.method1999(class348_sub9, -20180)
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ad.B(" + i + ',' + (if (npc != null) "{...}" else "null") + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + (if (player != null) "{...}" else "null") + ',' + (if (class51 != null) "{...}" else "null") + ',' + i_5_ + ')'))
        }
    }
}
