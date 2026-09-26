package awt

import kotlinx.browser.localStorage

/**
 * Integer interface scale for the browser client. The AWT shim reports every size and position
 * divided by [factor], so the client lays itself out in a smaller logical space; only the WebGL
 * calls that take window pixels ([jaggl.OpenGL]) multiply back up. Projections map to NDC, so the
 * 3D scene still fills the full physical drawing buffer while the 2D interfaces come out
 * [factor]x larger.
 */
object UiScale {
    const val MIN = 1
    const val MAX = 4
    private const val STORAGE_KEY = "uiScale"

    var factor: Int = load()
        private set

    fun set(scale: Int) {
        factor = scale.coerceIn(MIN, MAX)
        try {
            localStorage.setItem(STORAGE_KEY, factor.toString())
        } catch (_: Throwable) {
        }
    }

    private fun load(): Int = try {
        localStorage.getItem(STORAGE_KEY)?.toIntOrNull()?.coerceIn(MIN, MAX) ?: MIN
    } catch (_: Throwable) {
        MIN
    }
}
