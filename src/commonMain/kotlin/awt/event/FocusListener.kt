package awt.event


expect interface FocusListener {
    fun focusGained(e: FocusEvent?)
    fun focusLost(e: FocusEvent?)
}
