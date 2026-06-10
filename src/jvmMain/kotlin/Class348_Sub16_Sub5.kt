import kotlin.math.min
import kotlin.math.sqrt

/* Class348_Sub16_Sub5 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub16_Sub5 private constructor(class348_sub19_sub1: Class348_Sub19_Sub1, i: Int, i_185_: Int, i_186_: Int) : Class348_Sub16() {
    private var anInt8969: Int
    private var anInt8970 = 0
    private var anInt8971 = 0
    private var anInt8972 = 0
    private var anInt8973 = 0
    private var anInt8974 = 0
    private val anInt8975: Int
    private var anInt8976 = 0
    private var anInt8977: Int
    private var anInt8978 = 0
    private var anInt8979: Int
    private var anInt8980 = 0
    private val aBoolean8981: Boolean
    private val anInt8982: Int
    private var anInt8983: Int

    @Synchronized
    fun method2888(i: Int, i_0_: Int, i_1_: Int) {
        var i = i
        if (i == 0) method2926(i_0_, i_1_)
        else {
            val i_2_: Int = method2904(i_0_, i_1_)
            val i_3_: Int = method2889(i_0_, i_1_)
            if (anInt8970 == i_2_ && anInt8974 == i_3_) anInt8972 = 0
            else {
                var i_4_ = i_0_ - anInt8976
                if (anInt8976 - i_0_ > i_4_) i_4_ = anInt8976 - i_0_
                if (i_2_ - anInt8970 > i_4_) i_4_ = i_2_ - anInt8970
                if (anInt8970 - i_2_ > i_4_) i_4_ = anInt8970 - i_2_
                if (i_3_ - anInt8974 > i_4_) i_4_ = i_3_ - anInt8974
                if (anInt8974 - i_3_ > i_4_) i_4_ = anInt8974 - i_3_
                if (i > i_4_) i = i_4_
                anInt8972 = i
                anInt8969 = i_0_
                anInt8977 = i_1_
                anInt8973 = (i_0_ - anInt8976) / i
                anInt8971 = (i_2_ - anInt8970) / i
                anInt8978 = (i_3_ - anInt8974) / i
            }
        }
    }

    fun method2890(): Boolean {
        return anInt8983 < 0 || anInt8983 >= ((this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984)!!.size shl 8
    }

    @Synchronized
    fun method2891(bool: Boolean) {
        anInt8979 = (anInt8979 xor (anInt8979 shr 31)) + (anInt8979 ushr 31)
        if (bool) anInt8979 = -anInt8979
    }

    @Synchronized
    fun method2892(): Int {
        if (anInt8977 < 0) return -1
        return anInt8977
    }

    override fun method2820(): Int {
        var i = anInt8976 * 3 shr 6
        i = (i xor (i shr 31)) + (i ushr 31)
        if (anInt8980 == 0) i -= (i * anInt8983 / (((this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984)!!.size shl 8))
        else if (anInt8980 >= 0) i -= (i * anInt8975 / ((this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984)!!.size)
        return min(i, 255)
    }

    fun method2895(): Boolean {
        return anInt8972 != 0
    }

    private fun method2896() {
        if (anInt8972 != 0) {
            if (anInt8969 == -2147483648) anInt8969 = 0
            anInt8972 = 0
            method2918()
        }
    }

    private fun method2898(): Boolean {
        var i = anInt8969
        val i_35_: Int
        val i_36_: Int
        if (i == -2147483648) {
            i_36_ = 0
            i_35_ = i_36_
            i = i_35_
        } else {
            i_35_ = method2904(i, anInt8977)
            i_36_ = method2889(i, anInt8977)
        }
        if (anInt8976 != i || anInt8970 != i_35_ || anInt8974 != i_36_) {
            if (anInt8976 < i) {
                anInt8973 = 1
                anInt8972 = i - anInt8976
            } else if (anInt8976 > i) {
                anInt8973 = -1
                anInt8972 = anInt8976 - i
            } else anInt8973 = 0
            if (anInt8970 < i_35_) {
                anInt8971 = 1
                if (anInt8972 == 0 || anInt8972 > i_35_ - anInt8970) anInt8972 = i_35_ - anInt8970
            } else if (anInt8970 > i_35_) {
                anInt8971 = -1
                if (anInt8972 == 0 || anInt8972 > anInt8970 - i_35_) anInt8972 = anInt8970 - i_35_
            } else anInt8971 = 0
            if (anInt8974 < i_36_) {
                anInt8978 = 1
                if (anInt8972 == 0 || anInt8972 > i_36_ - anInt8974) anInt8972 = i_36_ - anInt8974
            } else if (anInt8974 > i_36_) {
                anInt8978 = -1
                if (anInt8972 == 0 || anInt8972 > anInt8974 - i_36_) anInt8972 = anInt8974 - i_36_
            } else anInt8978 = 0
            return false
        }
        if (anInt8969 == -2147483648) {
            anInt8969 = 0
            anInt8974 = 0
            anInt8970 = anInt8974
            anInt8976 = anInt8970
            this.method2715(79.toByte())
            return true
        }
        method2918()
        return false
    }

    @Synchronized
    fun method2901(i: Int) {
        if (anInt8979 < 0) anInt8979 = -i
        else anInt8979 = i
    }

    @Synchronized
    fun method2902(i: Int) {
        var i = i
        if (i == 0) {
            method2923(0)
            this.method2715(93.toByte())
        } else if (anInt8970 == 0 && anInt8974 == 0) {
            anInt8972 = 0
            anInt8969 = 0
            anInt8976 = 0
            this.method2715(113.toByte())
        } else {
            var i_60_ = -anInt8976
            if (anInt8976 > i_60_) i_60_ = anInt8976
            if (-anInt8970 > i_60_) i_60_ = -anInt8970
            if (anInt8970 > i_60_) i_60_ = anInt8970
            if (-anInt8974 > i_60_) i_60_ = -anInt8974
            if (anInt8974 > i_60_) i_60_ = anInt8974
            if (i > i_60_) i = i_60_
            anInt8972 = i
            anInt8969 = -2147483648
            anInt8973 = -anInt8976 / i
            anInt8971 = -anInt8970 / i
            anInt8978 = -anInt8974 / i
        }
    }

    override fun method2821(): Int {
        if (anInt8969 == 0 && anInt8972 == 0) return 0
        return 1
    }

    @Synchronized
    fun method2906(): Int {
        if (anInt8969 == -2147483648) return 0
        return anInt8969
    }

    @Synchronized
    fun method2909(i: Int) {
        method2926(method2906(), i)
    }

    @Synchronized
    fun method2914(): Int {
        if (anInt8979 < 0) return -anInt8979
        return anInt8979
    }

    @Synchronized
    fun method2915(i: Int) {
        method2926(i shl 6, method2892())
    }

    override fun method2818(): Class348_Sub16? {
        return null
    }

    @Synchronized
    fun method2916(i: Int, i_124_: Int) {
        method2888(i, i_124_, method2892())
    }

    @Synchronized
    fun method2917(i: Int) {
        anInt8980 = i
    }

    private fun method2918() {
        anInt8976 = anInt8969
        anInt8970 = method2904(anInt8969, anInt8977)
        anInt8974 = method2889(anInt8969, anInt8977)
    }

    private fun method2919(`is`: IntArray, i: Int, i_125_: Int, i_126_: Int, i_127_: Int): Int {
        var i = i
        while (anInt8972 > 0) {
            var i_128_ = i + anInt8972
            if (i_128_ > i_126_) i_128_ = i_126_
            anInt8972 += i
            if (anInt8979 == 256 && (anInt8983 and 0xff) == 0) {
                if (Class282.aBoolean3652) i = method2893(0, (this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984!!, `is`, anInt8983, i, anInt8970, anInt8974, anInt8971, anInt8978, 0, i_128_, i_125_, this)
                else i = method2913((this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984!!, `is`, anInt8983, i, anInt8976, anInt8973, 0, i_128_, i_125_, this)
            } else if (Class282.aBoolean3652) i = method2899(0, 0, ((this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984!!), `is`, anInt8983, i, anInt8970, anInt8974, anInt8971, anInt8978, 0, i_128_, i_125_, this, anInt8979, i_127_)
            else i = method2903(0, 0, ((this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984!!), `is`, anInt8983, i, anInt8976, anInt8973, 0, i_128_, i_125_, this, anInt8979, i_127_)
            anInt8972 -= i
            if (anInt8972 != 0) return i
            if (method2898()) return i_126_
        }
        if (anInt8979 == 256 && (anInt8983 and 0xff) == 0) {
            if (Class282.aBoolean3652) return method2910(0, (this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984!!, `is`, anInt8983, i, anInt8970, anInt8974, 0, i_126_, i_125_, this)
            return method2905(((this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984!!), `is`, anInt8983, i, anInt8976, 0, i_126_, i_125_, this)
        }
        if (Class282.aBoolean3652) return method2922(0, 0, ((this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984!!), `is`, anInt8983, i, anInt8970, anInt8974, 0, i_126_, i_125_, this, anInt8979, i_127_)
        return method2925(0, 0, ((this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984!!), `is`, anInt8983, i, anInt8976, 0, i_126_, i_125_, this, anInt8979, i_127_)
    }

    @Synchronized
    private fun method2923(i: Int) {
        method2926(i, method2892())
    }

    @Synchronized
    override fun method2817(`is`: IntArray, i: Int, i_159_: Int) {
        var i_159_ = i_159_
        if (anInt8969 == 0 && anInt8972 == 0) method2819(i_159_)
        else {
            val class348_sub19_sub1 = (this.aClass348_Sub19_6787 as Class348_Sub19_Sub1)
            val i_160_ = anInt8975 shl 8
            val i_161_ = anInt8982 shl 8
            val i_162_ = ((class348_sub19_sub1.aByteArray8984)!!.size shl 8)
            val i_163_ = i_161_ - i_160_
            if (i_163_ <= 0) anInt8980 = 0
            var i_164_ = i
            i_159_ += i
            if (anInt8983 < 0) {
                if (anInt8979 > 0) anInt8983 = 0
                else {
                    method2896()
                    this.method2715(83.toByte())
                    return
                }
            }
            if (anInt8983 >= i_162_) {
                if (anInt8979 < 0) anInt8983 = i_162_ - 1
                else {
                    method2896()
                    this.method2715(81.toByte())
                    return
                }
            }
            if (anInt8980 < 0) {
                if (aBoolean8981) {
                    if (anInt8979 < 0) {
                        i_164_ = method2927(`is`, i_164_, i_160_, i_159_, (class348_sub19_sub1.aByteArray8984!![anInt8975]).toInt())
                        if (anInt8983 >= i_160_) return
                        anInt8983 = i_160_ + i_160_ - 1 - anInt8983
                        anInt8979 = -anInt8979
                    }
                    while (true) {
                        i_164_ = method2919(`is`, i_164_, i_161_, i_159_, (class348_sub19_sub1.aByteArray8984!![anInt8982 - 1]).toInt())
                        if (anInt8983 < i_161_) break
                        anInt8983 = i_161_ + i_161_ - 1 - anInt8983
                        anInt8979 = -anInt8979
                        i_164_ = method2927(`is`, i_164_, i_160_, i_159_, (class348_sub19_sub1.aByteArray8984!![anInt8975]).toInt())
                        if (anInt8983 >= i_160_) break
                        anInt8983 = i_160_ + i_160_ - 1 - anInt8983
                        anInt8979 = -anInt8979
                    }
                } else if (anInt8979 < 0) {
                    while (true) {
                        i_164_ = method2927(`is`, i_164_, i_160_, i_159_, (class348_sub19_sub1.aByteArray8984!![anInt8982 - 1]).toInt())
                        if (anInt8983 >= i_160_) break
                        anInt8983 = i_161_ - 1 - (i_161_ - 1 - anInt8983) % i_163_
                    }
                } else {
                    while (true) {
                        i_164_ = method2919(`is`, i_164_, i_161_, i_159_, (class348_sub19_sub1.aByteArray8984!![anInt8975]).toInt())
                        if (anInt8983 < i_161_) break
                        anInt8983 = i_160_ + (anInt8983 - i_160_) % i_163_
                    }
                }
            } else {
                do {
                    if (anInt8980 > 0) {
                        if (aBoolean8981) {
                            if (anInt8979 < 0) {
                                i_164_ = method2927(`is`, i_164_, i_160_, i_159_, (class348_sub19_sub1.aByteArray8984!![anInt8975]).toInt())
                                if (anInt8983 >= i_160_) return
                                anInt8983 = i_160_ + i_160_ - 1 - anInt8983
                                anInt8979 = -anInt8979
                                if (--anInt8980 == 0) break
                            }
                            do {
                                i_164_ = method2919(`is`, i_164_, i_161_, i_159_, (class348_sub19_sub1.aByteArray8984!![anInt8982 - 1]).toInt())
                                if (anInt8983 < i_161_) return
                                anInt8983 = i_161_ + i_161_ - 1 - anInt8983
                                anInt8979 = -anInt8979
                                if (--anInt8980 == 0) break
                                i_164_ = method2927(`is`, i_164_, i_160_, i_159_, (class348_sub19_sub1.aByteArray8984!![anInt8975]).toInt())
                                if (anInt8983 >= i_160_) return
                                anInt8983 = i_160_ + i_160_ - 1 - anInt8983
                                anInt8979 = -anInt8979
                            } while (--anInt8980 != 0)
                        } else if (anInt8979 < 0) {
                            while (true) {
                                i_164_ = method2927(`is`, i_164_, i_160_, i_159_, (class348_sub19_sub1.aByteArray8984!![anInt8982 - 1]).toInt())
                                if (anInt8983 >= i_160_) return
                                val i_165_ = (i_161_ - 1 - anInt8983) / i_163_
                                if (i_165_ >= anInt8980) {
                                    anInt8983 += i_163_ * anInt8980
                                    anInt8980 = 0
                                    break
                                }
                                anInt8983 += i_163_ * i_165_
                                anInt8980 -= i_165_
                            }
                        } else {
                            while (true) {
                                i_164_ = method2919(`is`, i_164_, i_161_, i_159_, (class348_sub19_sub1.aByteArray8984!![anInt8975]).toInt())
                                if (anInt8983 < i_161_) return
                                val i_166_ = (anInt8983 - i_160_) / i_163_
                                if (i_166_ >= anInt8980) {
                                    anInt8983 -= i_163_ * anInt8980
                                    anInt8980 = 0
                                    break
                                }
                                anInt8983 -= i_163_ * i_166_
                                anInt8980 -= i_166_
                            }
                        }
                    }
                } while (false)
                if (anInt8979 < 0) {
                    method2927(`is`, i_164_, 0, i_159_, 0)
                    if (anInt8983 < 0) {
                        anInt8983 = -1
                        method2896()
                        this.method2715(24.toByte())
                    }
                } else {
                    method2919(`is`, i_164_, i_162_, i_159_, 0)
                    if (anInt8983 >= i_162_) {
                        anInt8983 = i_162_
                        method2896()
                        this.method2715(93.toByte())
                    }
                }
            }
        }
    }

    @Synchronized
    fun method2924(i: Int) {
        var i = i
        val i_167_ = (((this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984!!).size shl 8)
        if (i < -1) i = -1
        if (i > i_167_) i = i_167_
        anInt8983 = i
    }

    override fun method2816(): Class348_Sub16? {
        return null
    }

    @Synchronized
    private fun method2926(i: Int, i_178_: Int) {
        anInt8969 = i
        anInt8977 = i_178_
        anInt8972 = 0
        method2918()
    }

    @Synchronized
    override fun method2819(i: Int) {
        var i = i
        if (anInt8972 > 0) {
            if (i >= anInt8972) {
                if (anInt8969 == -2147483648) {
                    anInt8969 = 0
                    anInt8974 = 0
                    anInt8970 = anInt8974
                    anInt8976 = anInt8970
                    this.method2715(52.toByte())
                    i = anInt8972
                }
                anInt8972 = 0
                method2918()
            } else {
                anInt8976 += anInt8973 * i
                anInt8970 += anInt8971 * i
                anInt8974 += anInt8978 * i
                anInt8972 -= i
            }
        }
        val class348_sub19_sub1 = (this.aClass348_Sub19_6787 as Class348_Sub19_Sub1)
        val i_179_ = anInt8975 shl 8
        val i_180_ = anInt8982 shl 8
        val i_181_ = ((class348_sub19_sub1.aByteArray8984!!).size shl 8)
        val i_182_ = i_180_ - i_179_
        if (i_182_ <= 0) anInt8980 = 0
        if (anInt8983 < 0) {
            if (anInt8979 > 0) anInt8983 = 0
            else {
                method2896()
                this.method2715(60.toByte())
                return
            }
        }
        if (anInt8983 >= i_181_) {
            if (anInt8979 < 0) anInt8983 = i_181_ - 1
            else {
                method2896()
                this.method2715(93.toByte())
                return
            }
        }
        anInt8983 += anInt8979 * i
        if (anInt8980 < 0) {
            if (aBoolean8981) {
                if (anInt8979 < 0) {
                    if (anInt8983 >= i_179_) return
                    anInt8983 = i_179_ + i_179_ - 1 - anInt8983
                    anInt8979 = -anInt8979
                }
                while (anInt8983 >= i_180_) {
                    anInt8983 = i_180_ + i_180_ - 1 - anInt8983
                    anInt8979 = -anInt8979
                    if (anInt8983 >= i_179_) break
                    anInt8983 = i_179_ + i_179_ - 1 - anInt8983
                    anInt8979 = -anInt8979
                }
            } else if (anInt8979 < 0) {
                if (anInt8983 < i_179_) anInt8983 = i_180_ - 1 - (i_180_ - 1 - anInt8983) % i_182_
            } else if (anInt8983 >= i_180_) anInt8983 = i_179_ + (anInt8983 - i_179_) % i_182_
        } else {
            do {
                if (anInt8980 > 0) {
                    if (aBoolean8981) {
                        if (anInt8979 < 0) {
                            if (anInt8983 >= i_179_) return
                            anInt8983 = i_179_ + i_179_ - 1 - anInt8983
                            anInt8979 = -anInt8979
                            if (--anInt8980 == 0) break
                        }
                        do {
                            if (anInt8983 < i_180_) return
                            anInt8983 = i_180_ + i_180_ - 1 - anInt8983
                            anInt8979 = -anInt8979
                            if (--anInt8980 == 0) break
                            if (anInt8983 >= i_179_) return
                            anInt8983 = i_179_ + i_179_ - 1 - anInt8983
                            anInt8979 = -anInt8979
                        } while (--anInt8980 != 0)
                    } else if (anInt8979 < 0) {
                        if (anInt8983 >= i_179_) return
                        val i_183_ = (i_180_ - 1 - anInt8983) / i_182_
                        if (i_183_ >= anInt8980) {
                            anInt8983 += i_182_ * anInt8980
                            anInt8980 = 0
                        } else {
                            anInt8983 += i_182_ * i_183_
                            anInt8980 -= i_183_
                            return
                        }
                    } else {
                        if (anInt8983 < i_180_) return
                        val i_184_ = (anInt8983 - i_179_) / i_182_
                        if (i_184_ >= anInt8980) {
                            anInt8983 -= i_182_ * anInt8980
                            anInt8980 = 0
                        } else {
                            anInt8983 -= i_182_ * i_184_
                            anInt8980 -= i_184_
                            return
                        }
                    }
                }
            } while (false)
            if (anInt8979 < 0) {
                if (anInt8983 < 0) {
                    anInt8983 = -1
                    method2896()
                    this.method2715(126.toByte())
                }
            } else if (anInt8983 >= i_181_) {
                anInt8983 = i_181_
                method2896()
                this.method2715(55.toByte())
            }
        }
    }

    init {
        this.aClass348_Sub19_6787 = class348_sub19_sub1
        anInt8975 = class348_sub19_sub1.anInt8986
        anInt8982 = class348_sub19_sub1.anInt8985
        aBoolean8981 = class348_sub19_sub1.aBoolean8987
        anInt8979 = i
        anInt8969 = i_185_
        anInt8977 = i_186_
        anInt8983 = 0
        method2918()
    }

    private fun method2927(`is`: IntArray, i: Int, i_187_: Int, i_188_: Int, i_189_: Int): Int {
        var i = i
        while (anInt8972 > 0) {
            var i_190_ = i + anInt8972
            if (i_190_ > i_188_) i_190_ = i_188_
            anInt8972 += i
            if (anInt8979 == -256 && (anInt8983 and 0xff) == 0) {
                if (Class282.aBoolean3652) i = method2900(0, (this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984!!, `is`, anInt8983, i, anInt8970, anInt8974, anInt8971, anInt8978, 0, i_190_, i_187_, this)
                else i = method2908((this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984!!, `is`, anInt8983, i, anInt8976, anInt8973, 0, i_190_, i_187_, this)
            } else if (Class282.aBoolean3652) i = method2920(0, 0, ((this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984!!), `is`, anInt8983, i, anInt8970, anInt8974, anInt8971, anInt8978, 0, i_190_, i_187_, this, anInt8979, i_189_)
            else i = method2912(0, 0, ((this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984!!), `is`, anInt8983, i, anInt8976, anInt8973, 0, i_190_, i_187_, this, anInt8979, i_189_)
            anInt8972 -= i
            if (anInt8972 != 0) return i
            if (method2898()) return i_188_
        }
        if (anInt8979 == -256 && (anInt8983 and 0xff) == 0) {
            if (Class282.aBoolean3652) return method2897(0, (this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984!!, `is`, anInt8983, i, anInt8970, anInt8974, 0, i_188_, i_187_, this)
            return method2921(((this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984!!), `is`, anInt8983, i, anInt8976, 0, i_188_, i_187_, this)
        }
        if (Class282.aBoolean3652) return method2894(0, 0, ((this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984!!), `is`, anInt8983, i, anInt8970, anInt8974, 0, i_188_, i_187_, this, anInt8979, i_189_)
        return method2907(0, 0, ((this.aClass348_Sub19_6787 as Class348_Sub19_Sub1).aByteArray8984!!), `is`, anInt8983, i, anInt8976, 0, i_188_, i_187_, this, anInt8979, i_189_)
    }

    companion object {
        private fun method2889(i: Int, i_5_: Int): Int {
            if (i_5_ < 0) return -i
            return (i.toDouble() * sqrt(i_5_.toDouble() * 1.220703125E-4) + 0.5).toInt()
        }

        private fun method2893(i: Int, `is`: ByteArray, is_6_: IntArray, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int, class348_sub16_sub5: Class348_Sub16_Sub5): Int {
            var i = i
            var i_7_ = i_7_
            var i_8_ = i_8_
            var i_9_ = i_9_
            var i_10_ = i_10_
            var i_11_ = i_11_
            var i_12_ = i_12_
            var i_13_ = i_13_
            var i_15_ = i_15_
            i_7_ = i_7_ shr 8
            i_15_ = i_15_ shr 8
            i_9_ = i_9_ shl 2
            i_10_ = i_10_ shl 2
            i_11_ = i_11_ shl 2
            i_12_ = i_12_ shl 2
            if (((i_8_ + i_15_ - i_7_).also { i_13_ = it }) > i_14_) i_13_ = i_14_
            class348_sub16_sub5.anInt8976 += class348_sub16_sub5.anInt8973 * (i_13_ - i_8_)
            i_8_ = i_8_ shl 1
            i_13_ = i_13_ shl 1
            i_13_ -= 6
            while (i_8_ < i_13_) {
                i = `is`[i_7_++].toInt()
                is_6_[i_8_++] += i * i_9_
                i_9_ += i_11_
                is_6_[i_8_++] += i * i_10_
                i_10_ += i_12_
                i = `is`[i_7_++].toInt()
                is_6_[i_8_++] += i * i_9_
                i_9_ += i_11_
                is_6_[i_8_++] += i * i_10_
                i_10_ += i_12_
                i = `is`[i_7_++].toInt()
                is_6_[i_8_++] += i * i_9_
                i_9_ += i_11_
                is_6_[i_8_++] += i * i_10_
                i_10_ += i_12_
                i = `is`[i_7_++].toInt()
                is_6_[i_8_++] += i * i_9_
                i_9_ += i_11_
                is_6_[i_8_++] += i * i_10_
                i_10_ += i_12_
            }
            i_13_ += 6
            while (i_8_ < i_13_) {
                i = `is`[i_7_++].toInt()
                is_6_[i_8_++] += i * i_9_
                i_9_ += i_11_
                is_6_[i_8_++] += i * i_10_
                i_10_ += i_12_
            }
            class348_sub16_sub5.anInt8970 = i_9_ shr 2
            class348_sub16_sub5.anInt8974 = i_10_ shr 2
            class348_sub16_sub5.anInt8983 = i_7_ shl 8
            return i_8_ shr 1
        }

        private fun method2894(i: Int, i_16_: Int, `is`: ByteArray, is_17_: IntArray, i_18_: Int, i_19_: Int, i_20_: Int, i_21_: Int, i_22_: Int, i_23_: Int, i_24_: Int, class348_sub16_sub5: Class348_Sub16_Sub5, i_25_: Int, i_26_: Int): Int {
            var i = i
            var i_16_ = i_16_
            var i_18_ = i_18_
            var i_19_ = i_19_
            var i_22_ = i_22_
            if (i_25_ == 0 || ((i_19_ + (i_24_ + 256 - i_18_ + i_25_) / i_25_).also { i_22_ = it }) > i_23_) i_22_ = i_23_
            i_19_ = i_19_ shl 1
            i_22_ = i_22_ shl 1
            while (i_19_ < i_22_) {
                i_16_ = i_18_ shr 8
                i = `is`[i_16_ - 1].toInt()
                i = (i shl 8) + (`is`[i_16_] - i) * (i_18_ and 0xff)
                is_17_[i_19_++] += i * i_20_ shr 6
                is_17_[i_19_++] += i * i_21_ shr 6
                i_18_ += i_25_
            }
            if (i_25_ == 0 || ((((i_19_ shr 1) + (i_24_ - i_18_ + i_25_) / i_25_).also { i_22_ = it }) > i_23_)) i_22_ = i_23_
            i_22_ = i_22_ shl 1
            i_16_ = i_26_
            while (i_19_ < i_22_) {
                i = (i_16_ shl 8) + (`is`[i_18_ shr 8] - i_16_) * (i_18_ and 0xff)
                is_17_[i_19_++] += i * i_20_ shr 6
                is_17_[i_19_++] += i * i_21_ shr 6
                i_18_ += i_25_
            }
            class348_sub16_sub5.anInt8983 = i_18_
            return i_19_ shr 1
        }

        private fun method2897(i: Int, `is`: ByteArray, is_27_: IntArray, i_28_: Int, i_29_: Int, i_30_: Int, i_31_: Int, i_32_: Int, i_33_: Int, i_34_: Int, class348_sub16_sub5: Class348_Sub16_Sub5): Int {
            var i = i
            var i_28_ = i_28_
            var i_29_ = i_29_
            var i_30_ = i_30_
            var i_31_ = i_31_
            var i_32_ = i_32_
            var i_34_ = i_34_
            i_28_ = i_28_ shr 8
            i_34_ = i_34_ shr 8
            i_30_ = i_30_ shl 2
            i_31_ = i_31_ shl 2
            if (((i_29_ + i_28_ - (i_34_ - 1)).also { i_32_ = it }) > i_33_) i_32_ = i_33_
            i_29_ = i_29_ shl 1
            i_32_ = i_32_ shl 1
            i_32_ -= 6
            while (i_29_ < i_32_) {
                i = `is`[i_28_--].toInt()
                is_27_[i_29_++] += i * i_30_
                is_27_[i_29_++] += i * i_31_
                i = `is`[i_28_--].toInt()
                is_27_[i_29_++] += i * i_30_
                is_27_[i_29_++] += i * i_31_
                i = `is`[i_28_--].toInt()
                is_27_[i_29_++] += i * i_30_
                is_27_[i_29_++] += i * i_31_
                i = `is`[i_28_--].toInt()
                is_27_[i_29_++] += i * i_30_
                is_27_[i_29_++] += i * i_31_
            }
            i_32_ += 6
            while (i_29_ < i_32_) {
                i = `is`[i_28_--].toInt()
                is_27_[i_29_++] += i * i_30_
                is_27_[i_29_++] += i * i_31_
            }
            class348_sub16_sub5.anInt8983 = i_28_ shl 8
            return i_29_ shr 1
        }

        private fun method2899(i: Int, i_37_: Int, `is`: ByteArray, is_38_: IntArray, i_39_: Int, i_40_: Int, i_41_: Int, i_42_: Int, i_43_: Int, i_44_: Int, i_45_: Int, i_46_: Int, i_47_: Int, class348_sub16_sub5: Class348_Sub16_Sub5, i_48_: Int, i_49_: Int): Int {
            var i = i
            var i_37_ = i_37_
            var i_39_ = i_39_
            var i_40_ = i_40_
            var i_41_ = i_41_
            var i_42_ = i_42_
            var i_45_ = i_45_
            class348_sub16_sub5.anInt8976 -= class348_sub16_sub5.anInt8973 * i_40_
            if (i_48_ == 0 || ((i_40_ + (i_47_ - i_39_ + i_48_ - 257) / i_48_).also { i_45_ = it }) > i_46_) i_45_ = i_46_
            i_40_ = i_40_ shl 1
            i_45_ = i_45_ shl 1
            while (i_40_ < i_45_) {
                i_37_ = i_39_ shr 8
                i = `is`[i_37_].toInt()
                i = (i shl 8) + (`is`[i_37_ + 1] - i) * (i_39_ and 0xff)
                is_38_[i_40_++] += i * i_41_ shr 6
                i_41_ += i_43_
                is_38_[i_40_++] += i * i_42_ shr 6
                i_42_ += i_44_
                i_39_ += i_48_
            }
            if (i_48_ == 0 || ((((i_40_ shr 1) + (i_47_ - i_39_ + i_48_ - 1) / i_48_).also { i_45_ = it }) > i_46_)) i_45_ = i_46_
            i_45_ = i_45_ shl 1
            i_37_ = i_49_
            while (i_40_ < i_45_) {
                i = `is`[i_39_ shr 8].toInt()
                i = (i shl 8) + (i_37_ - i) * (i_39_ and 0xff)
                is_38_[i_40_++] += i * i_41_ shr 6
                i_41_ += i_43_
                is_38_[i_40_++] += i * i_42_ shr 6
                i_42_ += i_44_
                i_39_ += i_48_
            }
            i_40_ = i_40_ shr 1
            class348_sub16_sub5.anInt8976 += class348_sub16_sub5.anInt8973 * i_40_
            class348_sub16_sub5.anInt8970 = i_41_
            class348_sub16_sub5.anInt8974 = i_42_
            class348_sub16_sub5.anInt8983 = i_39_
            return i_40_
        }

        private fun method2900(i: Int, `is`: ByteArray, is_50_: IntArray, i_51_: Int, i_52_: Int, i_53_: Int, i_54_: Int, i_55_: Int, i_56_: Int, i_57_: Int, i_58_: Int, i_59_: Int, class348_sub16_sub5: Class348_Sub16_Sub5): Int {
            var i = i
            var i_51_ = i_51_
            var i_52_ = i_52_
            var i_53_ = i_53_
            var i_54_ = i_54_
            var i_55_ = i_55_
            var i_56_ = i_56_
            var i_57_ = i_57_
            var i_59_ = i_59_
            i_51_ = i_51_ shr 8
            i_59_ = i_59_ shr 8
            i_53_ = i_53_ shl 2
            i_54_ = i_54_ shl 2
            i_55_ = i_55_ shl 2
            i_56_ = i_56_ shl 2
            if (((i_52_ + i_51_ - (i_59_ - 1)).also { i_57_ = it }) > i_58_) i_57_ = i_58_
            class348_sub16_sub5.anInt8976 += class348_sub16_sub5.anInt8973 * (i_57_ - i_52_)
            i_52_ = i_52_ shl 1
            i_57_ = i_57_ shl 1
            i_57_ -= 6
            while (i_52_ < i_57_) {
                i = `is`[i_51_--].toInt()
                is_50_[i_52_++] += i * i_53_
                i_53_ += i_55_
                is_50_[i_52_++] += i * i_54_
                i_54_ += i_56_
                i = `is`[i_51_--].toInt()
                is_50_[i_52_++] += i * i_53_
                i_53_ += i_55_
                is_50_[i_52_++] += i * i_54_
                i_54_ += i_56_
                i = `is`[i_51_--].toInt()
                is_50_[i_52_++] += i * i_53_
                i_53_ += i_55_
                is_50_[i_52_++] += i * i_54_
                i_54_ += i_56_
                i = `is`[i_51_--].toInt()
                is_50_[i_52_++] += i * i_53_
                i_53_ += i_55_
                is_50_[i_52_++] += i * i_54_
                i_54_ += i_56_
            }
            i_57_ += 6
            while (i_52_ < i_57_) {
                i = `is`[i_51_--].toInt()
                is_50_[i_52_++] += i * i_53_
                i_53_ += i_55_
                is_50_[i_52_++] += i * i_54_
                i_54_ += i_56_
            }
            class348_sub16_sub5.anInt8970 = i_53_ shr 2
            class348_sub16_sub5.anInt8974 = i_54_ shr 2
            class348_sub16_sub5.anInt8983 = i_51_ shl 8
            return i_52_ shr 1
        }

        private fun method2903(i: Int, i_61_: Int, `is`: ByteArray, is_62_: IntArray, i_63_: Int, i_64_: Int, i_65_: Int, i_66_: Int, i_67_: Int, i_68_: Int, i_69_: Int, class348_sub16_sub5: Class348_Sub16_Sub5, i_70_: Int, i_71_: Int): Int {
            var i = i
            var i_61_ = i_61_
            var i_63_ = i_63_
            var i_64_ = i_64_
            var i_65_ = i_65_
            var i_67_ = i_67_
            class348_sub16_sub5.anInt8970 -= class348_sub16_sub5.anInt8971 * i_64_
            class348_sub16_sub5.anInt8974 -= class348_sub16_sub5.anInt8978 * i_64_
            if (i_70_ == 0 || ((i_64_ + (i_69_ - i_63_ + i_70_ - 257) / i_70_).also { i_67_ = it }) > i_68_) i_67_ = i_68_
            while (i_64_ < i_67_) {
                i_61_ = i_63_ shr 8
                i = `is`[i_61_].toInt()
                is_62_[i_64_++] += (((i shl 8) + (`is`[i_61_ + 1] - i) * (i_63_ and 0xff)) * i_65_ shr 6)
                i_65_ += i_66_
                i_63_ += i_70_
            }
            if (i_70_ == 0 || ((i_64_ + (i_69_ - i_63_ + i_70_ - 1) / i_70_).also { i_67_ = it }) > i_68_) i_67_ = i_68_
            i_61_ = i_71_
            while (i_64_ < i_67_) {
                i = `is`[i_63_ shr 8].toInt()
                is_62_[i_64_++] += ((i shl 8) + (i_61_ - i) * (i_63_ and 0xff)) * i_65_ shr 6
                i_65_ += i_66_
                i_63_ += i_70_
            }
            class348_sub16_sub5.anInt8970 += class348_sub16_sub5.anInt8971 * i_64_
            class348_sub16_sub5.anInt8974 += class348_sub16_sub5.anInt8978 * i_64_
            class348_sub16_sub5.anInt8976 = i_65_
            class348_sub16_sub5.anInt8983 = i_63_
            return i_64_
        }

        private fun method2904(i: Int, i_72_: Int): Int {
            if (i_72_ < 0) return i
            return ((i.toDouble() * sqrt((16384 - i_72_).toDouble() * 1.220703125E-4)) + 0.5).toInt()
        }

        private fun method2905(`is`: ByteArray, is_73_: IntArray, i: Int, i_74_: Int, i_75_: Int, i_76_: Int, i_77_: Int, i_78_: Int, class348_sub16_sub5: Class348_Sub16_Sub5): Int {
            var i = i
            var i_74_ = i_74_
            var i_75_ = i_75_
            var i_76_ = i_76_
            var i_78_ = i_78_
            i = i shr 8
            i_78_ = i_78_ shr 8
            i_75_ = i_75_ shl 2
            if (((i_74_ + i_78_ - i).also { i_76_ = it }) > i_77_) i_76_ = i_77_
            i_76_ -= 3
            while (i_74_ < i_76_) {
                is_73_[i_74_++] += `is`[i++] * i_75_
                is_73_[i_74_++] += `is`[i++] * i_75_
                is_73_[i_74_++] += `is`[i++] * i_75_
                is_73_[i_74_++] += `is`[i++] * i_75_
            }
            i_76_ += 3
            while (i_74_ < i_76_) is_73_[i_74_++] += `is`[i++] * i_75_
            class348_sub16_sub5.anInt8983 = i shl 8
            return i_74_
        }

        private fun method2907(i: Int, i_79_: Int, `is`: ByteArray, is_80_: IntArray, i_81_: Int, i_82_: Int, i_83_: Int, i_84_: Int, i_85_: Int, i_86_: Int, class348_sub16_sub5: Class348_Sub16_Sub5, i_87_: Int, i_88_: Int): Int {
            var i = i
            var i_79_ = i_79_
            var i_81_ = i_81_
            var i_82_ = i_82_
            var i_84_ = i_84_
            if (i_87_ == 0 || ((i_82_ + (i_86_ + 256 - i_81_ + i_87_) / i_87_).also { i_84_ = it }) > i_85_) i_84_ = i_85_
            while (i_82_ < i_84_) {
                i_79_ = i_81_ shr 8
                i = `is`[i_79_ - 1].toInt()
                is_80_[i_82_++] += ((i shl 8) + (`is`[i_79_] - i) * (i_81_ and 0xff)) * i_83_ shr 6
                i_81_ += i_87_
            }
            if (i_87_ == 0 || ((i_82_ + (i_86_ - i_81_ + i_87_) / i_87_).also { i_84_ = it }) > i_85_) i_84_ = i_85_
            i = i_88_
            i_79_ = i_87_
            while (i_82_ < i_84_) {
                is_80_[i_82_++] += (((i shl 8) + (`is`[i_81_ shr 8] - i) * (i_81_ and 0xff)) * i_83_ shr 6)
                i_81_ += i_79_
            }
            class348_sub16_sub5.anInt8983 = i_81_
            return i_82_
        }

        private fun method2908(`is`: ByteArray, is_89_: IntArray, i: Int, i_90_: Int, i_91_: Int, i_92_: Int, i_93_: Int, i_94_: Int, i_95_: Int, class348_sub16_sub5: Class348_Sub16_Sub5): Int {
            var i = i
            var i_90_ = i_90_
            var i_91_ = i_91_
            var i_92_ = i_92_
            var i_93_ = i_93_
            var i_95_ = i_95_
            i = i shr 8
            i_95_ = i_95_ shr 8
            i_91_ = i_91_ shl 2
            i_92_ = i_92_ shl 2
            if (((i_90_ + i - (i_95_ - 1)).also { i_93_ = it }) > i_94_) i_93_ = i_94_
            class348_sub16_sub5.anInt8970 += class348_sub16_sub5.anInt8971 * (i_93_ - i_90_)
            class348_sub16_sub5.anInt8974 += class348_sub16_sub5.anInt8978 * (i_93_ - i_90_)
            i_93_ -= 3
            while (i_90_ < i_93_) {
                is_89_[i_90_++] += `is`[i--] * i_91_
                i_91_ += i_92_
                is_89_[i_90_++] += `is`[i--] * i_91_
                i_91_ += i_92_
                is_89_[i_90_++] += `is`[i--] * i_91_
                i_91_ += i_92_
                is_89_[i_90_++] += `is`[i--] * i_91_
                i_91_ += i_92_
            }
            i_93_ += 3
            while (i_90_ < i_93_) {
                is_89_[i_90_++] += `is`[i--] * i_91_
                i_91_ += i_92_
            }
            class348_sub16_sub5.anInt8976 = i_91_ shr 2
            class348_sub16_sub5.anInt8983 = i shl 8
            return i_90_
        }

        private fun method2910(i: Int, `is`: ByteArray, is_96_: IntArray, i_97_: Int, i_98_: Int, i_99_: Int, i_100_: Int, i_101_: Int, i_102_: Int, i_103_: Int, class348_sub16_sub5: Class348_Sub16_Sub5): Int {
            var i = i
            var i_97_ = i_97_
            var i_98_ = i_98_
            var i_99_ = i_99_
            var i_100_ = i_100_
            var i_101_ = i_101_
            var i_103_ = i_103_
            i_97_ = i_97_ shr 8
            i_103_ = i_103_ shr 8
            i_99_ = i_99_ shl 2
            i_100_ = i_100_ shl 2
            if (((i_98_ + i_103_ - i_97_).also { i_101_ = it }) > i_102_) i_101_ = i_102_
            i_98_ = i_98_ shl 1
            i_101_ = i_101_ shl 1
            i_101_ -= 6
            while (i_98_ < i_101_) {
                i = `is`[i_97_++].toInt()
                is_96_[i_98_++] += i * i_99_
                is_96_[i_98_++] += i * i_100_
                i = `is`[i_97_++].toInt()
                is_96_[i_98_++] += i * i_99_
                is_96_[i_98_++] += i * i_100_
                i = `is`[i_97_++].toInt()
                is_96_[i_98_++] += i * i_99_
                is_96_[i_98_++] += i * i_100_
                i = `is`[i_97_++].toInt()
                is_96_[i_98_++] += i * i_99_
                is_96_[i_98_++] += i * i_100_
            }
            i_101_ += 6
            while (i_98_ < i_101_) {
                i = `is`[i_97_++].toInt()
                is_96_[i_98_++] += i * i_99_
                is_96_[i_98_++] += i * i_100_
            }
            class348_sub16_sub5.anInt8983 = i_97_ shl 8
            return i_98_ shr 1
        }

        @JvmStatic
        fun method2911(class348_sub19_sub1: Class348_Sub19_Sub1, i: Int, i_104_: Int, i_105_: Int): Class348_Sub16_Sub5? {
            if (class348_sub19_sub1.aByteArray8984 == null || (class348_sub19_sub1.aByteArray8984!!).size == 0) return null
            return Class348_Sub16_Sub5(class348_sub19_sub1, i, i_104_, i_105_)
        }

        private fun method2912(i: Int, i_106_: Int, `is`: ByteArray, is_107_: IntArray, i_108_: Int, i_109_: Int, i_110_: Int, i_111_: Int, i_112_: Int, i_113_: Int, i_114_: Int, class348_sub16_sub5: Class348_Sub16_Sub5, i_115_: Int, i_116_: Int): Int {
            var i = i
            var i_106_ = i_106_
            var i_108_ = i_108_
            var i_109_ = i_109_
            var i_110_ = i_110_
            var i_112_ = i_112_
            class348_sub16_sub5.anInt8970 -= class348_sub16_sub5.anInt8971 * i_109_
            class348_sub16_sub5.anInt8974 -= class348_sub16_sub5.anInt8978 * i_109_
            if (i_115_ == 0 || (((i_109_ + (i_114_ + 256 - i_108_ + i_115_) / i_115_).also { i_112_ = it }) > i_113_)) i_112_ = i_113_
            while (i_109_ < i_112_) {
                i_106_ = i_108_ shr 8
                i = `is`[i_106_ - 1].toInt()
                is_107_[i_109_++] += (((i shl 8) + (`is`[i_106_] - i) * (i_108_ and 0xff)) * i_110_ shr 6)
                i_110_ += i_111_
                i_108_ += i_115_
            }
            if (i_115_ == 0 || (((i_109_ + (i_114_ - i_108_ + i_115_) / i_115_).also { i_112_ = it }) > i_113_)) i_112_ = i_113_
            i = i_116_
            i_106_ = i_115_
            while (i_109_ < i_112_) {
                is_107_[i_109_++] += (((i shl 8) + (`is`[i_108_ shr 8] - i) * (i_108_ and 0xff)) * i_110_) shr 6
                i_110_ += i_111_
                i_108_ += i_106_
            }
            class348_sub16_sub5.anInt8970 += class348_sub16_sub5.anInt8971 * i_109_
            class348_sub16_sub5.anInt8974 += class348_sub16_sub5.anInt8978 * i_109_
            class348_sub16_sub5.anInt8976 = i_110_
            class348_sub16_sub5.anInt8983 = i_108_
            return i_109_
        }

        private fun method2913(`is`: ByteArray, is_117_: IntArray, i: Int, i_118_: Int, i_119_: Int, i_120_: Int, i_121_: Int, i_122_: Int, i_123_: Int, class348_sub16_sub5: Class348_Sub16_Sub5): Int {
            var i = i
            var i_118_ = i_118_
            var i_119_ = i_119_
            var i_120_ = i_120_
            var i_121_ = i_121_
            var i_123_ = i_123_
            i = i shr 8
            i_123_ = i_123_ shr 8
            i_119_ = i_119_ shl 2
            i_120_ = i_120_ shl 2
            if (((i_118_ + i_123_ - i).also { i_121_ = it }) > i_122_) i_121_ = i_122_
            class348_sub16_sub5.anInt8970 += class348_sub16_sub5.anInt8971 * (i_121_ - i_118_)
            class348_sub16_sub5.anInt8974 += class348_sub16_sub5.anInt8978 * (i_121_ - i_118_)
            i_121_ -= 3
            while (i_118_ < i_121_) {
                is_117_[i_118_++] += `is`[i++] * i_119_
                i_119_ += i_120_
                is_117_[i_118_++] += `is`[i++] * i_119_
                i_119_ += i_120_
                is_117_[i_118_++] += `is`[i++] * i_119_
                i_119_ += i_120_
                is_117_[i_118_++] += `is`[i++] * i_119_
                i_119_ += i_120_
            }
            i_121_ += 3
            while (i_118_ < i_121_) {
                is_117_[i_118_++] += `is`[i++] * i_119_
                i_119_ += i_120_
            }
            class348_sub16_sub5.anInt8976 = i_119_ shr 2
            class348_sub16_sub5.anInt8983 = i shl 8
            return i_118_
        }

        private fun method2920(i: Int, i_129_: Int, `is`: ByteArray, is_130_: IntArray, i_131_: Int, i_132_: Int, i_133_: Int, i_134_: Int, i_135_: Int, i_136_: Int, i_137_: Int, i_138_: Int, i_139_: Int, class348_sub16_sub5: Class348_Sub16_Sub5, i_140_: Int, i_141_: Int): Int {
            var i = i
            var i_129_ = i_129_
            var i_131_ = i_131_
            var i_132_ = i_132_
            var i_133_ = i_133_
            var i_134_ = i_134_
            var i_137_ = i_137_
            class348_sub16_sub5.anInt8976 -= class348_sub16_sub5.anInt8973 * i_132_
            if (i_140_ == 0 || (((i_132_ + (i_139_ + 256 - i_131_ + i_140_) / i_140_).also { i_137_ = it }) > i_138_)) i_137_ = i_138_
            i_132_ = i_132_ shl 1
            i_137_ = i_137_ shl 1
            while (i_132_ < i_137_) {
                i_129_ = i_131_ shr 8
                i = `is`[i_129_ - 1].toInt()
                i = (i shl 8) + (`is`[i_129_] - i) * (i_131_ and 0xff)
                is_130_[i_132_++] += i * i_133_ shr 6
                i_133_ += i_135_
                is_130_[i_132_++] += i * i_134_ shr 6
                i_134_ += i_136_
                i_131_ += i_140_
            }
            if (i_140_ == 0 || ((((i_132_ shr 1) + (i_139_ - i_131_ + i_140_) / i_140_).also { i_137_ = it }) > i_138_)) i_137_ = i_138_
            i_137_ = i_137_ shl 1
            i_129_ = i_141_
            while (i_132_ < i_137_) {
                i = (i_129_ shl 8) + (`is`[i_131_ shr 8] - i_129_) * (i_131_ and 0xff)
                is_130_[i_132_++] += i * i_133_ shr 6
                i_133_ += i_135_
                is_130_[i_132_++] += i * i_134_ shr 6
                i_134_ += i_136_
                i_131_ += i_140_
            }
            i_132_ = i_132_ shr 1
            class348_sub16_sub5.anInt8976 += class348_sub16_sub5.anInt8973 * i_132_
            class348_sub16_sub5.anInt8970 = i_133_
            class348_sub16_sub5.anInt8974 = i_134_
            class348_sub16_sub5.anInt8983 = i_131_
            return i_132_
        }

        private fun method2921(`is`: ByteArray, is_142_: IntArray, i: Int, i_143_: Int, i_144_: Int, i_145_: Int, i_146_: Int, i_147_: Int, class348_sub16_sub5: Class348_Sub16_Sub5): Int {
            var i = i
            var i_143_ = i_143_
            var i_144_ = i_144_
            var i_145_ = i_145_
            var i_147_ = i_147_
            i = i shr 8
            i_147_ = i_147_ shr 8
            i_144_ = i_144_ shl 2
            if (((i_143_ + i - (i_147_ - 1)).also { i_145_ = it }) > i_146_) i_145_ = i_146_
            i_145_ -= 3
            while (i_143_ < i_145_) {
                is_142_[i_143_++] += `is`[i--] * i_144_
                is_142_[i_143_++] += `is`[i--] * i_144_
                is_142_[i_143_++] += `is`[i--] * i_144_
                is_142_[i_143_++] += `is`[i--] * i_144_
            }
            i_145_ += 3
            while (i_143_ < i_145_) is_142_[i_143_++] += `is`[i--] * i_144_
            class348_sub16_sub5.anInt8983 = i shl 8
            return i_143_
        }

        private fun method2922(i: Int, i_148_: Int, `is`: ByteArray, is_149_: IntArray, i_150_: Int, i_151_: Int, i_152_: Int, i_153_: Int, i_154_: Int, i_155_: Int, i_156_: Int, class348_sub16_sub5: Class348_Sub16_Sub5, i_157_: Int, i_158_: Int): Int {
            var i = i
            var i_148_ = i_148_
            var i_150_ = i_150_
            var i_151_ = i_151_
            var i_154_ = i_154_
            if (i_157_ == 0 || (((i_151_ + (i_156_ - i_150_ + i_157_ - 257) / i_157_).also { i_154_ = it }) > i_155_)) i_154_ = i_155_
            i_151_ = i_151_ shl 1
            i_154_ = i_154_ shl 1
            while (i_151_ < i_154_) {
                i_148_ = i_150_ shr 8
                i = `is`[i_148_].toInt()
                i = (i shl 8) + (`is`[i_148_ + 1] - i) * (i_150_ and 0xff)
                is_149_[i_151_++] += i * i_152_ shr 6
                is_149_[i_151_++] += i * i_153_ shr 6
                i_150_ += i_157_
            }
            if (i_157_ == 0 || (((i_151_ shr 1) + (i_156_ - i_150_ + i_157_ - 1) / i_157_).also { i_154_ = it }) > i_155_) i_154_ = i_155_
            i_154_ = i_154_ shl 1
            i_148_ = i_158_
            while (i_151_ < i_154_) {
                i = `is`[i_150_ shr 8].toInt()
                i = (i shl 8) + (i_148_ - i) * (i_150_ and 0xff)
                is_149_[i_151_++] += i * i_152_ shr 6
                is_149_[i_151_++] += i * i_153_ shr 6
                i_150_ += i_157_
            }
            class348_sub16_sub5.anInt8983 = i_150_
            return i_151_ shr 1
        }

        private fun method2925(i: Int, i_168_: Int, `is`: ByteArray, is_169_: IntArray, i_170_: Int, i_171_: Int, i_172_: Int, i_173_: Int, i_174_: Int, i_175_: Int, class348_sub16_sub5: Class348_Sub16_Sub5, i_176_: Int, i_177_: Int): Int {
            var i = i
            var i_168_ = i_168_
            var i_170_ = i_170_
            var i_171_ = i_171_
            var i_173_ = i_173_
            if (i_176_ == 0 || (((i_171_ + (i_175_ - i_170_ + i_176_ - 257) / i_176_).also { i_173_ = it }) > i_174_)) i_173_ = i_174_
            while (i_171_ < i_173_) {
                i_168_ = i_170_ shr 8
                i = `is`[i_168_].toInt()
                is_169_[i_171_++] += (((i shl 8) + (`is`[i_168_ + 1] - i) * (i_170_ and 0xff)) * i_172_) shr 6
                i_170_ += i_176_
            }
            if (i_176_ == 0 || (((i_171_ + (i_175_ - i_170_ + i_176_ - 1) / i_176_).also { i_173_ = it }) > i_174_)) i_173_ = i_174_
            i_168_ = i_177_
            while (i_171_ < i_173_) {
                i = `is`[i_170_ shr 8].toInt()
                is_169_[i_171_++] += ((i shl 8) + (i_168_ - i) * (i_170_ and 0xff)) * i_172_ shr 6
                i_170_ += i_176_
            }
            class348_sub16_sub5.anInt8983 = i_170_
            return i_171_
        }
    }
}
