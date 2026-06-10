import Class348_Sub17.Companion.method2929
import Class348_Sub42_Sub16_Sub2.Companion.method3265

/* Class352 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class352 {
    var aClass324_4332: Class324?
    var aClass143_4333: Class143? = null

    internal constructor(class324: Class324?) {
        this.aClass324_4332 = null
        this.aClass324_4332 = class324
    }

    internal constructor(class324: Class324?, class143: Class143?) {
        this.aClass324_4332 = null
        try {
            this.aClass143_4333 = class143
            this.aClass324_4332 = class324
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("el.<init>(" + (if (class324 != null) "{...}" else "null") + ',' + (if (class143 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt4330: Int = 0
        var aClass114_4331: Class114? = Class114(31, -1)
        var anInt4334: Int = 0
        var anInt4335: Int = 0
        var anInt4336: Int = 0
        var anInt4337: Int = -2

        @JvmStatic
        fun method3458(i: Int) {
            aClass114_4331 = null
        }

        fun method3459(class348_sub34: Class348_Sub34, i: Int, i_0_: Int, i_1_: Int, i_2_: Int) {
            anInt4330++
            val l = (i_0_ shl 14 or (i shl 28) or i_1_).toLong()
            var class348_sub37 = Class130.aClass356_1895!!.method3480(l, -6008) as Class348_Sub37?
            if (class348_sub37 == null) {
                class348_sub37 = Class348_Sub37()
                Class130.aClass356_1895!!.method3483(50.toByte(), l, class348_sub37)
                class348_sub37.aClass262_6998.method1999(class348_sub34, -20180)
            } else {
                var class213 = Exception_Sub1.aClass255_112!!.method1940(i_2_ xor 0x72.inv(), (class348_sub34.anInt6973))
                var i_3_ = class213.anInt2819
                if (i_2_ == (class213.anInt2820.inv())) i_3_ *= 1 + class348_sub34.anInt6971
                var class348_sub34_4_ = class348_sub37.aClass262_6998.method1995(i_2_ + 6) as Class348_Sub34?
                while (class348_sub34_4_ != null) {
                    class213 = (Exception_Sub1.aClass255_112!!.method1940(104, class348_sub34_4_.anInt6973))
                    var i_5_ = class213.anInt2819
                    if (class213.anInt2820 == 1) i_5_ *= class348_sub34_4_.anInt6971 - -1
                    if (i_3_ > i_5_) {
                        method3265(i_2_ xor 0x6c, class348_sub34, class348_sub34_4_)
                        return
                    }
                    class348_sub34_4_ = class348_sub37.aClass262_6998.method1990(34.toByte()) as Class348_Sub34?
                }
                class348_sub37.aClass262_6998.method1999(class348_sub34, i_2_ xor 0x4ed2)
            }
        }
    }
}
