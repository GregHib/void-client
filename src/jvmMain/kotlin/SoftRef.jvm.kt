import java.lang.ref.SoftReference

/**
 * JVM actual for the [SoftRef] seam: a thin wrapper over java.lang.ref.SoftReference
 * so the referent stays GC-clearable under memory pressure exactly as before.
 */
actual class SoftRef<T : Any> actual constructor(referent: T?) {
    private val ref = SoftReference(referent)
    actual fun get(): T? = ref.get()
}
