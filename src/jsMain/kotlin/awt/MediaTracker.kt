package awt

import org.w3c.dom.HTMLImageElement

actual class MediaTracker() {
    private val tracked = mutableMapOf<Int, HTMLImageElement>()
    private val errored = mutableSetOf<Int>()

    actual fun addImage(image: Image, id: Int) {
        require(image is HTMLImageElement) { "image must be an HTMLImageElement on the JS target" }
        tracked[id] = image
        image.addEventListener("error", { _ -> errored += id })
    }

    actual fun checkID(id: Int): Boolean = checkID(id, false)

    actual fun checkID(id: Int, load: Boolean): Boolean {
        val image = tracked[id] ?: return false
        return image.complete && id !in errored
    }

    actual fun waitForID(id: Int) {
        // Loading is asynchronous in the browser; there is no way to
        // synchronously block the single-threaded JS event loop until the
        // image finishes, unlike java.awt.MediaTracker#waitForID. Poll
        // checkID()/isErrorID() from a coroutine or timer instead.
    }

    actual fun isErrorAny(): Boolean = errored.isNotEmpty()
    actual fun isErrorID(id: Int): Boolean = id in errored

    actual fun statusID(id: Int, load: Boolean): Int = when {
        id in errored -> MediaTrackerStatus.ERRORED
        tracked[id]?.complete == true -> MediaTrackerStatus.COMPLETE
        tracked.containsKey(id) -> MediaTrackerStatus.LOADING
        else -> MediaTrackerStatus.COMPLETE
    }

    actual constructor(component: Component?) : this() {
        TODO("Not yet implemented")
    }

    actual fun waitForAll() {
    }

}
