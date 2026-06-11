actual fun systemGetProperty(key: String): String? = System.getProperty(key)

actual fun systemSetProperty(key: String, value: String) {
    System.setProperty(key, value)
}
