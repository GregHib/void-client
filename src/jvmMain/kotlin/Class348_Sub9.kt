import Class286_Sub3.Companion.method2148
import Class348_Sub42_Sub16_Sub1.Companion.method3262
import Class368.Companion.method3563
import Class375.method3614

/* Class348_Sub9 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub9 : Class348() {
    @JvmField
    var anInt6668: Int = 0
    @JvmField
    var anInt6670: Int = 0
    @JvmField
    var aClass348_Sub16_Sub5_6673: Class348_Sub16_Sub5? = null
    @JvmField
    var aBoolean6674: Boolean = false
    @JvmField
    var anInt6675: Int = 0
    @JvmField
    var aClass348_Sub16_Sub5_6676: Class348_Sub16_Sub5? = null
    @JvmField
    var anInt6677: Int = 0
    @JvmField
    var anInt6678: Int = 0
    @JvmField
    var aPlayer_6679: Player? = null
    @JvmField
    var anInt6680: Int = 0
    @JvmField
    var anInt6681: Int = 0
    var aClass348_Sub10_6683: Class348_Sub10? = null
    @JvmField
    var aBoolean6684: Boolean = false
    @JvmField
    var anInt6685: Int = 0
    @JvmField
    var aClass348_Sub19_Sub1_6686: Class348_Sub19_Sub1? = null
    @JvmField
    var anInt6687: Int = 0
    @JvmField
    var aClass348_Sub10_6688: Class348_Sub10? = null
    @JvmField
    var anInt6689: Int = 0
    @JvmField
    var aNpc_6691: Npc? = null
    var aClass348_Sub19_Sub1_6692: Class348_Sub19_Sub1? = null
    @JvmField
    var anInt6693: Int = 0
    @JvmField
    var anInt6694: Int = 0
    @JvmField
    var aClass51_6695: Class51? = null
    @JvmField
    var anInt6696: Int = 0
    @JvmField
    var anIntArray6697: IntArray? = null
    @JvmField
    var anInt6698: Int = 0
    @JvmField
    var aBoolean6699: Boolean = false

    fun method2781(i: Byte) {
        anInt6671++
        val i_11_ = this.anInt6685
        if (i.toInt() == 21) {
            val bool = this.aBoolean6674
            if (this.aClass51_6695 == null) {
                if (this.aNpc_6691 == null) {
                    if ((this.aPlayer_6679) != null) {
                        this.anInt6685 = (Class315.method2357(-1, (this.aPlayer_6679!!)))
                        this.anInt6694 = (this.aPlayer_6679!!.anInt10553) shl 9
                        this.anInt6677 = (this.aPlayer_6679!!.anInt10558)
                        this.anInt6681 = 256
                        this.anInt6696 = 256
                        this.aBoolean6674 = (this.aPlayer_6679!!.aBoolean10517)
                    }
                } else {
                    val i_12_ = (Class8.method214((this.aNpc_6691!!), -1))
                    if (i_12_ != i_11_) {
                        this.anInt6685 = i_12_
                        var class79 = (this.aNpc_6691!!.aClass79_10505)
                        if (class79!!.anIntArray1377 != null) class79 = class79.method794((Class318_Sub1_Sub3_Sub3.aClass170_10209!!), -1)
                        if (class79 == null) {
                            this.anInt6694 = 0
                            this.anInt6677 = this.anInt6694
                            this.anInt6681 = 256
                            this.anInt6696 = 256
                            this.aBoolean6674 = this.aNpc_6691!!.aClass79_10505!!.aBoolean1370
                        } else {
                            this.anInt6694 = class79.anInt1392 shl 9
                            this.anInt6681 = class79.anInt1363
                            this.anInt6677 = class79.anInt1356
                            this.aBoolean6674 = class79.aBoolean1370
                            this.anInt6696 = class79.anInt1340
                        }
                    }
                }
            } else {
                val class51 = (this.aClass51_6695!!.method480(Class318_Sub1_Sub3_Sub3.aClass170_10209!!, 47.toByte()))
                if (class51 == null) {
                    this.anInt6681 = 256
                    this.aBoolean6674 = false
                    this.aBoolean6699 = false
                    this.anIntArray6697 = null
                    this.anInt6668 = 0
                    this.anInt6677 = 0
                    this.anInt6696 = 256
                    this.anInt6680 = 0
                    this.anInt6685 = -1
                    this.anInt6694 = 0
                } else {
                    this.anInt6681 = class51.anInt916
                    this.anInt6685 = class51.anInt887
                    this.anInt6696 = class51.anInt878
                    this.anInt6694 = class51.anInt889 shl 9
                    this.aBoolean6674 = class51.aBoolean888
                    this.anInt6680 = class51.anInt962
                    this.anInt6677 = class51.anInt936
                    this.anInt6668 = class51.anInt937
                    this.aBoolean6699 = class51.aBoolean903
                    this.anIntArray6697 = class51.anIntArray904
                }
            }
            if (((i_11_ != this.anInt6685) || bool == !this.aBoolean6674) && this.aClass348_Sub16_Sub5_6676 != null) {
                Class348_Sub43.aClass348_Sub16_Sub4_7065!!.method2880(this.aClass348_Sub16_Sub5_6676!!)
                this.aClass348_Sub19_Sub1_6686 = null
                this.aClass348_Sub16_Sub5_6676 = null
                this.aClass348_Sub10_6688 = null
            }
        }
    }

    companion object {
        @JvmField
        var anInt6669: Int = 0
        @JvmField
        var anInt6671: Int = 0
        @JvmField
        var anInt6672: Int = 0
        @JvmField
        var anInt6682: Int = 0
        @JvmField
        var anInt6690: Int = 0

        @JvmStatic
        fun method2778(class318_sub1: Class318_Sub1, bool: Boolean, `is`: Array<Array<ByteArray?>?>?, i: Int, i_0_: Byte): Boolean {
            if (!Class348_Sub40_Sub17.aBoolean9242) return false
            var i_1_ = class318_sub1.x shr Class362.anInt4459
            var i_2_ = i_1_
            var i_3_ = class318_sub1.y shr Class362.anInt4459
            var i_4_ = i_3_
            if (class318_sub1 is Class318_Sub1_Sub3) {
                i_2_ = (class318_sub1.aShort8751).toInt()
                i_4_ = (class318_sub1.aShort8747).toInt()
                i_1_ = (class318_sub1.aShort8743).toInt()
                i_3_ = (class318_sub1.aShort8750).toInt()
            }
            for (i_5_ in i_1_..i_2_) {
                for (i_6_ in i_3_..i_4_) {
                    if ((class318_sub1.aByte6376 < Class189.anInt2524) && i_5_ >= Class37.anInt492 && i_5_ < Class27.anInt387 && i_6_ >= Class348_Sub34.anInt6974 && i_6_ < Class59_Sub1.anInt5293) {
                        if ((`is` != null && class318_sub1.plane >= i && (`is`[class318_sub1.plane.toInt()]!![i_5_]!![i_6_]) == i_0_) || !class318_sub1.method2378(0) || class318_sub1.method2382((-79).toByte())) {
                            if (!bool && i_5_ >= Class239_Sub25.anInt6111 - 16 && i_5_ <= Class239_Sub25.anInt6111 + 16 && i_6_ >= Class285_Sub2.anInt8502 - 16 && i_6_ <= Class285_Sub2.anInt8502 + 16) {
                                if (Class348_Sub40_Sub5.aBoolean9121) {
                                    Class319.aClass315Array3982!![Class139.anInt1949++]!!.method2361(-15481, class318_sub1)
                                    Class139.anInt1949 %= Class75_Sub1.anInt5652
                                } else class318_sub1.method2387(Class9.aHa171, -128)
                            }
                        } else return false
                    }
                }
            }
            return true
        }

        fun method2779(bool: Boolean, i: Int): Int {
            anInt6672++
            if (i == 6407 || i == 34843 || i == 34837) return 6407
            if (i == 6408 || i == 34842 || i == 34836) return 6408
            if (i == 6406 || i == 34844) return 6406
            if (i == 6409 || i == 34846) return 6409
            if (i == 6410 || i == 34847) return 6410
            if (bool != true) Companion.method2780(36, null, (-28).toByte(), -58, -120)
            if (i == 6402) return 6402
            throw IllegalArgumentException("")
        }

        @JvmStatic
        fun method2780(i: Int, string: String?, i_7_: Byte, i_8_: Int, i_9_: Int) {
            do {
                try {
                    anInt6669++
                    val class46 = Class348_Sub22.method2957(i, (-54).toByte(), i_9_)
                    if (class46 != null) {
                        if (class46.anObjectArray741 != null) {
                            val class348_sub36 = Class348_Sub36()
                            class348_sub36.aClass46_6989 = class46
                            class348_sub36.aString6994 = string
                            class348_sub36.anObjectArray6987 = class46.anObjectArray741
                            class348_sub36.anInt6986 = i_8_
                            Class66.method705(class348_sub36)
                        }
                        if (Class240.anInt4674 == 10 && Client.method105(class46)!!.method3301(-1 + i_8_, false)) {
                            if (i_8_ == 1) {
                                Class127_Sub1.anInt8380++
                                val class348_sub47 = method2148((Class27.aClass351_398), (Class348_Sub23_Sub2.aClass77_9029), -93)
                                method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                                Class348_Sub42_Sub14.method3243(118, class348_sub47)
                            }
                            if (i_8_ == 2) {
                                InputStream_Sub1.anInt71++
                                val class348_sub47 = method2148((Class200.aClass351_2638), (Class348_Sub23_Sub2.aClass77_9029), -98)
                                method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                                Class348_Sub42_Sub14.method3243(126, class348_sub47)
                            }
                            if (i_8_ == 3) {
                                Class289.anInt3703++
                                val class348_sub47 = method2148((Class286_Sub4.aClass351_6244), (Class348_Sub23_Sub2.aClass77_9029), -93)
                                method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                                Class348_Sub42_Sub14.method3243(-80, class348_sub47)
                            }
                            if (i_8_ == 4) {
                                Class90.anInt1514++
                                val class348_sub47 = method2148((aa_Sub3.aClass351_5204), (Class348_Sub23_Sub2.aClass77_9029), -82)
                                method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                                Class348_Sub42_Sub14.method3243(116, class348_sub47)
                            }
                            val i_10_ = -80 / ((64 - i_7_) / 43)
                            if (i_8_ == 5) {
                                Class101_Sub2.anInt5714++
                                val class348_sub47 = method2148((Class50_Sub1.aClass351_5217), (Class348_Sub23_Sub2.aClass77_9029), -94)
                                method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                                Class348_Sub42_Sub14.method3243(123, class348_sub47)
                            }
                            if (i_8_ == 6) {
                                Class240.anInt4680++
                                val class348_sub47 = method2148((Class222.aClass351_2892), (Class348_Sub23_Sub2.aClass77_9029), -100)
                                method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                                Class348_Sub42_Sub14.method3243(-4, class348_sub47)
                            }
                            if (i_8_ == 7) {
                                Class331.anInt4134++
                                val class348_sub47 = method2148((Class358.aClass351_4418), (Class348_Sub23_Sub2.aClass77_9029), -84)
                                method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                                Class348_Sub42_Sub14.method3243(118, class348_sub47)
                            }
                            if (i_8_ == 8) {
                                Class112.anInt1726++
                                val class348_sub47 = method2148((Class243.aClass351_3165), (Class348_Sub23_Sub2.aClass77_9029), -117)
                                method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                                Class348_Sub42_Sub14.method3243(-96, class348_sub47)
                            }
                            if (i_8_ == 9) {
                                Class339.anInt4198++
                                val class348_sub47 = method2148((Class311.aClass351_3898), (Class348_Sub23_Sub2.aClass77_9029), -107)
                                method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                                Class348_Sub42_Sub14.method3243(119, class348_sub47)
                            }
                            if (i_8_ != 10) break
                            Class308.anInt3886++
                            val class348_sub47 = method2148(Class281.aClass351_3644, (Class348_Sub23_Sub2.aClass77_9029), -120)
                            method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                            Class348_Sub42_Sub14.method3243(117, class348_sub47)
                        }
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(runtimeexception, ("hf.D(" + i + ',' + (if (string != null) "{...}" else "null") + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'))
                }
                break
            } while (false)
        }

        @JvmStatic
        fun method2782(i: Int, i_13_: Int, i_14_: Int): Byte {
            if (i_14_ != 0) Companion.method2783(-96, (-65).toByte(), -96)
            anInt6690++
            if (i_13_ != 9) return 0.toByte()
            if ((i and 0x1) == 0) return 1.toByte()
            return 2.toByte()
        }

        @JvmStatic
        fun method2783(i: Int, i_15_: Byte, i_16_: Int): Boolean {
            anInt6682++
            val i_17_ = 53 / ((15 - i_15_) / 55)
            return (method3262(i_16_, i, 118) and method3563(i_16_, 56.toByte(), i))
        }
    }
}
