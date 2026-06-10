/* Class257 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class257 {
    private var aBoolean3296 = false
    private val aClass262_3297: Class262
    private var anInt3298 = 0

    @Synchronized
    fun method1945(i: Byte, bool: Boolean) {
        if (i < -120) aBoolean3296 = bool
    }

    @Synchronized
    fun method1946(i: Int) {
        anInt3298--
        if (anInt3298 == 0) Class257.method1948((-109).toByte())
    }

    @Synchronized
    fun method1947(i: Int, interface19: Interface19) {
        if (!aBoolean3296) {
            if (i >= anInt3298) interface19.w(false)
            else {
                val class348_sub28 = Class348_Sub28()
                class348_sub28.anInterface19_6908 = interface19
                aClass262_3297.method1999(class348_sub28, -20180)
            }
        }
    }

    @Synchronized
    fun method1948(i: Byte) {
        while (true) {
            val class348_sub28 = aClass262_3297.method1997(8) as Class348_Sub28?
            if (class348_sub28 == null) break
            class348_sub28.anInterface19_6908!!.w(true)
            class348_sub28.method2715(69.toByte())
        }
        if (i > -22) aBoolean3296 = false
    }

    @Synchronized
    fun method1949(i: Byte) {
        anInt3298++
        val i_0_ = -68 % ((i - -79) / 45)
    }

    init {
        aClass262_3297 = Class262()
    }
}
