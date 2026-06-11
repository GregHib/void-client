/**
 * JVM implementation of the [Sleeper] seam, wrapping Thread.sleep.
 *
 * Swallows InterruptedException to preserve the original Class327.method2606
 * behaviour exactly.
 */
object ThreadSleeper : Sleeper {
    override fun sleep(millis: Long) {
        try {
            Thread.sleep(millis)
        } catch (interruptedexception: InterruptedException) {
            /* empty */
        }
    }
}
