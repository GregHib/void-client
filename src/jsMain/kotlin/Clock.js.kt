actual fun clockMillis(): Long {
    val now: dynamic = js("Date.now()")
    return (now as Double).toLong()
}

actual fun clockNanos(): Long {
    val now: dynamic = js("performance.now()")
    return ((now as Double) * 1_000_000.0).toLong()
}
