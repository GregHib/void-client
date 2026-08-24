import kotlin.jvm.JvmStatic
import jaggl.OpenGL.Companion.glBegin
import jaggl.OpenGL.Companion.glBlitFramebufferEXT
import jaggl.OpenGL.Companion.glEnd
import jaggl.OpenGL.Companion.glMultiTexCoord2f
import jaggl.OpenGL.Companion.glTexCoord2f
import jaggl.OpenGL.Companion.glVertex2i
import kotlin.math.min

/*
 * Class18
 */
class GlFramebufferBlitter internal constructor(var_ha_Sub2: OpenGlRenderer) {
    private var anInt275 = 1
    private var anInt276 = 0
    private var aFrameBufferObject_281: FrameBufferObject? = null
    private var aFrameBufferObject_284: FrameBufferObject? = null
    private var aFrameBufferObject_285: FrameBufferObject? = null
    private var anInt286 = 1
    private var anInt287 = 0
    private var aBoolean289 = false
    private val aHa_Sub2_290: OpenGlRenderer
    private val aNodeDeque_292: NodeDeque
    private var aBoolean293: Boolean
    private var aBoolean294: Boolean
    private var aClass258_Sub3Array295: Array<GlTexture2D?>?
    private var aClass348_Sub42_Sub2_296: RenderbufferObject? = null
    private var aBoolean297: Boolean
    private var aClass348_Sub42_Sub2_298: RenderbufferObject? = null
    private var aBoolean299: Boolean
    private var aClass258_Sub3_300: GlTexture2D? = null
    private var anInt301: Int
    private var anInt302: Int
    private var aBoolean303: Boolean

    fun method272(i: Int) {
        anInt277++
        if (aBoolean289) {
            if (aFrameBufferObject_285 != null) {
                aHa_Sub2_290.method3764(-17083, aFrameBufferObject_285)
                var i_2_ = 16384
                aHa_Sub2_290.method3751(aFrameBufferObject_281, -115)
                aFrameBufferObject_285!!.method1505(0, 0)
                aFrameBufferObject_281!!.method1503(0, 3.toByte())
                if (aBoolean303) i_2_ = i_2_ or 0x100
                glBlitFramebufferEXT(0, 0, anInt286, anInt275, 0, 0, anInt286, anInt275, i_2_, 9728)
                aHa_Sub2_290.method3805(8387, aFrameBufferObject_285)
                aHa_Sub2_290.method3782(aFrameBufferObject_281, 327685)
            }
            aHa_Sub2_290.method3792(92)
            aHa_Sub2_290.method3753(0, 1)
            aHa_Sub2_290.method3761(0, 1)
            val i_3_ = 19 % ((i - 12) / 49)
            aHa_Sub2_290.la()
            var i_4_ = 0
            var i_5_ = 1
            var class348_sub5: AbstractBloomEffect?
            var class348_sub5_6_ = aNodeDeque_292.method1995(4) as AbstractBloomEffect?
            while (class348_sub5_6_ != null) {
                class348_sub5 = aNodeDeque_292.method1990(113.toByte()) as AbstractBloomEffect?
                val i_7_ = class348_sub5_6_.method2764(1)
                for (i_8_ in 0..<i_7_) {
                    class348_sub5_6_.method2750(aClass258_Sub3_300, aClass258_Sub3Array295!![i_4_], i_8_, 103.toByte())
                    if (class348_sub5 == null && i_8_ == i_7_ - 1) {
                        aHa_Sub2_290.method3770(-422613672, aFrameBufferObject_281)
                        aHa_Sub2_290.method3790(103, 0, 0)
                        glBegin(7)
                        glTexCoord2f(0.0f, anInt275.toFloat())
                        glMultiTexCoord2f(33985, 0.0f, 1.0f)
                        glVertex2i(anInt287, anInt276)
                        glTexCoord2f(0.0f, 0.0f)
                        glMultiTexCoord2f(33985, 0.0f, 0.0f)
                        glVertex2i(anInt287, anInt276 - -anInt275)
                        glTexCoord2f(anInt286.toFloat(), 0.0f)
                        glMultiTexCoord2f(33985, 1.0f, 0.0f)
                        glVertex2i(anInt287 - -anInt286, anInt276 + anInt275)
                        glTexCoord2f(anInt286.toFloat(), anInt275.toFloat())
                        glMultiTexCoord2f(33985, 1.0f, 1.0f)
                        glVertex2i(anInt286 + anInt287, anInt276)
                        glEnd()
                    } else {
                        aFrameBufferObject_281!!.method1503(i_5_, 3.toByte())
                        glBegin(7)
                        glTexCoord2f(0.0f, anInt275.toFloat())
                        glMultiTexCoord2f(33985, 0.0f, 1.0f)
                        glVertex2i(0, 0)
                        glTexCoord2f(0.0f, 0.0f)
                        glMultiTexCoord2f(33985, 0.0f, 0.0f)
                        glVertex2i(0, anInt275)
                        glTexCoord2f(anInt286.toFloat(), 0.0f)
                        glMultiTexCoord2f(33985, 1.0f, 0.0f)
                        glVertex2i(anInt286, anInt275)
                        glTexCoord2f(anInt286.toFloat(), anInt275.toFloat())
                        glMultiTexCoord2f(33985, 1.0f, 1.0f)
                        glVertex2i(anInt286, 0)
                        glEnd()
                    }
                    class348_sub5_6_.method2756((-80).toByte(), i_8_)
                    i_4_ = i_4_ + 1 and 0x1
                    i_5_ = i_5_ - -1 and 0x1
                }
                class348_sub5_6_ = class348_sub5
            }
            aBoolean289 = false
        }
    }

