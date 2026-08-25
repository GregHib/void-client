package awt

actual typealias GraphicsEnvironment = java.awt.GraphicsEnvironment

actual fun GraphicsEnvironment.getScreenDevices(): Array<GraphicsDevice> =
    (this as java.awt.GraphicsEnvironment).screenDevices

actual fun GraphicsEnvironment.getDefaultScreenDevice(): GraphicsDevice =
    (this as java.awt.GraphicsEnvironment).defaultScreenDevice

actual val localGraphicsEnvironment: GraphicsEnvironment
    get() = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment()

actual val isHeadless: Boolean
    get() = java.awt.GraphicsEnvironment.isHeadless()
