package jaggl

import Hashtable
import java.awt.Canvas
import java.util.*
import kotlin.jvm.JvmStatic

expect class OpenGL {
    var a: Thread?

    var c: Hashtable<Any?, Any?>?

    val peer: Long

    fun detachPeer()

    fun setSwapInterval(arg0: Int)

    fun surfaceResized(arg0: Long)

    fun setPbuffer(arg0: Long)

    fun arePbuffersAvailable(): Boolean

    /*@Synchronized*/
    fun a(): Boolean 

    fun releasePbuffer(arg0: Long)

    fun attachPeer(): Boolean

    fun releaseSurface(arg0: Canvas?, arg1: Long)

    fun init(arg0: Canvas?, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int): Long

    /*@Synchronized*/
    fun b(): Boolean 

    fun createPbuffer(arg0: Int, arg1: Int): Long

    fun swapBuffers()

    fun a(arg0: String?): Boolean 

    fun release()

    fun prepareSurface(arg0: Canvas?): Long

    fun setSurface(arg0: Long): Boolean

}
