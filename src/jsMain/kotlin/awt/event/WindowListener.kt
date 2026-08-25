package awt.event

actual interface WindowListener {
    actual fun windowOpened(e: WindowEvent?)
    actual fun windowClosing(e: WindowEvent?)
    actual fun windowClosed(e: WindowEvent?)
    actual fun windowIconified(e: WindowEvent?)
    actual fun windowDeiconified(e: WindowEvent?)
    actual fun windowActivated(e: WindowEvent?)
    actual fun windowDeactivated(e: WindowEvent?)
}
