/**
 * JVM implementation of the [GameLoop] seam: a plain blocking while-loop on the
 * game thread, matching the original inline loop in Applet_Sub1.run().
 *
 * Pacing happens inside the frame body (Class241.method1861 -> Sleeper), so this
 * driver only owns iteration.
 */
object BlockingGameLoop : GameLoop {
    override fun run(frame: GameFrame) {
        while (frame.runFrame()) { /* keep looping until shutdown */ }
    }
}
