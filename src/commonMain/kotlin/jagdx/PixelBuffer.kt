package jagdx

import jaclib.memory.Buffer
import jaclib.peer.hb
import jaclib.peer.uda

expect class PixelBuffer(arg0: hb?) : uda, Buffer {

    val rowPitch: Int

    fun getub(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int)

    override fun a(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int) 

    fun putub(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int)

    fun a(arg0: IntArray?, arg1: Int, arg2: Int, arg3: Int) 

    fun init()

    override fun getAddress(): Long 

    override fun getSize(): Int

    fun b(arg0: IntArray?, arg1: Int, arg2: Int, arg3: Int) 

    fun puti(arg0: IntArray?, arg1: Int, arg2: Int, arg3: Int)

    fun geti(arg0: IntArray?, arg1: Int, arg2: Int, arg3: Int)

    val slicePitch: Int
}
