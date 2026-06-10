import Class348_Sub42_Sub16_Sub2.Companion.method3265

/* Class348_Sub16_Sub4 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub16_Sub4 : Class348_Sub16() {
    private val aClass262_8965 = Class262()
    private val aClass262_8966 = Class262()
    private var anInt8967 = -1
    private var anInt8968 = 0

    @Synchronized
    fun method2880(class348_sub16: Class348_Sub16) {
        class348_sub16.method2715(94.toByte())
    }

    @Synchronized
    override fun method2819(i: Int) {
        var i = i
        do {
            if (anInt8967 < 0) {
                method2884(i)
                break
            }
            if (anInt8968 + i < anInt8967) {
                anInt8968 += i
                method2884(i)
                break
            }
            val i_0_ = anInt8967 - anInt8968
            method2884(i_0_)
            i -= i_0_
            anInt8968 += i_0_
            method2885()
            val class348_sub30 = aClass262_8966.method1995(4) as Class348_Sub30?
            synchronized(class348_sub30!!) {
                val i_1_ = class348_sub30.method3005(this)
                if (i_1_ < 0) {
                    class348_sub30.anInt6912 = 0
                    method2882(class348_sub30)
                } else {
                    class348_sub30.anInt6912 = i_1_
                    method2881(class348_sub30.aClass348_4294!!, class348_sub30)
                }
            }
        } while (i != 0)
    }

    override fun method2816(): Class348_Sub16? {
        return aClass262_8965.method1995(4) as Class348_Sub16?
    }

    private fun method2881(class348: Class348, class348_sub30: Class348_Sub30) {
        var class348 = class348
        while ( /**/(class348 !== aClass262_8966.aClass348_3334 && ((class348 as Class348_Sub30).anInt6912 <= class348_sub30.anInt6912))) {
            class348 = class348.aClass348_4294!!
        }
        method3265(-106, class348_sub30, class348)
        anInt8967 = (aClass262_8966.aClass348_3334.aClass348_4294 as Class348_Sub30).anInt6912
    }

    private fun method2882(class348_sub30: Class348_Sub30) {
        class348_sub30.method2715(105.toByte())
        class348_sub30.method3006()
        val class348 = (aClass262_8966.aClass348_3334.aClass348_4294)
        if (class348 === aClass262_8966.aClass348_3334) anInt8967 = -1
        else anInt8967 = (class348 as Class348_Sub30).anInt6912
    }

    @Synchronized
    fun method2883(class348_sub16: Class348_Sub16) {
        aClass262_8965.method2001(class348_sub16, -109)
    }

    private fun method2884(i: Int) {
        var class348_sub16 = aClass262_8965.method1995(4) as Class348_Sub16?
        while (class348_sub16 != null) {
            class348_sub16.method2819(i)
            class348_sub16 = aClass262_8965.method1990(104.toByte()) as Class348_Sub16?
        }
    }

    private fun method2885() {
        if (anInt8968 > 0) {
            var class348_sub30 = aClass262_8966.method1995(4) as Class348_Sub30?
            while (class348_sub30 != null) {
                class348_sub30.anInt6912 -= anInt8968
                class348_sub30 = aClass262_8966.method1990(115.toByte()) as Class348_Sub30?
            }
            anInt8967 -= anInt8968
            anInt8968 = 0
        }
    }

    private fun method2886(`is`: IntArray, i: Int, i_2_: Int) {
        var class348_sub16 = aClass262_8965.method1995(4) as Class348_Sub16?
        while (class348_sub16 != null) {
            class348_sub16.method2815(`is`, i, i_2_)
            class348_sub16 = aClass262_8965.method1990(41.toByte()) as Class348_Sub16?
        }
    }

    @Synchronized
    fun method2887(): Int {
        return aClass262_8965.method1998(0)
    }

    override fun method2818(): Class348_Sub16? {
        return aClass262_8965.method1990(95.toByte()) as Class348_Sub16?
    }

    override fun method2821(): Int {
        return 0
    }

    @Synchronized
    override fun method2817(`is`: IntArray, i: Int, i_3_: Int) {
        var i = i
        var i_3_ = i_3_
        do {
            if (anInt8967 < 0) {
                method2886(`is`, i, i_3_)
                break
            }
            if (anInt8968 + i_3_ < anInt8967) {
                anInt8968 += i_3_
                method2886(`is`, i, i_3_)
                break
            }
            val i_4_ = anInt8967 - anInt8968
            method2886(`is`, i, i_4_)
            i += i_4_
            i_3_ -= i_4_
            anInt8968 += i_4_
            method2885()
            val class348_sub30 = aClass262_8966.method1995(4) as Class348_Sub30?
            synchronized(class348_sub30!!) {
                val i_5_ = class348_sub30.method3005(this)
                if (i_5_ < 0) {
                    class348_sub30.anInt6912 = 0
                    method2882(class348_sub30)
                } else {
                    class348_sub30.anInt6912 = i_5_
                    method2881(class348_sub30.aClass348_4294!!, class348_sub30)
                }
            }
        } while (i_3_ != 0)
    }
}
