package awt

expect class Cursor(type: Int) {
    fun getType(): Int
    fun getName(): String
}


expect fun getPredefinedCursor(type: Int): Cursor
expect fun getDefaultCursor(): Cursor
