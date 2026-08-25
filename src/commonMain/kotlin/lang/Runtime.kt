package lang

expect object PlatformRuntime {
    fun availableProcessors(): Int
    fun totalMemory(): Long
    fun freeMemory(): Long
    fun maxMemory(): Long
}