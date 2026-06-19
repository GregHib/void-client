import java.lang.ref.SoftReference

actual class SoftRef<T> actual constructor(referent: T?) {
    private val ref = SoftReference(referent)
    actual fun get(): T? = ref.get()
}