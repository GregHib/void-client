/* Class143 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class143 internal constructor(`is`: ByteArray?) {
    private var aByteArrayArray1979: Array<ByteArray?>? = null
    private val aByteArray1986: ByteArray
    var anInt1988: Int
    @JvmField
    var anInt1992: Int = 0
    var anInt1993: Int

    fun method1181(class105s: Array<Class105?>?, i: Int, string: String?, i_0_: Byte): String? {
        var i = i
        try {
            anInt1989++
            if (i >= method1186(string, class105s, false)) return string
            i -= method1186("...", null, false)
            var i_1_ = -1
            if (i_0_ < 54) aClass351_1987 = null
            var i_2_ = -1
            var i_3_ = 0
            val i_4_ = string!!.length
            var string_5_ = ""
            var i_6_ = 0
            while (i_4_ > i_6_) {
                var c = string.get(i_6_)
                if (c.code == 60) i_1_ = i_6_
                else {
                    if (c.code == 62 && i_1_ != -1) {
                        val string_7_ = string.substring(i_1_ - -1, i_6_)
                        i_1_ = -1
                        if (string_7_ != "lt") {
                            if (string_7_ != "gt") {
                                if (string_7_ == "nbsp") c = '\u00a0'
                                else if (string_7_ != "shy") {
                                    if (string_7_ == "times") c = '\u00d7'
                                    else if (string_7_ != "euro") {
                                        if (string_7_ != "copy") {
                                            if (string_7_ != "reg") {
                                                if (string_7_.startsWith("img=") && class105s != null) {
                                                    try {
                                                        val i_8_ = (Class348_Sub41.method3156(true, (string_7_.substring(4))))
                                                        i_2_ = -1
                                                        i_3_ += (class105s[i_8_]!!.method966())
                                                        if (i_3_ > i) return (string_5_ + "...")
                                                        string_5_ = (string.substring(0, i_6_ - -1))
                                                    } catch (exception: Exception) {
                                                        /* empty */
                                                    }
                                                }
                                                i_6_++
                                                continue
                                            }
                                            c = '\u00ae'
                                        } else c = '\u00a9'
                                    } else c = '\u20ac'
                                } else c = '\u00ad'
                            } else c = '>'
                        } else c = '<'
                    }
                    if (i_1_ == -1) {
                        i_3_ += 0xff and (aByteArray1986[Class354.method3464(c, false).toInt() and 0xff]).toInt()
                        if (aByteArrayArray1979 != null && i_2_ != -1) i_3_ += aByteArrayArray1979!![i_2_]!![c.code].toInt()
                        i_2_ = c.code
                        var i_9_ = i_3_
                        if (aByteArrayArray1979 != null) i_9_ += aByteArrayArray1979!![c.code]!![46].toInt()
                        if (i_9_ > i) return string_5_ + "..."
                        string_5_ = string.substring(0, i_6_ + 1)
                    }
                }
                i_6_++
            }
            return string
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("oea.I(" + (if (class105s != null) "{...}" else "null") + ',' + i + ',' + (if (string != null) "{...}" else "null") + ',' + i_0_ + ')'))
        }
    }

    fun method1182(i: Int, i_10_: Byte, c: Char): Int {
        if (i_10_ > -47) aClass351_1987 = null
        anInt1985++
        if (aByteArrayArray1979 != null) return aByteArrayArray1979!![i]!![c.code].toInt()
        return 0
    }

    fun method1183(bool: Boolean, string: String?): Int {
        anInt1981++
        if (bool != true) method1181(null, 54, null, 21.toByte())
        return method1186(string, null, false)
    }

    fun method1184(i: Byte, i_11_: Int): Int {
        anInt1982++
        if (i.toInt() != -48) aByteArrayArray1979 = null
        return 0xff and aByteArray1986[i_11_].toInt()
    }

    fun method1185(class105s: Array<Class105?>?, i: Int, i_12_: Int, i_13_: Int, string: String?): Int {
        var i_12_ = i_12_
        try {
            anInt1990++
            if (i_12_ == i) i_12_ = this.anInt1992
            val i_14_ = method1188(string, intArrayOf(i_13_), Class186.aStringArray2494, 87.toByte(), class105s)
            val i_15_ = (-1 + i_14_) * i_12_
            return (this.anInt1988 + (i_15_ + this.anInt1993))
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("oea.A(" + (if (class105s != null) "{...}" else "null") + ',' + i + ',' + i_12_ + ',' + i_13_ + ',' + (if (string != null) "{...}" else "null") + ')'))
        }
    }

    fun method1186(string: String?, class105s: Array<Class105?>?, bool: Boolean): Int {
        try {
            if (bool != false) this.anInt1993 = 95
            anInt1980++
            if (string == null) return 0
            var i = -1
            var i_16_ = -1
            var i_17_ = 0
            val i_18_ = string.length
            for (i_19_ in 0..<i_18_) {
                var c = string.get(i_19_)
                if (c.code == 60) i = i_19_
                else {
                    if (c.code == 62 && i != -1) {
                        val string_20_ = string.substring(1 + i, i_19_)
                        i = -1
                        if (string_20_ == "lt") c = '<'
                        else if (string_20_ != "gt") {
                            if (string_20_ != "nbsp") {
                                if (string_20_ == "shy") c = '\u00ad'
                                else if (string_20_ != "times") {
                                    if (string_20_ != "euro") {
                                        if (string_20_ != "copy") {
                                            if (string_20_ == "reg") c = '\u00ae'
                                            else {
                                                if (string_20_.startsWith("img=") && class105s != null) {
                                                    try {
                                                        val i_21_ = (Class348_Sub41.method3156(true, (string_20_.substring(4))))
                                                        i_16_ = -1
                                                        i_17_ += (class105s[i_21_]!!.method966())
                                                    } catch (exception: Exception) {
                                                        /* empty */
                                                    }
                                                }
                                                continue
                                            }
                                        } else c = '\u00a9'
                                    } else c = '\u20ac'
                                } else c = '\u00d7'
                            } else c = '\u00a0'
                        } else c = '>'
                    }
                    if (i == -1) {
                        i_17_ += 0xff and (aByteArray1986[Class354.method3464(c, false).toInt() and 0xff]).toInt()
                        if (aByteArrayArray1979 != null && i_16_ != -1) i_17_ += aByteArrayArray1979!![i_16_]!![c.code].toInt()
                        i_16_ = c.code
                    }
                }
            }
            return i_17_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("oea.F(" + (if (string != null) "{...}" else "null") + ',' + (if (class105s != null) "{...}" else "null") + ',' + bool + ')'))
        }
    }

    fun method1187(string: String?, bool: Boolean, i: Int, class105s: Array<Class105?>?): Int {
        try {
            anInt1984++
            val i_22_ = method1188(string, intArrayOf(i), Class186.aStringArray2494, 87.toByte(), class105s)
            var i_23_ = 0
            if (bool != false) this.anInt1988 = -58
            var i_24_ = 0
            while (i_22_ > i_24_) {
                val i_25_ = method1186(Class186.aStringArray2494!![i_24_], class105s, false)
                if (i_25_ > i_23_) i_23_ = i_25_
                i_24_++
            }
            return i_23_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("oea.K(" + (if (string != null) "{...}" else "null") + ',' + bool + ',' + i + ',' + (if (class105s != null) "{...}" else "null") + ')'))
        }
    }

    fun method1188(string: String?, `is`: IntArray?, strings: Array<String?>?, i: Byte, class105s: Array<Class105?>?): Int {
        try {
            anInt1978++
            if (i.toInt() != 87) method1190(null, 80, null, 55)
            if (string == null) return 0
            var i_26_ = 0
            var i_27_ = 0
            var i_28_ = -1
            var i_29_ = 0
            var i_30_ = 0
            var i_31_ = -1
            var i_32_ = -1
            var i_33_ = 0
            val i_34_ = string.length
            var i_35_ = 0
            while (i_34_ > i_35_) {
                var i_36_ = Class354.method3464(string.get(i_35_), false).toInt() and 0xff
                var i_37_ = 0
                if (i_36_ == 60) i_31_ = i_35_
                else {
                    val i_38_: Int
                    if (i_31_ == -1) {
                        i_37_ += method1184((-48).toByte(), i_36_)
                        i_38_ = i_35_
                        if (aByteArrayArray1979 != null && i_32_ != -1) i_37_ += aByteArrayArray1979!![i_32_]!![i_36_].toInt()
                        i_32_ = i_36_
                    } else {
                        if (i_36_ != 62) {
                            i_35_++
                            continue
                        }
                        i_38_ = i_31_
                        val string_39_ = string.substring(1 + i_31_, i_35_)
                        i_31_ = -1
                        if (string_39_ == "br") {
                            strings!![i_33_] = string.substring(i_27_, i_35_ - -1)
                            i_33_++
                            if (strings.size <= i_33_) return 0
                            i_27_ = 1 + i_35_
                            i_32_ = -1
                            i_26_ = 0
                            i_28_ = -1
                            i_35_++
                            continue
                        }
                        if (string_39_ == "lt") {
                            i_37_ += method1184((-48).toByte(), 60)
                            if (aByteArrayArray1979 != null && i_32_ != -1) i_37_ += aByteArrayArray1979!![i_32_]!![60].toInt()
                            i_32_ = 60
                        } else if (string_39_ == "gt") {
                            i_37_ += method1184((-48).toByte(), 62)
                            if (aByteArrayArray1979 != null && i_32_ != -1) i_37_ += aByteArrayArray1979!![i_32_]!![62].toInt()
                            i_32_ = 62
                        } else if (string_39_ == "nbsp") {
                            i_37_ += method1184((-48).toByte(), 160)
                            if (aByteArrayArray1979 != null && i_32_ != -1) i_37_ += aByteArrayArray1979!![i_32_]!![160].toInt()
                            i_32_ = 160
                        } else if (string_39_ == "shy") {
                            i_37_ += method1184((-48).toByte(), 173)
                            if (aByteArrayArray1979 != null && i_32_ != -1) i_37_ += aByteArrayArray1979!![i_32_]!![173].toInt()
                            i_32_ = 173
                        } else if (string_39_ == "times") {
                            i_37_ += method1184((-48).toByte(), 215)
                            if (aByteArrayArray1979 != null && i_32_ != -1) i_37_ += aByteArrayArray1979!![i_32_]!![215].toInt()
                            i_32_ = 215
                        } else if (string_39_ == "euro") {
                            i_37_ += method1184((-48).toByte(), 8364)
                            if (aByteArrayArray1979 != null && i_32_ != -1) i_37_ += (aByteArrayArray1979!![i_32_]!![8364]).toInt()
                            i_32_ = 8364
                        } else if (string_39_ == "copy") {
                            i_37_ += method1184((-48).toByte(), 169)
                            if (aByteArrayArray1979 != null && i_32_ != -1) i_37_ += (aByteArrayArray1979!![i_32_]!![169]).toInt()
                            i_32_ = 169
                        } else if (string_39_ == "reg") {
                            i_37_ += method1184((-48).toByte(), 174)
                            if (aByteArrayArray1979 != null && i_32_ != -1) i_37_ += (aByteArrayArray1979!![i_32_]!![174]).toInt()
                            i_32_ = 174
                        } else if (string_39_.startsWith("img=") && class105s != null) {
                            try {
                                val i_40_ = (Class348_Sub41.method3156(true, (string_39_.substring(4))))
                                i_32_ = -1
                                i_37_ += class105s[i_40_]!!.method966()
                            } catch (exception: Exception) {
                                /* empty */
                            }
                        }
                        i_36_ = -1
                    }
                    if (i_37_ > 0) {
                        i_26_ += i_37_
                        if (`is` != null) {
                            if (i_36_ == 32) {
                                i_30_ = 1
                                i_29_ = i_26_
                                i_28_ = i_35_
                            }
                            if (i_26_ > `is`[if (`is`.size > i_33_) i_33_ else `is`.size + -1]) {
                                if (i_28_ >= 0) {
                                    strings!![i_33_] = string.substring(i_27_, -i_30_ + 1 + i_28_)
                                    if (strings.size <= ++i_33_) return 0
                                    i_27_ = 1 + i_28_
                                    i_32_ = -1
                                    i_28_ = -1
                                    i_26_ -= i_29_
                                } else {
                                    strings!![i_33_] = string.substring(i_27_, i_38_)
                                    i_33_++
                                    if (i_33_ >= strings.size) return 0
                                    i_27_ = i_38_
                                    i_32_ = -1
                                    i_28_ = -1
                                    i_26_ = i_37_
                                }
                            }
                            if (i_36_ == 45) {
                                i_29_ = i_26_
                                i_28_ = i_35_
                                i_30_ = 0
                            }
                        }
                    }
                }
                i_35_++
            }
            if (i_27_ < string.length) {
                strings!![i_33_] = string.substring(i_27_)
                i_33_++
            }
            return i_33_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("oea.J(" + (if (string != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (strings != null) "{...}" else "null") + ',' + i + ',' + (if (class105s != null) "{...}" else "null") + ')'))
        }
    }

    fun method1190(class105s: Array<Class105?>?, i: Int, string: String?, i_42_: Int): Int {
        try {
            anInt1983++
            if (i != 1) this.anInt1992 = -13
            return method1188(string, intArrayOf(i_42_), Class186.aStringArray2494, 87.toByte(), class105s)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("oea.B(" + (if (class105s != null) "{...}" else "null") + ',' + i + ',' + (if (string != null) "{...}" else "null") + ',' + i_42_ + ')'))
        }
    }

    init {
        val class348_sub49 = Class348_Sub49(`is`)
        val i = class348_sub49.readUnsignedByte(255)
        if (i != 0) throw RuntimeException("")
        val bool = class348_sub49.readUnsignedByte(255) == 1
        aByteArray1986 = ByteArray(256)
        class348_sub49.method3389(2147483647, 0, 256, aByteArray1986)
        if (bool) {
            val is_43_ = IntArray(256)
            val is_44_ = IntArray(256)
            for (i_45_ in 0..255) is_43_[i_45_] = class348_sub49.readUnsignedByte(255)
            for (i_46_ in 0..255) is_44_[i_46_] = class348_sub49.readUnsignedByte(255)
            val is_47_ = Array<ByteArray>(256) { i_48_ ->
                val is_48_ = ByteArray(is_43_[i_48_])
                var i_49_: Byte = 0
                var i_50_ = 0
                while ((is_48_.size > i_50_)) {
                    i_49_ = (i_49_ + class348_sub49.readByte(-83)).toByte()
                    is_48_[i_50_] = i_49_
                    i_50_++
                }
                is_48_
            }
            val is_51_ = Array<ByteArray>(256) { i_52_ ->
                val is_53_ = ByteArray(is_43_[i_52_])
                var i_53_: Byte = 0
                var i_54_ = 0
                while ((is_53_.size > i_54_)) {
                    i_53_ = (i_53_ + class348_sub49.readByte(-115)).toByte()
                    is_53_[i_54_] = i_53_
                    i_54_++
                }
                is_53_
            }
            aByteArrayArray1979 = Array<ByteArray?>(256) { ByteArray(256) }
            for (i_55_ in 0..255) {
                if (i_55_ != 32 && i_55_ != 160) {
                    for (i_56_ in 0..255) {
                        if (i_56_ != 32 && i_56_ != 160) aByteArrayArray1979!![i_55_]!![i_56_] = (Class239_Sub8.method1756(aByteArray1986, -34, i_56_, i_55_, is_47_, is_51_, is_44_, is_43_)).toByte()
                    }
                }
            }
            this.anInt1992 = is_44_[32] - -is_43_[32]
        } else this.anInt1992 = class348_sub49.readUnsignedByte(255)
        class348_sub49.readUnsignedByte(255)
        class348_sub49.readUnsignedByte(255)
        this.anInt1988 = class348_sub49.readUnsignedByte(255)
        this.anInt1993 = class348_sub49.readUnsignedByte(255)
    }

    companion object {
        var anInt1978: Int = 0
        var anInt1980: Int = 0
        var anInt1981: Int = 0
        var anInt1982: Int = 0
        var anInt1983: Int = 0
        var anInt1984: Int = 0
        var anInt1985: Int = 0
        var aClass351_1987: Class351? = Class351(66, -1)
        var anInt1989: Int = 0
        var anInt1990: Int = 0
        var anInt1991: Int = 0
        @JvmStatic
        fun method1180(i: Byte) {
            if (i.toInt() != -76) method1180(27.toByte())
            aClass351_1987 = null
        }

        fun method1189(i: Int, i_41_: Int) {
            anInt1991++
            if (i != -1) aClass351_1987 = null
            val class348_sub15 = (Class27.aClass356_389!!.method3480(i_41_.toLong(), -6008) as? Class348_Sub15?)
            if (class348_sub15 != null) {
                class348_sub15.aBoolean6781 = !class348_sub15.aBoolean6781
                class348_sub15.aClass55_Sub1_6768!!.method514(116.toByte(), class348_sub15.aBoolean6781)
            }
        }
    }
}
