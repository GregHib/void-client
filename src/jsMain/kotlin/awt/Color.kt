package awt

actual class Color actual constructor(
    private val r: Int, private val g: Int, private val b: Int
) {
    private var a: Int = 255

    /**
     * Packed 0xRRGGBB, matching java.awt.Color(int): bits 16-23 red, 8-15 green, 0-7 blue, alpha
     * forced opaque. This previously discarded [color] and produced black, which silently turned
     * every packed-int colour in the client black - including the loading bar's Color(9179409).
     */
    actual constructor(color: Int) : this((color shr 16) and 0xFF, (color shr 8) and 0xFF, color and 0xFF)
    actual constructor(r: Int, g: Int, b: Int, a: Int) : this(r, g, b) { this.a = a }

    actual fun getRed(): Int = r
    actual fun getGreen(): Int = g
    actual fun getBlue(): Int = b
    actual fun getAlpha(): Int = a
    actual fun getRGB(): Int = (a shl 24) or (r shl 16) or (g shl 8) or b
}

internal fun Color.css(): String =
    "rgba(${getRed()}, ${getGreen()}, ${getBlue()}, ${getAlpha() / 255.0})"

actual val COLOR_BLACK: Color = Color(0, 0, 0)
actual val COLOR_WHITE: Color = Color(255, 255, 255)
actual val COLOR_RED: Color = Color(255, 0, 0)
