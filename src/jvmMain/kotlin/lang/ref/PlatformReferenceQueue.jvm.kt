package lang.ref

import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference

actual class PlatformReferenceQueue<T : Any> actual constructor() {
    internal val queue = ReferenceQueue<T>()

    actual fun poll(): PlatformWeakReference<T>? {
        val ref = queue.poll() as? WeakReference<T> ?: return null
        return PlatformWeakReference(ref)
    }
}