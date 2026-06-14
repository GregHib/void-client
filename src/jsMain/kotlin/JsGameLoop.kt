import kotlinx.browser.window

/**
 * JS implementation of [GameLoop] that drives [GameFrame.runFrame] via
 * `requestAnimationFrame`.  Each rAF tick calls runFrame() once; if runFrame
 * returns false the loop stops (client shutting down).
 *
 * This is the structural pivot for the single-threaded web runtime: because JS
 * cannot block the event loop, the JVM blocking while-loop is replaced by
 * scheduling the next tick only after the current frame completes.
 */
class JsGameLoop : GameLoop {
    override fun run(frame: GameFrame) {
        fun tick() {
            if (frame.runFrame()) {
                window.requestAnimationFrame { tick() }
            }
        }
        window.requestAnimationFrame { tick() }
    }
}
