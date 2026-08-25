package awt

import org.w3c.dom.CanvasRenderingContext2D

actual abstract class FontMetrics {
    internal abstract val ctx: CanvasRenderingContext2D
    internal abstract val fnt: Font

    actual fun getFont(): Font = fnt
    actual fun getAscent(): Int = (fnt.getSize() * 0.8).toInt()
    actual fun getDescent(): Int = (fnt.getSize() * 0.2).toInt()
    actual fun getLeading(): Int = (fnt.getSize() * 0.15).toInt()
    actual fun getHeight(): Int = getAscent() + getDescent() + getLeading()
    actual fun getMaxAscent(): Int = getAscent()
    actual fun getMaxDescent(): Int = getDescent()
    actual fun getMaxAdvance(): Int = stringWidth("W")
    actual fun charWidth(ch: Char): Int = stringWidth(ch.toString())
    actual fun stringWidth(str: String): Int =
        ctx.measureText(str).width.toInt()
}

internal class CanvasFontMetrics(
    override val ctx: CanvasRenderingContext2D,
    override val fnt: Font
) : FontMetrics()