package jagdx

import awt.Canvas
import jaclib.peer.IUnknown
import jaclib.peer.hb

actual class IDirect3D actual constructor(b: hb?) : IUnknown(b) {
    actual fun a(arg0: Int, arg1: D3DDISPLAYMODE?): Int {
        TODO("Not yet implemented")
    }

    actual fun a(arg0: Int, arg1: Int, arg2: Canvas?, arg3: Int, arg4: D3DPRESENT_PARAMETERS?): IDirect3DDevice {
        TODO("Not yet implemented")
    }

    actual fun a(arg0: Int, arg1: Int): D3DADAPTER_IDENTIFIER {
        TODO("Not yet implemented")
    }

    actual fun CheckDeviceType(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Boolean): Int {
        TODO("Not yet implemented")
    }

    actual fun b(arg0: Int, arg1: Int): D3DCAPS {
        TODO("Not yet implemented")
    }

    actual fun CheckDeviceMultiSampleType(arg0: Int, arg1: Int, arg2: Int, arg3: Boolean, arg4: Int): Int {
        TODO("Not yet implemented")
    }

    actual fun _GetAdapterDisplayMode(arg0: Int, arg1: D3DDISPLAYMODE?): Int {
        TODO("Not yet implemented")
    }

    actual fun _CreateDevice(arg0: Int, arg1: Int, arg2: Canvas?, arg3: Int, arg4: D3DPRESENT_PARAMETERS?, arg5: IDirect3DDevice?): Int {
        TODO("Not yet implemented")
    }

    actual fun CheckDepthStencilMatch(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int): Int {
        TODO("Not yet implemented")
    }

    actual fun CheckDeviceFormat(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int): Int {
        TODO("Not yet implemented")
    }

    actual fun _GetAdapterIdentifier(arg0: Int, arg1: Int, arg2: D3DADAPTER_IDENTIFIER?): Int {
        TODO("Not yet implemented")
    }

    actual fun _GetDeviceCaps(arg0: Int, arg1: Int, arg2: D3DCAPS?): Int {
        TODO("Not yet implemented")
    }

    actual companion object {
        actual fun a(arg0: Int, arg1: hb?): IDirect3D {
            TODO("Not yet implemented")
        }

        actual fun _Direct3DCreate(arg0: Int, arg1: IDirect3D?): Int {
            TODO("Not yet implemented")
        }
    }
}