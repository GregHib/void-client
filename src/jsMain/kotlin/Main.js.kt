/**
 * Web bootstrap entry point.
 *
 * Kotlin/JS with `binaries.executable()` runs this `main` on page load. Its job is to
 * install the platform seams the common game code pulls from globals before anything
 * tries to use them. Right now that's the networking seam (Phase 4, this change):
 *
 *   Connections.install(JsSocketOpener())
 *
 * After this runs, any common consumer that calls `Connections.open(...)` (the JS5 pump
 * via Class202, and the game-connect path) gets a [WebSocketConnection] instead of a
 * java.net.Socket — with no awareness that the transport changed.
 *
 * The remaining Phase-4 seams (GameSurface over <canvas>, InputSource over DOM events,
 * OPFS CacheStorage, WebAudio AudioSink) are installed by their own bootstrap slices;
 * this file only owns the networking wiring so the change stays focused.
 */
fun main() {
    Connections.install(JsSocketOpener())
}
