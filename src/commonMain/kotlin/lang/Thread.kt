package lang

import kotlinx.coroutines.Runnable

expect class Thread(target: Runnable): Runnable {
    fun getThreadGroup(): ThreadGroup
    fun getName(): String
    fun start()
    fun join()
    fun interrupt()
    fun isAlive(): Boolean
    fun setPriority(priority: Int)
    override fun run()
}

expect fun currentThread(): Thread
expect fun sleep(millis: Long)
expect fun yield()
