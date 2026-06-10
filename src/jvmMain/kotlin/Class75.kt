import Class25.Companion.method303
import Class35.method353
import Class46.Companion.method424
import Class59_Sub2_Sub1.Companion.method566

/* Class75 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class Class75 {
    companion object {
        @JvmField
        var aClass45_1237: Class45? = null
        @JvmField
        var aClass153_1238: Class153? = null
        private var aClass268_1239: Class268? = null
        private var aClass183_1240: Class183? = null
        private var aClass356_1241: Class356? = Class356(16)
        @JvmField
        var aClass141_1242: Class141? = null
        @JvmField
        var aClass348_Sub42_Sub14_1243: Class348_Sub42_Sub14? = null
        @JvmField
        var anInterface17_1244: Interface17? = null
        @JvmField
        var aClass263_1245: Class263? = null
        @JvmField
        var aClass252_1246: Class252? = null
        @JvmField
        var aFloat1247: Float = 0f
        private var aByteArray1248: ByteArray?
        @JvmField
        var aFloat1249: Float = 0f
        @JvmField
        var anInt1250: Int
        @JvmField
        var aByteArrayArrayArray1251: Array<Array<ByteArray?>?>? = null
        private var aShortArray1252: ShortArray?
        @JvmField
        var anInt1253: Int = (Math.random() * 17.0).toInt() - 8
        @JvmField
        var aClass262_1254: Class262?
        @JvmField
        var anInt1255: Int = 0
        private var aByteArray1256: ByteArray? = null
        @JvmField
        var anInt1257: Int = 0
        private var aByteArray1258: ByteArray? = null
        @JvmField
        var anInt1259: Int = 0
        private var anIntArray1260: IntArray? = null
        private var aShortArray1261: ShortArray? = null
        @JvmField
        var anInt1262: Int = 0
        @JvmField
        var anInt1263: Int = 0
        private var aByteArray1264: ByteArray? = null
        @JvmField
        var anInt1265: Int = 0
        @JvmField
        var anInt1266: Int = 0
        @JvmField
        var anInt1267: Int = 0
        @JvmField
        var anInt1268: Int = 0
        private var aClass243ArrayArrayArray1269: Array<Array<Array<Class243?>?>?>? = null
        private var aShortArray1270: ShortArray? = null
        private var aClass356_1271: Class356? = null
        @JvmField
        var anInt1272: Int = 0
        private var aByteArray1273: ByteArray? = null
        @JvmField
        var anInt1274: Int = 0
        private var aByteArray1275: ByteArray? = null
        @JvmField
        var anInt1276: Int = 0
        @JvmField
        var anInt1277: Int = 0

        @JvmStatic
        fun method745(var_ha: ha, class348_sub21: Class348_Sub21, class42: Class42) {
            if (class42.anIntArray591 != null) {
                val `is` = IntArray(class42.anIntArray591!!.size)
                for (i in 0..<`is`.size / 2) {
                    val i_0_ = (class42.anIntArray591!![i * 2] + class348_sub21.anInt6852)
                    val i_1_ = (class42.anIntArray591!![i * 2 + 1] + class348_sub21.anInt6851)
                    `is`[i * 2] = anInt1272 + ((anInt1276 - anInt1272) * (i_0_ - anInt1274) / (anInt1265 - anInt1274))
                    `is`[i * 2 + 1] = anInt1268 - ((anInt1268 - anInt1262) * (i_1_ - anInt1257) / (anInt1277 - anInt1257))
                }
                Class329.method2620(var_ha, `is`, class42.anInt582)
                if (class42.anInt584 > 0) {
                    for (i in 0..<`is`.size / 2 - 1) {
                        var i_2_ = `is`[i * 2]
                        var i_3_ = `is`[i * 2 + 1]
                        var i_4_ = `is`[(i + 1) * 2]
                        var i_5_ = `is`[(i + 1) * 2 + 1]
                        if (i_4_ < i_2_) {
                            val i_6_ = i_2_
                            val i_7_ = i_3_
                            i_2_ = i_4_
                            i_3_ = i_5_
                            i_4_ = i_6_
                            i_5_ = i_7_
                        } else if (i_4_ == i_2_ && i_5_ < i_3_) {
                            val i_8_ = i_3_
                            i_3_ = i_5_
                            i_5_ = i_8_
                        }
                        var_ha.method3674(i_2_, i_3_, i_4_, i_5_, (class42.anIntArray572[(class42.aByteArray564[i].toInt() and 0xff)]), 1, class42.anInt584, class42.anInt575, class42.anInt601)
                    }
                    var i = `is`[`is`.size - 2]
                    var i_9_ = `is`[`is`.size - 1]
                    var i_10_ = `is`[0]
                    var i_11_ = `is`[1]
                    if (i_10_ < i) {
                        val i_12_ = i
                        val i_13_ = i_9_
                        i = i_10_
                        i_9_ = i_11_
                        i_10_ = i_12_
                        i_11_ = i_13_
                    } else if (i_10_ == i && i_11_ < i_9_) {
                        val i_14_ = i_9_
                        i_9_ = i_11_
                        i_11_ = i_14_
                    }
                    var_ha.method3674(i, i_9_, i_10_, i_11_, (class42.anIntArray572[(class42.aByteArray564[(class42.aByteArray564.size - 1)]).toInt() and 0xff]), 1, class42.anInt584, class42.anInt575, class42.anInt601)
                } else {
                    for (i in 0..<`is`.size / 2 - 1) var_ha.method3645(`is`[i * 2 + 1], `is`[i * 2], `is`[(i + 1) * 2], -8003, (class42.anIntArray572[(class42.aByteArray564[i].toInt() and 0xff)]), `is`[(i + 1) * 2 + 1])
                    var_ha.method3645(`is`[`is`.size - 1], `is`[`is`.size - 2], `is`[0], -8003, (class42.anIntArray572[(class42.aByteArray564[(class42.aByteArray564.size - 1)]).toInt() and 0xff]), `is`[1])
                }
            }
        }

        @JvmStatic
        fun method746() {
            aClass268_1239 = null
            aClass183_1240 = null
            aClass263_1245 = null
            aClass153_1238 = null
            aClass141_1242 = null
            anInterface17_1244 = null
            aClass348_Sub42_Sub14_1243 = null
            aClass45_1237 = null
            aClass356_1241 = null
            aByteArrayArrayArray1251 = null
            aShortArray1252 = null
            aByteArray1248 = null
            aClass252_1246 = null
            aClass262_1254 = null
            anIntArray1260 = null
            aByteArray1273 = null
            aByteArray1264 = null
            aShortArray1270 = null
            aByteArray1256 = null
            aByteArray1275 = null
            aShortArray1261 = null
            aByteArray1258 = null
            aClass356_1271 = null
            aClass243ArrayArrayArray1269 = null
        }

        private fun method747(var_ha: ha?, class348_sub21: Class348_Sub21, i: Int, i_15_: Int, i_16_: Int, i_17_: Int) {
            class348_sub21.anInt6853 = (anInt1272 + (i_16_ + i * (class348_sub21.anInt6852 - anInt1274) shr 16))
            class348_sub21.anInt6855 = (anInt1268 - (i_17_ + i_15_ * (class348_sub21.anInt6851 - anInt1257) shr 16))
        }

        @JvmStatic
        fun method748(var_ha: ha) {
            val i: Int = anInt1265 - anInt1274
            val i_18_: Int = anInt1277 - anInt1257
            val i_19_: Int = (anInt1276 - anInt1272 shl 16) / i
            val i_20_: Int = (anInt1268 - anInt1262 shl 16) / i_18_
            method765(var_ha, i_19_, i_20_, 0, 0)
        }

        @JvmStatic
        fun method749() {
            aByteArray1273 = null
            aByteArray1264 = null
            aShortArray1270 = null
            aByteArray1256 = null
            aByteArray1275 = null
            aShortArray1261 = null
            aByteArray1258 = null
            aClass356_1271 = null
            aClass243ArrayArrayArray1269 = null
            anIntArray1260 = null
        }

        private fun method750(var_ha: ha?, class348_sub49: Class348_Sub49, i: Int, i_21_: Int, i_22_: Int, i_23_: Int, `is`: IntArray, is_24_: IntArray) {
            val i_25_ = class348_sub49.readUnsignedByte(255)
            if ((i_25_ and 0x1) == 0) {
                val bool = (i_25_ and 0x2) == 0
                var i_26_ = i_25_ shr 2 and 0x3f
                if (i_26_ != 62) {
                    if (i_26_ == 63) i_26_ = class348_sub49.readUnsignedByte(255)
                    else if (bool) i_26_ = `is`[i_26_]
                    else i_26_ = is_24_[i_26_]
                    if (bool) {
                        aByteArray1273!![i_22_ + i_23_ * anInt1259] = i_26_.toByte()
                        aByteArray1256!![i_22_ + i_23_ * anInt1259] = 0.toByte()
                    } else {
                        aByteArray1256!![i_22_ + i_23_ * anInt1259] = i_26_.toByte()
                        aByteArray1275!![i_22_ + i_23_ * anInt1259] = 0.toByte()
                        aByteArray1273!![i_22_ + i_23_ * anInt1259] = class348_sub49.readByte(-115)
                    }
                }
            } else {
                val i_27_ = (i_25_ shr 1 and 0x3) + 1
                val bool = (i_25_ and 0x8) != 0
                val bool_28_ = (i_25_ and 0x10) != 0
                for (i_29_ in 0..<i_27_) {
                    val i_30_ = class348_sub49.readUnsignedByte(255)
                    var i_31_ = 0
                    var i_32_ = 0
                    if (bool) {
                        i_31_ = class348_sub49.readUnsignedByte(255)
                        i_32_ = class348_sub49.readUnsignedByte(255)
                    }
                    var i_33_ = 0
                    if (bool_28_) i_33_ = class348_sub49.readUnsignedByte(255)
                    if (i_29_ == 0) {
                        aByteArray1273!![i_22_ + i_23_ * anInt1259] = i_30_.toByte()
                        aByteArray1256!![i_22_ + i_23_ * anInt1259] = i_31_.toByte()
                        aByteArray1275!![i_22_ + i_23_ * anInt1259] = i_32_.toByte()
                        if (i_33_ == 1) {
                            aShortArray1261!![i_22_ + i_23_ * anInt1259] = (class348_sub49.readUnsignedShort(842397944) + 1).toShort()
                            aByteArray1258!![i_22_ + i_23_ * anInt1259] = class348_sub49.readByte(-122)
                        } else if (i_33_ > 1) {
                            aShortArray1261!![i_22_ + i_23_ * anInt1259] = (-1).toShort()
                            val is_34_ = ShortArray(i_33_)
                            val is_35_ = ByteArray(i_33_)
                            for (i_36_ in 0..<i_33_) {
                                is_34_[i_36_] = class348_sub49.readUnsignedShort(842397944).toShort()
                                is_35_[i_36_] = class348_sub49.readByte(-120)
                            }
                            aClass356_1271!!.method3483(33.toByte(), (i_22_ shl 16 or i_23_).toLong(), Class348_Sub39(is_34_, is_35_))
                        }
                    } else {
                        var is_37_: ShortArray? = null
                        var is_38_: ByteArray? = null
                        if (i_33_ > 0) {
                            is_37_ = ShortArray(i_33_)
                            is_38_ = ByteArray(i_33_)
                            for (i_39_ in 0..<i_33_) {
                                is_37_[i_39_] = class348_sub49.readUnsignedShort(842397944).toShort()
                                is_38_[i_39_] = class348_sub49.readByte(-92)
                            }
                        }
                        if ((aClass243ArrayArrayArray1269!![i_29_ - 1]!![i - (anInt1266 shr 6)]!![i_21_ - (anInt1263 shr 6)]) == null) aClass243ArrayArrayArray1269!![i_29_ - 1]!![i - (anInt1266 shr 6)]!![i_21_ - (anInt1263 shr 6)] = Class243()
                        val class318_sub8 = Class318_Sub8(i_22_ and 0x3f, i_23_ and 0x3f, i_30_, i_31_, i_32_, is_37_, is_38_)
                        aClass243ArrayArrayArray1269!![i_29_ - 1]!![i - (anInt1266 shr 6)]!![i_21_ - (anInt1263 shr 6)]!!.method1869(-86, class318_sub8)
                    }
                }
            }
        }

        @JvmStatic
        fun method751(i: Int, i_40_: Int, i_41_: Int, i_42_: Int, i_43_: Int, i_44_: Int, i_45_: Int, i_46_: Int) {
            anInt1274 = i - anInt1266
            anInt1277 = i_40_ - anInt1263
            anInt1265 = i_41_ - anInt1266
            anInt1257 = i_42_ - anInt1263
            anInt1272 = i_43_
            anInt1262 = i_44_
            anInt1276 = i_45_
            anInt1268 = i_46_
        }

        @JvmStatic
        fun method752(class45: Class45?, class268: Class268?, class183: Class183?, class263: Class263?, class153: Class153?, class141: Class141?, interface17: Interface17?) {
            aClass45_1237 = class45
            aClass268_1239 = class268
            aClass183_1240 = class183
            aClass263_1245 = class263
            aClass153_1238 = class153
            aClass141_1242 = class141
            anInterface17_1244 = interface17
            aClass356_1241!!.method3481(0)
            val i: Int = aClass45_1237!!.method417("details", 0)
            val `is`: IntArray? = aClass45_1237!!.method396(i, 0)
            if (`is` != null) {
                for (i_47_ in `is`.indices) {
                    val class348_sub42_sub14 = Class150.method1205(`is`[i_47_], true, aClass45_1237!!, i)
                    aClass356_1241!!.method3483(25.toByte(), class348_sub42_sub14.anInt9628.toLong(), class348_sub42_sub14)
                }
            }
            method566(true, false, 11.toByte())
        }

        private fun method753() {
            for (i in 0..<anInt1259) {
                for (i_48_ in 0..<anInt1267) {
                    val i_49_: Int = aShortArray1261!![i + i_48_ * anInt1259].toInt() and 0xffff
                    if (i_49_ != 0) {
                        if (i_49_ == 65535) {
                            val class348_sub39 = (aClass356_1271!!.method3480((i shl 16 or i_48_).toLong(), -6008) as Class348_Sub39?)
                            if (class348_sub39 != null) {
                                for (i_50_ in (class348_sub39.aShortArray7024)!!.indices) {
                                    var class51: Class51? = (aClass263_1245!!.method2005(0, (class348_sub39.aShortArray7024!![i_50_]).toInt() and 0xffff))
                                    var i_51_ = class51!!.anInt921
                                    if (class51.anIntArray945 != null) {
                                        class51 = class51.method480(anInterface17_1244!!, 47.toByte())
                                        if (class51 != null) i_51_ = class51.anInt921
                                    }
                                    if (i_51_ != -1) {
                                        val class348_sub21 = Class348_Sub21(i_51_)
                                        class348_sub21.anInt6852 = i
                                        class348_sub21.anInt6851 = i_48_
                                        aClass262_1254!!.method1999(class348_sub21, -20180)
                                    }
                                }
                            }
                        } else {
                            var class51: Class51? = aClass263_1245!!.method2005(0, i_49_ - 1)
                            var i_52_ = class51!!.anInt921
                            if (class51.anIntArray945 != null) {
                                class51 = class51.method480(anInterface17_1244!!, 47.toByte())
                                if (class51 != null) i_52_ = class51.anInt921
                            }
                            if (i_52_ != -1) {
                                val class348_sub21 = Class348_Sub21(i_52_)
                                class348_sub21.anInt6852 = i
                                class348_sub21.anInt6851 = i_48_
                                aClass262_1254!!.method1999(class348_sub21, -20180)
                            }
                        }
                    }
                }
            }
            for (i in 0..2) {
                for (i_53_ in aClass243ArrayArrayArray1269!![0]!!.indices) {
                    for (i_54_ in aClass243ArrayArrayArray1269!![0]!![0]!!.indices) {
                        val class243: Class243? = aClass243ArrayArrayArray1269!![i]!![i_53_]!![i_54_]
                        if (class243 != null) {
                            var class318_sub8 = class243.method1872(8) as Class318_Sub8?
                            while (class318_sub8 != null) {
                                if (class318_sub8.aShortArray6461 != null) {
                                    for (i_55_ in (class318_sub8.aShortArray6461!!).indices) {
                                        var class51: Class51? = (aClass263_1245!!.method2005(0, (class318_sub8.aShortArray6461!![i_55_]).toInt() and 0xffff))
                                        var i_56_ = class51!!.anInt921
                                        if (class51.anIntArray945 != null) {
                                            class51 = (class51.method480(anInterface17_1244!!, 47.toByte()))
                                            if (class51 != null) i_56_ = class51.anInt921
                                        }
                                        if (i_56_ != -1) {
                                            val class348_sub21 = Class348_Sub21(i_56_)
                                            class348_sub21.anInt6852 = ((i_53_ + (anInt1266 shr 6)) * 64 + class318_sub8.aByte6466 - anInt1266)
                                            class348_sub21.anInt6851 = ((i_54_ + (anInt1263 shr 6)) * 64 + class318_sub8.aByte6464 - anInt1263)
                                            aClass262_1254!!.method1999(class348_sub21, -20180)
                                        }
                                    }
                                }
                                class318_sub8 = (class243.method1878(127.toByte()) as Class318_Sub8?)
                            }
                        }
                    }
                }
            }
        }

        fun method754(i: Int) {
            aClass348_Sub42_Sub14_1243 = aClass356_1241!!.method3480(i.toLong(), -6008) as Class348_Sub42_Sub14?
        }

        private fun method755(var_ha: ha, i: Int, i_57_: Int, i_58_: Int, i_59_: Int, i_60_: Int, i_61_: Int, i_62_: Int, `is`: ShortArray?, is_63_: ByteArray?, bool: Boolean) {
            if (bool || i_60_ != 0 || i_61_ > 0) {
                if (i_61_ == 0) var_ha.aa(i, i_57_, i_58_, i_59_, i_60_, 0)
                else {
                    val i_64_ = i_62_ and 0x3f
                    if (i_64_ == 0 || i_58_ <= 1 || i_59_ <= 1) {
                        val i_65_: Int = anIntArray1260!![i_61_]
                        if (bool || i_65_ != 0) var_ha.aa(i, i_57_, i_58_, i_59_, i_65_, 0)
                    } else {
                        val i_66_ = if (bool) 0 else 1
                        method424(anIntArray1260!![i_61_], i_60_, var_ha, 0, i_66_, anInt1255, i_62_ shr 6 and 0x3, aByteArrayArrayArray1251, i_58_, i, i_64_, i_59_, i_57_)
                    }
                }
            }
            if (`is` != null) {
                val i_67_: Int
                if (i_58_ == 1) i_67_ = i
                else i_67_ = i + i_58_ - 1
                val i_68_: Int
                if (i_59_ == 1) i_68_ = i_57_
                else i_68_ = i_57_ + i_59_ - 1
                for (i_69_ in `is`.indices) {
                    val i_70_ = is_63_!![i_69_].toInt() and 0x3f
                    if (i_70_ == 0 || i_70_ == 2 || i_70_ == 3 || i_70_ == 9) {
                        val class51: Class51 = aClass263_1245!!.method2005(0, `is`[i_69_].toInt() and 0xffff)
                        if (class51.anInt875 == -1) {
                            var i_71_ = -3355444
                            if (class51.anInt874 == 1) i_71_ = -3407872
                            val i_72_ = is_63_[i_69_].toInt() shr 6 and 0x3
                            if (i_70_ == 0) {
                                if (i_72_ == 0) var_ha.P(i, i_57_, i_59_, i_71_, 0)
                                else if (i_72_ == 1) var_ha.U(i, i_57_, i_58_, i_71_, 0)
                                else if (i_72_ == 2) var_ha.P(i_67_, i_57_, i_59_, i_71_, 0)
                                else var_ha.U(i, i_68_, i_58_, i_71_, 0)
                            } else if (i_70_ == 2) {
                                if (i_72_ == 0) {
                                    var_ha.P(i, i_57_, i_59_, -1, 0)
                                    var_ha.U(i, i_57_, i_58_, i_71_, 0)
                                } else if (i_72_ == 1) {
                                    var_ha.P(i_67_, i_57_, i_59_, -1, 0)
                                    var_ha.U(i, i_57_, i_58_, i_71_, 0)
                                } else if (i_72_ == 2) {
                                    var_ha.P(i_67_, i_57_, i_59_, -1, 0)
                                    var_ha.U(i, i_68_, i_58_, i_71_, 0)
                                } else {
                                    var_ha.P(i, i_57_, i_59_, -1, 0)
                                    var_ha.U(i, i_68_, i_58_, i_71_, 0)
                                }
                            } else if (i_70_ == 3) {
                                if (i_72_ == 0) var_ha.U(i, i_57_, 1, i_71_, 0)
                                else if (i_72_ == 1) var_ha.U(i_67_, i_57_, 1, i_71_, 0)
                                else if (i_72_ == 2) var_ha.U(i_67_, i_68_, 1, i_71_, 0)
                                else var_ha.U(i, i_68_, 1, i_71_, 0)
                            } else if (i_70_ == 9) {
                                if (i_72_ == 0 || i_72_ == 2) {
                                    for (i_73_ in 0..<i_59_) var_ha.U(i + i_73_, i_68_ - i_73_, 1, i_71_, 0)
                                } else {
                                    for (i_74_ in 0..<i_59_) var_ha.U(i + i_74_, i_57_ + i_74_, 1, i_71_, 0)
                                }
                            }
                        }
                    }
                }
            }
        }

        @JvmStatic
        fun method756(var_ha: ha?, i: Int, i_75_: Int) {
            val class348_sub49: Class348_Sub49 = (Class348_Sub49(aClass45_1237!!.method391((aClass348_Sub42_Sub14_1243!!.aString9625), "area", -29832)))
            val i_76_ = class348_sub49.readUnsignedByte(255)
            val `is` = IntArray(i_76_)
            for (i_77_ in 0..<i_76_) `is`[i_77_] = class348_sub49.readUnsignedByte(255)
            val i_78_ = class348_sub49.readUnsignedByte(255)
            val is_79_ = IntArray(i_78_)
            for (i_80_ in 0..<i_78_) is_79_[i_80_] = class348_sub49.readUnsignedByte(255)
            while (class348_sub49.anInt7197 < class348_sub49.aByteArray7154!!.size) {
                if (class348_sub49.readUnsignedByte(255) == 0) {
                    val i_81_ = class348_sub49.readUnsignedByte(255)
                    val i_82_ = class348_sub49.readUnsignedByte(255)
                    for (i_83_ in 0..63) {
                        for (i_84_ in 0..63) {
                            val i_85_: Int = i_81_ * 64 + i_83_ - anInt1266
                            val i_86_: Int = i_82_ * 64 + i_84_ - anInt1263
                            method750(var_ha, class348_sub49, i_81_, i_82_, i_85_, i_86_, `is`, is_79_)
                        }
                    }
                } else {
                    val i_87_ = class348_sub49.readUnsignedByte(255)
                    val i_88_ = class348_sub49.readUnsignedByte(255)
                    val i_89_ = class348_sub49.readUnsignedByte(255)
                    val i_90_ = class348_sub49.readUnsignedByte(255)
                    for (i_91_ in 0..7) {
                        for (i_92_ in 0..7) {
                            val i_93_: Int = i_87_ * 64 + i_89_ * 8 + i_91_ - anInt1266
                            val i_94_: Int = i_88_ * 64 + i_90_ * 8 + i_92_ - anInt1263
                            method750(var_ha, class348_sub49, i_87_, i_88_, i_93_, i_94_, `is`, is_79_)
                        }
                    }
                }
            }
            val `object`: Any? = null
            aByteArray1264 = ByteArray(anInt1259 * anInt1267)
            aShortArray1270 = ShortArray(anInt1259 * anInt1267)
            for (i_95_ in 0..2) {
                val is_96_ = ByteArray(anInt1259 * anInt1267)
                for (i_97_ in aClass243ArrayArrayArray1269!![i_95_]!!.indices) {
                    for (i_98_ in aClass243ArrayArrayArray1269!![i_95_]!![0]!!.indices) {
                        val class243: Class243? = aClass243ArrayArrayArray1269!![i_95_]!![i_97_]!![i_98_]
                        if (class243 != null) {
                            var class318_sub8 = class243.method1872(8) as Class318_Sub8?
                            while (class318_sub8 != null) {
                                is_96_[(i_97_ * 64 + class318_sub8.aByte6466 + (i_98_ * 64 + (class318_sub8.aByte6464)) * anInt1259)] = (class318_sub8.anInt6465).toByte()
                                class318_sub8 = (class243.method1878(1.toByte()) as Class318_Sub8?)
                            }
                        }
                    }
                }
                Companion.method768(is_96_, aByteArray1264!!, aShortArray1270!!, i, i_75_)
                for (i_99_ in aClass243ArrayArrayArray1269!![i_95_]!!.indices) {
                    for (i_100_ in aClass243ArrayArrayArray1269!![i_95_]!![0]!!.indices) {
                        val class243: Class243? = aClass243ArrayArrayArray1269!![i_95_]!![i_99_]!![i_100_]
                        if (class243 != null) {
                            var class318_sub8 = class243.method1872(8) as Class318_Sub8?
                            while (class318_sub8 != null) {
                                val i_101_: Int = (i_99_ * 64 + class318_sub8.aByte6466 + (i_100_ * 64 + (class318_sub8.aByte6464)) * anInt1259)
                                class318_sub8.anInt6465 = ((aByteArray1264!![i_101_].toInt() and 0xff) shl 16 or (aShortArray1270!![i_101_].toInt() and 0xffff))
                                if (class318_sub8.anInt6465 != 0) class318_sub8.anInt6465 = class318_sub8.anInt6465 or 0xffffff.inv()
                                class318_sub8 = (class243.method1878(122.toByte()) as Class318_Sub8?)
                            }
                        }
                    }
                }
            }
            Companion.method768(aByteArray1273!!, aByteArray1264!!, aShortArray1270!!, i, i_75_)
            aByteArray1273 = null
            method753()
        }

        fun method757(i: Int): Class348_Sub42_Sub14? {
            return (aClass356_1241!!.method3480(i.toLong(), -6008) as Class348_Sub42_Sub14?)
        }

        @JvmStatic
        fun method758(var_ha: ha?): Class262? {
            val i: Int = anInt1265 - anInt1274
            val i_102_: Int = anInt1277 - anInt1257
            val i_103_: Int = (anInt1276 - anInt1272 shl 16) / i
            val i_104_: Int = (anInt1268 - anInt1262 shl 16) / i_102_
            return method762(var_ha, i_103_, i_104_, 0, 0)
        }

        private fun method759(var_d: d, i: Int, i_105_: Int, i_106_: Int): Int {
            val class277: Class277 = aClass268_1239!!.method2034(i, false)
            if (class277 == null) return 0
            var i_107_ = class277.anInt3575
            if (i_107_ >= 0 && var_d.method3(i_107_, -6662)!!.aBoolean209) i_107_ = -1
            val i_108_: Int
            if (class277.anInt3569 >= 0) {
                val i_109_ = class277.anInt3569
                var i_110_ = (i_109_ and 0x7f) + i_106_
                if (i_110_ < 0) i_110_ = 0
                else if (i_110_ > 127) i_110_ = 127
                val i_111_ = (i_109_ + i_105_ and 0xfc00) + (i_109_ and 0x380) + i_110_
                i_108_ = 0xffffff.inv() or (Class126.anIntArray4983!![method303(method353(96, -119, i_111_), 30).toInt() and 0xffff])
            } else if (i_107_ >= 0) i_108_ = (0xffffff.inv() or (Class126.anIntArray4983!![(method303(method353(96, -85, (var_d.method3(i_107_, -6662)!!.aShort208).toInt()), 30)).toInt() and 0xffff]))
            else if (class277.anInt3563 == -1) i_108_ = 0
            else {
                val i_112_ = class277.anInt3563
                var i_113_ = (i_112_ and 0x7f) + i_106_
                if (i_113_ < 0) i_113_ = 0
                else if (i_113_ > 127) i_113_ = 127
                val i_114_ = (i_112_ + i_105_ and 0xfc00) + (i_112_ and 0x380) + i_113_
                i_108_ = 0xffffff.inv() or (Class126.anIntArray4983!![method303(method353(96, -80, i_114_), 30).toInt() and 0xffff])
            }
            return i_108_
        }

        @JvmStatic
        fun method760() {
            aByteArray1273 = ByteArray(anInt1259 * anInt1267)
            aByteArray1256 = ByteArray(anInt1259 * anInt1267)
            aByteArray1275 = ByteArray(anInt1259 * anInt1267)
            aShortArray1261 = ShortArray(anInt1259 * anInt1267)
            aByteArray1258 = ByteArray(anInt1259 * anInt1267)
            aClass356_1271 = Class356(1024)
            aClass243ArrayArrayArray1269 = Array<Array<Array<Class243?>?>?>(3) { Array<Array<Class243?>?>(anInt1259 shr 6) { arrayOfNulls<Class243>(anInt1267 shr 6) } }
            anIntArray1260 = IntArray(aClass268_1239!!.anInt3429 + 1)
        }

        @JvmStatic
        fun method761() {
            val `is` = IntArray(3)
            for (i in 0..<aClass252_1246!!.anInt3241) {
                val bool: Boolean = (aClass348_Sub42_Sub14_1243!!.method3236(`is`, (aClass252_1246!!.anIntArray3238!![i] shr 14 and 0x3fff), aClass252_1246!!.anIntArray3238!![i] and 0x3fff, aClass252_1246!!.anIntArray3238!![i] shr 28 and 0x3, (-28).toByte()))
                if (bool) {
                    val class348_sub21 = Class348_Sub21(aClass252_1246!!.anIntArray3239!![i])
                    class348_sub21.anInt6852 = `is`[1] - anInt1266
                    class348_sub21.anInt6851 = `is`[2] - anInt1263
                    aClass262_1254!!.method1999(class348_sub21, -20180)
                }
            }
        }

        private fun method762(var_ha: ha?, i: Int, i_115_: Int, i_116_: Int, i_117_: Int): Class262? {
            var class348_sub21 = aClass262_1254!!.method1995(4) as Class348_Sub21?
            while (class348_sub21 != null) {
                method747(var_ha, class348_sub21, i, i_115_, i_116_, i_117_)
                class348_sub21 = aClass262_1254!!.method1990(74.toByte()) as Class348_Sub21?
            }
            return aClass262_1254
        }

        private fun method763(var_ha: ha?, i: Int, i_118_: Int, i_119_: Int, i_120_: Int, `is`: ShortArray?, is_121_: ByteArray?) {
            if (`is` != null) {
                for (i_122_ in `is`.indices) {
                    val class51: Class51 = aClass263_1245!!.method2005(0, `is`[i_122_].toInt() and 0xffff)
                    val i_123_ = class51.anInt875
                    if (i_123_ != -1) {
                        val class218: Class218? = aClass141_1242!!.method1173(31.toByte(), i_123_)
                        val class105 = class218!!.method1596((if (class51.aBoolean912) is_121_!![i_122_].toInt() shr 6 and 0x3 else 0), (class51.aBoolean925 && (class51.aBoolean902)), 125, var_ha!!)
                        if (class105 != null) {
                            var i_124_ = i_119_ * class105.method966() shr 2
                            var i_125_ = i_120_ * class105.method980() shr 2
                            if (class218.aBoolean2854) {
                                var i_126_ = class51.anInt961
                                var i_127_ = class51.anInt926
                                if ((is_121_!![i_122_].toInt() shr 6 and 0x1) == 1) {
                                    val i_128_ = i_126_
                                    i_126_ = i_127_
                                    i_127_ = i_128_
                                }
                                i_124_ = i_126_ * i_119_
                                i_125_ = i_127_ * i_120_
                            }
                            if (i_124_ != 0 && i_125_ != 0) {
                                if (class218.anInt2856 != 0) class105.method970(i, i_118_ - i_125_ + i_120_, i_124_, i_125_, 0, (0xffffff.inv() or (class218.anInt2856)), 1)
                                else class105.method973(i, i_118_ - i_125_ + i_120_, i_124_, i_125_)
                            }
                        }
                    }
                }
            }
        }

        @JvmStatic
        fun method764(var_d: d, i: Int, i_129_: Int) {
            for (i_130_ in 0..<aClass268_1239!!.anInt3429) anIntArray1260!![i_130_ + 1] = method759(var_d, i_130_, i, i_129_)
        }

        private fun method765(var_ha: ha, i: Int, i_131_: Int, i_132_: Int, i_133_: Int) {
            var i_134_: Int = anInt1265 - anInt1274
            var i_135_: Int = anInt1277 - anInt1257
            if (anInt1265 < anInt1259) i_134_++
            if (anInt1277 < anInt1267) i_135_++
            for (i_136_ in 0..<i_134_) {
                val i_137_: Int = (i_132_ + i * i_136_ shr 16) + anInt1272
                val i_138_: Int = (i_132_ + i * (i_136_ + 1) shr 16) + anInt1272
                val i_139_ = i_138_ - i_137_
                if (i_139_ > 0) {
                    val i_140_: Int = anInt1274 + i_136_
                    if (i_140_ >= 0 && i_140_ < anInt1259) {
                        for (i_146_ in 0..<i_135_) {
                            val i_147_: Int = (anInt1268 - (i_133_ + i_131_ * (i_146_ + 1) shr 16))
                            val i_148_: Int = anInt1268 - (i_133_ + i_131_ * i_146_ shr 16)
                            val i_149_ = i_148_ - i_147_
                            if (i_149_ > 0) {
                                val i_150_: Int = i_146_ + anInt1257
                                val i_151_: Int = i_140_ + i_150_ * anInt1259
                                var i_152_ = 0
                                var i_153_ = 0
                                var i_154_ = 0
                                if (i_150_ >= 0 && i_150_ < anInt1267) {
                                    i_152_ = ((aByteArray1264!![i_151_].toInt() and 0xff) shl 16 or (aShortArray1270!![i_151_].toInt() and 0xffff))
                                    if (i_152_ != 0) i_152_ = i_152_ or 0xffffff.inv()
                                    i_153_ = aByteArray1256!![i_151_].toInt() and 0xff
                                    i_154_ = aShortArray1261!![i_151_].toInt() and 0xffff
                                }
                                if (i_152_ == 0 && i_153_ == 0 && i_154_ == 0) {
                                    if (aClass348_Sub42_Sub14_1243!!.anInt9634 != -1) i_152_ = (0xffffff.inv() or (aClass348_Sub42_Sub14_1243!!.anInt9634))
                                    else if ((i_136_ + anInt1274 and 0x4) != (i_146_ + anInt1277 and 0x4)) i_152_ = -11840664
                                    else i_152_ = (anIntArray1260!![(aClass268_1239!!.anInt3447) + 1])
                                    if (i_152_ == 0) i_152_ = -16777216
                                    var_ha.aa(i_137_, i_147_, i_139_, i_149_, i_152_, 0)
                                } else if (i_154_ > 0) {
                                    if (i_154_ == 65535) {
                                        val class348_sub39 = ((aClass356_1271!!.method3480((i_140_ shl 16 or i_150_).toLong(), -6008)) as Class348_Sub39?)
                                        if (class348_sub39 != null) method755(var_ha, i_137_, i_147_, i_139_, i_149_, i_152_, i_153_, aByteArray1275!![i_151_].toInt(), (class348_sub39.aShortArray7024), (class348_sub39.aByteArray7025), true)
                                    } else {
                                        aShortArray1252!![0] = (i_154_ - 1).toShort()
                                        aByteArray1248!![0] = aByteArray1258!![i_151_]
                                        Companion.method755(var_ha, i_137_, i_147_, i_139_, i_149_, i_152_, i_153_, aByteArray1275!![i_151_].toInt(), aShortArray1252, aByteArray1248!!, true)
                                    }
                                } else Companion.method755(var_ha, i_137_, i_147_, i_139_, i_149_, i_152_, i_153_, aByteArray1275!![i_151_].toInt(), null, null, true)
                            }
                        }
                    } else {
                        for (i_141_ in 0..<i_135_) {
                            val i_142_: Int = (anInt1268 - (i_133_ + i_131_ * (i_141_ + 1) shr 16))
                            val i_143_: Int = anInt1268 - (i_133_ + i_131_ * i_141_ shr 16)
                            val i_144_ = i_143_ - i_142_
                            var i_145_: Int
                            if (aClass348_Sub42_Sub14_1243!!.anInt9634 != -1) i_145_ = 0xffffff.inv() or (aClass348_Sub42_Sub14_1243!!.anInt9634)
                            else if ((i_136_ + anInt1274 and 0x4) != (i_141_ + anInt1277 and 0x4)) i_145_ = -11840664
                            else i_145_ = anIntArray1260!![(aClass268_1239!!.anInt3447) + 1]
                            if (i_145_ == 0) i_145_ = -16777216
                            var_ha.aa(i_137_, i_142_, i_139_, i_144_, i_145_, 0)
                        }
                    }
                }
            }
            for (i_155_ in -16..<i_134_ + 16) {
                val i_156_: Int = (i_132_ + i * i_155_ shr 16) + anInt1272
                val i_157_: Int = (i_132_ + i * (i_155_ + 1) shr 16) + anInt1272
                val i_158_ = i_157_ - i_156_
                if (i_158_ > 0) {
                    val i_159_: Int = i_155_ + anInt1274
                    if (i_159_ >= 0 && i_159_ < anInt1259) {
                        for (i_160_ in -16..<i_135_ + 16) {
                            val i_161_: Int = (anInt1268 - (i_133_ + i_131_ * (i_160_ + 1) shr 16))
                            val i_162_: Int = anInt1268 - (i_133_ + i_131_ * i_160_ shr 16)
                            val i_163_ = i_162_ - i_161_
                            if (i_163_ > 0) {
                                val i_164_: Int = i_160_ + anInt1257
                                if (i_164_ >= 0 && i_164_ < anInt1267) {
                                    val i_165_: Int = ((aShortArray1261!![i_159_ + i_164_ * anInt1259]).toInt() and 0xffff)
                                    if (i_165_ > 0) {
                                        if (i_165_ == 65535) {
                                            val class348_sub39 = ((aClass356_1271!!.method3480((i_159_ shl 16 or i_164_).toLong(), -6008)) as Class348_Sub39?)
                                            if (class348_sub39 != null) method763(var_ha, i_156_, i_161_, i_158_, i_163_, (class348_sub39.aShortArray7024), (class348_sub39.aByteArray7025))
                                        } else {
                                            aShortArray1252!![0] = (i_165_ - 1).toShort()
                                            aByteArray1248!![0] = (aByteArray1258!![i_159_ + i_164_ * anInt1259])
                                            Companion.method763(var_ha, i_156_, i_161_, i_158_, i_163_, aShortArray1252, aByteArray1248!!)
                                        }
                                    } else Companion.method763(var_ha, i_156_, i_161_, i_158_, i_163_, null, null)
                                }
                            }
                        }
                    }
                }
            }
            var i_166_: Int = anInt1274 shr 6
            var i_167_: Int = anInt1257 shr 6
            if (i_166_ < 0) i_166_ = 0
            if (i_167_ < 0) i_167_ = 0
            var i_168_: Int = anInt1265 shr 6
            var i_169_: Int = anInt1277 shr 6
            if (i_168_ >= aClass243ArrayArrayArray1269!![0]!!.size) i_168_ = aClass243ArrayArrayArray1269!![0]!!.size - 1
            if (i_169_ >= aClass243ArrayArrayArray1269!![0]!![0]!!.size) i_169_ = aClass243ArrayArrayArray1269!![0]!![0]!!.size - 1
            for (i_170_ in 0..2) {
                for (i_171_ in i_166_..i_168_) {
                    for (i_172_ in i_167_..i_169_) {
                        val class243: Class243? = aClass243ArrayArrayArray1269!![i_170_]!![i_171_]!![i_172_]
                        if (class243 != null) {
                            val i_173_: Int = (i_171_ + (anInt1266 shr 6)) * 64
                            val i_174_: Int = (i_172_ + (anInt1263 shr 6)) * 64
                            var class318_sub8 = class243.method1872(8) as Class318_Sub8?
                            while (class318_sub8 != null) {
                                val i_175_: Int = (i_173_ + class318_sub8.aByte6466 - anInt1266 - anInt1274)
                                val i_176_: Int = (i_174_ + class318_sub8.aByte6464 - anInt1263 - anInt1257)
                                val i_177_: Int = (i_132_ + i * i_175_ shr 16) + anInt1272
                                val i_178_: Int = ((i_132_ + i * (i_175_ + 1) shr 16) + anInt1272)
                                val i_179_: Int = (anInt1268 - (i_133_ + i_131_ * (i_176_ + 1) shr 16))
                                val i_180_: Int = anInt1268 - (i_133_ + i_131_ * i_176_ shr 16)
                                method755(var_ha, i_177_, i_179_, i_178_ - i_177_, i_180_ - i_179_, (class318_sub8.anInt6465), (class318_sub8.aByte6460).toInt() and 0xff, (class318_sub8.aByte6463).toInt(), (class318_sub8.aShortArray6461), (class318_sub8.aByteArray6462), false)
                                class318_sub8 = (class243.method1878((-79).toByte()) as Class318_Sub8?)
                            }
                        }
                    }
                }
                for (i_181_ in i_166_..i_168_) {
                    for (i_182_ in i_167_..i_169_) {
                        val class243: Class243? = aClass243ArrayArrayArray1269!![i_170_]!![i_181_]!![i_182_]
                        if (class243 != null) {
                            val i_183_: Int = (i_181_ + (anInt1266 shr 6)) * 64
                            val i_184_: Int = (i_182_ + (anInt1263 shr 6)) * 64
                            var class318_sub8 = class243.method1872(8) as Class318_Sub8?
                            while (class318_sub8 != null) {
                                val i_185_: Int = (i_183_ + class318_sub8.aByte6466 - anInt1266 - anInt1274)
                                val i_186_: Int = (i_184_ + class318_sub8.aByte6464 - anInt1263 - anInt1257)
                                val i_187_: Int = (i_132_ + i * i_185_ shr 16) + anInt1272
                                val i_188_: Int = ((i_132_ + i * (i_185_ + 1) shr 16) + anInt1272)
                                val i_189_: Int = (anInt1268 - (i_133_ + i_131_ * (i_186_ + 1) shr 16))
                                val i_190_: Int = anInt1268 - (i_133_ + i_131_ * i_186_ shr 16)
                                method763(var_ha, i_187_, i_189_, i_188_ - i_187_, i_190_ - i_189_, (class318_sub8.aShortArray6461), (class318_sub8.aByteArray6462))
                                class318_sub8 = (class243.method1878((-75).toByte()) as Class318_Sub8?)
                            }
                        }
                    }
                }
            }
        }

        @JvmStatic
        fun method766(i: Int, i_191_: Int): Class348_Sub42_Sub14? {
            var class348_sub42_sub14 = aClass356_1241!!.method3484(0) as Class348_Sub42_Sub14?
            while (class348_sub42_sub14 != null) {
                if (class348_sub42_sub14.aBoolean9639 && class348_sub42_sub14.method3238((-120).toByte(), i, i_191_)) return class348_sub42_sub14
                class348_sub42_sub14 = aClass356_1241!!.method3482(0) as Class348_Sub42_Sub14?
            }
            return null
        }

        fun method767(i: Int, i_192_: Int): Class107 {
            val class107 = Class107()
            var class348_sub42_sub14 = aClass356_1241!!.method3484(0) as Class348_Sub42_Sub14?
            while (class348_sub42_sub14 != null) {
                if (class348_sub42_sub14.aBoolean9639 && class348_sub42_sub14.method3238(29.toByte(), i, i_192_)) class107.method1005(true, class348_sub42_sub14)
                class348_sub42_sub14 = aClass356_1241!!.method3482(0) as Class348_Sub42_Sub14?
            }
            return class107
        }

        private fun method768(`is`: ByteArray, is_193_: ByteArray, is_194_: ShortArray, i: Int, i_195_: Int) {
            val is_196_ = IntArray(anInt1267)
            val is_197_ = IntArray(anInt1267)
            val is_198_ = IntArray(anInt1267)
            val is_199_ = IntArray(anInt1267)
            val is_200_ = IntArray(anInt1267)
            for (i_201_ in -5..<anInt1259) {
                val i_202_ = i_201_ + 5
                val i_203_ = i_201_ - 5
                for (i_204_ in 0..<anInt1267) {
                    if (i_202_ < anInt1259) {
                        val i_205_ = `is`[i_202_ + i_204_ * anInt1259].toInt() and 0xff
                        if (i_205_ > 0) {
                            val class22: Class22? = aClass183_1240!!.method1380(true, i_205_ - 1)
                            is_196_[i_204_] += class22!!.anInt341
                            is_197_[i_204_] += class22.anInt332
                            is_198_[i_204_] += class22.anInt335
                            is_199_[i_204_] += class22.anInt343
                            is_200_[i_204_]++
                        }
                    }
                    if (i_203_ >= 0) {
                        val i_206_ = `is`[i_203_ + i_204_ * anInt1259].toInt() and 0xff
                        if (i_206_ > 0) {
                            val class22: Class22? = aClass183_1240!!.method1380(true, i_206_ - 1)
                            is_196_[i_204_] -= class22!!.anInt341
                            is_197_[i_204_] -= class22.anInt332
                            is_198_[i_204_] -= class22.anInt335
                            is_199_[i_204_] -= class22.anInt343
                            is_200_[i_204_]--
                        }
                    }
                }
                if (i_201_ >= 0) {
                    var i_207_ = 0
                    var i_208_ = 0
                    var i_209_ = 0
                    var i_210_ = 0
                    var i_211_ = 0
                    for (i_212_ in -5..<anInt1267) {
                        val i_213_ = i_212_ + 5
                        if (i_213_ < anInt1267) {
                            i_207_ += is_196_[i_213_]
                            i_208_ += is_197_[i_213_]
                            i_209_ += is_198_[i_213_]
                            i_210_ += is_199_[i_213_]
                            i_211_ += is_200_[i_213_]
                        }
                        val i_214_ = i_212_ - 5
                        if (i_214_ >= 0) {
                            i_207_ -= is_196_[i_214_]
                            i_208_ -= is_197_[i_214_]
                            i_209_ -= is_198_[i_214_]
                            i_210_ -= is_199_[i_214_]
                            i_211_ -= is_200_[i_214_]
                        }
                        if (i_212_ >= 0 && i_211_ > 0) {
                            if ((`is`[i_201_ + i_212_ * anInt1259].toInt() and 0xff) == 0) {
                                val i_215_: Int = i_201_ + i_212_ * anInt1259
                                is_193_[i_215_] = 0.toByte()
                                is_194_[i_215_] = 0.toShort()
                            } else {
                                val i_216_ = (if (i_210_ == 0) 0 else Class247.method1890(i_209_ / i_211_, 76.toByte(), i_208_ / i_211_, (i_207_ * 256 / i_210_)))
                                var i_217_ = (i_216_ and 0x7f) + i_195_
                                if (i_217_ < 0) i_217_ = 0
                                else if (i_217_ > 127) i_217_ = 127
                                val i_218_ = ((i_216_ + i and 0xfc00) + (i_216_ and 0x380) + i_217_)
                                val i_219_: Int = i_201_ + i_212_ * anInt1259
                                val i_220_ = (Class126.anIntArray4983!![(method303(Class348_Sub49_Sub1.method3401(i_218_, 96, 76.toByte()), 30)).toInt() and 0xffff])
                                is_193_[i_219_] = (i_220_ shr 16 and 0xff).toByte()
                                is_194_[i_219_] = (i_220_ and 0xffff).toShort()
                            }
                        }
                    }
                }
            }
        }

        init {
            aShortArray1252 = ShortArray(1)
            anInt1250 = (Math.random() * 11.0).toInt() - 5
            aByteArray1248 = ByteArray(1)
            aClass262_1254 = Class262()
        }
    }
}
