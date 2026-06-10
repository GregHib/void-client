import jagtheora.ogg.OggPacket
import jagtheora.ogg.OggPage
import jagtheora.ogg.OggStreamState
import jagtheora.ogg.OggSyncState
import java.io.IOException

abstract class Class55(i: Int) {
    private var anOggPage981: OggPage?
    private var aBoolean983 = false
    private val anOggSyncState987: OggSyncState
    private var aBoolean991 = false
    private val anOggPacket993: OggPacket
    private var aByteArray995: ByteArray?
    private var aClass348_Sub23_Sub4_999: Class348_Sub23_Sub4? = null
    private var aClass348_Sub23_Sub2_1001: Class348_Sub23_Sub2? = null
    private var aBoolean1006 = false
    private var aBoolean1007 = false
    private var aClass348_Sub23_Sub1_1008: Class348_Sub23_Sub1? = null
    private var aString1009: String? = null
    private val aClass356_1011: Class356

    private fun method504(i: Int) {
        if (i != 1999) aByteArray995 = null
        anInt982++
        var class348_sub23 = aClass356_1011.method3484(0) as Class348_Sub23?
        while (class348_sub23 != null) {
            if (class348_sub23 is Class348_Sub23_Sub4) {
                val class348_sub23_sub4 = class348_sub23
                while (class348_sub23_sub4.anInt6868 <= 8 || (method519(i xor 0x7b2) > class348_sub23_sub4.method2984(97.toByte()).toDouble())) {
                    if (class348_sub23_sub4.anOggStreamState6869!!.packetOut(anOggPacket993) != 1) break
                    class348_sub23_sub4.method2963(anOggPacket993, i + 14385)
                }
            }
            class348_sub23 = aClass356_1011.method3482(0) as Class348_Sub23?
        }
        method509(i + -2012, aString1009)
    }

    @Throws(IOException::class)
    private fun method505(i: Byte) {
        anInt996++
        while (aClass348_Sub23_Sub2_1001!!.anOggStreamState6869!!.packetOut(anOggPacket993) != 1) {
            val class348_sub23 = method521(1)
            if (class348_sub23 == null) {
                if (aBoolean991) method511(-2)
                return
            } else if (class348_sub23 === aClass348_Sub23_Sub4_999) method504(1999)
        }
        aClass348_Sub23_Sub2_1001!!.method2963(anOggPacket993, 16384)
        if (i < 58) anOggPage981 = null
    }

    fun method506(bool: Boolean): Class348_Sub23_Sub2? {
        anInt1002++
        if (bool != false) return null
        return aClass348_Sub23_Sub2_1001
    }

    private fun method507(bool: Boolean): Boolean {
        if (bool != false) method511(-113)
        anInt986++
        if (aClass348_Sub23_Sub1_1008 != null) {
            return !aClass348_Sub23_Sub2_1001!!.method2976(-1) || method519(126) > aClass348_Sub23_Sub2_1001!!.method2980(100.toByte())
        }
        val d = aClass348_Sub23_Sub2_1001!!.method2977(0).toDouble()
        return d == 0.0 || Class62.method599(-74).toDouble() >= 1000.0 / d + aClass348_Sub23_Sub2_1001!!.method2979(30).toDouble()
    }

    fun method508(i: Int) {
        anInt989++
        if (!aBoolean1007) {
            var class348_sub23 = aClass356_1011.method3484(0) as Class348_Sub23?
            if (i != 1) aBoolean991 = true
            while ( /**/class348_sub23 != null) {
                class348_sub23.method2961(13.toByte())
                class348_sub23.anOggStreamState6869!!.a()
                class348_sub23 = aClass356_1011.method3482(i xor 0x1) as Class348_Sub23?
            }
            anOggPacket993.a()
            anOggPage981!!.a()
            anOggSyncState987.a()
            aBoolean1007 = true
        }
    }

