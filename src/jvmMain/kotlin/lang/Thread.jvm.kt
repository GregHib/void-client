package lang

actual typealias Thread = java.lang.Thread

actual fun currentThread(): Thread = java.lang.Thread.currentThread()
actual fun sleep(millis: Long) = java.lang.Thread.sleep(millis)
actual fun yield() = java.lang.Thread.yield()