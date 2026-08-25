package jaclib.memory

import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

actual class Stream actual constructor(arg0: Int) {
    actual fun a(arg0: Int) {
    }

    actual fun a(arg0: Float) {
    }

    actual fun a(arg0: Int, arg1: Int, arg2: Int, arg3: Int) {
    }

    actual fun a(arg0: Buffer) {
    }

    actual fun a() {
    }

    actual fun a(arg0: Buffer, arg1: Int, arg2: Int) {
    }

    actual var a: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    actual fun b(arg0: Int) {
    }

    actual fun b(arg0: Int, arg1: Int, arg2: Int, arg3: Int) {
    }

    actual fun b(): Int {
        TODO("Not yet implemented")
    }

    actual fun b(arg0: Float) {
    }

    actual var b: Buffer?
        get() = TODO("Not yet implemented")
        set(value) {}

    actual fun c(arg0: Int) {
    }

    actual var c: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    actual fun d(arg0: Int) {
    }

    actual var d: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    actual fun e(arg0: Int) {
    }

    actual val e: ByteArray
        get() = TODO("Not yet implemented")

    actual fun f(arg0: Int) {
    }

    actual companion object {
//        @JvmStatic
        actual fun floatToRawIntBits(arg0: Float): Int {
            TODO("Not yet implemented")
        }

//        @JvmStatic
        actual fun getLSB(arg0: Int): Byte {
            TODO("Not yet implemented")
        }

//        @JvmStatic
        actual fun c(): Boolean {
            TODO("Not yet implemented")
        }
    }

    actual constructor() : this(4096) {
        TODO("Not yet implemented")
    }

    @JvmOverloads
    actual constructor(arg0: Buffer, arg1: Int, arg2: Int) : this(if (arg0.getSize() >= 4096) 4096 else arg0.getSize()) {
        TODO("Not yet implemented")
    }
}