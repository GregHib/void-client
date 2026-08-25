package lang.ref

expect class PlatformReferenceQueue<T : Any>() {
    /** Non-blocking poll; returns null if nothing has been enqueued. */
    fun poll(): PlatformWeakReference<T>?
}