package lang

import kotlinx.coroutines.Runnable

actual class Thread actual constructor(private val target: Runnable) : Runnable {
    actual fun start() {
        run()
    }

    actual fun join() {
    }

    actual fun interrupt() {
    }

    actual fun isAlive(): Boolean {
        TODO("Not yet implemented")
    }

    actual fun getThreadGroup(): ThreadGroup {
        TODO("Not yet implemented")
    }

    actual fun getName(): String {
        TODO("Not yet implemented")
    }

    actual fun setPriority(priority: Int) {
    }

    actual override fun run() {
        target.run()
    }
}

actual fun currentThread(): Thread {
    TODO("Not yet implemented")
}

actual fun sleep(millis: Long) {
}

actual fun yield() {
}