/**
 * Number of most-recently-touched referents kept alive unconditionally.
 *
 * A soft reference is meant to survive until memory pressure, and JS has no equivalent: WeakRef is
 * cleared at the next major GC regardless of how much headroom there is. Holding the newest N
 * referents strongly gives back the part of soft-reference behaviour the client actually depends
 * on - that an entry it just looked up is still there next tick - while letting everything older
 * go. Raise it if profiling shows the client reloading cache entries it should still have; lower
 * it if the heap still grows.
 */
private const val RETAINED_REFERENTS = 4096

/**
 * A fixed ring of strong references, refreshed on every construction and every successful [get].
 *
 * A ring rather than a true LRU: it is allocation free and, because a hit re-retains, an entry the
 * client keeps using keeps getting pushed back to the front. Entries nothing has touched for the
 * last [RETAINED_REFERENTS] accesses fall out and become collectable.
 */
private object RetainedReferents {
    private val ring = arrayOfNulls<Any>(RETAINED_REFERENTS)
    private var cursor = 0

    fun retain(value: Any?) {
        if (value == null) return
        ring[cursor] = value
        cursor++
        if (cursor == RETAINED_REFERENTS) cursor = 0
    }
}

private external class WeakRef<T : Any>(target: T) {
    fun deref(): T?
}

/** WeakRef is ES2021; without it there is nothing to do but hold on. */
private val weakRefSupported: Boolean =
    js("typeof WeakRef === 'function'").unsafeCast<Boolean>()

/**
 * A bounded stand-in for java.lang.ref.SoftReference.
 *
 * This used to hold the referent strongly and forever, which was safe but made every cache in the
 * client - model, sprite, texture - unbounded. SizeBoundedSoftCache demotes entries into soft
 * references once its byte budget is exceeded, so on JS nothing was ever actually released and the
 * heap grew monotonically until a major GC had a lot to do. That is a plausible source of the
 * periodic long frames.
 *
 * The client is already written for a soft reference coming back empty - SizeBoundedSoftCache
 * checks for null and drops the entry - so clearing is safe; the only risk is clearing too eagerly
 * and causing reload churn, which [RETAINED_REFERENTS] guards against.
 */
actual class SoftRef<T> actual constructor(referent: T?) {
    private val weak: WeakRef<Any>? =
        if (weakRefSupported && referent != null) WeakRef(referent as Any) else null

    /** Only used when WeakRef is unavailable; otherwise the ring is the only strong holder. */
    private val strong: T? = if (weakRefSupported) null else referent

    init {
        RetainedReferents.retain(referent)
    }

    @Suppress("UNCHECKED_CAST")
    actual fun get(): T? {
        val ref = weak ?: return strong
        val value = ref.deref() ?: return null
        RetainedReferents.retain(value)
        return value as T
    }
}
