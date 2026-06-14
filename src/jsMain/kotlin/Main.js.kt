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

    // RuntimeInfo: memory/CPU APIs are not meaningful in a browser sandbox.
    val jsRuntimeInfo = object : RuntimeInfo {
        override fun usedMemoryKb(): Int = 0
        override fun maxMemoryMb(): Int = 256
        override fun availableProcessors(): Int = 1
        override fun exec(command: String) {}
    }

    // GlyphRasterizer: TODO — replace with a Canvas2D-backed rasterizer (Phase-4 step 9).
    val jsGlyphFactory: (DisplayTarget) -> GlyphRasterizer = { _ ->
        error("GlyphRasterizer not yet implemented for JS — Phase-4 step 9")
    }

    // WindowShell: TODO — replace with JsWindowShell backed by the <canvas> element (Phase-4 step 7).
    val jsWindowShell: WindowShell = object : WindowShell {
        override val isFullscreen: Boolean get() = false
        override val clientWidth: Int get() = 765
        override val clientHeight: Int get() = 503
        override val currentDisplayTarget: DisplayTarget? get() = null
        override fun provideDisplayTarget(x: Int, y: Int, width: Int, height: Int, callbacks: AppletWindowCallbacks): DisplayTarget =
            error("WindowShell not yet implemented for JS — Phase-4 step 7")
        override fun repositionCanvas(x: Int, y: Int, width: Int, height: Int) {}
        override fun releaseDisplayTarget(callbacks: AppletWindowCallbacks) {}
        override fun shutdown() {}
    }

    ClientBootstrap.installCommon(
        workers = JsWorkerFactory,
        gameLoop = JsGameLoop(),
        sleeper = JsSleeper,
        logger = object : GameLogger { override fun log(string: String, i: Int) { console.log("[$i] $string") } },
        runtimeInfo = jsRuntimeInfo,
        glyphRasterizerFactory = jsGlyphFactory,
        clipboard = null, // TODO: navigator.clipboard wrapper
        socketOpener = JsSocketOpener(),
        windowShell = jsWindowShell,
    )
}
