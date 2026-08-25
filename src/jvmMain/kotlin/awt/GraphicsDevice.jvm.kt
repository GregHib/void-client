package awt

actual typealias GraphicsDevice = java.awt.GraphicsDevice

actual val defaultScreenDevice: GraphicsDevice
    get() = localGraphicsEnvironment.defaultScreenDevice

actual val screenDevices: Array<GraphicsDevice>
    get() = localGraphicsEnvironment.screenDevices
