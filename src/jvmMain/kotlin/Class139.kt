/* Class139 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class139 {
    var aByteArray1948: ByteArray? = null
    var aShortArray1951: ShortArray? = null
    var aShortArray1953: ShortArray? = null
    var aShortArray1954: ShortArray? = null

    companion object {
        var anInt1949: Int = 0
        var anInt1950: Int = 0
        @JvmField
        var aBoolean1952: Boolean = false
        var anInt1955: Int = 0

        fun method1165(i: Int) {
            Class299.aClass348_Sub49_Sub2_3813!!.startBitAccess(i xor 0x79.inv())
            anInt1950++
            val i_0_ = Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 8)
            if (i == 1) {
                if (i_0_ < Class150.anInt2057) {
                    var i_1_ = i_0_
                    while (Class150.anInt2057 > i_1_) {
                        Class5_Sub1_Sub1.anIntArray9932!![Class358.anInt4411++] = Class74.anIntArray1233!![i_1_]
                        i_1_++
                    }
                }
                if (i_0_ > Class150.anInt2057) throw RuntimeException("gnpov1")
                Class150.anInt2057 = 0
                for (i_2_ in 0..<i_0_) {
                    val i_3_ = Class74.anIntArray1233!![i_2_]
                    val npc = ((Class282.aClass356_3654!!.method3480(i_3_.toLong(), -6008) as Class348_Sub22).aNpc_6859)!!
                    val i_4_ = Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 1)
                    if (i_4_ == 0) {
                        Class74.anIntArray1233!![Class150.anInt2057++] = i_3_
                        npc.anInt10306 = Class348_Sub23_Sub3.anInt9041
                    } else {
                        val i_5_ = Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 2)
                        if (i_5_ == 0) {
                            Class74.anIntArray1233!![Class150.anInt2057++] = i_3_
                            npc.anInt10306 = Class348_Sub23_Sub3.anInt9041
                            Class13.anIntArray224!![Class101.anInt1597++] = i_3_
                        } else if (i_5_ == 1) {
                            Class74.anIntArray1233!![Class150.anInt2057++] = i_3_
                            npc.anInt10306 = Class348_Sub23_Sub3.anInt9041
                            val i_6_ = Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 3)
                            npc.method2443(i_6_, 1, -10)
                            val i_7_ = Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 1)
                            if (i_7_ == 1) Class13.anIntArray224!![Class101.anInt1597++] = i_3_
                        } else if (i_5_ == 2) {
                            Class74.anIntArray1233!![Class150.anInt2057++] = i_3_
                            npc.anInt10306 = Class348_Sub23_Sub3.anInt9041
                            if (Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 1) == 1) {
                                val i_9_ = Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 3)
                                npc.method2443(i_9_, 2, -10)
                                val i_10_ = Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 3)
                                npc.method2443(i_10_, 2, -10)
                            } else {
                                val i_8_ = Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 3)
                                npc.method2443(i_8_, 0, i + -11)
                            }
                            val i_11_ = Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 1)
                            if (i_11_ == 1) Class13.anIntArray224!![Class101.anInt1597++] = i_3_
                        } else if (i_5_ == 3) Class5_Sub1_Sub1.anIntArray9932!![Class358.anInt4411++] = i_3_
                    }
                }
            }
        }

        @JvmStatic
        fun method1166(i: Int, i_12_: Int): Int {
            return i and i_12_
        }

        @JvmStatic
        fun method1167(i: Int, i_13_: Byte): Boolean {
            anInt1955++
            if (i_13_ >= -45) anInt1949 = 88
            return i == 0 || i == 1 || i == 2
        }
    }
}
