package jagdx

import jaclib.peer.IUnknown
import jaclib.peer.hb

class IDirect3DDevice(private val b: hb?) : IUnknown(b) {
    fun b(): IDirect3DEventQuery? {
        val local5 = IDirect3DEventQuery(this.b)
        if (ue.a(this._CreateEventQuery(local5), false)) {
            return local5
        } else {
            return null
        }
    }

    fun b(arg0: Int): IDirect3DSwapChain {
        val local5 = IDirect3DSwapChain(this.b)
        val local10 = this._GetSwapChain(arg0, local5)
        if (ue.a(97.toByte(), local10)) {
            throw fda(local10.toString())
        }
        return local5
    }

    external fun SetStreamSource(arg0: Int, arg1: IDirect3DVertexBuffer?, arg2: Int, arg3: Int): Int

    private external fun _CreateEventQuery(arg0: IDirect3DEventQuery?): Int

    fun a(arg0: Int, arg1: FloatArray): Int {
        return this.SetVertexShaderConstantF(arg0, arg1, arg1.size / 4)
    }

    private external fun _CreateCubeTexture(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: IDirect3DCubeTexture?): Int

    fun a(arg0: Int, arg1: Boolean): Int {
        return this.SetRenderStateb(arg0, arg1)
    }

    private external fun SetRenderStateb(arg0: Int, arg1: Boolean): Int

    external fun Clear(arg0: Int, arg1: Int, arg2: Float, arg3: Int): Int

    private external fun _CreateVertexBuffer(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IDirect3DVertexBuffer?): Int

    fun a(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int): IDirect3DTexture {
        val local5 = IDirect3DTexture(this.b)
        val local15 = this._CreateTexture(arg0, arg1, arg2, arg3, arg4, arg5, local5)
        if (ue.a(97.toByte(), local15)) {
            throw fda(local15.toString())
        }
        return local5
    }

    external fun EndScene(): Int

    private external fun _CreateVolumeTexture(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: IDirect3DVolumeTexture?): Int

    external fun SetTransform(arg0: Int, arg1: FloatArray?): Int

    private external fun SetRenderStatef(arg0: Int, arg1: Float): Int

    fun a(arg0: Int, arg1: Float): Int {
        return this.SetRenderStatef(arg0, arg1)
    }

    external fun BeginScene(): Int

    private external fun _GetBackBuffer(arg0: Int, arg1: Int, arg2: Int, arg3: IDirect3DSurface?): Int

    external fun SetViewport(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Float, arg5: Float): Int

    external fun SetLight(arg0: Int, arg1: D3DLIGHT?): Int

    fun a(arg0: ByteArray?): IDirect3DPixelShader? {
        if (arg0 == null) {
            return null
        }
        val local11 = IDirect3DPixelShader(this.b)
        val local16 = this._CreatePixelShader(arg0, local11)
        if (ue.a(97.toByte(), local16)) {
            throw fda(local16.toString())
        }
        return local11
    }

    fun a(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int): IDirect3DCubeTexture {
        val local5 = IDirect3DCubeTexture(this.b)
        val local14 = this._CreateCubeTexture(arg0, arg1, arg2, arg3, arg4, local5)
        if (ue.a(97.toByte(), local14)) {
            throw fda(local14.toString())
        }
        return local5
    }

    external fun Reset(arg0: D3DPRESENT_PARAMETERS?): Int

    external fun SetScissorRect(arg0: Int, arg1: Int, arg2: Int, arg3: Int): Int

    external fun DrawIndexedPrimitive(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int): Int

    private external fun SetPixelShaderConstantF(arg0: Int, arg1: FloatArray?, arg2: Int): Int

    private external fun _CreateDepthStencilSurface(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Boolean, arg6: IDirect3DSurface?): Int

    private external fun _CreateVertexDeclaration(arg0: VertexElementCollection?, arg1: IDirect3DVertexDeclaration?): Int

    private external fun _GetDepthStencilSurface(arg0: IDirect3DSurface?): Int

    external fun SetTextureStageState(arg0: Int, arg1: Int, arg2: Int): Int

    external fun SetSamplerState(arg0: Int, arg1: Int, arg2: Int): Int

    private external fun _CreateRenderTarget(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Boolean, arg6: IDirect3DSurface?): Int

    private external fun SetFVF(arg0: Int): Int

    external fun SetVertexDeclaration(arg0: IDirect3DVertexDeclaration?): Int

    external fun DrawPrimitive(arg0: Int, arg1: Int, arg2: Int): Int

    private external fun _CreateTexture(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: IDirect3DTexture?): Int

    private external fun _CreateIndexBuffer(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IDirect3DIndexBuffer?): Int

    external fun SetPixelShader(arg0: IDirect3DPixelShader?): Int

    external fun SetVertexShaderConstantF(arg0: Int, arg1: FloatArray?, arg2: Int): Int

