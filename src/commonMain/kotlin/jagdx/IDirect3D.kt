package jagdx

import jaclib.peer.IUnknown
import jaclib.peer.hb
import awt.Canvas
import kotlin.jvm.JvmStatic

expect class IDirect3D constructor(b: hb?) : IUnknown {
    fun a(arg0: Int, arg1: D3DDISPLAYMODE?): Int 

    fun a(arg0: Int, arg1: Int, arg2: Canvas?, arg3: Int, arg4: D3DPRESENT_PARAMETERS?): IDirect3DDevice 

    fun a(arg0: Int, arg1: Int): D3DADAPTER_IDENTIFIER 

    fun CheckDeviceType(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Boolean): Int

    fun b(arg0: Int, arg1: Int): D3DCAPS 

    fun CheckDeviceMultiSampleType(arg0: Int, arg1: Int, arg2: Int, arg3: Boolean, arg4: Int): Int

    fun _GetAdapterDisplayMode(arg0: Int, arg1: D3DDISPLAYMODE?): Int

    fun _CreateDevice(arg0: Int, arg1: Int, arg2: Canvas?, arg3: Int, arg4: D3DPRESENT_PARAMETERS?, arg5: IDirect3DDevice?): Int

    fun CheckDepthStencilMatch(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int): Int

    fun CheckDeviceFormat(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int): Int

    fun _GetAdapterIdentifier(arg0: Int, arg1: Int, arg2: D3DADAPTER_IDENTIFIER?): Int

    fun _GetDeviceCaps(arg0: Int, arg1: Int, arg2: D3DCAPS?): Int

    companion object {
        fun a(arg0: Int, arg1: hb?): IDirect3D
        fun _Direct3DCreate(arg0: Int, arg1: IDirect3D?): Int
    }
}
