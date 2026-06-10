import Class33.Companion.method340

/* Class79 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class79 {
    @JvmField
    var aByte1325: Byte
    var anInt1327: Int
    private var aShortArray1328: ShortArray? = null
    @JvmField
    var anInt1329: Int = 32
    private var aByte1330: Byte = 0
    @JvmField
    var aBoolean1331: Boolean = true
    @JvmField
    var anInt1333: Int = -1
    var anInt1335: Int
    @JvmField
    var anInt1336: Int
    @JvmField
    var anInt1337: Int = 0
    var anInt1338: Int
    @JvmField
    var aShort1339: Short
    @JvmField
    var anInt1340: Int = 256
    @JvmField
    var anIntArray1342: IntArray = intArrayOf()
    var anInt1343: Int
    @JvmField
    var anInt1344: Int = 0
    @JvmField
    var aBoolean1345: Boolean = false
    private var anInt1346 = 128
    @JvmField
    var aByte1347: Byte
    @JvmField
    var aClass278_1348: Class278? = null
    var aStringArray1349: Array<String?>
    @JvmField
    var aShort1350: Short = 0
    private var aShortArray1352: ShortArray = shortArrayOf()
    @JvmField
    var aByte1353: Byte
    private var anInt1354: Int
    @JvmField
    var aByte1355: Byte
    @JvmField
    var anInt1356: Int = 255
    private var anInt1358 = 128
    private var aByte1360: Byte = 0
    var anInt1361: Int
    @JvmField
    var aBoolean1362: Boolean = false
    @JvmField
    var anInt1363: Int = 256
    var anInt1364: Int
    @JvmField
    var anInt1366: Int
    private var anInt1368: Int
    @JvmField
    var aBoolean1369: Boolean = true
    @JvmField
    var aBoolean1370: Boolean = false
    var anInt1371: Int
    var aString1372: String? = "null"
    var anInt1373: Int
    private var aByteArray1374: ByteArray? = null
    var anInt1375: Int
    private var aByte1376: Byte = 0
    @JvmField
    var anIntArray1377: IntArray? = null
    private var anIntArray1380: IntArray? = null
    @JvmField
    var aBoolean1381: Boolean = false
    var anInt1382: Int
    @JvmField
    var anInt1383: Int
    var aByte1384: Byte
    var anInt1385: Int
    private var aClass356_1386: Class356? = null
    private var anIntArrayArray1388: Array<IntArray?>? = null
    @JvmField
    var anInt1390: Int
    private var aShortArray1391: ShortArray = shortArrayOf()
    @JvmField
    var anInt1392: Int = 0
    private var aShortArray1393: ShortArray? = null
    var anInt1395: Int
    @JvmField
    var aBoolean1396: Boolean = true
    @JvmField
    var aBoolean1397: Boolean = true
    private var anInt1398 = 0
    @JvmField
    var anInt1399: Int = 1
    var anInt1401: Int
    private var anIntArray1402: IntArray? = null
    private var aByte1405: Byte
    private var anInt1406 = 0

    fun method793(i: Int): Boolean {
        anInt1403++
        if (this.anIntArray1377 == null) {
            return this.anInt1343 != -1 || this.anInt1364 != -1 || this.anInt1327 != -1
        }
        var i_0_ = i
        while (this.anIntArray1377!!.size > i_0_) {
            if (this.anIntArray1377!![i_0_] != -1) {
                val class79_1_ = (this.aClass278_1348!!.method2079(this.anIntArray1377!![i_0_], -1))
                if (class79_1_.anInt1343 != -1 || class79_1_.anInt1364 != -1 || class79_1_.anInt1327 != -1) return true
            }
            i_0_++
        }
        return false
    }

    fun method794(interface17: Interface17, i: Int): Class79? {
        anInt1394++
        var i_2_ = i
        if (anInt1368 == -1) {
            if (anInt1354 != -1) i_2_ = interface17.method61(anInt1354, (-16).toByte())
        } else i_2_ = interface17.method62(anInt1368, -65536)
        if (i_2_ < 0 || (-1 + this.anIntArray1377!!.size <= i_2_) || this.anIntArray1377!![i_2_] == -1) {
            val i_3_ = (this.anIntArray1377!![this.anIntArray1377!!.size - 1])
            if (i_3_ == -1) return null
            return this.aClass278_1348!!.method2079(i_3_, i)
        }
        return this.aClass278_1348!!.method2079(this.anIntArray1377!![i_2_], -1)
    }

    private fun method795(class348_sub49: Class348_Sub49, i: Int, i_4_: Int) {
        if (i_4_ != 127) this.aBoolean1381 = true
        if (i == 1) {
            val i_5_ = class348_sub49.readUnsignedByte(255)
            anIntArray1402 = IntArray(i_5_)
            var i_6_ = 0
            while (i_5_ > i_6_) {
                anIntArray1402!![i_6_] = class348_sub49.readUnsignedShort(842397944)
                if (anIntArray1402!![i_6_] == 65535) anIntArray1402!![i_6_] = -1
                i_6_++
            }
        } else if (i != 2) {
            if (i != 12) {
                if (i < 30 || i >= 35) {
                    if (i == 40) {
                        val i_25_ = class348_sub49.readUnsignedByte(255)
                        aShortArray1328 = ShortArray(i_25_)
                        aShortArray1352 = ShortArray(i_25_)
                        for (i_26_ in 0..<i_25_) {
                            aShortArray1328!![i_26_] = class348_sub49.readUnsignedShort(842397944).toShort()
                            aShortArray1352[i_26_] = class348_sub49.readUnsignedShort(842397944).toShort()
                        }
                    } else if (i == 41) {
                        val i_23_ = class348_sub49.readUnsignedByte(255)
                        aShortArray1393 = ShortArray(i_23_)
                        aShortArray1391 = ShortArray(i_23_)
                        for (i_24_ in 0..<i_23_) {
                            aShortArray1393!![i_24_] = class348_sub49.readUnsignedShort(842397944).toShort()
                            aShortArray1391[i_24_] = class348_sub49.readUnsignedShort(842397944).toShort()
                        }
                    } else if (i == 42) {
                        val i_7_ = class348_sub49.readUnsignedByte(i_4_ xor 0x80)
                        aByteArray1374 = ByteArray(i_7_)
                        for (i_8_ in 0..<i_7_) aByteArray1374!![i_8_] = class348_sub49.readByte(-88)
                    } else if (i == 60) {
                        val i_9_ = class348_sub49.readUnsignedByte(255)
                        anIntArray1380 = IntArray(i_9_)
                        var i_10_ = 0
                        while (i_9_ > i_10_) {
                            anIntArray1380!![i_10_] = class348_sub49.readUnsignedShort(842397944)
                            i_10_++
                        }
                    } else if (i != 93) {
                        if (i != 95) {
                            if (i != 97) {
                                if (i != 98) {
                                    if (i == 99) this.aBoolean1345 = true
                                    else if (i != 100) {
                                        if (i == 101) anInt1406 = 5 * (class348_sub49.readByte(i_4_ xor 0x27.inv()))
                                        else if (i == 102) this.anInt1375 = (class348_sub49.readUnsignedShort(i_4_ + 842397817))
                                        else if (i == 103) this.anInt1329 = (class348_sub49.readUnsignedShort(842397944))
                                        else if ((i == 106) || i == 118) {
                                            anInt1368 = (class348_sub49.readUnsignedShort(842397944))
                                            if (anInt1368 == 65535) anInt1368 = -1
                                            anInt1354 = (class348_sub49.readUnsignedShort(842397944))
                                            if (anInt1354 == 65535) anInt1354 = -1
                                            var i_11_ = -1
                                            if (i == 118) {
                                                i_11_ = (class348_sub49.readUnsignedShort(842397944))
                                                if (i_11_ == 65535) i_11_ = -1
                                            }
                                            val i_12_ = class348_sub49.readUnsignedByte(255)
                                            this.anIntArray1377 = IntArray(2 + i_12_)
                                            for (i_13_ in 0..i_12_) {
                                                this.anIntArray1377!![i_13_] = (class348_sub49.readUnsignedShort(842397944))
                                                if ((this.anIntArray1377!![i_13_]) == 65535) this.anIntArray1377!![i_13_] = -1
                                            }
                                            this.anIntArray1377!![1 + i_12_] = i_11_
                                        } else if (i == 107) this.aBoolean1396 = false
                                        else if (i != 109) {
                                            if (i == 111) this.aBoolean1369 = false
                                            else if (i == 113) {
                                                this.aShort1339 = (class348_sub49.readUnsignedShort(842397944)).toShort()
                                                this.aShort1350 = (class348_sub49.readUnsignedShort(842397944)).toShort()
                                            } else if (i == 114) {
                                                this.aByte1353 = (class348_sub49.readByte(-110))
                                                this.aByte1347 = (class348_sub49.readByte(-85))
                                            } else if (i != 119) {
                                                if (i == 121) {
                                                    anIntArrayArray1388 = (arrayOfNulls<IntArray>(anIntArray1402!!.size))
                                                    val i_14_ = (class348_sub49.readUnsignedByte(255))
                                                    var i_15_ = 0
                                                    while ((i_14_ > i_15_)) {
                                                        val i_16_ = (class348_sub49.readUnsignedByte(255))
                                                        val `is` = (IntArray(3).also { anIntArrayArray1388!![i_16_] = it })
                                                        `is`[0] = (class348_sub49.readByte(Class348_Sub21.method2955(i_4_, -50))).toInt()
                                                        `is`[1] = (class348_sub49.readByte(-113)).toInt()
                                                        `is`[2] = (class348_sub49.readByte(-84)).toInt()
                                                        i_15_++
                                                    }
                                                } else if (i == 122) this.anInt1373 = (class348_sub49.readUnsignedShort(842397944))
                                                else if (i != 123) {
                                                    if (i == 125) this.aByte1355 = (class348_sub49.readByte(-95))
                                                    else if (i == 127) this.anInt1366 = (class348_sub49.readUnsignedShort(i_4_ + 842397817))
                                                    else if (i != 128) {
                                                        if (i == 134) {
                                                            this.anInt1343 = class348_sub49.readUnsignedShort(842397944)
                                                            if (this.anInt1343 == 65535) this.anInt1343 = -1
                                                            this.anInt1395 = class348_sub49.readUnsignedShort(842397944)
                                                            if (this.anInt1395 == 65535) this.anInt1395 = -1
                                                            this.anInt1364 = class348_sub49.readUnsignedShort(842397944)
                                                            if (this.anInt1364 == 65535) this.anInt1364 = -1
                                                            this.anInt1327 = class348_sub49.readUnsignedShort(i_4_ xor 0x3235f887)
                                                            if (this.anInt1327 == 65535) this.anInt1327 = -1
                                                            this.anInt1392 = class348_sub49.readUnsignedByte(255)
                                                        } else if (i == 135) {
                                                            this.anInt1335 = class348_sub49.readUnsignedByte(255)
                                                            this.anInt1371 = class348_sub49.readUnsignedShort(842397944)
                                                        } else if (i == 136) {
                                                            this.anInt1385 = class348_sub49.readUnsignedByte(255)
                                                            this.anInt1338 = class348_sub49.readUnsignedShort(842397944)
                                                        } else if (i != 137) {
                                                            if (i != 138) {
                                                                if (i != 139) {
                                                                    if (i != 140) {
                                                                        if (i == 141) this.aBoolean1362 = true
                                                                        else if (i == 142) this.anInt1383 = class348_sub49.readUnsignedShort(842397944)
                                                                        else if (i != 143) {
                                                                            if (i >= 150 && i < 155) {
                                                                                this.aStringArray1349[-150 + i] = class348_sub49.readString((-73).toByte())
                                                                                if (!this.aClass278_1348!!.aBoolean3583) this.aStringArray1349[i + -150] = null
                                                                            } else if (i == 155) {
                                                                                aByte1376 = class348_sub49.readByte(i_4_ xor 0x16.inv())
                                                                                aByte1360 = class348_sub49.readByte(-113)
                                                                                aByte1330 = class348_sub49.readByte(-112)
                                                                                aByte1405 = class348_sub49.readByte(-87)
                                                                            } else if (i == 158) this.aByte1384 = 1.toByte()
                                                                            else if (i != 159) {
                                                                                if (i == 160) {
                                                                                    val i_21_ = class348_sub49.readUnsignedByte(255)
                                                                                    this.anIntArray1342 = IntArray(i_21_)
                                                                                    for (i_22_ in 0..<i_21_) this.anIntArray1342[i_22_] = class348_sub49.readUnsignedShort(i_4_ + 842397817)
                                                                                } else if (i == 162) this.aBoolean1370 = true
                                                                                else if (i != 163) {
                                                                                    if (i == 164) {
                                                                                        this.anInt1340 = class348_sub49.readUnsignedShort(842397944)
                                                                                        this.anInt1363 = class348_sub49.readUnsignedShort(842397944)
                                                                                    } else if (i != 165) {
                                                                                        if (i == 249) {
                                                                                            val i_17_ = class348_sub49.readUnsignedByte(255)
                                                                                            if (aClass356_1386 == null) {
                                                                                                val i_18_ = method340(i_17_, 108.toByte())
                                                                                                aClass356_1386 = Class356(i_18_)
                                                                                            }
                                                                                            var i_19_ = 0
                                                                                            while (i_17_ > i_19_) {
                                                                                                val bool = class348_sub49.readUnsignedByte(255) == 1
                                                                                                val i_20_ = class348_sub49.readMedium(-1)
                                                                                                val class348: Class348?
                                                                                                if (!bool) class348 = Class348_Sub35(class348_sub49.readInt((-126).toByte()))
                                                                                                else class348 = Class348_Sub50(class348_sub49.readString((-120).toByte()))
                                                                                                aClass356_1386!!.method3483(61.toByte(), i_20_.toLong(), class348)
                                                                                                i_19_++
                                                                                            }
                                                                                        }
                                                                                    } else this.anInt1337 = class348_sub49.readUnsignedByte(255)
                                                                                } else this.anInt1333 = class348_sub49.readUnsignedByte(i_4_ + 128)
                                                                            } else this.aByte1384 = 0.toByte()
                                                                        } else this.aBoolean1381 = true
                                                                    } else this.anInt1356 = class348_sub49.readUnsignedByte(i_4_ + 128)
                                                                } else this.anInt1382 = class348_sub49.readUnsignedShort(i_4_ + 842397817)
                                                            } else this.anInt1336 = class348_sub49.readUnsignedShort(842397944)
                                                        } else this.anInt1401 = class348_sub49.readUnsignedShort(842397944)
                                                    } else class348_sub49.readUnsignedByte(255)
                                                } else this.anInt1390 = (class348_sub49.readUnsignedShort(i_4_ xor 0x3235f887))
                                            } else this.aByte1325 = (class348_sub49.readByte(i_4_ + -245))
                                        } else this.aBoolean1331 = false
                                    } else anInt1398 = class348_sub49.readByte(-123).toInt()
                                } else anInt1358 = (class348_sub49.readUnsignedShort(i_4_ + 842397817))
                            } else anInt1346 = class348_sub49.readUnsignedShort(842397944)
                        } else this.anInt1361 = class348_sub49.readUnsignedShort(842397944)
                    } else this.aBoolean1397 = false
                } else this.aStringArray1349[-30 + i] = class348_sub49.readString(124.toByte())
            } else this.anInt1399 = class348_sub49.readUnsignedByte(i_4_ + 128)
        } else this.aString1372 = class348_sub49.readString(122.toByte())
        anInt1357++
    }

    fun method796(interface17: Interface17, i: Int): Boolean {
        anInt1351++
        if (this.anIntArray1377 == null) return true
        var i_27_ = -1
        if (anInt1368 != -1) i_27_ = interface17.method62(anInt1368, -65536)
        else if (anInt1354 != -1) i_27_ = interface17.method61(anInt1354, (-16).toByte())
        if (i_27_ < 0 || (this.anIntArray1377!!.size - 1 <= i_27_) || this.anIntArray1377!![i_27_] == -1) {
            val i_28_ = (this.anIntArray1377!![this.anIntArray1377!!.size - 1])
            return i_28_ != -1
        }
        return i == 18627
    }

    fun method798(i: Int, class348_sub49: Class348_Sub49) {
        while (true) {
            val i_33_ = class348_sub49.readUnsignedByte(255)
            if (i_33_ == 0) break
            method795(class348_sub49, i_33_, 127)
        }
        anInt1400++
    }

    fun method799(i: Int) {
        if (anIntArray1402 == null) anIntArray1402 = IntArray(0)
        if (i >= -75) aByte1376 = 102.toByte()
        anInt1334++
        if (this.aByte1384.toInt() == -1) {
            if (Class10.aClass230_186 == this.aClass278_1348!!.aClass230_3578) this.aByte1384 = 1.toByte()
            else this.aByte1384 = 0.toByte()
        }
    }

    fun method800(i: Int, class182s: Array<Class182?>?, class87: Class87?, bool: Boolean, class17: Class17?, i_34_: Int, class261: Class261?, i_35_: Int, class17_36_: Class17?, interface17: Interface17?, var_ha: ha?, i_37_: Int, `is`: IntArray?, i_38_: Int, i_39_: Int, i_40_: Int, i_41_: Int): Class64? {
        try {
            anInt1341++
            if (this.anIntArray1377 != null) {
                val class79_42_ = method794(interface17!!, -1)
                if (class79_42_ == null) return null
                return class79_42_.method800(i, class182s, class87, false, class17, i_34_, class261, i_35_, class17_36_, interface17, var_ha, i_37_, `is`, i_38_, i_39_, i_40_, i_41_)
            }
            var i_43_ = i_40_
            if (anInt1358 != 128) i_43_ = i_43_ or 0x2
            if (anInt1346 != 128) i_43_ = i_43_ or 0x5
            var bool_44_ = class17_36_ != null || class17 != null
            var bool_45_ = false
            var bool_46_ = false
            var bool_47_ = false
            var bool_48_ = bool
            val i_49_ = if (class182s == null) 0 else class182s.size
            for (i_50_ in 0..<i_49_) {
                Class318_Sub1_Sub3_Sub1.aClass348_Sub42_Sub17Array10010!![i_50_] = null
                if (class182s!![i_50_] != null) {
                    val class17_51_ = class87!!.method835((class182s[i_50_]!!.anInt2454), 7)
                    if (class17_51_.anIntArray237 != null) {
                        bool_44_ = true
                        Class163.aClass17Array2169!![i_50_] = class17_51_
                        val i_52_ = class182s[i_50_]!!.anInt2451
                        val i_53_ = class182s[i_50_]!!.anInt2455
                        var i_54_ = class17_51_.anIntArray237[i_52_]
                        Class318_Sub1_Sub3_Sub1.aClass348_Sub42_Sub17Array10010!![i_50_] = class87.method839(i_54_ ushr 16, 3)
                        i_54_ = i_54_ and 0xffff
                        Class90.anIntArray1518!![i_50_] = i_54_
                        if ((Class318_Sub1_Sub3_Sub1.aClass348_Sub42_Sub17Array10010!![i_50_]) != null) {
                            bool_46_ = bool_46_ or Class318_Sub1_Sub3_Sub1.aClass348_Sub42_Sub17Array10010!![i_50_]!!.method3272(i_54_, 0)
                            bool_45_ = bool_45_ or Class318_Sub1_Sub3_Sub1.aClass348_Sub42_Sub17Array10010!![i_50_]!!.method3271(i_54_, 14)
                            bool_48_ = bool_48_ or Class318_Sub1_Sub3_Sub1.aClass348_Sub42_Sub17Array10010!![i_50_]!!.method3267((-92).toByte(), i_54_)
                            bool_47_ = bool_47_ or class17_51_.aBoolean242
                        }
                        if ((class17_51_.aBoolean241 || Class28.aBoolean5002) && i_53_ != -1 && i_53_ < (class17_51_.anIntArray237).size) {
                            Class348_Sub23_Sub4.anIntArray9050!![i_50_] = class17_51_.anIntArray267!![i_52_]
                            Class67.anIntArray4648!![i_50_] = class182s[i_50_]!!.anInt2456
                            var i_55_ = class17_51_.anIntArray237[i_53_]
                            Class348_Sub42_Sub17.aClass348_Sub42_Sub17Array9672!![i_50_] = class87.method839(i_55_ ushr 16, 3)
                            i_55_ = i_55_ and 0xffff
                            Class183.anIntArray2466!![i_50_] = i_55_
                            if ((Class348_Sub42_Sub17.aClass348_Sub42_Sub17Array9672!![i_50_]) != null) {
                                bool_46_ = bool_46_ or Class348_Sub42_Sub17.aClass348_Sub42_Sub17Array9672!![i_50_]!!.method3272(i_55_, 0)
                                bool_45_ = bool_45_ or Class348_Sub42_Sub17.aClass348_Sub42_Sub17Array9672!![i_50_]!!.method3271(i_55_, 14)
                                bool_48_ = bool_48_ or Class348_Sub42_Sub17.aClass348_Sub42_Sub17Array9672!![i_50_]!!.method3267((-99).toByte(), i_55_)
                            }
                        } else {
                            Class348_Sub23_Sub4.anIntArray9050!![i_50_] = 0
                            Class67.anIntArray4648!![i_50_] = 0
                            Class348_Sub42_Sub17.aClass348_Sub42_Sub17Array9672!![i_50_] = null
                            Class183.anIntArray2466!![i_50_] = -1
                        }
                    }
                }
            }
            var i_56_ = -1
            var i_57_ = -1
            var i_58_ = 0
            var class348_sub42_sub17: Class348_Sub42_Sub17? = null
            var class348_sub42_sub17_59_: Class348_Sub42_Sub17? = null
            var i_60_ = -1
            var i_61_ = -1
            var i_62_ = 0
            var class348_sub42_sub17_63_: Class348_Sub42_Sub17? = null
            var class348_sub42_sub17_64_: Class348_Sub42_Sub17? = null
            if (bool_44_) {
                i_43_ = i_43_ or 0x20
                if (class17_36_ != null) {
                    i_56_ = class17_36_.anIntArray237[i_35_]
                    val i_65_ = i_56_ ushr 16
                    i_56_ = i_56_ and 0xffff
                    class348_sub42_sub17 = class87!!.method839(i_65_, 3)
                    if (class348_sub42_sub17 != null) {
                        bool_46_ = bool_46_ or class348_sub42_sub17.method3272(i_56_, 0)
                        bool_45_ = bool_45_ or class348_sub42_sub17.method3271(i_56_, 14)
                        bool_48_ = bool_48_ or class348_sub42_sub17.method3267((-125).toByte(), i_56_)
                        bool_47_ = bool_47_ or class17_36_.aBoolean242
                    }
                    if ((class17_36_.aBoolean241 || Class28.aBoolean5002) && i_38_ != -1 && (class17_36_.anIntArray237.size > i_38_)) {
                        i_57_ = class17_36_.anIntArray237[i_38_]
                        i_58_ = class17_36_.anIntArray267!![i_35_]
                        val i_66_ = i_57_ ushr 16
                        if (i_65_ == i_66_) class348_sub42_sub17_59_ = class348_sub42_sub17
                        else class348_sub42_sub17_59_ = class87.method839(i_66_, 3)
                        i_57_ = i_57_ and 0xffff
                        if (class348_sub42_sub17_59_ != null) {
                            bool_46_ = bool_46_ or class348_sub42_sub17_59_.method3272(i_57_, 0)
                            bool_45_ = bool_45_ or class348_sub42_sub17_59_.method3271(i_57_, 14)
                            bool_48_ = bool_48_ or class348_sub42_sub17_59_.method3267((-122).toByte(), i_57_)
                        }
                    }
                }
                if (class17 != null) {
                    i_60_ = class17.anIntArray237[i_39_]
                    val i_67_ = i_60_ ushr 16
                    class348_sub42_sub17_63_ = class87!!.method839(i_67_, 3)
                    i_60_ = i_60_ and 0xffff
                    if (class348_sub42_sub17_63_ != null) {
                        bool_46_ = bool_46_ or class348_sub42_sub17_63_.method3272(i_60_, 0)
                        bool_45_ = bool_45_ or class348_sub42_sub17_63_.method3271(i_60_, 14)
                        bool_48_ = bool_48_ or class348_sub42_sub17_63_.method3267((-102).toByte(), i_60_)
                        bool_47_ = bool_47_ or class17.aBoolean242
                    }
                    if ((class17.aBoolean241 || Class28.aBoolean5002) && i_37_ != -1 && class17.anIntArray237.size > i_37_) {
                        i_62_ = class17.anIntArray267!![i_39_]
                        i_61_ = class17.anIntArray237[i_37_]
                        val i_68_ = i_61_ ushr 16
                        if (i_68_ == i_67_) class348_sub42_sub17_64_ = class348_sub42_sub17_63_
                        else class348_sub42_sub17_64_ = class87.method839(i_68_, 3)
                        i_61_ = i_61_ and 0xffff
                        if (class348_sub42_sub17_64_ != null) {
                            bool_46_ = bool_46_ or class348_sub42_sub17_64_.method3272(i_61_, 0)
                            bool_45_ = bool_45_ or class348_sub42_sub17_64_.method3271(i_61_, 14)
                            bool_48_ = bool_48_ or class348_sub42_sub17_64_.method3267((-104).toByte(), i_61_)
                        }
                    }
                }
                if (bool_46_) i_43_ = i_43_ or 0x80
                if (bool_45_) i_43_ = i_43_ or 0x100
                if (bool_47_) i_43_ = i_43_ or 0x200
                if (bool_48_) i_43_ = i_43_ or 0x400
            }
            val l = (var_ha!!.anInt4567 shl 16 or this.anInt1344).toLong()
            var class64: Class64?
            synchronized(this.aClass278_1348!!.aClass60_3590!!) {
                class64 = this.aClass278_1348!!.aClass60_3590!!.method583(l, 80) as Class64?
            }
            var class225: Class225? = null
            if (this.anInt1366 != -1) class225 = class261!!.method1983(this.anInt1366, 32)
            if (class64 == null || i_43_ != (i_43_ and class64.ua())) {
                if (class64 != null) i_43_ = i_43_ or class64.ua()
                var i_69_ = i_43_
                var bool_70_ = false
                synchronized(this.aClass278_1348!!.aClass45_3576!!) {
                    var i_71_ = 0
                    while ((anIntArray1402!!.size > i_71_)) {
                        if (anIntArray1402!![i_71_] != -1 && !(this.aClass278_1348!!.aClass45_3576!!.method420(-10499, anIntArray1402!![i_71_], 0))) bool_70_ = true
                        i_71_++
                    }
                }
                if (bool_70_) return null
                val class124s = arrayOfNulls<Class124>(anIntArray1402!!.size)
                for (i_72_ in anIntArray1402!!.indices) {
                    if (anIntArray1402!![i_72_] != -1) {
                        synchronized(this.aClass278_1348!!.aClass45_3576!!) {
                            class124s[i_72_] = Class300.method2277(0, (this.aClass278_1348!!.aClass45_3576!!), anIntArray1402!![i_72_], -1)
                        }
                        if (class124s[i_72_] != null) {
                            if (class124s[i_72_]!!.anInt1830 < 13) class124s[i_72_]!!.method1092(2, 115)
                            if (anIntArrayArray1388 != null && anIntArrayArray1388!![i_72_] != null) class124s[i_72_]!!.method1099(44.toByte(), anIntArrayArray1388!![i_72_]!![2], anIntArrayArray1388!![i_72_]!![0], anIntArrayArray1388!![i_72_]!![1])
                        }
                    }
                }
                if (class225 != null && class225.anIntArrayArray2939 != null) {
                    var i_73_ = 0
                    while ((i_73_ < class225.anIntArrayArray2939!!.size)) {
                        if (class124s.size > i_73_ && class124s[i_73_] != null) {
                            var i_74_ = 0
                            var i_75_ = 0
                            var i_76_ = 0
                            var i_77_ = 0
                            var i_78_ = 0
                            var i_79_ = 0
                            if ((class225.anIntArrayArray2939!![i_73_]) != null) {
                                i_78_ = ((class225.anIntArrayArray2939!![i_73_]!![4]) shl 3)
                                i_79_ = ((class225.anIntArrayArray2939!![i_73_]!![5]) shl 3)
                                i_75_ = (class225.anIntArrayArray2939!![i_73_]!![1])
                                i_76_ = (class225.anIntArrayArray2939!![i_73_]!![2])
                                i_77_ = ((class225.anIntArrayArray2939!![i_73_]!![3]) shl 3)
                                i_74_ = (class225.anIntArrayArray2939!![i_73_]!![0])
                            }
                            if (i_77_ != 0 || i_78_ != 0 || i_79_ != 0) class124s[i_73_]!!.method1107(6875, i_78_, i_79_, i_77_)
                            if (i_74_ != 0 || i_75_ != 0 || i_76_ != 0) class124s[i_73_]!!.method1099(93.toByte(), i_76_, i_74_, i_75_)
                        }
                        i_73_++
                    }
                }
                val class124: Class124?
                if (class124s.size == 1) class124 = class124s[0]
                else class124 = Class124(class124s, class124s.size)
                if (aShortArray1328 != null) i_69_ = i_69_ or 0x4000
                if (aShortArray1393 != null) i_69_ = i_69_ or 0x8000
                if (aByte1405.toInt() != 0) i_69_ = i_69_ or 0x80000
                class64 = var_ha.method3625(class124, i_69_, (this.aClass278_1348!!.anInt3593), 64 + anInt1398, 850 + anInt1406)
                if (aShortArray1328 != null) {
                    var i_80_ = 0
                    while ((i_80_ < aShortArray1328!!.size)) {
                        if (aByteArray1374 == null || aByteArray1374!!.size <= i_80_) class64.ia(aShortArray1328!![i_80_], aShortArray1352[i_80_])
                        else class64.ia(aShortArray1328!![i_80_], (Class348_Sub42_Sub3.aShortArray9502!![aByteArray1374!![i_80_].toInt() and 0xff]))
                        i_80_++
                    }
                }
                if (aShortArray1393 != null) {
                    var i_81_ = 0
                    while (aShortArray1393!!.size > i_81_) {
                        class64.aa(aShortArray1393!![i_81_], aShortArray1391[i_81_])
                        i_81_++
                    }
                }
                if (aByte1405.toInt() != 0) class64.method624(aByte1376.toInt(), aByte1360.toInt(), aByte1330.toInt(), aByte1405.toInt() and 0xff)
                class64.s(i_43_)
                synchronized(this.aClass278_1348!!.aClass60_3590!!) {
                    this.aClass278_1348!!.aClass60_3590!!.method582(class64, (this.anInt1344 or (var_ha.anInt4567 shl 16)).toLong(), (-125).toByte())
                }
            }
            val class64_82_ = class64.method614(4.toByte(), i_43_, true)
            var bool_83_ = false
            if (`is` != null) {
                for (i_84_ in 0..11) {
                    if (`is`[i_84_] != -1) bool_83_ = true
                }
            }
            if (!bool_44_ && !bool_83_) return class64_82_
            var class101s: Array<Class101?>? = null
            if (class225 != null) class101s = class225.method1618(var_ha, 0)
            if (bool_83_ && class101s != null) {
                for (i_85_ in 0..11) {
                    if (class101s[i_85_] != null) class64_82_!!.method610(class101s[i_85_]!!, 1 shl i_85_, true)
                }
            }
            var i_86_ = 0
            var i_87_ = 1
            while (i_86_ < i_49_) {
                if ((Class318_Sub1_Sub3_Sub1.aClass348_Sub42_Sub17Array10010!![i_86_]) != null) class64_82_!!.method603(
                    (-55).toByte(),
                    -1 + Class67.anIntArray4648!![i_86_],
                    null,
                    i_87_,
                    Class90.anIntArray1518!![i_86_],
                    Class183.anIntArray2466!![i_86_],
                    (Class348_Sub42_Sub17.aClass348_Sub42_Sub17Array9672!![i_86_]),
                    0,
                    (Class318_Sub1_Sub3_Sub1.aClass348_Sub42_Sub17Array10010!![i_86_]),
                    (Class163.aClass17Array2169!![i_86_]!!.aBoolean242),
                    Class348_Sub23_Sub4.anIntArray9050!![i_86_]
                )
                i_86_++
                i_87_ = i_87_ shl 1
            }
            if (bool_83_) {
                for (i_88_ in 0..11) {
                    if (`is`!![i_88_] != -1) {
                        var i_89_ = -i + `is`[i_88_]
                        i_89_ = i_89_ and 0x3fff
                        val class101 = var_ha.method3654()
                        class101.method895(i_89_)
                        class64_82_!!.method610(class101, 1 shl i_88_, false)
                    }
                }
            }
            if (bool_83_ && class101s != null) {
                for (i_90_ in 0..11) {
                    if (class101s[i_90_] != null) class64_82_!!.method610(class101s[i_90_]!!, 1 shl i_90_, false)
                }
            }
            if (class348_sub42_sub17 != null && class348_sub42_sub17_63_ != null) class64_82_!!.method625(class348_sub42_sub17_59_, i_58_, 122.toByte(), i_62_, class348_sub42_sub17_63_, i_56_, i_60_, -1 + i_41_, class348_sub42_sub17, (class17_36_!!.aBoolean242 or class17!!.aBoolean242), i_57_, class348_sub42_sub17_64_, -1 + i_34_, class17_36_.aBooleanArray263, i_61_)
            else if (class348_sub42_sub17 != null) class64_82_!!.method617(i_56_, i_58_, class348_sub42_sub17_59_, 0, class348_sub42_sub17, bool, class17_36_!!.aBoolean242, i_57_, i_41_ + -1)
            else if (class348_sub42_sub17_63_ != null) class64_82_!!.method617(i_60_, i_62_, class348_sub42_sub17_64_, 0, class348_sub42_sub17_63_, false, class17!!.aBoolean242, i_61_, i_34_ - 1)
            var i_91_ = 0
            while (i_49_ > i_91_) {
                Class318_Sub1_Sub3_Sub1.aClass348_Sub42_Sub17Array10010!![i_91_] = null
                Class348_Sub42_Sub17.aClass348_Sub42_Sub17Array9672!![i_91_] = null
                Class163.aClass17Array2169!![i_91_] = null
                i_91_++
            }
            if (anInt1346 != 128 || anInt1358 != 128) class64_82_!!.O(anInt1346, anInt1358, anInt1346)
            class64_82_!!.s(i_40_)
            return class64_82_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(
                runtimeexception,
                ("bb.F(" + i + ',' + (if (class182s != null) "{...}" else "null") + ',' + (if (class87 != null) "{...}" else "null") + ',' + bool + ',' + (if (class17 != null) "{...}" else "null") + ',' + i_34_ + ',' + (if (class261 != null) "{...}" else "null") + ',' + i_35_ + ',' + (if (class17_36_ != null) "{...}" else "null") + ',' + (if (interface17 != null) "{...}" else "null") + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i_37_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_38_ + ',' + i_39_ + ',' + i_40_ + ',' + i_41_ + ')')
            )
        }
    }

    fun method801(i: Byte, i_92_: Int, string: String?): String? {
        anInt1378++
        if (aClass356_1386 == null) return string
        if (i.toInt() != 17) method801((-115).toByte(), -68, null)
        val class348_sub50 = (aClass356_1386!!.method3480(i_92_.toLong(), i + -6025) as Class348_Sub50?)
        if (class348_sub50 == null) return string
        return class348_sub50.aString7211
    }

    fun method803(interface17: Interface17?, var_ha: ha?, i: Int, i_94_: Int, class17: Class17?, class87: Class87?, i_95_: Int, i_96_: Int, i_97_: Int): Class64? {
        try {
            anInt1389++
            if (this.anIntArray1377 != null) {
                val class79_98_ = method794(interface17!!, -1)
                if (class79_98_ == null) return null
                return class79_98_.method803(interface17, var_ha, i, i_94_, class17, class87, i_95_, 104, i_97_)
            }
            if (anIntArray1380 == null) return null
            var i_99_ = i_97_
            if (class17 != null && i_95_ != -1) i_99_ = i_99_ or class17.method263(i_94_, 97, i_95_, true)
            var class64: Class64?
            synchronized(this.aClass278_1348!!.aClass60_3592) {
                class64 = ((this.aClass278_1348!!.aClass60_3592.method583((var_ha!!.anInt4567 shl 16 or this.anInt1344).toLong(), 64)) as Class64?)
            }
            if (class64 == null || i_99_ != (class64.ua() and i_99_)) {
                if (class64 != null) i_99_ = i_99_ or class64.ua()
                var i_100_ = i_99_
                var bool = false
                synchronized(this.aClass278_1348!!.aClass45_3576!!) {
                    var i_101_ = 0
                    while ((anIntArray1380!!.size > i_101_)) {
                        if (!this.aClass278_1348!!.aClass45_3576!!.method420(-10499, anIntArray1380!![i_101_], 0)) bool = true
                        i_101_++
                    }
                }
                if (bool) return null
                val class124s = arrayOfNulls<Class124>(anIntArray1380!!.size)
                synchronized(this.aClass278_1348!!.aClass45_3576!!) {
                    var i_102_ = 0
                    while ((anIntArray1380!!.size > i_102_)) {
                        class124s[i_102_] = Class300.method2277(0, (this.aClass278_1348!!.aClass45_3576!!), anIntArray1380!![i_102_], -1)
                        i_102_++
                    }
                }
                var i_103_ = 0
                while ((i_103_ < anIntArray1380!!.size)) {
                    if (class124s[i_103_] != null && class124s[i_103_]!!.anInt1830 < 13) class124s[i_103_]!!.method1092(2, 66)
                    i_103_++
                }
                val class124: Class124?
                if (class124s.size == 1) class124 = class124s[0]
                else class124 = Class124(class124s, class124s.size)
                if (aShortArray1328 != null) i_100_ = i_100_ or 0x4000
                if (aShortArray1393 != null) i_100_ = i_100_ or 0x8000
                if (aByte1405.toInt() != 0) i_100_ = i_100_ or 0x80000
                class64 = var_ha!!.method3625(class124, i_100_, (this.aClass278_1348!!.anInt3593), 64, 768)
                if (aShortArray1328 != null) {
                    var i_104_ = 0
                    while ((aShortArray1328!!.size > i_104_)) {
                        if (aByteArray1374 != null && aByteArray1374!!.size > i_104_) class64.ia(aShortArray1328!![i_104_], (Class348_Sub42_Sub3.aShortArray9502!![0xff and aByteArray1374!![i_104_].toInt()]))
                        else class64.ia(aShortArray1328!![i_104_], aShortArray1352[i_104_])
                        i_104_++
                    }
                }
                if (aShortArray1393 != null) {
                    var i_105_ = 0
                    while (aShortArray1393!!.size > i_105_) {
                        class64.aa(aShortArray1393!![i_105_], aShortArray1391[i_105_])
                        i_105_++
                    }
                }
                if (aByte1405.toInt() != 0) class64.method624(aByte1376.toInt(), aByte1360.toInt(), aByte1330.toInt(), aByte1405.toInt() and 0xff)
                class64.s(i_99_)
                synchronized(this.aClass278_1348!!.aClass60_3592) {
                    this.aClass278_1348!!.aClass60_3592.method582(class64, (var_ha.anInt4567 shl 16 or this.anInt1344).toLong(), (-96).toByte())
                }
            }
            if (class17 != null && i_95_ != -1) class64 = class17.method269(-9, class64, i_94_, i, i_99_, i_95_)
            class64!!.s(i_97_)
            return class64
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bb.H(" + (if (interface17 != null) "{...}" else "null") + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + i_94_ + ',' + (if (class17 != null) "{...}" else "null") + ',' + (if (class87 != null) "{...}" else "null") + ',' + i_95_ + ',' + i_96_ + ',' + i_97_ + ')'))
        }
    }

    fun method805(i: Int, i_106_: Int, i_107_: Int): Int {
        anInt1326++
        if (aClass356_1386 == null) return i
        if (i_107_ <= 12) method805(46, 116, 126)
        val class348_sub35 = aClass356_1386!!.method3480(i_106_.toLong(), -6008) as Class348_Sub35?
        if (class348_sub35 == null) return i
        return class348_sub35.anInt6976
    }

    init {
        this.anInt1335 = -1
        anInt1354 = -1
        this.anInt1336 = -1
        this.aByte1355 = 4.toByte()
        this.anInt1373 = -1
        this.anInt1375 = -1
        this.anInt1338 = -1
        this.aShort1339 = 0.toShort()
        this.aStringArray1349 = arrayOfNulls<String>(5)
        this.aByte1353 = (-96).toByte()
        this.anInt1343 = -1
        this.aByte1384 = (-1).toByte()
        this.anInt1383 = -1
        this.anInt1382 = -1
        this.anInt1371 = -1
        this.aByte1325 = 0.toByte()
        anInt1368 = -1
        this.anInt1390 = -1
        this.aByte1347 = (-16).toByte()
        this.anInt1366 = -1
        this.anInt1364 = -1
        this.anInt1327 = -1
        this.anInt1361 = -1
        aByte1405 = 0.toByte()
        this.anInt1385 = -1
        this.anInt1395 = -1
        this.anInt1401 = -1
    }

    companion object {
        @JvmField
        var anInt1326: Int = 0
        @JvmField
        var anInt1332: Int = 0
        @JvmField
        var anInt1334: Int = 0
        @JvmField
        var anInt1341: Int = 0
        @JvmField
        var anInt1351: Int = 0
        @JvmField
        var anInt1357: Int = 0
        var anInt1359: Int = 0
        @JvmField
        var aClass105_1365: Class105? = null
        @JvmField
        var aClient1367: Client? = null
        @JvmField
        var anInt1378: Int = 0
        @JvmField
        var anInt1379: Int = 0
        var anInt1387: Int = 0
        @JvmField
        var anInt1389: Int = 0
        @JvmField
        var anInt1394: Int = 0
        @JvmField
        var anInt1400: Int = 0
        @JvmField
        var anInt1403: Int = 0
        @JvmField
        var anInt1404: Int = 0
        @JvmStatic
        fun method797(i: Int, i_29_: Int, i_30_: Byte) {
            anInt1379++
            if (Class348_Sub40_Sub6.anInt9139 != i_29_) {
                Class318_Sub6.anIntArray6432 = IntArray(i_29_)
                for (i_31_ in 0..<i_29_) Class318_Sub6.anIntArray6432!![i_31_] = (i_31_ shl 12) / i_29_
                Class239_Sub22.anInt6076 = i_29_ + -1
                Class348_Sub40_Sub6.anInt9139 = i_29_
                Class248.anInt3201 = 32 * i_29_
            }
            if (i_30_ <= 108) aClient1367 = null
            if (Class286_Sub2.anInt6212 != i) {
                if (Class348_Sub40_Sub6.anInt9139 != i) {
                    Class239_Sub18.anIntArray6035 = IntArray(i)
                    for (i_32_ in 0..<i) Class239_Sub18.anIntArray6035!![i_32_] = (i_32_ shl 12) / i
                } else Class239_Sub18.anIntArray6035 = Class318_Sub6.anIntArray6432
                Class286_Sub2.anInt6212 = i
                Class299_Sub2.anInt6325 = -1 + i
            }
        }

        @JvmStatic
        fun method802(i: Int, i_93_: Int, bool: Boolean): Boolean {
            if (bool != true) return false
            anInt1332++
            if (i_93_ < 0 || i < 0 || i_93_ >= Class348_Sub33.aByteArrayArrayArray6962!![1]!!.size || i >= Class348_Sub33.aByteArrayArrayArray6962!![1]!![i_93_]!!.size) return false
            return (Class348_Sub33.aByteArrayArrayArray6962!![1]!![i_93_]!![i].toInt() and 0x2) != 0
        }

        @JvmStatic
        fun method804(i: Int) {
            aClass105_1365 = null
            aClient1367 = null
            if (i != -3752) anInt1387 = 14
        }
    }
}
