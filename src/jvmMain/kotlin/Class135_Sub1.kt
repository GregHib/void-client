import Class16.method260
import Class299_Sub2_Sub1.Companion.method2270
import Class318_Sub1_Sub3_Sub3.Companion.method2431
import Class84.Companion.method826
import jaclib.memory.Buffer

class Class135_Sub1 : Class135, Interface2 {
    private var anInt4708 = 0
    override fun method13(i: Byte): Int {
        anInt4706++
        if (i.toInt() != -97) method10(false)
        return anInt4708
    }

    public override fun method1152(i: Int) {
        this.aHa_Sub2_1927!!.method3750(91, this)
        if (i >= -78) method10(false)
        anInt4710++
    }

    override fun method11(i: Int, i_0_: Int, `is`: ByteArray?, i_1_: Int) {
        this.method1150(`is`, 0, i_0_)
        anInt4711++
        anInt4708 = i
        if (i_1_ != -9894) method12((-37).toByte())
    }

    internal constructor(var_ha_Sub2: ha_Sub2?, i: Int, `is`: ByteArray?, i_2_: Int, bool: Boolean) : super(var_ha_Sub2, 34962, `is`, i_2_, bool) {
        try {
            anInt4708 = i
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("jt.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_2_ + ',' + bool + ')'))
        }
    }

    internal constructor(var_ha_Sub2: ha_Sub2?, i: Int, buffer: Buffer?, i_3_: Int, bool: Boolean) : super(var_ha_Sub2, 34962, buffer, i_3_, bool) {
        try {
            anInt4708 = i
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("jt.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (buffer != null) "{...}" else "null") + ',' + i_3_ + ',' + bool + ')'))
        }
    }

    override fun method10(bool: Boolean): Int {
        anInt4714++
        if (bool != true) method12((-54).toByte())
        return this.anInt1929
    }

    override fun method12(i: Byte): Long {
        if (i.toInt() != 42) aClass114_4707 = null
        anInt4712++
        return 0L
    }

    companion object {
        var anInt4706: Int = 0
        var aClass114_4707: Class114?
        var anIntArray4709: IntArray? = IntArray(2048)
        var anInt4710: Int = 0
        var anInt4711: Int = 0
        var anInt4712: Int = 0
        var anInt4713: Int = 0
        var anInt4714: Int = 0
        var anInt4715: Int = 0
        var anInt4716: Int = 0
        @JvmField
        var anInt4717: Int = 0
        @JvmField
        var anInt4718: Int

        @JvmStatic
        fun method1153(var_ha: ha, i: Int) {
            anInt4713++
            var i_4_ = 0
            var i_5_ = 0
            if (Class59_Sub1.aBoolean5300) {
                i_4_ = s_Sub3.method4008((-122).toByte())
                i_5_ = method260(false)
            }
            val i_6_: Int = i_4_ + anInt4717
            val i_7_ = Class348_Sub42_Sub5.anInt9532 + i_5_
            val i_8_ = Class63.anInt1117
            val i_9_ = -3 + Class237_Sub1.anInt5819
            val i_10_ = 20
            method2270(Class63.anInt1117, i_4_ + anInt4717, var_ha, Class274.aClass274_3507!!.method2063(Class348_Sub33.anInt6967, i + 528), false, i_5_ + Class348_Sub42_Sub5.anInt9532, Class237_Sub1.anInt5819, i_10_)
            val i_11_ = i_4_ + Class258_Sub4.aClass373_8552!!.method3597(true)
            if (i != 16) method1154(9.toByte())
            val i_12_ = i_5_ + Class258_Sub4.aClass373_8552!!.method3594(95.toByte())
            if (Class348_Sub42_Sub6.aBoolean9535) {
                var i_15_ = 0
                var class348_sub42_sub13 = (Class233.aClass107_3022!!.method1011(-73) as? Class348_Sub42_Sub13?)
                while (class348_sub42_sub13 != null) {
                    val i_16_ = 16 * i_15_ + i_7_ - (-i_10_ + -13)
                    if (i_4_ + anInt4717 < i_11_ && i_11_ < Class63.anInt1117 + (i_4_ + anInt4717) && i_12_ > -13 + i_16_ && i_16_ - -4 > i_12_ && ((class348_sub42_sub13.anInt9615) > 1 || (class348_sub42_sub13.aClass107_9621.aClass348_Sub42_1647.aClass348_Sub42_7063 as Class348_Sub42_Sub12).aBoolean9610)) var_ha.aa(anInt4717 + i_4_, -12 + i_16_, Class63.anInt1117, 16, (255 + -Class348_Sub42_Sub4.anInt9511 shl 24) or Class264.anInt3374, 1)
                    i_15_++
                    class348_sub42_sub13 = (Class233.aClass107_3022!!.method1003(61.toByte()) as? Class348_Sub42_Sub13?)
                }
                if (Class242.aClass348_Sub42_Sub13_3152 != null) {
                    i_15_ = 0
                    method2270(Class348_Sub1_Sub1.anInt8806, Class50_Sub3.anInt5252, var_ha, (Class242.aClass348_Sub42_Sub13_3152!!.aString9617), false, Class373.anInt4534, Class177.anInt4669, i_10_)
                    var class348_sub42_sub12 = (Class242.aClass348_Sub42_Sub13_3152!!.aClass107_9621.method1011(-44) as? Class348_Sub42_Sub12?)
                    while (class348_sub42_sub12 != null) {
                        val i_17_ = i_15_ * 16 + (Class373.anInt4534 + i_10_ - -13)
                        if (Class50_Sub3.anInt5252 < i_11_ && (Class50_Sub3.anInt5252 - -Class348_Sub1_Sub1.anInt8806) > i_11_ && -13 + i_17_ < i_12_ && i_17_ - -4 > i_12_ && (class348_sub42_sub12.aBoolean9610)) var_ha.aa(Class50_Sub3.anInt5252, i_17_ - 12, Class348_Sub1_Sub1.anInt8806, 16, (-Class348_Sub42_Sub4.anInt9511 + 255 shl 24) or Class264.anInt3374, 1)
                        i_15_++
                        class348_sub42_sub12 = (Class242.aClass348_Sub42_Sub13_3152!!.aClass107_9621.method1003(71.toByte()) as? Class348_Sub42_Sub12?)
                    }
                    method826(i_10_, Class50_Sub3.anInt5252, Class348_Sub1_Sub1.anInt8806, Class177.anInt4669, 125, Class373.anInt4534, var_ha)
                }
            } else {
                var i_13_ = 0
                var class348_sub42_sub12 = (Class348_Sub40_Sub4.aClass262_9111!!.method1995(4) as? Class348_Sub42_Sub12?)
                while (class348_sub42_sub12 != null) {
                    val i_14_ = (16 * (-1 + (Class73.anInt4776 - i_13_)) + 13 + (i_7_ + i_10_))
                    if (i_11_ > anInt4717 - -i_4_ && anInt4717 + i_4_ - -Class63.anInt1117 > i_11_ && i_12_ > i_14_ - 13 && 4 + i_14_ > i_12_ && (class348_sub42_sub12.aBoolean9610)) var_ha.aa(i_4_ + anInt4717, -12 + i_14_, Class63.anInt1117, 16, (255 + -Class348_Sub42_Sub4.anInt9511 shl 24) or Class264.anInt3374, 1)
                    i_13_++
                    class348_sub42_sub12 = Class348_Sub40_Sub4.aClass262_9111!!.method1990(101.toByte()) as? Class348_Sub42_Sub12?
                }
            }
            method826(i_10_, anInt4717 + i_4_, Class63.anInt1117, Class237_Sub1.anInt5819, -75, Class348_Sub42_Sub5.anInt9532 - -i_5_, var_ha)
            if (Class348_Sub42_Sub6.aBoolean9535) {
                var i_20_ = 0
                var class348_sub42_sub13 = (Class233.aClass107_3022!!.method1011(-77) as Class348_Sub42_Sub13?)
                while (class348_sub42_sub13 != null) {
                    val i_21_ = i_10_ + (i_5_ + Class348_Sub42_Sub5.anInt9532 + 13 - -(16 * i_20_))
                    i_20_++
                    if (class348_sub42_sub13.anInt9615 == 1) Class318_Sub2.method2494(Class348_Sub42_Sub5.anInt9532 - -i_5_, 0xffffff.inv() or Class5_Sub2.anInt8363, i_21_, var_ha, (class348_sub42_sub13.aClass107_9621.aClass348_Sub42_1647.aClass348_Sub42_7063 as Class348_Sub42_Sub12?), Class63.anInt1117, i_12_, Class348_Sub42_Sub11.anInt9586 or 0xffffff.inv(), 125.toByte(), Class237_Sub1.anInt5819, anInt4717 - -i_4_, i_11_)
                    else method2431(0xffffff.inv() or Class348_Sub42_Sub11.anInt9586, i_21_, class348_sub42_sub13, i_11_, Class63.anInt1117, 0xffffff.inv() or Class5_Sub2.anInt8363, i_12_, var_ha, Class348_Sub42_Sub5.anInt9532 - -i_5_, i xor 0x60, i_4_ + anInt4717, Class237_Sub1.anInt5819)
                    class348_sub42_sub13 = (Class233.aClass107_3022!!.method1003(111.toByte()) as Class348_Sub42_Sub13?)
                }
                if (Class242.aClass348_Sub42_Sub13_3152 != null) {
                    i_20_ = 0
                    var class348_sub42_sub12 = (Class242.aClass348_Sub42_Sub13_3152!!.aClass107_9621.method1011(-118) as? Class348_Sub42_Sub12?)
                    while (class348_sub42_sub12 != null) {
                        val i_22_ = i_20_ * 16 + 13 + (Class373.anInt4534 + i_10_)
                        i_20_++
                        Class318_Sub2.method2494(Class373.anInt4534, Class5_Sub2.anInt8363 or 0xffffff.inv(), i_22_, var_ha, class348_sub42_sub12, Class348_Sub1_Sub1.anInt8806, i_12_, (Class348_Sub42_Sub11.anInt9586 or 0xffffff.inv()), 127.toByte(), Class177.anInt4669, Class50_Sub3.anInt5252, i_11_)
                        class348_sub42_sub12 = (Class242.aClass348_Sub42_Sub13_3152!!.aClass107_9621.method1003(111.toByte()) as? Class348_Sub42_Sub12?)
                    }
                    Class332.method2642(Class348_Sub1_Sub1.anInt8806, Class373.anInt4534, true, Class50_Sub3.anInt5252, Class177.anInt4669)
                }
            } else {
                var i_18_ = 0
                var class348_sub42_sub12 = (Class348_Sub40_Sub4.aClass262_9111!!.method1995(4) as? Class348_Sub42_Sub12?)
                while (class348_sub42_sub12 != null) {
                    val i_19_ = (i_7_ - -i_10_ - (-13 - (Class73.anInt4776 + (-1 + -i_18_)) * 16))
                    i_18_++
                    Class318_Sub2.method2494(i_7_, 0xffffff.inv() or Class5_Sub2.anInt8363, i_19_, var_ha, class348_sub42_sub12, i_8_, i_12_, (0xffffff.inv() or Class348_Sub42_Sub11.anInt9586), 125.toByte(), i_9_, i_6_, i_11_)
                    class348_sub42_sub12 = Class348_Sub40_Sub4.aClass262_9111!!.method1990(71.toByte()) as? Class348_Sub42_Sub12?
                }
            }
            Class332.method2642(Class63.anInt1117, Class348_Sub42_Sub5.anInt9532 - -i_5_, true, i_4_ + anInt4717, Class237_Sub1.anInt5819)
        }

        @JvmStatic
        fun method1154(i: Byte) {
            val i_23_ = -93 / ((i - -75) / 36)
            anIntArray4709 = null
            aClass114_4707 = null
        }

        init {
            aClass114_4707 = Class114(39, 8)
            anInt4718 = 0
        }
    }
}
