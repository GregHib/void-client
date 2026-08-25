package io

actual open class File actual constructor(pathname: String) {
    actual open fun getName(): String {
        TODO("Not yet implemented")
    }

    actual open fun getPath(): String {
        TODO("Not yet implemented")
    }

    actual open fun getAbsolutePath(): String {
        TODO("Not yet implemented")
    }

    actual open fun exists(): Boolean {
        TODO("Not yet implemented")
    }

    actual open fun isDirectory(): Boolean {
        TODO("Not yet implemented")
    }

    actual open fun isFile(): Boolean {
        TODO("Not yet implemented")
    }

    actual open fun length(): Long {
        TODO("Not yet implemented")
    }

    actual open fun delete(): Boolean {
        TODO("Not yet implemented")
    }

    actual open fun mkdirs(): Boolean {
        TODO("Not yet implemented")
    }

    actual open fun renameTo(dest: File): Boolean {
        TODO("Not yet implemented")
    }

    actual open fun listFiles(): Array<File>? {
        TODO("Not yet implemented")
    }

    actual constructor(parent: String, child: String?) : this("$parent\\$child") {
        TODO("Not yet implemented")
    }

    actual open fun mkdir(): Boolean {
        TODO("Not yet implemented")
    }

    actual open fun getCanonicalPath(): String {
        TODO("Not yet implemented")
    }
}