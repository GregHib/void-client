import Class318_Sub1.Companion.method2383
import jaggl.OpenGL.Companion.glBegin
import jaggl.OpenGL.Companion.glBlitFramebufferEXT
import jaggl.OpenGL.Companion.glEnd
import jaggl.OpenGL.Companion.glMultiTexCoord2f
import jaggl.OpenGL.Companion.glTexCoord2f
import jaggl.OpenGL.Companion.glVertex2i
import kotlin.math.min

class Class18 internal constructor(var_ha_Sub2: ha_Sub2) {
    private var anInt275 = 1
    private var anInt276 = 0
    private var aClass206_281: Class206? = null
    private var aClass206_284: Class206? = null
    private var aClass206_285: Class206? = null
    private var anInt286 = 1
    private var anInt287 = 0
    private var aBoolean289 = false
    private val aHa_Sub2_290: ha_Sub2
    private val aClass262_292: Class262
    private var aBoolean293: Boolean
    private var aBoolean294: Boolean
    private var aClass258_Sub3Array295: Array<Class258_Sub3?>?
    private var aClass348_Sub42_Sub2_296: Class348_Sub42_Sub2? = null
    private var aBoolean297: Boolean
    private var aClass348_Sub42_Sub2_298: Class348_Sub42_Sub2? = null
    private var aBoolean299: Boolean
    private var aClass258_Sub3_300: Class258_Sub3? = null
    private var anInt301: Int
    private var anInt302: Int
    private var aBoolean303: Boolean

    fun method272(i: Int) {
        anInt277++
        if (aBoolean289) {
            if (aClass206_285 != null) {
                aHa_Sub2_290.method3764(-17083, aClass206_285)
                var i_2_ = 16384
                aHa_Sub2_290.method3751(aClass206_281, -115)
                aClass206_285!!.method1505(0, 0)
                aClass206_281!!.method1503(0, 3.toByte())
                if (aBoolean303) i_2_ = i_2_ or 0x100
                glBlitFramebufferEXT(0, 0, anInt286, anInt275, 0, 0, anInt286, anInt275, i_2_, 9728)
                aHa_Sub2_290.method3805(8387, aClass206_285)
                aHa_Sub2_290.method3782(aClass206_281, 327685)
            }
            aHa_Sub2_290.method3792(92)
            aHa_Sub2_290.method3753(0, 1)
            aHa_Sub2_290.method3761(0, 1)
            val i_3_ = 19 % ((i - 12) / 49)
            aHa_Sub2_290.la()
            var i_4_ = 0
            var i_5_ = 1
            var class348_sub5: Class348_Sub5?
            var class348_sub5_6_ = aClass262_292.method1995(4) as Class348_Sub5?
            while (class348_sub5_6_ != null) {
                class348_sub5 = aClass262_292.method1990(113.toByte()) as Class348_Sub5?
                val i_7_ = class348_sub5_6_.method2764(1)
                for (i_8_ in 0..<i_7_) {
                    class348_sub5_6_.method2750(aClass258_Sub3_300, aClass258_Sub3Array295!![i_4_], i_8_, 103.toByte())
                    if (class348_sub5 == null && i_8_ == i_7_ - 1) {
                        aHa_Sub2_290.method3770(-422613672, aClass206_281)
                        aHa_Sub2_290.method3790(103, 0, 0)
                        glBegin(7)
                        glTexCoord2f(0.0f, anInt275.toFloat())
                        glMultiTexCoord2f(33985, 0.0f, 1.0f)
                        glVertex2i(anInt287, anInt276)
                        glTexCoord2f(0.0f, 0.0f)
                        glMultiTexCoord2f(33985, 0.0f, 0.0f)
                        glVertex2i(anInt287, anInt276 - -anInt275)
                        glTexCoord2f(anInt286.toFloat(), 0.0f)
                        glMultiTexCoord2f(33985, 1.0f, 0.0f)
                        glVertex2i(anInt287 - -anInt286, anInt276 + anInt275)
                        glTexCoord2f(anInt286.toFloat(), anInt275.toFloat())
                        glMultiTexCoord2f(33985, 1.0f, 1.0f)
                        glVertex2i(anInt286 + anInt287, anInt276)
                        glEnd()
                    } else {
                        aClass206_281!!.method1503(i_5_, 3.toByte())
                        glBegin(7)
                        glTexCoord2f(0.0f, anInt275.toFloat())
                        glMultiTexCoord2f(33985, 0.0f, 1.0f)
                        glVertex2i(0, 0)
                        glTexCoord2f(0.0f, 0.0f)
                        glMultiTexCoord2f(33985, 0.0f, 0.0f)
                        glVertex2i(0, anInt275)
                        glTexCoord2f(anInt286.toFloat(), 0.0f)
                        glMultiTexCoord2f(33985, 1.0f, 0.0f)
                        glVertex2i(anInt286, anInt275)
                        glTexCoord2f(anInt286.toFloat(), anInt275.toFloat())
                        glMultiTexCoord2f(33985, 1.0f, 1.0f)
                        glVertex2i(anInt286, 0)
                        glEnd()
                    }
                    class348_sub5_6_.method2756((-80).toByte(), i_8_)
                    i_4_ = i_4_ + 1 and 0x1
                    i_5_ = i_5_ - -1 and 0x1
                }
                class348_sub5_6_ = class348_sub5
            }
            aBoolean289 = false
        }
    }

