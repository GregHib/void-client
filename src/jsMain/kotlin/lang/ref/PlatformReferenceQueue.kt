package lang.ref

actual class PlatformReferenceQueue<T : Any> actual constructor() {
    private val pending = ArrayDeque<PlatformWeakReference<T>>()

    internal val registry = FinalizationRegistry<PlatformWeakReference<T>> { finalizedWrapper ->
        pending.addLast(finalizedWrapper)
    }

    actual fun poll(): PlatformWeakReference<T>? =
        if (pending.isEmpty()) null else pending.removeFirst()
}