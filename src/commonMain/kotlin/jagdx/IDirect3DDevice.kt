package jagdx

import jaclib.peer.IUnknown
import jaclib.peer.hb

expect class IDirect3DDevice(b: hb?) : IUnknown {
    val b: hb?
    fun b(): IDirect3DEventQuery? 

    fun b(arg0: Int): IDirect3DSwapChain 

    fun SetStreamSource(arg0: Int, arg1: IDirect3DVertexBuffer?, arg2: Int, arg3: Int): Int

    fun _CreateEventQuery(arg0: IDirect3DEventQuery?): Int

    fun a(arg0: Int, arg1: FloatArray): Int 

    fun _CreateCubeTexture(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: IDirect3DCubeTexture?): Int

    fun a(arg0: Int, arg1: Boolean): Int 

    fun SetRenderStateb(arg0: Int, arg1: Boolean): Int

    fun Clear(arg0: Int, arg1: Int, arg2: Float, arg3: Int): Int

    fun _CreateVertexBuffer(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IDirect3DVertexBuffer?): Int

    fun a(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int): IDirect3DTexture 

    fun EndScene(): Int

    fun _CreateVolumeTexture(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: IDirect3DVolumeTexture?): Int

    fun SetTransform(arg0: Int, arg1: FloatArray?): Int

    fun SetRenderStatef(arg0: Int, arg1: Float): Int

    fun a(arg0: Int, arg1: Float): Int 

    fun BeginScene(): Int

    fun _GetBackBuffer(arg0: Int, arg1: Int, arg2: Int, arg3: IDirect3DSurface?): Int

    fun SetViewport(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Float, arg5: Float): Int

    fun SetLight(arg0: Int, arg1: D3DLIGHT?): Int

    fun a(arg0: ByteArray?): IDirect3DPixelShader? 

    fun a(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int): IDirect3DCubeTexture 

    fun Reset(arg0: D3DPRESENT_PARAMETERS?): Int

    fun SetScissorRect(arg0: Int, arg1: Int, arg2: Int, arg3: Int): Int

    fun DrawIndexedPrimitive(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int): Int

    fun SetPixelShaderConstantF(arg0: Int, arg1: FloatArray?, arg2: Int): Int

    fun _CreateDepthStencilSurface(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Boolean, arg6: IDirect3DSurface?): Int

    fun _CreateVertexDeclaration(arg0: VertexElementCollection?, arg1: IDirect3DVertexDeclaration?): Int

    fun _GetDepthStencilSurface(arg0: IDirect3DSurface?): Int

    fun SetTextureStageState(arg0: Int, arg1: Int, arg2: Int): Int

    fun SetSamplerState(arg0: Int, arg1: Int, arg2: Int): Int

    fun _CreateRenderTarget(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Boolean, arg6: IDirect3DSurface?): Int

    fun SetFVF(arg0: Int): Int

    fun SetVertexDeclaration(arg0: IDirect3DVertexDeclaration?): Int

    fun DrawPrimitive(arg0: Int, arg1: Int, arg2: Int): Int

    fun _CreateTexture(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: IDirect3DTexture?): Int

    fun _CreateIndexBuffer(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IDirect3DIndexBuffer?): Int

    fun SetPixelShader(arg0: IDirect3DPixelShader?): Int

    fun SetVertexShaderConstantF(arg0: Int, arg1: FloatArray?, arg2: Int): Int

    fun LightEnable(arg0: Int, arg1: Boolean): Boolean

    fun c(arg0: Int): IDirect3DSurface 

    fun c(): IDirect3DSurface 

    fun StretchRect(arg0: IDirect3DSurface?, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: IDirect3DSurface?, arg6: Int, arg7: Int, arg8: Int, arg9: Int, arg10: Int): Int

    fun SetIndices(arg0: IDirect3DIndexBuffer?): Int

    fun a(arg0: VertexElementCollection?, arg1: IDirect3DVertexDeclaration?): IDirect3DVertexDeclaration 

    fun b(arg0: ByteArray?): IDirect3DVertexShader? 

    fun _GetRenderTarget(arg0: Int, arg1: IDirect3DSurface?): Int

    fun SetVertexShader(arg0: IDirect3DVertexShader?): Int

    fun a(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IDirect3DIndexBuffer?): IDirect3DIndexBuffer 

    fun _CreateVertexShader(arg0: ByteArray?, arg1: IDirect3DVertexShader?): Int

    fun a(arg0: Int, arg1: Float, arg2: Float, arg3: Float, arg4: Float): Int 

    fun b(arg0: Int, arg1: Float, arg2: Float, arg3: Float, arg4: Float): Int 

    fun a(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int): IDirect3DVolumeTexture 

    fun a(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Boolean): IDirect3DSurface 

    fun a(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IDirect3DVertexBuffer?): IDirect3DVertexBuffer 

    fun SetTexture(arg0: Int, arg1: IDirect3DBaseTexture?): Int

    fun SetRenderState(arg0: Int, arg1: Int): Int

    fun TestCooperativeLevel(): Int

    fun _CreateOffscreenPlainSurface(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IDirect3DSurface?): Int

    fun _CreatePixelShader(arg0: ByteArray?, arg1: IDirect3DPixelShader?): Int

    fun _GetSwapChain(arg0: Int, arg1: IDirect3DSwapChain?): Int
}
