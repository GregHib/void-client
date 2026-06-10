import Class348_Sub1_Sub3.Companion.method2732

/* Class348_Sub40_Sub15 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub40_Sub15 internal constructor(i: Int) : Class348_Sub40(0, true) {
    private var anInt9220 = 4096
    override fun method3049(class348_sub49: Class348_Sub49, i: Int, i_0_: Int) {
        val i_1_ = i
        if (i_1_ == 0) anInt9220 = (class348_sub49.readUnsignedByte(255) shl 12) / 255
        if (i_0_ == 31015) anInt9217++
    }

    init {
        anInt9220 = i
    }

    override fun method3042(i: Int, i_8_: Int): IntArray? {
        anInt9221++
        val `is` = this.aClass191_7032!!.method1433(0, i)!!
        if (this.aClass191_7032!!.aBoolean2570) Class214.method1579(`is`, 0, Class348_Sub40_Sub6.Companion.anInt9139, anInt9220)
        if (i_8_ != 255) method3085(63)
        return `is`
    }

    constructor() : this(4096)

    companion object {
        @JvmField
        var aClass114_9216: Class114? = Class114(91, 2)
        @JvmField
        var anInt9217: Int = 0
        @JvmField
        var anInt9218: Int = 0
        @JvmField
        var anInt9219: Int = 0
        @JvmField
        var anInt9221: Int = 0

        fun method3084(i: Int, i_2_: Byte, i_3_: Int) {
            anInt9218++
            val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i_3_, 105.toByte(), 17)
            class348_sub42_sub15.method3246(-25490)
            class348_sub42_sub15.anInt9652 = i
            val i_4_ = 59 / ((i_2_ - -7) / 49)
        }

        @JvmStatic
        fun method3085(i: Int) {
            aClass114_9216 = null
            if (i != 0) aClass114_9216 = null
        }

        @JvmStatic
        fun method3086(i: Int, class348_sub16_sub3: Class348_Sub16_Sub3?, i_5_: Int, class45: Class45?, bool: Boolean, i_6_: Int, i_7_: Int) {
            try {
                anInt9219++
                if (i != 2) aClass114_9216 = null
                method2732(i_6_, i_7_, bool, 96, class45, i_5_)
                Class285.aClass348_Sub16_Sub3_4743 = class348_sub16_sub3
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("pba.D(" + i + ',' + (if (class348_sub16_sub3 != null) "{...}" else "null") + ',' + i_5_ + ',' + (if (class45 != null) "{...}" else "null") + ',' + bool + ',' + i_6_ + ',' + i_7_ + ')'))
            }
        }
    }
}
