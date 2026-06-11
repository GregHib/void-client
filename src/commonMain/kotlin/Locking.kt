import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/**
 * Platform seam for mutual exclusion.
 *
 * Replaces [synchronized] blocks, which are JVM-only. The [lock] argument is an opaque
 * [Any] — on JVM every object carries a built-in monitor, so existing [Class60]/[Class45]
 * instances continue to serve as lock tokens without any wrapper type.
 *
 * On JVM the actual is [synchronized]; on other targets it will use
 * [kotlin.concurrent.locks.ReentrantLock] (native) or a cooperative guard (web).
 *
 * Usage: replace `synchronized(obj) { ... }` with `withLock(obj) { ... }`.
 *
 * Note: [@Synchronized][kotlin.jvm.Synchronized] method annotations are JVM-bytecode-level
 * and cannot be expressed as an expect/actual. Methods annotated with [@Synchronized] that
 * need to migrate to commonMain should instead call `withLock(this) { ... }` in their body.
 *
 * Implementation note: [withLock] is declared `expect inline` so that:
 *   - The [kotlin.contracts.callsInPlace] contract enables definite-assignment analysis
 *     for variables written inside the block (same as the original [synchronized] statement).
 *   - Non-local `return` inside the block compiles correctly.
 * Each platform actual must also be declared `inline`.
 */
@OptIn(ExperimentalContracts::class)
expect inline fun <T> withLock(lock: Any, block: () -> T): T
