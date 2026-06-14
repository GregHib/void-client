import org.w3c.dom.CanvasRenderingContext2D

/**
 * JS [GameSurface]: software-renderer framebuffer backed by a `Uint8ClampedArray`/`ImageData`.
 *
 * The renderer writes ARGB8888 values into [pixels] (row-major [IntArray]).  [present]
 * converts the requested sub-rectangle from ARGB to RGBA into a fresh `ImageData` and
 * calls `ctx.putImageData` to blit it onto the visible `<canvas>`.
 *
 * ARGB → RGBA per pixel:
 *   input  int:  bits 31-24 = A, 23-16 = R, 15-8 = G, 7-0 = B
 *   output bytes: [R, G, B, A]
 *
 * Kotlin/JS does not define `set` on `Uint8ClampedArray`, so we write via `.asDynamic()[i]`.
 *
 * [dispose] is a no-op: `ImageData` is GC-managed; the `<canvas>` lifecycle belongs to
 * [JsWindowShell].
 */
class JsGameSurface(
    override val width: Int,
    override val height: Int,
    private val ctx: CanvasRenderingContext2D,
) : GameSurface {

    override val pixels: IntArray = IntArray(width * height)

    override fun present(
        clipX: Int,
        clipY: Int,
        width: Int,
        height: Int,
        srcX: Int,
        srcY: Int,
        restoreClip: Boolean,
    ) {
        // Destination rectangle on the surface, clamped to surface bounds.
        val destX = clipX - srcX
        val destY = clipY - srcY
        val x0 = maxOf(0, destX)
        val y0 = maxOf(0, destY)
        val x1 = minOf(this.width,  destX + width)
        val y1 = minOf(this.height, destY + height)
        if (x1 <= x0 || y1 <= y0) return

        val pw = x1 - x0
        val ph = y1 - y0

        // Build an ImageData for the dirty rectangle and fill it with RGBA bytes.
        val imageData: dynamic = js("new ImageData(pw, ph)")
        val buf: dynamic = imageData.data   // Uint8ClampedArray

        var dst = 0
        for (row in y0 until y1) {
            var src = row * this.width + x0
            repeat(pw) {
                val argb = pixels[src++]
                buf[dst++] = (argb shr 16) and 0xFF  // R
                buf[dst++] = (argb shr  8) and 0xFF  // G
                buf[dst++] = (argb       ) and 0xFF  // B
                buf[dst++] = (argb shr 24) and 0xFF  // A
            }
        }

        ctx.asDynamic().putImageData(imageData, x0, y0)
    }

    override fun dispose() {
        // Nothing to release; ImageData is GC-managed.
    }
}

/**
 * JS [GameSurfaceFactory]: obtains the 2D rendering context from the [DisplayTarget]
 * (which must be a [JsWindowShell]) and constructs a [JsGameSurface].
 */
object JsGameSurfaceFactory : GameSurfaceFactory {
    override fun create(target: DisplayTarget, width: Int, height: Int): GameSurface {
        val shell = target as JsWindowShell
        return JsGameSurface(width, height, shell.canvas2d)
    }
}