    fun method509(i: Int, string: String?) {
        anInt980++
        aString1009 = string
        if (aString1009 == null) aClass348_Sub23_Sub4_999 = null
        else {
            if (i > -4) anInt984 = -61
            if (aClass348_Sub23_Sub4_999 != null && aString1009 != aClass348_Sub23_Sub4_999!!.method2986(52)) aClass348_Sub23_Sub4_999 = null
            if (aClass348_Sub23_Sub4_999 == null) {
                var class348_sub23 = aClass356_1011.method3484(0) as Class348_Sub23?
                while (class348_sub23 != null) {
                    if (class348_sub23 is Class348_Sub23_Sub4) {
                        val class348_sub23_sub4 = class348_sub23
                        if (aString1009 == class348_sub23_sub4.method2986(41)) {
                            aClass348_Sub23_Sub4_999 = class348_sub23_sub4
                            break
                        }
                    }
                    class348_sub23 = aClass356_1011.method3482(0) as Class348_Sub23?
                }
            }
        }
    }

    fun method510(i: Byte): Boolean {
        anInt1004++
        val i_0_ = 65 / ((i - -74) / 47)
        if (!aBoolean1007 && !aBoolean991) return false
        return aClass348_Sub23_Sub1_1008 == null || aClass348_Sub23_Sub1_1008!!.method2969(-11020) <= 0
    }

    private fun method511(i: Int) {
        anInt1003++
        var class348_sub23 = aClass356_1011.method3484(0) as Class348_Sub23?
        while (class348_sub23 != null) {
            if (class348_sub23 !== aClass348_Sub23_Sub2_1001) {
                while (class348_sub23.anOggStreamState6869!!.packetOut() == 1) class348_sub23.method2963(anOggPacket993, i xor 0x4001.inv())
            }
            class348_sub23 = aClass356_1011.method3482(i + 2) as Class348_Sub23?
        }
        if (aClass348_Sub23_Sub2_1001 != null) {
            if (i != -2) method518(null, 10.toByte())
            var i_1_ = 0
            while (i_1_ < 10 && method507(false)) {
                if (aClass348_Sub23_Sub2_1001!!.anOggStreamState6869.packetOut() != 1) {
                    method508(1)
                    break
                }
                aClass348_Sub23_Sub2_1001!!.method2963(anOggPacket993, 16384)
                i_1_++
            }
        }
    }

    fun method512(i: Int): Class348_Sub23_Sub1? {
        if (i != 0) method512(120)
        anInt1005++
        return aClass348_Sub23_Sub1_1008
    }

    fun method513(i: Int): Class348_Sub23_Sub4? {
        anInt978++
        if (i != 50) aClass348_Sub23_Sub1_1008 = null
        return aClass348_Sub23_Sub4_999
    }

    fun method514(i: Byte, bool: Boolean) {
        anInt985++
        if (aClass348_Sub23_Sub1_1008 != null) {
            val class348_sub16_sub2 = aClass348_Sub23_Sub1_1008!!.method2971(-96)
            if (class348_sub16_sub2 != null) class348_sub16_sub2.method2833(1, bool)
        }
        if (i <= 114) aBoolean991 = true
        aBoolean1006 = !aBoolean1006
    }

    @Throws(IOException::class)
    abstract fun method516(i: Byte, `is`: ByteArray?): Int

    @Throws(IOException::class)
    fun method517(i: Int) {
        if (i == -2) {
            anInt988++
            if (!aBoolean1006) {
                while (!aBoolean1007) {
                    val class348_sub23: Class348_Sub23?
                    if (!aBoolean983) {
                        class348_sub23 = method521(1)
                        if (class348_sub23 == null) {
                            if (aBoolean991) method511(i)
                            break
                        }
                        checkNotNull(class348_sub23)
                        aBoolean983 = true
                    } else class348_sub23 = ((aClass356_1011.method3480(anOggPage981!!.serialNumber.toLong(), -6008)) as Class348_Sub23?)
                    if (aClass348_Sub23_Sub1_1008 == class348_sub23) {
                        if (aClass348_Sub23_Sub1_1008!!.method2969(-11020) >= 50) break
                        while (aClass348_Sub23_Sub1_1008!!.anOggStreamState6869!!.packetOut(anOggPacket993) == 1) {
                            aClass348_Sub23_Sub1_1008!!.method2963(anOggPacket993, i + 16386)
                            method504(1999)
                            if (aClass348_Sub23_Sub2_1001 != null) {
                                val d = aClass348_Sub23_Sub2_1001!!.method2980(100.toByte())
                                var i_27_ = 0
                                while (i_27_ < 10 && method507(false)) {
                                    method505(98.toByte())
                                    if (aBoolean1007) return
                                    i_27_++
                                }
                                if (aClass348_Sub23_Sub2_1001!!.method2980(100.toByte()) > d) return
                            }
                            if (aClass348_Sub23_Sub1_1008!!.method2969(-11020) >= 50) return
                        }
                    } else if (class348_sub23 !is Class348_Sub23_Sub4) {
                        if (class348_sub23 === aClass348_Sub23_Sub2_1001) {
                            if (aClass348_Sub23_Sub1_1008 == null && !aBoolean1006) {
                                var i_28_ = 0
                                while (i_28_ < 10 && method507(false)) {
                                    method505(80.toByte())
                                    if (aBoolean1007) break
                                    i_28_++
                                }
                                break
                            }
                        } else {
                            while (class348_sub23!!.anOggStreamState6869.packetOut(anOggPacket993) == 1) {
                                if ((class348_sub23.anInt6868) == 1 && (class348_sub23 is Class348_Sub23_Sub4)) method509(-22, aString1009)
                                class348_sub23.method2963(anOggPacket993, 16384)
                            }
                        }
                    } else method504(1999)
                    aBoolean983 = false
                }
            }
        }
    }

