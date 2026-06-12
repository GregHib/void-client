abstract class Class348_Sub5 internal constructor(var aHa_Sub2_6618: ha_Sub2) : Class348() {
    var aBoolean6621: Boolean = false
    abstract fun method2750(class258_sub3: Class258_Sub3?, class258_sub3_0_: Class258_Sub3?, i: Int, i_1_: Byte)

    abstract fun method2751(bool: Boolean): Boolean

    abstract fun method2754(i: Int, i_5_: Byte, i_6_: Int)

    abstract fun method2756(i: Byte, i_10_: Int)

    abstract fun method2758(i: Int): Boolean

    fun method2759(i: Int): Boolean {
        if (i != 1) return true
        anInt6626++
        return false
    }

    fun method2760(i: Byte): Boolean {
        if (i.toInt() != 1) method2763(37.toByte())
        anInt6619++
        return this.aBoolean6621
    }

    open fun method2761(bool: Boolean): Int {
        anInt6622++
        if (bool != true) Class348_Sub5Statics.method2757(-63)
        return 0
    }

    abstract fun method2763(i: Byte)

    fun method2764(i: Int): Int {
        if (i != 1) aByteArray6624 = null
        anInt6623++
        return 1
    }

    companion object {
        var anInt6619: Int = 0
        var anInt6620: Int = 0
        var anInt6622: Int = 0
        var anInt6623: Int = 0
        var aByteArray6624: ByteArray? = ByteArray(2048)
        var anInt6625: Int = 0
        var anInt6626: Int = 0
        var aClass105_6627: Class105? = null
        var anInt6628: Int = 0
        var anInt6629: Int = 0

        @JvmStatic
        fun method2762(i: Int) {
            aByteArray6624 = null
            aClass105_6627 = null
            val i_12_ = -23 % ((i - -24) / 47)
        }
    }
}
