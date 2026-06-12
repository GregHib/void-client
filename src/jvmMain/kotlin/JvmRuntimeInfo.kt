/**
 * JVM implementation of RuntimeInfo — thin wrapper around Runtime.getRuntime().
 */
class JvmRuntimeInfo : RuntimeInfo {
    private val rt = Runtime.getRuntime()

    override fun usedMemoryKb(): Int =
        ((rt.totalMemory() - rt.freeMemory()) / 1024L).toInt()

    override fun maxMemoryMb(): Int =
        1 + (rt.maxMemory() / 1048576L).toInt()

    override fun availableProcessors(): Int =
        rt.availableProcessors()

    override fun exec(command: String) {
        rt.exec(command)
    }
}
