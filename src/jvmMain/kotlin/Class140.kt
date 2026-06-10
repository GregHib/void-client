import Class367_Sub9.Companion.method3551
import java.awt.Color
import java.awt.Container
import java.awt.Rectangle

object Class140 {
    var anInt1956: Int = 0
    var anInt1957: Int = 0
    var anInt1958: Int = 0
    var aClass114_1959: Class114? = Class114(81, 6)
    var anInt1960: Int = 0
    @JvmField
    var aClass351_1961: Class351? = Class351(77, -1)
    @JvmField
    var anInt1962: Int = 0

    @Throws(Exception_Sub1::class)
    @JvmStatic
    fun method1168(i: Int, i_0_: Int, rectangles: Array<Rectangle?>?) {
        anInt1957++
        if (Class348_Sub49.anInt7207 != 1) Class21.aHa326!!.method3707(rectangles, i, 0, 0)
        else Class21.aHa326!!.method3707(rectangles, i, Class339.anInt4211, Class348_Sub40_Sub8.anInt9157)
        if (i_0_ != 0) aClass351_1961 = null
    }

    @JvmStatic
    fun method1169(bool: Boolean) {
        aClass351_1961 = null
        aClass114_1959 = null
        if (bool != false) aClass351_1961 = null
    }

    @JvmStatic
    fun method1170(i: Byte) {
        anInt1956++
        if (Class34.aFrame476 == null) {
            val i_1_ = Class348_Sub48.anInt7129
            val i_2_ = Class335.anInt4167
            if (i > -25) Class140.method1172((-22).toByte(), -1)
            val i_3_ = -i_1_ + -Class321.anInt4017 + Class272.anInt3473
            val i_4_ = -i_2_ + (Class348_Sub22.anInt6857 + -Class348_Sub42_Sub8_Sub2.anInt10432)
            do {
                if (i_1_ > 0 || i_3_ > 0 || i_2_ > 0 || i_4_ > 0) {
                    try {
                        val container: Container?
                        if (Class52.aFrame4904 == null) {
                            if (Class93.anApplet1530 == null) container = Class348_Sub40_Sub9.anApplet_Sub1_9169
                            else container = Class93.anApplet1530 as? Container
                        } else container = Class52.aFrame4904
                        var i_5_ = 0
                        var i_6_ = 0
                        if (container === Class52.aFrame4904) {
                            val insets = Class52.aFrame4904!!.getInsets()
                            i_5_ = insets.left
                            i_6_ = insets.top
                        }
                        val graphics = container!!.getGraphics()
                        graphics.setColor(Color.black)
                        if (i_1_ > 0) graphics.fillRect(i_5_, i_6_, i_1_, Class348_Sub22.anInt6857)
                        if (i_2_ > 0) graphics.fillRect(i_5_, i_6_, Class272.anInt3473, i_2_)
                        if (i_3_ > 0) graphics.fillRect((-i_3_ + Class272.anInt3473 + i_5_), i_6_, i_3_, Class348_Sub22.anInt6857)
                        if (i_4_ <= 0) break
                        graphics.fillRect(i_5_, Class348_Sub22.anInt6857 + (i_6_ - i_4_), Class272.anInt3473, i_4_)
                    } catch (exception: Exception) {
                        break
                    }
                    break
                }
            } while (false)
        }
    }

    fun method1171(i: Int, i_7_: Int, bool: Boolean): String? {
        if (i_7_ < 43) return null
        anInt1958++
        if (!bool || i < 0) return i.toString()
        return method3551(8320, 10, i, bool)
    }

    @JvmStatic
    fun method1172(i: Byte, i_8_: Int): Boolean {
        anInt1960++
        val i_9_ = 35 / ((-45 - i) / 38)
        return (i_8_ >= 0 && i_8_ <= 3) || i_8_ == 9
    }
}
