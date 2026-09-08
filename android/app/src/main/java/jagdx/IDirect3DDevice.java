package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.ti;

public final class IDirect3DDevice extends IUnknown {

    public static final float[] c = new float[4];

    public final ti b;

    public IDirect3DDevice(ti arg0) {
        super(arg0);
        this.b = arg0;
    }

    public int SetLight(int arg0, D3DLIGHT arg1) { return 0; }

    public int SetPixelShaderConstantF(int arg0, float[] arg1, int arg2) { return 0; }

    public int _GetDepthStencilSurface(IDirect3DSurface arg0) { return 0; }

    public IDirect3DPixelShader a(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        IDirect3DPixelShader local10 = new IDirect3DPixelShader(this.b);
        int local15 = this._CreatePixelShader(arg0, local10);
        if (lh.a(local15, true)) {
            throw new sja(String.valueOf(local15));
        }
        return local10;
    }

    public int SetTextureStageState(int arg0, int arg1, int arg2) { return 0; }

    public int _CreateEventQuery(IDirect3DEventQuery arg0) { return 0; }

    public int _CreateDepthStencilSurface(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, IDirect3DSurface arg6) { return 0; }

    public IDirect3DVertexBuffer a(int arg0, int arg1, int arg2, int arg3, IDirect3DVertexBuffer arg4) {
        if (arg4 == null) {
            arg4 = new IDirect3DVertexBuffer(this.b);
        } else {
            arg4.a(-117);
        }
        int local22 = this._CreateVertexBuffer(arg0, arg1, arg2, arg3, arg4);
        if (lh.a(local22, true)) {
            throw new sja(String.valueOf(local22));
        }
        arg4.b = arg0;
        return arg4;
    }

    public int _GetSwapChain(int arg0, IDirect3DSwapChain arg1) { return 0; }

    public int a(int arg0, float arg1) {
        return this.SetRenderStatef(arg0, arg1);
    }

    public IDirect3DSurface c() {
        IDirect3DSurface local5 = new IDirect3DSurface(this.b);
        int local9 = this._GetDepthStencilSurface(local5);
        if (lh.a(local9, true)) {
            throw new sja(String.valueOf(local9));
        }
        return local5;
    }

    public int SetRenderState(int arg0, int arg1) { return 0; }

