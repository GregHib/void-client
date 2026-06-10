import java.awt.Color
import java.awt.Font

class Class199 internal constructor(private val aBoolean2629: Boolean, private val anInt2635: Int, private var anInt2626: Int, private val aBoolean2625: Boolean) {
    fun method1456(i: Byte): Boolean {
        if (i < 49) return true
        anInt2634++
        return aBoolean2625
    }

    fun method1458(i: Int): Int {
        if (i != -23688) return -22
        anInt2628++
        return anInt2635
    }

    fun method1460(i: Int): Boolean {
        anInt2630++
        if (i >= -27) anInt2626 = 107
        return aBoolean2629
    }

    fun method1462(i: Int): Int {
        val i_10_ = 23 % ((-4 - i) / 55)
        anInt2624++
        return anInt2626
    }

    companion object {
        var anInt2624: Int = 0
        var anInt2627: Int = 0
        var anInt2628: Int = 0
        var anInt2630: Int = 0
        var anIntArray2631: IntArray? = IntArray(4096)
        @JvmField
        var anIntArray2632: IntArray?
        @JvmField
        var anIntArray2633: IntArray?
        var anInt2634: Int = 0
        @JvmField
        var aClass352Array2636: Array<Class352?>?
        var anInt2637: Int = 0

        @JvmStatic
        fun method1455(i: Int, color: Color?, string: String?, color_0_: Color?, i_1_: Byte, color_2_: Color?) {
            var color = color
            var color_0_ = color_0_
            var color_2_ = color_2_
            try {
                anInt2627++
                try {
                    val graphics = Class305.aCanvas3869!!.getGraphics()
                    if (Class351.aFont4329 == null) Class351.aFont4329 = Font("Helvetica", 1, 13)
                    if (color == null) color = Color(140, 17, 17)
                    if (color_0_ == null) color_0_ = Color(140, 17, 17)
                    if (color_2_ == null) color_2_ = Color(255, 255, 255)
                    try {
                        if (Class342.anImage4249 == null) Class342.anImage4249 = (Class305.aCanvas3869!!.createImage(Class321.anInt4017, Class348_Sub42_Sub8_Sub2.anInt10432))
                        val graphics_3_ = Class342.anImage4249!!.getGraphics()
                        graphics_3_.setColor(Color.black)
                        graphics_3_.fillRect(0, 0, Class321.anInt4017, Class348_Sub42_Sub8_Sub2.anInt10432)
                        val i_4_ = -152 + Class321.anInt4017 / 2
                        val i_5_ = -18 + Class348_Sub42_Sub8_Sub2.anInt10432 / 2
                        graphics_3_.setColor(color_0_)
                        graphics_3_.drawRect(i_4_, i_5_, 303, 33)
                        graphics_3_.setColor(color)
                        graphics_3_.fillRect(2 + i_4_, i_5_ - -2, i * 3, 30)
                        graphics_3_.setColor(Color.black)
                        graphics_3_.drawRect(i_4_ + 1, 1 + i_5_, 301, 31)
                        graphics_3_.fillRect(3 * i + (i_4_ - -2), 2 + i_5_, 300 - i * 3, 30)
                        graphics_3_.setFont(Class351.aFont4329)
                        graphics_3_.setColor(color_2_)
                        if (i_1_ > -42) anIntArray2631 = null
                        graphics_3_.drawString(string, (i_4_ + (304 - string!!.length * 6) / 2), i_5_ + 22)
                        if (Class348_Sub42_Sub16.aString9665 != null) {
                            graphics_3_.setFont(Class351.aFont4329)
                            graphics_3_.setColor(color_2_)
                            graphics_3_.drawString(Class348_Sub42_Sub16.aString9665, (Class321.anInt4017 / 2 - (Class348_Sub42_Sub16.aString9665!!.length * 6 / 2)), -26 + Class348_Sub42_Sub8_Sub2.anInt10432 / 2)
                        }
                        graphics.drawImage(Class342.anImage4249, 0, 0, null)
                    } catch (exception: Exception) {
                        graphics.setColor(Color.black)
                        graphics.fillRect(0, 0, Class321.anInt4017, Class348_Sub42_Sub8_Sub2.anInt10432)
                        val i_6_ = -152 + Class321.anInt4017 / 2
                        val i_7_ = Class348_Sub42_Sub8_Sub2.anInt10432 / 2 + -18
                        graphics.setColor(color_0_)
                        graphics.drawRect(i_6_, i_7_, 303, 33)
                        graphics.setColor(color)
                        graphics.fillRect(2 + i_6_, 2 + i_7_, i * 3, 30)
                        graphics.setColor(Color.black)
                        graphics.drawRect(1 + i_6_, 1 + i_7_, 301, 31)
                        graphics.fillRect(3 * i + 2 + i_6_, 2 + i_7_, -(i * 3) + 300, 30)
                        graphics.setFont(Class351.aFont4329)
                        graphics.setColor(color_2_)
                        if (Class348_Sub42_Sub16.aString9665 != null) {
                            graphics.setFont(Class351.aFont4329)
                            graphics.setColor(color_2_)
                            graphics.drawString(Class348_Sub42_Sub16.aString9665, (Class321.anInt4017 / 2 + -(6 * Class348_Sub42_Sub16.aString9665!!.length / 2)), Class348_Sub42_Sub8_Sub2.anInt10432 / 2 - 26)
                        }
                        graphics.drawString(string, i_6_ - -((304 + -(string!!.length * 6)) / 2), 22 + i_7_)
                    }
                } catch (exception: Exception) {
                    Class305.aCanvas3869!!.repaint()
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("rc.A(" + i + ',' + (if (color != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ',' + (if (color_0_ != null) "{...}" else "null") + ',' + i_1_ + ',' + (if (color_2_ != null) "{...}" else "null") + ')'))
            }
        }

        @JvmStatic
        fun method1457(i: Int, i_8_: Int): Int {
            if (Class348_Sub1_Sub2.aByteArrayArray8816 != null) return Class348_Sub1_Sub2.aByteArrayArray8816!![i]!![i_8_].toInt() and 0xff
            return 0
        }

        fun method1459(i: Int, i_9_: Int) {
            anInt2637++
            val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i, 105.toByte(), 10)
            class348_sub42_sub15.method3251(-16058)
            if (i_9_ != 2) aClass352Array2636 = null
        }

        @JvmStatic
        fun method1461(i: Byte) {
            anIntArray2633 = null
            if (i <= 77) anIntArray2633 = null
            anIntArray2631 = null
            aClass352Array2636 = null
            anIntArray2632 = null
        }

        init {
            for (i in 0..4095) anIntArray2631!![i] = Class252.method1918(-3358, i)
            anIntArray2632 = IntArray(32)
            anIntArray2633 = IntArray(32)
            aClass352Array2636 = null
        }
    }
}
