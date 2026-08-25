package awt


expect abstract class GraphicsEnvironment {
//    val screenDevices: Array<GraphicsDevice>
//    val defaultScreenDevice: GraphicsDevice
//    val availableFontFamilyNames: Array<String>
    fun isHeadlessInstance(): Boolean
}

expect fun GraphicsEnvironment.getScreenDevices(): Array<GraphicsDevice>
expect fun GraphicsEnvironment.getDefaultScreenDevice(): GraphicsDevice

expect val localGraphicsEnvironment: GraphicsEnvironment

expect val isHeadless: Boolean
