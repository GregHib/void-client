package jagdx

import jaclib.peer.hb
import jaclib.peer.uda

expect class D3DLIGHT(arg0: hb?) : uda {

    fun SetAttenuation(arg0: Float, arg1: Float, arg2: Float)

    fun SetDiffuse(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

    fun Init()

    fun SetSpecular(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

    fun SetAmbient(arg0: Float, arg1: Float, arg2: Float, arg3: Float)

    fun SetSpotParams(arg0: Float, arg1: Float, arg2: Float)

    fun SetPosition(arg0: Float, arg1: Float, arg2: Float)

    fun SetDirection(arg0: Float, arg1: Float, arg2: Float)

    fun SetRange(arg0: Float)

    fun SetType(arg0: Int)
}
