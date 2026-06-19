import java.awt.Component
import TextureHandleStatics.anInt2588

/*
 * Class193
 */
class TextureHandle internal constructor(private val aGlRenderDevice_2585: GlRenderDevice, i: Int, var anInt2584: Int) {
    @Throws(Throwable::class)
    protected fun finalize() {
        anInt2588++
        aGlRenderDevice_2585.method3971(16386, this.anInt2584)
//        super.finalize()
    }
}
