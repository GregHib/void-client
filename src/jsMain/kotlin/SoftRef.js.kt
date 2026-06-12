/**
 * JS actual for [SoftRef]: JS has no GC-pressure API, so this degrades to a strong
 * reference. [get] always returns the referent until the holder itself is dropped.
 */
actual class SoftRef<T : Any> actual constructor(referent: T?) {
    private var value: T? = referent
    actual fun get(): T? = value
}