    fun method274(class348_sub5: AbstractBloomEffect, bool: Boolean): Boolean {
        anInt273++
        if (aFrameBufferObject_284 != null) {
            if (class348_sub5.method2751(bool) || class348_sub5.method2758(85)) {
                aNodeDeque_292.method1999(class348_sub5, -20180)
                method281((-94).toByte())
                if (method276(false)) {
                    if (anInt286 != -1 && anInt275 != -1) class348_sub5.method2754(anInt275, 55.toByte(), anInt286)
                    class348_sub5.aBoolean6621 = true
                    return true
                }
            }
            method278(class348_sub5, true)
        }
        if (bool != true) return false
        return false
    }

    fun method275(i: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int): Boolean {
        if (i_12_ != -1) return true
        anInt272++
        if (aFrameBufferObject_284 == null || aNodeDeque_292.method2002(18.toByte())) return false
        if (anInt286 != i || i_10_ != anInt275) {
            anInt286 = i
            anInt275 = i_10_
            var class348 = aNodeDeque_292.method1995(i_12_ xor 0x4.inv())
            while (aNodeDeque_292.aLinkedListNode_3334 !== class348) {
                (class348 as AbstractBloomEffect).method2754(anInt275, 41.toByte(), anInt286)
                class348 = class348.aLinkedListNode_4294
            }
            aBoolean297 = true
            aBoolean293 = true
            aBoolean294 = true
        }
        if (method276(false)) {
            aBoolean289 = true
            anInt276 = i_11_
            anInt287 = i_9_
            aHa_Sub2_290.method3773(i_12_, aFrameBufferObject_284)
            aFrameBufferObject_284!!.method1503(0, 3.toByte())
            aHa_Sub2_290.method3790(98, (-aHa_Sub2_290.anInt7641 + (anInt275 - -anInt276)), -anInt287)
            return true
        }
        return false
    }

