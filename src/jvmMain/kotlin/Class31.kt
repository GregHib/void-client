/* Class31 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class31 {
    var anInt420: Int = 0
    private var anInt421: Int
    var anInt422: Int = 0
    private var aString423 = ""
    var anInt424: Int = 0
    var anInt426: Int = -1
    private var anInt429 = -1
    var anInt431: Int
    private var anInt433: Int
    var anInt434: Int = 70
    var anInt435: Int
    @JvmField
    var aClass219_438: Class219? = null
    private var anInt439: Int
    var anInt444: Int = 16777215
    fun method324(var_ha: ha, bool: Boolean): Class105? {
        anInt440++
        if (bool != true) return null
        if (anInt429 < 0) return null
        var class105 = this.aClass219_438!!.aClass60_2862.method583(anInt429.toLong(), -62) as Class105?
        if (class105 == null) {
            method330(var_ha, -41)
            class105 = this.aClass219_438!!.aClass60_2862.method583(anInt429.toLong(), 53) as Class105?
        }
        return class105
    }

    fun method325(var_ha: ha, i: Int): Class105? {
        anInt428++
        if (anInt439 < 0) return null
        var class105 = this.aClass219_438!!.aClass60_2862.method583(anInt439.toLong(), -59) as Class105?
        if (i < 23) return null
        if (class105 == null) {
            method330(var_ha, -118)
            class105 = this.aClass219_438!!.aClass60_2862.method583(anInt439.toLong(), 123) as Class105?
        }
        return class105
    }

    fun method327(var_ha: ha, i: Byte): Class105? {
        anInt432++
        if (anInt421 < 0) return null
        var class105 = this.aClass219_438!!.aClass60_2862.method583(anInt421.toLong(), 118) as Class105?
        if (class105 == null) {
            method330(var_ha, -66)
            class105 = this.aClass219_438!!.aClass60_2862.method583(anInt421.toLong(), 119) as Class105?
        }
        val i_0_ = 20 % ((i - 19) / 51)
        return class105
    }

    private fun method329(class348_sub49: Class348_Sub49, i: Int, i_1_: Int) {
        if (i_1_ != 1) {
            if (i_1_ != 2) {
                if (i_1_ == 3) anInt421 = class348_sub49.readUnsignedShort(842397944)
                else if (i_1_ != 4) {
                    if (i_1_ == 5) anInt433 = class348_sub49.readUnsignedShort(842397944)
                    else if (i_1_ == 6) anInt439 = class348_sub49.readUnsignedShort(842397944)
                    else if (i_1_ != 7) {
                        if (i_1_ != 8) {
                            if (i_1_ != 9) {
                                if (i_1_ != 10) {
                                    if (i_1_ == 11) this.anInt426 = 0
                                    else if (i_1_ == 12) this.anInt431 = class348_sub49.readUnsignedByte(255)
                                    else if (i_1_ == 13) this.anInt420 = class348_sub49.readShort(i xor 0x3547.inv())
                                    else if (i_1_ == 14) this.anInt426 = class348_sub49.readUnsignedShort(842397944)
                                } else this.anInt422 = class348_sub49.readShort(13638)
                            } else this.anInt434 = class348_sub49.readUnsignedShort(842397944)
                        } else aString423 = class348_sub49.method3371(i xor 0x34af)
                    } else this.anInt424 = class348_sub49.readShort(13638)
                } else anInt429 = class348_sub49.readUnsignedShort(842397944)
            } else this.anInt444 = class348_sub49.readMedium(-1)
        } else this.anInt435 = class348_sub49.readUnsignedShort(842397944)
        if (i != -2) method333(-112, 38)
        anInt437++
    }

    private fun method330(var_ha: ha, i: Int) {
        anInt446++
        val class45 = this.aClass219_438!!.aClass45_2873!!
        if (anInt421 >= 0 && this.aClass219_438!!.aClass60_2862.method583(anInt421.toLong(), 121) == null && class45.method421(false, anInt421)) {
            val class207 = Class207.method1512(class45, anInt421)
            this.aClass219_438!!.aClass60_2862.method582(var_ha.method3691(class207, true), anInt421.toLong(), (-112).toByte())
        }
        if (anInt433 >= 0 && this.aClass219_438!!.aClass60_2862.method583(anInt433.toLong(), -99) == null && class45.method421(false, anInt433)) {
            val class207 = Class207.method1512(class45, anInt433)
            this.aClass219_438!!.aClass60_2862.method582(var_ha.method3691(class207, true), anInt433.toLong(), (-128).toByte())
        }
        if (anInt429 >= 0 && this.aClass219_438!!.aClass60_2862.method583(anInt429.toLong(), 86) == null && class45.method421(false, anInt429)) {
            val class207 = Class207.method1512(class45, anInt429)
            this.aClass219_438!!.aClass60_2862.method582(var_ha.method3691(class207, true), anInt429.toLong(), (-108).toByte())
        }
        if (i > -7) this.anInt434 = -14
        if (anInt439 >= 0 && this.aClass219_438!!.aClass60_2862.method583(anInt439.toLong(), -83) == null && class45.method421(false, anInt439)) {
            val class207 = Class207.method1512(class45, anInt439)
            this.aClass219_438!!.aClass60_2862.method582(var_ha.method3691(class207, true), anInt439.toLong(), (-101).toByte())
        }
    }

    fun method331(var_ha: ha, i: Byte): Class105? {
        anInt441++
        if (anInt433 < 0) return null
        val i_2_ = -84 % ((i - 32) / 35)
        var class105 = this.aClass219_438!!.aClass60_2862.method583(anInt433.toLong(), -50) as Class105?
        if (class105 == null) {
            method330(var_ha, -89)
            class105 = this.aClass219_438!!.aClass60_2862.method583(anInt433.toLong(), -117) as Class105?
        }
        return class105
    }

    fun method332(i: Int, class348_sub49: Class348_Sub49) {
        if (i > -119) method333(119, -71)
        while (true) {
            val i_3_ = class348_sub49.readUnsignedByte(255)
            if (i_3_ == 0) break
            method329(class348_sub49, -2, i_3_)
        }
        anInt427++
    }

    fun method333(i: Int, i_4_: Int): String? {
        anInt445++
        var string = aString423
        if (i_4_ != 0) return null
        while (true) {
            val i_5_ = string.indexOf("%1")
            if (i_5_ < 0) break
            string = (string.substring(0, i_5_) + Class140.method1171(i, 55, false) + string.substring(i_5_ - -2))
        }
        return string
    }

    init {
        anInt433 = -1
        anInt439 = -1
        this.anInt431 = -1
        this.anInt435 = -1
        anInt421 = -1
    }

    companion object {
        @JvmField
        var anInt425: Int = 0
        @JvmField
        var anInt427: Int = 0
        @JvmField
        var anInt428: Int = 0
        var aClass113_430: Class113?
        @JvmField
        var anInt432: Int = 0
        @JvmField
        var anInt436: Int = 0
        @JvmField
        var anInt437: Int = 0
        @JvmField
        var anInt440: Int = 0
        @JvmField
        var anInt441: Int = 0
        @JvmField
        var anInt442: Int = 0
        @JvmField
        var anInt443: Int = 1
        @JvmField
        var anInt445: Int = 0
        @JvmField
        var anInt446: Int = 0

        @JvmStatic
        fun method326(i: Byte) {
            anInt442++
            if (!Class50_Sub1.aBoolean5224) {
                Class369_Sub3_Sub1.aBoolean10174 = true
                Class348_Sub27.aFloat6898 += (12.0f - Class348_Sub27.aFloat6898) / 2.0f
                Class50_Sub1.aBoolean5224 = true
                if (i.toInt() != 68) aClass113_430 = null
            }
        }

        @JvmStatic
        fun method328(i: Int) {
            if (i != 0) anInt425 = -128
            aClass113_430 = null
        }

        init {
            aClass113_430 = Class113()
        }
    }
}
