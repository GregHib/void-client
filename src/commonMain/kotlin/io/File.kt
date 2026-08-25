package io

expect open class File(pathname: String) {
    constructor(parent: String, child: String?)
    open fun getName(): String
    open fun getPath(): String
    open fun getAbsolutePath(): String
    open fun exists(): Boolean
    open fun isDirectory(): Boolean
    open fun isFile(): Boolean
    open fun length(): Long
    open fun delete(): Boolean
    open fun mkdirs(): Boolean
    open fun renameTo(dest: File): Boolean
    open fun listFiles(): Array<File>?
    open fun mkdir(): Boolean
    open fun getCanonicalPath(): String
}