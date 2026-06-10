import Class101.Companion.method901
import Class369.Companion.method3568
import Class376.Companion.method3616

/* Class258_Sub3_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class258_Sub3_Sub1 : Class258_Sub3 {
    @JvmField
    var aFloat9937: Float = 0f
    @JvmField
    var aFloat9938: Float = 0f
    @JvmField
    var anInt9939: Int = 0
    @JvmField
    var anInt9940: Int = 0
    @JvmField
    var aBoolean9941: Boolean = false

    internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_0_: Int, i_1_: Int, i_2_: Int) : super(var_ha_Sub2, i, i_0_, i_1_, i_2_) {
        if (this.anInt4849 == 34037) {
            this.aFloat9938 = i_2_.toFloat()
            this.aBoolean9941 = false
            this.aFloat9937 = i_1_.toFloat()
        } else {
            this.aBoolean9941 = true
            this.aFloat9938 = 1.0f
            this.aFloat9937 = this.aFloat9938
        }
        this.anInt9940 = i_1_
        this.anInt9939 = i_2_
    }

    internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) : super(var_ha_Sub2, 3553, i, i_5_, i_6_) {
        this.aFloat9937 = i_3_.toFloat() / i_5_.toFloat()
        this.anInt9939 = i_4_
        this.anInt9940 = i_3_
        this.aFloat9938 = i_4_.toFloat() / i_6_.toFloat()
        this.aBoolean9941 = false
        this.method1965(false, false, 10243)
    }

    internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, bool: Boolean) : super(var_ha_Sub2, i, i_7_, i_8_, i_9_, i_10_) {
        this.anInt9940 = i_9_
        if (this.anInt4849 == 34037) {
            this.aBoolean9941 = false
            this.aFloat9937 = i_9_.toFloat()
            this.aFloat9938 = i_10_.toFloat()
        } else {
            this.aBoolean9941 = true
            this.aFloat9938 = 1.0f
            this.aFloat9937 = this.aFloat9938
        }
        this.anInt9939 = i_10_
    }

    internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int, bool: Boolean) : super(var_ha_Sub2, 3553, i, i_12_, i_15_, i_16_) {
        this.anInt9940 = i_13_
        this.aFloat9938 = i_14_.toFloat() / i_16_.toFloat()
        this.aFloat9937 = i_13_.toFloat() / i_15_.toFloat()
        this.anInt9939 = i_14_
        this.aBoolean9941 = false
        this.method1965(false, false, 10243)
    }

    internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_17_: Int, i_18_: Int, i_19_: Int, i_20_: Int, `is`: ByteArray?, i_21_: Int) : super(var_ha_Sub2, 3553, i, i_19_, i_20_) {
        try {
            this.anInt9940 = i_17_
            this.anInt9939 = i_18_
            this.method1970(0, 0, i_17_, true, 0, i_18_, i_21_, 127, `is`, 0)
            this.aFloat9938 = i_18_.toFloat() / i_20_.toFloat()
            this.aFloat9937 = i_17_.toFloat() / i_19_.toFloat()
            this.aBoolean9941 = false
            this.method1965(false, false, 10243)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("eba.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_21_ + ')'))
        }
    }

    internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_22_: Int, i_23_: Int, bool: Boolean, `is`: IntArray?, i_24_: Int, i_25_: Int) : super(var_ha_Sub2, i, 6408, i_22_, i_23_, bool, `is`, i_24_, i_25_, true) {
        try {
            if (this.anInt4849 == 34037) {
                this.aFloat9937 = i_22_.toFloat()
                this.aBoolean9941 = false
                this.aFloat9938 = i_23_.toFloat()
            } else {
                this.aBoolean9941 = true
                this.aFloat9938 = 1.0f
                this.aFloat9937 = this.aFloat9938
            }
            this.anInt9939 = i_23_
            this.anInt9940 = i_22_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("eba.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_22_ + ',' + i_23_ + ',' + bool + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_24_ + ',' + i_25_ + ')'))
        }
    }

    internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_26_: Int, i_27_: Int, i_28_: Int, `is`: IntArray?) : super(var_ha_Sub2, 3553, 6408, i_27_, i_28_) {
        try {
            this.anInt9940 = i
            this.anInt9939 = i_26_
            this.method1964(true, i_26_, 0, `is`, 0, (-73).toByte(), i, 0, 0)
            this.aFloat9937 = i.toFloat() / i_27_.toFloat()
            this.aFloat9938 = i_26_.toFloat() / i_28_.toFloat()
            this.aBoolean9941 = false
            this.method1965(false, false, 10243)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("eba.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_29_: Int, i_30_: Int, i_31_: Int, bool: Boolean, `is`: ByteArray?, i_32_: Int) : super(var_ha_Sub2, i, i_29_, i_30_, i_31_, bool, `is`, i_32_, true) {
        try {
            this.anInt9940 = i_30_
            if (this.anInt4849 == 34037) {
                this.aFloat9938 = i_31_.toFloat()
                this.aBoolean9941 = false
                this.aFloat9937 = i_30_.toFloat()
            } else {
                this.aBoolean9941 = true
                this.aFloat9938 = 1.0f
                this.aFloat9937 = this.aFloat9938
            }
            this.anInt9939 = i_31_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("eba.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + bool + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_32_ + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt9942: Int = 0

        @JvmStatic
        fun method1971(i: Int, string: String?, bool: Boolean, i_11_: Int) {
            anInt9942++
            Class59_Sub1_Sub1.method556(false)
            Class341.method2681(9864)
            Class348_Sub22.method2959(-1)
            Class348_Sub23.method2965(string, i_11_, bool, 0)
            Class348_Sub24.method2994(2)
            Class170.method1311(5139, Class348_Sub8.aHa6654!!)
            method3568(Class348_Sub8.aHa6654, 4)
            Class255.method1933(Class21.aClass45_322, Class348_Sub8.aHa6654, true)
            Class274.method2061(-128)
            method901(Class113.aClass105Array1744, 515880227)
            Class354.method3466(i xor 0x4f.inv())
            Class348_Sub40.method3038(-1)
            if (Class240.anInt4674 == 3) Class348_Sub49.method3379(2, 4)
            else if (Class240.anInt4674 == 7) Class348_Sub49.method3379(2, 8)
            else if (Class240.anInt4674 != 10) {
                if (Class240.anInt4674 == 1 || Class240.anInt4674 == 2) method3616(12639)
            } else Class348_Sub49.method3379(2, 11)
        }
    }
}
