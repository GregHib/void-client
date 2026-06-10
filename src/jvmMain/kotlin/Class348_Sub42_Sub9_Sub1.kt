/* Class348_Sub42_Sub9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
class Class348_Sub42_Sub9_Sub1 internal constructor(interface14: Interface14?, `object`: Any?, i: Int) : Class348_Sub42_Sub9(interface14, i) {
    private val anObject10440: Any?
    override fun method3205(i: Int): Any? {
        if (i != 65536) method3205(-30)
        anInt10441++
        return anObject10440
    }

    override fun method3206(i: Byte): Boolean {
        val i_0_ = -50 / ((-63 - i) / 61)
        anInt10445++
        return false
    }

    init {
        try {
            anObject10440 = `object`
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ct.<init>(" + (if (interface14 != null) "{...}" else "null") + ',' + (if (`object` != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt10439: Int = 0
        @JvmField
        var anInt10441: Int = 0
        @JvmField
        var aClass356_10442: Class356?
        @JvmField
        var anInt10443: Int = 2
        @JvmField
        var anInt10444: Int = 0
        @JvmField
        var anInt10445: Int = 0

        @JvmStatic
        fun method3207(i: Byte) {
            val i_1_ = -126 % ((i - -27) / 61)
            aClass356_10442 = null
        }

        @JvmStatic
        fun method3208(class318_sub1_sub3_sub3: Class318_Sub1_Sub3_Sub3, i: Int, i_2_: Int) {
            anInt10439++
            if (class318_sub1_sub3_sub3.anIntArray10236 != null) {
                val i_3_ = (class318_sub1_sub3_sub3.anIntArray10236!![1 + i])
                if (i_3_ != class318_sub1_sub3_sub3.anInt10286) {
                    class318_sub1_sub3_sub3.anInt10322 = (class318_sub1_sub3_sub3.anInt10319)
                    class318_sub1_sub3_sub3.anInt10286 = i_3_
                    class318_sub1_sub3_sub3.anInt10244 = 1
                    class318_sub1_sub3_sub3.anInt10232 = 0
                    class318_sub1_sub3_sub3.anInt10294 = 0
                    class318_sub1_sub3_sub3.anInt10267 = 0
                    if ((class318_sub1_sub3_sub3.anInt10286) != -1) Class287.method2178(class318_sub1_sub3_sub3, class318_sub1_sub3_sub3.anInt10267, (Class10.aClass87_191!!.method835(class318_sub1_sub3_sub3.anInt10286, 7)), -83)
                }
            }
            if (i_2_ > -4) Companion.method3207((-83).toByte())
        }

        init {
            aClass356_10442 = Class356(8)
        }
    }
}
