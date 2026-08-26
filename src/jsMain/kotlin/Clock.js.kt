import lang.performance

actual object Clock {
    actual fun millis(): Long = kotlin.js.Date.now().toLong()

    /**
     * `performance.now()` is relative to the page load, so on its own it starts at ~0 - and
     * NanoTimerJagex's init throws RuntimeException when nanos() == 0, which would demote us to
     * the fallback timers in RenderConfigFactory.method1631. Adding timeOrigin makes this a real
     * wall-clock nanosecond value that is never 0.
     */
    actual fun nanos(): Long {
        val origin = (performance.timeOrigin as? Double) ?: 0.0
        val now = (performance.now() as? Double) ?: 0.0
        return ((origin + now) * 1_000_000.0).toLong()
    }
}
