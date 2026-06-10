import Class214.method1573
import Class286_Sub5.Companion.method2161
import Class62.method599
import java.awt.Component
import kotlin.math.min

open class Class279 {
    private val anInt3601 = 32
    private var aLong3602: Long
    var anIntArray3603: IntArray? = null
    private var aClass348_Sub16_3604: Class348_Sub16? = null
    private var aBoolean3610 = false
    var anInt3613: Int = 0
    private var aLong3614 = 0L
    private var anInt3615 = 0
    private var anInt3616 = 0
    private var anInt3617 = 0
    private var aLong3618 = 0L
    private val aClass348_Sub16Array3619: Array<Class348_Sub16?>
    var anInt3620: Int = 0
    private val aClass348_Sub16Array3621: Array<Class348_Sub16?>
    private var anInt3622 = 0
    private var aBoolean3623 = true
    private var anInt3624 = 0

    @Throws(Exception::class)
    open fun method2081(): Int {
        anInt3605++
        return this.anInt3613
    }

    @Throws(Exception::class)
    open fun method2082(i: Int) {
        anInt3607++
    }

    @Throws(Exception::class)
    open fun method2083() {
        anInt3606++
    }

    @Synchronized
    fun method2084(i: Int) {
        anInt3595++
        if (!aBoolean3610) {
            var l = method599(-107)
            try {
                if (l > aLong3602 + 6000L) aLong3602 = -6000L + l
                if (i != -6858) anInt3616 = 114
                while ( /**/aLong3602 + 5000L < l) {
                    method2089(256, (-99).toByte())
                    aLong3602 += (256000 / Class22.anInt339).toLong()
                    l = method599(-96)
                }
            } catch (exception: Exception) {
                aLong3602 = l
            }
            if (this.anIntArray3603 != null) {
                try {
                    if (aLong3614 != 0L) {
                        if (aLong3614 > l) return
                        method2082(this.anInt3613)
                        aBoolean3623 = true
                        aLong3614 = 0L
                    }
                    var i_0_ = method2081()
                    if (-i_0_ + anInt3622 > anInt3624) anInt3624 = -i_0_ + anInt3622
                    var i_1_ = this.anInt3620 - -anInt3616
                    if (i_1_ - -256 > 16384) i_1_ = 16128
                    if (256 + i_1_ > this.anInt3613) {
                        this.anInt3613 += 1024
                        if (this.anInt3613 > 16384) this.anInt3613 = 16384
                        method2091()
                        method2082(this.anInt3613)
                        i_0_ = 0
                        aBoolean3623 = true
                        if (256 + i_1_ > this.anInt3613) {
                            i_1_ = this.anInt3613 + -256
                            anInt3616 = -this.anInt3620 + i_1_
                        }
                    }
                    while ( /**/i_0_ < i_1_) {
                        method2086(this.anIntArray3603!!, 256)
                        method2094()
                        i_0_ += 256
                    }
                    if (l > aLong3618) {
                        if (!aBoolean3623) {
                            if (anInt3624 == 0 && anInt3617 == 0) {
                                method2091()
                                aLong3614 = 2000L + l
                                return
                            }
                            anInt3616 = min(anInt3617, anInt3624)
                            anInt3617 = anInt3624
                        } else aBoolean3623 = false
                        aLong3618 = l - -2000L
                        anInt3624 = 0
                    }
                    anInt3622 = i_0_
                } catch (exception: Exception) {
                    method2091()
                    aLong3614 = 2000L + l
                }
            }
        }
    }

    private fun method2085(i: Int, class348_sub16: Class348_Sub16, i_2_: Int) {
        anInt3597++
        val i_3_ = i_2_ shr 5
        if (i != -1846918107) method2088(true, null)
        val class348_sub16_4_ = aClass348_Sub16Array3621[i_3_]
        if (class348_sub16_4_ != null) class348_sub16_4_.aClass348_Sub16_6785 = class348_sub16
        else aClass348_Sub16Array3619[i_3_] = class348_sub16
        aClass348_Sub16Array3621[i_3_] = class348_sub16
        class348_sub16.anInt6786 = i_2_
    }

