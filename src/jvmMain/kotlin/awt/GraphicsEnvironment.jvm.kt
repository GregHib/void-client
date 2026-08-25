package awt

actual typealias GraphicsEnvironment = java.awt.GraphicsEnvironment

actual val localGraphicsEnvironment: GraphicsEnvironment
    get() = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment()

actual val isHeadless: Boolean
    get() = java.awt.GraphicsEnvironment.isHeadless()
