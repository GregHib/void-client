package awt.event

actual interface FocusListener {
    actual fun focusGained(e: FocusEvent?)
    actual fun focusLost(e: FocusEvent?)
}
