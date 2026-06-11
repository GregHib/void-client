/**
 * Font-rasterization seam (plan §4 "NativeFontRasterizer").
 *
 * Class323 builds its bitmap fonts by drawing each glyph with the platform's
 * native font engine and grabbing the resulting pixels. That step — and only
 * that step — is platform-specific (AWT on JVM, canvas2d on web, stb_truetype
 * on native). Everything Class323 does afterwards (packing glyphs into Class105
 * sprites and blitting them) is pure and stays put.
 *
 * The contract is deliberately tiny: open a font at a size/weight, ask it for
 * per-glyph pixels and the few metrics Class323 needs. The JVM implementation
 * (AwtGlyphRasterizer) wraps java.awt.Font + Component.getFontMetrics +
 * createImage/drawString/PixelGrabber.
 */
interface GlyphRasterizer {
    /** Open the named font at [size] points, bold if [bold]. */
    fun open(size: Int, bold: Boolean): RasterFont
}

/**
 * A font opened at a particular size/weight. Font-wide metrics are exposed as
 * properties; per-glyph pixels come from [rasterize].
 */
interface RasterFont {
    /** FontMetrics.getMaxAscent(). */
    val maxAscent: Int

    /** FontMetrics.getMaxDescent(). */
    val maxDescent: Int

    /** FontMetrics.getHeight(). */
    val height: Int

    /** FontMetrics.charWidth(c). */
    fun charWidth(c: Char): Int

    /**
     * Rasterize a single glyph into an ARGB pixel buffer.
     *
     * The glyph is drawn white on black at baseline [ascent] into a [width] x
     * [glyphHeight] buffer; if [emboldened] the glyph is drawn a second time
     * shifted one pixel right (the old "synthetic bold" trick). Returns the raw
     * pixel array, row-major, length width*glyphHeight.
     */
    fun rasterize(c: Char, width: Int, glyphHeight: Int, ascent: Int, emboldened: Boolean): IntArray
}
