import jaclib.hardware_info.HardwareInfo.cPUInfo
import java.util.*

class Class348_Sub4 : Class348 {
    private var anInt6591 = 0
    private var anInt6592 = 0
    private var anInt6594 = 0
    private var anInt6595 = 0
    private var anInt6596 = 0
    private var aString6597: String? = null
    private var anInt6598 = 0
    private var anInt6599 = 0
    private var anInt6603 = 0
    private var aString6604: String? = null
    private var anInt6605 = 0
    private val anInt6606 = 0
    private var aBoolean6607 = false
    private var aBoolean6608 = false
    @JvmField
    var anInt6609: Int = 0
    private var aString6610: String? = null
    private var anInt6612 = 0
    private var anInt6613 = 0
    private var aString6614: String? = null
    private var anInt6616 = 0
    private val anInt6617 = 0

    private fun method2745(i: Int) {
        if (aString6604!!.length > 40) aString6604 = aString6604!!.substring(0, 40)
        anInt6615++
        if (aString6614!!.length > 40) aString6614 = aString6614!!.substring(0, 40)
        if (aString6610!!.length > i) aString6610 = aString6610!!.substring(0, 10)
        if (aString6597!!.length > 10) aString6597 = aString6597!!.substring(0, 10)
    }

    fun method2746(i: Byte): Int {
        anInt6600++
        var i_0_ = 23
        i_0_ += Class288.method2186((-114).toByte(), aString6604!!)
        i_0_ += Class288.method2186((-114).toByte(), aString6614!!)
        i_0_ += Class288.method2186((-114).toByte(), aString6610!!)
        val i_1_ = 42 % ((44 - i) / 49)
        i_0_ += Class288.method2186((-114).toByte(), aString6597!!)
        return i_0_
    }

    fun method2747(i: Int, class348_sub49: Class348_Sub49) {
        class348_sub49.writeByte(false, 5)
        anInt6611++
        class348_sub49.writeByte(false, anInt6613)
        class348_sub49.writeByte(false, if (aBoolean6608) 1 else 0)
        class348_sub49.writeByte(false, anInt6595)
        class348_sub49.writeByte(false, anInt6594)
        class348_sub49.writeByte(false, anInt6616)
        class348_sub49.writeByte(false, anInt6605)
        class348_sub49.writeByte(false, anInt6612)
        class348_sub49.writeByte(false, if (!aBoolean6607) 0 else 1)
        class348_sub49.writeShort(107.toByte(), anInt6592)
        class348_sub49.writeByte(false, anInt6599)
        class348_sub49.method3340(i xor 0x26b6.inv(), this.anInt6609)
        class348_sub49.writeShort(107.toByte(), anInt6591)
        class348_sub49.writeByte(false, anInt6598)
        class348_sub49.writeByte(false, anInt6596)
        class348_sub49.writeByte(false, anInt6603)
        class348_sub49.method3386(aString6604!!, 123)
        class348_sub49.method3386(aString6614!!, -45)
        class348_sub49.method3386(aString6610!!, 100)
        if (i == 1) {
            class348_sub49.method3386(aString6597!!, -14)
            class348_sub49.writeByte(false, anInt6606)
            class348_sub49.writeShort(107.toByte(), anInt6617)
        }
    }

    constructor()

