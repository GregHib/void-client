package jaggl

/**
 * GL-name -> WebGL object table. Backed by a native JS Map rather than HashMap<Int, T>: lookups
 * run on every texture/buffer bind, and the Kotlin HashMap boxes and hashes the Int key.
 */
class IntHandleTable<T : Any> {
    private var next = 1
    private val map: dynamic = js("new Map()")

    fun allocate(obj: T): Int {
        val id = next++
        map.set(id, obj)
        return id
    }

    operator fun get(id: Int): T? = map.get(id).unsafeCast<T?>()

    fun release(id: Int) {
        map.delete(id)
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
