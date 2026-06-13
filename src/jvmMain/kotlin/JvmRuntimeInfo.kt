/**
 * JVM implementation of RuntimeInfo — thin wrapper around Runtime.getRuntime().
 */
class JvmRuntimeInfo : RuntimeInfo {
    private val rt = Runtime.getRuntime()

    override val javaVendor: String = systemGetProperty("java.vendor") ?: "Unknown"
    override val javaVersion: String = systemGetProperty("java.version") ?: "1.1"

    override fun usedMemoryKb(): Int =
        ((rt.totalMemory() - rt.freeMemory()) / 1024L).toInt()

    override fun maxMemoryMb(): Int =
        1 + (rt.maxMemory() / 1048576L).toInt()

    override fun availableProcessors(): Int =
        rt.availableProcessors()

    override fun exec(command: String) {
        rt.exec(command)
    }

    override fun setFocusCycleRoot(target: Any?) {
        val method = Class297.aMethod3786 ?: return
        try {
            method.invoke(target, java.lang.Boolean.TRUE)
        } catch (_: Throwable) {
            /* best-effort: older JVMs may not expose setFocusCycleRoot */
        }
    }

    override fun quit() {
        jagex3.jagmisc.jagmisc.quit()
    }
}
