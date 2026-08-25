package awt

actual abstract class GraphicsDevice internal constructor(
//    actual val type: Int,
//    actual val IDstring: String,
//    actual val isFullScreenSupported: Boolean
) {
    actual override fun toString(): String = "GraphicsDevice[]"

    actual fun getDisplayMode(): DisplayMode = TODO("Not yet implemented")
    actual fun getDisplayModes(): Array<DisplayMode> = TODO("Not yet implemented")
    actual fun setDisplayMode(mode: DisplayMode?) { }
    actual fun isFullScreenSupported(): Boolean = false
}

actual fun GraphicsDevice.setFullScreenWindow(frame: Frame?) { }

actual val defaultScreenDevice: GraphicsDevice
    get() = TODO()//localGraphicsEnvironment.defaultScreenDevice

actual val screenDevices: Array<GraphicsDevice>
    get() = TODO()//localGraphicsEnvironment.screenDevices
