package jaggl

import jaclib.memory.NativeBuffer

class MapBuffer : NativeBuffer() {
    private var c = 0

    public override fun a(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int) {
        if (this.c == 0) {
            throw RuntimeException()
        }
        super.a(arg0, arg1, arg2, arg3)
    }

    fun a(arg0: Int, arg1: Int, arg2: Int): Boolean {
        if (this.c != 0) {
            return false
        }
        val local8: Long = OpenGL.Companion.glMapBufferARB(arg0, arg2)
        if (local8 == 0L) {
            return false
        } else {
            this.a(local8, arg1)
            this.c = arg0
            return true
        }
    }

    fun a(): Boolean {
        return this.c != 0
    }

    fun b(): Boolean {
        var local1 = true
        if (this.c != 0) {
            local1 = OpenGL.Companion.glUnmapBufferARB(this.c)
            this.a(0L, 0)
            this.c = 0
        }
        return local1
    }
}
