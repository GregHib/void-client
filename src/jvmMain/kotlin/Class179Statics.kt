import ha_Sub3.Companion.method3873

/**
 * JVM-only statics extracted from [Class179] companion that reference jvmMain-only types
 * (Class344, Class344_Sub1, Class17) and therefore cannot live in commonMain.
 */
object Class179Statics {
    fun method1357(`is`: ByteArray?, bool: Boolean, i: Byte): Any? {
        if (i < 73) Class179.anInt2361 = -51
        Class179.anInt2363++
        if (`is` == null) return null
        if (`is`.size > 136 && !Class17.aBoolean247) {
            try {
                val class344: Class344 = Class344_Sub1()
                class344.method2691(62.toByte(), `is`)
                return class344
            } catch (throwable: Throwable) {
                Class17.aBoolean247 = true
            }
        }
        if (bool) return method3873(`is`, 0)
        return `is`
    }
}
