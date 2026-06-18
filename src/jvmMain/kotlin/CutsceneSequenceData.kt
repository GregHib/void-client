import CompressedBlockDecoder.method1547
import GrayscaleNoiseTexture.Companion.anInt5284
import RegionSceneShifter.Companion.aGzipDecompressor_6955

/* Class291 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CutsceneSequenceData internal constructor(`is`: ByteArray?, i: Int, is_27_: ByteArray?) {
    var anInt3719: Int = 0
    lateinit var anIntArrayArray3721: Array<IntArray?>
    lateinit var anIntArray3722: IntArray
    var aIntHashSet_3723: IntHashSet? = null
    lateinit var anIntArray3724: IntArray
    lateinit var anIntArray3725: IntArray
    var anInt3727: Int = 0
    var aIntHashSetArray3728: Array<IntHashSet?>? = null
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
        val class348_sub49 = ByteBuffer(method3158(`is`, -105))
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
            this.aIntHashSet_3723 = IntHashSet(this.anIntArray3733!!)
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
            this.aIntHashSetArray3728 = arrayOfNulls<IntHashSet>(1 + i_6_)
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
                this.aIntHashSetArray3728!![i_22_] = IntHashSet(this.anIntArrayArray3735!![i_22_]!!)
            }
        }
    }

    init {
        try {
            this.anInt3719 = method554(5126, `is`!!.size, `is`)
            if (i != this.anInt3719) throw RuntimeException()
            if (is_27_ != null) {
                if (is_27_.size != 64) throw RuntimeException()
                aByteArray3740 = method2730(4567, 0, `is`, `is`.size)
                for (i_28_ in 0..63) {
                    if (aByteArray3740!![i_28_] != is_27_[i_28_]) throw RuntimeException()
                }
            }
            method2200((-120).toByte(), `is`)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("vw.<init>(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + (if (is_27_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt3731: Int = 0
        var anInt8811: Int = 0
        var anInt7046: Int = 0

        fun method3158(`is`: ByteArray?, i: Int): ByteArray {
            anInt7046++
            val class348_sub49 = ByteBuffer(`is`)
            val i_37_ = class348_sub49.readUnsignedByte(255)
            val i_38_ = class348_sub49.readInt((-126).toByte())
            if (i_38_ < 0 || (ConfigIdPair.anInt401 != 0 && i_38_ > ConfigIdPair.anInt401)) {
                throw RuntimeException()
            }
            if (i_37_ != 0) {
                val i_39_ = class348_sub49.readInt((-126).toByte())
                if (i_39_ < 0 || (ConfigIdPair.anInt401 != 0 && i_39_ > ConfigIdPair.anInt401) || i_39_ > 10000000) {
                    return ByteArray(4)
                }
                val is_40_ = ByteArray(i_39_)
                if (i_37_ == 1) method1547(is_40_, i_39_, `is`, i_38_, 9)
                else {
                    withLock(aGzipDecompressor_6955!!) {
                        aGzipDecompressor_6955!!.method1218(is_40_, 29123, class348_sub49)
                    }
                }
                return is_40_
            }
            val is_41_ = ByteArray(i_38_)
            class348_sub49.method3389(2147483647, 0, i_38_, is_41_)
            return is_41_
        }

        fun method554(i: Int, i_42_: Int, `is`: ByteArray?): Int {
            anInt5284++
            return ByteBuffer.method1319(i_42_, true, `is`!!, 0)
        }
        fun method2730(i: Int, i_4_: Int, `is`: ByteArray, i_5_: Int): ByteArray {
            anInt8811++
            val is_6_: ByteArray?
            if (i_4_ > 0) {
                is_6_ = ByteArray(i_5_)
                var i_7_ = 0
                while (i_5_ > i_7_) {
                    is_6_[i_7_] = `is`[i_4_ + i_7_]
                    i_7_++
                }
            } else is_6_ = `is`
            val whirlpoolHash = WhirlpoolHash()
            whirlpoolHash.method829(i + -4682)
            whirlpoolHash.method832((i_5_ * 8).toLong(), is_6_, -69)
            val is_8_ = ByteArray(64)
            whirlpoolHash.method833(true, 0, is_8_)
            return is_8_
        }
    }
}
