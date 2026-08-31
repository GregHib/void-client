package awt

actual class Font actual constructor(
    private val name: String, private val style: Int, private val size: Int
) {
    actual fun getName(): String = name
    actual fun getSize(): Int = size
    actual fun getStyle(): Int = style
    actual fun isBold(): Boolean = style and FONT_BOLD != 0
    actual fun isItalic(): Boolean = style and FONT_ITALIC != 0
}

actual val FONT_PLAIN: Int = 0
actual val FONT_BOLD: Int = 1
actual val FONT_ITALIC: Int = 2

internal fun Font.toCssFont(): String {
    val slant = if (isItalic()) "italic " else ""
    val weight = if (isBold()) "bold " else ""
    return "$slant$weight${getSize()}px ${getName()}"
}