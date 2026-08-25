package lang.ref

import java.lang.ref.WeakReference

actual open class PlatformWeakReference<T : Any> actual constructor(
    referent: T,
    queue: PlatformReferenceQueue<T>?
) {
    private val delegate: WeakReference<T> =
        WeakReference(referent, queue?.queue)

    // internal constructor used when reconstructing from a queue.poll() result
    internal constructor(existing: WeakReference<T>) : this(
        existing.get() ?: throw IllegalStateException("Referent already collected"),
        null
    )

    actual fun get(): T? = delegate.get()
    actual fun clear() = delegate.clear()
}