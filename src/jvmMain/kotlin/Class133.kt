import Class239_Sub16.Companion.method1791
import Class348_Sub40.Companion.method3038
import Class76.Companion.method773

object Class133 {
    var anInt1912: Int = 0
    var anInt1913: Int = 0
    var aClass114_1914: Class114? = Class114(84, 7)
    var aBoolean1915: Boolean = false
    var anInt1916: Int = 0
    var aClass114_1917: Class114? = Class114(20, -2)
    var aByteArrayArray1918: Array<ByteArray?>? = arrayOfNulls<ByteArray>(250)

    /*synthetic*/
    var aClass1919: Class<*>? = null

    /*synthetic*/
    var aClass1920: Class<*>? = null

    @JvmStatic
    fun method1139(i: Int) {
        if (i == 2767) {
            aByteArrayArray1918 = null
            aClass114_1917 = null
            aClass114_1914 = null
        }
    }

    fun method1140(i: Int) {
        anInt1916++
        Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub27_7255), 1)
        Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub27_7261), 1)
        Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub14_7250), 2)
        Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub14_7264), 2)
        Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub4_7220), 1)
        Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub9_7256), 1)
        Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub13_7236), 1)
        Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub1_7246), 1)
        Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub21_7270), 1)
        if (i >= 45) {
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub24_7235), 1)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub7_7238), 2)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub28_7230), 1)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub18_7259), 2)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub16_7247), 1)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub20_7216), 0)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub20_7248), 0)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub15_7224), 2)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub6_7226), 0)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub12_7243), 0)
            Class237.method1686(-127)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub23_7231), 0)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub29_7229), 4)
            method3038(-1)
            method773(true)
            RuntimeException_Sub1.aBoolean4604 = true
        }
    }

    fun method1141(class348_sub49_sub2: Class348_Sub49_Sub2?, i: Int, i_0_: Int, i_1_: Int, player: Player?) {
        do {
            try {
                anInt1912++
                if (i_1_ >= 41) {
                    var i_2_: Byte = -1
                    if ((i_0_ and 0x1) != 0) {
                        var i_3_ = class348_sub49_sub2!!.readUnsignedShort(842397944)
                        if (i_3_ == 65535) i_3_ = -1
                        player!!.anInt10275 = i_3_
                    }
                    if ((0x10000 and i_0_) != 0) {
                        val i_4_ = class348_sub49_sub2!!.readUnsignedByte(255)
                        val `is` = IntArray(i_4_)
                        val is_5_ = IntArray(i_4_)
                        for (i_6_ in 0..<i_4_) {
                            val i_7_ = class348_sub49_sub2.readShortAddLittle(-118)
                            if ((i_7_ and 0xc000) == 49152) {
                                val i_8_ = class348_sub49_sub2.readShortLittle(false)
                                `is`[i_6_] = Class273.method2057(i_7_ shl 16, i_8_)
                            } else `is`[i_6_] = i_7_
                            is_5_[i_6_] = class348_sub49_sub2.readShortLittle(false)
                        }
                        player!!.method2430(is_5_, `is`, -116)
                    }
                    if ((0x400 and i_0_) != 0) {
                        val i_9_ = class348_sub49_sub2!!.readShortLittle(false)
                        player!!.anInt10227 = class348_sub49_sub2.readUnsignedByteSubtract((-94).toByte())
                        player.anInt10271 = class348_sub49_sub2.readUnsignedByteSubtract((-104).toByte())
                        player.anInt10210 = 0x7fff and i_9_
                        player.aBoolean10226 = (i_9_ and 0x8000) != 0
                        player.anInt10287 = (player.anInt10210 + (Class367_Sub11.anInt7396 + (player.anInt10227)))
                    }
                    if ((0x1000 and i_0_) != 0) {
                        player!!.aString10292 = class348_sub49_sub2!!.readString(110.toByte())
                        if (player.aString10292!!.get(0) == '~') {
                            player.aString10292 = player.aString10292!!.substring(1)
                            Class286_Sub2.method2144(player.method2450(false, -70), 2, (-116).toByte(), 0, player.aString10292, player.method2456(true, 255), player.aString10537)
                        } else if (Class132.aPlayer_1907 == player) Class286_Sub2.method2144(player.method2450(false, -88), 2, (-102).toByte(), 0, (player.aString10292), player.method2456(true, 255), (player.aString10537))
                        player.anInt10264 = 150
                        player.anInt10234 = 0
                        player.anInt10201 = 0
                    }
                    if ((i_0_ and 0x4) != 0) {
                        val i_10_ = class348_sub49_sub2!!.readByteInverse(21.toByte())
                        if (i_10_ > 0) {
                            var i_11_ = 0
                            while (i_10_ > i_11_) {
                                var i_12_ = -1
                                var i_13_ = -1
                                var i_14_ = class348_sub49_sub2.readSmart(-127)
                                var i_15_ = -1
                                if (i_14_ == 32767) {
                                    i_14_ = class348_sub49_sub2.readSmart(-125)
                                    i_13_ = class348_sub49_sub2.readSmart(-126)
                                    i_12_ = class348_sub49_sub2.readSmart(-128)
                                    i_15_ = class348_sub49_sub2.readSmart(-122)
                                } else if (i_14_ != 32766) i_13_ = class348_sub49_sub2.readSmart(-117)
                                else i_14_ = -1
                                val i_16_ = class348_sub49_sub2.readSmart(-123)
                                val i_17_ = class348_sub49_sub2.readByteAdd((-98).toByte())
                                player!!.method2438(i_13_, Class367_Sub11.anInt7396, i_14_, i_15_, i_12_, i_16_, i_17_, 102.toByte())
                                i_11_++
                            }
                        }
                    }
                    if ((i_0_ and 0x2) != 0) {
                        player!!.anInt10524 = class348_sub49_sub2!!.readUnsignedShort(842397944)
                        if (player.anInt10319 == 0) {
                            player.method2440(49.toByte(), player.anInt10524)
                            player.anInt10524 = -1
                        }
                    }
                    if ((0x8000 and i_0_) != 0) {
                        player!!.aBoolean10554 = class348_sub49_sub2!!.readByteAdd((-94).toByte()) == 1
                    }
                    if ((i_0_ and 0x100) != 0) {
                        val i_18_ = class348_sub49_sub2!!.readByteInverse(21.toByte())
                        val `is` = IntArray(i_18_)
                        val is_19_ = IntArray(i_18_)
                        val is_20_ = IntArray(i_18_)
                        for (i_21_ in 0..<i_18_) {
                            var i_22_ = class348_sub49_sub2.readUnsignedShort(842397944)
                            if (i_22_ == 65535) i_22_ = -1
                            `is`[i_21_] = i_22_
                            is_19_[i_21_] = class348_sub49_sub2.readByteInverse(21.toByte())
                            is_20_[i_21_] = class348_sub49_sub2.readUnsignedShort(842397944)
                        }
                        Class167.method1297((-116).toByte(), player, is_20_, `is`, is_19_)
                    }
                    if ((0x2000 and i_0_) != 0) {
                        player!!.anInt10293 = class348_sub49_sub2!!.readByte(-121).toInt()
                        player.anInt10314 = class348_sub49_sub2.readByteSubtract(-27697).toInt()
                        player.anInt10241 = class348_sub49_sub2.readByteInverse(-622951480).toInt()
                        player.anInt10288 = class348_sub49_sub2.readByteInverse(-622951480).toInt()
                        player.anInt10239 = (class348_sub49_sub2.readShortAddLittle(-118) - -Class367_Sub11.anInt7396)
                        player.anInt10300 = (class348_sub49_sub2.readShortAdd(19) - -Class367_Sub11.anInt7396)
                        player.anInt10231 = class348_sub49_sub2.readUnsignedByte(255)
                        player.anInt10322 = 0
                        if (player.aBoolean10539) {
                            player.anInt10288 += player.anInt10531
                            player.anInt10293 += player.anInt10549
                            player.anInt10314 += player.anInt10531
                            player.anInt10241 += player.anInt10549
                            player.anInt10319 = 0
                        } else {
                            player.anInt10241 += (player.anIntArray10320!![0])
                            player.anInt10288 += (player.anIntArray10317!![0])
                            player.anInt10319 = 1
                            player.anInt10314 += (player.anIntArray10317!![0])
                            player.anInt10293 += (player.anIntArray10320!![0])
                        }
                    }
                    if ((0x200 and i_0_) != 0) {
                        var i_23_ = class348_sub49_sub2!!.readShortAddLittle(-107)
                        if (i_23_ == 65535) i_23_ = -1
                        val i_24_ = class348_sub49_sub2.readIntLittle((-121).toByte())
                        val i_25_ = class348_sub49_sub2.readUnsignedByteSubtract(54.toByte())
                        val i_26_ = i_25_ and 0x7
                        var i_27_ = 0xf and (i_25_ shr 3)
                        if (i_27_ == 15) i_27_ = -1
                        player!!.method2437(i_26_, i_23_, -1012294866, i_27_, true, i_24_)
                    }
                    if ((i_0_ and 0x40000) != 0) {
                        player!!.aByte10255 = class348_sub49_sub2!!.readByteInverse(-622951480)
                        player.aByte10206 = class348_sub49_sub2.readByte(-99)
                        player.aByte10270 = class348_sub49_sub2.readByte(-87)
                        player.aByte10279 = class348_sub49_sub2.readUnsignedByte(255).toByte()
                        player.anInt10248 = (Class367_Sub11.anInt7396 + class348_sub49_sub2.readShortAddLittle(-120))
                        player.anInt10250 = (Class367_Sub11.anInt7396 + class348_sub49_sub2.readShortAdd(125))
                    }
                    if ((i_0_ and 0x80) != 0) {
                        Class259.aByteArray3300!![i] = class348_sub49_sub2!!.readByteSubtract(-27697)
                    }
                    if ((i_0_ and 0x20) != 0) {
                        var i_28_ = class348_sub49_sub2!!.readShortAddLittle(-126)
                        if (i_28_ == 65535) i_28_ = -1
                        val i_29_ = class348_sub49_sub2.readIntInverseMiddle(255)
                        val i_30_ = class348_sub49_sub2.readByteAdd((-125).toByte())
                        val i_31_ = i_30_ and 0x7
                        var i_32_ = (0x78 and i_30_) shr 3
                        if (i_32_ == 15) i_32_ = -1
                        player!!.method2437(i_31_, i_28_, -1012294866, i_32_, false, i_29_)
                    }
                    if ((0x8 and i_0_) != 0) {
                        val `is` = IntArray(4)
                        for (i_33_ in 0..3) {
                            `is`[i_33_] = class348_sub49_sub2!!.readShortAdd(123)
                            if (`is`[i_33_] == 65535) `is`[i_33_] = -1
                        }
                        val i_34_ = class348_sub49_sub2!!.readByteAdd((-101).toByte())
                        method1791(23946, `is`, i_34_, player)
                    }
                    if ((i_0_ and 0x10) != 0) {
                        val i_35_ = class348_sub49_sub2!!.readUnsignedByte(255)
                        val `is` = ByteArray(i_35_)
                        val class348_sub49 = Class348_Sub49(`is`)
                        class348_sub49_sub2.method3347(`is`, 0, i_35_, (-124).toByte())
                        Class154.aClass348_Sub49Array2105!![i] = class348_sub49
                        player!!.method2452(84.toByte(), class348_sub49)
                    }
                    if ((0x800 and i_0_) != 0) i_2_ = class348_sub49_sub2!!.readByteInverse(-622951480)
                    if (!player!!.aBoolean10539) break
                    if (i_2_.toInt() != 127) {
                        val i_36_: Byte
                        if (i_2_.toInt() != -1) i_36_ = i_2_
                        else i_36_ = Class259.aByteArray3300!![i]
                        Class348_Sub42_Sub9_Sub1.method3208(player, i_36_.toInt(), -21)
                        player.method2455(player.anInt10531, -26443, i_36_, player.anInt10549)
                    } else player.method2449(player.anInt10531, player.anInt10549, 84.toByte())
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("ns.A(" + (if (class348_sub49_sub2 != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + (if (player != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    @JvmStatic
    @Synchronized
    fun method1142(i: Byte) {
        anInt1913++
        if (Class168.anObject2256 == null) {
            try {
//                Class168.anObject2256 = ManagementFactory.newPlatformMXBeanProxy<HotSpotDiagnosticMXBean?>(ManagementFactory.getPlatformMBeanServer(), "com.sun.management:type=HotSpotDiagnostic", HotSpotDiagnosticMXBean::class.java)
            } catch (exception: Exception) {
                println("HeapDump setup error:")
                exception.printStackTrace()
            }
        }
    }
}
