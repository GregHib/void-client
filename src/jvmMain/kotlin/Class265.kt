import kotlin.math.max

/* Class265 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class265 internal constructor(class45: Class45?, class120: Class120?) : Interface1 {
    private val aClass120_4687: Class120?
    private var aClass105_4688: Class105? = null
    private val aClass45_4694: Class45?
    override fun method7(i: Int) {
        aClass105_4688 = Class369_Sub3_Sub1.method3577((aClass120_4687!!.anInt4912), 116.toByte(), aClass45_4694!!)
        if (i != 10286) aBooleanArrayArray4693 = null
        anInt4695++
    }

    override fun method9(i: Byte, bool: Boolean) {
        anInt4696++
        if (bool) {
            val i_0_ = (max(Class321.anInt4017, Class92.anInt1524))
            val i_1_ = (max(Class348_Sub42_Sub8_Sub2.anInt10432, ha_Sub2.anInt7666))
            val i_2_ = aClass105_4688!!.method966()
            val i_3_ = aClass105_4688!!.method980()
            var i_4_ = 0
            var i_5_ = i_0_
            var i_6_ = i_0_ * i_3_ / i_2_
            var i_7_ = (i_1_ + -i_6_) / 2
            if (i_1_ < i_6_) {
                i_6_ = i_1_
                i_5_ = i_1_ * i_2_ / i_3_
                i_7_ = 0
                i_4_ = (i_0_ - i_5_) / 2
            }
            aClass105_4688!!.method973(i_4_, i_7_, i_5_, i_6_)
        }
    }

    init {
        try {
            aClass45_4694 = class45
            aClass120_4687 = class120
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("uk.<init>(" + (if (class45 != null) "{...}" else "null") + ',' + (if (class120 != null) "{...}" else "null") + ')'))
        }
    }

    override fun method8(i: Byte): Boolean {
        val i_8_ = -105 % ((25 - i) / 52)
        anInt4690++
        return aClass45_4694!!.method421(false, aClass120_4687!!.anInt4912)
    }

    companion object {
        var aClass74_4689: Class74? = Class74(2, 4)
        var anInt4690: Int = 0
        var anInt4691: Int = 0
        @JvmField
        var anIntArray4692: IntArray? = null
        var aBooleanArrayArray4693: Array<BooleanArray?>? =
            arrayOf<BooleanArray?>(BooleanArray(4), BooleanArray(4), booleanArrayOf(false, false, true, false), booleanArrayOf(false, false, true, false), booleanArrayOf(false, false, true, false), booleanArrayOf(false, false, true, false), booleanArrayOf(true, false, true, false), booleanArrayOf(true, false, false, true), booleanArrayOf(true, false, false, true), BooleanArray(4), BooleanArray(4), BooleanArray(4), BooleanArray(4))
        var anInt4695: Int = 0
        var anInt4696: Int = 0

        fun method2022(class348_sub49: Class348_Sub49, i: Int): Class50_Sub1? {
            if (i != 0) return null
            anInt4691++
            return Class50_Sub1(class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readShort(i + 13638), class348_sub49.readShort(13638), class348_sub49.readMedium(-1), class348_sub49.readMedium(-1), class348_sub49.readUnsignedByte(255))
        }

        @JvmStatic
        fun method2023(i: Byte) {
            if (i > -13) aClass74_4689 = null
            aClass74_4689 = null
            anIntArray4692 = null
            aBooleanArrayArray4693 = null
        }
    }
}
