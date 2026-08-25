package awt

expect abstract class GraphicsDevice {
//    val type: Int
//    val IDstring: String
//    val isFullScreenSupported: Boolean

    fun getDisplayMode(): DisplayMode
    fun getDisplayModes(): Array<DisplayMode>
    fun setDisplayMode(mode: DisplayMode?)
    fun setFullScreenWindow(frame: Frame?)
    fun isFullScreenSupported(): Boolean
    override fun toString(): String
}

const val GRAPHICS_DEVICE_TYPE_RASTER_SCREEN = 0

const val GRAPHICS_DEVICE_TYPE_PRINTER = 1

const val GRAPHICS_DEVICE_TYPE_IMAGE_BUFFER = 2

expect val defaultScreenDevice: GraphicsDevice

expect val screenDevices: Array<GraphicsDevice>
