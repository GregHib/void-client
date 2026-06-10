import Class16.method260
import java.io.File

class Class166 internal constructor(class230: Class230?, i: Int, class45: Class45?, class45_9_: Class45?) {
    @JvmField
    var aClass45_2180: Class45? = null
    private val aClass60_2185 = Class60(64)
    private val aClass45_2188: Class45?
    @JvmField
    var aClass60_2190: Class60? = Class60(2)

    fun method1283(i: Int) {
        synchronized(aClass60_2185) {
            aClass60_2185.method587(-76)
        }
        anInt2178++
        synchronized(this.aClass60_2190!!) {
            this.aClass60_2190!!.method587(-110)
        }
        if (i != 1) method1286(null, -124, null)
    }

    fun method1285(i: Int, i_0_: Int) {
        anInt2189++
        synchronized(aClass60_2185) {
            aClass60_2185.method578(2, i)
        }
        synchronized(this.aClass60_2190!!) {
            if (i_0_ != 8) this.aClass45_2180 = null
            this.aClass60_2190!!.method578(i_0_ + -6, i)
        }
    }

    fun method1287(i: Byte, i_1_: Int): Class222 {
        anInt2182++
        var class222: Class222?
        synchronized(aClass60_2185) {
            class222 = aClass60_2185.method583(i_1_.toLong(), i.toInt() xor 0x1d.inv()) as? Class222?
        }
        if (class222 != null) return class222
        if (i.toInt() != -104) this.aClass60_2190 = null
        val `is`: ByteArray?
        synchronized(aClass45_2188!!) {
            `is` = aClass45_2188.method410(-1860, 33, i_1_)
        }
        class222 = Class222()
        class222.aClass166_2886 = this
        if (`is` != null) class222.method1611(Class348_Sub49(`is`), false)
        synchronized(aClass60_2185) {
            aClass60_2185.method582(class222, i_1_.toLong(), (-116).toByte())
        }
        return class222
    }

    fun method1290(i: Int) {
        anInt2184++
        synchronized(aClass60_2185) {
            aClass60_2185.method590(0)
        }
        synchronized(this.aClass60_2190!!) {
            this.aClass60_2190!!.method590(0)
            if (i != -8) aClass114_2183 = null
        }
    }

    init {
        try {
            aClass45_2188 = class45
            this.aClass45_2180 = class45_9_
            aClass45_2188!!.method407(0, 33)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("pg.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ',' + (if (class45_9_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt2178: Int = 0
        var anInt2179: Int = 0
        var anInt2181: Int = 0
        var anInt2182: Int = 0
        var aClass114_2183: Class114? = Class114(0, -1)
        var anInt2184: Int = 0
        var anInt2186: Int = 0
        @JvmField
        var aClass262_2187: Class262? = Class262()
        var anInt2189: Int = 0
        @JvmStatic
        fun method1284(i: Int) {
            aClass114_2183 = null
            if (i == -21165) aClass262_2187 = null
        }

        fun method1286(file: File?, i: Int, string: String?) {
            do {
                try {
                    anInt2181++
                    Class275.aHashtable3548!!.put(string, file)
                    if (i == 64) break
                    aClass114_2183 = null
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(runtimeexception, ("pg.F(" + (if (file != null) "{...}" else "null") + ',' + i + ',' + (if (string != null) "{...}" else "null") + ')'))
                }
                break
            } while (false)
        }

        fun method1288(i: Int, i_2_: Int) {
            anInt2186++
            var class348 = Class226.aClass356_2959!!.method3484(0)
            while (class348 != null) {
                if ((class348.aLong4291 shr 48 and 0xffffL) == i_2_.toLong()) class348.method2715(119.toByte())
                class348 = Class226.aClass356_2959!!.method3482(0)
            }
        }

        fun method1289(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
            anInt2179++
            var i_7_ = Class26.anInt385
            if (i_5_ != 8) method1284(-59)
            var i_8_ = Class93.anInt1534
            if (Class59_Sub1.aBoolean5300) {
                i_7_ += s_Sub3.method4008((-126).toByte())
                i_8_ += method260(false)
            }
            if (Class239_Sub20.anInt6048 == 1) {
                val class105 = (Class348_Sub40_Sub37.aClass105Array9467!![Class348.anInt4292 / 100])
                class105!!.method974(i_7_ - 8, i_8_ + -8)
                Class338.method2663(-5590, -8 + i_7_, -8 + (i_7_ - -class105.method966()), -8 + i_8_, class105.method980() + -8 + i_8_)
            }
            if (Class239_Sub20.anInt6048 == 2) {
                val class105 = (Class348_Sub40_Sub37.aClass105Array9467!![Class348.anInt4292 / 100 + 4])
                class105!!.method974(i_7_ + -8, -8 + i_8_)
                Class338.method2663(-5590, i_7_ - 8, class105.method966() + i_7_ + -8, -8 + i_8_, class105.method980() + -8 + i_8_)
            }
            Class289.method2192(80.toByte())
        }
    }
}
