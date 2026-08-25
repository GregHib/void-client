package jaclib.memory

import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

expect class Stream constructor(arg0: Int) {
    var a: Int

    var b: Buffer?

    var c: Int

    var d: Int

    val e: ByteArray

    constructor()

//    @JvmOverloads
    constructor(arg0: Buffer, arg1: Int = 0, arg2: Int = arg0.getSize())

    fun a(arg0: Int) 

    fun a(arg0: Float) 

    fun a(arg0: Int, arg1: Int, arg2: Int, arg3: Int) 

    fun a(arg0: Buffer) 

    fun b(arg0: Int) 

    fun a() 

    fun a(arg0: Buffer, arg1: Int, arg2: Int) 

    fun b(arg0: Int, arg1: Int, arg2: Int, arg3: Int) 

    fun c(arg0: Int) 

    fun b(): Int 

    fun d(arg0: Int) 

    fun e(arg0: Int) 

    fun b(arg0: Float) 

    fun f(arg0: Int) 

    companion object {
        @JvmStatic
        fun floatToRawIntBits(arg0: Float): Int

        @JvmStatic
        fun getLSB(arg0: Int): Byte

        @JvmStatic
        fun c(): Boolean 
    }
}
