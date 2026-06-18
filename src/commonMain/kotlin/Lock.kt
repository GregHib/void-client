import kotlin.contracts.ExperimentalContracts

@OptIn(ExperimentalContracts::class)
expect inline fun <T> withLock(lock: Any, block: () -> T): T