/* Class318_Sub10 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class318_Sub10 private constructor(i: Int, bool: Boolean) : Class318() {
    var aBoolean6470: Boolean = false
    private var aLong6471: Long = 0
    private var aLong6472: Long = 0
    private var aBoolean6473 = false
    var aClass318_Sub9_Sub2_Sub1Array6475: Array<Class318_Sub9_Sub2_Sub1?>
    var anInt6476: Int = 0
    private var aClass243_6478: Class243
    var aClass262_6479: Class262
    private var anInt6480: Int
    var aClass98_6481: Class98
    var aBoolean6482: Boolean
    var anInt6483: Int = 0
    private var aBoolean6484: Boolean
    private var anInt6485: Int

    fun method2525(): Class98 {
        return this.aClass98_6481
    }

    fun method2528(var_ha: ha?) {
        this.aClass98_6481.aClass88_1569.method845(89.toByte())
        var class318_sub7 = aClass243_6478.method1872(8) as Class318_Sub7?
        while (class318_sub7 != null) {
            class318_sub7.method2511(true, var_ha, aLong6471)
            class318_sub7 = aClass243_6478.method1878(126.toByte()) as Class318_Sub7?
        }
    }

    fun method2529() {
        aBoolean6484 = true
    }

    fun method2530() {
        this.aBoolean6470 = true
        var class348_sub42_sub20 = (this.aClass262_6479.method1995(4) as Class348_Sub42_Sub20?)
        while (class348_sub42_sub20 != null) {
            if (class348_sub42_sub20.aClass174_9704!!.anInt2296 == 1) class348_sub42_sub20.method3162(true)
            class348_sub42_sub20 = this.aClass262_6479.method1990(89.toByte()) as Class348_Sub42_Sub20?
        }
        for (i in (this.aClass318_Sub9_Sub2_Sub1Array6475).indices) {
            if (this.aClass318_Sub9_Sub2_Sub1Array6475[i] != null) {
                this.aClass318_Sub9_Sub2_Sub1Array6475[i]!!.method2520()
                this.aClass318_Sub9_Sub2_Sub1Array6475[i] = null
            }
        }
        this.anInt6476 = 0
        aClass243_6478 = Class243()
        anInt6480 = 0
        this.aClass262_6479 = Class262()
        anInt6485 = 0
        this.method2373(false)
        Class348_Sub51.aClass318_Sub10Array7249!![Class258_Sub3.anInt8550] = this
        Class258_Sub3.anInt8550 = (Class258_Sub3.anInt8550 + 1 and Class348_Sub42_Sub9.anIntArray9558!![Class348_Sub6.anInt6637])
    }

    private fun method2531(i: Int, bool: Boolean) {
        Class152.aClass243_2077!!.method1869(-88, this)
        aLong6472 = i.toLong()
        aLong6471 = i.toLong()
        aBoolean6484 = true
        this.aBoolean6482 = bool
    }

    private fun method2532(var_ha: ha?, class129s: Array<Class129?>?, bool: Boolean) {
        for (i in 0..31) aBooleanArray6474!![i] = false
        var class318_sub7 = aClass243_6478.method1872(8) as Class318_Sub7?
        while_110_@ while (class318_sub7 != null) {
            if (class129s != null) {
                for (i in class129s.indices) {
                    if ((class318_sub7!!.aClass129_6436 == class129s[i]) || (class318_sub7.aClass129_6436 == class129s[i]!!.aClass129_1888)) {
                        aBooleanArray6474!![i] = true
                        class318_sub7.method2507(true)
                        class318_sub7.aBoolean6446 = false
                        class318_sub7 = aClass243_6478.method1878((-28).toByte()) as? Class318_Sub7?
                        continue@while_110_
                    }
                }
            }
            if (!bool) {
                if (class318_sub7.anInt6447 == 0) {
                    class318_sub7.method2373(false)
                    anInt6480--
                } else class318_sub7.aBoolean6446 = true
            }
            class318_sub7 = aClass243_6478.method1878((-28).toByte()) as? Class318_Sub7?
        }
        if (class129s != null) {
            for (i in class129s.indices) {
                if (i == 32 || anInt6480 == 32) break
                if (!aBooleanArray6474!![i]) {
                    val class318_sub7 = Class318_Sub7(var_ha, class129s[i], this, aLong6472)
                    aClass243_6478.method1869(-126, class318_sub7)
                    anInt6480++
                    aBooleanArray6474!![i] = true
                }
            }
        }
    }

    fun method2533(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
        this.anInt6483 = i
    }

    fun method2534() {
        aBoolean6473 = true
    }

    fun method2535(var_ha: ha?, l: Long): Boolean {
        if (aLong6472 != aLong6471) method2534()
        else method2537()
        if (l - aLong6472 > 750L) {
            method2530()
            return false
        }
        val i = (l - aLong6471).toInt()
        if (aBoolean6484) {
            var class318_sub7 = aClass243_6478.method1872(8) as? Class318_Sub7?
            while (class318_sub7 != null) {
                for (i_4_ in 0..<class318_sub7.aClass181_6441!!.anInt2422) class318_sub7.method2513(var_ha, 1, l, 3, !aBoolean6473)
                class318_sub7 = aClass243_6478.method1878(122.toByte()) as? Class318_Sub7?
            }
            aBoolean6484 = false
        }
        var class318_sub7 = aClass243_6478.method1872(8) as? Class318_Sub7?
        while (class318_sub7 != null) {
            class318_sub7.method2513(var_ha, i, l, 3, !aBoolean6473)
            class318_sub7 = aClass243_6478.method1878((-72).toByte()) as? Class318_Sub7?
        }
        aLong6471 = l
        return true
    }

    fun method2536(var_ha: ha?, l: Long, class129s: Array<Class129?>?, class342s: Array<Class342?>?, bool: Boolean) {
        if (!this.aBoolean6470) {
            method2532(var_ha, class129s, bool)
            method2538(class342s, bool)
            aLong6472 = l
        }
    }

    private fun method2537() {
        aBoolean6473 = false
    }

    private fun method2538(class342s: Array<Class342?>?, bool: Boolean) {
        for (i in 0..7) aBooleanArray6477!![i] = false
        var class348_sub42_sub20 = (this.aClass262_6479.method1995(4) as Class348_Sub42_Sub20?)
        while_112_@ while (class348_sub42_sub20 != null) {
            if (class342s != null) {
                for (i in class342s.indices) {
                    if ((class348_sub42_sub20!!.aClass342_9702) == class342s[i] || ((class348_sub42_sub20.aClass342_9702) == class342s[i]!!.aClass342_4248)) {
                        aBooleanArray6477!![i] = true
                        class348_sub42_sub20.method3279(2)
                        class348_sub42_sub20 = this.aClass262_6479.method1990(85.toByte()) as Class348_Sub42_Sub20?
                        continue@while_112_
                    }
                }
            }
            if (!bool) {
                class348_sub42_sub20.method2715(108.toByte())
                anInt6485--
                if (class348_sub42_sub20.method3164(1.toByte())) {
                    class348_sub42_sub20.method3162(true)
                    Class318_Sub7.Companion.anInt6450--
                }
            }
            class348_sub42_sub20 = this.aClass262_6479.method1990(85.toByte()) as Class348_Sub42_Sub20?
        }
        if (class342s != null) {
            for (i in class342s.indices) {
                if (i == 8 || anInt6485 == 8) break
                if (!aBooleanArray6477!![i]) {
                    var class348_sub42_sub20: Class348_Sub42_Sub20? = null
                    if ((class342s[i]!!.method2685((-13).toByte()).anInt2296) == 1 && Class318_Sub7.Companion.anInt6450 < 32) {
                        class348_sub42_sub20 = Class348_Sub42_Sub20(class342s[i], this)
                        Class367_Sub11.aClass32_7415!!.method335(class348_sub42_sub20, -8098, class342s[i]!!.anInt4245.toLong())
                        Class318_Sub7.Companion.anInt6450++
                    }
                    if (class348_sub42_sub20 == null) class348_sub42_sub20 = Class348_Sub42_Sub20(class342s[i], this)
                    this.aClass262_6479.method1999(class348_sub42_sub20, -20180)
                    anInt6485++
                    aBooleanArray6477!![i] = true
                }
            }
        }
    }

    fun method2539(): Class98 {
        this.aClass98_6481.aClass88_1569.method845(43.toByte())
        for (i in (this.aClass318_Sub9_Sub2_Sub1Array6475).indices) {
            if ((this.aClass318_Sub9_Sub2_Sub1Array6475[i] != null) && this.aClass318_Sub9_Sub2_Sub1Array6475[i]!!.aClass318_Sub7_10419 != null) this.aClass98_6481.aClass88_1569.method844((this.aClass318_Sub9_Sub2_Sub1Array6475[i]), true)
        }
        return this.aClass98_6481
    }

    fun method2540(l: Long) {
        aLong6472 = l
    }

    init {
        aClass243_6478 = Class243()
        anInt6480 = 0
        this.aClass262_6479 = Class262()
        this.aBoolean6482 = false
        anInt6485 = 0
        aBoolean6484 = false
        this.aClass98_6481 = Class98()
        this.aClass318_Sub9_Sub2_Sub1Array6475 = arrayOfNulls<Class318_Sub9_Sub2_Sub1>(8192)
        method2531(i, bool)
    }

    companion object {
        private var aBooleanArray6474: BooleanArray? = BooleanArray(32)
        private var aBooleanArray6477: BooleanArray? = BooleanArray(8)
        fun method2526(i: Int, bool: Boolean): Class318_Sub10 {
            if (Class258_Sub3.anInt8550 != Class376.anInt4559) {
                val class318_sub10 = Class348_Sub51.aClass318_Sub10Array7249!![Class376.anInt4559]!!
                Class376.anInt4559 = Class376.anInt4559 + 1 and (Class348_Sub42_Sub9.anIntArray9558!![Class348_Sub6.anInt6637])
                class318_sub10.method2531(i, bool)
                return class318_sub10
            }
            return Class318_Sub10(i, bool)
        }

        @JvmStatic
        fun method2527() {
            aBooleanArray6474 = null
            aBooleanArray6477 = null
        }
    }
}
