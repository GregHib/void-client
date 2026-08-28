package jaggl

class IntHandleTable<T : Any> {
    private var next = 1
    private val map = HashMap<Int, T>()

    fun allocate(obj: T): Int {
        val id = next++
        map[id] = obj
        return id
    }

    operator fun get(id: Int): T? = map[id]

    fun release(id: Int) {
        map.remove(id)
    }
}

class LongHandleTable<T : Any> {
    private var next = 1L
    private val map = HashMap<Long, T>()

    fun allocate(obj: T): Long {
        val id = next++
        map[id] = obj
        return id
    }

    operator fun get(id: Long): T? = map[id]

    fun release(id: Long) {
        map.remove(id)
    }
}