    private fun method276(bool: Boolean): Boolean {
        if (aBoolean293) {
            if (aClass348_Sub42_Sub2_298 != null) {
                aClass348_Sub42_Sub2_298!!.method3172(4)
                aClass348_Sub42_Sub2_298 = null
            }
            if (aClass258_Sub3_300 != null) {
                aClass258_Sub3_300!!.method1952(-19948)
                aClass258_Sub3_300 = null
            }
            if (aFrameBufferObject_285 != null) aClass348_Sub42_Sub2_298 = RenderbufferObject(aHa_Sub2_290, 6402, anInt286, anInt275, (aHa_Sub2_290.anInt7713))
            if (aBoolean303) aClass258_Sub3_300 = GlTexture2D(aHa_Sub2_290, 34037, 6402, anInt286, anInt275)
            else if (aClass348_Sub42_Sub2_298 == null) aClass348_Sub42_Sub2_298 = RenderbufferObject(aHa_Sub2_290, 6402, anInt286, anInt275)
            aBoolean293 = false
            aBoolean294 = true
            aBoolean299 = true
        }
        anInt271++
        if (aBoolean297) {
            if (aClass348_Sub42_Sub2_296 != null) {
                aClass348_Sub42_Sub2_296!!.method3172(4)
                aClass348_Sub42_Sub2_296 = null
            }
            if (aClass258_Sub3Array295!![0] != null) {
                aClass258_Sub3Array295!![0]!!.method1952(-19948)
                aClass258_Sub3Array295!![0] = null
            }
            if (aClass258_Sub3Array295!![1] != null) {
                aClass258_Sub3Array295!![1]!!.method1952(-19948)
                aClass258_Sub3Array295!![1] = null
            }
            if (aFrameBufferObject_285 != null) aClass348_Sub42_Sub2_296 = RenderbufferObject(aHa_Sub2_290, anInt301, anInt286, anInt275, (aHa_Sub2_290.anInt7713))
            aClass258_Sub3Array295!![0] = GlTexture2D(aHa_Sub2_290, 34037, anInt301, anInt286, anInt275)
            aClass258_Sub3Array295!![1] = if (anInt302 > 1) GlTexture2D(aHa_Sub2_290, 34037, anInt301, anInt286, anInt275) else null
            aBoolean294 = true
            aBoolean299 = true
            aBoolean297 = false
        }
        if (bool != false) anInt282 = -21
        if (aBoolean294) {
            if (aFrameBufferObject_285 == null) {
                aHa_Sub2_290.method3773(-1, aFrameBufferObject_281)
                aFrameBufferObject_281!!.method1500(2983, 0)
                aFrameBufferObject_281!!.method1500(2983, 1)
                aFrameBufferObject_281!!.method1500(2983, 8)
                aFrameBufferObject_281!!.method1509(aClass258_Sub3Array295!![0]!!, 0, 0)
                if (anInt302 > 1) aFrameBufferObject_281!!.method1509(aClass258_Sub3Array295!![1]!!, 0, 1)
                if (aBoolean303) aFrameBufferObject_281!!.method1509(aClass258_Sub3_300!!, 0, 8)
                else aFrameBufferObject_281!!.method1508(8, aClass348_Sub42_Sub2_298!!, 114)
                aHa_Sub2_290.method3770(-422613672, aFrameBufferObject_281)
            } else {
                aHa_Sub2_290.method3773(-1, aFrameBufferObject_281)
                aFrameBufferObject_281!!.method1500(2983, 0)
                aFrameBufferObject_281!!.method1500(2983, 1)
                aFrameBufferObject_281!!.method1500(2983, 8)
                aFrameBufferObject_281!!.method1509(aClass258_Sub3Array295!![0]!!, 0, 0)
                if (anInt302 > 1) aFrameBufferObject_281!!.method1509(aClass258_Sub3Array295!![1]!!, 0, 1)
                if (aBoolean303) aFrameBufferObject_281!!.method1509(aClass258_Sub3_300!!, 0, 8)
                aHa_Sub2_290.method3770(-422613672, aFrameBufferObject_281)
                aHa_Sub2_290.method3773(-1, aFrameBufferObject_285)
                aFrameBufferObject_285!!.method1500(2983, 0)
                aFrameBufferObject_285!!.method1500(2983, 8)
                aFrameBufferObject_285!!.method1508(0, aClass348_Sub42_Sub2_296!!, -100)
                aFrameBufferObject_285!!.method1508(8, aClass348_Sub42_Sub2_298!!, -47)
                aHa_Sub2_290.method3770(-422613672, aFrameBufferObject_285)
            }
            aBoolean294 = false
            aBoolean299 = true
        }
        if (aBoolean299) {
            aHa_Sub2_290.method3773(-1, aFrameBufferObject_284)
            aBoolean299 = !aFrameBufferObject_284!!.method1507(118)
            aHa_Sub2_290.method3770(-422613672, aFrameBufferObject_284)
        }
        return !aBoolean299
    }

