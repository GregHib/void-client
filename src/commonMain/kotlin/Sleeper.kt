/**
 * Platform seam for blocking the current worker for a number of milliseconds.
 *
 * The whole client funnels every sleep through Class327.method2606, which is the
 * only Thread.sleep site in the codebase. Routing it through this interface keeps
 * the JVM behaviour byte-identical while letting non-JVM targets (web: cooperative
 * yield / no-op, native: nanosleep) supply their own implementation.
 *
 * Install the platform impl once at startup via [Sleepers.install]; commonMain code
 * calls [Sleepers.sleep].
 */
interface Sleeper {
    fun sleep(millis: Long)
}

object Sleepers {
    /** No-op default so common code never NPEs before a platform installs its impl. */
    private var current: Sleeper = object : Sleeper {
        override fun sleep(millis: Long) { /* no platform sleeper installed */ }
    }

    fun install(sleeper: Sleeper) {
        current = sleeper
    }

    fun sleep(millis: Long) {
        current.sleep(millis)
    }
}