    fun method519(i: Int): Double {
        val i_30_ = 6 % ((i - 89) / 35)
        anInt992++
        if (aClass348_Sub23_Sub1_1008 != null) return aClass348_Sub23_Sub1_1008!!.method2973(123.toByte())
        if (aClass348_Sub23_Sub2_1001 != null) return aClass348_Sub23_Sub2_1001!!.method2980(100.toByte())
        return 0.0
    }

    @Throws(IOException::class)
    private fun method521(i: Int): Class348_Sub23? {
        anInt998++
        check(!aBoolean1007)
        if (aBoolean991) return null
        while (anOggSyncState987.pageOut(anOggPage981) <= 0) {
            val i_31_ = method516(21.toByte(), aByteArray995)
            if (i_31_ == -1) {
                aBoolean991 = true
                return null
            }
            if (i_31_ == 0) return null
            if (!anOggSyncState987.write(aByteArray995, i_31_)) throw RuntimeException("")
        }
        val i_32_ = anOggPage981!!.serialNumber
        if (i != 1) aClass348_Sub23_Sub1_1008 = null
        if (!anOggPage981!!.isBOS) {
            val class348_sub23 = (aClass356_1011.method3480(i_32_.toLong(), -6008) as Class348_Sub23?)
            check(class348_sub23!!.anOggStreamState6869.pageIn(anOggPage981))
            return class348_sub23
        }
        val oggstreamstate = OggStreamState(i_32_)
        check(oggstreamstate.pageIn(anOggPage981))
        check(oggstreamstate.packetPeek(anOggPacket993) == 1)
        val class348_sub23: Class348_Sub23?
        if (aClass348_Sub23_Sub2_1001 == null && anOggPacket993.isTheora) {
            aClass348_Sub23_Sub2_1001 = Class348_Sub23_Sub2(oggstreamstate)
            class348_sub23 = aClass348_Sub23_Sub2_1001
        } else if (aClass348_Sub23_Sub1_1008 == null && anOggPacket993.isVorbis) {
            aClass348_Sub23_Sub1_1008 = Class348_Sub23_Sub1(oggstreamstate)
            class348_sub23 = aClass348_Sub23_Sub1_1008
        } else {
            val `is` = anOggPacket993.data
            val stringbuffer = StringBuffer()
            var i_33_ = 1
            while (`is`!!.size > i_33_) {
                if (!Character.isLetterOrDigit(Char(`is`[i_33_].toUShort()))) break
                stringbuffer.append(Char(`is`[i_33_].toUShort()))
                i_33_++
            }
            val string = stringbuffer.toString()
            if (string == "kate") class348_sub23 = Class348_Sub23_Sub4(oggstreamstate)
            else class348_sub23 = Class348_Sub23_Sub3(oggstreamstate)
        }
        aClass356_1011.method3483(92.toByte(), i_32_.toLong(), class348_sub23)
        return class348_sub23
    }

