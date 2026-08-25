package lang

actual class ThreadGroup actual constructor(private val name: String) {

    private var parent: ThreadGroup? = null

    actual constructor(parent: ThreadGroup, name: String) : this(name) {
        this.parent = parent
    }

    private var destroyed = false

    actual fun activeCount(): Int = 0 // nothing real to count in JS

    actual fun interrupt() {
        // No-op: there's no real thread here to interrupt.
    }

    actual fun isDestroyed(): Boolean = destroyed

    override fun toString(): String =
        "java.lang.ThreadGroup[]"

    actual fun getName(): String = name

    actual fun getParent(): ThreadGroup? = parent

    actual fun enumerate(list: Array<Thread?>): Int = 0
}
