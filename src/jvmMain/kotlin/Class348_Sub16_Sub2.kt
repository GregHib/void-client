import IOException_Sub1.Companion.method129

/* Class348_Sub16_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub16_Sub2 internal constructor(private val anInt8879: Int) : Class348_Sub16() {
    private var aClass262_8861: Class262? = Class262()
    private var anInt8883 = 0
    private var aBoolean8884 = false
    private var anInt8885 = 256
    private var aBoolean8886 = false
    private var anInt8887 = 256
    private var anInt8888 = 0

    fun method2827(i: Int, i_0_: Int) {
        anInt8885 = i_0_
        anInt8887 = i_0_
        if (i != -17708) method2830(-93)
        anInt8880++
    }

    @Synchronized
    private fun method2828(i: Int): Class348_Sub42_Sub4? {
        anInt8872++
        return aClass262_8861!!.method1995(i + 23080) as Class348_Sub42_Sub4?
    }

    override fun method2818(): Class348_Sub16? {
        anInt8877++
        return null
    }

    @Synchronized
    fun method2829(i: Int): Int {
        anInt8871++
        if (i >= -33) method2831(84.toByte())
        return anInt8888
    }

    @Synchronized
    private fun method2831(i: Byte) {
        anInt8875++
        val i_1_ = -13 / ((-66 - i) / 49)
        val class348_sub42_sub4 = method2828(-23076)
        if (class348_sub42_sub4 != null) {
            class348_sub42_sub4.method2715(71.toByte())
            anInt8888--
            anInt8883 = 0
            Class348_Sub40_Sub10.aClass308_9180!!.method2305(class348_sub42_sub4.method3182(90), class348_sub42_sub4, -1)
        }
    }

    @Synchronized
    override fun method2817(`is`: IntArray, i: Int, i_2_: Int) {
        var i = i
        anInt8863++
        if (!aBoolean8886) {
            if (method2828(-23076) == null) {
                if (aBoolean8884) {
                    this.method2715(23.toByte())
                    Class348_Sub40_Sub10.aClass308_9180!!.method2303(true)
                }
            } else {
                var i_3_ = i - -i_2_
                if (Class282.aBoolean3652) i_3_ = i_3_ shl 1
                val i_4_ = 0
                var i_5_ = 0
                if (anInt8879 == 2) i_5_ = 1
                while (i_3_ > i) {
                    val class348_sub42_sub4 = method2828(-23076)
                    if (class348_sub42_sub4 == null) break
                    val is_6_: Array<ShortArray?>
                    is_6_ = (class348_sub42_sub4.aShortArrayArray9518)
                    while (i < i_3_ && anInt8883 < is_6_[0]!!.size) {
                        if (Class282.aBoolean3652) {
                            `is`[i++] = anInt8885 * is_6_[i_4_]!![anInt8883]
                            `is`[i++] = is_6_[i_5_]!![anInt8883] * anInt8887
                        } else `is`[i++] += (is_6_[i_5_]!![anInt8883] * anInt8887 + anInt8885 * is_6_[i_4_]!![anInt8883])
                        anInt8883++
                    }
                    if (anInt8883 >= is_6_[0]!!.size) method2831((-126).toByte())
                }
            }
        }
    }

    @Synchronized
    fun method2833(i: Int, bool: Boolean) {
        if (i != 1) aDouble8869 = -2.8743710633758983
        aBoolean8886 = bool
        anInt8878++
    }

    @Synchronized
    fun method2835(class348_sub42_sub4: Class348_Sub42_Sub4, i: Int) {
        while ( /**/anInt8888 >= 100) {
            aClass262_8861!!.method1997(8)
            anInt8888--
        }
        if (i == 30700) {
            anInt8881++
            aClass262_8861!!.method1999(class348_sub42_sub4, -20180)
            anInt8888++
        }
    }

    override fun method2816(): Class348_Sub16? {
        anInt8867++
        return null
    }

    @Synchronized
    fun method2836(i: Int) {
        aBoolean8884 = true
        if (i != -1) aClass262_8861 = null
        anInt8865++
    }

    @Synchronized
    fun method2837(i: Int): Double {
        anInt8868++
        if (anInt8888 < 1) return -1.0
        if (i != -21987) method2818()
        val class348_sub42_sub4 = aClass262_8861!!.method1995(4) as Class348_Sub42_Sub4?
        if (class348_sub42_sub4 == null) return -1.0
        return (-((class348_sub42_sub4.aShortArrayArray9518[0])!!.size.toFloat() / Class22.anInt339.toFloat()).toDouble() + class348_sub42_sub4.aDouble9512)
    }

    fun method2838(i: Int, d: Double, i_14_: Int): Class348_Sub42_Sub4? {
        anInt8860++
        val l = (i or (anInt8879 shl 0)).toLong()
        var class348_sub42_sub4 = (Class348_Sub40_Sub10.aClass308_9180!!.method2302(l, (-31).toByte()) as Class348_Sub42_Sub4?)
        if (i_14_ != 1401320384) return null
        if (class348_sub42_sub4 == null) class348_sub42_sub4 = Class348_Sub42_Sub4(Array<ShortArray?>(anInt8879) { ShortArray(i) }, d)
        else {
            class348_sub42_sub4.aDouble9512 = d
            Class348_Sub40_Sub10.aClass308_9180!!.method2304(-121, l)
        }
        return class348_sub42_sub4
    }

    @Synchronized
    override fun method2819(i: Int) {
        var i = i
        anInt8864++
        if (!aBoolean8886) {
            while (true) {
                val class348_sub42_sub4 = method2828(-23076)
                if (class348_sub42_sub4 == null) {
                    if (aBoolean8884) {
                        this.method2715(108.toByte())
                        Class348_Sub40_Sub10.aClass308_9180!!.method2303(true)
                    }
                    break
                }
                if ((class348_sub42_sub4.aShortArrayArray9518[0])!!.size - anInt8883 > i) {
                    anInt8883 += i
                    break
                }
                i -= -anInt8883 + (class348_sub42_sub4.aShortArrayArray9518[0])!!.size
                method2831(111.toByte())
            }
        }
    }

    override fun method2821(): Int {
        anInt8873++
        return 1
    }

    companion object {
        @JvmField
        var anInt8860: Int = 0
        var anIntArray8862: IntArray?
        @JvmField
        var anInt8863: Int = 0
        @JvmField
        var anInt8864: Int = 0
        @JvmField
        var anInt8865: Int = 0
        @JvmField
        var aLong8866: Long
        @JvmField
        var anInt8867: Int = 0
        @JvmField
        var anInt8868: Int = 0
        @JvmField
        var aDouble8869: Double = 0.0
        @JvmField
        var aBoolean8870: Boolean = true
        @JvmField
        var anInt8871: Int = 0
        @JvmField
        var anInt8872: Int = 0
        @JvmField
        var anInt8873: Int = 0
        @JvmField
        var aBoolean8874: Boolean
        @JvmField
        var anInt8875: Int = 0
        @JvmField
        var anInt8876: Int = 0
        @JvmField
        var anInt8877: Int = 0
        @JvmField
        var anInt8878: Int = 0
        @JvmField
        var anInt8880: Int = 0
        @JvmField
        var anInt8881: Int = 0
        @JvmField
        var anInt8882: Int = 0
        @JvmStatic
        fun method2830(i: Int) {
            anIntArray8862 = null
        }

        @JvmStatic
        fun method2832(`is`: IntArray?, ls: LongArray?, i: Int) {
            try {
                method129(i, i + -107, ls, ls!!.size - 1, `is`)
                anInt8882++
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("iha.I(" + (if (`is` != null) "{...}" else "null") + ',' + (if (ls != null) "{...}" else "null") + ',' + i + ')'))
            }
        }

        @JvmStatic
        fun method2834(i: Byte, class348_sub49: Class348_Sub49): Class369 {
            anInt8876++
            val class221 = Class158.method1248(15)[class348_sub49.readUnsignedByte(255)]
            if (i > -113) aDouble8869 = -1.5911312034627048
            val class341 = Class62.method596(20000)[class348_sub49.readUnsignedByte(255)]
            val i_7_ = class348_sub49.readShort(13638)
            val i_8_ = class348_sub49.readShort(13638)
            val i_9_ = class348_sub49.readUnsignedShort(842397944)
            val i_10_ = class348_sub49.readUnsignedShort(842397944)
            val i_11_ = class348_sub49.readShort(13638)
            val i_12_ = class348_sub49.readInt((-126).toByte())
            val i_13_ = class348_sub49.readInt((-126).toByte())
            return Class369(class221, class341, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_)
        }

        init {
            anIntArray8862 = IntArray(4096)
            aBoolean8874 = false
            aLong8866 = 0L
        }
    }
}
