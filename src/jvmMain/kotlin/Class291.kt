import Class59_Sub1.Companion.method554

/* Class291 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class291 internal constructor(`is`: ByteArray?, i: Int, is_27_: ByteArray?) {
    var anInt3719: Int = 0
    lateinit var anIntArrayArray3721: Array<IntArray?>
    lateinit var anIntArray3722: IntArray
    var aClass316_3723: Class316? = null
    lateinit var anIntArray3724: IntArray
    lateinit var anIntArray3725: IntArray
    var anInt3727: Int = 0
    var aClass316Array3728: Array<Class316?>? = null
    lateinit var anIntArray3729: IntArray
    var aByteArrayArray3730: Array<ByteArray?>? = null
    var anInt3732: Int = 0
    var anIntArray3733: IntArray? = null
    var anInt3734: Int = 0
    var anIntArrayArray3735: Array<IntArray?>? = null
    lateinit var anIntArray3738: IntArray
    private var aByteArray3740: ByteArray? = null

    private fun method2200(i: Byte, `is`: ByteArray?) {
        anInt3731++
        val class348_sub49 = Class348_Sub49(Class348_Sub41.method3158(`is`, -105))
        val i_2_ = class348_sub49.readUnsignedByte(255)
        if (i_2_ < 5 || i_2_ > 6) throw RuntimeException()
        if (i_2_ < 6) this.anInt3732 = 0
        else this.anInt3732 = class348_sub49.readInt((-126).toByte())
        val i_3_ = class348_sub49.readUnsignedByte(255)
        val bool = (i_3_ and 0x1) != 0
        val bool_4_ = (i_3_ and 0x2) != 0
        this.anInt3727 = class348_sub49.readUnsignedShort(842397944)
        var i_5_ = 0
        this.anIntArray3738 = IntArray(this.anInt3727)
        var i_6_ = -1
        for (i_7_ in 0..<this.anInt3727) {
            i_5_ += class348_sub49.readUnsignedShort(842397944)
            this.anIntArray3738[i_7_] = i_5_
            if (i_6_ < this.anIntArray3738[i_7_]) i_6_ = this.anIntArray3738[i_7_]
        }
        this.anInt3734 = i_6_ - -1
        if (bool_4_) this.aByteArrayArray3730 = arrayOfNulls<ByteArray>(this.anInt3734)
        this.anIntArray3729 = IntArray(this.anInt3734)
        this.anIntArray3724 = IntArray(this.anInt3734)
        this.anIntArray3725 = IntArray(this.anInt3734)
        this.anIntArray3722 = IntArray(this.anInt3734)
        this.anIntArrayArray3721 = arrayOfNulls<IntArray>(this.anInt3734)
        if (bool) {
            this.anIntArray3733 = IntArray(this.anInt3734)
            for (i_8_ in 0..<this.anInt3734) this.anIntArray3733!![i_8_] = -1
            var i_9_ = 0
            while ((this.anInt3727 > i_9_)) {
                this.anIntArray3733!![(this.anIntArray3738[i_9_])] = class348_sub49.readInt((-126).toByte())
                i_9_++
            }
            this.aClass316_3723 = Class316(this.anIntArray3733!!)
        }
        if (i >= -83) method2200(42.toByte(), null)
        for (i_10_ in 0..<this.anInt3727) this.anIntArray3729[(this.anIntArray3738[i_10_])] = class348_sub49.readInt((-126).toByte())
        if (bool_4_) {
            for (i_11_ in 0..<this.anInt3727) {
                val is_12_ = ByteArray(64)
                class348_sub49.method3389(2147483647, 0, 64, is_12_)
                this.aByteArrayArray3730!![(this.anIntArray3738[i_11_])] = is_12_
            }
        }
        for (i_13_ in 0..<this.anInt3727) this.anIntArray3722[(this.anIntArray3738[i_13_])] = class348_sub49.readInt((-126).toByte())
        var i_14_ = 0
        while (this.anInt3727 > i_14_) {
            this.anIntArray3725[(this.anIntArray3738[i_14_])] = class348_sub49.readUnsignedShort(842397944)
            i_14_++
        }
        var i_15_ = 0
        while (this.anInt3727 > i_15_) {
            val i_16_ = this.anIntArray3738[i_15_]
            i_5_ = 0
            val i_17_ = this.anIntArray3725[i_16_]
            var i_18_ = -1
            this.anIntArrayArray3721[i_16_] = IntArray(i_17_)
            var i_19_ = 0
            while (i_17_ > i_19_) {
                val i_20_ = (class348_sub49.readUnsignedShort(842397944).let { i_5_ += it; i_5_ }.also { this.anIntArrayArray3721[i_16_]!![i_19_] = it })
                if (i_18_ < i_20_) i_18_ = i_20_
                i_19_++
            }
            this.anIntArray3724[i_16_] = i_18_ + 1
            if (1 + i_18_ == i_17_) this.anIntArrayArray3721[i_16_] = null
            i_15_++
        }
        if (bool) {
            this.anIntArrayArray3735 = arrayOfNulls<IntArray>(i_6_ + 1)
            this.aClass316Array3728 = arrayOfNulls<Class316>(1 + i_6_)
            for (i_21_ in 0..<this.anInt3727) {
                val i_22_ = this.anIntArray3738[i_21_]
                val i_23_ = this.anIntArray3725[i_22_]
                this.anIntArrayArray3735!![i_22_] = IntArray(this.anIntArray3724[i_22_])
                var i_24_ = 0
                while (this.anIntArray3724[i_22_] > i_24_) {
                    this.anIntArrayArray3735!![i_22_]!![i_24_] = -1
                    i_24_++
                }
                var i_25_ = 0
                while (i_23_ > i_25_) {
                    val i_26_: Int
                    if (this.anIntArrayArray3721[i_22_] != null) i_26_ = (this.anIntArrayArray3721[i_22_]!![i_25_])
                    else i_26_ = i_25_
                    this.anIntArrayArray3735!![i_22_]!![i_26_] = class348_sub49.readInt((-126).toByte())
                    i_25_++
                }
                this.aClass316Array3728!![i_22_] = Class316(this.anIntArrayArray3735!![i_22_]!!)
            }
        }
    }

    init {
        try {
            this.anInt3719 = method554(5126, `is`!!.size, `is`)
            if (i != this.anInt3719) throw RuntimeException()
            if (is_27_ != null) {
                if (is_27_.size != 64) throw RuntimeException()
                aByteArray3740 = Class348_Sub1_Sub2.method2730(4567, 0, `is`, `is`.size)
                for (i_28_ in 0..63) {
                    if (aByteArray3740!![i_28_] != is_27_[i_28_]) throw RuntimeException()
                }
            }
            method2200((-120).toByte(), `is`)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("vw.<init>(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + (if (is_27_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt3720: Int = 0
        var anIntArray3726: IntArray? = null
        var anInt3731: Int = 0
        var anInt3736: Int = 0
        @JvmField
        var aClass318_Sub1Array3737: Array<Class318_Sub1?>? = null
        @JvmField
        var anInt3739: Int = 0
        var anInt3741: Int = 0

        fun method2198(i: Int, i_0_: Int, i_1_: Int): Int {
            var i_0_ = i_0_
            i_0_ = i_0_ * (i_1_ and 0x7f) shr 7
            if (i != 0) method2198(52, -11, 108)
            anInt3741++
            if (i_0_ >= 2) {
                if (i_0_ > 126) i_0_ = 126
            } else i_0_ = 2
            return (0xff80 and i_1_) - -i_0_
        }

        @JvmStatic
        fun method2199(i: Byte) {
            anIntArray3726 = null
            if (i < 55) aClass318_Sub1Array3737 = null
            aClass318_Sub1Array3737 = null
        }
    }
}
