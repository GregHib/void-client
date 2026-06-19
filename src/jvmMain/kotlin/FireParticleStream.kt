import OpenGlRendererStatics.method3802
import java.io.IOException
import java.io.OutputStream
import java.util.*
import kotlin.math.sin
import FireParticleStreamStatics.anInt96

/*
 * OutputStream_Sub1
 */
class FireParticleStream : OutputStream() {
    @Throws(IOException::class)
    override fun write(i: Int) {
        anInt96++
        throw IOException()
    }
}
