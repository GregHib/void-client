package jaclib.memory

import kotlin.jvm.JvmStatic

actual class Stream /*private*/ actual constructor(arg0: Int) {
    /*private*/ actual var a: Int = 0

    /*private*/ actual var b: Buffer? = null

    /*private*/ actual var c: Int = 0

    /*private*/ actual var d: Int = 0

    /*private*/ actual val e: ByteArray

    actual constructor() : this(4096)

    @JvmOverloads
    actual constructor(arg0: Buffer, arg1: Int, arg2: Int) : this(if (arg0.getSize() >= 4096) 4096 else arg0.getSize()) {
        this.a(arg0, arg1, arg2)
    }

    init {
        this.e = ByteArray(arg0)
    }

    actual fun a(arg0: Int) {
        if (this.c + 1 >= this.e.size) {
            this.a()
        }
        this.e[this.c++] = arg0.toByte()
        this.e[this.c++] = (arg0 shr 8).toByte()
    }

    actual fun a(arg0: Float) {
        if (this.e.size <= this.c + 3) {
            this.a()
        }
        val local12: Int = floatToRawIntBits(arg0)
        this.e[this.c++] = (local12 shr 24).toByte()
        this.e[this.c++] = (local12 shr 16).toByte()
        this.e[this.c++] = (local12 shr 8).toByte()
        this.e[this.c++] = local12.toByte()
    }

    actual fun a(arg0: Int, arg1: Int, arg2: Int, arg3: Int) {
        if (this.c + 3 >= this.e.size) {
            this.a()
        }
        this.e[this.c++] = arg0.toByte()
        this.e[this.c++] = arg1.toByte()
        this.e[this.c++] = arg2.toByte()
        this.e[this.c++] = arg3.toByte()
    }

    actual fun a(arg0: Buffer) {
        this.a(arg0, 0, arg0.getSize())
    }

    actual fun b(arg0: Int) {
        if (this.c + 3 >= this.e.size) {
            this.a()
        }
        this.e[this.c++] = arg0.toByte()
        this.e[this.c++] = (arg0 shr 8).toByte()
        this.e[this.c++] = (arg0 shr 16).toByte()
        this.e[this.c++] = (arg0 shr 24).toByte()
    }

    actual fun a() {
        if (this.c <= 0) {
            return
        }
        if (this.a < this.c + this.d) {
            throw RuntimeException()
        }
        this.b!!.a(this.e, 0, this.d, this.c)
        this.d += this.c
        this.c = 0
    }

    /*private*/ actual fun a(arg0: Buffer, arg1: Int, arg2: Int) {
        this.a()
        this.a = arg1 + arg2
        this.d = arg1
        this.b = arg0
        if (this.a > arg0.getSize()) {
            throw RuntimeException()
        }
    }

    actual fun b(arg0: Int, arg1: Int, arg2: Int, arg3: Int) {
        if (this.e.size <= this.c + 3) {
            this.a()
        }
        this.e[this.c++] = arg2.toByte()
        this.e[this.c++] = arg1.toByte()
        this.e[this.c++] = arg0.toByte()
        this.e[this.c++] = arg3.toByte()
    }

    actual fun c(arg0: Int) {
        if (this.e.size <= this.c + 3) {
            this.a()
        }
        this.e[this.c++] = (arg0 shr 16).toByte()
        this.e[this.c++] = (arg0 shr 8).toByte()
        this.e[this.c++] = arg0.toByte()
        this.e[this.c++] = (arg0 shr 24).toByte()
    }

    actual fun b(): Int {
        return this.d + this.c
    }

    actual fun d(arg0: Int) {
        if (this.e.size <= this.c + 1) {
            this.a()
        }
        this.e[this.c++] = (arg0 shr 8).toByte()
        this.e[this.c++] = arg0.toByte()
    }

    actual fun e(arg0: Int) {
        this.a()
        this.d = arg0
    }

    actual fun b(arg0: Float) {
        if (this.e.size <= this.c + 3) {
            this.a()
        }
        val local12: Int = floatToRawIntBits(arg0)
        this.e[this.c++] = local12.toByte()
        this.e[this.c++] = (local12 shr 8).toByte()
        this.e[this.c++] = (local12 shr 16).toByte()
        this.e[this.c++] = (local12 shr 24).toByte()
    }

    actual fun f(arg0: Int) {
        if (this.c >= this.e.size) {
            this.a()
        }
        this.e[this.c++] = arg0.toByte()
    }

    actual companion object {
        @JvmStatic
        actual external fun floatToRawIntBits(arg0: Float): Int

        @JvmStatic
        /*private*/ actual external fun getLSB(arg0: Int): Byte

        @JvmStatic
        actual fun c(): Boolean {
            return getLSB(-65536).toInt() == -1
        }
    }
}
