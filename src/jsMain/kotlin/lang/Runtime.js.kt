package lang

@JsName("navigator")
external val navigator: dynamic

@JsName("performance")
external val performance: dynamic

@JsName("process")
external val process: dynamic

actual object PlatformRuntime {

    actual fun availableProcessors(): Int {
        return try {
            val hc = navigator.hardwareConcurrency
            if (hc != undefined) (hc as Double).toInt() else 1
        } catch (e: Throwable) {
            1
        }
    }

    // Chrome-only nonstandard API. Returns totalJSHeapSize if available.
    actual fun totalMemory(): Long {
        val mem = chromeMemory() ?: return -1L
        return (mem["totalJSHeapSize"] as? Double)?.toLong() ?: -1L
    }

    // Approximated as totalJSHeapSize - usedJSHeapSize on Chrome.
    actual fun freeMemory(): Long {
        val mem = chromeMemory() ?: return -1L
        val total = (mem["totalJSHeapSize"] as? Double)?.toLong()
        val used = (mem["usedJSHeapSize"] as? Double)?.toLong()
        return if (total != null && used != null) total - used else -1L
    }

    // jsHeapSizeLimit on Chrome; Node has no equivalent hard limit exposed here.
    actual fun maxMemory(): Long {
        val mem = chromeMemory() ?: return -1L
        return (mem["jsHeapSizeLimit"] as? Double)?.toLong() ?: -1L
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