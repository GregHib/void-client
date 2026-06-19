import kotlin.math.min

/* Class85 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WhirlpoolHash {
    private var anInt1463 = 0
    private val aByteArray1465 = ByteArray(32)
    private var anInt1468 = 0
    private val aLongArray1469: LongArray
    private val aLongArray1471 = LongArray(8)
    private val aLongArray1472: LongArray
    private val aLongArray1473: LongArray
    private val aLongArray1474: LongArray
    private val aByteArray1475: ByteArray
    private fun method827(i: Int) {
        anInt1462++
        var i_0_ = 0
        var i_1_ = i
        while ( /**/i_0_ < 8) {
            aLongArray1473[i_0_] = (method993(
                (method993(
                    (method2777(255L, aByteArray1475[i_1_ + 6].toLong()) shl 8),
                    (method993(
                        method2777(((aByteArray1475[i_1_ - -5]).toLong() shl 16), 255L shl 16),
                        (method993((method993(method2777(255L shl 32, ((aByteArray1475[i_1_ + 3]).toLong() shl 32)), (method993(method993((method2777(255L shl 48, ((aByteArray1475[1 + i_1_]).toLong() shl 48))), ((aByteArray1475[i_1_]).toLong() shl 56)), method2777(((aByteArray1475[i_1_ + 2]).toLong() shl 40), 255L shl 40))))), method2777(aByteArray1475[4 + i_1_].toLong(), 255L) shl 24))
                    ))
                )), method2777(255L, aByteArray1475[i_1_ - -7].toLong())
            ))
            i_1_ += 8
            i_0_++
        }
        for (i_2_ in 0..7) aLongArray1469[i_2_] = method993(aLongArray1473[i_2_], (aLongArray1474[i_2_].also { aLongArray1472[i_2_] = it }))
        for (i_3_ in 1..10) {
            for (i_4_ in 0..7) {
                aLongArray1471[i_4_] = 0L
                var i_5_ = 0
                var i_6_ = 56
                while ( /**/i_5_ < 8) {
                    aLongArray1471[i_4_] = (method993(aLongArray1471[i_4_], (aLongArrayArray75!![i_5_]!![(method1166(255, ((aLongArray1472[method1166(7, i_4_ - i_5_)]) ushr i_6_).toInt()))])))
                    i_6_ -= 8
                    i_5_++
                }
            }
            for (i_7_ in 0..7) aLongArray1472[i_7_] = aLongArray1471[i_7_]
            aLongArray1472[0] = method993(aLongArray1472[0], aLongArray76!![i_3_])
            for (i_8_ in 0..7) {
                aLongArray1471[i_8_] = aLongArray1472[i_8_]
                var i_9_ = 0
                var i_10_ = 56
                while ( /**/i_9_ < 8) {
                    aLongArray1471[i_8_] = (method993(aLongArray1471[i_8_], (aLongArrayArray75!![i_9_]!![(method1166(255, ((aLongArray1469[method1166(-i_9_ + i_8_, 7)]) ushr i_10_).toInt()))])))
                    i_10_ -= 8
                    i_9_++
                }
            }
            for (i_11_ in 0..7) aLongArray1469[i_11_] = aLongArray1471[i_11_]
        }
        for (i_12_ in 0..7) aLongArray1474[i_12_] = (method993(aLongArray1474[i_12_], method993(aLongArray1473[i_12_], aLongArray1469[i_12_])))
    }

    fun method829(i: Int) {
        anInt1466++
        for (i_19_ in 0..31) aByteArray1465[i_19_] = 0.toByte()
        aByteArray1475[0] = 0.toByte()
        anInt1468 = 0
        anInt1463 = anInt1468
        for (i_20_ in 0..7) aLongArray1474[i_20_] = 0L
    }

    fun method832(l: Long, `is`: ByteArray?, i: Int) {
        var l = l
        try {
            anInt1464++
            var i_29_ = 0
            val i_30_ = 8 - (l.toInt() and 0x7) and 0x7
            val i_31_ = anInt1463 and 0x7
            var l_32_ = l
            var i_33_ = 31
            var i_34_ = 0
            while ( /**/i_33_ >= 0) {
                i_34_ += (0xff and aByteArray1465[i_33_].toInt()) - -(0xff and l_32_.toInt())
                aByteArray1465[i_33_] = i_34_.toByte()
                l_32_ = l_32_ ushr 8
                i_34_ = i_34_ ushr 8
                i_33_--
            }
            val i_35_ = 6 % ((i - 64) / 52)
            while (l > 8L) {
                val i_36_ = (`is`!![i_29_].toInt() shl i_30_ and 0xff or ((0xff and `is`[1 + i_29_].toInt()) ushr 8 + -i_30_))
                if (i_36_ < 0 || i_36_ >= 256) throw RuntimeException("LOGIC ERROR")
                aByteArray1475[anInt1468] = method2057(aByteArray1475[anInt1468].toInt(), i_36_ ushr i_31_).toByte()
                anInt1468++
                anInt1463 += 8 - i_31_
                if (anInt1463 == 512) {
                    method827(0)
                    anInt1468 = 0
                    anInt1463 = anInt1468
                }
                aByteArray1475[anInt1468] = method1166(i_36_ shl -i_31_ + 8, 255).toByte()
                i_29_++
                l -= 8L
                anInt1463 += i_31_
            }
            val i_37_: Int
            if (l > 0L) {
                i_37_ = 0xff and (`is`!![i_29_].toInt() shl i_30_)
                aByteArray1475[anInt1468] = method2057(aByteArray1475[anInt1468].toInt(), i_37_ ushr i_31_).toByte()
            } else i_37_ = 0
            if (l + i_31_.toLong() >= 8) {
                anInt1463 += 8 - i_31_
                l -= (-i_31_ + 8).toLong()
                anInt1468++
                if (anInt1463 == 512) {
                    method827(0)
                    anInt1468 = 0
                    anInt1463 = anInt1468
                }
                aByteArray1475[anInt1468] = method1166(i_37_ shl 8 + -i_31_, 255).toByte()
                anInt1463 += l.toInt()
            } else anInt1463 += l.toInt()
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("lda.B(" + l + ',' + (if (`is` != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    fun method833(bool: Boolean, i: Int, `is`: ByteArray) {
        anInt1470++
        aByteArray1475[anInt1468] = method2057(aByteArray1475[anInt1468].toInt(), 128 ushr method1166(anInt1463, 7)).toByte()
        anInt1468++
        if (anInt1468 > 32) {
            while (anInt1468 < 64) aByteArray1475[anInt1468++] = 0.toByte()
            method827(0)
            anInt1468 = 0
        }
        while (anInt1468 < 32) aByteArray1475[anInt1468++] = 0.toByte()
        ArrayCopyUtil.method1577(aByteArray1465, 0, aByteArray1475, 32, 32)
        method827(0)
        var i_38_ = 0
        var i_39_ = i
        while (i_38_ < 8) {
            val l = aLongArray1474[i_38_]
            `is`[i_39_] = (l ushr 56).toInt().toByte()
            `is`[i_39_ + 1] = (l ushr 48).toInt().toByte()
            `is`[2 + i_39_] = (l ushr 40).toInt().toByte()
            `is`[i_39_ - -3] = (l ushr 32).toInt().toByte()
            `is`[i_39_ + 4] = (l ushr 24).toInt().toByte()
            `is`[i_39_ + 5] = (l ushr 16).toInt().toByte()
            `is`[6 + i_39_] = (l ushr 8).toInt().toByte()
            `is`[i_39_ + 7] = l.toInt().toByte()
            i_38_++
            i_39_ += 8
        }
    }

    init {
        aLongArray1472 = LongArray(8)
        aLongArray1473 = LongArray(8)
        aByteArray1475 = ByteArray(64)
        aLongArray1469 = LongArray(8)
        aLongArray1474 = LongArray(8)
    }

    companion object {
        var anInt1462: Int = 0
        var anInt1464: Int = 0
        var anInt1466: Int = 0
        var anInt1470: Int = 0
        var anInt1476: Int = 0

        fun method831(i: Int, i_25_: Int, i_26_: Int, i_27_: Int): Int {
            anInt1476++
            val i_28_ = 106 / ((-20 - i_27_) / 48)
            if (i_26_ > i_25_) return i_26_
            return min(i_25_, i)
        }

        fun method2777(l: Long, l_7_: Long): Long {
            try {
                return l and l_7_
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, "gia.C(" + l + ',' + l_7_ + ')')
            }
        }

        fun method993(l: Long, l_104_: Long): Long {
            try {
                return l xor l_104_
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, "nda.Q($l,$l_104_)")
            }
        }

        var anInt5283: Int = 0
        var anInt5922: Int = 0
        var anInt1651: Int = 0
        var anInt7207: Int = 0
        var anInt8854: Int = 0
        var anInt6008: Int = 0
        var anInt425: Int = 0
        var anInt3225: Int = 0
        var anInt10444: Int = 0
        var anInt2747: Int = 0
        var anInt5965: Int = 0
        var anInt1067: Int = 0
        var anInt4267: Int = 0
        var anInt4784: Int = 0

        fun method1752(i: Int, i_10_: Int, i_11_: Int) {
            anInt5283 = i_11_
            anInt5922++
            anInt1651 = i_10_
            if (i == -1) {
                if (anInt7207 == 0) {
                    anInt6008 = (2 * anInt10444 + anInt1651)
                    anInt8854 = anInt2747 * 2 + anInt5283
                } else if (anInt7207 == 1) {
                    anInt425 = (anInt5965 + anInt5283 / anInt1067 - -2)
                    anInt3225 = (anInt4784 + anInt1651 / anInt4267 - -2)
                    anInt8854 = anInt1067 * anInt425
                    anInt6008 = anInt4267 * anInt3225
                    anInt2747 = (-anInt5283 + anInt8854 shr 1)
                    anInt10444 = (anInt6008 - anInt1651 shr 1)
                } else if (anInt7207 == 2) {
                    anInt8854 = anInt5283
                    anInt6008 = anInt1651
                }
            }
        }

        fun method1166(i: Int, i_12_: Int): Int {
            return i and i_12_
        }

        var aLongArrayArray75: Array<LongArray?>?
        var aLongArray76: LongArray? = LongArray(11)

        init {
            aLongArrayArray75 = Array<LongArray?>(8) { LongArray(256) }
            for (i in 0..255) {
                val i_8_ =
                    "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886".get(
                        i / 2
                    ).code
                val l = (if ((i and 0x1) == 0) i_8_ ushr 8 else 0xff and i_8_).toLong()
                var l_9_ = l shl 1
                if (l_9_ >= 256) l_9_ = l_9_ xor 0x11dL
                var l_10_ = l_9_ shl 1
                if (l_10_ >= 256L) l_10_ = l_10_ xor 0x11dL
                val l_11_ = l xor l_10_
                var l_12_ = l_10_ shl 1
                if (l_12_ >= 256L) l_12_ = l_12_ xor 0x11dL
                val l_13_ = l_12_ xor l
                aLongArrayArray75!![0]!![i] = (method2068(l_13_, (method2068(l_9_ shl 8, (method2068(l_11_ shl 16, (method2068(l_12_ shl 24, (method2068(l shl 32, (method2068(method2068(l shl 56, l shl 48), l_10_ shl 40))))))))))))
                for (i_14_ in 1..7) aLongArrayArray75!![i_14_]!![i] = method2068((aLongArrayArray75!![i_14_ + -1]!![i] ushr 8), (aLongArrayArray75!![i_14_ - 1]!![i] shl 56))
            }
            aLongArray76!![0] = 0L
            for (i in 1..10) {
                val i_15_ = -8 + i * 8
                aLongArray76!![i] = (method993(
                    (method993(
                        method2777(aLongArrayArray75!![6]!![6 + i_15_], 65280L),
                        (method993(
                            method2777((aLongArrayArray75!![5]!![5 + i_15_]), 16711680L),
                            (method993(
                                (method993(
                                    (method993(method2777((aLongArrayArray75!![2]!![i_15_ + 2]), 280375465082880L), (method993(method2777(71776119061217280L, (aLongArrayArray75!![1]!![1 + i_15_])), (method2777(aLongArrayArray75!![0]!![i_15_], -72057594037927936L)))))),
                                    method2777(1095216660480L, (aLongArrayArray75!![3]!![3 + i_15_]))
                                )), method2777((aLongArrayArray75!![4]!![i_15_ - -4]), 4278190080L)
                            ))
                        ))
                    )), method2777(aLongArrayArray75!![7]!![7 + i_15_], 255L)
                ))
            }
        }

        fun method2068(l: Long, l_0_: Long): Long {
            try {
                return l or l_0_
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, "vd.D(" + l + ',' + l_0_ + ')')
            }
        }

        fun method2057(i: Int, i_2_: Int): Int {
            return i or i_2_
        }
    }
}