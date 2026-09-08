import kotlin.jvm.JvmStatic
import CollisionMapAccessor.method2066
import Gl3dTexture.Companion.method249

object IntHashSetStatics {
    var anInt3958: Int = 0

    var aClass348_Sub51_3959: DisplaySettingsConfig? = null
    var anInt3962: Int = 0

    var aClass348_Sub42_Sub12_3963: ContactEntry? = null
    var anInt3964: Int = 0
    var anInt3965: Int = 0

    var anInt3966: Int = 0

    @JvmStatic
    fun method2363(i: Int) {
        if (i <= -39) {
            anInt3958++
            if (method2066(106.toByte())) {
                if (ArbFogMaterialPass.aStringArray6200 == null) method249(2)
                HeapDiagnosticsHolder.anInt2254 = 0
                FontMetaRef.aBoolean4328 = true
            }
        }
    }

    fun method2364(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) {
        if (i_7_ == 3) {
            if (i_3_ != i_1_ || i_2_ != i_6_ || i_5_ != i_0_ || i_8_ != i_4_) {
                var i_9_ = i_1_
                var i_10_ = i_6_
                val i_11_ = i_1_ * 3
                val i_12_ = 3 * i_6_
                val i_13_ = i_3_ * 3
                val i_14_ = 3 * i_2_
                val i_15_ = 3 * i_0_
                val i_16_ = i_4_ * 3
                val i_17_ = -i_1_ + (i_13_ + i_5_) + -i_15_
                val i_18_ = -i_6_ + (i_8_ + (-i_16_ - -i_14_))
                val i_19_ = -i_13_ + -i_13_ + (i_15_ + i_11_)
                val i_20_ = i_12_ + -i_14_ + (i_16_ - i_14_)
                val i_21_ = -i_11_ + i_13_
                val i_22_ = -i_12_ + i_14_
                var i_23_ = 128
                while (i_23_ <= 4096) {
                    val i_24_ = i_23_ * i_23_ shr 12
                    val i_25_ = i_24_ * i_23_ shr 12
                    val i_26_ = i_17_ * i_25_
                    val i_27_ = i_18_ * i_25_
                    val i_28_ = i_19_ * i_24_
                    val i_29_ = i_24_ * i_20_
                    val i_30_ = i_23_ * i_21_
                    val i_31_ = i_22_ * i_23_
                    val i_32_ = i_1_ - -(i_26_ - (-i_28_ + -i_30_) shr 12)
                    val i_33_ = i_6_ - -(i_29_ + (i_27_ - -i_31_) shr 12)
                    MapRegionLoaderThread.method2665(i_9_, 109.toByte(), i, i_10_, i_33_, i_32_)
                    i_9_ = i_32_
                    i_10_ = i_33_
                    i_23_ += 128
                }
            } else MapRegionLoaderThread.method2665(i_1_, 73.toByte(), i, i_6_, i_8_, i_5_)
            anInt3964++
        }
    }

    @JvmStatic
    fun method2366(bool: Boolean) {
        aClass348_Sub42_Sub12_3963 = null
        aClass348_Sub51_3959 = null
        if (bool != true) method2368(46)
    }

    @JvmStatic
    fun method2367(i: Byte, class348_sub42_sub12: ContactEntry): String? {
        anInt3962++
        val i_41_ = 9 / ((79 - i) / 46)
        if (class348_sub42_sub12.aString9595 == null || class348_sub42_sub12.aString9595!!.length == 0) {
            if ((class348_sub42_sub12.aString9601 == null) || class348_sub42_sub12.aString9601!!.length <= 0) return (class348_sub42_sub12.aString9593)
            return (class348_sub42_sub12.aString9593 + LocalizedText.aLocalizedText_3515!!.method2063(ChatCommandProcessor.language, 544) + (class348_sub42_sub12.aString9601))
        }
        if (class348_sub42_sub12.aString9601 == null || class348_sub42_sub12.aString9601!!.length <= 0) return (class348_sub42_sub12.aString9593 + LocalizedText.aLocalizedText_3515!!.method2063(ChatCommandProcessor.language, 544) + (class348_sub42_sub12.aString9595))
        return (class348_sub42_sub12.aString9593 + LocalizedText.aLocalizedText_3515!!.method2063(ChatCommandProcessor.language, 544) + class348_sub42_sub12.aString9601 + LocalizedText.aLocalizedText_3515!!.method2063(ChatCommandProcessor.language, 544) + class348_sub42_sub12.aString9595)
    }

    @JvmStatic
    fun method2368(i: Int) {
        CharCountUtil.aLruByteCache_225!!.method590(0)
        anInt3965++
        if (i != -1) aClass348_Sub51_3959 = null
    }
}