import HslColorConfigStatics.method295
import GrayscaleNoiseTextureStatics.method552
import RendererStatics.method3692
import jaggl.OpenGLStatics.glLoadIdentity
import jaggl.OpenGLStatics.glMatrixMode
import jaggl.OpenGLStatics.glScalef
import jaggl.OpenGLStatics.glTranslatef
import java.awt.Canvas

object SoftwareSpriteRasterStatics {
    @JvmField
            var anInt1610: Int = 0
            @JvmField
            var anInt1611: Int = 0
            @JvmField
            var anInt1614: Int = 0
            @JvmField
            var anInt1615: Int = 0
            @JvmField
            var anInt1619: Int = 0
            @JvmField
            var aScreenAnchorAlignment_1620: ScreenAnchorAlignment? = ScreenAnchorAlignment()
            @JvmField
            var anInt1621: Int = 0
            var anIntArray1626: IntArray? = IntArray(1)
            @JvmField
            var aJs5Archive_1627: Js5Archive? = null
            @JvmField
            var anInt1628: Int = 0
            @JvmField
            var anInt1629: Int = 0
            @JvmField
            var anInt1630: Int = 0
    
            @JvmStatic
            fun method953(i: Byte) {
                anIntArray1626 = null
                aJs5Archive_1627 = null
                aScreenAnchorAlignment_1620 = null
                if (i.toInt() != 9) aScreenAnchorAlignment_1620 = null
            }
    
            fun method955(i: Int, i_34_: Int): Boolean {
                if (i != 22311) aScreenAnchorAlignment_1620 = null
                anInt1615++
                return i_34_ >= 4 && i_34_ <= 8
            }
    
            @JvmStatic
            fun method958(bool: Boolean, i: Int, var_renderConfig: RenderConfig?, i_61_: Int, canvas: Canvas?, js5Archive: Js5Archive?): Renderer? {
                try {
                    if (bool != true) aScreenAnchorAlignment_1620 = null
                    anInt1610++
                    var i_62_ = 0
                    var i_63_ = 0
                    if (canvas != null) {
                        val dimension = canvas.size
                        i_63_ = dimension.height
                        i_62_ = dimension.width
                    }
                    return method3692(i_61_, i_63_, i_62_, js5Archive, 0, var_renderConfig, canvas, i)
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("mha.E(" + bool + ',' + i + ',' + (if (var_renderConfig != null) "{...}" else "null") + ',' + i_61_ + ',' + (if (canvas != null) "{...}" else "null") + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
                }
            }
    
            @JvmStatic
            fun method960(i: Int) {
                NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2877(-128)
                anInt1611++
                GlBufferObjectStatics.aClass348_Sub16_Sub3_4743 = null
                SpriteDefinitionStatics.anInt7068 = i
                ModelDefinitionStatics.aJs5Archive_1848 = null
            }
}
