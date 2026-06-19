import GameClock.method599
import java.io.IOException
import kotlin.concurrent.Volatile

object MediaStreamClientStatics {
    var anInt3185: Int = 0
            var anInt3186: Int = 0
            var anInt3187: Int = 0
            var anInt3188: Int = 0
            var anInt3189: Int = 0
            var anInt3190: Int = 0
            var anInt3191: Int = 0
            var anInt3192: Int = 0
            var anInt3193: Int = 0
            var anInt3194: Int = 0
            var anInt3195: Int = 0
            @JvmField
            var aRenderConfigFactory_3196: RenderConfigFactory? = RenderConfigFactory()
            var anInt3198: Int = 0
            var anInt3199: Int = 0
            var anInt3200: Int = 0
            var anInt3201: Int = 0
            var anInt3202: Int = 0
            @JvmField
            var anInt3203: Int = -1
            fun method1895(i: Int, `is`: ByteArray?, i_16_: Int, i_17_: Int, i_18_: Int, i_19_: Int, is_20_: ByteArray?, i_21_: Int, i_22_: Byte) {
                var i = i
                var i_17_ = i_17_
                var i_21_ = i_21_
                try {
                    anInt3198++
                    val i_23_ = -(i_21_ shr 2)
                    i_21_ = -(0x3 and i_21_)
                    if (i_22_.toInt() != 121) aRenderConfigFactory_3196 = null
                    for (i_24_ in -i_16_..-1) {
                        for (i_25_ in i_23_..-1) {
                            `is`!![i_17_] = (`is`[i_17_++] + -is_20_!![i++]).toByte()
                            `is`[i_17_] = (`is`[i_17_++] + -is_20_[i++]).toByte()
                            `is`[i_17_] = (`is`[i_17_++] + -is_20_[i++]).toByte()
                            `is`[i_17_] = (`is`[i_17_++] + -is_20_[i++]).toByte()
                        }
                        for (i_26_ in i_21_..-1) `is`!![i_17_] = (`is`[i_17_++] + -is_20_!![i++]).toByte()
                        i_17_ += i_18_
                        i += i_19_
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("tha.M(" + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + (if (is_20_ != null) "{...}" else "null") + ',' + i_21_ + ',' + i_22_ + ')'))
                }
            }
    
            @JvmStatic
            fun method1897(i: Byte) {
                if (i.toInt() == 119) aRenderConfigFactory_3196 = null
            }
}
