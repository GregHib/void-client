import kotlin.jvm.JvmStatic
import MidiSequencePlayer.Companion.method2878
import RangeThresholdTextureNode.Companion.method3055
import OggMediaStream.Companion.method520
import jaggl.OpenGL.Companion.glTexImage2Di
import OpenGlRenderNode.Companion.method3297
import lang.Class
import lang.jClass

class GlCubeMapTexture internal constructor(glRenderDevice: GlRenderDevice?, i: Int, bool: Boolean, `is`: Array<IntArray?>?) : GlTextureBase(glRenderDevice, 34067, GroundItemRenderState.aTextureFormatInfo_1662, MovementDirection.aMovementDirection_1183, 6 * (i * i), bool), RenderableCubeTexture {
    init {
        try {
            this.aGlRenderDevice_5082!!.method3850((-109).toByte(), this)
            if (bool) {
                for (i_1_ in 0..5) this.method233(i, i, `is`!![i_1_]!!, i_1_ + 34069, 255)
            } else {
                for (i_0_ in 0..5) glTexImage2Di(34069 + i_0_, 0, this.method228(121), i, i, 0, method3055(110, this.aTextureFormatInfo_5084), (this.aGlRenderDevice_5082!!.anInt9918), `is`!![i_0_], 0)
            }
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("le.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    companion object {

        var anInt8619: Int = 0

        var anInt8620: Int = 0

        var aDouble8621: Double = 0.0

        var anInt8622: Int = 0

        /*synthetic*/
        var aClass8623: Class<*>? = null

        @JvmStatic
        fun method243(i: Int) {
            anInt8620++
            var randomAccessFileOnDisk: RandomAccessFileOnDisk? = null
            try {
                val class144 = VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.method2233((-46).toByte(), "", true)
                while (class144!!.anInt1997 == 0) TexGenMaterialPass.method2161((-122).toByte(), 1L)
                if (class144.anInt1997 == 1) {
                    randomAccessFileOnDisk = class144.anObject1998 as RandomAccessFileOnDisk?
                    val class348_sub49 = IntHashSetStatics.aClass348_Sub51_3959!!.method3427(24)
                    randomAccessFileOnDisk!!.method1658(114.toByte(), 0, (class348_sub49.anInt7197), (class348_sub49.aByteArray7154))
                }
            } catch (exception: Exception) {
                /* empty */
            }
            do {
                try {
                    if (i != 37) aDouble8621 = -0.46512114956219314
                    if (randomAccessFileOnDisk == null) break
                    randomAccessFileOnDisk.method1657(false)
                } catch (exception: Exception) {
                    break
                }
                break
            } while (false)
        }

        @JvmStatic
        fun method244(i: Int): Int {
            anInt8622++
            if (MapRegionLoader.aFloat1249.toDouble() == 3.0) return 37
            if (i != 37) return 11
            if (MapRegionLoader.aFloat1249.toDouble() == 4.0) return 50
            if (MapRegionLoader.aFloat1249.toDouble() == 6.0) return 75
            if (MapRegionLoader.aFloat1249.toDouble() == 8.0) return 100
            return 200
        }

        @JvmStatic
        fun method245(i: Int, i_2_: Int, i_3_: Int, i_4_: Byte): Boolean {
            if (i_4_ < 38) return false
            anInt8619++
            var renderTarget = method3297(i, i_2_, i_3_) as RenderTarget?
            var bool = true
            if (renderTarget != null) bool = bool and method520(renderTarget, -1)
            renderTarget = (ClickFeedbackTask.method1353(i, i_2_, i_3_, (if (aClass8623 != null) aClass8623 else (RenderTarget::class.jClass.also { aClass8623 = it }))) as RenderTarget?)
            if (renderTarget != null) bool = bool and method520(renderTarget, -1)
            renderTarget = method2878(i, i_2_, i_3_) as RenderTarget?
            if (renderTarget != null) bool = bool and method520(renderTarget, -1)
            return bool
        }
    }
}
