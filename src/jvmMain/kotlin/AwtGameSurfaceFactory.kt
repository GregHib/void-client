/**
 * JVM [GameSurfaceFactory]: creates the AWT-backed software surface.
 *
 * Delegates to the existing `Class110.method1035`, which tries the BufferedImage surface
 * (`Class348_Sub31_Sub1`) first and falls back to the legacy ImageProducer surface
 * (`Class348_Sub31_Sub2`) only if construction throws — so behaviour is byte-identical to the
 * current renderer. The returned `Class348_Sub31` implements [GameSurface].
 *
 * [target] must be an [AwtDisplayTarget]; the wrapped `Canvas` is threaded into the existing
 * creation path (which keys/binds on it exactly as before).
 */
object AwtGameSurfaceFactory : GameSurfaceFactory {
    override fun create(target: DisplayTarget, width: Int, height: Int): GameSurface {
        val canvas = (target as AwtDisplayTarget).canvas
        // 9029 is method1035's required magic arg; (height, width) order matches its (i_16_, i_17_).
        return Class110.method1035(9029, height, canvas, width)!!
    }
}
