/* Class304 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class TextureFormatInfo internal constructor(var anInt3850: Int) {
    override fun toString(): String {
        anInt3851++
        throw IllegalStateException()
    }

    companion object {

        var aTextureFormatInfo_7103: TextureFormatInfo? = TextureFormatInfo(3)
        var aBoolean3847: Boolean = false
        var anInt3848: Int = 0
        var anInt3849: Int = 0
        var anInt3851: Int = 0

        fun method2289(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, `is`: ByteArray, i_3_: Int) {
            var i_0_ = i_0_
            var i_2_ = i_2_
            anInt3848++
            if (i < i_3_) {
                i_0_ += i
                i_2_ = -i + i_3_ shr 2
                while (--i_2_ >= 0) {
                    `is`[i_0_++] = 1.toByte()
                    `is`[i_0_++] = 1.toByte()
                    `is`[i_0_++] = 1.toByte()
                    `is`[i_0_++] = 1.toByte()
                }
                i_2_ = 0x3 and -i + i_3_
                while (--i_2_ >= 0) `is`[i_0_++] = 1.toByte()
            }
        }

    }
}