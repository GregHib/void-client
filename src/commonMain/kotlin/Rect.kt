/**
 * Plain integer rectangle — multiplatform replacement for java.awt.Rectangle,
 * limited to the surface the renderers actually use: four mutable fields,
 * a zero-initialised no-arg constructor, and setBounds().
 *
 * This is the first "seam" type: it removes java.awt from the dirty-rectangle
 * signatures threaded through ha and the renderer toolkits, so those signatures
 * become platform-neutral. (The Canvas/GameSurface seam is deferred — the JNI
 * GL/D3D renderers still need the real AWT Canvas.)
 */
class Rect(
    @JvmField var x: Int = 0,
    @JvmField var y: Int = 0,
    @JvmField var width: Int = 0,
    @JvmField var height: Int = 0,
) {
    fun setBounds(x: Int, y: Int, width: Int, height: Int) {
        this.x = x
        this.y = y
        this.width = width
        this.height = height
    }
}
