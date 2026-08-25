package jaclib.memory


open actual class NativeBuffer : Buffer, Source {
    /*private*/ actual var a: Long = 0

    /*private*/ actual var b = -1

    actual override fun getAddress(): Long {
        return this.a
    }

    actual override fun a(arg0: ByteArray?, arg1: Int, arg2: Int, arg3: Int) {
        if ((arg2 + arg3 > this.b) or (arg2 < 0) or ((arg0?.size ?: 0) < arg3 + arg1) or (arg1 < 0) or (arg0 == null) or (this.a == 0L)) {
            throw RuntimeException()
        }
        this.put(this.a, arg0, arg1, arg2, arg3)
    }

    actual override fun getSize(): Int {
        return this.b
    }

    /*protected*/ actual fun a(arg0: Long, arg1: Int) {
        this.b = arg1
        this.a = arg0
    }

    /*private*/ actual external fun get(arg0: Long, arg1: ByteArray?, arg2: Int, arg3: Int, arg4: Int)

    /*private*/ actual external fun put(arg0: Long, arg1: ByteArray?, arg2: Int, arg3: Int, arg4: Int)
}
