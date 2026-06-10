import Class195.Companion.method1449
import OutputStream_Sub2.Companion.method136
import kotlin.math.atan2
import kotlin.math.min

/* Class318_Sub1_Sub2_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class318_Sub1_Sub2_Sub1 internal constructor(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) : Class318_Sub1_Sub2(i, i_3_, i_4_, i_5_, i_6_) {
    var anInt10180: Int = -1
    var anInt10181: Int = 0
    private var anInt10184 = 0
    var anInt10185: Int = 0
    var anInt10186: Int = 0
    var anInt10189: Int
    var anInt10190: Int = 0
    private var aBoolean10191 = false
    var anInt10196: Int = 0
    public override fun method2393(i: Int): Int {
        anInt10197++
        if (i > -109) aStringArray10195 = null
        val class213 = (Exception_Sub1.aClass255_112!!.method1940(-115, this.anInt10181))
        var i_0_ = class213.anInt2784
        if (this.anInt10189 != -1) {
            val class213_1_ = (Exception_Sub1.aClass255_112!!.method1940(74, this.anInt10189))
            if (class213_1_.anInt2784 > i_0_) i_0_ = class213_1_.anInt2784
        }
        if (this.anInt10180 != -1) {
            val class213_2_ = (Exception_Sub1.aClass255_112!!.method1940(-88, this.anInt10180))
            if (i_0_ < class213_2_.anInt2784) i_0_ = class213_2_.anInt2784
        }
        return i_0_
    }

    public override fun method2381(var_ha: ha?, i: Int): Class30? {
        if (i != 7) method2386(-74, null)
        anInt10182++
        return null
    }

    public override fun method2394(bool: Boolean): Int {
        if (bool != true) this.anInt10196 = 68
        anInt10183++
        return -10
    }

    public override fun method2387(var_ha: ha?, i: Int) {
        anInt10198++
        if (i > -125) this.anInt10196 = 71
    }

    public override fun method2391(var_ha: ha?, i: Int, i_7_: Int, i_8_: Int): Boolean {
        anInt10188++
        val class101 = var_ha!!.method3705()
        class101.method894(this.x, -10 + this.anInt6382, this.y)
        val class213 = (Exception_Sub1.aClass255_112!!.method1940(i_8_ xor 0x6b, this.anInt10181))
        var class64 = class213.method1559(null, null, var_ha, 131072, 0, this.anInt10185, 0, 88.toByte(), -1)
        if (class64 != null && (if (Class305.aBoolean3870) class64.method623(i_7_, i, class101, true, class213.anInt2784, Class132.anInt1906) else class64.method628(i_7_, i, class101, true, class213.anInt2784))) return true
        if ((this.anInt10189.inv()) != i_8_) {
            val class213_9_ = (Exception_Sub1.aClass255_112!!.method1940(-88, this.anInt10189))
            class64 = class213_9_.method1559(null, null, var_ha, 131072, 0, (this.anInt10190), 0, 88.toByte(), -1)
            if (class64 != null && (if (Class305.aBoolean3870) class64.method623(i_7_, i, class101, true, class213_9_.anInt2784, Class132.anInt1906) else class64.method628(i_7_, i, class101, true, class213_9_.anInt2784))) return true
        }
        if (this.anInt10180 != -1) {
            val class213_10_ = (Exception_Sub1.aClass255_112!!.method1940(-99, this.anInt10180))
            class64 = class213_10_.method1559(null, null, var_ha, 131072, 0, (this.anInt10186), 0, 88.toByte(), -1)
            return class64 != null && (if (!Class305.aBoolean3870) class64.method628(i_7_, i, class101, true, class213_10_.anInt2784) else class64.method623(i_7_, i, class101, true, class213_10_.anInt2784, Class132.anInt1906))
        }
        return false
    }

    public override fun method2386(i: Int, var_ha: ha?): Class318_Sub4 {
        if (i != 1) method2386(60, null)
        anInt10179++
        val class148 = method1449(this.plane.toInt(), (this.x shr Class362.anInt4459), (this.y shr Class362.anInt4459))
        if (class148 != null && class148.aClass318_Sub1_Sub3_2040!!.aBoolean8741) {
            val i_11_ = class148.aClass318_Sub1_Sub3_2040!!.method2394(true)
            if (this.anInt10196 != i_11_) {
                this.anInt6382 -= this.anInt10196
                this.anInt10196 = i_11_
                this.anInt6382 += i_11_
            }
        }
        val class101 = var_ha!!.method3705()
        class101.method910()
        if (class148 == null || !(class148.aClass318_Sub1_Sub3_2040!!.aBoolean8741)) {
            val bool = false
            val bool_12_ = false
            val bool_13_ = false
            val var_s = aa_Sub1.aSArray5191!![this.aByte6376.toInt()]
            val i_14_ = anInt10184 shl 1
            val i_15_ = i_14_
            val i_16_ = -i_14_ / 2
            val i_17_ = -i_15_ / 2
            val i_18_ = var_s!!.method3986(this.x + i_16_, this.y + i_17_, (-102).toByte())
            val i_19_ = i_14_ / 2
            val i_20_ = -i_15_ / 2
            val i_21_ = var_s.method3986(i_19_ + this.x, this.y - -i_20_, 94.toByte())
            val i_22_ = -i_14_ / 2
            val i_23_ = i_15_ / 2
            val i_24_ = var_s.method3986(this.x + i_22_, i_23_ + this.y, (-102).toByte())
            val i_25_ = i_14_ / 2
            val i_26_ = i_15_ / 2
            val i_27_ = var_s.method3986(this.x + i_25_, this.y + i_26_, 5.toByte())
            val i_28_ = min(i_18_, i_21_)
            val i_29_ = min(i_24_, i_27_)
            val i_30_ = min(i_27_, i_21_)
            if (i_15_ != 0) {
                val i_31_ = ((2607.5945876176133 * atan2((i_28_ + -i_29_).toDouble(), i_15_.toDouble())).toInt() and 0x3fff)
                if (i_31_ != 0) class101.method900(i_31_)
            }
            val i_32_ = min(i_24_, i_18_)
            var i_33_ = i_18_ - -i_27_
            if (i_14_ != 0) {
                val i_34_ = ((2607.5945876176133 * atan2((i_32_ - i_30_).toDouble(), i_14_.toDouble())).toInt() and 0x3fff)
                if (i_34_ != 0) class101.method908(-i_34_)
            }
            if (i_24_ + i_21_ < i_33_) i_33_ = i_24_ + i_21_
            i_33_ = (i_33_ shr 1) + -this.anInt6382
            if (i_33_ != 0) class101.method891(0, i_33_, 0)
        }
        class101.method891(this.x, -10 + this.anInt6382, this.y)
        val class318_sub4 = method136(3, true, false)
        aBoolean10191 = false
        anInt10184 = 0
        if (this.anInt10180 != -1) {
            val class64 = (Exception_Sub1.aClass255_112!!.method1940(i xor 0x6c, this.anInt10180).method1559(null, null, var_ha, 2048, 0, this.anInt10186, 0, 88.toByte(), -1))
            if (class64 != null) {
                if (Class305.aBoolean3870) class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414!![2]), Class132.anInt1906, 0)
                else class64.method615(class101, (class318_sub4.aClass318_Sub3Array6414!![2]), 0)
                aBoolean10191 = aBoolean10191 or class64.F()
                anInt10184 = class64.ma()
            }
        }
        if (this.anInt10189 != -1) {
            val class64 = (Exception_Sub1.aClass255_112!!.method1940(i xor 0x3b.inv(), this.anInt10189).method1559(null, null, var_ha, 2048, 0, this.anInt10190, 0, 88.toByte(), -1))
            if (class64 != null) {
                if (!Class305.aBoolean3870) class64.method615(class101, (class318_sub4.aClass318_Sub3Array6414!![1]), 0)
                else class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414!![1]), Class132.anInt1906, 0)
                aBoolean10191 = aBoolean10191 or class64.F()
                if (anInt10184 < class64.ma()) anInt10184 = class64.ma()
            }
        }
        val class64 = (Exception_Sub1.aClass255_112!!.method1940(-48, this.anInt10181).method1559(null, null, var_ha, 2048, 0, this.anInt10185, 0, 88.toByte(), -1))
        if (class64 != null) {
            if (!Class305.aBoolean3870) class64.method615(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), 0)
            else class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), Class132.anInt1906, 0)
            aBoolean10191 = aBoolean10191 or class64.F()
            if (anInt10184 < class64.ma()) anInt10184 = class64.ma()
        }
        return class318_sub4
    }

    public override fun method2379(i: Int): Int {
        anInt10193++
        if (i != -25675) aClass138_10194 = null
        return anInt10184
    }

    public override fun method2377(i: Byte): Boolean {
        anInt10192++
        if (i.toInt() != 122) method2394(true)
        return aBoolean10191
    }

    public override fun method2376(i: Int): Boolean {
        if (i >= -12) this.anInt10180 = -23
        anInt10187++
        return false
    }

    init {
        this.anInt10189 = -1
    }

    companion object {
        var anInt10179: Int = 0
        var anInt10182: Int = 0
        var anInt10183: Int = 0
        var anInt10187: Int = 0
        var anInt10188: Int = 0
        var anInt10192: Int = 0
        var anInt10193: Int = 0
        @JvmField
        var aClass138_10194: Class138?
        @JvmField
        var aStringArray10195: Array<String?>? = arrayOfNulls<String>(8)
        var anInt10197: Int = 0
        var anInt10198: Int = 0
        var aFloat10199: Float = 0f

        @JvmStatic
        fun method2407(bool: Boolean) {
            aStringArray10195 = null
            aClass138_10194 = null
            if (bool != false) method2407(true)
        }

        init {
            aClass138_10194 = Class138(13, 0, 1, 0)
        }
    }
}
