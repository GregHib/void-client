import kotlin.math.min

/* Class105_Sub3_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class105_Sub3_Sub2 internal constructor(var_ha_Sub1: ha_Sub1, private val aByteArray9934: ByteArray, private val anIntArray9935: IntArray, i: Int, i_417_: Int) : Class105_Sub3(var_ha_Sub1, i, i_417_) {
    override fun method979(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int) {
        throw IllegalStateException()
    }

    override fun method968(i: Int, i_5_: Int, i_6_: Int) {
        throw IllegalStateException()
    }

    override fun method996(i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int, i_13_: Int, i_14_: Int) {
        var i = i
        var i_7_ = i_7_
        var i_9_ = i_9_
        var i_10_ = i_10_
        var i_12_ = i_12_
        if (i_9_ > 0 && i_10_ > 0) {
            var i_15_ = 0
            var i_16_ = 0
            val i_17_ = (this.anInt8461 + this.anInt8471 + this.anInt8454)
            val i_18_ = (this.anInt8464 + this.anInt8470 + this.anInt8456)
            val i_19_ = (i_17_ shl 16) / i_9_
            val i_20_ = (i_18_ shl 16) / i_10_
            if (this.anInt8461 > 0) {
                val i_21_ = (((this.anInt8461 shl 16) + i_19_ - 1) / i_19_)
                i += i_21_
                i_15_ += i_21_ * i_19_ - (this.anInt8461 shl 16)
            }
            if (this.anInt8464 > 0) {
                val i_22_ = (((this.anInt8464 shl 16) + i_20_ - 1) / i_20_)
                i_7_ += i_22_
                i_16_ += i_22_ * i_20_ - (this.anInt8464 shl 16)
            }
            if (this.anInt8471 < i_17_) i_9_ = ((this.anInt8471 shl 16) - i_15_ + i_19_ - 1) / i_19_
            if (this.anInt8470 < i_18_) i_10_ = ((this.anInt8470 shl 16) - i_16_ + i_20_ - 1) / i_20_
            var i_23_ = i + i_7_ * (aHa_Sub1_8460.anInt7477)
            var i_24_ = (aHa_Sub1_8460.anInt7477 - i_9_)
            if (i_7_ + i_10_ > aHa_Sub1_8460.anInt7503) i_10_ -= i_7_ + i_10_ - aHa_Sub1_8460.anInt7503
            if (i_7_ < aHa_Sub1_8460.anInt7476) {
                val i_25_ = ((aHa_Sub1_8460.anInt7476) - i_7_)
                i_10_ -= i_25_
                i_23_ += i_25_ * aHa_Sub1_8460.anInt7477
                i_16_ += i_20_ * i_25_
            }
            if (i + i_9_ > aHa_Sub1_8460.anInt7507) {
                val i_26_ = i + i_9_ - aHa_Sub1_8460.anInt7507
                i_9_ -= i_26_
                i_24_ += i_26_
            }
            if (i < aHa_Sub1_8460.anInt7496) {
                val i_27_ = ((aHa_Sub1_8460.anInt7496) - i)
                i_9_ -= i_27_
                i_23_ += i_27_
                i_15_ += i_19_ * i_27_
                i_24_ += i_27_
            }
            val fs = (aHa_Sub1_8460.aFloatArray7511)
            val `is` = (aHa_Sub1_8460.anIntArray7483)
            if (i_13_ == 0) {
                if (i_11_ == 1) {
                    val i_28_ = i_15_
                    for (i_29_ in -i_10_..-1) {
                        val i_30_ = (i_16_ shr 16) * this.anInt8471
                        for (i_31_ in -i_9_..-1) {
                            if (i_8_.toFloat() < fs!![i_23_]) {
                                `is`!![i_23_] = (anIntArray9935[(aByteArray9934[(i_15_ shr 16) + i_30_].toInt() and 0xff)])
                                fs[i_23_] = i_8_.toFloat()
                            }
                            i_15_ += i_19_
                            i_23_++
                        }
                        i_16_ += i_20_
                        i_15_ = i_28_
                        i_23_ += i_24_
                    }
                    return
                }
                if (i_11_ == 0) {
                    val i_32_ = (i_12_ and 0xff0000) shr 16
                    val i_33_ = (i_12_ and 0xff00) shr 8
                    val i_34_ = i_12_ and 0xff
                    val i_35_ = i_15_
                    for (i_36_ in -i_10_..-1) {
                        val i_37_ = (i_16_ shr 16) * this.anInt8471
                        for (i_38_ in -i_9_..-1) {
                            if (i_8_.toFloat() < fs!![i_23_]) {
                                val i_39_ = (anIntArray9935[(aByteArray9934[(i_15_ shr 16) + i_37_].toInt() and 0xff)])
                                val i_40_ = (i_39_ and 0xff0000) * i_32_ and 0xffffff.inv()
                                val i_41_ = (i_39_ and 0xff00) * i_33_ and 0xff0000
                                val i_42_ = (i_39_ and 0xff) * i_34_ and 0xff00
                                `is`!![i_23_] = (i_40_ or i_41_ or i_42_) ushr 8
                                fs[i_23_] = i_8_.toFloat()
                            }
                            i_15_ += i_19_
                            i_23_++
                        }
                        i_16_ += i_20_
                        i_15_ = i_35_
                        i_23_ += i_24_
                    }
                    return
                }
                if (i_11_ == 3) {
                    val i_43_ = i_15_
                    for (i_44_ in -i_10_..-1) {
                        val i_45_ = (i_16_ shr 16) * this.anInt8471
                        for (i_46_ in -i_9_..-1) {
                            if (i_8_.toFloat() < fs!![i_23_]) {
                                val i_47_ = aByteArray9934[(i_15_ shr 16) + i_45_]
                                val i_48_ = if (i_47_ > 0) anIntArray9935[i_47_.toInt()] else 0
                                val i_49_ = i_48_ + i_12_
                                val i_50_ = (i_48_ and 0xff00ff) + (i_12_ and 0xff00ff)
                                val i_51_ = ((i_50_ and 0x1000100) + (i_49_ - i_50_ and 0x10000))
                                `is`!![i_23_] = i_49_ - i_51_ or i_51_ - (i_51_ ushr 8)
                                fs[i_23_] = i_8_.toFloat()
                            }
                            i_15_ += i_19_
                            i_23_++
                        }
                        i_16_ += i_20_
                        i_15_ = i_43_
                        i_23_ += i_24_
                    }
                    return
                }
                if (i_11_ == 2) {
                    val i_52_ = i_12_ ushr 24
                    val i_53_ = 256 - i_52_
                    var i_54_ = (i_12_ and 0xff00ff) * i_53_ and 0xff00ff.inv()
                    var i_55_ = (i_12_ and 0xff00) * i_53_ and 0xff0000
                    i_12_ = (i_54_ or i_55_) ushr 8
                    val i_56_ = i_15_
                    for (i_57_ in -i_10_..-1) {
                        val i_58_ = (i_16_ shr 16) * this.anInt8471
                        for (i_59_ in -i_9_..-1) {
                            if (i_8_.toFloat() < fs!![i_23_]) {
                                val i_60_ = (anIntArray9935[(aByteArray9934[(i_15_ shr 16) + i_58_].toInt() and 0xff)])
                                i_54_ = (i_60_ and 0xff00ff) * i_52_ and 0xff00ff.inv()
                                i_55_ = (i_60_ and 0xff00) * i_52_ and 0xff0000
                                `is`!![i_23_] = ((i_54_ or i_55_) ushr 8) + i_12_
                                fs[i_23_] = i_8_.toFloat()
                            }
                            i_15_ += i_19_
                            i_23_++
                        }
                        i_16_ += i_20_
                        i_15_ = i_56_
                        i_23_ += i_24_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            if (i_13_ == 1) {
                if (i_11_ == 1) {
                    val i_61_ = i_15_
                    for (i_62_ in -i_10_..-1) {
                        val i_63_ = (i_16_ shr 16) * this.anInt8471
                        for (i_64_ in -i_9_..-1) {
                            if (i_8_.toFloat() < fs!![i_23_]) {
                                val i_65_ = aByteArray9934[(i_15_ shr 16) + i_63_].toInt()
                                if (i_65_ != 0) {
                                    `is`!![i_23_] = anIntArray9935[i_65_ and 0xff]
                                    fs[i_23_] = i_8_.toFloat()
                                }
                            }
                            i_15_ += i_19_
                            i_23_++
                        }
                        i_16_ += i_20_
                        i_15_ = i_61_
                        i_23_ += i_24_
                    }
                    return
                }
                if (i_11_ == 0) {
                    val i_66_ = i_15_
                    if ((i_12_ and 0xffffff) == 16777215) {
                        val i_67_ = i_12_ ushr 24
                        val i_68_ = 256 - i_67_
                        for (i_69_ in -i_10_..-1) {
                            val i_70_ = ((i_16_ shr 16) * this.anInt8471)
                            for (i_71_ in -i_9_..-1) {
                                if (i_8_.toFloat() < fs!![i_23_]) {
                                    val i_72_ = (aByteArray9934[(i_15_ shr 16) + i_70_]).toInt()
                                    if (i_72_ != 0) {
                                        val i_73_ = anIntArray9935[i_72_ and 0xff]
                                        val i_74_ = `is`!![i_23_]
                                        `is`[i_23_] = ((((i_73_ and 0xff00ff) * i_67_ + (i_74_ and 0xff00ff) * i_68_) and 0xff00ff.inv()) + (((i_73_ and 0xff00) * i_67_ + (i_74_ and 0xff00) * i_68_) and 0xff0000)) shr 8
                                        fs[i_23_] = i_8_.toFloat()
                                    }
                                }
                                i_15_ += i_19_
                                i_23_++
                            }
                            i_16_ += i_20_
                            i_15_ = i_66_
                            i_23_ += i_24_
                        }
                    } else {
                        val i_75_ = (i_12_ and 0xff0000) shr 16
                        val i_76_ = (i_12_ and 0xff00) shr 8
                        val i_77_ = i_12_ and 0xff
                        val i_78_ = i_12_ ushr 24
                        val i_79_ = 256 - i_78_
                        for (i_80_ in -i_10_..-1) {
                            val i_81_ = ((i_16_ shr 16) * this.anInt8471)
                            for (i_82_ in -i_9_..-1) {
                                if (i_8_.toFloat() < fs!![i_23_]) {
                                    val i_83_ = (aByteArray9934[(i_15_ shr 16) + i_81_]).toInt()
                                    if (i_83_ != 0) {
                                        var i_84_ = anIntArray9935[i_83_ and 0xff]
                                        if (i_78_ == 255) {
                                            val i_89_ = ((i_84_ and 0xff0000) * i_75_ and 0xffffff.inv())
                                            val i_90_ = ((i_84_ and 0xff00) * i_76_ and 0xff0000)
                                            val i_91_ = ((i_84_ and 0xff) * i_77_ and 0xff00)
                                            `is`!![i_23_] = (i_89_ or i_90_ or i_91_) ushr 8
                                            fs[i_23_] = i_8_.toFloat()
                                        } else {
                                            val i_85_ = ((i_84_ and 0xff0000) * i_75_ and 0xffffff.inv())
                                            val i_86_ = ((i_84_ and 0xff00) * i_76_ and 0xff0000)
                                            val i_87_ = ((i_84_ and 0xff) * i_77_ and 0xff00)
                                            i_84_ = ((i_85_ or i_86_ or i_87_) ushr 8)
                                            val i_88_ = `is`!![i_23_]
                                            `is`[i_23_] = ((((i_84_ and 0xff00ff) * i_78_ + ((i_88_ and 0xff00ff) * i_79_)) and 0xff00ff.inv()) + (((i_84_ and 0xff00) * i_78_ + ((i_88_ and 0xff00) * i_79_)) and 0xff0000)) shr 8
                                            fs[i_23_] = i_8_.toFloat()
                                        }
                                    }
                                }
                                i_15_ += i_19_
                                i_23_++
                            }
                            i_16_ += i_20_
                            i_15_ = i_66_
                            i_23_ += i_24_
                        }
                        return
                    }
                    return
                }
                if (i_11_ == 3) {
                    val i_92_ = i_15_
                    val i_93_ = i_12_ ushr 24
                    val i_94_ = 256 - i_93_
                    for (i_95_ in -i_10_..-1) {
                        val i_96_ = (i_16_ shr 16) * this.anInt8471
                        for (i_97_ in -i_9_..-1) {
                            if (i_8_.toFloat() < fs!![i_23_]) {
                                val i_98_ = aByteArray9934[(i_15_ shr 16) + i_96_]
                                var i_99_ = if (i_98_ > 0) anIntArray9935[i_98_.toInt()] else 0
                                val i_100_ = i_99_ + i_12_
                                val i_101_ = (i_99_ and 0xff00ff) + (i_12_ and 0xff00ff)
                                var i_102_ = ((i_101_ and 0x1000100) + (i_100_ - i_101_ and 0x10000))
                                i_102_ = i_100_ - i_102_ or i_102_ - (i_102_ ushr 8)
                                if (i_99_ == 0 && i_93_ != 255) {
                                    i_99_ = i_102_
                                    i_102_ = `is`!![i_23_]
                                    i_102_ = ((((i_99_ and 0xff00ff) * i_93_ + (i_102_ and 0xff00ff) * i_94_) and 0xff00ff.inv()) + (((i_99_ and 0xff00) * i_93_ + (i_102_ and 0xff00) * i_94_) and 0xff0000)) shr 8
                                }
                                `is`!![i_23_] = i_102_
                                fs[i_23_] = i_8_.toFloat()
                            }
                            i_15_ += i_19_
                            i_23_++
                        }
                        i_16_ += i_20_
                        i_15_ = i_92_
                        i_23_ += i_24_
                    }
                    return
                }
                if (i_11_ == 2) {
                    val i_103_ = i_12_ ushr 24
                    val i_104_ = 256 - i_103_
                    var i_105_ = (i_12_ and 0xff00ff) * i_104_ and 0xff00ff.inv()
                    var i_106_ = (i_12_ and 0xff00) * i_104_ and 0xff0000
                    i_12_ = (i_105_ or i_106_) ushr 8
                    val i_107_ = i_15_
                    for (i_108_ in -i_10_..-1) {
                        val i_109_ = (i_16_ shr 16) * this.anInt8471
                        for (i_110_ in -i_9_..-1) {
                            if (i_8_.toFloat() < fs!![i_23_]) {
                                val i_111_ = aByteArray9934[(i_15_ shr 16) + i_109_].toInt()
                                if (i_111_ != 0) {
                                    val i_112_ = anIntArray9935[i_111_ and 0xff]
                                    i_105_ = ((i_112_ and 0xff00ff) * i_103_ and 0xff00ff.inv())
                                    i_106_ = ((i_112_ and 0xff00) * i_103_ and 0xff0000)
                                    `is`!![i_23_] = ((i_105_ or i_106_) ushr 8) + i_12_
                                    fs[i_23_] = i_8_.toFloat()
                                }
                            }
                            i_15_ += i_19_
                            i_23_++
                        }
                        i_16_ += i_20_
                        i_15_ = i_107_
                        i_23_ += i_24_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            if (i_13_ == 2) {
                if (i_11_ == 1) {
                    val i_113_ = i_15_
                    for (i_114_ in -i_10_..-1) {
                        val i_115_ = (i_16_ shr 16) * this.anInt8471
                        for (i_116_ in -i_9_..-1) {
                            if (i_8_.toFloat() < fs!![i_23_]) {
                                val i_117_ = aByteArray9934[(i_15_ shr 16) + i_115_].toInt()
                                if (i_117_ != 0) {
                                    val i_118_ = anIntArray9935[i_117_ and 0xff]
                                    var i_119_ = `is`!![i_23_]
                                    val i_120_ = i_118_ + i_119_
                                    val i_121_ = ((i_118_ and 0xff00ff) + (i_119_ and 0xff00ff))
                                    i_119_ = ((i_121_ and 0x1000100) + (i_120_ - i_121_ and 0x10000))
                                    `is`[i_23_] = i_120_ - i_119_ or i_119_ - (i_119_ ushr 8)
                                    fs[i_23_] = i_8_.toFloat()
                                }
                            }
                            i_15_ += i_19_
                            i_23_++
                        }
                        i_16_ += i_20_
                        i_15_ = i_113_
                        i_23_ += i_24_
                    }
                    return
                }
                if (i_11_ == 0) {
                    val i_122_ = i_15_
                    val i_123_ = (i_12_ and 0xff0000) shr 16
                    val i_124_ = (i_12_ and 0xff00) shr 8
                    val i_125_ = i_12_ and 0xff
                    for (i_126_ in -i_10_..-1) {
                        val i_127_ = (i_16_ shr 16) * this.anInt8471
                        for (i_128_ in -i_9_..-1) {
                            if (i_8_.toFloat() < fs!![i_23_]) {
                                val i_129_ = aByteArray9934[(i_15_ shr 16) + i_127_].toInt()
                                if (i_129_ != 0) {
                                    var i_130_ = anIntArray9935[i_129_ and 0xff]
                                    val i_131_ = ((i_130_ and 0xff0000) * i_123_ and 0xffffff.inv())
                                    val i_132_ = ((i_130_ and 0xff00) * i_124_ and 0xff0000)
                                    val i_133_ = (i_130_ and 0xff) * i_125_ and 0xff00
                                    i_130_ = (i_131_ or i_132_ or i_133_) ushr 8
                                    var i_134_ = `is`!![i_23_]
                                    val i_135_ = i_130_ + i_134_
                                    val i_136_ = ((i_130_ and 0xff00ff) + (i_134_ and 0xff00ff))
                                    i_134_ = ((i_136_ and 0x1000100) + (i_135_ - i_136_ and 0x10000))
                                    `is`[i_23_] = i_135_ - i_134_ or i_134_ - (i_134_ ushr 8)
                                    fs[i_23_] = i_8_.toFloat()
                                }
                            }
                            i_15_ += i_19_
                            i_23_++
                        }
                        i_16_ += i_20_
                        i_15_ = i_122_
                        i_23_ += i_24_
                    }
                    return
                }
                if (i_11_ == 3) {
                    val i_137_ = i_15_
                    for (i_138_ in -i_10_..-1) {
                        val i_139_ = (i_16_ shr 16) * this.anInt8471
                        for (i_140_ in -i_9_..-1) {
                            if (i_8_.toFloat() < fs!![i_23_]) {
                                val i_141_ = aByteArray9934[(i_15_ shr 16) + i_139_]
                                var i_142_ = if (i_141_ > 0) anIntArray9935[i_141_.toInt()] else 0
                                var i_143_ = i_142_ + i_12_
                                var i_144_ = (i_142_ and 0xff00ff) + (i_12_ and 0xff00ff)
                                var i_145_ = ((i_144_ and 0x1000100) + (i_143_ - i_144_ and 0x10000))
                                i_142_ = i_143_ - i_145_ or i_145_ - (i_145_ ushr 8)
                                i_145_ = `is`!![i_23_]
                                i_143_ = i_142_ + i_145_
                                i_144_ = (i_142_ and 0xff00ff) + (i_145_ and 0xff00ff)
                                i_145_ = (i_144_ and 0x1000100) + (i_143_ - i_144_ and 0x10000)
                                `is`[i_23_] = i_143_ - i_145_ or i_145_ - (i_145_ ushr 8)
                                fs[i_23_] = i_8_.toFloat()
                            }
                            i_15_ += i_19_
                            i_23_++
                        }
                        i_16_ += i_20_
                        i_15_ = i_137_
                        i_23_ += i_24_
                    }
                    return
                }
                if (i_11_ == 2) {
                    val i_146_ = i_12_ ushr 24
                    val i_147_ = 256 - i_146_
                    var i_148_ = (i_12_ and 0xff00ff) * i_147_ and 0xff00ff.inv()
                    var i_149_ = (i_12_ and 0xff00) * i_147_ and 0xff0000
                    i_12_ = (i_148_ or i_149_) ushr 8
                    val i_150_ = i_15_
                    for (i_151_ in -i_10_..-1) {
                        val i_152_ = (i_16_ shr 16) * this.anInt8471
                        for (i_153_ in -i_9_..-1) {
                            if (i_8_.toFloat() < fs!![i_23_]) {
                                val i_154_ = aByteArray9934[(i_15_ shr 16) + i_152_].toInt()
                                if (i_154_ != 0) {
                                    var i_155_ = anIntArray9935[i_154_ and 0xff]
                                    i_148_ = ((i_155_ and 0xff00ff) * i_146_ and 0xff00ff.inv())
                                    i_149_ = ((i_155_ and 0xff00) * i_146_ and 0xff0000)
                                    i_155_ = ((i_148_ or i_149_) ushr 8) + i_12_
                                    var i_156_ = `is`!![i_23_]
                                    val i_157_ = i_155_ + i_156_
                                    val i_158_ = ((i_155_ and 0xff00ff) + (i_156_ and 0xff00ff))
                                    i_156_ = ((i_158_ and 0x1000100) + (i_157_ - i_158_ and 0x10000))
                                    `is`[i_23_] = i_157_ - i_156_ or i_156_ - (i_156_ ushr 8)
                                    fs[i_23_] = i_8_.toFloat()
                                }
                            }
                            i_15_ += i_19_
                            i_23_++
                        }
                        i_16_ += i_20_
                        i_15_ = i_150_
                        i_23_ += i_24_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            throw IllegalArgumentException()
        }
    }

    override fun method982(i: Int, i_159_: Int, i_160_: Int, i_161_: Int, i_162_: Int, i_163_: Int, i_164_: Int, i_165_: Int) {
        var i = i
        var i_159_ = i_159_
        var i_160_ = i_160_
        var i_161_ = i_161_
        var i_163_ = i_163_
        check(!aHa_Sub1_8460.method3716())
        if (i_160_ > 0 && i_161_ > 0) {
            var i_166_ = 0
            var i_167_ = 0
            val i_168_ = aHa_Sub1_8460.anInt7477
            val i_169_ = (this.anInt8461 + this.anInt8471 + this.anInt8454)
            val i_170_ = (this.anInt8464 + this.anInt8470 + this.anInt8456)
            val i_171_ = (i_169_ shl 16) / i_160_
            val i_172_ = (i_170_ shl 16) / i_161_
            if (this.anInt8461 > 0) {
                val i_173_ = (((this.anInt8461 shl 16) + i_171_ - 1) / i_171_)
                i += i_173_
                i_166_ += i_173_ * i_171_ - (this.anInt8461 shl 16)
            }
            if (this.anInt8464 > 0) {
                val i_174_ = (((this.anInt8464 shl 16) + i_172_ - 1) / i_172_)
                i_159_ += i_174_
                i_167_ += i_174_ * i_172_ - (this.anInt8464 shl 16)
            }
            if (this.anInt8471 < i_169_) i_160_ = ((this.anInt8471 shl 16) - i_166_ + i_171_ - 1) / i_171_
            if (this.anInt8470 < i_170_) i_161_ = ((this.anInt8470 shl 16) - i_167_ + i_172_ - 1) / i_172_
            var i_175_ = i + i_159_ * i_168_
            var i_176_ = i_168_ - i_160_
            if (i_159_ + i_161_ > aHa_Sub1_8460.anInt7503) i_161_ -= (i_159_ + i_161_ - (aHa_Sub1_8460.anInt7503))
            if (i_159_ < aHa_Sub1_8460.anInt7476) {
                val i_177_ = ((aHa_Sub1_8460.anInt7476) - i_159_)
                i_161_ -= i_177_
                i_175_ += i_177_ * i_168_
                i_167_ += i_172_ * i_177_
            }
            if (i + i_160_ > aHa_Sub1_8460.anInt7507) {
                val i_178_ = (i + i_160_ - (aHa_Sub1_8460.anInt7507))
                i_160_ -= i_178_
                i_176_ += i_178_
            }
            if (i < aHa_Sub1_8460.anInt7496) {
                val i_179_ = ((aHa_Sub1_8460.anInt7496) - i)
                i_160_ -= i_179_
                i_175_ += i_179_
                i_166_ += i_171_ * i_179_
                i_176_ += i_179_
            }
            val `is` = (aHa_Sub1_8460.anIntArray7483)
            if (i_164_ == 0) {
                if (i_162_ == 1) {
                    val i_180_ = i_166_
                    for (i_181_ in -i_161_..-1) {
                        val i_182_ = ((i_167_ shr 16) * this.anInt8471)
                        for (i_183_ in -i_160_..-1) {
                            `is`!![i_175_++] = (anIntArray9935[(aByteArray9934[(i_166_ shr 16) + i_182_].toInt() and 0xff)])
                            i_166_ += i_171_
                        }
                        i_167_ += i_172_
                        i_166_ = i_180_
                        i_175_ += i_176_
                    }
                    return
                }
                if (i_162_ == 0) {
                    val i_184_ = (i_163_ and 0xff0000) shr 16
                    val i_185_ = (i_163_ and 0xff00) shr 8
                    val i_186_ = i_163_ and 0xff
                    val i_187_ = i_166_
                    for (i_188_ in -i_161_..-1) {
                        val i_189_ = ((i_167_ shr 16) * this.anInt8471)
                        for (i_190_ in -i_160_..-1) {
                            val i_191_ = (anIntArray9935[(aByteArray9934[(i_166_ shr 16) + i_189_].toInt() and 0xff)])
                            val i_192_ = (i_191_ and 0xff0000) * i_184_ and 0xffffff.inv()
                            val i_193_ = (i_191_ and 0xff00) * i_185_ and 0xff0000
                            val i_194_ = (i_191_ and 0xff) * i_186_ and 0xff00
                            `is`!![i_175_++] = (i_192_ or i_193_ or i_194_) ushr 8
                            i_166_ += i_171_
                        }
                        i_167_ += i_172_
                        i_166_ = i_187_
                        i_175_ += i_176_
                    }
                    return
                }
                if (i_162_ == 3) {
                    val i_195_ = i_166_
                    for (i_196_ in -i_161_..-1) {
                        val i_197_ = ((i_167_ shr 16) * this.anInt8471)
                        for (i_198_ in -i_160_..-1) {
                            val i_199_ = aByteArray9934[(i_166_ shr 16) + i_197_]
                            val i_200_ = if (i_199_ > 0) anIntArray9935[i_199_.toInt()] else 0
                            val i_201_ = i_200_ + i_163_
                            val i_202_ = (i_200_ and 0xff00ff) + (i_163_ and 0xff00ff)
                            val i_203_ = ((i_202_ and 0x1000100) + (i_201_ - i_202_ and 0x10000))
                            `is`!![i_175_++] = i_201_ - i_203_ or i_203_ - (i_203_ ushr 8)
                            i_166_ += i_171_
                        }
                        i_167_ += i_172_
                        i_166_ = i_195_
                        i_175_ += i_176_
                    }
                    return
                }
                if (i_162_ == 2) {
                    val i_204_ = i_163_ ushr 24
                    val i_205_ = 256 - i_204_
                    var i_206_ = (i_163_ and 0xff00ff) * i_205_ and 0xff00ff.inv()
                    var i_207_ = (i_163_ and 0xff00) * i_205_ and 0xff0000
                    i_163_ = (i_206_ or i_207_) ushr 8
                    val i_208_ = i_166_
                    for (i_209_ in -i_161_..-1) {
                        val i_210_ = ((i_167_ shr 16) * this.anInt8471)
                        for (i_211_ in -i_160_..-1) {
                            val i_212_ = (anIntArray9935[(aByteArray9934[(i_166_ shr 16) + i_210_].toInt() and 0xff)])
                            i_206_ = (i_212_ and 0xff00ff) * i_204_ and 0xff00ff.inv()
                            i_207_ = (i_212_ and 0xff00) * i_204_ and 0xff0000
                            `is`!![i_175_++] = ((i_206_ or i_207_) ushr 8) + i_163_
                            i_166_ += i_171_
                        }
                        i_167_ += i_172_
                        i_166_ = i_208_
                        i_175_ += i_176_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            if (i_164_ == 1) {
                if (i_162_ == 1) {
                    val i_213_ = i_166_
                    for (i_214_ in -i_161_..-1) {
                        val i_215_ = ((i_167_ shr 16) * this.anInt8471)
                        for (i_216_ in -i_160_..-1) {
                            val i_217_ = aByteArray9934[(i_166_ shr 16) + i_215_].toInt()
                            if (i_217_ != 0) `is`!![i_175_++] = anIntArray9935[i_217_ and 0xff]
                            else i_175_++
                            i_166_ += i_171_
                        }
                        i_167_ += i_172_
                        i_166_ = i_213_
                        i_175_ += i_176_
                    }
                    return
                }
                if (i_162_ == 0) {
                    val i_218_ = i_166_
                    if ((i_163_ and 0xffffff) == 16777215) {
                        val i_219_ = i_163_ ushr 24
                        val i_220_ = 256 - i_219_
                        for (i_221_ in -i_161_..-1) {
                            val i_222_ = ((i_167_ shr 16) * this.anInt8471)
                            for (i_223_ in -i_160_..-1) {
                                val i_224_ = aByteArray9934[(i_166_ shr 16) + i_222_].toInt()
                                if (i_224_ != 0) {
                                    val i_225_ = anIntArray9935[i_224_ and 0xff]
                                    val i_226_ = `is`!![i_175_]
                                    `is`[i_175_++] = ((((i_225_ and 0xff00ff) * i_219_ + (i_226_ and 0xff00ff) * i_220_) and 0xff00ff.inv()) + (((i_225_ and 0xff00) * i_219_ + (i_226_ and 0xff00) * i_220_) and 0xff0000)) shr 8
                                } else i_175_++
                                i_166_ += i_171_
                            }
                            i_167_ += i_172_
                            i_166_ = i_218_
                            i_175_ += i_176_
                        }
                    } else {
                        val i_227_ = (i_163_ and 0xff0000) shr 16
                        val i_228_ = (i_163_ and 0xff00) shr 8
                        val i_229_ = i_163_ and 0xff
                        val i_230_ = i_163_ ushr 24
                        val i_231_ = 256 - i_230_
                        for (i_232_ in -i_161_..-1) {
                            val i_233_ = ((i_167_ shr 16) * this.anInt8471)
                            for (i_234_ in -i_160_..-1) {
                                val i_235_ = aByteArray9934[(i_166_ shr 16) + i_233_].toInt()
                                if (i_235_ != 0) {
                                    var i_236_ = anIntArray9935[i_235_ and 0xff]
                                    if (i_230_ == 255) {
                                        val i_241_ = ((i_236_ and 0xff0000) * i_227_ and 0xffffff.inv())
                                        val i_242_ = ((i_236_ and 0xff00) * i_228_ and 0xff0000)
                                        val i_243_ = ((i_236_ and 0xff) * i_229_ and 0xff00)
                                        `is`!![i_175_++] = (i_241_ or i_242_ or i_243_) ushr 8
                                    } else {
                                        val i_237_ = ((i_236_ and 0xff0000) * i_227_ and 0xffffff.inv())
                                        val i_238_ = ((i_236_ and 0xff00) * i_228_ and 0xff0000)
                                        val i_239_ = ((i_236_ and 0xff) * i_229_ and 0xff00)
                                        i_236_ = (i_237_ or i_238_ or i_239_) ushr 8
                                        val i_240_ = `is`!![i_175_]
                                        `is`[i_175_++] = ((((i_236_ and 0xff00ff) * i_230_ + ((i_240_ and 0xff00ff) * i_231_)) and 0xff00ff.inv()) + (((i_236_ and 0xff00) * i_230_ + ((i_240_ and 0xff00) * i_231_)) and 0xff0000)) shr 8
                                    }
                                } else i_175_++
                                i_166_ += i_171_
                            }
                            i_167_ += i_172_
                            i_166_ = i_218_
                            i_175_ += i_176_
                        }
                        return
                    }
                    return
                }
                if (i_162_ == 3) {
                    val i_244_ = i_166_
                    val i_245_ = i_163_ ushr 24
                    val i_246_ = 256 - i_245_
                    for (i_247_ in -i_161_..-1) {
                        val i_248_ = ((i_167_ shr 16) * this.anInt8471)
                        for (i_249_ in -i_160_..-1) {
                            val i_250_ = aByteArray9934[(i_166_ shr 16) + i_248_]
                            var i_251_ = if (i_250_ > 0) anIntArray9935[i_250_.toInt()] else 0
                            val i_252_ = i_251_ + i_163_
                            val i_253_ = (i_251_ and 0xff00ff) + (i_163_ and 0xff00ff)
                            var i_254_ = ((i_253_ and 0x1000100) + (i_252_ - i_253_ and 0x10000))
                            i_254_ = i_252_ - i_254_ or i_254_ - (i_254_ ushr 8)
                            if (i_251_ == 0 && i_245_ != 255) {
                                i_251_ = i_254_
                                i_254_ = `is`!![i_175_]
                                i_254_ = ((((i_251_ and 0xff00ff) * i_245_ + (i_254_ and 0xff00ff) * i_246_) and 0xff00ff.inv()) + (((i_251_ and 0xff00) * i_245_ + (i_254_ and 0xff00) * i_246_) and 0xff0000)) shr 8
                            }
                            `is`!![i_175_++] = i_254_
                            i_166_ += i_171_
                        }
                        i_167_ += i_172_
                        i_166_ = i_244_
                        i_175_ += i_176_
                    }
                    return
                }
                if (i_162_ == 2) {
                    val i_255_ = i_163_ ushr 24
                    val i_256_ = 256 - i_255_
                    var i_257_ = (i_163_ and 0xff00ff) * i_256_ and 0xff00ff.inv()
                    var i_258_ = (i_163_ and 0xff00) * i_256_ and 0xff0000
                    i_163_ = (i_257_ or i_258_) ushr 8
                    val i_259_ = i_166_
                    for (i_260_ in -i_161_..-1) {
                        val i_261_ = ((i_167_ shr 16) * this.anInt8471)
                        for (i_262_ in -i_160_..-1) {
                            val i_263_ = aByteArray9934[(i_166_ shr 16) + i_261_].toInt()
                            if (i_263_ != 0) {
                                val i_264_ = anIntArray9935[i_263_ and 0xff]
                                i_257_ = (i_264_ and 0xff00ff) * i_255_ and 0xff00ff.inv()
                                i_258_ = (i_264_ and 0xff00) * i_255_ and 0xff0000
                                `is`!![i_175_++] = ((i_257_ or i_258_) ushr 8) + i_163_
                            } else i_175_++
                            i_166_ += i_171_
                        }
                        i_167_ += i_172_
                        i_166_ = i_259_
                        i_175_ += i_176_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            if (i_164_ == 2) {
                if (i_162_ == 1) {
                    val i_265_ = i_166_
                    for (i_266_ in -i_161_..-1) {
                        val i_267_ = ((i_167_ shr 16) * this.anInt8471)
                        for (i_268_ in -i_160_..-1) {
                            val i_269_ = aByteArray9934[(i_166_ shr 16) + i_267_].toInt()
                            if (i_269_ != 0) {
                                val i_270_ = anIntArray9935[i_269_ and 0xff]
                                var i_271_ = `is`!![i_175_]
                                val i_272_ = i_270_ + i_271_
                                val i_273_ = ((i_270_ and 0xff00ff) + (i_271_ and 0xff00ff))
                                i_271_ = (i_273_ and 0x1000100) + (i_272_ - i_273_ and 0x10000)
                                `is`[i_175_++] = i_272_ - i_271_ or i_271_ - (i_271_ ushr 8)
                            } else i_175_++
                            i_166_ += i_171_
                        }
                        i_167_ += i_172_
                        i_166_ = i_265_
                        i_175_ += i_176_
                    }
                    return
                }
                if (i_162_ == 0) {
                    val i_274_ = i_166_
                    val i_275_ = (i_163_ and 0xff0000) shr 16
                    val i_276_ = (i_163_ and 0xff00) shr 8
                    val i_277_ = i_163_ and 0xff
                    for (i_278_ in -i_161_..-1) {
                        val i_279_ = ((i_167_ shr 16) * this.anInt8471)
                        for (i_280_ in -i_160_..-1) {
                            val i_281_ = aByteArray9934[(i_166_ shr 16) + i_279_].toInt()
                            if (i_281_ != 0) {
                                var i_282_ = anIntArray9935[i_281_ and 0xff]
                                val i_283_ = (i_282_ and 0xff0000) * i_275_ and 0xffffff.inv()
                                val i_284_ = (i_282_ and 0xff00) * i_276_ and 0xff0000
                                val i_285_ = (i_282_ and 0xff) * i_277_ and 0xff00
                                i_282_ = (i_283_ or i_284_ or i_285_) ushr 8
                                var i_286_ = `is`!![i_175_]
                                val i_287_ = i_282_ + i_286_
                                val i_288_ = ((i_282_ and 0xff00ff) + (i_286_ and 0xff00ff))
                                i_286_ = (i_288_ and 0x1000100) + (i_287_ - i_288_ and 0x10000)
                                `is`[i_175_++] = i_287_ - i_286_ or i_286_ - (i_286_ ushr 8)
                            } else i_175_++
                            i_166_ += i_171_
                        }
                        i_167_ += i_172_
                        i_166_ = i_274_
                        i_175_ += i_176_
                    }
                    return
                }
                if (i_162_ == 3) {
                    val i_289_ = i_166_
                    for (i_290_ in -i_161_..-1) {
                        val i_291_ = ((i_167_ shr 16) * this.anInt8471)
                        for (i_292_ in -i_160_..-1) {
                            val i_293_ = aByteArray9934[(i_166_ shr 16) + i_291_]
                            var i_294_ = if (i_293_ > 0) anIntArray9935[i_293_.toInt()] else 0
                            var i_295_ = i_294_ + i_163_
                            var i_296_ = (i_294_ and 0xff00ff) + (i_163_ and 0xff00ff)
                            var i_297_ = ((i_296_ and 0x1000100) + (i_295_ - i_296_ and 0x10000))
                            i_294_ = i_295_ - i_297_ or i_297_ - (i_297_ ushr 8)
                            i_297_ = `is`!![i_175_]
                            i_295_ = i_294_ + i_297_
                            i_296_ = (i_294_ and 0xff00ff) + (i_297_ and 0xff00ff)
                            i_297_ = (i_296_ and 0x1000100) + (i_295_ - i_296_ and 0x10000)
                            `is`[i_175_++] = i_295_ - i_297_ or i_297_ - (i_297_ ushr 8)
                            i_166_ += i_171_
                        }
                        i_167_ += i_172_
                        i_166_ = i_289_
                        i_175_ += i_176_
                    }
                    return
                }
                if (i_162_ == 2) {
                    val i_298_ = i_163_ ushr 24
                    val i_299_ = 256 - i_298_
                    var i_300_ = (i_163_ and 0xff00ff) * i_299_ and 0xff00ff.inv()
                    var i_301_ = (i_163_ and 0xff00) * i_299_ and 0xff0000
                    i_163_ = (i_300_ or i_301_) ushr 8
                    val i_302_ = i_166_
                    for (i_303_ in -i_161_..-1) {
                        val i_304_ = ((i_167_ shr 16) * this.anInt8471)
                        for (i_305_ in -i_160_..-1) {
                            val i_306_ = aByteArray9934[(i_166_ shr 16) + i_304_].toInt()
                            if (i_306_ != 0) {
                                var i_307_ = anIntArray9935[i_306_ and 0xff]
                                i_300_ = (i_307_ and 0xff00ff) * i_298_ and 0xff00ff.inv()
                                i_301_ = (i_307_ and 0xff00) * i_298_ and 0xff0000
                                i_307_ = ((i_300_ or i_301_) ushr 8) + i_163_
                                var i_308_ = `is`!![i_175_]
                                val i_309_ = i_307_ + i_308_
                                val i_310_ = ((i_307_ and 0xff00ff) + (i_308_ and 0xff00ff))
                                i_308_ = (i_310_ and 0x1000100) + (i_309_ - i_310_ and 0x10000)
                                `is`[i_175_++] = i_309_ - i_308_ or i_308_ - (i_308_ ushr 8)
                            } else i_175_++
                            i_166_ += i_171_
                        }
                        i_167_ += i_172_
                        i_166_ = i_302_
                        i_175_ += i_176_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            throw IllegalArgumentException()
        }
    }

    override fun method995(`is`: IntArray?, is_311_: IntArray?, i: Int, i_312_: Int) {
        val is_313_ = aHa_Sub1_8460.anIntArray7483
        if (anInt8481 == 0) {
            if (anInt8450 == 0) {
                var i_314_ = anInt8468
                while (i_314_ < 0) {
                    val i_315_ = i_314_ + i_312_
                    if (i_315_ >= 0) {
                        if (i_315_ >= `is`!!.size) break
                        var i_316_ = anInt8451
                        var i_317_ = anInt8458
                        var i_318_ = anInt8467
                        var i_319_ = anInt8478
                        if (i_317_ >= 0 && i_318_ >= 0 && i_317_ - (this.anInt8471 shl 12) < 0 && i_318_ - (this.anInt8470 shl 12) < 0) {
                            val i_320_ = `is`[i_315_] - i
                            var i_321_ = -is_311_!![i_315_]
                            val i_322_ = i_320_ - (i_316_ - anInt8451)
                            if (i_322_ > 0) {
                                i_316_ += i_322_
                                i_319_ += i_322_
                                i_317_ += anInt8481 * i_322_
                                i_318_ += anInt8450 * i_322_
                            } else i_321_ -= i_322_
                            if (i_319_ < i_321_) i_319_ = i_321_
                            while ( /**/i_319_ < 0) {
                                val i_323_ = (aByteArray9934[(((i_318_ shr 12) * this.anInt8471) + (i_317_ shr 12))]).toInt()
                                if (i_323_ != 0) is_313_!![i_316_++] = anIntArray9935[i_323_ and 0xff]
                                else i_316_++
                                i_319_++
                            }
                        }
                    }
                    i_314_++
                    anInt8451 += anInt8453
                }
            } else if (anInt8450 < 0) {
                var i_324_ = anInt8468
                while (i_324_ < 0) {
                    val i_325_ = i_324_ + i_312_
                    if (i_325_ >= 0) {
                        if (i_325_ >= `is`!!.size) break
                        var i_326_ = anInt8451
                        var i_327_ = anInt8458
                        var i_328_ = (anInt8467 + anInt8475)
                        var i_329_ = anInt8478
                        if (i_327_ >= 0 && i_327_ - (this.anInt8471 shl 12) < 0) {
                            var i_330_: Int
                            if (((i_328_ - (this.anInt8470 shl 12)).also { i_330_ = it }) >= 0) {
                                i_330_ = ((anInt8450 - i_330_) / anInt8450)
                                i_329_ += i_330_
                                i_328_ += anInt8450 * i_330_
                                i_326_ += i_330_
                            }
                            if ((((i_328_ - anInt8450) / anInt8450).also { i_330_ = it }) > i_329_) i_329_ = i_330_
                            val i_331_ = `is`[i_325_] - i
                            var i_332_ = -is_311_!![i_325_]
                            val i_333_ = i_331_ - (i_326_ - anInt8451)
                            if (i_333_ > 0) {
                                i_326_ += i_333_
                                i_329_ += i_333_
                                i_327_ += anInt8481 * i_333_
                                i_328_ += anInt8450 * i_333_
                            } else i_332_ -= i_333_
                            if (i_329_ < i_332_) i_329_ = i_332_
                            while ( /**/i_329_ < 0) {
                                val i_334_ = (aByteArray9934[(((i_328_ shr 12) * this.anInt8471) + (i_327_ shr 12))]).toInt()
                                if (i_334_ != 0) is_313_!![i_326_++] = anIntArray9935[i_334_ and 0xff]
                                else i_326_++
                                i_328_ += anInt8450
                                i_329_++
                            }
                        }
                    }
                    i_324_++
                    anInt8458 += anInt8457
                    anInt8451 += anInt8453
                }
            } else {
                var i_335_ = anInt8468
                while (i_335_ < 0) {
                    val i_336_ = i_335_ + i_312_
                    if (i_336_ >= 0) {
                        if (i_336_ >= `is`!!.size) break
                        var i_337_ = anInt8451
                        var i_338_ = anInt8458
                        var i_339_ = (anInt8467 + anInt8475)
                        var i_340_ = anInt8478
                        if (i_338_ >= 0 && i_338_ - (this.anInt8471 shl 12) < 0) {
                            if (i_339_ < 0) {
                                val i_341_ = ((anInt8450 - 1 - i_339_) / anInt8450)
                                i_340_ += i_341_
                                i_339_ += anInt8450 * i_341_
                                i_337_ += i_341_
                            }
                            val i_342_: Int
                            if ((((1 + i_339_ - (this.anInt8470 shl 12) - anInt8450) / anInt8450).also { i_342_ = it }) > i_340_) i_340_ = i_342_
                            val i_343_ = `is`[i_336_] - i
                            var i_344_ = -is_311_!![i_336_]
                            val i_345_ = i_343_ - (i_337_ - anInt8451)
                            if (i_345_ > 0) {
                                i_337_ += i_345_
                                i_340_ += i_345_
                                i_338_ += anInt8481 * i_345_
                                i_339_ += anInt8450 * i_345_
                            } else i_344_ -= i_345_
                            if (i_340_ < i_344_) i_340_ = i_344_
                            while ( /**/i_340_ < 0) {
                                val i_346_ = (aByteArray9934[(((i_339_ shr 12) * this.anInt8471) + (i_338_ shr 12))]).toInt()
                                if (i_346_ != 0) is_313_!![i_337_++] = anIntArray9935[i_346_ and 0xff]
                                else i_337_++
                                i_339_ += anInt8450
                                i_340_++
                            }
                        }
                    }
                    i_335_++
                    anInt8458 += anInt8457
                    anInt8451 += anInt8453
                }
            }
        } else if (anInt8481 < 0) {
            if (anInt8450 == 0) {
                var i_347_ = anInt8468
                while (i_347_ < 0) {
                    val i_348_ = i_347_ + i_312_
                    if (i_348_ >= 0) {
                        if (i_348_ >= `is`!!.size) break
                        var i_349_ = anInt8451
                        var i_350_ = (anInt8458 + anInt8479)
                        var i_351_ = anInt8467
                        var i_352_ = anInt8478
                        if (i_351_ >= 0 && i_351_ - (this.anInt8470 shl 12) < 0) {
                            var i_353_: Int
                            if (((i_350_ - (this.anInt8471 shl 12)).also { i_353_ = it }) >= 0) {
                                i_353_ = ((anInt8481 - i_353_) / anInt8481)
                                i_352_ += i_353_
                                i_350_ += anInt8481 * i_353_
                                i_349_ += i_353_
                            }
                            if ((((i_350_ - anInt8481) / anInt8481).also { i_353_ = it }) > i_352_) i_352_ = i_353_
                            val i_354_ = `is`[i_348_] - i
                            var i_355_ = -is_311_!![i_348_]
                            val i_356_ = i_354_ - (i_349_ - anInt8451)
                            if (i_356_ > 0) {
                                i_349_ += i_356_
                                i_352_ += i_356_
                                i_350_ += anInt8481 * i_356_
                                i_351_ += anInt8450 * i_356_
                            } else i_355_ -= i_356_
                            if (i_352_ < i_355_) i_352_ = i_355_
                            while ( /**/i_352_ < 0) {
                                val i_357_ = (aByteArray9934[(((i_351_ shr 12) * this.anInt8471) + (i_350_ shr 12))]).toInt()
                                if (i_357_ != 0) is_313_!![i_349_++] = anIntArray9935[i_357_ and 0xff]
                                else i_349_++
                                i_350_ += anInt8481
                                i_352_++
                            }
                        }
                    }
                    i_347_++
                    anInt8467 += anInt8452
                    anInt8451 += anInt8453
                }
            } else if (anInt8450 < 0) {
                var i_358_ = anInt8468
                while (i_358_ < 0) {
                    val i_359_ = i_358_ + i_312_
                    if (i_359_ >= 0) {
                        if (i_359_ >= `is`!!.size) break
                        var i_360_ = anInt8451
                        var i_361_ = (anInt8458 + anInt8479)
                        var i_362_ = (anInt8467 + anInt8475)
                        var i_363_ = anInt8478
                        var i_364_: Int
                        if (((i_361_ - (this.anInt8471 shl 12)).also { i_364_ = it }) >= 0) {
                            i_364_ = ((anInt8481 - i_364_) / anInt8481)
                            i_363_ += i_364_
                            i_361_ += anInt8481 * i_364_
                            i_362_ += anInt8450 * i_364_
                            i_360_ += i_364_
                        }
                        if ((((i_361_ - anInt8481) / anInt8481).also { i_364_ = it }) > i_363_) i_363_ = i_364_
                        if (((i_362_ - (this.anInt8470 shl 12)).also { i_364_ = it }) >= 0) {
                            i_364_ = ((anInt8450 - i_364_) / anInt8450)
                            i_363_ += i_364_
                            i_361_ += anInt8481 * i_364_
                            i_362_ += anInt8450 * i_364_
                            i_360_ += i_364_
                        }
                        if ((((i_362_ - anInt8450) / anInt8450).also { i_364_ = it }) > i_363_) i_363_ = i_364_
                        val i_365_ = `is`[i_359_] - i
                        var i_366_ = -is_311_!![i_359_]
                        val i_367_ = i_365_ - (i_360_ - anInt8451)
                        if (i_367_ > 0) {
                            i_360_ += i_367_
                            i_363_ += i_367_
                            i_361_ += anInt8481 * i_367_
                            i_362_ += anInt8450 * i_367_
                        } else i_366_ -= i_367_
                        if (i_363_ < i_366_) i_363_ = i_366_
                        while ( /**/i_363_ < 0) {
                            val i_368_ = (aByteArray9934[(((i_362_ shr 12) * this.anInt8471) + (i_361_ shr 12))]).toInt()
                            if (i_368_ != 0) is_313_!![i_360_++] = anIntArray9935[i_368_ and 0xff]
                            else i_360_++
                            i_361_ += anInt8481
                            i_362_ += anInt8450
                            i_363_++
                        }
                    }
                    i_358_++
                    anInt8458 += anInt8457
                    anInt8467 += anInt8452
                    anInt8451 += anInt8453
                }
            } else {
                var i_369_ = anInt8468
                while (i_369_ < 0) {
                    val i_370_ = i_369_ + i_312_
                    if (i_370_ >= 0) {
                        if (i_370_ >= `is`!!.size) break
                        var i_371_ = anInt8451
                        var i_372_ = (anInt8458 + anInt8479)
                        var i_373_ = (anInt8467 + anInt8475)
                        var i_374_ = anInt8478
                        var i_375_: Int
                        if (((i_372_ - (this.anInt8471 shl 12)).also { i_375_ = it }) >= 0) {
                            i_375_ = ((anInt8481 - i_375_) / anInt8481)
                            i_374_ += i_375_
                            i_372_ += anInt8481 * i_375_
                            i_373_ += anInt8450 * i_375_
                            i_371_ += i_375_
                        }
                        if ((((i_372_ - anInt8481) / anInt8481).also { i_375_ = it }) > i_374_) i_374_ = i_375_
                        if (i_373_ < 0) {
                            i_375_ = ((anInt8450 - 1 - i_373_) / anInt8450)
                            i_374_ += i_375_
                            i_372_ += anInt8481 * i_375_
                            i_373_ += anInt8450 * i_375_
                            i_371_ += i_375_
                        }
                        if ((((1 + i_373_ - (this.anInt8470 shl 12) - anInt8450) / anInt8450).also { i_375_ = it }) > i_374_) i_374_ = i_375_
                        val i_376_ = `is`[i_370_] - i
                        var i_377_ = -is_311_!![i_370_]
                        val i_378_ = i_376_ - (i_371_ - anInt8451)
                        if (i_378_ > 0) {
                            i_371_ += i_378_
                            i_374_ += i_378_
                            i_372_ += anInt8481 * i_378_
                            i_373_ += anInt8450 * i_378_
                        } else i_377_ -= i_378_
                        if (i_374_ < i_377_) i_374_ = i_377_
                        while ( /**/i_374_ < 0) {
                            val i_379_ = (aByteArray9934[(((i_373_ shr 12) * this.anInt8471) + (i_372_ shr 12))]).toInt()
                            if (i_379_ != 0) is_313_!![i_371_++] = anIntArray9935[i_379_ and 0xff]
                            else i_371_++
                            i_372_ += anInt8481
                            i_373_ += anInt8450
                            i_374_++
                        }
                    }
                    i_369_++
                    anInt8458 += anInt8457
                    anInt8467 += anInt8452
                    anInt8451 += anInt8453
                }
            }
        } else if (anInt8450 == 0) {
            var i_380_ = anInt8468
            while (i_380_ < 0) {
                val i_381_ = i_380_ + i_312_
                if (i_381_ >= 0) {
                    if (i_381_ >= `is`!!.size) break
                    var i_382_ = anInt8451
                    var i_383_ = anInt8458 + anInt8479
                    var i_384_ = anInt8467
                    var i_385_ = anInt8478
                    if (i_384_ >= 0 && (i_384_ - (this.anInt8470 shl 12) < 0)) {
                        if (i_383_ < 0) {
                            val i_386_ = ((anInt8481 - 1 - i_383_) / anInt8481)
                            i_385_ += i_386_
                            i_383_ += anInt8481 * i_386_
                            i_382_ += i_386_
                        }
                        val i_387_: Int
                        if ((((1 + i_383_ - (this.anInt8471 shl 12) - anInt8481) / anInt8481).also { i_387_ = it }) > i_385_) i_385_ = i_387_
                        val i_388_ = `is`[i_381_] - i
                        var i_389_ = -is_311_!![i_381_]
                        val i_390_ = i_388_ - (i_382_ - anInt8451)
                        if (i_390_ > 0) {
                            i_382_ += i_390_
                            i_385_ += i_390_
                            i_383_ += anInt8481 * i_390_
                            i_384_ += anInt8450 * i_390_
                        } else i_389_ -= i_390_
                        if (i_385_ < i_389_) i_385_ = i_389_
                        while ( /**/i_385_ < 0) {
                            val i_391_ = (aByteArray9934[(((i_384_ shr 12) * this.anInt8471) + (i_383_ shr 12))]).toInt()
                            if (i_391_ != 0) is_313_!![i_382_++] = anIntArray9935[i_391_ and 0xff]
                            else i_382_++
                            i_383_ += anInt8481
                            i_385_++
                        }
                    }
                }
                i_380_++
                anInt8458 += anInt8457
                anInt8467 += anInt8452
                anInt8451 += anInt8453
            }
        } else if (anInt8450 < 0) {
            var i_392_ = anInt8468
            while (i_392_ < 0) {
                val i_393_ = i_392_ + i_312_
                if (i_393_ >= 0) {
                    if (i_393_ >= `is`!!.size) break
                    var i_394_ = anInt8451
                    var i_395_ = anInt8458 + anInt8479
                    var i_396_ = anInt8467 + anInt8475
                    var i_397_ = anInt8478
                    if (i_395_ < 0) {
                        val i_398_ = ((anInt8481 - 1 - i_395_) / anInt8481)
                        i_397_ += i_398_
                        i_395_ += anInt8481 * i_398_
                        i_396_ += anInt8450 * i_398_
                        i_394_ += i_398_
                    }
                    var i_399_: Int
                    if ((((1 + i_395_ - (this.anInt8471 shl 12) - anInt8481) / anInt8481).also { i_399_ = it }) > i_397_) i_397_ = i_399_
                    if (((i_396_ - (this.anInt8470 shl 12)).also { i_399_ = it }) >= 0) {
                        i_399_ = ((anInt8450 - i_399_) / anInt8450)
                        i_397_ += i_399_
                        i_395_ += anInt8481 * i_399_
                        i_396_ += anInt8450 * i_399_
                        i_394_ += i_399_
                    }
                    if ((((i_396_ - anInt8450) / anInt8450).also { i_399_ = it }) > i_397_) i_397_ = i_399_
                    val i_400_ = `is`[i_393_] - i
                    var i_401_ = -is_311_!![i_393_]
                    val i_402_ = i_400_ - (i_394_ - anInt8451)
                    if (i_402_ > 0) {
                        i_394_ += i_402_
                        i_397_ += i_402_
                        i_395_ += anInt8481 * i_402_
                        i_396_ += anInt8450 * i_402_
                    } else i_401_ -= i_402_
                    if (i_397_ < i_401_) i_397_ = i_401_
                    while ( /**/i_397_ < 0) {
                        val i_403_ = (aByteArray9934[(((i_396_ shr 12) * this.anInt8471) + (i_395_ shr 12))]).toInt()
                        if (i_403_ != 0) is_313_!![i_394_++] = anIntArray9935[i_403_ and 0xff]
                        else i_394_++
                        i_395_ += anInt8481
                        i_396_ += anInt8450
                        i_397_++
                    }
                }
                i_392_++
                anInt8458 += anInt8457
                anInt8467 += anInt8452
                anInt8451 += anInt8453
            }
        } else {
            var i_404_ = anInt8468
            while (i_404_ < 0) {
                val i_405_ = i_404_ + i_312_
                if (i_405_ >= 0) {
                    if (i_405_ >= `is`!!.size) break
                    var i_406_ = anInt8451
                    var i_407_ = anInt8458 + anInt8479
                    var i_408_ = anInt8467 + anInt8475
                    var i_409_ = anInt8478
                    if (i_407_ < 0) {
                        val i_410_ = ((anInt8481 - 1 - i_407_) / anInt8481)
                        i_409_ += i_410_
                        i_407_ += anInt8481 * i_410_
                        i_408_ += anInt8450 * i_410_
                        i_406_ += i_410_
                    }
                    var i_411_: Int
                    if ((((1 + i_407_ - (this.anInt8471 shl 12) - anInt8481) / anInt8481).also { i_411_ = it }) > i_409_) i_409_ = i_411_
                    if (i_408_ < 0) {
                        i_411_ = ((anInt8450 - 1 - i_408_) / anInt8450)
                        i_409_ += i_411_
                        i_407_ += anInt8481 * i_411_
                        i_408_ += anInt8450 * i_411_
                        i_406_ += i_411_
                    }
                    if ((((1 + i_408_ - (this.anInt8470 shl 12) - anInt8450) / anInt8450).also { i_411_ = it }) > i_409_) i_409_ = i_411_
                    val i_412_ = `is`[i_405_] - i
                    var i_413_ = -is_311_!![i_405_]
                    val i_414_ = i_412_ - (i_406_ - anInt8451)
                    if (i_414_ > 0) {
                        i_406_ += i_414_
                        i_409_ += i_414_
                        i_407_ += anInt8481 * i_414_
                        i_408_ += anInt8450 * i_414_
                    } else i_413_ -= i_414_
                    if (i_409_ < i_413_) i_409_ = i_413_
                    while ( /**/i_409_ < 0) {
                        val i_415_ = (aByteArray9934[(((i_408_ shr 12) * this.anInt8471) + (i_407_ shr 12))]).toInt()
                        if (i_415_ != 0) is_313_!![i_406_++] = anIntArray9935[i_415_ and 0xff]
                        else i_406_++
                        i_407_ += anInt8481
                        i_408_ += anInt8450
                        i_409_++
                    }
                }
                i_404_++
                anInt8458 += anInt8457
                anInt8467 += anInt8452
                anInt8451 += anInt8453
            }
        }
    }

    override fun method994(i: Int, i_418_: Int) {
        val `is` = aHa_Sub1_8460.anIntArray7483
        if (anInt8481 == 0) {
            if (anInt8450 == 0) {
                var i_419_ = anInt8468
                while (i_419_ < 0) {
                    var i_420_ = anInt8451
                    val i_421_ = anInt8458
                    val i_422_ = anInt8467
                    var i_423_ = anInt8478
                    if (i_421_ >= 0 && i_422_ >= 0 && (i_421_ - (this.anInt8471 shl 12) < 0) && (i_422_ - (this.anInt8470 shl 12) < 0)) {
                        while ( /**/i_423_ < 0) {
                            val i_424_ = (((i_422_ shr 12) * this.anInt8471) + (i_421_ shr 12))
                            var i_425_ = i_420_++
                            val is_426_ = `is`
                            val i_427_ = i
                            val i_428_ = i_418_
                            if (i_428_ == 0) {
                                if (i_427_ == 1) is_426_!![i_425_] = (anIntArray9935[aByteArray9934[i_424_].toInt() and 0xff])
                                else if (i_427_ == 0) {
                                    val i_429_ = (anIntArray9935[aByteArray9934[i_424_].toInt() and 0xff])
                                    val i_430_ = (((i_429_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_431_ = (((i_429_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_432_ = (((i_429_ and 0xff) * anInt8465) and 0xff00)
                                    is_426_!![i_425_] = (i_430_ or i_431_ or i_432_) ushr 8
                                } else if (i_427_ == 3) {
                                    val i_433_ = (anIntArray9935[aByteArray9934[i_424_].toInt() and 0xff])
                                    val i_434_ = anInt8480
                                    val i_435_ = i_433_ + i_434_
                                    val i_436_ = ((i_433_ and 0xff00ff) + (i_434_ and 0xff00ff))
                                    val i_437_ = ((i_436_ and 0x1000100) + (i_435_ - i_436_ and 0x10000))
                                    is_426_!![i_425_] = i_435_ - i_437_ or i_437_ - (i_437_ ushr 8)
                                } else if (i_427_ == 2) {
                                    val i_438_ = (anIntArray9935[aByteArray9934[i_424_].toInt() and 0xff])
                                    val i_439_ = (((i_438_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_440_ = (((i_438_ and 0xff00) * anInt8477) and 0xff0000)
                                    is_426_!![i_425_] = (((i_439_ or i_440_) ushr 8) + anInt8474)
                                } else throw IllegalArgumentException()
                            } else if (i_428_ == 1) {
                                if (i_427_ == 1) {
                                    val i_441_ = aByteArray9934[i_424_].toInt()
                                    if (i_441_ != 0) is_426_!![i_425_] = anIntArray9935[i_441_ and 0xff]
                                } else if (i_427_ == 0) {
                                    val i_442_ = aByteArray9934[i_424_].toInt()
                                    if (i_442_ != 0) {
                                        var i_443_ = anIntArray9935[i_442_ and 0xff]
                                        if ((anInt8480 and 0xffffff) == 16777215) {
                                            val i_444_ = (anInt8480 ushr 24)
                                            val i_445_ = 256 - i_444_
                                            val i_446_ = is_426_!![i_425_]
                                            is_426_[i_425_] = (((((i_443_ and 0xff00ff) * i_444_) + ((i_446_ and 0xff00ff) * i_445_)) and 0xff00ff.inv()) + ((((i_443_ and 0xff00) * i_444_) + ((i_446_ and 0xff00) * i_445_)) and 0xff0000)) shr 8
                                        } else if (anInt8477 == 255) {
                                            val i_451_ = (((i_443_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                            val i_452_ = (((i_443_ and 0xff00) * anInt8463) and 0xff0000)
                                            val i_453_ = (((i_443_ and 0xff) * anInt8465) and 0xff00)
                                            is_426_!![i_425_] = (i_451_ or i_452_ or i_453_) ushr 8
                                        } else {
                                            val i_447_ = (((i_443_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                            val i_448_ = (((i_443_ and 0xff00) * anInt8463) and 0xff0000)
                                            val i_449_ = (((i_443_ and 0xff) * anInt8465) and 0xff00)
                                            i_443_ = (i_447_ or i_448_ or i_449_) ushr 8
                                            val i_450_ = is_426_!![i_425_]
                                            is_426_[i_425_] = (((((i_443_ and 0xff00ff) * (anInt8477)) + ((i_450_ and 0xff00ff) * (anInt8472))) and 0xff00ff.inv()) + ((((i_443_ and 0xff00) * (anInt8477)) + ((i_450_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                        }
                                    }
                                } else if (i_427_ == 3) {
                                    val i_454_ = aByteArray9934[i_424_]
                                    var i_455_ = (if (i_454_ > 0) anIntArray9935[i_454_.toInt()] else 0)
                                    val i_456_ = anInt8480
                                    val i_457_ = i_455_ + i_456_
                                    val i_458_ = ((i_455_ and 0xff00ff) + (i_456_ and 0xff00ff))
                                    var i_459_ = ((i_458_ and 0x1000100) + (i_457_ - i_458_ and 0x10000))
                                    i_459_ = i_457_ - i_459_ or i_459_ - (i_459_ ushr 8)
                                    if (i_455_ == 0 && anInt8477 != 255) {
                                        i_455_ = i_459_
                                        i_459_ = is_426_!![i_425_]
                                        i_459_ = (((((i_455_ and 0xff00ff) * anInt8477) + ((i_459_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_455_ and 0xff00) * anInt8477) + ((i_459_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                    }
                                    is_426_!![i_425_] = i_459_
                                } else if (i_427_ == 2) {
                                    val i_460_ = aByteArray9934[i_424_].toInt()
                                    if (i_460_ != 0) {
                                        val i_461_ = anIntArray9935[i_460_ and 0xff]
                                        val i_462_ = (((i_461_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                        val i_463_ = (((i_461_ and 0xff00) * anInt8477) and 0xff0000)
                                        is_426_!![i_425_++] = (((i_462_ or i_463_) ushr 8) + anInt8474)
                                    }
                                } else throw IllegalArgumentException()
                            } else if (i_428_ == 2) {
                                if (i_427_ == 1) {
                                    val i_464_ = aByteArray9934[i_424_].toInt()
                                    if (i_464_ != 0) {
                                        val i_465_ = anIntArray9935[i_464_ and 0xff]
                                        var i_466_ = is_426_!![i_425_]
                                        val i_467_ = i_465_ + i_466_
                                        val i_468_ = ((i_465_ and 0xff00ff) + (i_466_ and 0xff00ff))
                                        i_466_ = ((i_468_ and 0x1000100) + (i_467_ - i_468_ and 0x10000))
                                        is_426_[i_425_] = (i_467_ - i_466_ or i_466_ - (i_466_ ushr 8))
                                    }
                                } else if (i_427_ == 0) {
                                    val i_469_ = aByteArray9934[i_424_].toInt()
                                    if (i_469_ != 0) {
                                        var i_470_ = anIntArray9935[i_469_ and 0xff]
                                        val i_471_ = (((i_470_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_472_ = (((i_470_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_473_ = (((i_470_ and 0xff) * anInt8465) and 0xff00)
                                        i_470_ = (i_471_ or i_472_ or i_473_) ushr 8
                                        var i_474_ = is_426_!![i_425_]
                                        val i_475_ = i_470_ + i_474_
                                        val i_476_ = ((i_470_ and 0xff00ff) + (i_474_ and 0xff00ff))
                                        i_474_ = ((i_476_ and 0x1000100) + (i_475_ - i_476_ and 0x10000))
                                        is_426_[i_425_] = (i_475_ - i_474_ or i_474_ - (i_474_ ushr 8))
                                    }
                                } else if (i_427_ == 3) {
                                    val i_477_ = aByteArray9934[i_424_]
                                    var i_478_ = (if (i_477_ > 0) anIntArray9935[i_477_.toInt()] else 0)
                                    val i_479_ = anInt8480
                                    val i_480_ = i_478_ + i_479_
                                    val i_481_ = ((i_478_ and 0xff00ff) + (i_479_ and 0xff00ff))
                                    var i_482_ = ((i_481_ and 0x1000100) + (i_480_ - i_481_ and 0x10000))
                                    i_482_ = i_480_ - i_482_ or i_482_ - (i_482_ ushr 8)
                                    if (i_478_ == 0 && anInt8477 != 255) {
                                        i_478_ = i_482_
                                        i_482_ = is_426_!![i_425_]
                                        i_482_ = (((((i_478_ and 0xff00ff) * anInt8477) + ((i_482_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_478_ and 0xff00) * anInt8477) + ((i_482_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                    }
                                    is_426_!![i_425_] = i_482_
                                } else if (i_427_ == 2) {
                                    val i_483_ = aByteArray9934[i_424_].toInt()
                                    if (i_483_ != 0) {
                                        var i_484_ = anIntArray9935[i_483_ and 0xff]
                                        val i_485_ = (((i_484_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                        val i_486_ = (((i_484_ and 0xff00) * anInt8477) and 0xff0000)
                                        i_484_ = (((i_485_ or i_486_) ushr 8) + anInt8474)
                                        var i_487_ = is_426_!![i_425_]
                                        val i_488_ = i_484_ + i_487_
                                        val i_489_ = ((i_484_ and 0xff00ff) + (i_487_ and 0xff00ff))
                                        i_487_ = ((i_489_ and 0x1000100) + (i_488_ - i_489_ and 0x10000))
                                        is_426_[i_425_] = (i_488_ - i_487_ or i_487_ - (i_487_ ushr 8))
                                    }
                                }
                            } else throw IllegalArgumentException()
                            i_423_++
                        }
                    }
                    i_419_++
                    anInt8451 += anInt8453
                }
            } else if (anInt8450 < 0) {
                var i_490_ = anInt8468
                while (i_490_ < 0) {
                    var i_491_ = anInt8451
                    val i_492_ = anInt8458
                    var i_493_ = anInt8467 + anInt8475
                    var i_494_ = anInt8478
                    if (i_492_ >= 0 && (i_492_ - (this.anInt8471 shl 12) < 0)) {
                        var i_495_: Int
                        if (((i_493_ - (this.anInt8470 shl 12)).also { i_495_ = it }) >= 0) {
                            i_495_ = ((anInt8450 - i_495_) / anInt8450)
                            i_494_ += i_495_
                            i_493_ += anInt8450 * i_495_
                            i_491_ += i_495_
                        }
                        if ((((i_493_ - anInt8450) / anInt8450).also { i_495_ = it }) > i_494_) i_494_ = i_495_
                        while ( /**/i_494_ < 0) {
                            val i_496_ = (((i_493_ shr 12) * this.anInt8471) + (i_492_ shr 12))
                            var i_497_ = i_491_++
                            val is_498_ = `is`
                            val i_499_ = i
                            val i_500_ = i_418_
                            if (i_500_ == 0) {
                                if (i_499_ == 1) is_498_!![i_497_] = (anIntArray9935[aByteArray9934[i_496_].toInt() and 0xff])
                                else if (i_499_ == 0) {
                                    val i_501_ = (anIntArray9935[aByteArray9934[i_496_].toInt() and 0xff])
                                    val i_502_ = (((i_501_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_503_ = (((i_501_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_504_ = (((i_501_ and 0xff) * anInt8465) and 0xff00)
                                    is_498_!![i_497_] = (i_502_ or i_503_ or i_504_) ushr 8
                                } else if (i_499_ == 3) {
                                    val i_505_ = (anIntArray9935[aByteArray9934[i_496_].toInt() and 0xff])
                                    val i_506_ = anInt8480
                                    val i_507_ = i_505_ + i_506_
                                    val i_508_ = ((i_505_ and 0xff00ff) + (i_506_ and 0xff00ff))
                                    val i_509_ = ((i_508_ and 0x1000100) + (i_507_ - i_508_ and 0x10000))
                                    is_498_!![i_497_] = i_507_ - i_509_ or i_509_ - (i_509_ ushr 8)
                                } else if (i_499_ == 2) {
                                    val i_510_ = (anIntArray9935[aByteArray9934[i_496_].toInt() and 0xff])
                                    val i_511_ = (((i_510_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_512_ = (((i_510_ and 0xff00) * anInt8477) and 0xff0000)
                                    is_498_!![i_497_] = (((i_511_ or i_512_) ushr 8) + anInt8474)
                                } else throw IllegalArgumentException()
                            } else if (i_500_ == 1) {
                                if (i_499_ == 1) {
                                    val i_513_ = aByteArray9934[i_496_].toInt()
                                    if (i_513_ != 0) is_498_!![i_497_] = anIntArray9935[i_513_ and 0xff]
                                } else if (i_499_ == 0) {
                                    val i_514_ = aByteArray9934[i_496_].toInt()
                                    if (i_514_ != 0) {
                                        var i_515_ = anIntArray9935[i_514_ and 0xff]
                                        if ((anInt8480 and 0xffffff) == 16777215) {
                                            val i_516_ = (anInt8480 ushr 24)
                                            val i_517_ = 256 - i_516_
                                            val i_518_ = is_498_!![i_497_]
                                            is_498_[i_497_] = (((((i_515_ and 0xff00ff) * i_516_) + ((i_518_ and 0xff00ff) * i_517_)) and 0xff00ff.inv()) + ((((i_515_ and 0xff00) * i_516_) + ((i_518_ and 0xff00) * i_517_)) and 0xff0000)) shr 8
                                        } else if (anInt8477 == 255) {
                                            val i_523_ = (((i_515_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                            val i_524_ = (((i_515_ and 0xff00) * anInt8463) and 0xff0000)
                                            val i_525_ = (((i_515_ and 0xff) * anInt8465) and 0xff00)
                                            is_498_!![i_497_] = (i_523_ or i_524_ or i_525_) ushr 8
                                        } else {
                                            val i_519_ = (((i_515_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                            val i_520_ = (((i_515_ and 0xff00) * anInt8463) and 0xff0000)
                                            val i_521_ = (((i_515_ and 0xff) * anInt8465) and 0xff00)
                                            i_515_ = (i_519_ or i_520_ or i_521_) ushr 8
                                            val i_522_ = is_498_!![i_497_]
                                            is_498_[i_497_] = (((((i_515_ and 0xff00ff) * (anInt8477)) + ((i_522_ and 0xff00ff) * (anInt8472))) and 0xff00ff.inv()) + ((((i_515_ and 0xff00) * (anInt8477)) + ((i_522_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                        }
                                    }
                                } else if (i_499_ == 3) {
                                    val i_526_ = aByteArray9934[i_496_]
                                    var i_527_ = (if (i_526_ > 0) anIntArray9935[i_526_.toInt()] else 0)
                                    val i_528_ = anInt8480
                                    val i_529_ = i_527_ + i_528_
                                    val i_530_ = ((i_527_ and 0xff00ff) + (i_528_ and 0xff00ff))
                                    var i_531_ = ((i_530_ and 0x1000100) + (i_529_ - i_530_ and 0x10000))
                                    i_531_ = i_529_ - i_531_ or i_531_ - (i_531_ ushr 8)
                                    if (i_527_ == 0 && anInt8477 != 255) {
                                        i_527_ = i_531_
                                        i_531_ = is_498_!![i_497_]
                                        i_531_ = (((((i_527_ and 0xff00ff) * anInt8477) + ((i_531_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_527_ and 0xff00) * anInt8477) + ((i_531_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                    }
                                    is_498_!![i_497_] = i_531_
                                } else if (i_499_ == 2) {
                                    val i_532_ = aByteArray9934[i_496_].toInt()
                                    if (i_532_ != 0) {
                                        val i_533_ = anIntArray9935[i_532_ and 0xff]
                                        val i_534_ = (((i_533_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                        val i_535_ = (((i_533_ and 0xff00) * anInt8477) and 0xff0000)
                                        is_498_!![i_497_++] = (((i_534_ or i_535_) ushr 8) + anInt8474)
                                    }
                                } else throw IllegalArgumentException()
                            } else if (i_500_ == 2) {
                                if (i_499_ == 1) {
                                    val i_536_ = aByteArray9934[i_496_].toInt()
                                    if (i_536_ != 0) {
                                        val i_537_ = anIntArray9935[i_536_ and 0xff]
                                        var i_538_ = is_498_!![i_497_]
                                        val i_539_ = i_537_ + i_538_
                                        val i_540_ = ((i_537_ and 0xff00ff) + (i_538_ and 0xff00ff))
                                        i_538_ = ((i_540_ and 0x1000100) + (i_539_ - i_540_ and 0x10000))
                                        is_498_[i_497_] = (i_539_ - i_538_ or i_538_ - (i_538_ ushr 8))
                                    }
                                } else if (i_499_ == 0) {
                                    val i_541_ = aByteArray9934[i_496_].toInt()
                                    if (i_541_ != 0) {
                                        var i_542_ = anIntArray9935[i_541_ and 0xff]
                                        val i_543_ = (((i_542_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_544_ = (((i_542_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_545_ = (((i_542_ and 0xff) * anInt8465) and 0xff00)
                                        i_542_ = (i_543_ or i_544_ or i_545_) ushr 8
                                        var i_546_ = is_498_!![i_497_]
                                        val i_547_ = i_542_ + i_546_
                                        val i_548_ = ((i_542_ and 0xff00ff) + (i_546_ and 0xff00ff))
                                        i_546_ = ((i_548_ and 0x1000100) + (i_547_ - i_548_ and 0x10000))
                                        is_498_[i_497_] = (i_547_ - i_546_ or i_546_ - (i_546_ ushr 8))
                                    }
                                } else if (i_499_ == 3) {
                                    val i_549_ = aByteArray9934[i_496_]
                                    var i_550_ = (if (i_549_ > 0) anIntArray9935[i_549_.toInt()] else 0)
                                    val i_551_ = anInt8480
                                    val i_552_ = i_550_ + i_551_
                                    val i_553_ = ((i_550_ and 0xff00ff) + (i_551_ and 0xff00ff))
                                    var i_554_ = ((i_553_ and 0x1000100) + (i_552_ - i_553_ and 0x10000))
                                    i_554_ = i_552_ - i_554_ or i_554_ - (i_554_ ushr 8)
                                    if (i_550_ == 0 && anInt8477 != 255) {
                                        i_550_ = i_554_
                                        i_554_ = is_498_!![i_497_]
                                        i_554_ = (((((i_550_ and 0xff00ff) * anInt8477) + ((i_554_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_550_ and 0xff00) * anInt8477) + ((i_554_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                    }
                                    is_498_!![i_497_] = i_554_
                                } else if (i_499_ == 2) {
                                    val i_555_ = aByteArray9934[i_496_].toInt()
                                    if (i_555_ != 0) {
                                        var i_556_ = anIntArray9935[i_555_ and 0xff]
                                        val i_557_ = (((i_556_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                        val i_558_ = (((i_556_ and 0xff00) * anInt8477) and 0xff0000)
                                        i_556_ = (((i_557_ or i_558_) ushr 8) + anInt8474)
                                        var i_559_ = is_498_!![i_497_]
                                        val i_560_ = i_556_ + i_559_
                                        val i_561_ = ((i_556_ and 0xff00ff) + (i_559_ and 0xff00ff))
                                        i_559_ = ((i_561_ and 0x1000100) + (i_560_ - i_561_ and 0x10000))
                                        is_498_[i_497_] = (i_560_ - i_559_ or i_559_ - (i_559_ ushr 8))
                                    }
                                }
                            } else throw IllegalArgumentException()
                            i_493_ += anInt8450
                            i_494_++
                        }
                    }
                    i_490_++
                    anInt8458 += anInt8457
                    anInt8451 += anInt8453
                }
            } else {
                var i_562_ = anInt8468
                while (i_562_ < 0) {
                    var i_563_ = anInt8451
                    val i_564_ = anInt8458
                    var i_565_ = anInt8467 + anInt8475
                    var i_566_ = anInt8478
                    if (i_564_ >= 0 && (i_564_ - (this.anInt8471 shl 12) < 0)) {
                        if (i_565_ < 0) {
                            val i_567_ = ((anInt8450 - 1 - i_565_) / anInt8450)
                            i_566_ += i_567_
                            i_565_ += anInt8450 * i_567_
                            i_563_ += i_567_
                        }
                        val i_568_: Int
                        if ((((1 + i_565_ - (this.anInt8470 shl 12) - anInt8450) / anInt8450).also { i_568_ = it }) > i_566_) i_566_ = i_568_
                        while ( /**/i_566_ < 0) {
                            val i_569_ = (((i_565_ shr 12) * this.anInt8471) + (i_564_ shr 12))
                            var i_570_ = i_563_++
                            val is_571_ = `is`
                            val i_572_ = i
                            val i_573_ = i_418_
                            if (i_573_ == 0) {
                                if (i_572_ == 1) is_571_!![i_570_] = (anIntArray9935[aByteArray9934[i_569_].toInt() and 0xff])
                                else if (i_572_ == 0) {
                                    val i_574_ = (anIntArray9935[aByteArray9934[i_569_].toInt() and 0xff])
                                    val i_575_ = (((i_574_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_576_ = (((i_574_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_577_ = (((i_574_ and 0xff) * anInt8465) and 0xff00)
                                    is_571_!![i_570_] = (i_575_ or i_576_ or i_577_) ushr 8
                                } else if (i_572_ == 3) {
                                    val i_578_ = (anIntArray9935[aByteArray9934[i_569_].toInt() and 0xff])
                                    val i_579_ = anInt8480
                                    val i_580_ = i_578_ + i_579_
                                    val i_581_ = ((i_578_ and 0xff00ff) + (i_579_ and 0xff00ff))
                                    val i_582_ = ((i_581_ and 0x1000100) + (i_580_ - i_581_ and 0x10000))
                                    is_571_!![i_570_] = i_580_ - i_582_ or i_582_ - (i_582_ ushr 8)
                                } else if (i_572_ == 2) {
                                    val i_583_ = (anIntArray9935[aByteArray9934[i_569_].toInt() and 0xff])
                                    val i_584_ = (((i_583_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_585_ = (((i_583_ and 0xff00) * anInt8477) and 0xff0000)
                                    is_571_!![i_570_] = (((i_584_ or i_585_) ushr 8) + anInt8474)
                                } else throw IllegalArgumentException()
                            } else if (i_573_ == 1) {
                                if (i_572_ == 1) {
                                    val i_586_ = aByteArray9934[i_569_].toInt()
                                    if (i_586_ != 0) is_571_!![i_570_] = anIntArray9935[i_586_ and 0xff]
                                } else if (i_572_ == 0) {
                                    val i_587_ = aByteArray9934[i_569_].toInt()
                                    if (i_587_ != 0) {
                                        var i_588_ = anIntArray9935[i_587_ and 0xff]
                                        if ((anInt8480 and 0xffffff) == 16777215) {
                                            val i_589_ = (anInt8480 ushr 24)
                                            val i_590_ = 256 - i_589_
                                            val i_591_ = is_571_!![i_570_]
                                            is_571_[i_570_] = (((((i_588_ and 0xff00ff) * i_589_) + ((i_591_ and 0xff00ff) * i_590_)) and 0xff00ff.inv()) + ((((i_588_ and 0xff00) * i_589_) + ((i_591_ and 0xff00) * i_590_)) and 0xff0000)) shr 8
                                        } else if (anInt8477 == 255) {
                                            val i_596_ = (((i_588_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                            val i_597_ = (((i_588_ and 0xff00) * anInt8463) and 0xff0000)
                                            val i_598_ = (((i_588_ and 0xff) * anInt8465) and 0xff00)
                                            is_571_!![i_570_] = (i_596_ or i_597_ or i_598_) ushr 8
                                        } else {
                                            val i_592_ = (((i_588_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                            val i_593_ = (((i_588_ and 0xff00) * anInt8463) and 0xff0000)
                                            val i_594_ = (((i_588_ and 0xff) * anInt8465) and 0xff00)
                                            i_588_ = (i_592_ or i_593_ or i_594_) ushr 8
                                            val i_595_ = is_571_!![i_570_]
                                            is_571_[i_570_] = (((((i_588_ and 0xff00ff) * (anInt8477)) + ((i_595_ and 0xff00ff) * (anInt8472))) and 0xff00ff.inv()) + ((((i_588_ and 0xff00) * (anInt8477)) + ((i_595_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                        }
                                    }
                                } else if (i_572_ == 3) {
                                    val i_599_ = aByteArray9934[i_569_]
                                    var i_600_ = (if (i_599_ > 0) anIntArray9935[i_599_.toInt()] else 0)
                                    val i_601_ = anInt8480
                                    val i_602_ = i_600_ + i_601_
                                    val i_603_ = ((i_600_ and 0xff00ff) + (i_601_ and 0xff00ff))
                                    var i_604_ = ((i_603_ and 0x1000100) + (i_602_ - i_603_ and 0x10000))
                                    i_604_ = i_602_ - i_604_ or i_604_ - (i_604_ ushr 8)
                                    if (i_600_ == 0 && anInt8477 != 255) {
                                        i_600_ = i_604_
                                        i_604_ = is_571_!![i_570_]
                                        i_604_ = (((((i_600_ and 0xff00ff) * anInt8477) + ((i_604_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_600_ and 0xff00) * anInt8477) + ((i_604_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                    }
                                    is_571_!![i_570_] = i_604_
                                } else if (i_572_ == 2) {
                                    val i_605_ = aByteArray9934[i_569_].toInt()
                                    if (i_605_ != 0) {
                                        val i_606_ = anIntArray9935[i_605_ and 0xff]
                                        val i_607_ = (((i_606_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                        val i_608_ = (((i_606_ and 0xff00) * anInt8477) and 0xff0000)
                                        is_571_!![i_570_++] = (((i_607_ or i_608_) ushr 8) + anInt8474)
                                    }
                                } else throw IllegalArgumentException()
                            } else if (i_573_ == 2) {
                                if (i_572_ == 1) {
                                    val i_609_ = aByteArray9934[i_569_].toInt()
                                    if (i_609_ != 0) {
                                        val i_610_ = anIntArray9935[i_609_ and 0xff]
                                        var i_611_ = is_571_!![i_570_]
                                        val i_612_ = i_610_ + i_611_
                                        val i_613_ = ((i_610_ and 0xff00ff) + (i_611_ and 0xff00ff))
                                        i_611_ = ((i_613_ and 0x1000100) + (i_612_ - i_613_ and 0x10000))
                                        is_571_[i_570_] = (i_612_ - i_611_ or i_611_ - (i_611_ ushr 8))
                                    }
                                } else if (i_572_ == 0) {
                                    val i_614_ = aByteArray9934[i_569_].toInt()
                                    if (i_614_ != 0) {
                                        var i_615_ = anIntArray9935[i_614_ and 0xff]
                                        val i_616_ = (((i_615_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_617_ = (((i_615_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_618_ = (((i_615_ and 0xff) * anInt8465) and 0xff00)
                                        i_615_ = (i_616_ or i_617_ or i_618_) ushr 8
                                        var i_619_ = is_571_!![i_570_]
                                        val i_620_ = i_615_ + i_619_
                                        val i_621_ = ((i_615_ and 0xff00ff) + (i_619_ and 0xff00ff))
                                        i_619_ = ((i_621_ and 0x1000100) + (i_620_ - i_621_ and 0x10000))
                                        is_571_[i_570_] = (i_620_ - i_619_ or i_619_ - (i_619_ ushr 8))
                                    }
                                } else if (i_572_ == 3) {
                                    val i_622_ = aByteArray9934[i_569_]
                                    var i_623_ = (if (i_622_ > 0) anIntArray9935[i_622_.toInt()] else 0)
                                    val i_624_ = anInt8480
                                    val i_625_ = i_623_ + i_624_
                                    val i_626_ = ((i_623_ and 0xff00ff) + (i_624_ and 0xff00ff))
                                    var i_627_ = ((i_626_ and 0x1000100) + (i_625_ - i_626_ and 0x10000))
                                    i_627_ = i_625_ - i_627_ or i_627_ - (i_627_ ushr 8)
                                    if (i_623_ == 0 && anInt8477 != 255) {
                                        i_623_ = i_627_
                                        i_627_ = is_571_!![i_570_]
                                        i_627_ = (((((i_623_ and 0xff00ff) * anInt8477) + ((i_627_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_623_ and 0xff00) * anInt8477) + ((i_627_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                    }
                                    is_571_!![i_570_] = i_627_
                                } else if (i_572_ == 2) {
                                    val i_628_ = aByteArray9934[i_569_].toInt()
                                    if (i_628_ != 0) {
                                        var i_629_ = anIntArray9935[i_628_ and 0xff]
                                        val i_630_ = (((i_629_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                        val i_631_ = (((i_629_ and 0xff00) * anInt8477) and 0xff0000)
                                        i_629_ = (((i_630_ or i_631_) ushr 8) + anInt8474)
                                        var i_632_ = is_571_!![i_570_]
                                        val i_633_ = i_629_ + i_632_
                                        val i_634_ = ((i_629_ and 0xff00ff) + (i_632_ and 0xff00ff))
                                        i_632_ = ((i_634_ and 0x1000100) + (i_633_ - i_634_ and 0x10000))
                                        is_571_[i_570_] = (i_633_ - i_632_ or i_632_ - (i_632_ ushr 8))
                                    }
                                }
                            } else throw IllegalArgumentException()
                            i_565_ += anInt8450
                            i_566_++
                        }
                    }
                    i_562_++
                    anInt8458 += anInt8457
                    anInt8451 += anInt8453
                }
            }
        } else if (anInt8481 < 0) {
            if (anInt8450 == 0) {
                var i_635_ = anInt8468
                while (i_635_ < 0) {
                    var i_636_ = anInt8451
                    var i_637_ = anInt8458 + anInt8479
                    val i_638_ = anInt8467
                    var i_639_ = anInt8478
                    if (i_638_ >= 0 && (i_638_ - (this.anInt8470 shl 12) < 0)) {
                        var i_640_: Int
                        if (((i_637_ - (this.anInt8471 shl 12)).also { i_640_ = it }) >= 0) {
                            i_640_ = ((anInt8481 - i_640_) / anInt8481)
                            i_639_ += i_640_
                            i_637_ += anInt8481 * i_640_
                            i_636_ += i_640_
                        }
                        if ((((i_637_ - anInt8481) / anInt8481).also { i_640_ = it }) > i_639_) i_639_ = i_640_
                        while ( /**/i_639_ < 0) {
                            val i_641_ = (((i_638_ shr 12) * this.anInt8471) + (i_637_ shr 12))
                            var i_642_ = i_636_++
                            val is_643_ = `is`
                            val i_644_ = i
                            val i_645_ = i_418_
                            if (i_645_ == 0) {
                                if (i_644_ == 1) is_643_!![i_642_] = (anIntArray9935[aByteArray9934[i_641_].toInt() and 0xff])
                                else if (i_644_ == 0) {
                                    val i_646_ = (anIntArray9935[aByteArray9934[i_641_].toInt() and 0xff])
                                    val i_647_ = (((i_646_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_648_ = (((i_646_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_649_ = (((i_646_ and 0xff) * anInt8465) and 0xff00)
                                    is_643_!![i_642_] = (i_647_ or i_648_ or i_649_) ushr 8
                                } else if (i_644_ == 3) {
                                    val i_650_ = (anIntArray9935[aByteArray9934[i_641_].toInt() and 0xff])
                                    val i_651_ = anInt8480
                                    val i_652_ = i_650_ + i_651_
                                    val i_653_ = ((i_650_ and 0xff00ff) + (i_651_ and 0xff00ff))
                                    val i_654_ = ((i_653_ and 0x1000100) + (i_652_ - i_653_ and 0x10000))
                                    is_643_!![i_642_] = i_652_ - i_654_ or i_654_ - (i_654_ ushr 8)
                                } else if (i_644_ == 2) {
                                    val i_655_ = (anIntArray9935[aByteArray9934[i_641_].toInt() and 0xff])
                                    val i_656_ = (((i_655_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_657_ = (((i_655_ and 0xff00) * anInt8477) and 0xff0000)
                                    is_643_!![i_642_] = (((i_656_ or i_657_) ushr 8) + anInt8474)
                                } else throw IllegalArgumentException()
                            } else if (i_645_ == 1) {
                                if (i_644_ == 1) {
                                    val i_658_ = aByteArray9934[i_641_].toInt()
                                    if (i_658_ != 0) is_643_!![i_642_] = anIntArray9935[i_658_ and 0xff]
                                } else if (i_644_ == 0) {
                                    val i_659_ = aByteArray9934[i_641_].toInt()
                                    if (i_659_ != 0) {
                                        var i_660_ = anIntArray9935[i_659_ and 0xff]
                                        if ((anInt8480 and 0xffffff) == 16777215) {
                                            val i_661_ = (anInt8480 ushr 24)
                                            val i_662_ = 256 - i_661_
                                            val i_663_ = is_643_!![i_642_]
                                            is_643_[i_642_] = (((((i_660_ and 0xff00ff) * i_661_) + ((i_663_ and 0xff00ff) * i_662_)) and 0xff00ff.inv()) + ((((i_660_ and 0xff00) * i_661_) + ((i_663_ and 0xff00) * i_662_)) and 0xff0000)) shr 8
                                        } else if (anInt8477 == 255) {
                                            val i_668_ = (((i_660_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                            val i_669_ = (((i_660_ and 0xff00) * anInt8463) and 0xff0000)
                                            val i_670_ = (((i_660_ and 0xff) * anInt8465) and 0xff00)
                                            is_643_!![i_642_] = (i_668_ or i_669_ or i_670_) ushr 8
                                        } else {
                                            val i_664_ = (((i_660_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                            val i_665_ = (((i_660_ and 0xff00) * anInt8463) and 0xff0000)
                                            val i_666_ = (((i_660_ and 0xff) * anInt8465) and 0xff00)
                                            i_660_ = (i_664_ or i_665_ or i_666_) ushr 8
                                            val i_667_ = is_643_!![i_642_]
                                            is_643_[i_642_] = (((((i_660_ and 0xff00ff) * (anInt8477)) + ((i_667_ and 0xff00ff) * (anInt8472))) and 0xff00ff.inv()) + ((((i_660_ and 0xff00) * (anInt8477)) + ((i_667_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                        }
                                    }
                                } else if (i_644_ == 3) {
                                    val i_671_ = aByteArray9934[i_641_]
                                    var i_672_ = (if (i_671_ > 0) anIntArray9935[i_671_.toInt()] else 0)
                                    val i_673_ = anInt8480
                                    val i_674_ = i_672_ + i_673_
                                    val i_675_ = ((i_672_ and 0xff00ff) + (i_673_ and 0xff00ff))
                                    var i_676_ = ((i_675_ and 0x1000100) + (i_674_ - i_675_ and 0x10000))
                                    i_676_ = i_674_ - i_676_ or i_676_ - (i_676_ ushr 8)
                                    if (i_672_ == 0 && anInt8477 != 255) {
                                        i_672_ = i_676_
                                        i_676_ = is_643_!![i_642_]
                                        i_676_ = (((((i_672_ and 0xff00ff) * anInt8477) + ((i_676_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_672_ and 0xff00) * anInt8477) + ((i_676_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                    }
                                    is_643_!![i_642_] = i_676_
                                } else if (i_644_ == 2) {
                                    val i_677_ = aByteArray9934[i_641_].toInt()
                                    if (i_677_ != 0) {
                                        val i_678_ = anIntArray9935[i_677_ and 0xff]
                                        val i_679_ = (((i_678_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                        val i_680_ = (((i_678_ and 0xff00) * anInt8477) and 0xff0000)
                                        is_643_!![i_642_++] = (((i_679_ or i_680_) ushr 8) + anInt8474)
                                    }
                                } else throw IllegalArgumentException()
                            } else if (i_645_ == 2) {
                                if (i_644_ == 1) {
                                    val i_681_ = aByteArray9934[i_641_].toInt()
                                    if (i_681_ != 0) {
                                        val i_682_ = anIntArray9935[i_681_ and 0xff]
                                        var i_683_ = is_643_!![i_642_]
                                        val i_684_ = i_682_ + i_683_
                                        val i_685_ = ((i_682_ and 0xff00ff) + (i_683_ and 0xff00ff))
                                        i_683_ = ((i_685_ and 0x1000100) + (i_684_ - i_685_ and 0x10000))
                                        is_643_[i_642_] = (i_684_ - i_683_ or i_683_ - (i_683_ ushr 8))
                                    }
                                } else if (i_644_ == 0) {
                                    val i_686_ = aByteArray9934[i_641_].toInt()
                                    if (i_686_ != 0) {
                                        var i_687_ = anIntArray9935[i_686_ and 0xff]
                                        val i_688_ = (((i_687_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_689_ = (((i_687_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_690_ = (((i_687_ and 0xff) * anInt8465) and 0xff00)
                                        i_687_ = (i_688_ or i_689_ or i_690_) ushr 8
                                        var i_691_ = is_643_!![i_642_]
                                        val i_692_ = i_687_ + i_691_
                                        val i_693_ = ((i_687_ and 0xff00ff) + (i_691_ and 0xff00ff))
                                        i_691_ = ((i_693_ and 0x1000100) + (i_692_ - i_693_ and 0x10000))
                                        is_643_[i_642_] = (i_692_ - i_691_ or i_691_ - (i_691_ ushr 8))
                                    }
                                } else if (i_644_ == 3) {
                                    val i_694_ = aByteArray9934[i_641_]
                                    var i_695_ = (if (i_694_ > 0) anIntArray9935[i_694_.toInt()] else 0)
                                    val i_696_ = anInt8480
                                    val i_697_ = i_695_ + i_696_
                                    val i_698_ = ((i_695_ and 0xff00ff) + (i_696_ and 0xff00ff))
                                    var i_699_ = ((i_698_ and 0x1000100) + (i_697_ - i_698_ and 0x10000))
                                    i_699_ = i_697_ - i_699_ or i_699_ - (i_699_ ushr 8)
                                    if (i_695_ == 0 && anInt8477 != 255) {
                                        i_695_ = i_699_
                                        i_699_ = is_643_!![i_642_]
                                        i_699_ = (((((i_695_ and 0xff00ff) * anInt8477) + ((i_699_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_695_ and 0xff00) * anInt8477) + ((i_699_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                    }
                                    is_643_!![i_642_] = i_699_
                                } else if (i_644_ == 2) {
                                    val i_700_ = aByteArray9934[i_641_].toInt()
                                    if (i_700_ != 0) {
                                        var i_701_ = anIntArray9935[i_700_ and 0xff]
                                        val i_702_ = (((i_701_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                        val i_703_ = (((i_701_ and 0xff00) * anInt8477) and 0xff0000)
                                        i_701_ = (((i_702_ or i_703_) ushr 8) + anInt8474)
                                        var i_704_ = is_643_!![i_642_]
                                        val i_705_ = i_701_ + i_704_
                                        val i_706_ = ((i_701_ and 0xff00ff) + (i_704_ and 0xff00ff))
                                        i_704_ = ((i_706_ and 0x1000100) + (i_705_ - i_706_ and 0x10000))
                                        is_643_[i_642_] = (i_705_ - i_704_ or i_704_ - (i_704_ ushr 8))
                                    }
                                }
                            } else throw IllegalArgumentException()
                            i_637_ += anInt8481
                            i_639_++
                        }
                    }
                    i_635_++
                    anInt8467 += anInt8452
                    anInt8451 += anInt8453
                }
            } else if (anInt8450 < 0) {
                var i_707_ = anInt8468
                while (i_707_ < 0) {
                    var i_708_ = anInt8451
                    var i_709_ = anInt8458 + anInt8479
                    var i_710_ = anInt8467 + anInt8475
                    var i_711_ = anInt8478
                    var i_712_: Int
                    if (((i_709_ - (this.anInt8471 shl 12)).also { i_712_ = it }) >= 0) {
                        i_712_ = ((anInt8481 - i_712_) / anInt8481)
                        i_711_ += i_712_
                        i_709_ += anInt8481 * i_712_
                        i_710_ += anInt8450 * i_712_
                        i_708_ += i_712_
                    }
                    if ((((i_709_ - anInt8481) / anInt8481).also { i_712_ = it }) > i_711_) i_711_ = i_712_
                    if (((i_710_ - (this.anInt8470 shl 12)).also { i_712_ = it }) >= 0) {
                        i_712_ = ((anInt8450 - i_712_) / anInt8450)
                        i_711_ += i_712_
                        i_709_ += anInt8481 * i_712_
                        i_710_ += anInt8450 * i_712_
                        i_708_ += i_712_
                    }
                    if ((((i_710_ - anInt8450) / anInt8450).also { i_712_ = it }) > i_711_) i_711_ = i_712_
                    while ( /**/i_711_ < 0) {
                        val i_713_ = (((i_710_ shr 12) * this.anInt8471) + (i_709_ shr 12))
                        var i_714_ = i_708_++
                        val is_715_ = `is`
                        val i_716_ = i
                        val i_717_ = i_418_
                        if (i_717_ == 0) {
                            if (i_716_ == 1) is_715_!![i_714_] = (anIntArray9935[aByteArray9934[i_713_].toInt() and 0xff])
                            else if (i_716_ == 0) {
                                val i_718_ = (anIntArray9935[aByteArray9934[i_713_].toInt() and 0xff])
                                val i_719_ = (((i_718_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_720_ = (((i_718_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_721_ = (((i_718_ and 0xff) * anInt8465) and 0xff00)
                                is_715_!![i_714_] = (i_719_ or i_720_ or i_721_) ushr 8
                            } else if (i_716_ == 3) {
                                val i_722_ = (anIntArray9935[aByteArray9934[i_713_].toInt() and 0xff])
                                val i_723_ = anInt8480
                                val i_724_ = i_722_ + i_723_
                                val i_725_ = ((i_722_ and 0xff00ff) + (i_723_ and 0xff00ff))
                                val i_726_ = ((i_725_ and 0x1000100) + (i_724_ - i_725_ and 0x10000))
                                is_715_!![i_714_] = i_724_ - i_726_ or i_726_ - (i_726_ ushr 8)
                            } else if (i_716_ == 2) {
                                val i_727_ = (anIntArray9935[aByteArray9934[i_713_].toInt() and 0xff])
                                val i_728_ = (((i_727_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_729_ = (((i_727_ and 0xff00) * anInt8477) and 0xff0000)
                                is_715_!![i_714_] = (((i_728_ or i_729_) ushr 8) + anInt8474)
                            } else throw IllegalArgumentException()
                        } else if (i_717_ == 1) {
                            if (i_716_ == 1) {
                                val i_730_ = aByteArray9934[i_713_].toInt()
                                if (i_730_ != 0) is_715_!![i_714_] = anIntArray9935[i_730_ and 0xff]
                            } else if (i_716_ == 0) {
                                val i_731_ = aByteArray9934[i_713_].toInt()
                                if (i_731_ != 0) {
                                    var i_732_ = anIntArray9935[i_731_ and 0xff]
                                    if ((anInt8480 and 0xffffff) == 16777215) {
                                        val i_733_ = anInt8480 ushr 24
                                        val i_734_ = 256 - i_733_
                                        val i_735_ = is_715_!![i_714_]
                                        is_715_[i_714_] = ((((i_732_ and 0xff00ff) * i_733_ + ((i_735_ and 0xff00ff) * i_734_)) and 0xff00ff.inv()) + (((i_732_ and 0xff00) * i_733_ + ((i_735_ and 0xff00) * i_734_)) and 0xff0000)) shr 8
                                    } else if (anInt8477 == 255) {
                                        val i_740_ = (((i_732_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_741_ = (((i_732_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_742_ = (((i_732_ and 0xff) * anInt8465) and 0xff00)
                                        is_715_!![i_714_] = (i_740_ or i_741_ or i_742_) ushr 8
                                    } else {
                                        val i_736_ = (((i_732_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_737_ = (((i_732_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_738_ = (((i_732_ and 0xff) * anInt8465) and 0xff00)
                                        i_732_ = (i_736_ or i_737_ or i_738_) ushr 8
                                        val i_739_ = is_715_!![i_714_]
                                        is_715_[i_714_] = (((((i_732_ and 0xff00ff) * anInt8477) + ((i_739_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_732_ and 0xff00) * anInt8477) + ((i_739_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                    }
                                }
                            } else if (i_716_ == 3) {
                                val i_743_ = aByteArray9934[i_713_]
                                var i_744_ = if (i_743_ > 0) anIntArray9935[i_743_.toInt()] else 0
                                val i_745_ = anInt8480
                                val i_746_ = i_744_ + i_745_
                                val i_747_ = ((i_744_ and 0xff00ff) + (i_745_ and 0xff00ff))
                                var i_748_ = ((i_747_ and 0x1000100) + (i_746_ - i_747_ and 0x10000))
                                i_748_ = i_746_ - i_748_ or i_748_ - (i_748_ ushr 8)
                                if (i_744_ == 0 && anInt8477 != 255) {
                                    i_744_ = i_748_
                                    i_748_ = is_715_!![i_714_]
                                    i_748_ = (((((i_744_ and 0xff00ff) * anInt8477) + ((i_748_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_744_ and 0xff00) * anInt8477) + ((i_748_ and 0xff00) * anInt8472)) and 0xff0000)) shr 8
                                }
                                is_715_!![i_714_] = i_748_
                            } else if (i_716_ == 2) {
                                val i_749_ = aByteArray9934[i_713_].toInt()
                                if (i_749_ != 0) {
                                    val i_750_ = anIntArray9935[i_749_ and 0xff]
                                    val i_751_ = (((i_750_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_752_ = (((i_750_ and 0xff00) * anInt8477) and 0xff0000)
                                    is_715_!![i_714_++] = (((i_751_ or i_752_) ushr 8) + anInt8474)
                                }
                            } else throw IllegalArgumentException()
                        } else if (i_717_ == 2) {
                            if (i_716_ == 1) {
                                val i_753_ = aByteArray9934[i_713_].toInt()
                                if (i_753_ != 0) {
                                    val i_754_ = anIntArray9935[i_753_ and 0xff]
                                    var i_755_ = is_715_!![i_714_]
                                    val i_756_ = i_754_ + i_755_
                                    val i_757_ = ((i_754_ and 0xff00ff) + (i_755_ and 0xff00ff))
                                    i_755_ = ((i_757_ and 0x1000100) + (i_756_ - i_757_ and 0x10000))
                                    is_715_[i_714_] = i_756_ - i_755_ or i_755_ - (i_755_ ushr 8)
                                }
                            } else if (i_716_ == 0) {
                                val i_758_ = aByteArray9934[i_713_].toInt()
                                if (i_758_ != 0) {
                                    var i_759_ = anIntArray9935[i_758_ and 0xff]
                                    val i_760_ = (((i_759_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_761_ = (((i_759_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_762_ = (((i_759_ and 0xff) * anInt8465) and 0xff00)
                                    i_759_ = (i_760_ or i_761_ or i_762_) ushr 8
                                    var i_763_ = is_715_!![i_714_]
                                    val i_764_ = i_759_ + i_763_
                                    val i_765_ = ((i_759_ and 0xff00ff) + (i_763_ and 0xff00ff))
                                    i_763_ = ((i_765_ and 0x1000100) + (i_764_ - i_765_ and 0x10000))
                                    is_715_[i_714_] = i_764_ - i_763_ or i_763_ - (i_763_ ushr 8)
                                }
                            } else if (i_716_ == 3) {
                                val i_766_ = aByteArray9934[i_713_]
                                var i_767_ = if (i_766_ > 0) anIntArray9935[i_766_.toInt()] else 0
                                val i_768_ = anInt8480
                                val i_769_ = i_767_ + i_768_
                                val i_770_ = ((i_767_ and 0xff00ff) + (i_768_ and 0xff00ff))
                                var i_771_ = ((i_770_ and 0x1000100) + (i_769_ - i_770_ and 0x10000))
                                i_771_ = i_769_ - i_771_ or i_771_ - (i_771_ ushr 8)
                                if (i_767_ == 0 && anInt8477 != 255) {
                                    i_767_ = i_771_
                                    i_771_ = is_715_!![i_714_]
                                    i_771_ = (((((i_767_ and 0xff00ff) * anInt8477) + ((i_771_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_767_ and 0xff00) * anInt8477) + ((i_771_ and 0xff00) * anInt8472)) and 0xff0000)) shr 8
                                }
                                is_715_!![i_714_] = i_771_
                            } else if (i_716_ == 2) {
                                val i_772_ = aByteArray9934[i_713_].toInt()
                                if (i_772_ != 0) {
                                    var i_773_ = anIntArray9935[i_772_ and 0xff]
                                    val i_774_ = (((i_773_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_775_ = (((i_773_ and 0xff00) * anInt8477) and 0xff0000)
                                    i_773_ = (((i_774_ or i_775_) ushr 8) + anInt8474)
                                    var i_776_ = is_715_!![i_714_]
                                    val i_777_ = i_773_ + i_776_
                                    val i_778_ = ((i_773_ and 0xff00ff) + (i_776_ and 0xff00ff))
                                    i_776_ = ((i_778_ and 0x1000100) + (i_777_ - i_778_ and 0x10000))
                                    is_715_[i_714_] = i_777_ - i_776_ or i_776_ - (i_776_ ushr 8)
                                }
                            }
                        } else throw IllegalArgumentException()
                        i_709_ += anInt8481
                        i_710_ += anInt8450
                        i_711_++
                    }
                    i_707_++
                    anInt8458 += anInt8457
                    anInt8467 += anInt8452
                    anInt8451 += anInt8453
                }
            } else {
                var i_779_ = anInt8468
                while (i_779_ < 0) {
                    var i_780_ = anInt8451
                    var i_781_ = anInt8458 + anInt8479
                    var i_782_ = anInt8467 + anInt8475
                    var i_783_ = anInt8478
                    var i_784_: Int
                    if (((i_781_ - (this.anInt8471 shl 12)).also { i_784_ = it }) >= 0) {
                        i_784_ = ((anInt8481 - i_784_) / anInt8481)
                        i_783_ += i_784_
                        i_781_ += anInt8481 * i_784_
                        i_782_ += anInt8450 * i_784_
                        i_780_ += i_784_
                    }
                    if ((((i_781_ - anInt8481) / anInt8481).also { i_784_ = it }) > i_783_) i_783_ = i_784_
                    if (i_782_ < 0) {
                        i_784_ = ((anInt8450 - 1 - i_782_) / anInt8450)
                        i_783_ += i_784_
                        i_781_ += anInt8481 * i_784_
                        i_782_ += anInt8450 * i_784_
                        i_780_ += i_784_
                    }
                    if ((((1 + i_782_ - (this.anInt8470 shl 12) - anInt8450) / anInt8450).also { i_784_ = it }) > i_783_) i_783_ = i_784_
                    while ( /**/i_783_ < 0) {
                        val i_785_ = (((i_782_ shr 12) * this.anInt8471) + (i_781_ shr 12))
                        var i_786_ = i_780_++
                        val is_787_ = `is`
                        val i_788_ = i
                        val i_789_ = i_418_
                        if (i_789_ == 0) {
                            if (i_788_ == 1) is_787_!![i_786_] = (anIntArray9935[aByteArray9934[i_785_].toInt() and 0xff])
                            else if (i_788_ == 0) {
                                val i_790_ = (anIntArray9935[aByteArray9934[i_785_].toInt() and 0xff])
                                val i_791_ = (((i_790_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_792_ = (((i_790_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_793_ = (((i_790_ and 0xff) * anInt8465) and 0xff00)
                                is_787_!![i_786_] = (i_791_ or i_792_ or i_793_) ushr 8
                            } else if (i_788_ == 3) {
                                val i_794_ = (anIntArray9935[aByteArray9934[i_785_].toInt() and 0xff])
                                val i_795_ = anInt8480
                                val i_796_ = i_794_ + i_795_
                                val i_797_ = ((i_794_ and 0xff00ff) + (i_795_ and 0xff00ff))
                                val i_798_ = ((i_797_ and 0x1000100) + (i_796_ - i_797_ and 0x10000))
                                is_787_!![i_786_] = i_796_ - i_798_ or i_798_ - (i_798_ ushr 8)
                            } else if (i_788_ == 2) {
                                val i_799_ = (anIntArray9935[aByteArray9934[i_785_].toInt() and 0xff])
                                val i_800_ = (((i_799_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_801_ = (((i_799_ and 0xff00) * anInt8477) and 0xff0000)
                                is_787_!![i_786_] = (((i_800_ or i_801_) ushr 8) + anInt8474)
                            } else throw IllegalArgumentException()
                        } else if (i_789_ == 1) {
                            if (i_788_ == 1) {
                                val i_802_ = aByteArray9934[i_785_].toInt()
                                if (i_802_ != 0) is_787_!![i_786_] = anIntArray9935[i_802_ and 0xff]
                            } else if (i_788_ == 0) {
                                val i_803_ = aByteArray9934[i_785_].toInt()
                                if (i_803_ != 0) {
                                    var i_804_ = anIntArray9935[i_803_ and 0xff]
                                    if ((anInt8480 and 0xffffff) == 16777215) {
                                        val i_805_ = anInt8480 ushr 24
                                        val i_806_ = 256 - i_805_
                                        val i_807_ = is_787_!![i_786_]
                                        is_787_[i_786_] = ((((i_804_ and 0xff00ff) * i_805_ + ((i_807_ and 0xff00ff) * i_806_)) and 0xff00ff.inv()) + (((i_804_ and 0xff00) * i_805_ + ((i_807_ and 0xff00) * i_806_)) and 0xff0000)) shr 8
                                    } else if (anInt8477 == 255) {
                                        val i_812_ = (((i_804_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_813_ = (((i_804_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_814_ = (((i_804_ and 0xff) * anInt8465) and 0xff00)
                                        is_787_!![i_786_] = (i_812_ or i_813_ or i_814_) ushr 8
                                    } else {
                                        val i_808_ = (((i_804_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_809_ = (((i_804_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_810_ = (((i_804_ and 0xff) * anInt8465) and 0xff00)
                                        i_804_ = (i_808_ or i_809_ or i_810_) ushr 8
                                        val i_811_ = is_787_!![i_786_]
                                        is_787_[i_786_] = (((((i_804_ and 0xff00ff) * anInt8477) + ((i_811_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_804_ and 0xff00) * anInt8477) + ((i_811_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                    }
                                }
                            } else if (i_788_ == 3) {
                                val i_815_ = aByteArray9934[i_785_]
                                var i_816_ = if (i_815_ > 0) anIntArray9935[i_815_.toInt()] else 0
                                val i_817_ = anInt8480
                                val i_818_ = i_816_ + i_817_
                                val i_819_ = ((i_816_ and 0xff00ff) + (i_817_ and 0xff00ff))
                                var i_820_ = ((i_819_ and 0x1000100) + (i_818_ - i_819_ and 0x10000))
                                i_820_ = i_818_ - i_820_ or i_820_ - (i_820_ ushr 8)
                                if (i_816_ == 0 && anInt8477 != 255) {
                                    i_816_ = i_820_
                                    i_820_ = is_787_!![i_786_]
                                    i_820_ = (((((i_816_ and 0xff00ff) * anInt8477) + ((i_820_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_816_ and 0xff00) * anInt8477) + ((i_820_ and 0xff00) * anInt8472)) and 0xff0000)) shr 8
                                }
                                is_787_!![i_786_] = i_820_
                            } else if (i_788_ == 2) {
                                val i_821_ = aByteArray9934[i_785_].toInt()
                                if (i_821_ != 0) {
                                    val i_822_ = anIntArray9935[i_821_ and 0xff]
                                    val i_823_ = (((i_822_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_824_ = (((i_822_ and 0xff00) * anInt8477) and 0xff0000)
                                    is_787_!![i_786_++] = (((i_823_ or i_824_) ushr 8) + anInt8474)
                                }
                            } else throw IllegalArgumentException()
                        } else if (i_789_ == 2) {
                            if (i_788_ == 1) {
                                val i_825_ = aByteArray9934[i_785_].toInt()
                                if (i_825_ != 0) {
                                    val i_826_ = anIntArray9935[i_825_ and 0xff]
                                    var i_827_ = is_787_!![i_786_]
                                    val i_828_ = i_826_ + i_827_
                                    val i_829_ = ((i_826_ and 0xff00ff) + (i_827_ and 0xff00ff))
                                    i_827_ = ((i_829_ and 0x1000100) + (i_828_ - i_829_ and 0x10000))
                                    is_787_[i_786_] = i_828_ - i_827_ or i_827_ - (i_827_ ushr 8)
                                }
                            } else if (i_788_ == 0) {
                                val i_830_ = aByteArray9934[i_785_].toInt()
                                if (i_830_ != 0) {
                                    var i_831_ = anIntArray9935[i_830_ and 0xff]
                                    val i_832_ = (((i_831_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_833_ = (((i_831_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_834_ = (((i_831_ and 0xff) * anInt8465) and 0xff00)
                                    i_831_ = (i_832_ or i_833_ or i_834_) ushr 8
                                    var i_835_ = is_787_!![i_786_]
                                    val i_836_ = i_831_ + i_835_
                                    val i_837_ = ((i_831_ and 0xff00ff) + (i_835_ and 0xff00ff))
                                    i_835_ = ((i_837_ and 0x1000100) + (i_836_ - i_837_ and 0x10000))
                                    is_787_[i_786_] = i_836_ - i_835_ or i_835_ - (i_835_ ushr 8)
                                }
                            } else if (i_788_ == 3) {
                                val i_838_ = aByteArray9934[i_785_]
                                var i_839_ = if (i_838_ > 0) anIntArray9935[i_838_.toInt()] else 0
                                val i_840_ = anInt8480
                                val i_841_ = i_839_ + i_840_
                                val i_842_ = ((i_839_ and 0xff00ff) + (i_840_ and 0xff00ff))
                                var i_843_ = ((i_842_ and 0x1000100) + (i_841_ - i_842_ and 0x10000))
                                i_843_ = i_841_ - i_843_ or i_843_ - (i_843_ ushr 8)
                                if (i_839_ == 0 && anInt8477 != 255) {
                                    i_839_ = i_843_
                                    i_843_ = is_787_!![i_786_]
                                    i_843_ = (((((i_839_ and 0xff00ff) * anInt8477) + ((i_843_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_839_ and 0xff00) * anInt8477) + ((i_843_ and 0xff00) * anInt8472)) and 0xff0000)) shr 8
                                }
                                is_787_!![i_786_] = i_843_
                            } else if (i_788_ == 2) {
                                val i_844_ = aByteArray9934[i_785_].toInt()
                                if (i_844_ != 0) {
                                    var i_845_ = anIntArray9935[i_844_ and 0xff]
                                    val i_846_ = (((i_845_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_847_ = (((i_845_ and 0xff00) * anInt8477) and 0xff0000)
                                    i_845_ = (((i_846_ or i_847_) ushr 8) + anInt8474)
                                    var i_848_ = is_787_!![i_786_]
                                    val i_849_ = i_845_ + i_848_
                                    val i_850_ = ((i_845_ and 0xff00ff) + (i_848_ and 0xff00ff))
                                    i_848_ = ((i_850_ and 0x1000100) + (i_849_ - i_850_ and 0x10000))
                                    is_787_[i_786_] = i_849_ - i_848_ or i_848_ - (i_848_ ushr 8)
                                }
                            }
                        } else throw IllegalArgumentException()
                        i_781_ += anInt8481
                        i_782_ += anInt8450
                        i_783_++
                    }
                    i_779_++
                    anInt8458 += anInt8457
                    anInt8467 += anInt8452
                    anInt8451 += anInt8453
                }
            }
        } else if (anInt8450 == 0) {
            var i_851_ = anInt8468
            while (i_851_ < 0) {
                var i_852_ = anInt8451
                var i_853_ = anInt8458 + anInt8479
                val i_854_ = anInt8467
                var i_855_ = anInt8478
                if (i_854_ >= 0 && i_854_ - (this.anInt8470 shl 12) < 0) {
                    if (i_853_ < 0) {
                        val i_856_ = ((anInt8481 - 1 - i_853_) / anInt8481)
                        i_855_ += i_856_
                        i_853_ += anInt8481 * i_856_
                        i_852_ += i_856_
                    }
                    val i_857_: Int
                    if ((((1 + i_853_ - (this.anInt8471 shl 12) - anInt8481) / anInt8481).also { i_857_ = it }) > i_855_) i_855_ = i_857_
                    while ( /**/i_855_ < 0) {
                        val i_858_ = (((i_854_ shr 12) * this.anInt8471) + (i_853_ shr 12))
                        var i_859_ = i_852_++
                        val is_860_ = `is`
                        val i_861_ = i
                        val i_862_ = i_418_
                        if (i_862_ == 0) {
                            if (i_861_ == 1) is_860_!![i_859_] = (anIntArray9935[aByteArray9934[i_858_].toInt() and 0xff])
                            else if (i_861_ == 0) {
                                val i_863_ = (anIntArray9935[aByteArray9934[i_858_].toInt() and 0xff])
                                val i_864_ = (((i_863_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_865_ = (((i_863_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_866_ = (((i_863_ and 0xff) * anInt8465) and 0xff00)
                                is_860_!![i_859_] = (i_864_ or i_865_ or i_866_) ushr 8
                            } else if (i_861_ == 3) {
                                val i_867_ = (anIntArray9935[aByteArray9934[i_858_].toInt() and 0xff])
                                val i_868_ = anInt8480
                                val i_869_ = i_867_ + i_868_
                                val i_870_ = ((i_867_ and 0xff00ff) + (i_868_ and 0xff00ff))
                                val i_871_ = ((i_870_ and 0x1000100) + (i_869_ - i_870_ and 0x10000))
                                is_860_!![i_859_] = i_869_ - i_871_ or i_871_ - (i_871_ ushr 8)
                            } else if (i_861_ == 2) {
                                val i_872_ = (anIntArray9935[aByteArray9934[i_858_].toInt() and 0xff])
                                val i_873_ = (((i_872_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_874_ = (((i_872_ and 0xff00) * anInt8477) and 0xff0000)
                                is_860_!![i_859_] = (((i_873_ or i_874_) ushr 8) + anInt8474)
                            } else throw IllegalArgumentException()
                        } else if (i_862_ == 1) {
                            if (i_861_ == 1) {
                                val i_875_ = aByteArray9934[i_858_].toInt()
                                if (i_875_ != 0) is_860_!![i_859_] = anIntArray9935[i_875_ and 0xff]
                            } else if (i_861_ == 0) {
                                val i_876_ = aByteArray9934[i_858_].toInt()
                                if (i_876_ != 0) {
                                    var i_877_ = anIntArray9935[i_876_ and 0xff]
                                    if ((anInt8480 and 0xffffff) == 16777215) {
                                        val i_878_ = anInt8480 ushr 24
                                        val i_879_ = 256 - i_878_
                                        val i_880_ = is_860_!![i_859_]
                                        is_860_[i_859_] = ((((i_877_ and 0xff00ff) * i_878_ + ((i_880_ and 0xff00ff) * i_879_)) and 0xff00ff.inv()) + (((i_877_ and 0xff00) * i_878_ + ((i_880_ and 0xff00) * i_879_)) and 0xff0000)) shr 8
                                    } else if (anInt8477 == 255) {
                                        val i_885_ = (((i_877_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_886_ = (((i_877_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_887_ = (((i_877_ and 0xff) * anInt8465) and 0xff00)
                                        is_860_!![i_859_] = (i_885_ or i_886_ or i_887_) ushr 8
                                    } else {
                                        val i_881_ = (((i_877_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_882_ = (((i_877_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_883_ = (((i_877_ and 0xff) * anInt8465) and 0xff00)
                                        i_877_ = (i_881_ or i_882_ or i_883_) ushr 8
                                        val i_884_ = is_860_!![i_859_]
                                        is_860_[i_859_] = (((((i_877_ and 0xff00ff) * anInt8477) + ((i_884_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_877_ and 0xff00) * anInt8477) + ((i_884_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                    }
                                }
                            } else if (i_861_ == 3) {
                                val i_888_ = aByteArray9934[i_858_]
                                var i_889_ = if (i_888_ > 0) anIntArray9935[i_888_.toInt()] else 0
                                val i_890_ = anInt8480
                                val i_891_ = i_889_ + i_890_
                                val i_892_ = ((i_889_ and 0xff00ff) + (i_890_ and 0xff00ff))
                                var i_893_ = ((i_892_ and 0x1000100) + (i_891_ - i_892_ and 0x10000))
                                i_893_ = i_891_ - i_893_ or i_893_ - (i_893_ ushr 8)
                                if (i_889_ == 0 && anInt8477 != 255) {
                                    i_889_ = i_893_
                                    i_893_ = is_860_!![i_859_]
                                    i_893_ = (((((i_889_ and 0xff00ff) * anInt8477) + ((i_893_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_889_ and 0xff00) * anInt8477) + ((i_893_ and 0xff00) * anInt8472)) and 0xff0000)) shr 8
                                }
                                is_860_!![i_859_] = i_893_
                            } else if (i_861_ == 2) {
                                val i_894_ = aByteArray9934[i_858_].toInt()
                                if (i_894_ != 0) {
                                    val i_895_ = anIntArray9935[i_894_ and 0xff]
                                    val i_896_ = (((i_895_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_897_ = (((i_895_ and 0xff00) * anInt8477) and 0xff0000)
                                    is_860_!![i_859_++] = (((i_896_ or i_897_) ushr 8) + anInt8474)
                                }
                            } else throw IllegalArgumentException()
                        } else if (i_862_ == 2) {
                            if (i_861_ == 1) {
                                val i_898_ = aByteArray9934[i_858_].toInt()
                                if (i_898_ != 0) {
                                    val i_899_ = anIntArray9935[i_898_ and 0xff]
                                    var i_900_ = is_860_!![i_859_]
                                    val i_901_ = i_899_ + i_900_
                                    val i_902_ = ((i_899_ and 0xff00ff) + (i_900_ and 0xff00ff))
                                    i_900_ = ((i_902_ and 0x1000100) + (i_901_ - i_902_ and 0x10000))
                                    is_860_[i_859_] = i_901_ - i_900_ or i_900_ - (i_900_ ushr 8)
                                }
                            } else if (i_861_ == 0) {
                                val i_903_ = aByteArray9934[i_858_].toInt()
                                if (i_903_ != 0) {
                                    var i_904_ = anIntArray9935[i_903_ and 0xff]
                                    val i_905_ = (((i_904_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_906_ = (((i_904_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_907_ = (((i_904_ and 0xff) * anInt8465) and 0xff00)
                                    i_904_ = (i_905_ or i_906_ or i_907_) ushr 8
                                    var i_908_ = is_860_!![i_859_]
                                    val i_909_ = i_904_ + i_908_
                                    val i_910_ = ((i_904_ and 0xff00ff) + (i_908_ and 0xff00ff))
                                    i_908_ = ((i_910_ and 0x1000100) + (i_909_ - i_910_ and 0x10000))
                                    is_860_[i_859_] = i_909_ - i_908_ or i_908_ - (i_908_ ushr 8)
                                }
                            } else if (i_861_ == 3) {
                                val i_911_ = aByteArray9934[i_858_]
                                var i_912_ = if (i_911_ > 0) anIntArray9935[i_911_.toInt()] else 0
                                val i_913_ = anInt8480
                                val i_914_ = i_912_ + i_913_
                                val i_915_ = ((i_912_ and 0xff00ff) + (i_913_ and 0xff00ff))
                                var i_916_ = ((i_915_ and 0x1000100) + (i_914_ - i_915_ and 0x10000))
                                i_916_ = i_914_ - i_916_ or i_916_ - (i_916_ ushr 8)
                                if (i_912_ == 0 && anInt8477 != 255) {
                                    i_912_ = i_916_
                                    i_916_ = is_860_!![i_859_]
                                    i_916_ = (((((i_912_ and 0xff00ff) * anInt8477) + ((i_916_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_912_ and 0xff00) * anInt8477) + ((i_916_ and 0xff00) * anInt8472)) and 0xff0000)) shr 8
                                }
                                is_860_!![i_859_] = i_916_
                            } else if (i_861_ == 2) {
                                val i_917_ = aByteArray9934[i_858_].toInt()
                                if (i_917_ != 0) {
                                    var i_918_ = anIntArray9935[i_917_ and 0xff]
                                    val i_919_ = (((i_918_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_920_ = (((i_918_ and 0xff00) * anInt8477) and 0xff0000)
                                    i_918_ = (((i_919_ or i_920_) ushr 8) + anInt8474)
                                    var i_921_ = is_860_!![i_859_]
                                    val i_922_ = i_918_ + i_921_
                                    val i_923_ = ((i_918_ and 0xff00ff) + (i_921_ and 0xff00ff))
                                    i_921_ = ((i_923_ and 0x1000100) + (i_922_ - i_923_ and 0x10000))
                                    is_860_[i_859_] = i_922_ - i_921_ or i_921_ - (i_921_ ushr 8)
                                }
                            }
                        } else throw IllegalArgumentException()
                        i_853_ += anInt8481
                        i_855_++
                    }
                }
                i_851_++
                anInt8458 += anInt8457
                anInt8467 += anInt8452
                anInt8451 += anInt8453
            }
        } else if (anInt8450 < 0) {
            for (i_924_ in anInt8468..-1) {
                var i_925_ = anInt8451
                var i_926_ = anInt8458 + anInt8479
                var i_927_ = anInt8467 + anInt8475
                var i_928_ = anInt8478
                if (i_926_ < 0) {
                    val i_929_ = ((anInt8481 - 1 - i_926_) / anInt8481)
                    i_928_ += i_929_
                    i_926_ += anInt8481 * i_929_
                    i_927_ += anInt8450 * i_929_
                    i_925_ += i_929_
                }
                var i_930_: Int
                if ((((1 + i_926_ - (this.anInt8471 shl 12) - anInt8481) / anInt8481).also { i_930_ = it }) > i_928_) i_928_ = i_930_
                if (((i_927_ - (this.anInt8470 shl 12)).also { i_930_ = it }) >= 0) {
                    i_930_ = ((anInt8450 - i_930_) / anInt8450)
                    i_928_ += i_930_
                    i_926_ += anInt8481 * i_930_
                    i_927_ += anInt8450 * i_930_
                    i_925_ += i_930_
                }
                if ((((i_927_ - anInt8450) / anInt8450).also { i_930_ = it }) > i_928_) i_928_ = i_930_
                while ( /**/i_928_ < 0) {
                    val i_931_ = ((i_927_ shr 12) * this.anInt8471 + (i_926_ shr 12))
                    var i_932_ = i_925_++
                    val is_933_ = `is`
                    val i_934_ = i
                    val i_935_ = i_418_
                    if (i_935_ == 0) {
                        if (i_934_ == 1) is_933_!![i_932_] = (anIntArray9935[aByteArray9934[i_931_].toInt() and 0xff])
                        else if (i_934_ == 0) {
                            val i_936_ = (anIntArray9935[aByteArray9934[i_931_].toInt() and 0xff])
                            val i_937_ = (((i_936_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                            val i_938_ = ((i_936_ and 0xff00) * anInt8463 and 0xff0000)
                            val i_939_ = ((i_936_ and 0xff) * anInt8465 and 0xff00)
                            is_933_!![i_932_] = (i_937_ or i_938_ or i_939_) ushr 8
                        } else if (i_934_ == 3) {
                            val i_940_ = (anIntArray9935[aByteArray9934[i_931_].toInt() and 0xff])
                            val i_941_ = anInt8480
                            val i_942_ = i_940_ + i_941_
                            val i_943_ = (i_940_ and 0xff00ff) + (i_941_ and 0xff00ff)
                            val i_944_ = ((i_943_ and 0x1000100) + (i_942_ - i_943_ and 0x10000))
                            is_933_!![i_932_] = i_942_ - i_944_ or i_944_ - (i_944_ ushr 8)
                        } else if (i_934_ == 2) {
                            val i_945_ = (anIntArray9935[aByteArray9934[i_931_].toInt() and 0xff])
                            val i_946_ = (((i_945_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                            val i_947_ = ((i_945_ and 0xff00) * anInt8477 and 0xff0000)
                            is_933_!![i_932_] = (((i_946_ or i_947_) ushr 8) + anInt8474)
                        } else throw IllegalArgumentException()
                    } else if (i_935_ == 1) {
                        if (i_934_ == 1) {
                            val i_948_ = aByteArray9934[i_931_].toInt()
                            if (i_948_ != 0) is_933_!![i_932_] = anIntArray9935[i_948_ and 0xff]
                        } else if (i_934_ == 0) {
                            val i_949_ = aByteArray9934[i_931_].toInt()
                            if (i_949_ != 0) {
                                var i_950_ = anIntArray9935[i_949_ and 0xff]
                                if ((anInt8480 and 0xffffff) == 16777215) {
                                    val i_951_ = anInt8480 ushr 24
                                    val i_952_ = 256 - i_951_
                                    val i_953_ = is_933_!![i_932_]
                                    is_933_[i_932_] = ((((i_950_ and 0xff00ff) * i_951_ + (i_953_ and 0xff00ff) * i_952_) and 0xff00ff.inv()) + (((i_950_ and 0xff00) * i_951_ + (i_953_ and 0xff00) * i_952_) and 0xff0000)) shr 8
                                } else if (anInt8477 == 255) {
                                    val i_958_ = (((i_950_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_959_ = (((i_950_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_960_ = (((i_950_ and 0xff) * anInt8465) and 0xff00)
                                    is_933_!![i_932_] = (i_958_ or i_959_ or i_960_) ushr 8
                                } else {
                                    val i_954_ = (((i_950_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_955_ = (((i_950_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_956_ = (((i_950_ and 0xff) * anInt8465) and 0xff00)
                                    i_950_ = (i_954_ or i_955_ or i_956_) ushr 8
                                    val i_957_ = is_933_!![i_932_]
                                    is_933_[i_932_] = (((((i_950_ and 0xff00ff) * anInt8477) + ((i_957_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_950_ and 0xff00) * anInt8477) + ((i_957_ and 0xff00) * anInt8472)) and 0xff0000)) shr 8
                                }
                            }
                        } else if (i_934_ == 3) {
                            val i_961_ = aByteArray9934[i_931_]
                            var i_962_ = if (i_961_ > 0) anIntArray9935[i_961_.toInt()] else 0
                            val i_963_ = anInt8480
                            val i_964_ = i_962_ + i_963_
                            val i_965_ = (i_962_ and 0xff00ff) + (i_963_ and 0xff00ff)
                            var i_966_ = ((i_965_ and 0x1000100) + (i_964_ - i_965_ and 0x10000))
                            i_966_ = i_964_ - i_966_ or i_966_ - (i_966_ ushr 8)
                            if (i_962_ == 0 && anInt8477 != 255) {
                                i_962_ = i_966_
                                i_966_ = is_933_!![i_932_]
                                i_966_ = (((((i_962_ and 0xff00ff) * anInt8477) + ((i_966_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_962_ and 0xff00) * anInt8477) + ((i_966_ and 0xff00) * anInt8472)) and 0xff0000)) shr 8
                            }
                            is_933_!![i_932_] = i_966_
                        } else if (i_934_ == 2) {
                            val i_967_ = aByteArray9934[i_931_].toInt()
                            if (i_967_ != 0) {
                                val i_968_ = anIntArray9935[i_967_ and 0xff]
                                val i_969_ = (((i_968_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_970_ = (((i_968_ and 0xff00) * anInt8477) and 0xff0000)
                                is_933_!![i_932_++] = (((i_969_ or i_970_) ushr 8) + anInt8474)
                            }
                        } else throw IllegalArgumentException()
                    } else if (i_935_ == 2) {
                        if (i_934_ == 1) {
                            val i_971_ = aByteArray9934[i_931_].toInt()
                            if (i_971_ != 0) {
                                val i_972_ = anIntArray9935[i_971_ and 0xff]
                                var i_973_ = is_933_!![i_932_]
                                val i_974_ = i_972_ + i_973_
                                val i_975_ = ((i_972_ and 0xff00ff) + (i_973_ and 0xff00ff))
                                i_973_ = (i_975_ and 0x1000100) + (i_974_ - i_975_ and 0x10000)
                                is_933_[i_932_] = i_974_ - i_973_ or i_973_ - (i_973_ ushr 8)
                            }
                        } else if (i_934_ == 0) {
                            val i_976_ = aByteArray9934[i_931_].toInt()
                            if (i_976_ != 0) {
                                var i_977_ = anIntArray9935[i_976_ and 0xff]
                                val i_978_ = (((i_977_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_979_ = (((i_977_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_980_ = (((i_977_ and 0xff) * anInt8465) and 0xff00)
                                i_977_ = (i_978_ or i_979_ or i_980_) ushr 8
                                var i_981_ = is_933_!![i_932_]
                                val i_982_ = i_977_ + i_981_
                                val i_983_ = ((i_977_ and 0xff00ff) + (i_981_ and 0xff00ff))
                                i_981_ = (i_983_ and 0x1000100) + (i_982_ - i_983_ and 0x10000)
                                is_933_[i_932_] = i_982_ - i_981_ or i_981_ - (i_981_ ushr 8)
                            }
                        } else if (i_934_ == 3) {
                            val i_984_ = aByteArray9934[i_931_]
                            var i_985_ = if (i_984_ > 0) anIntArray9935[i_984_.toInt()] else 0
                            val i_986_ = anInt8480
                            val i_987_ = i_985_ + i_986_
                            val i_988_ = (i_985_ and 0xff00ff) + (i_986_ and 0xff00ff)
                            var i_989_ = ((i_988_ and 0x1000100) + (i_987_ - i_988_ and 0x10000))
                            i_989_ = i_987_ - i_989_ or i_989_ - (i_989_ ushr 8)
                            if (i_985_ == 0 && anInt8477 != 255) {
                                i_985_ = i_989_
                                i_989_ = is_933_!![i_932_]
                                i_989_ = (((((i_985_ and 0xff00ff) * anInt8477) + ((i_989_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_985_ and 0xff00) * anInt8477) + ((i_989_ and 0xff00) * anInt8472)) and 0xff0000)) shr 8
                            }
                            is_933_!![i_932_] = i_989_
                        } else if (i_934_ == 2) {
                            val i_990_ = aByteArray9934[i_931_].toInt()
                            if (i_990_ != 0) {
                                var i_991_ = anIntArray9935[i_990_ and 0xff]
                                val i_992_ = (((i_991_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_993_ = (((i_991_ and 0xff00) * anInt8477) and 0xff0000)
                                i_991_ = (((i_992_ or i_993_) ushr 8) + anInt8474)
                                var i_994_ = is_933_!![i_932_]
                                val i_995_ = i_991_ + i_994_
                                val i_996_ = ((i_991_ and 0xff00ff) + (i_994_ and 0xff00ff))
                                i_994_ = (i_996_ and 0x1000100) + (i_995_ - i_996_ and 0x10000)
                                is_933_[i_932_] = i_995_ - i_994_ or i_994_ - (i_994_ ushr 8)
                            }
                        }
                    } else throw IllegalArgumentException()
                    i_926_ += anInt8481
                    i_927_ += anInt8450
                    i_928_++
                }
                anInt8458 += anInt8457
                anInt8467 += anInt8452
                anInt8451 += anInt8453
            }
        } else {
            for (i_997_ in anInt8468..-1) {
                var i_998_ = anInt8451
                var i_999_ = anInt8458 + anInt8479
                var i_1000_ = anInt8467 + anInt8475
                var i_1001_ = anInt8478
                if (i_999_ < 0) {
                    val i_1002_ = ((anInt8481 - 1 - i_999_) / anInt8481)
                    i_1001_ += i_1002_
                    i_999_ += anInt8481 * i_1002_
                    i_1000_ += anInt8450 * i_1002_
                    i_998_ += i_1002_
                }
                var i_1003_: Int
                if ((((1 + i_999_ - (this.anInt8471 shl 12) - anInt8481) / anInt8481).also { i_1003_ = it }) > i_1001_) i_1001_ = i_1003_
                if (i_1000_ < 0) {
                    i_1003_ = ((anInt8450 - 1 - i_1000_) / anInt8450)
                    i_1001_ += i_1003_
                    i_999_ += anInt8481 * i_1003_
                    i_1000_ += anInt8450 * i_1003_
                    i_998_ += i_1003_
                }
                if ((((1 + i_1000_ - (this.anInt8470 shl 12) - anInt8450) / anInt8450).also { i_1003_ = it }) > i_1001_) i_1001_ = i_1003_
                while ( /**/i_1001_ < 0) {
                    val i_1004_ = ((i_1000_ shr 12) * this.anInt8471 + (i_999_ shr 12))
                    var i_1005_ = i_998_++
                    val is_1006_ = `is`
                    val i_1007_ = i
                    val i_1008_ = i_418_
                    if (i_1008_ == 0) {
                        if (i_1007_ == 1) is_1006_!![i_1005_] = (anIntArray9935[aByteArray9934[i_1004_].toInt() and 0xff])
                        else if (i_1007_ == 0) {
                            val i_1009_ = (anIntArray9935[aByteArray9934[i_1004_].toInt() and 0xff])
                            val i_1010_ = (((i_1009_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                            val i_1011_ = ((i_1009_ and 0xff00) * anInt8463 and 0xff0000)
                            val i_1012_ = ((i_1009_ and 0xff) * anInt8465 and 0xff00)
                            is_1006_!![i_1005_] = (i_1010_ or i_1011_ or i_1012_) ushr 8
                        } else if (i_1007_ == 3) {
                            val i_1013_ = (anIntArray9935[aByteArray9934[i_1004_].toInt() and 0xff])
                            val i_1014_ = anInt8480
                            val i_1015_ = i_1013_ + i_1014_
                            val i_1016_ = (i_1013_ and 0xff00ff) + (i_1014_ and 0xff00ff)
                            val i_1017_ = ((i_1016_ and 0x1000100) + (i_1015_ - i_1016_ and 0x10000))
                            is_1006_!![i_1005_] = i_1015_ - i_1017_ or i_1017_ - (i_1017_ ushr 8)
                        } else if (i_1007_ == 2) {
                            val i_1018_ = (anIntArray9935[aByteArray9934[i_1004_].toInt() and 0xff])
                            val i_1019_ = (((i_1018_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                            val i_1020_ = ((i_1018_ and 0xff00) * anInt8477 and 0xff0000)
                            is_1006_!![i_1005_] = (((i_1019_ or i_1020_) ushr 8) + anInt8474)
                        } else throw IllegalArgumentException()
                    } else if (i_1008_ == 1) {
                        if (i_1007_ == 1) {
                            val i_1021_ = aByteArray9934[i_1004_].toInt()
                            if (i_1021_ != 0) is_1006_!![i_1005_] = anIntArray9935[i_1021_ and 0xff]
                        } else if (i_1007_ == 0) {
                            val i_1022_ = aByteArray9934[i_1004_].toInt()
                            if (i_1022_ != 0) {
                                var i_1023_ = anIntArray9935[i_1022_ and 0xff]
                                if ((anInt8480 and 0xffffff) == 16777215) {
                                    val i_1024_ = anInt8480 ushr 24
                                    val i_1025_ = 256 - i_1024_
                                    val i_1026_ = is_1006_!![i_1005_]
                                    is_1006_[i_1005_] = ((((i_1023_ and 0xff00ff) * i_1024_ + (i_1026_ and 0xff00ff) * i_1025_) and 0xff00ff.inv()) + (((i_1023_ and 0xff00) * i_1024_ + (i_1026_ and 0xff00) * i_1025_) and 0xff0000)) shr 8
                                } else if (anInt8477 == 255) {
                                    val i_1031_ = (((i_1023_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_1032_ = (((i_1023_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_1033_ = (((i_1023_ and 0xff) * anInt8465) and 0xff00)
                                    is_1006_!![i_1005_] = (i_1031_ or i_1032_ or i_1033_) ushr 8
                                } else {
                                    val i_1027_ = (((i_1023_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_1028_ = (((i_1023_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_1029_ = (((i_1023_ and 0xff) * anInt8465) and 0xff00)
                                    i_1023_ = (i_1027_ or i_1028_ or i_1029_) ushr 8
                                    val i_1030_ = is_1006_!![i_1005_]
                                    is_1006_[i_1005_] = (((((i_1023_ and 0xff00ff) * anInt8477) + ((i_1030_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_1023_ and 0xff00) * anInt8477) + ((i_1030_ and 0xff00) * anInt8472)) and 0xff0000)) shr 8
                                }
                            }
                        } else if (i_1007_ == 3) {
                            val i_1034_ = aByteArray9934[i_1004_]
                            var i_1035_ = if (i_1034_ > 0) anIntArray9935[i_1034_.toInt()] else 0
                            val i_1036_ = anInt8480
                            val i_1037_ = i_1035_ + i_1036_
                            val i_1038_ = (i_1035_ and 0xff00ff) + (i_1036_ and 0xff00ff)
                            var i_1039_ = ((i_1038_ and 0x1000100) + (i_1037_ - i_1038_ and 0x10000))
                            i_1039_ = i_1037_ - i_1039_ or i_1039_ - (i_1039_ ushr 8)
                            if (i_1035_ == 0 && anInt8477 != 255) {
                                i_1035_ = i_1039_
                                i_1039_ = is_1006_!![i_1005_]
                                i_1039_ = (((((i_1035_ and 0xff00ff) * anInt8477) + ((i_1039_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_1035_ and 0xff00) * anInt8477) + ((i_1039_ and 0xff00) * anInt8472)) and 0xff0000)) shr 8
                            }
                            is_1006_!![i_1005_] = i_1039_
                        } else if (i_1007_ == 2) {
                            val i_1040_ = aByteArray9934[i_1004_].toInt()
                            if (i_1040_ != 0) {
                                val i_1041_ = anIntArray9935[i_1040_ and 0xff]
                                val i_1042_ = (((i_1041_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_1043_ = (((i_1041_ and 0xff00) * anInt8477) and 0xff0000)
                                is_1006_!![i_1005_++] = (((i_1042_ or i_1043_) ushr 8) + anInt8474)
                            }
                        } else throw IllegalArgumentException()
                    } else if (i_1008_ == 2) {
                        if (i_1007_ == 1) {
                            val i_1044_ = aByteArray9934[i_1004_].toInt()
                            if (i_1044_ != 0) {
                                val i_1045_ = anIntArray9935[i_1044_ and 0xff]
                                var i_1046_ = is_1006_!![i_1005_]
                                val i_1047_ = i_1045_ + i_1046_
                                val i_1048_ = ((i_1045_ and 0xff00ff) + (i_1046_ and 0xff00ff))
                                i_1046_ = ((i_1048_ and 0x1000100) + (i_1047_ - i_1048_ and 0x10000))
                                is_1006_[i_1005_] = i_1047_ - i_1046_ or i_1046_ - (i_1046_ ushr 8)
                            }
                        } else if (i_1007_ == 0) {
                            val i_1049_ = aByteArray9934[i_1004_].toInt()
                            if (i_1049_ != 0) {
                                var i_1050_ = anIntArray9935[i_1049_ and 0xff]
                                val i_1051_ = (((i_1050_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_1052_ = (((i_1050_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_1053_ = (((i_1050_ and 0xff) * anInt8465) and 0xff00)
                                i_1050_ = (i_1051_ or i_1052_ or i_1053_) ushr 8
                                var i_1054_ = is_1006_!![i_1005_]
                                val i_1055_ = i_1050_ + i_1054_
                                val i_1056_ = ((i_1050_ and 0xff00ff) + (i_1054_ and 0xff00ff))
                                i_1054_ = ((i_1056_ and 0x1000100) + (i_1055_ - i_1056_ and 0x10000))
                                is_1006_[i_1005_] = i_1055_ - i_1054_ or i_1054_ - (i_1054_ ushr 8)
                            }
                        } else if (i_1007_ == 3) {
                            val i_1057_ = aByteArray9934[i_1004_]
                            var i_1058_ = if (i_1057_ > 0) anIntArray9935[i_1057_.toInt()] else 0
                            val i_1059_ = anInt8480
                            val i_1060_ = i_1058_ + i_1059_
                            val i_1061_ = (i_1058_ and 0xff00ff) + (i_1059_ and 0xff00ff)
                            var i_1062_ = ((i_1061_ and 0x1000100) + (i_1060_ - i_1061_ and 0x10000))
                            i_1062_ = i_1060_ - i_1062_ or i_1062_ - (i_1062_ ushr 8)
                            if (i_1058_ == 0 && anInt8477 != 255) {
                                i_1058_ = i_1062_
                                i_1062_ = is_1006_!![i_1005_]
                                i_1062_ = (((((i_1058_ and 0xff00ff) * anInt8477) + ((i_1062_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_1058_ and 0xff00) * anInt8477) + ((i_1062_ and 0xff00) * anInt8472)) and 0xff0000)) shr 8
                            }
                            is_1006_!![i_1005_] = i_1062_
                        } else if (i_1007_ == 2) {
                            val i_1063_ = aByteArray9934[i_1004_].toInt()
                            if (i_1063_ != 0) {
                                var i_1064_ = anIntArray9935[i_1063_ and 0xff]
                                val i_1065_ = (((i_1064_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_1066_ = (((i_1064_ and 0xff00) * anInt8477) and 0xff0000)
                                i_1064_ = (((i_1065_ or i_1066_) ushr 8) + anInt8474)
                                var i_1067_ = is_1006_!![i_1005_]
                                val i_1068_ = i_1064_ + i_1067_
                                val i_1069_ = ((i_1064_ and 0xff00ff) + (i_1067_ and 0xff00ff))
                                i_1067_ = ((i_1069_ and 0x1000100) + (i_1068_ - i_1069_ and 0x10000))
                                is_1006_[i_1005_] = i_1068_ - i_1067_ or i_1067_ - (i_1067_ ushr 8)
                            }
                        }
                    } else throw IllegalArgumentException()
                    i_999_ += anInt8481
                    i_1000_ += anInt8450
                    i_1001_++
                }
                anInt8458 += anInt8457
                anInt8467 += anInt8452
                anInt8451 += anInt8453
            }
        }
    }

    override fun method963(i: Int, i_1070_: Int, var_aa: aa?, i_1071_: Int, i_1072_: Int) {
        var i = i
        var i_1070_ = i_1070_
        check(!aHa_Sub1_8460.method3716())
        i += this.anInt8461
        i_1070_ += this.anInt8464
        var i_1073_ = 0
        val i_1074_ = aHa_Sub1_8460.anInt7477
        var i_1075_ = this.anInt8471
        var i_1076_ = this.anInt8470
        var i_1077_ = i_1074_ - i_1075_
        var i_1078_ = 0
        var i_1079_ = i + i_1070_ * i_1074_
        if (i_1070_ < aHa_Sub1_8460.anInt7476) {
            val i_1080_ = (aHa_Sub1_8460.anInt7476 - i_1070_)
            i_1076_ -= i_1080_
            i_1070_ = aHa_Sub1_8460.anInt7476
            i_1073_ += i_1080_ * i_1075_
            i_1079_ += i_1080_ * i_1074_
        }
        if (i_1070_ + i_1076_ > aHa_Sub1_8460.anInt7503) i_1076_ -= i_1070_ + i_1076_ - aHa_Sub1_8460.anInt7503
        if (i < aHa_Sub1_8460.anInt7496) {
            val i_1081_ = (aHa_Sub1_8460.anInt7496 - i)
            i_1075_ -= i_1081_
            i = aHa_Sub1_8460.anInt7496
            i_1073_ += i_1081_
            i_1079_ += i_1081_
            i_1078_ += i_1081_
            i_1077_ += i_1081_
        }
        if (i + i_1075_ > aHa_Sub1_8460.anInt7507) {
            val i_1082_ = (i + i_1075_ - (aHa_Sub1_8460.anInt7507))
            i_1075_ -= i_1082_
            i_1078_ += i_1082_
            i_1077_ += i_1082_
        }
        if (i_1075_ > 0 && i_1076_ > 0) {
            val var_aa_Sub3 = var_aa as aa_Sub3?
            val `is` = var_aa_Sub3!!.anIntArray5201
            val is_1083_ = var_aa_Sub3.anIntArray5202
            val is_1084_ = (aHa_Sub1_8460.anIntArray7483)
            var i_1085_ = i_1070_
            if (i_1072_ > i_1085_) {
                i_1085_ = i_1072_
                i_1079_ += (i_1072_ - i_1070_) * i_1074_
                i_1073_ += (i_1072_ - i_1070_) * this.anInt8471
            }
            val i_1086_ = (min(i_1072_ + `is`!!.size, i_1070_ + i_1076_))
            for (i_1087_ in i_1085_..<i_1086_) {
                val i_1088_ = `is`[i_1087_ - i_1072_] + i_1071_
                var i_1089_ = is_1083_!![i_1087_ - i_1072_]
                var i_1090_ = i_1075_
                if (i > i_1088_) {
                    val i_1091_ = i - i_1088_
                    if (i_1091_ >= i_1089_) {
                        i_1073_ += i_1075_ + i_1078_
                        i_1079_ += i_1075_ + i_1077_
                        continue
                    }
                    i_1089_ -= i_1091_
                } else {
                    val i_1092_ = i_1088_ - i
                    if (i_1092_ >= i_1075_) {
                        i_1073_ += i_1075_ + i_1078_
                        i_1079_ += i_1075_ + i_1077_
                        continue
                    }
                    i_1073_ += i_1092_
                    i_1090_ -= i_1092_
                    i_1079_ += i_1092_
                }
                var i_1093_ = 0
                if (i_1090_ < i_1089_) i_1089_ = i_1090_
                else i_1093_ = i_1090_ - i_1089_
                for (i_1094_ in -i_1089_..-1) {
                    val i_1095_ = aByteArray9934[i_1073_++].toInt()
                    if (i_1095_ != 0) is_1084_!![i_1079_++] = anIntArray9935[i_1095_ and 0xff]
                    else i_1079_++
                }
                i_1073_ += i_1093_ + i_1078_
                i_1079_ += i_1093_ + i_1077_
            }
        }
    }

    override fun method964(i: Int, i_1096_: Int, i_1097_: Int, i_1098_: Int, i_1099_: Int) {
        var i = i
        var i_1096_ = i_1096_
        var i_1098_ = i_1098_
        check(!aHa_Sub1_8460.method3716())
        val i_1100_ = aHa_Sub1_8460.anInt7477
        i += this.anInt8461
        i_1096_ += this.anInt8464
        var i_1101_ = i_1096_ * i_1100_ + i
        var i_1102_ = 0
        var i_1103_ = this.anInt8470
        var i_1104_ = this.anInt8471
        var i_1105_ = i_1100_ - i_1104_
        var i_1106_ = 0
        if (i_1096_ < aHa_Sub1_8460.anInt7476) {
            val i_1107_ = (aHa_Sub1_8460.anInt7476 - i_1096_)
            i_1103_ -= i_1107_
            i_1096_ = aHa_Sub1_8460.anInt7476
            i_1102_ += i_1107_ * i_1104_
            i_1101_ += i_1107_ * i_1100_
        }
        if (i_1096_ + i_1103_ > aHa_Sub1_8460.anInt7503) i_1103_ -= i_1096_ + i_1103_ - aHa_Sub1_8460.anInt7503
        if (i < aHa_Sub1_8460.anInt7496) {
            val i_1108_ = (aHa_Sub1_8460.anInt7496 - i)
            i_1104_ -= i_1108_
            i = aHa_Sub1_8460.anInt7496
            i_1102_ += i_1108_
            i_1101_ += i_1108_
            i_1106_ += i_1108_
            i_1105_ += i_1108_
        }
        if (i + i_1104_ > aHa_Sub1_8460.anInt7507) {
            val i_1109_ = (i + i_1104_ - (aHa_Sub1_8460.anInt7507))
            i_1104_ -= i_1109_
            i_1106_ += i_1109_
            i_1105_ += i_1109_
        }
        if (i_1104_ > 0 && i_1103_ > 0) {
            val `is` = (aHa_Sub1_8460.anIntArray7483)
            if (i_1099_ == 0) {
                if (i_1097_ == 1) {
                    for (i_1110_ in -i_1103_..-1) {
                        var i_1111_ = i_1101_ + i_1104_ - 3
                        while (i_1101_ < i_1111_) {
                            `is`!![i_1101_++] = (anIntArray9935[aByteArray9934[i_1102_++].toInt() and 0xff])
                            `is`[i_1101_++] = (anIntArray9935[aByteArray9934[i_1102_++].toInt() and 0xff])
                            `is`[i_1101_++] = (anIntArray9935[aByteArray9934[i_1102_++].toInt() and 0xff])
                            `is`[i_1101_++] = (anIntArray9935[aByteArray9934[i_1102_++].toInt() and 0xff])
                        }
                        i_1111_ += 3
                        while (i_1101_ < i_1111_) `is`!![i_1101_++] = (anIntArray9935[aByteArray9934[i_1102_++].toInt() and 0xff])
                        i_1101_ += i_1105_
                        i_1102_ += i_1106_
                    }
                    return
                }
                if (i_1097_ == 0) {
                    val i_1112_ = (i_1098_ and 0xff0000) shr 16
                    val i_1113_ = (i_1098_ and 0xff00) shr 8
                    val i_1114_ = i_1098_ and 0xff
                    for (i_1115_ in -i_1103_..-1) {
                        for (i_1116_ in -i_1104_..-1) {
                            val i_1117_ = (anIntArray9935[aByteArray9934[i_1102_++].toInt() and 0xff])
                            val i_1118_ = (i_1117_ and 0xff0000) * i_1112_ and 0xffffff.inv()
                            val i_1119_ = (i_1117_ and 0xff00) * i_1113_ and 0xff0000
                            val i_1120_ = (i_1117_ and 0xff) * i_1114_ and 0xff00
                            `is`!![i_1101_++] = (i_1118_ or i_1119_ or i_1120_) ushr 8
                        }
                        i_1101_ += i_1105_
                        i_1102_ += i_1106_
                    }
                    return
                }
                if (i_1097_ == 3) {
                    for (i_1121_ in -i_1103_..-1) {
                        for (i_1122_ in -i_1104_..-1) {
                            val i_1123_ = (anIntArray9935[aByteArray9934[i_1102_++].toInt() and 0xff])
                            val i_1124_ = i_1123_ + i_1098_
                            val i_1125_ = (i_1123_ and 0xff00ff) + (i_1098_ and 0xff00ff)
                            val i_1126_ = ((i_1125_ and 0x1000100) + (i_1124_ - i_1125_ and 0x10000))
                            `is`!![i_1101_++] = i_1124_ - i_1126_ or i_1126_ - (i_1126_ ushr 8)
                        }
                        i_1101_ += i_1105_
                        i_1102_ += i_1106_
                    }
                    return
                }
                if (i_1097_ == 2) {
                    val i_1127_ = i_1098_ ushr 24
                    val i_1128_ = 256 - i_1127_
                    var i_1129_ = (i_1098_ and 0xff00ff) * i_1128_ and 0xff00ff.inv()
                    var i_1130_ = (i_1098_ and 0xff00) * i_1128_ and 0xff0000
                    i_1098_ = (i_1129_ or i_1130_) ushr 8
                    for (i_1131_ in -i_1103_..-1) {
                        for (i_1132_ in -i_1104_..-1) {
                            val i_1133_ = (anIntArray9935[aByteArray9934[i_1102_++].toInt() and 0xff])
                            i_1129_ = (i_1133_ and 0xff00ff) * i_1127_ and 0xff00ff.inv()
                            i_1130_ = (i_1133_ and 0xff00) * i_1127_ and 0xff0000
                            `is`!![i_1101_++] = ((i_1129_ or i_1130_) ushr 8) + i_1098_
                        }
                        i_1101_ += i_1105_
                        i_1102_ += i_1106_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            if (i_1099_ == 1) {
                if (i_1097_ == 1) {
                    for (i_1134_ in -i_1103_..-1) {
                        for (i_1135_ in -i_1104_..-1) {
                            val i_1136_ = aByteArray9934[i_1102_++].toInt()
                            if (i_1136_ != 0) {
                                val i_1137_ = (anIntArray9935[i_1136_ and 0xff] or 0xffffff.inv())
                                val i_1138_ = 255
                                val i_1139_ = 0
                                val i_1140_ = `is`!![i_1101_]
                                `is`[i_1101_++] = (((((i_1137_ and 0xff00ff) * i_1138_ + (i_1140_ and 0xff00ff) * i_1139_) and 0xff00ff.inv()) shr 8) + (((((i_1137_ and 0xff00ff.inv()) ushr 8) * i_1138_) + (((i_1140_ and 0xff00ff.inv()) ushr 8) * i_1139_)) and 0xff00ff.inv()))
                            } else i_1101_++
                        }
                        i_1101_ += i_1105_
                        i_1102_ += i_1106_
                    }
                    return
                }
                if (i_1097_ == 0) {
                    if ((i_1098_ and 0xffffff) == 16777215) {
                        val i_1141_ = i_1098_ ushr 24
                        val i_1142_ = 256 - i_1141_
                        for (i_1143_ in -i_1103_..-1) {
                            for (i_1144_ in -i_1104_..-1) {
                                val i_1145_ = aByteArray9934[i_1102_++].toInt()
                                if (i_1145_ != 0) {
                                    val i_1146_ = anIntArray9935[i_1145_ and 0xff]
                                    val i_1147_ = `is`!![i_1101_]
                                    `is`[i_1101_++] = ((((i_1146_ and 0xff00ff) * i_1141_ + (i_1147_ and 0xff00ff) * i_1142_) and 0xff00ff.inv()) + (((i_1146_ and 0xff00) * i_1141_ + (i_1147_ and 0xff00) * i_1142_) and 0xff0000)) shr 8
                                } else i_1101_++
                            }
                            i_1101_ += i_1105_
                            i_1102_ += i_1106_
                        }
                    } else {
                        val i_1148_ = (i_1098_ and 0xff0000) shr 16
                        val i_1149_ = (i_1098_ and 0xff00) shr 8
                        val i_1150_ = i_1098_ and 0xff
                        val i_1151_ = i_1098_ ushr 24
                        val i_1152_ = 256 - i_1151_
                        for (i_1153_ in -i_1103_..-1) {
                            for (i_1154_ in -i_1104_..-1) {
                                val i_1155_ = aByteArray9934[i_1102_++].toInt()
                                if (i_1155_ != 0) {
                                    var i_1156_ = anIntArray9935[i_1155_ and 0xff]
                                    if (i_1151_ == 255) {
                                        val i_1161_ = ((i_1156_ and 0xff0000) * i_1148_ and 0xffffff.inv())
                                        val i_1162_ = ((i_1156_ and 0xff00) * i_1149_ and 0xff0000)
                                        val i_1163_ = ((i_1156_ and 0xff) * i_1150_ and 0xff00)
                                        `is`!![i_1101_++] = (i_1161_ or i_1162_ or i_1163_) ushr 8
                                    } else {
                                        val i_1157_ = ((i_1156_ and 0xff0000) * i_1148_ and 0xffffff.inv())
                                        val i_1158_ = ((i_1156_ and 0xff00) * i_1149_ and 0xff0000)
                                        val i_1159_ = ((i_1156_ and 0xff) * i_1150_ and 0xff00)
                                        i_1156_ = (i_1157_ or i_1158_ or i_1159_) ushr 8
                                        val i_1160_ = `is`!![i_1101_]
                                        `is`[i_1101_++] = ((((i_1156_ and 0xff00ff) * i_1151_ + ((i_1160_ and 0xff00ff) * i_1152_)) and 0xff00ff.inv()) + (((i_1156_ and 0xff00) * i_1151_ + ((i_1160_ and 0xff00) * i_1152_)) and 0xff0000)) shr 8
                                    }
                                } else i_1101_++
                            }
                            i_1101_ += i_1105_
                            i_1102_ += i_1106_
                        }
                        return
                    }
                    return
                }
                if (i_1097_ == 3) {
                    val i_1164_ = i_1098_ ushr 24
                    val i_1165_ = 256 - i_1164_
                    for (i_1166_ in -i_1103_..-1) {
                        for (i_1167_ in -i_1104_..-1) {
                            val i_1168_ = aByteArray9934[i_1102_++]
                            var i_1169_ = if (i_1168_ > 0) anIntArray9935[i_1168_.toInt()] else 0
                            val i_1170_ = i_1169_ + i_1098_
                            val i_1171_ = (i_1169_ and 0xff00ff) + (i_1098_ and 0xff00ff)
                            var i_1172_ = ((i_1171_ and 0x1000100) + (i_1170_ - i_1171_ and 0x10000))
                            i_1172_ = i_1170_ - i_1172_ or i_1172_ - (i_1172_ ushr 8)
                            if (i_1169_ == 0 && i_1164_ != 255) {
                                i_1169_ = i_1172_
                                i_1172_ = `is`!![i_1101_]
                                i_1172_ = ((((i_1169_ and 0xff00ff) * i_1164_ + (i_1172_ and 0xff00ff) * i_1165_) and 0xff00ff.inv()) + (((i_1169_ and 0xff00) * i_1164_ + (i_1172_ and 0xff00) * i_1165_) and 0xff0000)) shr 8
                            }
                            `is`!![i_1101_++] = i_1172_
                        }
                        i_1101_ += i_1105_
                        i_1102_ += i_1106_
                    }
                    return
                }
                if (i_1097_ == 2) {
                    val i_1173_ = i_1098_ ushr 24
                    val i_1174_ = 256 - i_1173_
                    var i_1175_ = (i_1098_ and 0xff00ff) * i_1174_ and 0xff00ff.inv()
                    var i_1176_ = (i_1098_ and 0xff00) * i_1174_ and 0xff0000
                    i_1098_ = (i_1175_ or i_1176_) ushr 8
                    for (i_1177_ in -i_1103_..-1) {
                        for (i_1178_ in -i_1104_..-1) {
                            val i_1179_ = aByteArray9934[i_1102_++].toInt()
                            if (i_1179_ != 0) {
                                val i_1180_ = anIntArray9935[i_1179_ and 0xff]
                                i_1175_ = ((i_1180_ and 0xff00ff) * i_1173_ and 0xff00ff.inv())
                                i_1176_ = (i_1180_ and 0xff00) * i_1173_ and 0xff0000
                                `is`!![i_1101_++] = ((i_1175_ or i_1176_) ushr 8) + i_1098_
                            } else i_1101_++
                        }
                        i_1101_ += i_1105_
                        i_1102_ += i_1106_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            if (i_1099_ == 2) {
                if (i_1097_ == 1) {
                    for (i_1181_ in -i_1103_..-1) {
                        for (i_1182_ in -i_1104_..-1) {
                            val i_1183_ = aByteArray9934[i_1102_++].toInt()
                            if (i_1183_ != 0) {
                                val i_1184_ = anIntArray9935[i_1183_ and 0xff]
                                var i_1185_ = `is`!![i_1101_]
                                val i_1186_ = i_1184_ + i_1185_
                                val i_1187_ = ((i_1184_ and 0xff00ff) + (i_1185_ and 0xff00ff))
                                i_1185_ = ((i_1187_ and 0x1000100) + (i_1186_ - i_1187_ and 0x10000))
                                `is`[i_1101_++] = i_1186_ - i_1185_ or i_1185_ - (i_1185_ ushr 8)
                            } else i_1101_++
                        }
                        i_1101_ += i_1105_
                        i_1102_ += i_1106_
                    }
                    return
                }
                if (i_1097_ == 0) {
                    val i_1188_ = (i_1098_ and 0xff0000) shr 16
                    val i_1189_ = (i_1098_ and 0xff00) shr 8
                    val i_1190_ = i_1098_ and 0xff
                    for (i_1191_ in -i_1103_..-1) {
                        for (i_1192_ in -i_1104_..-1) {
                            val i_1193_ = aByteArray9934[i_1102_++].toInt()
                            if (i_1193_ != 0) {
                                var i_1194_ = anIntArray9935[i_1193_ and 0xff]
                                val i_1195_ = ((i_1194_ and 0xff0000) * i_1188_ and 0xffffff.inv())
                                val i_1196_ = (i_1194_ and 0xff00) * i_1189_ and 0xff0000
                                val i_1197_ = (i_1194_ and 0xff) * i_1190_ and 0xff00
                                i_1194_ = (i_1195_ or i_1196_ or i_1197_) ushr 8
                                var i_1198_ = `is`!![i_1101_]
                                val i_1199_ = i_1194_ + i_1198_
                                val i_1200_ = ((i_1194_ and 0xff00ff) + (i_1198_ and 0xff00ff))
                                i_1198_ = ((i_1200_ and 0x1000100) + (i_1199_ - i_1200_ and 0x10000))
                                `is`[i_1101_++] = i_1199_ - i_1198_ or i_1198_ - (i_1198_ ushr 8)
                            } else i_1101_++
                        }
                        i_1101_ += i_1105_
                        i_1102_ += i_1106_
                    }
                    return
                }
                if (i_1097_ == 3) {
                    for (i_1201_ in -i_1103_..-1) {
                        for (i_1202_ in -i_1104_..-1) {
                            val i_1203_ = aByteArray9934[i_1102_++]
                            var i_1204_ = if (i_1203_ > 0) anIntArray9935[i_1203_.toInt()] else 0
                            var i_1205_ = i_1204_ + i_1098_
                            var i_1206_ = (i_1204_ and 0xff00ff) + (i_1098_ and 0xff00ff)
                            var i_1207_ = ((i_1206_ and 0x1000100) + (i_1205_ - i_1206_ and 0x10000))
                            i_1204_ = i_1205_ - i_1207_ or i_1207_ - (i_1207_ ushr 8)
                            i_1207_ = `is`!![i_1101_]
                            i_1205_ = i_1204_ + i_1207_
                            i_1206_ = (i_1204_ and 0xff00ff) + (i_1207_ and 0xff00ff)
                            i_1207_ = (i_1206_ and 0x1000100) + (i_1205_ - i_1206_ and 0x10000)
                            `is`[i_1101_++] = i_1205_ - i_1207_ or i_1207_ - (i_1207_ ushr 8)
                        }
                        i_1101_ += i_1105_
                        i_1102_ += i_1106_
                    }
                    return
                }
                if (i_1097_ == 2) {
                    val i_1208_ = i_1098_ ushr 24
                    val i_1209_ = 256 - i_1208_
                    var i_1210_ = (i_1098_ and 0xff00ff) * i_1209_ and 0xff00ff.inv()
                    var i_1211_ = (i_1098_ and 0xff00) * i_1209_ and 0xff0000
                    i_1098_ = (i_1210_ or i_1211_) ushr 8
                    for (i_1212_ in -i_1103_..-1) {
                        for (i_1213_ in -i_1104_..-1) {
                            val i_1214_ = aByteArray9934[i_1102_++].toInt()
                            if (i_1214_ != 0) {
                                var i_1215_ = anIntArray9935[i_1214_ and 0xff]
                                i_1210_ = ((i_1215_ and 0xff00ff) * i_1208_ and 0xff00ff.inv())
                                i_1211_ = (i_1215_ and 0xff00) * i_1208_ and 0xff0000
                                i_1215_ = ((i_1210_ or i_1211_) ushr 8) + i_1098_
                                var i_1216_ = `is`!![i_1101_]
                                val i_1217_ = i_1215_ + i_1216_
                                val i_1218_ = ((i_1215_ and 0xff00ff) + (i_1216_ and 0xff00ff))
                                i_1216_ = ((i_1218_ and 0x1000100) + (i_1217_ - i_1218_ and 0x10000))
                                `is`[i_1101_++] = i_1217_ - i_1216_ or i_1216_ - (i_1216_ ushr 8)
                            } else i_1101_++
                        }
                        i_1101_ += i_1105_
                        i_1102_ += i_1106_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            throw IllegalArgumentException()
        }
    }
}