    internal constructor(bool: Boolean, class297: Class297) {
        if (bool) {
            if (Class297.aString3803.startsWith("win")) anInt6613 = 1
            else if (Class297.aString3803.startsWith("mac")) anInt6613 = 2
            else if (Class297.aString3803.startsWith("linux")) anInt6613 = 3
            else anInt6613 = 4
            aBoolean6608 = Class297.aString3780!!.startsWith("amd64") || Class297.aString3780!!.startsWith("x86_64")
            if (anInt6613 != 1) {
                if (anInt6613 == 2) {
                    if (Class297.aString3778!!.indexOf("10.4") == -1) {
                        if (Class297.aString3778!!.indexOf("10.5") == -1) {
                            if (Class297.aString3778!!.indexOf("10.6") != -1) anInt6595 = 22
                        } else anInt6595 = 21
                    } else anInt6595 = 20
                }
            } else if (Class297.aString3778!!.indexOf("4.0") != -1) anInt6595 = 1
            else if (Class297.aString3778!!.indexOf("4.1") == -1) {
                if (Class297.aString3778!!.indexOf("4.9") == -1) {
                    if (Class297.aString3778!!.indexOf("5.0") != -1) anInt6595 = 4
                    else if (Class297.aString3778!!.indexOf("5.1") == -1) {
                        if (Class297.aString3778!!.indexOf("6.0") != -1) anInt6595 = 6
                        else if (Class297.aString3778!!.indexOf("6.1") != -1) anInt6595 = 7
                    } else anInt6595 = 5
                } else anInt6595 = 3
            } else anInt6595 = 2
            if (Class297.aString3782!!.lowercase(Locale.getDefault()).indexOf("sun") != -1) anInt6594 = 1
            else if (Class297.aString3782!!.lowercase(Locale.getDefault()).indexOf("microsoft") == -1) {
                if (Class297.aString3782!!.lowercase(Locale.getDefault()).indexOf("apple") != -1) anInt6594 = 3
                else anInt6594 = 4
            } else anInt6594 = 2
            val oldJava = Class297.aString3796!!.startsWith("1.")
            var i = if (oldJava) 2 else 0
            var i_3_ = 0
            try {
                while (Class297.aString3796!!.length > i) {
                    val i_4_ = Class297.aString3796!!.get(i).code
                    if (i_4_ < 48 || i_4_ > 57) break
                    i++
                    i_3_ = i_3_ * 10 - -i_4_ + -48
                }
            } catch (exception: Exception) {
                /* empty */
            }
            anInt6616 = i_3_
            i = Class297.aString3796!!.indexOf('.', 2) - -1
            i_3_ = 0
            try {
                while ( /**/(i < Class297.aString3796!!.length)) {
                    val i_5_ = Class297.aString3796!!.get(i).code
                    if (i_5_ < 48 || i_5_ > 57) break
                    i_3_ = i_3_ * 10 + i_5_ + -48
                    i++
                }
            } catch (exception: Exception) {
                /* empty */
            }
            anInt6605 = i_3_
            i_3_ = 0
            i = 1 + Class297.aString3796!!.indexOf(if (oldJava) '_' else '.', 4)
            try {
                while ( /**/Class297.aString3796!!.length > i) {
                    val i_6_ = Class297.aString3796!!.get(i).code
                    if (i_6_ < 48 || i_6_ > 57) break
                    i_3_ = i_6_ + -48 + i_3_ * 10
                    i++
                }
            } catch (exception: Exception) {
                /* empty */
            }
            aBoolean6607 = !class297.aBoolean3777
            anInt6612 = i_3_
            anInt6592 = Class226.anInt2964
            if (anInt6616 <= 3) anInt6599 = 0
            else anInt6599 = Class348_Sub40_Sub29.anInt9372
            try {
                val `is` = cPUInfo
                if (`is` != null && `is`.size == 7) {
                    anInt6598 = `is`[3]
                    anInt6596 = `is`[4]
                    anInt6591 = `is`[2]
                    anInt6603 = `is`[5]
                    this.anInt6609 = `is`[6]
                }
            } catch (throwable: Throwable) {
                this.anInt6609 = 0
            }
        }
        if (aString6610 == null) aString6610 = ""
        if (aString6604 == null) aString6604 = ""
        if (aString6597 == null) aString6597 = ""
        if (aString6614 == null) aString6614 = ""
        method2745(10)
    }

    companion object {
        @JvmField
        var anInt6593: Int = 0
        @JvmField
        var anInt6600: Int = 0
        @JvmField
        var aClass248_6601: Class248? = null
        @JvmField
        var aClass173_6602: Class173? = Class173()
        @JvmField
        var anInt6611: Int = 0
        @JvmField
        var anInt6615: Int = 0
        @JvmStatic
        fun method2748(i: Int) {
            val i_2_ = 80 / ((52 - i) / 57)
            aClass173_6602 = null
            aClass248_6601 = null
        }

        @JvmStatic
        fun method2749(i: Int): Int {
            if (i != -1) method2749(20)
            anInt6593++
            return za_Sub1.anInt9774
        }
    }
}
