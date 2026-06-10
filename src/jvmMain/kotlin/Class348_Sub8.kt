import kotlin.math.atan2

class Class348_Sub8 internal constructor(@JvmField var aByteArray6657: ByteArray?) : Class348() {
    companion object {
        @JvmField
        var aHa6654: ha? = null
        @JvmField
        var anIntArray6655: IntArray? = null
        @JvmField
        var aBooleanArrayArray6656: Array<BooleanArray?>? = null
        private var aShortArray6658: ShortArray?
        @JvmField
        var anInt6659: Int = 0
        @JvmField
        var aClass241_6660: Class241? = null
        private var aShortArray6661: ShortArray? = shortArrayOf(967, 20428, -21577, 11219, -10290)
        @JvmField
        var anApplet6662: GameApplet? = null
        private var aShortArray6663: ShortArray? = shortArrayOf(957, 20418, -21587, 11209, -10300)
        @JvmField
        var aShortArrayArray6664: Array<ShortArray?>?
        private var aShortArray6665: ShortArray?
        @JvmField
        var anIntArray6666: IntArray?
        @JvmField
        var anInt6667: Int = 0

        @JvmStatic
        fun method2774(i: Byte, class318_sub1_sub3_sub3: Class318_Sub1_Sub3_Sub3): Int {
            anInt6667++
            if (i.toInt() != 108) anApplet6662 = null
            if (class318_sub1_sub3_sub3.anInt10310 == 0) return 0
            if (class318_sub1_sub3_sub3.anInt10275 != -1) {
                var class318_sub1_sub3_sub3_0_: Class318_Sub1_Sub3_Sub3? = null
                if (class318_sub1_sub3_sub3.anInt10275 >= 32768) {
                    if ((class318_sub1_sub3_sub3.anInt10275) >= 32768) class318_sub1_sub3_sub3_0_ = (Class294.aPlayerArray5058!![class318_sub1_sub3_sub3.anInt10275 + -32768])
                } else {
                    val class348_sub22 = ((Class282.aClass356_3654!!.method3480(class318_sub1_sub3_sub3.anInt10275.toLong(), -6008)) as Class348_Sub22?)
                    if (class348_sub22 != null) class318_sub1_sub3_sub3_0_ = (class348_sub22.aNpc_6859)
                }
                if (class318_sub1_sub3_sub3_0_ != null) {
                    val i_1_ = (class318_sub1_sub3_sub3.x + -(class318_sub1_sub3_sub3_0_.x))
                    val i_2_ = (class318_sub1_sub3_sub3.y + -(class318_sub1_sub3_sub3_0_.y))
                    if (i_1_ != 0 || i_2_ != 0) class318_sub1_sub3_sub3.method2440(49.toByte(), 0x3fff and (atan2(i_1_.toDouble(), i_2_.toDouble()) * 2607.5945876176133).toInt())
                }
            }
            if (class318_sub1_sub3_sub3 is Player) {
                val player = class318_sub1_sub3_sub3
                if ((player.anInt10524) != -1 && ((player.anInt10319) == 0 || player.anInt10326 > 0)) {
                    player.method2440(49.toByte(), player.anInt10524)
                    player.anInt10524 = -1
                }
            } else if (class318_sub1_sub3_sub3 is Npc) {
                val npc = class318_sub1_sub3_sub3
                if ((npc.anInt10499) != -1 && ((npc.anInt10319) == 0 || npc.anInt10326 > 0)) {
                    val i_3_ = (-((-za_Sub2.regionTileX + npc.anInt10499 - za_Sub2.regionTileX) * 256) + (npc.x))
                    val i_4_ = (npc.y - 256 * (npc.anInt10512 + (-Class90.regionTileY + -Class90.regionTileY)))
                    if (i_3_ != 0 || i_4_ != 0) npc.method2440(49.toByte(), 0x3fff and (atan2(i_3_.toDouble(), i_4_.toDouble()) * 2607.5945876176133).toInt())
                    npc.anInt10499 = -1
                }
            }
            return class318_sub1_sub3_sub3.method2428(i + -106)
        }

        @JvmStatic
        fun method2775(i: Byte) {
            aShortArray6658 = null
            aHa6654 = null
            aShortArray6665 = null
            anIntArray6666 = null
            aShortArray6663 = null
            anIntArray6655 = null
            if (i > -123) Companion.method2776((-65).toByte(), -91)
            aClass241_6660 = null
            aBooleanArrayArray6656 = null
            anApplet6662 = null
            aShortArrayArray6664 = null
            aShortArray6661 = null
        }

        @JvmStatic
        fun method2776(i: Byte, i_5_: Int): Class364? {
            anInt6659++
            if (i > -35) aBooleanArrayArray6656 = null
            val class364s = Class348_Sub40_Sub28.method3122(91.toByte())
            var i_6_ = 0
            while (class364s.size > i_6_) {
                val class364 = class364s[i_6_]!!
                if (class364.anInt4466 == i_5_) return class364
                i_6_++
            }
            return null
        }

        @JvmStatic
        fun method2777(l: Long, l_7_: Long): Long {
            try {
                return l and l_7_
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, "gia.C(" + l + ',' + l_7_ + ')')
            }
        }

        init {
            aShortArray6658 = shortArrayOf(952, 20413, -21592, 11204, -10305)
            aShortArray6665 = shortArrayOf(962, 20423, -21582, 11214, -10295)
            aShortArrayArray6664 = arrayOf<ShortArray?>(aShortArray6661, aShortArray6665, aShortArray6663, aShortArray6658)
            anIntArray6666 = IntArray(3)
        }
    }
}