    private fun method2086(`is`: IntArray, i: Int) {
        var i_5_ = i
        if (Class282.aBoolean3652) i_5_ = i_5_ shl 1
        method1573(`is`, 0, i_5_)
        anInt3615 -= i
        if (aClass348_Sub16_3604 != null && anInt3615 <= 0) {
            anInt3615 += Class22.anInt339 shr 4
            Class348_Sub15.method2814(aClass348_Sub16_3604!!, 112)
            method2085(-1846918107, aClass348_Sub16_3604!!, aClass348_Sub16_3604!!.method2820())
            var i_6_ = 0
            var i_7_ = 255
            var i_8_ = 7
            while_88_@ while (i_7_ != 0) {
                var i_9_: Int
                var i_10_: Int
                if (i_8_ < 0) {
                    i_9_ = i_8_ and 0x3
                    i_10_ = -(i_8_ shr 2)
                } else {
                    i_9_ = i_8_
                    i_10_ = 0
                }
                var i_11_ = i_7_ ushr i_9_ and 0x11111111
                while (i_11_ != 0) {
                    if ((i_11_ and 0x1) != 0) {
                        i_7_ = i_7_ and (1 shl i_9_).inv()
                        var class348_sub16: Class348_Sub16? = null
                        var class348_sub16_12_ = aClass348_Sub16Array3619[i_9_]
                        while (class348_sub16_12_ != null) {
                            val class348_sub19 = (class348_sub16_12_.aClass348_Sub19_6787)
                            if (class348_sub19 != null && (class348_sub19.anInt6824 > i_10_)) {
                                i_7_ = i_7_ or (1 shl i_9_)
                                class348_sub16 = class348_sub16_12_
                                class348_sub16_12_ = (class348_sub16_12_.aClass348_Sub16_6785)
                            } else {
                                class348_sub16_12_.aBoolean6784 = true
                                val i_13_ = class348_sub16_12_.method2821()
                                i_6_ += i_13_
                                if (class348_sub19 != null) class348_sub19.anInt6824 += i_13_
                                if (i_6_ >= anInt3601) break@while_88_
                                var class348_sub16_14_ = class348_sub16_12_.method2816()
                                if (class348_sub16_14_ != null) {
                                    val i_15_ = (class348_sub16_12_.anInt6786)
                                    while ( /**/class348_sub16_14_ != null) {
                                        method2085(-1846918107, class348_sub16_14_, (i_15_ * class348_sub16_14_.method2820() shr 8))
                                        class348_sub16_14_ = class348_sub16_12_.method2818()
                                    }
                                }
                                val class348_sub16_16_ = (class348_sub16_12_.aClass348_Sub16_6785)
                                class348_sub16_12_.aClass348_Sub16_6785 = null
                                if (class348_sub16 == null) aClass348_Sub16Array3619[i_9_] = class348_sub16_16_
                                else class348_sub16.aClass348_Sub16_6785 = class348_sub16_16_
                                if (class348_sub16_16_ == null) aClass348_Sub16Array3621[i_9_] = class348_sub16
                                class348_sub16_12_ = class348_sub16_16_
                            }
                        }
                    }
                    i_9_ += 4
                    i_10_++
                    i_11_ = i_11_ ushr 4
                }
                i_8_--
            }
            for (i_17_ in 0..7) {
                var class348_sub16 = aClass348_Sub16Array3619[i_17_]
                aClass348_Sub16Array3621[i_17_] = null
                aClass348_Sub16Array3619[i_17_] = aClass348_Sub16Array3621[i_17_]
                var class348_sub16_18_: Class348_Sub16?
                while ( /**/class348_sub16 != null) {
                    class348_sub16_18_ = (class348_sub16.aClass348_Sub16_6785)
                    class348_sub16.aClass348_Sub16_6785 = null
                    class348_sub16 = class348_sub16_18_
                }
            }
        }
        if (anInt3615 < 0) anInt3615 = 0
        if (aClass348_Sub16_3604 != null) aClass348_Sub16_3604!!.method2817(`is`, 0, i)
        aLong3602 = method599(-102)
    }

    @Synchronized
    fun method2087(i: Int) {
        aBoolean3623 = true
        anInt3599++
        try {
            if (i >= -110) aLong3602 = -66L
            method2083()
        } catch (exception: Exception) {
            method2091()
            aLong3614 = 2000L + method599(-96)
        }
    }

    @Synchronized
    fun method2088(bool: Boolean, class348_sub16: Class348_Sub16?) {
        aClass348_Sub16_3604 = class348_sub16
        anInt3600++
    }

