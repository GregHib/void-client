package jagdx

import jaclib.peer.IUnknown
import jaclib.peer.hb
import awt.Canvas
import kotlin.jvm.JvmStatic

actual class IDirect3D /*private*/ actual constructor(/*private*/ val b: hb?) : IUnknown(b) {
    actual fun a(arg0: Int, arg1: D3DDISPLAYMODE?): Int {
        return this._GetAdapterDisplayMode(arg0, arg1)
    }

    actual fun a(arg0: Int, arg1: Int, arg2: Canvas?, arg3: Int, arg4: D3DPRESENT_PARAMETERS?): IDirect3DDevice {
        val local5 = IDirect3DDevice(this.b)
        val local14 = this._CreateDevice(arg0, arg1, arg2, arg3, arg4, local5)
        if (ue.a(97.toByte(), local14)) {
            throw fda(local14.toString())
        }
        return local5
    }

    actual fun a(arg0: Int, arg1: Int): D3DADAPTER_IDENTIFIER {
        val local3 = D3DADAPTER_IDENTIFIER()
        val local9 = this._GetAdapterIdentifier(arg0, arg1, local3)
        if (ue.a(97.toByte(), local9)) {
            throw fda(local9.toString())
        }
        return local3
    }

    actual external fun CheckDeviceType(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Boolean): Int

    actual fun b(arg0: Int, arg1: Int): D3DCAPS {
        val local3 = D3DCAPS()
        val local9 = this._GetDeviceCaps(arg0, arg1, local3)
        if (ue.a(97.toByte(), local9)) {
            throw fda(local9.toString())
        }
        return local3
    }

    actual external fun CheckDeviceMultiSampleType(arg0: Int, arg1: Int, arg2: Int, arg3: Boolean, arg4: Int): Int

    /*private*/ actual external fun _GetAdapterDisplayMode(arg0: Int, arg1: D3DDISPLAYMODE?): Int

    /*private*/ actual external fun _CreateDevice(arg0: Int, arg1: Int, arg2: Canvas?, arg3: Int, arg4: D3DPRESENT_PARAMETERS?, arg5: IDirect3DDevice?): Int

    actual external fun CheckDepthStencilMatch(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int): Int

    actual external fun CheckDeviceFormat(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int): Int

    /*private*/ actual external fun _GetAdapterIdentifier(arg0: Int, arg1: Int, arg2: D3DADAPTER_IDENTIFIER?): Int

    /*private*/ actual external fun _GetDeviceCaps(arg0: Int, arg1: Int, arg2: D3DCAPS?): Int

    companion actual object {
        @JvmStatic
        actual fun a(arg0: Int, arg1: hb?): IDirect3D {
            val local4 = IDirect3D(arg1)
            val local8: Int = _Direct3DCreate(arg0, local4)
            if (ue.a(97.toByte(), local8)) {
                throw fda(local8.toString())
            }
            return local4
        }

        @JvmStatic
        /*private*/ actual external fun _Direct3DCreate(arg0: Int, arg1: IDirect3D?): Int
    }
}