    external fun LightEnable(arg0: Int, arg1: Boolean): Boolean

    fun c(arg0: Int): IDirect3DSurface {
        val local5 = IDirect3DSurface(this.b)
        val local10 = this._GetRenderTarget(arg0, local5)
        if (ue.a(97.toByte(), local10)) {
            throw fda(local10.toString())
        }
        return local5
    }

    fun c(): IDirect3DSurface {
        val local5 = IDirect3DSurface(this.b)
        val local9 = this._GetDepthStencilSurface(local5)
        if (ue.a(97.toByte(), local9)) {
            throw fda(local9.toString())
        }
        return local5
    }

    external fun StretchRect(arg0: IDirect3DSurface?, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: IDirect3DSurface?, arg6: Int, arg7: Int, arg8: Int, arg9: Int, arg10: Int): Int

    external fun SetIndices(arg0: IDirect3DIndexBuffer?): Int

    fun a(arg0: VertexElementCollection?, arg1: IDirect3DVertexDeclaration?): IDirect3DVertexDeclaration {
        var arg1 = arg1
        if (arg1 == null) {
            arg1 = IDirect3DVertexDeclaration(this.b)
        } else {
            arg1.a(9275)
        }
        val local18 = this._CreateVertexDeclaration(arg0, arg1)
        if (ue.a(97.toByte(), local18)) {
            throw fda(local18.toString())
        }
        return arg1
    }

    fun b(arg0: ByteArray?): IDirect3DVertexShader? {
        if (arg0 == null) {
            return null
        }
        val local11 = IDirect3DVertexShader(this.b)
        val local16 = this._CreateVertexShader(arg0, local11)
        if (ue.a(97.toByte(), local16)) {
            throw fda(local16.toString())
        }
        return local11
    }

    private external fun _GetRenderTarget(arg0: Int, arg1: IDirect3DSurface?): Int

    external fun SetVertexShader(arg0: IDirect3DVertexShader?): Int

    fun a(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IDirect3DIndexBuffer?): IDirect3DIndexBuffer {
        var arg4 = arg4
        if (arg4 == null) {
            arg4 = IDirect3DIndexBuffer(this.b)
        } else {
            arg4.a(9275)
        }
        val local21 = this._CreateIndexBuffer(arg0, arg1, arg2, arg3, arg4)
        if (ue.a(97.toByte(), local21)) {
            throw fda(local21.toString())
        }
        return arg4
    }

    private external fun _CreateVertexShader(arg0: ByteArray?, arg1: IDirect3DVertexShader?): Int

    fun a(arg0: Int, arg1: Float, arg2: Float, arg3: Float, arg4: Float): Int {
        c[0] = arg1
        c[2] = arg3
        c[3] = arg4
        c[1] = arg2
        return this.SetVertexShaderConstantF(arg0, c, 1)
    }

    fun b(arg0: Int, arg1: Float, arg2: Float, arg3: Float, arg4: Float): Int {
        c[3] = arg4
        c[0] = arg1
        c[1] = arg2
        c[2] = arg3
        return this.SetPixelShaderConstantF(arg0, c, 1)
    }

    fun a(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int): IDirect3DVolumeTexture {
        val local5 = IDirect3DVolumeTexture(this.b)
        val local16 = this._CreateVolumeTexture(arg0, arg1, arg2, arg3, arg4, arg5, arg6, local5)
        if (ue.a(97.toByte(), local16)) {
            throw fda(local16.toString())
        }
        return local5
    }

    fun a(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Boolean): IDirect3DSurface {
        val local5 = IDirect3DSurface(this.b)
        val local15 = this._CreateRenderTarget(arg0, arg1, arg2, arg3, arg4, arg5, local5)
        if (ue.a(97.toByte(), local15)) {
            throw fda(local15.toString())
        }
        return local5
    }

    fun a(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IDirect3DVertexBuffer?): IDirect3DVertexBuffer {
        var arg4 = arg4
        if (arg4 == null) {
            arg4 = IDirect3DVertexBuffer(this.b)
        } else {
            arg4.a(9275)
        }
        val local20 = this._CreateVertexBuffer(arg0, arg1, arg2, arg3, arg4)
        if (ue.a(97.toByte(), local20)) {
            throw fda(local20.toString())
        }
        arg4.b = arg0
        return arg4
    }

    external fun SetTexture(arg0: Int, arg1: IDirect3DBaseTexture?): Int

    external fun SetRenderState(arg0: Int, arg1: Int): Int

    external fun TestCooperativeLevel(): Int

    private external fun _CreateOffscreenPlainSurface(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: IDirect3DSurface?): Int

    private external fun _CreatePixelShader(arg0: ByteArray?, arg1: IDirect3DPixelShader?): Int

    private external fun _GetSwapChain(arg0: Int, arg1: IDirect3DSwapChain?): Int

    companion object {
        private val c = FloatArray(4)
    }
}
