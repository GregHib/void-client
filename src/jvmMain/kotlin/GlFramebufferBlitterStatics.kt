import SceneEntityStatics.method2383
import jaggl.OpenGLStatics.glBegin
import jaggl.OpenGLStatics.glBlitFramebufferEXT
import jaggl.OpenGLStatics.glEnd
import jaggl.OpenGLStatics.glMultiTexCoord2f
import jaggl.OpenGLStatics.glTexCoord2f
import jaggl.OpenGLStatics.glVertex2i
import kotlin.math.min

object GlFramebufferBlitterStatics {
    @JvmField
            var anInt270: Int = 0
            @JvmField
            var anInt271: Int = 0
            @JvmField
            var anInt272: Int = 0
            @JvmField
            var anInt273: Int = 0
            @JvmField
            var anInt274: Int = 0
            @JvmField
            var anInt277: Int = 0
            @JvmField
            var anInt278: Int = 0
            @JvmField
            var anIntArray279: IntArray? = IntArray(2048)
            @JvmField
            var anInt280: Int = 0
            @JvmField
            var anInt282: Int = 0
            @JvmField
            var anInt283: Int = 0
            @JvmField
            var anInt288: Int = 0
            @JvmField
            var anInt291: Int = 0
            fun method271(i: Int, widgetComponent: WidgetComponent, i_0_: Byte, i_1_: Int) {
                anInt278++
                val var_aa = widgetComponent.method425(FacingDirectionNodeStatics.aRenderer6654!!, 19.toByte())
                if (var_aa != null) {
                    FacingDirectionNodeStatics.aRenderer6654!!.KA(i_1_, i, widgetComponent.anInt709 + i_1_, i - -widgetComponent.anInt789)
                    if (KeyboardLayoutCacheStatics.anInt3306 >= 3) FacingDirectionNodeStatics.aRenderer6654!!.A(-16777216, var_aa, i_1_, i)
                    else NpcTypeStatics.aAbstractModelRenderer_1365!!.method976((widgetComponent.anInt709.toFloat() / 2.0f + i_1_.toFloat()), i.toFloat() + widgetComponent.anInt789.toFloat() / 2.0f, 4096, (0x3fff and -ResourceProviderStatics.aFloat3938.toInt()) shl 2, var_aa, i_1_, i)
                }
            }
    
            @JvmStatic
            fun method273(widgetComponent: WidgetComponent, i: Int) {
                anInt288++
                if (widgetComponent.anInt774 == 5 && widgetComponent.anInt812 != -1) method2383(FacingDirectionNodeStatics.aRenderer6654, -2, widgetComponent)
            }
    
            @JvmStatic
            fun method277(i: Byte) {
                if (i >= 77) anIntArray279 = null
            }
    
            @JvmStatic
            fun method282(i: Int, var_renderer: Renderer?, i_21_: Int, i_22_: Byte, i_23_: Int, i_24_: Int, i_25_: Int, i_26_: Int) {
                anInt274++
                CameraRotationStubStatics.aRenderer326 = var_renderer
                NpcConfigStatics.aAbstractCameraTransform_905 = CameraRotationStubStatics.aRenderer326!!.method3654()
                MapSceneRenderer.aAbstractCameraTransform_624 = CameraRotationStubStatics.aRenderer326!!.method3654()
                RenderNodeStatics.aAbstractCameraTransform_9720 = CameraRotationStubStatics.aRenderer326!!.method3654()
                FileExistsConditionStatics.anInt4784 = i_26_
                SceneryDetailOptionStateStatics.anInt6095 = 0
                if (i_22_ <= 64) anIntArray279 = null
                ByteStoreStatics.anInt4267 = i_23_
                MaterialPassStatics.anInt3682 = 0
                DirectionPathStatics.anInt1067 = i_24_
                WidgetDefinitionStatics.anSpriteDrawTarget_252 = null
                ByteBufferStatics.anInt7207 = 1
                BloomGraphicsOptionStateStatics.anInt5965 = i
                WhirlpoolHashStatics.method828(38.toByte(), i_25_, i_21_)
            }
}
