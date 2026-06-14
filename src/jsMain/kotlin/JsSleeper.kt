/**
 * JS implementation of the [Sleeper] seam.
 *
 * The browser/JS runtime is single-threaded and cooperative — there is no way to
 * block the calling coroutine/frame for a precise wall-clock duration the way
 * [Thread.sleep] does on the JVM.  The rAF game loop ([JsGameLoop]) owns frame
 * pacing, so any [Class327.method2606] call that reaches this implementation is
 * effectively a hint that can safely be ignored.
 *
 * The one [Thread.sleep] site in the codebase is [Class327.method2606].  On the
 * JS path that call is routed through [Sleepers.sleep] → here, so it becomes a
 * no-op and control returns immediately to the caller.  No login-path code relies
 * on the sleep actually blocking: the frame loop drives all cooperative scheduling.
 */
object JsSleeper : Sleeper {
    override fun sleep(millis: Long) {
        // JS cannot block; the rAF game loop owns pacing.
    }
}
