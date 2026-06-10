import Class167.Companion.method1296
import Class286_Sub3.Companion.method2148
import Class348_Sub1_Sub3.Companion.method2732
import Class348_Sub40_Sub15.Companion.method3086
import jaggl.OpenGL.Companion.glBindFramebufferEXT
import jaggl.OpenGL.Companion.glCheckFramebufferStatusEXT
import jaggl.OpenGL.Companion.glDrawBuffer
import jaggl.OpenGL.Companion.glGenFramebuffersEXT
import jaggl.OpenGL.Companion.glReadBuffer
import kotlin.math.abs
import kotlin.math.atan2

class Class206 internal constructor(var_ha_Sub2: ha_Sub2) : Interface11 {
    private var anInt4872 = 0
    private var anInt4873: Int
    private val anInterface9Array4875 = arrayOfNulls<Interface9>(9)
    private var anInt4882 = 0
    private val aHa_Sub2_4883: ha_Sub2
    private var anInt4884 = 0
    private var anInt4886 = 0
    private var anInt4891: Int
    override fun method45(i: Byte) {
        anInt4865++
        glBindFramebufferEXT(36008, 0)
        if (i.toInt() == -47) {
            anInt4872 = anInt4872 and 0x1.inv()
            anInt4873 = method1504(-114)
        }
    }

    fun method1498(i: Int, i_0_: Int, i_1_: Int, class258_sub2: Class258_Sub2) {
        method1502(0, (-38).toByte(), class258_sub2, i, i_1_)
        if (i_0_ < -49) anInt4887++
    }

    override fun method46(i: Int) {
        glBindFramebufferEXT(36160, anInt4891)
        anInt4867++
        anInt4872 = anInt4872 or 0x4
        if (i != -11762) anInt4889 = 110
        anInt4873 = method1504(-115)
    }

    fun method1500(i: Int, i_2_: Int) {
        if (anInterface9Array4875[i_2_] != null) anInterface9Array4875[i_2_]!!.method37(-3022)
        if (i != 2983) anInt4891 = -116
        anInt4866++
        anInt4884 = anInt4884 and (1 shl i_2_).inv()
        anInterface9Array4875[i_2_] = null
    }

    private fun method1502(i: Int, i_20_: Byte, class258_sub2: Class258_Sub2, i_21_: Int, i_22_: Int) {
        anInt4876++
        if (anInt4873 == -1) throw RuntimeException()
        val i_23_ = 1 shl i_21_
        if (i_20_ > -16) aBoolean4888 = false
        if ((anInt4884 and (i_23_.inv())) == 0) {
            anInt4882 = class258_sub2.anInt8538
            anInt4886 = class258_sub2.anInt8538
        } else if (class258_sub2.anInt8538 != anInt4882 || anInt4886 != class258_sub2.anInt8538) throw RuntimeException()
        class258_sub2.method1961(anInt4873, i_22_, Class59_Sub2.anIntArray5306!![i_21_], i, -1)
        anInterface9Array4875[i_21_] = class258_sub2
        anInt4884 = anInt4884 or i_23_
    }

    fun method1503(i: Int, i_24_: Byte) {
        anInt4885++
        if (i_24_.toInt() != 3) aClass209_4874 = null
        if (anInt4873 == -1) throw RuntimeException()
        glDrawBuffer(Class59_Sub2.anIntArray5306!![i])
    }

    override fun method48(i: Int) {
        anInt4871++
        glBindFramebufferEXT(36160, 0)
        val i_25_ = 46 % ((84 - i) / 32)
        anInt4872 = anInt4872 and 0x4.inv()
        anInt4873 = method1504(-124)
    }

    private fun method1504(i: Int): Int {
        anInt4869++
        if ((0x4 and anInt4872) != 0) return 36160
        if ((0x2 and anInt4872) != 0) return 36009
        if ((0x1 and anInt4872) != 0) return 36008
        return -1
    }

