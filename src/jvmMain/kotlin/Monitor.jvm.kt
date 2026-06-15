actual fun monitorWait(lock: Any) {
    try {
        (lock as Object).wait()
    } catch (_: InterruptedException) {
        /* empty — mirrors original decompiled catch blocks */
    }
}

actual fun monitorNotifyAll(lock: Any) {
    (lock as Object).notifyAll()
}
