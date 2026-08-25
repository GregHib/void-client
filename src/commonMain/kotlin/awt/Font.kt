package awt

expect class Font(name: String, style: Int, size: Int) {
    fun getName(): String
    fun getSize(): Int
    fun getStyle(): Int
    fun isBold(): Boolean
    fun isItalic(): Boolean
}
