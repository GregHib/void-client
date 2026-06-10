/* Class37 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class37 {
    @JvmField
    var anInt490: Int = 0
    @JvmField
    var anInt491: Int = 0
    @JvmField
    var anInt492: Int = 0
    @JvmField
    var anInt493: Int = 0
    @JvmField
    var anInt494: Int = 0
    @JvmField
    var anInt495: Int = 0
    @JvmField
    var anInt496: Int = 0

    fun method356(i: Int, i_0_: Int): String? {
        anInt494++
        var string = i_0_.toString()
        if (i >= -109) return null
        var i_1_ = -3 + string.length
        while (i_1_ > 0) {
            string = string.substring(0, i_1_) + "," + string.substring(i_1_)
            i_1_ -= 3
        }
        if (string.length > 9) return (" <col=00ff80>" + string.substring(0, string.length + -8) + Class274.aClass274_3516!!.method2063(Class348_Sub33.anInt6967, 544) + " (" + string + ")</col>")
        if (string.length > 6) return (" <col=ffffff>" + string.substring(0, -4 + string.length) + Class274.aClass274_3518!!.method2063(Class348_Sub33.anInt6967, 544) + " (" + string + ")</col>")
        return " <col=ffff00>" + string + "</col>"
    }

    @JvmStatic
    @Synchronized
    fun method357(i: Int, `is`: ByteArray) {
        anInt491++
        if (`is`.size == 100 && Class348_Sub40_Sub31.anInt9412 < 1000) Class24.aByteArrayArray358!![Class348_Sub40_Sub31.anInt9412++] = `is`
        else {
            if (i != 0) method359(-119, -101)
            if (`is`.size == 5000 && Class348_Sub40_Sub21.anInt9280 < 250) Class133.aByteArrayArray1918!![Class348_Sub40_Sub21.anInt9280++] = `is`
            else if (`is`.size == 30000 && Class348_Sub31.anInt6913 < 50) Class285_Sub2.aByteArrayArray8505!![Class348_Sub31.anInt6913++] = `is`
            else if (Class348_Sub40_Sub6.aByteArrayArrayArray9134 != null) {
                var i_2_ = 0
                while (Class59_Sub2_Sub2.anIntArray8684!!.size > i_2_) {
                    if ((`is`.size == Class59_Sub2_Sub2.anIntArray8684!![i_2_]) && (Class348_Sub40_Sub6.aByteArrayArrayArray9134!![i_2_])!!.size > Class190.anIntArray2552!![i_2_]) {
                        Class348_Sub40_Sub6.aByteArrayArrayArray9134!![i_2_]!![Class190.anIntArray2552!![i_2_]++] = `is`
                        break
                    }
                    i_2_++
                }
            }
        }
    }

    fun method358(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) {
        if (i_8_ != -29494) anInt496 = 32
        if (Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7272!!.method1838(-32350) != 0 && i != 0 && Class147.anInt2021 < 50 && i_7_ != -1) Class258_Sub2.aClass10Array8531!![Class147.anInt2021++] = Class10(1.toByte(), i_7_, i, i_4_, i_5_, i_3_, i_6_, null)
        anInt490++
    }

    @JvmStatic
    @Synchronized
    fun method359(i: Int, i_9_: Int): ByteArray? {
        anInt493++
        if (i == 100 && Class348_Sub40_Sub31.anInt9412 > 0) {
            val `is` = Class24.aByteArrayArray358!![--Class348_Sub40_Sub31.anInt9412]
            Class24.aByteArrayArray358!![Class348_Sub40_Sub31.anInt9412] = null
            return `is`
        }
        if (i == 5000 && Class348_Sub40_Sub21.anInt9280 > 0) {
            val `is` = (Class133.aByteArrayArray1918!![--Class348_Sub40_Sub21.anInt9280])
            Class133.aByteArrayArray1918!![Class348_Sub40_Sub21.anInt9280] = null
            return `is`
        }
        if (i_9_ != -1) method359(-88, -45)
        if (i == 30000 && Class348_Sub31.anInt6913 > 0) {
            val `is` = (Class285_Sub2.aByteArrayArray8505!![--Class348_Sub31.anInt6913])
            Class285_Sub2.aByteArrayArray8505!![Class348_Sub31.anInt6913] = null
            return `is`
        }
        if (Class348_Sub40_Sub6.aByteArrayArrayArray9134 != null) {
            var i_10_ = 0
            while (Class59_Sub2_Sub2.anIntArray8684!!.size > i_10_) {
                if ((i == Class59_Sub2_Sub2.anIntArray8684!![i_10_]) && Class190.anIntArray2552!![i_10_] > 0) {
                    val `is` = (Class348_Sub40_Sub6.aByteArrayArrayArray9134!![i_10_]!![--Class190.anIntArray2552!![i_10_]])
                    Class348_Sub40_Sub6.aByteArrayArrayArray9134!![i_10_]!![Class190.anIntArray2552!![i_10_]] = null
                    return `is`
                }
                i_10_++
            }
        }
        return ByteArray(i)
    }
}
