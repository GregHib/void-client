package jagex3.jagmisc


object jagmisc {
    private val totalPhysicalMemory: Long
        external get

    @JvmStatic
    val availablePhysicalMemory: Long
        external get

    private external fun ping0(arg0: Byte, arg1: Byte, arg2: Byte, arg3: Byte, arg4: Long): Int

    @JvmStatic
    external fun init(): Boolean

    @JvmStatic
    external fun nanoTime(): Long

    @JvmStatic
    fun quit() {
        Quit0()
    }

    @JvmStatic
    @Throws(Throwable::class)
    fun ping(arg0: Byte, arg1: Byte, arg2: Byte, arg3: Byte, arg4: Long): Int {
        val local6 = ping0(arg0, arg1, arg2, arg3, arg4)
        if (local6 < 0) {
            throw Exception(local6.toString())
        }
        return local6
    }

    private external fun Quit0()
}
