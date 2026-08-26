import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

// JS is single-threaded and this block is synchronous (not suspend), so no other coroutine
// can interleave mid-block: run-to-completion execution already gives the mutual exclusion
// that `synchronized` provides on the JVM. No lock is needed here.
@OptIn(ExperimentalContracts::class)
actual inline fun <T> withLock(lock: Any, block: () -> T): T {
    contract { callsInPlace(block, InvocationKind.EXACTLY_ONCE) }
    return block()
}
