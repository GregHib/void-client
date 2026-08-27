package lang

@JsName("navigator")
external val navigator: dynamic

@JsName("performance")
external val performance: dynamic

@JsName("process")
external val process: dynamic

actual object PlatformRuntime {

    // performance.memory is Chrome-only; fallback to 102MB to avoid tripping low-memory modes.
    private const val FALLBACK_MAX_MEMORY = 102L * 1024L * 1024L

    actual fun availableProcessors(): Int {
        return try {
            val hc = navigator.hardwareConcurrency
            if (hc != undefined) (hc as Double).toInt() else 1
        } catch (e: Throwable) {
            1
        }
    }

    actual fun totalMemory(): Long {
        val mem = chromeMemory() ?: return FALLBACK_MAX_MEMORY
        return (mem["totalJSHeapSize"] as? Double)?.toLong() ?: FALLBACK_MAX_MEMORY
    }

    actual fun freeMemory(): Long {
        val mem = chromeMemory() ?: return FALLBACK_MAX_MEMORY
        val total = (mem["totalJSHeapSize"] as? Double)?.toLong()
        val used = (mem["usedJSHeapSize"] as? Double)?.toLong()
        return if (total != null && used != null) total - used else FALLBACK_MAX_MEMORY
    }

    actual fun maxMemory(): Long {
        val mem = chromeMemory() ?: return FALLBACK_MAX_MEMORY
        return (mem["jsHeapSizeLimit"] as? Double)?.toLong() ?: FALLBACK_MAX_MEMORY
    }

    private fun chromeMemory(): dynamic {
        return try {
            val mem = performance.memory
            if (mem != undefined) mem else null
        } catch (e: Throwable) {
            null
        }
    }
}