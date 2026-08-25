package awt

expect abstract class FontMetrics {
    fun getFont(): Font
    fun getAscent(): Int
    fun getDescent(): Int
    fun getLeading(): Int
    fun getHeight(): Int
    fun getMaxAscent(): Int
    fun getMaxDescent(): Int
    fun getMaxAdvance(): Int
    fun charWidth(ch: Char): Int
    fun stringWidth(str: String?): Int
}
