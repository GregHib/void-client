import Class5.Companion.method181

/* Class6 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class6 internal constructor(@JvmField var anInt144: Int, i_46_: Int, i_47_: Int, i_48_: Int, i_49_: Int, i_50_: Int, i_51_: Int, i_52_: Int, i_53_: Int, @JvmField var aBoolean145: Boolean, @JvmField var anInt154: Int) {
    @JvmField
    var aShort143: Short
    @JvmField
    var aShort146: Short
    @JvmField
    var aByte148: Byte
    @JvmField
    var aShort150: Short
    @JvmField
    var aByte156: Byte

    init {
        this.aByte156 = i_53_.toByte()
        this.aShort143 = i_50_.toShort()
        this.aByte148 = i_52_.toByte()
        this.aShort146 = i_51_.toShort()
        this.aShort150 = i_49_.toShort()
    }

    companion object {
        @JvmField
        var anInt147: Int = 0
        @JvmField
        var anInt149: Int = 0
        @JvmField
        var aClass227_151: Class227? = Class227(2)
        @JvmField
        var anInt152: Int = 0
        @JvmField
        var anInt153: Int = 0
        @JvmField
        var anInt155: Int = 0
        @JvmStatic
        fun method203(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
            anInt149++
            var i_4_ = 0
            if (i > -92) aClass227_151 = null
            var i_5_ = i_3_
            var i_6_ = -i_3_
            var i_7_ = -1
            val i_8_ = Class85.method831(Class113.anInt1745, i_3_ + i_0_, Class369.anInt4960, -108)
            val i_9_ = Class85.method831(Class113.anInt1745, -i_3_ + i_0_, Class369.anInt4960, 81)
            Class135_Sub2.method1156(-27, i_8_, Class17.anIntArrayArray255!![i_2_]!!, i_9_, i_1_)
            while (i_5_ > i_4_) {
                i_7_ += 2
                i_6_ += i_7_
                if (i_6_ > 0) {
                    i_5_--
                    i_6_ -= i_5_ shl 1
                    val i_10_ = -i_5_ + i_2_
                    val i_11_ = i_5_ + i_2_
                    if (i_11_ >= Class132.anInt1910 && Class38.anInt513 >= i_10_) {
                        val i_12_ = Class85.method831(Class113.anInt1745, i_4_ + i_0_, Class369.anInt4960, 74)
                        val i_13_ = Class85.method831(Class113.anInt1745, i_0_ + -i_4_, Class369.anInt4960, 98)
                        if (i_11_ <= Class38.anInt513) Class135_Sub2.method1156(-27, i_12_, (Class17.anIntArrayArray255!![i_11_]!!), i_13_, i_1_)
                        if (Class132.anInt1910 <= i_10_) Class135_Sub2.method1156(-27, i_12_, (Class17.anIntArrayArray255!![i_10_]!!), i_13_, i_1_)
                    }
                }
                val i_14_ = -++i_4_ + i_2_
                val i_15_ = i_2_ - -i_4_
                if (Class132.anInt1910 <= i_15_ && Class38.anInt513 >= i_14_) {
                    val i_16_ = Class85.method831(Class113.anInt1745, i_0_ + i_5_, Class369.anInt4960, 52)
                    val i_17_ = Class85.method831(Class113.anInt1745, i_0_ + -i_5_, Class369.anInt4960, -106)
                    if (i_15_ <= Class38.anInt513) Class135_Sub2.method1156(-27, i_16_, Class17.anIntArrayArray255!![i_15_]!!, i_17_, i_1_)
                    if (i_14_ >= Class132.anInt1910) Class135_Sub2.method1156(-27, i_16_, Class17.anIntArrayArray255!![i_14_]!!, i_17_, i_1_)
                }
            }
        }

        @JvmStatic
        fun method204(i: Int) {
            anInt155++
            while (Class299.aClass348_Sub49_Sub2_3813!!.method3415(-62, Class348_Sub40_Sub25.anInt9341) >= 15) {
                val i_18_ = Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 15)
                if (i_18_ == 32767) break
                var bool = false
                var class348_sub22 = (Class282.aClass356_3654!!.method3480(i_18_.toLong(), -6008) as Class348_Sub22?)
                if (class348_sub22 == null) {
                    val npc = Npc()
                    npc.anInt10290 = i_18_
                    class348_sub22 = Class348_Sub22(npc)
                    Class282.aClass356_3654!!.method3483(57.toByte(), i_18_.toLong(), class348_sub22)
                    bool = true
                    Class348_Sub40_Sub23.aClass348_Sub22Array9319!![Class348_Sub32.anInt6930++] = class348_sub22
                }
                val npc = (class348_sub22.aNpc_6859)!!
                Class74.anIntArray1233!![Class150.anInt2057++] = i_18_
                npc.anInt10306 = Class348_Sub23_Sub3.anInt9041
                if ((npc.aClass79_10505) != null && npc.aClass79_10505!!.method793(0)) method181(true, npc)
                val i_19_ = Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 2)
                val i_20_ = Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 1)
                var i_21_ = Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 5)
                if (i_21_ > 15) i_21_ -= 32
                var i_22_ = Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 5)
                if (i_22_ > 15) i_22_ -= 32
                val i_23_ = 0x3d01 and (4 + Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 3) shl 11)
                val i_24_ = Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 1)
                if (i_24_ == 1) Class13.anIntArray224!![Class101.anInt1597++] = i_18_
                npc.method2448((Class189.aClass278_2529!!.method2079(Class299.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 14), -1)), i xor 0x2b297815)
                npc.method2434(111.toByte(), npc.aClass79_10505!!.anInt1399)
                npc.anInt10310 = (npc.aClass79_10505!!.anInt1329) shl 3
                if (bool) npc.method2435((-108).toByte(), i_23_, true)
                npc.method2444((Class132.aPlayer_1907!!.anIntArray10317!![0]) - -i_21_, i_20_ == 1, (Class132.aPlayer_1907!!.anIntArray10320!![0]) + i_22_, i + 724138125, npc.method2436(50.toByte()), i_19_)
                if (npc.aClass79_10505!!.method793(0)) Class223.method1614(979190089, npc, npc.plane.toInt(), (npc.anIntArray10317!![0]), (npc.anIntArray10320!![0]), null, null, 0)
            }
            if (i == -724138005) Class299.aClass348_Sub49_Sub2_3813!!.stopBitAccess(false)
        }

        fun method205(i: Int, i_25_: Int, i_26_: Int, string: String?, i_27_: Int, i_28_: Int, i_29_: Int, i_30_: Int) {
            try {
                anInt147++
                val class318_sub5 = Class318_Sub5()
                class318_sub5.anInt6419 = i_25_
                class318_sub5.anInt6418 = i_30_
                class318_sub5.anInt6422 = i_29_
                class318_sub5.anInt6421 = i + Class367_Sub11.anInt7396
                if (i_28_ >= -48) method206(-90, -126, -8)
                class318_sub5.aString6416 = string
                class318_sub5.anInt6415 = i_26_
                class318_sub5.anInt6420 = i_27_
                Class225.aClass243_2957!!.method1869(-103, class318_sub5)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("go.F(" + i + ',' + i_25_ + ',' + i_26_ + ',' + (if (string != null) "{...}" else "null") + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ')'))
            }
        }

        @JvmStatic
        fun method206(i: Int, i_31_: Int, i_32_: Int): Int {
            var i_31_ = i_31_
            anInt152++
            val i_33_ = i_31_ ushr 24
            val i_34_ = -i_33_ + i_32_
            i_31_ = (0xff0000 and (i_31_ and 0xff00) * i_33_ or ((0xff00ff and i_31_) * i_33_ and 0xff00ff.inv())) ushr 8
            return i_31_ + (((i and 0xff00) * i_34_ and 0xff0000 or (0xff00ff.inv() and (0xff00ff and i) * i_34_)) ushr 8)
        }

        @JvmStatic
        fun method207(var_ha: ha?, i: Byte) {
            do {
                try {
                    anInt153++
                    var i_35_ = 0
                    var i_36_ = 0
                    if (i < 113) aClass227_151 = null
                    if (Class59_Sub1.aBoolean5300) {
                        i_35_ = s_Sub3.method4008((-127).toByte())
                        i_36_ = Class16.method260(false)
                    }
                    var_ha!!.KA(i_35_, i_36_, Class321.anInt4017 + i_35_, i_36_ + 350)
                    var_ha.aa(i_35_, i_36_, Class321.anInt4017, 350, 0x332277 or (Class168.anInt2254 shl 24), 1)
                    Class338.method2663(-5590, i_35_, Class321.anInt4017 + i_35_, i_36_, i_36_ + 350)
                    val i_37_ = 350 / Class68.anInt1188
                    if (Class369_Sub2.anInt8587 > 0) {
                        val i_38_ = 342 + -Class68.anInt1188
                        val i_39_ = (i_37_ * i_38_ / (-1 + (i_37_ - -Class369_Sub2.anInt8587)))
                        var i_40_ = 4
                        if (Class369_Sub2.anInt8587 > 1) i_40_ += ((Class369_Sub2.anInt8587 + (-1 + -Class284.anInt3676)) * (i_38_ - i_39_) / (Class369_Sub2.anInt8587 + -1))
                        var_ha.aa(-16 + (Class321.anInt4017 + i_35_), i_36_ + i_40_, 12, i_39_, 0x332277 or (Class168.anInt2254 shl 24), 2)
                        var i_41_ = Class284.anInt3676
                        while (((i_41_ < i_37_ + Class284.anInt3676) && Class369_Sub2.anInt8587 > i_41_)) {
                            val strings = (Class348_Sub40_Sub23.method3113('\u0008', true, Class286_Sub1.aStringArray6200!![i_41_]!!))
                            val i_42_ = (-16 + Class321.anInt4017 + -8) / strings.size
                            for (i_43_ in strings.indices) {
                                val i_44_ = i_42_ * i_43_ + 8
                                var_ha.KA(i_35_ + i_44_, i_36_, i_42_ + i_35_ - (-i_44_ - -8), i_36_ + 350)
                                Applet_Sub1.aClass324_20!!.method2576(Class250.method1909(31.toByte(), strings[i_43_]!!), -1, (-((-Class284.anInt3676 + i_41_) * Class68.anInt1188) + (-Class348_Sub31_Sub2.anInt9077 + i_36_ - (-350 - (-2 + -(Class246.aClass143_3179!!.anInt1993))))), i_35_ + i_44_, -16777216, -110)
                            }
                            i_41_++
                        }
                    }
                    Class240.aClass324_4684!!.method2569("Build: 634", 350 + (i_36_ + -20), -1, (Class321.anInt4017 + i_35_ + -25), -121, -16777216)
                    var_ha.KA(i_35_, i_36_, i_35_ - -Class321.anInt4017, i_36_ - -350)
                    var_ha.method3649((-80).toByte(), Class321.anInt4017, -Class348_Sub31_Sub2.anInt9077 + (350 + i_36_), -1, i_35_)
                    Class262.aClass324_3326!!.method2576("--> " + Class250.method1909(31.toByte(), Class363.aString4461!!), -1, (i_36_ - (-350 + Class369.aClass143_4962!!.anInt1993) - 1), 10 + i_35_, -16777216, -127)
                    if (!Class175.aBoolean2329) break
                    var i_45_ = -1
                    if (Class367_Sub11.anInt7396 % 30 > 15) i_45_ = 16777215
                    var_ha.method3660(10 + (i_35_ - -(Class369.aClass143_4962!!.method1183(true, "--> " + (Class250.method1909(31.toByte(), Class363.aString4461!!).substring(0, Class348_Sub38.anInt7006))))), i_45_, 12, 350 + (i_36_ + -Class369.aClass143_4962!!.anInt1993 - 11), true)
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(runtimeexception, ("go.B(" + (if (var_ha != null) "{...}" else "null") + ',' + i + ')'))
                }
                break
            } while (false)
        }

        @JvmStatic
        fun method208(i: Byte) {
            if (i.toInt() != 0) method204(29)
            aClass227_151 = null
        }
    }
}
