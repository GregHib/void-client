import Applet_Sub1.Companion.method94
import Class318_Sub1_Sub5.Companion.method2483
import Class348_Sub40_Sub23.Companion.method3113
import Class367_Sub8.Companion.method3547
import Class5_Sub2.Companion.method195
import aa.Companion.method159
import java.awt.datatransfer.DataFlavor
import java.awt.datatransfer.StringSelection
import kotlin.math.max
import kotlin.math.min

class Class38 {
    @JvmField
    var anInt498: Int = 0
    @JvmField
    var anInt499: Int = 0
    @JvmField
    var anInt501: Int = 8
    @JvmField
    var anInt502: Int = 0
    @JvmField
    var anInt503: Int = 16777215
    @JvmField
    var anInt504: Int = 0
    @JvmField
    var aBoolean507: Boolean = false
    @JvmField
    var anInt508: Int = 0
    private fun method361(i: Int, class348_sub49: Class348_Sub49, i_2_: Int) {
        if (i != -6617) method363(95)
        anInt497++
        if (i_2_ == 1) this.anInt501 = class348_sub49.readUnsignedShort(842397944)
        else if (i_2_ == 2) this.aBoolean507 = true
        else if (i_2_ == 3) {
            this.anInt499 = class348_sub49.readShort(13638)
            this.anInt502 = class348_sub49.readShort(13638)
            this.anInt508 = class348_sub49.readShort(13638)
        } else if (i_2_ == 4) this.anInt498 = class348_sub49.readUnsignedByte(255)
        else if (i_2_ == 5) this.anInt504 = class348_sub49.readUnsignedShort(842397944)
        else if (i_2_ == 6) this.anInt503 = class348_sub49.readMedium(-1)
    }

    fun method364(class348_sub49: Class348_Sub49, i: Byte) {
        anInt511++
        if (i >= 22) {
            while (true) {
                val i_10_ = class348_sub49.readUnsignedByte(255)
                if (i_10_ == 0) break
                method361(-6617, class348_sub49, i_10_)
            }
        }
    }

