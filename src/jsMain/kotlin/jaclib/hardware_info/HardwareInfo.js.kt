package jaclib.hardware_info

import kotlinx.browser.document
import lang.PlatformRuntime
import lang.navigator
import org.w3c.dom.HTMLCanvasElement

/**
 * ClientMachineInfo.cPUInfo[6] (system memory in MB) feeds a "low memory -> force Safe Mode"
 * heuristic (ClientLoadStateMachine.method1278). navigator.deviceMemory is a coarse, capped
 * (0.25-8) GiB bucket and only available on Chromium; falling back to a generous constant avoids
 * ever mistakenly tripping that heuristic on browsers that don't expose it (Firefox/Safari).
 */
private const val FALLBACK_MEMORY_MB = 4096

actual object HardwareInfo {
    // DirectX diagnostics have no browser equivalent; JagDx is unreachable on JS regardless.
    actual val dXDiagDisplayDevicesProps: Array<Array<String?>?>?
        get() = null

    actual val cPUInfo: IntArray?
        get() = try {
            intArrayOf(0, 0, 0, PlatformRuntime.availableProcessors(), 0, 0, deviceMemoryMb())
        } catch (e: Throwable) {
            null
        }

    actual val openGLProps: Array<String?>?
        get() = webGlRendererInfo()

    actual val dXDiagSystemProps: Array<String?>?
        get() = null

    private fun deviceMemoryMb(): Int {
        return try {
            val gib = navigator.deviceMemory
            if (gib != undefined) ((gib as Double) * 1024.0).toInt() else FALLBACK_MEMORY_MB
        } catch (e: Throwable) {
            FALLBACK_MEMORY_MB
        }
    }

    private fun webGlRendererInfo(): Array<String?>? {
        return try {
            val canvas = document.createElement("canvas") as HTMLCanvasElement
            val gl = canvas.asDynamic().getContext("webgl2") ?: canvas.asDynamic().getContext("webgl")
            if (gl == null || gl == undefined) return null
            val debugInfo = gl.getExtension("WEBGL_debug_renderer_info")
            val vendor: String?
            val renderer: String?
            if (debugInfo != null && debugInfo != undefined) {
                vendor = gl.getParameter(debugInfo.UNMASKED_VENDOR_WEBGL) as? String
                renderer = gl.getParameter(debugInfo.UNMASKED_RENDERER_WEBGL) as? String
            } else {
                vendor = gl.getParameter(gl.VENDOR) as? String
                renderer = gl.getParameter(gl.RENDERER) as? String
            }
            arrayOf(vendor, renderer)
        } catch (e: Throwable) {
            null
        }
    }
}
