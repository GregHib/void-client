import jaclib.peer.hb
import jagdx.*
import jagdx.IDirect3DStatics.a
import jagdx.ue.a
import java.awt.Canvas
import java.awt.Rectangle

object D3dRenderDeviceStatics {
    var anIntArray9790: IntArray? = intArrayOf(22, 23)
    var aFloatArray9797: FloatArray? = FloatArray(16)
    var anIntArray9809: IntArray? = intArrayOf(77, 80)
    fun method3952(class209: UnusedToStringStub?, i: Byte): Int {
        if (PlayerSequenceSelector.aClass209_1212 == class209) return 2
        if (FrameBufferObjectStatics.aClass209_4874 == class209) return 1
        if (i <= 57) anIntArray9790 = null
        throw IllegalArgumentException()
    }

    fun method3953(cameraRotationStub: CameraRotationStub?, i: Byte): Int {
        if (i.toInt() != -111) method3952(null, (-118).toByte())
        if (cameraRotationStub == TileTransform.aCameraRotationStub_3217) return 2
        if (GlBloomEffectStatics.aCameraRotationStub_8832 == cameraRotationStub) return 3
        if (LocTypeConfigStatics.aCameraRotationStub_3572 == cameraRotationStub) return 1
        if (cameraRotationStub == VideoAdChecker.aCameraRotationStub_3181) return 4
        if (AsyncResourceRequestStatics.aCameraRotationStub_9661 == cameraRotationStub) return 6
        if (cameraRotationStub == NativeTerrainTileStatics.aCameraRotationStub_8320) return 5
        throw IllegalArgumentException("")
    }

    fun method3955(i: Int, renderConfigFactory: RenderConfigFactory?): Int {
        if (RenderQueueState.aRenderConfigFactory_6519 == renderConfigFactory) return 2
        if (ParticleSystemStateStatics.aRenderConfigFactory_2207 == renderConfigFactory) return 4
        if (MediaStreamClientStatics.aRenderConfigFactory_3196 != renderConfigFactory) {
            if (renderConfigFactory != TheoraVideoStreamStatics.aRenderConfigFactory_9011) {
                if (renderConfigFactory == RegionTileNodeStatics.aRenderConfigFactory_6644) return 10
            } else return 7
        } else return 26
        if (i <= 16) method3955(-116, null)
        throw IllegalArgumentException()
    }

    @JvmStatic
    fun createToolkit(canvas: Canvas?, var_renderConfig: RenderConfig?, js5Archive: Js5Archive?, integer: Int): Renderer {
        var d3dRenderDevice: D3dRenderDevice? = null
        val d3dRenderDevice_19_: D3dRenderDevice?
        try {
            val i = 0
            val i_20_ = 1
            val var_hb = hb()
            val idirect3d = a(-2147483616, var_hb)
            val d3dcaps = idirect3d.b(i, i_20_)
            if ((d3dcaps.RasterCaps and 0x1000000) == 0) throw RuntimeException("")
            if (d3dcaps.MaxSimultaneousTextures < 2) throw RuntimeException("")
            if ((0x2 and d3dcaps.TextureOpCaps) == 0) throw RuntimeException("")
            if ((d3dcaps.TextureOpCaps and 0x8) == 0) throw RuntimeException("")
            if ((0x40 and d3dcaps.TextureOpCaps) == 0) throw RuntimeException("")
            if ((0x200 and d3dcaps.TextureOpCaps) == 0) throw RuntimeException("")
            if ((0x2000000 and d3dcaps.TextureOpCaps) == 0) throw RuntimeException("")
            if (0 == (0x10 and (d3dcaps.DestBlendCaps and d3dcaps.SrcBlendCaps))) throw RuntimeException("")
            if ((d3dcaps.DestBlendCaps and d3dcaps.SrcBlendCaps and 0x20) == 0) throw RuntimeException("")
            if (0 == (d3dcaps.SrcBlendCaps and d3dcaps.DestBlendCaps and 0x2)) throw RuntimeException("")
            if (0 < d3dcaps.MaxActiveLights && 2 > d3dcaps.MaxActiveLights) throw RuntimeException("")
            if (d3dcaps.MaxStreams < 5) throw RuntimeException("")
            val d3dpresent_parameters = D3DPRESENT_PARAMETERS(canvas)
            if (!method3964(d3dpresent_parameters, 0, i, idirect3d, i_20_, integer)) throw RuntimeException("")
            d3dpresent_parameters.PresentationInterval = -2147483648
            d3dpresent_parameters.EnableAutoDepthStencil = true
            d3dpresent_parameters.Windowed = true
            var i_21_ = 2
            if ((0x100000 and d3dcaps.DevCaps) != 0) i_21_ = i_21_ or 0x10
            val `object`: Any? = null
            var idirect3ddevice: IDirect3DDevice?
            try {
                idirect3ddevice = idirect3d.a(i, i_20_, canvas, i_21_ or 0x40, d3dpresent_parameters)
            } catch (var_fda: fda) {
                idirect3ddevice = idirect3d.a(i, i_20_, canvas, i_21_ or 0x20, d3dpresent_parameters)
            }
            val d3dSwapChainWrapper = D3dSwapChainWrapper(idirect3ddevice.b(0), idirect3ddevice.c())
            d3dRenderDevice = D3dRenderDevice(i, i_20_, canvas, var_hb, idirect3d, idirect3ddevice, d3dSwapChainWrapper, d3dpresent_parameters, d3dcaps, var_renderConfig, js5Archive, integer)
            d3dRenderDevice.method3930(26.toByte())
            d3dRenderDevice_19_ = d3dRenderDevice
        } catch (runtimeexception: RuntimeException) {
            if (d3dRenderDevice != null) d3dRenderDevice.method3652()
            throw runtimeexception
        }
        return d3dRenderDevice_19_
    }

