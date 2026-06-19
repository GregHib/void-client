import jaclib.memory.heap.NativeHeap
import jaggl.OpenGLStatics.glBindProgramARB
import jaggl.OpenGLStatics.glGenProgramARB
import jaggl.OpenGLStatics.glGetIntegerv
import jaggl.OpenGLStatics.glProgramRawARB
import kotlin.math.atan2

object ArbVertexProgramStatics {
    @JvmField
            var anInt9777: Int = 0
            @JvmField
            var anInt9778: Int = 0
            @JvmField
            var anInt9779: Int = 0
            @JvmField
            var regionTileX: Int = 0
            @JvmField
            var aRectangleRegion_9781: RectangleRegion?
            @JvmField
            var aBoolean9783: Boolean = false
    
            @JvmStatic
            fun method3442(i: Int, `is`: ByteArray?, glRenderDevice: GlRenderDevice?, i_0_: Int): TextureHandle? {
                try {
                    anInt9779++
                    if (`is` == null) return null
                    val i_1_ = glGenProgramARB()
                    glBindProgramARB(i, i_1_)
                    glProgramRawARB(i, 34933, `is`)
                    glGetIntegerv(34379, SoftwareSpriteRasterStatics.anIntArray1626, 0)
                    if (SoftwareSpriteRasterStatics.anIntArray1626!![0] != -1) {
                        glBindProgramARB(i, 0)
                        return null
                    }
                    glBindProgramARB(i, 0)
                    if (i_0_ != 4) return null
                    return TextureHandle(glRenderDevice!!, i, i_1_)
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("cu.A(" + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (glRenderDevice != null) "{...}" else "null") + ',' + i_0_ + ')'))
                }
            }
    
            @JvmStatic
            fun method3443(bool: Boolean, class318_sub1_sub3_sub3: ProjectedGroundDecor) {
                anInt9778++
                if ((class318_sub1_sub3_sub3.anIntArray10242) != null || (class318_sub1_sub3_sub3.anIntArray10296) != null) {
                    var bool_2_ = bool
                    for (i in (class318_sub1_sub3_sub3.anIntArray10242)!!.indices) {
                        var i_3_ = -1
                        if ((class318_sub1_sub3_sub3.anIntArray10242) != null) i_3_ = (class318_sub1_sub3_sub3.anIntArray10242!![i])
                        if (i_3_ == -1) {
                            if (!class318_sub1_sub3_sub3.method2423(-80, i, -1)) bool_2_ = false
                        } else {
                            bool_2_ = false
                            val bool_4_ = false
                            val bool_5_ = false
                            val i_6_: Int
                            val i_7_: Int
                            if ((i_3_ and 0x3fffffff.inv()) == -1073741824) {
                                val i_8_ = i_3_ and 0xfffffff
                                val i_9_ = i_8_ shr 14
                                i_7_ = (class318_sub1_sub3_sub3.x) - 512 * (i_9_ - regionTileX) - 256
                                val i_10_ = i_8_ and 0x3fff
                                i_6_ = (-256 - (i_10_ - RegionMapDecoder.regionTileY) * 512 + (class318_sub1_sub3_sub3.y))
                            } else if ((0x8000 and i_3_) == 0) {
                                val class348_sub22 = (NpcEntityUpdater.aHashtable_3654!!.method3480(i_3_.toLong(), -6008) as? NpcReference?)
                                if (class348_sub22 == null) {
                                    class318_sub1_sub3_sub3.method2423(-96, i, -1)
                                    continue
                                }
                                val npc = (class348_sub22.aNpc_6859)!!
                                i_6_ = ((class318_sub1_sub3_sub3.y) - npc.y)
                                i_7_ = (-(npc.x) + (class318_sub1_sub3_sub3.x))
                            } else {
                                val i_11_ = i_3_ and 0x7fff
                                val player = (LoadingBarRendererStatics.aPlayerArray5058!![i_11_])
                                if (player == null) {
                                    class318_sub1_sub3_sub3.method2423(67, i, -1)
                                    continue
                                }
                                i_6_ = ((class318_sub1_sub3_sub3.y) - player.y)
                                i_7_ = (-(player.x) + (class318_sub1_sub3_sub3.x))
                            }
                            if (i_7_ != 0 || i_6_ != 0) class318_sub1_sub3_sub3.method2423(-100, i, 0x3fff and (atan2(i_7_.toDouble(), i_6_.toDouble()) * 2607.5945876176133).toInt())
                        }
                    }
                    if (bool_2_) {
                        class318_sub1_sub3_sub3.anIntArray10242 = null
                        class318_sub1_sub3_sub3.anIntArray10296 = null
                    }
                }
            }
    
            @JvmStatic
            fun method3444(i: Int) {
                if (i <= -85) aRectangleRegion_9781 = null
            }
    
            init {
                aRectangleRegion_9781 = RectangleRegion(14, 0, 4, 1)
            }
}