    fun method274(class348_sub5: Class348_Sub5, bool: Boolean): Boolean {
        anInt273++
        if (aClass206_284 != null) {
            if (class348_sub5.method2751(bool) || class348_sub5.method2758(85)) {
                aClass262_292.method1999(class348_sub5, -20180)
                method281((-94).toByte())
                if (method276(false)) {
                    if (anInt286 != -1 && anInt275 != -1) class348_sub5.method2754(anInt275, 55.toByte(), anInt286)
                    class348_sub5.aBoolean6621 = true
                    return true
                }
            }
            method278(class348_sub5, true)
        }
        if (bool != true) return false
        return false
    }

    fun method275(i: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int): Boolean {
        if (i_12_ != -1) return true
        anInt272++
        if (aClass206_284 == null || aClass262_292.method2002(18.toByte())) return false
        if (anInt286 != i || i_10_ != anInt275) {
            anInt286 = i
            anInt275 = i_10_
            var class348 = aClass262_292.method1995(i_12_ xor 0x4.inv())
            while (aClass262_292.aClass348_3334 !== class348) {
                (class348 as Class348_Sub5).method2754(anInt275, 41.toByte(), anInt286)
                class348 = class348.aClass348_4294
            }
            aBoolean297 = true
            aBoolean293 = true
            aBoolean294 = true
        }
        if (method276(false)) {
            aBoolean289 = true
            anInt276 = i_11_
            anInt287 = i_9_
            aHa_Sub2_290.method3773(i_12_, aClass206_284)
            aClass206_284!!.method1503(0, 3.toByte())
            aHa_Sub2_290.method3790(98, (-aHa_Sub2_290.anInt7641 + (anInt275 - -anInt276)), -anInt287)
            return true
        }
        return false
    }

