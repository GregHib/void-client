/* Class369_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
public open class Class369_Sub3(class221: Class221?, class341: Class341?, i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int) : Class369(class221, class341, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_) {
    @JvmField
    var anInt8595: Int = 0
    @JvmField
    var anInt8597: Int = 0
    @JvmField
    var anInt8599: Int = 0
    @JvmField
    var anInt8600: Int = 0
    @JvmField
    var anInt8602: Int = 0
    @JvmField
    var anInt8603: Int = 0

    override fun method51(i: Byte): Class223? {
        anInt8594++
        if (i <= 116) return null
        return Class185.aClass223_2489
    }

    init {
        try {
            this.anInt8600 = i_10_
            this.anInt8602 = i_9_
            this.anInt8603 = i_8_
            this.anInt8599 = i_6_
            this.anInt8597 = i_11_
            this.anInt8595 = i_7_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("um.<init>(" + (if (class221 != null) "{...}" else "null") + ',' + (if (class341 != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt8594: Int = 0
        @JvmField
        var aBooleanArrayArray8596: Array<BooleanArray?>? = null
        @JvmField
        var anInt8598: Int = 0
        @JvmField
        var aClass45_8601: Class45? = null
        @JvmStatic
        fun method3573(i: Int) {
            synchronized(Class24.aClass60_355!!) {
                Class24.aClass60_355!!.method590(0)
            }
            anInt8598++
            synchronized(Class130.aClass60_1894!!) {
                Class130.aClass60_1894!!.method590(0)
            }
            if (i != -15326) method3573(-67)
        }

        @JvmStatic
        fun method3574(i: Int) {
            if (i == 19499) {
                aBooleanArrayArray8596 = null
                aClass45_8601 = null
            }
        }
    }
}
