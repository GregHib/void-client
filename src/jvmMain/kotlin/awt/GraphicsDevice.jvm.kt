package awt

actual typealias GraphicsDevice = java.awt.GraphicsDevice

actual val defaultScreenDevice: GraphicsDevice
    get() = localGraphicsEnvironment.getDefaultScreenDevice()

actual val screenDevices: Array<GraphicsDevice>
    get() = localGraphicsEnvironment.getScreenDevices()

actual fun GraphicsDevice.setFullScreenWindow(frame: Frame?) {
    (this as java.awt.GraphicsDevice).fullScreenWindow = frame
}
