/* Companion split from Class318 — holds jvmMain-only statics (Class243, Class304, Class202). */
object Class318Statics {
    var anInt3971: Int = 0
    var anInt3972: Int = 0
    var anInt3973: Int = 0
    var aClass243Array3974: Array<Class243?>? = arrayOfNulls<Class243>(5)
    var aClass304_3977: Class304?

    fun method2374(i: Byte) {
        aClass304_3977 = null
        val i_0_ = 108 / ((i - -83) / 41)
        aClass243Array3974 = null
    }

    fun method2375(i: Int) {
        anInt3972++
        Class202.aClass60_2671!!.method590(0)
        if (i != 16127) anInt3971 = -113
    }

    init {
        var i = 0
        while (aClass243Array3974!!.size > i) {
            aClass243Array3974!![i] = Class243()
            i++
        }
        aClass304_3977 = Class304(1)
    }
}
