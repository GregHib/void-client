package awt

expect class MediaTracker {
    constructor(component: Component?)
    fun addImage(image: Image, id: Int)
    fun checkID(id: Int): Boolean
    fun checkID(id: Int, load: Boolean): Boolean
    fun waitForID(id: Int)
    fun isErrorAny(): Boolean
    fun isErrorID(id: Int): Boolean
    fun statusID(id: Int, load: Boolean): Int
    fun waitForAll()
}
