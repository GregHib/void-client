import Class22.Companion.method295
import Class59_Sub1.Companion.method552
import ha.Companion.method3692
import jaggl.OpenGL.Companion.glLoadIdentity
import jaggl.OpenGL.Companion.glMatrixMode
import jaggl.OpenGL.Companion.glScalef
import jaggl.OpenGL.Companion.glTranslatef
import java.awt.Canvas

class Class104 internal constructor(var_ha_Sub2: ha_Sub2?, var_s_Sub2: s_Sub2?) {
    private val anInt1612: Int
    private val anInt1613: Int
    private val aHa_Sub2_1616: ha_Sub2?
    @JvmField
    var aByteArray1617: ByteArray
    private val anInt1618: Int
    private val aS_Sub2_1622: s_Sub2?
    private var aClass232ArrayArray1623: Array<Array<Class232?>>? = null
    @JvmField
    var anInt1624: Int = 0
    private val anInt1625: Int
    fun method951(var_r: r, i: Int, i_0_: Int, i_1_: Int) {
        var i = i
        var i_0_ = i_0_
        anInt1619++
        val var_r_Sub2 = var_r as r_Sub2
        i += var_r_Sub2.anInt10489 - -1
        i_0_ += var_r_Sub2.anInt10484 + 1
        var i_2_ = this.anInt1624 * i_0_ + i
        var i_3_ = 0
        var i_4_ = var_r_Sub2.anInt10487
        var i_5_ = var_r_Sub2.anInt10482
        var i_6_ = this.anInt1624 - i_5_
        var i_7_ = 0
        if (i_0_ <= 0) {
            val i_8_ = -i_0_ + 1
            i_3_ += i_8_ * i_5_
            i_4_ -= i_8_
            i_0_ = 1
            i_2_ += i_8_ * this.anInt1624
        }
        if (anInt1612 <= i_0_ + i_4_) {
            val i_9_ = 1 + (i_4_ + i_0_ + -anInt1612)
            i_4_ -= i_9_
        }
        if (i <= 0) {
            val i_10_ = 1 - i
            i_5_ -= i_10_
            i_2_ += i_10_
            i = 1
            i_6_ += i_10_
            i_7_ += i_10_
            i_3_ += i_10_
        }
        if (i_5_ + i >= this.anInt1624) {
            val i_11_ = 1 + (i - -i_5_ + -this.anInt1624)
            i_7_ += i_11_
            i_6_ += i_11_
            i_5_ -= i_11_
        }
        val i_12_ = 101 / ((-30 - i_1_) / 62)
        if (i_5_ > 0 && i_4_ > 0) {
            Class248.method1895(i_3_, this.aByteArray1617, i_4_, i_2_, i_6_, i_7_, var_r_Sub2.aByteArray10486, i_5_, 121.toByte())
            method952(i_4_, i_5_, i, -1, i_0_)
        }
    }

    private fun method952(i: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int) {
        anInt1629++
        if (aClass232ArrayArray1623 != null) {
            val i_17_ = i_14_ + -1 shr 7
            val i_18_ = -1 + i_14_ - 1 - -i_13_ shr 7
            val i_19_ = i_15_ + i_16_ shr 7
            val i_20_ = -1 + i + i_16_ - 1 shr 7
            var i_21_ = i_17_
            while (i_18_ >= i_21_) {
                val class232s = aClass232ArrayArray1623!![i_21_]
                for (i_22_ in i_19_..i_20_) class232s[i_22_]!!.aBoolean3009 = true
                i_21_++
            }
        }
    }

