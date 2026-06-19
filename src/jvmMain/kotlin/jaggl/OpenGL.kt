package jaggl

import java.awt.Canvas
import java.util.*
import jaggl.OpenGLStatics.glGetString
import jaggl.OpenGLStatics.b


class OpenGL {
    private var a: Thread? = null

    private var c: Hashtable<Any?, Any?>? = null

    private val peer: Long = 0

    private external fun detachPeer()

    external fun setSwapInterval(arg0: Int)

    external fun surfaceResized(arg0: Long)

    private external fun setPbuffer(arg0: Long)

    external fun arePbuffersAvailable(): Boolean

    @Synchronized
    fun a(): Boolean {
        if (this.a === Thread.currentThread()) {
            this.detachPeer()
            b.remove(this.a)
            this.a = null
            return true
        } else {
            return false
        }
    }

    private external fun releasePbuffer(arg0: Long)

    private external fun attachPeer(): Boolean

    external fun releaseSurface(arg0: Canvas?, arg1: Long)

    external fun init(arg0: Canvas?, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int): Long

    @Synchronized
    fun b(): Boolean {
        val local1 = Thread.currentThread()
        if (!this.attachPeer()) {
            return false
        }
        val local10 = b.put(local1, this) as OpenGL?
        if (local10 != null) {
            local10.a = null
        }
        this.a = local1
        return true
    }

    private external fun createPbuffer(arg0: Int, arg1: Int): Long

    external fun swapBuffers()

    fun a(arg0: String?): Boolean {
        if (this.c == null) {
            this.c = Hashtable<Any?, Any?>()
            val local10: String = glGetString(7939)
            var local12 = 0
            while (true) {
                val local17 = local10.indexOf(32.toChar(), local12)
                if (local17 == -1) {
                    val local48 = local10.substring(local12).trim { it <= ' ' }
                    if (local48.length != 0) {
                        this.c!!.put(local48, local48)
                    }
                    break
                }
                val local26 = local10.substring(local12, local17).trim { it <= ' ' }
                if (local26.length != 0) {
                    this.c!!.put(local26, local26)
                }
                local12 = local17 + 1
            }
        }
        return this.c!!.containsKey(arg0)
    }

    external fun release()

    external fun prepareSurface(arg0: Canvas?): Long

    external fun setSurface(arg0: Long): Boolean
}
