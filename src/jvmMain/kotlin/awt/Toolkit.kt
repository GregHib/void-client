package awt

actual typealias Toolkit = java.awt.Toolkit

actual fun getDefaultToolkit(): Toolkit = java.awt.Toolkit.getDefaultToolkit()
