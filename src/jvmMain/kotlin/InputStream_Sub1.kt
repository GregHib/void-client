import java.io.InputStream

class InputStream_Sub1 : InputStream() {
    override fun read(): Int {
        anInt74++
        Class286_Sub5.method2161(31.toByte(), 30000L)
        return -1
    }

    companion object {
        @JvmField
        var anInt71: Int = 0
        @JvmField
        var anInt72: Int = 0
        @JvmField
        var anInt73: Int = 0
        @JvmField
        var anInt74: Int = 0
        @JvmField
        var aLongArrayArray75: Array<LongArray?>?
        @JvmField
        var aLongArray76: LongArray? = LongArray(11)
        @JvmField
        var aClass351_77: Class351?
        @JvmField
        var anInt78: Int
        @JvmField
        var aClass114_79: Class114?

        @JvmStatic
        fun method124(i: Int) {
            aLongArrayArray75 = null
            if (i == 2) {
                aClass351_77 = null
                aLongArray76 = null
                aClass114_79 = null
            }
        }

        @JvmStatic
        fun method125(i: Int, i_0_: Int, i_1_: Int, class318_sub1_sub4: Class318_Sub1_Sub4?, i_2_: Byte): Boolean {
            anInt72++
            if (!Class348_Sub40_Sub23.aBoolean9307 || !Class23.aBoolean351) return false
            if (Class225.anInt2946 < 100) return false
            if (!aa_Sub2.method164(i_1_, i_0_, (-97).toByte(), i)) return false
            val i_3_ = i_0_ shl Class362.anInt4459
            val i_4_ = i shl Class362.anInt4459
            if (i_2_.toInt() != 120) return false
            val i_5_ = -1 + aa_Sub1.aSArray5191!![i_1_]!!.method3982((-86).toByte(), i, i_0_)
            val i_6_ = i_5_ + class318_sub1_sub4!!.method2394(true)
            if (class318_sub1_sub4.aShort8759.toInt() == 1) {
                if (!Class286_Sub7.method2169(i_3_, i_3_, i_4_, i_3_, Class270.anInt3465 + i_4_, i_6_, i_6_, i_5_, i_4_, false)) return false
                if (!Class286_Sub7.method2169(i_3_, i_3_, i_4_, i_3_, Class270.anInt3465 + i_4_, i_5_, i_6_, i_5_, i_4_ + Class270.anInt3465, false)) return false
                Class42.anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 2) {
                if (!Class286_Sub7.method2169(i_3_, i_3_ - -Class270.anInt3465, i_4_ - -Class270.anInt3465, i_3_, Class270.anInt3465 + i_4_, i_6_, i_6_, i_5_, i_4_ - -Class270.anInt3465, false)) return false
                if (!Class286_Sub7.method2169(i_3_, Class270.anInt3465 + i_3_, i_4_ + Class270.anInt3465, Class270.anInt3465 + i_3_, Class270.anInt3465 + i_4_, i_6_, i_5_, i_5_, i_4_ - -Class270.anInt3465, false)) return false
                Class42.anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 4) {
                if (!Class286_Sub7.method2169(i_3_ + Class270.anInt3465, Class270.anInt3465 + i_3_, i_4_, Class270.anInt3465 + i_3_, i_4_ - -Class270.anInt3465, i_6_, i_6_, i_5_, i_4_, false)) return false
                if (!Class286_Sub7.method2169(i_3_ + Class270.anInt3465, i_3_ - -Class270.anInt3465, i_4_, Class270.anInt3465 + i_3_, i_4_ - -Class270.anInt3465, i_5_, i_6_, i_5_, Class270.anInt3465 + i_4_, false)) return false
                Class42.anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 8) {
                if (!Class286_Sub7.method2169(i_3_, Class270.anInt3465 + i_3_, i_4_, i_3_, i_4_, i_6_, i_6_, i_5_, i_4_, false)) return false
                if (!Class286_Sub7.method2169(i_3_, i_3_ + Class270.anInt3465, i_4_, Class270.anInt3465 + i_3_, i_4_, i_6_, i_5_, i_5_, i_4_, false)) return false
                Class42.anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 16) {
                if (!Class121.method1084(i_6_, Class348_Sub23_Sub2.anInt9037, Class348_Sub23_Sub2.anInt9037 + i_4_, i_3_, i_5_, Class348_Sub23_Sub2.anInt9037, 18507)) return false
                Class42.anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 32) {
                if (!Class121.method1084(i_6_, Class348_Sub23_Sub2.anInt9037, Class348_Sub23_Sub2.anInt9037 + i_4_, i_3_ + Class348_Sub23_Sub2.anInt9037, i_5_, Class348_Sub23_Sub2.anInt9037, 18507)) return false
                Class42.anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 64) {
                if (!Class121.method1084(i_6_, Class348_Sub23_Sub2.anInt9037, i_4_, Class348_Sub23_Sub2.anInt9037 + i_3_, i_5_, Class348_Sub23_Sub2.anInt9037, 18507)) return false
                Class42.anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 128) {
                if (!Class121.method1084(i_6_, Class348_Sub23_Sub2.anInt9037, i_4_, i_3_, i_5_, Class348_Sub23_Sub2.anInt9037, 18507)) return false
                Class42.anInt562++
                return true
            }
            return true
        }

        @JvmStatic
        fun method126(i: Int) {
            Class318_Sub1_Sub3_Sub3.method2433()
            anInt73++
            for (i_7_ in 0..3) Class348_Sub45.aClass361Array7108!![i_7_]!!.method3500(700)
            if (i != -16203) Companion.method125(125, -95, 109, null, (-52).toByte())
            Class50_Sub2.method464(-1)
            Class348_Sub18.method2938(98.toByte())
            Class239_Sub12.method1772(28)
            System.gc()
            Class348_Sub8.aHa6654!!.ya()
        }

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
                aLongArrayArray75!![0]!![i] = (Class277.method2068(l_13_, (Class277.method2068(l_9_ shl 8, (Class277.method2068(l_11_ shl 16, (Class277.method2068(l_12_ shl 24, (Class277.method2068(l shl 32, (Class277.method2068(Class277.method2068(l shl 56, l shl 48), l_10_ shl 40))))))))))))
                for (i_14_ in 1..7) aLongArrayArray75!![i_14_]!![i] = Class277.method2068((aLongArrayArray75!![i_14_ + -1]!![i] ushr 8), (aLongArrayArray75!![i_14_ - 1]!![i] shl 56))
            }
            aLongArray76!![0] = 0L
            for (i in 1..10) {
                val i_15_ = -8 + i * 8
                aLongArray76!![i] = (Class105_Sub2.method993(
                    (Class105_Sub2.method993(
                        Class348_Sub8.method2777(aLongArrayArray75!![6]!![6 + i_15_], 65280L),
                        (Class105_Sub2.method993(
                            Class348_Sub8.method2777((aLongArrayArray75!![5]!![5 + i_15_]), 16711680L),
                            (Class105_Sub2.method993(
                                (Class105_Sub2.method993(
                                    (Class105_Sub2.method993(Class348_Sub8.method2777((aLongArrayArray75!![2]!![i_15_ + 2]), 280375465082880L), (Class105_Sub2.method993(Class348_Sub8.method2777(71776119061217280L, (aLongArrayArray75!![1]!![1 + i_15_])), (Class348_Sub8.method2777(aLongArrayArray75!![0]!![i_15_], -72057594037927936L)))))),
                                    Class348_Sub8.method2777(1095216660480L, (aLongArrayArray75!![3]!![3 + i_15_]))
                                )), Class348_Sub8.method2777((aLongArrayArray75!![4]!![i_15_ - -4]), 4278190080L)
                            ))
                        ))
                    )), Class348_Sub8.method2777(aLongArrayArray75!![7]!![7 + i_15_], 255L)
                ))
            }
            aClass351_77 = Class351(8, 1)
            anInt78 = 0
            aClass114_79 = Class114(75, 6)
        }
    }
}
