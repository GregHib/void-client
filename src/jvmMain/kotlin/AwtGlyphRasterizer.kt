import java.awt.Color
import java.awt.Component
import java.awt.Font
import java.awt.FontMetrics
import java.awt.image.PixelGrabber

/**
 * JVM implementation of [GlyphRasterizer]: the AWT-bound glyph drawing that used
 * to live inline in Class323. Uses the supplied AWT [component] (the game Canvas)
 * for FontMetrics and offscreen image creation.
 */
class AwtGlyphRasterizer(private val component: Component) : GlyphRasterizer {
    override fun open(size: Int, bold: Boolean): RasterFont {
        val font = Font("Helvetica", if (bold) 1 else 0, size)
        return AwtRasterFont(component, font, component.getFontMetrics(font))
    }
}

private class AwtRasterFont(
    private val component: Component,
    private val font: Font,
    private val metrics: FontMetrics,
) : RasterFont {
    override val maxAscent: Int get() = metrics.getMaxAscent()
    override val maxDescent: Int get() = metrics.getMaxDescent()
    override val height: Int get() = metrics.getHeight()
    override fun charWidth(c: Char): Int = metrics.charWidth(c)

    override fun rasterize(c: Char, width: Int, glyphHeight: Int, ascent: Int, emboldened: Boolean): IntArray {
        val image = component.createImage(width, glyphHeight)
        val graphics = image.getGraphics()
        graphics.setColor(Color.black)
        graphics.fillRect(0, 0, width, glyphHeight)
        graphics.setColor(Color.white)
        graphics.setFont(font)
        graphics.drawString(c.toString(), 0, ascent)
        if (emboldened) graphics.drawString(c.toString(), 1, ascent)
        val pixels = IntArray(width * glyphHeight)
        val pixelgrabber = PixelGrabber(image, 0, 0, width, glyphHeight, pixels, 0, width)
        try {
            pixelgrabber.grabPixels()
        } catch (exception: Exception) {
            /* empty */
        }
        image.flush()
        return pixels
    }
}
