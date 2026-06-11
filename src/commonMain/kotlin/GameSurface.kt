/**
 * Presentation seam for the software renderer (KMP_MIGRATION §4, plan Phase 3.3).
 *
 * A [GameSurface] owns an ARGB8888 pixel buffer that the software renderer (`ha_Sub1`)
 * writes into directly, and knows how to present a sub-rectangle of that buffer to a
 * platform display target with clipping. On JVM the actual is a thin wrapper over the
 * existing `Class348_Sub31_Sub1` blit object (BufferedImage over a DataBufferInt with
 * `DirectColorModel(32, 0xFF0000, 0xFF00, 0xFF)`), so behaviour stays byte-identical; web
 * and native impls land in later phases.
 *
 * Scope notes (see docs/KMP_GAMESURFACE_SCOPING.md):
 *  - exactly one surface is live per renderer (a renderer is bound to a single canvas);
 *  - the off-screen render path (`Class49`/`Interface4`) is already pure in-memory and is
 *    NOT a GameSurface concern;
 *  - the legacy `Class348_Sub31_Sub2` ImageProducer fallback stays JVM-only and the seam is
 *    deliberately not shaped around it.
 *
 * Nothing implements or consumes this yet — it is introduced ahead of the JVM actual and
 * the `ha_Sub1` re-point so each move step keeps the JVM build green.
 */
interface GameSurface {
    /** Surface width in pixels (mirrors `Class348_Sub31.anInt6917`). */
    val width: Int

    /** Surface height in pixels (mirrors `Class348_Sub31.anInt6920`). */
    val height: Int

    /**
     * The ARGB8888 pixel buffer, length [width] * [height], row-major. The renderer writes
     * into this array directly (mirrors `Class348_Sub31.anIntArray6916`).
     */
    val pixels: IntArray

    /**
     * Present a sub-rectangle of [pixels] to the display, with clipping. Mirrors
     * `Class348_Sub31.method3011` exactly; parameter shape is preserved so the JVM actual is
     * a verbatim delegate:
     *
     * @param clipX      destination/clip rectangle x (was `i_3_`).
     * @param clipY      destination/clip rectangle y (was `i`).
     * @param width      rectangle width (was `i_4_`).
     * @param height     rectangle height (was `i_1_`).
     * @param srcX       source x offset subtracted from the draw position (was `i_0_`).
     * @param srcY       source y offset subtracted from the draw position (was `i_5_`).
     * @param restoreClip when true, restore the surface's previous clip afterwards (the call
     *                    sites always pass the original `-1` flag meaning "restore").
     */
    fun present(
        clipX: Int,
        clipY: Int,
        width: Int,
        height: Int,
        srcX: Int,
        srcY: Int,
        restoreClip: Boolean,
    )

    /** Release any platform resources held by the surface (mirrors `method2715` disposal). */
    fun dispose()
}

/**
 * Creates a [GameSurface] of a given size bound to a platform display target.
 *
 * On JVM the actual mirrors `Class110.method1035`: try the BufferedImage surface first, fall
 * back to the legacy ImageProducer surface only if construction throws. [target] is the opaque
 * per-platform display handle ([DisplayTarget]); on JVM it carries the AWT `Canvas` plus the
 * `Graphics` used at present time, and supplies the size that `ha_Sub1` reads via `canvas.getSize()`.
 */
interface GameSurfaceFactory {
    fun create(target: DisplayTarget, width: Int, height: Int): GameSurface
}

/**
 * Opaque per-platform display handle the renderer presents into. JVM wraps an AWT `Canvas`
 * (+ its `Graphics`); web will wrap a `<canvas>`/2D context; native a GL-textured quad. The
 * only portable thing common code needs from it is its [width]/[height]; everything else is
 * platform-private and consumed inside the platform [GameSurface] implementation.
 */
interface DisplayTarget {
    val width: Int
    val height: Int

    /** Ask the platform to repaint the display (renderer's blit-failure recovery path). */
    fun requestRepaint()
}
