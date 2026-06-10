import Class33.Companion.method340

/* Class42 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class42 {
    @JvmField
    var aByteArray564: ByteArray = byteArrayOf()
    @JvmField
    var aString565: String? = null
    @JvmField
    var anInt566: Int = 0
    @JvmField
    var anInt567: Int
    @JvmField
    var anInt568: Int = 0
    var aBoolean569: Boolean = false
    @JvmField
    var anInt570: Int = -2147483648
    @JvmField
    var anIntArray572: IntArray = intArrayOf()
    private var anInt573 = -1
    @JvmField
    var aBoolean574: Boolean = true
    @JvmField
    var anInt575: Int = -1
    @JvmField
    var anInt576: Int = 0
    @JvmField
    var aStringArray577: Array<String?>
    @JvmField
    var anInt578: Int
    @JvmField
    var anInt580: Int = 0
    @JvmField
    var anInt581: Int = 0
    @JvmField
    var anInt582: Int = 0
    private var anInt583: Int
    @JvmField
    var anInt584: Int
    private var anInt585 = 0
    private var anInt586 = 0
    private var anInt587 = 0
    private var aClass356_588: Class356? = null
    private var anInt590: Int
    @JvmField
    var anIntArray591: IntArray? = null
    private var anInt592 = 0
    @JvmField
    var aClass153_593: Class153? = null
    @JvmField
    var anInt595: Int
    @JvmField
    var anInt596: Int
    @JvmField
    var aString597: String? = null
    private var anInt598: Int
    @JvmField
    var aBoolean599: Boolean = true
    @JvmField
    var anInt601: Int
    @JvmField
    var anInt602: Int = 0
    @JvmField
    var anInt603: Int = 2147483647
    @JvmField
    var anInt604: Int = 0
    @JvmField
    var anInt605: Int
    private var anInt606: Int
    @JvmField
    var anInt607: Int = 2147483647
    @JvmField
    var aBoolean609: Boolean = true
    fun method372(i: Int) {
        anInt608++
        if (i != -25359) this.anInt578 = -106
        if (this.anIntArray591 != null) {
            var i_0_ = 0
            while ((this.anIntArray591!!.size > i_0_)) {
                if (this.anIntArray591!![i_0_] >= this.anInt603) {
                    if (this.anIntArray591!![i_0_] > this.anInt595) this.anInt595 = this.anIntArray591!![i_0_]
                } else this.anInt603 = this.anIntArray591!![i_0_]
                if (this.anIntArray591!![i_0_ + 1] >= this.anInt607) {
                    if (this.anIntArray591!![1 + i_0_] > this.anInt570) this.anInt570 = this.anIntArray591!![i_0_ - -1]
                } else this.anInt607 = this.anIntArray591!![i_0_ + 1]
                i_0_ += 2
            }
        }
    }

    fun method373(interface17: Interface17, i: Int): Boolean {
        anInt594++
        val i_1_: Int
        if (anInt606 == -1) {
            if (anInt590 == -1) return true
            i_1_ = interface17.method62(anInt590, -65536)
        } else i_1_ = interface17.method61(anInt606, (-16).toByte())
        if (i_1_ < anInt585 || i_1_ > anInt592) return false
        if (i < 26) anInt586 = 11
        val bool = false
        val i_2_: Int
        if (anInt583 == -1) {
            if (anInt573 != -1) i_2_ = interface17.method62(anInt573, -65536)
            else return true
        } else i_2_ = interface17.method61(anInt583, (-16).toByte())
        return i_2_ >= anInt587 && i_2_ <= anInt586
    }

    fun method374(bool: Boolean, var_ha: ha, i: Byte): Class105? {
        anInt579++
        val i_3_ = if (bool) this.anInt605 else this.anInt578
        if (i.toInt() != 127) return null
        val i_4_ = i_3_ or (var_ha.anInt4567 shl 29)
        var class105 = this.aClass153_593!!.aClass60_2089.method583(i_4_.toLong(), 64) as Class105?
        if (class105 != null) return class105
        if (!this.aClass153_593!!.aClass45_2087!!.method421(false, i_3_)) return null
        val class207 = Class207.method1521((this.aClass153_593!!.aClass45_2087!!), i_3_, 0)
        if (class207 != null) {
            class105 = var_ha.method3691(class207, true)
            this.aClass153_593!!.aClass60_2089.method582(class105, i_4_.toLong(), (-111).toByte())
        }
        return class105
    }

    fun method375(var_ha: ha, bool: Boolean): Class105? {
        anInt563++
        var class105 = (this.aClass153_593!!.aClass60_2089.method583((anInt598 or 0x20000 or (var_ha.anInt4567 shl 29)).toLong(), -75)) as Class105?
        if (class105 != null) return class105
        this.aClass153_593!!.aClass45_2087!!.method421(bool, anInt598)
        val class207 = Class207.method1521((this.aClass153_593!!.aClass45_2087!!), anInt598, 0)
        if (class207 != null) {
            class105 = var_ha.method3691(class207, true)
            this.aClass153_593!!.aClass60_2089.method582(class105, (var_ha.anInt4567 shl 29 or (anInt598 or 0x20000)).toLong(), (-121).toByte())
        }
        return class105
    }

    fun method376(string: String?, i: Int, i_5_: Byte): String? {
        anInt589++
        val i_6_ = -100 / ((63 - i_5_) / 58)
        if (aClass356_588 == null) return string
        val class348_sub50 = aClass356_588!!.method3480(i.toLong(), -6008) as Class348_Sub50?
        if (class348_sub50 == null) return string
        return class348_sub50.aString7211
    }

    private fun method377(i: Int, class348_sub49: Class348_Sub49, i_7_: Int) {
        anInt571++
        if (i != 1) {
            if (i == 2) this.anInt605 = class348_sub49.readUnsignedShort(842397944)
            else if (i == 3) this.aString597 = class348_sub49.readString(93.toByte())
            else if (i != 4) {
                if (i == 5) this.anInt567 = class348_sub49.readMedium(-1)
                else if (i == 6) this.anInt576 = class348_sub49.readUnsignedByte(255)
                else if (i == 7) {
                    val i_8_ = class348_sub49.readUnsignedByte(255)
                    if ((0x1 and i_8_) == 0) this.aBoolean574 = false
                    if ((i_8_ and 0x2) == 2) this.aBoolean569 = true
                } else if (i == 8) this.aBoolean599 = class348_sub49.readUnsignedByte(255) == 1
                else if (i == 9) {
                    anInt590 = class348_sub49.readUnsignedShort(842397944)
                    if (anInt590 == 65535) anInt590 = -1
                    anInt606 = class348_sub49.readUnsignedShort(842397944)
                    if (anInt606 == 65535) anInt606 = -1
                    anInt585 = class348_sub49.readInt((-126).toByte())
                    anInt592 = class348_sub49.readInt((-126).toByte())
                } else if (i >= 10 && i <= 14) this.aStringArray577[-10 + i] = class348_sub49.readString((-45).toByte())
                else if (i == 15) {
                    val i_9_ = class348_sub49.readUnsignedByte(255)
                    this.anIntArray591 = IntArray(i_9_ * 2)
                    for (i_10_ in 0..<i_9_ * 2) this.anIntArray591!![i_10_] = class348_sub49.readShort(13638)
                    this.anInt582 = class348_sub49.readInt((-126).toByte())
                    val i_11_ = class348_sub49.readUnsignedByte(255)
                    this.anIntArray572 = IntArray(i_11_)
                    var i_12_ = 0
                    while ((this.anIntArray572.size > i_12_)) {
                        this.anIntArray572[i_12_] = class348_sub49.readInt((-126).toByte())
                        i_12_++
                    }
                    this.aByteArray564 = ByteArray(i_9_)
                    var i_13_ = 0
                    while (i_9_ > i_13_) {
                        this.aByteArray564[i_13_] = class348_sub49.readByte(-107)
                        i_13_++
                    }
                } else if (i != 16) {
                    if (i == 17) this.aString565 = class348_sub49.readString(117.toByte())
                    else if (i == 18) anInt598 = class348_sub49.readUnsignedShort(842397944)
                    else if (i == 19) this.anInt596 = class348_sub49.readUnsignedShort(842397944)
                    else if (i == 20) {
                        anInt573 = class348_sub49.readUnsignedShort(842397944)
                        if (anInt573 == 65535) anInt573 = -1
                        anInt583 = class348_sub49.readUnsignedShort(842397944)
                        if (anInt583 == 65535) anInt583 = -1
                        anInt587 = class348_sub49.readInt((-126).toByte())
                        anInt586 = class348_sub49.readInt((-126).toByte())
                    } else if (i != 21) {
                        if (i == 22) this.anInt602 = class348_sub49.readInt((-126).toByte())
                        else if (i == 23) {
                            this.anInt584 = class348_sub49.readUnsignedByte(255)
                            this.anInt575 = class348_sub49.readUnsignedByte(255)
                            this.anInt601 = class348_sub49.readUnsignedByte(255)
                        } else if (i == 24) {
                            this.anInt566 = class348_sub49.readShort(13638)
                            this.anInt568 = class348_sub49.readShort(13638)
                        } else if (i == 249) {
                            val i_14_ = class348_sub49.readUnsignedByte(255)
                            if (aClass356_588 == null) {
                                val i_15_ = method340(i_14_, 108.toByte())
                                aClass356_588 = Class356(i_15_)
                            }
                            var i_16_ = 0
                            while ((i_16_ < i_14_)) {
                                val bool = (class348_sub49.readUnsignedByte(255) == 1)
                                val i_17_ = class348_sub49.readMedium(-1)
                                val class348: Class348?
                                if (!bool) class348 = (Class348_Sub35(class348_sub49.readInt((-126).toByte())))
                                else class348 = (Class348_Sub50(class348_sub49.readString((-41).toByte())))
                                aClass356_588!!.method3483(60.toByte(), i_17_.toLong(), class348)
                                i_16_++
                            }
                        }
                    } else this.anInt604 = class348_sub49.readInt((-126).toByte())
                } else this.aBoolean609 = false
            } else this.anInt580 = class348_sub49.readMedium(-1)
        } else this.anInt578 = class348_sub49.readUnsignedShort(842397944)
    }

    fun method378(i: Int, i_18_: Int, bool: Boolean): Int {
        anInt600++
        if (aClass356_588 == null) return i
        if (bool != false) return -1
        val class348_sub35 = aClass356_588!!.method3480(i_18_.toLong(), -6008) as Class348_Sub35?
        if (class348_sub35 == null) return i
        return class348_sub35.anInt6976
    }

    fun method379(class348_sub49: Class348_Sub49, i: Int) {
        if (i < 81) anInt590 = 17
        anInt610++
        while (true) {
            val i_19_ = class348_sub49.readUnsignedByte(255)
            if (i_19_ == 0) break
            method377(i_19_, class348_sub49, -121)
        }
    }

    init {
        this.anInt578 = -1
        anInt583 = -1
        this.anInt596 = -1
        this.anInt567 = -1
        this.aStringArray577 = arrayOfNulls<String>(5)
        anInt598 = -1
        this.anInt595 = -2147483648
        this.anInt584 = -1
        anInt590 = -1
        anInt606 = -1
        this.anInt601 = -1
        this.anInt605 = -1
    }

    companion object {
        @JvmField
        var anInt562: Int = 0
        @JvmField
        var anInt563: Int = 0
        @JvmField
        var anInt571: Int = 0
        @JvmField
        var anInt579: Int = 0
        @JvmField
        var anInt589: Int = 0
        @JvmField
        var anInt594: Int = 0
        @JvmField
        var anInt600: Int = 0
        @JvmField
        var anInt608: Int = 0
        @JvmField
        var anInt610: Int = 0
    }
}
