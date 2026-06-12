/**
 * Global debug flags accessible from commonMain.
 * Loader (jvmMain) sets [trace] based on --trace command-line argument.
 */
object DebugFlags {
    var trace: Boolean = false
}
