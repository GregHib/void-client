package io

actual open class File actual constructor(pathname: String) {

    private val path: String = MemFs.normalise(pathname)

    actual constructor(parent: String, child: String?) :
        this(if (child == null) parent else "$parent/$child")

    actual open fun getName(): String = path.substringAfterLast('/')

    actual open fun getPath(): String = path

    actual open fun getAbsolutePath(): String = if (path.startsWith("/")) path else "/$path"

    actual open fun exists(): Boolean = MemFs.exists(path)

    actual open fun isDirectory(): Boolean = MemFs.isDirectory(path)

    actual open fun isFile(): Boolean = MemFs.isFile(path)

    actual open fun length(): Long = MemFs.length(path)

    actual open fun delete(): Boolean = MemFs.delete(path)

    actual open fun mkdirs(): Boolean = MemFs.mkdirs(path)

    actual open fun renameTo(dest: File): Boolean = MemFs.rename(path, dest.path)

    actual open fun listFiles(): Array<File>? {
        if (!MemFs.isDirectory(path)) return null
        return MemFs.children(path).map { File(it) }.toTypedArray()
    }

    actual open fun mkdir(): Boolean = MemFs.mkdir(path)

    actual open fun getCanonicalPath(): String = getAbsolutePath()

    override fun toString(): String = path

    override fun equals(other: Any?): Boolean = other is File && other.path == path

    override fun hashCode(): Int = path.hashCode()
}
