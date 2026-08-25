package awt

actual abstract class GraphicsDevice internal constructor(
//    actual val type: Int,
//    actual val IDstring: String,
//    actual val isFullScreenSupported: Boolean
) {
    actual override fun toString(): String = "GraphicsDevice[]"
}

actual val defaultScreenDevice: GraphicsDevice
    get() = TODO()//localGraphicsEnvironment.defaultScreenDevice

actual val screenDevices: Array<GraphicsDevice>
    get() = TODO()//localGraphicsEnvironment.screenDevices
