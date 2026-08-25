package jagex3.jagmisc

import kotlin.jvm.JvmStatic

actual object jagmisc {
    /*private*/ actual val totalPhysicalMemory: Long
        external get

    @JvmStatic
    actual val availablePhysicalMemory: Long
        external get

    /*private*/ actual external fun ping0(arg0: Byte, arg1: Byte, arg2: Byte, arg3: Byte, arg4: Long): Int

    @JvmStatic
    actual external fun init(): Boolean

    @JvmStatic
    actual external fun nanoTime(): Long

    @JvmStatic
    actual fun quit() {
        Quit0()
    }

    @JvmStatic
    @Throws(Throwable::class)
    actual fun ping(arg0: Byte, arg1: Byte, arg2: Byte, arg3: Byte, arg4: Long): Int {
        val local6 = ping0(arg0, arg1, arg2, arg3, arg4)
        if (local6 < 0) {
            throw Exception(local6.toString())
        }
        return local6
    }

    /*private*/ actual external fun Quit0()
}
