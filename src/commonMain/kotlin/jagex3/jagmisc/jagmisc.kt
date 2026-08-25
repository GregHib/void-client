package jagex3.jagmisc

import kotlin.jvm.JvmStatic

expect object jagmisc {
    val totalPhysicalMemory: Long

    @JvmStatic
    val availablePhysicalMemory: Long

    fun ping0(arg0: Byte, arg1: Byte, arg2: Byte, arg3: Byte, arg4: Long): Int

    @JvmStatic
    fun init(): Boolean

    @JvmStatic
    fun nanoTime(): Long

    @JvmStatic
    fun quit() 

    @JvmStatic
    @Throws(Throwable::class)
    fun ping(arg0: Byte, arg1: Byte, arg2: Byte, arg3: Byte, arg4: Long): Int 

    fun Quit0()
}
