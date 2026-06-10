import Class191.Companion.method1428
import aa_Sub2.Companion.method163
import java.awt.Color
import java.awt.Font
import java.awt.FontMetrics
import java.awt.Image

class Class294 : Interface16 {
    private var aBoolean5020 = false
    private var anInt5021 = 0
    private var aBoolean5022 = false
    private var anInt5023 = 0
    private var aFontMetrics5024: FontMetrics? = null
    private var anImage5026: Image? = null
    private var anInt5029 = 0
    private var anImage5030: Image? = null
    private var anImage5032: Image? = null
    private var aColor5034: Color? = null
    private var anImage5035: Image? = null
    private var anInt5036 = 0
    private var anImage5037: Image? = null
    private var anInt5040 = 0
    private var anImage5041: Image? = null
    private var anInt5042 = 0
    private var aBoolean5045 = false
    private var anInt5046 = 0
    private var anImage5047: Image? = null
    private var anInt5050 = 0
    private var anInt5051 = 0
    private var aFont5053: Font? = null
    private var anImage5054: Image? = null
    private var anImage5056: Image? = null
    private var anImage5059: Image? = null

    @Throws(IllegalAccessException::class, NoSuchFieldException::class)
    private fun method2211(bool: Boolean) {
        anInt5055++
        val var_class: Class<*> = Class93.anApplet1530!!.javaClass
        anImage5047 = method2213(var_class, 2, "bar") as Image?
        anImage5035 = method2213(var_class, 2, "background") as Image?
        anImage5032 = method2213(var_class, 2, "left") as Image?
        anImage5037 = method2213(var_class, 2, "right") as Image?
        anImage5054 = method2213(var_class, 2, "top") as Image?
        anImage5041 = method2213(var_class, 2, "bottom") as Image?
        anImage5030 = method2213(var_class, 2, "bodyLeft") as Image?
        anImage5026 = method2213(var_class, 2, "bodyRight") as Image?
        anImage5056 = method2213(var_class, 2, "bodyFill") as Image?
        aFont5053 = method2213(var_class, 2, "bf") as Font?
        aFontMetrics5024 = method2213(var_class, 2, "bfm") as FontMetrics?
        aColor5034 = method2213(var_class, 2, "colourtext") as Color?
        val `object` = method2213(var_class, 2, "lb")
        val var_class_0_: Class<*> = `object`!!.javaClass
        aBoolean5020 = method2216(`object`, bool, var_class_0_, "xMiddle")
        aBoolean5045 = method2216(`object`, bool, var_class_0_, "yMiddle")
        anInt5021 = method2212(`object`, var_class_0_, "xOffset", 95)
        anInt5051 = method2212(`object`, var_class_0_, "yOffset", -124)
        anInt5023 = method2212(`object`, var_class_0_, "width", 104)
        anInt5036 = method2212(`object`, var_class_0_, "height", -45)
        anInt5029 = method2212(`object`, var_class_0_, "boxXOffset", -91)
        anInt5040 = method2212(`object`, var_class_0_, "boxYOffset", -74)
        anInt5050 = method2212(`object`, var_class_0_, "boxWidth", 120)
        anInt5046 = method2212(`object`, var_class_0_, "textYOffset", -47)
        anInt5042 = method2212(`object`, var_class_0_, "offsetPerTenCycles", 107)
    }

