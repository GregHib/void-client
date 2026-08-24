package jagdx

import jaclib.peer.hb
import jaclib.peer.uda

class D3DLIGHT(arg0: hb?) : uda(arg0) {
    init {
        this.Init()
    }

    external fun SetAttenuation(arg0: Float, arg1: Float, arg2: Float)

    external fun SetDiffuse(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

    private external fun Init()

    private external fun SetSpecular(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

    external fun SetAmbient(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

    private external fun SetSpotParams(arg0: Float, arg1: Float, arg2: Float)

    external fun SetPosition(arg0: Float, arg1: Float, arg2: Float)

    external fun SetDirection(arg0: Float, arg1: Float, arg2: Float)

    external fun SetRange(arg0: Float)

    external fun SetType(arg0: Int)
}
