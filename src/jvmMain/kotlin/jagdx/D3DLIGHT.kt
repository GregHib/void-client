package jagdx

import jaclib.peer.hb
import jaclib.peer.uda

actual class D3DLIGHT actual constructor(arg0: hb?) : uda(arg0) {
    init {
        this.Init()
    }

    actual external fun SetAttenuation(arg0: Float, arg1: Float, arg2: Float)

    actual external fun SetDiffuse(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

    /*private*/ actual external fun Init()

    /*private*/ actual external fun SetSpecular(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

    actual external fun SetAmbient(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

    /*private*/ actual external fun SetSpotParams(arg0: Float, arg1: Float, arg2: Float)

    actual external fun SetPosition(arg0: Float, arg1: Float, arg2: Float)

    actual external fun SetDirection(arg0: Float, arg1: Float, arg2: Float)

    actual external fun SetRange(arg0: Float)

    actual external fun SetType(arg0: Int)
}
