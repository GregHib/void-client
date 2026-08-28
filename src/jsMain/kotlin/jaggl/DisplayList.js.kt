package jaggl

/**
 * Display lists as recorded closures: glNewList/glEndList capture a sequence of OpenGL
 * companion calls (via [record]), and glCallList replays them by re-invoking those closures -
 * matching real GL semantics where state changes inside a list are captured too.
 */
class DisplayListManager {
    private var nextId = 1
    private val lists = HashMap<Int, MutableList<() -> Unit>>()
    private var recordingOps: MutableList<() -> Unit>? = null
    private var recordingId: Int? = null

    val isRecording: Boolean get() = recordingId != null

    fun genLists(range: Int): Int {
        if (range <= 0) return 0
        val first = nextId
        nextId += range
        return first
    }

    fun deleteLists(first: Int, range: Int) {
        for (i in 0 until range) lists.remove(first + i)
    }

    fun newList(id: Int) {
        recordingId = id
        recordingOps = ArrayList()
    }

    fun record(op: () -> Unit) {
        recordingOps?.add(op)
    }

    fun endList() {
        val id = recordingId ?: return
        lists[id] = recordingOps ?: ArrayList()
        recordingId = null
        recordingOps = null
    }

    fun callList(id: Int) {
        lists[id]?.let { ops -> for (op in ops) op() }
    }
}
