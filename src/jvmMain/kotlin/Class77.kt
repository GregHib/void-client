import Class348_Sub42_Sub8_Sub2.Companion.method3200

/* Class77 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class77 {
    private lateinit var anIntArray1289: IntArray
    private var anInt1291 = 0
    private var anInt1292 = 0
    private var anInt1293 = 0
    private var anInt1294 = 0
    private var anIntArray1296: IntArray? = null

    private constructor()

    internal constructor(`is`: IntArray) {
        anIntArray1296 = IntArray(256)
        anIntArray1289 = IntArray(256)
        var i = 0
        while (`is`.size > i) {
            anIntArray1289[i] = `is`[i]
            i++
        }
        method777(-94)
    }

    private fun method777(i: Int) {
        anInt1302++
        var i_3_: Int
        var i_4_: Int
        var i_5_: Int
        var i_6_: Int
        var i_7_: Int
        var i_8_: Int
        var i_9_: Int
        i_9_ = -1640531527
        i_8_ = i_9_
        i_7_ = i_8_
        i_6_ = i_7_
        i_5_ = i_6_
        i_4_ = i_5_
        i_3_ = i_4_
        var i_2_ = i_3_
        for (i_10_ in 0..3) {
            i_2_ = i_2_ xor (i_3_ shl 11)
            i_5_ += i_2_
            i_3_ += i_4_
            i_3_ = i_3_ xor (i_4_ ushr 2)
            i_6_ += i_3_
            i_4_ += i_5_
            i_4_ = i_4_ xor (i_5_ shl 8)
            i_5_ += i_6_
            i_7_ += i_4_
            i_5_ = i_5_ xor (i_6_ ushr 16)
            i_8_ += i_5_
            i_6_ += i_7_
            i_6_ = i_6_ xor (i_7_ shl 10)
            i_7_ += i_8_
            i_9_ += i_6_
            i_7_ = i_7_ xor (i_8_ ushr 4)
            i_2_ += i_7_
            i_8_ += i_9_
            i_8_ = i_8_ xor (i_9_ shl 8)
            i_3_ += i_8_
            i_9_ += i_2_
            i_9_ = i_9_ xor (i_2_ ushr 9)
            i_2_ += i_3_
            i_4_ += i_9_
        }
        var i_11_ = 0
        while (i_11_ < 256) {
            i_4_ += anIntArray1289[i_11_ - -2]
            i_9_ += anIntArray1289[i_11_ + 7]
            i_5_ += anIntArray1289[3 + i_11_]
            i_7_ += anIntArray1289[5 + i_11_]
            i_8_ += anIntArray1289[i_11_ - -6]
            i_3_ += anIntArray1289[1 + i_11_]
            i_6_ += anIntArray1289[4 + i_11_]
            i_2_ += anIntArray1289[i_11_]
            i_2_ = i_2_ xor (i_3_ shl 11)
            i_3_ += i_4_
            i_5_ += i_2_
            i_3_ = i_3_ xor (i_4_ ushr 2)
            i_4_ += i_5_
            i_6_ += i_3_
            i_4_ = i_4_ xor (i_5_ shl 8)
            i_7_ += i_4_
            i_5_ += i_6_
            i_5_ = i_5_ xor (i_6_ ushr 16)
            i_8_ += i_5_
            i_6_ += i_7_
            i_6_ = i_6_ xor (i_7_ shl 10)
            i_9_ += i_6_
            i_7_ += i_8_
            i_7_ = i_7_ xor (i_8_ ushr 4)
            i_8_ += i_9_
            i_2_ += i_7_
            i_8_ = i_8_ xor (i_9_ shl 8)
            i_9_ += i_2_
            i_3_ += i_8_
            i_9_ = i_9_ xor (i_2_ ushr 9)
            i_4_ += i_9_
            i_2_ += i_3_
            anIntArray1296!![i_11_] = i_2_
            anIntArray1296!![1 + i_11_] = i_3_
            anIntArray1296!![i_11_ + 2] = i_4_
            anIntArray1296!![i_11_ + 3] = i_5_
            anIntArray1296!![i_11_ + 4] = i_6_
            anIntArray1296!![i_11_ - -5] = i_7_
            anIntArray1296!![i_11_ - -6] = i_8_
            anIntArray1296!![i_11_ - -7] = i_9_
            i_11_ += 8
        }
        var i_12_ = 0
        if (i > -72) anIntArray1296 = null
        while ( /**/i_12_ < 256) {
            i_4_ += anIntArray1296!![2 + i_12_]
            i_5_ += anIntArray1296!![i_12_ - -3]
            i_9_ += anIntArray1296!![i_12_ + 7]
            i_7_ += anIntArray1296!![i_12_ - -5]
            i_3_ += anIntArray1296!![i_12_ + 1]
            i_8_ += anIntArray1296!![6 + i_12_]
            i_2_ += anIntArray1296!![i_12_]
            i_6_ += anIntArray1296!![i_12_ - -4]
            i_2_ = i_2_ xor (i_3_ shl 11)
            i_5_ += i_2_
            i_3_ += i_4_
            i_3_ = i_3_ xor (i_4_ ushr 2)
            i_6_ += i_3_
            i_4_ += i_5_
            i_4_ = i_4_ xor (i_5_ shl 8)
            i_7_ += i_4_
            i_5_ += i_6_
            i_5_ = i_5_ xor (i_6_ ushr 16)
            i_8_ += i_5_
            i_6_ += i_7_
            i_6_ = i_6_ xor (i_7_ shl 10)
            i_7_ += i_8_
            i_9_ += i_6_
            i_7_ = i_7_ xor (i_8_ ushr 4)
            i_8_ += i_9_
            i_2_ += i_7_
            i_8_ = i_8_ xor (i_9_ shl 8)
            i_3_ += i_8_
            i_9_ += i_2_
            i_9_ = i_9_ xor (i_2_ ushr 9)
            i_4_ += i_9_
            i_2_ += i_3_
            anIntArray1296!![i_12_] = i_2_
            anIntArray1296!![i_12_ + 1] = i_3_
            anIntArray1296!![2 + i_12_] = i_4_
            anIntArray1296!![3 + i_12_] = i_5_
            anIntArray1296!![4 + i_12_] = i_6_
            anIntArray1296!![i_12_ - -5] = i_7_
            anIntArray1296!![i_12_ + 6] = i_8_
            anIntArray1296!![7 + i_12_] = i_9_
            i_12_ += 8
        }
        method779(false)
        anInt1292 = 256
    }

    fun method778(i: Byte): Int {
        anInt1300++
        if (anInt1292 == 0) {
            method779(false)
            anInt1292 = 256
        }
        if (i <= 12) return 116
        return anIntArray1289[anInt1292 - 1]
    }

    private fun method779(bool: Boolean) {
        anInt1301++
        anInt1291 += ++anInt1294
        for (i in 0..255) {
            val i_13_ = anIntArray1296!![i]
            if ((i and 0x2) != 0) {
                if ((0x1 and i) == 0) anInt1293 = anInt1293 xor (anInt1293 shl 2)
                else anInt1293 = anInt1293 xor (anInt1293 ushr 16)
            } else if ((0x1 and i) != 0) anInt1293 = anInt1293 xor (anInt1293 ushr 6)
            else anInt1293 = anInt1293 xor (anInt1293 shl 13)
            anInt1293 += anIntArray1296!![0xff and 128 + i]
            val i_14_: Int
            i_14_ = (anIntArray1296!![Class139.method1166(255, i_13_ shr 2)] - (-anInt1293 - anInt1291))
            anIntArray1296!![i] = i_14_
            anInt1291 = i_13_ + anIntArray1296!![(Class139.method1166(261268, i_14_) shr 278777480 shr 242087490)]
            anIntArray1289[i] = anInt1291
        }
        if (bool != false) method776(-33, -56, 52)
    }

    fun method781(i: Byte): Int {
        if (anInt1292 == 0) {
            method779(false)
            anInt1292 = 256
        }
        anInt1295++
        if (i >= -47) method779(false)
        return anIntArray1289[--anInt1292]
    }

    companion object {
        @JvmField
        var anInt1290: Int = 0
        @JvmField
        var anInt1295: Int = 0
        @JvmField
        var anInt1297: Int = 0
        @JvmField
        var aClass273_1298: Class273? = Class273("", 16)
        @JvmField
        var anInt1299: Int = 0
        @JvmField
        var anInt1300: Int = 0
        @JvmField
        var anInt1301: Int = 0
        @JvmField
        var anInt1302: Int = 0
        @JvmField
        var anIntArray1303: IntArray? = null

        fun method776(i: Int, i_0_: Int, i_1_: Int): Boolean {
            anInt1297++
            if (i_1_ != 65536) method780(-106, -24, 57)
            val bool = (if ((i and 0x37) != 0) Class126.method1113(i_0_, i, -7) else method3200(i_0_, i, 111.toByte()))
            return bool or (Class274.method2058(i_0_, i, i_1_ xor 0x1003d) or ((0x10000 and i_0_) != 0))
        }

        fun method780(i: Int, i_15_: Int, i_16_: Int): Boolean {
            if (i_15_ != 0) return true
            anInt1299++
            return (0x400 and i_16_) != 0
        }

        @JvmStatic
        fun method782(i: Int) {
            anIntArray1303 = null
            if (i != 1) anInt1290 = 114
            aClass273_1298 = null
        }
    }
}
