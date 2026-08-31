package awt

import kotlinx.browser.document
import kotlinx.browser.window

actual abstract class GraphicsDevice internal constructor(
//    actual val type: Int,
//    actual val IDstring: String,
//    actual val isFullScreenSupported: Boolean
) {
    actual override fun toString(): String = "GraphicsDevice[]"

    actual fun getDisplayMode(): DisplayMode =
        DisplayMode(window.screen.width, window.screen.height, 32, 60)

    actual fun getDisplayModes(): Array<DisplayMode> = arrayOf(getDisplayMode())
    actual fun setDisplayMode(mode: DisplayMode?) { }
    actual fun isFullScreenSupported(): Boolean = fullscreenEnabled()
}

// Set right before we ourselves call exitFullscreen(), so the fullscreenchange listener below can
// tell "we asked to leave fullscreen" apart from "the browser left fullscreen on its own" (e.g. the
// user pressed Escape) - only the latter should notify the game to fall back to windowed mode.
private var exitRequestedByGame = false
private var fullscreenChangeListenerAdded = false

private fun ensureFullscreenChangeListener() {
    if (fullscreenChangeListenerAdded) return
    fullscreenChangeListenerAdded = true
    document.addEventListener("fullscreenchange", {
        if (document.asDynamic().fullscreenElement == null) {
            if (exitRequestedByGame) exitRequestedByGame = false
            else onFullscreenExitedExternally?.invoke()
        }
    })
}

actual fun GraphicsDevice.setFullScreenWindow(frame: Frame?) {
    ensureFullscreenChangeListener()
    val doc = document.asDynamic()
    try {
        if (frame != null) {
            if (doc.fullscreenElement == null) {
                document.documentElement.asDynamic().requestFullscreen()
            }
        } else {
            if (doc.fullscreenElement != null) {
                exitRequestedByGame = true
                doc.exitFullscreen()
            }
        }
    } catch (e: Throwable) {
        /* empty */
    }
}

actual val defaultScreenDevice: GraphicsDevice
    get() = TODO()//localGraphicsEnvironment.defaultScreenDevice

actual val screenDevices: Array<GraphicsDevice>
    get() = TODO()//localGraphicsEnvironment.screenDevices
