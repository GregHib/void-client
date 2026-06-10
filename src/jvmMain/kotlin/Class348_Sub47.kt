import Class156.Companion.method1241
import Class239_Sub1.Companion.method1722
import Class348_Sub17.Companion.method2929
import Class348_Sub22.Companion.method2959
import Class367_Sub10.Companion.method3553
import Class62.method599
import aa_Sub3.Companion.method166

class Class348_Sub47 : Class348() {
    var aClass348_Sub49_Sub2_7116: Class348_Sub49_Sub2? = null
    var aClass351_7118: Class351? = null
    var anInt7119: Int = 0
    var anInt7122: Int = 0
    fun method3326(i: Byte) {
        anInt7117++
        if (Class176.aClass348_Sub47Array2334!!.size > Class239_Sub13.anInt5980 && i.toInt() == -45) Class176.aClass348_Sub47Array2334!![Class239_Sub13.anInt5980++] = this
    }

    companion object {
        var anInt7117: Int = 0
        var anInt7120: Int = 0
        var anInt7121: Int = 0
        var anInt7123: Int = 0
        var aClass114_7124: Class114? = Class114(62, 4)
        @JvmField
        var anInt7125: Int = 1406

        @JvmStatic
        fun method3323(i: Int) {
            val i_0_ = -14 / ((73 - i) / 51)
            aClass114_7124 = null
        }

        fun method3324(var_ha: ha?, i: Byte, l: Long) {
            do {
                try {
                    Class122.anInt1803 = 0
                    Class292.anInt4797 = Class313.anInt3936
                    Class318_Sub1_Sub5.anInt8780 = 0
                    anInt7120++
                    Class313.anInt3936 = 0
                    val l_1_ = method599(-53)
                    var class318_sub10 = Class152.aClass243_2077!!.method1872(8) as Class318_Sub10?
                    if (i > 40) {
                        while ( /**/class318_sub10 != null) {
                            if (class318_sub10.method2535(var_ha, l)) Class318_Sub1_Sub5.anInt8780++
                            class318_sub10 = Class152.aClass243_2077!!.method1878((-64).toByte()) as Class318_Sub10?
                        }
                        if (!Class348_Sub16_Sub2.aBoolean8874 || l % 100L != 0L) break
                        println("Particle system count: " + Class152.aClass243_2077!!.method1874(0) + ", running: " + Class318_Sub1_Sub5.anInt8780)
                        println("Emitters: " + Class122.anInt1803 + " Particles: " + Class313.anInt3936 + ". Time taken: " + (-l_1_ + method599(-112)) + "ms")
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw method2929(runtimeexception, ("wm.A(" + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + l + ')'))
                }
                break
            } while (false)
        }

        fun method3325(i: Int, i_2_: Int, bool: Boolean): Boolean {
            if (bool != true) return false
            anInt7121++
            return ((((0x2000 and i) != 0) or method1241(i_2_, i, -118) or method1722(i, i_2_, 94.toByte())) and method166(105.toByte(), i_2_, i))
        }

        @JvmStatic
        fun method3327(i: Int) {
            if (i == 1406) {
                if (Class348_Sub8.aHa6654!!.method3694()) {
                    Class348_Sub8.aHa6654!!.method3701(Class305.aCanvas3869)
                    method2959(-1)
                    if (!Class59_Sub1.aBoolean5300) {
                        val dimension = Class305.aCanvas3869!!.getSize()
                        Class348_Sub8.aHa6654!!.method3643(Class305.aCanvas3869, dimension.width, dimension.height)
                    } else Class124.method1108((-99).toByte(), Class305.aCanvas3869!!)
                    Class348_Sub8.aHa6654!!.method3677(Class305.aCanvas3869)
                } else method3553(false, 100.toByte(), Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350))
                anInt7123++
                Class354.method3466(i + -1347)
                Class348_Sub16_Sub2.aBoolean8870 = true
            }
        }
    }
}