    @JvmStatic
    fun method3958(i: Int, movementDirection: MovementDirection?, textureFormatInfo: TextureFormatInfo?): Int {
        if (movementDirection == MovementDirectionStatics.aMovementDirection_1183) {
            if (TimedRecordAccessorStatics.aTextureFormatInfo_7103 != textureFormatInfo) {
                if (GroundItemRenderState.aTextureFormatInfo_1662 == textureFormatInfo) return 21
                if (ClampTextureNodeStatics.aTextureFormatInfo_9471 == textureFormatInfo) return 28
                if (CellNoiseTextureNodeStatics.aTextureFormatInfo_9303 == textureFormatInfo) return 50
                if (textureFormatInfo == SpriteSheetCacheStatics.aTextureFormatInfo_2571) return 51
                if (textureFormatInfo == SceneLinkedListNodeStatics.aTextureFormatInfo_3977) return 77
            } else return 22
        }
        if (i != 22) anIntArray9790 = null
        throw IllegalArgumentException("")
    }

    fun method3961(trigLookupTables: TrigLookupTables?, i: Int): Int {
        if (i != 2) aFloatArray9797 = null
        if (WidgetRedrawRegionStatics.aTrigLookupTables_4247 == trigLookupTables) return 2
        if (trigLookupTables == GlIndexBufferArbStatics.aTrigLookupTables_8503) return 0
        if (SceneObjectEntityStatics.aTrigLookupTables_8737 != trigLookupTables) {
            if (RenderListTextureNodeStatics.aTrigLookupTables_9485 == trigLookupTables) return 3
        } else return 1
        throw IllegalArgumentException()
    }

    fun method3963(i: Int, configFlagUtil: ConfigFlagUtil?): Int {
        if (i != 594) return 7
        if (configFlagUtil == GlElementArrayBufferStatics.aConfigFlagUtil_4835) return 1
        if (configFlagUtil != LightDetailOptionStateStatics.aConfigFlagUtil_6030) {
            if (configFlagUtil != ClampTextureNodeStatics.aConfigFlagUtil_9477) {
                if (MapSceneTileStatics.aConfigFlagUtil_1051 == configFlagUtil) return 4
                if (configFlagUtil == WaterDetailOptionStateStatics.aConfigFlagUtil_5989) return 256
            } else return 3
        } else return 2
        return 0
    }

    fun method3964(d3dpresent_parameters: D3DPRESENT_PARAMETERS, i: Int, j: Int, idirect3d: IDirect3D, k: Int, l: Int): Boolean {
        var l = l
        try {
            var i1: Int
            var j1: Int
            var k1: Int
            i1 = 0
            j1 = 0
            k1 = i
            val d3ddisplaymode = D3DDISPLAYMODE()
            if (a(97.toByte(), idirect3d.a(j, d3ddisplaymode))) return false
            label0@ while (l >= 0) {
                if (1 == l) {
                    l--
                    continue
                }
                k1 = l + 0
                label1@ for (l1 in anIntArray9790!!.indices) {
                    if (idirect3d.CheckDeviceType(j, k, d3ddisplaymode.Format, anIntArray9790!![l1], true) != 0 || idirect3d.CheckDeviceFormat(j, k, d3ddisplaymode.Format, 1, 1, anIntArray9790!![l1]) != 0 || l != 0 && idirect3d.CheckDeviceMultiSampleType(j, k, anIntArray9790!![l1], true, k1) != 0) continue
                    var i2 = 0
                    do {
                        if (anIntArray9809!!.size <= i2) continue@label1
                        if (idirect3d.CheckDeviceFormat(j, k, d3ddisplaymode.Format, 2, 1, anIntArray9809!![i2]) == 0 && idirect3d.CheckDepthStencilMatch(j, k, d3ddisplaymode.Format, anIntArray9790!![l1], anIntArray9809!![i2]) == 0 && (l == 0 || idirect3d.CheckDeviceMultiSampleType(j, k, anIntArray9809!![l1], true, k1) == 0)) {
                            i1 = anIntArray9809!![i2]
                            j1 = anIntArray9790!![l1]
                            break@label0
                        }
                        i2++
                    } while (true)
                }

                l--
            }

            if (l < 0 || j1 == 0 || i1 == 0) return false
            d3dpresent_parameters.MultiSampleType = k1
            d3dpresent_parameters.AutoDepthStencilFormat = i1
            d3dpresent_parameters.MultiSampleQuality = 0
            d3dpresent_parameters.BackBufferFormat = j1
            return true
        } catch (t: Throwable) {
            return false
        }
    }
}