    fun method278(class348_sub5: AbstractBloomEffect, bool: Boolean) {
        anInt280++
        if (bool == true) {
            class348_sub5.aBoolean6621 = false
            class348_sub5.method2763((-126).toByte())
            class348_sub5.method2715(103.toByte())
            method281((-80).toByte())
        }
    }

    fun method279(i: Byte) {
        val i_13_ = 84 % ((-63 - i) / 56)
        aClass348_Sub42_Sub2_296 = null
        anInt291++
        aFrameBufferObject_281 = null
        aFrameBufferObject_285 = aFrameBufferObject_281
        aFrameBufferObject_284 = aFrameBufferObject_285
        aClass258_Sub3_300 = null
        aClass348_Sub42_Sub2_298 = null
        aClass258_Sub3Array295 = null
        if (!aNodeDeque_292.method2002(18.toByte())) {
            var class348 = aNodeDeque_292.method1995(4)
            while (aNodeDeque_292.aLinkedListNode_3334 !== class348) {
                (class348 as AbstractBloomEffect).method2763((-124).toByte())
                class348 = class348.aLinkedListNode_4294
            }
        }
        anInt275 = 1
        anInt286 = anInt275
    }

    fun method280(i: Int): Boolean {
        anInt270++
        if (i != 1) anInt286 = -99
        return aFrameBufferObject_284 != null
    }

    private fun method281(i: Byte) {
        anInt283++
        var bool = false
        var i_14_ = 0
        var i_15_ = 0
        var class348_sub5 = aNodeDeque_292.method1995(4) as AbstractBloomEffect?
        val i_16_ = 50 / ((-34 - i) / 45)
        while ( /**/class348_sub5 != null) {
            val i_17_ = class348_sub5.method2761(true)
            i_15_ += class348_sub5.method2764(1)
            if (i_14_ < i_17_) i_14_ = i_17_
            bool = bool or class348_sub5.method2759(1)
            class348_sub5 = aNodeDeque_292.method1990(67.toByte()) as AbstractBloomEffect?
        }
        val i_18_: Int
        if (i_14_ != 2) {
            if (i_14_ == 1) i_18_ = 34842
            else i_18_ = 6408
        } else i_18_ = 34836
        if (anInt301 != i_18_) {
            aBoolean297 = true
            anInt301 = i_18_
        }
        val i_19_ = min(anInt302, 2)
        val i_20_ = min(i_15_, 2)
        anInt302 = i_15_
        if (!bool == aBoolean303) {
            aBoolean303 = bool
            aBoolean293 = true
        }
        if (i_20_ != i_19_) {
            aBoolean297 = true
            aBoolean294 = aBoolean297
        }
    }

    init {
        aNodeDeque_292 = NodeDeque()
        aBoolean293 = true
        aClass258_Sub3Array295 = arrayOfNulls<GlTexture2D>(2)
        aBoolean297 = true
        aBoolean294 = true
        aBoolean299 = true
        anInt302 = 0
        anInt301 = -1
        aBoolean303 = false
        aHa_Sub2_290 = var_ha_Sub2
        if (aHa_Sub2_290.aBoolean7820 && aHa_Sub2_290.aBoolean7837) {
            aFrameBufferObject_281 = FrameBufferObject(aHa_Sub2_290)
            aFrameBufferObject_284 = aFrameBufferObject_281
            if (aHa_Sub2_290.anInt7713 > 1 && aHa_Sub2_290.aBoolean7815 && aHa_Sub2_290.aBoolean7807) {
                aFrameBufferObject_285 = FrameBufferObject(aHa_Sub2_290)
                aFrameBufferObject_284 = aFrameBufferObject_285
            }
        }
    }

