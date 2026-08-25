package awt

actual class Insets(internal val delegate: java.awt.Insets) {
    actual val left: Int get() = delegate.left
    actual val right: Int get() = delegate.right
    actual val top: Int get() = delegate.top
    actual val bottom: Int get() = delegate.bottom
}