    @Throws(IllegalAccessException::class, NoSuchFieldException::class)
    private fun method2212(`object`: Any?, var_class: Class<*>?, string: String?, i: Int): Int {
        try {
            val i_1_ = -38 / ((i - 24) / 60)
            anInt5039++
            val field = var_class!!.getDeclaredField(string)
            return field.getInt(`object`)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("wba.K(" + (if (`object` != null) "{...}" else "null") + ',' + (if (var_class != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    @Throws(IllegalAccessException::class, NoSuchFieldException::class)
    private fun method2213(var_class: Class<*>?, i: Int, string: String?): Any? {
        try {
            if (i != 2) return null
            anInt5038++
            val field = var_class!!.getDeclaredField(string)
            val `object` = field.get(Class93.anApplet1530)
            field.set(Class93.anApplet1530, null)
            return `object`
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("wba.C(" + (if (var_class != null) "{...}" else "null") + ',' + i + ',' + (if (string != null) "{...}" else "null") + ')'))
        }
    }

    override fun method55(i: Byte): Int {
        if (i.toInt() != -58) return -26
        anInt5052++
        return 0
    }

    override fun method56(i: Byte, l: Long): Boolean {
        try {
            if (i < 30) method2215(25.toByte(), -63)
            anInt5061++
            return true
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "wba.I(" + i + ',' + l + ')')
        }
    }

    override fun method60(i: Int): Int {
        if (i != -19079) anInt5023 = -66
        anInt5049++
        return 100
    }

    private fun method2215(i: Byte, i_2_: Int): Int {
        anInt5033++
        if (i < 23) anImage5030 = null
        if (aBoolean5020) return (-i_2_ + Class321.anInt4017) / 2
        return 0
    }

    override fun method57(i: Int) {
        anInt5043++
        if (i <= 84) anInt5023 = -93
    }

    override fun method59(i: Int) {
        method1428(true)
        anInt5025++
        if (i != -9719) aBoolean5022 = false
    }

    @Throws(IllegalAccessException::class, NoSuchFieldException::class)
    private fun method2216(`object`: Any?, bool: Boolean, var_class: Class<*>?, string: String?): Boolean {
        try {
            if (bool != true) method2217(4, -90, 15)
            anInt5048++
            val field = var_class!!.getDeclaredField(string)
            return field.getBoolean(`object`)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("wba.H(" + (if (`object` != null) "{...}" else "null") + ',' + bool + ',' + (if (var_class != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ')'))
        }
    }

    override fun method58(bool: Boolean, i: Int) {
        anInt5044++
        if (i > -69) method2215((-61).toByte(), -24)
        if (!aBoolean5022) {
            if (Class93.anApplet1530 == null) aBoolean5022 = true
            else if (aFont5053 == null) {
                try {
                    method2211(true)
                } catch (exception: Exception) {
                    aBoolean5022 = true
                }
            }
        }
        if (aBoolean5022) method2219(33)
        else {
            val graphics = Class305.aCanvas3869!!.getGraphics()
            if (graphics != null) {
                try {
                    val i_5_ = Class51.aClass311_897!!.method2320(103.toByte())
                    val string = Class51.aClass311_897!!.method2318(-9324)
                    if (Class342.anImage4249 == null) Class342.anImage4249 = (Class305.aCanvas3869!!.createImage(Class321.anInt4017, Class348_Sub42_Sub8_Sub2.anInt10432))
                    val graphics_6_ = Class342.anImage4249!!.getGraphics()
                    graphics_6_.clearRect(0, 0, Class321.anInt4017, Class348_Sub42_Sub8_Sub2.anInt10432)
                    val i_7_ = anImage5030!!.getWidth(null)
                    val i_8_ = anImage5026!!.getWidth(null)
                    val i_9_ = anImage5056!!.getWidth(null)
                    val i_10_ = anImage5030!!.getHeight(null)
                    val i_11_ = anImage5026!!.getHeight(null)
                    val i_12_ = anImage5056!!.getHeight(null)
                    graphics_6_.drawImage(anImage5030, (method2215(84.toByte(), i_7_) - (-anInt5029 + anInt5050 / 2)), method2218(i_10_, -6277) + anInt5040, null)
                    val i_13_ = i_7_ + -(anInt5050 / 2) + anInt5029
                    val i_14_ = anInt5029 + anInt5050 / 2
                    var i_15_ = i_13_
                    while (i_14_ >= i_15_) {
                        graphics_6_.drawImage(anImage5056, i_15_ + (method2215(77.toByte(), i_7_) - -anInt5029), (method2218(i_12_, -6277) + anInt5040), null)
                        i_15_ += i_9_
                    }
                    graphics_6_.drawImage(anImage5026, (method2215(25.toByte(), i_8_) - (-anInt5029 - anInt5050 / 2)), (method2218(i_11_, -6277) - -anInt5040), null)
                    val i_16_ = anImage5032!!.getWidth(null)
                    val i_17_ = anImage5032!!.getHeight(null)
                    val i_18_ = anImage5037!!.getWidth(null)
                    val i_19_ = anImage5037!!.getHeight(null)
                    val i_20_ = anImage5041!!.getHeight(null)
                    val i_21_ = anImage5054!!.getWidth(null)
                    val i_22_ = anImage5054!!.getHeight(null)
                    val i_23_ = anImage5041!!.getWidth(null)
                    val i_24_ = anImage5047!!.getWidth(null)
                    val i_25_ = anImage5035!!.getWidth(null)
                    val i_26_ = method2215(122.toByte(), anInt5023) + anInt5021
                    val i_27_ = method2218(anInt5036, -6277) - -anInt5051
                    graphics_6_.drawImage(anImage5032, i_26_, i_27_ - -((anInt5036 + -i_17_) / 2), null)
                    graphics_6_.drawImage(anImage5037, anInt5023 + i_26_ - i_18_, (anInt5036 - i_19_) / 2 + i_27_, null)
                    if (anImage5059 == null) anImage5059 = (Class305.aCanvas3869!!.createImage(-i_18_ + (-i_16_ + anInt5023), anInt5036))
                    val graphics_28_ = anImage5059!!.getGraphics()
                    var i_29_ = 0
                    while ((-i_18_ + (anInt5023 + -i_16_) > i_29_)) {
                        graphics_28_.drawImage(anImage5054, i_29_, 0, null)
                        i_29_ += i_21_
                    }
                    var i_30_ = 0
                    while ((i_30_ < anInt5023 - (i_16_ + i_18_))) {
                        graphics_28_.drawImage(anImage5041, i_30_, -i_20_ + anInt5036, null)
                        i_30_ += i_23_
                    }
                    var i_31_ = i_5_ * (-i_18_ + (-i_16_ + anInt5023)) / 100
                    if (i_31_ > 0) {
                        val image = Class305.aCanvas3869!!.createImage(i_31_, (-i_22_ + (anInt5036 + -i_20_)))
                        val i_32_ = image.getWidth(null)
                        val graphics_33_ = image.getGraphics()
                        val i_34_ = anInt5042 * method163(512) / 10 % i_24_
                        var i_35_ = -i_24_ + i_34_
                        while (i_35_ < i_32_) {
                            graphics_33_.drawImage(anImage5047, i_35_, 0, null)
                            i_35_ += i_24_
                        }
                        graphics_28_.drawImage(image, 0, i_22_, null)
                    }
                    val i_36_ = i_31_
                    i_31_ = -i_31_ + -i_18_ + anInt5023 + -i_16_
                    if (i_31_ > 0) {
                        val image = Class305.aCanvas3869!!.createImage(i_31_, (-i_22_ + (anInt5036 + -i_20_)))
                        val i_37_ = image.getWidth(null)
                        val graphics_38_ = image.getGraphics()
                        var i_39_ = 0
                        while (i_39_ < i_37_) {
                            graphics_38_.drawImage(anImage5035, i_39_, 0, null)
                            i_39_ += i_25_
                        }
                        graphics_28_.drawImage(image, i_36_, i_22_, null)
                    }
                    graphics_6_.drawImage(anImage5059, i_16_ + i_26_, i_27_, null)
                    graphics_6_.setFont(aFont5053)
                    graphics_6_.setColor(aColor5034)
                    graphics_6_.drawString(string, i_26_ + (anInt5023 + -aFontMetrics5024!!.stringWidth(string)) / 2, anInt5046 + (4 + anInt5036 / 2 + i_27_))
                    graphics.drawImage(Class342.anImage4249, 0, 0, null)
                } catch (exception: Exception) {
                    aBoolean5022 = true
                }
            } else Class305.aCanvas3869!!.repaint()
        }
    }

    private fun method2218(i: Int, i_40_: Int): Int {
        anInt5028++
        if (aBoolean5045) return (-i + Class348_Sub42_Sub8_Sub2.anInt10432) / 2
        if (i_40_ != -6277) anImage5026 = null
        return 0
    }

    private fun method2219(i: Int) {
        anInt5031++
        Class199.method1455(Class51.aClass311_897!!.method2320(78.toByte()), Class135.aColorArray1928!![Class222.anInt2884], Class51.aClass311_897!!.method2318(-9324), (Class348_Sub40_Sub8.aColorArray9163!![Class222.anInt2884]), (-100).toByte(), Class50_Sub3.aColorArray5242!![Class222.anInt2884])
        if (i != 33) method55(1.toByte())
    }

    companion object {
        var anInt5025: Int = 0
        var anInt5027: Int = 0
        var anInt5028: Int = 0
        var anInt5031: Int = 0
        var anInt5033: Int = 0
        var anInt5038: Int = 0
        var anInt5039: Int = 0
        var anInt5043: Int = 0
        var anInt5044: Int = 0
        var anInt5048: Int = 0
        var anInt5049: Int = 0
        var anInt5052: Int = 0
        var anInt5055: Int = 0
        var aClass351_5057: Class351? = Class351(10, -1)
        @JvmField
        var aPlayerArray5058: Array<Player?>? = arrayOfNulls<Player>(2048)
        @JvmField
        var aClass338Array5060: Array<Class338?>? = null
        var anInt5061: Int = 0

        @JvmStatic
        fun method2214(i: Int) {
            aClass351_5057 = null
            if (i != 0) aPlayerArray5058 = null
            aClass338Array5060 = null
            aPlayerArray5058 = null
        }

        fun method2217(i: Int, i_3_: Int, i_4_: Int): Boolean {
            anInt5027++
            if (i_4_ != 0) aClass338Array5060 = null
            return (i_3_ and 0x21) != 0
        }
    }
}
