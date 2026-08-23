import java.awt.Color
import java.awt.Font

object LoadingScreenStateStatics {
    var anInt2627: Int = 0

    var anIntArray2632: IntArray?

    var anIntArray2633: IntArray?

    var aRenderableEntryArray2636: Array<RenderableEntry?>?
    var anInt2637: Int = 0

    @JvmStatic
    fun method1455(i: Int, color: Color?, string: String?, color_0_: Color?, i_1_: Byte, color_2_: Color?) {
        var color = color
        var color_0_ = color_0_
        var color_2_ = color_2_
        try {
            anInt2627++
            try {
                val graphics = ParticleSystemRenderer.aCanvas3869!!.getGraphics()
                if (LoadingBarRenderer.aFont4329 == null) LoadingBarRenderer.aFont4329 = Font("Helvetica", 1, 13)
                if (color == null) color = Color(140, 17, 17)
                if (color_0_ == null) color_0_ = Color(140, 17, 17)
                if (color_2_ == null) color_2_ = Color(255, 255, 255)
                try {
                    if (LoadingBarRenderer.anImage4249 == null) LoadingBarRenderer.anImage4249 = (ParticleSystemRenderer.aCanvas3869!!.createImage(LocTypeDefinition.anInt4017, GameDisplayManager.anInt10432))
                    val graphics_3_ = LoadingBarRenderer.anImage4249!!.getGraphics()
                    graphics_3_.setColor(Color.black)
                    graphics_3_.fillRect(0, 0, LocTypeDefinition.anInt4017, GameDisplayManager.anInt10432)
                    val i_4_ = -152 + LocTypeDefinition.anInt4017 / 2
                    val i_5_ = -18 + GameDisplayManager.anInt10432 / 2
                    graphics_3_.setColor(color_0_)
                    graphics_3_.drawRect(i_4_, i_5_, 303, 33)
                    graphics_3_.setColor(color)
                    graphics_3_.fillRect(2 + i_4_, i_5_ - -2, i * 3, 30)
                    graphics_3_.setColor(Color.black)
                    graphics_3_.drawRect(i_4_ + 1, 1 + i_5_, 301, 31)
                    graphics_3_.fillRect(3 * i + (i_4_ - -2), 2 + i_5_, 300 - i * 3, 30)
                    graphics_3_.setFont(LoadingBarRenderer.aFont4329)
                    graphics_3_.setColor(color_2_)
                    graphics_3_.drawString(string, (i_4_ + (304 - string!!.length * 6) / 2), i_5_ + 22)
                    if (AsyncResourceRequestStatics.aString9665 != null) {
                        graphics_3_.setFont(LoadingBarRenderer.aFont4329)
                        graphics_3_.setColor(color_2_)
                        graphics_3_.drawString(AsyncResourceRequestStatics.aString9665, (LocTypeDefinition.anInt4017 / 2 - (AsyncResourceRequestStatics.aString9665!!.length * 6 / 2)), -26 + GameDisplayManager.anInt10432 / 2)
                    }
                    graphics.drawImage(LoadingBarRenderer.anImage4249, 0, 0, null)
                } catch (exception: Exception) {
                    graphics.setColor(Color.black)
                    graphics.fillRect(0, 0, LocTypeDefinition.anInt4017, GameDisplayManager.anInt10432)
                    val i_6_ = -152 + LocTypeDefinition.anInt4017 / 2
                    val i_7_ = GameDisplayManager.anInt10432 / 2 + -18
                    graphics.setColor(color_0_)
                    graphics.drawRect(i_6_, i_7_, 303, 33)
                    graphics.setColor(color)
                    graphics.fillRect(2 + i_6_, 2 + i_7_, i * 3, 30)
                    graphics.setColor(Color.black)
                    graphics.drawRect(1 + i_6_, 1 + i_7_, 301, 31)
                    graphics.fillRect(3 * i + 2 + i_6_, 2 + i_7_, -(i * 3) + 300, 30)
                    graphics.setFont(LoadingBarRenderer.aFont4329)
                    graphics.setColor(color_2_)
                    if (AsyncResourceRequestStatics.aString9665 != null) {
                        graphics.setFont(LoadingBarRenderer.aFont4329)
                        graphics.setColor(color_2_)
                        graphics.drawString(AsyncResourceRequestStatics.aString9665, (LocTypeDefinition.anInt4017 / 2 + -(6 * AsyncResourceRequestStatics.aString9665!!.length / 2)), GameDisplayManager.anInt10432 / 2 - 26)
                    }
                    graphics.drawString(string, i_6_ - -((304 + -(string!!.length * 6)) / 2), 22 + i_7_)
                }
            } catch (exception: Exception) {
                ParticleSystemRenderer.aCanvas3869!!.repaint()
            }
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("rc.A(" + i + ',' + (if (color != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ',' + (if (color_0_ != null) "{...}" else "null") + ',' + i_1_ + ',' + (if (color_2_ != null) "{...}" else "null") + ')'))
        }
    }

    @JvmStatic
    fun method1457(i: Int, i_8_: Int): Int {
        if (HashTileShapeStatics.aByteArrayArray8816 != null) return HashTileShapeStatics.aByteArrayArray8816!![i]!![i_8_].toInt() and 0xff
        return 0
    }

    fun method1459(i: Int, i_9_: Int) {
        anInt2637++
        val class348_sub42_sub15 = ConfigValueProvider.method2516(i, 105.toByte(), 10)
        class348_sub42_sub15.method3251(-16058)
        if (i_9_ != 2) aRenderableEntryArray2636 = null
    }

    @JvmStatic
    fun method1461(i: Byte) {
        anIntArray2633 = null
        if (i <= 77) anIntArray2633 = null
        PerlinNoiseTextureNode.anIntArray2631 = null
        aRenderableEntryArray2636 = null
        anIntArray2632 = null
    }

    init {
        anIntArray2632 = IntArray(32)
        anIntArray2633 = IntArray(32)
        aRenderableEntryArray2636 = null
    }
}
