package lang

import java.lang.System
import kotlin.system.exitProcess

actual fun currentTimeMillis(): Long = System.currentTimeMillis()

actual fun nanoTime(): Long = System.nanoTime()

actual fun lineSeparator(): String = System.lineSeparator()

actual fun getProperty(key: String): String? = System.getProperty(key)

actual fun getProperty(key: String, defaultValue: String): String = System.getProperty(key, defaultValue)

actual fun getenv(name: String): String? = System.getenv(name)

actual fun gc() = System.gc()

actual fun setProperty(key: String, value: String) = System.setProperty(key, value)
actual fun runFinalization() = System.runFinalization()

actual fun exit(status: Int): Nothing = exitProcess(status)