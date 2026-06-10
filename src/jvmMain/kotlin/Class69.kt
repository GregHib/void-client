import Class314_Sub1.Companion.method2352

/* Class69 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class69 {
    override fun toString(): String {
        anInt1192++
        throw IllegalStateException()
    }

    companion object {
        @JvmField
        var anInt1191: Int = 0
        @JvmField
        var anInt1192: Int = 0
        @JvmField
        var anInt1193: Int = 0
        @JvmField
        var anInt1194: Int = 0
        @JvmField
        var aClass69_1195: Class69? = Class69()
        @JvmField
        var anInt1196: Int = 0
        @JvmField
        var aClass69_1197: Class69? = Class69()
        @JvmField
        var aClass69_1198: Class69? = Class69()
        @JvmField
        var aClass69_1199: Class69? = Class69()
        @JvmField
        var anInt1200: Int = 0
        var aClass173_1201: Class173? = Class173()
        @JvmField
        var anInt1202: Int = 0

        fun method720(i: Int, i_0_: Int) {
            anInt1193++
            Class168.anInt2251 = i
            synchronized(Class130.aClass60_1894!!) {
                if (i_0_ != 1226) aClass173_1201 = null
                Class130.aClass60_1894!!.method590(0)
            }
            synchronized(Class24.aClass60_355!!) {
                Class24.aClass60_355!!.method590(0)
            }
        }

        @JvmStatic
        fun method721(class348_sub42: Class348_Sub42?, class348_sub42_1_: Class348_Sub42?, i: Int) {
            do {
                try {
                    if (class348_sub42_1_!!.aClass348_Sub42_7060 != null) class348_sub42_1_.method3162(true)
                    anInt1194++
                    class348_sub42_1_.aClass348_Sub42_7063 = class348_sub42
                    class348_sub42_1_.aClass348_Sub42_7060 = class348_sub42!!.aClass348_Sub42_7060
                    class348_sub42_1_.aClass348_Sub42_7060!!.aClass348_Sub42_7063 = class348_sub42_1_
                    class348_sub42_1_.aClass348_Sub42_7063!!.aClass348_Sub42_7060 = class348_sub42_1_
                    if (i == -1) break
                    aClass69_1199 = null
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(runtimeexception, ("kea.B(" + (if (class348_sub42 != null) "{...}" else "null") + ',' + (if (class348_sub42_1_ != null) "{...}" else "null") + ',' + i + ')'))
                }
                break
            } while (false)
        }

        @JvmStatic
        fun method722(i: Int) {
            aClass69_1198 = null
            if (i != 13569) aClass69_1199 = null
            aClass69_1197 = null
            aClass69_1195 = null
            aClass69_1199 = null
            aClass173_1201 = null
        }

        fun method723(i: Int, i_2_: Int, i_3_: Byte): Boolean {
            anInt1196++
            if (i_3_ >= -66) return true
            return (method2352(113, i_2_, i) and Class156.method1238(i, i_2_, -29))
        }

        fun method724(i: Int, i_4_: Int, i_5_: Int): Boolean {
            anInt1191++
            if (i_5_ != 393216) Companion.method723(25, 30, (-113).toByte())
            return method2352(124, i_4_, i) or ((0x60000 and i) != 0) || Class273.method2056(i, 90, i_4_) || Companion.method723(i, i_4_, (-120).toByte())
        }
    }
}
