/* Class5 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class5(class45: Class45?, class45_15_: Class45, class369: Class369?) : Interface1 {
    private var anInt4630 = 0
    private val aClass45_4631: Class45 = class45_15_
    @JvmField
    var aClass45_4632: Class45? = null
    @JvmField
    var aClass369_4635: Class369? = null
    private var aClass324_4637: Class324? = null
    private var aLong4640: Long = 0
    abstract fun method178(i: Int, bool: Boolean, i_0_: Byte, i_1_: Int)

    override fun method8(i: Byte): Boolean {
        val i_2_ = -94 % ((i - 25) / 52)
        anInt4641++
        var bool = true
        if (!this.aClass45_4632!!.method421(false, this.aClass369_4635!!.anInt4965)) bool = false
        if (!aClass45_4631!!.method421(false, this.aClass369_4635!!.anInt4965)) bool = false
        return bool
    }

    override fun method7(i: Int) {
        anInt4639++
        if (i == 10286) {
            val class143 = Class239_Sub10.method1766((-85).toByte(), (this.aClass369_4635!!.anInt4965), aClass45_4631)
            aClass324_4637 = (Class348_Sub8.aHa6654!!.method3686(class143, Class207.method1523(this.aClass45_4632!!, (this.aClass369_4635!!.anInt4965)), true))
        }
    }

    abstract fun method182(i: Int, i_6_: Int, i_7_: Int, bool: Boolean)

    fun method183(i: Int): Int {
        anInt4633++
        if (i <= 16) this.aClass369_4635 = null
        val i_8_ = Class51.aClass311_897!!.method2320(106.toByte())
        var i_9_ = 100 * i_8_
        if (anInt4630 != i_8_ || i_8_ == 0) {
            anInt4630 = i_8_
            aLong4640 = Class62.method599(-125)
        } else {
            val i_10_ = Class51.aClass311_897!!.method2315(121.toByte())
            if (i_8_ < i_10_) {
                val l = aLong4640 - Class51.aClass311_897!!.method2323(0)
                if (l > 0L) {
                    val l_11_ = (i_10_ - i_8_).toLong() * (10000L * l / i_8_.toLong())
                    val l_12_ = (-aLong4640 + Class62.method599(-89)) * 10000L
                    if (l_11_ > l_12_) i_9_ = ((i_8_ * 100).toLong() + ((i_10_ + -i_8_).toLong() * (l_12_ * 100L) / l_11_)).toInt()
                    else i_9_ = i_10_ * 100
                }
            }
        }
        return i_9_
    }

    override fun method9(i: Byte, bool: Boolean) {
        if (i.toInt() == -49) {
            anInt4634++
            val i_13_ = ((this.aClass369_4635!!.aClass221_4968!!.method1607(Class92.anInt1524, this.aClass369_4635!!.anInt4971, (-123).toByte())) + this.aClass369_4635!!.anInt4970)
            val i_14_ = ((this.aClass369_4635!!.aClass341_4973!!.method2679(ha_Sub2.anInt7666, this.aClass369_4635!!.anInt4963, i.toInt() xor 0x60b.inv())) + this.aClass369_4635!!.anInt4959)
            method178(i_13_, bool, (-84).toByte(), i_14_)
            method182(63, i_14_, i_13_, bool)
            var string = Class51.aClass311_897!!.method2318(i.toInt() xor 0x245b)
            if (-aLong4640 + Class62.method599(-100) > 10000L) string += " (" + Class51.aClass311_897!!.method2324(i + 149)!!.method525(-117) + ")"
            aClass324_4637!!.method2575(115.toByte(), (i_13_ + this.aClass369_4635!!.anInt4971 / 2), this.aClass369_4635!!.anInt4961, string, -1, (this.aClass369_4635!!.anInt4966 + 4 + (i_14_ - -(this.aClass369_4635!!.anInt4963 / 2))))
        }
    }

    init {
        try {

            this.aClass45_4632 = class45
            this.aClass369_4635 = class369
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("gl.<init>(" + (if (class45 != null) "{...}" else "null") + ',' + (if (class45_15_ != null) "{...}" else "null") + ',' + (if (class369 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt4627: Int = 0
        @JvmField
        var anInt4628: Int = 0
        @JvmField
        var anInt4629: Int = 0
        @JvmField
        var anInt4633: Int = 0
        @JvmField
        var anInt4634: Int = 0
        @JvmField
        var aClass60_4636: Class60? = Class60(64)
        @JvmField
        var anInt4638: Int = 0
        @JvmField
        var anInt4639: Int = 0
        @JvmField
        var anInt4641: Int = 0

        @JvmStatic
        fun method179(i: Int, class348_sub49: Class348_Sub49): Class369_Sub1 {
            anInt4629++
            val class369 = Class348_Sub16_Sub2.method2834((-127).toByte(), class348_sub49)
            val i_3_ = class348_sub49.readInt((-126).toByte())
            val i_4_ = class348_sub49.readInt((-126).toByte())
            if (i != 16533) aClass60_4636 = null
            val i_5_ = class348_sub49.readUnsignedShort(842397944)
            return Class369_Sub1(class369.aClass221_4968, class369.aClass341_4973, class369.anInt4970, class369.anInt4959, class369.anInt4971, class369.anInt4963, class369.anInt4966, class369.anInt4965, class369.anInt4961, i_3_, i_4_, i_5_)
        }

        @JvmStatic
        fun method180(i: Int) {
            aClass60_4636 = null
            if (i != -19960) method180(-71)
        }

        @JvmStatic
        fun method181(bool: Boolean, npc: Npc?) {
            if (bool != true) method180(54)
            anInt4627++
            var class348_sub9 = Client.aClass262_5185!!.method1995(4) as? Class348_Sub9?
            while (class348_sub9 != null) {
                if ((class348_sub9.aNpc_6691) == npc) {
                    if (class348_sub9.aClass348_Sub16_Sub5_6676 != null) {
                        Class348_Sub43.aClass348_Sub16_Sub4_7065!!.method2880(class348_sub9.aClass348_Sub16_Sub5_6676!!)
                        class348_sub9.aClass348_Sub16_Sub5_6676 = null
                    }
                    class348_sub9.method2715(27.toByte())
                    break
                }
                class348_sub9 = (Client.aClass262_5185!!.method1990(78.toByte()) as? Class348_Sub9?)
            }
        }
    }
}
