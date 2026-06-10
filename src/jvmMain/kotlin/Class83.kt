import Class50_Sub1.Companion.method461

/* Class83 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class83 internal constructor(var_ha_Sub2: ha_Sub2) {
    var aClass258_Sub1_1440: Class258_Sub1? = null
    var aBoolean1442: Boolean
    var aClass258_Sub1_1443: Class258_Sub1? = null
    var aClass258_Sub3Array1444: Array<Class258_Sub3?>? = null
    var aClass258_Sub1_1446: Class258_Sub1? = null
    var aClass258_Sub3Array1448: Array<Class258_Sub3?>? = null

    init {
        this.aBoolean1442 = var_ha_Sub2.aBoolean7831
        Class348_Sub37.method3030(8, var_ha_Sub2)
        if (this.aBoolean1442) {
            var `is` = method461(false, Class337.anObject4177, 53146732)
            this.aClass258_Sub1_1440 = Class258_Sub1(var_ha_Sub2, 6410, 128, 128, 16, `is`, 6410)
            `is` = method461(false, Class319.anObject3985, 53146732)
            this.aClass258_Sub1_1446 = Class258_Sub1(var_ha_Sub2, 6410, 128, 128, 16, `is`, 6410)
            val class188 = var_ha_Sub2.aClass188_7736
            if (class188!!.method1414(35632)) {
                `is` = method461(false, Class369_Sub2.anObject8592, 53146732)
                this.aClass258_Sub1_1443 = Class258_Sub1(var_ha_Sub2, 6408, 128, 128, 16)
                val class258_sub1 = Class258_Sub1(var_ha_Sub2, 6409, 128, 128, 16, `is`, 6409)
                if (!class188.method1413(this.aClass258_Sub1_1443, class258_sub1, -114, 2.0f)) {
                    this.aClass258_Sub1_1443!!.method1952(-19948)
                    this.aClass258_Sub1_1443 = null
                } else this.aClass258_Sub1_1443!!.method1950(-82)
                class258_sub1.method1952(-19948)
            }
        } else {
            this.aClass258_Sub3Array1444 = arrayOfNulls<Class258_Sub3>(16)
            for (i in 0..15) {
                val `is` = Class173.method1331(97.toByte(), Class337.anObject4177, 2 * (128 * i) * 128, 32768)
                this.aClass258_Sub3Array1444!![i] = Class258_Sub3(var_ha_Sub2, 3553, 6410, 128, 128, true, `is`, 6410, false)
            }
            this.aClass258_Sub3Array1448 = arrayOfNulls<Class258_Sub3>(16)
            for (i in 0..15) {
                val `is` = Class173.method1331(110.toByte(), Class319.anObject3985, 2 * i * 16384, 32768)
                this.aClass258_Sub3Array1448!![i] = Class258_Sub3(var_ha_Sub2, 3553, 6410, 128, 128, true, `is`, 6410, false)
            }
        }
    }

    companion object {
        @JvmField
        var aStringArray1441: Array<String?>? = arrayOfNulls<String>(200)
        @JvmField
        var anInt1445: Int = 0
        @JvmField
        var anInt1447: Int = 0
        @JvmStatic
        fun method815(bool: Boolean) {
            if (bool != false) method815(true)
            aStringArray1441 = null
        }
    }
}
