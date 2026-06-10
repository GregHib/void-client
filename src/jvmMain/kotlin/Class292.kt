import Class156.Companion.method1242
import Class272.Companion.method2049
import Class348_Sub40_Sub34.Companion.method3141
import Class348_Sub42_Sub8_Sub2.Companion.method3201
import java.io.IOException

/* Class292 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class292 internal constructor(private val aClass45_4804: Class45) : Interface7 {
    override fun method31(i: Int): Int {
        anInt4801++
        val i_0_ = 16 / ((i - -43) / 62)
        if (aClass45_4804.method401(125)) return 100
        return aClass45_4804.method398((-31).toByte())
    }

    override fun method32(i: Int): Class69? {
        if (i != -15004) return null
        anInt4800++
        return Class69.aClass69_1195
    }

    companion object {
        @JvmField
        var anInt4797: Int = 0
        var aClass114_4798: Class114?
        var anInt4799: Int = 0
        var anInt4800: Int = 0
        var anInt4801: Int = 0
        var anInt4802: Int = 0
        @JvmField
        var anInt4803: Int = -1
        var anInt4805: Int = 0

        fun method2201(i: Int): Int {
            anInt4805++
            synchronized(Class24.aClass60_355!!) {
                if (i != 2121) method2202(-113)
                return Class24.aClass60_355!!.method575(0)
            }
        }

        @JvmStatic
        fun method2202(i: Int) {
            aClass114_4798 = null
            if (i != -17902) anInt4803 = 78
        }

        @JvmStatic
        fun method2203(i: Byte): Boolean {
            val i_1_ = 11 % ((12 - i) / 53)
            anInt4802++
            try {
                return method3201(true)
            } catch (ioexception: IOException) {
                method2049(106)
                return true
            } catch (exception: Exception) {
                var string =
                    ("T2 - " + (if (Class348_Sub3.aClass114_6584 != null) Class348_Sub3.aClass114_6584!!.method1058(119.toByte()) else -1) + "," + (if (Class239.aClass114_3145 != null) Class239.aClass114_3145!!.method1058(119.toByte()) else -1) + "," + (if (Class348_Sub40_Sub36.aClass114_9456 == null) -1 else Class348_Sub40_Sub36.aClass114_9456!!.method1058(113.toByte())) + " - " + Class348_Sub40_Sub25.anInt9341 + "," + ((Class132.aPlayer_1907!!.anIntArray10320!![0]) + za_Sub2.regionTileX) + "," + (Class90.regionTileY - -(Class132.aPlayer_1907!!.anIntArray10317!![0])) + " - ")
                var i_2_ = 0
                while (Class348_Sub40_Sub25.anInt9341 > i_2_ && i_2_ < 50) {
                    string += (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![i_2_]).toString() + ","
                    i_2_++
                }
                method1242(string, exception, 15004)
                method3141(false, 11.toByte())
                return true
            }
        }

        init {
            aClass114_4798 = Class114(29, 7)
        }
    }
}
