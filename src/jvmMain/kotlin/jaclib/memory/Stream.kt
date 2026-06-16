package jaclib.memory


class Stream private constructor(arg0: Int) {
    private var a = 0

    private var b: Buffer? = null

    private var c = 0

    private var d = 0

    private val e: ByteArray

    constructor() : this(4096)

    @JvmOverloads
    constructor(arg0: Buffer, arg1: Int = 0, arg2: Int = arg0.getSize()) : this(if (arg0.getSize() >= 4096) 4096 else arg0.getSize()) {
        this.a(arg0, arg1, arg2)
    }

    init {
        this.e = ByteArray(arg0)
    }

    fun a(arg0: Int) {
        if (this.c + 1 >= this.e.size) {
            this.a()
        }
        this.e[this.c++] = arg0.toByte()
        this.e[this.c++] = (arg0 shr 8).toByte()
    }

    fun a(arg0: Float) {
        if (this.e.size <= this.c + 3) {
            this.a()
        }
        val local12: Int = floatToRawIntBits(arg0)
        this.e[this.c++] = (local12 shr 24).toByte()
        this.e[this.c++] = (local12 shr 16).toByte()
        this.e[this.c++] = (local12 shr 8).toByte()
        this.e[this.c++] = local12.toByte()
    }

    fun a(arg0: Int, arg1: Int, arg2: Int, arg3: Int) {
        if (this.c + 3 >= this.e.size) {
            this.a()
        }
        this.e[this.c++] = arg0.toByte()
        this.e[this.c++] = arg1.toByte()
        this.e[this.c++] = arg2.toByte()
        this.e[this.c++] = arg3.toByte()
    }

    fun a(arg0: Buffer) {
        this.a(arg0, 0, arg0.getSize())
    }

    fun b(arg0: Int) {
        if (this.c + 3 >= this.e.size) {
            this.a()
        }
        this.e[this.c++] = arg0.toByte()
        this.e[this.c++] = (arg0 shr 8).toByte()
        this.e[this.c++] = (arg0 shr 16).toByte()
        this.e[this.c++] = (arg0 shr 24).toByte()
    }

    fun a() {
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

    private fun a(arg0: Buffer, arg1: Int, arg2: Int) {
        this.a()
        this.a = arg1 + arg2
        this.d = arg1
        this.b = arg0
        if (this.a > arg0.getSize()) {
            throw RuntimeException()
        }
    }

    fun b(arg0: Int, arg1: Int, arg2: Int, arg3: Int) {
        if (this.e.size <= this.c + 3) {
            this.a()
        }
        this.e[this.c++] = arg2.toByte()
        this.e[this.c++] = arg1.toByte()
        this.e[this.c++] = arg0.toByte()
        this.e[this.c++] = arg3.toByte()
    }

    fun c(arg0: Int) {
        if (this.e.size <= this.c + 3) {
            this.a()
        }
        this.e[this.c++] = (arg0 shr 16).toByte()
        this.e[this.c++] = (arg0 shr 8).toByte()
        this.e[this.c++] = arg0.toByte()
        this.e[this.c++] = (arg0 shr 24).toByte()
    }

    fun b(): Int {
        return this.d + this.c
    }

    fun d(arg0: Int) {
        if (this.e.size <= this.c + 1) {
            this.a()
        }
        this.e[this.c++] = (arg0 shr 8).toByte()
        this.e[this.c++] = arg0.toByte()
    }

    fun e(arg0: Int) {
        this.a()
        this.d = arg0
    }

    fun b(arg0: Float) {
        if (this.e.size <= this.c + 3) {
            this.a()
        }
        val local12: Int = floatToRawIntBits(arg0)
        this.e[this.c++] = local12.toByte()
        this.e[this.c++] = (local12 shr 8).toByte()
        this.e[this.c++] = (local12 shr 16).toByte()
        this.e[this.c++] = (local12 shr 24).toByte()
    }

    fun f(arg0: Int) {
        if (this.c >= this.e.size) {
            this.a()
        }
        this.e[this.c++] = arg0.toByte()
    }

    companion object {
        @JvmStatic
        external fun floatToRawIntBits(arg0: Float): Int

        @JvmStatic
        private external fun getLSB(arg0: Int): Byte

        @JvmStatic
        fun c(): Boolean {
            return getLSB(-65536).toInt() == -1
        }
    }
}
