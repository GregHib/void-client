package awt.event

expect interface WindowListener {
    fun windowOpened(e: WindowEvent?)
    fun windowClosing(e: WindowEvent?)
    fun windowClosed(e: WindowEvent?)
    fun windowIconified(e: WindowEvent?)
    fun windowDeiconified(e: WindowEvent?)
    fun windowActivated(e: WindowEvent?)
    fun windowDeactivated(e: WindowEvent?)
}
