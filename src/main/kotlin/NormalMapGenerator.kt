import ObjectByteSerializerHolder.Companion.method1331
import GrowableStringList.Companion.method1357
import MinimapSquareDrawer.Companion.method461
import SolidFillComponent.Companion.method194
import kotlin.math.sqrt

/* Class269 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class NormalMapGenerator internal constructor(private val aHa_Sub3_3457: NativeRenderer) {
    var anInterface18_Impl1_3452: Interface18_Impl1? = null
    private var anInterface18_Impl3Array3454: Array<Interface18_Impl3?>? = null
    var anInterface18_Impl1_3455: Interface18_Impl1? = null
    var aBoolean3458: Boolean
    var anInterface18_Impl3Array3459: Array<Interface18_Impl3?>? = null
    fun method2039(i: Int): Boolean {
        anInt3461++
        if (i < 81) this.anInterface18_Impl1_3452 = null
        if (!this.aBoolean3458) {
            return this.anInterface18_Impl3Array3459 != null
        }
        return this.anInterface18_Impl1_3452 != null
    }

    fun method2041(i: Byte): Boolean {
        if (i < 42) aFloat3462 = 2.1357973f
        if (this.anInterface18_Impl1_3455 == null) {
            if (NodeDeque.Companion.anObject3331 == null) {
                val `is` = method194(128, -1922, 8, 0.6f, 128, 4.0f, 4.0f, 0.5f, 16.0f, PerlinTextureProvider(419684), 16)
                NodeDeque.Companion.anObject3331 = method1357(`is`, false, 87.toByte())
            }
            val `is` = method461(false, NodeDeque.Companion.anObject3331, 53146732)
            val is_0_ = ByteArray(4 * `is`!!.size)
            var i_1_ = 0
            for (i_2_ in 0..15) {
                var i_3_ = 128 * (i_2_ * 128)
                val i_4_ = i_3_
                for (i_5_ in 0..127) {
                    val i_6_ = 128 * i_5_ + i_4_
                    val i_7_ = (0x7f and -1 + i_5_) * 128 + i_4_
                    val i_8_ = i_4_ + 128 * (0x7f and 1 + i_5_)
                    for (i_9_ in 0..127) {
                        val f = ((`is`[i_9_ + i_7_].toInt() and 0xff) - (`is`[i_9_ + i_8_].toInt() and 0xff)).toFloat()
                        val f_10_ = ((0xff and `is`[(-1 + i_9_ and 0x7f) + i_6_].toInt()) - (0xff and `is`[i_6_ - -(i_9_ - -1 and 0x7f)].toInt())).toFloat()
                        val f_11_ = (128.0 / (sqrt((f * f + (16384.0f + f_10_ * f_10_)).toDouble()))).toFloat()
                        is_0_[i_1_++] = (f_10_ * f_11_ + 127.0f).toInt().toByte()
                        is_0_[i_1_++] = (128.0f * f_11_ + 127.0f).toInt().toByte()
                        is_0_[i_1_++] = (f_11_ * f + 127.0f).toInt().toByte()
                        is_0_[i_1_++] = `is`[i_3_++]
                    }
                }
            }
            this.anInterface18_Impl1_3455 = aHa_Sub3_3457.method3872(16, 128, GroundItemRenderState.aTextureFormatInfo_1662, true, 128, is_0_)
        }
        anInt3456++
        return this.anInterface18_Impl1_3455 != null
    }

    init {
        this.aBoolean3458 = aHa_Sub3_3457.aBoolean8159
        if (this.aBoolean3458 && !aHa_Sub3_3457.method3931(true, SpriteSheetCache.aTextureFormatInfo_2571, Class68.aClass68_1183)) this.aBoolean3458 = false
        if (this.aBoolean3458 || aHa_Sub3_3457.method3880(Class68.aClass68_1183, SpriteSheetCache.aTextureFormatInfo_2571, 123.toByte())) {
            OutputStream_Sub1.method134((-126).toByte())
            if (this.aBoolean3458) {
                var `is` = method461(false, CompiledScriptCache.anObject4366, 53146732)
                this.anInterface18_Impl1_3452 = aHa_Sub3_3457.method3872(16, 128, SpriteSheetCache.aTextureFormatInfo_2571, true, 128, `is`)
                `is` = method461(false, BoxedIntHolder.anObject2969, 53146732)
                aHa_Sub3_3457.method3872(16, 128, SpriteSheetCache.aTextureFormatInfo_2571, true, 128, `is`)
            } else {
                this.anInterface18_Impl3Array3459 = arrayOfNulls<Interface18_Impl3>(16)
                for (i in 0..15) {
                    val `is` = method1331(100.toByte(), CompiledScriptCache.anObject4366, 128 * (i * 128 * 2), 32768)
                    this.anInterface18_Impl3Array3459!![i] = aHa_Sub3_3457.method3944(`is`, 128, SpriteSheetCache.aTextureFormatInfo_2571, 2, true, 128)
                }
                anInterface18_Impl3Array3454 = arrayOfNulls<Interface18_Impl3>(16)
                for (i in 0..15) {
                    val `is` = method1331(120.toByte(), BoxedIntHolder.anObject2969, 128 * (128 * i) * 2, 32768)
                    anInterface18_Impl3Array3454!![i] = aHa_Sub3_3457.method3944(`is`, 128, SpriteSheetCache.aTextureFormatInfo_2571, 2, true, 128)
                }
            }
        }
    }

    companion object {
        var anInt3450: Int = 0
        @JvmField
        var anInt3451: Int = 0
        @JvmField
        var aParticleAmountCache_3453: ParticleAmountCache? = null
        var anInt3456: Int = 0
        @JvmField
        var anInt3460: Int = 0
        var anInt3461: Int = 0
        var aFloat3462: Float = 0f

        fun method2040(i: Int, bool: Boolean) {
            MapSceneDefLoader.anInt2482 = i
            if (bool != true) aFloat3462 = -0.54794437f
            anInt3450++
            synchronized(WidgetRedrawRegion.aClass60_4254!!) {
                WidgetRedrawRegion.aClass60_4254!!.method590(0)
            }
        }

        @JvmStatic
        fun method2042(i: Byte) {
            if (i.toInt() == -67) aParticleAmountCache_3453 = null
        }
    }
}
