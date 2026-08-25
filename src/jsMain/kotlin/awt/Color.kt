package awt

actual class Color actual constructor(
    private val r: Int, private val g: Int, private val b: Int
) {
    private var a: Int = 255

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