    override fun method50(i: Int) {
        glBindFramebufferEXT(36009, 0)
        anInt4878++
        anInt4872 = anInt4872 and 0x2.inv()
        anInt4873 = method1504(i + 32374)
    }

    fun method1505(i: Int, i_26_: Int) {
        anInt4880++
        if ((anInt4873.inv()) == i) throw RuntimeException()
        glReadBuffer(Class59_Sub2.anIntArray5306!![i_26_])
    }

    private fun method1506(i: Int, class258_sub3: Class258_Sub3, i_27_: Int, i_28_: Int) {
        anInt4892++
        if (anInt4873 == -1) throw RuntimeException()
        val i_29_ = 1 shl i_27_
        if (i_28_ == (((i_29_.inv()) and anInt4884).inv())) {
            anInt4882 = class258_sub3.anInt8547
            anInt4886 = class258_sub3.anInt8551
        } else if ((anInt4882 != class258_sub3.anInt8547) || class258_sub3.anInt8551 != anInt4886) throw RuntimeException()
        class258_sub3.method1963(anInt4873, i, 0, Class59_Sub2.anIntArray5306!![i_27_])
        anInterface9Array4875[i_27_] = class258_sub3
        anInt4884 = anInt4884 or i_29_
    }

    override fun method47(i: Int) {
        glBindFramebufferEXT(36009, anInt4891)
        anInt4877++
        anInt4872 = anInt4872 or 0x2
        anInt4873 = method1504(i xor 0x2cec)
    }

    fun method1507(i: Int): Boolean {
        anInt4868++
        val i_30_ = glCheckFramebufferStatusEXT(anInt4873)
        val i_31_ = -56 / ((71 - i) / 45)
        return i_30_ == 36053
    }

    fun method1508(i: Int, class348_sub42_sub2: Class348_Sub42_Sub2, i_32_: Int) {
        anInt4881++
        if (anInt4873 == -1) throw RuntimeException()
        val i_33_ = 1 shl i
        if ((anInt4884 and (i_33_.inv())) == 0) {
            anInt4886 = class348_sub42_sub2.anInt8565
            anInt4882 = class348_sub42_sub2.anInt8572
        } else if ((class348_sub42_sub2.anInt8572 != anInt4882) || (anInt4886 != class348_sub42_sub2.anInt8565)) throw RuntimeException()
        val i_34_ = -68 / ((i_32_ - 64) / 49)
        class348_sub42_sub2.method3173(36161, Class59_Sub2.anIntArray5306!![i], anInt4873)
        anInterface9Array4875[i] = class348_sub42_sub2
        anInt4884 = anInt4884 or i_33_
    }

    fun method1509(class258_sub3: Class258_Sub3, i: Int, i_35_: Int) {
        method1506(i, class258_sub3, i_35_, -1)
        anInt4879++
    }

    override fun method49(i: Int) {
        anInt4893++
        glBindFramebufferEXT(36008, anInt4891)
        anInt4872 = anInt4872 or 0x1
        anInt4873 = method1504(i xor 0x6a7c)
        if (i != -27141) aBoolean4888 = false
    }

    @Throws(Throwable::class)
    protected fun finalize() {
        anInt4864++
        aHa_Sub2_4883.method3800(96, anInt4891)
//        super.finalize()
    }

    init {
        anInt4873 = -1
        check(var_ha_Sub2.aBoolean7820) { "" }
        aHa_Sub2_4883 = var_ha_Sub2
        glGenFramebuffersEXT(1, Class106.anIntArray1635, 0)
        anInt4891 = Class106.anIntArray1635!![0]
    }

