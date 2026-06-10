import java.io.IOException
import java.net.Socket
import kotlin.math.atan2

class Class238_Sub1 internal constructor(private val aSocket5836: Socket, i: Int) : Class238() {
    private var aClass376_5834: Class376?
    private val aClass208_5837: Class208

    @Throws(IOException::class)
    override fun method1706(i: Int, i_0_: Int, i_1_: Int, `is`: ByteArray) {
        anInt5833++
        aClass208_5837.method1528(5.toByte(), i_1_, i, `is`)
    }

    override fun method1702(i: Int) {
        anInt5828++
        aClass376_5834!!.method3618(0)
        val i_2_ = 29 / ((-25 - i) / 38)
        aClass208_5837.method1527(-21179)
    }

    override fun method1700(i: Byte) {
        anInt5839++
        try {
            aSocket5836.close()
        } catch (ioexception: IOException) {
            /* empty */
        }
        aClass376_5834!!.method3615(15984)
        if (i.toInt() == 36) aClass208_5837.method1526((-99).toByte())
    }

    @Throws(IOException::class)
    override fun method1701(i: Int, i_19_: Int, i_20_: Byte, `is`: ByteArray): Int {
        val i_21_ = 84 / ((-56 - i_20_) / 47)
        anInt5831++
        return aClass376_5834!!.method3617(i, i_19_, 0, `is`)
    }

    @Throws(IOException::class)
    override fun method1705(i: Int, i_22_: Int): Boolean {
        if (i_22_ <= 91) aClass376_5834 = null
        anInt5838++
        return aClass376_5834!!.method3619(i, false)
    }

    init {
        aSocket5836.setSoTimeout(30000)
        aSocket5836.setTcpNoDelay(true)
        aClass376_5834 = Class376(aSocket5836.getInputStream(), i)
        aClass208_5837 = Class208(aSocket5836.getOutputStream(), i)
    }

    protected fun finalize() {
        anInt5835++
        method1700(36.toByte())
    }