    companion object {
        @JvmField
        var anInt497: Int = 0
        @JvmField
        var anInt500: Int = 0
        @JvmField
        var anInt505: Int = 0
        @JvmField
        var anInt506: Int = -1
        @JvmField
        var anInt509: Int = 0
        @JvmField
        var aBoolean510: Boolean = false
        @JvmField
        var anInt511: Int = 0
        @JvmField
        var anInt512: Int = 0
        @JvmField
        var anInt513: Int = 100

        @JvmStatic
        fun method360(i: Byte, i_0_: Int): Class227? {
            anInt505++
            if (i.toInt() != -57) method363(97)
            val class227s = Class88.method841(i + -70)
            var i_1_ = 0
            while (class227s.size > i_1_) {
                val class227 = class227s[i_1_]!!
                if (class227.anInt2970 == i_0_) return class227
                i_1_++
            }
            return null
        }

        @JvmStatic
        fun method362(i: Int) {
            anInt509++
            var class348_sub27 = (Class348_Sub42_Sub20.aClass262_9711!!.method1995(4) as? Class348_Sub27?)
            val i_3_ = -45 % ((i - -34) / 47)
            while ( /**/class348_sub27 != null) {
                if (class348_sub27.anInt6893 > 0) class348_sub27.anInt6893--
                if (class348_sub27.anInt6893 != 0) {
                    if (class348_sub27.anInt6894 > 0) class348_sub27.anInt6894--
                    if (class348_sub27.anInt6894 == 0 && class348_sub27.anInt6905 >= 1 && class348_sub27.anInt6896 >= 1 && (class348_sub27.anInt6905 <= -2 + Class367_Sub4.anInt7319) && (class348_sub27.anInt6896 <= -2 + Class348_Sub40_Sub3.anInt9109) && (class348_sub27.anInt6907 < 0 || (method195(class348_sub27.anInt6895, false, class348_sub27.anInt6907)))) {
                        Class218.method1591(class348_sub27.anInt6905, 70, class348_sub27.anInt6904, -1, class348_sub27.anInt6907, class348_sub27.anInt6895, class348_sub27.anInt6896, class348_sub27.anInt6900, class348_sub27.anInt6899)
                        class348_sub27.anInt6894 = -1
                        if ((class348_sub27.anInt6907 != class348_sub27.anInt6902) || class348_sub27.anInt6902 != -1) {
                            if ((class348_sub27.anInt6907 == class348_sub27.anInt6902) && (class348_sub27.anInt6892 == class348_sub27.anInt6900) && (class348_sub27.anInt6895 == (class348_sub27.anInt6903))) class348_sub27.method2715(75.toByte())
                        } else class348_sub27.method2715(86.toByte())
                    }
                } else if (class348_sub27.anInt6902 < 0 || (method195(class348_sub27.anInt6903, false, class348_sub27.anInt6902))) {
                    Class218.method1591(class348_sub27.anInt6905, 112, class348_sub27.anInt6904, -1, class348_sub27.anInt6902, class348_sub27.anInt6903, class348_sub27.anInt6896, class348_sub27.anInt6892, class348_sub27.anInt6899)
                    class348_sub27.method2715(49.toByte())
                }
                class348_sub27 = Class348_Sub42_Sub20.aClass262_9711!!.method1990(81.toByte()) as? Class348_Sub27?
            }
        }

        private var HISTORY_INDEX = -1

        @JvmStatic
        fun method363(i: Int) {
            if (Class168.anInt2254 < 102) Class168.anInt2254 += 6
            anInt512++
            if (Class121.anInt1794 != -1 && (Class299_Sub1_Sub1.aLong8694 < Class62.method599(-127))) {
                for (i_4_ in Class121.anInt1794..<Class50_Sub1.aStringArray5223!!.size) {
                    if (Class50_Sub1.aStringArray5223!![i_4_]!!.startsWith("pause")) {
                        var i_5_ = 5
                        try {
                            i_5_ = Class50_Sub1.aStringArray5223!![i_4_]!!.substring(6).toInt()
                        } catch (exception: Exception) {
                            /* empty */
                        }
                        method94("Pausing for " + i_5_ + " seconds...", 58)
                        Class121.anInt1794 = 1 + i_4_
                        Class299_Sub1_Sub1.aLong8694 = (1000 * i_5_).toLong() + Class62.method599(-97)
                        return
                    } else {
                        Class363.aString4461 = Class50_Sub1.aStringArray5223!![i_4_]
                        Class59_Sub1.method555(false, 0)
                    }
                }
                Class121.anInt1794 = -1
            }
            if (Class98.anInt1565 != 0) {
                Class284.anInt3676 -= Class98.anInt1565 * 5
                if (Class284.anInt3676 >= Class369_Sub2.anInt8587) Class284.anInt3676 = -1 + Class369_Sub2.anInt8587
                Class98.anInt1565 = 0
                if (Class284.anInt3676 < 0) Class284.anInt3676 = 0
            }
            if (i >= 124) {
                var i_6_ = 0
                while ((Class348_Sub42_Sub19.anInt9699 > i_6_)) {
                    val interface6 = Class348_Sub42_Sub5.anInterface6Array9534!![i_6_]!!
                    val i_7_ = interface6.method30(false)
                    val c = interface6.method28(46.toByte())
                    val i_8_ = interface6.method26(-7616)
                    if (i_7_ == 98) {
                        for (index in HISTORY_INDEX..<Class286_Sub1.aStringArray6200!!.size) {
                            if (index == -1) {
                                continue
                            }
                            val line = Class286_Sub1.aStringArray6200!![index]
                            if (line!!.isEmpty()) {
                                continue
                            }
                            val parts: Array<String?> = line.split(": ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                            if (parts.size == 2 && parts[1]!!.startsWith("-->")) {
                                if (index > HISTORY_INDEX) {
                                    HISTORY_INDEX = index
                                    Class363.aString4461 = parts[1]!!.substring(4)
                                    Class348_Sub38.anInt7006 = Class363.aString4461!!.length
                                    break
                                }
                            }
                        }
                    } else if (i_7_ == 99) {
                        var found = false
                        for (index in HISTORY_INDEX - 1 downTo 0) {
                            val line = Class286_Sub1.aStringArray6200!![index]
                            if (line!!.isEmpty()) {
                                continue
                            }
                            val parts: Array<String?> = line.split(": ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                            if (parts.size == 2 && parts[1]!!.startsWith("-->")) {
                                HISTORY_INDEX = index
                                Class363.aString4461 = parts[1]!!.substring(4)
                                Class348_Sub38.anInt7006 = Class363.aString4461!!.length
                                found = true
                                break
                            }
                        }
                        if (!found) {
                            Class363.aString4461 = ""
                            Class348_Sub38.anInt7006 = 0
                        }
                    } else if (i_7_ == 84) {
                        Class59_Sub1.method555(false, 0)
                        HISTORY_INDEX = -1
                    } else if (i_7_ != 80) {
                        if (i_7_ == 66 && (0x4 and i_8_) != 0) {
                            if (Class348_Sub40_Sub27.aClipboard9357 != null) {
                                var string = ""
                                for (i_9_ in -1 + (Class286_Sub1.aStringArray6200)!!.size downTo 0) {
                                    if ((Class286_Sub1.aStringArray6200!![i_9_] != null) && Class286_Sub1.aStringArray6200!![i_9_]!!.length > 0) string += (Class286_Sub1.aStringArray6200!![i_9_]) + '\n'
                                }
                                Class348_Sub40_Sub27.aClipboard9357!!.setContents(StringSelection(string), null)
                            }
                        } else if (i_7_ != 67 || (0x4 and i_8_) == 0) {
                            if (i_7_ != 85 || Class348_Sub38.anInt7006 <= 0) {
                                if (i_7_ == 101 && (Class348_Sub38.anInt7006 < Class363.aString4461!!.length)) {
                                    if ((0x4 and i_8_) == 0) {
                                        Class363.aString4461 = ((Class363.aString4461!!.substring(0, Class348_Sub38.anInt7006)) + (Class363.aString4461!!.substring(Class348_Sub38.anInt7006 - -1)))
                                    } else {
                                        var index = Class363.aString4461!!.indexOf(' ', Class348_Sub38.anInt7006 + 1)
                                        if (index == -1) {
                                            index = Class363.aString4461!!.length
                                        }
                                        Class363.aString4461 = Class363.aString4461!!.substring(0, Class348_Sub38.anInt7006) + Class363.aString4461!!.substring(index)
                                    }
                                } else if (i_7_ != 96 || Class348_Sub38.anInt7006 <= 0) {
                                    if (i_7_ == 97 && (Class363.aString4461!!.length > Class348_Sub38.anInt7006)) {
                                        if ((0x4 and i_8_) == 0) {
                                            Class348_Sub38.anInt7006++
                                        } else {
                                            val result = Class363.aString4461!!.indexOf(' ', min(Class348_Sub38.anInt7006 + 1, Class363.aString4461!!.length - 1))
                                            Class348_Sub38.anInt7006 = if (result == -1) Class363.aString4461!!.length else result + 1
                                        }
                                    } else if (i_7_ == 102) Class348_Sub38.anInt7006 = 0
                                    else if (i_7_ == 103) Class348_Sub38.anInt7006 = Class363.aString4461!!.length
                                    else if (i_7_ != 104 || (Class260.anInt3312 >= (Class286_Sub1.aStringArray6200)!!.size)) {
                                        if (i_7_ == 105 && Class260.anInt3312 > 0) {
                                            Class260.anInt3312--
                                            method159(-615751774)
                                            Class348_Sub38.anInt7006 = Class363.aString4461!!.length
                                        } else if (Npc.method2446(c, 105.toByte()) || c.code == 92 || c.code == 47 || c.code == 46 || c.code == 58 || c.code == 44 || c.code == 32 || c.code == 95 || c.code == 45 || c.code == 43 || c.code == 91 || c.code == 93) {
                                            Class363.aString4461 = ((Class363.aString4461!!.substring(0, Class348_Sub38.anInt7006)) + Class348_Sub42_Sub5.anInterface6Array9534!![i_6_]!!.method28(23.toByte()) + (Class363.aString4461!!.substring(Class348_Sub38.anInt7006)))
                                            Class348_Sub38.anInt7006++
                                        }
                                    } else {
                                        Class260.anInt3312++
                                        method159(-615751774)
                                        Class348_Sub38.anInt7006 = Class363.aString4461!!.length
                                    }
                                } else {
                                    if ((0x4 and i_8_) == 0) {
                                        Class348_Sub38.anInt7006--
                                    } else {
                                        Class348_Sub38.anInt7006 = max(Class363.aString4461!!.lastIndexOf(' ', Class348_Sub38.anInt7006 - 2) + 1, 0)
                                    }
                                }
                            } else {
                                if ((0x4 and i_8_) == 0) {
                                    Class363.aString4461 = ((Class363.aString4461!!.substring(0, Class348_Sub38.anInt7006 - 1)) + Class363.aString4461!!.substring(Class348_Sub38.anInt7006))
                                    Class348_Sub38.anInt7006--
                                } else {
                                    var index = Class363.aString4461!!.trim { it <= ' ' }.lastIndexOf(' ', Class348_Sub38.anInt7006)
                                    index++
                                    Class363.aString4461 = Class363.aString4461!!.substring(0, index)
                                    Class348_Sub38.anInt7006 = index
                                }
                            }
                        } else if (Class348_Sub40_Sub27.aClipboard9357 != null) {
                            val transferable = Class348_Sub40_Sub27.aClipboard9357!!.getContents(null)
                            if (transferable != null) {
                                try {
                                    val string = (transferable.getTransferData(DataFlavor.stringFlavor)) as String
                                    if (string != null) {
                                        val strings = method3113('\n', true, string)
                                        Class348_Sub42_Sub6.method3189(0, strings)
                                    }
                                } catch (exception: Exception) {
                                    /* empty */
                                }
                            }
                        }
                    } else Class59_Sub1.method555(true, 0)
                    i_6_++
                }
                Class348_Sub42_Sub19.anInt9699 = 0
                Class253.anInt3246 = 0
                Class354.method3466(89)
            }
        }

        @JvmStatic
        fun method365(class318_sub1: Class318_Sub1, class348_sub1s: Array<Class348_Sub1?>?) {
            if (Class318_Sub1_Sub3_Sub3.aBoolean10221) {
                val i = class318_sub1.method2384(class348_sub1s, 49)
                Class9.aHa171!!.method3642(i, class348_sub1s)
            }
            if (Class332.aSArray4142 == aa_Sub1.aSArray5191) {
                val bool = false
                val bool_11_ = false
                val i: Int
                val i_12_: Int
                if (class318_sub1 is Class318_Sub1_Sub3) {
                    i = (class318_sub1.aShort8743).toInt()
                    i_12_ = class318_sub1.aShort8750.toInt()
                } else {
                    i = (class318_sub1.x shr Class362.anInt4459)
                    i_12_ = (class318_sub1.y shr Class362.anInt4459)
                }
                Class9.aHa171!!.EA((Class348_Sub1_Sub1.aSArray8801!![0]!!.method3986(class318_sub1.x, class318_sub1.y, (-118).toByte())), method3547(i, i_12_), method2483(i, i_12_), Class199.method1457(i, i_12_))
            }
            val class318_sub4 = class318_sub1.method2386(1, Class9.aHa171)
            if (class318_sub4 != null) {
                if (class318_sub1.aBoolean6391) {
                    val class318_sub3s = class318_sub4.aClass318_Sub3Array6414!!
                    for (i in class318_sub3s.indices) {
                        val class318_sub3 = class318_sub3s[i]!!
                        if (class318_sub3.aBoolean6401) Class338.method2663(-5590, (class318_sub3.anInt6405 - class318_sub3.anInt6403), (class318_sub3.anInt6406 + class318_sub3.anInt6403), (class318_sub3.anInt6402 - class318_sub3.anInt6403), (class318_sub3.anInt6404 + class318_sub3.anInt6403))
                    }
                }
                if (class318_sub4.aBoolean6409) {
                    class318_sub4.aClass318_Sub1_6410 = class318_sub1
                    if (Class348_Sub40_Sub5.aBoolean9121) {
                        synchronized(Class71.aClass76_1208!!) {
                            Class71.aClass76_1208!!.method774(class318_sub4, 18802)
                        }
                    } else Class71.aClass76_1208!!.method774(class318_sub4, 18802)
                } else Class59_Sub1_Sub1.method560(class318_sub4, 18)
            }
        }
    }
}