    fun method954(i: Int, i_23_: Byte, i_24_: Int, var_r: r): Boolean {
        var i = i
        var i_24_ = i_24_
        anInt1630++
        val var_r_Sub2 = var_r as r_Sub2
        i_24_ += 1 + var_r_Sub2.anInt10484
        if (i_23_.toInt() != 88) aClass232ArrayArray1623 = null
        i += 1 + var_r_Sub2.anInt10489
        var i_25_ = i_24_ * this.anInt1624 + i
        var i_26_ = var_r_Sub2.anInt10487
        var i_27_ = var_r_Sub2.anInt10482
        var i_28_ = -i_27_ + this.anInt1624
        if (i_24_ <= 0) {
            val i_29_ = -i_24_ + 1
            i_26_ -= i_29_
            i_24_ = 1
            i_25_ += this.anInt1624 * i_29_
        }
        if (i_26_ + i_24_ >= anInt1612) {
            val i_30_ = -anInt1612 + (1 + (i_24_ + i_26_))
            i_26_ -= i_30_
        }
        if (i <= 0) {
            val i_31_ = -i + 1
            i_27_ -= i_31_
            i_25_ += i_31_
            i_28_ += i_31_
            i = 1
        }
        if (this.anInt1624 <= i - -i_27_) {
            val i_32_ = -this.anInt1624 + 1 + (i + i_27_)
            i_27_ -= i_32_
            i_28_ += i_32_
        }
        if (i_27_ <= 0 || i_26_ <= 0) return false
        val i_33_ = 8
        i_28_ += (-1 + i_33_) * this.anInt1624
        return method552(i_28_, i_26_, 112.toByte(), i_33_, i_27_, i_25_, this.aByteArray1617)
    }

    fun method956(bool: Boolean, i: Int, bools: Array<BooleanArray?>, i_35_: Int, i_36_: Int, i_37_: Int) {
        aHa_Sub2_1616!!.method3728(false, 114)
        val i_38_ = 80 / ((i - 15) / 60)
        anInt1614++
        aHa_Sub2_1616.method3748(0, false)
        aHa_Sub2_1616.method3757(-2, -119)
        aHa_Sub2_1616.method3761(0, 1)
        aHa_Sub2_1616.method3753(1, 1)
        val f = 1.0f / (aHa_Sub2_1616.anInt7733 * 128).toFloat()
        if (bool) {
            for (i_51_ in 0..<anInt1625) {
                val i_52_ = i_51_ shl anInt1613
                val i_53_ = 1 + i_51_ shl anInt1613
                for (i_54_ in 0..<anInt1618) {
                    val i_55_ = i_54_ shl anInt1613
                    val i_56_ = 1 + i_54_ shl anInt1613
                    var i_57_ = i_55_
                    while_43_@ while (i_56_ > i_57_) {
                        if (-i_35_ <= i_57_ + -i_37_ && i_35_ >= -i_37_ + i_57_) {
                            var i_58_ = i_52_
                            while (i_53_ > i_58_) {
                                if (-i_35_ <= -i_36_ + i_58_ && -i_36_ + i_58_ <= i_35_ && (bools[i_35_ + i_57_ - i_37_]!![i_35_ + i_58_ + -i_36_])) {
                                    glMatrixMode(5890)
                                    glLoadIdentity()
                                    glScalef(f, f, 1.0f)
                                    glTranslatef(-i_54_.toFloat() / f, -i_51_.toFloat() / f, 1.0f)
                                    glMatrixMode(5888)
                                    aClass232ArrayArray1623!![i_54_][i_51_]!!.method1644(((-121).toByte()).toByte())
                                    break@while_43_
                                }
                                i_58_++
                            }
                        }
                        i_57_++
                    }
                }
            }
        } else {
            var i_39_ = 0
            while (anInt1625 > i_39_) {
                val i_40_ = i_39_ shl anInt1613
                val i_41_ = i_39_ + 1 shl anInt1613
                var i_42_ = 0
                while (anInt1618 > i_42_) {
                    var i_43_ = 0
                    val i_44_ = i_42_ shl anInt1613
                    val i_45_ = 1 + i_42_ shl anInt1613
                    val class348_sub49_sub1 = aHa_Sub2_1616.aClass348_Sub49_Sub1_7798
                    class348_sub49_sub1!!.anInt7197 = 0
                    var i_46_ = i_40_
                    while (i_41_ > i_46_) {
                        if (-i_35_ <= -i_36_ + i_46_ && -i_36_ + i_46_ <= i_35_) {
                            var i_47_ = i_44_ + i_46_ * aS_Sub2_1622!!.anInt4587
                            var i_48_ = i_44_
                            while (i_45_ > i_48_) {
                                if ((-i_35_ <= -i_37_ + i_48_) && -i_37_ + i_48_ <= i_35_ && (bools[i_35_ + i_48_ - i_37_]!![i_35_ + i_46_ + -i_36_])) {
                                    val `is` = (aS_Sub2_1622.aShortArrayArray8267[i_47_])
                                    if (`is` != null) {
                                        if (aHa_Sub2_1616.aBoolean7775) {
                                            var i_50_ = 0
                                            while ((i_50_ < `is`.size)) {
                                                i_43_++
                                                class348_sub49_sub1.writeShort(107.toByte(), 0xffff and `is`[i_50_].toInt())
                                                i_50_++
                                            }
                                        } else {
                                            var i_49_ = 0
                                            while (`is`.size > i_49_) {
                                                class348_sub49_sub1.method3397(111, `is`[i_49_].toInt() and 0xffff)
                                                i_43_++
                                                i_49_++
                                            }
                                        }
                                    }
                                }
                                i_47_++
                                i_48_++
                            }
                        }
                        i_46_++
                    }
                    if (i_43_ > 0) {
                        glMatrixMode(5890)
                        glLoadIdentity()
                        glScalef(f, f, 1.0f)
                        glTranslatef(-i_42_.toFloat() / f, -i_39_.toFloat() / f, 1.0f)
                        glMatrixMode(5888)
                        aClass232ArrayArray1623!![i_42_][i_39_]!!.method1643((class348_sub49_sub1.aByteArray7154), 5123, i_43_, 70.toByte())
                    }
                    i_42_++
                }
                i_39_++
            }
        }
        glMatrixMode(5890)
        glLoadIdentity()
        glMatrixMode(5888)
    }

