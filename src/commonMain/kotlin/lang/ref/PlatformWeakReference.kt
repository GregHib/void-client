package lang.ref

expect open class PlatformWeakReference<T : Any>(referent: T, queue: PlatformReferenceQueue<T>? = null) {
    fun get(): T?
    fun clear()
}
