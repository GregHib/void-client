package lang

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Runnable
import kotlinx.coroutines.launch

/**
 * There is no real blocking sleep on JS's single thread, but discarding the request outright
 * loses the client's frame pacing: BufferPositionTracker.method1861 and ResourceLoaderThread.run
 * both express "wait ~20ms" by calling through to sleep(). Recording the largest request made
 * during a step lets PlatformLoop's setTimeout chain honour it instead.
 */
internal var pendingSleepMillis: Long = 0

private val mainThreadGroup = ThreadGroup("main")

private val mainThread: Thread by lazy { Thread(Runnable { }) }

actual class Thread actual constructor(private val target: Runnable) : Runnable {
    private var alive = false

    actual fun start() {
        alive = true
        GlobalScope.launch(Dispatchers.Default) {
            try {
                run()
            } finally {
                alive = false
            }
        }
    }

    actual fun join() {
    }

    actual fun interrupt() {
    }

    actual fun isAlive(): Boolean = alive

    actual fun getThreadGroup(): ThreadGroup = mainThreadGroup

    actual fun getName(): String = "main"

    actual fun setPriority(priority: Int) {
    }

    actual override fun run() {
        target.run()
    }
}

actual fun currentThread(): Thread = mainThread

actual fun sleep(millis: Long) {
    if (millis > pendingSleepMillis) pendingSleepMillis = millis
}

actual fun yield() {
}