    fun method957(i: Int) {
        anInt1628++
        aClass232ArrayArray1623 = Array(anInt1618) { arrayOfNulls(anInt1625) }
        for (i_59_ in i..<anInt1625) {
            var i_60_ = 0
            while (anInt1618 > i_60_) {
                aClass232ArrayArray1623!![i_60_][i_59_] = Class232(aHa_Sub2_1616, this, aS_Sub2_1622, i_60_, i_59_, anInt1613, 1 + 128 * i_60_, 128 * i_59_ + 1)
                i_60_++
            }
        }
    }

    fun method959(i: Int, i_64_: Int, i_65_: Byte, var_r: r) {
        var i = i
        var i_64_ = i_64_
        anInt1621++
        val var_r_Sub2 = var_r as r_Sub2
        i_64_ += 1 + var_r_Sub2.anInt10484
        i += 1 + var_r_Sub2.anInt10489
        var i_66_ = this.anInt1624 * i_64_ + i
        var i_67_ = 0
        var i_68_ = var_r_Sub2.anInt10487
        var i_69_ = var_r_Sub2.anInt10482
        if (i_65_ < 67) method957(-40)
        var i_70_ = this.anInt1624 - i_69_
        if (i_64_ <= 0) {
            val i_71_ = -i_64_ + 1
            i_67_ += i_69_ * i_71_
            i_68_ -= i_71_
            i_64_ = 1
            i_66_ += i_71_ * this.anInt1624
        }
        var i_72_ = 0
        if (i_64_ - -i_68_ >= anInt1612) {
            val i_73_ = -anInt1612 + (1 + i_64_) - -i_68_
            i_68_ -= i_73_
        }
        if (i <= 0) {
            val i_74_ = -i + 1
            i_69_ -= i_74_
            i_66_ += i_74_
            i = 1
            i_72_ += i_74_
            i_67_ += i_74_
            i_70_ += i_74_
        }
        if (this.anInt1624 <= i_69_ + i) {
            val i_75_ = -this.anInt1624 + (1 + (i_69_ + i))
            i_72_ += i_75_
            i_69_ -= i_75_
            i_70_ += i_75_
        }
        if (i_69_ > 0 && i_68_ > 0) {
            method295(i_72_, i_67_, 256, var_r_Sub2.aByteArray10486, i_69_, this.aByteArray1617, i_68_, i_66_, i_70_)
            method952(i_68_, i_69_, i, -1, i_64_)
        }
    }

