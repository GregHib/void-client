package lang.ref

import java.lang.ref.ReferenceQueue

actual class PlatformReferenceQueue<T : Any> actual constructor() {
    internal val queue = ReferenceQueue<T>()

    actual fun poll(): PlatformWeakReference<T>? {
        @Suppress("UNCHECKED_CAST")
        return queue.poll() as? PlatformWeakReference<T>
    }
}
