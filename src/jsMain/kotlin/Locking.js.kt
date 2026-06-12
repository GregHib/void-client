import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/**
 * JS actual for [withLock]: JS is single-threaded so no real synchronization is needed.
 * The lock argument is accepted but ignored; the block runs immediately.
 */
@OptIn(ExperimentalContracts::class)
actual inline fun <T> withLock(lock: Any, block: () -> T): T {
    contract { callsInPlace(block, InvocationKind.EXACTLY_ONCE) }
    return block()
}
