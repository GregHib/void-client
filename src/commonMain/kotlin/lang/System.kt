package lang

expect fun currentTimeMillis(): Long
expect fun nanoTime(): Long
expect fun gc()
expect fun lineSeparator(): String
expect fun getProperty(key: String): String?
expect fun setProperty(key: String, value: String): String
expect fun getProperty(key: String, defaultValue: String): String
expect fun getenv(name: String): String?
expect fun exit(status: Int): Nothing
expect fun runFinalization()
expect fun load(path: String)