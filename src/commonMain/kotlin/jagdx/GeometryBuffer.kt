package jagdx

import jaclib.memory.Buffer
import jaclib.peer.hb
import jaclib.peer.uda

expect class GeometryBuffer(arg0: hb?) : uda, Buffer {
    override fun getAddress(): Long

    override fun a(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int) 

    fun getub(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int)

    fun init()

    fun putub(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int)

    override fun getSize(): Int
}
