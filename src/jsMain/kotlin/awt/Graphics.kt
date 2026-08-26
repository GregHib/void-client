package awt

import awt.image.ImageObserver
import org.w3c.dom.CanvasRenderingContext2D

actual abstract class Graphics {
    actual abstract fun dispose()
    actual abstract fun translate(x: Int, y: Int)
    actual abstract fun setColor(c: Color?)
    actual abstract fun getColor(): Color
    actual abstract fun setFont(font: Font?)
    actual abstract fun getFont(): Font
    actual abstract fun clearRect(x: Int, y: Int, width: Int, height: Int)
    actual abstract fun drawLine(x1: Int, y1: Int, x2: Int, y2: Int)
    actual abstract fun fillRect(x: Int, y: Int, width: Int, height: Int)
    actual abstract fun drawOval(x: Int, y: Int, width: Int, height: Int)
    actual abstract fun fillOval(x: Int, y: Int, width: Int, height: Int)
    actual abstract fun drawString(str: String?, x: Int, y: Int)
    actual abstract fun setClip(x: Int, y: Int, width: Int, height: Int)
    actual abstract fun clipRect(x: Int, y: Int, width: Int, height: Int)
    actual abstract fun getClipBounds(): Rectangle
    actual abstract fun getClip(): Shape

    // final actual, mirroring AWT's concrete implementation
    actual fun drawRect(x: Int, y: Int, width: Int, height: Int) {
        drawLine(x, y, x + width, y)
        drawLine(x + width, y, x + width, y + height)
        drawLine(x + width, y + height, x, y + height)
        drawLine(x, y + height, x, y)
    }

    actual abstract fun setClip(shape: Shape?)
    actual abstract fun drawImage(img: Image?, x: Int, y: Int, observer: ImageObserver?): Boolean
}

// Concrete impl — plain overrides, NO `actual` keyword here
internal class CanvasGraphics(
    private val ctx: CanvasRenderingContext2D
) : Graphics() {

    private var color: Color = Color(0, 0, 0)
    private var font: Font = Font("sans-serif", FONT_PLAIN, 12)
    private var clip: Rectangle? = null
    private var translateX: Double = 0.0
    private var translateY: Double = 0.0

    init {
        // Canvas 2D's ctx.clip() only ever *intersects* the current clip region,
        // it can never widen it. AWT's setClip() replaces the clip absolutely.
        // To bridge that, we keep a single save() anchored at the unclipped
        // state; every clip change restores back to that pristine state first,
        // then re-saves, then applies the new region on top of it.
        //
        // The leading restore() pops the baseline left behind by whichever Graphics was handed
        // out for this surface before us (restore() on an empty stack is a documented no-op).
        // Without it the save stack would grow by one on every getGraphics() call, and - worse -
        // this instance would inherit that instance's clip and translate instead of starting
        // pristine, which AWT guarantees.
        ctx.restore()
        ctx.save()
    }

    override fun dispose() { /* no-op: the 2D context isn't a scarce resource */ }

    override fun translate(x: Int, y: Int) {
        translateX += x
        translateY += y
        ctx.translate(x.toDouble(), y.toDouble())
    }

    override fun setColor(c: Color?) {
        color = c ?: return
        ctx.fillStyle = c.css()
        ctx.strokeStyle = c.css()
    }

    override fun getColor(): Color = color

    override fun setFont(font: Font?) {
        this.font = font ?: return
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

    override fun drawString(str: String?, x: Int, y: Int) {
        ctx.fillText(str ?: return, x.toDouble(), y.toDouble())
    }

    override fun drawImage(img: Image?, x: Int, y: Int, observer: ImageObserver?): Boolean {
        if (img == null) return false
        ctx.drawImage(img.source, x.toDouble(), y.toDouble())
        return true
    }

    override fun setClip(x: Int, y: Int, width: Int, height: Int) {
        applyClip(Rectangle(x, y, width, height))
    }

    override fun setClip(shape: Shape?) {
        when (shape) {
            null -> applyClip(null)
            is Rectangle -> applyClip(shape)
            // Shape only exposes bounds/contains/intersects, not a path we can
            // walk, so a non-rectangular clip is approximated by its bounds.
            else -> applyClip(shape.getBounds())
        }
    }

    override fun getClip(): Shape = clip ?: fullCanvasBounds()

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

    override fun getClipBounds(): Rectangle = clip ?: fullCanvasBounds()

    private fun fullCanvasBounds(): Rectangle =
        Rectangle(0, 0, ctx.canvas.width, ctx.canvas.height)

    // Replaces the clip absolutely (AWT semantics), unlike ctx.clip() which
    // only ever intersects with whatever region is already in effect.
    private fun applyClip(rect: Rectangle?) {
        // restore()/save() reset the *entire* canvas state, not just the
        // clip, so the accumulated translate() has to be replayed afterwards.
        ctx.restore()
        ctx.save()
        if (translateX != 0.0 || translateY != 0.0) {
            ctx.translate(translateX, translateY)
        }
        if (rect != null) {
            ctx.beginPath()
            ctx.rect(rect.left.toDouble(), rect.top.toDouble(), rect.w.toDouble(), rect.h.toDouble())
            ctx.clip()
        }
        clip = rect
    }

    private fun ovalPath(x: Int, y: Int, width: Int, height: Int) {
        ctx.beginPath()
        ctx.ellipse(
            x + width / 2.0, y + height / 2.0,
            width / 2.0, height / 2.0, 0.0, 0.0, 2 * kotlin.math.PI
        )
    }

}