package jagdx

import jaclib.peer.IUnknown
import jaclib.peer.hb
import java.awt.Canvas

object IDirect3DStatics {
    @JvmStatic
            fun a(arg0: Int, arg1: hb?): IDirect3D {
                val local4 = IDirect3D(arg1)
                val local8: Int = _Direct3DCreate(arg0, local4)
                if (ue.a(97.toByte(), local8)) {
                    throw fda(local8.toString())
                }
                return local4
            }
    
            @JvmStatic
            private external fun _Direct3DCreate(arg0: Int, arg1: IDirect3D?): Int
}