    companion object {
        @JvmField
        var anInt5828: Int = 0
        @JvmField
        var anInt5829: Int = 0
        @JvmField
        var anInt5830: Int = 0
        @JvmField
        var anInt5831: Int = 0
        @JvmField
        var anInt5832: Int = -1
        @JvmField
        var anInt5833: Int = 0
        @JvmField
        var anInt5835: Int = 0
        @JvmField
        var anInt5838: Int = 0
        @JvmField
        var anInt5839: Int = 0
        @JvmField
        var aBoolean5840: Boolean = true

        @JvmStatic
        fun method1707(i: Int) {
            Class322.aClass308_4036!!.method2303(true)
            anInt5829++
        }

        @JvmStatic
        fun method1708(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Byte, class348_sub9: Class348_Sub9) {
            anInt5830++
            if (class348_sub9.anInt6685 != -1 || class348_sub9.anIntArray6697 != null) {
                var i_7_ = 0
                val i_8_ = ((class348_sub9.anInt6677 * Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7234!!.method1838(-32350)) shr 8)
                if (class348_sub9.anInt6698 >= i_3_) {
                    if (class348_sub9.anInt6678 > i_3_) i_7_ += -i_3_ + class348_sub9.anInt6678
                } else i_7_ += -class348_sub9.anInt6698 + i_3_
                if (i_5_ <= class348_sub9.anInt6687) {
                    if (class348_sub9.anInt6689 > i_5_) i_7_ += -i_5_ + class348_sub9.anInt6689
                } else i_7_ += -class348_sub9.anInt6687 + i_5_
                if (class348_sub9.anInt6694 == 0 || (-256 + i_7_ > class348_sub9.anInt6694) || Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7234!!.method1838(-32350) == 0 || class348_sub9.anInt6693 != i_4_) {
                    if (class348_sub9.aClass348_Sub16_Sub5_6676 != null) {
                        Class348_Sub43.aClass348_Sub16_Sub4_7065!!.method2880(class348_sub9.aClass348_Sub16_Sub5_6676!!)
                        class348_sub9.aClass348_Sub19_Sub1_6686 = null
                        class348_sub9.aClass348_Sub16_Sub5_6676 = null
                        class348_sub9.aClass348_Sub10_6688 = null
                    }
                    if (class348_sub9.aClass348_Sub16_Sub5_6673 != null) {
                        Class348_Sub43.aClass348_Sub16_Sub4_7065!!.method2880(class348_sub9.aClass348_Sub16_Sub5_6673!!)
                        class348_sub9.aClass348_Sub16_Sub5_6673 = null
                        class348_sub9.aClass348_Sub10_6683 = null
                        class348_sub9.aClass348_Sub19_Sub1_6692 = null
                    }
                } else {
                    i_7_ -= 256
                    if (i_7_ < 0) i_7_ = 0
                    val i_9_ = ((class348_sub9.anInt6694 + -i_7_) * i_8_ / class348_sub9.anInt6694)
                    Class132.aPlayer_1907!!.method2436(100.toByte())
                    if (i_6_.toInt() == -78) {
                        var i_10_ = 8192
                        val i_11_ = (-i_3_ + ((class348_sub9.anInt6678 + class348_sub9.anInt6698) / 2))
                        val i_12_ = (-i_5_ + ((class348_sub9.anInt6687 - -class348_sub9.anInt6689) / 2))
                        if (i_11_ != 0 || i_12_ != 0) {
                            var i_13_ = ((-Class5.anInt4638 + -(atan2(i_11_.toDouble(), i_12_.toDouble()) * 2607.5945876176133).toInt() + -4096) and 0x3fff)
                            if (i_13_ > 8192) i_13_ = 16384 - i_13_
                            val i_14_: Int
                            if (i_7_ <= 0) i_14_ = 8192
                            else if (i_7_ < 4096) i_14_ = 8192 + 8192 * i_7_ / 4096
                            else i_14_ = 16384
                            i_10_ = ((16384 - i_14_ shr 1) + i_14_ * i_13_ / 8192)
                        }
                        if ((class348_sub9.aClass348_Sub16_Sub5_6676) != null) {
                            class348_sub9.aClass348_Sub16_Sub5_6676!!.method2915(i_9_)
                            class348_sub9.aClass348_Sub16_Sub5_6676!!.method2909(i_10_)
                        } else if (class348_sub9.anInt6685 >= 0) {
                            val i_15_ = (if (class348_sub9.anInt6681 == 256 && (class348_sub9.anInt6696 == 256)) 256 else (Class299_Sub1.method2257(class348_sub9.anInt6681, class348_sub9.anInt6696, (-120).toByte())))
                            if (class348_sub9.aBoolean6674) {
                                if ((class348_sub9.aClass348_Sub10_6688) == null) class348_sub9.aClass348_Sub10_6688 = (Class348_Sub10.method2793(Class239_Sub4.aClass45_5878!!, (class348_sub9.anInt6685)))
                                if ((class348_sub9.aClass348_Sub10_6688) != null) {
                                    if ((class348_sub9.aClass348_Sub19_Sub1_6686) == null) class348_sub9.aClass348_Sub19_Sub1_6686 = class348_sub9.aClass348_Sub10_6688!!.method2791(intArrayOf(22050))
                                    if ((class348_sub9.aClass348_Sub19_Sub1_6686) != null) {
                                        val class348_sub16_sub5 = (Class348_Sub16_Sub5.method2911((class348_sub9.aClass348_Sub19_Sub1_6686!!), i_15_, i_9_ shl 6, i_10_))
                                        class348_sub16_sub5!!.method2917(-1)
                                        Class348_Sub43.aClass348_Sub16_Sub4_7065!!.method2883(class348_sub16_sub5)
                                        class348_sub9.aClass348_Sub16_Sub5_6676 = class348_sub16_sub5
                                    }
                                }
                            } else {
                                val class317 = Class317.method2372(Class129.aClass45_1878!!, (class348_sub9.anInt6685), 0)
                                if (class317 != null) {
                                    val class348_sub19_sub1 = class317.method2369().method2944(Class57.aClass163_1050!!)
                                    val class348_sub16_sub5 = (Class348_Sub16_Sub5.method2911(class348_sub19_sub1, i_15_, i_9_ shl 6, i_10_))
                                    class348_sub16_sub5!!.method2917(-1)
                                    Class348_Sub43.aClass348_Sub16_Sub4_7065!!.method2883(class348_sub16_sub5)
                                    class348_sub9.aClass348_Sub16_Sub5_6676 = class348_sub16_sub5
                                }
                            }
                        }
                        do {
                            if ((class348_sub9.aClass348_Sub16_Sub5_6673) == null) {
                                if ((class348_sub9.anIntArray6697 != null) && (i.let { class348_sub9.anInt6670 -= it; class348_sub9.anInt6670 }) <= 0) {
                                    val i_16_ = (if ((class348_sub9.anInt6681) == 256 && (class348_sub9.anInt6696) == 256) 256 else ((class348_sub9.anInt6696) + (Math.random() * (-(class348_sub9.anInt6696) + (class348_sub9.anInt6681)).toDouble()).toInt()))
                                    if (class348_sub9.aBoolean6699) {
                                        if ((class348_sub9.aClass348_Sub10_6683) == null) {
                                            val i_17_ = ((class348_sub9.anIntArray6697!!).size.toDouble() * Math.random()).toInt()
                                            class348_sub9.aClass348_Sub10_6683 = (Class348_Sub10.method2793(Class239_Sub4.aClass45_5878!!, (class348_sub9.anIntArray6697!![i_17_])))
                                        }
                                        if ((class348_sub9.aClass348_Sub10_6683) != null) {
                                            if ((class348_sub9.aClass348_Sub19_Sub1_6692) == null) class348_sub9.aClass348_Sub19_Sub1_6692 = (class348_sub9.aClass348_Sub10_6683!!.method2791(intArrayOf(22050)))
                                            if ((class348_sub9.aClass348_Sub19_Sub1_6692) != null) {
                                                val class348_sub16_sub5 = (Class348_Sub16_Sub5.method2911((class348_sub9.aClass348_Sub19_Sub1_6692!!), i_16_, i_9_ shl 6, i_10_))
                                                class348_sub16_sub5!!.method2917(0)
                                                Class348_Sub43.aClass348_Sub16_Sub4_7065!!.method2883(class348_sub16_sub5)
                                                class348_sub9.aClass348_Sub16_Sub5_6673 = class348_sub16_sub5
                                                class348_sub9.anInt6670 = ((((class348_sub9.anInt6668) - (class348_sub9.anInt6680)).toDouble() * Math.random()).toInt() + (class348_sub9.anInt6680))
                                            }
                                        }
                                    } else {
                                        val i_18_ = (Math.random() * (class348_sub9.anIntArray6697!!).size.toDouble()).toInt()
                                        val class317 = Class317.method2372((Class129.aClass45_1878!!), (class348_sub9.anIntArray6697!![i_18_]), 0)
                                        if (class317 == null) break
                                        val class348_sub19_sub1 = (class317.method2369().method2944(Class57.aClass163_1050!!))
                                        val class348_sub16_sub5 = (Class348_Sub16_Sub5.method2911(class348_sub19_sub1, i_16_, i_9_ shl 6, i_10_))
                                        class348_sub16_sub5!!.method2917(0)
                                        Class348_Sub43.aClass348_Sub16_Sub4_7065!!.method2883(class348_sub16_sub5)
                                        class348_sub9.anInt6670 = (((-(class348_sub9.anInt6680) + (class348_sub9.anInt6668)).toDouble() * Math.random()).toInt() + (class348_sub9.anInt6680))
                                        class348_sub9.aClass348_Sub16_Sub5_6673 = class348_sub16_sub5
                                    }
                                    break
                                }
                            } else {
                                class348_sub9.aClass348_Sub16_Sub5_6673!!.method2915(i_9_)
                                class348_sub9.aClass348_Sub16_Sub5_6673!!.method2909(i_10_)
                                if (!class348_sub9.aClass348_Sub16_Sub5_6673!!.method2712(4.toByte())) {
                                    class348_sub9.aClass348_Sub10_6683 = null
                                    class348_sub9.aClass348_Sub19_Sub1_6692 = null
                                    class348_sub9.aClass348_Sub16_Sub5_6673 = null
                                }
                            }
                        } while (false)
                    }
                }
            }
        }
    }
}
