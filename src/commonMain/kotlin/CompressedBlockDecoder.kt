/* Class212 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object CompressedBlockDecoder {
    private var aBzip2DecoderState_2750: Bzip2DecoderState? = Bzip2DecoderState()

    private fun method1545(i: Int, bzip2DecoderState: Bzip2DecoderState): Int {
        while (true) {
            if (bzip2DecoderState.anInt546 >= i) {
                val i_0_ = ((bzip2DecoderState.anInt554 shr bzip2DecoderState.anInt546 - i) and (1 shl i) - 1)
                bzip2DecoderState.anInt546 -= i
                return i_0_
            }
            bzip2DecoderState.anInt554 = (bzip2DecoderState.anInt554 shl 8 or ((bzip2DecoderState.aByteArray534!![bzip2DecoderState.anInt522]).toInt() and 0xff))
            bzip2DecoderState.anInt546 += 8
            bzip2DecoderState.anInt522++
            bzip2DecoderState.anInt536++
        }
    }

    private fun method1546(`is`: IntArray, is_1_: IntArray, is_2_: IntArray, is_3_: ByteArray, i: Int, i_4_: Int, i_5_: Int) {
        var i_6_ = 0
        for (i_7_ in i..i_4_) {
            for (i_8_ in 0..<i_5_) {
                if (is_3_[i_8_].toInt() == i_7_) {
                    is_2_[i_6_] = i_8_
                    i_6_++
                }
            }
        }
        for (i_9_ in 0..22) is_1_[i_9_] = 0
        for (i_10_ in 0..<i_5_) is_1_[is_3_[i_10_] + 1]++
        for (i_11_ in 1..22) is_1_[i_11_] += is_1_[i_11_ - 1]
        for (i_12_ in 0..22) `is`[i_12_] = 0
        var i_13_ = 0
        for (i_14_ in i..i_4_) {
            i_13_ += is_1_[i_14_ + 1] - is_1_[i_14_]
            `is`[i_14_] = i_13_ - 1
            i_13_ = i_13_ shl 1
        }
        for (i_15_ in i + 1..i_4_) is_1_[i_15_] = (`is`[i_15_ - 1] + 1 shl 1) - is_1_[i_15_]
    }

    @JvmStatic
    fun method1547(`is`: ByteArray?, i: Int, is_16_: ByteArray?, i_17_: Int, i_18_: Int): Int {
        var i = i
        withLock(aBzip2DecoderState_2750!!) {
            aBzip2DecoderState_2750!!.aByteArray534 = is_16_
            aBzip2DecoderState_2750!!.anInt522 = i_18_
            aBzip2DecoderState_2750!!.aByteArray527 = `is`
            aBzip2DecoderState_2750!!.anInt548 = 0
            aBzip2DecoderState_2750!!.anInt538 = i
            aBzip2DecoderState_2750!!.anInt546 = 0
            aBzip2DecoderState_2750!!.anInt554 = 0
            aBzip2DecoderState_2750!!.anInt536 = 0
            aBzip2DecoderState_2750!!.anInt524 = 0
            method1552(aBzip2DecoderState_2750!!)
            i -= aBzip2DecoderState_2750!!.anInt538
            aBzip2DecoderState_2750!!.aByteArray534 = null
            aBzip2DecoderState_2750!!.aByteArray527 = null
            return i
        }
    }

    private fun method1548(bzip2DecoderState: Bzip2DecoderState): Byte {
        return method1545(8, bzip2DecoderState).toByte()
    }

    var anIntArray6228: IntArray? = null

    private fun method1549(bzip2DecoderState: Bzip2DecoderState) {
        var i = bzip2DecoderState.aByte539
        var i_19_ = bzip2DecoderState.anInt533
        var i_20_ = bzip2DecoderState.anInt555
        var i_21_ = bzip2DecoderState.anInt537
        val `is` = anIntArray6228
        var i_22_ = bzip2DecoderState.anInt552
        val is_23_ = bzip2DecoderState.aByteArray527
        var i_24_ = bzip2DecoderState.anInt548
        var i_25_ = bzip2DecoderState.anInt538
        val i_26_ = i_25_
        val i_27_ = bzip2DecoderState.anInt550 + 1
        while_75_@ while (true) {
            if (i_19_ > 0) {
                while (true) {
                    if (i_25_ == 0) break@while_75_
                    if (i_19_ == 1) break
                    is_23_!![i_24_] = i
                    i_19_--
                    i_24_++
                    i_25_--
                }
                if (i_25_ == 0) {
                    i_19_ = 1
                    break
                }
                is_23_!![i_24_] = i
                i_24_++
                i_25_--
            }
            while (true) {
                if (i_20_ == i_27_) {
                    i_19_ = 0
                    break@while_75_
                }
                i = i_21_.toByte()
                i_22_ = `is`!![i_22_]
                val i_28_ = i_22_.toByte().toInt()
                i_22_ = i_22_ shr 8
                i_20_++
                if (i_28_ == i_21_) {
                    if (i_20_ != i_27_) break
                    if (i_25_ == 0) {
                        i_19_ = 1
                        break@while_75_
                    }
                    is_23_!![i_24_] = i
                    i_24_++
                    i_25_--
                } else {
                    i_21_ = i_28_
                    if (i_25_ == 0) {
                        i_19_ = 1
                        break@while_75_
                    }
                    is_23_!![i_24_] = i
                    i_24_++
                    i_25_--
                }
            }
            i_19_ = 2
            i_22_ = `is`[i_22_]
            var i_29_ = i_22_.toByte().toInt()
            i_22_ = i_22_ shr 8
            if (++i_20_ != i_27_) {
                if (i_29_ == i_21_) {
                    i_19_ = 3
                    i_22_ = `is`[i_22_]
                    i_29_ = i_22_.toByte().toInt()
                    i_22_ = i_22_ shr 8
                    if (++i_20_ != i_27_) {
                        if (i_29_ == i_21_) {
                            i_22_ = `is`[i_22_]
                            i_29_ = i_22_.toByte().toInt()
                            i_22_ = i_22_ shr 8
                            i_20_++
                            i_19_ = (i_29_ and 0xff) + 4
                            i_22_ = `is`[i_22_]
                            i_21_ = i_22_.toByte().toInt()
                            i_22_ = i_22_ shr 8
                            i_20_++
                        } else i_21_ = i_29_
                    }
                } else i_21_ = i_29_
            }
        }
        val i_30_ = bzip2DecoderState.anInt524
        bzip2DecoderState.anInt524 += i_26_ - i_25_
        bzip2DecoderState.aByte539 = i
        bzip2DecoderState.anInt533 = i_19_
        bzip2DecoderState.anInt555 = i_20_
        bzip2DecoderState.anInt537 = i_21_
        anIntArray6228 = `is`
        bzip2DecoderState.anInt552 = i_22_
        bzip2DecoderState.aByteArray527 = is_23_
        bzip2DecoderState.anInt548 = i_24_
        bzip2DecoderState.anInt538 = i_25_
    }

    private fun method1550(bzip2DecoderState: Bzip2DecoderState) {
        bzip2DecoderState.anInt541 = 0
        for (i in 0..255) {
            if (bzip2DecoderState.aBooleanArray523!![i]) {
                bzip2DecoderState.aByteArray528!![bzip2DecoderState.anInt541] = i.toByte()
                bzip2DecoderState.anInt541++
            }
        }
    }

    @JvmStatic
    fun method1551() {
        aBzip2DecoderState_2750 = null
    }

    private fun method1552(bzip2DecoderState: Bzip2DecoderState) {
        val bool = false
        val bool_31_ = false
        val bool_32_ = false
        val bool_33_ = false
        val bool_34_ = false
        val bool_35_ = false
        val bool_36_ = false
        val bool_37_ = false
        val bool_38_ = false
        val bool_39_ = false
        val bool_40_ = false
        val bool_41_ = false
        val bool_42_ = false
        val bool_43_ = false
        val bool_44_ = false
        val bool_45_ = false
        val bool_46_ = false
        val bool_47_ = false
        var i = 0
        var `is`: IntArray? = null
        var is_48_: IntArray? = null
        var is_49_: IntArray? = null
        bzip2DecoderState.anInt526 = 1
        if (anIntArray6228 == null) anIntArray6228 = IntArray(bzip2DecoderState.anInt526 * 100000)
        var bool_50_ = true
        while (bool_50_) {
            var i_51_ = method1548(bzip2DecoderState)
            if (i_51_.toInt() == 23) break
            i_51_ = method1548(bzip2DecoderState)
            i_51_ = method1548(bzip2DecoderState)
            i_51_ = method1548(bzip2DecoderState)
            i_51_ = method1548(bzip2DecoderState)
            i_51_ = method1548(bzip2DecoderState)
            i_51_ = method1548(bzip2DecoderState)
            i_51_ = method1548(bzip2DecoderState)
            i_51_ = method1548(bzip2DecoderState)
            i_51_ = method1548(bzip2DecoderState)
            i_51_ = method1553(bzip2DecoderState)
            bzip2DecoderState.anInt530 = 0
            var i_52_ = method1548(bzip2DecoderState).toInt()
            bzip2DecoderState.anInt530 = bzip2DecoderState.anInt530 shl 8 or (i_52_ and 0xff)
            i_52_ = method1548(bzip2DecoderState).toInt()
            bzip2DecoderState.anInt530 = bzip2DecoderState.anInt530 shl 8 or (i_52_ and 0xff)
            i_52_ = method1548(bzip2DecoderState).toInt()
            bzip2DecoderState.anInt530 = bzip2DecoderState.anInt530 shl 8 or (i_52_ and 0xff)
            for (i_53_ in 0..15) {
                i_51_ = method1553(bzip2DecoderState)
                bzip2DecoderState.aBooleanArray532!![i_53_] = i_51_.toInt() == 1
            }
            for (i_54_ in 0..255) bzip2DecoderState.aBooleanArray523!![i_54_] = false
            for (i_55_ in 0..15) {
                if (bzip2DecoderState.aBooleanArray532!![i_55_]) {
                    for (i_56_ in 0..15) {
                        i_51_ = method1553(bzip2DecoderState)
                        if (i_51_.toInt() == 1) bzip2DecoderState.aBooleanArray523!![(i_55_ * 16 + i_56_)] = true
                    }
                }
            }
            method1550(bzip2DecoderState)
            val i_57_ = bzip2DecoderState.anInt541 + 2
            val i_58_ = method1545(3, bzip2DecoderState)
            val i_59_ = method1545(15, bzip2DecoderState)
            for (i_60_ in 0..<i_59_) {
                var i_61_ = 0
                while (true) {
                    i_51_ = method1553(bzip2DecoderState)
                    if (i_51_.toInt() == 0) break
                    i_61_++
                }
                bzip2DecoderState.aByteArray544!![i_60_] = i_61_.toByte()
            }
            val is_62_ = ByteArray(6)
            for (i_63_ in 0..<i_58_) is_62_[i_63_.toInt()] = i_63_.toByte()
            for (i_64_ in 0..<i_59_) {
                var i_65_ = bzip2DecoderState.aByteArray544!![i_64_]
                val i_66_ = is_62_[i_65_.toInt()]
                while ( /**/i_65_ > 0) {
                    is_62_[i_65_.toInt()] = is_62_[i_65_ - 1]
                    i_65_--
                }
                is_62_[0] = i_66_
                bzip2DecoderState.aByteArray531[i_64_] = i_66_
            }
            for (i_67_ in 0..<i_58_) {
                var i_68_ = method1545(5, bzip2DecoderState)
                for (i_69_ in 0..<i_57_) {
                    while (true) {
                        i_51_ = method1553(bzip2DecoderState)
                        if (i_51_.toInt() == 0) break
                        i_51_ = method1553(bzip2DecoderState)
                        if (i_51_.toInt() == 0) i_68_++
                        else i_68_--
                    }
                    bzip2DecoderState.aByteArrayArray549!![i_67_]!![i_69_] = i_68_.toByte()
                }
            }
            for (i_70_ in 0..<i_58_) {
                var i_71_ = 32
                var i_72_: Byte = 0
                for (i_73_ in 0..<i_57_) {
                    if (bzip2DecoderState.aByteArrayArray549!![i_70_]!![i_73_] > i_72_) i_72_ = (bzip2DecoderState.aByteArrayArray549!![i_70_]!![i_73_])
                    if (bzip2DecoderState.aByteArrayArray549!![i_70_]!![i_73_] < i_71_) i_71_ = (bzip2DecoderState.aByteArrayArray549!![i_70_]!![i_73_]).toInt()
                }
                method1546(bzip2DecoderState.anIntArrayArray556!![i_70_]!!, bzip2DecoderState.anIntArrayArray553!![i_70_]!!, bzip2DecoderState.anIntArrayArray529!![i_70_]!!, bzip2DecoderState.aByteArrayArray549!![i_70_]!!, i_71_, i_72_.toInt(), i_57_)
                bzip2DecoderState.anIntArray525[i_70_] = i_71_
            }
            val i_74_ = bzip2DecoderState.anInt541 + 1
            var i_75_ = -1
            var i_76_ = 0
            for (i_77_ in 0..255) bzip2DecoderState.anIntArray535!![i_77_] = 0
            var i_78_ = 4095
            for (i_79_ in 15 downTo 0) {
                for (i_80_ in 15 downTo 0) {
                    bzip2DecoderState.aByteArray545!![i_78_] = (i_79_ * 16 + i_80_).toByte()
                    i_78_--
                }
                bzip2DecoderState.anIntArray540!![i_79_] = i_78_ + 1
            }
            var i_81_ = 0
            if (i_76_ == 0) {
                i_75_++
                i_76_ = 50
                val i_82_ = bzip2DecoderState.aByteArray531[i_75_]
                i = bzip2DecoderState.anIntArray525[i_82_.toInt()]
                `is` = bzip2DecoderState.anIntArrayArray556!![i_82_.toInt()]
                is_49_ = bzip2DecoderState.anIntArrayArray529!![i_82_.toInt()]
                is_48_ = bzip2DecoderState.anIntArrayArray553!![i_82_.toInt()]
            }
            i_76_--
            var i_83_ = i
            var i_84_: Int
            var i_85_: Int
            i_85_ = method1545(i_83_, bzip2DecoderState)
            while (i_85_ > `is`!![i_83_]) {
                i_83_++
                i_84_ = method1553(bzip2DecoderState).toInt()
                i_85_ = i_85_ shl 1 or i_84_
            }
            var i_86_ = is_49_!![i_85_ - is_48_!![i_83_]]
            while (i_86_ != i_74_) {
                if (i_86_ == 0 || i_86_ == 1) {
                    var i_87_ = -1
                    var i_88_ = 1
                    do {
                        if (i_86_ == 0) i_87_ += i_88_
                        else if (i_86_ == 1) i_87_ += 2 * i_88_
                        i_88_ *= 2
                        if (i_76_ == 0) {
                            i_75_++
                            i_76_ = 50
                            val i_89_ = bzip2DecoderState.aByteArray531[i_75_]
                            i = bzip2DecoderState.anIntArray525[i_89_.toInt()]
                            `is` = bzip2DecoderState.anIntArrayArray556!![i_89_.toInt()]
                            is_49_ = (bzip2DecoderState.anIntArrayArray529!![i_89_.toInt()])
                            is_48_ = (bzip2DecoderState.anIntArrayArray553!![i_89_.toInt()])
                        }
                        i_76_--
                        i_83_ = i
                        i_85_ = method1545(i_83_, bzip2DecoderState)
                        while (i_85_ > `is`!![i_83_]) {
                            i_83_++
                            i_84_ = method1553(bzip2DecoderState).toInt()
                            i_85_ = i_85_ shl 1 or i_84_
                        }
                        i_86_ = is_49_!![i_85_ - is_48_!![i_83_]]
                    } while (i_86_ == 0 || i_86_ == 1)
                    i_87_++
                    i_52_ = (bzip2DecoderState.aByteArray528!![(bzip2DecoderState.aByteArray545!![bzip2DecoderState.anIntArray540!![0]]).toInt() and 0xff]).toInt()
                    bzip2DecoderState.anIntArray535!![i_52_ and 0xff] += i_87_
                    while ( /**/i_87_ > 0) {
                        anIntArray6228!![i_81_] = i_52_ and 0xff
                        i_81_++
                        i_87_--
                    }
                } else {
                    var i_90_ = i_86_ - 1
                    if (i_90_ < 16) {
                        val i_91_ = bzip2DecoderState.anIntArray540!![0]
                        i_51_ = bzip2DecoderState.aByteArray545!![i_91_ + i_90_]
                        while ( /**/i_90_ > 3) {
                            val i_92_ = i_91_ + i_90_
                            bzip2DecoderState.aByteArray545!![i_92_] = bzip2DecoderState.aByteArray545!![i_92_ - 1]
                            bzip2DecoderState.aByteArray545!![i_92_ - 1] = bzip2DecoderState.aByteArray545!![i_92_ - 2]
                            bzip2DecoderState.aByteArray545!![i_92_ - 2] = bzip2DecoderState.aByteArray545!![i_92_ - 3]
                            bzip2DecoderState.aByteArray545!![i_92_ - 3] = bzip2DecoderState.aByteArray545!![i_92_ - 4]
                            i_90_ -= 4
                        }
                        while ( /**/i_90_ > 0) {
                            bzip2DecoderState.aByteArray545!![i_91_ + i_90_] = (bzip2DecoderState.aByteArray545!![i_91_ + i_90_ - 1])
                            i_90_--
                        }
                        bzip2DecoderState.aByteArray545!![i_91_] = i_51_
                    } else {
                        var i_93_ = i_90_ / 16
                        val i_94_ = i_90_ % 16
                        var i_95_ = bzip2DecoderState.anIntArray540!![i_93_] + i_94_
                        i_51_ = bzip2DecoderState.aByteArray545!![i_95_]
                        while ( /**/i_95_ > bzip2DecoderState.anIntArray540!![i_93_]) {
                            bzip2DecoderState.aByteArray545!![i_95_] = bzip2DecoderState.aByteArray545!![i_95_ - 1]
                            i_95_--
                        }
                        bzip2DecoderState.anIntArray540!![i_93_] = bzip2DecoderState.anIntArray540!![i_93_] + 1
                        while ( /**/i_93_ > 0) {
                            bzip2DecoderState.anIntArray540!![i_93_] = bzip2DecoderState.anIntArray540!![i_93_] - 1
                            bzip2DecoderState.aByteArray545!![bzip2DecoderState.anIntArray540!![i_93_]] = (bzip2DecoderState.aByteArray545!![(bzip2DecoderState.anIntArray540!![i_93_ - 1]) + 16 - 1])
                            i_93_--
                        }
                        bzip2DecoderState.anIntArray540!![0] = bzip2DecoderState.anIntArray540!![0] - 1
                        bzip2DecoderState.aByteArray545!![(bzip2DecoderState.anIntArray540!![0])] = i_51_
                        if (bzip2DecoderState.anIntArray540!![0] == 0) {
                            var i_96_ = 4095
                            for (i_97_ in 15 downTo 0) {
                                for (i_98_ in 15 downTo 0) {
                                    bzip2DecoderState.aByteArray545!![i_96_] = (bzip2DecoderState.aByteArray545!![(bzip2DecoderState.anIntArray540!![i_97_]) + i_98_])
                                    i_96_--
                                }
                                bzip2DecoderState.anIntArray540!![i_97_] = i_96_ + 1
                            }
                        }
                    }
                    bzip2DecoderState.anIntArray535!![(bzip2DecoderState.aByteArray528!![i_51_.toInt() and 0xff].toInt() and 0xff)] = bzip2DecoderState.anIntArray535!![(bzip2DecoderState.aByteArray528!![i_51_.toInt() and 0xff].toInt() and 0xff)] + 1
                    anIntArray6228!![i_81_] = (bzip2DecoderState.aByteArray528!![i_51_.toInt() and 0xff].toInt() and 0xff)
                    i_81_++
                    if (i_76_ == 0) {
                        i_75_++
                        i_76_ = 50
                        val i_99_ = bzip2DecoderState.aByteArray531[i_75_]
                        i = bzip2DecoderState.anIntArray525[i_99_.toInt()]
                        `is` = bzip2DecoderState.anIntArrayArray556!![i_99_.toInt()]
                        is_49_ = bzip2DecoderState.anIntArrayArray529!![i_99_.toInt()]
                        is_48_ = bzip2DecoderState.anIntArrayArray553!![i_99_.toInt()]
                    }
                    i_76_--
                    i_83_ = i
                    i_85_ = method1545(i_83_, bzip2DecoderState)
                    while (i_85_ > `is`!![i_83_]) {
                        i_83_++
                        i_84_ = method1553(bzip2DecoderState).toInt()
                        i_85_ = i_85_ shl 1 or i_84_
                    }
                    i_86_ = is_49_!![i_85_ - is_48_!![i_83_]]
                }
            }
            bzip2DecoderState.anInt533 = 0
            bzip2DecoderState.aByte539 = 0.toByte()
            bzip2DecoderState.anIntArray557!![0] = 0
            for (i_100_ in 1..256) bzip2DecoderState.anIntArray557!![i_100_] = bzip2DecoderState.anIntArray535!![i_100_ - 1]
            for (i_101_ in 1..256) bzip2DecoderState.anIntArray557!![i_101_] += bzip2DecoderState.anIntArray557!![i_101_ - 1]
            for (i_102_ in 0..<i_81_) {
                i_52_ = (anIntArray6228!![i_102_] and 0xff).toByte().toInt()
                anIntArray6228!![(bzip2DecoderState.anIntArray557!![i_52_ and 0xff])] = anIntArray6228!![(bzip2DecoderState.anIntArray557!![i_52_ and 0xff])] or (i_102_ shl 8)
                bzip2DecoderState.anIntArray557!![i_52_ and 0xff] = bzip2DecoderState.anIntArray557!![i_52_ and 0xff] + 1
            }
            bzip2DecoderState.anInt552 = (anIntArray6228!![bzip2DecoderState.anInt530] shr 8)
            bzip2DecoderState.anInt555 = 0
            bzip2DecoderState.anInt552 = anIntArray6228!![bzip2DecoderState.anInt552]
            bzip2DecoderState.anInt537 = (bzip2DecoderState.anInt552 and 0xff).toByte().toInt()
            bzip2DecoderState.anInt552 = bzip2DecoderState.anInt552 shr 8
            bzip2DecoderState.anInt555++
            bzip2DecoderState.anInt550 = i_81_
            method1549(bzip2DecoderState)
            bool_50_ = (bzip2DecoderState.anInt555 == bzip2DecoderState.anInt550 + 1) && bzip2DecoderState.anInt533 == 0
        }
    }

    private fun method1553(bzip2DecoderState: Bzip2DecoderState): Byte {
        return method1545(1, bzip2DecoderState).toByte()
    }
}