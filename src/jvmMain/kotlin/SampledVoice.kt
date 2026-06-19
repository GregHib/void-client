import kotlin.math.min
import kotlin.math.sqrt
import SampledVoiceStatics.method2889
import SampledVoiceStatics.method2893
import SampledVoiceStatics.method2894
import SampledVoiceStatics.method2897
import SampledVoiceStatics.method2899
import SampledVoiceStatics.method2900
import SampledVoiceStatics.method2903
import SampledVoiceStatics.method2904
import SampledVoiceStatics.method2905
import SampledVoiceStatics.method2907
import SampledVoiceStatics.method2908
import SampledVoiceStatics.method2910
import SampledVoiceStatics.method2912
import SampledVoiceStatics.method2913
import SampledVoiceStatics.method2920
import SampledVoiceStatics.method2921
import SampledVoiceStatics.method2922
import SampledVoiceStatics.method2925

/* Class348_Sub16_Sub5 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SampledVoice internal constructor(class348_sub19_sub1: PcmSampleData, i: Int, i_185_: Int, i_186_: Int) : AudioStreamNode() {
    var anInt8969: Int
    var anInt8970 = 0
    var anInt8971 = 0
    var anInt8972 = 0
    var anInt8973 = 0
    var anInt8974 = 0
    val anInt8975: Int
    var anInt8976 = 0
    var anInt8977: Int
    var anInt8978 = 0
    var anInt8979: Int
    var anInt8980 = 0
    val aBoolean8981: Boolean
    val anInt8982: Int
    var anInt8983: Int

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
        return anInt8983 < 0 || anInt8983 >= ((this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984)!!.size shl 8
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
        if (anInt8980 == 0) i -= (i * anInt8983 / (((this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984)!!.size shl 8))
        else if (anInt8980 >= 0) i -= (i * anInt8975 / ((this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984)!!.size)
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

    override fun method2818(): AudioStreamNode? {
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
                if (NpcEntityUpdater.aBoolean3652) i = method2893(0, (this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984!!, `is`, anInt8983, i, anInt8970, anInt8974, anInt8971, anInt8978, 0, i_128_, i_125_, this)
                else i = method2913((this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984!!, `is`, anInt8983, i, anInt8976, anInt8973, 0, i_128_, i_125_, this)
            } else if (NpcEntityUpdater.aBoolean3652) i = method2899(0, 0, ((this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984!!), `is`, anInt8983, i, anInt8970, anInt8974, anInt8971, anInt8978, 0, i_128_, i_125_, this, anInt8979, i_127_)
            else i = method2903(0, 0, ((this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984!!), `is`, anInt8983, i, anInt8976, anInt8973, 0, i_128_, i_125_, this, anInt8979, i_127_)
            anInt8972 -= i
            if (anInt8972 != 0) return i
            if (method2898()) return i_126_
        }
        if (anInt8979 == 256 && (anInt8983 and 0xff) == 0) {
            if (NpcEntityUpdater.aBoolean3652) return method2910(0, (this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984!!, `is`, anInt8983, i, anInt8970, anInt8974, 0, i_126_, i_125_, this)
            return method2905(((this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984!!), `is`, anInt8983, i, anInt8976, 0, i_126_, i_125_, this)
        }
        if (NpcEntityUpdater.aBoolean3652) return method2922(0, 0, ((this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984!!), `is`, anInt8983, i, anInt8970, anInt8974, 0, i_126_, i_125_, this, anInt8979, i_127_)
        return method2925(0, 0, ((this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984!!), `is`, anInt8983, i, anInt8976, 0, i_126_, i_125_, this, anInt8979, i_127_)
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
            val class348_sub19_sub1 = (this.aClass348_Sub19_6787 as PcmSampleData)
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
        val i_167_ = (((this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984!!).size shl 8)
        if (i < -1) i = -1
        if (i > i_167_) i = i_167_
        anInt8983 = i
    }

    override fun method2816(): AudioStreamNode? {
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
        val class348_sub19_sub1 = (this.aClass348_Sub19_6787 as PcmSampleData)
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
                if (NpcEntityUpdater.aBoolean3652) i = method2900(0, (this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984!!, `is`, anInt8983, i, anInt8970, anInt8974, anInt8971, anInt8978, 0, i_190_, i_187_, this)
                else i = method2908((this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984!!, `is`, anInt8983, i, anInt8976, anInt8973, 0, i_190_, i_187_, this)
            } else if (NpcEntityUpdater.aBoolean3652) i = method2920(0, 0, ((this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984!!), `is`, anInt8983, i, anInt8970, anInt8974, anInt8971, anInt8978, 0, i_190_, i_187_, this, anInt8979, i_189_)
            else i = method2912(0, 0, ((this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984!!), `is`, anInt8983, i, anInt8976, anInt8973, 0, i_190_, i_187_, this, anInt8979, i_189_)
            anInt8972 -= i
            if (anInt8972 != 0) return i
            if (method2898()) return i_188_
        }
        if (anInt8979 == -256 && (anInt8983 and 0xff) == 0) {
            if (NpcEntityUpdater.aBoolean3652) return method2897(0, (this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984!!, `is`, anInt8983, i, anInt8970, anInt8974, 0, i_188_, i_187_, this)
            return method2921(((this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984!!), `is`, anInt8983, i, anInt8976, 0, i_188_, i_187_, this)
        }
        if (NpcEntityUpdater.aBoolean3652) return method2894(0, 0, ((this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984!!), `is`, anInt8983, i, anInt8970, anInt8974, 0, i_188_, i_187_, this, anInt8979, i_189_)
        return method2907(0, 0, ((this.aClass348_Sub19_6787 as PcmSampleData).aByteArray8984!!), `is`, anInt8983, i, anInt8976, 0, i_188_, i_187_, this, anInt8979, i_189_)
    }
}
