package lang.ref

external class WeakRef<T : Any>(target: T) {
    fun deref(): T?
}

external class FinalizationRegistry<T>(cleanupCallback: (T) -> Unit) {
    fun register(target: Any, heldValue: T, unregisterToken: Any? = definedExternally)
    fun unregister(unregisterToken: Any)
}

actual open class PlatformWeakReference<T : Any> actual constructor(
    referent: T,
    queue: PlatformReferenceQueue<T>?
) {
    private val ref = WeakRef(referent)

    init {
        queue?.registry?.register(referent, this)
    }

    actual fun get(): T? = ref.deref()

    // JS has no manual clear(); best effort is dropping our own strong refs.
    // The underlying WeakRef itself can't be force-cleared.
    actual fun clear() { /* no-op: nothing to clear on WeakRef itself */ }
}
