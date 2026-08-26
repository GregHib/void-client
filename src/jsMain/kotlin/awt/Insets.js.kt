package awt

// A DOM container has no window chrome to inset for.
actual class Insets {
    actual val left: Int get() = 0
    actual val right: Int get() = 0
    actual val top: Int get() = 0
    actual val bottom: Int get() = 0
}
