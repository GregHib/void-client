package io

/**
 * A browser has no filesystem, but the client cannot run without one: PrivilegedOperationWorker
 * opens the cache files unguarded, and FileStoreLocator.method1464 throws RuntimeException if
 * every candidate path fails - which escapes into method82("crash"). So rather than failing,
 * jsMain provides a real (if volatile) filesystem that lives in memory.
 *
 * Storage is a growable ByteArray per path plus a logical size, so pre-sizing a 200MB cache file
 * costs nothing until something actually writes to it.
 */
internal class MemFile {
    var data: ByteArray = ByteArray(0)
    var size: Int = 0

    fun ensureCapacity(required: Int) {
        if (required <= data.size) return
        var capacity = if (data.size == 0) 32 else data.size
        while (capacity < required) capacity = capacity shl 1
        data = data.copyOf(capacity)
    }

    fun truncate(newLength: Int) {
        if (newLength < size) {
            data.fill(0, newLength, size)
        } else {
            ensureCapacity(newLength)
        }
        size = newLength
    }
}

internal object MemFs {
    val files: MutableMap<String, MemFile> = mutableMapOf()
    val dirs: MutableSet<String> = mutableSetOf("")

    /** Collapses Windows separators and duplicate slashes so the two File constructors agree. */
    fun normalise(path: String): String {
        val unified = path.replace('\\', '/')
        val parts = unified.split('/').filter { it.isNotEmpty() && it != "." }
        val prefix = if (unified.startsWith("/")) "/" else ""
        return prefix + parts.joinToString("/")
    }

    fun parentOf(path: String): String = normalise(path).substringBeforeLast('/', "")

    fun exists(path: String): Boolean {
        val key = normalise(path)
        return files.containsKey(key) || dirs.contains(key)
    }

    fun isDirectory(path: String): Boolean = dirs.contains(normalise(path))

    fun isFile(path: String): Boolean = files.containsKey(normalise(path))

    fun mkdir(path: String): Boolean = dirs.add(normalise(path))

    fun mkdirs(path: String): Boolean {
        val key = normalise(path)
        if (key.isEmpty()) return false
        var created = false
        val segments = key.split('/')
        var accumulated = if (key.startsWith("/")) "/" else ""
        for (segment in segments) {
            if (segment.isEmpty()) continue
            accumulated = if (accumulated.isEmpty() || accumulated == "/") accumulated + segment
            else "$accumulated/$segment"
            if (dirs.add(accumulated)) created = true
        }
        return created
    }

    fun delete(path: String): Boolean {
        val key = normalise(path)
        return files.remove(key) != null || dirs.remove(key)
    }

    fun rename(from: String, to: String): Boolean {
        val source = normalise(from)
        val target = normalise(to)
        val file = files.remove(source) ?: return false
        files[target] = file
        return true
    }

    fun length(path: String): Long = files[normalise(path)]?.size?.toLong() ?: 0L

    fun children(path: String): List<String> {
        val key = normalise(path)
        val prefix = if (key.isEmpty()) "" else "$key/"
        return (files.keys + dirs)
            .filter { it.startsWith(prefix) && it.length > prefix.length }
            .filter { !it.substring(prefix.length).contains('/') }
            .distinct()
    }
}

/** One open file descriptor: the backing file plus the append-mode cursor. */
internal class MemFd(val path: String, val file: MemFile, val append: Boolean) {
    var position: Int = 0
    var closed: Boolean = false
}
