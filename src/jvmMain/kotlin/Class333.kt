/* Class333 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class333 {
    private var aClass356_4146: Class356? = null
    private var anInt4148 = 0
    private var aClass348_4150: Class348? = null

    fun method2644(i: Byte): Class348? {
        anInt4148 = 0
        if (i.toInt() != 123) method2643(-115, 5, -49, 81, 25)
        anInt4145++
        return method2646(117.toByte())
    }

    fun method2646(i: Byte): Class348? {
        anInt4149++
        val i_4_ = -49 / ((i - 44) / 40)
        if (anInt4148 > 0 && (aClass356_4146!!.aClass348Array4374[-1 + anInt4148] !== aClass348_4150)) {
            val class348 = aClass348_4150
            aClass348_4150 = class348!!.aClass348_4294
            return class348
        }
        while (aClass356_4146!!.anInt4377 > anInt4148) {
            val class348 = (aClass356_4146!!.aClass348Array4374[anInt4148++].aClass348_4294)
            if (aClass356_4146!!.aClass348Array4374[anInt4148 + -1] !== class348) {
                aClass348_4150 = class348!!.aClass348_4294
                return class348
            }
        }
        return null
    }

    constructor()

    internal constructor(class356: Class356) {
        aClass356_4146 = class356
    }

    companion object {
        @JvmField
        var anInt4144: Int = -1
        var anInt4145: Int = 0
        var aClass45_4147: Class45? = null
        var anInt4149: Int = 0
        fun method2643(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
            if (Class342.anIntArrayArray4253 != null) Class342.anIntArrayArray4253!![i]!![i_0_] = 0xffffff.inv() or i_1_
            if (Class239_Sub1.aShortArrayArray5847 != null) Class239_Sub1.aShortArrayArray5847!![i]!![i_0_] = i_2_.toShort()
            if (Class348_Sub1_Sub2.aByteArrayArray8816 != null) Class348_Sub1_Sub2.aByteArrayArray8816!![i]!![i_0_] = i_3_.toByte()
        }

        @JvmStatic
        fun method2645(i: Int) {
            if (i != -16777216) method2643(-59, 61, -83, 34, -32)
            aClass45_4147 = null
        }
    }
}
