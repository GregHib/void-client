/**
 * Common seam-install contract for client startup (KMP_MIGRATION Phase 4).
 *
 * Every platform entry point (JVM [Loader], JS [main]) calls [installCommon] before
 * constructing [Client].  This ensures the ordering is enforced once here rather than
 * duplicated and able to drift between targets.
 *
 * Platform-specific wiring that cannot live here (AWT Frame setup, JS DOM bootstrap,
 * native window creation) stays in the respective entry points.
 */
object ClientBootstrap {

    /**
     * Install all platform-neutral seams that [Client] and its supporting classes depend on.
     *
     * Call order matches the dependency graph:
     *  1. [Workers] — needed by anything that spawns background tasks.
     *  2. [GameLoops] — needed before the frame loop starts.
     *  3. [Sleepers] — needed by [Class327.method2606] (frame pacing).
     *  4. [GameLoggers] — needed by [Client] log calls from the first frame onward.
     *  5. [RuntimeInfoProvider] — needed by memory/CPU queries during init.
     *  6. [GlyphRasterizers] — needed before any font/text rendering.
     *  7. [Clipboards] — optional (null = no clipboard); installed after GlyphRasterizers
     *     since clipboard is only needed at login and later.
     *  8. [Connections] — needed before the JS5 / login socket opens.
     *  9. [CacheStorageFactories] — needed before [Class297] / the signlink opens cache stores.
     * 10. [AudioSinks] — needed before the synth engine ([Class279]) opens a line.
     * 11. [WindowShells] — must be last so all rendering seams are ready before the
     *     shell vends a [DisplayTarget].
     *
     * @param workers            Platform [WorkerFactory] (JVM: [ThreadWorkerFactory]; JS: coroutine-backed).
     * @param gameLoop           Platform [GameLoop] (JVM: [BlockingGameLoop]; JS: rAF-backed).
     * @param sleeper            Platform [Sleeper] (JVM: [ThreadSleeper]; JS: no-op / cooperative yield).
     * @param logger             Platform [GameLogger] (JVM: [JvmGameLogger]; JS: console.log wrapper).
     * @param runtimeInfo        Platform [RuntimeInfo] (JVM: [JvmRuntimeInfo]; JS: stub).
     * @param glyphRasterizerFactory  Factory producing a [GlyphRasterizer] from a [DisplayTarget].
     * @param clipboard          Optional platform clipboard; null when unavailable (headless JVM, sandboxed JS).
     * @param socketOpener       Platform [SocketOpener] (JVM: [JvmSocketOpener]; JS: [JsSocketOpener]).
     * @param cacheStorage       Factory producing a fresh [CacheStorageFactory] per signlink (JVM: [FileCacheStorage]; JS: [OPFSCacheStorage]).
     * @param audioSink          Factory producing a fresh [AudioSink] per synth engine (JVM: [JavaSoundAudioSink]; JS: [WebAudioSink]).
     * @param windowShell        Platform [WindowShell] (JVM: [AwtWindowShell]; JS: [JsWindowShell]).
     */
    fun installCommon(
        workers: WorkerFactory,
        gameLoop: GameLoop,
        sleeper: Sleeper,
        logger: GameLogger,
        runtimeInfo: RuntimeInfo,
        glyphRasterizerFactory: (DisplayTarget) -> GlyphRasterizer,
        clipboard: SystemClipboard?,
        socketOpener: SocketOpener,
        cacheStorage: () -> CacheStorageFactory,
        audioSink: () -> AudioSink,
        windowShell: WindowShell,
    ) {
        Workers.install(workers)
        GameLoops.install(gameLoop)
        Sleepers.install(sleeper)
        GameLoggers.install(logger)
        RuntimeInfoProvider.instance = runtimeInfo
        GlyphRasterizers.install(glyphRasterizerFactory)
        if (clipboard != null) Clipboards.install(clipboard)
        Connections.install(socketOpener)
        CacheStorageFactories.install(cacheStorage)
        AudioSinks.install(audioSink)
        WindowShells.instance = windowShell
    }
}
