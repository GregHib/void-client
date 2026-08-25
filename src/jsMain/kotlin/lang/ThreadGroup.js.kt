package lang

actual class ThreadGroup actual constructor(name: String) {

    actual constructor(parent: ThreadGroup, name: String) : this(name) {
    }

    private var destroyed = false

    actual fun activeCount(): Int = 0 // nothing real to count in JS

    actual fun interrupt() {
        // No-op: there's no real thread here to interrupt.
    }

    actual fun isDestroyed(): Boolean = destroyed

    override fun toString(): String =
        "java.lang.ThreadGroup[]"

    actual fun getName() {
    }

    actual fun enumerate() {
    }
}
