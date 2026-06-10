import Class367_Sub2.Companion.method3536
import Class79.Companion.method802
import kotlin.concurrent.Volatile

/* Class203 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class203 {
    var anInt2672: Int = 0
    var anInt2673: Int = 0

    @JvmField
    @Volatile
    var aBoolean2674: Boolean = false
    var anInt2675: Int = 0

    fun method1477(i: Int, i_0_: Int) {
        anInt2672++
        val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i, 105.toByte(), i_0_) //14
        class348_sub42_sub15.method3251(-16058)
    }

    @JvmStatic
    fun method1478(bool: Boolean): Class348_Sub47? {
        anInt2673++
        val class348_sub47 = Class300.method2273((-103).toByte())
        if (bool != true) return null
        class348_sub47!!.anInt7122 = 0
        class348_sub47.aClass351_7118 = null
        class348_sub47.aClass348_Sub49_Sub2_7116 = Class348_Sub49_Sub2(5000)
        return class348_sub47
    }

    fun method1479(i: Int, i_1_: Byte, i_2_: Int, i_3_: Int) {
        anInt2675++
        val i_4_ = i_2_ - -za_Sub2.regionTileX
        val i_5_ = Class90.regionTileY + i
        if (Class147.aClass357ArrayArrayArray2029 != null && i_2_ >= 0 && i >= 0 && Class367_Sub4.anInt7319 > i_2_ && Class348_Sub40_Sub3.anInt9109 > i && (Class316.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(-32350) != 0 || i_3_ == (Class132.aPlayer_1907!!.plane).toInt())) {
            val l = (i_5_ shl 14 or (i_3_ shl 28) or i_4_).toLong()
            val class348_sub37 = (Class130.aClass356_1895!!.method3480(l, -6008) as? Class348_Sub37?)
            if (class348_sub37 == null) Class282.method2110(i_3_, i_2_, i)
            else {
                val class348_sub34 = class348_sub37.aClass262_6998.method1995(4) as? Class348_Sub34?
                if (class348_sub34 == null) Class282.method2110(i_3_, i_2_, i)
                else {
                    var class318_sub1_sub2_sub1 = (Class282.method2110(i_3_, i_2_, i) as? Class318_Sub1_Sub2_Sub1?)
                    if (class318_sub1_sub2_sub1 == null) class318_sub1_sub2_sub1 = (Class318_Sub1_Sub2_Sub1(i_2_ shl 9, aa_Sub1.aSArray5191!![i_3_]!!.method3982((-86).toByte(), i, i_2_), i shl 9, i_3_, i_3_))
                    else {
                        class318_sub1_sub2_sub1.anInt10180 = -1
                        class318_sub1_sub2_sub1.anInt10189 = class318_sub1_sub2_sub1.anInt10180
                    }
                    class318_sub1_sub2_sub1.anInt10181 = class348_sub34.anInt6973
                    if (i_1_ >= -112) aBoolean2674 = true
                    class318_sub1_sub2_sub1.anInt10185 = class348_sub34.anInt6971
                    while (true) {
                        val class348_sub34_6_ = (class348_sub37.aClass262_6998.method1990(55.toByte()) as? Class348_Sub34?)
                        if (class348_sub34_6_ == null) break
                        if (class348_sub34_6_.anInt6973 != class318_sub1_sub2_sub1.anInt10181) {
                            class318_sub1_sub2_sub1.anInt10189 = (class348_sub34_6_.anInt6973)
                            class318_sub1_sub2_sub1.anInt10190 = (class348_sub34_6_.anInt6971)
                            while (true) {
                                val class348_sub34_7_ = (class348_sub37.aClass262_6998.method1990(55.toByte()) as? Class348_Sub34?)
                                if (class348_sub34_7_ == null) break
                                if ((class318_sub1_sub2_sub1.anInt10181 != (class348_sub34_7_.anInt6973)) && ((class318_sub1_sub2_sub1.anInt10189) != (class348_sub34_7_.anInt6973))) {
                                    class318_sub1_sub2_sub1.anInt10180 = (class348_sub34_7_.anInt6973)
                                    class318_sub1_sub2_sub1.anInt10186 = (class348_sub34_7_.anInt6971)
                                }
                            }
                            break
                        }
                    }
                    val i_8_ = Class275.method2064(256 + (i_2_ shl 9), i_3_, 11219, 256 + (i shl 9))
                    class318_sub1_sub2_sub1.y = i shl 9
                    class318_sub1_sub2_sub1.plane = i_3_.toByte()
                    class318_sub1_sub2_sub1.anInt10196 = 0
                    class318_sub1_sub2_sub1.x = i_2_ shl 9
                    class318_sub1_sub2_sub1.anInt6382 = i_8_
                    class318_sub1_sub2_sub1.aByte6376 = i_3_.toByte()
                    if (method802(i, i_2_, true)) class318_sub1_sub2_sub1.aByte6376++
                    method3536(i_3_, i_2_, i, i_8_, class318_sub1_sub2_sub1)
                }
            }
        }
    }
}
