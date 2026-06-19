import AbstractModelStatics.method607
import kotlin.math.sqrt

object SpotAnimVectorStatics {
    var anInt2287: Int = 0
            var anInt2288: Int = 0
            var anInt2293: Int = 0
            var anInt2295: Int = 0
            var anInt2300: Int = 0
            var aIntRange_2305: IntRange? = IntRange(57, 10)
            @JvmField
            var aJs5Archive_2306: Js5Archive? = null
            @JvmField
            var aProjectileFactory_2307: ProjectileFactory? = ProjectileFactory(7, 2)
            @JvmField
            var aAbstractModelRenderer_2309: AbstractModelRenderer? = null
    
            fun method1332(bool: Boolean, bool_0_: Boolean, i: Int, string: String): Boolean {
                anInt2293++
                require(!(i < 2 || i > 36)) { "Invalid radix:" + i }
                var bool_1_ = false
                var bool_2_ = false
                var i_3_ = 0
                if (bool != true) aJs5Archive_2306 = null
                val i_4_ = string.length
                for (i_5_ in 0..<i_4_) {
                    var i_6_ = string.get(i_5_).code
                    if (i_5_ == 0) {
                        if (i_6_ == 45) {
                            bool_1_ = true
                            continue
                        }
                        if (i_6_ == 43 && bool_0_) continue
                    }
                    if (i_6_ < 48 || i_6_ > 57) {
                        if (i_6_ < 65 || i_6_ > 90) {
                            if (i_6_ >= 97 && i_6_ <= 122) i_6_ -= 87
                            else return false
                        } else i_6_ -= 55
                    } else i_6_ -= 48
                    if (i_6_ >= i) return false
                    if (bool_1_) i_6_ = -i_6_
                    val i_7_ = i * i_3_ - -i_6_
                    if (i_7_ / i != i_3_) return false
                    bool_2_ = true
                    i_3_ = i_7_
                }
                return bool_2_
            }
    
            fun method1333(`is`: ShortArray?, i: Int, strings: Array<String?>?) {
                try {
                    if (i != 26073) aAbstractModelRenderer_2309 = null
                    anInt2295++
                    method607(strings!!.size + -1, strings, `is`, 0, false)
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("po.B(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + (if (strings != null) "{...}" else "null") + ')'))
                }
            }
    
            @JvmStatic
            fun method1334(i: Byte) {
                aProjectileFactory_2307 = null
                if (i.toInt() != -110) method1333(null, -51, null)
                aIntRange_2305 = null
                aAbstractModelRenderer_2309 = null
                aJs5Archive_2306 = null
            }
}