    companion object {
        var anInt4864: Int = 0
        var anInt4865: Int = 0
        var anInt4866: Int = 0
        var anInt4867: Int = 0
        var anInt4868: Int = 0
        var anInt4869: Int = 0
        var anInt4870: Int = 0
        var anInt4871: Int = 0
        var aClass209_4874: Class209?
        var anInt4876: Int = 0
        var anInt4877: Int = 0
        var anInt4878: Int = 0
        var anInt4879: Int = 0
        var anInt4880: Int = 0
        var anInt4881: Int = 0
        var anInt4885: Int = 0
        var anInt4887: Int = 0
        @JvmField
        var aBoolean4888: Boolean = false
        var anInt4889: Int
        var anInt4890: Int = 0
        var anInt4892: Int = 0
        var anInt4893: Int = 0

        @JvmStatic
        fun method1499(i: Int) {
            if (i < -124) aClass209_4874 = null
        }

        @JvmStatic
        fun method1501(i: Int) {
            val i_3_ = 56 / ((i - -56) / 42)
            var i_4_ = 0
            while (i_4_ < Class147.anInt2021) {
                val class10 = Class258_Sub2.aClass10Array8531!![i_4_]
                var bool = false
                if (class10!!.aClass348_Sub16_Sub5_176 == null) {
                    class10.anInt188--
                    if (class10.anInt188 >= (if (!class10.method220((-66).toByte())) -10 else -1500)) {
                        if (class10.aByte180.toInt() == 1 && class10.aClass317_183 == null) {
                            class10.aClass317_183 = Class317.method2372(Class129.aClass45_1878!!, class10.anInt185, 0)
                            if (class10.aClass317_183 == null) {
                                i_4_++
                                continue
                            }
                            class10.anInt188 += class10.aClass317_183!!.method2370()
                        } else if (class10.method220((-39).toByte()) && ((class10.aClass348_Sub10_192 == null) || (class10.aClass348_Sub19_Sub1_189) == null)) {
                            if (class10.aClass348_Sub10_192 == null) class10.aClass348_Sub10_192 = Class348_Sub10.method2793((Class239_Sub4.aClass45_5878!!), (class10.anInt185))
                            if (class10.aClass348_Sub10_192 == null) {
                                i_4_++
                                continue
                            }
                            if (class10.aClass348_Sub19_Sub1_189 == null) {
                                class10.aClass348_Sub19_Sub1_189 = class10.aClass348_Sub10_192!!.method2791(intArrayOf(22050))
                                if (class10.aClass348_Sub19_Sub1_189 == null) {
                                    i_4_++
                                    continue
                                }
                            }
                        }
                        if (class10.anInt188 < 0) {
                            var i_5_ = 8192
                            val i_6_: Int
                            if (class10.anInt178 == 0) i_6_ = ((class10.anInt184 * (if (class10.aByte180.toInt() == 3) Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7215!!.method1838(-32350) else Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7272!!.method1838(-32350))) shr 2)
                            else {
                                val i_7_ = 0x3 and (class10.anInt178 shr 24)
                                if ((Class132.aPlayer_1907!!.plane).toInt() == i_7_) {
                                    val i_8_ = 0x1fe00 and (class10.anInt178 shl 9)
                                    val i_9_ = (Class132.aPlayer_1907!!.method2436(52.toByte()) shl 8)
                                    val i_10_ = ((class10.anInt178 and 0xff7e29) shr 16)
                                    val i_11_ = (-(Class132.aPlayer_1907!!.x) + 256 + (i_10_ shl 9) + i_9_)
                                    val i_12_ = ((class10.anInt178 and 0xffc1) shr 8)
                                    val i_13_ = (256 + (i_12_ shl 9) - ((Class132.aPlayer_1907!!.y) - i_9_))
                                    var i_14_ = (abs(i_11_) + (abs(i_13_) + -512))
                                    if (i_8_ < i_14_) {
                                        class10.anInt188 = -99999
                                        i_4_++
                                        continue
                                    }
                                    if (i_14_ < 0) i_14_ = 0
                                    i_6_ = ((i_8_ + -i_14_) * (Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7234!!.method1838(-32350) * class10.anInt184) / i_8_) shr 2
                                    if ((class10.aClass318_Sub1_172 != null) && (class10.aClass318_Sub1_172 is Class318_Sub1_Sub3)) {
                                        val class318_sub1_sub3 = ((class10.aClass318_Sub1_172) as Class318_Sub1_Sub3)
                                        val i_15_ = (class318_sub1_sub3.aShort8743)
                                        val i_16_ = (class318_sub1_sub3.aShort8750)
                                    }
                                    if (i_11_ != 0 || i_13_ != 0) {
                                        var i_17_ = (0x3fff and (-4096 + -Class5.anInt4638 + -(2607.5945876176133 * (atan2(i_11_.toDouble(), i_13_.toDouble()))).toInt()))
                                        if (i_17_ > 8192) i_17_ = 16384 + -i_17_
                                        val i_18_: Int
                                        if (i_14_ <= 0) i_18_ = 8192
                                        else if (i_14_ >= 4096) i_18_ = 16384
                                        else i_18_ = 8192 + (-i_14_ + 8192) / 4096
                                        i_5_ = ((-i_18_ + 16384 shr 1) + i_18_ * i_17_ / 8192)
                                    }
                                } else i_6_ = 0
                            }
                            if (i_6_ > 0) {
                                var class348_sub19_sub1: Class348_Sub19_Sub1? = null
                                if (class10.aByte180.toInt() != 1) {
                                    if (class10.method220((-112).toByte())) class348_sub19_sub1 = (class10.aClass348_Sub19_Sub1_189)
                                } else class348_sub19_sub1 = class10.aClass317_183!!.method2369().method2944(Class57.aClass163_1050!!)
                                val class348_sub16_sub5 = (Class348_Sub16_Sub5.method2911(class348_sub19_sub1!!, class10.anInt173, i_6_, i_5_).also { class10.aClass348_Sub16_Sub5_176 = it })
                                class348_sub16_sub5!!.method2917(-1 + class10.anInt177)
                                Class348_Sub43.aClass348_Sub16_Sub4_7065!!.method2883(class348_sub16_sub5)
                            }
                        }
                    } else bool = true
                } else if (!class10.aClass348_Sub16_Sub5_176!!.method2712(4.toByte())) bool = true
                if (bool) {
                    Class147.anInt2021--
                    var i_19_ = i_4_
                    while (Class147.anInt2021 > i_19_) {
                        Class258_Sub2.aClass10Array8531!![i_19_] = Class258_Sub2.aClass10Array8531!![i_19_ - -1]
                        i_19_++
                    }
                    i_4_--
                }
                i_4_++
            }
            anInt4890++
            if (Class74.aBoolean1236 && !method1296(true)) {
                if (Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7260!!.method1838(-32350) != 0 && Class267.anInt3428 != -1) {
                    if (Class209.Companion.aClass348_Sub16_Sub3_2718 != null) method3086(2, Class209.Companion.aClass348_Sub16_Sub3_2718, Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7260!!.method1838(-32350), Class59_Sub2_Sub1.aClass45_8667, false, 0, Class267.anInt3428)
                    else method2732(0, Class267.anInt3428, false, 124, Class59_Sub2_Sub1.aClass45_8667, Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7260!!.method1838(-32350))
                }
                Class74.aBoolean1236 = false
                Class209.Companion.aClass348_Sub16_Sub3_2718 = null
            } else if (Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7260!!.method1838(-32350) != 0 && Class267.anInt3428 != -1 && !method1296(true)) {
                Class318.anInt3973++
                val class348_sub47 = method2148(ha_Sub2.aClass351_7554, Class348_Sub23_Sub2.aClass77_9029, -107)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(118.toByte(), Class267.anInt3428)
                Class348_Sub42_Sub14.method3243(-54, class348_sub47)
                Class267.anInt3428 = -1
            }
        }

        init {
            aClass209_4874 = Class209()
            anInt4889 = 0
        }
    }
}
