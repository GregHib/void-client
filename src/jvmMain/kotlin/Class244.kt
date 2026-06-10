/* Class244 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class244 internal constructor(class45: Class45?, class45_12_: Class45?, class45_13_: Class45?) : d {
    private val aClass12Array4611: Array<Class12?>
    private val aClass45_4619: Class45?
    private val aClass308_4622 = Class308(256)
    private val aClass45_4624: Class45?
    private val anInt4625: Int
    override fun method6(i: Int, i_0_: Int, f: Float, i_1_: Int, bool: Boolean, i_2_: Int): IntArray {
        if (i != -21540) method3(-46, 6)
        anInt4617++
        return method1881(i_1_, false)!!.method3183(this, i_2_, i_0_, (aClass12Array4611[i_1_]!!.aBoolean207), f.toDouble(), aClass45_4624, 11.toByte())
    }

    private fun method1881(i: Int, bool: Boolean): Class348_Sub42_Sub5? {
        anInt4620++
        val class348_sub42 = aClass308_4622.method2302(i.toLong(), (-34).toByte())
        if (class348_sub42 != null) return class348_sub42 as Class348_Sub42_Sub5
        val `is` = aClass45_4619!!.method415(73.toByte(), i)
        if (`is` == null) return null
        if (bool != false) method1(-58, 1.9039171f, false, -106, -22, -18)
        val class348_sub42_sub5 = Class348_Sub42_Sub5(Class348_Sub49(`is`))
        aClass308_4622.method2305(i.toLong(), class348_sub42_sub5, -1)
        return class348_sub42_sub5
    }

    override fun method3(i: Int, i_3_: Int): Class12? {
        anInt4621++
        if (i_3_ != -6662) return null
        return aClass12Array4611[i]
    }

    override fun method5(bool: Boolean, i: Int, f: Float, i_4_: Int, i_5_: Int, i_6_: Int): IntArray {
        val i_7_ = 41 / ((i_6_ - -69) / 48)
        anInt4614++
        return method1881(i, false)!!.method3185(i_4_, this, 0, aClass12Array4611[i]!!.aBoolean207, f.toDouble(), bool, aClass45_4624, i_5_)
    }

    override fun method4(i: Int, i_8_: Int): Boolean {
        anInt4616++
        val class348_sub42_sub5 = method1881(i_8_, false)
        if (i != -7953) method4(56, -109)
        return class348_sub42_sub5 != null && class348_sub42_sub5.method3184(this, aClass45_4624, -85)
    }

    override fun method1(i: Int, f: Float, bool: Boolean, i_9_: Int, i_10_: Int, i_11_: Int): FloatArray? {
        if (i_9_ != -30824) return null
        anInt4612++
        return method1881(i_11_, false)!!.method3186(i, this, (aClass12Array4611[i_11_]!!.aBoolean207), i_10_, aClass45_4624, -20)
    }

    override fun method2(bool: Boolean): Int {
        anInt4618++
        if (bool != true) aLong4615 = -52L
        return anInt4625
    }

    init {
        try {
            aClass45_4619 = class45_12_
            aClass45_4624 = class45_13_
            val class348_sub49 = Class348_Sub49(class45!!.method410(-1860, 0, 0))
            anInt4625 = class348_sub49.readUnsignedShort(842397944)
            aClass12Array4611 = arrayOfNulls<Class12>(anInt4625)
            run {
                var i = 0
                while (anInt4625 > i) {
                    if (class348_sub49.readUnsignedByte(255) == 1) aClass12Array4611[i] = Class12()
                    i++
                }
            }
            for (i in 0..<anInt4625) {
                if (aClass12Array4611[i] != null) aClass12Array4611[i]!!.aBoolean209 = class348_sub49.readUnsignedByte(255) == 0
            }
            for (i in 0..<anInt4625) {
                if (aClass12Array4611[i] != null) aClass12Array4611[i]!!.aBoolean199 = class348_sub49.readUnsignedByte(255) == 1
            }
            run {
                var i = 0
                while (anInt4625 > i) {
                    if (aClass12Array4611[i] != null) aClass12Array4611[i]!!.aBoolean204 = class348_sub49.readUnsignedByte(255) == 1
                    i++
                }
            }
            for (i in 0..<anInt4625) {
                if (aClass12Array4611[i] != null) aClass12Array4611[i]!!.aByte216 = class348_sub49.readByte(-85)
            }
            for (i in 0..<anInt4625) {
                if (aClass12Array4611[i] != null) aClass12Array4611[i]!!.aByte201 = class348_sub49.readByte(-113)
            }
            for (i in 0..<anInt4625) {
                if (aClass12Array4611[i] != null) aClass12Array4611[i]!!.aByte213 = class348_sub49.readByte(-97)
            }
            for (i in 0..<anInt4625) {
                if (aClass12Array4611[i] != null) aClass12Array4611[i]!!.aByte202 = class348_sub49.readByte(-82)
            }
            for (i in 0..<anInt4625) {
                if (aClass12Array4611[i] != null) aClass12Array4611[i]!!.aShort208 = class348_sub49.readUnsignedShort(842397944).toShort()
            }
            run {
                var i = 0
                while (anInt4625 > i) {
                    if (aClass12Array4611[i] != null) aClass12Array4611[i]!!.aByte198 = class348_sub49.readByte(-86)
                    i++
                }
            }
            run {
                var i = 0
                while (anInt4625 > i) {
                    if (aClass12Array4611[i] != null) aClass12Array4611[i]!!.aByte211 = class348_sub49.readByte(-104)
                    i++
                }
            }
            run {
                var i = 0
                while (anInt4625 > i) {
                    if (aClass12Array4611[i] != null) aClass12Array4611[i]!!.aBoolean212 = class348_sub49.readUnsignedByte(255) == 1
                    i++
                }
            }
            run {
                var i = 0
                while (anInt4625 > i) {
                    if (aClass12Array4611[i] != null) aClass12Array4611[i]!!.aBoolean207 = class348_sub49.readUnsignedByte(255) == 1
                    i++
                }
            }
            for (i in 0..<anInt4625) {
                if (aClass12Array4611[i] != null) aClass12Array4611[i]!!.aByte205 = class348_sub49.readByte(-77)
            }
            for (i in 0..<anInt4625) {
                if (aClass12Array4611[i] != null) aClass12Array4611[i]!!.aBoolean217 = class348_sub49.readUnsignedByte(255) == 1
            }
            run {
                var i = 0
                while (anInt4625 > i) {
                    if (aClass12Array4611[i] != null) aClass12Array4611[i]!!.aBoolean215 = class348_sub49.readUnsignedByte(255) == 1
                    i++
                }
            }
            run {
                var i = 0
                while (anInt4625 > i) {
                    if (aClass12Array4611[i] != null) aClass12Array4611[i]!!.aBoolean218 = class348_sub49.readUnsignedByte(255) == 1
                    i++
                }
            }
            for (i in 0..<anInt4625) {
                if (aClass12Array4611[i] != null) aClass12Array4611[i]!!.anInt203 = class348_sub49.readUnsignedByte(255)
            }
            run {
                var i = 0
                while (anInt4625 > i) {
                    if (aClass12Array4611[i] != null) aClass12Array4611[i]!!.anInt206 = class348_sub49.readInt((-126).toByte())
                    i++
                }
            }
            var i = 0
            while (anInt4625 > i) {
                if (aClass12Array4611[i] != null) aClass12Array4611[i]!!.anInt200 = class348_sub49.readUnsignedByte(255)
                i++
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("tda.<init>(" + (if (class45 != null) "{...}" else "null") + ',' + (if (class45_12_ != null) "{...}" else "null") + ',' + (if (class45_13_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt4609: Int = -1
        @JvmField
        var anInt4610: Int
        var anInt4612: Int = 0
        var anInt4613: Int = 0
        var anInt4614: Int = 0
        @JvmField
        var aLong4615: Long
        var anInt4616: Int = 0
        var anInt4617: Int = 0
        var anInt4618: Int = 0
        var anInt4620: Int = 0
        var anInt4621: Int = 0
        var anIntArray4623: IntArray? = IntArray(8)
        var aFloat4626: Float = 0f

        @JvmStatic
        fun method1880(i: Int) {
            if (i >= -103) anInt4610 = -87
            anIntArray4623 = null
        }

        init {
            anInt4610 = 328
            aLong4615 = 0L
        }
    }
}
