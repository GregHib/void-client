/* Class32 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class32 internal constructor(private val anInt448: Int) {
    private val aClass348_Sub42Array452: Array<Class348_Sub42?>
    private var aLong453: Long = 0
    private var aClass348_Sub42_454: Class348_Sub42? = null
    fun method334(l: Long, i: Byte): Class348_Sub42? {
        try {
            aLong453 = l
            anInt449++
            val class348_sub42 = aClass348_Sub42Array452[((anInt448 - 1).toLong() and l).toInt()]!!
            aClass348_Sub42_454 = class348_sub42.aClass348_Sub42_7063
            while (class348_sub42 !== aClass348_Sub42_454) {
                if (aClass348_Sub42_454!!.aLong7057 == l) {
                    val class348_sub42_0_ = aClass348_Sub42_454
                    aClass348_Sub42_454 = (aClass348_Sub42_454!!.aClass348_Sub42_7063)
                    return class348_sub42_0_
                }
                aClass348_Sub42_454 = (aClass348_Sub42_454!!.aClass348_Sub42_7063)
            }
            if (i <= 0) aClass348_Sub42_454 = null
            aClass348_Sub42_454 = null
            return null
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "ib.C(" + l + ',' + i + ')')
        }
    }

    fun method335(class348_sub42: Class348_Sub42?, i: Int, l: Long) {
        try {
            anInt447++
            if (i != -8098) aClass348_Sub42_454 = null
            if (class348_sub42!!.aClass348_Sub42_7060 != null) class348_sub42.method3162(true)
            val class348_sub42_1_ = aClass348_Sub42Array452[(l and (anInt448 - 1).toLong()).toInt()]!!
            class348_sub42.aClass348_Sub42_7060 = class348_sub42_1_.aClass348_Sub42_7060
            class348_sub42.aClass348_Sub42_7063 = class348_sub42_1_
            class348_sub42.aClass348_Sub42_7060!!.aClass348_Sub42_7063 = class348_sub42
            class348_sub42.aClass348_Sub42_7063!!.aClass348_Sub42_7060 = class348_sub42
            class348_sub42.aLong7057 = l
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ib.A(" + (if (class348_sub42 != null) "{...}" else "null") + ',' + i + ',' + l + ')'))
        }
    }

    init {
        aClass348_Sub42Array452 = arrayOfNulls<Class348_Sub42>(anInt448)
        for (i_2_ in 0..<anInt448) {
            aClass348_Sub42Array452[i_2_] = Class348_Sub42()
            val class348_sub42 = aClass348_Sub42Array452[i_2_]!!
            class348_sub42.aClass348_Sub42_7063 = class348_sub42
            class348_sub42.aClass348_Sub42_7060 = class348_sub42
        }
    }

    fun method336(bool: Boolean): Class348_Sub42? {
        anInt455++
        if (aClass348_Sub42_454 == null) return null
        if (bool != true) return null
        val class348_sub42 = aClass348_Sub42Array452[(aLong453 and (-1 + anInt448).toLong()).toInt()]
        while (class348_sub42 !== aClass348_Sub42_454) {
            if (aLong453 == aClass348_Sub42_454!!.aLong7057) {
                val class348_sub42_3_ = aClass348_Sub42_454
                aClass348_Sub42_454 = (aClass348_Sub42_454!!.aClass348_Sub42_7063)
                return class348_sub42_3_
            }
            aClass348_Sub42_454 = (aClass348_Sub42_454!!.aClass348_Sub42_7063)
        }
        aClass348_Sub42_454 = null
        return null
    }

    companion object {
        @JvmField
        var anInt447: Int = 0
        @JvmField
        var anInt449: Int = 0
        @JvmField
        var anInt450: Int = 0
        @JvmField
        var anInt451: Int = -1
        @JvmField
        var anInt455: Int = 0
    }
}
