import kotlinx.browser.document
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement

/**
 * JS implementation of [GlyphRasterizer]: uses a hidden HTMLCanvasElement and the
 * Canvas2D API to measure glyph metrics and rasterize individual characters to ARGB
 * pixel arrays — mirroring the AWT implementation on JVM.
 */
class JsGlyphRasterizer : GlyphRasterizer {
    override fun open(size: Int, bold: Boolean): RasterFont {
        val weight = if (bold) "bold" else "normal"
        val fontString = "$weight ${size}px Helvetica, Arial, sans-serif"
        return JsRasterFont(fontString, size)
    }
}

internal class JsRasterFont(
    private val fontString: String,
    private val sizePx: Int,
) : RasterFont {

    // Lazy metrics measured once from a throwaway canvas context.
    private val ctx: CanvasRenderingContext2D by lazy { makeCtx() }
    private val tm by lazy { ctx.measureText("M") }

    private fun makeCtx(): CanvasRenderingContext2D {
        val canvas = document.createElement("canvas") as HTMLCanvasElement
        canvas.width = sizePx * 2
        canvas.height = sizePx * 2
        val c = canvas.getContext("2d") as CanvasRenderingContext2D
        c.font = fontString
        return c
    }

    override val maxAscent: Int get() =
        tm.asDynamic().fontBoundingBoxAscent.unsafeCast<Double>().toInt()

    override val maxDescent: Int get() =
        tm.asDynamic().fontBoundingBoxDescent.unsafeCast<Double>().toInt()

    override val height: Int get() = maxAscent + maxDescent

    override fun charWidth(c: Char): Int =
        ctx.measureText(c.toString()).width.toInt()

    override fun rasterize(
        c: Char,
        width: Int,
        glyphHeight: Int,
        ascent: Int,
        emboldened: Boolean,
    ): IntArray {
        // Offscreen canvas for this single glyph.
        val canvas = document.createElement("canvas") as HTMLCanvasElement
        canvas.width = width
        canvas.height = glyphHeight
        val gc = canvas.getContext("2d") as CanvasRenderingContext2D

        // Black background
        gc.fillStyle = "black"
        gc.fillRect(0.0, 0.0, width.toDouble(), glyphHeight.toDouble())

        // White glyph
        gc.fillStyle = "white"
        gc.font = fontString
        gc.fillText(c.toString(), 0.0, ascent.toDouble())
        if (emboldened) {
            gc.fillText(c.toString(), 1.0, ascent.toDouble())
        }

        // Read back RGBA pixels and convert to ARGB IntArray.
        val imageData = gc.getImageData(0.0, 0.0, width.toDouble(), glyphHeight.toDouble())
        val data = imageData.data.asDynamic()  // Uint8ClampedArray, RGBA layout
        val pixels = IntArray(width * glyphHeight)
        for (i in pixels.indices) {
            val base = i * 4
            val r = (data[base] as Int) and 0xFF
            val g = (data[base + 1] as Int) and 0xFF
            val b = (data[base + 2] as Int) and 0xFF
            val a = (data[base + 3] as Int) and 0xFF
            pixels[i] = (a shl 24) or (r shl 16) or (g shl 8) or b
        }
        return pixels
    }
}
