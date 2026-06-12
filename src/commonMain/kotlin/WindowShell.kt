/**
 * Window/applet-bootstrap seam (KMP_MIGRATION §4.1, Phase 4).
 *
 * This interface captures the last AWT cluster that was wired directly into game logic
 * (`Client`, `Applet_Sub1`, `GameApplet`):
 *
 *  - `Frame("Jagex")` creation and fullscreen tracking (`Class34.aFrame476`)
 *  - `Container`/insets-based client-area size queries (`Class52.aFrame4904` + insets)
 *  - `Canvas_Sub1` + `AwtDisplayTarget` creation (`Applet_Sub1.method87`)
 *  - `getPulseComponent(): Component?` on `GameApplet`
 *
 * With this seam in place:
 *  - `GameApplet` can move to `commonMain` (returns `DisplayTarget?` instead of `Component?`).
 *  - `Applet_Sub1.method87` canvas-setup and `Client.method116` size-query can route through the
 *    shell instead of touching AWT directly.
 *  - The JVM actual (`AwtWindowShell`) wraps the existing `Frame` / `Canvas_Sub1` behaviour
 *    byte-identically.
 *  - Web/native actuals provide their own `<canvas>` / GLFW window without touching JVM types.
 *
 * Relationship to [DisplayTarget]/[GameSurface]: [WindowShell] owns the lifecycle of the
 * platform window and vends a [DisplayTarget] for the renderer to present into. It is the
 * factory for the [DisplayTarget]; [GameSurfaceFactory] then creates a [GameSurface] from that
 * target. The shell also knows the usable client-area dimensions (post-insets on JVM) which
 * [GameSurface] and `ha_Sub1` read via [DisplayTarget.width]/[height].
 */
interface WindowShell {

    /**
     * True when the client is in a dedicated full-screen [Frame] (`Class34.aFrame476 != null`
     * on JVM). Common code uses this to skip the resize-tracking path and to decide whether
     * to show the resize-hint overlay.
     */
    val isFullscreen: Boolean

    /**
     * Usable client-area width in pixels.
     *
     * On JVM: `container.getSize().width` minus horizontal insets when in a [Frame];
     * equals [Class272.anInt3473] (the authoritative game width) when in the applet panel.
     * On web: the canvas `clientWidth`.
     */
    val clientWidth: Int

    /**
     * Usable client-area height in pixels.
     *
     * On JVM: `container.getSize().height` minus vertical insets when in a [Frame];
     * equals [Class348_Sub22.anInt6857] (the authoritative game height) when in the applet panel.
     * On web: the canvas `clientHeight`.
     */
    val clientHeight: Int

    /**
     * Create (or re-create) the platform canvas and return a [DisplayTarget] bound to it.
     * Also wires focus listeners and makes the canvas visible at the given position/size.
     *
     * Replaces the `Canvas_Sub1` + `AwtDisplayTarget` creation block in `Applet_Sub1.method87`,
     * plus the cleanup of the previous canvas at the top of the same method.
     *
     * @param x         canvas x offset within the container (was `Class348_Sub48.anInt7129`).
     * @param y         canvas y offset within the container (was `Class335.anInt4167`).
     * @param width     canvas width in pixels (was `Class321.anInt4017`).
     * @param height    canvas height in pixels (was `Class348_Sub42_Sub8_Sub2.anInt10432`).
     * @param focusListener  platform-specific focus notification sink; on JVM this is the
     *                       `Applet_Sub1` instance itself (it implements `FocusListener`).
     *                       Typed as [Any] so common code can pass `this` without an AWT import;
     *                       the JVM actual casts it to `FocusListener`.
     * @return the new [DisplayTarget] wrapping the created canvas.
     */
    fun provideDisplayTarget(x: Int, y: Int, width: Int, height: Int, focusListener: Any): DisplayTarget

    /**
     * Move / resize the existing canvas to [x],[y] at [width]×[height] and ensure it is
     * visible. Called from `Applet_Sub1.method88`'s periodic resize heartbeat.
     */
    fun repositionCanvas(x: Int, y: Int, width: Int, height: Int)

    /**
     * Remove the current canvas from its container and release any references to it.
     * Mirrors the cleanup at the top of `Applet_Sub1.method87` and the canvas-removal in
     * `method90`.
     *
     * @param focusListener  the same sink passed to [provideDisplayTarget]; removed from the
     *                       canvas's focus-listener list before detaching.
     */
    fun releaseDisplayTarget(focusListener: Any)

    /**
     * Hide and dispose the platform window. Called from `Applet_Sub1.method90` (shutdown).
     * No-op if the window was never created or has already been disposed.
     */
    fun shutdown()

    /**
     * The [DisplayTarget] most recently returned by [provideDisplayTarget], or `null` if
     * [provideDisplayTarget] has not yet been called or [releaseDisplayTarget] has been called
     * since. Common code reads this instead of [Class305.aDisplayTarget3869] after the seam
     * lands.
     */
    val currentDisplayTarget: DisplayTarget?
}
