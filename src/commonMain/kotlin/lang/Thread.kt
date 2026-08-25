package lang

import kotlinx.coroutines.Runnable

expect class Thread(target: Runnable) {
    fun start()
    fun join()
    fun interrupt()
    fun isAlive(): Boolean

}

expect fun currentThread(): Thread
expect fun sleep(millis: Long)
expect fun yield()
