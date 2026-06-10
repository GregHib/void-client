/* Class4 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class4 internal constructor(`is`: ByteArray, class348_sub33: Class348_Sub33?) {
    var anInt126: Int = 0
    var aShortArray128: ShortArray? = null
    @JvmField
    var aBoolean129: Boolean = false
    var aShortArray130: ShortArray? = null
    @JvmField
    var aBoolean131: Boolean = false
    var aByteArray132: ByteArray? = null
    var aClass348_Sub33_134: Class348_Sub33? = null
    var aShortArray135: ShortArray? = null
    var aShortArray137: ShortArray? = null
    @JvmField
    var aBoolean139: Boolean = false
    var aShortArray140: ShortArray? = null

    init {
        this.aClass348_Sub33_134 = class348_sub33
        try {
            val class348_sub49 = Class348_Sub49(`is`)
            val class348_sub49_0_ = Class348_Sub49(`is`)
            class348_sub49.readUnsignedByte(255)
            class348_sub49.anInt7197 += 2
            val i = class348_sub49.readUnsignedByte(255) //byte
            var i_1_ = 0
            var i_2_ = -1
            var i_3_ = -1
            class348_sub49_0_.anInt7197 = class348_sub49.anInt7197 + i
            for (i_4_ in 0..<i) {
                val i_5_ = (this.aClass348_Sub33_134!!.anIntArray6957!![i_4_])
                if (i_5_ == 0) i_2_ = i_4_
                val i_6_ = class348_sub49.readUnsignedByte(255) //byte
                if (i_6_ > 0) {
                    if (i_5_ == 0) i_3_ = i_4_
                    aShortArray141!![i_1_] = i_4_.toShort()
                    var i_7_: Short = 0
                    if (i_5_ == 3 || i_5_ == 10) i_7_ = 128.toShort()
                    if ((i_6_ and 0x1) != 0) aShortArray127!![i_1_] = class348_sub49_0_.method3362(77.toByte()).toShort() //smart
                    else aShortArray127!![i_1_] = i_7_
                    if ((i_6_ and 0x2) != 0) aShortArray133!![i_1_] = class348_sub49_0_.method3362(77.toByte()).toShort() //smart
                    else aShortArray133!![i_1_] = i_7_
                    if ((i_6_ and 0x4) != 0) aShortArray142!![i_1_] = class348_sub49_0_.method3362(77.toByte()).toShort() //smart
                    else aShortArray142!![i_1_] = i_7_
                    aByteArray136!![i_1_] = (i_6_ ushr 3 and 0x3).toByte()
                    if (i_5_ == 2 || i_5_ == 9) {
                        aShortArray127!![i_1_] = (aShortArray127!![i_1_].toInt() shl 2 and 0x3fff).toShort()
                        aShortArray133!![i_1_] = (aShortArray133!![i_1_].toInt() shl 2 and 0x3fff).toShort()
                        aShortArray142!![i_1_] = (aShortArray142!![i_1_].toInt() shl 2 and 0x3fff).toShort()
                    }
                    aShortArray138!![i_1_] = (-1).toShort()
                    if (i_5_ == 1 || i_5_ == 2 || i_5_ == 3) {
                        if (i_2_ > i_3_) {
                            aShortArray138!![i_1_] = i_2_.toShort()
                            i_3_ = i_2_
                        }
                    } else if (i_5_ == 5) this.aBoolean139 = true
                    else if (i_5_ == 7) this.aBoolean131 = true
                    else if (i_5_ == 9 || i_5_ == 10 || i_5_ == 8) this.aBoolean129 = true
                    i_1_++
                }
            }
            if (class348_sub49_0_.anInt7197 != `is`.size) throw RuntimeException()
            this.anInt126 = i_1_
            this.aShortArray130 = ShortArray(i_1_)
            this.aShortArray140 = ShortArray(i_1_)
            this.aShortArray137 = ShortArray(i_1_)
            this.aShortArray135 = ShortArray(i_1_)
            this.aShortArray128 = ShortArray(i_1_)
            this.aByteArray132 = ByteArray(i_1_)
            for (i_8_ in 0..<i_1_) {
                this.aShortArray130!![i_8_] = aShortArray141!![i_8_]
                this.aShortArray140!![i_8_] = aShortArray127!![i_8_]
                this.aShortArray137!![i_8_] = aShortArray133!![i_8_]
                this.aShortArray135!![i_8_] = aShortArray142!![i_8_]
                this.aShortArray128!![i_8_] = aShortArray138!![i_8_]
                this.aByteArray132!![i_8_] = aByteArray136!![i_8_]
            }
        } catch (exception: Exception) {
            this.anInt126 = 0
            this.aBoolean139 = false
            this.aBoolean131 = false
        }
    }

    companion object {
        private var aShortArray127: ShortArray? = ShortArray(500)
        private var aShortArray133: ShortArray? = ShortArray(500)
        private var aByteArray136: ByteArray? = ByteArray(500)
        private var aShortArray138: ShortArray? = ShortArray(500)
        private var aShortArray141: ShortArray?
        private var aShortArray142: ShortArray? = ShortArray(500)

        @JvmStatic
        fun method177() {
            aShortArray141 = null
            aShortArray127 = null
            aShortArray133 = null
            aShortArray142 = null
            aShortArray138 = null
            aByteArray136 = null
        }

        init {
            aShortArray141 = ShortArray(500)
        }
    }
}