    public IDirect3DTexture a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        IDirect3DTexture local5 = new IDirect3DTexture(this.b);
        int local15 = this._CreateTexture(arg0, arg1, arg2, arg3, arg4, arg5, local5);
        if (lh.a(local15, true)) {
            throw new sja(String.valueOf(local15));
        }
        return local5;
    }

    public boolean LightEnable(int arg0, boolean arg1) { return false; }

    public int SetTransform(int arg0, float[] arg1) { return 0; }

    public int _GetBackBuffer(int arg0, int arg1, int arg2, IDirect3DSurface arg3) { return 0; }

    public IDirect3DCubeTexture a(int arg0, int arg1, int arg2, int arg3, int arg4) {
        IDirect3DCubeTexture local5 = new IDirect3DCubeTexture(this.b);
        int local14 = this._CreateCubeTexture(arg0, arg1, arg2, arg3, arg4, local5);
        if (lh.a(local14, true)) {
            throw new sja(String.valueOf(local14));
        }
        return local5;
    }

    public int _CreateIndexBuffer(int arg0, int arg1, int arg2, int arg3, IDirect3DIndexBuffer arg4) { return 0; }

    public int SetRenderStatef(int arg0, float arg1) { return 0; }

    public int DrawIndexedPrimitive(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) { return 0; }

    public int _CreateTexture(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, IDirect3DTexture arg6) { return 0; }

    public IDirect3DVolumeTexture a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        IDirect3DVolumeTexture local5 = new IDirect3DVolumeTexture(this.b);
        int local16 = this._CreateVolumeTexture(arg0, arg1, arg2, arg3, arg4, arg5, arg6, local5);
        if (lh.a(local16, true)) {
            throw new sja(String.valueOf(local16));
        }
        return local5;
    }

    public int SetSamplerState(int arg0, int arg1, int arg2) { return 0; }

    public int a(int arg0, float arg1, float arg2, float arg3, float arg4) {
        c[1] = arg2;
        c[2] = arg3;
        c[0] = arg1;
        c[3] = arg4;
        return this.SetVertexShaderConstantF(arg0, c, 1);
    }

    public int SetRenderStateb(int arg0, boolean arg1) { return 0; }

    public int _CreatePixelShader(byte[] arg0, IDirect3DPixelShader arg1) { return 0; }

    public int SetVertexShaderConstantF(int arg0, float[] arg1, int arg2) { return 0; }

    public int Reset(D3DPRESENT_PARAMETERS arg0) { return 0; }

    public int SetStreamSource(int arg0, IDirect3DVertexBuffer arg1, int arg2, int arg3) { return 0; }

    public IDirect3DEventQuery b() {
        IDirect3DEventQuery local5 = new IDirect3DEventQuery(this.b);
        if (lh.a((byte) 68, this._CreateEventQuery(local5))) {
            return local5.a((byte) -127) ? local5 : null;
        } else {
            return null;
        }
    }

    public int BeginScene() { return 0; }

    public int SetVertexShader(IDirect3DVertexShader arg0) { return 0; }

    public int TestCooperativeLevel() { return 0; }

    public int b(int arg0, float arg1, float arg2, float arg3, float arg4) {
        c[0] = arg1;
        c[2] = arg3;
        c[1] = arg2;
        c[3] = arg4;
        return this.SetPixelShaderConstantF(arg0, c, 1);
    }

    public IDirect3DSurface c(int arg0) {
        IDirect3DSurface local5 = new IDirect3DSurface(this.b);
        int local10 = this._GetRenderTarget(arg0, local5);
        if (lh.a(local10, true)) {
            throw new sja(String.valueOf(local10));
        }
        return local5;
    }

    public IDirect3DVertexShader b(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        IDirect3DVertexShader local11 = new IDirect3DVertexShader(this.b);
        int local16 = this._CreateVertexShader(arg0, local11);
        if (lh.a(local16, true)) {
            throw new sja(String.valueOf(local16));
        }
        return local11;
    }

    public int _GetRenderTarget(int arg0, IDirect3DSurface arg1) { return 0; }

    public IDirect3DVertexDeclaration a(VertexElementCollection arg0, IDirect3DVertexDeclaration arg1) {
        if (arg1 == null) {
            arg1 = new IDirect3DVertexDeclaration(this.b);
        } else {
            arg1.a(-109);
        }
        int local19 = this._CreateVertexDeclaration(arg0, arg1);
        if (lh.a(local19, true)) {
            throw new sja(String.valueOf(local19));
        }
        return arg1;
    }

    public int SetViewport(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5) { return 0; }

    public IDirect3DSwapChain b(int arg0) {
        IDirect3DSwapChain local5 = new IDirect3DSwapChain(this.b);
        int local10 = this._GetSwapChain(arg0, local5);
        if (lh.a(local10, true)) {
            throw new sja(String.valueOf(local10));
        }
        return local5;
    }

    public int DrawPrimitive(int arg0, int arg1, int arg2) { return 0; }

    public int _CreateVertexBuffer(int arg0, int arg1, int arg2, int arg3, IDirect3DVertexBuffer arg4) { return 0; }

    public IDirect3DIndexBuffer a(int arg0, int arg1, int arg2, int arg3, IDirect3DIndexBuffer arg4) {
        if (arg4 == null) {
            arg4 = new IDirect3DIndexBuffer(this.b);
        } else {
            arg4.a(47);
        }
        int local22 = this._CreateIndexBuffer(arg0, arg1, arg2, arg3, arg4);
        if (lh.a(local22, true)) {
            throw new sja(String.valueOf(local22));
        }
        return arg4;
    }

    public int SetTexture(int arg0, IDirect3DBaseTexture arg1) { return 0; }

    public int StretchRect(IDirect3DSurface arg0, int arg1, int arg2, int arg3, int arg4, IDirect3DSurface arg5, int arg6, int arg7, int arg8, int arg9, int arg10) { return 0; }

    public int _CreateVertexDeclaration(VertexElementCollection arg0, IDirect3DVertexDeclaration arg1) { return 0; }

    public int _CreateRenderTarget(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, IDirect3DSurface arg6) { return 0; }

    public int SetFVF(int arg0) { return 0; }

    public int SetScissorRect(int arg0, int arg1, int arg2, int arg3) { return 0; }

    public int _CreateOffscreenPlainSurface(int arg0, int arg1, int arg2, int arg3, IDirect3DSurface arg4) { return 0; }

    public int a(int arg0, float[] arg1) {
        return this.SetVertexShaderConstantF(arg0, arg1, arg1.length / 4);
    }

    public int SetVertexDeclaration(IDirect3DVertexDeclaration arg0) { return 0; }

    public int a(int arg0, boolean arg1) {
        return this.SetRenderStateb(arg0, arg1);
    }

    public int Clear(int arg0, int arg1, float arg2, int arg3) { return 0; }

    public int _CreateCubeTexture(int arg0, int arg1, int arg2, int arg3, int arg4, IDirect3DCubeTexture arg5) { return 0; }

    public int SetIndices(IDirect3DIndexBuffer arg0) { return 0; }

    public IDirect3DSurface a(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        IDirect3DSurface local5 = new IDirect3DSurface(this.b);
        int local15 = this._CreateRenderTarget(arg0, arg1, arg2, arg3, arg4, arg5, local5);
        if (lh.a(local15, true)) {
            throw new sja(String.valueOf(local15));
        }
        return local5;
    }

    public int EndScene() { return 0; }

    public int _CreateVertexShader(byte[] arg0, IDirect3DVertexShader arg1) { return 0; }

    public int SetPixelShader(IDirect3DPixelShader arg0) { return 0; }

    public int _CreateVolumeTexture(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, IDirect3DVolumeTexture arg7) { return 0; }
}
