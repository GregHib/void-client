/**
 * JS has WeakRef but no soft reference: a WeakRef here would let the GC drop cache entries the
 * client still expects to find, so hold the referent strongly. Costs memory, never surprises.
 */
actual class SoftRef<T> actual constructor(private val referent: T?) {
    actual fun get(): T? = referent
}
