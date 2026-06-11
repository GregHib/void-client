/**
 * Platform seam for obtaining an opaque identity token for the currently-executing thread.
 *
 * The returned value is compared by identity only (===); it is never cast or invoked.
 * Using [Any] keeps this declaration free of java.lang.Runnable, which is JVM-only.
 *
 * On JVM the actual returns [Thread.currentThread], which is the identity callers expect.
 *
 * Used by the lock/rendering subsystem (ha_Sub1, s_Sub1, Class64_Sub1) which pass the
 * current thread to Class167 for ownership tracking.
 */
expect fun currentThread(): Any
