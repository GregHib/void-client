package lang

import kotlinx.coroutines.Runnable

expect class Thread(target: Runnable) {
    fun getThreadGroup(): ThreadGroup
    fun getName(): String
    fun start()
    fun join()
    fun interrupt()
    fun isAlive(): Boolean
    fun setPriority(priority: Int)
}

expect fun currentThread(): Thread
expect fun sleep(millis: Long)
expect fun yield()