    private fun method2089(i: Int, i_19_: Byte) {
        anInt3611++
        anInt3615 -= i
        if (anInt3615 < 0) anInt3615 = 0
        if (aClass348_Sub16_3604 != null) aClass348_Sub16_3604!!.method2819(i)
        if (i_19_ > -75) method2090(13, 6, true, 40.toByte(), 67, -121, -107)
    }

    open fun method2091() {
        anInt3598++
    }

    @Synchronized
    fun method2093(bool: Boolean) {
        anInt3609++
        if (Class183.aClass250_2462 != null) {
            var bool_35_ = true
            for (i in 0..1) {
                if (Class183.aClass250_2462!!.aClass279Array3218[i] === this) Class183.aClass250_2462!!.aClass279Array3218[i] = null
                if (Class183.aClass250_2462!!.aClass279Array3218[i] != null) bool_35_ = false
            }
            if (bool_35_) {
                Class183.aClass250_2462!!.aBoolean3221 = true
                while (Class183.aClass250_2462!!.aBoolean3223) method2161(68.toByte(), 50L)
                Class183.aClass250_2462 = null
            }
        }
        method2091()
        this.anIntArray3603 = null
        aBoolean3610 = bool
    }

    @Throws(Exception::class)
    open fun method2094() {
        anInt3612++
    }

    @Throws(Exception::class)
    open fun method2095(component: Component?) {
        anInt3596++
    }

    init {
        aLong3602 = method599(-99)
        aClass348_Sub16Array3621 = arrayOfNulls<Class348_Sub16>(8)
        aClass348_Sub16Array3619 = arrayOfNulls<Class348_Sub16>(8)
    }

    companion object {
        var anInt3594: Int = 0
        var anInt3595: Int = 0
        var anInt3596: Int = 0
        var anInt3597: Int = 0
        var anInt3598: Int = 0
        var anInt3599: Int = 0
        var anInt3600: Int = 0
        var anInt3605: Int = 0
        var anInt3606: Int = 0
        var anInt3607: Int = 0
        var anInt3608: Int = 0
        var anInt3609: Int = 0
        var anInt3611: Int = 0
        var anInt3612: Int = 0
        @JvmStatic
        fun method2090(i: Int, i_20_: Int, bool: Boolean, i_21_: Byte, i_22_: Int, i_23_: Int, i_24_: Int) {
            if ((if (bool) Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7215!!.method1838(-32350) else Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7272!!.method1838(-32350)) != 0 && i != 0 && Class147.anInt2021 < 50 && i_24_ != -1) Class258_Sub2.aClass10Array8531!![Class147.anInt2021++] = Class10(if (!bool) 2.toByte() else 3.toByte(), i_24_, i, i_23_, i_22_, 0, i_20_, null)
            if (i_21_.toInt() == -35) anInt3608++
        }

        @JvmStatic
        fun method2092(i: Int, i_25_: Int, `is`: IntArray?, i_26_: Int, objects: Array<Any?>?) {
            try {
                val i_27_ = -92 / ((i_26_ - -55) / 57)
                if (i_25_ < i) {
                    val i_28_ = (i + i_25_) / 2
                    var i_29_ = i_25_
                    val i_30_ = `is`!![i_28_]
                    `is`[i_28_] = `is`[i]
                    `is`[i] = i_30_
                    val `object` = objects!![i_28_]
                    objects[i_28_] = objects[i]
                    objects[i] = `object`
                    val i_31_ = if (i_30_ != 2147483647) 1 else 0
                    for (i_32_ in i_25_..<i) {
                        if (`is`[i_32_] < (i_31_ and i_32_) + i_30_) {
                            val i_33_ = `is`[i_32_]
                            `is`[i_32_] = `is`[i_29_]
                            `is`[i_29_] = i_33_
                            val object_34_ = objects[i_32_]
                            objects[i_32_] = objects[i_29_]
                            objects[i_29_++] = object_34_
                        }
                    }
                    `is`[i] = `is`[i_29_]
                    `is`[i_29_] = i_30_
                    objects[i] = objects[i_29_]
                    objects[i_29_] = `object`
                    method2092(-1 + i_29_, i_25_, `is`, 9, objects)
                    method2092(i, i_29_ - -1, `is`, -127, objects)
                }
                anInt3594++
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("cba.K(" + i + ',' + i_25_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_26_ + ',' + (if (objects != null) "{...}" else "null") + ')'))
            }
        }
    }
}
