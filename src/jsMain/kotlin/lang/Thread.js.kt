package lang

import kotlinx.coroutines.Runnable

actual class Thread actual constructor(target: Runnable) {
    actual fun start() {
    }

    actual fun join() {
    }

    actual fun interrupt() {
    }

    actual fun isAlive(): Boolean {
        TODO("Not yet implemented")
    }
}

actual fun currentThread(): Thread {
    TODO("Not yet implemented")
}

actual fun sleep(millis: Long) {
}

actual fun yield() {
}