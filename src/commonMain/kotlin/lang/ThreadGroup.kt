package lang

expect class ThreadGroup(name: String) {
    constructor(parent: ThreadGroup, name: String)

    fun getName(): String
    fun getParent(): ThreadGroup?
//    var maxPriority: Int
//    var isDaemon: Boolean

    fun enumerate(list: Array<Thread?>): Int
    fun activeCount(): Int
    fun interrupt()
    fun isDestroyed(): Boolean
}