/**
 * Platform seam for the in-game console log (method94).
 *
 * The JVM implementation timestamps the message, prepends it to the on-screen
 * log ring-buffer ([Class286_Sub1.aStringArray6200]), and optionally writes it
 * to [Class299_Sub1.aFileOutputStream6323].  Non-JVM targets can supply a
 * lightweight alternative (e.g. println) via [GameLoggers.install].
 *
 * Install the platform impl once at startup via [GameLoggers.install]; all
 * commonMain call-sites reach it through [GameLoggers.log].
 */
interface GameLogger {
    fun log(string: String, i: Int)
}

object GameLoggers {
    /** No-op default so common code never NPEs before a platform installs its impl. */
    private var current: GameLogger = object : GameLogger {
        override fun log(string: String, i: Int) { /* no platform logger installed */ }
    }

    fun install(logger: GameLogger) {
        current = logger
    }

    fun log(string: String, i: Int) {
        current.log(string, i)
    }
}
