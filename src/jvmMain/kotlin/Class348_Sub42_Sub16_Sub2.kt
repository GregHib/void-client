/* Class348_Sub42_Sub16_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub42_Sub16_Sub2 : Class348_Sub42_Sub16() {
    @JvmField
    var anInt10457: Int = 0
    @JvmField
    var aClass137_10458: Class137? = null
    @JvmField
    var aByteArray10461: ByteArray? = null

    override fun method3257(i: Int): Int {
        anInt10460++
        if (i != 16) this.aClass137_10458 = null
        if (this.aBoolean9664) return 0
        return 100
    }

    override fun method3259(i: Int): ByteArray? {
        anInt10464++
        if (i != 16) method3259(8)
        if (this.aBoolean9664) throw RuntimeException()
        return this.aByteArray10461
    }

    companion object {
        @JvmField
        var anInt10459: Int = 0
        @JvmField
        var anInt10460: Int = 0
        @JvmField
        var anInt10462: Int = 0
        @JvmField
        var anInt10463: Int = 0
        @JvmField
        var anInt10464: Int = 0
        @JvmField
        var aClass356_10465: Class356? = Class356(16)

        @JvmStatic
        fun method3263(bool: Boolean): Boolean {
            if (bool != true) return false
            anInt10459++
            return Class351.aBoolean4328
        }

        @JvmStatic
        fun method3264(i: Byte) {
            aClass356_10465 = null
            if (i.toInt() != -24) method3265(-70, null, null)
        }

        @JvmStatic
        fun method3265(i: Int, class348: Class348?, class348_0_: Class348?) {
            try {
                if (class348!!.aClass348_4295 != null) class348.method2715(27.toByte())
                val i_1_ = -109 % ((6 - i) / 43)
                anInt10462++
                class348.aClass348_4295 = class348_0_!!.aClass348_4295
                class348.aClass348_4294 = class348_0_
                class348.aClass348_4295!!.aClass348_4294 = class348
                class348.aClass348_4294!!.aClass348_4295 = class348
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("qh.K(" + i + ',' + (if (class348 != null) "{...}" else "null") + ',' + (if (class348_0_ != null) "{...}" else "null") + ')'))
            }
        }
    }
}
