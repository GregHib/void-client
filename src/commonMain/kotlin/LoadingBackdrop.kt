/**
 * Keeps the last game frame behind the "Loading - please wait." box on platforms whose display
 * surface does not retain it.
 *
 * On the JVM the box is drawn straight over the back buffer, which still holds the last frame, so
 * the game appears frozen with the box on top. A WebGL canvas (preserveDrawingBuffer: false, kept
 * for its per-frame cost) is cleared once the browser has composited it, so the same draw shows
 * the box on black. The JS actuals re-render one game frame as loading begins, copy it to a
 * texture, and draw that under each loading box until loading ends. The JVM actuals do nothing.
 */

/**
 * Called as a region load starts, while the old scene is still intact. [drawFrame] must render a
 * complete game frame into the default framebuffer; it is only invoked where a backdrop is needed.
 */
expect fun captureLoadingBackdrop(drawFrame: () -> Unit)

/** Draws the captured frame over the whole surface, if there is one. */
expect fun drawLoadingBackdrop()

/** Frees the captured frame; called when the client leaves the loading state. */
expect fun releaseLoadingBackdrop()
