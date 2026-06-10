import Class14_Sub3.Companion.method248
import Class16.method260
import Class239_Sub18.Companion.method1802
import Class239_Sub19.Companion.method1804
import Class348_Sub3.Companion.method2739
import Class348_Sub40_Sub26.Companion.method3120
import Class348_Sub40_Sub31.Companion.method3131
import Class348_Sub40_Sub7.Companion.method3064
import OutputStream_Sub1.Companion.method132
import s_Sub2.Companion.method4002
import za_Sub1.Companion.method3439
import java.io.IOException
import java.net.Socket
import java.net.URL

class Class88 {
    @JvmField
    var aClass318_Sub9_1503: Class318_Sub9? = Class318_Sub9()
    private var aClass318_Sub9_1505: Class318_Sub9? = null

    fun method840(i: Int): Int {
        anInt1496++
        var i_0_ = i
        var class318_sub9 = (this.aClass318_Sub9_1503!!.aClass318_Sub9_6469)
        while (this.aClass318_Sub9_1503 !== class318_sub9) {
            class318_sub9 = class318_sub9!!.aClass318_Sub9_6469
            i_0_++
        }
        return i_0_
    }

    fun method844(class318_sub9: Class318_Sub9?, bool: Boolean) {
        try {
            anInt1495++
            if (class318_sub9!!.aClass318_Sub9_6468 != null) class318_sub9.method2514(93)
            class318_sub9.aClass318_Sub9_6469 = this.aClass318_Sub9_1503
            class318_sub9.aClass318_Sub9_6468 = (this.aClass318_Sub9_1503!!.aClass318_Sub9_6468)
            if (bool != true) this.aClass318_Sub9_1503 = null
            class318_sub9.aClass318_Sub9_6468!!.aClass318_Sub9_6469 = class318_sub9
            class318_sub9.aClass318_Sub9_6469!!.aClass318_Sub9_6468 = class318_sub9
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("lh.A(" + (if (class318_sub9 != null) "{...}" else "null") + ',' + bool + ')'))
        }
    }

    fun method845(i: Byte) {
        while (true) {
            val class318_sub9 = (this.aClass318_Sub9_1503!!.aClass318_Sub9_6469)
            if (class318_sub9 === this.aClass318_Sub9_1503) break
            class318_sub9!!.method2514(54)
        }
        if (i < 23) aClass318_Sub9_1505 = null
        anInt1493++
        aClass318_Sub9_1505 = null
    }

    fun method846(i: Byte): Class318_Sub9? {
        anInt1494++
        val class318_sub9 = aClass318_Sub9_1505
        if (class318_sub9 === this.aClass318_Sub9_1503) {
            aClass318_Sub9_1505 = null
            return null
        }
        if (i > -34) aClass318_Sub9_1505 = null
        aClass318_Sub9_1505 = class318_sub9!!.aClass318_Sub9_6469
        return class318_sub9
    }

    fun method848(i: Int): Class318_Sub9? {
        if (i != 8) return null
        anInt1502++
        val class318_sub9 = (this.aClass318_Sub9_1503!!.aClass318_Sub9_6469)
        if (class318_sub9 === this.aClass318_Sub9_1503) {
            aClass318_Sub9_1505 = null
            return null
        }
        aClass318_Sub9_1505 = class318_sub9!!.aClass318_Sub9_6469
        return class318_sub9
    }

    init {
        this.aClass318_Sub9_1503!!.aClass318_Sub9_6468 = this.aClass318_Sub9_1503
        this.aClass318_Sub9_1503!!.aClass318_Sub9_6469 = this.aClass318_Sub9_1503
    }

    companion object {
        @JvmField
        var anInt1492: Int = 0
        @JvmField
        var anInt1493: Int = 0
        @JvmField
        var anInt1494: Int = 0
        @JvmField
        var anInt1495: Int = 0
        @JvmField
        var anInt1496: Int = 0
        var anInt1497: Int = 0
        @JvmField
        var anInt1498: Int = 0
        @JvmField
        var anInt1499: Int = 0
        @JvmField
        var aBoolean1500: Boolean = false
        @JvmField
        var anInt1501: Int = 0
        @JvmField
        var anInt1502: Int = 0
        @JvmField
        var anInt1504: Int = 0
        fun method841(i: Int): Array<Class227?> {
            anInt1504++
            return (arrayOf<Class227?>(Class191.aClass227_2568, Class100.aClass227_1591, Class6.aClass227_151))
        }

        @JvmStatic
        fun method842(bool: Boolean) {
            anInt1501++
            Class138.aClass46Array1942 = null
            if (Class59_Sub1.aBoolean5300 && Class348_Sub42_Sub12.method3229(-82) != 1) method132(106, (Class240.anInt4674 == 3) || Class240.anInt4674 == 7, method3439(107), 0, Class348_Sub44.method3306((-111).toByte()), 0)
            var i = 0
            var i_1_ = 0
            if (Class59_Sub1.aBoolean5300) {
                i = s_Sub3.method4008((-124).toByte())
                i_1_ = method260(false)
            }
            Class159.method1252(i_1_, r.anInt9721, i_1_, -1, i, i + Class321.anInt4017, i_1_ - -Class348_Sub42_Sub8_Sub2.anInt10432, 116.toByte(), i)
            if (Class138.aClass46Array1942 != null) {
                method3064(i, Class136.anInt4792, true, Class348_Sub1.anInt6555, i_1_, Class331.aClass46_4130!!.anInt760, i + Class321.anInt4017, false, Class138.aClass46Array1942, -1412584499, i_1_ - -Class348_Sub42_Sub8_Sub2.anInt10432)
                Class138.aClass46Array1942 = null
            }
        }

        @JvmStatic
        fun method843(i: Byte) {
            anInt1499++
            if (Class225.anInt2955 != 0 && Class225.anInt2955 != 5) {
                try {
                    val i_2_: Int
                    if (Class318_Sub1_Sub1_Sub2.anInt9971 != 0) i_2_ = 2000
                    else i_2_ = 250
                    if (i_2_ < ++Class11.anInt197) {
                        if (Class348_Sub40_Sub8.aClass238_9165 != null) {
                            Class348_Sub40_Sub8.aClass238_9165!!.method1700(36.toByte())
                            Class348_Sub40_Sub8.aClass238_9165 = null
                        }
                        if (Class318_Sub1_Sub1_Sub2.anInt9971 >= 3) {
                            Class225.anInt2955 = 0
                            Class14_Sub4.method254(-5, (-111).toByte())
                            return
                        }
                        if (Class239_Sub12.anInt5969 != 2) Class255.aClass161_3285!!.method1259(0)
                        else Class3.aClass161_125!!.method1259(0)
                        Class318_Sub1_Sub1_Sub2.anInt9971++
                        Class225.anInt2955 = 1
                        Class11.anInt197 = 0
                    }
                    if (Class225.anInt2955 == 1) {
                        if (Class239_Sub12.anInt5969 == 2 && !Loader.splitPorts) Class130_Sub1.aClass144_5800 = (Class3.aClass161_125!!.method1262(Class348_Sub23_Sub1.aClass297_8992!!, 36.toByte()))
                        else Class130_Sub1.aClass144_5800 = (Class255.aClass161_3285!!.method1262(Class348_Sub23_Sub1.aClass297_8992!!, 36.toByte()))
                        Class225.anInt2955 = 2
                    }
                    if (Class225.anInt2955 == 2) {
                        if (Class130_Sub1.aClass144_5800!!.anInt1997 == 2) throw IOException()
                        if (Class130_Sub1.aClass144_5800!!.anInt1997 != 1) return
                        Class348_Sub40_Sub8.aClass238_9165 = Class348_Sub23_Sub3.method2982((((Class130_Sub1.aClass144_5800!!.anObject1998) as Socket?)!!), (-118).toByte(), 7500)
                        Class130_Sub1.aClass144_5800 = null
                        method2739(0)
                        val class348_sub47 = Class203.method1478(true)
                        class348_sub47!!.aClass348_Sub49_Sub2_7116!!.writeByte(false, Class178.aClass29_2339!!.anInt400)
                        Class348_Sub42_Sub14.method3243(9, class348_sub47)
                        method1802(0)
                        Class225.anInt2955 = 3
                    }
                    if (Class225.anInt2955 == 3) {
                        if (!Class348_Sub40_Sub8.aClass238_9165!!.method1705(1, 107)) return
                        Class348_Sub40_Sub8.aClass238_9165!!.method1701(1, 0, (-118).toByte(), (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                        val i_3_ = ((Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt() and 0xff)
                        if (i_3_ != 0) {
                            Class225.anInt2955 = 0
                            Class14_Sub4.method254(i_3_, (-113).toByte())
                            Class348_Sub40_Sub8.aClass238_9165!!.method1700(36.toByte())
                            Class348_Sub40_Sub8.aClass238_9165 = null
                            Class152.method1215(3.toByte())
                            return
                        }
                        Class299.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                        val class348_sub49 = Class348_Sub49(518)
                        val `is` = IntArray(4)
                        `is`[0] = (Math.random() * 9.9999999E7).toInt()
                        `is`[1] = (9.9999999E7 * Math.random()).toInt()
                        `is`[3] = (9.9999999E7 * Math.random()).toInt()
                        `is`[2] = (9.9999999E7 * Math.random()).toInt()
                        class348_sub49.writeByte(false, 10)
                        class348_sub49.writeInt(91.toByte(), `is`[0])
                        class348_sub49.writeInt(96.toByte(), `is`[1])
                        class348_sub49.writeInt(95.toByte(), `is`[2])
                        class348_sub49.writeInt(127.toByte(), `is`[3])
                        class348_sub49.writeLong(0L, 70.toByte())
                        class348_sub49.writeString((-5).toByte(), Class186.aString2496!!)
                        class348_sub49.writeLong(Class348_Sub33.aLong6966, (-124).toByte())
                        class348_sub49.writeLong(OutputStream_Sub2.aLong108, (-112).toByte())
                        class348_sub49.method3390(Class348_Sub31.aBigInteger6921, (-76).toByte(), (Class318_Sub1_Sub4.aBigInteger8762))
                        method2739(0)
                        val class348_sub47 = Class203.method1478(true)
                        val class348_sub49_sub2 = (class348_sub47!!.aClass348_Sub49_Sub2_7116)!!
                        if (Class239_Sub12.anInt5969 == 2) {
                            if (Class240.anInt4674 != 13) class348_sub49_sub2.writeByte(false, Class178.aClass29_2342!!.anInt400)
                            else class348_sub49_sub2.writeByte(false, Class178.aClass29_2344!!.anInt400)
                            class348_sub49_sub2.writeShort(107.toByte(), 0)
                            val i_6_ = class348_sub49_sub2.anInt7197
                            class348_sub49_sub2.writeInt(117.toByte(), 634)
                            class348_sub49_sub2.writeBytes(class348_sub49.anInt7197, 0, class348_sub49.aByteArray7154!!, 92)
                            val i_7_ = class348_sub49_sub2.anInt7197
                            class348_sub49_sub2.writeString((-5).toByte(), Class64_Sub3.aString5600!!)
                            class348_sub49_sub2.writeByte(false, (RuntimeException_Sub1.anInt4596))
                            class348_sub49_sub2.writeByte(false, Class348_Sub42_Sub12.method3229(-71))
                            class348_sub49_sub2.writeShort(107.toByte(), Class321.anInt4017)
                            class348_sub49_sub2.writeShort(107.toByte(), Class348_Sub42_Sub8_Sub2.anInt10432)
                            class348_sub49_sub2.writeByte(false, Class316.aClass348_Sub51_3959!!.aClass239_Sub20_7248!!.method1808(-32350))
                            method4002(class348_sub49_sub2, 55.toByte())
                            class348_sub49_sub2.writeString((-5).toByte(), Class239_Sub12.aString5966!!)
                            class348_sub49_sub2.writeInt(120.toByte(), Class202.anInt2670)
                            val class348_sub49_8_ = Class316.aClass348_Sub51_3959!!.method3427(24)
                            class348_sub49_sub2.writeByte(false, (class348_sub49_8_.anInt7197))
                            class348_sub49_sub2.writeBytes(class348_sub49_8_.anInt7197, 0, (class348_sub49_8_.aByteArray7154!!), 74)
                            r.aBoolean9719 = true
                            val class348_sub49_9_ = Class348_Sub49(Class348_Sub40_Sub20.aClass348_Sub4_9264!!.method2746((-76).toByte()))
                            Class348_Sub40_Sub20.aClass348_Sub4_9264!!.method2747(1, class348_sub49_9_)
                            class348_sub49_sub2.writeBytes((class348_sub49_9_.aByteArray7154!!).size, 0, (class348_sub49_9_.aByteArray7154!!), -73)
                            class348_sub49_sub2.writeShort(107.toByte(), Class135_Sub1.anInt4718)
                            class348_sub49_sub2.writeLong(Class244.aLong4615, (-63).toByte())
                            class348_sub49_sub2.writeByte(false, if (Class14_Sub1.aString8605 == null) 0 else 1)
                            if (Class14_Sub1.aString8605 != null) class348_sub49_sub2.writeString((-5).toByte(), (Class14_Sub1.aString8605!!))
                            class348_sub49_sub2.writeByte(false, (if (!method3131(50.toByte(), "jagtheora")) 0 else 1))
                            Class157.method1244(64, class348_sub49_sub2)
                            class348_sub49_sub2.method3350(i_7_, true, `is`, (class348_sub49_sub2.anInt7197))
                            class348_sub49_sub2.method3383(1809639944, -i_6_ + (class348_sub49_sub2.anInt7197))
                        } else {
                            class348_sub49_sub2.writeByte(false, Class178.aClass29_2345!!.anInt400)
                            class348_sub49_sub2.writeShort(107.toByte(), 0)
                            val i_4_ = class348_sub49_sub2.anInt7197
                            class348_sub49_sub2.writeInt(119.toByte(), 634)
                            class348_sub49_sub2.writeBytes(class348_sub49.anInt7197, 0, class348_sub49.aByteArray7154!!, -109)
                            val i_5_ = class348_sub49_sub2.anInt7197
                            class348_sub49_sub2.writeString((-5).toByte(), Class64_Sub3.aString5600!!)
                            class348_sub49_sub2.writeByte(false, Class348_Sub42_Sub8_Sub2.aClass230_10434!!.anInt2987)
                            class348_sub49_sub2.writeByte(false, Class348_Sub33.anInt6967)
                            method4002(class348_sub49_sub2, 55.toByte())
                            class348_sub49_sub2.writeString((-5).toByte(), Class239_Sub12.aString5966!!)
                            class348_sub49_sub2.writeInt(106.toByte(), Class202.anInt2670)
                            Class157.method1244(92, class348_sub49_sub2)
                            class348_sub49_sub2.method3350(i_5_, true, `is`, (class348_sub49_sub2.anInt7197))
                            class348_sub49_sub2.method3383(1809639944, -i_4_ + (class348_sub49_sub2.anInt7197))
                        }
                        Class348_Sub42_Sub14.method3243(-48, class348_sub47)
                        method1802(0)
                        Class348_Sub23_Sub2.aClass77_9029 = Class77(`is`)
                        for (i_10_ in 0..3) `is`[i_10_] += 50
                        Class299.aClass348_Sub49_Sub2_3813!!.method3406(-111, `is`)
                        Class225.anInt2955 = 4
                    }
                    if (Class225.anInt2955 == 4) {
                        if (!Class348_Sub40_Sub8.aClass238_9165!!.method1705(1, 94)) return
                        Class348_Sub40_Sub8.aClass238_9165!!.method1701(1, 0, (-117).toByte(), (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                        val i_11_ = ((Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt() and 0xff)
                        if (i_11_ != 21) {
                            if (i_11_ == 29) Class225.anInt2955 = 13
                            else {
                                if (i_11_ == 1) {
                                    Class225.anInt2955 = 5
                                    Class14_Sub4.method254(i_11_, (-125).toByte())
                                    return
                                }
                                if (i_11_ != 2) {
                                    if (i_11_ != 15) {
                                        if (i_11_ == 23 && Class318_Sub1_Sub1_Sub2.anInt9971 < 3) {
                                            Class225.anInt2955 = 1
                                            Class318_Sub1_Sub1_Sub2.anInt9971++
                                            Class11.anInt197 = 0
                                            Class348_Sub40_Sub8.aClass238_9165!!.method1700(36.toByte())
                                            Class348_Sub40_Sub8.aClass238_9165 = null
                                        } else {
                                            Class225.anInt2955 = 0
                                            Class14_Sub4.method254(i_11_, (-87).toByte())
                                            Class348_Sub40_Sub8.aClass238_9165!!.method1700(36.toByte())
                                            Class348_Sub40_Sub8.aClass238_9165 = null
                                            Class152.method1215(3.toByte())
                                            return
                                        }
                                        return
                                    }
                                    Class225.anInt2955 = 14
                                    Class348_Sub40_Sub25.anInt9341 = -2
                                } else Class225.anInt2955 = 8
                            }
                        } else Class225.anInt2955 = 7
                    }
                    if (Class225.anInt2955 == 6) {
                        method2739(0)
                        val class348_sub47 = Class203.method1478(true)
                        val class348_sub49_sub2 = (class348_sub47!!.aClass348_Sub49_Sub2_7116)!!
                        class348_sub49_sub2.method3416(-18, Class348_Sub23_Sub2.aClass77_9029!!)
                        class348_sub49_sub2.method3408((Class178.aClass29_2351!!.anInt400), 18676)
                        Class348_Sub42_Sub14.method3243(-87, class348_sub47)
                        method1802(0)
                        Class225.anInt2955 = 4
                    } else if (Class225.anInt2955 == 7) {
                        if (Class348_Sub40_Sub8.aClass238_9165!!.method1705(1, 118)) {
                            Class348_Sub40_Sub8.aClass238_9165!!.method1701(1, 0, (-109).toByte(), (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                            val i_12_ = 0xff and (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt()
                            Class225.anInt2955 = 0
                            Class63.anInt1121 = (3 + i_12_) * 60
                            Class14_Sub4.method254(21, (-95).toByte())
                            Class348_Sub40_Sub8.aClass238_9165!!.method1700(36.toByte())
                            Class348_Sub40_Sub8.aClass238_9165 = null
                            Class152.method1215(3.toByte())
                        }
                    } else if (Class225.anInt2955 == 13) {
                        if (Class348_Sub40_Sub8.aClass238_9165!!.method1705(1, 102)) {
                            Class348_Sub40_Sub8.aClass238_9165!!.method1701(1, 0, (-128).toByte(), (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                            Class225.anInt2955 = 0
                            Class348_Sub42_Sub7.anInt9541 = 0xff and (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt()
                            Class14_Sub4.method254(29, (-97).toByte())
                            Class348_Sub40_Sub8.aClass238_9165!!.method1700(36.toByte())
                            Class348_Sub40_Sub8.aClass238_9165 = null
                            Class152.method1215(3.toByte())
                        }
                    } else if (Class225.anInt2955 == 8) {
                        if (Class348_Sub40_Sub8.aClass238_9165!!.method1705(1, 107)) {
                            Class348_Sub40_Sub8.aClass238_9165!!.method1701(1, 0, (-107).toByte(), (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                            Class76.Companion.anInt1288 = 0xff and (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt()
                            Class225.anInt2955 = 9
                        }
                    } else {
                        if (Class225.anInt2955 == 9) {
                            val class348_sub49_sub2 = Class299.aClass348_Sub49_Sub2_3813
                            if (Class239_Sub12.anInt5969 == 2) {
                                if (!Class348_Sub40_Sub8.aClass238_9165!!.method1705(Class76.Companion.anInt1288, 93)) return
                                Class348_Sub40_Sub8.aClass238_9165!!.method1701(Class76.Companion.anInt1288, 0, 60.toByte(), (class348_sub49_sub2!!.aByteArray7154!!))
                                class348_sub49_sub2.anInt7197 = 0
                                Class192.anInt2581 = class348_sub49_sub2.readUnsignedByte(255)
                                Class125.anInt4919 = class348_sub49_sub2.readUnsignedByte(255)
                                Class348_Sub40_Sub3.aBoolean9103 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                Class133.aBoolean1915 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                Class52.aBoolean4903 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                Class50_Sub2.aBoolean5233 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                Class348_Sub42_Sub11.anInt9591 = class348_sub49_sub2.readUnsignedShort(842397944)
                                Class206.aBoolean4888 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                Class24.anInt359 = class348_sub49_sub2.method3369(125.toByte())
                                Class130.aBoolean1900 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                Class348_Sub40_Sub12.aClass263_9195!!.method2004(Class130.aBoolean1900, 25.toByte())
                                Exception_Sub1.aClass255_112!!.method1934(11.toByte(), Class130.aBoolean1900)
                                Class189.aClass278_2529!!.method2072(88.toByte(), Class130.aBoolean1900)
                            } else {
                                if (!Class348_Sub40_Sub8.aClass238_9165!!.method1705(Class76.Companion.anInt1288, 107)) return
                                Class348_Sub40_Sub8.aClass238_9165!!.method1701(Class76.Companion.anInt1288, 0, 85.toByte(), (class348_sub49_sub2!!.aByteArray7154!!))
                                class348_sub49_sub2.anInt7197 = 0
                                Class192.anInt2581 = class348_sub49_sub2.readUnsignedByte(255)
                                Class125.anInt4919 = class348_sub49_sub2.readUnsignedByte(255)
                                Class348_Sub40_Sub3.aBoolean9103 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                Class133.aBoolean1915 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                Class52.aBoolean4903 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                Class116.anInt1758 = class348_sub49_sub2.readShort(13638)
                                Class206.aBoolean4888 = Class116.anInt1758 > 0
                                Class135_Sub1.anInt4716 = class348_sub49_sub2.readUnsignedShort(842397944)
                                Class322.anInt4026 = class348_sub49_sub2.readUnsignedShort(842397944)
                                Class206.anInt4870 = class348_sub49_sub2.readUnsignedShort(842397944)
                                Class170.anInt5065 = class348_sub49_sub2.readInt((-126).toByte())
                                Class348_Sub42_Sub6.aClass144_9536 = Class348_Sub23_Sub1.aClass297_8992!!.method2232(116, Class170.anInt5065)
                                Class216.anInt4976 = class348_sub49_sub2.readUnsignedByte(255)
                                Class130_Sub1.anInt5797 = class348_sub49_sub2.readUnsignedShort(842397944)
                                Class348_Sub6.anInt6632 = class348_sub49_sub2.readUnsignedShort(842397944)
                                Class290.aBoolean3706 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                s_Sub2.aString8265 = class348_sub49_sub2.method3371(-13487)
                                Class132.aPlayer_1907!!.aString10537 = s_Sub2.aString8265
                                Class132.aPlayer_1907!!.aString10544 = Class132.aPlayer_1907!!.aString10537
                                Applet_Sub1.anInt37 = class348_sub49_sub2.readUnsignedByte(255)
                                Class348_Sub1.anInt6551 = class348_sub49_sub2.readInt((-126).toByte())
                                aa_Sub2.aClass161_5199 = Class161()
                                aa_Sub2.aClass161_5199!!.anInt2143 = class348_sub49_sub2.readUnsignedShort(842397944)
                                if (aa_Sub2.aClass161_5199!!.anInt2143 == 65535) aa_Sub2.aClass161_5199!!.anInt2143 = -1
                                aa_Sub2.aClass161_5199!!.aString2147 = class348_sub49_sub2.method3371(-13487)
                                if (Class55_Sub1.aClass364_5271 != Class8.aClass364_165) {
                                    aa_Sub2.aClass161_5199!!.anInt2138 = (50000 + (aa_Sub2.aClass161_5199!!.anInt2143))
                                    aa_Sub2.aClass161_5199!!.anInt2148 = (40000 + (aa_Sub2.aClass161_5199!!.anInt2143))
                                }
                                if (Class8.aClass364_165 != Class76.Companion.aClass364_1279 && ((Class3.aClass161_125!!.method1264(94.toByte(), Class135_Sub2.aClass161_4839)) || (Class3.aClass161_125!!.method1264(112.toByte(), (Class348_Sub40_Sub35.aClass161_9443))))) Class348_Sub42_Sub20.method3283(114)
                            }
                            if ((!Class348_Sub40_Sub3.aBoolean9103 || Class52.aBoolean4903) && !Class206.aBoolean4888) {
                                try {
                                    Class224.method1617(125.toByte(), Class93.anApplet1530, "unzap")
                                } catch (throwable: Throwable) {
                                    /* empty */
                                }
                            } else {
                                try {
                                    Class224.method1617(125.toByte(), Class93.anApplet1530, "zap")
                                } catch (throwable: Throwable) {
                                    if (Class318_Sub1_Sub5.aBoolean8773) {
                                        try {
                                            Class93.anApplet1530!!.showDocument(URL(Class93.anApplet1530!!.getCodeBase(), "blank.ws"), "tbi")
                                        } catch (exception: Exception) {
                                            /* empty */
                                        }
                                    }
                                }
                            }
                            if (Class8.aClass364_165 == Class55_Sub1.aClass364_5271) {
                                try {
                                    Class224.method1617(125.toByte(), Class93.anApplet1530, "loggedin")
                                } catch (throwable: Throwable) {
                                    /* empty */
                                }
                            }
                            if (Class239_Sub12.anInt5969 == 2) Class225.anInt2955 = 11
                            else {
                                Class225.anInt2955 = 0
                                Class14_Sub4.method254(2, (-92).toByte())
                                method1804(8839)
                                Class348_Sub49.method3379(2, 7)
                                Class348_Sub3.aClass114_6584 = null
                                return
                            }
                        }
                        if (Class225.anInt2955 == 11) {
                            if (!Class348_Sub40_Sub8.aClass238_9165!!.method1705(3, 94)) return
                            Class348_Sub40_Sub8.aClass238_9165!!.method1701(3, 0, 11.toByte(), (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                            Class225.anInt2955 = 12
                        }
                        if (Class225.anInt2955 == 12) {
                            val class348_sub49_sub2 = Class299.aClass348_Sub49_Sub2_3813
                            class348_sub49_sub2!!.anInt7197 = 0
                            if (class348_sub49_sub2.method3404(-1510)) {
                                if (!Class348_Sub40_Sub8.aClass238_9165!!.method1705(1, 110)) return
                                Class348_Sub40_Sub8.aClass238_9165!!.method1701(1, 3, (-127).toByte(), (class348_sub49_sub2.aByteArray7154!!))
                            }
                            Class348_Sub3.aClass114_6584 = (method248(-11271)[class348_sub49_sub2.method3407(15295)])
                            Class348_Sub40_Sub25.anInt9341 = class348_sub49_sub2.readUnsignedShort(842397944)
                            Class225.anInt2955 = 10
                        }
                        if (Class225.anInt2955 == 10) {
                            if (Class348_Sub40_Sub8.aClass238_9165!!.method1705(Class348_Sub40_Sub25.anInt9341, 96)) {
                                Class348_Sub40_Sub8.aClass238_9165!!.method1701(Class348_Sub40_Sub25.anInt9341, 0, 28.toByte(), (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                                Class299.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                                Class225.anInt2955 = 0
                                val i_13_ = Class348_Sub40_Sub25.anInt9341
                                Class14_Sub4.method254(2, (-124).toByte())
                                Class130_Sub1.method1135(0)
                                Class239_Sub5.method1741(Class299.aClass348_Sub49_Sub2_3813!!, 118.toByte())
                                ha.anInt4581 = -1
                                if (Class348_Sub3.aClass114_6584 != Class19.aClass114_304) method3120(-92)
                                else Class90.method853(99.toByte())
                                if (i_13_ != Class299.aClass348_Sub49_Sub2_3813!!.anInt7197) throw RuntimeException("lswp pos:" + (Class299.aClass348_Sub49_Sub2_3813!!.anInt7197) + " psize:" + i_13_)
                                Class348_Sub3.aClass114_6584 = null
                            }
                        } else {
                            val i_14_ = -128 / (-i / 53)
                            if (Class225.anInt2955 == 14) {
                                if (Class348_Sub40_Sub25.anInt9341 == -2) {
                                    if (!Class348_Sub40_Sub8.aClass238_9165!!.method1705(2, 106)) return
                                    Class348_Sub40_Sub8.aClass238_9165!!.method1701(2, 0, (-128).toByte(), (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                                    Class299.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                                    Class348_Sub40_Sub25.anInt9341 = Class299.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                                }
                                if (Class348_Sub40_Sub8.aClass238_9165!!.method1705(Class348_Sub40_Sub25.anInt9341, 117)) {
                                    Class348_Sub40_Sub8.aClass238_9165!!.method1701(Class348_Sub40_Sub25.anInt9341, 0, (-104).toByte(), (Class299.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                                    Class299.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                                    val i_15_ = Class348_Sub40_Sub25.anInt9341
                                    Class225.anInt2955 = 0
                                    Class14_Sub4.method254(15, (-120).toByte())
                                    Class312.method2330(86.toByte())
                                    Class239_Sub5.method1741(Class299.aClass348_Sub49_Sub2_3813!!, 118.toByte())
                                    if (i_15_ != (Class299.aClass348_Sub49_Sub2_3813!!.anInt7197)) throw RuntimeException("lswpr pos:" + (Class299.aClass348_Sub49_Sub2_3813!!.anInt7197) + " psize:" + i_15_)
                                    Class348_Sub3.aClass114_6584 = null
                                }
                            }
                        }
                    }
                } catch (ioexception: IOException) {
                    if (Class348_Sub40_Sub8.aClass238_9165 != null) {
                        Class348_Sub40_Sub8.aClass238_9165!!.method1700(36.toByte())
                        Class348_Sub40_Sub8.aClass238_9165 = null
                    }
                    if (Class318_Sub1_Sub1_Sub2.anInt9971 >= 3) {
                        Class225.anInt2955 = 0
                        Class14_Sub4.method254(-4, (-87).toByte())
                        Class152.method1215(3.toByte())
                    } else {
                        if (Class239_Sub12.anInt5969 != 2) Class255.aClass161_3285!!.method1259(0)
                        else Class3.aClass161_125!!.method1259(0)
                        Class318_Sub1_Sub1_Sub2.anInt9971++
                        Class11.anInt197 = 0
                        Class225.anInt2955 = 1
                    }
                }
            }
        }

        @JvmStatic
        fun method847(string: String, i: Int) {
            println("Error: " + Class341.method2680("\n", true, "%0a", string))
            anInt1492++
            if (i != -5192) method843(17.toByte())
        }
    }
}