    init {
        try {
            aHa_Sub2_1616 = var_ha_Sub2
            aS_Sub2_1622 = var_s_Sub2
            this.anInt1624 = (aS_Sub2_1622!!.anInt4592 * aS_Sub2_1622.anInt4587 shr aHa_Sub2_1616!!.anInt7731) + 2
            anInt1612 = (aS_Sub2_1622.anInt4592 * aS_Sub2_1622.anInt4590 shr aHa_Sub2_1616.anInt7731) + 2
            anInt1613 = (-aS_Sub2_1622.anInt4588 + (7 + aHa_Sub2_1616.anInt7731))
            this.aByteArray1617 = ByteArray(this.anInt1624 * anInt1612)
            anInt1618 = aS_Sub2_1622.anInt4587 shr anInt1613
            anInt1625 = aS_Sub2_1622.anInt4590 shr anInt1613
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("mha.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (var_s_Sub2 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt1610: Int = 0
        @JvmField
        var anInt1611: Int = 0
        @JvmField
        var anInt1614: Int = 0
        @JvmField
        var anInt1615: Int = 0
        @JvmField
        var anInt1619: Int = 0
        @JvmField
        var aClass221_1620: Class221? = Class221()
        @JvmField
        var anInt1621: Int = 0
        var anIntArray1626: IntArray? = IntArray(1)
        @JvmField
        var aClass45_1627: Class45? = null
        @JvmField
        var anInt1628: Int = 0
        @JvmField
        var anInt1629: Int = 0
        @JvmField
        var anInt1630: Int = 0

        @JvmStatic
        fun method953(i: Byte) {
            anIntArray1626 = null
            aClass45_1627 = null
            aClass221_1620 = null
            if (i.toInt() != 9) aClass221_1620 = null
        }

        fun method955(i: Int, i_34_: Int): Boolean {
            if (i != 22311) aClass221_1620 = null
            anInt1615++
            return i_34_ >= 4 && i_34_ <= 8
        }

        @JvmStatic
        fun method958(bool: Boolean, i: Int, var_d: d?, i_61_: Int, canvas: Canvas?, class45: Class45?): ha? {
            try {
                if (bool != true) aClass221_1620 = null
                anInt1610++
                var i_62_ = 0
                var i_63_ = 0
                if (canvas != null) {
                    val dimension = canvas.size
                    i_63_ = dimension.height
                    i_62_ = dimension.width
                }
                return method3692(i_61_, i_63_, i_62_, class45, 0, var_d, canvas, i)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("mha.E(" + bool + ',' + i + ',' + (if (var_d != null) "{...}" else "null") + ',' + i_61_ + ',' + (if (canvas != null) "{...}" else "null") + ',' + (if (class45 != null) "{...}" else "null") + ')'))
            }
        }

        @JvmStatic
        fun method960(i: Int) {
            Class98.aClass348_Sub16_Sub3_1564!!.method2877(-128)
            anInt1611++
            Class285.aClass348_Sub16_Sub3_4743 = null
            Class348_Sub43.anInt7068 = i
            Class124.aClass45_1848 = null
        }
    }
}
