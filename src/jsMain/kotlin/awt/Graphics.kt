package awt

import org.w3c.dom.CanvasRenderingContext2D

actual abstract class Graphics {
    actual abstract fun dispose()
    actual abstract fun translate(x: Int, y: Int)
    actual abstract fun setColor(c: Color)
    actual abstract fun getColor(): Color
    actual abstract fun setFont(font: Font)
    actual abstract fun getFont(): Font
    actual abstract fun clearRect(x: Int, y: Int, width: Int, height: Int)
    actual abstract fun drawLine(x1: Int, y1: Int, x2: Int, y2: Int)
    actual abstract fun fillRect(x: Int, y: Int, width: Int, height: Int)
    actual abstract fun drawOval(x: Int, y: Int, width: Int, height: Int)
    actual abstract fun fillOval(x: Int, y: Int, width: Int, height: Int)
    actual abstract fun drawString(str: String, x: Int, y: Int)
    actual abstract fun setClip(x: Int, y: Int, width: Int, height: Int)
    actual abstract fun clipRect(x: Int, y: Int, width: Int, height: Int)
    actual abstract fun getClipBounds(): Rectangle

    // final actual, mirroring AWT's concrete implementation
    actual fun drawRect(x: Int, y: Int, width: Int, height: Int) {
        drawLine(x, y, x + width, y)
        drawLine(x + width, y, x + width, y + height)
        drawLine(x + width, y + height, x, y + height)
        drawLine(x, y + height, x, y)
    }
}

// Concrete impl — plain overrides, NO `actual` keyword here
internal class CanvasGraphics(
    private val ctx: CanvasRenderingContext2D
) : Graphics() {

    private var color: Color = Color(0, 0, 0)
    private var font: Font = Font("sans-serif", FONT_PLAIN, 12)
    private var clip: Rectangle? = null

    override fun dispose() { /* no-op: the 2D context isn't a scarce resource */ }

    override fun translate(x: Int, y: Int) =
        ctx.translate(x.toDouble(), y.toDouble())

    override fun setColor(c: Color) {
        color = c
        ctx.fillStyle = c.css()
        ctx.strokeStyle = c.css()
    }

    override fun getColor(): Color = color

    override fun setFont(font: Font) {
        this.font = font
        val weight = if (font.isBold()) "bold " else ""
        val slant = if (font.isItalic()) "italic " else ""
        ctx.font = "$slant$weight${font.getSize()}px ${font.getName()}"
    }

    override fun getFont(): Font = font

    override fun clearRect(x: Int, y: Int, width: Int, height: Int) =
        ctx.clearRect(x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble())

    override fun drawLine(x1: Int, y1: Int, x2: Int, y2: Int) {
        ctx.beginPath()
        ctx.moveTo(x1.toDouble(), y1.toDouble())
        ctx.lineTo(x2.toDouble(), y2.toDouble())
        ctx.stroke()
    }

    override fun fillRect(x: Int, y: Int, width: Int, height: Int) =
        ctx.fillRect(x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble())

    override fun drawOval(x: Int, y: Int, width: Int, height: Int) {
        ovalPath(x, y, width, height); ctx.stroke()
    }

    override fun fillOval(x: Int, y: Int, width: Int, height: Int) {
        ovalPath(x, y, width, height); ctx.fill()
    }

    override fun drawString(str: String, x: Int, y: Int) =
        ctx.fillText(str, x.toDouble(), y.toDouble())

    override fun setClip(x: Int, y: Int, width: Int, height: Int) {
        clip = Rectangle(x, y, width, height)
        ctx.beginPath()
        ctx.rect(x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble())
        ctx.clip()
    }

    override fun clipRect(x: Int, y: Int, width: Int, height: Int) {
        val c = clip
        if (c == null) {
            setClip(x, y, width, height)
        } else {
            val nx = maxOf(c.left, x)
            val ny = maxOf(c.top, y)
            setClip(nx, ny,
                minOf(c.left + c.w, x + width) - nx,
                minOf(c.top + c.h, y + height) - ny)
        }
    }

    override fun getClipBounds(): Rectangle = clip ?: Rectangle(0, 0, 0, 0)

    private fun ovalPath(x: Int, y: Int, width: Int, height: Int) {
        ctx.beginPath()
        ctx.ellipse(
            x + width / 2.0, y + height / 2.0,
            width / 2.0, height / 2.0, 0.0, 0.0, 2 * kotlin.math.PI
        )
    }
}