package awt

expect class Robot() {
    fun mouseMove(x: Int, y: Int)
    fun mousePress(buttons: Int)
    fun mouseRelease(buttons: Int)
    fun keyPress(keycode: Int)
    fun keyRelease(keycode: Int)
    fun delay(ms: Int)
    fun setAutoDelay(ms: Int)
    fun setAutoWaitForIdle(isOn: Boolean)
    fun waitForIdle()
}
