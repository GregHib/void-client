import Class348_Sub31.Companion.method3013
import Class5_Sub3.Companion.method200
import java.awt.Point

class Class33 internal constructor(class230: Class230?, i: Int, class45: Class45?) {
    private val aClass45_458: Class45?
    private val aClass60_460 = Class60(128)
    fun method337(bool: Boolean, i: Int): Class117 {
        anInt457++
        var class117: Class117?
        synchronized(aClass60_460) {
            class117 = aClass60_460.method583(i.toLong(), 111) as Class117?
        }
        if (class117 != null) return class117
        val `is` = aClass45_458!!.method410(-1860, method200(-107, i), method3013(i, bool))
        class117 = Class117()
        if (`is` != null) class117.method1069(0, Class348_Sub49(`is`))
        synchronized(aClass60_460) {
            aClass60_460.method582(class117, i.toLong(), (-102).toByte())
        }
        return class117
    }

    init {
        do {
            try {
                aClass45_458 = class45
                if (aClass45_458 == null) break
                val i_6_ = -1 + aClass45_458.method414(-1)
                aClass45_458.method407(0, i_6_)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("iba.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    companion object {
        @JvmField
        var anInt456: Int = 0
        @JvmField
        var anInt457: Int = 0
        @JvmField
        var anInt459: Int = 0
        @JvmField
        var anInt461: Int = 0

        @JvmStatic
        fun method338(i: Int, i_0_: Int) {
            var i_0_ = i_0_
            if (i == Class316.aClass348_Sub51_3959!!.aClass239_Sub22_7253!!.method1815(-32350)) i_0_ = -1
            anInt456++
            if (i_0_ != Class337.anInt4179) {
                if (i_0_ != -1) {
                    val class222 = Class239.aClass166_3147!!.method1287((-104).toByte(), i_0_)
                    val class207 = class222.method1610(71.toByte())
                    if (class207 == null) i_0_ = -1
                    else {
                        Class348_Sub23_Sub1.aClass297_8992!!.method2238(class207.method1522(), class207.method1516(), 17, Point(class222.anInt2883, class222.anInt2890), Class305.aCanvas3869, class207.method1510())
                        Class337.anInt4179 = i_0_
                    }
                }
                if (i_0_ == -1 && Class337.anInt4179 != -1) {
                    Class348_Sub23_Sub1.aClass297_8992!!.method2238(-1, null, i + 17, Point(), (Class305.aCanvas3869), -1)
                    Class337.anInt4179 = -1
                }
            }
        }

        fun method339(i: Int, i_1_: Int, `is`: ByteArray, i_2_: Int, i_3_: Int, i_4_: Int) {
            var i = i
            var i_2_ = i_2_
            anInt461++
            if (i_4_ > i_1_) {
                i += i_1_
                i_2_ = -i_1_ + i_4_ shr 2
                while (--i_2_ >= 0) {
                    `is`[i++] = 1.toByte()
                    `is`[i++] = 1.toByte()
                    `is`[i++] = 1.toByte()
                    `is`[i++] = 1.toByte()
                }
                if (i_3_ == 1354705384) {
                    i_2_ = 0x3 and i_4_ - i_1_
                    while (--i_2_ >= 0) `is`[i++] = 1.toByte()
                }
            }
        }

        @JvmStatic
        fun method340(i: Int, i_5_: Byte): Int {
            var i = i
            anInt459++
            i = --i or (i ushr 1)
            i = i or (i ushr 2)
            i = i or (i ushr 4)
            if (i_5_.toInt() != 108) return 34
            i = i or (i ushr 8)
            i = i or (i ushr 16)
            return 1 + i
        }
    }
}
