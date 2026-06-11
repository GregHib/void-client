/**
 * Platform seam for obtaining a handle to the currently-executing thread as a [Runnable].
 *
 * On JVM, [Thread] implements [Runnable], so [Thread.currentThread] is returned directly.
 * This lets commonMain code use the current-thread identity as an opaque token without
 * importing java.lang.Thread.
 *
 * Used by the lock/rendering subsystem (ha_Sub1, s_Sub1, Class64_Sub1) which pass the
 * current thread to Class167 for ownership tracking.
 */
expect fun currentThread(): Runnable
