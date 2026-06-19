import GameAppletFrameStatics.method94
import jaggl.OpenGLStatics.glTexImage2Df
import kotlin.math.min
import kotlin.math.pow
import GrayscaleNoiseTextureStatics.method555
import GrayscaleNoiseTextureStatics.anInt5281
import GrayscaleNoiseTextureStatics.anInt5291
import GrayscaleNoiseTextureStatics.anInt5292
import GrayscaleNoiseTextureStatics.anInt5295

open class GrayscaleNoiseTexture(i: Int, i_22_: Int, i_23_: Int, i_24_: Int, i_25_: Int, f: Float, f_26_: Float, f_27_: Float) : NoiseTextureGenerator(i, i_22_, i_23_, i_24_, i_25_) {
    private val anInt5278: Int
    private val anInt5279: Int
    private var anInt5280 = 0
    private var anInt5285: Int
    private var anInt5287 = 0
    private var anInt5289 = 0
    private var anInt5290 = 0
    private lateinit var aByteArray5296: ByteArray
    private val anInt5298: Int
    open fun method550(i: Int, i_0_: Byte, i_1_: Byte) {
        if (i_1_.toInt() != 14) method555(true, -38)
        anInt5281++
        aByteArray5296[i] = i_0_
    }

    public override fun method543(bool: Boolean) {
        anInt5287 = 0
        if (bool != true) method555(false, -53)
        anInt5290 = 0
        anInt5291++
    }

    init {
        anInt5298 = (4096.0f * f_27_).toInt()
        anInt5278 = (f_26_ * 4096.0f).toInt()
        anInt5279 = (0.5.pow(-f.toDouble()) * 4096.0).toInt()
        anInt5285 = anInt5279
    }

    public override fun method546(i: Int, i_40_: Int, i_41_: Int) {
        if (i_41_ == -2) {
            if (i_40_ == 0) {
                anInt5280 = -(if (i >= 0) i else -i) + anInt5278
                anInt5289 = 4096
                anInt5280 = anInt5280 * anInt5280 shr 12
                anInt5290 = anInt5280
            } else {
                anInt5289 = anInt5280 * anInt5298 shr 12
                if (anInt5289 < 0) anInt5289 = 0
                else if (anInt5289 > 4096) anInt5289 = 4096
                anInt5280 = anInt5278 + -(if (i < 0) -i else i)
                anInt5280 = anInt5280 * anInt5280 shr 12
                anInt5280 = anInt5289 * anInt5280 shr 12
                anInt5290 += anInt5280 * anInt5285 shr 12
                anInt5285 = anInt5285 * anInt5279 shr 12
            }
            anInt5292++
        }
    }

    public override fun method541(i: Int) {
        anInt5285 = anInt5279
        anInt5290 = anInt5290 shr 4
        anInt5295++
        if (anInt5290 >= 0) {
            if (anInt5290 > 255) anInt5290 = 255
        } else anInt5290 = 0
        if (i != -1538606516) anInt5289 = 17
        method550(anInt5287++, anInt5290.toByte(), 14.toByte())
        anInt5290 = 0
    }
}
