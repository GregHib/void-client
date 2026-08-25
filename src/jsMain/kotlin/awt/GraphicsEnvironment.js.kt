package awt

actual abstract class GraphicsEnvironment internal constructor() {

    actual fun isHeadlessInstance(): Boolean = false
}

private class LocalGraphicsEnvironment(
    val screenDevices: Array<GraphicsDevice>,
    val defaultScreenDevice: GraphicsDevice,
    val availableFontFamilyNames: Array<String>
) : GraphicsEnvironment()

actual val localGraphicsEnvironment: GraphicsEnvironment by lazy { LocalGraphicsEnvironment(emptyArray(), object : GraphicsDevice() {}, emptyArray()) }

actual val isHeadless: Boolean = false

private fun fullscreenEnabled(): Boolean =
    try {
        js("document.fullscreenEnabled") as? Boolean ?: false
    } catch (e: Throwable) {
        false
    }
