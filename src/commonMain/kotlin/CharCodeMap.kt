/* Class348_Sub42_Sub11 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CharCodeMap : HashLinkedListNode() {
    var anIntArray9580: IntArray? = null
    lateinit var aCharArray9582: CharArray
    var aString9587: String? = null
    lateinit var aCharArray9588: CharArray
    var anIntArray9592: IntArray? = null

    fun method3221(i: Int, class348_sub49: ByteBuffer) {
        val i_0_ = 81 / ((-39 - i) / 52)
        anInt9583++
        while (true) {
            val i_1_ = class348_sub49.readUnsignedByte(255)
            if (i_1_ == 0) break
            method3227(-5847, class348_sub49, i_1_)
        }
    }

    fun method3222(i: Byte, c: Char): Int {
        anInt9585++
        if (this.anIntArray9580 == null) return -1
        var i_2_ = 0
        while ( /**/this.anIntArray9580!!.size > i_2_) {
            if (this.aCharArray9582[i_2_] == c) return this.anIntArray9580!![i_2_]
            i_2_++
        }
        return -1
    }

    fun method3224(i: Byte) {
        if (this.anIntArray9580 != null) {
            var i_3_ = 0
            while ((this.anIntArray9580!!.size > i_3_)) {
                this.anIntArray9580!![i_3_] = WhirlpoolHash.method2057((this.anIntArray9580!![i_3_]), 32768)
                i_3_++
            }
        }
        anInt9579++
        if (this.anIntArray9592 != null) {
            var i_4_ = 0
            while ((this.anIntArray9592!!.size > i_4_)) {
                this.anIntArray9592!![i_4_] = WhirlpoolHash.method2057((this.anIntArray9592!![i_4_]), 32768)
                i_4_++
            }
        }
        if (i <= 102) method3222(78.toByte(), '\uffc1')
    }

    fun method3226(c: Char, i: Int): Int {
        anInt9584++
        if (this.anIntArray9592 == null) return -1
        var i_23_ = 0
        while (this.anIntArray9592!!.size > i_23_) {
            if (this.aCharArray9588[i_23_] == c) return this.anIntArray9592!![i_23_]
            i_23_++
        }
        return -1
    }

    private fun method3227(i: Int, class348_sub49: ByteBuffer, i_24_: Int) {
        if (i_24_ != 1) {
            if (i_24_ == 2) {
                val i_25_ = class348_sub49.readUnsignedByte(255)
                this.anIntArray9592 = IntArray(i_25_)
                this.aCharArray9588 = CharArray(i_25_)
                for (i_26_ in 0..<i_25_) {
                    this.anIntArray9592!![i_26_] = class348_sub49.readUnsignedShort(842397944)
                    val i_27_ = class348_sub49.readByte(-121)
                    this.aCharArray9588[i_26_] = (if (i_27_.toInt() != 0) ByteBuffer.method462(i_27_, -128) else '\u0000')
                }
            } else if (i_24_ == 3) {
                val i_28_ = class348_sub49.readUnsignedByte(255)
                this.aCharArray9582 = CharArray(i_28_)
                this.anIntArray9580 = IntArray(i_28_)
                var i_29_ = 0
                while (i_28_ > i_29_) {
                    this.anIntArray9580!![i_29_] = class348_sub49.readUnsignedShort(842397944)
                    val i_30_ = class348_sub49.readByte(-115)
                    this.aCharArray9582[i_29_] = (if (i_30_.toInt() != 0) ByteBuffer.method462(i_30_, -128) else '\u0000')
                    i_29_++
                }
            }
        } else this.aString9587 = class348_sub49.readString(100.toByte())
        if (i != -5847) anInt9586 = 12
        anInt9581++
    }

    companion object {
        var anInt9579: Int = 0
        var anInt9581: Int = 0
        var anInt9583: Int = 0
        var anInt9584: Int = 0
        var anInt9585: Int = 0
        var anInt9586: Int = 0
    }
}