/* Class239_Sub16 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class239_Sub16 : Class239 {
    override fun method1714(i: Int, i_5_: Int): Int {
        if (i != 3) anInt6012 = -22
        anInt6014++
        if (i_5_ == 0 || this.aClass348_Sub51_3136.aClass239_Sub9_7256!!.method1759(i xor 0x7e5e.inv()) == 1) return 1
        return 2
    }

    override fun method1716(bool: Boolean) {
        if (bool != false) anInt6012 = 46
        if (this.anInt3138 != 0 && this.aClass348_Sub51_3136.aClass239_Sub9_7256!!.method1759(-32350) != 1) this.anInt3138 = 0
        anInt6007++
        if (this.anInt3138 < 0 || this.anInt3138 > 1) this.anInt3138 = method1710(20014)
    }

    fun method1789(i: Int): Int {
        if (i != -32350) anInt6008 = 32
        anInt6017++
        return this.anInt3138
    }

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    override fun method1712(i: Int, i_6_: Int) {
        anInt6011++
        val i_7_ = -19 / ((i - 82) / 35)
        this.anInt3138 = i_6_
    }

    fun method1790(i: Int): Boolean {
        if (i < 85) anInt6012 = -109
        anInt6015++
        return true
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    override fun method1710(i: Int): Int {
        if (i != 20014) method1789(40)
        anInt6010++
        return 1
    }

    companion object {
        @JvmField
        var anInt6007: Int = 0
        @JvmField
        var anInt6008: Int = 0
        @JvmField
        var anInt6009: Int = 0
        @JvmField
        var anInt6010: Int = 0
        @JvmField
        var anInt6011: Int = 0
        @JvmField
        var anInt6012: Int = 1
        @JvmField
        var anInt6013: Int = 0
        @JvmField
        var anInt6014: Int = 0
        @JvmField
        var anInt6015: Int = 0
        @JvmField
        var anInt6016: Int = 0
        @JvmField
        var anInt6017: Int = 0

        @JvmStatic
        fun method1788(i: Byte, l: Long): String? {
            var l = l
            try {
                anInt6016++
                if (l <= 0L || l >= 6582952005840035281L) return null
                if (l % 37L == 0L) return null
                var i_0_ = 0
                var l_1_ = l
                val i_2_ = -20 % ((i - -6) / 62)
                while ( /**/l_1_ != 0L) {
                    i_0_++
                    l_1_ /= 37L
                }
                val stringbuffer = StringBuffer(i_0_)
                while (l != 0L) {
                    val l_3_ = l
                    l /= 37L
                    var c = Class48.aCharArray852!![(l_3_ + -(37L * l)).toInt()]
                    if (c.code == 95) {
                        val i_4_ = stringbuffer.length + -1
                        stringbuffer.setCharAt(i_4_, stringbuffer.get(i_4_).uppercaseChar())
                        c = '\u00a0'
                    }
                    stringbuffer.append(c)
                }
                stringbuffer.reverse()
                stringbuffer.setCharAt(0, stringbuffer.get(0).uppercaseChar())
                return stringbuffer.toString()
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, "sba.F(" + i + ',' + l + ')')
            }
        }

        @JvmStatic
        fun method1791(i: Int, `is`: IntArray?, i_8_: Int, player: Player?) {
            do {
                try {
                    anInt6009++
                    if ((player!!.anIntArray10236) != null) {
                        var bool = true
                        var i_9_ = 0
                        while ((player.anIntArray10236!!.size > i_9_)) {
                            if ((player.anIntArray10236!![i_9_]) != `is`!![i_9_]) {
                                bool = false
                                break
                            }
                            i_9_++
                        }
                        if (bool && player.anInt10286 != -1) {
                            val class17 = (Class10.aClass87_191!!.method835(player.anInt10286, 7))
                            val i_10_ = class17.anInt248
                            if (i_10_ == 1) {
                                player.anInt10232 = 0
                                player.anInt10267 = 0
                                player.anInt10294 = 0
                                player.anInt10218 = i_8_
                                player.anInt10244 = 1
                                if (!player.aBoolean10309) Class287.method2178(player, player.anInt10267, class17, i xor 0x5df4.inv())
                            }
                            if (i_10_ == 2) player.anInt10294 = 0
                        }
                    }
                    var bool = true
                    if (i != 23946) method1791(126, null, -73, null)
                    var i_11_ = 0
                    while (`is`!!.size > i_11_) {
                        if (`is`[i_11_] != -1) bool = false
                        if (player.anIntArray10236 == null || (player.anIntArray10236!![i_11_]) == -1 || (Class10.aClass87_191!!.method835((player.anIntArray10236!![i_11_]), 7).anInt239 <= (Class10.aClass87_191!!.method835(`is`[i_11_], i xor 0x5d8d).anInt239))) {
                            player.anInt10218 = i_8_
                            player.anIntArray10236 = `is`
                            break
                        }
                        i_11_++
                    }
                    if (!bool) break
                    player.anIntArray10236 = `is`
                    player.anInt10218 = i_8_
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(runtimeexception, ("sba.E(" + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_8_ + ',' + (if (player != null) "{...}" else "null") + ')'))
                }
                break
            } while (false)
        }

        @JvmStatic
        fun method1792(i: Int, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Byte, i_16_: Int) {
            anInt6013++
            val i_17_ = Class85.method831(Class38.anInt513, i, Class132.anInt1910, -90)
            val i_18_ = Class85.method831(Class38.anInt513, i_13_, Class132.anInt1910, -94)
            val i_19_ = Class85.method831(Class113.anInt1745, i_12_, Class369.anInt4960, 77)
            val i_20_ = Class85.method831(Class113.anInt1745, i_14_, Class369.anInt4960, 59)
            val i_21_ = -27 / ((i_15_ - -6) / 55)
            for (i_22_ in i_17_..i_18_) Class135_Sub2.method1156(-27, i_20_, Class17.anIntArrayArray255!![i_22_]!!, i_19_, i_16_)
        }
    }
}
