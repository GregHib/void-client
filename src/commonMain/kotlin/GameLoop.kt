/**
 * Platform seam for driving the client's frame loop.
 *
 * The original loop lives inline in Applet_Sub1.run() as:
 *
 *     while (notQuitting()) {
 *         <run due logic pulses, then update, then render>
 *     }
 *
 * On JVM this is a plain blocking while-loop on the game thread; pacing is handled
 * inside the pulse itself (Class241.method1861 sleeps via the Sleeper seam), so the
 * loop driver only controls iteration, not timing.
 *
 * The web target cannot block the single thread, so it must drive the same frame
 * body from requestAnimationFrame. Expressing the loop as [GameFrame.runFrame] +
 * a platform [GameLoop] lets each target own the iteration strategy without the
 * frame body changing.
 *
 * Install the platform driver once at startup via [GameLoops.install]; JVM defaults
 * to a blocking driver.
 */
fun interface GameFrame {
    /**
     * Execute exactly one frame (due logic pulses + update + render).
     * @return true to keep looping, false when the client is shutting down.
     */
    fun runFrame(): Boolean
}

interface GameLoop {
    /** Drive [frame] until it returns false. May or may not block, per platform. */
    fun run(frame: GameFrame)
}

object GameLoops {
    /** Blocking default so common code has a usable loop even before a platform installs one. */
    private var current: GameLoop = object : GameLoop {
        override fun run(frame: GameFrame) {
            while (frame.runFrame()) { /* keep looping */ }
        }
    }

    fun install(loop: GameLoop) {
        current = loop
    }

    fun run(frame: GameFrame) {
        current.run(frame)
    }
}