    companion object {

        var anInt270: Int = 0

        var anInt271: Int = 0

        var anInt272: Int = 0

        var anInt273: Int = 0

        var anInt274: Int = 0

        var anInt277: Int = 0

        var anInt278: Int = 0

        var anIntArray279: IntArray? = IntArray(2048)

        var anInt280: Int = 0

        var anInt282: Int = 0

        var anInt283: Int = 0

        var anInt288: Int = 0

        var anInt291: Int = 0
        fun method271(i: Int, widgetComponent: WidgetComponent, i_0_: Byte, i_1_: Int) {
            anInt278++
            val var_aa = widgetComponent.method425(FacingDirectionNode.aRenderer6654!!, 19.toByte())
            if (var_aa != null) {
                FacingDirectionNode.aRenderer6654!!.KA(i_1_, i, widgetComponent.anInt709 + i_1_, i - -widgetComponent.anInt789)
                if (KeyboardLayoutCache.anInt3306 >= 3) FacingDirectionNode.aRenderer6654!!.A(-16777216, var_aa, i_1_, i)
                else NpcType.aAbstractModelRenderer_1365!!.method976((widgetComponent.anInt709.toFloat() / 2.0f + i_1_.toFloat()), i.toFloat() + widgetComponent.anInt789.toFloat() / 2.0f, 4096, (0x3fff and -CameraDistanceOptionState.aFloat3938.toInt()) shl 2, var_aa, i_1_, i)
            }
        }

        var anInt6385: Int = 0
        fun method2383(var_renderer: Renderer?, i: Int, widgetComponent: WidgetComponent?) {
            do {
                try {
                    anInt6385++
                    val bool = ((ClientException.aModelHeaderCache_112!!.method1941(widgetComponent!!.anInt672, (-74).toByte(), widgetComponent.anInt812, widgetComponent.anInt781, 0xffffff.inv() or widgetComponent.anInt809, widgetComponent.anInt678, var_renderer, (if (!widgetComponent.aBoolean720) null else (LocalPlayerState.aPlayer_1907!!.aCompositeNpcModelBuilder_10536)))) == null)
                    if (!bool) break
                    ProportionalScrollbarComponent.aNodeDeque_9931!!.method1999(RegionTileNode(widgetComponent.anInt812, widgetComponent.anInt781, widgetComponent.anInt672, (0xffffff.inv() or widgetComponent.anInt809), widgetComponent.anInt678, widgetComponent.aBoolean720), i xor 0x4ed2)
                    ConfigFlagUtil.method1916(-9343, widgetComponent)
                } catch (runtimeexception: RuntimeException) {
                    throw TextureLoadException.method2929(runtimeexception, ("ga.QA(" + (if (var_renderer != null) "{...}" else "null") + ',' + i + ',' + (if (widgetComponent != null) "{...}" else "null") + ')'))
                }
                break
            } while (false)
        }
        @JvmStatic
        fun method273(widgetComponent: WidgetComponent, i: Int) {
            anInt288++
            if (widgetComponent.anInt774 == 5 && widgetComponent.anInt812 != -1) method2383(FacingDirectionNode.aRenderer6654, -2, widgetComponent)
        }

        @JvmStatic
        fun method277(i: Byte) {
            if (i >= 77) anIntArray279 = null
        }

        @JvmStatic
        fun method282(i: Int, var_renderer: Renderer?, i_21_: Int, i_22_: Byte, i_23_: Int, i_24_: Int, i_25_: Int, i_26_: Int) {
            anInt274++
            CameraRotationStub.aRenderer326 = var_renderer
            NpcConfig.aAbstractCameraTransform_905 = CameraRotationStub.aRenderer326!!.method3654()
            MapSceneRenderer.aAbstractCameraTransform_624 = CameraRotationStub.aRenderer326!!.method3654()
            RenderNodeStatics.aAbstractCameraTransform_9720 = CameraRotationStub.aRenderer326!!.method3654()
            WhirlpoolHash.anInt4784 = i_26_
            SceneryDetailOptionState.anInt6095 = 0
            if (i_22_ <= 64) anIntArray279 = null
            WhirlpoolHash.anInt4267 = i_23_
            MaterialPass.anInt3682 = 0
            WhirlpoolHash.anInt1067 = i_24_
            WidgetDefinition.anSpriteDrawTarget_252 = null
            WhirlpoolHash.anInt7207 = 1
            WhirlpoolHash.anInt5965 = i
            MinimapFlagRenderer.method828(38.toByte(), i_25_, i_21_)
        }
    }
}
