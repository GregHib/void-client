import Class286_Sub3.Companion.method2148
import Class69.Companion.method721

/* Class242 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class242 internal constructor(var_ha_Sub2: ha_Sub2?, l: Long, i: Int) {
    private val aHa_Sub2_3153: ha_Sub2?
    @JvmField
    var aLong3156: Long = 0

    @Throws(Throwable::class)
    protected fun finalize() {
        anInt3151++
        aHa_Sub2_3153!!.method3769(this.aLong3156, false)
//        super.finalize()
    }

    init {
        try {
            aHa_Sub2_3153 = var_ha_Sub2
            this.aLong3156 = l
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("tba.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + l + ',' + i + ')'))
        }
    }

    companion object {
        var anInt3151: Int = 0
        @JvmField
        var aClass348_Sub42_Sub13_3152: Class348_Sub42_Sub13? = null
        var anInt3154: Int = 0
        var anInt3155: Int = 0
        @JvmStatic
        fun method1866(i: Int) {
            if (i != 0) aClass348_Sub42_Sub13_3152 = null
            aClass348_Sub42_Sub13_3152 = null
        }

        fun method1867(i: Int) {
            anInt3155++
            Class88.anInt1498++
            val class348_sub47 = method2148(Class318_Sub1_Sub1.aClass351_8724, Class348_Sub23_Sub2.aClass77_9029, -99)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
            Class348_Sub42_Sub14.method3243(118, class348_sub47)
        }

        fun method1868(i: Byte, class348_sub42_sub13: Class348_Sub42_Sub13) {
            val i_0_ = -104 / ((i - 38) / 54)
            anInt3154++
            class348_sub42_sub13.method3162(true)
            var bool = false
            var class348_sub42_sub13_1_ = (Class233.aClass107_3022!!.method1011(-85) as Class348_Sub42_Sub13?)
            while (class348_sub42_sub13_1_ != null) {
                if (Class318_Sub2.method2496(class348_sub42_sub13_1_.method3235(-17937), class348_sub42_sub13.method3235(-17937), true)) {
                    method721(class348_sub42_sub13_1_, class348_sub42_sub13, -1)
                    bool = true
                    break
                }
                class348_sub42_sub13_1_ = (Class233.aClass107_3022!!.method1003(84.toByte()) as Class348_Sub42_Sub13?)
            }
            if (!bool) Class233.aClass107_3022!!.method1005(true, class348_sub42_sub13)
        }
    }
}
