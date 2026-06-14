/**
 * Factory seam for [GlyphRasterizer] (plan §4 step 3).
 *
 * All inline `AwtGlyphRasterizer(Class305.aCanvas3869!!)` constructions are
 * replaced with `GlyphRasterizers.factory(currentTarget)`.  The JVM platform
 * installs an AWT-backed factory at startup; the JS platform installs a
 * canvas-2D one (step 9/10 of the migration plan).
 *
 * Default throws so a missing install is caught at runtime rather than
 * silently producing a no-op rasterizer.
 */
object GlyphRasterizers {
    var factory: (DisplayTarget) -> GlyphRasterizer = { _ ->
        error("GlyphRasterizers.factory not installed — call GlyphRasterizers.install() at startup")
    }

    /** Convenience installer called by platform bootstrap code. */
    fun install(f: (DisplayTarget) -> GlyphRasterizer) {
        factory = f
    }
}