    private fun method276(bool: Boolean): Boolean {
        if (aBoolean293) {
            if (aClass348_Sub42_Sub2_298 != null) {
                aClass348_Sub42_Sub2_298!!.method3172(4)
                aClass348_Sub42_Sub2_298 = null
            }
            if (aClass258_Sub3_300 != null) {
                aClass258_Sub3_300!!.method1952(-19948)
                aClass258_Sub3_300 = null
            }
            if (aClass206_285 != null) aClass348_Sub42_Sub2_298 = Class348_Sub42_Sub2(aHa_Sub2_290, 6402, anInt286, anInt275, (aHa_Sub2_290.anInt7713))
            if (aBoolean303) aClass258_Sub3_300 = Class258_Sub3(aHa_Sub2_290, 34037, 6402, anInt286, anInt275)
            else if (aClass348_Sub42_Sub2_298 == null) aClass348_Sub42_Sub2_298 = Class348_Sub42_Sub2(aHa_Sub2_290, 6402, anInt286, anInt275)
            aBoolean293 = false
            aBoolean294 = true
            aBoolean299 = true
        }
        anInt271++
        if (aBoolean297) {
            if (aClass348_Sub42_Sub2_296 != null) {
                aClass348_Sub42_Sub2_296!!.method3172(4)
                aClass348_Sub42_Sub2_296 = null
            }
            if (aClass258_Sub3Array295!![0] != null) {
                aClass258_Sub3Array295!![0]!!.method1952(-19948)
                aClass258_Sub3Array295!![0] = null
            }
            if (aClass258_Sub3Array295!![1] != null) {
                aClass258_Sub3Array295!![1]!!.method1952(-19948)
                aClass258_Sub3Array295!![1] = null
            }
            if (aClass206_285 != null) aClass348_Sub42_Sub2_296 = Class348_Sub42_Sub2(aHa_Sub2_290, anInt301, anInt286, anInt275, (aHa_Sub2_290.anInt7713))
            aClass258_Sub3Array295!![0] = Class258_Sub3(aHa_Sub2_290, 34037, anInt301, anInt286, anInt275)
            aClass258_Sub3Array295!![1] = if (anInt302 > 1) Class258_Sub3(aHa_Sub2_290, 34037, anInt301, anInt286, anInt275) else null
            aBoolean294 = true
            aBoolean299 = true
            aBoolean297 = false
        }
        if (bool != false) anInt282 = -21
        if (aBoolean294) {
            if (aClass206_285 == null) {
                aHa_Sub2_290.method3773(-1, aClass206_281)
                aClass206_281!!.method1500(2983, 0)
                aClass206_281!!.method1500(2983, 1)
                aClass206_281!!.method1500(2983, 8)
                aClass206_281!!.method1509(aClass258_Sub3Array295!![0]!!, 0, 0)
                if (anInt302 > 1) aClass206_281!!.method1509(aClass258_Sub3Array295!![1]!!, 0, 1)
                if (aBoolean303) aClass206_281!!.method1509(aClass258_Sub3_300!!, 0, 8)
                else aClass206_281!!.method1508(8, aClass348_Sub42_Sub2_298!!, 114)
                aHa_Sub2_290.method3770(-422613672, aClass206_281)
            } else {
                aHa_Sub2_290.method3773(-1, aClass206_281)
                aClass206_281!!.method1500(2983, 0)
                aClass206_281!!.method1500(2983, 1)
                aClass206_281!!.method1500(2983, 8)
                aClass206_281!!.method1509(aClass258_Sub3Array295!![0]!!, 0, 0)
                if (anInt302 > 1) aClass206_281!!.method1509(aClass258_Sub3Array295!![1]!!, 0, 1)
                if (aBoolean303) aClass206_281!!.method1509(aClass258_Sub3_300!!, 0, 8)
                aHa_Sub2_290.method3770(-422613672, aClass206_281)
                aHa_Sub2_290.method3773(-1, aClass206_285)
                aClass206_285!!.method1500(2983, 0)
                aClass206_285!!.method1500(2983, 8)
                aClass206_285!!.method1508(0, aClass348_Sub42_Sub2_296!!, -100)
                aClass206_285!!.method1508(8, aClass348_Sub42_Sub2_298!!, -47)
                aHa_Sub2_290.method3770(-422613672, aClass206_285)
            }
            aBoolean294 = false
            aBoolean299 = true
        }
        if (aBoolean299) {
            aHa_Sub2_290.method3773(-1, aClass206_284)
            aBoolean299 = !aClass206_284!!.method1507(118)
            aHa_Sub2_290.method3770(-422613672, aClass206_284)
        }
        return !aBoolean299
    }

    fun method278(class348_sub5: Class348_Sub5, bool: Boolean) {
        anInt280++
        if (bool == true) {
            class348_sub5.aBoolean6621 = false
            class348_sub5.method2763((-126).toByte())
            class348_sub5.method2715(103.toByte())
            method281((-80).toByte())
        }
    }

    fun method279(i: Byte) {
        val i_13_ = 84 % ((-63 - i) / 56)
        aClass348_Sub42_Sub2_296 = null
        anInt291++
        aClass206_281 = null
        aClass206_285 = aClass206_281
        aClass206_284 = aClass206_285
        aClass258_Sub3_300 = null
        aClass348_Sub42_Sub2_298 = null
        aClass258_Sub3Array295 = null
        if (!aClass262_292.method2002(18.toByte())) {
            var class348 = aClass262_292.method1995(4)
            while (aClass262_292.aClass348_3334 !== class348) {
                (class348 as Class348_Sub5).method2763((-124).toByte())
                class348 = class348.aClass348_4294
            }
        }
        anInt275 = 1
        anInt286 = anInt275
    }

    fun method280(i: Int): Boolean {
        anInt270++
        if (i != 1) anInt286 = -99
        return aClass206_284 != null
    }