    init {
        if (!Class348_Sub40_Sub19.method3098(-30282, "jagtheora")) throw RuntimeException("Failed to load jagtheora library")
        aByteArray995 = ByteArray(i)
        anOggSyncState987 = OggSyncState()
        anOggPage981 = OggPage()
        anOggPacket993 = OggPacket()
        aClass356_1011 = Class356(8)
    }

    companion object {
        @JvmField
        var anInt978: Int = 0
        @JvmField
        var aBoolean979: Boolean
        @JvmField
        var anInt980: Int = 0
        @JvmField
        var anInt982: Int = 0
        @JvmField
        var anInt984: Int = 4
        @JvmField
        var anInt985: Int = 0
        @JvmField
        var anInt986: Int = 0
        @JvmField
        var anInt988: Int = 0
        @JvmField
        var anInt989: Int = 0
        @JvmField
        var anInt990: Int = 0
        @JvmField
        var anInt992: Int = 0
        @JvmField
        var anInt994: Int = 0
        @JvmField
        var anInt996: Int = 0
        @JvmField
        var anInt997: Int = 0
        @JvmField
        var anInt998: Int = 0
        @JvmField
        var anInt1000: Int = 0
        @JvmField
        var anInt1002: Int = 0
        @JvmField
        var anInt1003: Int = 0
        @JvmField
        var anInt1004: Int = 0
        @JvmField
        var anInt1005: Int = 0
        @JvmField
        var aFloat1010: Float = 0f
        @JvmStatic
        fun method515(i: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
            anInt990++
            var i_7_ = 0
            val i_8_ = i_4_
            val i_9_ = i_5_ * i_5_
            val i_10_ = i_4_ * i_4_
            val i_11_ = i_10_ shl 1
            val i_12_ = i_9_ shl 1
            val i_13_ = -27 / ((38 - i_6_) / 62)
            val i_14_ = i_4_ shl 1
            var i_15_ = i_11_ + i_9_ * (1 + -i_14_)
            var i_16_ = -(i_12_ * (i_14_ - 1)) + i_10_
            val i_17_ = i_9_ shl 2
            val i_18_ = i_10_ shl 2
            var i_19_ = (3 + (i_7_ shl 1)) * i_11_
            var i_20_ = i_12_ * ((i_8_ shl 1) - 3)
            var i_21_ = i_18_ * (i_7_ + 1)
            Class135_Sub2.method1156(-27, i_2_ + i_5_, Class17.anIntArrayArray255!![i_3_]!!, -i_5_ + i_2_, i)
            var i_22_ = i_17_ * (-1 + i_8_)
            while (i_8_ > 0) {
                if (i_15_ < 0) {
                    while (i_15_ < 0) {
                        i_16_ += i_21_
                        i_15_ += i_19_
                        i_7_++
                        i_21_ += i_18_
                        i_19_ += i_18_
                    }
                }
                if (i_16_ < 0) {
                    i_16_ += i_21_
                    i_15_ += i_19_
                    i_7_++
                    i_21_ += i_18_
                    i_19_ += i_18_
                }
                i_16_ += -i_20_
                i_15_ += -i_22_
                i_22_ -= i_17_
                i_20_ -= i_17_
                val i_23_ =  /*---*/i_8_ + i_3_
                val i_24_ = i_3_ - -i_8_
                val i_25_ = i_2_ - -i_7_
                val i_26_ = i_2_ + -i_7_
                Class135_Sub2.method1156(-27, i_25_, Class17.anIntArrayArray255!![i_23_]!!, i_26_, i)
                Class135_Sub2.method1156(-27, i_25_, Class17.anIntArrayArray255!![i_24_]!!, i_26_, i)
            }
        }

        @JvmStatic
        fun method518(string: String?, i: Byte) {
            System.exit(1)
            anInt997++
            val i_29_ = 97 % ((-66 - i) / 54)
        }

        @JvmStatic
        fun method520(interface10: Interface10, i: Int): Boolean {
            anInt1000++
            val class51 = Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, interface10.method42(-94))
            if (class51.anInt875 == -1) return true
            val class218 = Class2.aClass141_117!!.method1173(31.toByte(), class51.anInt875)
            if (i == class218!!.anInt2853) return true
            return class218.method1593(106)
        }

        init {
            aBoolean979 = false
        }
    }
}
