import java.io.InputStream

class InputStream_Sub2 : InputStream() {
    override fun read(): Int {
        Class286_Sub5.method2161((-118).toByte(), 30000L)
        anInt80++
        return -1
    }

    companion object {
        @JvmField
        var anInt80: Int = 0
        @JvmField
        var anInt81: Int = 0
        @JvmField
        var aClass114_82: Class114? = Class114(71, 7)
        @JvmField
        var aClass243_83: Class243? = Class243()
        var aFloatArray84: FloatArray? = FloatArray(4)
        @JvmField
        var anInt85: Int = 0

        @JvmStatic
        fun method127(i: Byte) {
            if (i.toInt() != 118) Companion.method128(null, (-48).toByte())
            aFloatArray84 = null
            aClass243_83 = null
            aClass114_82 = null
        }

        @JvmStatic
        fun method128(class74: Class74?, i: Byte) {
            try {
                anInt81++
                if (class74 == Class348_Sub26.aClass74_6891) {
                    val i_0_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-124).toByte())
                    val i_1_ = i_0_ shr 2
                    val i_2_ = 0x3 and i_0_
                    val i_3_ = Class36.anIntArray487!![i_1_]
                    val i_4_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val i_5_ = Class299.aClass348_Sub49_Sub2_3813!!.readByteAdd(65.toByte())
                    val i_6_ = Class278.anInt3581 + (0x7 and (i_5_ shr 4))
                    val i_7_ = Class73.anInt4786 - -(i_5_ and 0x7)
                    if (Class282.method2112(126, Class312.anInt3931) || (i_6_ >= 0 && i_7_ >= 0 && Class367_Sub4.anInt7319 > i_6_ && (i_7_ < Class348_Sub40_Sub3.anInt9109))) Class348_Sub12.method2800(Class348_Sub40_Sub12.anInt9200, 0, i_7_, -1, i_1_, i_3_, i_2_, i_4_, 121.toByte(), i_6_)
                } else if (class74 == Class348_Sub40_Sub38.aClass74_9475) {
                    val i_8_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i + 247)
                    val i_9_ = Class278.anInt3581 + ((0x7a and i_8_) shr 4)
                    val i_10_ = Class73.anInt4786 - -(i_8_ and 0x7)
                    val i_11_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val i_12_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val i_13_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val i_14_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i.toInt() xor 0xf7)
                    if (i_9_ >= 0 && i_10_ >= 0 && i_9_ < Class367_Sub4.anInt7319 && Class348_Sub40_Sub3.anInt9109 > i_10_) {
                        val i_15_ = 512 * i_9_ - -256
                        val i_16_ = 256 + 512 * i_10_
                        var i_17_ = Class348_Sub40_Sub12.anInt9200
                        if (i_17_ < 3 && Class79.method802(i_10_, i_9_, true)) i_17_++
                        val class318_sub1_sub3_sub4 = (Class318_Sub1_Sub3_Sub4(i_11_, i_13_, Class367_Sub11.anInt7396, Class348_Sub40_Sub12.anInt9200, i_17_, i_15_, Class275.method2064(i_15_, Class348_Sub40_Sub12.anInt9200, 11219, i_16_) + -i_12_, i_16_, i_9_, i_9_, i_10_, i_10_, i_14_))
                        r_Sub2.aClass262_10492!!.method1999(Class348_Sub42_Sub6(class318_sub1_sub3_sub4), -20180)
                    }
                } else if (class74 == Class91.aClass74_1519) {
                    val i_18_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val i_19_ = Class278.anInt3581 - -(i_18_ shr 4 and 0x7)
                    val i_20_ = (0x7 and i_18_) + Class73.anInt4786
                    var i_21_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    if (i_21_ == 65535) i_21_ = -1
                    val i_22_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i + 247)
                    val i_23_ = i_22_ shr 4 and 0xf
                    val i_24_ = 0x7 and i_22_
                    val i_25_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val i_26_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val i_27_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(i + 842397936)
                    if (i_19_ >= 0 && i_20_ >= 0 && i_19_ < Class367_Sub4.anInt7319 && (i_20_ < Class348_Sub40_Sub3.anInt9109)) {
                        val i_28_ = 1 + i_23_
                        if (((Class132.aPlayer_1907!!.anIntArray10320!![0]) >= i_19_ + -i_28_) && i_28_ + i_19_ >= (Class132.aPlayer_1907!!.anIntArray10320!![0]) && ((Class132.aPlayer_1907!!.anIntArray10317!![0]) >= -i_28_ + i_20_) && i_20_ + i_28_ >= (Class132.aPlayer_1907!!.anIntArray10317!![0])) Class239_Sub10.method1760(
                            i_21_,
                            i_26_,
                            false,
                            ((i_20_ shl 8) + (((Class348_Sub40_Sub12.anInt9200) shl 24) + ((i_19_ shl 16) - -i_23_))),
                            (-98).toByte(),
                            i_24_,
                            i_27_,
                            i_25_
                        )
                    }
                } else if (class74 == Class348_Sub35.aClass74_6977) {
                    val i_29_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val i_30_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, i_29_).method478(i_30_, -31076)
                } else if (Class348_Sub16_Sub1.aClass74_8853 == class74) {
                    val i_31_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i + 247)
                    val i_32_ = Class278.anInt3581 + ((i_31_ and 0x7b) shr 4)
                    val i_33_ = (i_31_ and 0x7) + Class73.anInt4786
                    var i_34_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    if (i_34_ == 65535) i_34_ = -1
                    val i_35_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i + 247)
                    val i_36_ = 0xf and (i_35_ shr 4)
                    val i_37_ = 0x7 and i_35_
                    val i_38_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val i_39_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i.toInt() xor 0xf7)
                    val i_40_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    if (i_32_ >= 0 && i_33_ >= 0 && i_32_ < Class367_Sub4.anInt7319 && i_33_ < Class348_Sub40_Sub3.anInt9109) {
                        val i_41_ = i_36_ + 1
                        if ((Class132.aPlayer_1907!!.anIntArray10320!![0]) >= i_32_ - i_41_ && (Class132.aPlayer_1907!!.anIntArray10320!![0]) <= i_41_ + i_32_ && ((Class132.aPlayer_1907!!.anIntArray10317!![0]) >= -i_41_ + i_33_) && (i_33_ - -i_41_ >= (Class132.aPlayer_1907!!.anIntArray10317!![0]))) Class37.method358(i_37_, (i_36_ + (i_33_ shl 8) + ((Class348_Sub40_Sub12.anInt9200 shl 24) + (i_32_ shl 16))), i_38_, i_39_, i_40_, i_34_, -29494)
                    }
                } else if (Class265.aClass74_4689 == class74) {
                    var i_42_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                    if (i_42_ == 65535) i_42_ = -1
                    val i_43_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(65.toByte())
                    val i_44_ = ((i_43_ and 0x71) shr 4) + Class278.anInt3581
                    val i_45_ = Class73.anInt4786 + (i_43_ and 0x7)
                    val i_46_ = Class299.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                    val i_47_ = i_46_ shr 2
                    val i_48_ = i_46_ and 0x3
                    val i_49_ = Class36.anIntArray487!![i_47_]
                    ha_Sub3.method3824(i_45_, i_42_, i_47_, i_44_, i_48_, 115, Class348_Sub40_Sub12.anInt9200, i_49_)
                } else if (class74 == Class286_Sub1.aClass74_6201) {
                    val i_50_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    var i_51_ = (i_50_ shr 4 and 0xf) + Class278.anInt3581 * 2
                    var i_52_ = (i_50_ and 0xf) + Class73.anInt4786 * 2
                    val i_53_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val bool = (0x1 and i_53_) != 0
                    val bool_54_ = (i_53_ and 0x2) != 0
                    val i_55_ = if (bool_54_) i_53_ shr 2 else -1
                    var i_56_ = (Class299.aClass348_Sub49_Sub2_3813!!.readByte(-77) + i_51_)
                    var i_57_ = (Class299.aClass348_Sub49_Sub2_3813!!.readByte(-88) + i_52_)
                    val i_58_ = Class299.aClass348_Sub49_Sub2_3813!!.readShort(13638)
                    val i_59_ = Class299.aClass348_Sub49_Sub2_3813!!.readShort(13638)
                    val i_60_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(i + 842397936)
                    var i_61_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    if (!bool_54_) i_61_ *= 4
                    else i_61_ = i_61_.toByte().toInt()
                    var i_62_ = (Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i.toInt() xor 0xf7) * 4)
                    val i_63_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(i + 842397936)
                    val i_64_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    var i_65_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    var i_66_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    if (i_65_ == 255) i_65_ = -1
                    if (i_51_ >= 0 && i_52_ >= 0 && (i_51_ < 2 * Class367_Sub4.anInt7319) && (i_52_ < Class367_Sub4.anInt7319 * 2) && i_56_ >= 0 && i_57_ >= 0 && (i_56_ < Class348_Sub40_Sub3.anInt9109 * 2) && 2 * Class348_Sub40_Sub3.anInt9109 > i_57_ && i_60_ != 65535) {
                        i_57_ *= 256
                        i_56_ = 256 * i_56_
                        i_62_ = i_62_ shl 2
                        i_51_ = 256 * i_51_
                        i_66_ = i_66_ shl 2
                        i_61_ = i_61_ shl 2
                        i_52_ *= 256
                        if (i_58_ != 0 && i_55_ != -1) {
                            var class318_sub1_sub3_sub3: Class318_Sub1_Sub3_Sub3? = null
                            if (i_58_ < 0) {
                                val i_67_ = -i_58_ + -1
                                if (Class348_Sub42_Sub11.anInt9591 != i_67_) class318_sub1_sub3_sub3 = (Class294.aPlayerArray5058!![i_67_])
                                else class318_sub1_sub3_sub3 = (Class132.aPlayer_1907)
                            } else {
                                val i_68_ = i_58_ + -1
                                val class348_sub22 = (Class282.aClass356_3654!!.method3480(i_68_.toLong(), -6008) as? Class348_Sub22?)
                                if (class348_sub22 != null) class318_sub1_sub3_sub3 = (class348_sub22.aNpc_6859)
                            }
                            if (class318_sub1_sub3_sub3 != null) {
                                val class225 = class318_sub1_sub3_sub3.method2422(72.toByte())
                                if ((class225.anIntArrayArray2939 != null) && (class225.anIntArrayArray2939!![i_55_]) != null) i_61_ -= (class225.anIntArrayArray2939!![i_55_]!![1])
                                if ((class225.anIntArrayArray2910 != null) && (class225.anIntArrayArray2910!![i_55_]) != null) i_61_ -= (class225.anIntArrayArray2910!![i_55_]!![1])
                            }
                        }
                        val class318_sub1_sub3_sub5 = (Class318_Sub1_Sub3_Sub5(i_60_, Class348_Sub40_Sub12.anInt9200, Class348_Sub40_Sub12.anInt9200, i_51_, i_52_, i_61_, i_63_ - -Class367_Sub11.anInt7396, i_64_ + Class367_Sub11.anInt7396, i_65_, i_66_, i_58_, i_59_, i_62_, bool, i_55_))
                        class318_sub1_sub3_sub5.method2471((-103).toByte(), (-i_62_ + Class275.method2064(i_56_, Class348_Sub40_Sub12.anInt9200, 11219, i_57_)), i_57_, i_63_ + Class367_Sub11.anInt7396, i_56_)
                        Class348_Sub40_Sub17.aClass262_9240!!.method1999(Class348_Sub42_Sub18(class318_sub1_sub3_sub5), -20180)
                    }
                } else if (class74 == Class348_Sub42_Sub8_Sub2.aClass74_10437) {
                    val i_69_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-128)
                    val i_70_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(31.toByte())
                    val i_71_ = Class73.anInt4786 + (i_70_ and 0x7)
                    val i_72_ = Class90.regionTileY + i_71_
                    val i_73_ = Class278.anInt3581 + (i_70_ shr 4 and 0x7)
                    val i_74_ = za_Sub2.regionTileX + i_73_
                    val class348_sub37 = ((Class130.aClass356_1895!!.method3480((i_72_ shl 14 or (Class348_Sub40_Sub12.anInt9200 shl 28) or i_74_).toLong(), -6008)) as Class348_Sub37?)
                    if (class348_sub37 != null) {
                        var class348_sub34 = (class348_sub37.aClass262_6998.method1995(4) as Class348_Sub34?)
                        while (class348_sub34 != null) {
                            if ((0x7fff and i_69_) == class348_sub34.anInt6973) {
                                class348_sub34.method2715(127.toByte())
                                break
                            }
                            class348_sub34 = (class348_sub37.aClass262_6998.method1990(49.toByte()) as Class348_Sub34?)
                        }
                        if (class348_sub37.aClass262_6998.method2002(18.toByte())) class348_sub37.method2715(62.toByte())
                        if (i_73_ >= 0 && i_71_ >= 0 && Class367_Sub4.anInt7319 > i_73_ && Class348_Sub40_Sub3.anInt9109 > i_71_) Class203.method1479(i_71_, (-125).toByte(), i_73_, Class348_Sub40_Sub12.anInt9200)
                    }
                } else if (Class59_Sub1_Sub2.aClass74_8662 == class74) {
                    val i_75_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                    val i_76_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                    val i_77_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val i_78_ = Class73.anInt4786 - -(0x7 and i_77_)
                    val i_79_ = i_78_ + Class90.regionTileY
                    val i_80_ = Class278.anInt3581 - -((i_77_ and 0x79) shr 4)
                    val i_81_ = za_Sub2.regionTileX - -i_80_
                    val bool = (i_80_ >= 0 && i_78_ >= 0 && Class367_Sub4.anInt7319 > i_80_ && Class348_Sub40_Sub3.anInt9109 > i_78_)
                    if (bool || Class282.method2112(124, Class312.anInt3931)) {
                        Class352.method3459(Class348_Sub34(i_76_, i_75_), Class348_Sub40_Sub12.anInt9200, i_79_, i_81_, -2)
                        if (bool) Class203.method1479(i_78_, (-124).toByte(), i_80_, Class348_Sub40_Sub12.anInt9200)
                    }
                } else if (class74 == Class374.aClass74_4537) {
                    val i_82_ = Class299.aClass348_Sub49_Sub2_3813!!.readByteAdd(83.toByte())
                    val i_83_ = i_82_ shr 2
                    val i_84_ = 0x3 and i_82_
                    val i_85_ = Class36.anIntArray487!![i_83_]
                    val i_86_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i.toInt() xor 0xf7)
                    val i_87_ = Class278.anInt3581 + (i_86_ shr 4 and 0x7)
                    val i_88_ = Class73.anInt4786 - -(0x7 and i_86_)
                    if (Class282.method2112(i.toInt() xor 0x73, Class312.anInt3931) || (i_87_ >= 0 && i_88_ >= 0 && Class367_Sub4.anInt7319 > i_87_ && (i_88_ < Class348_Sub40_Sub3.anInt9109))) Class348_Sub12.method2800(Class348_Sub40_Sub12.anInt9200, 0, i_88_, -1, i_83_, i_85_, i_84_, -1, 125.toByte(), i_87_)
                } else {
                    if (i.toInt() != 8) aClass114_82 = null
                    if (Class39.aClass74_515 == class74) {
                        val i_89_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        val i_90_ = Class73.anInt4786 + (0x7 and i_89_)
                        val i_91_ = i_90_ + Class90.regionTileY
                        val i_92_ = (Class278.anInt3581 - -((i_89_ and 0x7a) shr 4))
                        val i_93_ = za_Sub2.regionTileX + i_92_
                        val i_94_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        val i_95_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(i + 842397936)
                        val i_96_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        if (Class130.aClass356_1895 != null) {
                            val class348_sub37 = ((Class130.aClass356_1895!!.method3480((i_93_ or ((Class348_Sub40_Sub12.anInt9200 shl 28) or (i_91_ shl 14))).toLong(), -6008)) as Class348_Sub37?)
                            if (class348_sub37 != null) {
                                var class348_sub34 = (class348_sub37.aClass262_6998.method1995(4) as Class348_Sub34?)
                                while (class348_sub34 != null) {
                                    if ((class348_sub34.anInt6973) == (0x7fff and i_94_) && i_95_ == class348_sub34.anInt6971) {
                                        class348_sub34.method2715(32.toByte())
                                        class348_sub34.anInt6971 = i_96_
                                        Class352.method3459(class348_sub34, (Class348_Sub40_Sub12.anInt9200), i_91_, i_93_, i.toInt() xor 0x9.inv())
                                        break
                                    }
                                    class348_sub34 = (class348_sub37.aClass262_6998.method1990(34.toByte()) as Class348_Sub34?)
                                }
                                if (i_92_ >= 0 && i_90_ >= 0 && (i_92_ < Class367_Sub4.anInt7319) && (Class348_Sub40_Sub3.anInt9109 > i_90_)) Class203.method1479(i_90_, (-125).toByte(), i_92_, (Class348_Sub40_Sub12.anInt9200))
                            }
                        }
                    } else if (class74 == Class327.aClass74_4098) {
                        val i_97_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                        val i_98_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        val i_99_ = (0x7 and i_98_) + Class73.anInt4786
                        val i_100_ = Class90.regionTileY + i_99_
                        val i_101_ = Class278.anInt3581 - -((i_98_ and 0x7b) shr 4)
                        val i_102_ = za_Sub2.regionTileX + i_101_
                        val i_103_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(-25)
                        val i_104_ = Class299.aClass348_Sub49_Sub2_3813!!.readShortAdd(123)
                        if (i_104_ != Class348_Sub42_Sub11.anInt9591) {
                            val bool = (i_101_ >= 0 && i_99_ >= 0 && (i_101_ < Class367_Sub4.anInt7319) && (i_99_ < Class348_Sub40_Sub3.anInt9109))
                            if (bool || Class282.method2112(122, Class312.anInt3931)) {
                                Class352.method3459(Class348_Sub34(i_103_, i_97_), Class348_Sub40_Sub12.anInt9200, i_100_, i_102_, i + -10)
                                if (bool) Class203.method1479(i_99_, (-120).toByte(), i_101_, (Class348_Sub40_Sub12.anInt9200))
                            }
                        }
                    } else if (class74 == Class162.aClass74_2157) {
                        val i_105_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i + 247)
                        val bool = (0x80 and i_105_) != 0
                        var i_106_ = Class278.anInt3581 - -(i_105_ shr 3 and 0x7)
                        var i_107_ = (0x7 and i_105_) + Class73.anInt4786
                        var i_108_ = i_106_ - -Class299.aClass348_Sub49_Sub2_3813!!.readByte(-94)
                        var i_109_ = (Class299.aClass348_Sub49_Sub2_3813!!.readByte(-87) + i_107_)
                        val i_110_ = Class299.aClass348_Sub49_Sub2_3813!!.readShort(13638)
                        val i_111_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(i + 842397936)
                        var i_112_ = (Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) * 4)
                        var i_113_ = (Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) * 4)
                        val i_114_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(i + 842397936)
                        val i_115_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(i + 842397936)
                        var i_116_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        if (i_116_ == 255) i_116_ = -1
                        var i_117_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        if (i_106_ >= 0 && i_107_ >= 0 && (i_106_ < Class367_Sub4.anInt7319) && i_107_ < Class348_Sub40_Sub3.anInt9109 && i_108_ >= 0 && i_109_ >= 0 && Class367_Sub4.anInt7319 > i_108_ && (Class348_Sub40_Sub3.anInt9109 > i_109_) && i_111_ != 65535) {
                            i_117_ = i_117_ shl 2
                            i_109_ = 256 + i_109_ * 512
                            i_113_ = i_113_ shl 2
                            i_108_ = 256 + 512 * i_108_
                            i_107_ = i_107_ * 512 + 256
                            i_106_ = i_106_ * 512 + 256
                            i_112_ = i_112_ shl 2
                            val class318_sub1_sub3_sub5 = (Class318_Sub1_Sub3_Sub5(i_111_, Class348_Sub40_Sub12.anInt9200, Class348_Sub40_Sub12.anInt9200, i_106_, i_107_, i_112_, i_114_ + Class367_Sub11.anInt7396, Class367_Sub11.anInt7396 + i_115_, i_116_, i_117_, 0, i_110_, i_113_, bool, -1))
                            class318_sub1_sub3_sub5.method2471((-103).toByte(), Class275.method2064(i_108_, (Class348_Sub40_Sub12.anInt9200), 11219, i_109_) + -i_113_, i_109_, i_114_ + Class367_Sub11.anInt7396, i_108_)
                            Class348_Sub40_Sub17.aClass262_9240!!.method1999(Class348_Sub42_Sub18(class318_sub1_sub3_sub5), -20180)
                        }
                    } else if (Class186.aClass74_2491 == class74) {
                        Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        val i_118_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i + 247)
                        val i_119_ = (i_118_ shr 4 and 0x7) + Class278.anInt3581
                        val i_120_ = (0x7 and i_118_) + Class73.anInt4786
                        val i_121_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(i.toInt() xor 0x3235f8f0)
                        val i_122_ = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        val i_123_ = Class299.aClass348_Sub49_Sub2_3813!!.readMedium(-1)
                        val string = Class299.aClass348_Sub49_Sub2_3813!!.readString((-126).toByte())
                        Class6.method205(i_121_, i_119_, i_123_, string, i_122_, -109, i_120_, Class348_Sub40_Sub12.anInt9200)
                    } else {
                        Class156.method1242("T3 - " + class74, null, 15004)
                        Class348_Sub40_Sub34.method3141(false, 11.toByte())
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("sfa.A(" + (if (class74 != null) "{...}" else "null") + ',' + i + ')'))
            }
        }
    }
}
