actual object Clock {
    actual fun millis(): Long {
        return System.currentTimeMillis()
    }

    actual fun nanos(): Long {
        return System.nanoTime()
    }
}