/**
 * JS implementation of [RuntimeInfo].
 *
 * Browser sandbox constraints:
 *  - usedMemoryKb / maxMemoryMb: read from the non-standard `performance.memory` API
 *    (Chrome/Edge only). Falls back to 0 / 0 when not available.
 *  - availableProcessors: navigator.hardwareConcurrency (spec-standard, widely supported).
 *  - exec: no-op — there is no shell to launch in a browser.
 */
class JsRuntimeInfo : RuntimeInfo {

    override fun usedMemoryKb(): Int {
        val mem = js("(typeof performance !== 'undefined' && performance.memory) ? performance.memory : null")
        return if (mem != null) (mem.usedJSHeapSize.unsafeCast<Double>() / 1024).toInt() else 0
    }

    override fun maxMemoryMb(): Int {
        val mem = js("(typeof performance !== 'undefined' && performance.memory) ? performance.memory : null")
        return if (mem != null) (mem.jsHeapSizeLimit.unsafeCast<Double>() / 1048576).toInt() else 0
    }

    override fun availableProcessors(): Int {
        val n = js("(typeof navigator !== 'undefined' && navigator.hardwareConcurrency) ? navigator.hardwareConcurrency : 1")
        return n.unsafeCast<Int>()
    }

    override fun exec(command: String) {
        // No-op: browsers have no shell.
    }
}
