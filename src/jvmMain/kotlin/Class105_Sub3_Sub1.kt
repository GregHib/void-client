import kotlin.math.min

/* Class105_Sub3_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class105_Sub3_Sub1 : Class105_Sub3 {
    var anIntArray9933: IntArray

    override fun method994(i: Int, i_0_: Int) {
        val `is` = aHa_Sub1_8460.anIntArray7483
        if (anInt8481 == 0) {
            if (anInt8450 == 0) {
                var i_1_ = anInt8468
                while (i_1_ < 0) {
                    var i_2_ = anInt8451
                    val i_3_ = anInt8458
                    val i_4_ = anInt8467
                    var i_5_ = anInt8478
                    if (i_3_ >= 0 && i_4_ >= 0 && i_3_ - (this.anInt8471 shl 12) < 0 && (i_4_ - (this.anInt8470 shl 12) < 0)) {
                        while ( /**/i_5_ < 0) {
                            var i_6_ = (((i_4_ shr 12) * this.anInt8471) + (i_3_ shr 12))
                            var i_7_ = i_2_++
                            val is_8_ = `is`
                            val i_9_ = i
                            val i_10_ = i_0_
                            if (i_10_ == 0) {
                                if (i_9_ == 1) is_8_!![i_7_] = (anIntArray9933[i_6_])
                                else if (i_9_ == 0) {
                                    val i_11_ = (anIntArray9933[i_6_++])
                                    val i_12_ = (((i_11_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_13_ = (((i_11_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_14_ = (((i_11_ and 0xff) * anInt8465) and 0xff00)
                                    is_8_!![i_7_] = (i_12_ or i_13_ or i_14_) ushr 8
                                } else if (i_9_ == 3) {
                                    val i_15_ = (anIntArray9933[i_6_++])
                                    val i_16_ = anInt8480
                                    val i_17_ = i_15_ + i_16_
                                    val i_18_ = ((i_15_ and 0xff00ff) + (i_16_ and 0xff00ff))
                                    val i_19_ = ((i_18_ and 0x1000100) + (i_17_ - i_18_ and 0x10000))
                                    is_8_!![i_7_] = i_17_ - i_19_ or i_19_ - (i_19_ ushr 8)
                                } else if (i_9_ == 2) {
                                    val i_20_ = (anIntArray9933[i_6_])
                                    val i_21_ = (((i_20_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_22_ = (((i_20_ and 0xff00) * anInt8477) and 0xff0000)
                                    is_8_!![i_7_] = (((i_21_ or i_22_) ushr 8) + anInt8474)
                                } else throw IllegalArgumentException()
                            } else if (i_10_ == 1) {
                                if (i_9_ == 1) {
                                    val i_23_ = (anIntArray9933[i_6_])
                                    if (i_23_ != 0) is_8_!![i_7_] = i_23_
                                } else if (i_9_ == 0) {
                                    var i_24_ = (anIntArray9933[i_6_])
                                    if (i_24_ != 0) {
                                        if ((anInt8480 and 0xffffff) == 16777215) {
                                            val i_25_ = (anInt8480 ushr 24)
                                            val i_26_ = 256 - i_25_
                                            val i_27_ = is_8_!![i_7_]
                                            is_8_[i_7_] = ((((i_24_ and 0xff00ff) * i_25_ + ((i_27_ and 0xff00ff) * i_26_)) and 0xff00ff.inv()) + (((i_24_ and 0xff00) * i_25_ + ((i_27_ and 0xff00) * i_26_)) and 0xff0000)) shr 8
                                        } else if (anInt8477 == 255) {
                                            val i_32_ = (((i_24_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                            val i_33_ = (((i_24_ and 0xff00) * anInt8463) and 0xff0000)
                                            val i_34_ = (((i_24_ and 0xff) * anInt8465) and 0xff00)
                                            is_8_!![i_7_] = (i_32_ or i_33_ or i_34_) ushr 8
                                        } else {
                                            val i_28_ = (((i_24_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                            val i_29_ = (((i_24_ and 0xff00) * anInt8463) and 0xff0000)
                                            val i_30_ = (((i_24_ and 0xff) * anInt8465) and 0xff00)
                                            i_24_ = ((i_28_ or i_29_ or i_30_) ushr 8)
                                            val i_31_ = is_8_!![i_7_]
                                            is_8_[i_7_] = (((((i_24_ and 0xff00ff) * (anInt8477)) + ((i_31_ and 0xff00ff) * (anInt8472))) and 0xff00ff.inv()) + ((((i_24_ and 0xff00) * (anInt8477)) + ((i_31_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                        }
                                    }
                                } else if (i_9_ == 3) {
                                    var i_35_ = (anIntArray9933[i_6_])
                                    val i_36_ = anInt8480
                                    val i_37_ = i_35_ + i_36_
                                    val i_38_ = ((i_35_ and 0xff00ff) + (i_36_ and 0xff00ff))
                                    var i_39_ = ((i_38_ and 0x1000100) + (i_37_ - i_38_ and 0x10000))
                                    i_39_ = i_37_ - i_39_ or i_39_ - (i_39_ ushr 8)
                                    if (i_35_ == 0 && anInt8477 != 255) {
                                        i_35_ = i_39_
                                        i_39_ = is_8_!![i_7_]
                                        i_39_ = (((((i_35_ and 0xff00ff) * anInt8477) + ((i_39_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_35_ and 0xff00) * anInt8477) + ((i_39_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                    }
                                    is_8_!![i_7_] = i_39_
                                } else if (i_9_ == 2) {
                                    val i_40_ = (anIntArray9933[i_6_])
                                    if (i_40_ != 0) {
                                        val i_41_ = (((i_40_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                        val i_42_ = (((i_40_ and 0xff00) * anInt8477) and 0xff0000)
                                        is_8_!![i_7_++] = (((i_41_ or i_42_) ushr 8) + anInt8474)
                                    }
                                } else throw IllegalArgumentException()
                            } else if (i_10_ == 2) {
                                if (i_9_ == 1) {
                                    val i_43_ = (anIntArray9933[i_6_])
                                    if (i_43_ != 0) {
                                        var i_44_ = is_8_!![i_7_]
                                        val i_45_ = i_43_ + i_44_
                                        val i_46_ = ((i_43_ and 0xff00ff) + (i_44_ and 0xff00ff))
                                        i_44_ = ((i_46_ and 0x1000100) + (i_45_ - i_46_ and 0x10000))
                                        is_8_[i_7_] = i_45_ - i_44_ or i_44_ - (i_44_ ushr 8)
                                    }
                                } else if (i_9_ == 0) {
                                    var i_47_ = (anIntArray9933[i_6_])
                                    if (i_47_ != 0) {
                                        val i_48_ = (((i_47_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_49_ = (((i_47_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_50_ = (((i_47_ and 0xff) * anInt8465) and 0xff00)
                                        i_47_ = (i_48_ or i_49_ or i_50_) ushr 8
                                        var i_51_ = is_8_!![i_7_]
                                        val i_52_ = i_47_ + i_51_
                                        val i_53_ = ((i_47_ and 0xff00ff) + (i_51_ and 0xff00ff))
                                        i_51_ = ((i_53_ and 0x1000100) + (i_52_ - i_53_ and 0x10000))
                                        is_8_[i_7_] = i_52_ - i_51_ or i_51_ - (i_51_ ushr 8)
                                    }
                                } else if (i_9_ == 3) {
                                    var i_54_ = (anIntArray9933[i_6_])
                                    val i_55_ = anInt8480
                                    var i_56_ = i_54_ + i_55_
                                    var i_57_ = ((i_54_ and 0xff00ff) + (i_55_ and 0xff00ff))
                                    var i_58_ = ((i_57_ and 0x1000100) + (i_56_ - i_57_ and 0x10000))
                                    i_54_ = i_56_ - i_58_ or i_58_ - (i_58_ ushr 8)
                                    i_58_ = is_8_!![i_7_]
                                    i_56_ = i_54_ + i_58_
                                    i_57_ = (i_54_ and 0xff00ff) + (i_58_ and 0xff00ff)
                                    i_58_ = (i_57_ and 0x1000100) + (i_56_ - i_57_ and 0x10000)
                                    is_8_[i_7_] = i_56_ - i_58_ or i_58_ - (i_58_ ushr 8)
                                } else if (i_9_ == 2) {
                                    var i_59_ = (anIntArray9933[i_6_])
                                    if (i_59_ != 0) {
                                        val i_60_ = (((i_59_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                        val i_61_ = (((i_59_ and 0xff00) * anInt8477) and 0xff0000)
                                        i_59_ = (((i_60_ or i_61_) ushr 8) + anInt8474)
                                        var i_62_ = is_8_!![i_7_]
                                        val i_63_ = i_59_ + i_62_
                                        val i_64_ = ((i_59_ and 0xff00ff) + (i_62_ and 0xff00ff))
                                        i_62_ = ((i_64_ and 0x1000100) + (i_63_ - i_64_ and 0x10000))
                                        is_8_[i_7_] = i_63_ - i_62_ or i_62_ - (i_62_ ushr 8)
                                    }
                                }
                            } else throw IllegalArgumentException()
                            i_5_++
                        }
                    }
                    i_1_++
                    anInt8451 += anInt8453
                }
            } else if (anInt8450 < 0) {
                var i_65_ = anInt8468
                while (i_65_ < 0) {
                    var i_66_ = anInt8451
                    val i_67_ = anInt8458
                    var i_68_ = anInt8467 + anInt8475
                    var i_69_ = anInt8478
                    if (i_67_ >= 0 && i_67_ - (this.anInt8471 shl 12) < 0) {
                        var i_70_: Int
                        if (((i_68_ - (this.anInt8470 shl 12)).also { i_70_ = it }) >= 0) {
                            i_70_ = ((anInt8450 - i_70_) / anInt8450)
                            i_69_ += i_70_
                            i_68_ += anInt8450 * i_70_
                            i_66_ += i_70_
                        }
                        if ((((i_68_ - anInt8450) / anInt8450).also { i_70_ = it }) > i_69_) i_69_ = i_70_
                        while ( /**/i_69_ < 0) {
                            var i_71_ = (((i_68_ shr 12) * this.anInt8471) + (i_67_ shr 12))
                            var i_72_ = i_66_++
                            val is_73_ = `is`
                            val i_74_ = i
                            val i_75_ = i_0_
                            if (i_75_ == 0) {
                                if (i_74_ == 1) is_73_!![i_72_] = (anIntArray9933[i_71_])
                                else if (i_74_ == 0) {
                                    val i_76_ = (anIntArray9933[i_71_++])
                                    val i_77_ = (((i_76_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_78_ = (((i_76_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_79_ = (((i_76_ and 0xff) * anInt8465) and 0xff00)
                                    is_73_!![i_72_] = (i_77_ or i_78_ or i_79_) ushr 8
                                } else if (i_74_ == 3) {
                                    val i_80_ = (anIntArray9933[i_71_++])
                                    val i_81_ = anInt8480
                                    val i_82_ = i_80_ + i_81_
                                    val i_83_ = ((i_80_ and 0xff00ff) + (i_81_ and 0xff00ff))
                                    val i_84_ = ((i_83_ and 0x1000100) + (i_82_ - i_83_ and 0x10000))
                                    is_73_!![i_72_] = i_82_ - i_84_ or i_84_ - (i_84_ ushr 8)
                                } else if (i_74_ == 2) {
                                    val i_85_ = (anIntArray9933[i_71_])
                                    val i_86_ = (((i_85_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_87_ = (((i_85_ and 0xff00) * anInt8477) and 0xff0000)
                                    is_73_!![i_72_] = (((i_86_ or i_87_) ushr 8) + anInt8474)
                                } else throw IllegalArgumentException()
                            } else if (i_75_ == 1) {
                                if (i_74_ == 1) {
                                    val i_88_ = (anIntArray9933[i_71_])
                                    if (i_88_ != 0) is_73_!![i_72_] = i_88_
                                } else if (i_74_ == 0) {
                                    var i_89_ = (anIntArray9933[i_71_])
                                    if (i_89_ != 0) {
                                        if ((anInt8480 and 0xffffff) == 16777215) {
                                            val i_90_ = (anInt8480 ushr 24)
                                            val i_91_ = 256 - i_90_
                                            val i_92_ = is_73_!![i_72_]
                                            is_73_[i_72_] = ((((i_89_ and 0xff00ff) * i_90_ + ((i_92_ and 0xff00ff) * i_91_)) and 0xff00ff.inv()) + (((i_89_ and 0xff00) * i_90_ + ((i_92_ and 0xff00) * i_91_)) and 0xff0000)) shr 8
                                        } else if (anInt8477 == 255) {
                                            val i_97_ = (((i_89_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                            val i_98_ = (((i_89_ and 0xff00) * anInt8463) and 0xff0000)
                                            val i_99_ = (((i_89_ and 0xff) * anInt8465) and 0xff00)
                                            is_73_!![i_72_] = (i_97_ or i_98_ or i_99_) ushr 8
                                        } else {
                                            val i_93_ = (((i_89_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                            val i_94_ = (((i_89_ and 0xff00) * anInt8463) and 0xff0000)
                                            val i_95_ = (((i_89_ and 0xff) * anInt8465) and 0xff00)
                                            i_89_ = ((i_93_ or i_94_ or i_95_) ushr 8)
                                            val i_96_ = is_73_!![i_72_]
                                            is_73_[i_72_] = (((((i_89_ and 0xff00ff) * (anInt8477)) + ((i_96_ and 0xff00ff) * (anInt8472))) and 0xff00ff.inv()) + ((((i_89_ and 0xff00) * (anInt8477)) + ((i_96_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                        }
                                    }
                                } else if (i_74_ == 3) {
                                    var i_100_ = (anIntArray9933[i_71_])
                                    val i_101_ = anInt8480
                                    val i_102_ = i_100_ + i_101_
                                    val i_103_ = ((i_100_ and 0xff00ff) + (i_101_ and 0xff00ff))
                                    var i_104_ = ((i_103_ and 0x1000100) + (i_102_ - i_103_ and 0x10000))
                                    i_104_ = i_102_ - i_104_ or i_104_ - (i_104_ ushr 8)
                                    if (i_100_ == 0 && anInt8477 != 255) {
                                        i_100_ = i_104_
                                        i_104_ = is_73_!![i_72_]
                                        i_104_ = (((((i_100_ and 0xff00ff) * anInt8477) + ((i_104_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_100_ and 0xff00) * anInt8477) + ((i_104_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                    }
                                    is_73_!![i_72_] = i_104_
                                } else if (i_74_ == 2) {
                                    val i_105_ = (anIntArray9933[i_71_])
                                    if (i_105_ != 0) {
                                        val i_106_ = (((i_105_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                        val i_107_ = (((i_105_ and 0xff00) * anInt8477) and 0xff0000)
                                        is_73_!![i_72_++] = (((i_106_ or i_107_) ushr 8) + anInt8474)
                                    }
                                } else throw IllegalArgumentException()
                            } else if (i_75_ == 2) {
                                if (i_74_ == 1) {
                                    val i_108_ = (anIntArray9933[i_71_])
                                    if (i_108_ != 0) {
                                        var i_109_ = is_73_!![i_72_]
                                        val i_110_ = i_108_ + i_109_
                                        val i_111_ = ((i_108_ and 0xff00ff) + (i_109_ and 0xff00ff))
                                        i_109_ = ((i_111_ and 0x1000100) + (i_110_ - i_111_ and 0x10000))
                                        is_73_[i_72_] = (i_110_ - i_109_ or i_109_ - (i_109_ ushr 8))
                                    }
                                } else if (i_74_ == 0) {
                                    var i_112_ = (anIntArray9933[i_71_])
                                    if (i_112_ != 0) {
                                        val i_113_ = (((i_112_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_114_ = (((i_112_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_115_ = (((i_112_ and 0xff) * anInt8465) and 0xff00)
                                        i_112_ = (i_113_ or i_114_ or i_115_) ushr 8
                                        var i_116_ = is_73_!![i_72_]
                                        val i_117_ = i_112_ + i_116_
                                        val i_118_ = ((i_112_ and 0xff00ff) + (i_116_ and 0xff00ff))
                                        i_116_ = ((i_118_ and 0x1000100) + (i_117_ - i_118_ and 0x10000))
                                        is_73_[i_72_] = (i_117_ - i_116_ or i_116_ - (i_116_ ushr 8))
                                    }
                                } else if (i_74_ == 3) {
                                    var i_119_ = (anIntArray9933[i_71_])
                                    val i_120_ = anInt8480
                                    var i_121_ = i_119_ + i_120_
                                    var i_122_ = ((i_119_ and 0xff00ff) + (i_120_ and 0xff00ff))
                                    var i_123_ = ((i_122_ and 0x1000100) + (i_121_ - i_122_ and 0x10000))
                                    i_119_ = i_121_ - i_123_ or i_123_ - (i_123_ ushr 8)
                                    i_123_ = is_73_!![i_72_]
                                    i_121_ = i_119_ + i_123_
                                    i_122_ = (i_119_ and 0xff00ff) + (i_123_ and 0xff00ff)
                                    i_123_ = ((i_122_ and 0x1000100) + (i_121_ - i_122_ and 0x10000))
                                    is_73_[i_72_] = i_121_ - i_123_ or i_123_ - (i_123_ ushr 8)
                                } else if (i_74_ == 2) {
                                    var i_124_ = (anIntArray9933[i_71_])
                                    if (i_124_ != 0) {
                                        val i_125_ = (((i_124_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                        val i_126_ = (((i_124_ and 0xff00) * anInt8477) and 0xff0000)
                                        i_124_ = (((i_125_ or i_126_) ushr 8) + anInt8474)
                                        var i_127_ = is_73_!![i_72_]
                                        val i_128_ = i_124_ + i_127_
                                        val i_129_ = ((i_124_ and 0xff00ff) + (i_127_ and 0xff00ff))
                                        i_127_ = ((i_129_ and 0x1000100) + (i_128_ - i_129_ and 0x10000))
                                        is_73_[i_72_] = (i_128_ - i_127_ or i_127_ - (i_127_ ushr 8))
                                    }
                                }
                            } else throw IllegalArgumentException()
                            i_68_ += anInt8450
                            i_69_++
                        }
                    }
                    i_65_++
                    anInt8458 += anInt8457
                    anInt8451 += anInt8453
                }
            } else {
                var i_130_ = anInt8468
                while (i_130_ < 0) {
                    var i_131_ = anInt8451
                    val i_132_ = anInt8458
                    var i_133_ = anInt8467 + anInt8475
                    var i_134_ = anInt8478
                    if (i_132_ >= 0 && (i_132_ - (this.anInt8471 shl 12) < 0)) {
                        if (i_133_ < 0) {
                            val i_135_ = ((anInt8450 - 1 - i_133_) / anInt8450)
                            i_134_ += i_135_
                            i_133_ += anInt8450 * i_135_
                            i_131_ += i_135_
                        }
                        val i_136_: Int
                        if ((((1 + i_133_ - (this.anInt8470 shl 12) - anInt8450) / anInt8450).also { i_136_ = it }) > i_134_) i_134_ = i_136_
                        while ( /**/i_134_ < 0) {
                            var i_137_ = (((i_133_ shr 12) * this.anInt8471) + (i_132_ shr 12))
                            var i_138_ = i_131_++
                            val is_139_ = `is`
                            val i_140_ = i
                            val i_141_ = i_0_
                            if (i_141_ == 0) {
                                if (i_140_ == 1) is_139_!![i_138_] = (anIntArray9933[i_137_])
                                else if (i_140_ == 0) {
                                    val i_142_ = (anIntArray9933[i_137_++])
                                    val i_143_ = (((i_142_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_144_ = (((i_142_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_145_ = (((i_142_ and 0xff) * anInt8465) and 0xff00)
                                    is_139_!![i_138_] = (i_143_ or i_144_ or i_145_) ushr 8
                                } else if (i_140_ == 3) {
                                    val i_146_ = (anIntArray9933[i_137_++])
                                    val i_147_ = anInt8480
                                    val i_148_ = i_146_ + i_147_
                                    val i_149_ = ((i_146_ and 0xff00ff) + (i_147_ and 0xff00ff))
                                    val i_150_ = ((i_149_ and 0x1000100) + (i_148_ - i_149_ and 0x10000))
                                    is_139_!![i_138_] = i_148_ - i_150_ or i_150_ - (i_150_ ushr 8)
                                } else if (i_140_ == 2) {
                                    val i_151_ = (anIntArray9933[i_137_])
                                    val i_152_ = (((i_151_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_153_ = (((i_151_ and 0xff00) * anInt8477) and 0xff0000)
                                    is_139_!![i_138_] = (((i_152_ or i_153_) ushr 8) + anInt8474)
                                } else throw IllegalArgumentException()
                            } else if (i_141_ == 1) {
                                if (i_140_ == 1) {
                                    val i_154_ = (anIntArray9933[i_137_])
                                    if (i_154_ != 0) is_139_!![i_138_] = i_154_
                                } else if (i_140_ == 0) {
                                    var i_155_ = (anIntArray9933[i_137_])
                                    if (i_155_ != 0) {
                                        if ((anInt8480 and 0xffffff) == 16777215) {
                                            val i_156_ = (anInt8480 ushr 24)
                                            val i_157_ = 256 - i_156_
                                            val i_158_ = is_139_!![i_138_]
                                            is_139_[i_138_] = (((((i_155_ and 0xff00ff) * i_156_) + ((i_158_ and 0xff00ff) * i_157_)) and 0xff00ff.inv()) + ((((i_155_ and 0xff00) * i_156_) + ((i_158_ and 0xff00) * i_157_)) and 0xff0000)) shr 8
                                        } else if (anInt8477 == 255) {
                                            val i_163_ = (((i_155_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                            val i_164_ = (((i_155_ and 0xff00) * anInt8463) and 0xff0000)
                                            val i_165_ = (((i_155_ and 0xff) * anInt8465) and 0xff00)
                                            is_139_!![i_138_] = (i_163_ or i_164_ or i_165_) ushr 8
                                        } else {
                                            val i_159_ = (((i_155_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                            val i_160_ = (((i_155_ and 0xff00) * anInt8463) and 0xff0000)
                                            val i_161_ = (((i_155_ and 0xff) * anInt8465) and 0xff00)
                                            i_155_ = (i_159_ or i_160_ or i_161_) ushr 8
                                            val i_162_ = is_139_!![i_138_]
                                            is_139_[i_138_] = (((((i_155_ and 0xff00ff) * (anInt8477)) + ((i_162_ and 0xff00ff) * (anInt8472))) and 0xff00ff.inv()) + ((((i_155_ and 0xff00) * (anInt8477)) + ((i_162_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                        }
                                    }
                                } else if (i_140_ == 3) {
                                    var i_166_ = (anIntArray9933[i_137_])
                                    val i_167_ = anInt8480
                                    val i_168_ = i_166_ + i_167_
                                    val i_169_ = ((i_166_ and 0xff00ff) + (i_167_ and 0xff00ff))
                                    var i_170_ = ((i_169_ and 0x1000100) + (i_168_ - i_169_ and 0x10000))
                                    i_170_ = i_168_ - i_170_ or i_170_ - (i_170_ ushr 8)
                                    if (i_166_ == 0 && anInt8477 != 255) {
                                        i_166_ = i_170_
                                        i_170_ = is_139_!![i_138_]
                                        i_170_ = (((((i_166_ and 0xff00ff) * anInt8477) + ((i_170_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_166_ and 0xff00) * anInt8477) + ((i_170_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                    }
                                    is_139_!![i_138_] = i_170_
                                } else if (i_140_ == 2) {
                                    val i_171_ = (anIntArray9933[i_137_])
                                    if (i_171_ != 0) {
                                        val i_172_ = (((i_171_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                        val i_173_ = (((i_171_ and 0xff00) * anInt8477) and 0xff0000)
                                        is_139_!![i_138_++] = (((i_172_ or i_173_) ushr 8) + anInt8474)
                                    }
                                } else throw IllegalArgumentException()
                            } else if (i_141_ == 2) {
                                if (i_140_ == 1) {
                                    val i_174_ = (anIntArray9933[i_137_])
                                    if (i_174_ != 0) {
                                        var i_175_ = is_139_!![i_138_]
                                        val i_176_ = i_174_ + i_175_
                                        val i_177_ = ((i_174_ and 0xff00ff) + (i_175_ and 0xff00ff))
                                        i_175_ = ((i_177_ and 0x1000100) + (i_176_ - i_177_ and 0x10000))
                                        is_139_[i_138_] = (i_176_ - i_175_ or i_175_ - (i_175_ ushr 8))
                                    }
                                } else if (i_140_ == 0) {
                                    var i_178_ = (anIntArray9933[i_137_])
                                    if (i_178_ != 0) {
                                        val i_179_ = (((i_178_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_180_ = (((i_178_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_181_ = (((i_178_ and 0xff) * anInt8465) and 0xff00)
                                        i_178_ = (i_179_ or i_180_ or i_181_) ushr 8
                                        var i_182_ = is_139_!![i_138_]
                                        val i_183_ = i_178_ + i_182_
                                        val i_184_ = ((i_178_ and 0xff00ff) + (i_182_ and 0xff00ff))
                                        i_182_ = ((i_184_ and 0x1000100) + (i_183_ - i_184_ and 0x10000))
                                        is_139_[i_138_] = (i_183_ - i_182_ or i_182_ - (i_182_ ushr 8))
                                    }
                                } else if (i_140_ == 3) {
                                    var i_185_ = (anIntArray9933[i_137_])
                                    val i_186_ = anInt8480
                                    var i_187_ = i_185_ + i_186_
                                    var i_188_ = ((i_185_ and 0xff00ff) + (i_186_ and 0xff00ff))
                                    var i_189_ = ((i_188_ and 0x1000100) + (i_187_ - i_188_ and 0x10000))
                                    i_185_ = i_187_ - i_189_ or i_189_ - (i_189_ ushr 8)
                                    i_189_ = is_139_!![i_138_]
                                    i_187_ = i_185_ + i_189_
                                    i_188_ = (i_185_ and 0xff00ff) + (i_189_ and 0xff00ff)
                                    i_189_ = ((i_188_ and 0x1000100) + (i_187_ - i_188_ and 0x10000))
                                    is_139_[i_138_] = i_187_ - i_189_ or i_189_ - (i_189_ ushr 8)
                                } else if (i_140_ == 2) {
                                    var i_190_ = (anIntArray9933[i_137_])
                                    if (i_190_ != 0) {
                                        val i_191_ = (((i_190_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                        val i_192_ = (((i_190_ and 0xff00) * anInt8477) and 0xff0000)
                                        i_190_ = (((i_191_ or i_192_) ushr 8) + anInt8474)
                                        var i_193_ = is_139_!![i_138_]
                                        val i_194_ = i_190_ + i_193_
                                        val i_195_ = ((i_190_ and 0xff00ff) + (i_193_ and 0xff00ff))
                                        i_193_ = ((i_195_ and 0x1000100) + (i_194_ - i_195_ and 0x10000))
                                        is_139_[i_138_] = (i_194_ - i_193_ or i_193_ - (i_193_ ushr 8))
                                    }
                                }
                            } else throw IllegalArgumentException()
                            i_133_ += anInt8450
                            i_134_++
                        }
                    }
                    i_130_++
                    anInt8458 += anInt8457
                    anInt8451 += anInt8453
                }
            }
        } else if (anInt8481 < 0) {
            if (anInt8450 == 0) {
                var i_196_ = anInt8468
                while (i_196_ < 0) {
                    var i_197_ = anInt8451
                    var i_198_ = anInt8458 + anInt8479
                    val i_199_ = anInt8467
                    var i_200_ = anInt8478
                    if (i_199_ >= 0 && (i_199_ - (this.anInt8470 shl 12) < 0)) {
                        var i_201_: Int
                        if (((i_198_ - (this.anInt8471 shl 12)).also { i_201_ = it }) >= 0) {
                            i_201_ = ((anInt8481 - i_201_) / anInt8481)
                            i_200_ += i_201_
                            i_198_ += anInt8481 * i_201_
                            i_197_ += i_201_
                        }
                        if ((((i_198_ - anInt8481) / anInt8481).also { i_201_ = it }) > i_200_) i_200_ = i_201_
                        while ( /**/i_200_ < 0) {
                            var i_202_ = (((i_199_ shr 12) * this.anInt8471) + (i_198_ shr 12))
                            var i_203_ = i_197_++
                            val is_204_ = `is`
                            val i_205_ = i
                            val i_206_ = i_0_
                            if (i_206_ == 0) {
                                if (i_205_ == 1) is_204_!![i_203_] = (anIntArray9933[i_202_])
                                else if (i_205_ == 0) {
                                    val i_207_ = (anIntArray9933[i_202_++])
                                    val i_208_ = (((i_207_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_209_ = (((i_207_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_210_ = (((i_207_ and 0xff) * anInt8465) and 0xff00)
                                    is_204_!![i_203_] = (i_208_ or i_209_ or i_210_) ushr 8
                                } else if (i_205_ == 3) {
                                    val i_211_ = (anIntArray9933[i_202_++])
                                    val i_212_ = anInt8480
                                    val i_213_ = i_211_ + i_212_
                                    val i_214_ = ((i_211_ and 0xff00ff) + (i_212_ and 0xff00ff))
                                    val i_215_ = ((i_214_ and 0x1000100) + (i_213_ - i_214_ and 0x10000))
                                    is_204_!![i_203_] = i_213_ - i_215_ or i_215_ - (i_215_ ushr 8)
                                } else if (i_205_ == 2) {
                                    val i_216_ = (anIntArray9933[i_202_])
                                    val i_217_ = (((i_216_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_218_ = (((i_216_ and 0xff00) * anInt8477) and 0xff0000)
                                    is_204_!![i_203_] = (((i_217_ or i_218_) ushr 8) + anInt8474)
                                } else throw IllegalArgumentException()
                            } else if (i_206_ == 1) {
                                if (i_205_ == 1) {
                                    val i_219_ = (anIntArray9933[i_202_])
                                    if (i_219_ != 0) is_204_!![i_203_] = i_219_
                                } else if (i_205_ == 0) {
                                    var i_220_ = (anIntArray9933[i_202_])
                                    if (i_220_ != 0) {
                                        if ((anInt8480 and 0xffffff) == 16777215) {
                                            val i_221_ = (anInt8480 ushr 24)
                                            val i_222_ = 256 - i_221_
                                            val i_223_ = is_204_!![i_203_]
                                            is_204_[i_203_] = (((((i_220_ and 0xff00ff) * i_221_) + ((i_223_ and 0xff00ff) * i_222_)) and 0xff00ff.inv()) + ((((i_220_ and 0xff00) * i_221_) + ((i_223_ and 0xff00) * i_222_)) and 0xff0000)) shr 8
                                        } else if (anInt8477 == 255) {
                                            val i_228_ = (((i_220_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                            val i_229_ = (((i_220_ and 0xff00) * anInt8463) and 0xff0000)
                                            val i_230_ = (((i_220_ and 0xff) * anInt8465) and 0xff00)
                                            is_204_!![i_203_] = (i_228_ or i_229_ or i_230_) ushr 8
                                        } else {
                                            val i_224_ = (((i_220_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                            val i_225_ = (((i_220_ and 0xff00) * anInt8463) and 0xff0000)
                                            val i_226_ = (((i_220_ and 0xff) * anInt8465) and 0xff00)
                                            i_220_ = (i_224_ or i_225_ or i_226_) ushr 8
                                            val i_227_ = is_204_!![i_203_]
                                            is_204_[i_203_] = (((((i_220_ and 0xff00ff) * (anInt8477)) + ((i_227_ and 0xff00ff) * (anInt8472))) and 0xff00ff.inv()) + ((((i_220_ and 0xff00) * (anInt8477)) + ((i_227_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                        }
                                    }
                                } else if (i_205_ == 3) {
                                    var i_231_ = (anIntArray9933[i_202_])
                                    val i_232_ = anInt8480
                                    val i_233_ = i_231_ + i_232_
                                    val i_234_ = ((i_231_ and 0xff00ff) + (i_232_ and 0xff00ff))
                                    var i_235_ = ((i_234_ and 0x1000100) + (i_233_ - i_234_ and 0x10000))
                                    i_235_ = i_233_ - i_235_ or i_235_ - (i_235_ ushr 8)
                                    if (i_231_ == 0 && anInt8477 != 255) {
                                        i_231_ = i_235_
                                        i_235_ = is_204_!![i_203_]
                                        i_235_ = (((((i_231_ and 0xff00ff) * anInt8477) + ((i_235_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_231_ and 0xff00) * anInt8477) + ((i_235_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                    }
                                    is_204_!![i_203_] = i_235_
                                } else if (i_205_ == 2) {
                                    val i_236_ = (anIntArray9933[i_202_])
                                    if (i_236_ != 0) {
                                        val i_237_ = (((i_236_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                        val i_238_ = (((i_236_ and 0xff00) * anInt8477) and 0xff0000)
                                        is_204_!![i_203_++] = (((i_237_ or i_238_) ushr 8) + anInt8474)
                                    }
                                } else throw IllegalArgumentException()
                            } else if (i_206_ == 2) {
                                if (i_205_ == 1) {
                                    val i_239_ = (anIntArray9933[i_202_])
                                    if (i_239_ != 0) {
                                        var i_240_ = is_204_!![i_203_]
                                        val i_241_ = i_239_ + i_240_
                                        val i_242_ = ((i_239_ and 0xff00ff) + (i_240_ and 0xff00ff))
                                        i_240_ = ((i_242_ and 0x1000100) + (i_241_ - i_242_ and 0x10000))
                                        is_204_[i_203_] = (i_241_ - i_240_ or i_240_ - (i_240_ ushr 8))
                                    }
                                } else if (i_205_ == 0) {
                                    var i_243_ = (anIntArray9933[i_202_])
                                    if (i_243_ != 0) {
                                        val i_244_ = (((i_243_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_245_ = (((i_243_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_246_ = (((i_243_ and 0xff) * anInt8465) and 0xff00)
                                        i_243_ = (i_244_ or i_245_ or i_246_) ushr 8
                                        var i_247_ = is_204_!![i_203_]
                                        val i_248_ = i_243_ + i_247_
                                        val i_249_ = ((i_243_ and 0xff00ff) + (i_247_ and 0xff00ff))
                                        i_247_ = ((i_249_ and 0x1000100) + (i_248_ - i_249_ and 0x10000))
                                        is_204_[i_203_] = (i_248_ - i_247_ or i_247_ - (i_247_ ushr 8))
                                    }
                                } else if (i_205_ == 3) {
                                    var i_250_ = (anIntArray9933[i_202_])
                                    val i_251_ = anInt8480
                                    var i_252_ = i_250_ + i_251_
                                    var i_253_ = ((i_250_ and 0xff00ff) + (i_251_ and 0xff00ff))
                                    var i_254_ = ((i_253_ and 0x1000100) + (i_252_ - i_253_ and 0x10000))
                                    i_250_ = i_252_ - i_254_ or i_254_ - (i_254_ ushr 8)
                                    i_254_ = is_204_!![i_203_]
                                    i_252_ = i_250_ + i_254_
                                    i_253_ = (i_250_ and 0xff00ff) + (i_254_ and 0xff00ff)
                                    i_254_ = ((i_253_ and 0x1000100) + (i_252_ - i_253_ and 0x10000))
                                    is_204_[i_203_] = i_252_ - i_254_ or i_254_ - (i_254_ ushr 8)
                                } else if (i_205_ == 2) {
                                    var i_255_ = (anIntArray9933[i_202_])
                                    if (i_255_ != 0) {
                                        val i_256_ = (((i_255_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                        val i_257_ = (((i_255_ and 0xff00) * anInt8477) and 0xff0000)
                                        i_255_ = (((i_256_ or i_257_) ushr 8) + anInt8474)
                                        var i_258_ = is_204_!![i_203_]
                                        val i_259_ = i_255_ + i_258_
                                        val i_260_ = ((i_255_ and 0xff00ff) + (i_258_ and 0xff00ff))
                                        i_258_ = ((i_260_ and 0x1000100) + (i_259_ - i_260_ and 0x10000))
                                        is_204_[i_203_] = (i_259_ - i_258_ or i_258_ - (i_258_ ushr 8))
                                    }
                                }
                            } else throw IllegalArgumentException()
                            i_198_ += anInt8481
                            i_200_++
                        }
                    }
                    i_196_++
                    anInt8467 += anInt8452
                    anInt8451 += anInt8453
                }
            } else if (anInt8450 < 0) {
                var i_261_ = anInt8468
                while (i_261_ < 0) {
                    var i_262_ = anInt8451
                    var i_263_ = anInt8458 + anInt8479
                    var i_264_ = anInt8467 + anInt8475
                    var i_265_ = anInt8478
                    var i_266_: Int
                    if (((i_263_ - (this.anInt8471 shl 12)).also { i_266_ = it }) >= 0) {
                        i_266_ = ((anInt8481 - i_266_) / anInt8481)
                        i_265_ += i_266_
                        i_263_ += anInt8481 * i_266_
                        i_264_ += anInt8450 * i_266_
                        i_262_ += i_266_
                    }
                    if ((((i_263_ - anInt8481) / anInt8481).also { i_266_ = it }) > i_265_) i_265_ = i_266_
                    if (((i_264_ - (this.anInt8470 shl 12)).also { i_266_ = it }) >= 0) {
                        i_266_ = ((anInt8450 - i_266_) / anInt8450)
                        i_265_ += i_266_
                        i_263_ += anInt8481 * i_266_
                        i_264_ += anInt8450 * i_266_
                        i_262_ += i_266_
                    }
                    if ((((i_264_ - anInt8450) / anInt8450).also { i_266_ = it }) > i_265_) i_265_ = i_266_
                    while ( /**/i_265_ < 0) {
                        var i_267_ = (((i_264_ shr 12) * this.anInt8471) + (i_263_ shr 12))
                        var i_268_ = i_262_++
                        val is_269_ = `is`
                        val i_270_ = i
                        val i_271_ = i_0_
                        if (i_271_ == 0) {
                            if (i_270_ == 1) is_269_!![i_268_] = (anIntArray9933[i_267_])
                            else if (i_270_ == 0) {
                                val i_272_ = (anIntArray9933[i_267_++])
                                val i_273_ = (((i_272_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_274_ = (((i_272_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_275_ = (((i_272_ and 0xff) * anInt8465) and 0xff00)
                                is_269_!![i_268_] = (i_273_ or i_274_ or i_275_) ushr 8
                            } else if (i_270_ == 3) {
                                val i_276_ = (anIntArray9933[i_267_++])
                                val i_277_ = anInt8480
                                val i_278_ = i_276_ + i_277_
                                val i_279_ = ((i_276_ and 0xff00ff) + (i_277_ and 0xff00ff))
                                val i_280_ = ((i_279_ and 0x1000100) + (i_278_ - i_279_ and 0x10000))
                                is_269_!![i_268_] = i_278_ - i_280_ or i_280_ - (i_280_ ushr 8)
                            } else if (i_270_ == 2) {
                                val i_281_ = (anIntArray9933[i_267_])
                                val i_282_ = (((i_281_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_283_ = (((i_281_ and 0xff00) * anInt8477) and 0xff0000)
                                is_269_!![i_268_] = (((i_282_ or i_283_) ushr 8) + anInt8474)
                            } else throw IllegalArgumentException()
                        } else if (i_271_ == 1) {
                            if (i_270_ == 1) {
                                val i_284_ = (anIntArray9933[i_267_])
                                if (i_284_ != 0) is_269_!![i_268_] = i_284_
                            } else if (i_270_ == 0) {
                                var i_285_ = (anIntArray9933[i_267_])
                                if (i_285_ != 0) {
                                    if ((anInt8480 and 0xffffff) == 16777215) {
                                        val i_286_ = anInt8480 ushr 24
                                        val i_287_ = 256 - i_286_
                                        val i_288_ = is_269_!![i_268_]
                                        is_269_[i_268_] = ((((i_285_ and 0xff00ff) * i_286_ + ((i_288_ and 0xff00ff) * i_287_)) and 0xff00ff.inv()) + (((i_285_ and 0xff00) * i_286_ + ((i_288_ and 0xff00) * i_287_)) and 0xff0000)) shr 8
                                    } else if (anInt8477 == 255) {
                                        val i_293_ = (((i_285_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_294_ = (((i_285_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_295_ = (((i_285_ and 0xff) * anInt8465) and 0xff00)
                                        is_269_!![i_268_] = (i_293_ or i_294_ or i_295_) ushr 8
                                    } else {
                                        val i_289_ = (((i_285_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_290_ = (((i_285_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_291_ = (((i_285_ and 0xff) * anInt8465) and 0xff00)
                                        i_285_ = (i_289_ or i_290_ or i_291_) ushr 8
                                        val i_292_ = is_269_!![i_268_]
                                        is_269_[i_268_] = (((((i_285_ and 0xff00ff) * anInt8477) + ((i_292_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_285_ and 0xff00) * anInt8477) + ((i_292_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                    }
                                }
                            } else if (i_270_ == 3) {
                                var i_296_ = (anIntArray9933[i_267_])
                                val i_297_ = anInt8480
                                val i_298_ = i_296_ + i_297_
                                val i_299_ = ((i_296_ and 0xff00ff) + (i_297_ and 0xff00ff))
                                var i_300_ = ((i_299_ and 0x1000100) + (i_298_ - i_299_ and 0x10000))
                                i_300_ = i_298_ - i_300_ or i_300_ - (i_300_ ushr 8)
                                if (i_296_ == 0 && anInt8477 != 255) {
                                    i_296_ = i_300_
                                    i_300_ = is_269_!![i_268_]
                                    i_300_ = (((((i_296_ and 0xff00ff) * anInt8477) + ((i_300_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_296_ and 0xff00) * anInt8477) + ((i_300_ and 0xff00) * anInt8472)) and 0xff0000)) shr 8
                                }
                                is_269_!![i_268_] = i_300_
                            } else if (i_270_ == 2) {
                                val i_301_ = (anIntArray9933[i_267_])
                                if (i_301_ != 0) {
                                    val i_302_ = (((i_301_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_303_ = (((i_301_ and 0xff00) * anInt8477) and 0xff0000)
                                    is_269_!![i_268_++] = (((i_302_ or i_303_) ushr 8) + anInt8474)
                                }
                            } else throw IllegalArgumentException()
                        } else if (i_271_ == 2) {
                            if (i_270_ == 1) {
                                val i_304_ = (anIntArray9933[i_267_])
                                if (i_304_ != 0) {
                                    var i_305_ = is_269_!![i_268_]
                                    val i_306_ = i_304_ + i_305_
                                    val i_307_ = ((i_304_ and 0xff00ff) + (i_305_ and 0xff00ff))
                                    i_305_ = ((i_307_ and 0x1000100) + (i_306_ - i_307_ and 0x10000))
                                    is_269_[i_268_] = i_306_ - i_305_ or i_305_ - (i_305_ ushr 8)
                                }
                            } else if (i_270_ == 0) {
                                var i_308_ = (anIntArray9933[i_267_])
                                if (i_308_ != 0) {
                                    val i_309_ = (((i_308_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_310_ = (((i_308_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_311_ = (((i_308_ and 0xff) * anInt8465) and 0xff00)
                                    i_308_ = (i_309_ or i_310_ or i_311_) ushr 8
                                    var i_312_ = is_269_!![i_268_]
                                    val i_313_ = i_308_ + i_312_
                                    val i_314_ = ((i_308_ and 0xff00ff) + (i_312_ and 0xff00ff))
                                    i_312_ = ((i_314_ and 0x1000100) + (i_313_ - i_314_ and 0x10000))
                                    is_269_[i_268_] = i_313_ - i_312_ or i_312_ - (i_312_ ushr 8)
                                }
                            } else if (i_270_ == 3) {
                                var i_315_ = (anIntArray9933[i_267_])
                                val i_316_ = anInt8480
                                var i_317_ = i_315_ + i_316_
                                var i_318_ = ((i_315_ and 0xff00ff) + (i_316_ and 0xff00ff))
                                var i_319_ = ((i_318_ and 0x1000100) + (i_317_ - i_318_ and 0x10000))
                                i_315_ = i_317_ - i_319_ or i_319_ - (i_319_ ushr 8)
                                i_319_ = is_269_!![i_268_]
                                i_317_ = i_315_ + i_319_
                                i_318_ = (i_315_ and 0xff00ff) + (i_319_ and 0xff00ff)
                                i_319_ = (i_318_ and 0x1000100) + (i_317_ - i_318_ and 0x10000)
                                is_269_[i_268_] = i_317_ - i_319_ or i_319_ - (i_319_ ushr 8)
                            } else if (i_270_ == 2) {
                                var i_320_ = (anIntArray9933[i_267_])
                                if (i_320_ != 0) {
                                    val i_321_ = (((i_320_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_322_ = (((i_320_ and 0xff00) * anInt8477) and 0xff0000)
                                    i_320_ = (((i_321_ or i_322_) ushr 8) + anInt8474)
                                    var i_323_ = is_269_!![i_268_]
                                    val i_324_ = i_320_ + i_323_
                                    val i_325_ = ((i_320_ and 0xff00ff) + (i_323_ and 0xff00ff))
                                    i_323_ = ((i_325_ and 0x1000100) + (i_324_ - i_325_ and 0x10000))
                                    is_269_[i_268_] = i_324_ - i_323_ or i_323_ - (i_323_ ushr 8)
                                }
                            }
                        } else throw IllegalArgumentException()
                        i_263_ += anInt8481
                        i_264_ += anInt8450
                        i_265_++
                    }
                    i_261_++
                    anInt8458 += anInt8457
                    anInt8467 += anInt8452
                    anInt8451 += anInt8453
                }
            } else {
                var i_326_ = anInt8468
                while (i_326_ < 0) {
                    var i_327_ = anInt8451
                    var i_328_ = anInt8458 + anInt8479
                    var i_329_ = anInt8467 + anInt8475
                    var i_330_ = anInt8478
                    var i_331_: Int
                    if (((i_328_ - (this.anInt8471 shl 12)).also { i_331_ = it }) >= 0) {
                        i_331_ = ((anInt8481 - i_331_) / anInt8481)
                        i_330_ += i_331_
                        i_328_ += anInt8481 * i_331_
                        i_329_ += anInt8450 * i_331_
                        i_327_ += i_331_
                    }
                    if ((((i_328_ - anInt8481) / anInt8481).also { i_331_ = it }) > i_330_) i_330_ = i_331_
                    if (i_329_ < 0) {
                        i_331_ = ((anInt8450 - 1 - i_329_) / anInt8450)
                        i_330_ += i_331_
                        i_328_ += anInt8481 * i_331_
                        i_329_ += anInt8450 * i_331_
                        i_327_ += i_331_
                    }
                    if ((((1 + i_329_ - (this.anInt8470 shl 12) - anInt8450) / anInt8450).also { i_331_ = it }) > i_330_) i_330_ = i_331_
                    while ( /**/i_330_ < 0) {
                        var i_332_ = (((i_329_ shr 12) * this.anInt8471) + (i_328_ shr 12))
                        var i_333_ = i_327_++
                        val is_334_ = `is`
                        val i_335_ = i
                        val i_336_ = i_0_
                        if (i_336_ == 0) {
                            if (i_335_ == 1) is_334_!![i_333_] = (anIntArray9933[i_332_])
                            else if (i_335_ == 0) {
                                val i_337_ = (anIntArray9933[i_332_++])
                                val i_338_ = (((i_337_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_339_ = (((i_337_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_340_ = (((i_337_ and 0xff) * anInt8465) and 0xff00)
                                is_334_!![i_333_] = (i_338_ or i_339_ or i_340_) ushr 8
                            } else if (i_335_ == 3) {
                                val i_341_ = (anIntArray9933[i_332_++])
                                val i_342_ = anInt8480
                                val i_343_ = i_341_ + i_342_
                                val i_344_ = ((i_341_ and 0xff00ff) + (i_342_ and 0xff00ff))
                                val i_345_ = ((i_344_ and 0x1000100) + (i_343_ - i_344_ and 0x10000))
                                is_334_!![i_333_] = i_343_ - i_345_ or i_345_ - (i_345_ ushr 8)
                            } else if (i_335_ == 2) {
                                val i_346_ = (anIntArray9933[i_332_])
                                val i_347_ = (((i_346_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_348_ = (((i_346_ and 0xff00) * anInt8477) and 0xff0000)
                                is_334_!![i_333_] = (((i_347_ or i_348_) ushr 8) + anInt8474)
                            } else throw IllegalArgumentException()
                        } else if (i_336_ == 1) {
                            if (i_335_ == 1) {
                                val i_349_ = (anIntArray9933[i_332_])
                                if (i_349_ != 0) is_334_!![i_333_] = i_349_
                            } else if (i_335_ == 0) {
                                var i_350_ = (anIntArray9933[i_332_])
                                if (i_350_ != 0) {
                                    if ((anInt8480 and 0xffffff) == 16777215) {
                                        val i_351_ = anInt8480 ushr 24
                                        val i_352_ = 256 - i_351_
                                        val i_353_ = is_334_!![i_333_]
                                        is_334_[i_333_] = ((((i_350_ and 0xff00ff) * i_351_ + ((i_353_ and 0xff00ff) * i_352_)) and 0xff00ff.inv()) + (((i_350_ and 0xff00) * i_351_ + ((i_353_ and 0xff00) * i_352_)) and 0xff0000)) shr 8
                                    } else if (anInt8477 == 255) {
                                        val i_358_ = (((i_350_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_359_ = (((i_350_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_360_ = (((i_350_ and 0xff) * anInt8465) and 0xff00)
                                        is_334_!![i_333_] = (i_358_ or i_359_ or i_360_) ushr 8
                                    } else {
                                        val i_354_ = (((i_350_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_355_ = (((i_350_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_356_ = (((i_350_ and 0xff) * anInt8465) and 0xff00)
                                        i_350_ = (i_354_ or i_355_ or i_356_) ushr 8
                                        val i_357_ = is_334_!![i_333_]
                                        is_334_[i_333_] = (((((i_350_ and 0xff00ff) * anInt8477) + ((i_357_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_350_ and 0xff00) * anInt8477) + ((i_357_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                    }
                                }
                            } else if (i_335_ == 3) {
                                var i_361_ = (anIntArray9933[i_332_])
                                val i_362_ = anInt8480
                                val i_363_ = i_361_ + i_362_
                                val i_364_ = ((i_361_ and 0xff00ff) + (i_362_ and 0xff00ff))
                                var i_365_ = ((i_364_ and 0x1000100) + (i_363_ - i_364_ and 0x10000))
                                i_365_ = i_363_ - i_365_ or i_365_ - (i_365_ ushr 8)
                                if (i_361_ == 0 && anInt8477 != 255) {
                                    i_361_ = i_365_
                                    i_365_ = is_334_!![i_333_]
                                    i_365_ = (((((i_361_ and 0xff00ff) * anInt8477) + ((i_365_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_361_ and 0xff00) * anInt8477) + ((i_365_ and 0xff00) * anInt8472)) and 0xff0000)) shr 8
                                }
                                is_334_!![i_333_] = i_365_
                            } else if (i_335_ == 2) {
                                val i_366_ = (anIntArray9933[i_332_])
                                if (i_366_ != 0) {
                                    val i_367_ = (((i_366_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_368_ = (((i_366_ and 0xff00) * anInt8477) and 0xff0000)
                                    is_334_!![i_333_++] = (((i_367_ or i_368_) ushr 8) + anInt8474)
                                }
                            } else throw IllegalArgumentException()
                        } else if (i_336_ == 2) {
                            if (i_335_ == 1) {
                                val i_369_ = (anIntArray9933[i_332_])
                                if (i_369_ != 0) {
                                    var i_370_ = is_334_!![i_333_]
                                    val i_371_ = i_369_ + i_370_
                                    val i_372_ = ((i_369_ and 0xff00ff) + (i_370_ and 0xff00ff))
                                    i_370_ = ((i_372_ and 0x1000100) + (i_371_ - i_372_ and 0x10000))
                                    is_334_[i_333_] = i_371_ - i_370_ or i_370_ - (i_370_ ushr 8)
                                }
                            } else if (i_335_ == 0) {
                                var i_373_ = (anIntArray9933[i_332_])
                                if (i_373_ != 0) {
                                    val i_374_ = (((i_373_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_375_ = (((i_373_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_376_ = (((i_373_ and 0xff) * anInt8465) and 0xff00)
                                    i_373_ = (i_374_ or i_375_ or i_376_) ushr 8
                                    var i_377_ = is_334_!![i_333_]
                                    val i_378_ = i_373_ + i_377_
                                    val i_379_ = ((i_373_ and 0xff00ff) + (i_377_ and 0xff00ff))
                                    i_377_ = ((i_379_ and 0x1000100) + (i_378_ - i_379_ and 0x10000))
                                    is_334_[i_333_] = i_378_ - i_377_ or i_377_ - (i_377_ ushr 8)
                                }
                            } else if (i_335_ == 3) {
                                var i_380_ = (anIntArray9933[i_332_])
                                val i_381_ = anInt8480
                                var i_382_ = i_380_ + i_381_
                                var i_383_ = ((i_380_ and 0xff00ff) + (i_381_ and 0xff00ff))
                                var i_384_ = ((i_383_ and 0x1000100) + (i_382_ - i_383_ and 0x10000))
                                i_380_ = i_382_ - i_384_ or i_384_ - (i_384_ ushr 8)
                                i_384_ = is_334_!![i_333_]
                                i_382_ = i_380_ + i_384_
                                i_383_ = (i_380_ and 0xff00ff) + (i_384_ and 0xff00ff)
                                i_384_ = (i_383_ and 0x1000100) + (i_382_ - i_383_ and 0x10000)
                                is_334_[i_333_] = i_382_ - i_384_ or i_384_ - (i_384_ ushr 8)
                            } else if (i_335_ == 2) {
                                var i_385_ = (anIntArray9933[i_332_])
                                if (i_385_ != 0) {
                                    val i_386_ = (((i_385_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_387_ = (((i_385_ and 0xff00) * anInt8477) and 0xff0000)
                                    i_385_ = (((i_386_ or i_387_) ushr 8) + anInt8474)
                                    var i_388_ = is_334_!![i_333_]
                                    val i_389_ = i_385_ + i_388_
                                    val i_390_ = ((i_385_ and 0xff00ff) + (i_388_ and 0xff00ff))
                                    i_388_ = ((i_390_ and 0x1000100) + (i_389_ - i_390_ and 0x10000))
                                    is_334_[i_333_] = i_389_ - i_388_ or i_388_ - (i_388_ ushr 8)
                                }
                            }
                        } else throw IllegalArgumentException()
                        i_328_ += anInt8481
                        i_329_ += anInt8450
                        i_330_++
                    }
                    i_326_++
                    anInt8458 += anInt8457
                    anInt8467 += anInt8452
                    anInt8451 += anInt8453
                }
            }
        } else if (anInt8450 == 0) {
            var i_391_ = anInt8468
            while (i_391_ < 0) {
                var i_392_ = anInt8451
                var i_393_ = anInt8458 + anInt8479
                val i_394_ = anInt8467
                var i_395_ = anInt8478
                if (i_394_ >= 0 && i_394_ - (this.anInt8470 shl 12) < 0) {
                    if (i_393_ < 0) {
                        val i_396_ = ((anInt8481 - 1 - i_393_) / anInt8481)
                        i_395_ += i_396_
                        i_393_ += anInt8481 * i_396_
                        i_392_ += i_396_
                    }
                    val i_397_: Int
                    if ((((1 + i_393_ - (this.anInt8471 shl 12) - anInt8481) / anInt8481).also { i_397_ = it }) > i_395_) i_395_ = i_397_
                    while ( /**/i_395_ < 0) {
                        var i_398_ = (((i_394_ shr 12) * this.anInt8471) + (i_393_ shr 12))
                        var i_399_ = i_392_++
                        val is_400_ = `is`
                        val i_401_ = i
                        val i_402_ = i_0_
                        if (i_402_ == 0) {
                            if (i_401_ == 1) is_400_!![i_399_] = (anIntArray9933[i_398_])
                            else if (i_401_ == 0) {
                                val i_403_ = (anIntArray9933[i_398_++])
                                val i_404_ = (((i_403_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_405_ = (((i_403_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_406_ = (((i_403_ and 0xff) * anInt8465) and 0xff00)
                                is_400_!![i_399_] = (i_404_ or i_405_ or i_406_) ushr 8
                            } else if (i_401_ == 3) {
                                val i_407_ = (anIntArray9933[i_398_++])
                                val i_408_ = anInt8480
                                val i_409_ = i_407_ + i_408_
                                val i_410_ = ((i_407_ and 0xff00ff) + (i_408_ and 0xff00ff))
                                val i_411_ = ((i_410_ and 0x1000100) + (i_409_ - i_410_ and 0x10000))
                                is_400_!![i_399_] = i_409_ - i_411_ or i_411_ - (i_411_ ushr 8)
                            } else if (i_401_ == 2) {
                                val i_412_ = (anIntArray9933[i_398_])
                                val i_413_ = (((i_412_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_414_ = (((i_412_ and 0xff00) * anInt8477) and 0xff0000)
                                is_400_!![i_399_] = (((i_413_ or i_414_) ushr 8) + anInt8474)
                            } else throw IllegalArgumentException()
                        } else if (i_402_ == 1) {
                            if (i_401_ == 1) {
                                val i_415_ = (anIntArray9933[i_398_])
                                if (i_415_ != 0) is_400_!![i_399_] = i_415_
                            } else if (i_401_ == 0) {
                                var i_416_ = (anIntArray9933[i_398_])
                                if (i_416_ != 0) {
                                    if ((anInt8480 and 0xffffff) == 16777215) {
                                        val i_417_ = anInt8480 ushr 24
                                        val i_418_ = 256 - i_417_
                                        val i_419_ = is_400_!![i_399_]
                                        is_400_[i_399_] = ((((i_416_ and 0xff00ff) * i_417_ + ((i_419_ and 0xff00ff) * i_418_)) and 0xff00ff.inv()) + (((i_416_ and 0xff00) * i_417_ + ((i_419_ and 0xff00) * i_418_)) and 0xff0000)) shr 8
                                    } else if (anInt8477 == 255) {
                                        val i_424_ = (((i_416_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_425_ = (((i_416_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_426_ = (((i_416_ and 0xff) * anInt8465) and 0xff00)
                                        is_400_!![i_399_] = (i_424_ or i_425_ or i_426_) ushr 8
                                    } else {
                                        val i_420_ = (((i_416_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_421_ = (((i_416_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_422_ = (((i_416_ and 0xff) * anInt8465) and 0xff00)
                                        i_416_ = (i_420_ or i_421_ or i_422_) ushr 8
                                        val i_423_ = is_400_!![i_399_]
                                        is_400_[i_399_] = (((((i_416_ and 0xff00ff) * anInt8477) + ((i_423_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_416_ and 0xff00) * anInt8477) + ((i_423_ and 0xff00) * (anInt8472))) and 0xff0000)) shr 8
                                    }
                                }
                            } else if (i_401_ == 3) {
                                var i_427_ = (anIntArray9933[i_398_])
                                val i_428_ = anInt8480
                                val i_429_ = i_427_ + i_428_
                                val i_430_ = ((i_427_ and 0xff00ff) + (i_428_ and 0xff00ff))
                                var i_431_ = ((i_430_ and 0x1000100) + (i_429_ - i_430_ and 0x10000))
                                i_431_ = i_429_ - i_431_ or i_431_ - (i_431_ ushr 8)
                                if (i_427_ == 0 && anInt8477 != 255) {
                                    i_427_ = i_431_
                                    i_431_ = is_400_!![i_399_]
                                    i_431_ = (((((i_427_ and 0xff00ff) * anInt8477) + ((i_431_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_427_ and 0xff00) * anInt8477) + ((i_431_ and 0xff00) * anInt8472)) and 0xff0000)) shr 8
                                }
                                is_400_!![i_399_] = i_431_
                            } else if (i_401_ == 2) {
                                val i_432_ = (anIntArray9933[i_398_])
                                if (i_432_ != 0) {
                                    val i_433_ = (((i_432_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_434_ = (((i_432_ and 0xff00) * anInt8477) and 0xff0000)
                                    is_400_!![i_399_++] = (((i_433_ or i_434_) ushr 8) + anInt8474)
                                }
                            } else throw IllegalArgumentException()
                        } else if (i_402_ == 2) {
                            if (i_401_ == 1) {
                                val i_435_ = (anIntArray9933[i_398_])
                                if (i_435_ != 0) {
                                    var i_436_ = is_400_!![i_399_]
                                    val i_437_ = i_435_ + i_436_
                                    val i_438_ = ((i_435_ and 0xff00ff) + (i_436_ and 0xff00ff))
                                    i_436_ = ((i_438_ and 0x1000100) + (i_437_ - i_438_ and 0x10000))
                                    is_400_[i_399_] = i_437_ - i_436_ or i_436_ - (i_436_ ushr 8)
                                }
                            } else if (i_401_ == 0) {
                                var i_439_ = (anIntArray9933[i_398_])
                                if (i_439_ != 0) {
                                    val i_440_ = (((i_439_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_441_ = (((i_439_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_442_ = (((i_439_ and 0xff) * anInt8465) and 0xff00)
                                    i_439_ = (i_440_ or i_441_ or i_442_) ushr 8
                                    var i_443_ = is_400_!![i_399_]
                                    val i_444_ = i_439_ + i_443_
                                    val i_445_ = ((i_439_ and 0xff00ff) + (i_443_ and 0xff00ff))
                                    i_443_ = ((i_445_ and 0x1000100) + (i_444_ - i_445_ and 0x10000))
                                    is_400_[i_399_] = i_444_ - i_443_ or i_443_ - (i_443_ ushr 8)
                                }
                            } else if (i_401_ == 3) {
                                var i_446_ = (anIntArray9933[i_398_])
                                val i_447_ = anInt8480
                                var i_448_ = i_446_ + i_447_
                                var i_449_ = ((i_446_ and 0xff00ff) + (i_447_ and 0xff00ff))
                                var i_450_ = ((i_449_ and 0x1000100) + (i_448_ - i_449_ and 0x10000))
                                i_446_ = i_448_ - i_450_ or i_450_ - (i_450_ ushr 8)
                                i_450_ = is_400_!![i_399_]
                                i_448_ = i_446_ + i_450_
                                i_449_ = (i_446_ and 0xff00ff) + (i_450_ and 0xff00ff)
                                i_450_ = (i_449_ and 0x1000100) + (i_448_ - i_449_ and 0x10000)
                                is_400_[i_399_] = i_448_ - i_450_ or i_450_ - (i_450_ ushr 8)
                            } else if (i_401_ == 2) {
                                var i_451_ = (anIntArray9933[i_398_])
                                if (i_451_ != 0) {
                                    val i_452_ = (((i_451_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_453_ = (((i_451_ and 0xff00) * anInt8477) and 0xff0000)
                                    i_451_ = (((i_452_ or i_453_) ushr 8) + anInt8474)
                                    var i_454_ = is_400_!![i_399_]
                                    val i_455_ = i_451_ + i_454_
                                    val i_456_ = ((i_451_ and 0xff00ff) + (i_454_ and 0xff00ff))
                                    i_454_ = ((i_456_ and 0x1000100) + (i_455_ - i_456_ and 0x10000))
                                    is_400_[i_399_] = i_455_ - i_454_ or i_454_ - (i_454_ ushr 8)
                                }
                            }
                        } else throw IllegalArgumentException()
                        i_393_ += anInt8481
                        i_395_++
                    }
                }
                i_391_++
                anInt8458 += anInt8457
                anInt8467 += anInt8452
                anInt8451 += anInt8453
            }
        } else if (anInt8450 < 0) {
            for (i_457_ in anInt8468..-1) {
                var i_458_ = anInt8451
                var i_459_ = anInt8458 + anInt8479
                var i_460_ = anInt8467 + anInt8475
                var i_461_ = anInt8478
                if (i_459_ < 0) {
                    val i_462_ = ((anInt8481 - 1 - i_459_) / anInt8481)
                    i_461_ += i_462_
                    i_459_ += anInt8481 * i_462_
                    i_460_ += anInt8450 * i_462_
                    i_458_ += i_462_
                }
                var i_463_: Int
                if ((((1 + i_459_ - (this.anInt8471 shl 12) - anInt8481) / anInt8481).also { i_463_ = it }) > i_461_) i_461_ = i_463_
                if (((i_460_ - (this.anInt8470 shl 12)).also { i_463_ = it }) >= 0) {
                    i_463_ = ((anInt8450 - i_463_) / anInt8450)
                    i_461_ += i_463_
                    i_459_ += anInt8481 * i_463_
                    i_460_ += anInt8450 * i_463_
                    i_458_ += i_463_
                }
                if ((((i_460_ - anInt8450) / anInt8450).also { i_463_ = it }) > i_461_) i_461_ = i_463_
                while ( /**/i_461_ < 0) {
                    var i_464_ = ((i_460_ shr 12) * this.anInt8471 + (i_459_ shr 12))
                    var i_465_ = i_458_++
                    val is_466_ = `is`
                    val i_467_ = i
                    val i_468_ = i_0_
                    if (i_468_ == 0) {
                        if (i_467_ == 1) is_466_!![i_465_] = (anIntArray9933[i_464_])
                        else if (i_467_ == 0) {
                            val i_469_ = (anIntArray9933[i_464_++])
                            val i_470_ = (((i_469_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                            val i_471_ = ((i_469_ and 0xff00) * anInt8463 and 0xff0000)
                            val i_472_ = ((i_469_ and 0xff) * anInt8465 and 0xff00)
                            is_466_!![i_465_] = (i_470_ or i_471_ or i_472_) ushr 8
                        } else if (i_467_ == 3) {
                            val i_473_ = (anIntArray9933[i_464_++])
                            val i_474_ = anInt8480
                            val i_475_ = i_473_ + i_474_
                            val i_476_ = (i_473_ and 0xff00ff) + (i_474_ and 0xff00ff)
                            val i_477_ = ((i_476_ and 0x1000100) + (i_475_ - i_476_ and 0x10000))
                            is_466_!![i_465_] = i_475_ - i_477_ or i_477_ - (i_477_ ushr 8)
                        } else if (i_467_ == 2) {
                            val i_478_ = (anIntArray9933[i_464_])
                            val i_479_ = (((i_478_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                            val i_480_ = ((i_478_ and 0xff00) * anInt8477 and 0xff0000)
                            is_466_!![i_465_] = (((i_479_ or i_480_) ushr 8) + anInt8474)
                        } else throw IllegalArgumentException()
                    } else if (i_468_ == 1) {
                        if (i_467_ == 1) {
                            val i_481_ = (anIntArray9933[i_464_])
                            if (i_481_ != 0) is_466_!![i_465_] = i_481_
                        } else if (i_467_ == 0) {
                            var i_482_ = (anIntArray9933[i_464_])
                            if (i_482_ != 0) {
                                if ((anInt8480 and 0xffffff) == 16777215) {
                                    val i_483_ = anInt8480 ushr 24
                                    val i_484_ = 256 - i_483_
                                    val i_485_ = is_466_!![i_465_]
                                    is_466_[i_465_] = ((((i_482_ and 0xff00ff) * i_483_ + (i_485_ and 0xff00ff) * i_484_) and 0xff00ff.inv()) + (((i_482_ and 0xff00) * i_483_ + (i_485_ and 0xff00) * i_484_) and 0xff0000)) shr 8
                                } else if (anInt8477 == 255) {
                                    val i_490_ = (((i_482_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_491_ = (((i_482_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_492_ = (((i_482_ and 0xff) * anInt8465) and 0xff00)
                                    is_466_!![i_465_] = (i_490_ or i_491_ or i_492_) ushr 8
                                } else {
                                    val i_486_ = (((i_482_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_487_ = (((i_482_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_488_ = (((i_482_ and 0xff) * anInt8465) and 0xff00)
                                    i_482_ = (i_486_ or i_487_ or i_488_) ushr 8
                                    val i_489_ = is_466_!![i_465_]
                                    is_466_[i_465_] = (((((i_482_ and 0xff00ff) * anInt8477) + ((i_489_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_482_ and 0xff00) * anInt8477) + ((i_489_ and 0xff00) * anInt8472)) and 0xff0000)) shr 8
                                }
                            }
                        } else if (i_467_ == 3) {
                            var i_493_ = (anIntArray9933[i_464_])
                            val i_494_ = anInt8480
                            val i_495_ = i_493_ + i_494_
                            val i_496_ = (i_493_ and 0xff00ff) + (i_494_ and 0xff00ff)
                            var i_497_ = ((i_496_ and 0x1000100) + (i_495_ - i_496_ and 0x10000))
                            i_497_ = i_495_ - i_497_ or i_497_ - (i_497_ ushr 8)
                            if (i_493_ == 0 && anInt8477 != 255) {
                                i_493_ = i_497_
                                i_497_ = is_466_!![i_465_]
                                i_497_ = (((((i_493_ and 0xff00ff) * anInt8477) + ((i_497_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_493_ and 0xff00) * anInt8477) + ((i_497_ and 0xff00) * anInt8472)) and 0xff0000)) shr 8
                            }
                            is_466_!![i_465_] = i_497_
                        } else if (i_467_ == 2) {
                            val i_498_ = (anIntArray9933[i_464_])
                            if (i_498_ != 0) {
                                val i_499_ = (((i_498_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_500_ = (((i_498_ and 0xff00) * anInt8477) and 0xff0000)
                                is_466_!![i_465_++] = (((i_499_ or i_500_) ushr 8) + anInt8474)
                            }
                        } else throw IllegalArgumentException()
                    } else if (i_468_ == 2) {
                        if (i_467_ == 1) {
                            val i_501_ = (anIntArray9933[i_464_])
                            if (i_501_ != 0) {
                                var i_502_ = is_466_!![i_465_]
                                val i_503_ = i_501_ + i_502_
                                val i_504_ = ((i_501_ and 0xff00ff) + (i_502_ and 0xff00ff))
                                i_502_ = (i_504_ and 0x1000100) + (i_503_ - i_504_ and 0x10000)
                                is_466_[i_465_] = i_503_ - i_502_ or i_502_ - (i_502_ ushr 8)
                            }
                        } else if (i_467_ == 0) {
                            var i_505_ = (anIntArray9933[i_464_])
                            if (i_505_ != 0) {
                                val i_506_ = (((i_505_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_507_ = (((i_505_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_508_ = (((i_505_ and 0xff) * anInt8465) and 0xff00)
                                i_505_ = (i_506_ or i_507_ or i_508_) ushr 8
                                var i_509_ = is_466_!![i_465_]
                                val i_510_ = i_505_ + i_509_
                                val i_511_ = ((i_505_ and 0xff00ff) + (i_509_ and 0xff00ff))
                                i_509_ = (i_511_ and 0x1000100) + (i_510_ - i_511_ and 0x10000)
                                is_466_[i_465_] = i_510_ - i_509_ or i_509_ - (i_509_ ushr 8)
                            }
                        } else if (i_467_ == 3) {
                            var i_512_ = (anIntArray9933[i_464_])
                            val i_513_ = anInt8480
                            var i_514_ = i_512_ + i_513_
                            var i_515_ = (i_512_ and 0xff00ff) + (i_513_ and 0xff00ff)
                            var i_516_ = ((i_515_ and 0x1000100) + (i_514_ - i_515_ and 0x10000))
                            i_512_ = i_514_ - i_516_ or i_516_ - (i_516_ ushr 8)
                            i_516_ = is_466_!![i_465_]
                            i_514_ = i_512_ + i_516_
                            i_515_ = (i_512_ and 0xff00ff) + (i_516_ and 0xff00ff)
                            i_516_ = (i_515_ and 0x1000100) + (i_514_ - i_515_ and 0x10000)
                            is_466_[i_465_] = i_514_ - i_516_ or i_516_ - (i_516_ ushr 8)
                        } else if (i_467_ == 2) {
                            var i_517_ = (anIntArray9933[i_464_])
                            if (i_517_ != 0) {
                                val i_518_ = (((i_517_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_519_ = (((i_517_ and 0xff00) * anInt8477) and 0xff0000)
                                i_517_ = (((i_518_ or i_519_) ushr 8) + anInt8474)
                                var i_520_ = is_466_!![i_465_]
                                val i_521_ = i_517_ + i_520_
                                val i_522_ = ((i_517_ and 0xff00ff) + (i_520_ and 0xff00ff))
                                i_520_ = (i_522_ and 0x1000100) + (i_521_ - i_522_ and 0x10000)
                                is_466_[i_465_] = i_521_ - i_520_ or i_520_ - (i_520_ ushr 8)
                            }
                        }
                    } else throw IllegalArgumentException()
                    i_459_ += anInt8481
                    i_460_ += anInt8450
                    i_461_++
                }
                anInt8458 += anInt8457
                anInt8467 += anInt8452
                anInt8451 += anInt8453
            }
        } else {
            for (i_523_ in anInt8468..-1) {
                var i_524_ = anInt8451
                var i_525_ = anInt8458 + anInt8479
                var i_526_ = anInt8467 + anInt8475
                var i_527_ = anInt8478
                if (i_525_ < 0) {
                    val i_528_ = ((anInt8481 - 1 - i_525_) / anInt8481)
                    i_527_ += i_528_
                    i_525_ += anInt8481 * i_528_
                    i_526_ += anInt8450 * i_528_
                    i_524_ += i_528_
                }
                var i_529_: Int
                if ((((1 + i_525_ - (this.anInt8471 shl 12) - anInt8481) / anInt8481).also { i_529_ = it }) > i_527_) i_527_ = i_529_
                if (i_526_ < 0) {
                    i_529_ = ((anInt8450 - 1 - i_526_) / anInt8450)
                    i_527_ += i_529_
                    i_525_ += anInt8481 * i_529_
                    i_526_ += anInt8450 * i_529_
                    i_524_ += i_529_
                }
                if ((((1 + i_526_ - (this.anInt8470 shl 12) - anInt8450) / anInt8450).also { i_529_ = it }) > i_527_) i_527_ = i_529_
                while ( /**/i_527_ < 0) {
                    var i_530_ = ((i_526_ shr 12) * this.anInt8471 + (i_525_ shr 12))
                    var i_531_ = i_524_++
                    val is_532_ = `is`
                    val i_533_ = i
                    val i_534_ = i_0_
                    if (i_534_ == 0) {
                        if (i_533_ == 1) is_532_!![i_531_] = (anIntArray9933[i_530_])
                        else if (i_533_ == 0) {
                            val i_535_ = (anIntArray9933[i_530_++])
                            val i_536_ = (((i_535_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                            val i_537_ = ((i_535_ and 0xff00) * anInt8463 and 0xff0000)
                            val i_538_ = ((i_535_ and 0xff) * anInt8465 and 0xff00)
                            is_532_!![i_531_] = (i_536_ or i_537_ or i_538_) ushr 8
                        } else if (i_533_ == 3) {
                            val i_539_ = (anIntArray9933[i_530_++])
                            val i_540_ = anInt8480
                            val i_541_ = i_539_ + i_540_
                            val i_542_ = (i_539_ and 0xff00ff) + (i_540_ and 0xff00ff)
                            val i_543_ = ((i_542_ and 0x1000100) + (i_541_ - i_542_ and 0x10000))
                            is_532_!![i_531_] = i_541_ - i_543_ or i_543_ - (i_543_ ushr 8)
                        } else if (i_533_ == 2) {
                            val i_544_ = (anIntArray9933[i_530_])
                            val i_545_ = (((i_544_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                            val i_546_ = ((i_544_ and 0xff00) * anInt8477 and 0xff0000)
                            is_532_!![i_531_] = (((i_545_ or i_546_) ushr 8) + anInt8474)
                        } else throw IllegalArgumentException()
                    } else if (i_534_ == 1) {
                        if (i_533_ == 1) {
                            val i_547_ = (anIntArray9933[i_530_])
                            if (i_547_ != 0) is_532_!![i_531_] = i_547_
                        } else if (i_533_ == 0) {
                            var i_548_ = (anIntArray9933[i_530_])
                            if (i_548_ != 0) {
                                if ((anInt8480 and 0xffffff) == 16777215) {
                                    val i_549_ = anInt8480 ushr 24
                                    val i_550_ = 256 - i_549_
                                    val i_551_ = is_532_!![i_531_]
                                    is_532_[i_531_] = ((((i_548_ and 0xff00ff) * i_549_ + (i_551_ and 0xff00ff) * i_550_) and 0xff00ff.inv()) + (((i_548_ and 0xff00) * i_549_ + (i_551_ and 0xff00) * i_550_) and 0xff0000)) shr 8
                                } else if (anInt8477 == 255) {
                                    val i_556_ = (((i_548_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_557_ = (((i_548_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_558_ = (((i_548_ and 0xff) * anInt8465) and 0xff00)
                                    is_532_!![i_531_] = (i_556_ or i_557_ or i_558_) ushr 8
                                } else {
                                    val i_552_ = (((i_548_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_553_ = (((i_548_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_554_ = (((i_548_ and 0xff) * anInt8465) and 0xff00)
                                    i_548_ = (i_552_ or i_553_ or i_554_) ushr 8
                                    val i_555_ = is_532_!![i_531_]
                                    is_532_[i_531_] = (((((i_548_ and 0xff00ff) * anInt8477) + ((i_555_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_548_ and 0xff00) * anInt8477) + ((i_555_ and 0xff00) * anInt8472)) and 0xff0000)) shr 8
                                }
                            }
                        } else if (i_533_ == 3) {
                            var i_559_ = (anIntArray9933[i_530_])
                            val i_560_ = anInt8480
                            val i_561_ = i_559_ + i_560_
                            val i_562_ = (i_559_ and 0xff00ff) + (i_560_ and 0xff00ff)
                            var i_563_ = ((i_562_ and 0x1000100) + (i_561_ - i_562_ and 0x10000))
                            i_563_ = i_561_ - i_563_ or i_563_ - (i_563_ ushr 8)
                            if (i_559_ == 0 && anInt8477 != 255) {
                                i_559_ = i_563_
                                i_563_ = is_532_!![i_531_]
                                i_563_ = (((((i_559_ and 0xff00ff) * anInt8477) + ((i_563_ and 0xff00ff) * anInt8472)) and 0xff00ff.inv()) + ((((i_559_ and 0xff00) * anInt8477) + ((i_563_ and 0xff00) * anInt8472)) and 0xff0000)) shr 8
                            }
                            is_532_!![i_531_] = i_563_
                        } else if (i_533_ == 2) {
                            val i_564_ = (anIntArray9933[i_530_])
                            if (i_564_ != 0) {
                                val i_565_ = (((i_564_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_566_ = (((i_564_ and 0xff00) * anInt8477) and 0xff0000)
                                is_532_!![i_531_++] = (((i_565_ or i_566_) ushr 8) + anInt8474)
                            }
                        } else throw IllegalArgumentException()
                    } else if (i_534_ == 2) {
                        if (i_533_ == 1) {
                            val i_567_ = (anIntArray9933[i_530_])
                            if (i_567_ != 0) {
                                var i_568_ = is_532_!![i_531_]
                                val i_569_ = i_567_ + i_568_
                                val i_570_ = ((i_567_ and 0xff00ff) + (i_568_ and 0xff00ff))
                                i_568_ = (i_570_ and 0x1000100) + (i_569_ - i_570_ and 0x10000)
                                is_532_[i_531_] = i_569_ - i_568_ or i_568_ - (i_568_ ushr 8)
                            }
                        } else if (i_533_ == 0) {
                            var i_571_ = (anIntArray9933[i_530_])
                            if (i_571_ != 0) {
                                val i_572_ = (((i_571_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_573_ = (((i_571_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_574_ = (((i_571_ and 0xff) * anInt8465) and 0xff00)
                                i_571_ = (i_572_ or i_573_ or i_574_) ushr 8
                                var i_575_ = is_532_!![i_531_]
                                val i_576_ = i_571_ + i_575_
                                val i_577_ = ((i_571_ and 0xff00ff) + (i_575_ and 0xff00ff))
                                i_575_ = (i_577_ and 0x1000100) + (i_576_ - i_577_ and 0x10000)
                                is_532_[i_531_] = i_576_ - i_575_ or i_575_ - (i_575_ ushr 8)
                            }
                        } else if (i_533_ == 3) {
                            var i_578_ = (anIntArray9933[i_530_])
                            val i_579_ = anInt8480
                            var i_580_ = i_578_ + i_579_
                            var i_581_ = (i_578_ and 0xff00ff) + (i_579_ and 0xff00ff)
                            var i_582_ = ((i_581_ and 0x1000100) + (i_580_ - i_581_ and 0x10000))
                            i_578_ = i_580_ - i_582_ or i_582_ - (i_582_ ushr 8)
                            i_582_ = is_532_!![i_531_]
                            i_580_ = i_578_ + i_582_
                            i_581_ = (i_578_ and 0xff00ff) + (i_582_ and 0xff00ff)
                            i_582_ = (i_581_ and 0x1000100) + (i_580_ - i_581_ and 0x10000)
                            is_532_[i_531_] = i_580_ - i_582_ or i_582_ - (i_582_ ushr 8)
                        } else if (i_533_ == 2) {
                            var i_583_ = (anIntArray9933[i_530_])
                            if (i_583_ != 0) {
                                val i_584_ = (((i_583_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_585_ = (((i_583_ and 0xff00) * anInt8477) and 0xff0000)
                                i_583_ = (((i_584_ or i_585_) ushr 8) + anInt8474)
                                var i_586_ = is_532_!![i_531_]
                                val i_587_ = i_583_ + i_586_
                                val i_588_ = ((i_583_ and 0xff00ff) + (i_586_ and 0xff00ff))
                                i_586_ = (i_588_ and 0x1000100) + (i_587_ - i_588_ and 0x10000)
                                is_532_[i_531_] = i_587_ - i_586_ or i_586_ - (i_586_ ushr 8)
                            }
                        }
                    } else throw IllegalArgumentException()
                    i_525_ += anInt8481
                    i_526_ += anInt8450
                    i_527_++
                }
                anInt8458 += anInt8457
                anInt8467 += anInt8452
                anInt8451 += anInt8453
            }
        }
    }

    override fun method979(i: Int, i_589_: Int, i_590_: Int, i_591_: Int, i_592_: Int, i_593_: Int) {
        val `is` = aHa_Sub1_8460.anIntArray7483
        for (i_594_ in 0..<i_591_) {
            val i_595_ = (i_589_ + i_594_) * this.anInt8471 + i
            val i_596_ = ((i_593_ + i_594_) * aHa_Sub1_8460.anInt7477 + i_592_)
            for (i_597_ in 0..<i_590_) anIntArray9933[i_595_ + i_597_] = `is`!![i_596_ + i_597_]
        }
    }

    override fun method982(i: Int, i_598_: Int, i_599_: Int, i_600_: Int, i_601_: Int, i_602_: Int, i_603_: Int, i_604_: Int) {
        var i = i
        var i_598_ = i_598_
        var i_599_ = i_599_
        var i_600_ = i_600_
        var i_602_ = i_602_
        check(!aHa_Sub1_8460.method3716())
        if (i_599_ > 0 && i_600_ > 0) {
            var i_605_ = 0
            var i_606_ = 0
            val i_607_ = aHa_Sub1_8460.anInt7477
            val i_608_ = (this.anInt8461 + this.anInt8471 + this.anInt8454)
            val i_609_ = (this.anInt8464 + this.anInt8470 + this.anInt8456)
            val i_610_ = (i_608_ shl 16) / i_599_
            val i_611_ = (i_609_ shl 16) / i_600_
            if (this.anInt8461 > 0) {
                val i_612_ = (((this.anInt8461 shl 16) + i_610_ - 1) / i_610_)
                i += i_612_
                i_605_ += i_612_ * i_610_ - (this.anInt8461 shl 16)
            }
            if (this.anInt8464 > 0) {
                val i_613_ = (((this.anInt8464 shl 16) + i_611_ - 1) / i_611_)
                i_598_ += i_613_
                i_606_ += i_613_ * i_611_ - (this.anInt8464 shl 16)
            }
            if (this.anInt8471 < i_608_) i_599_ = ((this.anInt8471 shl 16) - i_605_ + i_610_ - 1) / i_610_
            if (this.anInt8470 < i_609_) i_600_ = ((this.anInt8470 shl 16) - i_606_ + i_611_ - 1) / i_611_
            var i_614_ = i + i_598_ * i_607_
            var i_615_ = i_607_ - i_599_
            if (i_598_ + i_600_ > aHa_Sub1_8460.anInt7503) i_600_ -= (i_598_ + i_600_ - (aHa_Sub1_8460.anInt7503))
            if (i_598_ < aHa_Sub1_8460.anInt7476) {
                val i_616_ = ((aHa_Sub1_8460.anInt7476) - i_598_)
                i_600_ -= i_616_
                i_614_ += i_616_ * i_607_
                i_606_ += i_611_ * i_616_
            }
            if (i + i_599_ > aHa_Sub1_8460.anInt7507) {
                val i_617_ = (i + i_599_ - (aHa_Sub1_8460.anInt7507))
                i_599_ -= i_617_
                i_615_ += i_617_
            }
            if (i < aHa_Sub1_8460.anInt7496) {
                val i_618_ = ((aHa_Sub1_8460.anInt7496) - i)
                i_599_ -= i_618_
                i_614_ += i_618_
                i_605_ += i_610_ * i_618_
                i_615_ += i_618_
            }
            val `is` = (aHa_Sub1_8460.anIntArray7483)
            if (i_603_ == 0) {
                if (i_601_ == 1) {
                    val i_619_ = i_605_
                    for (i_620_ in -i_600_..-1) {
                        val i_621_ = ((i_606_ shr 16) * this.anInt8471)
                        for (i_622_ in -i_599_..-1) {
                            `is`!![i_614_++] = (anIntArray9933[(i_605_ shr 16) + i_621_])
                            i_605_ += i_610_
                        }
                        i_606_ += i_611_
                        i_605_ = i_619_
                        i_614_ += i_615_
                    }
                    return
                }
                if (i_601_ == 0) {
                    val i_623_ = (i_602_ and 0xff0000) shr 16
                    val i_624_ = (i_602_ and 0xff00) shr 8
                    val i_625_ = i_602_ and 0xff
                    val i_626_ = i_605_
                    for (i_627_ in -i_600_..-1) {
                        val i_628_ = ((i_606_ shr 16) * this.anInt8471)
                        for (i_629_ in -i_599_..-1) {
                            val i_630_ = (anIntArray9933[(i_605_ shr 16) + i_628_])
                            val i_631_ = (i_630_ and 0xff0000) * i_623_ and 0xffffff.inv()
                            val i_632_ = (i_630_ and 0xff00) * i_624_ and 0xff0000
                            val i_633_ = (i_630_ and 0xff) * i_625_ and 0xff00
                            `is`!![i_614_++] = (i_631_ or i_632_ or i_633_) ushr 8
                            i_605_ += i_610_
                        }
                        i_606_ += i_611_
                        i_605_ = i_626_
                        i_614_ += i_615_
                    }
                    return
                }
                if (i_601_ == 3) {
                    val i_634_ = i_605_
                    for (i_635_ in -i_600_..-1) {
                        val i_636_ = ((i_606_ shr 16) * this.anInt8471)
                        for (i_637_ in -i_599_..-1) {
                            val i_638_ = (anIntArray9933[(i_605_ shr 16) + i_636_])
                            val i_639_ = i_638_ + i_602_
                            val i_640_ = (i_638_ and 0xff00ff) + (i_602_ and 0xff00ff)
                            val i_641_ = ((i_640_ and 0x1000100) + (i_639_ - i_640_ and 0x10000))
                            `is`!![i_614_++] = i_639_ - i_641_ or i_641_ - (i_641_ ushr 8)
                            i_605_ += i_610_
                        }
                        i_606_ += i_611_
                        i_605_ = i_634_
                        i_614_ += i_615_
                    }
                    return
                }
                if (i_601_ == 2) {
                    val i_642_ = i_602_ ushr 24
                    val i_643_ = 256 - i_642_
                    var i_644_ = (i_602_ and 0xff00ff) * i_643_ and 0xff00ff.inv()
                    var i_645_ = (i_602_ and 0xff00) * i_643_ and 0xff0000
                    i_602_ = (i_644_ or i_645_) ushr 8
                    val i_646_ = i_605_
                    for (i_647_ in -i_600_..-1) {
                        val i_648_ = ((i_606_ shr 16) * this.anInt8471)
                        for (i_649_ in -i_599_..-1) {
                            val i_650_ = (anIntArray9933[(i_605_ shr 16) + i_648_])
                            i_644_ = (i_650_ and 0xff00ff) * i_642_ and 0xff00ff.inv()
                            i_645_ = (i_650_ and 0xff00) * i_642_ and 0xff0000
                            `is`!![i_614_++] = ((i_644_ or i_645_) ushr 8) + i_602_
                            i_605_ += i_610_
                        }
                        i_606_ += i_611_
                        i_605_ = i_646_
                        i_614_ += i_615_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            if (i_603_ == 1) {
                if (i_601_ == 1) {
                    val i_651_ = i_605_
                    for (i_652_ in -i_600_..-1) {
                        val i_653_ = ((i_606_ shr 16) * this.anInt8471)
                        for (i_654_ in -i_599_..-1) {
                            val i_655_ = (anIntArray9933[(i_605_ shr 16) + i_653_])
                            if (i_655_ != 0) `is`!![i_614_++] = i_655_
                            else i_614_++
                            i_605_ += i_610_
                        }
                        i_606_ += i_611_
                        i_605_ = i_651_
                        i_614_ += i_615_
                    }
                    return
                }
                if (i_601_ == 0) {
                    val i_656_ = i_605_
                    if ((i_602_ and 0xffffff) == 16777215) {
                        val i_657_ = i_602_ ushr 24
                        val i_658_ = 256 - i_657_
                        for (i_659_ in -i_600_..-1) {
                            val i_660_ = ((i_606_ shr 16) * this.anInt8471)
                            for (i_661_ in -i_599_..-1) {
                                val i_662_ = (anIntArray9933[(i_605_ shr 16) + i_660_])
                                if (i_662_ != 0) {
                                    val i_663_ = `is`!![i_614_]
                                    `is`[i_614_++] = ((((i_662_ and 0xff00ff) * i_657_ + (i_663_ and 0xff00ff) * i_658_) and 0xff00ff.inv()) + (((i_662_ and 0xff00) * i_657_ + (i_663_ and 0xff00) * i_658_) and 0xff0000)) shr 8
                                } else i_614_++
                                i_605_ += i_610_
                            }
                            i_606_ += i_611_
                            i_605_ = i_656_
                            i_614_ += i_615_
                        }
                    } else {
                        val i_664_ = (i_602_ and 0xff0000) shr 16
                        val i_665_ = (i_602_ and 0xff00) shr 8
                        val i_666_ = i_602_ and 0xff
                        val i_667_ = i_602_ ushr 24
                        val i_668_ = 256 - i_667_
                        for (i_669_ in -i_600_..-1) {
                            val i_670_ = ((i_606_ shr 16) * this.anInt8471)
                            for (i_671_ in -i_599_..-1) {
                                var i_672_ = (anIntArray9933[(i_605_ shr 16) + i_670_])
                                if (i_672_ != 0) {
                                    if (i_667_ == 255) {
                                        val i_677_ = ((i_672_ and 0xff0000) * i_664_ and 0xffffff.inv())
                                        val i_678_ = ((i_672_ and 0xff00) * i_665_ and 0xff0000)
                                        val i_679_ = ((i_672_ and 0xff) * i_666_ and 0xff00)
                                        `is`!![i_614_++] = (i_677_ or i_678_ or i_679_) ushr 8
                                    } else {
                                        val i_673_ = ((i_672_ and 0xff0000) * i_664_ and 0xffffff.inv())
                                        val i_674_ = ((i_672_ and 0xff00) * i_665_ and 0xff0000)
                                        val i_675_ = ((i_672_ and 0xff) * i_666_ and 0xff00)
                                        i_672_ = (i_673_ or i_674_ or i_675_) ushr 8
                                        val i_676_ = `is`!![i_614_]
                                        `is`[i_614_++] = ((((i_672_ and 0xff00ff) * i_667_ + ((i_676_ and 0xff00ff) * i_668_)) and 0xff00ff.inv()) + (((i_672_ and 0xff00) * i_667_ + ((i_676_ and 0xff00) * i_668_)) and 0xff0000)) shr 8
                                    }
                                } else i_614_++
                                i_605_ += i_610_
                            }
                            i_606_ += i_611_
                            i_605_ = i_656_
                            i_614_ += i_615_
                        }
                        return
                    }
                    return
                }
                if (i_601_ == 3) {
                    val i_680_ = i_605_
                    val i_681_ = i_602_ ushr 24
                    val i_682_ = 256 - i_681_
                    for (i_683_ in -i_600_..-1) {
                        val i_684_ = ((i_606_ shr 16) * this.anInt8471)
                        for (i_685_ in -i_599_..-1) {
                            var i_686_ = (anIntArray9933[(i_605_ shr 16) + i_684_])
                            val i_687_ = i_686_ + i_602_
                            val i_688_ = (i_686_ and 0xff00ff) + (i_602_ and 0xff00ff)
                            var i_689_ = ((i_688_ and 0x1000100) + (i_687_ - i_688_ and 0x10000))
                            i_689_ = i_687_ - i_689_ or i_689_ - (i_689_ ushr 8)
                            if (i_686_ == 0 && i_681_ != 255) {
                                i_686_ = i_689_
                                i_689_ = `is`!![i_614_]
                                i_689_ = ((((i_686_ and 0xff00ff) * i_681_ + (i_689_ and 0xff00ff) * i_682_) and 0xff00ff.inv()) + (((i_686_ and 0xff00) * i_681_ + (i_689_ and 0xff00) * i_682_) and 0xff0000)) shr 8
                            }
                            `is`!![i_614_++] = i_689_
                            i_605_ += i_610_
                        }
                        i_606_ += i_611_
                        i_605_ = i_680_
                        i_614_ += i_615_
                    }
                    return
                }
                if (i_601_ == 2) {
                    val i_690_ = i_602_ ushr 24
                    val i_691_ = 256 - i_690_
                    var i_692_ = (i_602_ and 0xff00ff) * i_691_ and 0xff00ff.inv()
                    var i_693_ = (i_602_ and 0xff00) * i_691_ and 0xff0000
                    i_602_ = (i_692_ or i_693_) ushr 8
                    val i_694_ = i_605_
                    for (i_695_ in -i_600_..-1) {
                        val i_696_ = ((i_606_ shr 16) * this.anInt8471)
                        for (i_697_ in -i_599_..-1) {
                            val i_698_ = (anIntArray9933[(i_605_ shr 16) + i_696_])
                            if (i_698_ != 0) {
                                i_692_ = (i_698_ and 0xff00ff) * i_690_ and 0xff00ff.inv()
                                i_693_ = (i_698_ and 0xff00) * i_690_ and 0xff0000
                                `is`!![i_614_++] = ((i_692_ or i_693_) ushr 8) + i_602_
                            } else i_614_++
                            i_605_ += i_610_
                        }
                        i_606_ += i_611_
                        i_605_ = i_694_
                        i_614_ += i_615_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            if (i_603_ == 2) {
                if (i_601_ == 1) {
                    val i_699_ = i_605_
                    for (i_700_ in -i_600_..-1) {
                        val i_701_ = ((i_606_ shr 16) * this.anInt8471)
                        for (i_702_ in -i_599_..-1) {
                            val i_703_ = (anIntArray9933[(i_605_ shr 16) + i_701_])
                            if (i_703_ != 0) {
                                var i_704_ = `is`!![i_614_]
                                val i_705_ = i_703_ + i_704_
                                val i_706_ = ((i_703_ and 0xff00ff) + (i_704_ and 0xff00ff))
                                i_704_ = (i_706_ and 0x1000100) + (i_705_ - i_706_ and 0x10000)
                                `is`[i_614_++] = i_705_ - i_704_ or i_704_ - (i_704_ ushr 8)
                            } else i_614_++
                            i_605_ += i_610_
                        }
                        i_606_ += i_611_
                        i_605_ = i_699_
                        i_614_ += i_615_
                    }
                    return
                }
                if (i_601_ == 0) {
                    val i_707_ = i_605_
                    val i_708_ = (i_602_ and 0xff0000) shr 16
                    val i_709_ = (i_602_ and 0xff00) shr 8
                    val i_710_ = i_602_ and 0xff
                    for (i_711_ in -i_600_..-1) {
                        val i_712_ = ((i_606_ shr 16) * this.anInt8471)
                        for (i_713_ in -i_599_..-1) {
                            var i_714_ = (anIntArray9933[(i_605_ shr 16) + i_712_])
                            if (i_714_ != 0) {
                                val i_715_ = (i_714_ and 0xff0000) * i_708_ and 0xffffff.inv()
                                val i_716_ = (i_714_ and 0xff00) * i_709_ and 0xff0000
                                val i_717_ = (i_714_ and 0xff) * i_710_ and 0xff00
                                i_714_ = (i_715_ or i_716_ or i_717_) ushr 8
                                var i_718_ = `is`!![i_614_]
                                val i_719_ = i_714_ + i_718_
                                val i_720_ = ((i_714_ and 0xff00ff) + (i_718_ and 0xff00ff))
                                i_718_ = (i_720_ and 0x1000100) + (i_719_ - i_720_ and 0x10000)
                                `is`[i_614_++] = i_719_ - i_718_ or i_718_ - (i_718_ ushr 8)
                            } else i_614_++
                            i_605_ += i_610_
                        }
                        i_606_ += i_611_
                        i_605_ = i_707_
                        i_614_ += i_615_
                    }
                    return
                }
                if (i_601_ == 3) {
                    val i_721_ = i_605_
                    for (i_722_ in -i_600_..-1) {
                        val i_723_ = ((i_606_ shr 16) * this.anInt8471)
                        for (i_724_ in -i_599_..-1) {
                            var i_725_ = (anIntArray9933[(i_605_ shr 16) + i_723_])
                            var i_726_ = i_725_ + i_602_
                            var i_727_ = (i_725_ and 0xff00ff) + (i_602_ and 0xff00ff)
                            var i_728_ = ((i_727_ and 0x1000100) + (i_726_ - i_727_ and 0x10000))
                            i_725_ = i_726_ - i_728_ or i_728_ - (i_728_ ushr 8)
                            i_728_ = `is`!![i_614_]
                            i_726_ = i_725_ + i_728_
                            i_727_ = (i_725_ and 0xff00ff) + (i_728_ and 0xff00ff)
                            i_728_ = (i_727_ and 0x1000100) + (i_726_ - i_727_ and 0x10000)
                            `is`[i_614_++] = i_726_ - i_728_ or i_728_ - (i_728_ ushr 8)
                            i_605_ += i_610_
                        }
                        i_606_ += i_611_
                        i_605_ = i_721_
                        i_614_ += i_615_
                    }
                    return
                }
                if (i_601_ == 2) {
                    val i_729_ = i_602_ ushr 24
                    val i_730_ = 256 - i_729_
                    var i_731_ = (i_602_ and 0xff00ff) * i_730_ and 0xff00ff.inv()
                    var i_732_ = (i_602_ and 0xff00) * i_730_ and 0xff0000
                    i_602_ = (i_731_ or i_732_) ushr 8
                    val i_733_ = i_605_
                    for (i_734_ in -i_600_..-1) {
                        val i_735_ = ((i_606_ shr 16) * this.anInt8471)
                        for (i_736_ in -i_599_..-1) {
                            var i_737_ = (anIntArray9933[(i_605_ shr 16) + i_735_])
                            if (i_737_ != 0) {
                                i_731_ = (i_737_ and 0xff00ff) * i_729_ and 0xff00ff.inv()
                                i_732_ = (i_737_ and 0xff00) * i_729_ and 0xff0000
                                i_737_ = ((i_731_ or i_732_) ushr 8) + i_602_
                                var i_738_ = `is`!![i_614_]
                                val i_739_ = i_737_ + i_738_
                                val i_740_ = ((i_737_ and 0xff00ff) + (i_738_ and 0xff00ff))
                                i_738_ = (i_740_ and 0x1000100) + (i_739_ - i_740_ and 0x10000)
                                `is`[i_614_++] = i_739_ - i_738_ or i_738_ - (i_738_ ushr 8)
                            } else i_614_++
                            i_605_ += i_610_
                        }
                        i_606_ += i_611_
                        i_605_ = i_733_
                        i_614_ += i_615_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            throw IllegalArgumentException()
        }
    }

    override fun method968(i: Int, i_741_: Int, i_742_: Int) {
        throw IllegalStateException("Can't capture alpha into a java_sprite_24")
    }

    internal constructor(var_ha_Sub1: ha_Sub1, i: Int, i_743_: Int) : super(var_ha_Sub1, i, i_743_) {
        this.anIntArray9933 = IntArray(i * i_743_)
    }

    internal constructor(var_ha_Sub1: ha_Sub1, `is`: IntArray, i: Int, i_744_: Int, i_745_: Int, i_746_: Int, bool: Boolean) : super(var_ha_Sub1, i_745_, i_746_) {
        var i = i
        var i_744_ = i_744_
        if (bool) this.anIntArray9933 = IntArray(i_745_ * i_746_)
        else this.anIntArray9933 = `is`
        i_744_ -= this.anInt8471
        var i_747_ = 0
        for (i_748_ in 0..<i_746_) {
            for (i_749_ in 0..<i_745_) {
                val i_750_ = `is`[i++]
                if (i_750_ ushr 24 == 255) anIntArray9933[i_747_++] = if ((i_750_ and 0xffffff) == 0) -16777215 else i_750_
                else anIntArray9933[i_747_++] = 0
            }
            i += i_744_
        }
    }

    internal constructor(var_ha_Sub1: ha_Sub1, `is`: IntArray, i: Int, i_751_: Int) : super(var_ha_Sub1, i, i_751_) {
        this.anIntArray9933 = `is`
    }

    override fun method995(`is`: IntArray?, is_752_: IntArray?, i: Int, i_753_: Int) {
        val is_754_ = aHa_Sub1_8460.anIntArray7483
        if (anInt8481 == 0) {
            if (anInt8450 == 0) {
                var i_755_ = anInt8468
                while (i_755_ < 0) {
                    val i_756_ = i_755_ + i_753_
                    if (i_756_ >= 0) {
                        if (i_756_ >= `is`!!.size) break
                        var i_757_ = anInt8451
                        var i_758_ = anInt8458
                        var i_759_ = anInt8467
                        var i_760_ = anInt8478
                        if (i_758_ >= 0 && i_759_ >= 0 && i_758_ - (this.anInt8471 shl 12) < 0 && i_759_ - (this.anInt8470 shl 12) < 0) {
                            val i_761_ = `is`!![i_756_] - i
                            var i_762_ = -is_752_!![i_756_]
                            val i_763_ = i_761_ - (i_757_ - anInt8451)
                            if (i_763_ > 0) {
                                i_757_ += i_763_
                                i_760_ += i_763_
                                i_758_ += anInt8481 * i_763_
                                i_759_ += anInt8450 * i_763_
                            } else i_762_ -= i_763_
                            if (i_760_ < i_762_) i_760_ = i_762_
                            while ( /**/i_760_ < 0) {
                                val i_764_ = (anIntArray9933[(((i_759_ shr 12) * this.anInt8471) + (i_758_ shr 12))])
                                if (i_764_ != 0) is_754_!![i_757_++] = i_764_
                                else i_757_++
                                i_760_++
                            }
                        }
                    }
                    i_755_++
                    anInt8451 += anInt8453
                }
            } else if (anInt8450 < 0) {
                var i_765_ = anInt8468
                while (i_765_ < 0) {
                    val i_766_ = i_765_ + i_753_
                    if (i_766_ >= 0) {
                        if (i_766_ >= `is`!!.size) break
                        var i_767_ = anInt8451
                        var i_768_ = anInt8458
                        var i_769_ = (anInt8467 + anInt8475)
                        var i_770_ = anInt8478
                        if (i_768_ >= 0 && i_768_ - (this.anInt8471 shl 12) < 0) {
                            var i_771_: Int
                            if (((i_769_ - (this.anInt8470 shl 12)).also { i_771_ = it }) >= 0) {
                                i_771_ = ((anInt8450 - i_771_) / anInt8450)
                                i_770_ += i_771_
                                i_769_ += anInt8450 * i_771_
                                i_767_ += i_771_
                            }
                            if ((((i_769_ - anInt8450) / anInt8450).also { i_771_ = it }) > i_770_) i_770_ = i_771_
                            val i_772_ = `is`!![i_766_] - i
                            var i_773_ = -is_752_!![i_766_]
                            val i_774_ = i_772_ - (i_767_ - anInt8451)
                            if (i_774_ > 0) {
                                i_767_ += i_774_
                                i_770_ += i_774_
                                i_768_ += anInt8481 * i_774_
                                i_769_ += anInt8450 * i_774_
                            } else i_773_ -= i_774_
                            if (i_770_ < i_773_) i_770_ = i_773_
                            while ( /**/i_770_ < 0) {
                                val i_775_ = (anIntArray9933[(((i_769_ shr 12) * this.anInt8471) + (i_768_ shr 12))])
                                if (i_775_ != 0) is_754_!![i_767_++] = i_775_
                                else i_767_++
                                i_769_ += anInt8450
                                i_770_++
                            }
                        }
                    }
                    i_765_++
                    anInt8458 += anInt8457
                    anInt8451 += anInt8453
                }
            } else {
                var i_776_ = anInt8468
                while (i_776_ < 0) {
                    val i_777_ = i_776_ + i_753_
                    if (i_777_ >= 0) {
                        if (i_777_ >= `is`!!.size) break
                        var i_778_ = anInt8451
                        var i_779_ = anInt8458
                        var i_780_ = (anInt8467 + anInt8475)
                        var i_781_ = anInt8478
                        if (i_779_ >= 0 && i_779_ - (this.anInt8471 shl 12) < 0) {
                            if (i_780_ < 0) {
                                val i_782_ = ((anInt8450 - 1 - i_780_) / anInt8450)
                                i_781_ += i_782_
                                i_780_ += anInt8450 * i_782_
                                i_778_ += i_782_
                            }
                            val i_783_: Int
                            if ((((1 + i_780_ - (this.anInt8470 shl 12) - anInt8450) / anInt8450).also { i_783_ = it }) > i_781_) i_781_ = i_783_
                            val i_784_ = `is`!![i_777_] - i
                            var i_785_ = -is_752_!![i_777_]
                            val i_786_ = i_784_ - (i_778_ - anInt8451)
                            if (i_786_ > 0) {
                                i_778_ += i_786_
                                i_781_ += i_786_
                                i_779_ += anInt8481 * i_786_
                                i_780_ += anInt8450 * i_786_
                            } else i_785_ -= i_786_
                            if (i_781_ < i_785_) i_781_ = i_785_
                            while ( /**/i_781_ < 0) {
                                val i_787_ = (anIntArray9933[(((i_780_ shr 12) * this.anInt8471) + (i_779_ shr 12))])
                                if (i_787_ != 0) is_754_!![i_778_++] = i_787_
                                else i_778_++
                                i_780_ += anInt8450
                                i_781_++
                            }
                        }
                    }
                    i_776_++
                    anInt8458 += anInt8457
                    anInt8451 += anInt8453
                }
            }
        } else if (anInt8481 < 0) {
            if (anInt8450 == 0) {
                var i_788_ = anInt8468
                while (i_788_ < 0) {
                    val i_789_ = i_788_ + i_753_
                    if (i_789_ >= 0) {
                        if (i_789_ >= `is`!!.size) break
                        var i_790_ = anInt8451
                        var i_791_ = (anInt8458 + anInt8479)
                        var i_792_ = anInt8467
                        var i_793_ = anInt8478
                        if (i_792_ >= 0 && i_792_ - (this.anInt8470 shl 12) < 0) {
                            var i_794_: Int
                            if (((i_791_ - (this.anInt8471 shl 12)).also { i_794_ = it }) >= 0) {
                                i_794_ = ((anInt8481 - i_794_) / anInt8481)
                                i_793_ += i_794_
                                i_791_ += anInt8481 * i_794_
                                i_790_ += i_794_
                            }
                            if ((((i_791_ - anInt8481) / anInt8481).also { i_794_ = it }) > i_793_) i_793_ = i_794_
                            val i_795_ = `is`!![i_789_] - i
                            var i_796_ = -is_752_!![i_789_]
                            val i_797_ = i_795_ - (i_790_ - anInt8451)
                            if (i_797_ > 0) {
                                i_790_ += i_797_
                                i_793_ += i_797_
                                i_791_ += anInt8481 * i_797_
                                i_792_ += anInt8450 * i_797_
                            } else i_796_ -= i_797_
                            if (i_793_ < i_796_) i_793_ = i_796_
                            while ( /**/i_793_ < 0) {
                                val i_798_ = (anIntArray9933[(((i_792_ shr 12) * this.anInt8471) + (i_791_ shr 12))])
                                if (i_798_ != 0) is_754_!![i_790_++] = i_798_
                                else i_790_++
                                i_791_ += anInt8481
                                i_793_++
                            }
                        }
                    }
                    i_788_++
                    anInt8467 += anInt8452
                    anInt8451 += anInt8453
                }
            } else if (anInt8450 < 0) {
                var i_799_ = anInt8468
                while (i_799_ < 0) {
                    val i_800_ = i_799_ + i_753_
                    if (i_800_ >= 0) {
                        if (i_800_ >= `is`!!.size) break
                        var i_801_ = anInt8451
                        var i_802_ = (anInt8458 + anInt8479)
                        var i_803_ = (anInt8467 + anInt8475)
                        var i_804_ = anInt8478
                        var i_805_: Int
                        if (((i_802_ - (this.anInt8471 shl 12)).also { i_805_ = it }) >= 0) {
                            i_805_ = ((anInt8481 - i_805_) / anInt8481)
                            i_804_ += i_805_
                            i_802_ += anInt8481 * i_805_
                            i_803_ += anInt8450 * i_805_
                            i_801_ += i_805_
                        }
                        if ((((i_802_ - anInt8481) / anInt8481).also { i_805_ = it }) > i_804_) i_804_ = i_805_
                        if (((i_803_ - (this.anInt8470 shl 12)).also { i_805_ = it }) >= 0) {
                            i_805_ = ((anInt8450 - i_805_) / anInt8450)
                            i_804_ += i_805_
                            i_802_ += anInt8481 * i_805_
                            i_803_ += anInt8450 * i_805_
                            i_801_ += i_805_
                        }
                        if ((((i_803_ - anInt8450) / anInt8450).also { i_805_ = it }) > i_804_) i_804_ = i_805_
                        val i_806_ = `is`[i_800_] - i
                        var i_807_ = -is_752_!![i_800_]
                        val i_808_ = i_806_ - (i_801_ - anInt8451)
                        if (i_808_ > 0) {
                            i_801_ += i_808_
                            i_804_ += i_808_
                            i_802_ += anInt8481 * i_808_
                            i_803_ += anInt8450 * i_808_
                        } else i_807_ -= i_808_
                        if (i_804_ < i_807_) i_804_ = i_807_
                        while ( /**/i_804_ < 0) {
                            val i_809_ = (anIntArray9933[(((i_803_ shr 12) * this.anInt8471) + (i_802_ shr 12))])
                            if (i_809_ != 0) is_754_!![i_801_++] = i_809_
                            else i_801_++
                            i_802_ += anInt8481
                            i_803_ += anInt8450
                            i_804_++
                        }
                    }
                    i_799_++
                    anInt8458 += anInt8457
                    anInt8467 += anInt8452
                    anInt8451 += anInt8453
                }
            } else {
                var i_810_ = anInt8468
                while (i_810_ < 0) {
                    val i_811_ = i_810_ + i_753_
                    if (i_811_ >= 0) {
                        if (i_811_ >= `is`!!.size) break
                        var i_812_ = anInt8451
                        var i_813_ = (anInt8458 + anInt8479)
                        var i_814_ = (anInt8467 + anInt8475)
                        var i_815_ = anInt8478
                        var i_816_: Int
                        if (((i_813_ - (this.anInt8471 shl 12)).also { i_816_ = it }) >= 0) {
                            i_816_ = ((anInt8481 - i_816_) / anInt8481)
                            i_815_ += i_816_
                            i_813_ += anInt8481 * i_816_
                            i_814_ += anInt8450 * i_816_
                            i_812_ += i_816_
                        }
                        if ((((i_813_ - anInt8481) / anInt8481).also { i_816_ = it }) > i_815_) i_815_ = i_816_
                        if (i_814_ < 0) {
                            i_816_ = ((anInt8450 - 1 - i_814_) / anInt8450)
                            i_815_ += i_816_
                            i_813_ += anInt8481 * i_816_
                            i_814_ += anInt8450 * i_816_
                            i_812_ += i_816_
                        }
                        if ((((1 + i_814_ - (this.anInt8470 shl 12) - anInt8450) / anInt8450).also { i_816_ = it }) > i_815_) i_815_ = i_816_
                        val i_817_ = `is`[i_811_] - i
                        var i_818_ = -is_752_!![i_811_]
                        val i_819_ = i_817_ - (i_812_ - anInt8451)
                        if (i_819_ > 0) {
                            i_812_ += i_819_
                            i_815_ += i_819_
                            i_813_ += anInt8481 * i_819_
                            i_814_ += anInt8450 * i_819_
                        } else i_818_ -= i_819_
                        if (i_815_ < i_818_) i_815_ = i_818_
                        while ( /**/i_815_ < 0) {
                            val i_820_ = (anIntArray9933[(((i_814_ shr 12) * this.anInt8471) + (i_813_ shr 12))])
                            if (i_820_ != 0) is_754_!![i_812_++] = i_820_
                            else i_812_++
                            i_813_ += anInt8481
                            i_814_ += anInt8450
                            i_815_++
                        }
                    }
                    i_810_++
                    anInt8458 += anInt8457
                    anInt8467 += anInt8452
                    anInt8451 += anInt8453
                }
            }
        } else if (anInt8450 == 0) {
            var i_821_ = anInt8468
            while (i_821_ < 0) {
                val i_822_ = i_821_ + i_753_
                if (i_822_ >= 0) {
                    if (i_822_ >= `is`!!.size) break
                    var i_823_ = anInt8451
                    var i_824_ = anInt8458 + anInt8479
                    var i_825_ = anInt8467
                    var i_826_ = anInt8478
                    if (i_825_ >= 0 && (i_825_ - (this.anInt8470 shl 12) < 0)) {
                        if (i_824_ < 0) {
                            val i_827_ = ((anInt8481 - 1 - i_824_) / anInt8481)
                            i_826_ += i_827_
                            i_824_ += anInt8481 * i_827_
                            i_823_ += i_827_
                        }
                        val i_828_: Int
                        if ((((1 + i_824_ - (this.anInt8471 shl 12) - anInt8481) / anInt8481).also { i_828_ = it }) > i_826_) i_826_ = i_828_
                        val i_829_ = `is`[i_822_] - i
                        var i_830_ = -is_752_!![i_822_]
                        val i_831_ = i_829_ - (i_823_ - anInt8451)
                        if (i_831_ > 0) {
                            i_823_ += i_831_
                            i_826_ += i_831_
                            i_824_ += anInt8481 * i_831_
                            i_825_ += anInt8450 * i_831_
                        } else i_830_ -= i_831_
                        if (i_826_ < i_830_) i_826_ = i_830_
                        while ( /**/i_826_ < 0) {
                            val i_832_ = (anIntArray9933[(((i_825_ shr 12) * this.anInt8471) + (i_824_ shr 12))])
                            if (i_832_ != 0) is_754_!![i_823_++] = i_832_
                            else i_823_++
                            i_824_ += anInt8481
                            i_826_++
                        }
                    }
                }
                i_821_++
                anInt8458 += anInt8457
                anInt8467 += anInt8452
                anInt8451 += anInt8453
            }
        } else if (anInt8450 < 0) {
            var i_833_ = anInt8468
            while (i_833_ < 0) {
                val i_834_ = i_833_ + i_753_
                if (i_834_ >= 0) {
                    if (i_834_ >= `is`!!.size) break
                    var i_835_ = anInt8451
                    var i_836_ = anInt8458 + anInt8479
                    var i_837_ = anInt8467 + anInt8475
                    var i_838_ = anInt8478
                    if (i_836_ < 0) {
                        val i_839_ = ((anInt8481 - 1 - i_836_) / anInt8481)
                        i_838_ += i_839_
                        i_836_ += anInt8481 * i_839_
                        i_837_ += anInt8450 * i_839_
                        i_835_ += i_839_
                    }
                    var i_840_: Int
                    if ((((1 + i_836_ - (this.anInt8471 shl 12) - anInt8481) / anInt8481).also { i_840_ = it }) > i_838_) i_838_ = i_840_
                    if (((i_837_ - (this.anInt8470 shl 12)).also { i_840_ = it }) >= 0) {
                        i_840_ = ((anInt8450 - i_840_) / anInt8450)
                        i_838_ += i_840_
                        i_836_ += anInt8481 * i_840_
                        i_837_ += anInt8450 * i_840_
                        i_835_ += i_840_
                    }
                    if ((((i_837_ - anInt8450) / anInt8450).also { i_840_ = it }) > i_838_) i_838_ = i_840_
                    val i_841_ = `is`[i_834_] - i
                    var i_842_ = -is_752_!![i_834_]
                    val i_843_ = i_841_ - (i_835_ - anInt8451)
                    if (i_843_ > 0) {
                        i_835_ += i_843_
                        i_838_ += i_843_
                        i_836_ += anInt8481 * i_843_
                        i_837_ += anInt8450 * i_843_
                    } else i_842_ -= i_843_
                    if (i_838_ < i_842_) i_838_ = i_842_
                    while ( /**/i_838_ < 0) {
                        val i_844_ = (anIntArray9933[(((i_837_ shr 12) * this.anInt8471) + (i_836_ shr 12))])
                        if (i_844_ != 0) is_754_!![i_835_++] = i_844_
                        else i_835_++
                        i_836_ += anInt8481
                        i_837_ += anInt8450
                        i_838_++
                    }
                }
                i_833_++
                anInt8458 += anInt8457
                anInt8467 += anInt8452
                anInt8451 += anInt8453
            }
        } else {
            var i_845_ = anInt8468
            while (i_845_ < 0) {
                val i_846_ = i_845_ + i_753_
                if (i_846_ >= 0) {
                    if (i_846_ >= `is`!!.size) break
                    var i_847_ = anInt8451
                    var i_848_ = anInt8458 + anInt8479
                    var i_849_ = anInt8467 + anInt8475
                    var i_850_ = anInt8478
                    if (i_848_ < 0) {
                        val i_851_ = ((anInt8481 - 1 - i_848_) / anInt8481)
                        i_850_ += i_851_
                        i_848_ += anInt8481 * i_851_
                        i_849_ += anInt8450 * i_851_
                        i_847_ += i_851_
                    }
                    var i_852_: Int
                    if ((((1 + i_848_ - (this.anInt8471 shl 12) - anInt8481) / anInt8481).also { i_852_ = it }) > i_850_) i_850_ = i_852_
                    if (i_849_ < 0) {
                        i_852_ = ((anInt8450 - 1 - i_849_) / anInt8450)
                        i_850_ += i_852_
                        i_848_ += anInt8481 * i_852_
                        i_849_ += anInt8450 * i_852_
                        i_847_ += i_852_
                    }
                    if ((((1 + i_849_ - (this.anInt8470 shl 12) - anInt8450) / anInt8450).also { i_852_ = it }) > i_850_) i_850_ = i_852_
                    val i_853_ = `is`[i_846_] - i
                    var i_854_ = -is_752_!![i_846_]
                    val i_855_ = i_853_ - (i_847_ - anInt8451)
                    if (i_855_ > 0) {
                        i_847_ += i_855_
                        i_850_ += i_855_
                        i_848_ += anInt8481 * i_855_
                        i_849_ += anInt8450 * i_855_
                    } else i_854_ -= i_855_
                    if (i_850_ < i_854_) i_850_ = i_854_
                    while ( /**/i_850_ < 0) {
                        val i_856_ = (anIntArray9933[(((i_849_ shr 12) * this.anInt8471) + (i_848_ shr 12))])
                        if (i_856_ != 0) is_754_!![i_847_++] = i_856_
                        else i_847_++
                        i_848_ += anInt8481
                        i_849_ += anInt8450
                        i_850_++
                    }
                }
                i_845_++
                anInt8458 += anInt8457
                anInt8467 += anInt8452
                anInt8451 += anInt8453
            }
        }
    }

    override fun method963(i: Int, i_857_: Int, var_aa: aa?, i_858_: Int, i_859_: Int) {
        var i = i
        var i_857_ = i_857_
        check(!aHa_Sub1_8460.method3716())
        i += this.anInt8461
        i_857_ += this.anInt8464
        var i_860_ = 0
        val i_861_ = aHa_Sub1_8460.anInt7477
        var i_862_ = this.anInt8471
        var i_863_ = this.anInt8470
        var i_864_ = i_861_ - i_862_
        var i_865_ = 0
        var i_866_ = i + i_857_ * i_861_
        if (i_857_ < aHa_Sub1_8460.anInt7476) {
            val i_867_ = (aHa_Sub1_8460.anInt7476 - i_857_)
            i_863_ -= i_867_
            i_857_ = aHa_Sub1_8460.anInt7476
            i_860_ += i_867_ * i_862_
            i_866_ += i_867_ * i_861_
        }
        if (i_857_ + i_863_ > aHa_Sub1_8460.anInt7503) i_863_ -= i_857_ + i_863_ - aHa_Sub1_8460.anInt7503
        if (i < aHa_Sub1_8460.anInt7496) {
            val i_868_ = (aHa_Sub1_8460.anInt7496 - i)
            i_862_ -= i_868_
            i = aHa_Sub1_8460.anInt7496
            i_860_ += i_868_
            i_866_ += i_868_
            i_865_ += i_868_
            i_864_ += i_868_
        }
        if (i + i_862_ > aHa_Sub1_8460.anInt7507) {
            val i_869_ = (i + i_862_ - (aHa_Sub1_8460.anInt7507))
            i_862_ -= i_869_
            i_865_ += i_869_
            i_864_ += i_869_
        }
        if (i_862_ > 0 && i_863_ > 0) {
            val var_aa_Sub3 = var_aa as aa_Sub3?
            val `is` = var_aa_Sub3!!.anIntArray5201
            val is_870_ = var_aa_Sub3.anIntArray5202
            val is_871_ = (aHa_Sub1_8460.anIntArray7483)
            var i_872_ = i_857_
            if (i_859_ > i_872_) {
                i_872_ = i_859_
                i_866_ += (i_859_ - i_857_) * i_861_
                i_860_ += (i_859_ - i_857_) * this.anInt8471
            }
            val i_873_ = (min(i_859_ + `is`!!.size, i_857_ + i_863_))
            for (i_874_ in i_872_..<i_873_) {
                val i_875_ = `is`[i_874_ - i_859_] + i_858_
                var i_876_ = is_870_!![i_874_ - i_859_]
                var i_877_ = i_862_
                if (i > i_875_) {
                    val i_878_ = i - i_875_
                    if (i_878_ >= i_876_) {
                        i_860_ += i_862_ + i_865_
                        i_866_ += i_862_ + i_864_
                        continue
                    }
                    i_876_ -= i_878_
                } else {
                    val i_879_ = i_875_ - i
                    if (i_879_ >= i_862_) {
                        i_860_ += i_862_ + i_865_
                        i_866_ += i_862_ + i_864_
                        continue
                    }
                    i_860_ += i_879_
                    i_877_ -= i_879_
                    i_866_ += i_879_
                }
                var i_880_ = 0
                if (i_877_ < i_876_) i_876_ = i_877_
                else i_880_ = i_877_ - i_876_
                for (i_881_ in -i_876_..-1) {
                    val i_882_ = anIntArray9933[i_860_++]
                    if (i_882_ != 0) is_871_!![i_866_++] = i_882_
                    else i_866_++
                }
                i_860_ += i_880_ + i_865_
                i_866_ += i_880_ + i_864_
            }
        }
    }

    override fun method964(i: Int, i_883_: Int, i_884_: Int, i_885_: Int, i_886_: Int) {
        var i = i
        var i_883_ = i_883_
        var i_885_ = i_885_
        check(!aHa_Sub1_8460.method3716())
        val i_887_ = aHa_Sub1_8460.anInt7477
        i += this.anInt8461
        i_883_ += this.anInt8464
        var i_888_ = i_883_ * i_887_ + i
        var i_889_ = 0
        var i_890_ = this.anInt8470
        var i_891_ = this.anInt8471
        var i_892_ = i_887_ - i_891_
        var i_893_ = 0
        if (i_883_ < aHa_Sub1_8460.anInt7476) {
            val i_894_ = (aHa_Sub1_8460.anInt7476 - i_883_)
            i_890_ -= i_894_
            i_883_ = aHa_Sub1_8460.anInt7476
            i_889_ += i_894_ * i_891_
            i_888_ += i_894_ * i_887_
        }
        if (i_883_ + i_890_ > aHa_Sub1_8460.anInt7503) i_890_ -= i_883_ + i_890_ - aHa_Sub1_8460.anInt7503
        if (i < aHa_Sub1_8460.anInt7496) {
            val i_895_ = (aHa_Sub1_8460.anInt7496 - i)
            i_891_ -= i_895_
            i = aHa_Sub1_8460.anInt7496
            i_889_ += i_895_
            i_888_ += i_895_
            i_893_ += i_895_
            i_892_ += i_895_
        }
        if (i + i_891_ > aHa_Sub1_8460.anInt7507) {
            val i_896_ = (i + i_891_ - (aHa_Sub1_8460.anInt7507))
            i_891_ -= i_896_
            i_893_ += i_896_
            i_892_ += i_896_
        }
        if (i_891_ > 0 && i_890_ > 0) {
            val `is` = (aHa_Sub1_8460.anIntArray7483)
            if (i_886_ == 0) {
                if (i_884_ == 1) {
                    for (i_897_ in -i_890_..-1) {
                        var i_898_ = i_888_ + i_891_ - 3
                        while (i_888_ < i_898_) {
                            `is`!![i_888_++] = (anIntArray9933[i_889_++])
                            `is`[i_888_++] = (anIntArray9933[i_889_++])
                            `is`[i_888_++] = (anIntArray9933[i_889_++])
                            `is`[i_888_++] = (anIntArray9933[i_889_++])
                        }
                        i_898_ += 3
                        while (i_888_ < i_898_) `is`!![i_888_++] = (anIntArray9933[i_889_++])
                        i_888_ += i_892_
                        i_889_ += i_893_
                    }
                    return
                }
                if (i_884_ == 0) {
                    val i_899_ = (i_885_ and 0xff0000) shr 16
                    val i_900_ = (i_885_ and 0xff00) shr 8
                    val i_901_ = i_885_ and 0xff
                    for (i_902_ in -i_890_..-1) {
                        for (i_903_ in -i_891_..-1) {
                            val i_904_ = (anIntArray9933[i_889_++])
                            val i_905_ = (i_904_ and 0xff0000) * i_899_ and 0xffffff.inv()
                            val i_906_ = (i_904_ and 0xff00) * i_900_ and 0xff0000
                            val i_907_ = (i_904_ and 0xff) * i_901_ and 0xff00
                            `is`!![i_888_++] = (i_905_ or i_906_ or i_907_) ushr 8
                        }
                        i_888_ += i_892_
                        i_889_ += i_893_
                    }
                    return
                }
                if (i_884_ == 3) {
                    for (i_908_ in -i_890_..-1) {
                        for (i_909_ in -i_891_..-1) {
                            val i_910_ = (anIntArray9933[i_889_++])
                            val i_911_ = i_910_ + i_885_
                            val i_912_ = (i_910_ and 0xff00ff) + (i_885_ and 0xff00ff)
                            val i_913_ = ((i_912_ and 0x1000100) + (i_911_ - i_912_ and 0x10000))
                            `is`!![i_888_++] = i_911_ - i_913_ or i_913_ - (i_913_ ushr 8)
                        }
                        i_888_ += i_892_
                        i_889_ += i_893_
                    }
                    return
                }
                if (i_884_ == 2) {
                    val i_914_ = i_885_ ushr 24
                    val i_915_ = 256 - i_914_
                    var i_916_ = (i_885_ and 0xff00ff) * i_915_ and 0xff00ff.inv()
                    var i_917_ = (i_885_ and 0xff00) * i_915_ and 0xff0000
                    i_885_ = (i_916_ or i_917_) ushr 8
                    for (i_918_ in -i_890_..-1) {
                        for (i_919_ in -i_891_..-1) {
                            val i_920_ = (anIntArray9933[i_889_++])
                            i_916_ = (i_920_ and 0xff00ff) * i_914_ and 0xff00ff.inv()
                            i_917_ = (i_920_ and 0xff00) * i_914_ and 0xff0000
                            `is`!![i_888_++] = ((i_916_ or i_917_) ushr 8) + i_885_
                        }
                        i_888_ += i_892_
                        i_889_ += i_893_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            if (i_886_ == 1) {
                if (i_884_ == 1) {
                    for (i_921_ in -i_890_..-1) {
                        var i_922_ = i_888_ + i_891_ - 3
                        while (i_888_ < i_922_) {
                            var i_923_ = (anIntArray9933[i_889_++])
                            if (i_923_ != 0) `is`!![i_888_++] = i_923_
                            else i_888_++
                            i_923_ = (anIntArray9933[i_889_++])
                            if (i_923_ != 0) `is`!![i_888_++] = i_923_
                            else i_888_++
                            i_923_ = (anIntArray9933[i_889_++])
                            if (i_923_ != 0) `is`!![i_888_++] = i_923_
                            else i_888_++
                            i_923_ = (anIntArray9933[i_889_++])
                            if (i_923_ != 0) `is`!![i_888_++] = i_923_
                            else i_888_++
                        }
                        i_922_ += 3
                        while (i_888_ < i_922_) {
                            val i_924_ = (anIntArray9933[i_889_++])
                            if (i_924_ != 0) `is`!![i_888_++] = i_924_
                            else i_888_++
                        }
                        i_888_ += i_892_
                        i_889_ += i_893_
                    }
                    return
                }
                if (i_884_ == 0) {
                    if ((i_885_ and 0xffffff) == 16777215) {
                        val i_925_ = i_885_ ushr 24
                        val i_926_ = 256 - i_925_
                        for (i_927_ in -i_890_..-1) {
                            for (i_928_ in -i_891_..-1) {
                                val i_929_ = (anIntArray9933[i_889_++])
                                if (i_929_ != 0) {
                                    val i_930_ = `is`!![i_888_]
                                    `is`[i_888_++] = ((((i_929_ and 0xff00ff) * i_925_ + (i_930_ and 0xff00ff) * i_926_) and 0xff00ff.inv()) + (((i_929_ and 0xff00) * i_925_ + (i_930_ and 0xff00) * i_926_) and 0xff0000)) shr 8
                                } else i_888_++
                            }
                            i_888_ += i_892_
                            i_889_ += i_893_
                        }
                    } else {
                        val i_931_ = (i_885_ and 0xff0000) shr 16
                        val i_932_ = (i_885_ and 0xff00) shr 8
                        val i_933_ = i_885_ and 0xff
                        val i_934_ = i_885_ ushr 24
                        val i_935_ = 256 - i_934_
                        for (i_936_ in -i_890_..-1) {
                            for (i_937_ in -i_891_..-1) {
                                var i_938_ = (anIntArray9933[i_889_++])
                                if (i_938_ != 0) {
                                    if (i_934_ == 255) {
                                        val i_943_ = ((i_938_ and 0xff0000) * i_931_ and 0xffffff.inv())
                                        val i_944_ = ((i_938_ and 0xff00) * i_932_ and 0xff0000)
                                        val i_945_ = ((i_938_ and 0xff) * i_933_ and 0xff00)
                                        `is`!![i_888_++] = (i_943_ or i_944_ or i_945_) ushr 8
                                    } else {
                                        val i_939_ = ((i_938_ and 0xff0000) * i_931_ and 0xffffff.inv())
                                        val i_940_ = ((i_938_ and 0xff00) * i_932_ and 0xff0000)
                                        val i_941_ = ((i_938_ and 0xff) * i_933_ and 0xff00)
                                        i_938_ = (i_939_ or i_940_ or i_941_) ushr 8
                                        val i_942_ = `is`!![i_888_]
                                        `is`[i_888_++] = ((((i_938_ and 0xff00ff) * i_934_ + ((i_942_ and 0xff00ff) * i_935_)) and 0xff00ff.inv()) + (((i_938_ and 0xff00) * i_934_ + ((i_942_ and 0xff00) * i_935_)) and 0xff0000)) shr 8
                                    }
                                } else i_888_++
                            }
                            i_888_ += i_892_
                            i_889_ += i_893_
                        }
                        return
                    }
                    return
                }
                if (i_884_ == 3) {
                    val i_946_ = i_885_ ushr 24
                    val i_947_ = 256 - i_946_
                    for (i_948_ in -i_890_..-1) {
                        for (i_949_ in -i_891_..-1) {
                            var i_950_ = (anIntArray9933[i_889_++])
                            val i_951_ = i_950_ + i_885_
                            val i_952_ = (i_950_ and 0xff00ff) + (i_885_ and 0xff00ff)
                            var i_953_ = ((i_952_ and 0x1000100) + (i_951_ - i_952_ and 0x10000))
                            i_953_ = i_951_ - i_953_ or i_953_ - (i_953_ ushr 8)
                            if (i_950_ == 0 && i_946_ != 255) {
                                i_950_ = i_953_
                                i_953_ = `is`!![i_888_]
                                i_953_ = ((((i_950_ and 0xff00ff) * i_946_ + (i_953_ and 0xff00ff) * i_947_) and 0xff00ff.inv()) + (((i_950_ and 0xff00) * i_946_ + (i_953_ and 0xff00) * i_947_) and 0xff0000)) shr 8
                            }
                            `is`!![i_888_++] = i_953_
                        }
                        i_888_ += i_892_
                        i_889_ += i_893_
                    }
                    return
                }
                if (i_884_ == 2) {
                    val i_954_ = i_885_ ushr 24
                    val i_955_ = 256 - i_954_
                    var i_956_ = (i_885_ and 0xff00ff) * i_955_ and 0xff00ff.inv()
                    var i_957_ = (i_885_ and 0xff00) * i_955_ and 0xff0000
                    i_885_ = (i_956_ or i_957_) ushr 8
                    for (i_958_ in -i_890_..-1) {
                        for (i_959_ in -i_891_..-1) {
                            val i_960_ = (anIntArray9933[i_889_++])
                            if (i_960_ != 0) {
                                i_956_ = (i_960_ and 0xff00ff) * i_954_ and 0xff00ff.inv()
                                i_957_ = (i_960_ and 0xff00) * i_954_ and 0xff0000
                                `is`!![i_888_++] = ((i_956_ or i_957_) ushr 8) + i_885_
                            } else i_888_++
                        }
                        i_888_ += i_892_
                        i_889_ += i_893_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            if (i_886_ == 2) {
                if (i_884_ == 1) {
                    for (i_961_ in -i_890_..-1) {
                        for (i_962_ in -i_891_..-1) {
                            val i_963_ = (anIntArray9933[i_889_++])
                            if (i_963_ != 0) {
                                var i_964_ = `is`!![i_888_]
                                val i_965_ = i_963_ + i_964_
                                val i_966_ = ((i_963_ and 0xff00ff) + (i_964_ and 0xff00ff))
                                i_964_ = (i_966_ and 0x1000100) + (i_965_ - i_966_ and 0x10000)
                                `is`[i_888_++] = i_965_ - i_964_ or i_964_ - (i_964_ ushr 8)
                            } else i_888_++
                        }
                        i_888_ += i_892_
                        i_889_ += i_893_
                    }
                    return
                }
                if (i_884_ == 0) {
                    val i_967_ = (i_885_ and 0xff0000) shr 16
                    val i_968_ = (i_885_ and 0xff00) shr 8
                    val i_969_ = i_885_ and 0xff
                    for (i_970_ in -i_890_..-1) {
                        for (i_971_ in -i_891_..-1) {
                            var i_972_ = (anIntArray9933[i_889_++])
                            if (i_972_ != 0) {
                                val i_973_ = (i_972_ and 0xff0000) * i_967_ and 0xffffff.inv()
                                val i_974_ = (i_972_ and 0xff00) * i_968_ and 0xff0000
                                val i_975_ = (i_972_ and 0xff) * i_969_ and 0xff00
                                i_972_ = (i_973_ or i_974_ or i_975_) ushr 8
                                var i_976_ = `is`!![i_888_]
                                val i_977_ = i_972_ + i_976_
                                val i_978_ = ((i_972_ and 0xff00ff) + (i_976_ and 0xff00ff))
                                i_976_ = (i_978_ and 0x1000100) + (i_977_ - i_978_ and 0x10000)
                                `is`[i_888_++] = i_977_ - i_976_ or i_976_ - (i_976_ ushr 8)
                            } else i_888_++
                        }
                        i_888_ += i_892_
                        i_889_ += i_893_
                    }
                    return
                }
                if (i_884_ == 3) {
                    for (i_979_ in -i_890_..-1) {
                        for (i_980_ in -i_891_..-1) {
                            var i_981_ = (anIntArray9933[i_889_++])
                            var i_982_ = i_981_ + i_885_
                            var i_983_ = (i_981_ and 0xff00ff) + (i_885_ and 0xff00ff)
                            var i_984_ = ((i_983_ and 0x1000100) + (i_982_ - i_983_ and 0x10000))
                            i_981_ = i_982_ - i_984_ or i_984_ - (i_984_ ushr 8)
                            i_984_ = `is`!![i_888_]
                            i_982_ = i_981_ + i_984_
                            i_983_ = (i_981_ and 0xff00ff) + (i_984_ and 0xff00ff)
                            i_984_ = (i_983_ and 0x1000100) + (i_982_ - i_983_ and 0x10000)
                            `is`[i_888_++] = i_982_ - i_984_ or i_984_ - (i_984_ ushr 8)
                        }
                        i_888_ += i_892_
                        i_889_ += i_893_
                    }
                    return
                }
                if (i_884_ == 2) {
                    val i_985_ = i_885_ ushr 24
                    val i_986_ = 256 - i_985_
                    var i_987_ = (i_885_ and 0xff00ff) * i_986_ and 0xff00ff.inv()
                    var i_988_ = (i_885_ and 0xff00) * i_986_ and 0xff0000
                    i_885_ = (i_987_ or i_988_) ushr 8
                    for (i_989_ in -i_890_..-1) {
                        for (i_990_ in -i_891_..-1) {
                            var i_991_ = (anIntArray9933[i_889_++])
                            if (i_991_ != 0) {
                                i_987_ = (i_991_ and 0xff00ff) * i_985_ and 0xff00ff.inv()
                                i_988_ = (i_991_ and 0xff00) * i_985_ and 0xff0000
                                i_991_ = ((i_987_ or i_988_) ushr 8) + i_885_
                                var i_992_ = `is`!![i_888_]
                                val i_993_ = i_991_ + i_992_
                                val i_994_ = ((i_991_ and 0xff00ff) + (i_992_ and 0xff00ff))
                                i_992_ = (i_994_ and 0x1000100) + (i_993_ - i_994_ and 0x10000)
                                `is`[i_888_++] = i_993_ - i_992_ or i_992_ - (i_992_ ushr 8)
                            } else i_888_++
                        }
                        i_888_ += i_892_
                        i_889_ += i_893_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            throw IllegalArgumentException()
        }
    }

    override fun method996(i: Int, i_995_: Int, i_996_: Int, i_997_: Int, i_998_: Int, i_999_: Int, i_1000_: Int, i_1001_: Int, i_1002_: Int) {
        var i = i
        var i_995_ = i_995_
        var i_997_ = i_997_
        var i_998_ = i_998_
        var i_1000_ = i_1000_
        if (i_997_ > 0 && i_998_ > 0) {
            var i_1003_ = 0
            var i_1004_ = 0
            val i_1005_ = (this.anInt8461 + this.anInt8471 + this.anInt8454)
            val i_1006_ = (this.anInt8464 + this.anInt8470 + this.anInt8456)
            val i_1007_ = (i_1005_ shl 16) / i_997_
            val i_1008_ = (i_1006_ shl 16) / i_998_
            if (this.anInt8461 > 0) {
                val i_1009_ = (((this.anInt8461 shl 16) + i_1007_ - 1) / i_1007_)
                i += i_1009_
                i_1003_ += i_1009_ * i_1007_ - (this.anInt8461 shl 16)
            }
            if (this.anInt8464 > 0) {
                val i_1010_ = (((this.anInt8464 shl 16) + i_1008_ - 1) / i_1008_)
                i_995_ += i_1010_
                i_1004_ += i_1010_ * i_1008_ - (this.anInt8464 shl 16)
            }
            if (this.anInt8471 < i_1005_) i_997_ = ((this.anInt8471 shl 16) - i_1003_ + i_1007_ - 1) / i_1007_
            if (this.anInt8470 < i_1006_) i_998_ = ((this.anInt8470 shl 16) - i_1004_ + i_1008_ - 1) / i_1008_
            var i_1011_ = i + i_995_ * aHa_Sub1_8460.anInt7477
            var i_1012_ = (aHa_Sub1_8460.anInt7477 - i_997_)
            if (i_995_ + i_998_ > aHa_Sub1_8460.anInt7503) i_998_ -= (i_995_ + i_998_ - (aHa_Sub1_8460.anInt7503))
            if (i_995_ < aHa_Sub1_8460.anInt7476) {
                val i_1013_ = (aHa_Sub1_8460.anInt7476) - i_995_
                i_998_ -= i_1013_
                i_1011_ += i_1013_ * aHa_Sub1_8460.anInt7477
                i_1004_ += i_1008_ * i_1013_
            }
            if (i + i_997_ > aHa_Sub1_8460.anInt7507) {
                val i_1014_ = (i + i_997_ - (aHa_Sub1_8460.anInt7507))
                i_997_ -= i_1014_
                i_1012_ += i_1014_
            }
            if (i < aHa_Sub1_8460.anInt7496) {
                val i_1015_ = (aHa_Sub1_8460.anInt7496) - i
                i_997_ -= i_1015_
                i_1011_ += i_1015_
                i_1003_ += i_1007_ * i_1015_
                i_1012_ += i_1015_
            }
            val fs = (aHa_Sub1_8460.aFloatArray7511)
            val `is` = (aHa_Sub1_8460.anIntArray7483)
            if (i_1001_ == 0) {
                if (i_999_ == 1) {
                    val i_1016_ = i_1003_
                    for (i_1017_ in -i_998_..-1) {
                        val i_1018_ = ((i_1004_ shr 16) * this.anInt8471)
                        for (i_1019_ in -i_997_..-1) {
                            if (i_996_.toFloat() < fs!![i_1011_]) {
                                `is`!![i_1011_] = (anIntArray9933[(i_1003_ shr 16) + i_1018_])
                                fs[i_1011_] = i_996_.toFloat()
                            }
                            i_1003_ += i_1007_
                            i_1011_++
                        }
                        i_1004_ += i_1008_
                        i_1003_ = i_1016_
                        i_1011_ += i_1012_
                    }
                    return
                }
                if (i_999_ == 0) {
                    val i_1020_ = (i_1000_ and 0xff0000) shr 16
                    val i_1021_ = (i_1000_ and 0xff00) shr 8
                    val i_1022_ = i_1000_ and 0xff
                    val i_1023_ = i_1003_
                    for (i_1024_ in -i_998_..-1) {
                        val i_1025_ = ((i_1004_ shr 16) * this.anInt8471)
                        for (i_1026_ in -i_997_..-1) {
                            if (i_996_.toFloat() < fs!![i_1011_]) {
                                val i_1027_ = (anIntArray9933[(i_1003_ shr 16) + i_1025_])
                                val i_1028_ = ((i_1027_ and 0xff0000) * i_1020_ and 0xffffff.inv())
                                val i_1029_ = (i_1027_ and 0xff00) * i_1021_ and 0xff0000
                                val i_1030_ = (i_1027_ and 0xff) * i_1022_ and 0xff00
                                `is`!![i_1011_] = (i_1028_ or i_1029_ or i_1030_) ushr 8
                                fs[i_1011_] = i_996_.toFloat()
                            }
                            i_1003_ += i_1007_
                            i_1011_++
                        }
                        i_1004_ += i_1008_
                        i_1003_ = i_1023_
                        i_1011_ += i_1012_
                    }
                    return
                }
                if (i_999_ == 3) {
                    val i_1031_ = i_1003_
                    for (i_1032_ in -i_998_..-1) {
                        val i_1033_ = ((i_1004_ shr 16) * this.anInt8471)
                        for (i_1034_ in -i_997_..-1) {
                            if (i_996_.toFloat() < fs!![i_1011_]) {
                                val i_1035_ = (anIntArray9933[(i_1003_ shr 16) + i_1033_])
                                val i_1036_ = i_1035_ + i_1000_
                                val i_1037_ = ((i_1035_ and 0xff00ff) + (i_1000_ and 0xff00ff))
                                val i_1038_ = ((i_1037_ and 0x1000100) + (i_1036_ - i_1037_ and 0x10000))
                                `is`!![i_1011_] = i_1036_ - i_1038_ or i_1038_ - (i_1038_ ushr 8)
                                fs[i_1011_] = i_996_.toFloat()
                            }
                            i_1003_ += i_1007_
                            i_1011_++
                        }
                        i_1004_ += i_1008_
                        i_1003_ = i_1031_
                        i_1011_ += i_1012_
                    }
                    return
                }
                if (i_999_ == 2) {
                    val i_1039_ = i_1000_ ushr 24
                    val i_1040_ = 256 - i_1039_
                    var i_1041_ = (i_1000_ and 0xff00ff) * i_1040_ and 0xff00ff.inv()
                    var i_1042_ = (i_1000_ and 0xff00) * i_1040_ and 0xff0000
                    i_1000_ = (i_1041_ or i_1042_) ushr 8
                    val i_1043_ = i_1003_
                    for (i_1044_ in -i_998_..-1) {
                        val i_1045_ = ((i_1004_ shr 16) * this.anInt8471)
                        for (i_1046_ in -i_997_..-1) {
                            if (i_996_.toFloat() < fs!![i_1011_]) {
                                val i_1047_ = (anIntArray9933[(i_1003_ shr 16) + i_1045_])
                                i_1041_ = ((i_1047_ and 0xff00ff) * i_1039_ and 0xff00ff.inv())
                                i_1042_ = (i_1047_ and 0xff00) * i_1039_ and 0xff0000
                                `is`!![i_1011_] = ((i_1041_ or i_1042_) ushr 8) + i_1000_
                                fs[i_1011_] = i_996_.toFloat()
                            }
                            i_1003_ += i_1007_
                            i_1011_++
                        }
                        i_1004_ += i_1008_
                        i_1003_ = i_1043_
                        i_1011_ += i_1012_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            if (i_1001_ == 1) {
                if (i_999_ == 1) {
                    val i_1048_ = i_1003_
                    for (i_1049_ in -i_998_..-1) {
                        val i_1050_ = ((i_1004_ shr 16) * this.anInt8471)
                        for (i_1051_ in -i_997_..-1) {
                            if (i_996_.toFloat() < fs!![i_1011_]) {
                                val i_1052_ = (anIntArray9933[(i_1003_ shr 16) + i_1050_])
                                if (i_1052_ != 0) {
                                    `is`!![i_1011_] = i_1052_
                                    fs[i_1011_] = i_996_.toFloat()
                                }
                            }
                            i_1003_ += i_1007_
                            i_1011_++
                        }
                        i_1004_ += i_1008_
                        i_1003_ = i_1048_
                        i_1011_ += i_1012_
                    }
                    return
                }
                if (i_999_ == 0) {
                    val i_1053_ = i_1003_
                    if ((i_1000_ and 0xffffff) == 16777215) {
                        val i_1054_ = i_1000_ ushr 24
                        val i_1055_ = 256 - i_1054_
                        for (i_1056_ in -i_998_..-1) {
                            val i_1057_ = ((i_1004_ shr 16) * this.anInt8471)
                            for (i_1058_ in -i_997_..-1) {
                                if (i_996_.toFloat() < fs!![i_1011_]) {
                                    val i_1059_ = (anIntArray9933[(i_1003_ shr 16) + i_1057_])
                                    if (i_1059_ != 0) {
                                        val i_1060_ = `is`!![i_1011_]
                                        `is`[i_1011_] = ((((i_1059_ and 0xff00ff) * i_1054_ + ((i_1060_ and 0xff00ff) * i_1055_)) and 0xff00ff.inv()) + (((i_1059_ and 0xff00) * i_1054_ + ((i_1060_ and 0xff00) * i_1055_)) and 0xff0000)) shr 8
                                        fs[i_1011_] = i_996_.toFloat()
                                    }
                                }
                                i_1003_ += i_1007_
                                i_1011_++
                            }
                            i_1004_ += i_1008_
                            i_1003_ = i_1053_
                            i_1011_ += i_1012_
                        }
                    } else {
                        val i_1061_ = (i_1000_ and 0xff0000) shr 16
                        val i_1062_ = (i_1000_ and 0xff00) shr 8
                        val i_1063_ = i_1000_ and 0xff
                        val i_1064_ = i_1000_ ushr 24
                        val i_1065_ = 256 - i_1064_
                        for (i_1066_ in -i_998_..-1) {
                            val i_1067_ = ((i_1004_ shr 16) * this.anInt8471)
                            for (i_1068_ in -i_997_..-1) {
                                if (i_996_.toFloat() < fs!![i_1011_]) {
                                    var i_1069_ = (anIntArray9933[(i_1003_ shr 16) + i_1067_])
                                    if (i_1069_ != 0) {
                                        if (i_1064_ == 255) {
                                            val i_1074_ = (((i_1069_ and 0xff0000) * i_1061_) and 0xffffff.inv())
                                            val i_1075_ = ((i_1069_ and 0xff00) * i_1062_ and 0xff0000)
                                            val i_1076_ = ((i_1069_ and 0xff) * i_1063_ and 0xff00)
                                            `is`!![i_1011_] = (i_1074_ or i_1075_ or i_1076_) ushr 8
                                            fs[i_1011_] = i_996_.toFloat()
                                        } else {
                                            val i_1070_ = (((i_1069_ and 0xff0000) * i_1061_) and 0xffffff.inv())
                                            val i_1071_ = ((i_1069_ and 0xff00) * i_1062_ and 0xff0000)
                                            val i_1072_ = ((i_1069_ and 0xff) * i_1063_ and 0xff00)
                                            i_1069_ = (i_1070_ or i_1071_ or i_1072_) ushr 8
                                            val i_1073_ = `is`!![i_1011_]
                                            `is`[i_1011_] = (((((i_1069_ and 0xff00ff) * i_1064_) + ((i_1073_ and 0xff00ff) * i_1065_)) and 0xff00ff.inv()) + ((((i_1069_ and 0xff00) * i_1064_) + ((i_1073_ and 0xff00) * i_1065_)) and 0xff0000)) shr 8
                                            fs[i_1011_] = i_996_.toFloat()
                                        }
                                    }
                                }
                                i_1003_ += i_1007_
                                i_1011_++
                            }
                            i_1004_ += i_1008_
                            i_1003_ = i_1053_
                            i_1011_ += i_1012_
                        }
                        return
                    }
                    return
                }
                if (i_999_ == 3) {
                    val i_1077_ = i_1003_
                    val i_1078_ = i_1000_ ushr 24
                    val i_1079_ = 256 - i_1078_
                    for (i_1080_ in -i_998_..-1) {
                        val i_1081_ = ((i_1004_ shr 16) * this.anInt8471)
                        for (i_1082_ in -i_997_..-1) {
                            if (i_996_.toFloat() < fs!![i_1011_]) {
                                var i_1083_ = (anIntArray9933[(i_1003_ shr 16) + i_1081_])
                                val i_1084_ = i_1083_ + i_1000_
                                val i_1085_ = ((i_1083_ and 0xff00ff) + (i_1000_ and 0xff00ff))
                                var i_1086_ = ((i_1085_ and 0x1000100) + (i_1084_ - i_1085_ and 0x10000))
                                i_1086_ = i_1084_ - i_1086_ or i_1086_ - (i_1086_ ushr 8)
                                if (i_1083_ == 0 && i_1078_ != 255) {
                                    i_1083_ = i_1086_
                                    i_1086_ = `is`!![i_1011_]
                                    i_1086_ = ((((i_1083_ and 0xff00ff) * i_1078_ + (i_1086_ and 0xff00ff) * i_1079_) and 0xff00ff.inv()) + (((i_1083_ and 0xff00) * i_1078_ + (i_1086_ and 0xff00) * i_1079_) and 0xff0000)) shr 8
                                }
                                `is`!![i_1011_] = i_1086_
                                fs[i_1011_] = i_996_.toFloat()
                            }
                            i_1003_ += i_1007_
                            i_1011_++
                        }
                        i_1004_ += i_1008_
                        i_1003_ = i_1077_
                        i_1011_ += i_1012_
                    }
                    return
                }
                if (i_999_ == 2) {
                    val i_1087_ = i_1000_ ushr 24
                    val i_1088_ = 256 - i_1087_
                    var i_1089_ = (i_1000_ and 0xff00ff) * i_1088_ and 0xff00ff.inv()
                    var i_1090_ = (i_1000_ and 0xff00) * i_1088_ and 0xff0000
                    i_1000_ = (i_1089_ or i_1090_) ushr 8
                    val i_1091_ = i_1003_
                    for (i_1092_ in -i_998_..-1) {
                        val i_1093_ = ((i_1004_ shr 16) * this.anInt8471)
                        for (i_1094_ in -i_997_..-1) {
                            if (i_996_.toFloat() < fs!![i_1011_]) {
                                val i_1095_ = (anIntArray9933[(i_1003_ shr 16) + i_1093_])
                                if (i_1095_ != 0) {
                                    i_1089_ = ((i_1095_ and 0xff00ff) * i_1087_ and 0xff00ff.inv())
                                    i_1090_ = ((i_1095_ and 0xff00) * i_1087_ and 0xff0000)
                                    `is`!![i_1011_] = (((i_1089_ or i_1090_) ushr 8) + i_1000_)
                                    fs[i_1011_] = i_996_.toFloat()
                                }
                            }
                            i_1003_ += i_1007_
                            i_1011_++
                        }
                        i_1004_ += i_1008_
                        i_1003_ = i_1091_
                        i_1011_ += i_1012_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            if (i_1001_ == 2) {
                if (i_999_ == 1) {
                    val i_1096_ = i_1003_
                    for (i_1097_ in -i_998_..-1) {
                        val i_1098_ = ((i_1004_ shr 16) * this.anInt8471)
                        for (i_1099_ in -i_997_..-1) {
                            if (i_996_.toFloat() < fs!![i_1011_]) {
                                val i_1100_ = (anIntArray9933[(i_1003_ shr 16) + i_1098_])
                                if (i_1100_ != 0) {
                                    var i_1101_ = `is`!![i_1011_]
                                    val i_1102_ = i_1100_ + i_1101_
                                    val i_1103_ = ((i_1100_ and 0xff00ff) + (i_1101_ and 0xff00ff))
                                    i_1101_ = ((i_1103_ and 0x1000100) + (i_1102_ - i_1103_ and 0x10000))
                                    `is`[i_1011_] = (i_1102_ - i_1101_ or i_1101_ - (i_1101_ ushr 8))
                                    fs[i_1011_] = i_996_.toFloat()
                                }
                            }
                            i_1003_ += i_1007_
                            i_1011_++
                        }
                        i_1004_ += i_1008_
                        i_1003_ = i_1096_
                        i_1011_ += i_1012_
                    }
                    return
                }
                if (i_999_ == 0) {
                    val i_1104_ = i_1003_
                    val i_1105_ = (i_1000_ and 0xff0000) shr 16
                    val i_1106_ = (i_1000_ and 0xff00) shr 8
                    val i_1107_ = i_1000_ and 0xff
                    for (i_1108_ in -i_998_..-1) {
                        val i_1109_ = ((i_1004_ shr 16) * this.anInt8471)
                        for (i_1110_ in -i_997_..-1) {
                            if (i_996_.toFloat() < fs!![i_1011_]) {
                                var i_1111_ = (anIntArray9933[(i_1003_ shr 16) + i_1109_])
                                if (i_1111_ != 0) {
                                    val i_1112_ = ((i_1111_ and 0xff0000) * i_1105_ and 0xffffff.inv())
                                    val i_1113_ = ((i_1111_ and 0xff00) * i_1106_ and 0xff0000)
                                    val i_1114_ = (i_1111_ and 0xff) * i_1107_ and 0xff00
                                    i_1111_ = (i_1112_ or i_1113_ or i_1114_) ushr 8
                                    var i_1115_ = `is`!![i_1011_]
                                    val i_1116_ = i_1111_ + i_1115_
                                    val i_1117_ = ((i_1111_ and 0xff00ff) + (i_1115_ and 0xff00ff))
                                    i_1115_ = ((i_1117_ and 0x1000100) + (i_1116_ - i_1117_ and 0x10000))
                                    `is`[i_1011_] = (i_1116_ - i_1115_ or i_1115_ - (i_1115_ ushr 8))
                                    fs[i_1011_] = i_996_.toFloat()
                                }
                            }
                            i_1003_ += i_1007_
                            i_1011_++
                        }
                        i_1004_ += i_1008_
                        i_1003_ = i_1104_
                        i_1011_ += i_1012_
                    }
                    return
                }
                if (i_999_ == 3) {
                    val i_1118_ = i_1003_
                    for (i_1119_ in -i_998_..-1) {
                        val i_1120_ = ((i_1004_ shr 16) * this.anInt8471)
                        for (i_1121_ in -i_997_..-1) {
                            if (i_996_.toFloat() < fs!![i_1011_]) {
                                var i_1122_ = (anIntArray9933[(i_1003_ shr 16) + i_1120_])
                                var i_1123_ = i_1122_ + i_1000_
                                var i_1124_ = ((i_1122_ and 0xff00ff) + (i_1000_ and 0xff00ff))
                                var i_1125_ = ((i_1124_ and 0x1000100) + (i_1123_ - i_1124_ and 0x10000))
                                i_1122_ = i_1123_ - i_1125_ or i_1125_ - (i_1125_ ushr 8)
                                i_1125_ = `is`!![i_1011_]
                                i_1123_ = i_1122_ + i_1125_
                                i_1124_ = (i_1122_ and 0xff00ff) + (i_1125_ and 0xff00ff)
                                i_1125_ = ((i_1124_ and 0x1000100) + (i_1123_ - i_1124_ and 0x10000))
                                `is`[i_1011_] = i_1123_ - i_1125_ or i_1125_ - (i_1125_ ushr 8)
                                fs[i_1011_] = i_996_.toFloat()
                            }
                            i_1003_ += i_1007_
                            i_1011_++
                        }
                        i_1004_ += i_1008_
                        i_1003_ = i_1118_
                        i_1011_ += i_1012_
                    }
                    return
                }
                if (i_999_ == 2) {
                    val i_1126_ = i_1000_ ushr 24
                    val i_1127_ = 256 - i_1126_
                    var i_1128_ = (i_1000_ and 0xff00ff) * i_1127_ and 0xff00ff.inv()
                    var i_1129_ = (i_1000_ and 0xff00) * i_1127_ and 0xff0000
                    i_1000_ = (i_1128_ or i_1129_) ushr 8
                    val i_1130_ = i_1003_
                    for (i_1131_ in -i_998_..-1) {
                        val i_1132_ = ((i_1004_ shr 16) * this.anInt8471)
                        for (i_1133_ in -i_997_..-1) {
                            if (i_996_.toFloat() < fs!![i_1011_]) {
                                var i_1134_ = (anIntArray9933[(i_1003_ shr 16) + i_1132_])
                                if (i_1134_ != 0) {
                                    i_1128_ = ((i_1134_ and 0xff00ff) * i_1126_ and 0xff00ff.inv())
                                    i_1129_ = ((i_1134_ and 0xff00) * i_1126_ and 0xff0000)
                                    i_1134_ = (((i_1128_ or i_1129_) ushr 8) + i_1000_)
                                    var i_1135_ = `is`!![i_1011_]
                                    val i_1136_ = i_1134_ + i_1135_
                                    val i_1137_ = ((i_1134_ and 0xff00ff) + (i_1135_ and 0xff00ff))
                                    i_1135_ = ((i_1137_ and 0x1000100) + (i_1136_ - i_1137_ and 0x10000))
                                    `is`[i_1011_] = (i_1136_ - i_1135_ or i_1135_ - (i_1135_ ushr 8))
                                    fs[i_1011_] = i_996_.toFloat()
                                }
                            }
                            i_1003_ += i_1007_
                            i_1011_++
                        }
                        i_1004_ += i_1008_
                        i_1003_ = i_1130_
                        i_1011_ += i_1012_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            throw IllegalArgumentException()
        }
    }
}
