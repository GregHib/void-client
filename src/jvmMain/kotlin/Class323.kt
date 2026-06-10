import java.awt.Color
import java.awt.Component
import java.awt.Font
import java.awt.FontMetrics
import java.awt.image.PixelGrabber

class Class323 internal constructor(var_ha: ha, i: Int, bool: Boolean, component: Component) {
    private var aBoolean4037 = false
    private val anIntArray4039: IntArray
    private var anInt4040 = 0
    private var anInt4041 = 0
    private val aClass105Array4042: Array<Class105?>
    private val anIntArray4044 = IntArray(4)

    private fun method2559(var_ha: ha, font: Font?, fontmetrics: FontMetrics, c: Char, i: Int, bool: Boolean) {
        var bool = bool
        var i_0_ = fontmetrics.charWidth(c)
        val i_1_ = i_0_
        if (bool) {
            try {
                if (c == '/') bool = false
                if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k' || c == 'x' || c == 'y' || c == 'A' || c == 'V' || c == 'W') i_0_++
            } catch (exception: Exception) {
                /* empty */
            }
        }
        val i_2_ = fontmetrics.getMaxAscent()
        val i_3_ = fontmetrics.getMaxAscent() + fontmetrics.getMaxDescent()
        val i_4_ = fontmetrics.getHeight()
        val image = Class305.aCanvas3869!!.createImage(i_0_, i_3_)
        val graphics = image.getGraphics()
        graphics.setColor(Color.black)
        graphics.fillRect(0, 0, i_0_, i_3_)
        graphics.setColor(Color.white)
        graphics.setFont(font)
        graphics.drawString(c.toString(), 0, i_2_)
        if (bool) graphics.drawString(c.toString(), 1, i_2_)
        val `is` = IntArray(i_0_ * i_3_)
        val pixelgrabber = PixelGrabber(image, 0, 0, i_0_, i_3_, `is`, 0, i_0_)
        try {
            pixelgrabber.grabPixels()
        } catch (exception: Exception) {
            /* empty */
        }
        image.flush()
        val `object`: Any? = null
        var i_5_ = 0
        while_113_@ for (i_6_ in 0..<i_3_) {
            for (i_7_ in 0..<i_0_) {
                val i_8_ = `is`[i_7_ + i_6_ * i_0_]
                if ((i_8_ and 0xffffff) != 0) {
                    i_5_ = i_6_
                    break@while_113_
                }
            }
        }
        for (i_9_ in `is`.indices) {
            if ((`is`[i_9_] and 0xffffff) == 0) `is`[i_9_] = 0
        }
        anInt4041 = i_2_ - i_5_
        anInt4040 = i_4_
        anIntArray4039[i] = i_1_
        aClass105Array4042[i] = var_ha.method3662(i_0_, `is`, 94.toByte(), 0, i_0_, i_3_)
    }

    fun method2560(): Int {
        return anInt4041
    }

    private fun method2561(var_ha: ha?, string: String, `is`: IntArray?, i: Int, i_10_: Int, i_11_: Int, bool: Boolean) {
        var i = i
        var i_11_ = i_11_
        var bool = bool
        if (i_11_ == 0) bool = false
        i_11_ = i_11_ or 0xffffff.inv()
        for (i_12_ in 0..<string.length) {
            val i_13_: Int = anIntArray4043!![string.get(i_12_).code]
            if (bool) aClass105Array4042[i_13_]!!.method964(i + 1, i_10_ + 1, 0, -16777216, 1)
            aClass105Array4042[i_13_]!!.method964(i, i_10_, 0, i_11_, 1)
            i += anIntArray4039[i_13_]
        }
    }

    fun method2563(var_ha: ha, string: String, i: Int, i_14_: Int, i_15_: Int, bool: Boolean) {
        val i_16_ = method2564(string) / 2
        var_ha.K(anIntArray4044)
        if (i - i_16_ <= anIntArray4044[2] && i + i_16_ >= anIntArray4044[0] && i_14_ - anInt4041 <= anIntArray4044[3] && i_14_ + anInt4040 >= anIntArray4044[1]) method2561(var_ha, string, anIntArray4044, i - i_16_, i_14_, i_15_, bool)
    }

    fun method2564(string: String): Int {
        var i = 0
        for (i_17_ in 0..<string.length) {
            val i_18_: Int = anIntArray4043!![string.get(i_17_).code]
            i += anIntArray4039[i_18_]
        }
        return i
    }

    fun method2565(): Int {
        return anInt4040 - 1
    }

    init {
        aBoolean4037 = false
        aClass105Array4042 = arrayOfNulls<Class105>(256)
        anIntArray4039 = IntArray(256)
        var font = Font("Helvetica", if (bool) 1 else 0, i)
        var fontmetrics = component.getFontMetrics(font)
        for (i_19_ in 0..<anInt4038) method2559(
            var_ha,
            font,
            fontmetrics,
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".get(i_19_),
            i_19_,
            false
        )
        if (bool && aBoolean4037) {
            aBoolean4037 = false
            font = Font("Helvetica", 0, i)
            fontmetrics = component.getFontMetrics(font)
            for (i_20_ in 0..<anInt4038) method2559(
                var_ha,
                font,
                fontmetrics,
                "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".get(i_20_),
                i_20_,
                false
            )
            if (!aBoolean4037) {
                aBoolean4037 = false
                for (i_21_ in 0..<anInt4038) method2559(
                    var_ha,
                    font,
                    fontmetrics,
                    "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".get(i_21_),
                    i_21_,
                    true
                )
            }
        }
    }

    companion object {
        private val anInt4038 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".length
        private var anIntArray4043: IntArray? = IntArray(256)
        @JvmStatic
        fun method2562() {
            anIntArray4043 = null
        }

        init {
            for (i in 0..255) {
                var i_22_ =
                    "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".indexOf(i.toChar())
                if (i_22_ == -1) i_22_ = 74
                anIntArray4043!![i] = i_22_
            }
        }
    }
}
