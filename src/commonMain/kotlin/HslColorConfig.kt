/*
 * Class22
 */
class HslColorConfig {

    var anInt331: Int = -1

    var anInt332: Int = 0

    var aBoolean334: Boolean = true

    var anInt335: Int = 0

    var anInt336: Int = 512
    private var anInt337 = 0

    var anInt341: Int = 0

    var aBoolean342: Boolean = true

    var anInt343: Int = 0

    fun method290(class348_sub49: ByteBuffer, i: Int) {
        if (i != -1) this.anInt332 = 25
        while (true) {
            val i_0_ = class348_sub49.readUnsignedByte(255)
            if (i_0_ == 0) break
            method291(i_0_, -4, class348_sub49)
        }
        anInt329++
    }

    private fun method291(i: Int, i_1_: Int, class348_sub49: ByteBuffer) {
        if (i == 1) {
            anInt337 = class348_sub49.readMedium(-1)
            method292(anInt337, 117.toByte())
        } else if (i == 2) {
            this.anInt331 = class348_sub49.readUnsignedShort(i_1_ + 842397948)
            if (this.anInt331 == 65535) this.anInt331 = -1
        } else if (i != 3) {
            if (i != 4) {
                if (i == 5) this.aBoolean334 = false
            } else this.aBoolean342 = false
        } else this.anInt336 = class348_sub49.readUnsignedShort(842397944) shl 2
        anInt333++
    }

    private fun method292(i: Int, i_2_: Byte) {
        anInt340++
        val d = (0xff and (i shr 16)).toDouble() / 256.0
        val d_3_ = ((0xff2b and i) shr 8).toDouble() / 256.0
        val d_4_ = (0xff and i).toDouble() / 256.0
        var d_5_ = d
        if (d_3_ < d_5_) d_5_ = d_3_
        if (d_4_ < d_5_) d_5_ = d_4_
        var d_6_ = d
        if (d_3_ > d_6_) d_6_ = d_3_
        if (d_4_ > d_6_) d_6_ = d_4_
        var d_7_ = 0.0
        var d_8_ = 0.0
        val d_9_ = (d_5_ + d_6_) / 2.0
        if (d_6_ != d_5_) {
            if (d_9_ < 0.5) d_8_ = (d_6_ - d_5_) / (d_5_ + d_6_)
            if (d != d_6_) {
                if (d_6_ != d_3_) {
                    if (d_6_ == d_4_) d_7_ = (d - d_3_) / (-d_5_ + d_6_) + 4.0
                } else d_7_ = (-d + d_4_) / (d_6_ - d_5_) + 2.0
            } else d_7_ = (-d_4_ + d_3_) / (d_6_ - d_5_)
            if (d_9_ >= 0.5) d_8_ = (d_6_ - d_5_) / (-d_5_ + (2.0 - d_6_))
        }
        this.anInt332 = (256.0 * d_8_).toInt()
        d_7_ /= 6.0
        this.anInt335 = (256.0 * d_9_).toInt()
        if (this.anInt332 >= 0) {
            if (this.anInt332 > 255) this.anInt332 = 255
        } else this.anInt332 = 0
        if (d_9_ > 0.5) this.anInt343 = (512.0 * ((1.0 - d_9_) * d_8_)).toInt()
        else this.anInt343 = (512.0 * (d_9_ * d_8_)).toInt()
        if (this.anInt335 < 0) this.anInt335 = 0
        else if (this.anInt335 > 255) this.anInt335 = 255
        if (this.anInt343 < 1) this.anInt343 = 1
        val i_10_ = 39 % ((i_2_ - 61) / 55)
        this.anInt341 = (d_7_ * this.anInt343.toDouble()).toInt()
    }

    companion object {
        var anInt329: Int = 0

        var anInt333: Int = 0

        var anInt340: Int = 0
    }
}