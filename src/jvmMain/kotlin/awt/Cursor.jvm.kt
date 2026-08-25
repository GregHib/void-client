package awt

actual typealias Cursor = java.awt.Cursor

actual fun getPredefinedCursor(type: Int): Cursor = java.awt.Cursor.getPredefinedCursor(type)
actual fun getDefaultCursor(): Cursor = java.awt.Cursor.getDefaultCursor()