package lang

actual object PlatformRuntime {
    private val runtime = Runtime.getRuntime()

    actual fun availableProcessors(): Int = runtime.availableProcessors()
    actual fun totalMemory(): Long = runtime.totalMemory()
    actual fun freeMemory(): Long = runtime.freeMemory()
    actual fun maxMemory(): Long = runtime.maxMemory()
}