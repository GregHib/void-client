import Class122.method1087
import Class273.Companion.method2056
import kotlin.concurrent.Volatile

/* Class315 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class315 internal constructor(var aString3953: String?) {
    private val aClass243_3946 = Class243()
    private var aClass293_3956: Class293? = null

    @Volatile
    private var anInt3957 = 0

    fun method2353(class318_sub1: Class318_Sub1, bool: Boolean) {
        class318_sub1.aBoolean6387 = bool
        anInt3944++
        synchronized(aClass243_3946) {
            aClass243_3946.method1869(-90, class318_sub1)
            anInt3957++
        }
        if (aClass293_3956 != null) {
            synchronized(aClass293_3956!!) {
                (aClass293_3956 as Object).notify()
            }
        }
    }

    fun method2356(class293: Class293?, i: Byte) {
        aClass293_3956 = class293
        if (i.toInt() != -108) method2358(-10, -55, 5)
        anInt3949++
    }

    fun method2359(class318_sub2: Class318_Sub2, i: Int) {
        if (i != -1) method2362(45)
        synchronized(aClass243_3946) {
            aClass243_3946.method1869(-127, class318_sub2)
            anInt3957++
        }
        anInt3947++
        if (aClass293_3956 != null) {
            synchronized(aClass293_3956!!) {
                (aClass293_3956 as Object).notify()
            }
        }
    }

    fun method2360(i: Int): Boolean {
        val i_7_ = 46 % ((i - 10) / 54)
        anInt3955++
        return anInt3957 == 0
    }

    fun method2361(i: Int, class318_sub1: Class318_Sub1) {
        class318_sub1.aBoolean6387 = true
        anInt3950++
        synchronized(aClass243_3946) {
            aClass243_3946.method1869(-122, class318_sub1)
            anInt3957++
        }
        if (i != -15481) this.aString3953 = null
        if (aClass293_3956 != null) {
            synchronized(aClass293_3956!!) {
                (aClass293_3956 as Object).notify()
            }
        }
    }

    fun method2362(i: Int): Class318 {
        anInt3952++
        val `object`: Any? = null
        val class318: Class318?
        synchronized(aClass243_3946) {
            class318 = aClass243_3946.method1872(8)
            class318!!.method2373(false)
            anInt3957--
        }
        return class318!!
    }

    companion object {
        var anInt3944: Int = 0
        var anInt3945: Int = 0
        var anInt3947: Int = 0
        var anInt3948: Int = 0
        var anInt3949: Int = 0
        var anInt3950: Int = 0
        var anInt3951: Int = 0
        var anInt3952: Int = 0
        var anInt3954: Int = 0
        var anInt3955: Int = 0
        @JvmStatic
        fun method2354(class364: Class364?, i: Int): Boolean {
            anInt3954++
            if (i != -1) method2355(-93, 115.toByte(), true, null, -92, -67, 6)
            return Class367_Sub8.aClass364_7361 == class364 || Class26.aClass364_382 == class364 || Class108.aClass364_1657 == class364 || class364 == Class342.aClass364_4246
        }

        @JvmStatic
        fun method2355(i: Int, i_0_: Byte, bool: Boolean, class45: Class45?, i_1_: Int, i_2_: Int, i_3_: Int) {
            Class58.anInt1059 = i
            anInt3948++
            Class346.aBoolean4275 = bool
            Class285.aClass348_Sub16_Sub3_4743 = null
            Class318_Sub1_Sub4_Sub1.anInt10074 = i_1_
            Class239_Sub14.anInt5994 = i_3_
            Class348_Sub43.anInt7068 = 1
            Class318.anInt3971 = i_2_
            Class124.aClass45_1848 = class45
        }

        @JvmStatic
        fun method2357(i: Int, player: Player): Int {
            anInt3951++
            var i_4_ = (player.anInt10560)
            val class225 = player.method2422(72.toByte())
            if (i != (player.anInt10268) && !(player.aBoolean10213)) {
                if ((player.anInt10268) != class225.anInt2919 && (player.anInt10268 != class225.anInt2920) && (class225.anInt2949 != (player.anInt10268)) && (player.anInt10268 != class225.anInt2914)) {
                    if ((class225.anInt2940 == (player.anInt10268)) || (player.anInt10268 == class225.anInt2924) || (player.anInt10268 == class225.anInt2947) || (player.anInt10268 == class225.anInt2958)) i_4_ = player.anInt10526
                } else i_4_ = player.anInt10519
            } else i_4_ = player.anInt10535
            return i_4_
        }

        fun method2358(i: Int, i_5_: Int, i_6_: Int): Boolean {
            if (i >= -106) return true
            anInt3945++
            return method1087(12644, i_6_, i_5_) || method2056(i_5_, 107, i_6_)
        }
    }
}
