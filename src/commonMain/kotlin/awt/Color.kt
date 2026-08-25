package awt

expect class Color(r: Int, g: Int, b: Int) {
    constructor(color: Int)
    constructor(r: Int, g: Int, b: Int, a: Int)
    fun getRed(): Int
    fun getGreen(): Int
    fun getBlue(): Int
    fun getAlpha(): Int
    fun getRGB(): Int
}

// Java statics don't map to a companion — surface them as top-level expects
expect val COLOR_BLACK: Color
expect val COLOR_WHITE: Color
expect val COLOR_RED: Color

expect val FONT_PLAIN: Int
expect val FONT_BOLD: Int
expect val FONT_ITALIC: Int