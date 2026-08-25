package awt


expect abstract class GraphicsEnvironment {
//    val screenDevices: Array<GraphicsDevice>
//    val defaultScreenDevice: GraphicsDevice
//    val availableFontFamilyNames: Array<String>
    fun isHeadlessInstance(): Boolean
    fun getScreenDevices(): Array<GraphicsDevice>
    fun getDefaultScreenDevice(): GraphicsDevice
}

expect val localGraphicsEnvironment: GraphicsEnvironment

expect val isHeadless: Boolean
