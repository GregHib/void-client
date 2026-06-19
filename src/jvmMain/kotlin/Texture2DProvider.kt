import java.io.FileOutputStream
import kotlin.math.ln
import kotlin.math.pow

abstract class Texture2DProvider : CircleRasterizer() {
    abstract fun method2256(i: Byte): GlTextureCubeMap?
}
