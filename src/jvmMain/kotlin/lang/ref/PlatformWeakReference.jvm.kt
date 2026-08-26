package lang.ref

import java.lang.ref.WeakReference

actual open class PlatformWeakReference<T : Any> actual constructor(
    referent: T,
    queue: PlatformReferenceQueue<T>?
) : WeakReference<T>(referent, queue?.queue)
