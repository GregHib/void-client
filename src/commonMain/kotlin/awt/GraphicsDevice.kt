package awt

expect abstract class GraphicsDevice {
//    val type: Int
//    val IDstring: String
//    val isFullScreenSupported: Boolean

    fun getDisplayMode(): DisplayMode
    fun getDisplayModes(): Array<DisplayMode>
    fun setDisplayMode(mode: DisplayMode?)
    fun isFullScreenSupported(): Boolean
    override fun toString(): String
}

expect fun GraphicsDevice.setFullScreenWindow(frame: Frame?)

// Set by the platform-agnostic fullscreen controller; invoked by platform code when fullscreen
// exits without going through setFullScreenWindow(null) - e.g. the browser's own Escape handling.
var onFullscreenExitedExternally: (() -> Unit)? = null

const val GRAPHICS_DEVICE_TYPE_RASTER_SCREEN = 0

const val GRAPHICS_DEVICE_TYPE_PRINTER = 1

const val GRAPHICS_DEVICE_TYPE_IMAGE_BUFFER = 2

expect val defaultScreenDevice: GraphicsDevice

expect val screenDevices: Array<GraphicsDevice>