    private fun method281(i: Byte) {
        anInt283++
        var bool = false
        var i_14_ = 0
        var i_15_ = 0
        var class348_sub5 = aClass262_292.method1995(4) as Class348_Sub5?
        val i_16_ = 50 / ((-34 - i) / 45)
        while ( /**/class348_sub5 != null) {
            val i_17_ = class348_sub5.method2761(true)
            i_15_ += class348_sub5.method2764(1)
            if (i_14_ < i_17_) i_14_ = i_17_
            bool = bool or class348_sub5.method2759(1)
            class348_sub5 = aClass262_292.method1990(67.toByte()) as Class348_Sub5?
        }
        val i_18_: Int
        if (i_14_ != 2) {
            if (i_14_ == 1) i_18_ = 34842
            else i_18_ = 6408
        } else i_18_ = 34836
        if (anInt301 != i_18_) {
            aBoolean297 = true
            anInt301 = i_18_
        }
        val i_19_ = min(anInt302, 2)
        val i_20_ = min(i_15_, 2)
        anInt302 = i_15_
        if (!bool == aBoolean303) {
            aBoolean303 = bool
            aBoolean293 = true
        }
        if (i_20_ != i_19_) {
            aBoolean297 = true
            aBoolean294 = aBoolean297
        }
    }

    init {
        aClass262_292 = Class262()
        aBoolean293 = true
        aClass258_Sub3Array295 = arrayOfNulls<Class258_Sub3>(2)
        aBoolean297 = true
        aBoolean294 = true
        aBoolean299 = true
        anInt302 = 0
        anInt301 = -1
        aBoolean303 = false
        aHa_Sub2_290 = var_ha_Sub2
        if (aHa_Sub2_290.aBoolean7820 && aHa_Sub2_290.aBoolean7837) {
            aClass206_281 = Class206(aHa_Sub2_290)
            aClass206_284 = aClass206_281
            if (aHa_Sub2_290.anInt7713 > 1 && aHa_Sub2_290.aBoolean7815 && aHa_Sub2_290.aBoolean7807) {
                aClass206_285 = Class206(aHa_Sub2_290)
                aClass206_284 = aClass206_285
            }
        }
    }

    companion object {
        @JvmField
        var anInt270: Int = 0
        @JvmField
        var anInt271: Int = 0
        @JvmField
        var anInt272: Int = 0
        @JvmField
        var anInt273: Int = 0
        @JvmField
        var anInt274: Int = 0
        @JvmField
        var anInt277: Int = 0
        @JvmField
        var anInt278: Int = 0
        @JvmField
        var anIntArray279: IntArray? = IntArray(2048)
        @JvmField
        var anInt280: Int = 0
        @JvmField
        var anInt282: Int = 0
        @JvmField
        var anInt283: Int = 0
        @JvmField
        var anInt288: Int = 0
        @JvmField
        var anInt291: Int = 0
        fun method271(i: Int, class46: Class46, i_0_: Byte, i_1_: Int) {
            anInt278++
            val var_aa = class46.method425(Class348_Sub8.aHa6654!!, 19.toByte())
            if (var_aa != null) {
                Class348_Sub8.aHa6654!!.KA(i_1_, i, class46.anInt709 + i_1_, i - -class46.anInt789)
                if (Class259.anInt3306 >= 3) Class348_Sub8.aHa6654!!.A(-16777216, var_aa, i_1_, i)
                else Class79.aClass105_1365!!.method976((class46.anInt709.toFloat() / 2.0f + i_1_.toFloat()), i.toFloat() + class46.anInt789.toFloat() / 2.0f, 4096, (0x3fff and -Class314.aFloat3938.toInt()) shl 2, var_aa, i_1_, i)
            }
        }

        @JvmStatic
        fun method273(class46: Class46, i: Int) {
            anInt288++
            if (class46.anInt774 == 5 && class46.anInt812 != -1) method2383(Class348_Sub8.aHa6654, -2, class46)
        }

        @JvmStatic
        fun method277(i: Byte) {
            if (i >= 77) anIntArray279 = null
        }

        @JvmStatic
        fun method282(i: Int, var_ha: ha?, i_21_: Int, i_22_: Byte, i_23_: Int, i_24_: Int, i_25_: Int, i_26_: Int) {
            anInt274++
            Class21.aHa326 = var_ha
            Class51.aClass101_905 = Class21.aHa326!!.method3654()
            Class44.aClass101_624 = Class21.aHa326!!.method3654()
            r.aClass101_9720 = Class21.aHa326!!.method3654()
            Class73.anInt4784 = i_26_
            Class239_Sub24.anInt6095 = 0
            if (i_22_ <= 64) anIntArray279 = null
            Class344.anInt4267 = i_23_
            Class286.anInt3682 = 0
            Class58.anInt1067 = i_24_
            Class17.Companion.anInterface4_252 = null
            Class348_Sub49.anInt7207 = 1
            Class239_Sub12.anInt5965 = i
            Class85.method828(38.toByte(), i_25_, i_21_)
        }
    }
}
