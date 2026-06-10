import kotlin.math.min

/* Class105_Sub3_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class105_Sub3_Sub3 : Class105_Sub3 {
    var anIntArray9936: IntArray

    internal constructor(var_ha_Sub1: ha_Sub1, `is`: IntArray, i: Int, i_0_: Int) : super(var_ha_Sub1, i, i_0_) {
        this.anIntArray9936 = `is`
    }

    internal constructor(var_ha_Sub1: ha_Sub1, `is`: IntArray, i: Int, i_1_: Int, i_2_: Int, i_3_: Int, bool: Boolean) : super(var_ha_Sub1, i_2_, i_3_) {
        var i = i
        var i_1_ = i_1_
        if (bool) this.anIntArray9936 = IntArray(i_2_ * i_3_)
        else this.anIntArray9936 = `is`
        i_1_ -= this.anInt8471
        var i_4_ = 0
        for (i_5_ in 0..<i_3_) {
            for (i_6_ in 0..<i_2_) anIntArray9936[i_4_++] = `is`[i++]
            i += i_1_
        }
    }

    override fun method995(`is`: IntArray?, is_7_: IntArray?, i: Int, i_8_: Int) {
        val is_9_ = aHa_Sub1_8460.anIntArray7483
        if (anInt8481 == 0) {
            if (anInt8450 == 0) {
                var i_10_ = anInt8468
                while (i_10_ < 0) {
                    val i_11_ = i_10_ + i_8_
                    if (i_11_ >= 0) {
                        if (i_11_ >= `is`!!.size) break
                        var i_12_ = anInt8451
                        var i_13_ = anInt8458
                        var i_14_ = anInt8467
                        var i_15_ = anInt8478
                        if (i_13_ >= 0 && i_14_ >= 0 && i_13_ - (this.anInt8471 shl 12) < 0 && i_14_ - (this.anInt8470 shl 12) < 0) {
                            val i_16_ = `is`[i_11_] - i
                            var i_17_ = -is_7_!![i_11_]
                            val i_18_ = i_16_ - (i_12_ - anInt8451)
                            if (i_18_ > 0) {
                                i_12_ += i_18_
                                i_15_ += i_18_
                                i_13_ += anInt8481 * i_18_
                                i_14_ += anInt8450 * i_18_
                            } else i_17_ -= i_18_
                            if (i_15_ < i_17_) i_15_ = i_17_
                            while ( /**/i_15_ < 0) {
                                val i_19_ = (anIntArray9936[(((i_14_ shr 12) * this.anInt8471) + (i_13_ shr 12))])
                                val i_20_ = i_19_ ushr 24
                                val i_21_ = 256 - i_20_
                                val i_22_ = is_9_!![i_12_]
                                is_9_[i_12_++] = ((((i_19_ and 0xff00ff) * i_20_ + (i_22_ and 0xff00ff) * i_21_) and 0xff00ff.inv()) + (((i_19_ and 0xff00) * i_20_ + (i_22_ and 0xff00) * i_21_) and 0xff0000)) shr 8
                                i_15_++
                            }
                        }
                    }
                    i_10_++
                    anInt8451 += anInt8453
                }
            } else if (anInt8450 < 0) {
                var i_23_ = anInt8468
                while (i_23_ < 0) {
                    val i_24_ = i_23_ + i_8_
                    if (i_24_ >= 0) {
                        if (i_24_ >= `is`!!.size) break
                        var i_25_ = anInt8451
                        var i_26_ = anInt8458
                        var i_27_ = (anInt8467 + anInt8475)
                        var i_28_ = anInt8478
                        if (i_26_ >= 0 && i_26_ - (this.anInt8471 shl 12) < 0) {
                            var i_29_: Int
                            if (((i_27_ - (this.anInt8470 shl 12)).also { i_29_ = it }) >= 0) {
                                i_29_ = ((anInt8450 - i_29_) / anInt8450)
                                i_28_ += i_29_
                                i_27_ += anInt8450 * i_29_
                                i_25_ += i_29_
                            }
                            if ((((i_27_ - anInt8450) / anInt8450).also { i_29_ = it }) > i_28_) i_28_ = i_29_
                            val i_30_ = `is`[i_24_] - i
                            var i_31_ = -is_7_!![i_24_]
                            val i_32_ = i_30_ - (i_25_ - anInt8451)
                            if (i_32_ > 0) {
                                i_25_ += i_32_
                                i_28_ += i_32_
                                i_26_ += anInt8481 * i_32_
                                i_27_ += anInt8450 * i_32_
                            } else i_31_ -= i_32_
                            if (i_28_ < i_31_) i_28_ = i_31_
                            while ( /**/i_28_ < 0) {
                                val i_33_ = (anIntArray9936[(((i_27_ shr 12) * this.anInt8471) + (i_26_ shr 12))])
                                val i_34_ = i_33_ ushr 24
                                val i_35_ = 256 - i_34_
                                val i_36_ = is_9_!![i_25_]
                                is_9_[i_25_++] = ((((i_33_ and 0xff00ff) * i_34_ + (i_36_ and 0xff00ff) * i_35_) and 0xff00ff.inv()) + (((i_33_ and 0xff00) * i_34_ + (i_36_ and 0xff00) * i_35_) and 0xff0000)) shr 8
                                i_27_ += anInt8450
                                i_28_++
                            }
                        }
                    }
                    i_23_++
                    anInt8458 += anInt8457
                    anInt8451 += anInt8453
                }
            } else {
                var i_37_ = anInt8468
                while (i_37_ < 0) {
                    val i_38_ = i_37_ + i_8_
                    if (i_38_ >= 0) {
                        if (i_38_ >= `is`!!.size) break
                        var i_39_ = anInt8451
                        var i_40_ = anInt8458
                        var i_41_ = (anInt8467 + anInt8475)
                        var i_42_ = anInt8478
                        if (i_40_ >= 0 && i_40_ - (this.anInt8471 shl 12) < 0) {
                            if (i_41_ < 0) {
                                val i_43_ = ((anInt8450 - 1 - i_41_) / anInt8450)
                                i_42_ += i_43_
                                i_41_ += anInt8450 * i_43_
                                i_39_ += i_43_
                            }
                            val i_44_: Int
                            if ((((1 + i_41_ - (this.anInt8470 shl 12) - anInt8450) / anInt8450).also { i_44_ = it }) > i_42_) i_42_ = i_44_
                            val i_45_ = `is`[i_38_] - i
                            var i_46_ = -is_7_!![i_38_]
                            val i_47_ = i_45_ - (i_39_ - anInt8451)
                            if (i_47_ > 0) {
                                i_39_ += i_47_
                                i_42_ += i_47_
                                i_40_ += anInt8481 * i_47_
                                i_41_ += anInt8450 * i_47_
                            } else i_46_ -= i_47_
                            if (i_42_ < i_46_) i_42_ = i_46_
                            while ( /**/i_42_ < 0) {
                                val i_48_ = (anIntArray9936[(((i_41_ shr 12) * this.anInt8471) + (i_40_ shr 12))])
                                val i_49_ = i_48_ ushr 24
                                val i_50_ = 256 - i_49_
                                val i_51_ = is_9_!![i_39_]
                                is_9_[i_39_++] = ((((i_48_ and 0xff00ff) * i_49_ + (i_51_ and 0xff00ff) * i_50_) and 0xff00ff.inv()) + (((i_48_ and 0xff00) * i_49_ + (i_51_ and 0xff00) * i_50_) and 0xff0000)) shr 8
                                i_41_ += anInt8450
                                i_42_++
                            }
                        }
                    }
                    i_37_++
                    anInt8458 += anInt8457
                    anInt8451 += anInt8453
                }
            }
        } else if (anInt8481 < 0) {
            if (anInt8450 == 0) {
                var i_52_ = anInt8468
                while (i_52_ < 0) {
                    val i_53_ = i_52_ + i_8_
                    if (i_53_ >= 0) {
                        if (i_53_ >= `is`!!.size) break
                        var i_54_ = anInt8451
                        var i_55_ = (anInt8458 + anInt8479)
                        var i_56_ = anInt8467
                        var i_57_ = anInt8478
                        if (i_56_ >= 0 && i_56_ - (this.anInt8470 shl 12) < 0) {
                            var i_58_: Int
                            if (((i_55_ - (this.anInt8471 shl 12)).also { i_58_ = it }) >= 0) {
                                i_58_ = ((anInt8481 - i_58_) / anInt8481)
                                i_57_ += i_58_
                                i_55_ += anInt8481 * i_58_
                                i_54_ += i_58_
                            }
                            if ((((i_55_ - anInt8481) / anInt8481).also { i_58_ = it }) > i_57_) i_57_ = i_58_
                            val i_59_ = `is`[i_53_] - i
                            var i_60_ = -is_7_!![i_53_]
                            val i_61_ = i_59_ - (i_54_ - anInt8451)
                            if (i_61_ > 0) {
                                i_54_ += i_61_
                                i_57_ += i_61_
                                i_55_ += anInt8481 * i_61_
                                i_56_ += anInt8450 * i_61_
                            } else i_60_ -= i_61_
                            if (i_57_ < i_60_) i_57_ = i_60_
                            while ( /**/i_57_ < 0) {
                                val i_62_ = (anIntArray9936[(((i_56_ shr 12) * this.anInt8471) + (i_55_ shr 12))])
                                val i_63_ = i_62_ ushr 24
                                val i_64_ = 256 - i_63_
                                val i_65_ = is_9_!![i_54_]
                                is_9_[i_54_++] = ((((i_62_ and 0xff00ff) * i_63_ + (i_65_ and 0xff00ff) * i_64_) and 0xff00ff.inv()) + (((i_62_ and 0xff00) * i_63_ + (i_65_ and 0xff00) * i_64_) and 0xff0000)) shr 8
                                i_55_ += anInt8481
                                i_57_++
                            }
                        }
                    }
                    i_52_++
                    anInt8467 += anInt8452
                    anInt8451 += anInt8453
                }
            } else if (anInt8450 < 0) {
                var i_66_ = anInt8468
                while (i_66_ < 0) {
                    val i_67_ = i_66_ + i_8_
                    if (i_67_ >= 0) {
                        if (i_67_ >= `is`!!.size) break
                        var i_68_ = anInt8451
                        var i_69_ = (anInt8458 + anInt8479)
                        var i_70_ = (anInt8467 + anInt8475)
                        var i_71_ = anInt8478
                        var i_72_: Int
                        if (((i_69_ - (this.anInt8471 shl 12)).also { i_72_ = it }) >= 0) {
                            i_72_ = ((anInt8481 - i_72_) / anInt8481)
                            i_71_ += i_72_
                            i_69_ += anInt8481 * i_72_
                            i_70_ += anInt8450 * i_72_
                            i_68_ += i_72_
                        }
                        if ((((i_69_ - anInt8481) / anInt8481).also { i_72_ = it }) > i_71_) i_71_ = i_72_
                        if (((i_70_ - (this.anInt8470 shl 12)).also { i_72_ = it }) >= 0) {
                            i_72_ = ((anInt8450 - i_72_) / anInt8450)
                            i_71_ += i_72_
                            i_69_ += anInt8481 * i_72_
                            i_70_ += anInt8450 * i_72_
                            i_68_ += i_72_
                        }
                        if ((((i_70_ - anInt8450) / anInt8450).also { i_72_ = it }) > i_71_) i_71_ = i_72_
                        val i_73_ = `is`[i_67_] - i
                        var i_74_ = -is_7_!![i_67_]
                        val i_75_ = i_73_ - (i_68_ - anInt8451)
                        if (i_75_ > 0) {
                            i_68_ += i_75_
                            i_71_ += i_75_
                            i_69_ += anInt8481 * i_75_
                            i_70_ += anInt8450 * i_75_
                        } else i_74_ -= i_75_
                        if (i_71_ < i_74_) i_71_ = i_74_
                        while ( /**/i_71_ < 0) {
                            val i_76_ = (anIntArray9936[(((i_70_ shr 12) * this.anInt8471) + (i_69_ shr 12))])
                            val i_77_ = i_76_ ushr 24
                            val i_78_ = 256 - i_77_
                            val i_79_ = is_9_!![i_68_]
                            is_9_[i_68_++] = ((((i_76_ and 0xff00ff) * i_77_ + (i_79_ and 0xff00ff) * i_78_) and 0xff00ff.inv()) + (((i_76_ and 0xff00) * i_77_ + (i_79_ and 0xff00) * i_78_) and 0xff0000)) shr 8
                            i_69_ += anInt8481
                            i_70_ += anInt8450
                            i_71_++
                        }
                    }
                    i_66_++
                    anInt8458 += anInt8457
                    anInt8467 += anInt8452
                    anInt8451 += anInt8453
                }
            } else {
                var i_80_ = anInt8468
                while (i_80_ < 0) {
                    val i_81_ = i_80_ + i_8_
                    if (i_81_ >= 0) {
                        if (i_81_ >= `is`!!.size) break
                        var i_82_ = anInt8451
                        var i_83_ = (anInt8458 + anInt8479)
                        var i_84_ = (anInt8467 + anInt8475)
                        var i_85_ = anInt8478
                        var i_86_: Int
                        if (((i_83_ - (this.anInt8471 shl 12)).also { i_86_ = it }) >= 0) {
                            i_86_ = ((anInt8481 - i_86_) / anInt8481)
                            i_85_ += i_86_
                            i_83_ += anInt8481 * i_86_
                            i_84_ += anInt8450 * i_86_
                            i_82_ += i_86_
                        }
                        if ((((i_83_ - anInt8481) / anInt8481).also { i_86_ = it }) > i_85_) i_85_ = i_86_
                        if (i_84_ < 0) {
                            i_86_ = ((anInt8450 - 1 - i_84_) / anInt8450)
                            i_85_ += i_86_
                            i_83_ += anInt8481 * i_86_
                            i_84_ += anInt8450 * i_86_
                            i_82_ += i_86_
                        }
                        if ((((1 + i_84_ - (this.anInt8470 shl 12) - anInt8450) / anInt8450).also { i_86_ = it }) > i_85_) i_85_ = i_86_
                        val i_87_ = `is`[i_81_] - i
                        var i_88_ = -is_7_!![i_81_]
                        val i_89_ = i_87_ - (i_82_ - anInt8451)
                        if (i_89_ > 0) {
                            i_82_ += i_89_
                            i_85_ += i_89_
                            i_83_ += anInt8481 * i_89_
                            i_84_ += anInt8450 * i_89_
                        } else i_88_ -= i_89_
                        if (i_85_ < i_88_) i_85_ = i_88_
                        while ( /**/i_85_ < 0) {
                            val i_90_ = (anIntArray9936[(((i_84_ shr 12) * this.anInt8471) + (i_83_ shr 12))])
                            val i_91_ = i_90_ ushr 24
                            val i_92_ = 256 - i_91_
                            val i_93_ = is_9_!![i_82_]
                            is_9_[i_82_++] = ((((i_90_ and 0xff00ff) * i_91_ + (i_93_ and 0xff00ff) * i_92_) and 0xff00ff.inv()) + (((i_90_ and 0xff00) * i_91_ + (i_93_ and 0xff00) * i_92_) and 0xff0000)) shr 8
                            i_83_ += anInt8481
                            i_84_ += anInt8450
                            i_85_++
                        }
                    }
                    i_80_++
                    anInt8458 += anInt8457
                    anInt8467 += anInt8452
                    anInt8451 += anInt8453
                }
            }
        } else if (anInt8450 == 0) {
            var i_94_ = anInt8468
            while (i_94_ < 0) {
                val i_95_ = i_94_ + i_8_
                if (i_95_ >= 0) {
                    if (i_95_ >= `is`!!.size) break
                    var i_96_ = anInt8451
                    var i_97_ = anInt8458 + anInt8479
                    var i_98_ = anInt8467
                    var i_99_ = anInt8478
                    if (i_98_ >= 0 && i_98_ - (this.anInt8470 shl 12) < 0) {
                        if (i_97_ < 0) {
                            val i_100_ = ((anInt8481 - 1 - i_97_) / anInt8481)
                            i_99_ += i_100_
                            i_97_ += anInt8481 * i_100_
                            i_96_ += i_100_
                        }
                        val i_101_: Int
                        if ((((1 + i_97_ - (this.anInt8471 shl 12) - anInt8481) / anInt8481).also { i_101_ = it }) > i_99_) i_99_ = i_101_
                        val i_102_ = `is`[i_95_] - i
                        var i_103_ = -is_7_!![i_95_]
                        val i_104_ = i_102_ - (i_96_ - anInt8451)
                        if (i_104_ > 0) {
                            i_96_ += i_104_
                            i_99_ += i_104_
                            i_97_ += anInt8481 * i_104_
                            i_98_ += anInt8450 * i_104_
                        } else i_103_ -= i_104_
                        if (i_99_ < i_103_) i_99_ = i_103_
                        while ( /**/i_99_ < 0) {
                            val i_105_ = (anIntArray9936[(((i_98_ shr 12) * this.anInt8471) + (i_97_ shr 12))])
                            val i_106_ = i_105_ ushr 24
                            val i_107_ = 256 - i_106_
                            val i_108_ = is_9_!![i_96_]
                            is_9_[i_96_++] = ((((i_105_ and 0xff00ff) * i_106_ + (i_108_ and 0xff00ff) * i_107_) and 0xff00ff.inv()) + (((i_105_ and 0xff00) * i_106_ + (i_108_ and 0xff00) * i_107_) and 0xff0000)) shr 8
                            i_97_ += anInt8481
                            i_99_++
                        }
                    }
                }
                i_94_++
                anInt8458 += anInt8457
                anInt8467 += anInt8452
                anInt8451 += anInt8453
            }
        } else if (anInt8450 < 0) {
            var i_109_ = anInt8468
            while (i_109_ < 0) {
                val i_110_ = i_109_ + i_8_
                if (i_110_ >= 0) {
                    if (i_110_ >= `is`!!.size) break
                    var i_111_ = anInt8451
                    var i_112_ = anInt8458 + anInt8479
                    var i_113_ = anInt8467 + anInt8475
                    var i_114_ = anInt8478
                    if (i_112_ < 0) {
                        val i_115_ = ((anInt8481 - 1 - i_112_) / anInt8481)
                        i_114_ += i_115_
                        i_112_ += anInt8481 * i_115_
                        i_113_ += anInt8450 * i_115_
                        i_111_ += i_115_
                    }
                    var i_116_: Int
                    if ((((1 + i_112_ - (this.anInt8471 shl 12) - anInt8481) / anInt8481).also { i_116_ = it }) > i_114_) i_114_ = i_116_
                    if (((i_113_ - (this.anInt8470 shl 12)).also { i_116_ = it }) >= 0) {
                        i_116_ = ((anInt8450 - i_116_) / anInt8450)
                        i_114_ += i_116_
                        i_112_ += anInt8481 * i_116_
                        i_113_ += anInt8450 * i_116_
                        i_111_ += i_116_
                    }
                    if ((((i_113_ - anInt8450) / anInt8450).also { i_116_ = it }) > i_114_) i_114_ = i_116_
                    val i_117_ = `is`[i_110_] - i
                    var i_118_ = -is_7_!![i_110_]
                    val i_119_ = i_117_ - (i_111_ - anInt8451)
                    if (i_119_ > 0) {
                        i_111_ += i_119_
                        i_114_ += i_119_
                        i_112_ += anInt8481 * i_119_
                        i_113_ += anInt8450 * i_119_
                    } else i_118_ -= i_119_
                    if (i_114_ < i_118_) i_114_ = i_118_
                    while ( /**/i_114_ < 0) {
                        val i_120_ = (anIntArray9936[(((i_113_ shr 12) * this.anInt8471) + (i_112_ shr 12))])
                        val i_121_ = i_120_ ushr 24
                        val i_122_ = 256 - i_121_
                        val i_123_ = is_9_!![i_111_]
                        is_9_[i_111_++] = ((((i_120_ and 0xff00ff) * i_121_ + (i_123_ and 0xff00ff) * i_122_) and 0xff00ff.inv()) + (((i_120_ and 0xff00) * i_121_ + (i_123_ and 0xff00) * i_122_) and 0xff0000)) shr 8
                        i_112_ += anInt8481
                        i_113_ += anInt8450
                        i_114_++
                    }
                }
                i_109_++
                anInt8458 += anInt8457
                anInt8467 += anInt8452
                anInt8451 += anInt8453
            }
        } else {
            var i_124_ = anInt8468
            while (i_124_ < 0) {
                val i_125_ = i_124_ + i_8_
                if (i_125_ >= 0) {
                    if (i_125_ >= `is`!!.size) break
                    var i_126_ = anInt8451
                    var i_127_ = anInt8458 + anInt8479
                    var i_128_ = anInt8467 + anInt8475
                    var i_129_ = anInt8478
                    if (i_127_ < 0) {
                        val i_130_ = ((anInt8481 - 1 - i_127_) / anInt8481)
                        i_129_ += i_130_
                        i_127_ += anInt8481 * i_130_
                        i_128_ += anInt8450 * i_130_
                        i_126_ += i_130_
                    }
                    var i_131_: Int
                    if ((((1 + i_127_ - (this.anInt8471 shl 12) - anInt8481) / anInt8481).also { i_131_ = it }) > i_129_) i_129_ = i_131_
                    if (i_128_ < 0) {
                        i_131_ = ((anInt8450 - 1 - i_128_) / anInt8450)
                        i_129_ += i_131_
                        i_127_ += anInt8481 * i_131_
                        i_128_ += anInt8450 * i_131_
                        i_126_ += i_131_
                    }
                    if ((((1 + i_128_ - (this.anInt8470 shl 12) - anInt8450) / anInt8450).also { i_131_ = it }) > i_129_) i_129_ = i_131_
                    val i_132_ = `is`[i_125_] - i
                    var i_133_ = -is_7_!![i_125_]
                    val i_134_ = i_132_ - (i_126_ - anInt8451)
                    if (i_134_ > 0) {
                        i_126_ += i_134_
                        i_129_ += i_134_
                        i_127_ += anInt8481 * i_134_
                        i_128_ += anInt8450 * i_134_
                    } else i_133_ -= i_134_
                    if (i_129_ < i_133_) i_129_ = i_133_
                    while ( /**/i_129_ < 0) {
                        val i_135_ = (anIntArray9936[(((i_128_ shr 12) * this.anInt8471) + (i_127_ shr 12))])
                        val i_136_ = i_135_ ushr 24
                        val i_137_ = 256 - i_136_
                        val i_138_ = is_9_!![i_126_]
                        is_9_[i_126_++] = ((((i_135_ and 0xff00ff) * i_136_ + (i_138_ and 0xff00ff) * i_137_) and 0xff00ff.inv()) + (((i_135_ and 0xff00) * i_136_ + (i_138_ and 0xff00) * i_137_) and 0xff0000)) shr 8
                        i_127_ += anInt8481
                        i_128_ += anInt8450
                        i_129_++
                    }
                }
                i_124_++
                anInt8458 += anInt8457
                anInt8467 += anInt8452
                anInt8451 += anInt8453
            }
        }
    }

    override fun method979(i: Int, i_139_: Int, i_140_: Int, i_141_: Int, i_142_: Int, i_143_: Int) {
        val `is` = aHa_Sub1_8460.anIntArray7483
        for (i_144_ in 0..<i_141_) {
            val i_145_ = (i_139_ + i_144_) * i_140_ + i
            val i_146_ = (i_143_ + i_144_) * i_140_ + i_142_
            for (i_147_ in 0..<i_140_) anIntArray9936[i_145_ + i_147_] = `is`!![i_146_ + i_147_] and 0xffffff
        }
    }

    override fun method964(i: Int, i_148_: Int, i_149_: Int, i_150_: Int, i_151_: Int) {
        var i = i
        var i_148_ = i_148_
        var i_150_ = i_150_
        check(!aHa_Sub1_8460.method3716())
        val i_152_ = aHa_Sub1_8460.anInt7477
        i += this.anInt8461
        i_148_ += this.anInt8464
        var i_153_ = i_148_ * i_152_ + i
        var i_154_ = 0
        var i_155_ = this.anInt8470
        var i_156_ = this.anInt8471
        var i_157_ = i_152_ - i_156_
        var i_158_ = 0
        if (i_148_ < aHa_Sub1_8460.anInt7476) {
            val i_159_ = (aHa_Sub1_8460.anInt7476 - i_148_)
            i_155_ -= i_159_
            i_148_ = aHa_Sub1_8460.anInt7476
            i_154_ += i_159_ * i_156_
            i_153_ += i_159_ * i_152_
        }
        if (i_148_ + i_155_ > aHa_Sub1_8460.anInt7503) i_155_ -= i_148_ + i_155_ - aHa_Sub1_8460.anInt7503
        if (i < aHa_Sub1_8460.anInt7496) {
            val i_160_ = (aHa_Sub1_8460.anInt7496 - i)
            i_156_ -= i_160_
            i = aHa_Sub1_8460.anInt7496
            i_154_ += i_160_
            i_153_ += i_160_
            i_158_ += i_160_
            i_157_ += i_160_
        }
        if (i + i_156_ > aHa_Sub1_8460.anInt7507) {
            val i_161_ = (i + i_156_ - (aHa_Sub1_8460.anInt7507))
            i_156_ -= i_161_
            i_158_ += i_161_
            i_157_ += i_161_
        }
        if (i_156_ > 0 && i_155_ > 0) {
            val `is` = (aHa_Sub1_8460.anIntArray7483)
            if (i_151_ == 0) {
                if (i_149_ == 1) {
                    for (i_162_ in -i_155_..-1) {
                        var i_163_ = i_153_ + i_156_ - 3
                        while (i_153_ < i_163_) {
                            `is`!![i_153_++] = (anIntArray9936[i_154_++])
                            `is`[i_153_++] = (anIntArray9936[i_154_++])
                            `is`[i_153_++] = (anIntArray9936[i_154_++])
                            `is`[i_153_++] = (anIntArray9936[i_154_++])
                        }
                        i_163_ += 3
                        while (i_153_ < i_163_) `is`!![i_153_++] = (anIntArray9936[i_154_++])
                        i_153_ += i_157_
                        i_154_ += i_158_
                    }
                    return
                }
                if (i_149_ == 0) {
                    val i_164_ = (i_150_ and 0xff0000) shr 16
                    val i_165_ = (i_150_ and 0xff00) shr 8
                    val i_166_ = i_150_ and 0xff
                    for (i_167_ in -i_155_..-1) {
                        for (i_168_ in -i_156_..-1) {
                            val i_169_ = (anIntArray9936[i_154_++])
                            val i_170_ = (i_169_ and 0xff0000) * i_164_ and 0xffffff.inv()
                            val i_171_ = (i_169_ and 0xff00) * i_165_ and 0xff0000
                            val i_172_ = (i_169_ and 0xff) * i_166_ and 0xff00
                            `is`!![i_153_++] = (i_170_ or i_171_ or i_172_) ushr 8
                        }
                        i_153_ += i_157_
                        i_154_ += i_158_
                    }
                    return
                }
                if (i_149_ == 3) {
                    for (i_173_ in -i_155_..-1) {
                        for (i_174_ in -i_156_..-1) {
                            val i_175_ = (anIntArray9936[i_154_++])
                            val i_176_ = i_175_ + i_150_
                            val i_177_ = (i_175_ and 0xff00ff) + (i_150_ and 0xff00ff)
                            val i_178_ = ((i_177_ and 0x1000100) + (i_176_ - i_177_ and 0x10000))
                            `is`!![i_153_++] = i_176_ - i_178_ or i_178_ - (i_178_ ushr 8)
                        }
                        i_153_ += i_157_
                        i_154_ += i_158_
                    }
                    return
                }
                if (i_149_ == 2) {
                    val i_179_ = i_150_ ushr 24
                    val i_180_ = 256 - i_179_
                    var i_181_ = (i_150_ and 0xff00ff) * i_180_ and 0xff00ff.inv()
                    var i_182_ = (i_150_ and 0xff00) * i_180_ and 0xff0000
                    i_150_ = (i_181_ or i_182_) ushr 8
                    for (i_183_ in -i_155_..-1) {
                        for (i_184_ in -i_156_..-1) {
                            val i_185_ = (anIntArray9936[i_154_++])
                            i_181_ = (i_185_ and 0xff00ff) * i_179_ and 0xff00ff.inv()
                            i_182_ = (i_185_ and 0xff00) * i_179_ and 0xff0000
                            `is`!![i_153_++] = ((i_181_ or i_182_) ushr 8) + i_150_
                        }
                        i_153_ += i_157_
                        i_154_ += i_158_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            if (i_151_ == 1) {
                if (i_149_ == 1) {
                    for (i_186_ in -i_155_..-1) {
                        for (i_187_ in -i_156_..-1) {
                            val i_188_ = (anIntArray9936[i_154_++])
                            val i_189_ = i_188_ ushr 24
                            val i_190_ = 256 - i_189_
                            val i_191_ = `is`!![i_153_]
                            `is`[i_153_++] = (((((i_188_ and 0xff00ff) * i_189_ + (i_191_ and 0xff00ff) * i_190_) and 0xff00ff.inv()) shr 8) + ((((i_188_ and 0xff00ff.inv()) ushr 8) * i_189_ + ((i_191_ and 0xff00ff.inv()) ushr 8) * i_190_) and 0xff00ff.inv()))
                        }
                        i_153_ += i_157_
                        i_154_ += i_158_
                    }
                    return
                }
                if (i_149_ == 0) {
                    if ((i_150_ and 0xffffff) == 16777215) {
                        for (i_192_ in -i_155_..-1) {
                            for (i_193_ in -i_156_..-1) {
                                val i_194_ = (anIntArray9936[i_154_++])
                                val i_195_ = (i_194_ ushr 24) * (i_150_ ushr 24) shr 8
                                val i_196_ = 256 - i_195_
                                val i_197_ = `is`!![i_153_]
                                `is`[i_153_++] = ((((i_194_ and 0xff00ff) * i_195_ + (i_197_ and 0xff00ff) * i_196_) and 0xff00ff.inv()) + (((i_194_ and 0xff00) * i_195_ + (i_197_ and 0xff00) * i_196_) and 0xff0000)) shr 8
                            }
                            i_153_ += i_157_
                            i_154_ += i_158_
                        }
                    } else {
                        val i_198_ = (i_150_ and 0xff0000) shr 16
                        val i_199_ = (i_150_ and 0xff00) shr 8
                        val i_200_ = i_150_ and 0xff
                        for (i_201_ in -i_155_..-1) {
                            for (i_202_ in -i_156_..-1) {
                                var i_203_ = (anIntArray9936[i_154_++])
                                val i_204_ = (i_203_ ushr 24) * (i_150_ ushr 24) shr 8
                                val i_205_ = 256 - i_204_
                                if (i_204_ == 255) {
                                    val i_210_ = ((i_203_ and 0xff0000) * i_198_ and 0xffffff.inv())
                                    val i_211_ = ((i_203_ and 0xff00) * i_199_ and 0xff0000)
                                    val i_212_ = (i_203_ and 0xff) * i_200_ and 0xff00
                                    `is`!![i_153_++] = (i_210_ or i_211_ or i_212_) ushr 8
                                } else {
                                    val i_206_ = ((i_203_ and 0xff0000) * i_198_ and 0xffffff.inv())
                                    val i_207_ = ((i_203_ and 0xff00) * i_199_ and 0xff0000)
                                    val i_208_ = (i_203_ and 0xff) * i_200_ and 0xff00
                                    i_203_ = (i_206_ or i_207_ or i_208_) ushr 8
                                    val i_209_ = `is`!![i_153_]
                                    `is`[i_153_++] = ((((i_203_ and 0xff00ff) * i_204_ + (i_209_ and 0xff00ff) * i_205_) and 0xff00ff.inv()) + (((i_203_ and 0xff00) * i_204_ + (i_209_ and 0xff00) * i_205_) and 0xff0000)) shr 8
                                }
                            }
                            i_153_ += i_157_
                            i_154_ += i_158_
                        }
                        return
                    }
                    return
                }
                if (i_149_ == 3) {
                    for (i_213_ in -i_155_..-1) {
                        for (i_214_ in -i_156_..-1) {
                            var i_215_ = (anIntArray9936[i_154_++])
                            val i_216_ = i_215_ + i_150_
                            val i_217_ = (i_215_ and 0xff00ff) + (i_150_ and 0xff00ff)
                            var i_218_ = ((i_217_ and 0x1000100) + (i_216_ - i_217_ and 0x10000))
                            i_218_ = i_216_ - i_218_ or i_218_ - (i_218_ ushr 8)
                            val i_219_ = (i_218_ ushr 24) * (i_150_ ushr 24) shr 8
                            val i_220_ = 256 - i_219_
                            if (i_219_ != 255) {
                                i_215_ = i_218_
                                i_218_ = `is`!![i_153_]
                                i_218_ = ((((i_215_ and 0xff00ff) * i_219_ + (i_218_ and 0xff00ff) * i_220_) and 0xff00ff.inv()) + (((i_215_ and 0xff00) * i_219_ + (i_218_ and 0xff00) * i_220_) and 0xff0000)) shr 8
                            }
                            `is`!![i_153_++] = i_218_
                        }
                        i_153_ += i_157_
                        i_154_ += i_158_
                    }
                    return
                }
                if (i_149_ == 2) {
                    val i_221_ = i_150_ ushr 24
                    val i_222_ = 256 - i_221_
                    var i_223_ = (i_150_ and 0xff00ff) * i_222_ and 0xff00ff.inv()
                    var i_224_ = (i_150_ and 0xff00) * i_222_ and 0xff0000
                    i_150_ = (i_223_ or i_224_) ushr 8
                    for (i_225_ in -i_155_..-1) {
                        for (i_226_ in -i_156_..-1) {
                            var i_227_ = (anIntArray9936[i_154_++])
                            val i_228_ = i_227_ ushr 24
                            val i_229_ = 256 - i_228_
                            i_223_ = (i_227_ and 0xff00ff) * i_221_ and 0xff00ff.inv()
                            i_224_ = (i_227_ and 0xff00) * i_221_ and 0xff0000
                            i_227_ = ((i_223_ or i_224_) ushr 8) + i_150_
                            val i_230_ = `is`!![i_153_]
                            `is`[i_153_++] = ((((i_227_ and 0xff00ff) * i_228_ + (i_230_ and 0xff00ff) * i_229_) and 0xff00ff.inv()) + (((i_227_ and 0xff00) * i_228_ + (i_230_ and 0xff00) * i_229_) and 0xff0000)) shr 8
                        }
                        i_153_ += i_157_
                        i_154_ += i_158_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            if (i_151_ == 2) {
                if (i_149_ == 1) {
                    for (i_231_ in -i_155_..-1) {
                        for (i_232_ in -i_156_..-1) {
                            val i_233_ = (anIntArray9936[i_154_++])
                            if (i_233_ != 0) {
                                var i_234_ = `is`!![i_153_]
                                val i_235_ = i_233_ + i_234_
                                val i_236_ = ((i_233_ and 0xff00ff) + (i_234_ and 0xff00ff))
                                i_234_ = (i_236_ and 0x1000100) + (i_235_ - i_236_ and 0x10000)
                                `is`[i_153_++] = i_235_ - i_234_ or i_234_ - (i_234_ ushr 8)
                            } else i_153_++
                        }
                        i_153_ += i_157_
                        i_154_ += i_158_
                    }
                    return
                }
                if (i_149_ == 0) {
                    val i_237_ = (i_150_ and 0xff0000) shr 16
                    val i_238_ = (i_150_ and 0xff00) shr 8
                    val i_239_ = i_150_ and 0xff
                    for (i_240_ in -i_155_..-1) {
                        for (i_241_ in -i_156_..-1) {
                            var i_242_ = (anIntArray9936[i_154_++])
                            if (i_242_ != 0) {
                                val i_243_ = (i_242_ and 0xff0000) * i_237_ and 0xffffff.inv()
                                val i_244_ = (i_242_ and 0xff00) * i_238_ and 0xff0000
                                val i_245_ = (i_242_ and 0xff) * i_239_ and 0xff00
                                i_242_ = (i_243_ or i_244_ or i_245_) ushr 8
                                var i_246_ = `is`!![i_153_]
                                val i_247_ = i_242_ + i_246_
                                val i_248_ = ((i_242_ and 0xff00ff) + (i_246_ and 0xff00ff))
                                i_246_ = (i_248_ and 0x1000100) + (i_247_ - i_248_ and 0x10000)
                                `is`[i_153_++] = i_247_ - i_246_ or i_246_ - (i_246_ ushr 8)
                            } else i_153_++
                        }
                        i_153_ += i_157_
                        i_154_ += i_158_
                    }
                    return
                }
                if (i_149_ == 3) {
                    for (i_249_ in -i_155_..-1) {
                        for (i_250_ in -i_156_..-1) {
                            var i_251_ = (anIntArray9936[i_154_++])
                            var i_252_ = i_251_ + i_150_
                            var i_253_ = (i_251_ and 0xff00ff) + (i_150_ and 0xff00ff)
                            var i_254_ = ((i_253_ and 0x1000100) + (i_252_ - i_253_ and 0x10000))
                            i_251_ = i_252_ - i_254_ or i_254_ - (i_254_ ushr 8)
                            i_254_ = `is`!![i_153_]
                            i_252_ = i_251_ + i_254_
                            i_253_ = (i_251_ and 0xff00ff) + (i_254_ and 0xff00ff)
                            i_254_ = (i_253_ and 0x1000100) + (i_252_ - i_253_ and 0x10000)
                            `is`[i_153_++] = i_252_ - i_254_ or i_254_ - (i_254_ ushr 8)
                        }
                        i_153_ += i_157_
                        i_154_ += i_158_
                    }
                    return
                }
                if (i_149_ == 2) {
                    val i_255_ = i_150_ ushr 24
                    val i_256_ = 256 - i_255_
                    var i_257_ = (i_150_ and 0xff00ff) * i_256_ and 0xff00ff.inv()
                    var i_258_ = (i_150_ and 0xff00) * i_256_ and 0xff0000
                    i_150_ = (i_257_ or i_258_) ushr 8
                    for (i_259_ in -i_155_..-1) {
                        for (i_260_ in -i_156_..-1) {
                            var i_261_ = (anIntArray9936[i_154_++])
                            if (i_261_ != 0) {
                                i_257_ = (i_261_ and 0xff00ff) * i_255_ and 0xff00ff.inv()
                                i_258_ = (i_261_ and 0xff00) * i_255_ and 0xff0000
                                i_261_ = ((i_257_ or i_258_) ushr 8) + i_150_
                                var i_262_ = `is`!![i_153_]
                                val i_263_ = i_261_ + i_262_
                                val i_264_ = ((i_261_ and 0xff00ff) + (i_262_ and 0xff00ff))
                                i_262_ = (i_264_ and 0x1000100) + (i_263_ - i_264_ and 0x10000)
                                `is`[i_153_++] = i_263_ - i_262_ or i_262_ - (i_262_ ushr 8)
                            } else i_153_++
                        }
                        i_153_ += i_157_
                        i_154_ += i_158_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            throw IllegalArgumentException()
        }
    }

    override fun method963(i: Int, i_265_: Int, var_aa: aa?, i_266_: Int, i_267_: Int) {
        var i = i
        var i_265_ = i_265_
        check(!aHa_Sub1_8460.method3716())
        i += this.anInt8461
        i_265_ += this.anInt8464
        var i_268_ = 0
        val i_269_ = aHa_Sub1_8460.anInt7477
        var i_270_ = this.anInt8471
        var i_271_ = this.anInt8470
        var i_272_ = i_269_ - i_270_
        var i_273_ = 0
        var i_274_ = i + i_265_ * i_269_
        if (i_265_ < aHa_Sub1_8460.anInt7476) {
            val i_275_ = (aHa_Sub1_8460.anInt7476 - i_265_)
            i_271_ -= i_275_
            i_265_ = aHa_Sub1_8460.anInt7476
            i_268_ += i_275_ * i_270_
            i_274_ += i_275_ * i_269_
        }
        if (i_265_ + i_271_ > aHa_Sub1_8460.anInt7503) i_271_ -= i_265_ + i_271_ - aHa_Sub1_8460.anInt7503
        if (i < aHa_Sub1_8460.anInt7496) {
            val i_276_ = (aHa_Sub1_8460.anInt7496 - i)
            i_270_ -= i_276_
            i = aHa_Sub1_8460.anInt7496
            i_268_ += i_276_
            i_274_ += i_276_
            i_273_ += i_276_
            i_272_ += i_276_
        }
        if (i + i_270_ > aHa_Sub1_8460.anInt7507) {
            val i_277_ = (i + i_270_ - (aHa_Sub1_8460.anInt7507))
            i_270_ -= i_277_
            i_273_ += i_277_
            i_272_ += i_277_
        }
        if (i_270_ > 0 && i_271_ > 0) {
            val var_aa_Sub3 = var_aa as aa_Sub3?
            val `is` = var_aa_Sub3!!.anIntArray5201
            val is_278_ = var_aa_Sub3.anIntArray5202
            val is_279_ = (aHa_Sub1_8460.anIntArray7483)
            var i_280_ = i_265_
            if (i_267_ > i_280_) {
                i_280_ = i_267_
                i_274_ += (i_267_ - i_265_) * i_269_
                i_268_ += (i_267_ - i_265_) * this.anInt8471
            }
            val i_281_ = (min(i_267_ + `is`!!.size, i_265_ + i_271_))
            for (i_282_ in i_280_..<i_281_) {
                val i_283_ = `is`[i_282_ - i_267_] + i_266_
                var i_284_ = is_278_!![i_282_ - i_267_]
                var i_285_ = i_270_
                if (i > i_283_) {
                    val i_286_ = i - i_283_
                    if (i_286_ >= i_284_) {
                        i_268_ += i_270_ + i_273_
                        i_274_ += i_270_ + i_272_
                        continue
                    }
                    i_284_ -= i_286_
                } else {
                    val i_287_ = i_283_ - i
                    if (i_287_ >= i_270_) {
                        i_268_ += i_270_ + i_273_
                        i_274_ += i_270_ + i_272_
                        continue
                    }
                    i_268_ += i_287_
                    i_285_ -= i_287_
                    i_274_ += i_287_
                }
                var i_288_ = 0
                if (i_285_ < i_284_) i_284_ = i_285_
                else i_288_ = i_285_ - i_284_
                for (i_289_ in -i_284_..-1) {
                    val i_290_ = anIntArray9936[i_268_++]
                    val i_291_ = i_290_ ushr 24
                    val i_292_ = 256 - i_291_
                    val i_293_ = is_279_!![i_274_]
                    is_279_[i_274_++] = ((((i_290_ and 0xff00ff) * i_291_ + (i_293_ and 0xff00ff) * i_292_) and 0xff00ff.inv()) + (((i_290_ and 0xff00) * i_291_ + (i_293_ and 0xff00) * i_292_) and 0xff0000)) shr 8
                }
                i_268_ += i_288_ + i_273_
                i_274_ += i_288_ + i_272_
            }
        }
    }

    override fun method982(i: Int, i_294_: Int, i_295_: Int, i_296_: Int, i_297_: Int, i_298_: Int, i_299_: Int, i_300_: Int) {
        var i = i
        var i_294_ = i_294_
        var i_295_ = i_295_
        var i_296_ = i_296_
        var i_298_ = i_298_
        check(!aHa_Sub1_8460.method3716())
        if (i_295_ > 0 && i_296_ > 0) {
            var i_301_ = 0
            var i_302_ = 0
            val i_303_ = aHa_Sub1_8460.anInt7477
            val i_304_ = (this.anInt8461 + this.anInt8471 + this.anInt8454)
            val i_305_ = (this.anInt8464 + this.anInt8470 + this.anInt8456)
            val i_306_ = (i_304_ shl 16) / i_295_
            val i_307_ = (i_305_ shl 16) / i_296_
            if (this.anInt8461 > 0) {
                val i_308_ = (((this.anInt8461 shl 16) + i_306_ - 1) / i_306_)
                i += i_308_
                i_301_ += i_308_ * i_306_ - (this.anInt8461 shl 16)
            }
            if (this.anInt8464 > 0) {
                val i_309_ = (((this.anInt8464 shl 16) + i_307_ - 1) / i_307_)
                i_294_ += i_309_
                i_302_ += i_309_ * i_307_ - (this.anInt8464 shl 16)
            }
            if (this.anInt8471 < i_304_) i_295_ = ((this.anInt8471 shl 16) - i_301_ + i_306_ - 1) / i_306_
            if (this.anInt8470 < i_305_) i_296_ = ((this.anInt8470 shl 16) - i_302_ + i_307_ - 1) / i_307_
            var i_310_ = i + i_294_ * i_303_
            var i_311_ = i_303_ - i_295_
            if (i_294_ + i_296_ > aHa_Sub1_8460.anInt7503) i_296_ -= (i_294_ + i_296_ - (aHa_Sub1_8460.anInt7503))
            if (i_294_ < aHa_Sub1_8460.anInt7476) {
                val i_312_ = ((aHa_Sub1_8460.anInt7476) - i_294_)
                i_296_ -= i_312_
                i_310_ += i_312_ * i_303_
                i_302_ += i_307_ * i_312_
            }
            if (i + i_295_ > aHa_Sub1_8460.anInt7507) {
                val i_313_ = (i + i_295_ - (aHa_Sub1_8460.anInt7507))
                i_295_ -= i_313_
                i_311_ += i_313_
            }
            if (i < aHa_Sub1_8460.anInt7496) {
                val i_314_ = ((aHa_Sub1_8460.anInt7496) - i)
                i_295_ -= i_314_
                i_310_ += i_314_
                i_301_ += i_306_ * i_314_
                i_311_ += i_314_
            }
            val `is` = (aHa_Sub1_8460.anIntArray7483)
            if (i_299_ == 0) {
                if (i_297_ == 1) {
                    val i_315_ = i_301_
                    for (i_316_ in -i_296_..-1) {
                        val i_317_ = ((i_302_ shr 16) * this.anInt8471)
                        for (i_318_ in -i_295_..-1) {
                            `is`!![i_310_++] = (anIntArray9936[(i_301_ shr 16) + i_317_])
                            i_301_ += i_306_
                        }
                        i_302_ += i_307_
                        i_301_ = i_315_
                        i_310_ += i_311_
                    }
                    return
                }
                if (i_297_ == 0) {
                    val i_319_ = (i_298_ and 0xff0000) shr 16
                    val i_320_ = (i_298_ and 0xff00) shr 8
                    val i_321_ = i_298_ and 0xff
                    val i_322_ = i_301_
                    for (i_323_ in -i_296_..-1) {
                        val i_324_ = ((i_302_ shr 16) * this.anInt8471)
                        for (i_325_ in -i_295_..-1) {
                            val i_326_ = (anIntArray9936[(i_301_ shr 16) + i_324_])
                            val i_327_ = (i_326_ and 0xff0000) * i_319_ and 0xffffff.inv()
                            val i_328_ = (i_326_ and 0xff00) * i_320_ and 0xff0000
                            val i_329_ = (i_326_ and 0xff) * i_321_ and 0xff00
                            `is`!![i_310_++] = (i_327_ or i_328_ or i_329_) ushr 8
                            i_301_ += i_306_
                        }
                        i_302_ += i_307_
                        i_301_ = i_322_
                        i_310_ += i_311_
                    }
                    return
                }
                if (i_297_ == 3) {
                    val i_330_ = i_301_
                    for (i_331_ in -i_296_..-1) {
                        val i_332_ = ((i_302_ shr 16) * this.anInt8471)
                        for (i_333_ in -i_295_..-1) {
                            val i_334_ = (anIntArray9936[(i_301_ shr 16) + i_332_])
                            val i_335_ = i_334_ + i_298_
                            val i_336_ = (i_334_ and 0xff00ff) + (i_298_ and 0xff00ff)
                            val i_337_ = ((i_336_ and 0x1000100) + (i_335_ - i_336_ and 0x10000))
                            `is`!![i_310_++] = i_335_ - i_337_ or i_337_ - (i_337_ ushr 8)
                            i_301_ += i_306_
                        }
                        i_302_ += i_307_
                        i_301_ = i_330_
                        i_310_ += i_311_
                    }
                    return
                }
                if (i_297_ == 2) {
                    val i_338_ = i_298_ ushr 24
                    val i_339_ = 256 - i_338_
                    var i_340_ = (i_298_ and 0xff00ff) * i_339_ and 0xff00ff.inv()
                    var i_341_ = (i_298_ and 0xff00) * i_339_ and 0xff0000
                    i_298_ = (i_340_ or i_341_) ushr 8
                    val i_342_ = i_301_
                    for (i_343_ in -i_296_..-1) {
                        val i_344_ = ((i_302_ shr 16) * this.anInt8471)
                        for (i_345_ in -i_295_..-1) {
                            val i_346_ = (anIntArray9936[(i_301_ shr 16) + i_344_])
                            i_340_ = (i_346_ and 0xff00ff) * i_338_ and 0xff00ff.inv()
                            i_341_ = (i_346_ and 0xff00) * i_338_ and 0xff0000
                            `is`!![i_310_++] = ((i_340_ or i_341_) ushr 8) + i_298_
                            i_301_ += i_306_
                        }
                        i_302_ += i_307_
                        i_301_ = i_342_
                        i_310_ += i_311_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            if (i_299_ == 1) {
                if (i_297_ == 1) {
                    val i_347_ = i_301_
                    for (i_348_ in -i_296_..-1) {
                        val i_349_ = ((i_302_ shr 16) * this.anInt8471)
                        for (i_350_ in -i_295_..-1) {
                            val i_351_ = (anIntArray9936[(i_301_ shr 16) + i_349_])
                            val i_352_ = i_351_ ushr 24
                            val i_353_ = 256 - i_352_
                            val i_354_ = `is`!![i_310_]
                            `is`[i_310_++] = (((((i_351_ and 0xff00ff) * i_352_ + (i_354_ and 0xff00ff) * i_353_) and 0xff00ff.inv()) shr 8) + ((((i_351_ and 0xff00ff.inv()) ushr 8) * i_352_ + ((i_354_ and 0xff00ff.inv()) ushr 8) * i_353_) and 0xff00ff.inv()))
                            i_301_ += i_306_
                        }
                        i_302_ += i_307_
                        i_301_ = i_347_
                        i_310_ += i_311_
                    }
                    return
                }
                if (i_297_ == 0) {
                    val i_355_ = i_301_
                    if ((i_298_ and 0xffffff) == 16777215) {
                        for (i_356_ in -i_296_..-1) {
                            val i_357_ = ((i_302_ shr 16) * this.anInt8471)
                            for (i_358_ in -i_295_..-1) {
                                val i_359_ = (anIntArray9936[(i_301_ shr 16) + i_357_])
                                val i_360_ = (i_359_ ushr 24) * (i_298_ ushr 24) shr 8
                                val i_361_ = 256 - i_360_
                                val i_362_ = `is`!![i_310_]
                                `is`[i_310_++] = ((((i_359_ and 0xff00ff) * i_360_ + (i_362_ and 0xff00ff) * i_361_) and 0xff00ff.inv()) + (((i_359_ and 0xff00) * i_360_ + (i_362_ and 0xff00) * i_361_) and 0xff0000)) shr 8
                                i_301_ += i_306_
                            }
                            i_302_ += i_307_
                            i_301_ = i_355_
                            i_310_ += i_311_
                        }
                    } else {
                        val i_363_ = (i_298_ and 0xff0000) shr 16
                        val i_364_ = (i_298_ and 0xff00) shr 8
                        val i_365_ = i_298_ and 0xff
                        for (i_366_ in -i_296_..-1) {
                            val i_367_ = ((i_302_ shr 16) * this.anInt8471)
                            for (i_368_ in -i_295_..-1) {
                                var i_369_ = (anIntArray9936[(i_301_ shr 16) + i_367_])
                                val i_370_ = (i_369_ ushr 24) * (i_298_ ushr 24) shr 8
                                val i_371_ = 256 - i_370_
                                if (i_370_ == 255) {
                                    val i_376_ = ((i_369_ and 0xff0000) * i_363_ and 0xffffff.inv())
                                    val i_377_ = ((i_369_ and 0xff00) * i_364_ and 0xff0000)
                                    val i_378_ = (i_369_ and 0xff) * i_365_ and 0xff00
                                    `is`!![i_310_++] = (i_376_ or i_377_ or i_378_) ushr 8
                                } else {
                                    val i_372_ = ((i_369_ and 0xff0000) * i_363_ and 0xffffff.inv())
                                    val i_373_ = ((i_369_ and 0xff00) * i_364_ and 0xff0000)
                                    val i_374_ = (i_369_ and 0xff) * i_365_ and 0xff00
                                    i_369_ = (i_372_ or i_373_ or i_374_) ushr 8
                                    val i_375_ = `is`!![i_310_]
                                    `is`[i_310_++] = ((((i_369_ and 0xff00ff) * i_370_ + (i_375_ and 0xff00ff) * i_371_) and 0xff00ff.inv()) + (((i_369_ and 0xff00) * i_370_ + (i_375_ and 0xff00) * i_371_) and 0xff0000)) shr 8
                                }
                                i_301_ += i_306_
                            }
                            i_302_ += i_307_
                            i_301_ = i_355_
                            i_310_ += i_311_
                        }
                        return
                    }
                    return
                }
                if (i_297_ == 3) {
                    val i_379_ = i_301_
                    for (i_380_ in -i_296_..-1) {
                        val i_381_ = ((i_302_ shr 16) * this.anInt8471)
                        for (i_382_ in -i_295_..-1) {
                            var i_383_ = (anIntArray9936[(i_301_ shr 16) + i_381_])
                            val i_384_ = i_383_ + i_298_
                            val i_385_ = (i_383_ and 0xff00ff) + (i_298_ and 0xff00ff)
                            var i_386_ = ((i_385_ and 0x1000100) + (i_384_ - i_385_ and 0x10000))
                            i_386_ = i_384_ - i_386_ or i_386_ - (i_386_ ushr 8)
                            val i_387_ = (i_386_ ushr 24) * (i_298_ ushr 24) shr 8
                            val i_388_ = 256 - i_387_
                            if (i_387_ != 255) {
                                i_383_ = i_386_
                                i_386_ = `is`!![i_310_]
                                i_386_ = ((((i_383_ and 0xff00ff) * i_387_ + (i_386_ and 0xff00ff) * i_388_) and 0xff00ff.inv()) + (((i_383_ and 0xff00) * i_387_ + (i_386_ and 0xff00) * i_388_) and 0xff0000)) shr 8
                            }
                            `is`!![i_310_++] = i_386_
                            i_301_ += i_306_
                        }
                        i_302_ += i_307_
                        i_301_ = i_379_
                        i_310_ += i_311_
                    }
                    return
                }
                if (i_297_ == 2) {
                    val i_389_ = i_298_ ushr 24
                    val i_390_ = 256 - i_389_
                    var i_391_ = (i_298_ and 0xff00ff) * i_390_ and 0xff00ff.inv()
                    var i_392_ = (i_298_ and 0xff00) * i_390_ and 0xff0000
                    i_298_ = (i_391_ or i_392_) ushr 8
                    val i_393_ = i_301_
                    for (i_394_ in -i_296_..-1) {
                        val i_395_ = ((i_302_ shr 16) * this.anInt8471)
                        for (i_396_ in -i_295_..-1) {
                            var i_397_ = (anIntArray9936[(i_301_ shr 16) + i_395_])
                            val i_398_ = i_397_ ushr 24
                            val i_399_ = 256 - i_398_
                            i_391_ = (i_397_ and 0xff00ff) * i_389_ and 0xff00ff.inv()
                            i_392_ = (i_397_ and 0xff00) * i_389_ and 0xff0000
                            i_397_ = ((i_391_ or i_392_) ushr 8) + i_298_
                            val i_400_ = `is`!![i_310_]
                            `is`[i_310_++] = ((((i_397_ and 0xff00ff) * i_398_ + (i_400_ and 0xff00ff) * i_399_) and 0xff00ff.inv()) + (((i_397_ and 0xff00) * i_398_ + (i_400_ and 0xff00) * i_399_) and 0xff0000)) shr 8
                            i_301_ += i_306_
                        }
                        i_302_ += i_307_
                        i_301_ = i_393_
                        i_310_ += i_311_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            if (i_299_ == 2) {
                if (i_297_ == 1) {
                    val i_401_ = i_301_
                    for (i_402_ in -i_296_..-1) {
                        val i_403_ = ((i_302_ shr 16) * this.anInt8471)
                        for (i_404_ in -i_295_..-1) {
                            val i_405_ = (anIntArray9936[(i_301_ shr 16) + i_403_])
                            if (i_405_ != 0) {
                                var i_406_ = `is`!![i_310_]
                                val i_407_ = i_405_ + i_406_
                                val i_408_ = ((i_405_ and 0xff00ff) + (i_406_ and 0xff00ff))
                                i_406_ = (i_408_ and 0x1000100) + (i_407_ - i_408_ and 0x10000)
                                `is`[i_310_++] = i_407_ - i_406_ or i_406_ - (i_406_ ushr 8)
                            } else i_310_++
                            i_301_ += i_306_
                        }
                        i_302_ += i_307_
                        i_301_ = i_401_
                        i_310_ += i_311_
                    }
                    return
                }
                if (i_297_ == 0) {
                    val i_409_ = i_301_
                    val i_410_ = (i_298_ and 0xff0000) shr 16
                    val i_411_ = (i_298_ and 0xff00) shr 8
                    val i_412_ = i_298_ and 0xff
                    for (i_413_ in -i_296_..-1) {
                        val i_414_ = ((i_302_ shr 16) * this.anInt8471)
                        for (i_415_ in -i_295_..-1) {
                            var i_416_ = (anIntArray9936[(i_301_ shr 16) + i_414_])
                            if (i_416_ != 0) {
                                val i_417_ = (i_416_ and 0xff0000) * i_410_ and 0xffffff.inv()
                                val i_418_ = (i_416_ and 0xff00) * i_411_ and 0xff0000
                                val i_419_ = (i_416_ and 0xff) * i_412_ and 0xff00
                                i_416_ = (i_417_ or i_418_ or i_419_) ushr 8
                                var i_420_ = `is`!![i_310_]
                                val i_421_ = i_416_ + i_420_
                                val i_422_ = ((i_416_ and 0xff00ff) + (i_420_ and 0xff00ff))
                                i_420_ = (i_422_ and 0x1000100) + (i_421_ - i_422_ and 0x10000)
                                `is`[i_310_++] = i_421_ - i_420_ or i_420_ - (i_420_ ushr 8)
                            } else i_310_++
                            i_301_ += i_306_
                        }
                        i_302_ += i_307_
                        i_301_ = i_409_
                        i_310_ += i_311_
                    }
                    return
                }
                if (i_297_ == 3) {
                    val i_423_ = i_301_
                    for (i_424_ in -i_296_..-1) {
                        val i_425_ = ((i_302_ shr 16) * this.anInt8471)
                        for (i_426_ in -i_295_..-1) {
                            var i_427_ = (anIntArray9936[(i_301_ shr 16) + i_425_])
                            var i_428_ = i_427_ + i_298_
                            var i_429_ = (i_427_ and 0xff00ff) + (i_298_ and 0xff00ff)
                            var i_430_ = ((i_429_ and 0x1000100) + (i_428_ - i_429_ and 0x10000))
                            i_427_ = i_428_ - i_430_ or i_430_ - (i_430_ ushr 8)
                            i_430_ = `is`!![i_310_]
                            i_428_ = i_427_ + i_430_
                            i_429_ = (i_427_ and 0xff00ff) + (i_430_ and 0xff00ff)
                            i_430_ = (i_429_ and 0x1000100) + (i_428_ - i_429_ and 0x10000)
                            `is`[i_310_++] = i_428_ - i_430_ or i_430_ - (i_430_ ushr 8)
                            i_301_ += i_306_
                        }
                        i_302_ += i_307_
                        i_301_ = i_423_
                        i_310_ += i_311_
                    }
                    return
                }
                if (i_297_ == 2) {
                    val i_431_ = i_298_ ushr 24
                    val i_432_ = 256 - i_431_
                    var i_433_ = (i_298_ and 0xff00ff) * i_432_ and 0xff00ff.inv()
                    var i_434_ = (i_298_ and 0xff00) * i_432_ and 0xff0000
                    i_298_ = (i_433_ or i_434_) ushr 8
                    val i_435_ = i_301_
                    for (i_436_ in -i_296_..-1) {
                        val i_437_ = ((i_302_ shr 16) * this.anInt8471)
                        for (i_438_ in -i_295_..-1) {
                            var i_439_ = (anIntArray9936[(i_301_ shr 16) + i_437_])
                            if (i_439_ != 0) {
                                i_433_ = (i_439_ and 0xff00ff) * i_431_ and 0xff00ff.inv()
                                i_434_ = (i_439_ and 0xff00) * i_431_ and 0xff0000
                                i_439_ = ((i_433_ or i_434_) ushr 8) + i_298_
                                var i_440_ = `is`!![i_310_]
                                val i_441_ = i_439_ + i_440_
                                val i_442_ = ((i_439_ and 0xff00ff) + (i_440_ and 0xff00ff))
                                i_440_ = (i_442_ and 0x1000100) + (i_441_ - i_442_ and 0x10000)
                                `is`[i_310_++] = i_441_ - i_440_ or i_440_ - (i_440_ ushr 8)
                            } else i_310_++
                            i_301_ += i_306_
                        }
                        i_302_ += i_307_
                        i_301_ = i_435_
                        i_310_ += i_311_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            throw IllegalArgumentException()
        }
    }

    internal constructor(var_ha_Sub1: ha_Sub1, i: Int, i_443_: Int) : super(var_ha_Sub1, i, i_443_) {
        this.anIntArray9936 = IntArray(i * i_443_)
    }

    override fun method996(i: Int, i_444_: Int, i_445_: Int, i_446_: Int, i_447_: Int, i_448_: Int, i_449_: Int, i_450_: Int, i_451_: Int) {
        var i = i
        var i_444_ = i_444_
        var i_446_ = i_446_
        var i_447_ = i_447_
        var i_449_ = i_449_
        if (i_446_ > 0 && i_447_ > 0) {
            var i_452_ = 0
            var i_453_ = 0
            val i_454_ = (this.anInt8461 + this.anInt8471 + this.anInt8454)
            val i_455_ = (this.anInt8464 + this.anInt8470 + this.anInt8456)
            val i_456_ = (i_454_ shl 16) / i_446_
            val i_457_ = (i_455_ shl 16) / i_447_
            if (this.anInt8461 > 0) {
                val i_458_ = (((this.anInt8461 shl 16) + i_456_ - 1) / i_456_)
                i += i_458_
                i_452_ += i_458_ * i_456_ - (this.anInt8461 shl 16)
            }
            if (this.anInt8464 > 0) {
                val i_459_ = (((this.anInt8464 shl 16) + i_457_ - 1) / i_457_)
                i_444_ += i_459_
                i_453_ += i_459_ * i_457_ - (this.anInt8464 shl 16)
            }
            if (this.anInt8471 < i_454_) i_446_ = ((this.anInt8471 shl 16) - i_452_ + i_456_ - 1) / i_456_
            if (this.anInt8470 < i_455_) i_447_ = ((this.anInt8470 shl 16) - i_453_ + i_457_ - 1) / i_457_
            var i_460_ = i + i_444_ * aHa_Sub1_8460.anInt7477
            var i_461_ = (aHa_Sub1_8460.anInt7477 - i_446_)
            if (i_444_ + i_447_ > aHa_Sub1_8460.anInt7503) i_447_ -= (i_444_ + i_447_ - (aHa_Sub1_8460.anInt7503))
            if (i_444_ < aHa_Sub1_8460.anInt7476) {
                val i_462_ = ((aHa_Sub1_8460.anInt7476) - i_444_)
                i_447_ -= i_462_
                i_460_ += i_462_ * aHa_Sub1_8460.anInt7477
                i_453_ += i_457_ * i_462_
            }
            if (i + i_446_ > aHa_Sub1_8460.anInt7507) {
                val i_463_ = (i + i_446_ - (aHa_Sub1_8460.anInt7507))
                i_446_ -= i_463_
                i_461_ += i_463_
            }
            if (i < aHa_Sub1_8460.anInt7496) {
                val i_464_ = ((aHa_Sub1_8460.anInt7496) - i)
                i_446_ -= i_464_
                i_460_ += i_464_
                i_452_ += i_456_ * i_464_
                i_461_ += i_464_
            }
            val fs = (aHa_Sub1_8460.aFloatArray7511)
            val `is` = (aHa_Sub1_8460.anIntArray7483)
            if (i_450_ == 0) {
                if (i_448_ == 1) {
                    val i_465_ = i_452_
                    for (i_466_ in -i_447_..-1) {
                        val i_467_ = ((i_453_ shr 16) * this.anInt8471)
                        for (i_468_ in -i_446_..-1) {
                            if (i_445_.toFloat() < fs!![i_460_]) {
                                `is`!![i_460_] = (anIntArray9936[(i_452_ shr 16) + i_467_])
                                fs[i_460_] = i_445_.toFloat()
                            }
                            i_452_ += i_456_
                            i_460_++
                        }
                        i_453_ += i_457_
                        i_452_ = i_465_
                        i_460_ += i_461_
                    }
                    return
                }
                if (i_448_ == 0) {
                    val i_469_ = (i_449_ and 0xff0000) shr 16
                    val i_470_ = (i_449_ and 0xff00) shr 8
                    val i_471_ = i_449_ and 0xff
                    val i_472_ = i_452_
                    for (i_473_ in -i_447_..-1) {
                        val i_474_ = ((i_453_ shr 16) * this.anInt8471)
                        for (i_475_ in -i_446_..-1) {
                            if (i_445_.toFloat() < fs!![i_460_]) {
                                val i_476_ = (anIntArray9936[(i_452_ shr 16) + i_474_])
                                val i_477_ = (i_476_ and 0xff0000) * i_469_ and 0xffffff.inv()
                                val i_478_ = (i_476_ and 0xff00) * i_470_ and 0xff0000
                                val i_479_ = (i_476_ and 0xff) * i_471_ and 0xff00
                                `is`!![i_460_] = (i_477_ or i_478_ or i_479_) ushr 8
                                fs[i_460_] = i_445_.toFloat()
                            }
                            i_452_ += i_456_
                            i_460_++
                        }
                        i_453_ += i_457_
                        i_452_ = i_472_
                        i_460_ += i_461_
                    }
                    return
                }
                if (i_448_ == 3) {
                    val i_480_ = i_452_
                    for (i_481_ in -i_447_..-1) {
                        val i_482_ = ((i_453_ shr 16) * this.anInt8471)
                        for (i_483_ in -i_446_..-1) {
                            if (i_445_.toFloat() < fs!![i_460_]) {
                                val i_484_ = (anIntArray9936[(i_452_ shr 16) + i_482_])
                                val i_485_ = i_484_ + i_449_
                                val i_486_ = ((i_484_ and 0xff00ff) + (i_449_ and 0xff00ff))
                                val i_487_ = ((i_486_ and 0x1000100) + (i_485_ - i_486_ and 0x10000))
                                `is`!![i_460_] = i_485_ - i_487_ or i_487_ - (i_487_ ushr 8)
                                fs[i_460_] = i_445_.toFloat()
                            }
                            i_452_ += i_456_
                            i_460_++
                        }
                        i_453_ += i_457_
                        i_452_ = i_480_
                        i_460_ += i_461_
                    }
                    return
                }
                if (i_448_ == 2) {
                    val i_488_ = i_449_ ushr 24
                    val i_489_ = 256 - i_488_
                    var i_490_ = (i_449_ and 0xff00ff) * i_489_ and 0xff00ff.inv()
                    var i_491_ = (i_449_ and 0xff00) * i_489_ and 0xff0000
                    i_449_ = (i_490_ or i_491_) ushr 8
                    val i_492_ = i_452_
                    for (i_493_ in -i_447_..-1) {
                        val i_494_ = ((i_453_ shr 16) * this.anInt8471)
                        for (i_495_ in -i_446_..-1) {
                            if (i_445_.toFloat() < fs!![i_460_]) {
                                val i_496_ = (anIntArray9936[(i_452_ shr 16) + i_494_])
                                i_490_ = (i_496_ and 0xff00ff) * i_488_ and 0xff00ff.inv()
                                i_491_ = (i_496_ and 0xff00) * i_488_ and 0xff0000
                                `is`!![i_460_] = ((i_490_ or i_491_) ushr 8) + i_449_
                                fs[i_460_] = i_445_.toFloat()
                            }
                            i_452_ += i_456_
                            i_460_++
                        }
                        i_453_ += i_457_
                        i_452_ = i_492_
                        i_460_ += i_461_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            if (i_450_ == 1) {
                if (i_448_ == 1) {
                    val i_497_ = i_452_
                    for (i_498_ in -i_447_..-1) {
                        val i_499_ = ((i_453_ shr 16) * this.anInt8471)
                        for (i_500_ in -i_446_..-1) {
                            if (i_445_.toFloat() < fs!![i_460_]) {
                                val i_501_ = (anIntArray9936[(i_452_ shr 16) + i_499_])
                                val i_502_ = i_501_ ushr 24
                                val i_503_ = 256 - i_502_
                                val i_504_ = `is`!![i_460_]
                                `is`[i_460_] = (((((i_501_ and 0xff00ff) * i_502_ + (i_504_ and 0xff00ff) * i_503_) and 0xff00ff.inv()) shr 8) + (((((i_501_ and 0xff00ff.inv()) ushr 8) * i_502_) + (((i_504_ and 0xff00ff.inv()) ushr 8) * i_503_)) and 0xff00ff.inv()))
                                fs[i_460_] = i_445_.toFloat()
                            }
                            i_452_ += i_456_
                            i_460_++
                        }
                        i_453_ += i_457_
                        i_452_ = i_497_
                        i_460_ += i_461_
                    }
                    return
                }
                if (i_448_ == 0) {
                    val i_505_ = i_452_
                    if ((i_449_ and 0xffffff) == 16777215) {
                        for (i_506_ in -i_447_..-1) {
                            val i_507_ = ((i_453_ shr 16) * this.anInt8471)
                            for (i_508_ in -i_446_..-1) {
                                if (i_445_.toFloat() < fs!![i_460_]) {
                                    val i_509_ = (anIntArray9936[(i_452_ shr 16) + i_507_])
                                    val i_510_ = ((i_509_ ushr 24) * (i_449_ ushr 24) shr 8)
                                    val i_511_ = 256 - i_510_
                                    val i_512_ = `is`!![i_460_]
                                    `is`[i_460_] = ((((i_509_ and 0xff00ff) * i_510_ + (i_512_ and 0xff00ff) * i_511_) and 0xff00ff.inv()) + (((i_509_ and 0xff00) * i_510_ + (i_512_ and 0xff00) * i_511_) and 0xff0000)) shr 8
                                    fs[i_460_] = i_445_.toFloat()
                                }
                                i_452_ += i_456_
                                i_460_++
                            }
                            i_453_ += i_457_
                            i_452_ = i_505_
                            i_460_ += i_461_
                        }
                    } else {
                        val i_513_ = (i_449_ and 0xff0000) shr 16
                        val i_514_ = (i_449_ and 0xff00) shr 8
                        val i_515_ = i_449_ and 0xff
                        for (i_516_ in -i_447_..-1) {
                            val i_517_ = ((i_453_ shr 16) * this.anInt8471)
                            for (i_518_ in -i_446_..-1) {
                                if (i_445_.toFloat() < fs!![i_460_]) {
                                    var i_519_ = (anIntArray9936[(i_452_ shr 16) + i_517_])
                                    val i_520_ = ((i_519_ ushr 24) * (i_449_ ushr 24) shr 8)
                                    val i_521_ = 256 - i_520_
                                    if (i_520_ == 255) {
                                        val i_526_ = ((i_519_ and 0xff0000) * i_513_ and 0xffffff.inv())
                                        val i_527_ = ((i_519_ and 0xff00) * i_514_ and 0xff0000)
                                        val i_528_ = ((i_519_ and 0xff) * i_515_ and 0xff00)
                                        `is`!![i_460_] = (i_526_ or i_527_ or i_528_) ushr 8
                                        fs[i_460_] = i_445_.toFloat()
                                    } else {
                                        val i_522_ = ((i_519_ and 0xff0000) * i_513_ and 0xffffff.inv())
                                        val i_523_ = ((i_519_ and 0xff00) * i_514_ and 0xff0000)
                                        val i_524_ = ((i_519_ and 0xff) * i_515_ and 0xff00)
                                        i_519_ = (i_522_ or i_523_ or i_524_) ushr 8
                                        val i_525_ = `is`!![i_460_]
                                        `is`[i_460_] = ((((i_519_ and 0xff00ff) * i_520_ + ((i_525_ and 0xff00ff) * i_521_)) and 0xff00ff.inv()) + (((i_519_ and 0xff00) * i_520_ + ((i_525_ and 0xff00) * i_521_)) and 0xff0000)) shr 8
                                        fs[i_460_] = i_445_.toFloat()
                                    }
                                }
                                i_452_ += i_456_
                                i_460_++
                            }
                            i_453_ += i_457_
                            i_452_ = i_505_
                            i_460_ += i_461_
                        }
                        return
                    }
                    return
                }
                if (i_448_ == 3) {
                    val i_529_ = i_452_
                    for (i_530_ in -i_447_..-1) {
                        val i_531_ = ((i_453_ shr 16) * this.anInt8471)
                        for (i_532_ in -i_446_..-1) {
                            if (i_445_.toFloat() < fs!![i_460_]) {
                                var i_533_ = (anIntArray9936[(i_452_ shr 16) + i_531_])
                                val i_534_ = i_533_ + i_449_
                                val i_535_ = ((i_533_ and 0xff00ff) + (i_449_ and 0xff00ff))
                                var i_536_ = ((i_535_ and 0x1000100) + (i_534_ - i_535_ and 0x10000))
                                i_536_ = i_534_ - i_536_ or i_536_ - (i_536_ ushr 8)
                                val i_537_ = (i_536_ ushr 24) * (i_449_ ushr 24) shr 8
                                val i_538_ = 256 - i_537_
                                if (i_537_ != 255) {
                                    i_533_ = i_536_
                                    i_536_ = `is`!![i_460_]
                                    i_536_ = ((((i_533_ and 0xff00ff) * i_537_ + (i_536_ and 0xff00ff) * i_538_) and 0xff00ff.inv()) + (((i_533_ and 0xff00) * i_537_ + (i_536_ and 0xff00) * i_538_) and 0xff0000)) shr 8
                                }
                                `is`!![i_460_] = i_536_
                                fs[i_460_] = i_445_.toFloat()
                            }
                            i_452_ += i_456_
                            i_460_++
                        }
                        i_453_ += i_457_
                        i_452_ = i_529_
                        i_460_ += i_461_
                    }
                    return
                }
                if (i_448_ == 2) {
                    val i_539_ = i_449_ ushr 24
                    val i_540_ = 256 - i_539_
                    var i_541_ = (i_449_ and 0xff00ff) * i_540_ and 0xff00ff.inv()
                    var i_542_ = (i_449_ and 0xff00) * i_540_ and 0xff0000
                    i_449_ = (i_541_ or i_542_) ushr 8
                    val i_543_ = i_452_
                    for (i_544_ in -i_447_..-1) {
                        val i_545_ = ((i_453_ shr 16) * this.anInt8471)
                        for (i_546_ in -i_446_..-1) {
                            if (i_445_.toFloat() < fs!![i_460_]) {
                                var i_547_ = (anIntArray9936[(i_452_ shr 16) + i_545_])
                                val i_548_ = i_547_ ushr 24
                                val i_549_ = 256 - i_548_
                                i_541_ = (i_547_ and 0xff00ff) * i_539_ and 0xff00ff.inv()
                                i_542_ = (i_547_ and 0xff00) * i_539_ and 0xff0000
                                i_547_ = ((i_541_ or i_542_) ushr 8) + i_449_
                                val i_550_ = `is`!![i_460_]
                                `is`[i_460_] = ((((i_547_ and 0xff00ff) * i_548_ + (i_550_ and 0xff00ff) * i_549_) and 0xff00ff.inv()) + (((i_547_ and 0xff00) * i_548_ + (i_550_ and 0xff00) * i_549_) and 0xff0000)) shr 8
                                fs[i_460_] = i_445_.toFloat()
                            }
                            i_452_ += i_456_
                            i_460_++
                        }
                        i_453_ += i_457_
                        i_452_ = i_543_
                        i_460_ += i_461_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            if (i_450_ == 2) {
                if (i_448_ == 1) {
                    val i_551_ = i_452_
                    for (i_552_ in -i_447_..-1) {
                        val i_553_ = ((i_453_ shr 16) * this.anInt8471)
                        for (i_554_ in -i_446_..-1) {
                            if (i_445_.toFloat() < fs!![i_460_]) {
                                val i_555_ = (anIntArray9936[(i_452_ shr 16) + i_553_])
                                if (i_555_ != 0) {
                                    var i_556_ = `is`!![i_460_]
                                    val i_557_ = i_555_ + i_556_
                                    val i_558_ = ((i_555_ and 0xff00ff) + (i_556_ and 0xff00ff))
                                    i_556_ = ((i_558_ and 0x1000100) + (i_557_ - i_558_ and 0x10000))
                                    `is`[i_460_] = i_557_ - i_556_ or i_556_ - (i_556_ ushr 8)
                                    fs[i_460_] = i_445_.toFloat()
                                }
                            }
                            i_452_ += i_456_
                            i_460_++
                        }
                        i_453_ += i_457_
                        i_452_ = i_551_
                        i_460_ += i_461_
                    }
                    return
                }
                if (i_448_ == 0) {
                    val i_559_ = i_452_
                    val i_560_ = (i_449_ and 0xff0000) shr 16
                    val i_561_ = (i_449_ and 0xff00) shr 8
                    val i_562_ = i_449_ and 0xff
                    for (i_563_ in -i_447_..-1) {
                        val i_564_ = ((i_453_ shr 16) * this.anInt8471)
                        for (i_565_ in -i_446_..-1) {
                            if (i_445_.toFloat() < fs!![i_460_]) {
                                var i_566_ = (anIntArray9936[(i_452_ shr 16) + i_564_])
                                if (i_566_ != 0) {
                                    val i_567_ = ((i_566_ and 0xff0000) * i_560_ and 0xffffff.inv())
                                    val i_568_ = ((i_566_ and 0xff00) * i_561_ and 0xff0000)
                                    val i_569_ = (i_566_ and 0xff) * i_562_ and 0xff00
                                    i_566_ = (i_567_ or i_568_ or i_569_) ushr 8
                                    var i_570_ = `is`!![i_460_]
                                    val i_571_ = i_566_ + i_570_
                                    val i_572_ = ((i_566_ and 0xff00ff) + (i_570_ and 0xff00ff))
                                    i_570_ = ((i_572_ and 0x1000100) + (i_571_ - i_572_ and 0x10000))
                                    `is`[i_460_] = i_571_ - i_570_ or i_570_ - (i_570_ ushr 8)
                                    fs[i_460_] = i_445_.toFloat()
                                }
                            }
                            i_452_ += i_456_
                            i_460_++
                        }
                        i_453_ += i_457_
                        i_452_ = i_559_
                        i_460_ += i_461_
                    }
                    return
                }
                if (i_448_ == 3) {
                    val i_573_ = i_452_
                    for (i_574_ in -i_447_..-1) {
                        val i_575_ = ((i_453_ shr 16) * this.anInt8471)
                        for (i_576_ in -i_446_..-1) {
                            if (i_445_.toFloat() < fs!![i_460_]) {
                                var i_577_ = (anIntArray9936[(i_452_ shr 16) + i_575_])
                                var i_578_ = i_577_ + i_449_
                                var i_579_ = ((i_577_ and 0xff00ff) + (i_449_ and 0xff00ff))
                                var i_580_ = ((i_579_ and 0x1000100) + (i_578_ - i_579_ and 0x10000))
                                i_577_ = i_578_ - i_580_ or i_580_ - (i_580_ ushr 8)
                                i_580_ = `is`!![i_460_]
                                i_578_ = i_577_ + i_580_
                                i_579_ = (i_577_ and 0xff00ff) + (i_580_ and 0xff00ff)
                                i_580_ = (i_579_ and 0x1000100) + (i_578_ - i_579_ and 0x10000)
                                `is`[i_460_] = i_578_ - i_580_ or i_580_ - (i_580_ ushr 8)
                                fs[i_460_] = i_445_.toFloat()
                            }
                            i_452_ += i_456_
                            i_460_++
                        }
                        i_453_ += i_457_
                        i_452_ = i_573_
                        i_460_ += i_461_
                    }
                    return
                }
                if (i_448_ == 2) {
                    val i_581_ = i_449_ ushr 24
                    val i_582_ = 256 - i_581_
                    var i_583_ = (i_449_ and 0xff00ff) * i_582_ and 0xff00ff.inv()
                    var i_584_ = (i_449_ and 0xff00) * i_582_ and 0xff0000
                    i_449_ = (i_583_ or i_584_) ushr 8
                    val i_585_ = i_452_
                    for (i_586_ in -i_447_..-1) {
                        val i_587_ = ((i_453_ shr 16) * this.anInt8471)
                        for (i_588_ in -i_446_..-1) {
                            if (i_445_.toFloat() < fs!![i_460_]) {
                                var i_589_ = (anIntArray9936[(i_452_ shr 16) + i_587_])
                                if (i_589_ != 0) {
                                    i_583_ = ((i_589_ and 0xff00ff) * i_581_ and 0xff00ff.inv())
                                    i_584_ = ((i_589_ and 0xff00) * i_581_ and 0xff0000)
                                    i_589_ = ((i_583_ or i_584_) ushr 8) + i_449_
                                    var i_590_ = `is`!![i_460_]
                                    val i_591_ = i_589_ + i_590_
                                    val i_592_ = ((i_589_ and 0xff00ff) + (i_590_ and 0xff00ff))
                                    i_590_ = ((i_592_ and 0x1000100) + (i_591_ - i_592_ and 0x10000))
                                    `is`[i_460_] = i_591_ - i_590_ or i_590_ - (i_590_ ushr 8)
                                    fs[i_460_] = i_445_.toFloat()
                                }
                            }
                            i_452_ += i_456_
                            i_460_++
                        }
                        i_453_ += i_457_
                        i_452_ = i_585_
                        i_460_ += i_461_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            throw IllegalArgumentException()
        }
    }

    override fun method968(i: Int, i_593_: Int, i_594_: Int) {
        if (i_594_ == 0) {
            val `is` = (aHa_Sub1_8460.anIntArray7483)
            for (i_595_ in 0..<this.anInt8470) {
                val i_596_ = i_595_ * this.anInt8471
                val i_597_ = (((i_593_ + i_595_) * (aHa_Sub1_8460.anInt7477)) + i)
                for (i_598_ in 0..<this.anInt8471) anIntArray9936[i_596_ + i_598_] = ((anIntArray9936[i_596_ + i_598_]) and 0xffffff or (`is`!![i_597_ + i_598_] shl 8 and 0xffffff.inv()))
            }
        } else if (i_594_ == 1) {
            val `is` = (aHa_Sub1_8460.anIntArray7483)
            for (i_599_ in 0..<this.anInt8470) {
                val i_600_ = i_599_ * this.anInt8471
                val i_601_ = (((i_593_ + i_599_) * (aHa_Sub1_8460.anInt7477)) + i)
                for (i_602_ in 0..<this.anInt8471) anIntArray9936[i_600_ + i_602_] = ((anIntArray9936[i_600_ + i_602_]) and 0xffffff or (`is`!![i_601_ + i_602_] shl 16 and 0xffffff.inv()))
            }
        } else if (i_594_ == 2) {
            val `is` = (aHa_Sub1_8460.anIntArray7483)
            for (i_603_ in 0..<this.anInt8470) {
                val i_604_ = i_603_ * this.anInt8471
                val i_605_ = (((i_593_ + i_603_) * (aHa_Sub1_8460.anInt7477)) + i)
                for (i_606_ in 0..<this.anInt8471) anIntArray9936[i_604_ + i_606_] = ((anIntArray9936[i_604_ + i_606_]) and 0xffffff or (`is`!![i_605_ + i_606_] shl 24 and 0xffffff.inv()))
            }
        } else if (i_594_ == 3) {
            val `is` = (aHa_Sub1_8460.anIntArray7483)
            for (i_607_ in 0..<this.anInt8470) {
                val i_608_ = i_607_ * this.anInt8471
                val i_609_ = (((i_593_ + i_607_) * (aHa_Sub1_8460.anInt7477)) + i)
                for (i_610_ in 0..<this.anInt8471) anIntArray9936[i_608_ + i_610_] = ((anIntArray9936[i_608_ + i_610_]) and 0xffffff or (if (`is`!![i_609_ + i_610_] != 0) -16777216 else 0))
            }
        }
    }

    override fun method994(i: Int, i_611_: Int) {
        val `is` = aHa_Sub1_8460.anIntArray7483
        if (anInt8481 == 0) {
            if (anInt8450 == 0) {
                var i_612_ = anInt8468
                while (i_612_ < 0) {
                    var i_613_ = anInt8451
                    val i_614_ = anInt8458
                    val i_615_ = anInt8467
                    var i_616_ = anInt8478
                    if (i_614_ >= 0 && i_615_ >= 0 && (i_614_ - (this.anInt8471 shl 12) < 0) && (i_615_ - (this.anInt8470 shl 12) < 0)) {
                        while ( /**/i_616_ < 0) {
                            var i_617_ = (((i_615_ shr 12) * this.anInt8471) + (i_614_ shr 12))
                            val i_618_ = i_613_++
                            val is_619_ = `is`
                            val i_620_ = i
                            val i_621_ = i_611_
                            if (i_621_ == 0) {
                                if (i_620_ == 1) is_619_!![i_618_] = (anIntArray9936[i_617_])
                                else if (i_620_ == 0) {
                                    val i_622_ = (anIntArray9936[i_617_++])
                                    val i_623_ = (((i_622_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_624_ = (((i_622_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_625_ = (((i_622_ and 0xff) * anInt8465) and 0xff00)
                                    is_619_!![i_618_] = (i_623_ or i_624_ or i_625_) ushr 8
                                } else if (i_620_ == 3) {
                                    val i_626_ = (anIntArray9936[i_617_++])
                                    val i_627_ = anInt8480
                                    val i_628_ = i_626_ + i_627_
                                    val i_629_ = ((i_626_ and 0xff00ff) + (i_627_ and 0xff00ff))
                                    val i_630_ = ((i_629_ and 0x1000100) + (i_628_ - i_629_ and 0x10000))
                                    is_619_!![i_618_] = i_628_ - i_630_ or i_630_ - (i_630_ ushr 8)
                                } else if (i_620_ == 2) {
                                    val i_631_ = (anIntArray9936[i_617_])
                                    val i_632_ = (((i_631_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_633_ = (((i_631_ and 0xff00) * anInt8477) and 0xff0000)
                                    is_619_!![i_618_] = (((i_632_ or i_633_) ushr 8) + anInt8474)
                                } else throw IllegalArgumentException()
                            } else if (i_621_ == 1) {
                                if (i_620_ == 1) {
                                    val i_634_ = (anIntArray9936[i_617_])
                                    val i_635_ = i_634_ ushr 24
                                    val i_636_ = 256 - i_635_
                                    val i_637_ = is_619_!![i_618_]
                                    is_619_[i_618_] = ((((i_634_ and 0xff00ff) * i_635_ + (i_637_ and 0xff00ff) * i_636_) and 0xff00ff.inv()) + (((i_634_ and 0xff00) * i_635_ + (i_637_ and 0xff00) * i_636_) and 0xff0000)) shr 8
                                } else if (i_620_ == 0) {
                                    var i_638_ = (anIntArray9936[i_617_])
                                    val i_639_ = (((i_638_ ushr 24) * anInt8477) shr 8)
                                    val i_640_ = 256 - i_639_
                                    if ((anInt8480 and 0xffffff) == 16777215) {
                                        val i_641_ = is_619_!![i_618_]
                                        is_619_[i_618_] = ((((i_638_ and 0xff00ff) * i_639_ + ((i_641_ and 0xff00ff) * i_640_)) and 0xff00ff.inv()) + (((i_638_ and 0xff00) * i_639_ + ((i_641_ and 0xff00) * i_640_)) and 0xff0000)) shr 8
                                    } else if (i_639_ == 255) {
                                        val i_646_ = (((i_638_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_647_ = (((i_638_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_648_ = (((i_638_ and 0xff) * anInt8465) and 0xff00)
                                        is_619_!![i_618_] = (i_646_ or i_647_ or i_648_) ushr 8
                                    } else {
                                        val i_642_ = (((i_638_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_643_ = (((i_638_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_644_ = (((i_638_ and 0xff) * anInt8465) and 0xff00)
                                        i_638_ = (i_642_ or i_643_ or i_644_) ushr 8
                                        val i_645_ = is_619_!![i_618_]
                                        is_619_[i_618_] = ((((i_638_ and 0xff00ff) * i_639_ + ((i_645_ and 0xff00ff) * i_640_)) and 0xff00ff.inv()) + (((i_638_ and 0xff00) * i_639_ + ((i_645_ and 0xff00) * i_640_)) and 0xff0000)) shr 8
                                    }
                                } else if (i_620_ == 3) {
                                    var i_649_ = (anIntArray9936[i_617_])
                                    val i_650_ = anInt8480
                                    val i_651_ = i_649_ + i_650_
                                    val i_652_ = ((i_649_ and 0xff00ff) + (i_650_ and 0xff00ff))
                                    var i_653_ = ((i_652_ and 0x1000100) + (i_651_ - i_652_ and 0x10000))
                                    i_653_ = i_651_ - i_653_ or i_653_ - (i_653_ ushr 8)
                                    val i_654_ = (((i_649_ ushr 24) * anInt8477) shr 8)
                                    val i_655_ = 256 - i_654_
                                    if (i_654_ != 255) {
                                        i_649_ = i_653_
                                        i_653_ = is_619_!![i_618_]
                                        i_653_ = ((((i_649_ and 0xff00ff) * i_654_ + ((i_653_ and 0xff00ff) * i_655_)) and 0xff00ff.inv()) + (((i_649_ and 0xff00) * i_654_ + ((i_653_ and 0xff00) * i_655_)) and 0xff0000)) shr 8
                                    }
                                    is_619_!![i_618_] = i_653_
                                } else if (i_620_ == 2) {
                                    var i_656_ = (anIntArray9936[i_617_])
                                    val i_657_ = i_656_ ushr 24
                                    val i_658_ = 256 - i_657_
                                    val i_659_ = (((i_656_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_660_ = (((i_656_ and 0xff00) * anInt8477) and 0xff0000)
                                    i_656_ = (((i_659_ or i_660_) ushr 8) + anInt8474)
                                    val i_661_ = is_619_!![i_618_]
                                    is_619_[i_618_] = ((((i_656_ and 0xff00ff) * i_657_ + (i_661_ and 0xff00ff) * i_658_) and 0xff00ff.inv()) + (((i_656_ and 0xff00) * i_657_ + (i_661_ and 0xff00) * i_658_) and 0xff0000)) shr 8
                                } else throw IllegalArgumentException()
                            } else if (i_621_ == 2) {
                                if (i_620_ == 1) {
                                    val i_662_ = (anIntArray9936[i_617_])
                                    var i_663_ = is_619_!![i_618_]
                                    val i_664_ = i_662_ + i_663_
                                    val i_665_ = ((i_662_ and 0xff00ff) + (i_663_ and 0xff00ff))
                                    i_663_ = ((i_665_ and 0x1000100) + (i_664_ - i_665_ and 0x10000))
                                    is_619_[i_618_] = i_664_ - i_663_ or i_663_ - (i_663_ ushr 8)
                                } else if (i_620_ == 0) {
                                    var i_666_ = (anIntArray9936[i_617_])
                                    val i_667_ = (((i_666_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_668_ = (((i_666_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_669_ = (((i_666_ and 0xff) * anInt8465) and 0xff00)
                                    i_666_ = (i_667_ or i_668_ or i_669_) ushr 8
                                    var i_670_ = is_619_!![i_618_]
                                    val i_671_ = i_666_ + i_670_
                                    val i_672_ = ((i_666_ and 0xff00ff) + (i_670_ and 0xff00ff))
                                    i_670_ = ((i_672_ and 0x1000100) + (i_671_ - i_672_ and 0x10000))
                                    is_619_[i_618_] = i_671_ - i_670_ or i_670_ - (i_670_ ushr 8)
                                } else if (i_620_ == 3) {
                                    var i_673_ = (anIntArray9936[i_617_])
                                    val i_674_ = anInt8480
                                    var i_675_ = i_673_ + i_674_
                                    var i_676_ = ((i_673_ and 0xff00ff) + (i_674_ and 0xff00ff))
                                    var i_677_ = ((i_676_ and 0x1000100) + (i_675_ - i_676_ and 0x10000))
                                    i_673_ = i_675_ - i_677_ or i_677_ - (i_677_ ushr 8)
                                    i_677_ = is_619_!![i_618_]
                                    i_675_ = i_673_ + i_677_
                                    i_676_ = (i_673_ and 0xff00ff) + (i_677_ and 0xff00ff)
                                    i_677_ = ((i_676_ and 0x1000100) + (i_675_ - i_676_ and 0x10000))
                                    is_619_[i_618_] = i_675_ - i_677_ or i_677_ - (i_677_ ushr 8)
                                } else if (i_620_ == 2) {
                                    var i_678_ = (anIntArray9936[i_617_])
                                    val i_679_ = (((i_678_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_680_ = (((i_678_ and 0xff00) * anInt8477) and 0xff0000)
                                    i_678_ = (((i_679_ or i_680_) ushr 8) + anInt8474)
                                    var i_681_ = is_619_!![i_618_]
                                    val i_682_ = i_678_ + i_681_
                                    val i_683_ = ((i_678_ and 0xff00ff) + (i_681_ and 0xff00ff))
                                    i_681_ = ((i_683_ and 0x1000100) + (i_682_ - i_683_ and 0x10000))
                                    is_619_[i_618_] = i_682_ - i_681_ or i_681_ - (i_681_ ushr 8)
                                }
                            } else throw IllegalArgumentException()
                            i_616_++
                        }
                    }
                    i_612_++
                    anInt8451 += anInt8453
                }
            } else if (anInt8450 < 0) {
                var i_684_ = anInt8468
                while (i_684_ < 0) {
                    var i_685_ = anInt8451
                    val i_686_ = anInt8458
                    var i_687_ = anInt8467 + anInt8475
                    var i_688_ = anInt8478
                    if (i_686_ >= 0 && (i_686_ - (this.anInt8471 shl 12) < 0)) {
                        var i_689_: Int
                        if (((i_687_ - (this.anInt8470 shl 12)).also { i_689_ = it }) >= 0) {
                            i_689_ = ((anInt8450 - i_689_) / anInt8450)
                            i_688_ += i_689_
                            i_687_ += anInt8450 * i_689_
                            i_685_ += i_689_
                        }
                        if ((((i_687_ - anInt8450) / anInt8450).also { i_689_ = it }) > i_688_) i_688_ = i_689_
                        while ( /**/i_688_ < 0) {
                            var i_690_ = (((i_687_ shr 12) * this.anInt8471) + (i_686_ shr 12))
                            val i_691_ = i_685_++
                            val is_692_ = `is`
                            val i_693_ = i
                            val i_694_ = i_611_
                            if (i_694_ == 0) {
                                if (i_693_ == 1) is_692_!![i_691_] = (anIntArray9936[i_690_])
                                else if (i_693_ == 0) {
                                    val i_695_ = (anIntArray9936[i_690_++])
                                    val i_696_ = (((i_695_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_697_ = (((i_695_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_698_ = (((i_695_ and 0xff) * anInt8465) and 0xff00)
                                    is_692_!![i_691_] = (i_696_ or i_697_ or i_698_) ushr 8
                                } else if (i_693_ == 3) {
                                    val i_699_ = (anIntArray9936[i_690_++])
                                    val i_700_ = anInt8480
                                    val i_701_ = i_699_ + i_700_
                                    val i_702_ = ((i_699_ and 0xff00ff) + (i_700_ and 0xff00ff))
                                    val i_703_ = ((i_702_ and 0x1000100) + (i_701_ - i_702_ and 0x10000))
                                    is_692_!![i_691_] = i_701_ - i_703_ or i_703_ - (i_703_ ushr 8)
                                } else if (i_693_ == 2) {
                                    val i_704_ = (anIntArray9936[i_690_])
                                    val i_705_ = (((i_704_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_706_ = (((i_704_ and 0xff00) * anInt8477) and 0xff0000)
                                    is_692_!![i_691_] = (((i_705_ or i_706_) ushr 8) + anInt8474)
                                } else throw IllegalArgumentException()
                            } else if (i_694_ == 1) {
                                if (i_693_ == 1) {
                                    val i_707_ = (anIntArray9936[i_690_])
                                    val i_708_ = i_707_ ushr 24
                                    val i_709_ = 256 - i_708_
                                    val i_710_ = is_692_!![i_691_]
                                    is_692_[i_691_] = ((((i_707_ and 0xff00ff) * i_708_ + (i_710_ and 0xff00ff) * i_709_) and 0xff00ff.inv()) + (((i_707_ and 0xff00) * i_708_ + (i_710_ and 0xff00) * i_709_) and 0xff0000)) shr 8
                                } else if (i_693_ == 0) {
                                    var i_711_ = (anIntArray9936[i_690_])
                                    val i_712_ = (((i_711_ ushr 24) * anInt8477) shr 8)
                                    val i_713_ = 256 - i_712_
                                    if ((anInt8480 and 0xffffff) == 16777215) {
                                        val i_714_ = is_692_!![i_691_]
                                        is_692_[i_691_] = ((((i_711_ and 0xff00ff) * i_712_ + ((i_714_ and 0xff00ff) * i_713_)) and 0xff00ff.inv()) + (((i_711_ and 0xff00) * i_712_ + ((i_714_ and 0xff00) * i_713_)) and 0xff0000)) shr 8
                                    } else if (i_712_ == 255) {
                                        val i_719_ = (((i_711_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_720_ = (((i_711_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_721_ = (((i_711_ and 0xff) * anInt8465) and 0xff00)
                                        is_692_!![i_691_] = (i_719_ or i_720_ or i_721_) ushr 8
                                    } else {
                                        val i_715_ = (((i_711_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_716_ = (((i_711_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_717_ = (((i_711_ and 0xff) * anInt8465) and 0xff00)
                                        i_711_ = (i_715_ or i_716_ or i_717_) ushr 8
                                        val i_718_ = is_692_!![i_691_]
                                        is_692_[i_691_] = ((((i_711_ and 0xff00ff) * i_712_ + ((i_718_ and 0xff00ff) * i_713_)) and 0xff00ff.inv()) + (((i_711_ and 0xff00) * i_712_ + ((i_718_ and 0xff00) * i_713_)) and 0xff0000)) shr 8
                                    }
                                } else if (i_693_ == 3) {
                                    var i_722_ = (anIntArray9936[i_690_])
                                    val i_723_ = anInt8480
                                    val i_724_ = i_722_ + i_723_
                                    val i_725_ = ((i_722_ and 0xff00ff) + (i_723_ and 0xff00ff))
                                    var i_726_ = ((i_725_ and 0x1000100) + (i_724_ - i_725_ and 0x10000))
                                    i_726_ = i_724_ - i_726_ or i_726_ - (i_726_ ushr 8)
                                    val i_727_ = (((i_722_ ushr 24) * anInt8477) shr 8)
                                    val i_728_ = 256 - i_727_
                                    if (i_727_ != 255) {
                                        i_722_ = i_726_
                                        i_726_ = is_692_!![i_691_]
                                        i_726_ = ((((i_722_ and 0xff00ff) * i_727_ + ((i_726_ and 0xff00ff) * i_728_)) and 0xff00ff.inv()) + (((i_722_ and 0xff00) * i_727_ + ((i_726_ and 0xff00) * i_728_)) and 0xff0000)) shr 8
                                    }
                                    is_692_!![i_691_] = i_726_
                                } else if (i_693_ == 2) {
                                    var i_729_ = (anIntArray9936[i_690_])
                                    val i_730_ = i_729_ ushr 24
                                    val i_731_ = 256 - i_730_
                                    val i_732_ = (((i_729_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_733_ = (((i_729_ and 0xff00) * anInt8477) and 0xff0000)
                                    i_729_ = (((i_732_ or i_733_) ushr 8) + anInt8474)
                                    val i_734_ = is_692_!![i_691_]
                                    is_692_[i_691_] = ((((i_729_ and 0xff00ff) * i_730_ + (i_734_ and 0xff00ff) * i_731_) and 0xff00ff.inv()) + (((i_729_ and 0xff00) * i_730_ + (i_734_ and 0xff00) * i_731_) and 0xff0000)) shr 8
                                } else throw IllegalArgumentException()
                            } else if (i_694_ == 2) {
                                if (i_693_ == 1) {
                                    val i_735_ = (anIntArray9936[i_690_])
                                    var i_736_ = is_692_!![i_691_]
                                    val i_737_ = i_735_ + i_736_
                                    val i_738_ = ((i_735_ and 0xff00ff) + (i_736_ and 0xff00ff))
                                    i_736_ = ((i_738_ and 0x1000100) + (i_737_ - i_738_ and 0x10000))
                                    is_692_[i_691_] = i_737_ - i_736_ or i_736_ - (i_736_ ushr 8)
                                } else if (i_693_ == 0) {
                                    var i_739_ = (anIntArray9936[i_690_])
                                    val i_740_ = (((i_739_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_741_ = (((i_739_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_742_ = (((i_739_ and 0xff) * anInt8465) and 0xff00)
                                    i_739_ = (i_740_ or i_741_ or i_742_) ushr 8
                                    var i_743_ = is_692_!![i_691_]
                                    val i_744_ = i_739_ + i_743_
                                    val i_745_ = ((i_739_ and 0xff00ff) + (i_743_ and 0xff00ff))
                                    i_743_ = ((i_745_ and 0x1000100) + (i_744_ - i_745_ and 0x10000))
                                    is_692_[i_691_] = i_744_ - i_743_ or i_743_ - (i_743_ ushr 8)
                                } else if (i_693_ == 3) {
                                    var i_746_ = (anIntArray9936[i_690_])
                                    val i_747_ = anInt8480
                                    var i_748_ = i_746_ + i_747_
                                    var i_749_ = ((i_746_ and 0xff00ff) + (i_747_ and 0xff00ff))
                                    var i_750_ = ((i_749_ and 0x1000100) + (i_748_ - i_749_ and 0x10000))
                                    i_746_ = i_748_ - i_750_ or i_750_ - (i_750_ ushr 8)
                                    i_750_ = is_692_!![i_691_]
                                    i_748_ = i_746_ + i_750_
                                    i_749_ = (i_746_ and 0xff00ff) + (i_750_ and 0xff00ff)
                                    i_750_ = ((i_749_ and 0x1000100) + (i_748_ - i_749_ and 0x10000))
                                    is_692_[i_691_] = i_748_ - i_750_ or i_750_ - (i_750_ ushr 8)
                                } else if (i_693_ == 2) {
                                    var i_751_ = (anIntArray9936[i_690_])
                                    val i_752_ = (((i_751_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_753_ = (((i_751_ and 0xff00) * anInt8477) and 0xff0000)
                                    i_751_ = (((i_752_ or i_753_) ushr 8) + anInt8474)
                                    var i_754_ = is_692_!![i_691_]
                                    val i_755_ = i_751_ + i_754_
                                    val i_756_ = ((i_751_ and 0xff00ff) + (i_754_ and 0xff00ff))
                                    i_754_ = ((i_756_ and 0x1000100) + (i_755_ - i_756_ and 0x10000))
                                    is_692_[i_691_] = i_755_ - i_754_ or i_754_ - (i_754_ ushr 8)
                                }
                            } else throw IllegalArgumentException()
                            i_687_ += anInt8450
                            i_688_++
                        }
                    }
                    i_684_++
                    anInt8458 += anInt8457
                    anInt8451 += anInt8453
                }
            } else {
                var i_757_ = anInt8468
                while (i_757_ < 0) {
                    var i_758_ = anInt8451
                    val i_759_ = anInt8458
                    var i_760_ = anInt8467 + anInt8475
                    var i_761_ = anInt8478
                    if (i_759_ >= 0 && (i_759_ - (this.anInt8471 shl 12) < 0)) {
                        if (i_760_ < 0) {
                            val i_762_ = ((anInt8450 - 1 - i_760_) / anInt8450)
                            i_761_ += i_762_
                            i_760_ += anInt8450 * i_762_
                            i_758_ += i_762_
                        }
                        val i_763_: Int
                        if ((((1 + i_760_ - (this.anInt8470 shl 12) - anInt8450) / anInt8450).also { i_763_ = it }) > i_761_) i_761_ = i_763_
                        while ( /**/i_761_ < 0) {
                            var i_764_ = (((i_760_ shr 12) * this.anInt8471) + (i_759_ shr 12))
                            val i_765_ = i_758_++
                            val is_766_ = `is`
                            val i_767_ = i
                            val i_768_ = i_611_
                            if (i_768_ == 0) {
                                if (i_767_ == 1) is_766_!![i_765_] = (anIntArray9936[i_764_])
                                else if (i_767_ == 0) {
                                    val i_769_ = (anIntArray9936[i_764_++])
                                    val i_770_ = (((i_769_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_771_ = (((i_769_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_772_ = (((i_769_ and 0xff) * anInt8465) and 0xff00)
                                    is_766_!![i_765_] = (i_770_ or i_771_ or i_772_) ushr 8
                                } else if (i_767_ == 3) {
                                    val i_773_ = (anIntArray9936[i_764_++])
                                    val i_774_ = anInt8480
                                    val i_775_ = i_773_ + i_774_
                                    val i_776_ = ((i_773_ and 0xff00ff) + (i_774_ and 0xff00ff))
                                    val i_777_ = ((i_776_ and 0x1000100) + (i_775_ - i_776_ and 0x10000))
                                    is_766_!![i_765_] = i_775_ - i_777_ or i_777_ - (i_777_ ushr 8)
                                } else if (i_767_ == 2) {
                                    val i_778_ = (anIntArray9936[i_764_])
                                    val i_779_ = (((i_778_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_780_ = (((i_778_ and 0xff00) * anInt8477) and 0xff0000)
                                    is_766_!![i_765_] = (((i_779_ or i_780_) ushr 8) + anInt8474)
                                } else throw IllegalArgumentException()
                            } else if (i_768_ == 1) {
                                if (i_767_ == 1) {
                                    val i_781_ = (anIntArray9936[i_764_])
                                    val i_782_ = i_781_ ushr 24
                                    val i_783_ = 256 - i_782_
                                    val i_784_ = is_766_!![i_765_]
                                    is_766_[i_765_] = ((((i_781_ and 0xff00ff) * i_782_ + (i_784_ and 0xff00ff) * i_783_) and 0xff00ff.inv()) + (((i_781_ and 0xff00) * i_782_ + (i_784_ and 0xff00) * i_783_) and 0xff0000)) shr 8
                                } else if (i_767_ == 0) {
                                    var i_785_ = (anIntArray9936[i_764_])
                                    val i_786_ = (((i_785_ ushr 24) * anInt8477) shr 8)
                                    val i_787_ = 256 - i_786_
                                    if ((anInt8480 and 0xffffff) == 16777215) {
                                        val i_788_ = is_766_!![i_765_]
                                        is_766_[i_765_] = ((((i_785_ and 0xff00ff) * i_786_ + ((i_788_ and 0xff00ff) * i_787_)) and 0xff00ff.inv()) + (((i_785_ and 0xff00) * i_786_ + ((i_788_ and 0xff00) * i_787_)) and 0xff0000)) shr 8
                                    } else if (i_786_ == 255) {
                                        val i_793_ = (((i_785_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_794_ = (((i_785_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_795_ = (((i_785_ and 0xff) * anInt8465) and 0xff00)
                                        is_766_!![i_765_] = (i_793_ or i_794_ or i_795_) ushr 8
                                    } else {
                                        val i_789_ = (((i_785_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_790_ = (((i_785_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_791_ = (((i_785_ and 0xff) * anInt8465) and 0xff00)
                                        i_785_ = (i_789_ or i_790_ or i_791_) ushr 8
                                        val i_792_ = is_766_!![i_765_]
                                        is_766_[i_765_] = ((((i_785_ and 0xff00ff) * i_786_ + ((i_792_ and 0xff00ff) * i_787_)) and 0xff00ff.inv()) + (((i_785_ and 0xff00) * i_786_ + ((i_792_ and 0xff00) * i_787_)) and 0xff0000)) shr 8
                                    }
                                } else if (i_767_ == 3) {
                                    var i_796_ = (anIntArray9936[i_764_])
                                    val i_797_ = anInt8480
                                    val i_798_ = i_796_ + i_797_
                                    val i_799_ = ((i_796_ and 0xff00ff) + (i_797_ and 0xff00ff))
                                    var i_800_ = ((i_799_ and 0x1000100) + (i_798_ - i_799_ and 0x10000))
                                    i_800_ = i_798_ - i_800_ or i_800_ - (i_800_ ushr 8)
                                    val i_801_ = (((i_796_ ushr 24) * anInt8477) shr 8)
                                    val i_802_ = 256 - i_801_
                                    if (i_801_ != 255) {
                                        i_796_ = i_800_
                                        i_800_ = is_766_!![i_765_]
                                        i_800_ = ((((i_796_ and 0xff00ff) * i_801_ + ((i_800_ and 0xff00ff) * i_802_)) and 0xff00ff.inv()) + (((i_796_ and 0xff00) * i_801_ + ((i_800_ and 0xff00) * i_802_)) and 0xff0000)) shr 8
                                    }
                                    is_766_!![i_765_] = i_800_
                                } else if (i_767_ == 2) {
                                    var i_803_ = (anIntArray9936[i_764_])
                                    val i_804_ = i_803_ ushr 24
                                    val i_805_ = 256 - i_804_
                                    val i_806_ = (((i_803_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_807_ = (((i_803_ and 0xff00) * anInt8477) and 0xff0000)
                                    i_803_ = (((i_806_ or i_807_) ushr 8) + anInt8474)
                                    val i_808_ = is_766_!![i_765_]
                                    is_766_[i_765_] = ((((i_803_ and 0xff00ff) * i_804_ + (i_808_ and 0xff00ff) * i_805_) and 0xff00ff.inv()) + (((i_803_ and 0xff00) * i_804_ + (i_808_ and 0xff00) * i_805_) and 0xff0000)) shr 8
                                } else throw IllegalArgumentException()
                            } else if (i_768_ == 2) {
                                if (i_767_ == 1) {
                                    val i_809_ = (anIntArray9936[i_764_])
                                    var i_810_ = is_766_!![i_765_]
                                    val i_811_ = i_809_ + i_810_
                                    val i_812_ = ((i_809_ and 0xff00ff) + (i_810_ and 0xff00ff))
                                    i_810_ = ((i_812_ and 0x1000100) + (i_811_ - i_812_ and 0x10000))
                                    is_766_[i_765_] = i_811_ - i_810_ or i_810_ - (i_810_ ushr 8)
                                } else if (i_767_ == 0) {
                                    var i_813_ = (anIntArray9936[i_764_])
                                    val i_814_ = (((i_813_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_815_ = (((i_813_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_816_ = (((i_813_ and 0xff) * anInt8465) and 0xff00)
                                    i_813_ = (i_814_ or i_815_ or i_816_) ushr 8
                                    var i_817_ = is_766_!![i_765_]
                                    val i_818_ = i_813_ + i_817_
                                    val i_819_ = ((i_813_ and 0xff00ff) + (i_817_ and 0xff00ff))
                                    i_817_ = ((i_819_ and 0x1000100) + (i_818_ - i_819_ and 0x10000))
                                    is_766_[i_765_] = i_818_ - i_817_ or i_817_ - (i_817_ ushr 8)
                                } else if (i_767_ == 3) {
                                    var i_820_ = (anIntArray9936[i_764_])
                                    val i_821_ = anInt8480
                                    var i_822_ = i_820_ + i_821_
                                    var i_823_ = ((i_820_ and 0xff00ff) + (i_821_ and 0xff00ff))
                                    var i_824_ = ((i_823_ and 0x1000100) + (i_822_ - i_823_ and 0x10000))
                                    i_820_ = i_822_ - i_824_ or i_824_ - (i_824_ ushr 8)
                                    i_824_ = is_766_!![i_765_]
                                    i_822_ = i_820_ + i_824_
                                    i_823_ = (i_820_ and 0xff00ff) + (i_824_ and 0xff00ff)
                                    i_824_ = ((i_823_ and 0x1000100) + (i_822_ - i_823_ and 0x10000))
                                    is_766_[i_765_] = i_822_ - i_824_ or i_824_ - (i_824_ ushr 8)
                                } else if (i_767_ == 2) {
                                    var i_825_ = (anIntArray9936[i_764_])
                                    val i_826_ = (((i_825_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_827_ = (((i_825_ and 0xff00) * anInt8477) and 0xff0000)
                                    i_825_ = (((i_826_ or i_827_) ushr 8) + anInt8474)
                                    var i_828_ = is_766_!![i_765_]
                                    val i_829_ = i_825_ + i_828_
                                    val i_830_ = ((i_825_ and 0xff00ff) + (i_828_ and 0xff00ff))
                                    i_828_ = ((i_830_ and 0x1000100) + (i_829_ - i_830_ and 0x10000))
                                    is_766_[i_765_] = i_829_ - i_828_ or i_828_ - (i_828_ ushr 8)
                                }
                            } else throw IllegalArgumentException()
                            i_760_ += anInt8450
                            i_761_++
                        }
                    }
                    i_757_++
                    anInt8458 += anInt8457
                    anInt8451 += anInt8453
                }
            }
        } else if (anInt8481 < 0) {
            if (anInt8450 == 0) {
                var i_831_ = anInt8468
                while (i_831_ < 0) {
                    var i_832_ = anInt8451
                    var i_833_ = anInt8458 + anInt8479
                    val i_834_ = anInt8467
                    var i_835_ = anInt8478
                    if (i_834_ >= 0 && (i_834_ - (this.anInt8470 shl 12) < 0)) {
                        var i_836_: Int
                        if (((i_833_ - (this.anInt8471 shl 12)).also { i_836_ = it }) >= 0) {
                            i_836_ = ((anInt8481 - i_836_) / anInt8481)
                            i_835_ += i_836_
                            i_833_ += anInt8481 * i_836_
                            i_832_ += i_836_
                        }
                        if ((((i_833_ - anInt8481) / anInt8481).also { i_836_ = it }) > i_835_) i_835_ = i_836_
                        while ( /**/i_835_ < 0) {
                            var i_837_ = (((i_834_ shr 12) * this.anInt8471) + (i_833_ shr 12))
                            val i_838_ = i_832_++
                            val is_839_ = `is`
                            val i_840_ = i
                            val i_841_ = i_611_
                            if (i_841_ == 0) {
                                if (i_840_ == 1) is_839_!![i_838_] = (anIntArray9936[i_837_])
                                else if (i_840_ == 0) {
                                    val i_842_ = (anIntArray9936[i_837_++])
                                    val i_843_ = (((i_842_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_844_ = (((i_842_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_845_ = (((i_842_ and 0xff) * anInt8465) and 0xff00)
                                    is_839_!![i_838_] = (i_843_ or i_844_ or i_845_) ushr 8
                                } else if (i_840_ == 3) {
                                    val i_846_ = (anIntArray9936[i_837_++])
                                    val i_847_ = anInt8480
                                    val i_848_ = i_846_ + i_847_
                                    val i_849_ = ((i_846_ and 0xff00ff) + (i_847_ and 0xff00ff))
                                    val i_850_ = ((i_849_ and 0x1000100) + (i_848_ - i_849_ and 0x10000))
                                    is_839_!![i_838_] = i_848_ - i_850_ or i_850_ - (i_850_ ushr 8)
                                } else if (i_840_ == 2) {
                                    val i_851_ = (anIntArray9936[i_837_])
                                    val i_852_ = (((i_851_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_853_ = (((i_851_ and 0xff00) * anInt8477) and 0xff0000)
                                    is_839_!![i_838_] = (((i_852_ or i_853_) ushr 8) + anInt8474)
                                } else throw IllegalArgumentException()
                            } else if (i_841_ == 1) {
                                if (i_840_ == 1) {
                                    val i_854_ = (anIntArray9936[i_837_])
                                    val i_855_ = i_854_ ushr 24
                                    val i_856_ = 256 - i_855_
                                    val i_857_ = is_839_!![i_838_]
                                    is_839_[i_838_] = ((((i_854_ and 0xff00ff) * i_855_ + (i_857_ and 0xff00ff) * i_856_) and 0xff00ff.inv()) + (((i_854_ and 0xff00) * i_855_ + (i_857_ and 0xff00) * i_856_) and 0xff0000)) shr 8
                                } else if (i_840_ == 0) {
                                    var i_858_ = (anIntArray9936[i_837_])
                                    val i_859_ = (((i_858_ ushr 24) * anInt8477) shr 8)
                                    val i_860_ = 256 - i_859_
                                    if ((anInt8480 and 0xffffff) == 16777215) {
                                        val i_861_ = is_839_!![i_838_]
                                        is_839_[i_838_] = ((((i_858_ and 0xff00ff) * i_859_ + ((i_861_ and 0xff00ff) * i_860_)) and 0xff00ff.inv()) + (((i_858_ and 0xff00) * i_859_ + ((i_861_ and 0xff00) * i_860_)) and 0xff0000)) shr 8
                                    } else if (i_859_ == 255) {
                                        val i_866_ = (((i_858_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_867_ = (((i_858_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_868_ = (((i_858_ and 0xff) * anInt8465) and 0xff00)
                                        is_839_!![i_838_] = (i_866_ or i_867_ or i_868_) ushr 8
                                    } else {
                                        val i_862_ = (((i_858_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                        val i_863_ = (((i_858_ and 0xff00) * anInt8463) and 0xff0000)
                                        val i_864_ = (((i_858_ and 0xff) * anInt8465) and 0xff00)
                                        i_858_ = (i_862_ or i_863_ or i_864_) ushr 8
                                        val i_865_ = is_839_!![i_838_]
                                        is_839_[i_838_] = ((((i_858_ and 0xff00ff) * i_859_ + ((i_865_ and 0xff00ff) * i_860_)) and 0xff00ff.inv()) + (((i_858_ and 0xff00) * i_859_ + ((i_865_ and 0xff00) * i_860_)) and 0xff0000)) shr 8
                                    }
                                } else if (i_840_ == 3) {
                                    var i_869_ = (anIntArray9936[i_837_])
                                    val i_870_ = anInt8480
                                    val i_871_ = i_869_ + i_870_
                                    val i_872_ = ((i_869_ and 0xff00ff) + (i_870_ and 0xff00ff))
                                    var i_873_ = ((i_872_ and 0x1000100) + (i_871_ - i_872_ and 0x10000))
                                    i_873_ = i_871_ - i_873_ or i_873_ - (i_873_ ushr 8)
                                    val i_874_ = (((i_869_ ushr 24) * anInt8477) shr 8)
                                    val i_875_ = 256 - i_874_
                                    if (i_874_ != 255) {
                                        i_869_ = i_873_
                                        i_873_ = is_839_!![i_838_]
                                        i_873_ = ((((i_869_ and 0xff00ff) * i_874_ + ((i_873_ and 0xff00ff) * i_875_)) and 0xff00ff.inv()) + (((i_869_ and 0xff00) * i_874_ + ((i_873_ and 0xff00) * i_875_)) and 0xff0000)) shr 8
                                    }
                                    is_839_!![i_838_] = i_873_
                                } else if (i_840_ == 2) {
                                    var i_876_ = (anIntArray9936[i_837_])
                                    val i_877_ = i_876_ ushr 24
                                    val i_878_ = 256 - i_877_
                                    val i_879_ = (((i_876_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_880_ = (((i_876_ and 0xff00) * anInt8477) and 0xff0000)
                                    i_876_ = (((i_879_ or i_880_) ushr 8) + anInt8474)
                                    val i_881_ = is_839_!![i_838_]
                                    is_839_[i_838_] = ((((i_876_ and 0xff00ff) * i_877_ + (i_881_ and 0xff00ff) * i_878_) and 0xff00ff.inv()) + (((i_876_ and 0xff00) * i_877_ + (i_881_ and 0xff00) * i_878_) and 0xff0000)) shr 8
                                } else throw IllegalArgumentException()
                            } else if (i_841_ == 2) {
                                if (i_840_ == 1) {
                                    val i_882_ = (anIntArray9936[i_837_])
                                    var i_883_ = is_839_!![i_838_]
                                    val i_884_ = i_882_ + i_883_
                                    val i_885_ = ((i_882_ and 0xff00ff) + (i_883_ and 0xff00ff))
                                    i_883_ = ((i_885_ and 0x1000100) + (i_884_ - i_885_ and 0x10000))
                                    is_839_[i_838_] = i_884_ - i_883_ or i_883_ - (i_883_ ushr 8)
                                } else if (i_840_ == 0) {
                                    var i_886_ = (anIntArray9936[i_837_])
                                    val i_887_ = (((i_886_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_888_ = (((i_886_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_889_ = (((i_886_ and 0xff) * anInt8465) and 0xff00)
                                    i_886_ = (i_887_ or i_888_ or i_889_) ushr 8
                                    var i_890_ = is_839_!![i_838_]
                                    val i_891_ = i_886_ + i_890_
                                    val i_892_ = ((i_886_ and 0xff00ff) + (i_890_ and 0xff00ff))
                                    i_890_ = ((i_892_ and 0x1000100) + (i_891_ - i_892_ and 0x10000))
                                    is_839_[i_838_] = i_891_ - i_890_ or i_890_ - (i_890_ ushr 8)
                                } else if (i_840_ == 3) {
                                    var i_893_ = (anIntArray9936[i_837_])
                                    val i_894_ = anInt8480
                                    var i_895_ = i_893_ + i_894_
                                    var i_896_ = ((i_893_ and 0xff00ff) + (i_894_ and 0xff00ff))
                                    var i_897_ = ((i_896_ and 0x1000100) + (i_895_ - i_896_ and 0x10000))
                                    i_893_ = i_895_ - i_897_ or i_897_ - (i_897_ ushr 8)
                                    i_897_ = is_839_!![i_838_]
                                    i_895_ = i_893_ + i_897_
                                    i_896_ = (i_893_ and 0xff00ff) + (i_897_ and 0xff00ff)
                                    i_897_ = ((i_896_ and 0x1000100) + (i_895_ - i_896_ and 0x10000))
                                    is_839_[i_838_] = i_895_ - i_897_ or i_897_ - (i_897_ ushr 8)
                                } else if (i_840_ == 2) {
                                    var i_898_ = (anIntArray9936[i_837_])
                                    val i_899_ = (((i_898_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                    val i_900_ = (((i_898_ and 0xff00) * anInt8477) and 0xff0000)
                                    i_898_ = (((i_899_ or i_900_) ushr 8) + anInt8474)
                                    var i_901_ = is_839_!![i_838_]
                                    val i_902_ = i_898_ + i_901_
                                    val i_903_ = ((i_898_ and 0xff00ff) + (i_901_ and 0xff00ff))
                                    i_901_ = ((i_903_ and 0x1000100) + (i_902_ - i_903_ and 0x10000))
                                    is_839_[i_838_] = i_902_ - i_901_ or i_901_ - (i_901_ ushr 8)
                                }
                            } else throw IllegalArgumentException()
                            i_833_ += anInt8481
                            i_835_++
                        }
                    }
                    i_831_++
                    anInt8467 += anInt8452
                    anInt8451 += anInt8453
                }
            } else if (anInt8450 < 0) {
                var i_904_ = anInt8468
                while (i_904_ < 0) {
                    var i_905_ = anInt8451
                    var i_906_ = anInt8458 + anInt8479
                    var i_907_ = anInt8467 + anInt8475
                    var i_908_ = anInt8478
                    var i_909_: Int
                    if (((i_906_ - (this.anInt8471 shl 12)).also { i_909_ = it }) >= 0) {
                        i_909_ = ((anInt8481 - i_909_) / anInt8481)
                        i_908_ += i_909_
                        i_906_ += anInt8481 * i_909_
                        i_907_ += anInt8450 * i_909_
                        i_905_ += i_909_
                    }
                    if ((((i_906_ - anInt8481) / anInt8481).also { i_909_ = it }) > i_908_) i_908_ = i_909_
                    if (((i_907_ - (this.anInt8470 shl 12)).also { i_909_ = it }) >= 0) {
                        i_909_ = ((anInt8450 - i_909_) / anInt8450)
                        i_908_ += i_909_
                        i_906_ += anInt8481 * i_909_
                        i_907_ += anInt8450 * i_909_
                        i_905_ += i_909_
                    }
                    if ((((i_907_ - anInt8450) / anInt8450).also { i_909_ = it }) > i_908_) i_908_ = i_909_
                    while ( /**/i_908_ < 0) {
                        var i_910_ = (((i_907_ shr 12) * this.anInt8471) + (i_906_ shr 12))
                        val i_911_ = i_905_++
                        val is_912_ = `is`
                        val i_913_ = i
                        val i_914_ = i_611_
                        if (i_914_ == 0) {
                            if (i_913_ == 1) is_912_!![i_911_] = (anIntArray9936[i_910_])
                            else if (i_913_ == 0) {
                                val i_915_ = (anIntArray9936[i_910_++])
                                val i_916_ = (((i_915_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_917_ = (((i_915_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_918_ = (((i_915_ and 0xff) * anInt8465) and 0xff00)
                                is_912_!![i_911_] = (i_916_ or i_917_ or i_918_) ushr 8
                            } else if (i_913_ == 3) {
                                val i_919_ = (anIntArray9936[i_910_++])
                                val i_920_ = anInt8480
                                val i_921_ = i_919_ + i_920_
                                val i_922_ = ((i_919_ and 0xff00ff) + (i_920_ and 0xff00ff))
                                val i_923_ = ((i_922_ and 0x1000100) + (i_921_ - i_922_ and 0x10000))
                                is_912_!![i_911_] = i_921_ - i_923_ or i_923_ - (i_923_ ushr 8)
                            } else if (i_913_ == 2) {
                                val i_924_ = (anIntArray9936[i_910_])
                                val i_925_ = (((i_924_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_926_ = (((i_924_ and 0xff00) * anInt8477) and 0xff0000)
                                is_912_!![i_911_] = (((i_925_ or i_926_) ushr 8) + anInt8474)
                            } else throw IllegalArgumentException()
                        } else if (i_914_ == 1) {
                            if (i_913_ == 1) {
                                val i_927_ = (anIntArray9936[i_910_])
                                val i_928_ = i_927_ ushr 24
                                val i_929_ = 256 - i_928_
                                val i_930_ = is_912_!![i_911_]
                                is_912_[i_911_] = ((((i_927_ and 0xff00ff) * i_928_ + (i_930_ and 0xff00ff) * i_929_) and 0xff00ff.inv()) + (((i_927_ and 0xff00) * i_928_ + (i_930_ and 0xff00) * i_929_) and 0xff0000)) shr 8
                            } else if (i_913_ == 0) {
                                var i_931_ = (anIntArray9936[i_910_])
                                val i_932_ = (((i_931_ ushr 24) * anInt8477) shr 8)
                                val i_933_ = 256 - i_932_
                                if ((anInt8480 and 0xffffff) == 16777215) {
                                    val i_934_ = is_912_!![i_911_]
                                    is_912_[i_911_] = ((((i_931_ and 0xff00ff) * i_932_ + (i_934_ and 0xff00ff) * i_933_) and 0xff00ff.inv()) + (((i_931_ and 0xff00) * i_932_ + (i_934_ and 0xff00) * i_933_) and 0xff0000)) shr 8
                                } else if (i_932_ == 255) {
                                    val i_939_ = (((i_931_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_940_ = (((i_931_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_941_ = (((i_931_ and 0xff) * anInt8465) and 0xff00)
                                    is_912_!![i_911_] = (i_939_ or i_940_ or i_941_) ushr 8
                                } else {
                                    val i_935_ = (((i_931_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_936_ = (((i_931_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_937_ = (((i_931_ and 0xff) * anInt8465) and 0xff00)
                                    i_931_ = (i_935_ or i_936_ or i_937_) ushr 8
                                    val i_938_ = is_912_!![i_911_]
                                    is_912_[i_911_] = ((((i_931_ and 0xff00ff) * i_932_ + (i_938_ and 0xff00ff) * i_933_) and 0xff00ff.inv()) + (((i_931_ and 0xff00) * i_932_ + (i_938_ and 0xff00) * i_933_) and 0xff0000)) shr 8
                                }
                            } else if (i_913_ == 3) {
                                var i_942_ = (anIntArray9936[i_910_])
                                val i_943_ = anInt8480
                                val i_944_ = i_942_ + i_943_
                                val i_945_ = ((i_942_ and 0xff00ff) + (i_943_ and 0xff00ff))
                                var i_946_ = ((i_945_ and 0x1000100) + (i_944_ - i_945_ and 0x10000))
                                i_946_ = i_944_ - i_946_ or i_946_ - (i_946_ ushr 8)
                                val i_947_ = (((i_942_ ushr 24) * anInt8477) shr 8)
                                val i_948_ = 256 - i_947_
                                if (i_947_ != 255) {
                                    i_942_ = i_946_
                                    i_946_ = is_912_!![i_911_]
                                    i_946_ = ((((i_942_ and 0xff00ff) * i_947_ + (i_946_ and 0xff00ff) * i_948_) and 0xff00ff.inv()) + (((i_942_ and 0xff00) * i_947_ + (i_946_ and 0xff00) * i_948_) and 0xff0000)) shr 8
                                }
                                is_912_!![i_911_] = i_946_
                            } else if (i_913_ == 2) {
                                var i_949_ = (anIntArray9936[i_910_])
                                val i_950_ = i_949_ ushr 24
                                val i_951_ = 256 - i_950_
                                val i_952_ = (((i_949_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_953_ = (((i_949_ and 0xff00) * anInt8477) and 0xff0000)
                                i_949_ = (((i_952_ or i_953_) ushr 8) + anInt8474)
                                val i_954_ = is_912_!![i_911_]
                                is_912_[i_911_] = ((((i_949_ and 0xff00ff) * i_950_ + (i_954_ and 0xff00ff) * i_951_) and 0xff00ff.inv()) + (((i_949_ and 0xff00) * i_950_ + (i_954_ and 0xff00) * i_951_) and 0xff0000)) shr 8
                            } else throw IllegalArgumentException()
                        } else if (i_914_ == 2) {
                            if (i_913_ == 1) {
                                val i_955_ = (anIntArray9936[i_910_])
                                var i_956_ = is_912_!![i_911_]
                                val i_957_ = i_955_ + i_956_
                                val i_958_ = ((i_955_ and 0xff00ff) + (i_956_ and 0xff00ff))
                                i_956_ = (i_958_ and 0x1000100) + (i_957_ - i_958_ and 0x10000)
                                is_912_[i_911_] = i_957_ - i_956_ or i_956_ - (i_956_ ushr 8)
                            } else if (i_913_ == 0) {
                                var i_959_ = (anIntArray9936[i_910_])
                                val i_960_ = (((i_959_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_961_ = (((i_959_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_962_ = (((i_959_ and 0xff) * anInt8465) and 0xff00)
                                i_959_ = (i_960_ or i_961_ or i_962_) ushr 8
                                var i_963_ = is_912_!![i_911_]
                                val i_964_ = i_959_ + i_963_
                                val i_965_ = ((i_959_ and 0xff00ff) + (i_963_ and 0xff00ff))
                                i_963_ = (i_965_ and 0x1000100) + (i_964_ - i_965_ and 0x10000)
                                is_912_[i_911_] = i_964_ - i_963_ or i_963_ - (i_963_ ushr 8)
                            } else if (i_913_ == 3) {
                                var i_966_ = (anIntArray9936[i_910_])
                                val i_967_ = anInt8480
                                var i_968_ = i_966_ + i_967_
                                var i_969_ = ((i_966_ and 0xff00ff) + (i_967_ and 0xff00ff))
                                var i_970_ = ((i_969_ and 0x1000100) + (i_968_ - i_969_ and 0x10000))
                                i_966_ = i_968_ - i_970_ or i_970_ - (i_970_ ushr 8)
                                i_970_ = is_912_!![i_911_]
                                i_968_ = i_966_ + i_970_
                                i_969_ = (i_966_ and 0xff00ff) + (i_970_ and 0xff00ff)
                                i_970_ = (i_969_ and 0x1000100) + (i_968_ - i_969_ and 0x10000)
                                is_912_[i_911_] = i_968_ - i_970_ or i_970_ - (i_970_ ushr 8)
                            } else if (i_913_ == 2) {
                                var i_971_ = (anIntArray9936[i_910_])
                                val i_972_ = (((i_971_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_973_ = (((i_971_ and 0xff00) * anInt8477) and 0xff0000)
                                i_971_ = (((i_972_ or i_973_) ushr 8) + anInt8474)
                                var i_974_ = is_912_!![i_911_]
                                val i_975_ = i_971_ + i_974_
                                val i_976_ = ((i_971_ and 0xff00ff) + (i_974_ and 0xff00ff))
                                i_974_ = (i_976_ and 0x1000100) + (i_975_ - i_976_ and 0x10000)
                                is_912_[i_911_] = i_975_ - i_974_ or i_974_ - (i_974_ ushr 8)
                            }
                        } else throw IllegalArgumentException()
                        i_906_ += anInt8481
                        i_907_ += anInt8450
                        i_908_++
                    }
                    i_904_++
                    anInt8458 += anInt8457
                    anInt8467 += anInt8452
                    anInt8451 += anInt8453
                }
            } else {
                var i_977_ = anInt8468
                while (i_977_ < 0) {
                    var i_978_ = anInt8451
                    var i_979_ = anInt8458 + anInt8479
                    var i_980_ = anInt8467 + anInt8475
                    var i_981_ = anInt8478
                    var i_982_: Int
                    if (((i_979_ - (this.anInt8471 shl 12)).also { i_982_ = it }) >= 0) {
                        i_982_ = ((anInt8481 - i_982_) / anInt8481)
                        i_981_ += i_982_
                        i_979_ += anInt8481 * i_982_
                        i_980_ += anInt8450 * i_982_
                        i_978_ += i_982_
                    }
                    if ((((i_979_ - anInt8481) / anInt8481).also { i_982_ = it }) > i_981_) i_981_ = i_982_
                    if (i_980_ < 0) {
                        i_982_ = ((anInt8450 - 1 - i_980_) / anInt8450)
                        i_981_ += i_982_
                        i_979_ += anInt8481 * i_982_
                        i_980_ += anInt8450 * i_982_
                        i_978_ += i_982_
                    }
                    if ((((1 + i_980_ - (this.anInt8470 shl 12) - anInt8450) / anInt8450).also { i_982_ = it }) > i_981_) i_981_ = i_982_
                    while ( /**/i_981_ < 0) {
                        var i_983_ = (((i_980_ shr 12) * this.anInt8471) + (i_979_ shr 12))
                        val i_984_ = i_978_++
                        val is_985_ = `is`
                        val i_986_ = i
                        val i_987_ = i_611_
                        if (i_987_ == 0) {
                            if (i_986_ == 1) is_985_!![i_984_] = (anIntArray9936[i_983_])
                            else if (i_986_ == 0) {
                                val i_988_ = (anIntArray9936[i_983_++])
                                val i_989_ = (((i_988_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_990_ = (((i_988_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_991_ = (((i_988_ and 0xff) * anInt8465) and 0xff00)
                                is_985_!![i_984_] = (i_989_ or i_990_ or i_991_) ushr 8
                            } else if (i_986_ == 3) {
                                val i_992_ = (anIntArray9936[i_983_++])
                                val i_993_ = anInt8480
                                val i_994_ = i_992_ + i_993_
                                val i_995_ = ((i_992_ and 0xff00ff) + (i_993_ and 0xff00ff))
                                val i_996_ = ((i_995_ and 0x1000100) + (i_994_ - i_995_ and 0x10000))
                                is_985_!![i_984_] = i_994_ - i_996_ or i_996_ - (i_996_ ushr 8)
                            } else if (i_986_ == 2) {
                                val i_997_ = (anIntArray9936[i_983_])
                                val i_998_ = (((i_997_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_999_ = (((i_997_ and 0xff00) * anInt8477) and 0xff0000)
                                is_985_!![i_984_] = (((i_998_ or i_999_) ushr 8) + anInt8474)
                            } else throw IllegalArgumentException()
                        } else if (i_987_ == 1) {
                            if (i_986_ == 1) {
                                val i_1000_ = (anIntArray9936[i_983_])
                                val i_1001_ = i_1000_ ushr 24
                                val i_1002_ = 256 - i_1001_
                                val i_1003_ = is_985_!![i_984_]
                                is_985_[i_984_] = ((((i_1000_ and 0xff00ff) * i_1001_ + (i_1003_ and 0xff00ff) * i_1002_) and 0xff00ff.inv()) + (((i_1000_ and 0xff00) * i_1001_ + (i_1003_ and 0xff00) * i_1002_) and 0xff0000)) shr 8
                            } else if (i_986_ == 0) {
                                var i_1004_ = (anIntArray9936[i_983_])
                                val i_1005_ = (((i_1004_ ushr 24) * anInt8477) shr 8)
                                val i_1006_ = 256 - i_1005_
                                if ((anInt8480 and 0xffffff) == 16777215) {
                                    val i_1007_ = is_985_!![i_984_]
                                    is_985_[i_984_] = ((((i_1004_ and 0xff00ff) * i_1005_ + (i_1007_ and 0xff00ff) * i_1006_) and 0xff00ff.inv()) + (((i_1004_ and 0xff00) * i_1005_ + (i_1007_ and 0xff00) * i_1006_) and 0xff0000)) shr 8
                                } else if (i_1005_ == 255) {
                                    val i_1012_ = (((i_1004_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_1013_ = (((i_1004_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_1014_ = (((i_1004_ and 0xff) * anInt8465) and 0xff00)
                                    is_985_!![i_984_] = (i_1012_ or i_1013_ or i_1014_) ushr 8
                                } else {
                                    val i_1008_ = (((i_1004_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_1009_ = (((i_1004_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_1010_ = (((i_1004_ and 0xff) * anInt8465) and 0xff00)
                                    i_1004_ = (i_1008_ or i_1009_ or i_1010_) ushr 8
                                    val i_1011_ = is_985_!![i_984_]
                                    is_985_[i_984_] = ((((i_1004_ and 0xff00ff) * i_1005_ + (i_1011_ and 0xff00ff) * i_1006_) and 0xff00ff.inv()) + (((i_1004_ and 0xff00) * i_1005_ + (i_1011_ and 0xff00) * i_1006_) and 0xff0000)) shr 8
                                }
                            } else if (i_986_ == 3) {
                                var i_1015_ = (anIntArray9936[i_983_])
                                val i_1016_ = anInt8480
                                val i_1017_ = i_1015_ + i_1016_
                                val i_1018_ = ((i_1015_ and 0xff00ff) + (i_1016_ and 0xff00ff))
                                var i_1019_ = ((i_1018_ and 0x1000100) + (i_1017_ - i_1018_ and 0x10000))
                                i_1019_ = i_1017_ - i_1019_ or i_1019_ - (i_1019_ ushr 8)
                                val i_1020_ = (((i_1015_ ushr 24) * anInt8477) shr 8)
                                val i_1021_ = 256 - i_1020_
                                if (i_1020_ != 255) {
                                    i_1015_ = i_1019_
                                    i_1019_ = is_985_!![i_984_]
                                    i_1019_ = ((((i_1015_ and 0xff00ff) * i_1020_ + (i_1019_ and 0xff00ff) * i_1021_) and 0xff00ff.inv()) + (((i_1015_ and 0xff00) * i_1020_ + (i_1019_ and 0xff00) * i_1021_) and 0xff0000)) shr 8
                                }
                                is_985_!![i_984_] = i_1019_
                            } else if (i_986_ == 2) {
                                var i_1022_ = (anIntArray9936[i_983_])
                                val i_1023_ = i_1022_ ushr 24
                                val i_1024_ = 256 - i_1023_
                                val i_1025_ = (((i_1022_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_1026_ = (((i_1022_ and 0xff00) * anInt8477) and 0xff0000)
                                i_1022_ = (((i_1025_ or i_1026_) ushr 8) + anInt8474)
                                val i_1027_ = is_985_!![i_984_]
                                is_985_[i_984_] = ((((i_1022_ and 0xff00ff) * i_1023_ + (i_1027_ and 0xff00ff) * i_1024_) and 0xff00ff.inv()) + (((i_1022_ and 0xff00) * i_1023_ + (i_1027_ and 0xff00) * i_1024_) and 0xff0000)) shr 8
                            } else throw IllegalArgumentException()
                        } else if (i_987_ == 2) {
                            if (i_986_ == 1) {
                                val i_1028_ = (anIntArray9936[i_983_])
                                var i_1029_ = is_985_!![i_984_]
                                val i_1030_ = i_1028_ + i_1029_
                                val i_1031_ = ((i_1028_ and 0xff00ff) + (i_1029_ and 0xff00ff))
                                i_1029_ = ((i_1031_ and 0x1000100) + (i_1030_ - i_1031_ and 0x10000))
                                is_985_[i_984_] = i_1030_ - i_1029_ or i_1029_ - (i_1029_ ushr 8)
                            } else if (i_986_ == 0) {
                                var i_1032_ = (anIntArray9936[i_983_])
                                val i_1033_ = (((i_1032_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_1034_ = (((i_1032_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_1035_ = (((i_1032_ and 0xff) * anInt8465) and 0xff00)
                                i_1032_ = (i_1033_ or i_1034_ or i_1035_) ushr 8
                                var i_1036_ = is_985_!![i_984_]
                                val i_1037_ = i_1032_ + i_1036_
                                val i_1038_ = ((i_1032_ and 0xff00ff) + (i_1036_ and 0xff00ff))
                                i_1036_ = ((i_1038_ and 0x1000100) + (i_1037_ - i_1038_ and 0x10000))
                                is_985_[i_984_] = i_1037_ - i_1036_ or i_1036_ - (i_1036_ ushr 8)
                            } else if (i_986_ == 3) {
                                var i_1039_ = (anIntArray9936[i_983_])
                                val i_1040_ = anInt8480
                                var i_1041_ = i_1039_ + i_1040_
                                var i_1042_ = ((i_1039_ and 0xff00ff) + (i_1040_ and 0xff00ff))
                                var i_1043_ = ((i_1042_ and 0x1000100) + (i_1041_ - i_1042_ and 0x10000))
                                i_1039_ = i_1041_ - i_1043_ or i_1043_ - (i_1043_ ushr 8)
                                i_1043_ = is_985_!![i_984_]
                                i_1041_ = i_1039_ + i_1043_
                                i_1042_ = (i_1039_ and 0xff00ff) + (i_1043_ and 0xff00ff)
                                i_1043_ = ((i_1042_ and 0x1000100) + (i_1041_ - i_1042_ and 0x10000))
                                is_985_[i_984_] = i_1041_ - i_1043_ or i_1043_ - (i_1043_ ushr 8)
                            } else if (i_986_ == 2) {
                                var i_1044_ = (anIntArray9936[i_983_])
                                val i_1045_ = (((i_1044_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_1046_ = (((i_1044_ and 0xff00) * anInt8477) and 0xff0000)
                                i_1044_ = (((i_1045_ or i_1046_) ushr 8) + anInt8474)
                                var i_1047_ = is_985_!![i_984_]
                                val i_1048_ = i_1044_ + i_1047_
                                val i_1049_ = ((i_1044_ and 0xff00ff) + (i_1047_ and 0xff00ff))
                                i_1047_ = ((i_1049_ and 0x1000100) + (i_1048_ - i_1049_ and 0x10000))
                                is_985_[i_984_] = i_1048_ - i_1047_ or i_1047_ - (i_1047_ ushr 8)
                            }
                        } else throw IllegalArgumentException()
                        i_979_ += anInt8481
                        i_980_ += anInt8450
                        i_981_++
                    }
                    i_977_++
                    anInt8458 += anInt8457
                    anInt8467 += anInt8452
                    anInt8451 += anInt8453
                }
            }
        } else if (anInt8450 == 0) {
            var i_1050_ = anInt8468
            while (i_1050_ < 0) {
                var i_1051_ = anInt8451
                var i_1052_ = anInt8458 + anInt8479
                val i_1053_ = anInt8467
                var i_1054_ = anInt8478
                if (i_1053_ >= 0 && i_1053_ - (this.anInt8470 shl 12) < 0) {
                    if (i_1052_ < 0) {
                        val i_1055_ = ((anInt8481 - 1 - i_1052_) / anInt8481)
                        i_1054_ += i_1055_
                        i_1052_ += anInt8481 * i_1055_
                        i_1051_ += i_1055_
                    }
                    val i_1056_: Int
                    if ((((1 + i_1052_ - (this.anInt8471 shl 12) - anInt8481) / anInt8481).also { i_1056_ = it }) > i_1054_) i_1054_ = i_1056_
                    while ( /**/i_1054_ < 0) {
                        var i_1057_ = (((i_1053_ shr 12) * this.anInt8471) + (i_1052_ shr 12))
                        val i_1058_ = i_1051_++
                        val is_1059_ = `is`
                        val i_1060_ = i
                        val i_1061_ = i_611_
                        if (i_1061_ == 0) {
                            if (i_1060_ == 1) is_1059_!![i_1058_] = (anIntArray9936[i_1057_])
                            else if (i_1060_ == 0) {
                                val i_1062_ = (anIntArray9936[i_1057_++])
                                val i_1063_ = (((i_1062_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_1064_ = (((i_1062_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_1065_ = (((i_1062_ and 0xff) * anInt8465) and 0xff00)
                                is_1059_!![i_1058_] = (i_1063_ or i_1064_ or i_1065_) ushr 8
                            } else if (i_1060_ == 3) {
                                val i_1066_ = (anIntArray9936[i_1057_++])
                                val i_1067_ = anInt8480
                                val i_1068_ = i_1066_ + i_1067_
                                val i_1069_ = ((i_1066_ and 0xff00ff) + (i_1067_ and 0xff00ff))
                                val i_1070_ = ((i_1069_ and 0x1000100) + (i_1068_ - i_1069_ and 0x10000))
                                is_1059_!![i_1058_] = i_1068_ - i_1070_ or i_1070_ - (i_1070_ ushr 8)
                            } else if (i_1060_ == 2) {
                                val i_1071_ = (anIntArray9936[i_1057_])
                                val i_1072_ = (((i_1071_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_1073_ = (((i_1071_ and 0xff00) * anInt8477) and 0xff0000)
                                is_1059_!![i_1058_] = (((i_1072_ or i_1073_) ushr 8) + anInt8474)
                            } else throw IllegalArgumentException()
                        } else if (i_1061_ == 1) {
                            if (i_1060_ == 1) {
                                val i_1074_ = (anIntArray9936[i_1057_])
                                val i_1075_ = i_1074_ ushr 24
                                val i_1076_ = 256 - i_1075_
                                val i_1077_ = is_1059_!![i_1058_]
                                is_1059_[i_1058_] = ((((i_1074_ and 0xff00ff) * i_1075_ + (i_1077_ and 0xff00ff) * i_1076_) and 0xff00ff.inv()) + (((i_1074_ and 0xff00) * i_1075_ + (i_1077_ and 0xff00) * i_1076_) and 0xff0000)) shr 8
                            } else if (i_1060_ == 0) {
                                var i_1078_ = (anIntArray9936[i_1057_])
                                val i_1079_ = (((i_1078_ ushr 24) * anInt8477) shr 8)
                                val i_1080_ = 256 - i_1079_
                                if ((anInt8480 and 0xffffff) == 16777215) {
                                    val i_1081_ = is_1059_!![i_1058_]
                                    is_1059_[i_1058_] = ((((i_1078_ and 0xff00ff) * i_1079_ + (i_1081_ and 0xff00ff) * i_1080_) and 0xff00ff.inv()) + (((i_1078_ and 0xff00) * i_1079_ + (i_1081_ and 0xff00) * i_1080_) and 0xff0000)) shr 8
                                } else if (i_1079_ == 255) {
                                    val i_1086_ = (((i_1078_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_1087_ = (((i_1078_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_1088_ = (((i_1078_ and 0xff) * anInt8465) and 0xff00)
                                    is_1059_!![i_1058_] = (i_1086_ or i_1087_ or i_1088_) ushr 8
                                } else {
                                    val i_1082_ = (((i_1078_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                    val i_1083_ = (((i_1078_ and 0xff00) * anInt8463) and 0xff0000)
                                    val i_1084_ = (((i_1078_ and 0xff) * anInt8465) and 0xff00)
                                    i_1078_ = (i_1082_ or i_1083_ or i_1084_) ushr 8
                                    val i_1085_ = is_1059_!![i_1058_]
                                    is_1059_[i_1058_] = ((((i_1078_ and 0xff00ff) * i_1079_ + (i_1085_ and 0xff00ff) * i_1080_) and 0xff00ff.inv()) + (((i_1078_ and 0xff00) * i_1079_ + (i_1085_ and 0xff00) * i_1080_) and 0xff0000)) shr 8
                                }
                            } else if (i_1060_ == 3) {
                                var i_1089_ = (anIntArray9936[i_1057_])
                                val i_1090_ = anInt8480
                                val i_1091_ = i_1089_ + i_1090_
                                val i_1092_ = ((i_1089_ and 0xff00ff) + (i_1090_ and 0xff00ff))
                                var i_1093_ = ((i_1092_ and 0x1000100) + (i_1091_ - i_1092_ and 0x10000))
                                i_1093_ = i_1091_ - i_1093_ or i_1093_ - (i_1093_ ushr 8)
                                val i_1094_ = (((i_1089_ ushr 24) * anInt8477) shr 8)
                                val i_1095_ = 256 - i_1094_
                                if (i_1094_ != 255) {
                                    i_1089_ = i_1093_
                                    i_1093_ = is_1059_!![i_1058_]
                                    i_1093_ = ((((i_1089_ and 0xff00ff) * i_1094_ + (i_1093_ and 0xff00ff) * i_1095_) and 0xff00ff.inv()) + (((i_1089_ and 0xff00) * i_1094_ + (i_1093_ and 0xff00) * i_1095_) and 0xff0000)) shr 8
                                }
                                is_1059_!![i_1058_] = i_1093_
                            } else if (i_1060_ == 2) {
                                var i_1096_ = (anIntArray9936[i_1057_])
                                val i_1097_ = i_1096_ ushr 24
                                val i_1098_ = 256 - i_1097_
                                val i_1099_ = (((i_1096_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_1100_ = (((i_1096_ and 0xff00) * anInt8477) and 0xff0000)
                                i_1096_ = (((i_1099_ or i_1100_) ushr 8) + anInt8474)
                                val i_1101_ = is_1059_!![i_1058_]
                                is_1059_[i_1058_] = ((((i_1096_ and 0xff00ff) * i_1097_ + (i_1101_ and 0xff00ff) * i_1098_) and 0xff00ff.inv()) + (((i_1096_ and 0xff00) * i_1097_ + (i_1101_ and 0xff00) * i_1098_) and 0xff0000)) shr 8
                            } else throw IllegalArgumentException()
                        } else if (i_1061_ == 2) {
                            if (i_1060_ == 1) {
                                val i_1102_ = (anIntArray9936[i_1057_])
                                var i_1103_ = is_1059_!![i_1058_]
                                val i_1104_ = i_1102_ + i_1103_
                                val i_1105_ = ((i_1102_ and 0xff00ff) + (i_1103_ and 0xff00ff))
                                i_1103_ = ((i_1105_ and 0x1000100) + (i_1104_ - i_1105_ and 0x10000))
                                is_1059_[i_1058_] = i_1104_ - i_1103_ or i_1103_ - (i_1103_ ushr 8)
                            } else if (i_1060_ == 0) {
                                var i_1106_ = (anIntArray9936[i_1057_])
                                val i_1107_ = (((i_1106_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_1108_ = (((i_1106_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_1109_ = (((i_1106_ and 0xff) * anInt8465) and 0xff00)
                                i_1106_ = (i_1107_ or i_1108_ or i_1109_) ushr 8
                                var i_1110_ = is_1059_!![i_1058_]
                                val i_1111_ = i_1106_ + i_1110_
                                val i_1112_ = ((i_1106_ and 0xff00ff) + (i_1110_ and 0xff00ff))
                                i_1110_ = ((i_1112_ and 0x1000100) + (i_1111_ - i_1112_ and 0x10000))
                                is_1059_[i_1058_] = i_1111_ - i_1110_ or i_1110_ - (i_1110_ ushr 8)
                            } else if (i_1060_ == 3) {
                                var i_1113_ = (anIntArray9936[i_1057_])
                                val i_1114_ = anInt8480
                                var i_1115_ = i_1113_ + i_1114_
                                var i_1116_ = ((i_1113_ and 0xff00ff) + (i_1114_ and 0xff00ff))
                                var i_1117_ = ((i_1116_ and 0x1000100) + (i_1115_ - i_1116_ and 0x10000))
                                i_1113_ = i_1115_ - i_1117_ or i_1117_ - (i_1117_ ushr 8)
                                i_1117_ = is_1059_!![i_1058_]
                                i_1115_ = i_1113_ + i_1117_
                                i_1116_ = (i_1113_ and 0xff00ff) + (i_1117_ and 0xff00ff)
                                i_1117_ = ((i_1116_ and 0x1000100) + (i_1115_ - i_1116_ and 0x10000))
                                is_1059_[i_1058_] = i_1115_ - i_1117_ or i_1117_ - (i_1117_ ushr 8)
                            } else if (i_1060_ == 2) {
                                var i_1118_ = (anIntArray9936[i_1057_])
                                val i_1119_ = (((i_1118_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                                val i_1120_ = (((i_1118_ and 0xff00) * anInt8477) and 0xff0000)
                                i_1118_ = (((i_1119_ or i_1120_) ushr 8) + anInt8474)
                                var i_1121_ = is_1059_!![i_1058_]
                                val i_1122_ = i_1118_ + i_1121_
                                val i_1123_ = ((i_1118_ and 0xff00ff) + (i_1121_ and 0xff00ff))
                                i_1121_ = ((i_1123_ and 0x1000100) + (i_1122_ - i_1123_ and 0x10000))
                                is_1059_[i_1058_] = i_1122_ - i_1121_ or i_1121_ - (i_1121_ ushr 8)
                            }
                        } else throw IllegalArgumentException()
                        i_1052_ += anInt8481
                        i_1054_++
                    }
                }
                i_1050_++
                anInt8458 += anInt8457
                anInt8467 += anInt8452
                anInt8451 += anInt8453
            }
        } else if (anInt8450 < 0) {
            for (i_1124_ in anInt8468..-1) {
                var i_1125_ = anInt8451
                var i_1126_ = anInt8458 + anInt8479
                var i_1127_ = anInt8467 + anInt8475
                var i_1128_ = anInt8478
                if (i_1126_ < 0) {
                    val i_1129_ = ((anInt8481 - 1 - i_1126_) / anInt8481)
                    i_1128_ += i_1129_
                    i_1126_ += anInt8481 * i_1129_
                    i_1127_ += anInt8450 * i_1129_
                    i_1125_ += i_1129_
                }
                var i_1130_: Int
                if ((((1 + i_1126_ - (this.anInt8471 shl 12) - anInt8481) / anInt8481).also { i_1130_ = it }) > i_1128_) i_1128_ = i_1130_
                if (((i_1127_ - (this.anInt8470 shl 12)).also { i_1130_ = it }) >= 0) {
                    i_1130_ = ((anInt8450 - i_1130_) / anInt8450)
                    i_1128_ += i_1130_
                    i_1126_ += anInt8481 * i_1130_
                    i_1127_ += anInt8450 * i_1130_
                    i_1125_ += i_1130_
                }
                if ((((i_1127_ - anInt8450) / anInt8450).also { i_1130_ = it }) > i_1128_) i_1128_ = i_1130_
                while ( /**/i_1128_ < 0) {
                    var i_1131_ = ((i_1127_ shr 12) * this.anInt8471 + (i_1126_ shr 12))
                    val i_1132_ = i_1125_++
                    val is_1133_ = `is`
                    val i_1134_ = i
                    val i_1135_ = i_611_
                    if (i_1135_ == 0) {
                        if (i_1134_ == 1) is_1133_!![i_1132_] = (anIntArray9936[i_1131_])
                        else if (i_1134_ == 0) {
                            val i_1136_ = (anIntArray9936[i_1131_++])
                            val i_1137_ = (((i_1136_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                            val i_1138_ = ((i_1136_ and 0xff00) * anInt8463 and 0xff0000)
                            val i_1139_ = ((i_1136_ and 0xff) * anInt8465 and 0xff00)
                            is_1133_!![i_1132_] = (i_1137_ or i_1138_ or i_1139_) ushr 8
                        } else if (i_1134_ == 3) {
                            val i_1140_ = (anIntArray9936[i_1131_++])
                            val i_1141_ = anInt8480
                            val i_1142_ = i_1140_ + i_1141_
                            val i_1143_ = (i_1140_ and 0xff00ff) + (i_1141_ and 0xff00ff)
                            val i_1144_ = ((i_1143_ and 0x1000100) + (i_1142_ - i_1143_ and 0x10000))
                            is_1133_!![i_1132_] = i_1142_ - i_1144_ or i_1144_ - (i_1144_ ushr 8)
                        } else if (i_1134_ == 2) {
                            val i_1145_ = (anIntArray9936[i_1131_])
                            val i_1146_ = (((i_1145_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                            val i_1147_ = ((i_1145_ and 0xff00) * anInt8477 and 0xff0000)
                            is_1133_!![i_1132_] = (((i_1146_ or i_1147_) ushr 8) + anInt8474)
                        } else throw IllegalArgumentException()
                    } else if (i_1135_ == 1) {
                        if (i_1134_ == 1) {
                            val i_1148_ = (anIntArray9936[i_1131_])
                            val i_1149_ = i_1148_ ushr 24
                            val i_1150_ = 256 - i_1149_
                            val i_1151_ = is_1133_!![i_1132_]
                            is_1133_[i_1132_] = ((((i_1148_ and 0xff00ff) * i_1149_ + (i_1151_ and 0xff00ff) * i_1150_) and 0xff00ff.inv()) + (((i_1148_ and 0xff00) * i_1149_ + (i_1151_ and 0xff00) * i_1150_) and 0xff0000)) shr 8
                        } else if (i_1134_ == 0) {
                            var i_1152_ = (anIntArray9936[i_1131_])
                            val i_1153_ = ((i_1152_ ushr 24) * anInt8477 shr 8)
                            val i_1154_ = 256 - i_1153_
                            if ((anInt8480 and 0xffffff) == 16777215) {
                                val i_1155_ = is_1133_!![i_1132_]
                                is_1133_[i_1132_] = ((((i_1152_ and 0xff00ff) * i_1153_ + (i_1155_ and 0xff00ff) * i_1154_) and 0xff00ff.inv()) + (((i_1152_ and 0xff00) * i_1153_ + (i_1155_ and 0xff00) * i_1154_) and 0xff0000)) shr 8
                            } else if (i_1153_ == 255) {
                                val i_1160_ = (((i_1152_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_1161_ = (((i_1152_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_1162_ = (((i_1152_ and 0xff) * anInt8465) and 0xff00)
                                is_1133_!![i_1132_] = (i_1160_ or i_1161_ or i_1162_) ushr 8
                            } else {
                                val i_1156_ = (((i_1152_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_1157_ = (((i_1152_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_1158_ = (((i_1152_ and 0xff) * anInt8465) and 0xff00)
                                i_1152_ = (i_1156_ or i_1157_ or i_1158_) ushr 8
                                val i_1159_ = is_1133_!![i_1132_]
                                is_1133_[i_1132_] = ((((i_1152_ and 0xff00ff) * i_1153_ + (i_1159_ and 0xff00ff) * i_1154_) and 0xff00ff.inv()) + (((i_1152_ and 0xff00) * i_1153_ + (i_1159_ and 0xff00) * i_1154_) and 0xff0000)) shr 8
                            }
                        } else if (i_1134_ == 3) {
                            var i_1163_ = (anIntArray9936[i_1131_])
                            val i_1164_ = anInt8480
                            val i_1165_ = i_1163_ + i_1164_
                            val i_1166_ = (i_1163_ and 0xff00ff) + (i_1164_ and 0xff00ff)
                            var i_1167_ = ((i_1166_ and 0x1000100) + (i_1165_ - i_1166_ and 0x10000))
                            i_1167_ = i_1165_ - i_1167_ or i_1167_ - (i_1167_ ushr 8)
                            val i_1168_ = ((i_1163_ ushr 24) * anInt8477 shr 8)
                            val i_1169_ = 256 - i_1168_
                            if (i_1168_ != 255) {
                                i_1163_ = i_1167_
                                i_1167_ = is_1133_!![i_1132_]
                                i_1167_ = ((((i_1163_ and 0xff00ff) * i_1168_ + (i_1167_ and 0xff00ff) * i_1169_) and 0xff00ff.inv()) + (((i_1163_ and 0xff00) * i_1168_ + (i_1167_ and 0xff00) * i_1169_) and 0xff0000)) shr 8
                            }
                            is_1133_!![i_1132_] = i_1167_
                        } else if (i_1134_ == 2) {
                            var i_1170_ = (anIntArray9936[i_1131_])
                            val i_1171_ = i_1170_ ushr 24
                            val i_1172_ = 256 - i_1171_
                            val i_1173_ = (((i_1170_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                            val i_1174_ = ((i_1170_ and 0xff00) * anInt8477 and 0xff0000)
                            i_1170_ = (((i_1173_ or i_1174_) ushr 8) + anInt8474)
                            val i_1175_ = is_1133_!![i_1132_]
                            is_1133_[i_1132_] = ((((i_1170_ and 0xff00ff) * i_1171_ + (i_1175_ and 0xff00ff) * i_1172_) and 0xff00ff.inv()) + (((i_1170_ and 0xff00) * i_1171_ + (i_1175_ and 0xff00) * i_1172_) and 0xff0000)) shr 8
                        } else throw IllegalArgumentException()
                    } else if (i_1135_ == 2) {
                        if (i_1134_ == 1) {
                            val i_1176_ = (anIntArray9936[i_1131_])
                            var i_1177_ = is_1133_!![i_1132_]
                            val i_1178_ = i_1176_ + i_1177_
                            val i_1179_ = (i_1176_ and 0xff00ff) + (i_1177_ and 0xff00ff)
                            i_1177_ = (i_1179_ and 0x1000100) + (i_1178_ - i_1179_ and 0x10000)
                            is_1133_[i_1132_] = i_1178_ - i_1177_ or i_1177_ - (i_1177_ ushr 8)
                        } else if (i_1134_ == 0) {
                            var i_1180_ = (anIntArray9936[i_1131_])
                            val i_1181_ = (((i_1180_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                            val i_1182_ = ((i_1180_ and 0xff00) * anInt8463 and 0xff0000)
                            val i_1183_ = ((i_1180_ and 0xff) * anInt8465 and 0xff00)
                            i_1180_ = (i_1181_ or i_1182_ or i_1183_) ushr 8
                            var i_1184_ = is_1133_!![i_1132_]
                            val i_1185_ = i_1180_ + i_1184_
                            val i_1186_ = (i_1180_ and 0xff00ff) + (i_1184_ and 0xff00ff)
                            i_1184_ = (i_1186_ and 0x1000100) + (i_1185_ - i_1186_ and 0x10000)
                            is_1133_[i_1132_] = i_1185_ - i_1184_ or i_1184_ - (i_1184_ ushr 8)
                        } else if (i_1134_ == 3) {
                            var i_1187_ = (anIntArray9936[i_1131_])
                            val i_1188_ = anInt8480
                            var i_1189_ = i_1187_ + i_1188_
                            var i_1190_ = (i_1187_ and 0xff00ff) + (i_1188_ and 0xff00ff)
                            var i_1191_ = ((i_1190_ and 0x1000100) + (i_1189_ - i_1190_ and 0x10000))
                            i_1187_ = i_1189_ - i_1191_ or i_1191_ - (i_1191_ ushr 8)
                            i_1191_ = is_1133_!![i_1132_]
                            i_1189_ = i_1187_ + i_1191_
                            i_1190_ = (i_1187_ and 0xff00ff) + (i_1191_ and 0xff00ff)
                            i_1191_ = (i_1190_ and 0x1000100) + (i_1189_ - i_1190_ and 0x10000)
                            is_1133_[i_1132_] = i_1189_ - i_1191_ or i_1191_ - (i_1191_ ushr 8)
                        } else if (i_1134_ == 2) {
                            var i_1192_ = (anIntArray9936[i_1131_])
                            val i_1193_ = (((i_1192_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                            val i_1194_ = ((i_1192_ and 0xff00) * anInt8477 and 0xff0000)
                            i_1192_ = (((i_1193_ or i_1194_) ushr 8) + anInt8474)
                            var i_1195_ = is_1133_!![i_1132_]
                            val i_1196_ = i_1192_ + i_1195_
                            val i_1197_ = (i_1192_ and 0xff00ff) + (i_1195_ and 0xff00ff)
                            i_1195_ = (i_1197_ and 0x1000100) + (i_1196_ - i_1197_ and 0x10000)
                            is_1133_[i_1132_] = i_1196_ - i_1195_ or i_1195_ - (i_1195_ ushr 8)
                        }
                    } else throw IllegalArgumentException()
                    i_1126_ += anInt8481
                    i_1127_ += anInt8450
                    i_1128_++
                }
                anInt8458 += anInt8457
                anInt8467 += anInt8452
                anInt8451 += anInt8453
            }
        } else {
            for (i_1198_ in anInt8468..-1) {
                var i_1199_ = anInt8451
                var i_1200_ = anInt8458 + anInt8479
                var i_1201_ = anInt8467 + anInt8475
                var i_1202_ = anInt8478
                if (i_1200_ < 0) {
                    val i_1203_ = ((anInt8481 - 1 - i_1200_) / anInt8481)
                    i_1202_ += i_1203_
                    i_1200_ += anInt8481 * i_1203_
                    i_1201_ += anInt8450 * i_1203_
                    i_1199_ += i_1203_
                }
                var i_1204_: Int
                if ((((1 + i_1200_ - (this.anInt8471 shl 12) - anInt8481) / anInt8481).also { i_1204_ = it }) > i_1202_) i_1202_ = i_1204_
                if (i_1201_ < 0) {
                    i_1204_ = ((anInt8450 - 1 - i_1201_) / anInt8450)
                    i_1202_ += i_1204_
                    i_1200_ += anInt8481 * i_1204_
                    i_1201_ += anInt8450 * i_1204_
                    i_1199_ += i_1204_
                }
                if ((((1 + i_1201_ - (this.anInt8470 shl 12) - anInt8450) / anInt8450).also { i_1204_ = it }) > i_1202_) i_1202_ = i_1204_
                while ( /**/i_1202_ < 0) {
                    var i_1205_ = ((i_1201_ shr 12) * this.anInt8471 + (i_1200_ shr 12))
                    val i_1206_ = i_1199_++
                    val is_1207_ = `is`
                    val i_1208_ = i
                    val i_1209_ = i_611_
                    if (i_1209_ == 0) {
                        if (i_1208_ == 1) is_1207_!![i_1206_] = (anIntArray9936[i_1205_])
                        else if (i_1208_ == 0) {
                            val i_1210_ = (anIntArray9936[i_1205_++])
                            val i_1211_ = (((i_1210_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                            val i_1212_ = ((i_1210_ and 0xff00) * anInt8463 and 0xff0000)
                            val i_1213_ = ((i_1210_ and 0xff) * anInt8465 and 0xff00)
                            is_1207_!![i_1206_] = (i_1211_ or i_1212_ or i_1213_) ushr 8
                        } else if (i_1208_ == 3) {
                            val i_1214_ = (anIntArray9936[i_1205_++])
                            val i_1215_ = anInt8480
                            val i_1216_ = i_1214_ + i_1215_
                            val i_1217_ = (i_1214_ and 0xff00ff) + (i_1215_ and 0xff00ff)
                            val i_1218_ = ((i_1217_ and 0x1000100) + (i_1216_ - i_1217_ and 0x10000))
                            is_1207_!![i_1206_] = i_1216_ - i_1218_ or i_1218_ - (i_1218_ ushr 8)
                        } else if (i_1208_ == 2) {
                            val i_1219_ = (anIntArray9936[i_1205_])
                            val i_1220_ = (((i_1219_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                            val i_1221_ = ((i_1219_ and 0xff00) * anInt8477 and 0xff0000)
                            is_1207_!![i_1206_] = (((i_1220_ or i_1221_) ushr 8) + anInt8474)
                        } else throw IllegalArgumentException()
                    } else if (i_1209_ == 1) {
                        if (i_1208_ == 1) {
                            val i_1222_ = (anIntArray9936[i_1205_])
                            val i_1223_ = i_1222_ ushr 24
                            val i_1224_ = 256 - i_1223_
                            val i_1225_ = is_1207_!![i_1206_]
                            is_1207_[i_1206_] = ((((i_1222_ and 0xff00ff) * i_1223_ + (i_1225_ and 0xff00ff) * i_1224_) and 0xff00ff.inv()) + (((i_1222_ and 0xff00) * i_1223_ + (i_1225_ and 0xff00) * i_1224_) and 0xff0000)) shr 8
                        } else if (i_1208_ == 0) {
                            var i_1226_ = (anIntArray9936[i_1205_])
                            val i_1227_ = ((i_1226_ ushr 24) * anInt8477 shr 8)
                            val i_1228_ = 256 - i_1227_
                            if ((anInt8480 and 0xffffff) == 16777215) {
                                val i_1229_ = is_1207_!![i_1206_]
                                is_1207_[i_1206_] = ((((i_1226_ and 0xff00ff) * i_1227_ + (i_1229_ and 0xff00ff) * i_1228_) and 0xff00ff.inv()) + (((i_1226_ and 0xff00) * i_1227_ + (i_1229_ and 0xff00) * i_1228_) and 0xff0000)) shr 8
                            } else if (i_1227_ == 255) {
                                val i_1234_ = (((i_1226_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_1235_ = (((i_1226_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_1236_ = (((i_1226_ and 0xff) * anInt8465) and 0xff00)
                                is_1207_!![i_1206_] = (i_1234_ or i_1235_ or i_1236_) ushr 8
                            } else {
                                val i_1230_ = (((i_1226_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                                val i_1231_ = (((i_1226_ and 0xff00) * anInt8463) and 0xff0000)
                                val i_1232_ = (((i_1226_ and 0xff) * anInt8465) and 0xff00)
                                i_1226_ = (i_1230_ or i_1231_ or i_1232_) ushr 8
                                val i_1233_ = is_1207_!![i_1206_]
                                is_1207_[i_1206_] = ((((i_1226_ and 0xff00ff) * i_1227_ + (i_1233_ and 0xff00ff) * i_1228_) and 0xff00ff.inv()) + (((i_1226_ and 0xff00) * i_1227_ + (i_1233_ and 0xff00) * i_1228_) and 0xff0000)) shr 8
                            }
                        } else if (i_1208_ == 3) {
                            var i_1237_ = (anIntArray9936[i_1205_])
                            val i_1238_ = anInt8480
                            val i_1239_ = i_1237_ + i_1238_
                            val i_1240_ = (i_1237_ and 0xff00ff) + (i_1238_ and 0xff00ff)
                            var i_1241_ = ((i_1240_ and 0x1000100) + (i_1239_ - i_1240_ and 0x10000))
                            i_1241_ = i_1239_ - i_1241_ or i_1241_ - (i_1241_ ushr 8)
                            val i_1242_ = ((i_1237_ ushr 24) * anInt8477 shr 8)
                            val i_1243_ = 256 - i_1242_
                            if (i_1242_ != 255) {
                                i_1237_ = i_1241_
                                i_1241_ = is_1207_!![i_1206_]
                                i_1241_ = ((((i_1237_ and 0xff00ff) * i_1242_ + (i_1241_ and 0xff00ff) * i_1243_) and 0xff00ff.inv()) + (((i_1237_ and 0xff00) * i_1242_ + (i_1241_ and 0xff00) * i_1243_) and 0xff0000)) shr 8
                            }
                            is_1207_!![i_1206_] = i_1241_
                        } else if (i_1208_ == 2) {
                            var i_1244_ = (anIntArray9936[i_1205_])
                            val i_1245_ = i_1244_ ushr 24
                            val i_1246_ = 256 - i_1245_
                            val i_1247_ = (((i_1244_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                            val i_1248_ = ((i_1244_ and 0xff00) * anInt8477 and 0xff0000)
                            i_1244_ = (((i_1247_ or i_1248_) ushr 8) + anInt8474)
                            val i_1249_ = is_1207_!![i_1206_]
                            is_1207_[i_1206_] = ((((i_1244_ and 0xff00ff) * i_1245_ + (i_1249_ and 0xff00ff) * i_1246_) and 0xff00ff.inv()) + (((i_1244_ and 0xff00) * i_1245_ + (i_1249_ and 0xff00) * i_1246_) and 0xff0000)) shr 8
                        } else throw IllegalArgumentException()
                    } else if (i_1209_ == 2) {
                        if (i_1208_ == 1) {
                            val i_1250_ = (anIntArray9936[i_1205_])
                            var i_1251_ = is_1207_!![i_1206_]
                            val i_1252_ = i_1250_ + i_1251_
                            val i_1253_ = (i_1250_ and 0xff00ff) + (i_1251_ and 0xff00ff)
                            i_1251_ = (i_1253_ and 0x1000100) + (i_1252_ - i_1253_ and 0x10000)
                            is_1207_[i_1206_] = i_1252_ - i_1251_ or i_1251_ - (i_1251_ ushr 8)
                        } else if (i_1208_ == 0) {
                            var i_1254_ = (anIntArray9936[i_1205_])
                            val i_1255_ = (((i_1254_ and 0xff0000) * anInt8469) and 0xffffff.inv())
                            val i_1256_ = ((i_1254_ and 0xff00) * anInt8463 and 0xff0000)
                            val i_1257_ = ((i_1254_ and 0xff) * anInt8465 and 0xff00)
                            i_1254_ = (i_1255_ or i_1256_ or i_1257_) ushr 8
                            var i_1258_ = is_1207_!![i_1206_]
                            val i_1259_ = i_1254_ + i_1258_
                            val i_1260_ = (i_1254_ and 0xff00ff) + (i_1258_ and 0xff00ff)
                            i_1258_ = (i_1260_ and 0x1000100) + (i_1259_ - i_1260_ and 0x10000)
                            is_1207_[i_1206_] = i_1259_ - i_1258_ or i_1258_ - (i_1258_ ushr 8)
                        } else if (i_1208_ == 3) {
                            var i_1261_ = (anIntArray9936[i_1205_])
                            val i_1262_ = anInt8480
                            var i_1263_ = i_1261_ + i_1262_
                            var i_1264_ = (i_1261_ and 0xff00ff) + (i_1262_ and 0xff00ff)
                            var i_1265_ = ((i_1264_ and 0x1000100) + (i_1263_ - i_1264_ and 0x10000))
                            i_1261_ = i_1263_ - i_1265_ or i_1265_ - (i_1265_ ushr 8)
                            i_1265_ = is_1207_!![i_1206_]
                            i_1263_ = i_1261_ + i_1265_
                            i_1264_ = (i_1261_ and 0xff00ff) + (i_1265_ and 0xff00ff)
                            i_1265_ = (i_1264_ and 0x1000100) + (i_1263_ - i_1264_ and 0x10000)
                            is_1207_[i_1206_] = i_1263_ - i_1265_ or i_1265_ - (i_1265_ ushr 8)
                        } else if (i_1208_ == 2) {
                            var i_1266_ = (anIntArray9936[i_1205_])
                            val i_1267_ = (((i_1266_ and 0xff00ff) * anInt8477) and 0xff00ff.inv())
                            val i_1268_ = ((i_1266_ and 0xff00) * anInt8477 and 0xff0000)
                            i_1266_ = (((i_1267_ or i_1268_) ushr 8) + anInt8474)
                            var i_1269_ = is_1207_!![i_1206_]
                            val i_1270_ = i_1266_ + i_1269_
                            val i_1271_ = (i_1266_ and 0xff00ff) + (i_1269_ and 0xff00ff)
                            i_1269_ = (i_1271_ and 0x1000100) + (i_1270_ - i_1271_ and 0x10000)
                            is_1207_[i_1206_] = i_1270_ - i_1269_ or i_1269_ - (i_1269_ ushr 8)
                        }
                    } else throw IllegalArgumentException()
                    i_1200_ += anInt8481
                    i_1201_ += anInt8450
                    i_1202_++
                }
                anInt8458 += anInt8457
                anInt8467 += anInt8452
                anInt8451 += anInt8453
            }
        }
    }
}
