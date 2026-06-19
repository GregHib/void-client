import GrayscaleNoiseTextureStatics.method554

object CutsceneSequenceDataStatics {
    var anInt3720: Int = 0
            var anIntArray3726: IntArray? = null
            var anInt3731: Int = 0
            var anInt3736: Int = 0
            @JvmField
            var aClass318_Sub1Array3737: Array<SceneEntity?>? = null
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
