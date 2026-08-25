package awt

actual class Robot actual constructor() {
    actual fun mouseMove(x: Int, y: Int): Unit = unsupported()
    actual fun mousePress(buttons: Int): Unit = unsupported()
    actual fun mouseRelease(buttons: Int): Unit = unsupported()
    actual fun keyPress(keycode: Int): Unit = unsupported()
    actual fun keyRelease(keycode: Int): Unit = unsupported()

    // Not thrown: a synchronous sleep would freeze the single-threaded JS
    // event loop, so these are quiet no-ops rather than hard failures.
    actual fun delay(ms: Int) { }
    actual fun setAutoDelay(ms: Int) { }
    actual fun setAutoWaitForIdle(isOn: Boolean) { }
    actual fun waitForIdle() { }

    private fun unsupported(): Nothing = throw UnsupportedOperationException(
        "Robot input simulation is not available in a browser sandbox."
    )
}
