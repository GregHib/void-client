import MidiSequencePlayerStatics.method2878
import RangeThresholdTextureNodeStatics.method3055
import OggMediaStreamStatics.method520
import jaggl.OpenGLStatics.glTexImage2Di
import OpenGlRenderNodeStatics.method3297

object GlCubeMapTextureStatics {
    @JvmField
            var anInt8619: Int = 0
            @JvmField
            var anInt8620: Int = 0
            @JvmField
            var aDouble8621: Double = 0.0
            @JvmField
            var anInt8622: Int = 0
    
            /*synthetic*/
            var aClass8623: Class<*>? = null
    
            @JvmStatic
            fun method243(i: Int) {
                anInt8620++
                var randomAccessFileOnDisk: RandomAccessFileOnDisk? = null
                try {
                    val class144 = VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!.method2233((-46).toByte(), "", true)
                    while (class144!!.anInt1997 == 0) TexGenMaterialPassStatics.method2161((-122).toByte(), 1L)
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
                if (MapRegionLoaderStatics.aFloat1249.toDouble() == 3.0) return 37
                if (i != 37) return 11
                if (MapRegionLoaderStatics.aFloat1249.toDouble() == 4.0) return 50
                if (MapRegionLoaderStatics.aFloat1249.toDouble() == 6.0) return 75
                if (MapRegionLoaderStatics.aFloat1249.toDouble() == 8.0) return 100
                return 200
            }
    
            @JvmStatic
            fun method245(i: Int, i_2_: Int, i_3_: Int, i_4_: Byte): Boolean {
                if (i_4_ < 38) return false
                anInt8619++
                var renderTarget = method3297(i, i_2_, i_3_) as RenderTarget?
                var bool = true
                if (renderTarget != null) bool = bool and method520(renderTarget, -1)
                renderTarget = (ClickFeedbackTaskStatics.method1353(i, i_2_, i_3_, (if (aClass8623 != null) aClass8623 else (RenderTarget::class.java.also { aClass8623 = it }))) as RenderTarget?)
                if (renderTarget != null) bool = bool and method520(renderTarget, -1)
                renderTarget = method2878(i, i_2_, i_3_) as RenderTarget?
                if (renderTarget != null) bool = bool and method520(renderTarget, -1)
                return bool
            }
}
