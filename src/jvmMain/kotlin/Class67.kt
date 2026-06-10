/* Class67 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class67 internal constructor(class45: Class45?, class45_3_: Class45?, class158: Class158?) : Interface1 {
    private val aClass158_4646: Class158?
    private var aClass324_4649: Class324? = null
    private val aClass45_4650: Class45?
    private val aClass45_4651: Class45?

    override fun method9(i: Byte, bool: Boolean) {
        if (bool) {
            val i_0_ = ((aClass158_4646!!.aClass221_4948!!.method1607(Class92.anInt1524, aClass158_4646.anInt4931, (-119).toByte())) + aClass158_4646.anInt4947)
            val i_1_ = ((aClass158_4646.aClass341_4945!!.method2679(ha_Sub2.anInt7666, aClass158_4646.anInt4936, i + 1644)) + aClass158_4646.anInt4932)
            aClass324_4649!!.method2584(null, aClass158_4646.anInt4937, aClass158_4646.anInt4940, null, aClass158_4646.anInt4935, aClass158_4646.anInt4946, aClass158_4646.anInt4936, null, i_1_, 0, 0, aClass158_4646.anInt4931, i_0_, false, aClass158_4646.anInt4943, aClass158_4646.aString4942)
        }
        if (i.toInt() == -49) anInt4642++
    }

    override fun method8(i: Byte): Boolean {
        anInt4644++
        var bool = true
        if (!aClass45_4650!!.method421(false, aClass158_4646!!.anInt4944)) bool = false
        if (!aClass45_4651!!.method421(false, aClass158_4646.anInt4944)) bool = false
        val i_2_ = -53 % ((i - 25) / 52)
        return bool
    }

    override fun method7(i: Int) {
        anInt4647++
        val class143 = Class239_Sub10.method1766((-45).toByte(), aClass158_4646!!.anInt4944, aClass45_4651!!)
        if (i == 10286) aClass324_4649 = (Class348_Sub8.aHa6654!!.method3686(class143, Class207.method1523(aClass45_4650!!, aClass158_4646.anInt4944), true))
    }

    init {
        try {
            aClass45_4651 = class45_3_
            aClass158_4646 = class158
            aClass45_4650 = class45
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("kd.<init>(" + (if (class45 != null) "{...}" else "null") + ',' + (if (class45_3_ != null) "{...}" else "null") + ',' + (if (class158 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt4642: Int = 0
        @JvmField
        var aClass105_4643: Class105? = null
        @JvmField
        var anInt4644: Int = 0
        @JvmField
        var anInt4645: Int = 0
        @JvmField
        var anInt4647: Int = 0
        @JvmField
        var anIntArray4648: IntArray? = IntArray(14)
        @JvmStatic
        fun method716(i: Int) {
            if (i == 1) {
                aClass105_4643 = null
                anIntArray4648 = null
            }
        }

        fun method717(i: Int): Boolean {
            anInt4645++
            if (Class289.aBoolean3697) {
                try {
                    Class224.method1617(125.toByte(), Class93.anApplet1530, "showVideoAd")
                    return true
                } catch (throwable: Throwable) {
                    /* empty */
                }
            }
            if (i != -2511) method716(-67)
            return false
        }

        @JvmStatic
        fun method718(class318_sub1s: Array<Class318_Sub1?>, i: Int, i_4_: Int) {
            if (i < i_4_) {
                val i_5_ = (i + i_4_) / 2
                var i_6_ = i
                val class318_sub1 = class318_sub1s[i_5_]!!
                class318_sub1s[i_5_] = class318_sub1s[i_4_]
                class318_sub1s[i_4_] = class318_sub1
                val i_7_ = class318_sub1.anInt6389
                for (i_8_ in i..<i_4_) {
                    if (class318_sub1s[i_8_]!!.anInt6389 > i_7_ + (i_8_ and 0x1)) {
                        val class318_sub1_9_: Class318_Sub1? = class318_sub1s[i_8_]
                        class318_sub1s[i_8_] = class318_sub1s[i_6_]
                        class318_sub1s[i_6_++] = class318_sub1_9_!!
                    }
                }
                class318_sub1s[i_4_] = class318_sub1s[i_6_]
                class318_sub1s[i_6_] = class318_sub1
                method718(class318_sub1s, i, i_6_ - 1)
                method718(class318_sub1s, i_6_ + 1, i_4_)
            }
        }
    }
}
