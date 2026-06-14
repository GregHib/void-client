/**
 * Web bootstrap entry point.
 *
 * Kotlin/JS with `binaries.executable()` runs this `main` on page load.  All platform
 * seams are installed via [ClientBootstrap.installCommon] so the ordering contract is
 * shared with the JVM entry point ([Loader.startClient]) and the two cannot drift.
 *
 * Seams with a real JS implementation are passed directly.  Seams whose JS
 * implementation is not yet written are stubbed inline with a TODO comment — they will
 * be replaced as the Phase-4 migration proceeds (see docs/KMP_MIGRATION.md steps 6–14).
 */
fun main() {
    // TODO(Phase-4): replace stubs below with real JS implementations as they land.

    val jsGlyphFactory: (DisplayTarget) -> GlyphRasterizer = { _ -> JsGlyphRasterizer() }

    val jsWindowShell = JsWindowShell()

    ClientBootstrap.installCommon(
        workers = JsWorkerFactory,
        gameLoop = JsGameLoop(),
        sleeper = JsSleeper,
        logger = object : GameLogger { override fun log(string: String, i: Int) { console.log("[$i] $string") } },
        runtimeInfo = JsRuntimeInfo(),
        glyphRasterizerFactory = jsGlyphFactory,
        clipboard = null, // TODO: navigator.clipboard wrapper
        socketOpener = JsSocketOpener(),
        windowShell = jsWindowShell,
    )
}
