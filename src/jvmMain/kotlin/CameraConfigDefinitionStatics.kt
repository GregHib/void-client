import Player.Companion.method2460

object CameraConfigDefinitionStatics {
    var anInt3246: Int = 0
    var anInt3247: Int = 0
    var anInt3248: Int = 0
    var anInt3250: Int = 0
    var anInt3252: Int = 0

    var anInt3253: Int = 0

    fun method1919(i: Int, f: Float, `is`: ByteArray?, f_0_: Float, i_1_: Int, f_2_: Float, textureGenerator: TextureGenerator?, f_3_: Float, i_4_: Int, i_5_: Byte, i_6_: Int, f_7_: Float, i_8_: Int) {
        var i_1_ = i_1_
        try {
            var i_9_ = 0
            if (i_5_ < 11) method1919(97, -1.4756906f, null, 0.7518226f, 93, -0.33127537f, null, -0.6670833f, 25, (-96).toByte(), 123, -1.8054857f, 43)
            while ( /**/i_9_ < i_6_) {
                method2460(f, i_1_, f_0_, i_4_, i, f_7_, textureGenerator, i_9_, 30.toByte(), i_8_, f_3_, `is`, i_6_, f_2_)
                i_1_ += i * i_8_
                i_9_++
            }
            anInt3250++
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("u.B(" + i + ',' + f + ',' + (if (`is` != null) "{...}" else "null") + ',' + f_0_ + ',' + i_1_ + ',' + f_2_ + ',' + (if (textureGenerator != null) "{...}" else "null") + ',' + f_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + f_7_ + ',' + i_8_ + ')'))
        }
    }

    @JvmStatic
    fun method1920(i: Int, i_10_: Int): Int {
        if (i != 127) return -32
        anInt3252++
        return 0x7f and i_10_
    }

    @JvmStatic
    fun method1922(string: String?, i: Int, string_12_: String?, bool: Boolean) {
        try {
            if (bool == true) {
                anInt3247++
                TextureLoadExceptionStatics.anInt4596 = i
                BloomGraphicsOptionState.anInt5969 = 2
                LocalPlayerState.method1138(string_12_, false, string, (-45).toByte())
            }
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("u.E(" + (if (string != null) "{...}" else "null") + ',' + i + ',' + (if (string_12_ != null) "{...}" else "null") + ',' + bool + ')'))
        }
    }
}
