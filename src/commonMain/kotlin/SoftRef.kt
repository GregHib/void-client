/**
 * Multiplatform soft-reference seam.
 *
 * On JVM this wraps java.lang.ref.SoftReference (see jvmMain), preserving the
 * existing GC-clearable cache behaviour byte-for-byte. The referent may be
 * cleared under memory pressure, so [get] returns null after clearing.
 *
 * Off-JVM (web/native) the actual can degrade to a strong reference initially —
 * [get] then simply never returns null until the holder is dropped — which is a
 * safe (if less memory-friendly) behaviour for the two cache slots that use it.
 */
expect class SoftRef<T : Any>(referent: T?) {
    fun get(): T?
}
