import java.awt.Canvas
import java.awt.Graphics

/**
 * JVM [DisplayTarget]: wraps the AWT [Canvas] the software renderer presents into.
 *
 * Common code only ever reads [width]/[height] (today `canvas.getSize()` in `ha_Sub1`). The
 * [canvas] handle and the [graphics] accessor are JVM-private and consumed only inside the
 * JVM [GameSurface] blit (`Class348_Sub31.present` → `method3011`). Identity ([canvas]) is also
 * what the renderer's per-canvas cache keys on today via `canvas.hashCode()`.
 */
class AwtDisplayTarget(@JvmField val canvas: Canvas) : DisplayTarget {
    override val width: Int get() = canvas.size.width
    override val height: Int get() = canvas.size.height

    /** The current paint surface; sourced fresh per present, mirroring `aCanvas7468.getGraphics()`. */
    fun graphics(): Graphics? = canvas.getGraphics()
}
